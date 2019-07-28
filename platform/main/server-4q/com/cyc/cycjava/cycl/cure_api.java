package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cure_api;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.cycjava.cycl.nl.scg_api;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.data_parser;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cure_api.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cure_api extends SubLTranslatedFile {
    public static final SubLFile me = new cure_api();

    public static final String myName = "com.cyc.cycjava.cycl.cure_api";

    public static final String myFingerPrint = "dc0e43d75154ecb77f48ab48e68e8f718869dd6e892b4453c57bbe8b4427b517";

    // defparameter
    private static final SubLSymbol $term_learner_user_created_term_log_file$ = makeSymbol("*TERM-LEARNER-USER-CREATED-TERM-LOG-FILE*");

    // defparameter
    private static final SubLSymbol $term_learner_user_added_types_log_file$ = makeSymbol("*TERM-LEARNER-USER-ADDED-TYPES-LOG-FILE*");

    // defparameter
    private static final SubLSymbol $term_learner_accepted_meanings_log_file$ = makeSymbol("*TERM-LEARNER-ACCEPTED-MEANINGS-LOG-FILE*");

    // deflexical
    private static final SubLSymbol $term_learner_use_lexical_lookup_only$ = makeSymbol("*TERM-LEARNER-USE-LEXICAL-LOOKUP-ONLY*");

    // defparameter
    // Which task (a CycL term) is the user currently working on?
    private static final SubLSymbol $current_tl_task$ = makeSymbol("*CURRENT-TL-TASK*");

    // defparameter
    public static final SubLSymbol $term_learner_default_lexical_assertion_mt$ = makeSymbol("*TERM-LEARNER-DEFAULT-LEXICAL-ASSERTION-MT*");

    // defparameter
    private static final SubLSymbol $cure_edit_the_list_termsP$ = makeSymbol("*CURE-EDIT-THE-LIST-TERMS?*");

    // defparameter
    public static final SubLSymbol $cure_allow_some_predicates_to_be_edited$ = makeSymbol("*CURE-ALLOW-SOME-PREDICATES-TO-BE-EDITED*");



    // defparameter
    private static final SubLSymbol $allow_changes_to_focal_term_on_replicate$ = makeSymbol("*ALLOW-CHANGES-TO-FOCAL-TERM-ON-REPLICATE*");



    // defconstant
    // status unknown (probably because term hasn't been determined)
    public static final SubLSymbol $term_learner_unknown_status$ = makeSymbol("*TERM-LEARNER-UNKNOWN-STATUS*");

    // defconstant
    // known and removable
    public static final SubLSymbol $term_learner_known_removable$ = makeSymbol("*TERM-LEARNER-KNOWN-REMOVABLE*");

    // defconstant
    // known but not removable :justification {'derived from other assertions'}
    public static final SubLSymbol $term_learner_known_derived$ = makeSymbol("*TERM-LEARNER-KNOWN-DERIVED*");

    // defconstant
    // not known and assertible
    public static final SubLSymbol $term_learner_unknown_assertible$ = makeSymbol("*TERM-LEARNER-UNKNOWN-ASSERTIBLE*");

    // defconstant
    // not known and not assertible :justification {e.g. X is disjoint with Y}
    public static final SubLSymbol $term_learner_impossible$ = makeSymbol("*TERM-LEARNER-IMPOSSIBLE*");

    // defconstant
    // Cyc-side error
    public static final SubLSymbol $term_learner_cyc_error$ = makeSymbol("*TERM-LEARNER-CYC-ERROR*");

    // defconstant
    // Error downstream from Cyc
    public static final SubLSymbol $term_learner_downstream_error$ = makeSymbol("*TERM-LEARNER-DOWNSTREAM-ERROR*");

    // defconstant
    // Working
    public static final SubLSymbol $term_learner_working$ = makeSymbol("*TERM-LEARNER-WORKING*");

    // defconstant
    // Known but not user accessible (e.g. not asserted by them)
    public static final SubLSymbol $term_learner_known_not_removable$ = makeSymbol("*TERM-LEARNER-KNOWN-NOT-REMOVABLE*");

    // defconstant
    // Rejected by the user (currently UI only--not noted in KB)
    public static final SubLSymbol $term_learner_rejected$ = makeSymbol("*TERM-LEARNER-REJECTED*");

    // defconstant
    /**
     * Not assertible because not a complete assertible sentence (e.g. has variables
     * in it)
     */
    public static final SubLSymbol $term_learner_incomplete$ = makeSymbol("*TERM-LEARNER-INCOMPLETE*");

    // deflexical
    private static final SubLSymbol $term_learner_unmodifiable$ = makeSymbol("*TERM-LEARNER-UNMODIFIABLE*");



    // defparameter
    /**
     * The Mt in which information related to what types of followups should be
     * asked can be found
     */
    private static final SubLSymbol $followup_query_mt$ = makeSymbol("*FOLLOWUP-QUERY-MT*");















    // deflexical
    private static final SubLSymbol $followup_query_mt_for_userXtask_caching_state$ = makeSymbol("*FOLLOWUP-QUERY-MT-FOR-USER&TASK-CACHING-STATE*");

    // defparameter
    private static final SubLSymbol $cure_show_best_bindings$ = makeSymbol("*CURE-SHOW-BEST-BINDINGS*");











    // deflexical
    private static final SubLSymbol $delete_me_token$ = makeSymbol("*DELETE-ME-TOKEN*");

    // defparameter
    // The MT in which information about sources should be stored
    public static final SubLSymbol $term_learner_source_documentation_mt$ = makeSymbol("*TERM-LEARNER-SOURCE-DOCUMENTATION-MT*");

    // defparameter
    public static final SubLSymbol $source_spindle$ = makeSymbol("*SOURCE-SPINDLE*");

    // defparameter
    public static final SubLSymbol $source_spindle_query_mt$ = makeSymbol("*SOURCE-SPINDLE-QUERY-MT*");

    // defparameter
    private static final SubLSymbol $term_learner_default_generation_mt$ = makeSymbol("*TERM-LEARNER-DEFAULT-GENERATION-MT*");



    // deflexical
    public static final SubLSymbol $term_learner_base_source_creation_lock$ = makeSymbol("*TERM-LEARNER-BASE-SOURCE-CREATION-LOCK*");

    // defparameter
    /**
     * Should the term-learner assert the Mt information every time the mts come up?
     * While in development mode, it's handy to set this to T so you can clear a
     * transcript and still transmit things you create later (because the Mts are
     * fully defined w/in the new transcript
     */
    private static final SubLSymbol $term_learner_assert_redundant_mt_info$ = makeSymbol("*TERM-LEARNER-ASSERT-REDUNDANT-MT-INFO*");



    // deflexical
    public static final SubLSymbol $term_learner_sub_source_creation_lock$ = makeSymbol("*TERM-LEARNER-SUB-SOURCE-CREATION-LOCK*");

    // defconstant
    public static final SubLSymbol $needs_approval$ = makeSymbol("*NEEDS-APPROVAL*");

    // defconstant
    public static final SubLSymbol $disapproved$ = makeSymbol("*DISAPPROVED*");

    // defconstant
    public static final SubLSymbol $approved$ = makeSymbol("*APPROVED*");

















    // deflexical
    private static final SubLSymbol $term_learner_displayable_generalizationP_caching_state$ = makeSymbol("*TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $term_learner_possibly_relevant_generalizationP_caching_state$ = makeSymbol("*TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $term_learner_irrelevance_listener$ = makeSymbol("*TERM-LEARNER-IRRELEVANCE-LISTENER*");



    // deflexical
    private static final SubLSymbol $cb_cure_external_host$ = makeSymbol("*CB-CURE-EXTERNAL-HOST*");

    // deflexical
    private static final SubLSymbol $cb_cure_external_port$ = makeSymbol("*CB-CURE-EXTERNAL-PORT*");

    // deflexical
    private static final SubLSymbol $cb_cure_external_context_path$ = makeSymbol("*CB-CURE-EXTERNAL-CONTEXT-PATH*");

    // deflexical
    private static final SubLSymbol $cb_cure_internal_context_path$ = makeSymbol("*CB-CURE-INTERNAL-CONTEXT-PATH*");





    // deflexical
    public static final SubLSymbol $cb_show_cure_link$ = makeSymbol("*CB-SHOW-CURE-LINK*");









    // deflexical
    private static final SubLSymbol $collection_via_web_searchP_caching_state$ = makeSymbol("*COLLECTION-VIA-WEB-SEARCH?-CACHING-STATE*");



    // Internal Constants
    public static final SubLString $str0$_cyc_projects_doc_annotation_logs = makeString("/cyc/projects/doc-annotation/logs/user-created-terms.log");

    public static final SubLString $str1$_cyc_projects_doc_annotation_logs = makeString("/cyc/projects/doc-annotation/logs/user-added-types.log");

    public static final SubLString $str2$_cyc_projects_doc_annotation_logs = makeString("/cyc/projects/doc-annotation/logs/accepted-meanings.log");

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("CYCL"), makeSymbol("WEIGHT"), makeSymbol("JUSTIFICATIONS"), makeSymbol("FRAGMENT-JUSTIFICATION"), makeSymbol("NL-STRING"), makeSymbol("ASSERT-SENTENCE"), makeSymbol("STATUS-CODE"), makeSymbol("&KEY"), makeSymbol("RENDERERS"), makeSymbol("ORIGINAL-CYCL"), list(makeSymbol("DISPLAY"), T), list(makeSymbol("REQUIRED"), T), makeSymbol("APPROVAL-CODE"), makeSymbol("UNASSERTIBLE-SENTENCE-IDS") });

    public static final SubLList $list5 = list(makeKeyword("RENDERERS"), makeKeyword("ORIGINAL-CYCL"), makeKeyword("DISPLAY"), makeKeyword("REQUIRED"), makeKeyword("APPROVAL-CODE"), makeKeyword("UNASSERTIBLE-SENTENCE-IDS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    private static final SubLSymbol $UNASSERTIBLE_SENTENCE_IDS = makeKeyword("UNASSERTIBLE-SENTENCE-IDS");

    private static final SubLSymbol NEW_TERM_LEARNER_TYPE_INT = makeSymbol("NEW-TERM-LEARNER-TYPE-INT");

    public static final SubLList $list14 = list(new SubLObject[]{ makeSymbol("SENTENCE"), makeSymbol("DOMAIN-MT"), makeSymbol("&KEY"), makeSymbol("ORIGINAL-SENTENCE"), makeSymbol("CURRENT-BINDINGS"), makeSymbol("SUGGESTIONS"), list(makeSymbol("JUSTIFICATIONS"), makeKeyword("DEFAULT")), list(makeSymbol("FRAGMENT-JUSTIFICATION")), list(makeSymbol("NL-MT"), list(makeSymbol("QUOTE"), list(makeSymbol("CURE-DEFAULT-GENERATION-MT")))), list(makeSymbol("APPROVAL-CODE"), NIL), list(makeSymbol("DISPLAY-CYCL"), NIL), list(makeSymbol("STATUS"), NIL), list(makeSymbol("CLARIFYING-CYCL"), NIL) });

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("ORIGINAL-SENTENCE"), makeKeyword("CURRENT-BINDINGS"), makeKeyword("SUGGESTIONS"), makeKeyword("JUSTIFICATIONS"), makeKeyword("FRAGMENT-JUSTIFICATION"), makeKeyword("NL-MT"), makeKeyword("APPROVAL-CODE"), makeKeyword("DISPLAY-CYCL"), makeKeyword("STATUS"), makeKeyword("CLARIFYING-CYCL") });















    private static final SubLList $list23 = list(makeSymbol("CURE-DEFAULT-GENERATION-MT"));







    private static final SubLSymbol TERM_LEARNER_TYPE_FOR_FRAGMENT_INT = makeSymbol("TERM-LEARNER-TYPE-FOR-FRAGMENT-INT");

    private static final SubLSymbol TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING = makeSymbol("TERM-LEARNER-KNOWN-MEANINGS-FOR-STRING");

    private static final SubLString $str29$___A__entering__S__ = makeString("~&~A: entering ~S~%");



    private static final SubLString $str31$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str32$writing_to__S = makeString("writing to ~S");





    private static final SubLSymbol $kw35$IS_NER_ENTRY_ = makeKeyword("IS-NER-ENTRY?");



    private static final SubLString $str37$no_new_creation = makeString("no-new-creation");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$CycAssistedDocumentReader = reader_make_constant_shell(makeString("CycAssistedDocumentReader"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLString $str42$_input_date___A___S__input___ = makeString("<input date='~A'>~S</input>~%");

    public static final SubLString $$$Currently_Unknown_to_Cyc = makeString("Currently Unknown to Cyc");

    public static final SubLString $$$vocabMarking = makeString("vocabMarking");

    public static final SubLSymbol TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM = makeSymbol("TERM-LEARNER-MEANINGS-FOR-TAGGED-TERM");

    public static final SubLSymbol TERM_LEARNER_OBJECT_FROM_ID = makeSymbol("TERM-LEARNER-OBJECT-FROM-ID");

    public static final SubLList $list47 = list(CHAR_space);

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLString $str50$ = makeString("");



    private static final SubLSymbol CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");

    private static final SubLObject $$inProgressTerm = reader_make_constant_shell(makeString("inProgressTerm"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$DocIngesterUserCreatedTerm = reader_make_constant_shell(makeString("DocIngesterUserCreatedTerm"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLList $list58 = list(reader_make_constant_shell(makeString("DocIngesterUserCreatedTerm")));

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLSymbol $sym62$__MT = makeSymbol("??MT");

    private static final SubLList $list63 = list(makeSymbol("??STRING"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLString $str65$___ = makeString("...");





    private static final SubLSymbol DELETE_ENTRY_FROM_STRING = makeSymbol("DELETE-ENTRY-FROM-STRING");



    private static final SubLSymbol TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM = makeSymbol("TERM-LEARNER-ORDERED-TYPES-FOR-TAGGED-TERM");

    private static final SubLList $list71 = list(makeSymbol("HEADER-STRING"), makeSymbol("ALT-PHRASES"));

    private static final SubLSymbol $sym72$_STRING = makeSymbol("?STRING");

    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLList $list74 = list(makeSymbol("?STRING"));

    private static final SubLObject $$is_Underspecified = reader_make_constant_shell(makeString("is-Underspecified"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $sym77$_ = makeSymbol(">");

    private static final SubLSymbol GET_WEIGHT = makeSymbol("GET-WEIGHT");





    private static final SubLSymbol $TYPE_ALT_PHRASES = makeKeyword("TYPE-ALT-PHRASES");



    private static final SubLSymbol GET_TAXONOMIC_RENDERERS_FOR_TERM = makeSymbol("GET-TAXONOMIC-RENDERERS-FOR-TERM");

    private static final SubLString $$$specs = makeString("specs");

    private static final SubLString $$$instances = makeString("instances");

    private static final SubLString $$$superiors = makeString("superiors");

    private static final SubLString $$$genls = makeString("genls");

    private static final SubLString $$$isa = makeString("isa");

    private static final SubLString $str89$Unimplemented_attempt_to_get__S_f = makeString("Unimplemented attempt to get ~S for ~S");

    private static final SubLString $$$string = makeString("string");

    private static final SubLSymbol $sym91$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_ = makeSymbol("TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?");

    private static final SubLSymbol $sym93$GENLS_ = makeSymbol("GENLS?");





    private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");



    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLSymbol $sym99$_EXCLUDE_VULGARITIES__ = makeSymbol("*EXCLUDE-VULGARITIES?*");

    private static final SubLList $list100 = list(makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*"), makeSymbol("*EXCLUDE-VULGARITIES?*"), makeSymbol("*EXCLUDE-SLANG?*"), makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"));

    private static final SubLSymbol $sym101$_EXCLUDE_SLANG__ = makeSymbol("*EXCLUDE-SLANG?*");

    private static final SubLSymbol $sym102$_EXCLUDE_ARCHAIC_SPEECH__ = makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");

    private static final SubLSymbol $sym103$_EXCLUDE_INDIRECT_RELATIONS__ = makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");

    private static final SubLSymbol SHORTER_P = makeSymbol("SHORTER-P");

    private static final SubLSymbol $sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS = makeSymbol("TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT-STRING-MERGED-JUSTIFICATIONS");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str107$_ = makeString("~");

    private static final SubLSymbol TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE = makeSymbol("TERM-LEARNER-ORDERED-TYPES-FOR-USER-ADDED-TYPE");

    private static final SubLString $str109$_input_cyctermid___A__date___A___ = makeString("<input cyctermid='~A' date='~A'>~S</input>~%");

    private static final SubLObject $$CollectionType = reader_make_constant_shell(makeString("CollectionType"));

    private static final SubLSymbol DEFAULT_CREATE_AS_TYPE = makeSymbol("DEFAULT-CREATE-AS-TYPE");

    private static final SubLSymbol $sym112$_PRED = makeSymbol("?PRED");

    private static final SubLObject $$defaultAutotypeSuggestionFromType = reader_make_constant_shell(makeString("defaultAutotypeSuggestionFromType"));

    private static final SubLList $list114 = list(makeSymbol("?PRED"));

    private static final SubLList $list115 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    private static final SubLSymbol $default_create_as_type_caching_state$ = makeSymbol("*DEFAULT-CREATE-AS-TYPE-CACHING-STATE*");











    private static final SubLSymbol $ASSERT_SENTENCE_ID = makeKeyword("ASSERT-SENTENCE-ID");



    private static final SubLSymbol $REPLICATION_SENTENCE_ID = makeKeyword("REPLICATION-SENTENCE-ID");

    private static final SubLSymbol GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING = makeSymbol("GET-TERM-LEARNER-RENDERER-FOR-CYCL-STRING");

    private static final SubLSymbol GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID = makeSymbol("GET-TERM-LEARNER-RENDERER-FOR-CYCL-ID");

    private static final SubLSymbol GET_TERM_LEARNER_RENDERER_FOR_CYCL = makeSymbol("GET-TERM-LEARNER-RENDERER-FOR-CYCL");

    private static final SubLList $list128 = list(makeKeyword("GENLS"), list(list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("Thing")))));

    public static final SubLList $list129 = list(makeKeyword("ISA"), list(list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("Individual")))));

    private static final SubLSymbol GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING = makeSymbol("GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-STRING");

    private static final SubLSymbol GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID = makeSymbol("GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-ID");

    private static final SubLSymbol GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL = makeSymbol("GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL");

    private static final SubLSymbol GET_TERM_LEARNER_STRING_RENDERER_FROM_OPEN_SELECT_RENDERER_LIST = makeSymbol("GET-TERM-LEARNER-STRING-RENDERER-FROM-OPEN-SELECT-RENDERER-LIST");



    private static final SubLSymbol $OPEN_SELECT_RENDERER = makeKeyword("OPEN-SELECT-RENDERER");









    private static final SubLSymbol $PPH_EMPTY_CYCL = makeKeyword("PPH-EMPTY-CYCL");









    private static final SubLSymbol $MODIFIABLE_STRING_RENDERER = makeKeyword("MODIFIABLE-STRING-RENDERER");



    private static final SubLSymbol $MODIFIABLE_TEXT_RENDERER = makeKeyword("MODIFIABLE-TEXT-RENDERER");

    private static final SubLString $$$Some_other_ = makeString("Some other ");

    private static final SubLString $$$Something_else = makeString("Something else");

    private static final SubLList $list150 = list(makeKeyword("VALID"), T, makeKeyword("CYCL"), makeString("newValue"), makeKeyword("CYCL-ID"), makeString("newValue"));





    private static final SubLSymbol $sym153$_ = makeSymbol("<");



    private static final SubLSymbol $sym155$THCL_FORT_ = makeSymbol("THCL-FORT?");

    private static final SubLList $list156 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));



    private static final SubLList $list158 = list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("VALID"));



    private static final SubLString $$$newValue = makeString("newValue");





    private static final SubLSymbol TERM_LEARNER_ADD_LEXICAL_PHRASE = makeSymbol("TERM-LEARNER-ADD-LEXICAL-PHRASE");

    private static final SubLString $$$userAction = makeString("userAction");

    private static final SubLString $$$termString = makeString("termString");

    private static final SubLString $$$choiceid = makeString("choiceid");

    private static final SubLString $$$justifications = makeString("justifications");

    private static final SubLString $$$sentenceId = makeString("sentenceId");

    private static final SubLString $$$termId = makeString("termId");

    private static final SubLString $$$title = makeString("title");

    private static final SubLString $$$url = makeString("url");

    private static final SubLString $$$code = makeString("code");



    private static final SubLSymbol $NEW_SENTENCE_ID = makeKeyword("NEW-SENTENCE-ID");

    private static final SubLString $$$newSentenceId = makeString("newSentenceId");

    private static final SubLString $$$status = makeString("status");





    private static final SubLString $$$newCycLSentenceHLIDString = makeString("newCycLSentenceHLIDString");

    private static final SubLSymbol $NEW_CYCL_HL_ID = makeKeyword("NEW-CYCL-HL-ID");

    private static final SubLString $$$newCycLSentenceDisplayString = makeString("newCycLSentenceDisplayString");

    private static final SubLString $$$newNLSentence = makeString("newNLSentence");

    private static final SubLString $$$justification = makeString("justification");

    private static final SubLSymbol XML_TERM_LEARNER_USER_CHOICE = makeSymbol("XML-TERM-LEARNER-USER-CHOICE");



    private static final SubLList $list186 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $$$cyclarg = makeString("cyclarg");

    private static final SubLString $$$stringarg = makeString("stringarg");

    private static final SubLString $$$assert = makeString("assert");



    private static final SubLString $$$replace = makeString("replace");



    private static final SubLString $$$unassert = makeString("unassert");



    private static final SubLSymbol TERM_LEARNER_USER_CHOICE = makeSymbol("TERM-LEARNER-USER-CHOICE");



    private static final SubLList $list197 = list(makeKeyword("REPLACE"), makeKeyword("ASSERT"));

    private static final SubLList $list198 = list(makeSymbol("ARGPOS-STRING"), makeSymbol("RAW-NEW-VALUE"), makeSymbol("TYPE"));



    private static final SubLSymbol $NEW_NL_SENTENCE = makeKeyword("NEW-NL-SENTENCE");

    private static final SubLSymbol $NEW_CYCL_SENTENCE_STRING = makeKeyword("NEW-CYCL-SENTENCE-STRING");

    private static final SubLString $$$argpos = makeString("argpos");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLSymbol XML_TERM_LEARNER_CREATE_NEW = makeSymbol("XML-TERM-LEARNER-CREATE-NEW");



    private static final SubLSymbol $sym206$_X88928381ASDF = makeSymbol("?X88928381ASDF");

    private static final SubLSymbol CURE_ASSERT_SENTENCE = makeSymbol("CURE-ASSERT-SENTENCE");

    private static final SubLSymbol CURE_UNASSERT_SENTENCE = makeSymbol("CURE-UNASSERT-SENTENCE");

    private static final SubLSymbol CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE = makeSymbol("CREATE-NEW-CURE-TERM-AND-ASSERT-SENTENCE");

    private static final SubLObject $$termDependsOn = reader_make_constant_shell(makeString("termDependsOn"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));





    private static final SubLSymbol TERM_LEARNER_CREATE_NEW = makeSymbol("TERM-LEARNER-CREATE-NEW");

    private static final SubLSymbol HTML_URL_DECODE = makeSymbol("HTML-URL-DECODE");

    private static final SubLSymbol GET_BASE_SENTENCE_FROM_SENTENCE_STRING = makeSymbol("GET-BASE-SENTENCE-FROM-SENTENCE-STRING");



    private static final SubLSymbol TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE = makeSymbol("TERM-LEARNER-RENDERER-FOR-NEW-TAXONOMIC-RELATIVE");

    private static final SubLString $$$spec = makeString("spec");

    private static final SubLString $$$instance = makeString("instance");



    private static final SubLSymbol FIND_BY_ID_STRING_P = makeSymbol("FIND-BY-ID-STRING-P");

    private static final SubLSymbol DECODE_ID_STRING = makeSymbol("DECODE-ID-STRING");

    private static final SubLSymbol MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLString $$$argPos = makeString("argPos");

    private static final SubLString $$$limit = makeString("limit");

    private static final SubLSymbol XML_TERM_LEARNER_USER_SUBSTITUTION = makeSymbol("XML-TERM-LEARNER-USER-SUBSTITUTION");

    private static final SubLSymbol TERM_LEARNER_USER_SUBSTITUTION = makeSymbol("TERM-LEARNER-USER-SUBSTITUTION");

    private static final SubLString $$$100 = makeString("100");

    private static final SubLString $str230$_ = makeString("+");

    private static final SubLSymbol $sym231$_THIS_QUERY_VAR = makeSymbol("?THIS-QUERY-VAR");

    private static final SubLObject $$String = reader_make_constant_shell(makeString("String"));



    private static final SubLSymbol SECOND_TRUE = makeSymbol("SECOND-TRUE");



    private static final SubLList $list236 = list(makeSymbol("CYCL"), makeSymbol("NL"));

    private static final SubLString $str237$Timeout_attempting_to_call_SCG_on = makeString("Timeout attempting to call SCG on ~S");

    private static final SubLSymbol TERM_LEARNER_VALID_SUBSTITUTION = makeSymbol("TERM-LEARNER-VALID-SUBSTITUTION");

    private static final SubLSymbol $term_learner_valid_substitution_caching_state$ = makeSymbol("*TERM-LEARNER-VALID-SUBSTITUTION-CACHING-STATE*");

    private static final SubLSymbol CLEAR_TERM_LEARNER_VALID_SUBSTITUTION = makeSymbol("CLEAR-TERM-LEARNER-VALID-SUBSTITUTION");



    private static final SubLSymbol XML_TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION = makeSymbol("XML-TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION");

    private static final SubLSymbol TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION = makeSymbol("TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION");

    private static final SubLSymbol RKF_STANDARD_STRING_WORDIFY = makeSymbol("RKF-STANDARD-STRING-WORDIFY");





    private static final SubLList $list247 = list(makeKeyword("CYCL"), makeKeyword("T"), makeKeyword("INFLECTIONS"), T);

    private static final SubLSymbol FIRST_TRUE = makeSymbol("FIRST-TRUE");

    private static final SubLSymbol TERM_LEARNER_AUTOCOMPLETE_NATIVE = makeSymbol("TERM-LEARNER-AUTOCOMPLETE-NATIVE");

    private static final SubLList $list250 = list(makeSymbol("PREFIX"), makeSymbol("&KEY"), list(makeSymbol("LIMIT"), TWENTY_INTEGER), list(makeSymbol("RETURN-ATTRS"), makeString("")), list(makeSymbol("SENTENCE"), NIL), list(makeSymbol("ARG-POS"), ZERO_INTEGER), list(makeSymbol("CASE-SENSITIVE"), NIL), list(makeSymbol("CONSTANTS"), NIL));

    private static final SubLList $list251 = list(makeKeyword("LIMIT"), makeKeyword("RETURN-ATTRS"), makeKeyword("SENTENCE"), makeKeyword("ARG-POS"), makeKeyword("CASE-SENSITIVE"), makeKeyword("CONSTANTS"));











    private static final SubLSymbol TERM_LEARNER_AUTOCOMPLETE_INT = makeSymbol("TERM-LEARNER-AUTOCOMPLETE-INT");



    private static final SubLSymbol COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLList $list260 = list(T);

    private static final SubLSymbol TERM_LEARNER_AUTOCOMPLETE = makeSymbol("TERM-LEARNER-AUTOCOMPLETE");

    private static final SubLList $list262 = list(makeSymbol("PREFIX"), makeSymbol("&KEY"), list(makeSymbol("LIMIT"), makeString("20")), list(makeSymbol("RETURN-ATTRS"), makeString("")), list(makeSymbol("SENTENCE-ID"), makeString("Mww")), list(makeSymbol("ARG-POS"), makeString("")), list(makeSymbol("CASE-SENSITIVE"), makeString("nil")), list(makeSymbol("CONSTANTS"), makeString("nil")));

    private static final SubLList $list263 = list(makeKeyword("LIMIT"), makeKeyword("RETURN-ATTRS"), makeKeyword("SENTENCE-ID"), makeKeyword("ARG-POS"), makeKeyword("CASE-SENSITIVE"), makeKeyword("CONSTANTS"));

    private static final SubLString $$$20 = makeString("20");

    private static final SubLString $$$Mww = makeString("Mww");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLList $list267 = list(NIL);

    private static final SubLString $$$prefix = makeString("prefix");

    private static final SubLString $$$count = makeString("count");

    private static final SubLSymbol XML_TERM_LEARNER_AUTOCOMPLETE = makeSymbol("XML-TERM-LEARNER-AUTOCOMPLETE");

    private static final SubLList $list271 = list(makeKeyword("CYCL"), makeKeyword("NL"), makeKeyword("HL-ID"), makeKeyword("DISAMBIG-STRING"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));











    private static final SubLSymbol $kw279$CASE_SENSITIVE_ = makeKeyword("CASE-SENSITIVE?");

    private static final SubLSymbol $kw280$COMPLETE_ON_CONSTANTS_ = makeKeyword("COMPLETE-ON-CONSTANTS?");

    private static final SubLSymbol GET_ALLOTTED_TASKS = makeSymbol("GET-ALLOTTED-TASKS");

    private static final SubLSymbol $sym282$_X = makeSymbol("?X");

    public static final SubLList $list283 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CAEAnalysisTask")));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym286$_CURRENT_TASK = makeSymbol("?CURRENT-TASK");

    private static final SubLList $list287 = list(reader_make_constant_shell(makeString("allottedAgents")), makeSymbol("?X"), makeSymbol("?MONAD-USER"));

    private static final SubLObject $$cureUserModel = reader_make_constant_shell(makeString("cureUserModel"));

    private static final SubLSymbol $sym289$_MONAD_USER = makeSymbol("?MONAD-USER");

    private static final SubLObject $$allottedAgents = reader_make_constant_shell(makeString("allottedAgents"));

    private static final SubLObject $$AnalystDatabaseMt = reader_make_constant_shell(makeString("AnalystDatabaseMt"));

    public static final SubLList $list292 = list(makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLList $list294 = list(reader_make_constant_shell(makeString("AnalystDatabaseMt")));

    private static final SubLSymbol TERM_LEARNER_GET_FACT_SHEET_FOR_TERM = makeSymbol("TERM-LEARNER-GET-FACT-SHEET-FOR-TERM");

    private static final SubLString $str296$_html__body_No_known_facts__body_ = makeString("<html><body>No known facts</body></html>");



    private static final SubLString $str298$_ = makeString(">");

    private static final SubLSymbol TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM = makeSymbol("TERM-LEARNER-GET-FACT-SHEET-UPDATES-FOR-TERM");

    public static final SubLList $list300 = list(makeKeyword("INCLUDE-SECTIONS"), list(makeString("Recently Added")), makeKeyword("SHOW-COPYRIGHT?"), NIL);

    private static final SubLList $list301 = list(makeKeyword("PRINT-STATS?"), NIL, makeKeyword("EXTERNAL-STYLES"), T, makeKeyword("STYLESHEET"), makeString(""));

    private static final SubLSymbol $SLOT_VALUE_PREFERENCE_PATTERN = makeKeyword("SLOT-VALUE-PREFERENCE-PATTERN");





    private static final SubLString $str305$Fact_sheet_properties___S = makeString("Fact-sheet properties: ~S");

    private static final SubLString $str306$preferSlotValueFormatForTermLearn = makeString("preferSlotValueFormatForTermLearnerFactSheets");

    private static final SubLSymbol $kw307$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");



    private static final SubLSymbol $kw310$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $kw311$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");







    private static final SubLString $str319$forbidSlotValueFormatForTermLearn = makeString("forbidSlotValueFormatForTermLearnerFactSheets");





    private static final SubLList $list322 = list(list(reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Individual"))), NIL);

    private static final SubLSymbol TERM_LEARNER_FACT_STATUS = makeSymbol("TERM-LEARNER-FACT-STATUS");



    private static final SubLString $$$null = makeString("null");

    private static final SubLSymbol TERM_LEARNER_FACT_STATUS_INT = makeSymbol("TERM-LEARNER-FACT-STATUS-INT");

    private static final SubLString $$$Derived_from_other_assertions = makeString("Derived from other assertions");

    private static final SubLSymbol $term_learner_fact_status_int_caching_state$ = makeSymbol("*TERM-LEARNER-FACT-STATUS-INT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_TERM_LEARNER_FACT_STATUS_INT = makeSymbol("CLEAR-TERM-LEARNER-FACT-STATUS-INT");

    private static final SubLSymbol TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL = makeSymbol("TERM-LEARNER-FIND-VISIBLE-ASSERTIONS-CYCL");

    private static final SubLList $list331 = list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("DocumentReaderFollowupSuggestionMt")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")));

    private static final SubLString $$$conceptId = makeString("conceptId");

    private static final SubLString $$$max = makeString("max");

    private static final SubLString $$$questionsOnly = makeString("questionsOnly");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$unknownOnly = makeString("unknownOnly");

    private static final SubLString $$$user = makeString("user");

    private static final SubLObject $$CycAdministrator = reader_make_constant_shell(makeString("CycAdministrator"));

    private static final SubLString $$$ignoreList = makeString("ignoreList");

    private static final SubLSymbol XML_TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM = makeSymbol("XML-TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM");

    private static final SubLSymbol TERM_LEARNER_GET_FOLLOWUPS_FOR_CYCL_TERM = makeSymbol("TERM-LEARNER-GET-FOLLOWUPS-FOR-CYCL-TERM");

    private static final SubLSymbol TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM = makeSymbol("TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM");







    private static final SubLSymbol $sym346$EQUALS_EL_ = makeSymbol("EQUALS-EL?");



    public static final SubLList $list348 = cons(makeSymbol("CATEGORY-PRED"), makeSymbol("CATEGORY-FOLLOWUPS"));

    private static final SubLSymbol HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY = makeSymbol("HIGHER-PRIORITY-FOLLOWUP-IN-CATEGORY");





    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    private static final SubLSymbol TERM_LEARNER_CATEGORY_LABEL = makeSymbol("TERM-LEARNER-CATEGORY-LABEL");

    private static final SubLString $$$Advanced_Info = makeString("Advanced Info");

    private static final SubLObject $$termSummaryPredicateLabel = reader_make_constant_shell(makeString("termSummaryPredicateLabel"));



    private static final SubLObject $$genStringAssertion = reader_make_constant_shell(makeString("genStringAssertion"));

    private static final SubLSymbol $term_learner_category_label_caching_state$ = makeSymbol("*TERM-LEARNER-CATEGORY-LABEL-CACHING-STATE*");

    private static final SubLSymbol CLEAR_TERM_LEARNER_CATEGORY_LABEL = makeSymbol("CLEAR-TERM-LEARNER-CATEGORY-LABEL");

    private static final SubLSymbol GET_FOLLOWUP_CATEGORIES_FOR_TYPE = makeSymbol("GET-FOLLOWUP-CATEGORIES-FOR-TYPE");

    private static final SubLSymbol $sym361$_CAT = makeSymbol("?CAT");

    private static final SubLObject $$subtopicCollectionForCategory = reader_make_constant_shell(makeString("subtopicCollectionForCategory"));

    private static final SubLSymbol $get_followup_categories_for_type_caching_state$ = makeSymbol("*GET-FOLLOWUP-CATEGORIES-FOR-TYPE-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol CLEAR_GET_FOLLOWUP_CATEGORIES_FOR_TYPE = makeSymbol("CLEAR-GET-FOLLOWUP-CATEGORIES-FOR-TYPE");

    private static final SubLSymbol GET_PRED_LIST_ORDER_FOR_TYPE = makeSymbol("GET-PRED-LIST-ORDER-FOR-TYPE");

    private static final SubLSymbol $sym367$_PRED_LIST = makeSymbol("?PRED-LIST");

    private static final SubLObject $const368$summaryPredicateWRTSetOrCollectio = reader_make_constant_shell(makeString("summaryPredicateWRTSetOrCollection-RecommendedOrdering"));

    public static final SubLList $list369 = list(makeSymbol("?PRED-LIST"));

    private static final SubLSymbol $get_pred_list_order_for_type_caching_state$ = makeSymbol("*GET-PRED-LIST-ORDER-FOR-TYPE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_PRED_LIST_ORDER_FOR_TYPE = makeSymbol("CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));



    private static final SubLSymbol SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN = makeSymbol("SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN");

    private static final SubLSymbol $sym375$_COL = makeSymbol("?COL");

    private static final SubLObject $$argGenl = reader_make_constant_shell(makeString("argGenl"));

    private static final SubLList $list377 = list(makeSymbol("?COL"));

    private static final SubLSymbol $substitutable_arg_constraint_for_reln_caching_state$ = makeSymbol("*SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN-CACHING-STATE*");



    private static final SubLSymbol CLEAR_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN = makeSymbol("CLEAR-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN");

    private static final SubLList $list381 = list(makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"));

    private static final SubLSymbol $sym382$_N = makeSymbol("?N");

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLSymbol $sym384$_TERM = makeSymbol("?TERM");

    private static final SubLObject $$argN = reader_make_constant_shell(makeString("argN"));

    private static final SubLSymbol $sym386$_SENTENCE_PRED = makeSymbol("?SENTENCE-PRED");

    private static final SubLList $list387 = list(reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?SENTENCE-PRED"), makeSymbol("?PRED"));

    public static final SubLList $list388 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?GENERAL")), list(reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTInstancesInArg")), makeSymbol("?PRED"), makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"), makeSymbol("?N")));

    private static final SubLList $list389 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?TERM"), makeSymbol("?GENERAL")), list(reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTSpecsInArg")), makeSymbol("?PRED"), makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"), makeSymbol("?N")));

    private static final SubLList $list390 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?GENERAL")), list(reader_make_constant_shell(makeString("predRelevantToTermSummaryPredWRTInstancesInArg")), makeSymbol("?SENTENCE-PRED"), makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"), makeSymbol("?N")));

    private static final SubLList $list391 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?TERM"), makeSymbol("?GENERAL")), list(reader_make_constant_shell(makeString("predRelevantToTermSummaryPredWRTSpecsInArg")), makeSymbol("?SENTENCE-PRED"), makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"), makeSymbol("?N")));

    private static final SubLList $list392 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?GENERAL"));

    private static final SubLList $list393 = list(list(reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTInstancesInArg")), makeSymbol("?SENTENCE-PRED"), makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"), makeSymbol("?N")));

    private static final SubLList $list394 = list(reader_make_constant_shell(makeString("genls")), makeSymbol("?TERM"), makeSymbol("?GENERAL"));

    private static final SubLList $list395 = list(list(reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTSpecsInArg")), makeSymbol("?SENTENCE-PRED"), makeSymbol("?SUMM-PRED"), makeSymbol("?GENERAL"), makeSymbol("?N")));

    private static final SubLSymbol CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING = makeSymbol("CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING");

    private static final SubLList $list397 = list(reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTInstancesInArg")), reader_make_constant_shell(makeString("predRelevantToTermSummaryPredWRTInstancesInArg")), reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTInstancesInArg")));

    private static final SubLList $list398 = list(reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTSpecsInArg")), reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTInstancesInArg")));

    private static final SubLList $list399 = list(reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTInstancesInArg")), reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTSpecsInArg")));





    private static final SubLList $list402 = list(reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTInstancesInArg")), reader_make_constant_shell(makeString("predRelevantToTermSummaryPredWRTInstancesInArg")), reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTInstancesInArg")), reader_make_constant_shell(makeString("specPredsRelevantToTermSummaryPredWRTSpecsInArg")), reader_make_constant_shell(makeString("predRelevantToTermSummaryPredWRTSpecsInArg")), reader_make_constant_shell(makeString("assertedPredRelevantToTermSummaryPredWRTSpecsInArg")));

    private static final SubLSymbol $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$ = makeSymbol("*CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING = makeSymbol("CLEAR-CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING");



    private static final SubLSymbol SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM = makeSymbol("SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM");

    private static final SubLList $list407 = list(makeSymbol("?GENERAL"), makeSymbol("?LIST"));

    private static final SubLList $list408 = list(reader_make_constant_shell(makeString("summaryPredicateOrderingForSpecs")), makeSymbol("?GENERAL"), makeSymbol("?LIST"));

    private static final SubLList $list409 = list(makeSymbol("?GENERAL"));

    private static final SubLSymbol $sym410$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLList $list411 = list(reader_make_constant_shell(makeString("summaryPredicateOrderingForInstances")), makeSymbol("?GENERAL"), makeSymbol("?LIST"));

    private static final SubLSymbol CDADR = makeSymbol("CDADR");

    private static final SubLSymbol $summary_pred_sort_order_for_focal_term_caching_state$ = makeSymbol("*SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol CLEAR_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM = makeSymbol("CLEAR-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM");

    private static final SubLString $str416$_______________________________Fo = makeString("~%***************************~%Followup user: ~S~%");

    private static final SubLString $str417$_______________________________Fo = makeString("~%***************************~%Followup query mt: ~S~%");

    private static final SubLString $str418$_______________________________Fr = makeString("~%***************************~%Fragments: ~%");

    private static final SubLString $str419$_______________________________Fr = makeString("~%***************************~%Fragments with ~S: ~%");

    private static final SubLString $str420$_______________________________Un = makeString("~%***************************~%Unknown Questions about ~S: ~%");

    private static final SubLSymbol FOLLOWUP_QUERY_MT_FOR_USER = makeSymbol("FOLLOWUP-QUERY-MT-FOR-USER");

    private static final SubLSymbol $sym422$_TOPIC = makeSymbol("?TOPIC");

    private static final SubLObject $$interests = reader_make_constant_shell(makeString("interests"));

    private static final SubLList $list424 = list(makeSymbol("?TOPIC"), reader_make_constant_shell(makeString("mediumToHighAmountOf")));

    private static final SubLObject $const425$DocumentReaderFollowupsForInteres = reader_make_constant_shell(makeString("DocumentReaderFollowupsForInterestMtFn"));

    private static final SubLSymbol $followup_query_mt_for_user_caching_state$ = makeSymbol("*FOLLOWUP-QUERY-MT-FOR-USER-CACHING-STATE*");

    private static final SubLSymbol CLEAR_FOLLOWUP_QUERY_MT_FOR_USER = makeSymbol("CLEAR-FOLLOWUP-QUERY-MT-FOR-USER");

    private static final SubLSymbol $sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK = makeSymbol("FOLLOWUP-QUERY-MT-FOR-USER&TASK");

    private static final SubLSymbol $sym429$_MT = makeSymbol("?MT");

    private static final SubLObject $$defaultCUREGuidanceMt = reader_make_constant_shell(makeString("defaultCUREGuidanceMt"));

    private static final SubLObject $$SpecificationVariantFn = reader_make_constant_shell(makeString("SpecificationVariantFn"));

    private static final SubLList $list432 = list(reader_make_constant_shell(makeString("DefaultParameterSpecificationFn")), reader_make_constant_shell(makeString("CycAnalyticEnvironment-TheProgram")));

    private static final SubLObject $$analysisTask = reader_make_constant_shell(makeString("analysisTask"));

    private static final SubLList $list434 = list(makeSymbol("?MT"));

    private static final SubLSymbol $sym435$_FOLLOWUP_QUERY_MT_FOR_USER_TASK_CACHING_STATE_ = makeSymbol("*FOLLOWUP-QUERY-MT-FOR-USER&TASK-CACHING-STATE*");

    private static final SubLSymbol $sym436$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER_TASK = makeSymbol("CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK");

    private static final SubLSymbol TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE = makeSymbol("TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE");

    public static final SubLList $list438 = list(makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"));

    private static final SubLObject $$nearestIsa = reader_make_constant_shell(makeString("nearestIsa"));

    private static final SubLObject $$nearestGenls = reader_make_constant_shell(makeString("nearestGenls"));

    private static final SubLObject $$commonAilmentCause = reader_make_constant_shell(makeString("commonAilmentCause"));

    private static final SubLObject $$objectFoundInLocation = reader_make_constant_shell(makeString("objectFoundInLocation"));

    private static final SubLObject $$properlyGeographicallySubsumes = reader_make_constant_shell(makeString("properlyGeographicallySubsumes"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLSymbol $term_learner_known_bindings_for_sentence_caching_state$ = makeSymbol("*TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE = makeSymbol("CLEAR-TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE");

    private static final SubLList $list448 = list(makeSymbol("BINDING-SET"), makeSymbol("SUPPORT-SET"));

    private static final SubLSymbol TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE = makeSymbol("TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE");

    private static final SubLSymbol $term_learner_known_negated_bindings_for_sentence_caching_state$ = makeSymbol("*TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE = makeSymbol("CLEAR-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE");

    private static final SubLSymbol TERM_LEARNER_TYPES_FOR_FRAGMENT = makeSymbol("TERM-LEARNER-TYPES-FOR-FRAGMENT");

    private static final SubLSymbol $term_learner_types_for_fragment_caching_state$ = makeSymbol("*TERM-LEARNER-TYPES-FOR-FRAGMENT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_TERM_LEARNER_TYPES_FOR_FRAGMENT = makeSymbol("CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT");

    private static final SubLObject $$singleEntryFormatInArgs = reader_make_constant_shell(makeString("singleEntryFormatInArgs"));

    private static final SubLObject $$List = reader_make_constant_shell(makeString("List"));

    private static final SubLObject $$CharacterString = reader_make_constant_shell(makeString("CharacterString"));

    private static final SubLSymbol $sym458$_Y = makeSymbol("?Y");

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    public static final SubLList $list460 = list(makeSymbol("POSSIBLY-MET-CONSTRAINT"), makeSymbol("MUST-BE-MET-CONSTRAINT"));

    private static final SubLList $list461 = list(makeSymbol("?ALLOWED-VALUE"), makeSymbol("?ALLOWED-POS"), makeSymbol("?KNOWN-VALUE"), makeSymbol("?KNOWN-POS"));

    private static final SubLObject $const462$constrainKnownValuesForPredRelati = reader_make_constant_shell(makeString("constrainKnownValuesForPredRelativeToIsaInArg-Isa"));

    private static final SubLList $list463 = list(makeSymbol("ALLOWED-VAL"), makeSymbol("ALLOWED-POS"), makeSymbol("KNOWN-VAL"), makeSymbol("KNOWN-POS"));

    private static final SubLObject $$SentenceOfCWFn = reader_make_constant_shell(makeString("SentenceOfCWFn"));

    private static final SubLList $list465 = list(ONE_INTEGER);

    private static final SubLList $list466 = list(ONE_INTEGER, ZERO_INTEGER);

    private static final SubLObject $$WebPageCWFn = reader_make_constant_shell(makeString("WebPageCWFn"));

    private static final SubLList $list468 = list(ONE_INTEGER, ONE_INTEGER);

    private static final SubLSymbol SOURCES_OF_MT = makeSymbol("SOURCES-OF-MT");

    private static final SubLSymbol $sym470$_PCW = makeSymbol("?PCW");

    private static final SubLObject $$contextOfPCWInterpretation = reader_make_constant_shell(makeString("contextOfPCWInterpretation"));

    private static final SubLList $list472 = list(makeSymbol("?WHO"), makeSymbol("?WHEN"));

    private static final SubLSymbol $sources_of_mt_caching_state$ = makeSymbol("*SOURCES-OF-MT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_SOURCES_OF_MT = makeSymbol("CLEAR-SOURCES-OF-MT");

    private static final SubLSymbol TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE = makeSymbol("TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE");

    private static final SubLList $list476 = cons(makeSymbol("ARG-POS"), makeSymbol("SUGGESTIONS"));

    private static final SubLSymbol JAVA_RENDERING_P = makeSymbol("JAVA-RENDERING-P");

    private static final SubLSymbol JAVA_RENDERING_TO_SELECTION_RENDERER = makeSymbol("JAVA-RENDERING-TO-SELECTION-RENDERER");

    private static final SubLSymbol GET_ARG_POSITIONS_FOR_TERMS = makeSymbol("GET-ARG-POSITIONS-FOR-TERMS");

    private static final SubLSymbol $get_arg_positions_for_terms_caching_state$ = makeSymbol("*GET-ARG-POSITIONS-FOR-TERMS-CACHING-STATE*");

    private static final SubLSymbol $PPH_UNKNOWN_ARG_POSITION = makeKeyword("PPH-UNKNOWN-ARG-POSITION");

    private static final SubLSymbol PPH_JAVALIST_ITEM_STRING = makeSymbol("PPH-JAVALIST-ITEM-STRING");

    private static final SubLSymbol CB_NAUT_FRAME = makeSymbol("CB-NAUT-FRAME");

    private static final SubLSymbol PPH_NAUT_ID_FN = makeSymbol("PPH-NAUT-ID-FN");



    private static final SubLString $str486$__ = makeString(" (");

    private static final SubLString $str487$_ = makeString(")");



    private static final SubLSymbol $CHOOSE_A_VALUE = makeKeyword("CHOOSE-A-VALUE");

    private static final SubLString $$$Choose_a_value = makeString("Choose a value");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLList $list492 = list(ZERO_INTEGER);



    private static final SubLList $list494 = list(CHAR_quotation);

    private static final SubLSymbol TERM_LEARNER_TYPES_FOR_SENTENCE = makeSymbol("TERM-LEARNER-TYPES-FOR-SENTENCE");

    private static final SubLSymbol TERM_LEARNER_TYPES_FOR_SENTENCE_ID = makeSymbol("TERM-LEARNER-TYPES-FOR-SENTENCE-ID");

    private static final SubLList $list497 = list(makeString("add-before"), makeString("add-after"));

    private static final SubLString $str498$add_before = makeString("add-before");

    private static final SubLSymbol $sym499$_NEW_VAR = makeSymbol("?NEW-VAR");

    private static final SubLString $$$remove = makeString("remove");

    private static final SubLString $str501$can_t_duplicate_with_uninterpreta = makeString("can't duplicate with uninterpretable command: ~S");

    private static final SubLSymbol CURE_POSSIBLY_DUPLICATE_ARG = makeSymbol("CURE-POSSIBLY-DUPLICATE-ARG");













    public static final SubLList $list509 = list(list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("G"))), makeString("(4 1)"), makeString("remove")), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), list(makeSymbol("E"), makeSymbol("G")))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("G"))), makeString("(4 1)"), makeString("add-after")), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("?NEW-VAR"), makeSymbol("G")))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("G"))), makeString("(4 1)"), makeString("add-before")), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), list(makeSymbol("E"), makeSymbol("?NEW-VAR"), makeSymbol("F"), makeSymbol("G")))));

    private static final SubLObject $$DocumentationPredicate = reader_make_constant_shell(makeString("DocumentationPredicate"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));





    private static final SubLString $$$WebDocumentsMt = makeString("WebDocumentsMt");

    private static final SubLObject $$WebDocumentsMt = reader_make_constant_shell(makeString("WebDocumentsMt"));

    private static final SubLObject $$MassMediaDataMt = reader_make_constant_shell(makeString("MassMediaDataMt"));

    private static final SubLString $str517$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLObject $$AssistedReaderSourceSpindle = reader_make_constant_shell(makeString("AssistedReaderSourceSpindle"));

    private static final SubLObject $const519$AssistedReaderSourceSpindleCollec = reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt"));

    private static final SubLObject $$TechnicalEnglishLexicalMt = reader_make_constant_shell(makeString("TechnicalEnglishLexicalMt"));

    private static final SubLObject $$MedicalLexicalMt = reader_make_constant_shell(makeString("MedicalLexicalMt"));

    private static final SubLSymbol $PPH_LEXICAL_CONTEXT = makeKeyword("PPH-LEXICAL-CONTEXT");



    private static final SubLSymbol GET_CYCL = makeSymbol("GET-CYCL");

    private static final SubLList $list525 = list(makeKeyword("JUSTIFICATION"));

    private static final SubLSymbol TERM_LEARNER_HANDLE_USER_CHOICE = makeSymbol("TERM-LEARNER-HANDLE-USER-CHOICE");

    private static final SubLSymbol $sym527$TERM_EXPANSION_EXPECTED_SENTENCE_ = makeSymbol("TERM-EXPANSION-EXPECTED-SENTENCE?");

    private static final SubLSymbol TRANSFORM_TO_TRUE = makeSymbol("TRANSFORM-TO-TRUE");





    private static final SubLString $$$Error_while_trying_to_handle_ = makeString("Error while trying to handle ");

    private static final SubLSymbol $NEW_SENTENCE_CYCL = makeKeyword("NEW-SENTENCE-CYCL");

    private static final SubLString $str533$_accepted_meaning_date___A__user_ = makeString("<accepted-meaning date='~A' user-id='~A'><original-string>~S</original-string><focal-term id='~A'>~A</focal-term><sentence id='~a'>~A</sentence-id><justifications>~A</justifications></accepted-meaning>~%");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$termExpansionExpected = reader_make_constant_shell(makeString("termExpansionExpected"));

    private static final SubLObject $$UnsourcedDataForUserByTaskMtFn = reader_make_constant_shell(makeString("UnsourcedDataForUserByTaskMtFn"));

    private static final SubLObject $$userTaskSortsWorkBySourceDocument = reader_make_constant_shell(makeString("userTaskSortsWorkBySourceDocument"));

    private static final SubLSymbol NORMALIZE_CURE_USER = makeSymbol("NORMALIZE-CURE-USER");

    private static final SubLSymbol $sym539$_BASE_USER = makeSymbol("?BASE-USER");

    private static final SubLSymbol $sym540$_TASK = makeSymbol("?TASK");

    private static final SubLSymbol $normalize_cure_user_caching_state$ = makeSymbol("*NORMALIZE-CURE-USER-CACHING-STATE*");







    private static final SubLString $str545$term_learner_base_source_creation = makeString("term-learner-base-source-creation-lock");

    private static final SubLObject $const546$AssistedReaderSourceSpindleForTas = reader_make_constant_shell(makeString("AssistedReaderSourceSpindleForTaskAndUserFn"));

    private static final SubLSymbol DEFAULT_ASSERT_MT_FOR_USER_AND_TASK = makeSymbol("DEFAULT-ASSERT-MT-FOR-USER-AND-TASK");

    private static final SubLObject $const548$assistedReaderAssertionMtForTaskA = reader_make_constant_shell(makeString("assistedReaderAssertionMtForTaskAndUser"));

    private static final SubLSymbol $default_assert_mt_for_user_and_task_caching_state$ = makeSymbol("*DEFAULT-ASSERT-MT-FOR-USER-AND-TASK-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK = makeSymbol("CLEAR-DEFAULT-ASSERT-MT-FOR-USER-AND-TASK");

    private static final SubLSymbol $sym551$_CW = makeSymbol("?CW");

    private static final SubLObject $$urlOfCW = reader_make_constant_shell(makeString("urlOfCW"));

    private static final SubLObject $$URLFn = reader_make_constant_shell(makeString("URLFn"));

    private static final SubLList $list554 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLObject $$mtSpindleMember = reader_make_constant_shell(makeString("mtSpindleMember"));

    private static final SubLObject $$ContextOfPCWFn = reader_make_constant_shell(makeString("ContextOfPCWFn"));

    private static final SubLList $list557 = list(reader_make_constant_shell(makeString("WorldWideWebPage-PCW")));

    private static final SubLObject $$titleOfWork = reader_make_constant_shell(makeString("titleOfWork"));

    private static final SubLObject $$ContextOfPCWInterpretationFn = reader_make_constant_shell(makeString("ContextOfPCWInterpretationFn"));

    private static final SubLObject $$contextOfPCW = reader_make_constant_shell(makeString("contextOfPCW"));

    private static final SubLString $str561$term_learner_sub_source_creation_ = makeString("term-learner-sub-source-creation-lock");

    private static final SubLObject $$asHtmlSourceString = reader_make_constant_shell(makeString("asHtmlSourceString"));

    private static final SubLList $list563 = list(reader_make_constant_shell(makeString("AISForFn")), makeSymbol("?CW"));

    private static final SubLObject $$subWorks = reader_make_constant_shell(makeString("subWorks"));

    private static final SubLList $list565 = list(makeSymbol("?CW"));

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLList $list567 = list(reader_make_constant_shell(makeString("PropositionalConceptualWork")));

    private static final SubLObject $$AISForFn = reader_make_constant_shell(makeString("AISForFn"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLSymbol $sym571$_SUBWORK = makeSymbol("?SUBWORK");

    private static final SubLList $list572 = list(makeSymbol("?SUBWORK"));

    private static final SubLList $list573 = list(makeSymbol("?DATE"));

    private static final SubLSymbol $sym574$_WORK = makeSymbol("?WORK");

    private static final SubLSymbol CLEAR_MTS_FOR_USER = makeSymbol("CLEAR-MTS-FOR-USER");

    private static final SubLSymbol $sym576$CLEAR_MTS_FOR_URL_USER = makeSymbol("CLEAR-MTS-FOR-URL&USER");





    private static final SubLString $str579$do_broad_mt_index = makeString("do-broad-mt-index");



    private static final SubLString $$$assertionDependsOn = makeString("assertionDependsOn");

    private static final SubLList $list582 = list(reader_make_constant_shell(makeString("inProgressTerm")), makeKeyword("TERM"));

    private static final SubLSymbol CYCLIST_FORT = makeSymbol("CYCLIST-FORT");

    private static final SubLSymbol $sym584$HUMAN_CYCLIST_ = makeSymbol("HUMAN-CYCLIST?");

    private static final SubLString $$$needsApproval = makeString("needsApproval");

    private static final SubLString $$$disapproved = makeString("disapproved");

    private static final SubLString $$$approved = makeString("approved");

    private static final SubLList $list588 = list(makeKeyword("STANFORD-NER"), makeKeyword("STANFORD-NER-PSP"));









    private static final SubLList $list593 = list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("TaxonomyOfEasilyUnderstandableConcepts")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept")));

    private static final SubLObject $$PredicateTaxonomy = reader_make_constant_shell(makeString("PredicateTaxonomy"));

    private static final SubLList $list595 = list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("PredicateTaxonomy")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept")));



    private static final SubLSymbol TIGHTEN_TYPE = makeSymbol("TIGHTEN-TYPE");

    private static final SubLSymbol $STANFORD_NER_PSP = makeKeyword("STANFORD-NER-PSP");

    private static final SubLList $list599 = list(list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("TaxonomyOfEasilyUnderstandableConcepts")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept"))));







    private static final SubLSymbol TERM_LEARNER_TYPE_PROMPT = makeSymbol("TERM-LEARNER-TYPE-PROMPT");

    private static final SubLList $list604 = list(reader_make_constant_shell(makeString("Cat")));

    private static final SubLString $$$cat = makeString("cat");

    private static final SubLString $str606$_ = makeString(":");

    private static final SubLSymbol $term_learner_type_prompt_caching_state$ = makeSymbol("*TERM-LEARNER-TYPE-PROMPT-CACHING-STATE*");

    private static final SubLSymbol TERM_LEARNER_TERM_HEADER_STRING = makeSymbol("TERM-LEARNER-TERM-HEADER-STRING");

    private static final SubLSymbol $term_learner_term_header_string_caching_state$ = makeSymbol("*TERM-LEARNER-TERM-HEADER-STRING-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLSymbol CLEAR_TERM_LEARNER_TERM_HEADER_STRING = makeSymbol("CLEAR-TERM-LEARNER-TERM-HEADER-STRING");

    private static final SubLSymbol TERM_LEARNER_ALTERNATIVE_PHRASES = makeSymbol("TERM-LEARNER-ALTERNATIVE-PHRASES");





    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $$assertionDependsOn = reader_make_constant_shell(makeString("assertionDependsOn"));

    private static final SubLSymbol DEFAULT_TASK_FOR_USER = makeSymbol("DEFAULT-TASK-FOR-USER");

    private static final SubLSymbol DEFAULT_TASK_FOR_USER_INT = makeSymbol("DEFAULT-TASK-FOR-USER-INT");

    private static final SubLObject $$defaultTask = reader_make_constant_shell(makeString("defaultTask"));

    private static final SubLObject $$GeneralCycKETask_Allotment = reader_make_constant_shell(makeString("GeneralCycKETask-Allotment"));

    private static final SubLSymbol $default_task_for_user_int_caching_state$ = makeSymbol("*DEFAULT-TASK-FOR-USER-INT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DEFAULT_TASK_FOR_USER_INT = makeSymbol("CLEAR-DEFAULT-TASK-FOR-USER-INT");

    private static final SubLSymbol QUERY_MT_FOR_TASK = makeSymbol("QUERY-MT-FOR-TASK");

    private static final SubLSymbol $query_mt_for_task_caching_state$ = makeSymbol("*QUERY-MT-FOR-TASK-CACHING-STATE*");

    private static final SubLSymbol CLEAR_QUERY_MT_FOR_TASK = makeSymbol("CLEAR-QUERY-MT-FOR-TASK");

    private static final SubLSymbol WFF_CHECKING_MT_FOR_TASK = makeSymbol("WFF-CHECKING-MT-FOR-TASK");

    private static final SubLSymbol $wff_checking_mt_for_task_caching_state$ = makeSymbol("*WFF-CHECKING-MT-FOR-TASK-CACHING-STATE*");

    private static final SubLSymbol CLEAR_WFF_CHECKING_MT_FOR_TASK = makeSymbol("CLEAR-WFF-CHECKING-MT-FOR-TASK");

    private static final SubLSymbol QUERY_MT_FOR_USER_AND_TASK = makeSymbol("QUERY-MT-FOR-USER-AND-TASK");

    private static final SubLSymbol $query_mt_for_user_and_task_caching_state$ = makeSymbol("*QUERY-MT-FOR-USER-AND-TASK-CACHING-STATE*");

    private static final SubLSymbol CLEAR_QUERY_MT_FOR_USER_AND_TASK = makeSymbol("CLEAR-QUERY-MT-FOR-USER-AND-TASK");

    private static final SubLSymbol WFF_CHECKING_MT_FOR_USER_AND_TASK = makeSymbol("WFF-CHECKING-MT-FOR-USER-AND-TASK");

    private static final SubLSymbol $wff_checking_mt_for_user_and_task_caching_state$ = makeSymbol("*WFF-CHECKING-MT-FOR-USER-AND-TASK-CACHING-STATE*");

    private static final SubLSymbol CLEAR_WFF_CHECKING_MT_FOR_USER_AND_TASK = makeSymbol("CLEAR-WFF-CHECKING-MT-FOR-USER-AND-TASK");

    private static final SubLString $$$types = makeString("types");



    private static final SubLString $$$category = makeString("category");

    private static final SubLString $$$categoryNL = makeString("categoryNL");

    private static final SubLString $$$typeSet = makeString("typeSet");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$required = makeString("required");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $$$display = makeString("display");

    private static final SubLString $$$cyclTerm = makeString("cyclTerm");

    private static final SubLString $$$nlString = makeString("nlString");

    private static final SubLString $$$legendString = makeString("legendString");

    private static final SubLString $$$replicationSentenceId = makeString("replicationSentenceId");

    private static final SubLString $$$statusCode = makeString("statusCode");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $$$renderers = makeString("renderers");

    private static final SubLString $$$renderer = makeString("renderer");

    private static final SubLString $$$isaConstraint = makeString("isaConstraint");

    private static final SubLString $$$genlsConstraint = makeString("genlsConstraint");

    private static final SubLString $str654$text_matches = makeString("text-matches");

    private static final SubLString $$$heading = makeString("heading");

    private static final SubLList $list656 = list(makeString("valid"), makeString("false"));

    private static final SubLString $$$initiallySelected = makeString("initiallySelected");

    private static final SubLString $$$selectionRenderer = makeString("selectionRenderer");

    private static final SubLString $$$cyclId = makeString("cyclId");

    private static final SubLSymbol TERM_LEARNER_CONCEPT_CLOUDS = makeSymbol("TERM-LEARNER-CONCEPT-CLOUDS");





    private static final SubLSymbol TERM_LEARNER_TERM_CONCEPT_CLOUD = makeSymbol("TERM-LEARNER-TERM-CONCEPT-CLOUD");



    private static final SubLSymbol SIXTH = makeSymbol("SIXTH");

    private static final SubLSymbol TERM_LEARNER_CONCEPT_CLOUD_AS_XML = makeSymbol("TERM-LEARNER-CONCEPT-CLOUD-AS-XML");

    private static final SubLString $$$cloud = makeString("cloud");





    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $$$f = makeString("f");

    private static final SubLString $$$weight = makeString("weight");

    private static final SubLString $$$nl = makeString("nl");

    private static final SubLString $$$concept = makeString("concept");

    private static final SubLString $$$genl = makeString("genl");

    private static final SubLSymbol TERM_LEARNER_CONCEPT_CLOUD_NEW_INT = makeSymbol("TERM-LEARNER-CONCEPT-CLOUD-NEW-INT");

    private static final SubLSymbol TERM_LEARNER_ID = makeSymbol("TERM-LEARNER-ID");

    private static final SubLSymbol TERM_LEARNER_CLOUD_DISPLAY_NL = makeSymbol("TERM-LEARNER-CLOUD-DISPLAY-NL");

    private static final SubLSymbol $term_learner_cloud_display_nl_caching_state$ = makeSymbol("*TERM-LEARNER-CLOUD-DISPLAY-NL-CACHING-STATE*");



    private static final SubLSymbol CLEAR_TERM_LEARNER_CLOUD_DISPLAY_NL = makeSymbol("CLEAR-TERM-LEARNER-CLOUD-DISPLAY-NL");

    private static final SubLSymbol $sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_ = makeSymbol("TERM-LEARNER-DISPLAYABLE-GENERALIZATION?");

    private static final SubLSymbol $sym684$_TERM_LEARNER_DISPLAYABLE_GENERALIZATION__CACHING_STATE_ = makeSymbol("*TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-CACHING-STATE*");

    private static final SubLSymbol $sym685$CLEAR_TERM_LEARNER_DISPLAYABLE_GENERALIZATION_ = makeSymbol("CLEAR-TERM-LEARNER-DISPLAYABLE-GENERALIZATION?");

    private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

    private static final SubLList $list687 = list(reader_make_constant_shell(makeString("CollectionUnionFn")), reader_make_constant_shell(makeString("CollectionDifferenceFn")));

    private static final SubLSymbol $sym688$_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION__CACHING_STATE_ = makeSymbol("*TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-CACHING-STATE*");

    private static final SubLSymbol $sym689$CLEAR_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_ = makeSymbol("CLEAR-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?");

    private static final SubLSymbol $KB_MODIFY_IRRELEVANCE = makeKeyword("KB-MODIFY-IRRELEVANCE");

    private static final SubLSymbol CLEAR_TERM_LEARNER_IRRELEVANCIES_FOR_TERM = makeSymbol("CLEAR-TERM-LEARNER-IRRELEVANCIES-FOR-TERM");

    private static final SubLSymbol CYCL_TERMS_TO_NL_STRINGS_QUICK = makeSymbol("CYCL-TERMS-TO-NL-STRINGS-QUICK");

    public static final SubLSymbol $cb_show_followup_widget$ = makeSymbol("*CB-SHOW-FOLLOWUP-WIDGET*");

    private static final SubLString $str694$_termId_ = makeString(" termId=");

    private static final SubLString $str695$_termString_ = makeString(" termString=");

    private static final SubLString $$$cycFollowup = makeString("cycFollowup");

    private static final SubLList $list697 = cons(makeUninternedSymbol("ATTRIBUTE"), makeUninternedSymbol("VALUE"));





    private static final SubLString $str700$cure_png = makeString("cure.png");

    private static final SubLString $str701$cure_cyc_com = makeString("cure.cyc.com");

    private static final SubLInteger $int$8080 = makeInteger(8080);

    private static final SubLString $str703$_ConceptSearch = makeString("/ConceptSearch");

    private static final SubLString $str704$_cure = makeString("/cure");

    public static final SubLSymbol $cb_cure_internal_host_override$ = makeSymbol("*CB-CURE-INTERNAL-HOST-OVERRIDE*");

    public static final SubLSymbol $cb_cure_internal_port_override$ = makeSymbol("*CB-CURE-INTERNAL-PORT-OVERRIDE*");

    private static final SubLString $$$CURE = makeString("CURE");



    private static final SubLString $$$CURE_Broken = makeString("CURE Broken");

    private static final SubLString $str710$CURE_broken___S = makeString("CURE broken: ~S");

    private static final SubLString $str711$http___ = makeString("http://");

    private static final SubLString $str712$_edit_jsp_conceptid_ = makeString("/edit.jsp?conceptid=");

    private static final SubLString $str713$_cycHost_ = makeString("&cycHost=");

    private static final SubLString $str714$_cycPort_ = makeString("&cycPort=");

    private static final SubLString $str715$_userName_ = makeString("&userName=");

    private static final SubLString $str716$_cure = makeString("-cure");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLString $str719$_cycdoc_img_cb_cure_png = makeString("/cycdoc/img/cb/cure.png");

    private static final SubLString $$$bottom = makeString("bottom");

    private static final SubLString $str721$height_1_2em = makeString("height:1.2em");

    private static final SubLSymbol SENTENCE_SCORE = makeSymbol("SENTENCE-SCORE");

    private static final SubLList $list723 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    private static final SubLSymbol ALL_INSTANCES = makeSymbol("ALL-INSTANCES");

    private static final SubLSymbol $sentence_score_caching_state$ = makeSymbol("*SENTENCE-SCORE-CACHING-STATE*");

    private static final SubLSymbol SENTENCE_SCORE_FOR_TYPE = makeSymbol("SENTENCE-SCORE-FOR-TYPE");

    private static final SubLSymbol $sym727$_QUERY_VAR = makeSymbol("?QUERY-VAR");

    private static final SubLSymbol $sentence_score_for_type_caching_state$ = makeSymbol("*SENTENCE-SCORE-FOR-TYPE-CACHING-STATE*");

    private static final SubLSymbol SET_QUERY_VARIABLE = makeSymbol("SET-QUERY-VARIABLE");

    private static final SubLSymbol $set_query_variable_caching_state$ = makeSymbol("*SET-QUERY-VARIABLE-CACHING-STATE*");

    private static final SubLObject $$DaveS = reader_make_constant_shell(makeString("DaveS"));

    private static final SubLString $$$something = makeString("something");

    private static final SubLObject $$GenericInstanceFn = reader_make_constant_shell(makeString("GenericInstanceFn"));



    private static final SubLSymbol GET_FRAGMENTS_FOR_TERMS_CACHED = makeSymbol("GET-FRAGMENTS-FOR-TERMS-CACHED");

    private static final SubLSymbol $get_fragments_for_terms_cached_caching_state$ = makeSymbol("*GET-FRAGMENTS-FOR-TERMS-CACHED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_FRAGMENTS_FOR_TERMS_CACHED = makeSymbol("CLEAR-GET-FRAGMENTS-FOR-TERMS-CACHED");

    private static final SubLObject $$Restaurant_Organization = reader_make_constant_shell(makeString("Restaurant-Organization"));

    private static final SubLList $list739 = list(reader_make_constant_shell(makeString("DocumentReaderFollowupsForTaskMtFn")), reader_make_constant_shell(makeString("GeneralCycKETask-Allotment")));

    private static final SubLList $list740 = list(makeSymbol("SENTENCE"), makeSymbol("SCORE"));

    private static final SubLList $list741 = list(makeKeyword("ISA-HORIZON"), reader_make_constant_shell(makeString("Agent-Generic")), makeKeyword("GENLS-HORIZON"), reader_make_constant_shell(makeString("Individual")), makeKeyword("USAGE-THRESHOLD"), TEN_INTEGER);

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $$$gathering_preds_for_ = makeString("gathering preds for ");

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    private static final SubLList $list745 = list(makeSymbol("PRED"), makeSymbol("SCORE"));

    private static final SubLObject $const746$DocumentReaderFollowupsForTaskMtF = reader_make_constant_shell(makeString("DocumentReaderFollowupsForTaskMtFn"));











    private static final SubLString $str752$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str757$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str758$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str759$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str760$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLFloat $float$0_001 = makeDouble(0.001);

    private static final SubLObject $$GeneralCycKE = reader_make_constant_shell(makeString("GeneralCycKE"));



    private static final SubLObject $const764$generateFormulasForElements_TermI = reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));





    private static final SubLSymbol RESTART_CONCEPT_SEARCH_DEMO_SERVER = makeSymbol("RESTART-CONCEPT-SEARCH-DEMO-SERVER");

    private static final SubLString $$$Restarting_CCF_Demo_Cyc_Server = makeString("Restarting CCF Demo Cyc Server");

    private static final SubLString $str770$_cyc_java_pkg_WebServicesTester_b = makeString("/cyc/java/pkg/WebServicesTester/bin/restart-ccf-demo-web-services.sh");





    private static final SubLList $list773 = list(makeString("the"), makeString("The"));

    private static final SubLSymbol $sym774$COLLECTION_VIA_WEB_SEARCH_ = makeSymbol("COLLECTION-VIA-WEB-SEARCH?");

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol $sym777$_COLLECTION_VIA_WEB_SEARCH__CACHING_STATE_ = makeSymbol("*COLLECTION-VIA-WEB-SEARCH?-CACHING-STATE*");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol YAHOO_COUNT_CACHED = makeSymbol("YAHOO-COUNT-CACHED");

    private static final SubLString $str780$_much_ = makeString("\"much ");

    private static final SubLString $str781$_ = makeString("\"");

    private static final SubLString $str782$_many_ = makeString("\"many ");

    private static final SubLSymbol GET_CONCEPT_TAGS_FROM_STRING = makeSymbol("GET-CONCEPT-TAGS-FROM-STRING");

    private static final SubLSymbol $get_concept_tags_from_string_caching_state$ = makeSymbol("*GET-CONCEPT-TAGS-FROM-STRING-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_CONCEPT_TAGS_FROM_STRING = makeSymbol("CLEAR-GET-CONCEPT-TAGS-FROM-STRING");

    private static final SubLSymbol GET_FILLER_SCORE = makeSymbol("GET-FILLER-SCORE");

    private static final SubLSymbol FIND_SENTENCE_FILLERS = makeSymbol("FIND-SENTENCE-FILLERS");

    private static final SubLList $list788 = list(makeSymbol("SENTENCE"), makeSymbol("VARS"), makeSymbol("ANSWER-SETS"));

    private static final SubLList $list789 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Animal")));

    private static final SubLList $list790 = cons(makeSymbol("CYCL-SENTENCE"), makeSymbol("VAR-LIST"));

    private static final SubLSymbol GET_QUERIES_FOR_TERM = makeSymbol("GET-QUERIES-FOR-TERM");

    private static final SubLSymbol GET_QUERIES_FROM_SENTENCES = makeSymbol("GET-QUERIES-FROM-SENTENCES");

    private static final SubLSymbol TERM_LEARNER_AUTOCOMPLETE_NATIVE_WITH_CYCADMINISTRATOR = makeSymbol("TERM-LEARNER-AUTOCOMPLETE-NATIVE-WITH-CYCADMINISTRATOR");

    private static final SubLSymbol $sym794$LENGTH_ = makeSymbol("LENGTH>");

    private static final SubLList $list795 = list(list(list(makeString("mon"), TWENTY_INTEGER, makeString(""), list(reader_make_constant_shell(makeString("organismTypeFoundInClimateOfType")), makeSymbol("?ANIMAL"), reader_make_constant_shell(makeString("SunnyClimateCycle"))), list(ONE_INTEGER)), ONE_INTEGER), list(list(makeString("hor"), TWENTY_INTEGER, makeString(""), list(reader_make_constant_shell(makeString("organismTypeFoundInClimateOfType")), makeSymbol("?ANIMAL"), reader_make_constant_shell(makeString("SunnyClimateCycle"))), list(ONE_INTEGER)), ONE_INTEGER));

    private static final SubLSymbol TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE_INT = makeSymbol("TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE-INT");

    private static final SubLSymbol VALID_HIERARCHICAL_CANDIDATES_P = makeSymbol("VALID-HIERARCHICAL-CANDIDATES-P");

    private static final SubLList $list798 = list(list(list(NIL, list(reader_make_constant_shell(makeString("relationInstanceExistsRange")), reader_make_constant_shell(makeString("organismKilled")), reader_make_constant_shell(makeString("AttackOnFrenchBarracksInBeirut19831023")), reader_make_constant_shell(makeString("Person")), makeInteger(59)), list(reader_make_constant_shell(makeString("MtUnionFn")), list(reader_make_constant_shell(makeString("DocumentReaderFollowupsForInterestMtFn")), reader_make_constant_shell(makeString("Medicine-FieldOfStudy"))), list(reader_make_constant_shell(makeString("DocumentReaderFollowupsForTaskMtFn")), reader_make_constant_shell(makeString("GeneralCycKETask-Allotment"))))), T));

    private static final SubLSymbol TERM_LEARNER_TYPES_FOR_SENTENCE_ID_TEST_FN = makeSymbol("TERM-LEARNER-TYPES-FOR-SENTENCE-ID-TEST-FN");

    private static final SubLSymbol SOME_SELECTION_RENDERER_HAS_STRING_P = makeSymbol("SOME-SELECTION-RENDERER-HAS-STRING-P");

    private static final SubLList $list801 = list(list(list(list(reader_make_constant_shell(makeString("typeBehaviorIncapable")), reader_make_constant_shell(makeString("FlightlessBird")), reader_make_constant_shell(makeString("Flying-FlappingWings")), reader_make_constant_shell(makeString("doneBy"))), reader_make_constant_shell(makeString("DaveS")), makeString(""), makeString(""), makeString(""), makeString("")), makeString("fly by flapping wings")), list(list(list(reader_make_constant_shell(makeString("typeBehaviorIncapable")), reader_make_constant_shell(makeString("FlightlessBird")), reader_make_constant_shell(makeString("Flying-FlappingWings")), reader_make_constant_shell(makeString("doneBy"))), reader_make_constant_shell(makeString("DaveS")), makeString(""), makeString(""), makeString(""), makeString("")), makeString("flightless birds")));

    private static final SubLSymbol TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_NEG = makeSymbol("TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-NEG");

    private static final SubLSymbol BINDINGS_DONT_MENTION = makeSymbol("BINDINGS-DONT-MENTION");

    private static final SubLList $list804 = list(list(list(list(reader_make_constant_shell(makeString("objectFoundInLocation")), reader_make_constant_shell(makeString("CityOfAustinTX")), makeSymbol("?X")), reader_make_constant_shell(makeString("InferencePSC"))), reader_make_constant_shell(makeString("MilkyWay-Galaxy"))));

    private static final SubLSymbol BINDINGS_MENTION = makeSymbol("BINDINGS-MENTION");

    private static final SubLList $list806 = list(list(list(list(reader_make_constant_shell(makeString("objectFoundInLocation")), reader_make_constant_shell(makeString("CityOfAustinTX")), makeSymbol("?X")), reader_make_constant_shell(makeString("InferencePSC"))), reader_make_constant_shell(makeString("Texas-State"))));

    public static SubLObject new_term_learner_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl = NIL;
        SubLObject weight = NIL;
        SubLObject justifications = NIL;
        SubLObject fragment_justification = NIL;
        SubLObject nl_string = NIL;
        SubLObject assert_sentence = NIL;
        SubLObject status_code = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        weight = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        justifications = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        fragment_justification = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        nl_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        assert_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        status_code = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list4);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list4);
            if (NIL == member(current_$1, $list5, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list4);
        }
        final SubLObject renderers_tail = property_list_member($RENDERERS, current);
        final SubLObject renderers = (NIL != renderers_tail) ? cadr(renderers_tail) : NIL;
        final SubLObject original_cycl_tail = property_list_member($ORIGINAL_CYCL, current);
        final SubLObject original_cycl = (NIL != original_cycl_tail) ? cadr(original_cycl_tail) : NIL;
        final SubLObject display_tail = property_list_member($DISPLAY, current);
        final SubLObject display = (NIL != display_tail) ? cadr(display_tail) : T;
        final SubLObject required_tail = property_list_member($REQUIRED, current);
        final SubLObject required = (NIL != required_tail) ? cadr(required_tail) : T;
        final SubLObject approval_code_tail = property_list_member($APPROVAL_CODE, current);
        final SubLObject approval_code = (NIL != approval_code_tail) ? cadr(approval_code_tail) : NIL;
        final SubLObject unassertible_sentence_ids_tail = property_list_member($UNASSERTIBLE_SENTENCE_IDS, current);
        final SubLObject unassertible_sentence_ids = (NIL != unassertible_sentence_ids_tail) ? cadr(unassertible_sentence_ids_tail) : NIL;
        return list(new SubLObject[]{ NEW_TERM_LEARNER_TYPE_INT, cycl, weight, justifications, fragment_justification, nl_string, assert_sentence, status_code, renderers, original_cycl, display, required, approval_code, unassertible_sentence_ids });
    }

    public static SubLObject term_learner_type_for_fragment_int_2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sentence = NIL;
        SubLObject domain_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        domain_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list14);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list14);
            if (NIL == member(current_$2, $list15, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list14);
        }
        final SubLObject original_sentence_tail = property_list_member($ORIGINAL_SENTENCE, current);
        final SubLObject original_sentence = (NIL != original_sentence_tail) ? cadr(original_sentence_tail) : NIL;
        final SubLObject current_bindings_tail = property_list_member($CURRENT_BINDINGS, current);
        final SubLObject current_bindings = (NIL != current_bindings_tail) ? cadr(current_bindings_tail) : NIL;
        final SubLObject suggestions_tail = property_list_member($SUGGESTIONS, current);
        final SubLObject suggestions = (NIL != suggestions_tail) ? cadr(suggestions_tail) : NIL;
        final SubLObject justifications_tail = property_list_member($JUSTIFICATIONS, current);
        final SubLObject justifications = (NIL != justifications_tail) ? cadr(justifications_tail) : $DEFAULT;
        final SubLObject fragment_justification_tail = property_list_member($FRAGMENT_JUSTIFICATION, current);
        final SubLObject fragment_justification = (NIL != fragment_justification_tail) ? cadr(fragment_justification_tail) : NIL;
        final SubLObject nl_mt_tail = property_list_member($NL_MT, current);
        final SubLObject nl_mt = (NIL != nl_mt_tail) ? cadr(nl_mt_tail) : $list23;
        final SubLObject approval_code_tail = property_list_member($APPROVAL_CODE, current);
        final SubLObject approval_code = (NIL != approval_code_tail) ? cadr(approval_code_tail) : NIL;
        final SubLObject display_cycl_tail = property_list_member($DISPLAY_CYCL, current);
        final SubLObject display_cycl = (NIL != display_cycl_tail) ? cadr(display_cycl_tail) : NIL;
        final SubLObject status_tail = property_list_member($STATUS, current);
        final SubLObject status = (NIL != status_tail) ? cadr(status_tail) : NIL;
        final SubLObject clarifying_cycl_tail = property_list_member($CLARIFYING_CYCL, current);
        final SubLObject clarifying_cycl = (NIL != clarifying_cycl_tail) ? cadr(clarifying_cycl_tail) : NIL;
        return list(new SubLObject[]{ TERM_LEARNER_TYPE_FOR_FRAGMENT_INT, sentence, domain_mt, original_sentence, current_bindings, suggestions, justifications, fragment_justification, nl_mt, approval_code, display_cycl, status, clarifying_cycl });
    }

    public static SubLObject term_learner_known_meanings_for_string(final SubLObject v_term, SubLObject context_string, SubLObject app_type, SubLObject user) {
        if (context_string == UNPROVIDED) {
            context_string = NIL;
        }
        if (app_type == UNPROVIDED) {
            app_type = NIL;
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING, v_term, context_string, app_type, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING, v_term, context_string, app_type, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon(UNPROVIDED);
        final SubLObject learned_entries = methods.funcall_instance_method_with_1_args(lexicon, LEARN, unicode_nauts.convert_unicode_nauts_to_utf8_strings(v_term));
        final SubLObject entries = methods.funcall_instance_method_with_1_args(lexicon, GET, v_term);
        SubLObject result = NIL;
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject lex_entry = NIL;
        lex_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == methods.funcall_instance_method_with_1_args(lex_entry, GET, $kw35$IS_NER_ENTRY_)) {
                final SubLObject item_var = methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
                if (NIL == member(item_var, cycls, EQUAL, symbol_function(IDENTITY))) {
                    cycls = cons(item_var, cycls);
                }
            }
            final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(user, thread);
                if ((NIL == cycls) && (!app_type.equal($str37$no_new_creation))) {
                    final SubLObject type = $$Thing;
                    final SubLObject item_var2 = find_or_create_term_learner_stub_term(v_term, type);
                    if (NIL == member(item_var2, cycls, EQUAL, symbol_function(IDENTITY))) {
                        cycls = cons(item_var2, cycls);
                    }
                }
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_3, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        } 
        cdolist_list_var = entries;
        lex_entry = NIL;
        lex_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != methods.funcall_instance_method_with_1_args(lex_entry, GET, $kw35$IS_NER_ENTRY_)) {
                cure_remove_lex_entry_from_default_lexicon(lex_entry, v_term);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        } 
        cdolist_list_var = cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(new_term_learner_term_meaning(cycl, UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_4 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            rkf_macros.$rkf_asserting_tool$.bind($$CycAssistedDocumentReader, thread);
            if (NIL == result) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            SubLObject stream2 = NIL;
                            try {
                                final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream2 = compatibility.open_text($term_learner_user_created_term_log_file$.getDynamicValue(thread), $APPEND);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$4, thread);
                                }
                                if (!stream2.isStream()) {
                                    Errors.error($str31$Unable_to_open__S, $term_learner_user_created_term_log_file$.getDynamicValue(thread));
                                }
                                final SubLObject s = stream2;
                                format(s, $str42$_input_date___A___S__input___, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), v_term);
                            } finally {
                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (stream2.isStream()) {
                                        close(stream2, UNPROVIDED);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                if (!app_type.equal($str37$no_new_creation)) {
                    final SubLObject base_type = $$Thing;
                    final SubLObject base_name = (NIL != fort_types_interface.collectionP(base_type)) ? morphology.singularize_string(v_term, UNPROVIDED) : v_term;
                    final SubLObject new_constant = find_or_create_term_learner_stub_term(base_name, base_type);
                    result = cons(new_term_learner_term_meaning(new_constant, $$$Currently_Unknown_to_Cyc, UNPROVIDED), result);
                }
            }
        } finally {
            rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_4, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
        }
        return result;
    }

    public static SubLObject term_learner_create_as_individualP(final SubLObject term_string, SubLObject v_context, SubLObject app_type) {
        if (v_context == UNPROVIDED) {
            v_context = NIL;
        }
        if (app_type == UNPROVIDED) {
            app_type = NIL;
        }
        if (app_type.equalp($$$vocabMarking)) {
            return NIL;
        }
        return makeBoolean(NIL == string_likely_denotes_collectionP(term_string, v_context));
    }

    public static SubLObject term_learner_meanings_for_tagged_term(final SubLObject concept_id_list, SubLObject known, SubLObject user) {
        if (known == UNPROVIDED) {
            known = T;
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM, concept_id_list));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM, concept_id_list));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject initial_meanings = (NIL != document_annotation_widgets.$term_learner_keep_concepts_distinct$.getDynamicValue(thread)) ? Mapping.mapcar(TERM_LEARNER_OBJECT_FROM_ID, string_utilities.string_tokenize(concept_id_list, $list47, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : document_annotation_widgets.term_learner_object_from_id(concept_id_list);
        SubLObject result = NIL;
        if (NIL != known) {
            SubLObject v_term = NIL;
            SubLObject v_term_$6 = NIL;
            SubLObject string = NIL;
            SubLObject string_$7 = NIL;
            v_term = initial_meanings;
            v_term_$6 = v_term.first();
            string = term_learner_cycl_terms_to_nl_strings(initial_meanings, UNPROVIDED, UNPROVIDED);
            string_$7 = string.first();
            while ((NIL != string) || (NIL != v_term)) {
                result = cons(new_term_learner_term_meaning(v_term_$6, string_$7, UNPROVIDED), result);
                v_term = v_term.rest();
                v_term_$6 = v_term.first();
                string = string.rest();
                string_$7 = string.first();
            } 
        } else {
            final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(user, thread);
                final SubLObject infn_term = initial_meanings.first();
                final SubLObject term_string = cycl_utilities.formula_arg1(infn_term, UNPROVIDED);
                final SubLObject new_constant = find_or_create_term_learner_stub_term(term_string, $$Individual);
                result = cons(new_term_learner_term_meaning(new_constant, UNPROVIDED, UNPROVIDED), result);
                cure_remove_from_default_lexicon(infn_term, term_string);
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_3, thread);
            }
        }
        return result;
    }

    public static SubLObject find_or_create_term_learner_stub_term(final SubLObject string, final SubLObject base_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_name = (NIL != isa.isaP(base_type, $$Collection, UNPROVIDED, UNPROVIDED)) ? morphology.singularize_string(string, UNPROVIDED) : string;
        final SubLObject constant_name = constants_high.suggest_constant_name(term_name, $str50$, $str50$, $UPCASE, NIL, UNPROVIDED);
        SubLObject constant = constants_high.find_or_create_constant(constant_name, UNPROVIDED);
        final SubLObject clean_string = remove_if(CONTROL_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == term_learner_stub_constantP(constant)) {
            constant = rkf_term_utilities.rkf_create(term_name, NIL, $str50$, UNPROVIDED, UNPROVIDED);
        }
        rkf_assertion_utilities.rkf_assert(list($$inProgressTerm, constant), $$BaseKB, NIL, T);
        rkf_assertion_utilities.rkf_assert(list($$isa, constant, base_type), $$BaseKB, NIL, T);
        if (NIL != valid_constantP($$DocIngesterUserCreatedTerm, UNPROVIDED)) {
            rkf_assertion_utilities.rkf_assert(listS($$quotedIsa, constant, $list58), $$BaseKB, UNPROVIDED, UNPROVIDED);
        }
        rkf_assertion_utilities.rkf_assert(list($$termStrings, constant, clean_string), $term_learner_default_lexical_assertion_mt$.getDynamicValue(thread), T, T);
        return constant;
    }

    public static SubLObject term_learner_stub_constantP(final SubLObject v_const) {
        return makeBoolean(kb_indexing.num_index(v_const).eql(ZERO_INTEGER) || ((NIL != ask_utilities.query_boolean(list($$and, listS($$quotedIsa, v_const, $list58), list($$inProgressTerm, v_const), list($$ist_Asserted, $sym62$__MT, listS($$termStrings, v_const, $list63))), $$InferencePSC, UNPROVIDED)) && kb_indexing.num_index(v_const).numLE(FOUR_INTEGER)));
    }

    public static SubLObject new_term_learner_term_meaning(final SubLObject v_term, SubLObject string, SubLObject max_alt_strings) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (max_alt_strings == UNPROVIDED) {
            max_alt_strings = THREE_INTEGER;
        }
        final SubLObject primary_string = (NIL != string) ? string : term_learner_cycl_term_to_nl_string(v_term, UNPROVIDED).first();
        final SubLObject alt_strings = remove(primary_string, term_learner_alternative_phrases(v_term, add(ONE_INTEGER, max_alt_strings)), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject alt_strings_string = (NIL != list_utilities.lengthG(alt_strings, max_alt_strings, UNPROVIDED)) ? string_utilities.join_strings(list_utilities.snoc($str65$___, list_utilities.first_n(max_alt_strings, alt_strings)), UNPROVIDED) : string_utilities.join_strings(alt_strings, UNPROVIDED);
        return list($MEANING, v_term, primary_string, document_annotation_widgets.term_learner_id(v_term), top_level_cb_form_url(v_term), alt_strings_string);
    }

    public static SubLObject cure_remove_from_default_lexicon(final SubLObject v_term, final SubLObject delete_string) {
        final SubLObject lex = document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = instances.get_slot(lex, LEARNED);
        SubLObject learned = NIL;
        learned = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (delete_string.equal(methods.funcall_instance_method_with_1_args(learned, GET, $STRING)) && methods.funcall_instance_method_with_1_args(learned, GET, $DENOT).equal(v_term)) {
                methods.funcall_instance_method_with_2_args(lex, DELETE_ENTRY_FROM_STRING, learned, delete_string);
            }
            cdolist_list_var = cdolist_list_var.rest();
            learned = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cure_remove_lex_entry_from_default_lexicon(final SubLObject entry, final SubLObject delete_string) {
        final SubLObject lex = document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        methods.funcall_instance_method_with_2_args(lex, DELETE_ENTRY_FROM_STRING, entry, delete_string);
        return NIL;
    }

    public static SubLObject term_learner_ordered_types_for_tagged_term(final SubLObject concept_id, SubLObject user, SubLObject mt) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM, concept_id, user, mt));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM, concept_id, user, mt));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        if (NIL == mt) {
            mt = followup_query_mt_for_userXtask(user, default_task_for_user(user));
        }
        final SubLObject concept = document_annotation_widgets.term_learner_object_from_id(concept_id);
        final SubLObject type_prompt = term_learner_type_prompt(concept);
        final SubLObject task = default_task_for_user(user);
        final SubLObject nl_mt = cure_default_generation_mt(task);
        SubLObject types = NIL;
        SubLObject type_pred = NIL;
        SubLObject result = NIL;
        SubLObject current;
        final SubLObject datum = current = term_learner_term_header_string(concept, UNPROVIDED);
        SubLObject header_string = NIL;
        SubLObject alt_phrases = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        header_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        alt_phrases = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != term_learner_stub_constantP(concept)) {
                final SubLObject term_string = ask_utilities.query_variable($sym72$_STRING, list($$assertedSentence, listS($$termStrings, concept, $list74)), nl_mt, UNPROVIDED).first();
                final SubLObject possible_types = types = term_learner_get_word_denots_from_string(term_string, UNPROVIDED);
                type_pred = $$is_Underspecified;
            } else
                if (NIL != fort_types_interface.isa_collectionP(concept, UNPROVIDED)) {
                    types = term_learner_min_genls(concept, mt, UNPROVIDED);
                    type_pred = $$genls;
                } else {
                    types = term_learner_min_isa(concept, mt, UNPROVIDED);
                    type_pred = $$isa;
                }

            SubLObject cdolist_list_var = types;
            SubLObject type = NIL;
            type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assertions = term_learner_asserts_for_formula(list(type_pred, concept, type), mt);
                final SubLObject assert_sentence = list(type_pred, concept, type);
                final SubLObject clarifying_cycl = pph_disambiguation.clarification_terms_wrt(type, types, ONE_INTEGER, UNPROVIDED).first();
                final SubLObject fragment_justification = NIL;
                thread.resetMultipleValues();
                final SubLObject justifications = make_term_learner_justifications_from_asserts(assertions);
                final SubLObject removable = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = cons(term_learner_type_for_fragment_int(assert_sentence, mt, NIL, NIL, NIL, justifications, fragment_justification, nl_mt, NIL, type, NIL, clarifying_cycl, UNPROVIDED, UNPROVIDED), result);
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            } 
            result = Sort.sort(result, $sym77$_, GET_WEIGHT);
            if (NIL != type_prompt) {
                result = cons(list($TYPE_PROMPT, type_prompt), result);
            }
            if (NIL != header_string) {
                result = cons(list($TYPE_HEADER, header_string), result);
            }
            if (NIL != alt_phrases) {
                result = cons(list($TYPE_ALT_PHRASES, alt_phrases), result);
            }
            final SubLObject lexical_types = term_learner_lexical_types_for_tagged_term(concept, user, nl_mt);
            if (NIL != lexical_types) {
                result = cons(list($LEXICAL_TYPES, lexical_types), result);
            }
            return result;
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject get_taxonomic_renderers_for_term(final SubLObject v_term, final SubLObject renderer_type, final SubLObject taxonomic_type, SubLObject limit, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TAXONOMIC_RENDERERS_FOR_TERM, v_term, renderer_type, taxonomic_type, limit, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TAXONOMIC_RENDERERS_FOR_TERM, v_term, renderer_type, taxonomic_type, limit, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject terms = NIL;
        final SubLObject mt = followup_query_mt_for_userXtask(user, default_task_for_user(user));
        SubLObject renderers = NIL;
        if (limit.eql(MINUS_ONE_INTEGER)) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        if (taxonomic_type.equalp($$$specs)) {
            terms = term_learner_max_specs(v_term, mt, limit);
        } else
            if (taxonomic_type.equalp($$$instances)) {
                terms = term_learner_max_instances(v_term, mt, limit);
            } else
                if (taxonomic_type.equalp($$$superiors) && (NIL != fort_types_interface.collection_p(v_term))) {
                    terms = term_learner_min_genls(v_term, mt, limit);
                } else
                    if (taxonomic_type.equalp($$$superiors) && (NIL == fort_types_interface.collection_p(v_term))) {
                        terms = term_learner_min_isa(v_term, mt, limit);
                    } else
                        if (taxonomic_type.equalp($$$genls)) {
                            terms = term_learner_min_genls(v_term, mt, limit);
                        } else
                            if (taxonomic_type.equalp($$$isa)) {
                                terms = term_learner_min_isa(v_term, mt, limit);
                            } else {
                                Errors.warn($str89$Unimplemented_attempt_to_get__S_f, taxonomic_type, v_term);
                            }





        SubLObject cdolist_list_var = terms;
        SubLObject v_term_$8 = NIL;
        v_term_$8 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($$$string.equal(renderer_type)) {
                renderers = cconcatenate(get_term_learner_string_renderer_for_cycl(v_term_$8), renderers);
            } else {
                renderers = cconcatenate(get_term_learner_renderer_for_cycl(v_term_$8), renderers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term_$8 = cdolist_list_var.first();
        } 
        return nreverse(renderers);
    }

    public static SubLObject term_learner_min_genls(final SubLObject v_term, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return term_learner_min_genls_int(v_term, limit, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject term_learner_min_genls_int(final SubLObject v_term, final SubLObject limit, SubLObject already_seen) {
        if (already_seen == UNPROVIDED) {
            already_seen = NIL;
        }
        final SubLObject v_genls = genls.min_genls(v_term, UNPROVIDED, UNPROVIDED);
        SubLObject new_genls = set_difference(v_genls, already_seen, UNPROVIDED, UNPROVIDED);
        SubLObject irrelevant = list_utilities.find_all_if_not($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_genls, UNPROVIDED);
        SubLObject relevant = set_difference(new_genls, irrelevant, UNPROVIDED, UNPROVIDED);
        final SubLObject redundant = makeBoolean((NIL != list_utilities.lengthE(new_genls, ONE_INTEGER, UNPROVIDED)) && (NIL != genls.genlsP(new_genls.first(), v_term, UNPROVIDED, UNPROVIDED)));
        if (NIL != redundant) {
            new_genls = genls.min_genls_among(v_term, set_difference(genls.asserted_genls(v_term, UNPROVIDED), cons(v_term, new_genls), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            irrelevant = list_utilities.find_all_if_not($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_genls, UNPROVIDED);
            final SubLObject items_var = set_difference(new_genls, irrelevant, UNPROVIDED, UNPROVIDED);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item_var;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = item_var = aref(vector_var, element_num);
                    if (NIL == member(item_var, relevant, symbol_function(EQL), symbol_function(IDENTITY))) {
                        relevant = cons(item_var, relevant);
                    }
                }
            } else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var2 = item2;
                    if (NIL == member(item_var2, relevant, symbol_function(EQL), symbol_function(IDENTITY))) {
                        relevant = cons(item_var2, relevant);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
        }
        final SubLObject items_var = relevant;
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
                already_seen = cons(item, already_seen);
            }
        } else {
            SubLObject cdolist_list_var = items_var;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                already_seen = cons(item2, already_seen);
                cdolist_list_var = cdolist_list_var.rest();
                item2 = cdolist_list_var.first();
            } 
        }
        if (NIL == list_utilities.lengthGE(relevant, limit, UNPROVIDED)) {
            SubLObject cdolist_list_var2 = irrelevant;
            SubLObject irrel = NIL;
            irrel = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!$$Thing.eql(irrel)) {
                    SubLObject cdolist_list_var_$9 = term_learner_min_genls_int(irrel, limit, already_seen);
                    SubLObject genl = NIL;
                    genl = cdolist_list_var_$9.first();
                    while (NIL != cdolist_list_var_$9) {
                        if (NIL == genls.any_specP(genl, relevant, UNPROVIDED, UNPROVIDED)) {
                            relevant = cons(genl, relevant);
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        genl = cdolist_list_var_$9.first();
                    } 
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                irrel = cdolist_list_var2.first();
            } 
        }
        return list_utilities.first_n(limit, nreverse(relevant));
    }

    public static SubLObject term_learner_min_isa(final SubLObject v_term, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isas = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            isas = term_learner_min_isa_int(v_term, limit);
            isas = list_utilities.remove_subsumed_items(isas, $sym93$GENLS_, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return isas;
    }

    public static SubLObject term_learner_min_isa_int(final SubLObject v_term, final SubLObject limit) {
        SubLObject isas = isa.min_isa(v_term, UNPROVIDED, UNPROVIDED);
        final SubLObject irrelevant = list_utilities.find_all_if_not($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, isas, UNPROVIDED);
        isas = set_difference(isas, irrelevant, UNPROVIDED, UNPROVIDED);
        if (NIL == list_utilities.lengthGE(isas, limit, UNPROVIDED)) {
            SubLObject cdolist_list_var = remove($$Thing, irrelevant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject irrel = NIL;
            irrel = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject items_var = term_learner_min_genls_int(irrel, $most_positive_fixnum$.getGlobalValue(), UNPROVIDED);
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
                        isas = cons(item, isas);
                    }
                } else {
                    SubLObject cdolist_list_var_$10 = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        isas = cons(item2, isas);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        item2 = cdolist_list_var_$10.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                irrel = cdolist_list_var.first();
            } 
        }
        isas = list_utilities.remove_subsumed_items(isas, $sym93$GENLS_, UNPROVIDED);
        return list_utilities.first_n(limit, isas);
    }

    public static SubLObject term_learner_max_specs(final SubLObject v_term, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (limit.eql(MINUS_ONE_INTEGER)) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return term_learner_max_specs_int(v_term, limit, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject term_learner_max_specs_int(final SubLObject v_term, final SubLObject limit, SubLObject already_seen) {
        if (already_seen == UNPROVIDED) {
            already_seen = NIL;
        }
        final SubLObject specs = genls.max_specs(v_term, UNPROVIDED, UNPROVIDED);
        SubLObject new_specs = set_difference(specs, already_seen, UNPROVIDED, UNPROVIDED);
        SubLObject irrelevant = list_utilities.find_all_if_not($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_specs, UNPROVIDED);
        SubLObject relevant = set_difference(new_specs, irrelevant, UNPROVIDED, UNPROVIDED);
        final SubLObject redundant = makeBoolean((NIL != list_utilities.lengthE(new_specs, ONE_INTEGER, UNPROVIDED)) && (NIL != genls.genlsP(v_term, new_specs.first(), UNPROVIDED, UNPROVIDED)));
        if (NIL != redundant) {
            new_specs = genls.max_specs_among(v_term, set_difference(genls.asserted_specs(v_term, UNPROVIDED), cons(v_term, new_specs), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            irrelevant = list_utilities.find_all_if_not($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_specs, UNPROVIDED);
            final SubLObject items_var = set_difference(new_specs, irrelevant, UNPROVIDED, UNPROVIDED);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item_var;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = item_var = aref(vector_var, element_num);
                    if (NIL == member(item_var, relevant, symbol_function(EQL), symbol_function(IDENTITY))) {
                        relevant = cons(item_var, relevant);
                    }
                }
            } else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var2 = item2;
                    if (NIL == member(item_var2, relevant, symbol_function(EQL), symbol_function(IDENTITY))) {
                        relevant = cons(item_var2, relevant);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
        }
        if (NIL == list_utilities.lengthGE(relevant, limit, UNPROVIDED)) {
            SubLObject cdolist_list_var2 = irrelevant;
            SubLObject irrel = NIL;
            irrel = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$11 = term_learner_max_specs_int(irrel, limit, already_seen);
                SubLObject spec = NIL;
                spec = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    if (NIL == genls.any_genlP(spec, relevant, UNPROVIDED, UNPROVIDED)) {
                        relevant = cons(spec, relevant);
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    spec = cdolist_list_var_$11.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                irrel = cdolist_list_var2.first();
            } 
        }
        return list_utilities.first_n(limit, nreverse(relevant));
    }

    public static SubLObject term_learner_max_instances(final SubLObject v_term, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_instances = NIL;
        if (limit.eql(MINUS_ONE_INTEGER)) {
            limit = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            v_instances = term_learner_max_instances_int(v_term, limit);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.first_n(limit, v_instances);
    }

    public static SubLObject term_learner_max_instances_int(final SubLObject v_term, final SubLObject limit) {
        final SubLObject v_instances = isa.instances(v_term, UNPROVIDED, UNPROVIDED);
        final SubLObject irrelevant = list_utilities.find_all_if_not($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, v_instances, UNPROVIDED);
        final SubLObject relevant_instances = set_difference(v_instances, irrelevant, UNPROVIDED, UNPROVIDED);
        SubLObject max_instances = NIL;
        SubLObject other_instances = NIL;
        if (NIL != list_utilities.lengthLE(relevant_instances, limit, UNPROVIDED)) {
            return relevant_instances;
        }
        SubLObject cdolist_list_var = relevant_instances;
        SubLObject instance = NIL;
        instance = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(v_term, isa.min_isa(v_instances, UNPROVIDED, UNPROVIDED), EQUAL, UNPROVIDED)) {
                max_instances = cons(instance, max_instances);
            } else {
                other_instances = cons(instance, other_instances);
            }
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthGE(max_instances, limit, UNPROVIDED)) {
            return list_utilities.first_n(limit, max_instances);
        }
        final SubLObject num_other_needed = subtract(limit, length(max_instances));
        return cconcatenate(max_instances, list_utilities.first_n(num_other_needed, other_instances));
    }

    public static SubLObject term_learner_asserts_for_formula(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_asserts = kb_indexing.find_all_gafs(formula);
        SubLObject relevant_asserts = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = raw_asserts;
            SubLObject v_assert = NIL;
            v_assert = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(v_assert))) {
                    relevant_asserts = cons(v_assert, relevant_asserts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_assert = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return relevant_asserts;
    }

    public static SubLObject make_term_learner_justifications_from_asserts(final SubLObject asserts) {
        SubLObject justifications = NIL;
        SubLObject removable = T;
        SubLObject cdolist_list_var = asserts;
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject just = list($ASSERT_SENTENCE, document_annotation_widgets.term_learner_id(uncanonicalizer.assertion_el_formula(v_assert)), $ASSERT_MT, document_annotation_widgets.term_learner_id(assertions_high.assertion_mt(v_assert)));
            if ((NIL == assertions_high.asserted_assertionP(v_assert)) || (NIL != tms.independently_deducible_assertionP(v_assert))) {
                removable = NIL;
            }
            justifications = cons(just, justifications);
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        } 
        return values(justifications, removable);
    }

    public static SubLObject term_learner_lexical_types_for_tagged_term(final SubLObject v_term, SubLObject user, SubLObject lexical_mt) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lexical_types = NIL;
        SubLObject sentence = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_learner_lexical_assertions_for_term(v_term, lexical_mt))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject assert_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != list_utilities.lengthG(assert_list, ONE_INTEGER, UNPROVIDED)) {
                sentence = assertions_high.assertion_ist_formula(assert_list.first());
            } else {
                sentence = simplifier.conjoin(Mapping.mapcar(ASSERTION_IST_FORMULA, assert_list), UNPROVIDED);
            }
            final SubLObject justifications = list(new_term_learner_justification(string, $str50$, $USER, NIL, document_annotation_widgets.term_learner_id(lexical_mt)));
            final SubLObject fragment_justification = NIL;
            final SubLObject default_weight = $float$0_9;
            final SubLObject status = term_learner_fact_status_int(sentence, lexical_mt, user).first();
            final SubLObject renderers = list(new_term_learner_string_renderer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            lexical_types = cons(new_term_learner_type_int(sentence, default_weight, justifications, fragment_justification, string, sentence, status, renderers, NIL, T, T, NIL, NIL), lexical_types);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return lexical_types;
    }

    public static SubLObject term_learner_lexical_assertions_for_term(final SubLObject v_term, final SubLObject lexical_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filtered_assertions = dictionary.new_dictionary(EQUALP, UNPROVIDED);
        final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lexicon_vars.$exclude_indirect_relationsP$.currentBinding(thread);
        try {
            lexicon_vars.$exclude_vulgaritiesP$.bind(subl_promotions.memberP($sym99$_EXCLUDE_VULGARITIES__, $list100, UNPROVIDED, UNPROVIDED), thread);
            lexicon_vars.$exclude_slangP$.bind(subl_promotions.memberP($sym101$_EXCLUDE_SLANG__, $list100, UNPROVIDED, UNPROVIDED), thread);
            lexicon_vars.$exclude_archaic_speechP$.bind(subl_promotions.memberP($sym102$_EXCLUDE_ARCHAIC_SPEECH__, $list100, UNPROVIDED, UNPROVIDED), thread);
            lexicon_vars.$exclude_indirect_relationsP$.bind(subl_promotions.memberP($sym103$_EXCLUDE_INDIRECT_RELATIONS__, $list100, UNPROVIDED, UNPROVIDED), thread);
            SubLObject cdolist_list_var = lexicon_utilities.all_lexifications_for_term(v_term);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL != lexicon_utilities.denot_formula_p(uncanonicalizer.assertion_el_formula(assertion))) && (NIL != lexicon_accessors.genl_lexicon_mtP(lexical_mt, assertions_high.assertion_mt(assertion)))) && (NIL == lexicon_accessors.inappropriate_lexical_assertionP(assertion))) {
                    final SubLObject phrases = lexification_utilities.phrases_from_semantic_assertion(assertion, UNPROVIDED);
                    if ((NIL != phrases) && (!phrases.equal(list(NIL)))) {
                        dictionary_utilities.dictionary_push(filtered_assertions, string_utilities.join_strings(Sort.sort(phrases, SHORTER_P, UNPROVIDED), UNPROVIDED), assertion);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$exclude_indirect_relationsP$.rebind(_prev_bind_4, thread);
            lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_3, thread);
            lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2, thread);
            lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
        }
        return filtered_assertions;
    }

    public static SubLObject term_learner_ordered_types_for_term_in_document_string_merged_justifications(final SubLObject doc_string, final SubLObject v_term, final SubLObject placeholderP, SubLObject lookup_onlyP) {
        if (lookup_onlyP == UNPROVIDED) {
            lookup_onlyP = $term_learner_use_lexical_lookup_only$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list($sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS, doc_string, v_term, placeholderP));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list($sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS, doc_string, v_term, placeholderP));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject ascii_doc_string = string_utilities.string_substitute($$$_, $str107$_, unicode_strings.display_to_subl_string(doc_string, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject ascii_term_string = string_utilities.string_substitute($$$_, $str107$_, unicode_strings.display_to_subl_string(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject _prev_bind_3 = psp_chart.$psp_use_term_lexiconP$.currentBinding(thread);
        try {
            psp_chart.$psp_use_term_lexiconP$.bind(NIL, thread);
            result = term_learner_ordered_types_for_term_in_document_string(ascii_doc_string, ascii_term_string, placeholderP, lookup_onlyP, UNPROVIDED);
        } finally {
            psp_chart.$psp_use_term_lexiconP$.rebind(_prev_bind_3, thread);
        }
        return merge_justifications_for_ordered_types(result);
    }

    public static SubLObject term_learner_ordered_types_for_user_added_type(final SubLObject term_string, final SubLObject existing_term_id, final SubLObject app_type, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE, term_string, existing_term_id, app_type, user, task));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE, term_string, existing_term_id, app_type, user, task));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        if (NIL == task) {
            task = default_task_for_user(user);
        }
        SubLObject lex_entries = NIL;
        final SubLObject _prev_bind_0 = psp_chart.$psp_use_term_lexiconP$.currentBinding(thread);
        try {
            psp_chart.$psp_use_term_lexiconP$.bind(NIL, thread);
            lex_entries = methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_annotation_lexicon(UNPROVIDED), GET, term_string);
        } finally {
            psp_chart.$psp_use_term_lexiconP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject existing_term = document_annotation_widgets.term_learner_object_from_id(existing_term_id);
        final SubLObject cycls = term_lexicon.denots_for_term_lexicon_entries(lex_entries);
        final SubLObject query_mt = query_mt_for_user_and_task(user, task);
        final SubLObject followup_mt = followup_query_mt_for_userXtask(user, task);
        SubLObject answers = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream2 = NIL;
                    try {
                        final SubLObject _prev_bind_0_$12 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream2 = compatibility.open_text($term_learner_user_added_types_log_file$.getDynamicValue(thread), $APPEND);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$12, thread);
                        }
                        if (!stream2.isStream()) {
                            Errors.error($str31$Unable_to_open__S, $term_learner_user_added_types_log_file$.getDynamicValue(thread));
                        }
                        final SubLObject s = stream2;
                        format(s, $str109$_input_cyctermid___A__date___A___, new SubLObject[]{ kb_utilities.compact_hl_external_id_string(existing_term), numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), term_string });
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (stream2.isStream()) {
                                close(stream2, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_3, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_genls = term_learner_isa_or_genls(existing_term, cycl, app_type, followup_mt);
            final SubLObject cycl_sentence = list(isa_genls, existing_term, cycl);
            final SubLObject clarifying_term = pph_disambiguation.clarification_terms_wrt(cycl, cycls, ONE_INTEGER, query_mt).first();
            final SubLObject justifications = list(new_term_learner_justification(term_string, $str50$, $USER, UNPROVIDED, UNPROVIDED));
            answers = cons(term_learner_type_for_fragment_int(cycl_sentence, query_mt, NIL, NIL, NIL, justifications, NIL, cure_default_generation_mt(UNPROVIDED), NIL, cycl, NIL, clarifying_term, UNPROVIDED, UNPROVIDED), answers);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return answers;
    }

    public static SubLObject term_learner_isa_or_genls(final SubLObject existing_term, final SubLObject new_possible_type, SubLObject app_type, SubLObject mt) {
        if (app_type == UNPROVIDED) {
            app_type = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != isa.isaP(new_possible_type, $$CollectionType, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(existing_term, $$Collection, UNPROVIDED, UNPROVIDED))) {
                pred = $$isa;
            } else
                if (NIL != isa.isaP(existing_term, $$Collection, UNPROVIDED, UNPROVIDED)) {
                    pred = $$genls;
                } else
                    if (NIL != isa.isaP(existing_term, $$Individual, UNPROVIDED, UNPROVIDED)) {
                        pred = $$isa;
                    } else
                        if (NIL != default_create_as_type(new_possible_type, mt)) {
                            pred = default_create_as_type(new_possible_type, UNPROVIDED);
                        } else
                            if (app_type.equalp($$$vocabMarking)) {
                                pred = $$genls;
                            } else {
                                pred = $$isa;
                            }




        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pred;
    }

    public static SubLObject clear_default_create_as_type() {
        final SubLObject cs = $default_create_as_type_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_default_create_as_type(final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args($default_create_as_type_caching_state$.getGlobalValue(), list(type, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject default_create_as_type_internal(final SubLObject type, final SubLObject mt) {
        return ask_utilities.query_variable($sym112$_PRED, listS($$defaultAutotypeSuggestionFromType, type, $list114), mt, $list115).first();
    }

    public static SubLObject default_create_as_type(final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject caching_state = $default_create_as_type_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DEFAULT_CREATE_AS_TYPE, $default_create_as_type_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (type.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(default_create_as_type_internal(type, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(type, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject new_term_learner_type_int(final SubLObject cycl, final SubLObject weight, final SubLObject justifications, final SubLObject fragment_justification, final SubLObject nl_string, final SubLObject assert_sentence, final SubLObject status_code, SubLObject renderers, SubLObject original_cycl, SubLObject display, SubLObject required, SubLObject approval_code, SubLObject unassertible_sentence_ids) {
        if (renderers == UNPROVIDED) {
            renderers = NIL;
        }
        if (original_cycl == UNPROVIDED) {
            original_cycl = NIL;
        }
        if (display == UNPROVIDED) {
            display = T;
        }
        if (required == UNPROVIDED) {
            required = T;
        }
        if (approval_code == UNPROVIDED) {
            approval_code = NIL;
        }
        if (unassertible_sentence_ids == UNPROVIDED) {
            unassertible_sentence_ids = $str50$;
        }
        if (NIL == unassertible_sentence_ids) {
            unassertible_sentence_ids = $str50$;
        }
        final SubLObject concept_id = document_annotation_widgets.term_learner_id(cycl);
        final SubLObject legend_string = get_legend_string_from_justifications(justifications);
        SubLObject term_learner_type = list(new SubLObject[]{ $CYCL, cycl, $WEIGHT, weight, $JUSTIFICATIONS, justifications, $FRAGMENT_JUSTIFICATION, fragment_justification, $CONCEPT_ID, concept_id, $NL_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(nl_string), $LEGEND_STRING, legend_string, $ASSERT_SENTENCE, assert_sentence, $ASSERT_SENTENCE_ID, kb_utilities.compact_hl_external_id_string(assert_sentence), $STATUS_CODE, status_code, $REQUIRED, required, $DISPLAY, display, $UNASSERTIBLE_SENTENCE_IDS, unassertible_sentence_ids });
        if (NIL != approval_code) {
            term_learner_type = putf(term_learner_type, $APPROVAL_CODE, approval_code);
        }
        if (NIL != renderers) {
            term_learner_type = putf(term_learner_type, $RENDERERS, renderers);
        }
        if (NIL != legend_string) {
            term_learner_type = putf(term_learner_type, $LEGEND_STRING, legend_string);
        }
        if (NIL != original_cycl) {
            term_learner_type = putf(term_learner_type, $REPLICATION_SENTENCE_ID, document_annotation_widgets.term_learner_id(free_some_variables(assert_sentence)));
        }
        return term_learner_type;
    }

    public static SubLObject free_some_variables(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $allow_changes_to_focal_term_on_replicate$.getDynamicValue(thread)) {
            return sentence;
        }
        SubLObject cdolist_list_var = cycl_utilities.formula_args(sentence, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == cycl_grammar.cycl_variable_p(arg)) && (NIL == fort_types_interface.predicate_p(arg))) {
                sentence = cycl_utilities.expression_subst(czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED), arg, sentence, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static SubLObject get_term_learner_renderer_for_cycl_string(final SubLObject term_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING, term_string));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING, term_string));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject v_term = eval(read_from_string(web_utilities.html_url_decode(term_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return get_term_learner_renderer_for_cycl(v_term);
    }

    public static SubLObject get_term_learner_renderer_for_cycl_id(final SubLObject term_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID, term_id));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID, term_id));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject v_term = document_annotation_widgets.term_learner_object_from_id(term_id);
        return get_term_learner_renderer_for_cycl(v_term);
    }

    public static SubLObject get_term_learner_renderer_for_cycl(final SubLObject v_term) {
        final SubLObject nl = pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject constraints = (NIL != fort_types_interface.collectionP(v_term)) ? $list128 : $list129;
        return list(new_term_learner_open_select_renderer(NIL, list(list(nl, v_term, T)), v_term, constraints, UNPROVIDED));
    }

    public static SubLObject get_term_learner_string_renderer_for_cycl_string(final SubLObject v_cycl_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING, v_cycl_string));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING, v_cycl_string));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject v_term = eval(read_from_string(web_utilities.html_url_decode(v_cycl_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return get_term_learner_string_renderer_for_cycl(v_term);
    }

    public static SubLObject get_term_learner_string_renderer_for_cycl_id(final SubLObject term_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID, term_id));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID, term_id));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject v_term = document_annotation_widgets.term_learner_object_from_id(term_id);
        return get_term_learner_string_renderer_for_cycl(v_term);
    }

    public static SubLObject get_term_learner_string_renderer_for_cycl(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL, v_term));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL, v_term));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject nl = pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject constraints = (NIL != fort_types_interface.collectionP(v_term)) ? $list128 : $list129;
        return list(new_term_learner_string_renderer(nl, v_term, $DEFAULT, constraints));
    }

    public static SubLObject get_term_learner_string_renderer_from_open_select_renderer_list(final SubLObject renderers) {
        SubLObject cdolist_list_var = renderers;
        SubLObject renderer = NIL;
        renderer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (getf(renderer, $RENDERER_TYPE, UNPROVIDED) == $OPEN_SELECT_RENDERER) {
                SubLObject v_term = NIL;
                if (NIL == v_term) {
                    SubLObject csome_list_var = getf(renderer, $SELECTION_RENDERERS, UNPROVIDED);
                    SubLObject selection_renderer = NIL;
                    selection_renderer = csome_list_var.first();
                    while ((NIL == v_term) && (NIL != csome_list_var)) {
                        if (NIL != getf(selection_renderer, $INITIALLY_SELECTED, UNPROVIDED)) {
                            v_term = getf(selection_renderer, $CYCL, UNPROVIDED);
                        }
                        csome_list_var = csome_list_var.rest();
                        selection_renderer = csome_list_var.first();
                    } 
                }
                if (NIL != v_term) {
                    return get_term_learner_string_renderer_for_cycl(v_term);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            renderer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject new_term_learner_string_renderer(final SubLObject string, SubLObject cycl, SubLObject display_linkP, SubLObject arg_constraints) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (display_linkP == UNPROVIDED) {
            display_linkP = $DEFAULT;
        }
        if (arg_constraints == UNPROVIDED) {
            arg_constraints = NIL;
        }
        SubLObject result = list($RENDERER_TYPE, $STRING_RENDERER, $STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(string));
        if (display_linkP == $DEFAULT) {
            display_linkP = makeBoolean((NIL != forts.fort_p(cycl)) && (NIL == kb_accessors.relation_in_any_mtP(cycl)));
        }
        if (NIL != display_linkP) {
            result = putf(result, $DISPLAY_LINK, T);
        }
        if ((NIL != cycl) && (!cycl.equal($PPH_EMPTY_CYCL))) {
            result = putf(result, $CONCEPT_ID, document_annotation_widgets.term_learner_id(cycl));
            result = putf(result, $CYCL, cycl);
        }
        if (NIL != getf(arg_constraints, $GENLS, UNPROVIDED)) {
            result = putf(result, $GENLS_CONSTRAINTS, cyc_terms_to_term_learner_terms(getf(arg_constraints, $GENLS, UNPROVIDED)));
        }
        if (NIL != getf(arg_constraints, $ISA, UNPROVIDED)) {
            result = putf(result, $ISA_CONSTRAINTS, cyc_terms_to_term_learner_terms(getf(arg_constraints, $ISA, UNPROVIDED)));
        }
        return result;
    }

    public static SubLObject new_term_learner_modifiable_string_renderer(final SubLObject string, final SubLObject arg_pos) {
        return list($RENDERER_TYPE, $MODIFIABLE_STRING_RENDERER, $STRING, string, $ARG_POS, arg_pos);
    }

    public static SubLObject new_term_learner_modifiable_text_renderer(final SubLObject string, final SubLObject arg_pos) {
        return list($RENDERER_TYPE, $MODIFIABLE_TEXT_RENDERER, $STRING, string, $ARG_POS, arg_pos);
    }

    public static SubLObject new_term_learner_open_select_renderer(final SubLObject arg_pos, final SubLObject nl_cycl_valid_triples, SubLObject selected_cycl, SubLObject arg_constraints, SubLObject allow_duplicationP) {
        if (selected_cycl == UNPROVIDED) {
            selected_cycl = NIL;
        }
        if (arg_constraints == UNPROVIDED) {
            arg_constraints = NIL;
        }
        if (allow_duplicationP == UNPROVIDED) {
            allow_duplicationP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_value = list($RENDERER_TYPE, $OPEN_SELECT_RENDERER);
        final SubLObject constraint_nl = arg_constraint_string(arg_constraints);
        if (NIL != arg_pos) {
            ret_value = putf(ret_value, $ARG_POS, arg_pos);
        }
        thread.resetMultipleValues();
        SubLObject renderers = new_term_learner_open_select_renderer_int(nl_cycl_valid_triples, selected_cycl);
        final SubLObject new_entry_box_added = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == new_entry_box_added) {
            if (NIL != renderers) {
                final SubLObject new_cons = cons(listS($STRING, NIL != constraint_nl ? cconcatenate($$$Some_other_, constraint_nl) : $$$Something_else, $list150), NIL);
                final SubLObject list = renderers;
                if (NIL != list) {
                    subl_macros.rplacd_last(list, new_cons);
                } else {
                    renderers = new_cons;
                }
            } else {
                final SubLObject new_cons = cons(listS($STRING, NIL != constraint_nl ? constraint_nl : $str50$, $list150), NIL);
                final SubLObject list = renderers;
                if (NIL != list) {
                    subl_macros.rplacd_last(list, new_cons);
                } else {
                    renderers = new_cons;
                }
            }
        }
        ret_value = putf(ret_value, $SELECTION_RENDERERS, renderers);
        if (NIL != getf(arg_constraints, $GENLS, UNPROVIDED)) {
            ret_value = putf(ret_value, $GENLS_CONSTRAINTS, cyc_terms_to_term_learner_terms(getf(arg_constraints, $GENLS, UNPROVIDED)));
        }
        if (NIL != getf(arg_constraints, $ISA, UNPROVIDED)) {
            ret_value = putf(ret_value, $ISA_CONSTRAINTS, cyc_terms_to_term_learner_terms(getf(arg_constraints, $ISA, UNPROVIDED)));
        }
        if (NIL != constraint_nl) {
            ret_value = putf(ret_value, $CONSTRAINT_STRING, constraint_nl);
        }
        if (NIL != allow_duplicationP) {
            ret_value = putf(ret_value, $ALLOW_DUPLICATION, T);
        }
        return ret_value;
    }

    public static SubLObject arg_constraint_string(final SubLObject arg_constraints) {
        final SubLObject genls_constraints = getf(arg_constraints, $GENLS, UNPROVIDED);
        final SubLObject isa_constraints = getf(arg_constraints, $ISA, UNPROVIDED);
        final SubLObject sorted_constraints = Sort.sort(cconcatenate(isa_constraints, genls_constraints), $sym153$_, GENERALITY_ESTIMATE);
        SubLObject min_constraint = NIL;
        min_constraint = list_utilities.first_n_if(ONE_INTEGER, $sym155$THCL_FORT_, sorted_constraints, UNPROVIDED).first();
        if (NIL == min_constraint) {
            min_constraint = sorted_constraints.first();
        }
        if (NIL != min_constraint) {
            return pph_main.generate_phrase(min_constraint, $list156, NIL, cure_default_generation_mt(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject new_term_learner_open_select_renderer_int(final SubLObject triple_list, SubLObject selected_cycl) {
        if (selected_cycl == UNPROVIDED) {
            selected_cycl = NIL;
        }
        SubLObject renderers = NIL;
        SubLObject new_entry_box_added = NIL;
        SubLObject initial_selection_done = NIL;
        SubLObject cdolist_list_var = triple_list;
        SubLObject list_elt = NIL;
        list_elt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (list_elt.first() == $TEXT_MATCHES) {
                renderers = cons(list($TEXT_MATCHES, second(list_elt), new_term_learner_open_select_renderer_int(third(list_elt), UNPROVIDED)), renderers);
            } else {
                SubLObject current;
                final SubLObject datum = current = list_elt;
                SubLObject nl = NIL;
                SubLObject cycl = NIL;
                SubLObject valid = NIL;
                destructuring_bind_must_consp(current, datum, $list158);
                nl = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list158);
                cycl = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list158);
                valid = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject renderer = list($STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(nl), $VALID, valid);
                    if (NIL == cycl) {
                        renderer = putf(renderer, $CYCL, $$$newValue);
                        renderer = putf(renderer, $CYCL_ID, $$$newValue);
                        new_entry_box_added = T;
                    } else
                        if (NIL != cycl) {
                            renderer = putf(renderer, $CYCL_ID, document_annotation_widgets.term_learner_id(cycl));
                            renderer = putf(renderer, $CYCL, cycl);
                        }

                    if ((NIL == initial_selection_done) && cycl.eql(selected_cycl)) {
                        renderer = putf(renderer, $INITIALLY_SELECTED, T);
                        initial_selection_done = T;
                    }
                    renderers = cons(renderer, renderers);
                } else {
                    cdestructuring_bind_error(datum, $list158);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            list_elt = cdolist_list_var.first();
        } 
        return values(nreverse(renderers), new_entry_box_added);
    }

    public static SubLObject get_legend_string_from_justifications(final SubLObject justifications) {
        SubLObject legend_string = NIL;
        if (NIL == legend_string) {
            SubLObject csome_list_var;
            SubLObject justification;
            for (csome_list_var = justifications, justification = NIL, justification = csome_list_var.first(); (NIL == legend_string) && (NIL != csome_list_var); legend_string = term_learner_justification_string(justification) , csome_list_var = csome_list_var.rest() , justification = csome_list_var.first()) {
            }
        }
        return legend_string;
    }

    public static SubLObject new_term_learner_single_justification_type(final SubLObject cycl, final SubLObject weight, final SubLObject justification, final SubLObject nl_string, final SubLObject assert_sentence, final SubLObject status_code, SubLObject displayP, SubLObject requiredP, SubLObject selectedP) {
        if (displayP == UNPROVIDED) {
            displayP = T;
        }
        if (requiredP == UNPROVIDED) {
            requiredP = T;
        }
        if (selectedP == UNPROVIDED) {
            selectedP = NIL;
        }
        final SubLObject concept_id = document_annotation_widgets.term_learner_id(cycl);
        return list(new SubLObject[]{ $CYCL, cycl, $WEIGHT, weight, $JUSTIFICATION, justification, $CONCEPT_ID, concept_id, $NL_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(nl_string), $ASSERT_SENTENCE_ID, document_annotation_widgets.term_learner_id(assert_sentence), $STATUS_CODE, status_code, $DISPLAY, displayP, $REQUIRED, requiredP, $INITIALLY_SELECTED, selectedP });
    }

    public static SubLObject term_learner_add_lexical_phrase(final SubLObject phrase_string, final SubLObject term_id, SubLObject original_string, SubLObject document_url, SubLObject doc_title, SubLObject user, SubLObject lexical_mt) {
        if (original_string == UNPROVIDED) {
            original_string = NIL;
        }
        if (document_url == UNPROVIDED) {
            document_url = NIL;
        }
        if (doc_title == UNPROVIDED) {
            doc_title = NIL;
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_ADD_LEXICAL_PHRASE, phrase_string, term_id, original_string, document_url, user, lexical_mt));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_ADD_LEXICAL_PHRASE, phrase_string, term_id, original_string, document_url, user, lexical_mt));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject v_term = document_annotation_widgets.term_learner_object_from_id(term_id);
        final SubLObject lexical_justifications = list(new_term_learner_justification(phrase_string, $str50$, $USER, NIL, document_annotation_widgets.term_learner_id(lexical_mt)));
        final SubLObject fragment_justification = NIL;
        final SubLObject default_weight = $float$0_9;
        SubLObject result = NIL;
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $current_tl_task$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            $current_tl_task$.bind(default_task_for_user(user), thread);
            final SubLObject domain_mt = query_mt_for_task($current_tl_task$.getDynamicValue(thread));
            final SubLObject lexical_formula = auto_lexifier.auto_lexify(phrase_string, v_term, lexical_mt, domain_mt).first();
            final SubLObject renderers = list(new_term_learner_string_renderer(phrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != result) {
                result = cons(new_term_learner_type_int(lexical_formula, default_weight, lexical_justifications, fragment_justification, phrase_string, lexical_formula, $term_learner_unknown_assertible$.getGlobalValue(), renderers, NIL, T, T, NIL, NIL), result);
            } else {
                term_learner_assert_lexical_info(v_term, phrase_string, domain_mt, lexical_mt, lexical_formula);
                result = cons(new_term_learner_type_int(lexical_formula, default_weight, lexical_justifications, fragment_justification, phrase_string, lexical_formula, $term_learner_known_removable$.getGlobalValue(), renderers, NIL, T, T, NIL, NIL), result);
            }
        } finally {
            $current_tl_task$.rebind(_prev_bind_3, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
        }
        return result;
    }

    public static SubLObject xml_term_learner_user_choice(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject command = string_to_user_action_keyword(html_extract_input($$$userAction, args));
        final SubLObject term_string = html_extract_input($$$termString, args);
        final SubLObject choice_id = string_utilities.trim_whitespace(web_utilities.html_url_decode(html_extract_input($$$choiceid, args)));
        final SubLObject substitutions = get_substitutions_from_args(args);
        final SubLObject justifications = read_from_string_ignoring_errors(html_extract_input($$$justifications, args), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sentence_id_string = html_extract_input($$$sentenceId, args);
        final SubLObject term_id = string_utilities.trim_whitespace(html_extract_input($$$termId, args));
        final SubLObject title = string_utilities.trim_whitespace(html_extract_input($$$title, args));
        final SubLObject url = web_utilities.html_url_decode(html_extract_input($$$url, args));
        final SubLObject result_value = term_learner_user_choice(choice_id, term_string, term_id, sentence_id_string, substitutions, command, justifications, url, title, api_control_vars.$the_cyclist$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            SubLObject status_attrs = list($$$code, getf(result_value, $STATUS_CODE, UNPROVIDED));
            if (NIL != getf(result_value, $SENTENCE_ID, UNPROVIDED)) {
                status_attrs = cconcatenate(status_attrs, list($$$sentenceId, getf(result_value, $SENTENCE_ID, UNPROVIDED)));
            }
            if (NIL != getf(result_value, $NEW_SENTENCE_ID, UNPROVIDED)) {
                status_attrs = cconcatenate(status_attrs, list($$$newSentenceId, getf(result_value, $NEW_SENTENCE_ID, UNPROVIDED)));
            }
            try {
                final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$status, status_attrs, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        if (NIL != getf(result_value, $NEW_CYCL, UNPROVIDED)) {
                            try {
                                final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$newCycLSentenceHLIDString, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_utilities.xml_print(web_utilities.html_url_encode(getf(result_value, $NEW_CYCL_HL_ID, UNPROVIDED), UNPROVIDED), UNPROVIDED);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$16, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$newCycLSentenceHLIDString);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                }
                            }
                        }
                        if (NIL != getf(result_value, $NEW_CYCL, UNPROVIDED)) {
                            try {
                                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$newCycLSentenceDisplayString, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_utilities.xml_print(web_utilities.html_url_encode(kb_utilities.pretty_print_cycl_to_string(getf(result_value, $NEW_CYCL, UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$19, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$newCycLSentenceDisplayString);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                        }
                        if (NIL != getf(result_value, $NL_STRING, UNPROVIDED)) {
                            try {
                                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$newNLSentence, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_utilities.xml_print(web_utilities.html_url_encode(getf(result_value, $NL_STRING, UNPROVIDED), UNPROVIDED), UNPROVIDED);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$newNLSentence);
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$justification, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_print(getf(result_value, $JUSTIFICATION, UNPROVIDED), UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$justification);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$status);
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject get_substitutions_from_args(final SubLObject args) {
        SubLObject substitutions = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list186);
            key = current.first();
            current = value = current.rest();
            if (NIL != string_utilities.starts_with(key, $$$cyclarg)) {
                substitutions = cons(list(web_utilities.html_url_decode(string_utilities.substring(key, SEVEN_INTEGER, UNPROVIDED)), web_utilities.html_url_decode(value.first()), $CYCL_ID), substitutions);
            }
            if (NIL != string_utilities.starts_with(key, $$$stringarg)) {
                substitutions = cons(list(web_utilities.html_url_decode(string_utilities.substring(key, NINE_INTEGER, UNPROVIDED)), web_utilities.html_url_decode(value.first()), $STRING), substitutions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return substitutions;
    }

    public static SubLObject string_to_user_action_keyword(final SubLObject string) {
        if (string.equalp($$$assert)) {
            return $ASSERT;
        }
        if (string.equalp($$$replace)) {
            return $REPLACE;
        }
        if (string.equalp($$$unassert)) {
            return $UNASSERT;
        }
        return NIL;
    }

    public static SubLObject term_learner_user_choice(final SubLObject choice_id, final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_id_string, final SubLObject substitutions, final SubLObject command, final SubLObject justifications, final SubLObject url, final SubLObject doc_title, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_USER_CHOICE, choice_id, term_string, term_id, sentence_id_string, substitutions, command, justifications, url, doc_title, user }));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_USER_CHOICE, choice_id, term_string, term_id, sentence_id_string, substitutions, command, justifications, url, doc_title, user }));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject sentence_template = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(sentence_id_string);
        if (command == $UNASSERT) {
            return term_learner_handle_user_choice(choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, $REJECT, T);
        }
        if (command == $REPLACE) {
            term_learner_handle_user_choice(choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, $REJECT, T);
        }
        if (NIL != member(command, $list197, UNPROVIDED, UNPROVIDED)) {
            SubLObject new_sentence = sentence_template;
            SubLObject cdolist_list_var = substitutions;
            SubLObject substitution = NIL;
            substitution = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = substitution;
                SubLObject argpos_string = NIL;
                SubLObject raw_new_value = NIL;
                SubLObject type = NIL;
                destructuring_bind_must_consp(current, datum, $list198);
                argpos_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list198);
                raw_new_value = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list198);
                type = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject arg_pos = read_from_string_ignoring_errors(argpos_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject new_value = (type == $STRING) ? raw_new_value : document_annotation_widgets.term_learner_object_from_id(string_utilities.trim_whitespace(raw_new_value));
                    new_sentence = replace_formula_arg_position(arg_pos, new_value, new_sentence);
                } else {
                    cdestructuring_bind_error(datum, $list198);
                }
                cdolist_list_var = cdolist_list_var.rest();
                substitution = cdolist_list_var.first();
            } 
            SubLObject assert_result = term_learner_handle_user_choice(choice_id, term_string, term_id, new_sentence, justifications, url, doc_title, user, $ACCEPT, T);
            final SubLObject nl_sentence_string = get_nl_generation_for_user_added_sentence(new_sentence);
            final SubLObject utf8_sentence = unicode_nauts.convert_unicode_nauts_to_utf8_strings(new_sentence);
            assert_result = putf(assert_result, $NEW_CYCL, utf8_sentence);
            assert_result = putf(assert_result, $NEW_SENTENCE_ID, document_annotation_widgets.term_learner_id(new_sentence));
            if (NIL != nl_sentence_string) {
                assert_result = putf(assert_result, $NEW_NL_SENTENCE, nl_sentence_string);
            }
            assert_result = putf(assert_result, $NEW_CYCL_SENTENCE_STRING, utf8_sentence);
            assert_result = putf(assert_result, $SENTENCE_ID, document_annotation_widgets.term_learner_id(sentence_template));
            return assert_result;
        }
        return NIL;
    }

    public static SubLObject xml_term_learner_create_new(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_pos = html_extract_input($$$argpos, args);
        final SubLObject doc_url = html_extract_input($$$url, args);
        final SubLObject doc_title = html_extract_input($$$title, args);
        final SubLObject justifications = NIL;
        SubLObject assert_sentence_strings = NIL;
        SubLObject nl_strings = NIL;
        SubLObject renderers = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.starts_with(arg.first(), $$$sentence)) {
                assert_sentence_strings = cons(second(arg), assert_sentence_strings);
            } else
                if (NIL != string_utilities.starts_with(arg.first(), $$$termString)) {
                    nl_strings = cons(second(arg), nl_strings);
                }

            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        renderers = term_learner_create_new(assert_sentence_strings, nl_strings, arg_pos, justifications, doc_title, doc_url, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_output_renderers(renderers);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject is_formula_arg_position_a_collectionP(SubLObject formula, final SubLObject arg_pos, SubLObject mt, SubLObject col) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (col == UNPROVIDED) {
            col = $$Collection;
        }
        assert NIL != listp(formula) : "Types.listp(formula) " + "CommonSymbols.NIL != Types.listp(formula) " + formula;
        formula = replace_formula_arg_position(arg_pos, $sym206$_X88928381ASDF, formula);
        return genls.any_specP(col, at_var_types.formula_variable_isa_constraints($sym206$_X88928381ASDF, formula, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cure_assert_sentence(final SubLObject el_sentence, SubLObject user, SubLObject task, SubLObject mt) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = default_task_for_user(user);
        }
        if (mt == UNPROVIDED) {
            mt = hlmt_czer.coerce_to_hlmt(default_assert_mt_for_user_and_task(user, task));
        }
        return ke.ke_assert_now(el_sentence, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cure_unassert_sentence(final SubLObject el_sentence, SubLObject user, SubLObject task, SubLObject mt) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = default_task_for_user(user);
        }
        if (mt == UNPROVIDED) {
            mt = hlmt_czer.coerce_to_hlmt(default_assert_mt_for_user_and_task(user, task));
        }
        return ke.ke_unassert_now(el_sentence, mt);
    }

    public static SubLObject create_new_cure_term_and_assert_sentence(final SubLObject nl_string, final SubLObject el_sentence, final SubLObject arg_pos, SubLObject tag_term, SubLObject user, SubLObject task, SubLObject mt, SubLObject lexical_mt) {
        if (tag_term == UNPROVIDED) {
            tag_term = $$DocIngesterUserCreatedTerm;
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = default_task_for_user(user);
        }
        if (mt == UNPROVIDED) {
            mt = hlmt_czer.coerce_to_hlmt(default_assert_mt_for_user_and_task(user, task));
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE, nl_string, el_sentence, arg_pos, tag_term, user, task, mt, lexical_mt }));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE, nl_string, el_sentence, arg_pos, tag_term, user, task, mt, lexical_mt }));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject new_term = rkf_term_utilities.rkf_create(nl_string, NIL, $str50$, UNPROVIDED, UNPROVIDED);
        final SubLObject term_id = kb_utilities.compact_hl_external_id_string(new_term);
        final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            ke.ke_assert_now(list($$termDependsOn, new_term, mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            if ((NIL != is_formula_arg_position_a_collectionP(el_sentence, arg_pos, mt, UNPROVIDED)) && (!morphology.singularize_string(nl_string, UNPROVIDED).equalp(nl_string))) {
                ke.ke_rename(new_term, constants_high.suggest_constant_name(nl_string, $str50$, $str50$, $UPCASE, UNPROVIDED, UNPROVIDED));
            }
            term_learner_add_lexical_phrase(nl_string, term_id, $str50$, NIL, NIL, user, lexical_mt);
            if (NIL != valid_constant(tag_term, UNPROVIDED)) {
                ke.ke_assert_now(list($$quotedIsa, new_term, tag_term), $$BaseKB, UNPROVIDED, UNPROVIDED);
            }
            cure_assert_sentence(replace_formula_arg_position(arg_pos, new_term, el_sentence), user, task, mt);
            return list($CYCL, new_term, $NL, nl_string, $HL_ID, kb_utilities.compact_hl_external_id_string(new_term));
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_3, thread);
        }
    }

    public static SubLObject term_learner_create_new(final SubLObject assert_sentence_strings, final SubLObject nl_strings, final SubLObject original_arg_pos, SubLObject justifications, SubLObject doc_title, SubLObject doc_url, SubLObject user, SubLObject lexical_mt) {
        if (justifications == UNPROVIDED) {
            justifications = NIL;
        }
        if (doc_title == UNPROVIDED) {
            doc_title = $str50$;
        }
        if (doc_url == UNPROVIDED) {
            doc_url = $str50$;
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_CREATE_NEW, assert_sentence_strings, nl_strings, original_arg_pos, justifications, doc_title, doc_url, user, lexical_mt }));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_CREATE_NEW, assert_sentence_strings, nl_strings, original_arg_pos, justifications, doc_title, doc_url, user, lexical_mt }));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject new_term = NIL;
        SubLObject term_id = NIL;
        final SubLObject term_strings = Mapping.mapcar(HTML_URL_DECODE, nl_strings);
        final SubLObject primary_term_string = term_strings.first();
        if (NIL == justifications) {
            justifications = list(new_term_learner_justification(primary_term_string, $str50$, $USER, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            final SubLObject mt = get_mts_for_user_choice(doc_url, doc_title, justifications, user, UNPROVIDED).first();
            new_term = rkf_term_utilities.rkf_create(primary_term_string, NIL, $str50$, UNPROVIDED, UNPROVIDED);
            term_id = kb_utilities.compact_hl_external_id_string(new_term);
            if (NIL != valid_constant($$DocIngesterUserCreatedTerm, UNPROVIDED)) {
                rkf_assertion_utilities.rkf_assert(listS($$quotedIsa, new_term, $list58), $$BaseKB, UNPROVIDED, UNPROVIDED);
            }
            rkf_assertion_utilities.rkf_assert(list($$termDependsOn, new_term, mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            SubLObject non_isa_sentences = NIL;
            final SubLObject base_sentences = Mapping.mapcar(GET_BASE_SENTENCE_FROM_SENTENCE_STRING, assert_sentence_strings);
            final SubLObject isa_collection = new_term_will_be_collectionP(base_sentences);
            SubLObject cdolist_list_var = base_sentences;
            SubLObject base_sentence = NIL;
            base_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence = subst(new_term, $NEW_TERM, base_sentence, UNPROVIDED, UNPROVIDED);
                if (cycl_utilities.formula_arg0(sentence).eql($$isa)) {
                    rkf_assertion_utilities.rkf_assert_with_implicature(sentence, NIL != isa_collection ? $$UniversalVocabularyMt : mt, T);
                } else {
                    non_isa_sentences = cons(sentence, non_isa_sentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                base_sentence = cdolist_list_var.first();
            } 
            cdolist_list_var = non_isa_sentences;
            SubLObject sentence2 = NIL;
            sentence2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assert_mt = assert_mt_for_sentence(sentence2, mt, isa_collection);
                rkf_assertion_utilities.rkf_assert_with_implicature(sentence2, assert_mt, T);
                cdolist_list_var = cdolist_list_var.rest();
                sentence2 = cdolist_list_var.first();
            } 
            if ((NIL != fort_types_interface.collectionP(new_term)) && (!morphology.singularize_string(primary_term_string, UNPROVIDED).equalp(primary_term_string))) {
                ke.ke_rename(new_term, constants_high.suggest_constant_name(primary_term_string, $str50$, $str50$, $UPCASE, UNPROVIDED, UNPROVIDED));
            }
            SubLObject cdolist_list_var2 = term_strings;
            SubLObject string = NIL;
            string = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                term_learner_add_lexical_phrase(string, term_id, $str50$, doc_url, doc_title, user, lexical_mt);
                cdolist_list_var2 = cdolist_list_var2.rest();
                string = cdolist_list_var2.first();
            } 
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_3, thread);
        }
        return values(list(new_term_learner_open_select_renderer(original_arg_pos, list(list(primary_term_string, new_term, T)), new_term, UNPROVIDED, UNPROVIDED)), new_term);
    }

    public static SubLObject assert_mt_for_sentence(final SubLObject sentence, final SubLObject default_mt, final SubLObject isa_collection) {
        if (NIL == isa_collection) {
            return default_mt;
        }
        if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$isa, UNPROVIDED, UNPROVIDED)) {
            return $$UniversalVocabularyMt;
        }
        if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$genls, UNPROVIDED, UNPROVIDED)) {
            return $$UniversalVocabularyMt;
        }
        return default_mt;
    }

    public static SubLObject new_term_will_be_collectionP(final SubLObject sentences) {
        SubLObject isa_collection = NIL;
        if (NIL == isa_collection) {
            SubLObject csome_list_var;
            SubLObject sentence;
            for (csome_list_var = sentences, sentence = NIL, sentence = csome_list_var.first(); (NIL == isa_collection) && (NIL != csome_list_var); isa_collection = makeBoolean(($NEW_TERM == cycl_utilities.formula_arg1(sentence, UNPROVIDED)) && ((($$genls.eql(cycl_utilities.formula_arg0(sentence)) || (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$genls, UNPROVIDED, UNPROVIDED))) || ($$isa.eql(cycl_utilities.formula_arg0(sentence)) && (NIL != isa.isaP(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $$CollectionType, UNPROVIDED, UNPROVIDED)))) || ((NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$isa, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $$CollectionType, UNPROVIDED, UNPROVIDED))))) , csome_list_var = csome_list_var.rest() , sentence = csome_list_var.first()) {
            }
        }
        return isa_collection;
    }

    public static SubLObject term_learner_renderer_for_new_taxonomic_relative(final SubLObject term_string, final SubLObject term_id, final SubLObject type_id, final SubLObject relation_type, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = default_task_for_user(user);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE, term_string, term_id, type_id, relation_type, user, task));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE, term_string, term_id, type_id, relation_type, user, task));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject type = document_annotation_widgets.term_learner_object_from_id(type_id);
        final SubLObject cycl_sentence = term_learner_get_taxonomic_sentence_for_new_type(relation_type, type);
        final SubLObject new_sentence_id = kb_utilities.compact_hl_external_id_string(cycl_sentence);
        final SubLObject new_term = (NIL != string_utilities.non_empty_stringP(term_id)) ? document_annotation_widgets.term_learner_object_from_id(term_id) : nth_value_step_2(nth_value_step_1(ONE_INTEGER), term_learner_create_new(list(new_sentence_id), list(term_string), $str50$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject assert_sentence = cycl_utilities.expression_subst(new_term, $NEW_TERM, cycl_sentence, UNPROVIDED, UNPROVIDED);
        rkf_assertion_utilities.rkf_assert_now(assert_sentence, default_assert_mt_for_user_and_task(user, task));
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream2 = NIL;
                    try {
                        final SubLObject _prev_bind_0_$33 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream2 = compatibility.open_text($term_learner_user_added_types_log_file$.getDynamicValue(thread), $APPEND);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$33, thread);
                        }
                        if (!stream2.isStream()) {
                            Errors.error($str31$Unable_to_open__S, $term_learner_user_added_types_log_file$.getDynamicValue(thread));
                        }
                        final SubLObject s = stream2;
                        format(s, $str109$_input_cyctermid___A__date___A___, new SubLObject[]{ kb_utilities.compact_hl_external_id_string(type), numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), term_string });
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (stream2.isStream()) {
                                close(stream2, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_3, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return get_term_learner_string_renderer_for_cycl(new_term);
    }

    public static SubLObject term_learner_get_taxonomic_sentence_for_new_type(final SubLObject relation_type, final SubLObject existing_term) {
        if (relation_type.equal($$$spec)) {
            return list($$genls, $NEW_TERM, existing_term);
        }
        if (relation_type.equal($$$instance)) {
            return list($$isa, $NEW_TERM, existing_term);
        }
        return $INVALID;
    }

    public static SubLObject get_base_sentence_from_sentence_string(final SubLObject sentence_string) {
        if (NIL != kb_utilities.compact_hl_external_id_string_p(sentence_string)) {
            return kb_utilities.maybe_find_object_by_compact_hl_external_id_string(sentence_string);
        }
        return transform_list_utilities.transform(read_from_string_ignoring_errors(sentence_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), FIND_BY_ID_STRING_P, DECODE_ID_STRING, UNPROVIDED);
    }

    public static SubLObject find_by_id_string_p(final SubLObject cons) {
        return makeBoolean(cons.isList() && (cons.first() == MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING));
    }

    public static SubLObject decode_id_string(final SubLObject cons) {
        return kb_utilities.maybe_find_object_by_compact_hl_external_id_string(second(cons));
    }

    public static SubLObject xml_term_learner_user_substitution(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_sentence_id = html_extract_input($$$sentenceId, args);
        final SubLObject term_string = html_extract_input($$$termString, args);
        final SubLObject arg_pos_string = html_extract_input($$$argPos, args);
        final SubLObject limit_string = html_extract_input($$$limit, args);
        final SubLObject renderers = term_learner_user_substitution(raw_sentence_id, term_string, arg_pos_string, limit_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_output_renderers(renderers);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return renderers;
    }

    public static SubLObject term_learner_user_substitution(SubLObject raw_sentence_id, final SubLObject term_string, SubLObject argpos_string, SubLObject limit_string, SubLObject raw_explicit_isa_constraints, SubLObject raw_explicit_genls_constraints, SubLObject user, SubLObject task, SubLObject allow_cycl_entryP) {
        if (raw_explicit_isa_constraints == UNPROVIDED) {
            raw_explicit_isa_constraints = NIL;
        }
        if (raw_explicit_genls_constraints == UNPROVIDED) {
            raw_explicit_genls_constraints = NIL;
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        if (allow_cycl_entryP == UNPROVIDED) {
            allow_cycl_entryP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_USER_SUBSTITUTION, raw_sentence_id, term_string, argpos_string, limit_string, raw_explicit_isa_constraints, raw_explicit_genls_constraints, user, task, allow_cycl_entryP }));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_USER_SUBSTITUTION, raw_sentence_id, term_string, argpos_string, limit_string, raw_explicit_isa_constraints, raw_explicit_genls_constraints, user, task, allow_cycl_entryP }));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        if (NIL == raw_sentence_id) {
            raw_sentence_id = $str50$;
        }
        if (NIL == argpos_string) {
            argpos_string = $str50$;
        }
        if (NIL == limit_string) {
            limit_string = $$$100;
        }
        if (NIL == task) {
            task = default_task_for_user(user);
        }
        final SubLObject original_sentence_id = string_utilities.string_subst($str230$_, $$$_, raw_sentence_id, UNPROVIDED);
        final SubLObject mt = wff_checking_mt_for_user_and_task(user, task);
        final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id(original_sentence_id);
        final SubLObject argpos = read_from_string_ignoring_errors(argpos_string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_value = ((NIL != sentence) && (NIL != argpos)) ? cycl_utilities.formula_arg_position(sentence, argpos, UNPROVIDED) : NIL;
        final SubLObject limit = read_from_string_ignoring_errors(limit_string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject query_var = $sym231$_THIS_QUERY_VAR;
        final SubLObject query_sentence = ((NIL != arg_value) && (NIL != sentence)) ? cycl_utilities.formula_subst(query_var, arg_value, sentence, symbol_function(EQUAL), UNPROVIDED) : NIL;
        final SubLObject explicit_isa_constraints = term_learner_constraint_list_from_string(raw_explicit_isa_constraints);
        final SubLObject implied_isa_constraints = at_var_types.formula_variable_isa_constraints(query_var, query_sentence, mt, UNPROVIDED);
        final SubLObject isa_constraints = cconcatenate(implied_isa_constraints, explicit_isa_constraints);
        final SubLObject duplicatableP = member(argpos, cure_list_item_arg_poses(sentence), symbol_function(EQUAL), UNPROVIDED);
        final SubLObject utf8_term_string = unicode_nauts.convert_unicode_nauts_to_utf8_strings(term_string);
        final SubLObject nl_mt = parsing_mt_for_task(task);
        if (NIL != constraint_filters.any_spec_ofP(isa_constraints, $$String, $$InferencePSC)) {
            return new_term_learner_modifiable_string_renderer(term_string, argpos);
        }
        methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_ingester_annotation_lexicon(nl_mt), LEARN, unicode_nauts.convert_unicode_nauts_to_utf8_strings(term_string));
        final SubLObject explicit_genls_constraints = term_learner_constraint_list_from_string(raw_explicit_genls_constraints);
        final SubLObject implied_genls_constraints = at_var_types.formula_variable_genl_constraints(query_var, query_sentence, mt, UNPROVIDED);
        final SubLObject genls_constraints = cconcatenate(implied_genls_constraints, explicit_genls_constraints);
        final SubLObject lex_entries = methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_ingester_annotation_lexicon(nl_mt), GET, utf8_term_string);
        final SubLObject cycl_entry_terms = (NIL != allow_cycl_entryP) ? cb_frames.terms_for_browsing(term_string, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject denot_cycls = delete_duplicates(cconcatenate(cycl_entry_terms, term_lexicon.denots_for_term_lexicon_entries(lex_entries)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject valid_denot_cycls = NIL;
        SubLObject initial_selection = NIL;
        final SubLObject denot_nls = term_learner_cycl_terms_to_nl_strings(denot_cycls, UNPROVIDED, UNPROVIDED);
        final SubLObject look_for_subwordsP = makeBoolean(NIL == find_if(NUMBERP, denot_cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject subword_cycl_nl_pairs = (NIL != look_for_subwordsP) ? subword_nl_cycl_pairs_from_string(term_string) : NIL;
        SubLObject nl_cycl_valid_triples = NIL;
        SubLObject cycl = NIL;
        SubLObject cycl_$35 = NIL;
        SubLObject nl_string = NIL;
        SubLObject nl_string_$36 = NIL;
        cycl = denot_cycls;
        cycl_$35 = cycl.first();
        nl_string = denot_nls;
        nl_string_$36 = nl_string.first();
        while ((NIL != nl_string) || (NIL != cycl)) {
            thread.resetMultipleValues();
            final SubLObject not_invalid = term_learner_valid_substitution(cycl_$35, isa_constraints, genls_constraints, query_sentence, mt);
            final SubLObject passed_constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != not_invalid) && passed_constraints.numG(ZERO_INTEGER)) {
                valid_denot_cycls = cons(cycl_$35, valid_denot_cycls);
                nl_cycl_valid_triples = cons(list(nl_string_$36, cycl_$35, not_invalid), nl_cycl_valid_triples);
            }
            cycl = cycl.rest();
            cycl_$35 = cycl.first();
            nl_string = nl_string.rest();
            nl_string_$36 = nl_string.first();
        } 
        if (NIL == nl_cycl_valid_triples) {
            cycl = NIL;
            SubLObject cycl_$36 = NIL;
            nl_string = NIL;
            SubLObject nl_string_$37 = NIL;
            cycl = denot_cycls;
            cycl_$36 = cycl.first();
            nl_string = denot_nls;
            nl_string_$37 = nl_string.first();
            while ((NIL != nl_string) || (NIL != cycl)) {
                final SubLObject not_invalid = term_learner_valid_substitution(cycl_$36, isa_constraints, genls_constraints, query_sentence, mt);
                if (NIL != not_invalid) {
                    valid_denot_cycls = cons(cycl_$36, valid_denot_cycls);
                }
                nl_cycl_valid_triples = cons(list(nl_string_$37, cycl_$36, not_invalid), nl_cycl_valid_triples);
                cycl = cycl.rest();
                cycl_$36 = cycl.first();
                nl_string = nl_string.rest();
                nl_string_$37 = nl_string.first();
            } 
        }
        if (NIL != list_utilities.lengthE(valid_denot_cycls, ONE_INTEGER, UNPROVIDED)) {
            initial_selection = valid_denot_cycls.first();
        }
        nl_cycl_valid_triples = Sort.sort(nl_cycl_valid_triples, SECOND_TRUE, THIRD);
        SubLObject valid_text_match_triples = NIL;
        SubLObject invalid_text_match_triples = NIL;
        SubLObject cdolist_list_var = subword_cycl_nl_pairs;
        SubLObject cycl_nl = NIL;
        cycl_nl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cycl_nl;
            SubLObject cycl2 = NIL;
            SubLObject nl = NIL;
            destructuring_bind_must_consp(current, datum, $list236);
            cycl2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list236);
            nl = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject not_invalid2 = term_learner_valid_substitution(cycl2, isa_constraints, genls_constraints, query_sentence, mt);
                final SubLObject constraints_passed = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != not_invalid2) && constraints_passed.numG(ZERO_INTEGER)) {
                    valid_text_match_triples = cons(list(nl, cycl2, T), valid_text_match_triples);
                } else {
                    invalid_text_match_triples = cons(list(nl, cycl2, NIL), invalid_text_match_triples);
                }
            } else {
                cdestructuring_bind_error(datum, $list236);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_nl = cdolist_list_var.first();
        } 
        if (NIL != valid_text_match_triples) {
            final SubLObject text_match_count = (NIL != limit) ? subtract(limit, length(valid_denot_cycls)) : NIL;
            final SubLObject limited_matches = (NIL != text_match_count) ? list_utilities.random_n(text_match_count, valid_text_match_triples) : valid_text_match_triples;
            final SubLObject remaining_needed = (NIL != text_match_count) ? subtract(text_match_count, length(limited_matches)) : NIL;
            final SubLObject limited_invalid_matches = (NIL == remaining_needed) ? invalid_text_match_triples : remaining_needed.numG(ZERO_INTEGER) ? list_utilities.first_n(remaining_needed, invalid_text_match_triples) : NIL;
            nl_cycl_valid_triples = cons(list($TEXT_MATCHES, term_string, cconcatenate(limited_matches, limited_invalid_matches)), nl_cycl_valid_triples);
        }
        return unicode_nauts.convert_unicode_nauts_to_utf8_strings(list(new_term_learner_open_select_renderer(argpos, nreverse(nl_cycl_valid_triples), initial_selection, NIL, duplicatableP)));
    }

    public static SubLObject get_nl_cycl_valid_triples_via_scg(final SubLObject utf8_string, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject query_sentence, final SubLObject mt, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = THREE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_out = NIL;
        SubLObject raw_scg_result = NIL;
        SubLObject triples = NIL;
        SubLObject cycls = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject tag = with_timeout_make_tag();
                    try {
                        thread.throwStack.push(tag);
                        final SubLObject _prev_bind_0_$39 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            SubLObject timer = NIL;
                            try {
                                final SubLObject _prev_bind_0_$40 = $with_timeout_nesting_depth$.currentBinding(thread);
                                try {
                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                    timer = with_timeout_start_timer(timeout, tag);
                                    raw_scg_result = scg_api.scg_parse_term(utf8_string, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$40, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    with_timeout_stop_timer(timer);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0_$39, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != timed_out) {
                        Errors.warn($str237$Timeout_attempting_to_call_SCG_on, utf8_string);
                    }
                    SubLObject cdolist_list_var = raw_scg_result;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject not_invalid = term_learner_valid_substitution(cycl, isa_constraints, genls_constraints, query_sentence, mt);
                        final SubLObject passed_constraints = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != not_invalid) && passed_constraints.numG(ZERO_INTEGER)) {
                            cycls = cons(cycl, cycls);
                            triples = cons(list(term_learner_cycl_term_to_nl_string(cycl, UNPROVIDED).first(), cycl, not_invalid), triples);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(triples, cycls);
    }

    public static SubLObject term_learner_constraint_list_from_string(final SubLObject constraint_string) {
        SubLObject constraints = ((NIL == constraint_string) || (NIL != string_utilities.empty_string_p(constraint_string))) ? NIL : document_annotation_widgets.term_learner_object_from_id(constraint_string);
        if (NIL != cycl_grammar.cycl_denotational_term_p(constraints)) {
            constraints = list(constraints);
        }
        return constraints;
    }

    public static SubLObject clear_term_learner_valid_substitution() {
        final SubLObject cs = $term_learner_valid_substitution_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_valid_substitution(final SubLObject cycl_term, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_valid_substitution_caching_state$.getGlobalValue(), list(cycl_term, isa_constraints, genls_constraints, sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_valid_substitution_internal(final SubLObject cycl_term, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject sentence, final SubLObject mt) {
        SubLObject invalid = NIL;
        SubLObject passed_constraints = ZERO_INTEGER;
        if (NIL == invalid) {
            SubLObject csome_list_var = isa_constraints;
            SubLObject isa_constraint = NIL;
            isa_constraint = csome_list_var.first();
            while ((NIL == invalid) && (NIL != csome_list_var)) {
                if (NIL != lexicon_accessors.denot_has_typeP(cycl_term, isa_constraint, mt)) {
                    passed_constraints = add(passed_constraints, ONE_INTEGER);
                } else
                    if (NIL != at_defns.not_has_typeP(cycl_term, isa_constraint, mt)) {
                        invalid = T;
                    }

                csome_list_var = csome_list_var.rest();
                isa_constraint = csome_list_var.first();
            } 
        }
        if (NIL == invalid) {
            SubLObject csome_list_var = genls_constraints;
            SubLObject genls_constraint = NIL;
            genls_constraint = csome_list_var.first();
            while ((NIL == invalid) && (NIL != csome_list_var)) {
                if (NIL != genls.genlsP(cycl_term, genls_constraint, mt, UNPROVIDED)) {
                    passed_constraints = add(passed_constraints, ONE_INTEGER);
                }
                if (NIL != genls.not_genlP(cycl_term, genls_constraint, mt, UNPROVIDED)) {
                    invalid = T;
                }
                csome_list_var = csome_list_var.rest();
                genls_constraint = csome_list_var.first();
            } 
        }
        return values(makeBoolean(NIL == invalid), passed_constraints);
    }

    public static SubLObject term_learner_valid_substitution(final SubLObject cycl_term, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = $term_learner_valid_substitution_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_VALID_SUBSTITUTION, $term_learner_valid_substitution_caching_state$, NIL, EQUALP, FIVE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_VALID_SUBSTITUTION);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(cycl_term, isa_constraints, genls_constraints, sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl_term.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (isa_constraints.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (genls_constraints.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sentence.equalp(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_valid_substitution_internal(cycl_term, isa_constraints, genls_constraints, sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl_term, isa_constraints, genls_constraints, sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject subword_nl_cycl_pairs_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = lexicon_subword_index.nl_trie_subword_index_search_set(string, UNPROVIDED);
        SubLObject cycl_nl_pairs = NIL;
        final SubLObject dict = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        if (NIL == set.set_p(v_set)) {
            return NIL;
        }
        if (!set.set_size(v_set).numG(TWENTY_INTEGER)) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject super_string;
            SubLObject cdolist_list_var;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                super_string = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, super_string)) {
                    cdolist_list_var = lexicon_accessors.denots_of_string(super_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    denot = NIL;
                    denot = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        dictionary_utilities.dictionary_push(dict, denot, super_string);
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    } 
                }
            }
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cycl = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject strings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cycl_nl_pairs = cons(list(cycl, Sort.sort(strings, $sym153$_, LENGTH).first()), cycl_nl_pairs);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return cycl_nl_pairs;
    }

    public static SubLObject xml_term_learner_possible_types_from_substitution(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_id = html_extract_input($$$sentenceId, args);
        final SubLObject term_string = html_extract_input($$$termString, args);
        final SubLObject argpos_string = html_extract_input($$$argPos, args);
        final SubLObject sexpr_result = term_learner_possible_types_from_substitution(sentence_id, term_string, argpos_string, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_output_term_types(sexpr_result);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject term_learner_possible_types_from_substitution(final SubLObject sentence_id, final SubLObject term_string, final SubLObject argpos_string, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION, sentence_id, term_string, argpos_string));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION, sentence_id, term_string, argpos_string));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_ingester_annotation_lexicon(UNPROVIDED), LEARN, unicode_nauts.convert_unicode_nauts_to_utf8_strings(term_string));
        final SubLObject mt = query_mt_for_user_and_task(user, task);
        final SubLObject nl_mt = parsing_mt_for_task(task);
        final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id(sentence_id);
        final SubLObject argpos = read_from_string_ignoring_errors(argpos_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_value = cycl_utilities.formula_arg_position(sentence, argpos, UNPROVIDED);
        final SubLObject query_var = $sym231$_THIS_QUERY_VAR;
        final SubLObject query_sentence = cycl_utilities.expression_subst(query_var, arg_value, sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject isa_constraints = at_var_types.formula_variable_isa_constraints(query_var, query_sentence, mt, UNPROVIDED);
        final SubLObject genls_constraints = at_var_types.formula_variable_genl_constraints(query_var, query_sentence, mt, UNPROVIDED);
        final SubLObject denot_cycls = term_learner_get_word_denots_from_string(term_string, nl_mt);
        final SubLObject justification = new_term_learner_justification(term_string, $str50$, $USER, UNPROVIDED, UNPROVIDED);
        final SubLObject display_isa_constraintsP = list_utilities.lengthE(genls_constraints, ZERO_INTEGER, UNPROVIDED);
        SubLObject new_types = NIL;
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_types = cons(new_term_learner_single_justification_type(v_isa, $float$0_9, justification, term_learner_cycl_term_to_nl_string(v_isa, UNPROVIDED).first(), list($$isa, $NEW_TERM, v_isa), $term_learner_unknown_assertible$.getGlobalValue(), display_isa_constraintsP, UNPROVIDED, UNPROVIDED), new_types);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = genls_constraints;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_types = cons(new_term_learner_single_justification_type(genl, $float$0_9, justification, term_learner_cycl_term_to_nl_string(genl, UNPROVIDED).first(), list($$genls, $NEW_TERM, genl), $term_learner_unknown_assertible$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED), new_types);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        final SubLObject valid_denots = NIL;
        SubLObject cdolist_list_var2 = denot_cycls;
        SubLObject denot = NIL;
        denot = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject not_invalid = term_learner_valid_substitution(denot, isa_constraints, genls_constraints, query_sentence, mt);
            final SubLObject constraints_passed = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != not_invalid) && constraints_passed.numG(ZERO_INTEGER)) {
                new_types = cons(new_term_learner_single_justification_type(denot, $float$0_9, justification, term_learner_cycl_term_to_nl_string(denot, UNPROVIDED).first(), list($$genls, $NEW_TERM, denot), $term_learner_unknown_assertible$.getGlobalValue(), T, NIL, list_utilities.singletonP(valid_denots)), new_types);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            denot = cdolist_list_var2.first();
        } 
        if (NIL == new_types) {
            cdolist_list_var2 = denot_cycls;
            denot = NIL;
            denot = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != term_learner_valid_substitution(denot, isa_constraints, genls_constraints, query_sentence, mt)) {
                    new_types = cons(new_term_learner_single_justification_type(denot, $float$0_9, justification, term_learner_cycl_term_to_nl_string(denot, UNPROVIDED).first(), list($$genls, $NEW_TERM, denot), $term_learner_unknown_assertible$.getGlobalValue(), T, NIL, list_utilities.singletonP(valid_denots)), new_types);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                denot = cdolist_list_var2.first();
            } 
        }
        return new_types;
    }

    public static SubLObject term_learner_get_word_denots_from_string(final SubLObject string, SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject utf8 = unicode_nauts.convert_unicode_nauts_to_utf8_strings(string);
        final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon(nl_mt);
        final SubLObject sentence_iterator = concept_tagger.tag_concepts(document.new_document(utf8, NIL, RKF_STANDARD_STRING_WORDIFY), list($LEXICON, lexicon, $OUTPUT_SPEC, nl_api_datastructures.new_nl_interpretation_spec($list247)));
        SubLObject result_cycls = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject sentence_result = iteration.iteration_next(sentence_iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence_result);
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_cycls = cconcatenate(document.word_cycls(word), result_cycls);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return result_cycls;
    }

    public static SubLObject first_true(final SubLObject a, final SubLObject b) {
        return a;
    }

    public static SubLObject second_true(final SubLObject a, final SubLObject b) {
        return b;
    }

    public static SubLObject term_learner_autocomplete_native(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject prefix = NIL;
        destructuring_bind_must_consp(current, datum, $list250);
        prefix = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$42 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list250);
            current_$42 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list250);
            if (NIL == member(current_$42, $list251, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$42 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list250);
        }
        final SubLObject limit_tail = property_list_member($LIMIT, current);
        final SubLObject limit = (NIL != limit_tail) ? cadr(limit_tail) : TWENTY_INTEGER;
        final SubLObject return_attrs_tail = property_list_member($RETURN_ATTRS, current);
        final SubLObject return_attrs = (NIL != return_attrs_tail) ? cadr(return_attrs_tail) : $str50$;
        final SubLObject sentence_tail = property_list_member($SENTENCE, current);
        final SubLObject sentence = (NIL != sentence_tail) ? cadr(sentence_tail) : NIL;
        final SubLObject arg_pos_tail = property_list_member($ARG_POS, current);
        final SubLObject arg_pos = (NIL != arg_pos_tail) ? cadr(arg_pos_tail) : ZERO_INTEGER;
        final SubLObject case_sensitive_tail = property_list_member($CASE_SENSITIVE, current);
        final SubLObject case_sensitive = (NIL != case_sensitive_tail) ? cadr(case_sensitive_tail) : NIL;
        final SubLObject constants_tail = property_list_member($CONSTANTS, current);
        final SubLObject constants = (NIL != constants_tail) ? cadr(constants_tail) : NIL;
        return listS(TERM_LEARNER_AUTOCOMPLETE_INT, new SubLObject[]{ prefix, list(TO_STRING, limit), return_attrs, list(COMPACT_HL_EXTERNAL_ID_STRING, sentence), list(TO_STRING, arg_pos), list(TO_STRING, case_sensitive), list(TO_STRING, constants), $list260 });
    }

    public static SubLObject term_learner_autocomplete(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject prefix = NIL;
        destructuring_bind_must_consp(current, datum, $list262);
        prefix = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$43 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list262);
            current_$43 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list262);
            if (NIL == member(current_$43, $list263, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$43 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list262);
        }
        final SubLObject limit_tail = property_list_member($LIMIT, current);
        final SubLObject limit = (NIL != limit_tail) ? cadr(limit_tail) : $$$20;
        final SubLObject return_attrs_tail = property_list_member($RETURN_ATTRS, current);
        final SubLObject return_attrs = (NIL != return_attrs_tail) ? cadr(return_attrs_tail) : $str50$;
        final SubLObject sentence_id_tail = property_list_member($SENTENCE_ID, current);
        final SubLObject sentence_id = (NIL != sentence_id_tail) ? cadr(sentence_id_tail) : $$$Mww;
        final SubLObject arg_pos_tail = property_list_member($ARG_POS, current);
        final SubLObject arg_pos = (NIL != arg_pos_tail) ? cadr(arg_pos_tail) : $str50$;
        final SubLObject case_sensitive_tail = property_list_member($CASE_SENSITIVE, current);
        final SubLObject case_sensitive = (NIL != case_sensitive_tail) ? cadr(case_sensitive_tail) : $$$nil;
        final SubLObject constants_tail = property_list_member($CONSTANTS, current);
        final SubLObject constants = (NIL != constants_tail) ? cadr(constants_tail) : $$$nil;
        return listS(TERM_LEARNER_AUTOCOMPLETE_INT, new SubLObject[]{ prefix, limit, return_attrs, sentence_id, arg_pos, case_sensitive, constants, $list267 });
    }

    public static SubLObject xml_term_learner_autocomplete(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prefix = html_extract_input($$$prefix, args);
        final SubLObject count = (NIL != html_extract_input($$$count, args)) ? html_extract_input($$$count, args) : $$$20;
        final SubLObject sentence_id = html_extract_input($$$sentenceId, args);
        final SubLObject arg_pos = html_extract_input($$$argPos, args);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            princ(term_learner_autocomplete_int(prefix, count, $str50$, sentence_id, arg_pos, $$$nil, $$$nil, NIL), xml_vars.$xml_stream$.getDynamicValue(thread));
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject term_learner_autocomplete_int(final SubLObject prefix, final SubLObject limit_string, final SubLObject return_attrs_string, final SubLObject sentence_id, final SubLObject arg_pos_string, final SubLObject case_sensitive_string, final SubLObject complete_on_constants_string, final SubLObject nativeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_AUTOCOMPLETE_INT, prefix, limit_string, return_attrs_string, sentence_id, arg_pos_string, case_sensitive_string, complete_on_constants_string, nativeP }));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_AUTOCOMPLETE_INT, prefix, limit_string, return_attrs_string, sentence_id, arg_pos_string, case_sensitive_string, complete_on_constants_string, nativeP }));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject return_attrs = (NIL != read_from_string_ignoring_errors(return_attrs_string, NIL, NIL, UNPROVIDED, UNPROVIDED)) ? read_from_string_ignoring_errors(return_attrs_string, NIL, NIL, UNPROVIDED, UNPROVIDED) : $list271;
        final SubLObject limit = read_from_string_ignoring_errors(limit_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject case_sensitiveP = read_from_string_ignoring_errors(case_sensitive_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id(sentence_id);
        final SubLObject arg_pos = read_from_string_ignoring_errors(arg_pos_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_constraints = (NIL != sentence) ? html_complete.get_arg_constraints_for_arg(sentence, arg_pos, $$InferencePSC) : NIL;
        final SubLObject isa_filter = html_complete.get_isa_filter_from_arg_constraints(arg_constraints);
        final SubLObject genls_filter = html_complete.get_genls_filter_from_arg_constraints(arg_constraints);
        final SubLObject isa_restrictions = NIL;
        final SubLObject genls_restrictions = NIL;
        final SubLObject complete_on_constantsP = read_from_string_ignoring_errors(complete_on_constants_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject output_string = NIL;
        final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon(UNPROVIDED);
        final SubLObject timeout = TWENTY_INTEGER;
        if (NIL == nativeP) {
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject _prev_bind_0_$44 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(NIL, thread);
                    try {
                        xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                        html_complete.xml_complete_int(prefix, list(new SubLObject[]{ $RETURN_ATTRS, return_attrs, $ISA_FILTER, isa_filter, $GENLS_FILTER, genls_filter, $ISA_RESTRICTIONS, isa_restrictions, $GENLS_RESTRICTIONS, genls_restrictions, $LIMIT, limit, $TIMEOUT, timeout, $kw279$CASE_SENSITIVE_, case_sensitiveP, $kw280$COMPLETE_ON_CONSTANTS_, complete_on_constantsP, $LEXICON, lexicon }));
                        output_string = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
                    } finally {
                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0_$44, thread);
                }
                return output_string;
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return html_complete.native_complete_int(prefix, list(new SubLObject[]{ $RETURN_ATTRS, return_attrs, $ISA_FILTER, isa_filter, $GENLS_FILTER, genls_filter, $ISA_RESTRICTIONS, isa_restrictions, $GENLS_RESTRICTIONS, genls_restrictions, $LIMIT, limit, $TIMEOUT, timeout, $kw279$CASE_SENSITIVE_, case_sensitiveP, $kw280$COMPLETE_ON_CONSTANTS_, complete_on_constantsP, $LEXICON, lexicon }));
    }

    public static SubLObject get_allotted_tasks(final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_ALLOTTED_TASKS, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GET_ALLOTTED_TASKS, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject tasks = ask_utilities.query_variable($sym282$_X, list($$and, $list283, list($$or, list($$thereExists, $sym286$_CURRENT_TASK, list($$and, $list287, list($$cureUserModel, $sym289$_MONAD_USER, $sym286$_CURRENT_TASK, user))), list($$and, list($$allottedAgents, $sym282$_X, user)))), $$AnalystDatabaseMt, $list292);
        final SubLObject current_task = default_task_for_user(user);
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        tasks = cdolist_list_var = list_utilities.snoc(current_task, remove(current_task, tasks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject task = NIL;
        task = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(new_term_learner_string_renderer(pph_main.generate_phrase(task, $DEFAULT, NIL, listS($$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), $list294), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), task, UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            task = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject term_learner_get_fact_sheet_for_term(final SubLObject concept_id, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_GET_FACT_SHEET_FOR_TERM, concept_id));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_GET_FACT_SHEET_FOR_TERM, concept_id));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject cycl = document_annotation_widgets.term_learner_object_from_id(concept_id);
        final SubLObject mt = query_mt_for_user_and_task(user, task);
        SubLObject body_content = NIL;
        if (NIL != concept_naked_for_factsheetP(cycl, mt)) {
            return $str296$_html__body_No_known_facts__body_;
        }
        final SubLObject _prev_bind_3 = fact_sheets.$allow_fact_sheet_evaluationsP$.currentBinding(thread);
        try {
            fact_sheets.$allow_fact_sheet_evaluationsP$.bind(ZERO_INTEGER, thread);
            final SubLObject v_properties = list_utilities.merge_plist(term_learner_standard_fact_sheet_properties(), term_learner_context_sensitive_fact_sheet_properties(cycl, user, task));
            final SubLObject linkless = fact_sheets.get_linkless_fact_sheet_for_term_in_html(cycl, $NORMAL, $DEFAULT, $DEFAULT, v_properties);
            final SubLObject body_start = add(ONE_INTEGER, search($str298$_, linkless, EQUAL, IDENTITY, ZERO_INTEGER, NIL, search(html_macros.$html_body_head$.getGlobalValue(), linkless, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
            final SubLObject body_end = search(html_macros.$html_body_tail$.getGlobalValue(), linkless, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            body_content = subseq(linkless, body_start, body_end);
        } finally {
            fact_sheets.$allow_fact_sheet_evaluationsP$.rebind(_prev_bind_3, thread);
        }
        return body_content;
    }

    public static SubLObject term_learner_get_fact_sheet_updates_for_term(final SubLObject concept_id, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM, concept_id, user, task));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM, concept_id, user, task));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject cycl = document_annotation_widgets.term_learner_object_from_id(concept_id);
        final SubLObject mt = query_mt_for_user_and_task(user, task);
        SubLObject body_content = NIL;
        if (NIL != concept_naked_for_factsheetP(cycl, mt)) {
            return $str50$;
        }
        final SubLObject _prev_bind_3 = fact_sheets.$allow_fact_sheet_evaluationsP$.currentBinding(thread);
        try {
            fact_sheets.$allow_fact_sheet_evaluationsP$.bind(ZERO_INTEGER, thread);
            final SubLObject v_properties = list_utilities.merge_plist(list_utilities.merge_plist(term_learner_standard_fact_sheet_properties(), term_learner_context_sensitive_fact_sheet_properties(cycl, user, task)), $list300);
            final SubLObject linkless = fact_sheets.get_linkless_fact_sheet_for_term_in_html(cycl, $NORMAL, $DEFAULT, $DEFAULT, v_properties);
            final SubLObject body_start = add(ONE_INTEGER, search($str298$_, linkless, EQUAL, IDENTITY, ZERO_INTEGER, NIL, search(html_macros.$html_body_head$.getGlobalValue(), linkless, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
            final SubLObject body_end = search(html_macros.$html_body_tail$.getGlobalValue(), linkless, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            body_content = subseq(linkless, body_start, body_end);
        } finally {
            fact_sheets.$allow_fact_sheet_evaluationsP$.rebind(_prev_bind_3, thread);
        }
        return body_content;
    }

    public static SubLObject term_learner_standard_fact_sheet_properties() {
        return $list301;
    }

    public static SubLObject term_learner_context_sensitive_fact_sheet_properties(final SubLObject topic, final SubLObject user, SubLObject task) {
        if (NIL == task) {
            task = default_task_for_user(user);
        }
        SubLObject v_properties = NIL;
        if (NIL != term_learner_prefer_slot_value_fact_sheetsP(topic, user, task)) {
            final SubLObject except_preds = forbidden_slot_value_fact_sheet_category_preds(topic, user, task);
            v_properties = list_utilities.merge_plist(v_properties, list($SLOT_VALUE_PREFERENCE_PATTERN, list($NOT, bq_cons($OR, except_preds))));
        }
        Errors.warn($str305$Fact_sheet_properties___S, v_properties);
        return v_properties;
    }

    public static SubLObject term_learner_prefer_slot_value_fact_sheetsP(final SubLObject topic, final SubLObject user, final SubLObject task) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(list(constants_high.find_constant($str306$preferSlotValueFormatForTermLearn), topic, user, task), $$InferencePSC, list(new SubLObject[]{ $kw307$ALLOW_ABNORMALITY_CHECKING_, NIL, $MAX_PROBLEM_COUNT, $int$1000, $kw310$EVALUATE_SUBL_ALLOWED_, NIL, $kw311$NEW_TERMS_ALLOWED_, NIL, $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL, $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_PROOF_DEPTH, ONE_INTEGER, $CONTINUABLE_, NIL, $PRODUCTIVITY_LIMIT, $int$100 })));
    }

    public static SubLObject forbidden_slot_value_fact_sheet_category_preds(final SubLObject topic, final SubLObject user, final SubLObject task) {
        return ask_utilities.query_variable($sym112$_PRED, list(constants_high.find_constant($str319$forbidSlotValueFormatForTermLearn), $sym112$_PRED, topic, user, task), $$InferencePSC, list(new SubLObject[]{ $kw307$ALLOW_ABNORMALITY_CHECKING_, NIL, $MAX_PROBLEM_COUNT, $int$1000, $kw310$EVALUATE_SUBL_ALLOWED_, NIL, $kw311$NEW_TERMS_ALLOWED_, NIL, $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_PROOF_DEPTH, ONE_INTEGER, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, NIL, $PRODUCTIVITY_LIMIT, $int$100 }));
    }

    public static SubLObject concept_naked_for_factsheetP(final SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject reified_cycl = narts_high.nart_substitute(cycl);
            result = makeBoolean((NIL == forts.fort_p(reified_cycl)) || (NIL != subl_promotions.memberP(isa.asserted_isa(reified_cycl, UNPROVIDED), $list322, EQUAL, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_learner_unmodifiable_statusP(final SubLObject code) {
        return subl_promotions.memberP(code, $term_learner_unmodifiable$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_known_statusP(final SubLObject code) {
        return subl_promotions.memberP(code, list($term_learner_known_not_removable$.getGlobalValue(), $term_learner_known_derived$.getGlobalValue(), $term_learner_known_removable$.getGlobalValue()), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_fact_status(final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_template_id, final SubLObject justifications, final SubLObject url, final SubLObject doc_title, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_FACT_STATUS, term_string, term_id, sentence_template_id, justifications, url, doc_title, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_FACT_STATUS, term_string, term_id, sentence_template_id, justifications, url, doc_title, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject mt = find_query_mt_from_justifications(justifications, user);
        final SubLObject sentence_template = document_annotation_widgets.term_learner_object_from_id(sentence_template_id);
        final SubLObject sentence = get_sentence_from_template(term_string, term_id, sentence_template);
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject specific_sentence = (pred.eql($$is_Underspecified)) ? cure_specify_is(sentence, mt) : sentence;
        if ((NIL != cycl_utilities.expression_find($TERM, sentence_template, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && term_id.equal($$$null)) {
            return list(ZERO_INTEGER, $str50$);
        }
        return term_learner_fact_status_int(specific_sentence, mt, user);
    }

    public static SubLObject cure_specify_is(final SubLObject sentence, final SubLObject mt) {
        if (NIL != fort_types_interface.collectionP(cycl_utilities.formula_arg2(sentence, UNPROVIDED))) {
            return cycl_utilities.formula_subst($$genls, $$is_Underspecified, sentence, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != kb_accessors.individualP(cycl_utilities.formula_arg2(sentence, UNPROVIDED))) {
            return cycl_utilities.formula_subst($$isa, $$is_Underspecified, sentence, UNPROVIDED, UNPROVIDED);
        }
        return sentence;
    }

    public static SubLObject find_query_mt_from_justifications(final SubLObject justs, SubLObject user) {
        if (user == UNPROVIDED) {
            user = NIL;
        }
        final SubLObject task = default_task_for_user(user);
        SubLObject mts = list(query_mt_for_task(task));
        SubLObject cdolist_list_var = justs;
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assert_mt = term_learner_justification_assert_mt(just);
            if (NIL != assert_mt) {
                mts = cons(assert_mt, mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return NIL != list_utilities.lengthG(mts, ONE_INTEGER, UNPROVIDED) ? cons($$MtUnionFn, mts) : mts.first();
    }

    public static SubLObject clear_term_learner_fact_status_int() {
        final SubLObject cs = $term_learner_fact_status_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_fact_status_int(final SubLObject sentence, final SubLObject mt, SubLObject user) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_fact_status_int_caching_state$.getGlobalValue(), list(sentence, mt, user), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_fact_status_int_internal(final SubLObject sentence, final SubLObject mt, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list($term_learner_incomplete$.getGlobalValue(), $str50$);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject knownP = term_learner_knownP(sentence, mt);
            final SubLObject assertibleP = (NIL != knownP) ? NIL : term_learner_sentence_assertibleP(sentence, mt);
            final SubLObject removableP = (NIL != knownP) ? sentence_removable_by_userP(sentence, user) : NIL;
            final SubLObject derivedP = (NIL != knownP) ? derived_sentenceP(sentence, user) : NIL;
            if ((NIL != knownP) && (NIL != removableP)) {
                result = list($term_learner_known_removable$.getGlobalValue(), $str50$);
            } else
                if ((NIL != knownP) && (NIL == removableP)) {
                    result = list($term_learner_known_not_removable$.getGlobalValue(), $str50$);
                } else
                    if ((NIL != knownP) && (NIL != derivedP)) {
                        final SubLObject justification = $$$Derived_from_other_assertions;
                        result = list($term_learner_known_derived$.getGlobalValue(), justification);
                    } else
                        if ((NIL == knownP) && (NIL != assertibleP)) {
                            result = list($term_learner_unknown_assertible$.getGlobalValue(), $str50$);
                        } else
                            if ((NIL == knownP) && (NIL == assertibleP)) {
                                final SubLObject explanation_string = wff.explanation_of_why_not_wff_assert(sentence, mt, UNPROVIDED);
                                SubLObject escaped_explanation = NIL;
                                if (explanation_string.isString()) {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = make_private_string_output_stream();
                                        final SubLObject _prev_bind_0_$46 = xml_vars.$xml_stream$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_stream$.bind(stream, thread);
                                            xml_utilities.xml_write_wXescaped_special_chars(explanation_string);
                                        } finally {
                                            xml_vars.$xml_stream$.rebind(_prev_bind_0_$46, thread);
                                        }
                                        escaped_explanation = get_output_stream_string(stream);
                                    } finally {
                                        final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            close(stream, UNPROVIDED);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                        }
                                    }
                                } else {
                                    escaped_explanation = $str50$;
                                }
                                result = list($term_learner_impossible$.getGlobalValue(), escaped_explanation);
                            }




        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_learner_fact_status_int(final SubLObject sentence, final SubLObject mt, SubLObject user) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        SubLObject caching_state = $term_learner_fact_status_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_FACT_STATUS_INT, $term_learner_fact_status_int_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_FACT_STATUS_INT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, user);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && user.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_fact_status_int_internal(sentence, mt, user)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, user));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject term_learner_knownP(final SubLObject sentence, final SubLObject mt) {
        return makeBoolean((NIL != closedP(sentence, UNPROVIDED)) && (NIL != rkf_query_utilities.rkf_known(sentence, mt, UNPROVIDED)));
    }

    public static SubLObject sentence_removable_by_userP(final SubLObject sentence, final SubLObject user) {
        final SubLObject user_can_arbitrarily_delete = cure_user_has_arbitrary_deletion_privileges(user);
        final SubLObject asserts = term_learner_find_visible_assertions_cycl(sentence, UNPROVIDED);
        SubLObject must_stay = makeBoolean(NIL == asserts);
        if (NIL == must_stay) {
            SubLObject csome_list_var = asserts;
            SubLObject v_assert = NIL;
            v_assert = csome_list_var.first();
            while ((NIL == must_stay) && (NIL != csome_list_var)) {
                if (((NIL != tms.independently_deducible_assertionP(v_assert)) && (NIL == user_can_arbitrarily_delete)) && (NIL == removal_modules_assertion_mt.assertion_asserted_byP(v_assert, user))) {
                    must_stay = T;
                }
                csome_list_var = csome_list_var.rest();
                v_assert = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == must_stay);
    }

    public static SubLObject cure_user_has_arbitrary_deletion_privileges(SubLObject user) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLObject task = default_task_for_user(user);
        return query_library_utils.allow_arbitrary_assertion_deletion(task);
    }

    public static SubLObject derived_sentenceP(final SubLObject sentence, final SubLObject user) {
        final SubLObject asserts = term_learner_find_visible_assertions_cycl(sentence, UNPROVIDED);
        SubLObject derived = makeBoolean(NIL == asserts);
        if (NIL == derived) {
            SubLObject csome_list_var = asserts;
            SubLObject v_assert = NIL;
            v_assert = csome_list_var.first();
            while ((NIL == derived) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.deduced_assertionP(v_assert)) {
                    derived = T;
                }
                csome_list_var = csome_list_var.rest();
                v_assert = csome_list_var.first();
            } 
        }
        return derived;
    }

    public static SubLObject term_learner_find_visible_assertions_cycl_internal(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return czer_meta.find_visible_assertions_cycl(sentence, mt);
    }

    public static SubLObject term_learner_find_visible_assertions_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return term_learner_find_visible_assertions_cycl_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(term_learner_find_visible_assertions_cycl_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject xml_term_learner_get_followups_for_term(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_id = html_extract_input($$$conceptId, args);
        final SubLObject max_s = html_extract_input($$$max, args);
        final SubLObject max = (max_s.isString()) ? read_from_string_ignoring_errors(max_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : ZERO_INTEGER;
        final SubLObject questions_only_s = html_extract_input($$$questionsOnly, args);
        final SubLObject questions_only = equal(questions_only_s, $$$true);
        final SubLObject unknown_only_s = html_extract_input($$$unknownOnly, args);
        final SubLObject unknown_only = equal(unknown_only_s, $$$true);
        final SubLObject user_s = html_extract_input($$$user, args);
        final SubLObject user = (user_s.isString()) ? read_from_string_ignoring_errors(user_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL != api_control_vars.$the_cyclist$.getDynamicValue(thread) ? api_control_vars.$the_cyclist$.getDynamicValue(thread) : $$CycAdministrator;
        final SubLObject ignore_q_list_s = html_extract_input($$$ignoreList, args);
        final SubLObject ignore_q_list = (NIL != string_utilities.non_empty_stringP(ignore_q_list_s)) ? Mapping.mapcar(MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, string_utilities.split_string(ignore_q_list_s, UNPROVIDED)) : NIL;
        final SubLObject followups = term_learner_get_followups_for_term(term_id, user, max, unknown_only, questions_only, ignore_q_list);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_output_term_types(followups);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject term_learner_get_followups_for_cycl_term(final SubLObject v_term, SubLObject user, SubLObject limit, SubLObject unknown_onlyP, SubLObject questions_onlyP, SubLObject ignore_list) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (unknown_onlyP == UNPROVIDED) {
            unknown_onlyP = NIL;
        }
        if (questions_onlyP == UNPROVIDED) {
            questions_onlyP = NIL;
        }
        if (ignore_list == UNPROVIDED) {
            ignore_list = NIL;
        }
        return term_learner_get_followups_for_term(kb_utilities.compact_hl_external_id_string(v_term), user, limit, unknown_onlyP, questions_onlyP, ignore_list);
    }

    public static SubLObject term_learner_get_followups_for_term(final SubLObject term_id, SubLObject user, SubLObject limit, SubLObject unknown_onlyP, SubLObject questions_onlyP, SubLObject ignore_list) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (unknown_onlyP == UNPROVIDED) {
            unknown_onlyP = NIL;
        }
        if (questions_onlyP == UNPROVIDED) {
            questions_onlyP = NIL;
        }
        if (ignore_list == UNPROVIDED) {
            ignore_list = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM, term_id, user, limit, unknown_onlyP, questions_onlyP, ignore_list));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM, term_id, user, limit, unknown_onlyP, questions_onlyP, ignore_list));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject sorted_result = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$48 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$49 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$50 = pph_vars.$pph_addressee$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$51 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $current_tl_task$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = cae_query_search.$current_cae_task$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(user, thread);
                        pph_vars.$pph_addressee$.bind(user, thread);
                        pph_vars.$pph_use_indexical_datesP$.bind(T, thread);
                        $current_tl_task$.bind(default_task_for_user(user), thread);
                        cae_query_search.$current_cae_task$.bind($current_tl_task$.getDynamicValue(thread), thread);
                        final SubLObject cycl = document_annotation_widgets.term_learner_object_from_id(term_id);
                        final SubLObject followup_mt = followup_query_mt_for_userXtask(user, $current_tl_task$.getDynamicValue(thread));
                        final SubLObject query_mt = query_mt_for_task($current_tl_task$.getDynamicValue(thread));
                        final SubLObject result = term_learner_unsorted_fragments_for_term(cycl, followup_mt, query_mt, unknown_onlyP, questions_onlyP, ignore_list);
                        final SubLObject sort_style = (limit.eql(ONE_INTEGER)) ? $UNCATEGORIZED : $NORMAL;
                        sorted_result = sort_followups(result, cycl, followup_mt, query_library_utils.cae_default_paraphrase_mt($current_tl_task$.getDynamicValue(thread)), sort_style);
                        if (((NIL != limit) && ZERO_INTEGER.numL(limit)) && limit.numL(length(result))) {
                            SubLObject doneP = NIL;
                            SubLObject current_count = ZERO_INTEGER;
                            SubLObject temp_result = NIL;
                            if (NIL == doneP) {
                                SubLObject csome_list_var = sorted_result;
                                SubLObject category = NIL;
                                category = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject followups = getf(category, $TYPES, UNPROVIDED);
                                    final SubLObject number_needed = subtract(limit, current_count);
                                    if (current_count.numGE(limit)) {
                                        doneP = T;
                                    } else
                                        if (length(followups).numL(number_needed)) {
                                            temp_result = cons(category, temp_result);
                                            current_count = add(current_count, length(followups));
                                        } else {
                                            temp_result = cons(putf(category, $TYPES, list_utilities.first_n(number_needed, followups)), temp_result);
                                            current_count = add(current_count, length(followups));
                                        }

                                    csome_list_var = csome_list_var.rest();
                                    category = csome_list_var.first();
                                } 
                            }
                            sorted_result = nreverse(temp_result);
                        }
                    } finally {
                        cae_query_search.$current_cae_task$.rebind(_prev_bind_7, thread);
                        $current_tl_task$.rebind(_prev_bind_6, thread);
                        pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_2_$51, thread);
                        pph_vars.$pph_addressee$.rebind(_prev_bind_1_$50, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$49, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$48, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
        }
        return sorted_result;
    }

    public static SubLObject term_learner_unsorted_fragments_for_term(final SubLObject v_term, final SubLObject followup_mt, final SubLObject query_mt, final SubLObject unknown_onlyP, final SubLObject questions_onlyP, final SubLObject ignore_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_phrase = term_learner_cycl_term_to_nl_string(v_term, UNPROVIDED).first();
        final SubLObject _prev_bind_0 = cae_query_search.$cae_query_search_skip_nl_generation$.currentBinding(thread);
        try {
            cae_query_search.$cae_query_search_skip_nl_generation$.bind(T, thread);
            final SubLObject raw_fragments = cae_query_search.get_fragments_for_terms(list(list(term_phrase, v_term)), NIL, followup_mt, $BLANKS, NIL, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = raw_fragments;
            SubLObject fragment = NIL;
            fragment = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject fragment_cycl = fragment.first();
                final SubLObject focal_arg_poses = cycl_utilities.arg_positions_dfs(v_term, fragment_cycl, UNPROVIDED);
                if ((NIL != cycl_utilities.expression_find(v_term, fragment_cycl, T, EQUAL, UNPROVIDED)) && (NIL == subl_promotions.memberP(fragment_cycl, ignore_list, $sym346$EQUALS_EL_, UNPROVIDED))) {
                    SubLObject cdolist_list_var_$53 = term_learner_types_for_fragment(focal_arg_poses, fragment, term_phrase, cure_default_generation_mt(UNPROVIDED), query_mt, followup_mt, unknown_onlyP, questions_onlyP);
                    SubLObject type = NIL;
                    type = cdolist_list_var_$53.first();
                    while (NIL != cdolist_list_var_$53) {
                        if (!$term_learner_impossible$.getGlobalValue().equal(getf(type, $STATUS_CODE, UNPROVIDED))) {
                            result = cons(type, result);
                        }
                        cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                        type = cdolist_list_var_$53.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                fragment = cdolist_list_var.first();
            } 
            return result;
        } finally {
            cae_query_search.$cae_query_search_skip_nl_generation$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject sort_followups(SubLObject followups, final SubLObject focal_term, final SubLObject mt, SubLObject paraphrase_mt, SubLObject sort_style) {
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = pph_vars.pph_language_mt();
        }
        if (sort_style == UNPROVIDED) {
            sort_style = $NORMAL;
        }
        SubLObject categorized_followups = NIL;
        SubLObject ret_value = NIL;
        SubLObject cdolist_list_var = followups;
        SubLObject followup = NIL;
        followup = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject categories_and_types = (sort_style == $UNCATEGORIZED) ? NIL : categories_and_types_for_sentence_and_term(getf(followup, $CYCL, UNPROVIDED), focal_term, mt);
            final SubLObject new_followup = putf(followup, $CATEGORY_INFO, categories_and_types);
            if (NIL == categories_and_types) {
                categories_and_types = list(NIL);
            }
            SubLObject cdolist_list_var_$54 = categories_and_types;
            SubLObject category_and_type = NIL;
            category_and_type = cdolist_list_var_$54.first();
            while (NIL != cdolist_list_var_$54) {
                categorized_followups = list_utilities.alist_push(categorized_followups, category_and_type.first(), new_followup, UNPROVIDED);
                cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                category_and_type = cdolist_list_var_$54.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            followup = cdolist_list_var.first();
        } 
        followups = NIL;
        categorized_followups = cdolist_list_var = sort_by_category(categorized_followups, focal_term, mt);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject category_pred = NIL;
            SubLObject category_followups = NIL;
            destructuring_bind_must_consp(current, datum, $list348);
            category_pred = current.first();
            current = category_followups = current.rest();
            final SubLObject sorted_followups = Sort.sort(category_followups, HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY, UNPROVIDED);
            final SubLObject category_name = term_learner_category_label(category_pred, paraphrase_mt);
            followups = cconcatenate(followups, sorted_followups);
            ret_value = cconcatenate(ret_value, list(list($CATEGORY, category_pred, $CATEGORY_NL, category_name, $TYPES, sorted_followups)));
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return ret_value;
    }

    public static SubLObject clear_term_learner_category_label() {
        final SubLObject cs = $term_learner_category_label_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_category_label(final SubLObject category_pred, SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = $$EnglishParaphraseMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_category_label_caching_state$.getGlobalValue(), list(category_pred, nl_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_category_label_internal(final SubLObject category_pred, final SubLObject nl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == category_pred) {
            return $$$Advanced_Info;
        }
        SubLObject known_label = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(nl_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$termSummaryPredicateLabel;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(category_pred, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(category_pred, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$55 = NIL;
                            final SubLObject token_var_$56 = NIL;
                            while (NIL == done_var_$55) {
                                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                final SubLObject valid_$57 = makeBoolean(!token_var_$56.eql(v_assert));
                                if (NIL != valid_$57) {
                                    if (NIL == known_label) {
                                        known_label = cycl_utilities.formula_arg2(v_assert, UNPROVIDED);
                                    } else
                                        if (kb_mapping_utilities.fpred_value_in_relevant_mts(v_assert, $$genStringAssertion, nl_mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED).equal(category_pred)) {
                                            known_label = cycl_utilities.formula_arg2(v_assert, UNPROVIDED);
                                        }

                                }
                                done_var_$55 = makeBoolean(NIL == valid_$57);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL != known_label ? known_label : $$$Advanced_Info;
    }

    public static SubLObject term_learner_category_label(final SubLObject category_pred, SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = $$EnglishParaphraseMt;
        }
        SubLObject caching_state = $term_learner_category_label_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_CATEGORY_LABEL, $term_learner_category_label_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_CATEGORY_LABEL);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(category_pred, nl_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (category_pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && nl_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_category_label_internal(category_pred, nl_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(category_pred, nl_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_get_followup_categories_for_type() {
        final SubLObject cs = $get_followup_categories_for_type_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_followup_categories_for_type(final SubLObject coll, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_followup_categories_for_type_caching_state$.getGlobalValue(), list(coll, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_followup_categories_for_type_internal(final SubLObject coll, final SubLObject mt) {
        return ask_utilities.query_variable($sym361$_CAT, list($$subtopicCollectionForCategory, $sym361$_CAT, coll), mt, UNPROVIDED);
    }

    public static SubLObject get_followup_categories_for_type(final SubLObject coll, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $get_followup_categories_for_type_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_FOLLOWUP_CATEGORIES_FOR_TYPE, $get_followup_categories_for_type_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_FOLLOWUP_CATEGORIES_FOR_TYPE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(coll, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (coll.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_followup_categories_for_type_internal(coll, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(coll, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_get_pred_list_order_for_type() {
        final SubLObject cs = $get_pred_list_order_for_type_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_pred_list_order_for_type(final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_pred_list_order_for_type_caching_state$.getGlobalValue(), list(type, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_pred_list_order_for_type_internal(final SubLObject type, final SubLObject mt) {
        return cycl_utilities.formula_args(ask_utilities.query_variable($sym367$_PRED_LIST, listS($const368$summaryPredicateWRTSetOrCollectio, type, $list369), mt, UNPROVIDED).first(), UNPROVIDED);
    }

    public static SubLObject get_pred_list_order_for_type(final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $get_pred_list_order_for_type_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_PRED_LIST_ORDER_FOR_TYPE, $get_pred_list_order_for_type_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_PRED_LIST_ORDER_FOR_TYPE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (type.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_pred_list_order_for_type_internal(type, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(type, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject categories_and_types_for_sentence_and_term(final SubLObject sentence, final SubLObject focal_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject temp_sentence = substitute_arg_constraints_for_vars(sentence, mt);
        final SubLObject non_negated = (cycl_utilities.formula_arg0(temp_sentence).eql($$not)) ? cycl_utilities.formula_arg1(temp_sentence, UNPROVIDED) : temp_sentence;
        return categories_and_types_for_sentence_and_term_int(non_negated, focal_term, mt);
    }

    public static SubLObject substitute_arg_constraints_for_vars(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject var_positions = cdolist_list_var = cycl_utilities.arg_positions_if_dfs(EL_VARIABLE_P, sentence, UNPROVIDED);
            SubLObject var_position = NIL;
            var_position = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject relation = cycl_utilities.formula_arg0(cycl_utilities.formula_arg_position(sentence, butlast(var_position, UNPROVIDED), UNPROVIDED));
                final SubLObject arg_num = last(var_position, UNPROVIDED).first();
                final SubLObject arg_genl = substitutable_arg_constraint_for_reln(relation, arg_num);
                sentence = cycl_utilities.formula_arg_position_subst(arg_genl, var_position, sentence);
                cdolist_list_var = cdolist_list_var.rest();
                var_position = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }

    public static SubLObject clear_substitutable_arg_constraint_for_reln() {
        final SubLObject cs = $substitutable_arg_constraint_for_reln_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_substitutable_arg_constraint_for_reln(final SubLObject reln, final SubLObject arg_num) {
        return memoization_state.caching_state_remove_function_results_with_args($substitutable_arg_constraint_for_reln_caching_state$.getGlobalValue(), list(reln, arg_num), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject substitutable_arg_constraint_for_reln_internal(final SubLObject reln, final SubLObject arg_num) {
        final SubLObject base_genls = ask_utilities.query_variable($sym375$_COL, listS($$argGenl, reln, arg_num, $list377), UNPROVIDED, UNPROVIDED);
        final SubLObject result = (NIL != base_genls) ? base_genls.first() : $$Thing;
        return result;
    }

    public static SubLObject substitutable_arg_constraint_for_reln(final SubLObject reln, final SubLObject arg_num) {
        SubLObject caching_state = $substitutable_arg_constraint_for_reln_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN, $substitutable_arg_constraint_for_reln_caching_state$, $int$256, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(reln, arg_num);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (reln.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg_num.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(substitutable_arg_constraint_for_reln_internal(reln, arg_num)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(reln, arg_num));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject categories_and_types_for_sentence_and_term_int(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt) {
        return categories_and_types_for_sentence_and_term_int_via_indexing(sentence, focal_term, mt);
    }

    public static SubLObject categories_and_types_for_sentence_and_term_int_via_query(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt) {
        return ask_utilities.query_template($list381, list($$thereExists, $sym112$_PRED, list($$thereExists, $sym382$_N, list($$and, list($$equalSymbols, $sym384$_TERM, focal_term), list($$argN, $sym386$_SENTENCE_PRED, ZERO_INTEGER, sentence), $list387, list($$argN, $sym384$_TERM, $sym382$_N, sentence), list($$or, $list388, $list389, $list390, $list391, listS($$and, $list392, list($$assertedSentence, sentence), $list393), listS($$and, $list394, list($$assertedSentence, sentence), $list395))))), mt, UNPROVIDED);
    }

    public static SubLObject clear_categories_and_types_for_sentence_and_term_int_via_indexing() {
        final SubLObject cs = $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_categories_and_types_for_sentence_and_term_int_via_indexing(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$.getGlobalValue(), list(sentence, focal_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject categories_and_types_for_sentence_and_term_int_via_indexing_internal(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject hl_mt = narts_high.nart_substitute(mt);
        final SubLObject preds_requiring_isa = $list397;
        final SubLObject preds_requiring_asserted_sentence = $list398;
        final SubLObject preds_allowing_spec_preds = $list399;
        final SubLObject sentence_pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(hl_mt, thread);
            SubLObject end_var;
            SubLObject arg_num;
            SubLObject cdolist_list_var;
            SubLObject pred;
            SubLObject pred_var;
            SubLObject iterator_var;
            SubLObject done_var;
            SubLObject token_var;
            SubLObject final_index_spec;
            SubLObject valid;
            SubLObject final_index_iterator;
            SubLObject done_var_$59;
            SubLObject token_var_$60;
            SubLObject ass;
            SubLObject valid_$61;
            SubLObject _prev_bind_0_$62;
            SubLObject _values;
            for (end_var = number_utilities.f_1X(formula_arity(sentence, UNPROVIDED)), arg_num = NIL, arg_num = ONE_INTEGER; !arg_num.numGE(end_var); arg_num = number_utilities.f_1X(arg_num)) {
                cdolist_list_var = $list402;
                pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg_num, FOUR_INTEGER, pred_var)) {
                        iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg_num, FOUR_INTEGER, pred_var);
                        done_var = NIL;
                        token_var = NIL;
                        while (NIL == done_var) {
                            final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    done_var_$59 = NIL;
                                    token_var_$60 = NIL;
                                    while (NIL == done_var_$59) {
                                        ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$60);
                                        valid_$61 = makeBoolean(!token_var_$60.eql(ass));
                                        if ((((NIL != valid_$61) && (NIL != (NIL != subl_promotions.memberP(pred, preds_requiring_isa, UNPROVIDED, UNPROVIDED) ? isa.isaP(focal_term, cycl_utilities.formula_arg3(ass, UNPROVIDED), UNPROVIDED, UNPROVIDED) : genls.genlP(focal_term, cycl_utilities.formula_arg3(ass, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) && (sentence_pred.equal(cycl_utilities.formula_arg1(ass, UNPROVIDED)) || ((NIL != subl_promotions.memberP(pred, preds_allowing_spec_preds, UNPROVIDED, UNPROVIDED)) && (NIL != genl_predicates.genl_predP(sentence_pred, cycl_utilities.formula_arg1(ass, UNPROVIDED), mt, UNPROVIDED))))) && ((NIL == subl_promotions.memberP(pred, preds_requiring_asserted_sentence, UNPROVIDED, UNPROVIDED)) || (NIL != czer_meta.find_visible_assertions_cycl(sentence, mt)))) {
                                            result = cons(list(cycl_utilities.formula_arg2(ass, UNPROVIDED), cycl_utilities.formula_arg3(ass, UNPROVIDED)), result);
                                        }
                                        done_var_$59 = makeBoolean(NIL == valid_$61);
                                    } 
                                } finally {
                                    _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject categories_and_types_for_sentence_and_term_int_via_indexing(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt) {
        SubLObject caching_state = $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING, $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$, $int$256, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, focal_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (focal_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(categories_and_types_for_sentence_and_term_int_via_indexing_internal(sentence, focal_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, focal_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sort_by_category(final SubLObject categorized_followups, final SubLObject focal_term, final SubLObject mt) {
        final SubLObject pred_sort_order = summary_pred_sort_order_for_focal_term(focal_term, mt);
        final SubLObject sorted_followups = list_utilities.sort_via_position(categorized_followups, pred_sort_order, EQUAL, FIRST);
        return sorted_followups;
    }

    public static SubLObject clear_summary_pred_sort_order_for_focal_term() {
        final SubLObject cs = $summary_pred_sort_order_for_focal_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_summary_pred_sort_order_for_focal_term(final SubLObject focal_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($summary_pred_sort_order_for_focal_term_caching_state$.getGlobalValue(), list(focal_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject summary_pred_sort_order_for_focal_term_internal(final SubLObject focal_term, final SubLObject mt) {
        final SubLObject sorted_preds_from_genls = Sort.sort(ask_utilities.query_template($list407, list($$and, $list408, listS($$genls, focal_term, $list409)), mt, UNPROVIDED), $sym410$GENERALITY_ESTIMATE_, FIRST);
        final SubLObject sorted_preds_from_isa = Sort.sort(ask_utilities.query_template($list407, list($$and, $list411, listS($$isa, focal_term, $list409)), mt, UNPROVIDED), $sym410$GENERALITY_ESTIMATE_, FIRST);
        final SubLObject pred_sort_order = list_utilities.remove_duplicates_from_end(Mapping.mapcan(CDADR, nconc(sorted_preds_from_genls, sorted_preds_from_isa), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return pred_sort_order;
    }

    public static SubLObject summary_pred_sort_order_for_focal_term(final SubLObject focal_term, final SubLObject mt) {
        SubLObject caching_state = $summary_pred_sort_order_for_focal_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM, $summary_pred_sort_order_for_focal_term_caching_state$, $int$128, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(focal_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (focal_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(summary_pred_sort_order_for_focal_term_internal(focal_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(focal_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject higher_priority_followup_in_category(final SubLObject followup1, final SubLObject followup2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject pred1 = narts_high.nart_substitute(cycl_utilities.formula_arg0(getf(followup1, $CYCL, UNPROVIDED)));
        final SubLObject pred2 = narts_high.nart_substitute(cycl_utilities.formula_arg0(getf(followup2, $CYCL, UNPROVIDED)));
        final SubLObject justifying_type1 = get_justifying_type_from_fragment_justification(getf(followup1, $FRAGMENT_JUSTIFICATION, UNPROVIDED));
        final SubLObject justifying_type2 = get_justifying_type_from_fragment_justification(getf(followup2, $FRAGMENT_JUSTIFICATION, UNPROVIDED));
        final SubLObject summary_pred1 = get_followup_categories_for_type(justifying_type1, mt).first();
        final SubLObject summary_pred2 = get_followup_categories_for_type(justifying_type2, mt).first();
        final SubLObject pred_order_from_type = get_pred_list_order_for_type(justifying_type1, $$InferencePSC);
        final SubLObject pred1_position = position(pred1, pred_order_from_type, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pred2_position = position(pred2, pred_order_from_type, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == pred1) {
            return T;
        }
        if (NIL == pred2) {
            return NIL;
        }
        if (NIL != genl_predicates.proper_genl_predP(pred1, pred2, mt, UNPROVIDED)) {
            return T;
        }
        if (NIL != genl_predicates.proper_genl_predP(pred2, pred1, mt, UNPROVIDED)) {
            return NIL;
        }
        if (((NIL != justifying_type2) && (NIL != justifying_type1)) && (NIL != cardinality_estimates.generality_estimateL(justifying_type1, justifying_type2))) {
            return T;
        }
        if (((NIL != justifying_type2) && (NIL != justifying_type1)) && (NIL != cardinality_estimates.generality_estimateG(justifying_type1, justifying_type2))) {
            return NIL;
        }
        if (((NIL != summary_pred2) && (NIL != summary_pred1)) && (NIL != kb_utilities.term_L(summary_pred1, summary_pred2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (((NIL != summary_pred2) && (NIL != summary_pred1)) && (NIL != kb_utilities.term_L(summary_pred2, summary_pred1, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == pred1_position) {
            return NIL;
        }
        if (NIL == pred2_position) {
            return T;
        }
        if (pred1_position.numL(pred2_position)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject get_justifying_type_from_fragment_justification(final SubLObject just) {
        final SubLObject cdolist_list_var;
        final SubLObject type_positions = cdolist_list_var = cconcatenate(cycl_utilities.arg_positions_dfs($ISA, just, UNPROVIDED), cycl_utilities.arg_positions_dfs($GENLS, just, UNPROVIDED));
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            return cycl_utilities.formula_arg_position(just, list_utilities.snoc(TWO_INTEGER, butlast(position, UNPROVIDED)), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject debug_followups_for_term(final SubLObject v_term, SubLObject user) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$63 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject term_phrase = term_learner_cycl_term_to_nl_string(v_term, UNPROVIDED).first();
                    final SubLObject _prev_bind_0_$64 = $current_tl_task$.currentBinding(thread);
                    try {
                        $current_tl_task$.bind(default_task_for_user(user), thread);
                        final SubLObject followup_query_mt = followup_query_mt_for_userXtask(user, $current_tl_task$.getDynamicValue(thread));
                        final SubLObject raw_fragments = cae_query_search.get_fragments_for_terms(list(list(term_phrase, v_term)), NIL, followup_query_mt, $BLANKS, NIL, UNPROVIDED);
                        final SubLObject query_mt = query_mt_for_task($current_tl_task$.getDynamicValue(thread));
                        SubLObject fragments_with_term = NIL;
                        SubLObject unknown_questions = NIL;
                        SubLObject cdolist_list_var = raw_fragments;
                        SubLObject fragment = NIL;
                        fragment = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != cycl_utilities.expression_find(v_term, fragment.first(), T, EQUAL, UNPROVIDED)) {
                                fragments_with_term = cons(fragment, fragments_with_term);
                                final SubLObject focal_arg_positions = cycl_utilities.arg_positions_dfs(v_term, fragment.first(), UNPROVIDED);
                                final SubLObject items_var = term_learner_types_for_fragment(focal_arg_positions, fragment, term_phrase, cure_default_generation_mt(UNPROVIDED), query_mt, followup_query_mt, T, T);
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
                                        unknown_questions = cons(item, unknown_questions);
                                    }
                                } else {
                                    SubLObject cdolist_list_var_$65 = items_var;
                                    SubLObject item2 = NIL;
                                    item2 = cdolist_list_var_$65.first();
                                    while (NIL != cdolist_list_var_$65) {
                                        unknown_questions = cons(item2, unknown_questions);
                                        cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                                        item2 = cdolist_list_var_$65.first();
                                    } 
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            fragment = cdolist_list_var.first();
                        } 
                        format(T, $str416$_______________________________Fo, user);
                        format(T, $str417$_______________________________Fo, followup_query_mt);
                        format(T, $str418$_______________________________Fr);
                        format_nil.print_one_per_line(raw_fragments, UNPROVIDED);
                        format(T, $str419$_______________________________Fr, v_term);
                        format_nil.print_one_per_line(fragments_with_term, UNPROVIDED);
                        format(T, $str420$_______________________________Un, v_term);
                        format_nil.print_one_per_line(unknown_questions, UNPROVIDED);
                    } finally {
                        $current_tl_task$.rebind(_prev_bind_0_$64, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$63, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_followup_query_mt_for_user() {
        final SubLObject cs = $followup_query_mt_for_user_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_followup_query_mt_for_user(final SubLObject user) {
        return memoization_state.caching_state_remove_function_results_with_args($followup_query_mt_for_user_caching_state$.getGlobalValue(), list(user), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject followup_query_mt_for_user_internal(final SubLObject user) {
        final SubLObject interests = ask_utilities.query_variable($sym422$_TOPIC, listS($$interests, user, $list424), $$InferencePSC, UNPROVIDED);
        SubLObject interest_mts = NIL;
        if (NIL != valid_constantP($const425$DocumentReaderFollowupsForInteres, UNPROVIDED)) {
            SubLObject cdolist_list_var = interests;
            SubLObject interest = NIL;
            interest = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != narts_high.find_nart(list($const425$DocumentReaderFollowupsForInteres, interest))) {
                    interest_mts = cons(narts_high.nart_substitute(list($const425$DocumentReaderFollowupsForInteres, interest)), interest_mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                interest = cdolist_list_var.first();
            } 
        }
        if (NIL != list_utilities.lengthG(interest_mts, TWO_INTEGER, UNPROVIDED)) {
            return make_formula($$MtUnionFn, interest_mts, UNPROVIDED);
        }
        if (NIL != interest_mts) {
            return interest_mts.first();
        }
        return NIL;
    }

    public static SubLObject followup_query_mt_for_user(final SubLObject user) {
        SubLObject caching_state = $followup_query_mt_for_user_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FOLLOWUP_QUERY_MT_FOR_USER, $followup_query_mt_for_user_caching_state$, $int$128, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_FOLLOWUP_QUERY_MT_FOR_USER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(followup_query_mt_for_user_internal(user)));
            memoization_state.caching_state_put(caching_state, user, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject default_followup_query_mt(SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        return followup_query_mt_for_userXtask(user, task);
    }

    public static SubLObject clear_followup_query_mt_for_userXtask() {
        final SubLObject cs = $followup_query_mt_for_userXtask_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_followup_query_mt_for_userXtask(final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($followup_query_mt_for_userXtask_caching_state$.getGlobalValue(), list(user, task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject followup_query_mt_for_userXtask_internal(final SubLObject user, final SubLObject task) {
        final SubLObject mt_from_query = ask_utilities.query_variable($sym429$_MT, listS($$defaultCUREGuidanceMt, list($$SpecificationVariantFn, $list432, $$analysisTask, task), $list434), $$InferencePSC, UNPROVIDED).first();
        final SubLObject mt_from_user = followup_query_mt_for_user(user);
        final SubLObject mt = ((NIL != mt_from_query) && (NIL != mt_from_user)) ? list($$MtUnionFn, mt_from_query, mt_from_user) : NIL != mt_from_query ? mt_from_query : NIL != mt_from_user ? mt_from_user : NIL;
        return czer_main.canonicalize_term(mt, UNPROVIDED);
    }

    public static SubLObject followup_query_mt_for_userXtask(final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        SubLObject caching_state = $followup_query_mt_for_userXtask_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK, $sym435$_FOLLOWUP_QUERY_MT_FOR_USER_TASK_CACHING_STATE_, $int$128, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym436$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER_TASK);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(user, task);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (user.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && task.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(followup_query_mt_for_userXtask_internal(user, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(user, task));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_term_learner_known_bindings_for_sentence() {
        final SubLObject cs = $term_learner_known_bindings_for_sentence_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_known_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props) {
        if (inference_props == UNPROVIDED) {
            inference_props = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_known_bindings_for_sentence_caching_state$.getGlobalValue(), list(sentence, mt, inference_props), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_known_bindings_for_sentence_internal(SubLObject sentence, final SubLObject mt, SubLObject inference_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_props = inference_datastructures_enumerated_types.merge_query_properties(inference_props, $list438);
        final SubLObject arg0 = cycl_utilities.formula_arg0(sentence);
        if (arg0.eql($$isa)) {
            sentence = replace_formula_arg(ZERO_INTEGER, $$nearestIsa, sentence);
        } else
            if ((NIL == forts.fort_p(arg0)) || (NIL == genl_predicates.genl_predP(arg0, $$isa, UNPROVIDED, UNPROVIDED))) {
                if (arg0.eql($$genls)) {
                    sentence = replace_formula_arg(ZERO_INTEGER, $$nearestGenls, sentence);
                } else
                    if ((NIL != forts.fort_p(arg0)) && (NIL != genl_predicates.genl_predP(arg0, $$genls, UNPROVIDED, UNPROVIDED))) {
                        sentence = list($$assertedSentence, sentence);
                    } else
                        if ((NIL == $cure_show_best_bindings$.getDynamicValue(thread)) && arg0.eql($$commonAilmentCause)) {
                            sentence = list($$assertedSentence, sentence);
                        } else
                            if ((NIL == $cure_show_best_bindings$.getDynamicValue(thread)) && arg0.eql($$objectFoundInLocation)) {
                                sentence = list($$assertedSentence, sentence);
                            } else
                                if ((NIL == $cure_show_best_bindings$.getDynamicValue(thread)) && arg0.eql($$properlyGeographicallySubsumes)) {
                                    sentence = list($$assertedSentence, sentence);
                                }




            }

        final SubLObject temporal_mt = (NIL != hlmt.atemporal_hlmtP(mt)) ? list($$MtSpace, $$AnytimePSC, mt) : mt;
        final SubLObject bindings_and_supports = inference_kernel.new_cyc_query(sentence, temporal_mt, inference_props);
        final SubLObject best_bindings = cure_get_best_bindings(bindings_and_supports, temporal_mt);
        return best_bindings;
    }

    public static SubLObject term_learner_known_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props) {
        if (inference_props == UNPROVIDED) {
            inference_props = NIL;
        }
        SubLObject caching_state = $term_learner_known_bindings_for_sentence_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE, $term_learner_known_bindings_for_sentence_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, inference_props);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference_props.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_known_bindings_for_sentence_internal(sentence, mt, inference_props)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, inference_props));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cure_get_best_bindings(final SubLObject bindings_and_supports, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asserted_bindings = NIL;
        SubLObject derived_bindings = NIL;
        SubLObject cdolist_list_var = bindings_and_supports;
        SubLObject binding_and_supports = NIL;
        binding_and_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding_and_supports;
            SubLObject binding_set = NIL;
            SubLObject support_set = NIL;
            destructuring_bind_must_consp(current, datum, $list448);
            binding_set = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list448);
            support_set = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject badP = NIL;
                if (NIL == badP) {
                    SubLObject csome_list_var = binding_set;
                    SubLObject binding = NIL;
                    binding = csome_list_var.first();
                    while ((NIL == badP) && (NIL != csome_list_var)) {
                        if (NIL == term_learner_possibly_relevant_generalizationP(binding.rest(), mt)) {
                            badP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        binding = csome_list_var.first();
                    } 
                }
                if (NIL == badP) {
                    if (NIL != $cure_show_best_bindings$.getDynamicValue(thread)) {
                        SubLObject binding_set_added = NIL;
                        SubLObject cdolist_list_var_$67 = support_set;
                        SubLObject support = NIL;
                        support = cdolist_list_var_$67.first();
                        while (NIL != cdolist_list_var_$67) {
                            if ((NIL != assertion_handles.assertion_p(support)) && (NIL != assertions_high.asserted_assertionP(support))) {
                                final SubLObject item_var = binding_set;
                                if (NIL == member(item_var, asserted_bindings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    asserted_bindings = cons(item_var, asserted_bindings);
                                }
                                binding_set_added = T;
                            }
                            cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                            support = cdolist_list_var_$67.first();
                        } 
                        if (NIL == binding_set_added) {
                            final SubLObject item_var = binding_set;
                            if (NIL == member(item_var, derived_bindings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                derived_bindings = cons(item_var, derived_bindings);
                            }
                        }
                    } else {
                        final SubLObject item_var2 = binding_set;
                        if (NIL == member(item_var2, asserted_bindings, symbol_function(EQL), symbol_function(IDENTITY))) {
                            asserted_bindings = cons(item_var2, asserted_bindings);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list448);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_and_supports = cdolist_list_var.first();
        } 
        return NIL != asserted_bindings ? asserted_bindings : derived_bindings;
    }

    public static SubLObject clear_term_learner_known_negated_bindings_for_sentence() {
        final SubLObject cs = $term_learner_known_negated_bindings_for_sentence_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_known_negated_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props) {
        if (inference_props == UNPROVIDED) {
            inference_props = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_known_negated_bindings_for_sentence_caching_state$.getGlobalValue(), list(sentence, mt, inference_props), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_known_negated_bindings_for_sentence_internal(final SubLObject sentence, final SubLObject mt, final SubLObject inference_props) {
        return term_learner_known_bindings_for_sentence(list($$assertedSentence, list($$not, sentence)), mt, inference_props);
    }

    public static SubLObject term_learner_known_negated_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props) {
        if (inference_props == UNPROVIDED) {
            inference_props = NIL;
        }
        SubLObject caching_state = $term_learner_known_negated_bindings_for_sentence_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE, $term_learner_known_negated_bindings_for_sentence_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, inference_props);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference_props.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_known_negated_bindings_for_sentence_internal(sentence, mt, inference_props)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, inference_props));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_term_learner_types_for_fragment() {
        final SubLObject cs = $term_learner_types_for_fragment_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_types_for_fragment(final SubLObject focal_arg_positions, final SubLObject fragment, final SubLObject term_phrase, final SubLObject nl_mt, final SubLObject domain_mt, final SubLObject followup_query_mt, SubLObject unknown_onlyP, SubLObject questions_onlyP) {
        if (unknown_onlyP == UNPROVIDED) {
            unknown_onlyP = NIL;
        }
        if (questions_onlyP == UNPROVIDED) {
            questions_onlyP = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_types_for_fragment_caching_state$.getGlobalValue(), list(focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt, followup_query_mt, unknown_onlyP, questions_onlyP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_types_for_fragment_internal(final SubLObject focal_arg_positions, final SubLObject fragment, final SubLObject term_phrase, final SubLObject nl_mt, final SubLObject domain_mt, final SubLObject followup_query_mt, final SubLObject unknown_onlyP, final SubLObject questions_onlyP) {
        SubLObject cycl = cae_query_search.cae_query_search_fragment_formula(fragment);
        final SubLObject fragment_justification = cae_query_search.cae_query_search_fragment_justification(fragment);
        SubLObject term_learner_types = NIL;
        final SubLObject known_binding_lists = term_learner_known_bindings_for_sentence(cycl, domain_mt, UNPROVIDED);
        final SubLObject known_negated_binding_lists = term_learner_known_negated_bindings_for_sentence(cycl, domain_mt, UNPROVIDED);
        final SubLObject binding_constraints = term_learner_known_value_constraints_for_sentence(cycl, followup_query_mt);
        final SubLObject available_binding_lists = binding_lists_passing_constraints(known_binding_lists, binding_constraints, domain_mt);
        final SubLObject available_negated_binding_lists = binding_lists_passing_constraints(known_negated_binding_lists, binding_constraints, domain_mt);
        SubLObject bindings_lists = NIL;
        SubLObject negated_bindings_lists = NIL;
        final SubLObject default_unbound_bindings = default_unbound_bindings_for_fragment(cycl, followup_query_mt);
        if ((NIL == unknown_onlyP) || (NIL == available_binding_lists)) {
            if ((NIL != questions_onlyP) || (NIL != unknown_onlyP)) {
                cycl = bindings.apply_bindings(default_unbound_bindings, cycl);
                bindings_lists = list(NIL);
                negated_bindings_lists = list(NIL);
            } else
                if ((NIL != available_binding_lists) || (NIL != available_negated_binding_lists)) {
                    bindings_lists = available_binding_lists;
                    negated_bindings_lists = available_negated_binding_lists;
                    if (NIL != should_add_empty_bindingsP(bindings_lists, negated_bindings_lists, cycl, followup_query_mt)) {
                        bindings_lists = cons(NIL, bindings_lists);
                    }
                } else {
                    bindings_lists = list(NIL);
                    negated_bindings_lists = NIL;
                    cycl = bindings.apply_bindings(default_unbound_bindings, cycl);
                }

        }
        SubLObject cdolist_list_var = bindings_lists;
        SubLObject current_bindings = NIL;
        current_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_sentence = bindings.apply_bindings(current_bindings, cycl);
            final SubLObject suggestions = term_learner_candidate_replacements_for_sentence(focal_arg_positions, current_sentence, followup_query_mt);
            final SubLObject source_renderers = term_learner_source_renderers_for_sentence(current_sentence, domain_mt);
            final SubLObject justifications = new_term_learner_justifications(term_phrase, $str50$, $USER, source_renderers, UNPROVIDED);
            term_learner_types = cons(term_learner_type_for_fragment_int(current_sentence, followup_query_mt, cycl, current_bindings, suggestions, justifications, fragment_justification, nl_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), term_learner_types);
            cdolist_list_var = cdolist_list_var.rest();
            current_bindings = cdolist_list_var.first();
        } 
        cdolist_list_var = negated_bindings_lists;
        current_bindings = NIL;
        current_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject negated_cycl = list($$not, cycl);
            final SubLObject current_sentence2 = bindings.apply_bindings(current_bindings, negated_cycl);
            final SubLObject suggestions2 = term_learner_candidate_replacements_for_sentence(focal_arg_positions, current_sentence2, followup_query_mt);
            final SubLObject source_renderers2 = term_learner_source_renderers_for_sentence(current_sentence2, domain_mt);
            final SubLObject justifications2 = new_term_learner_justifications(term_phrase, $str50$, $USER, source_renderers2, UNPROVIDED);
            term_learner_types = cons(term_learner_type_for_fragment_int(current_sentence2, followup_query_mt, negated_cycl, current_bindings, suggestions2, justifications2, fragment_justification, nl_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), term_learner_types);
            cdolist_list_var = cdolist_list_var.rest();
            current_bindings = cdolist_list_var.first();
        } 
        return term_learner_types;
    }

    public static SubLObject term_learner_types_for_fragment(final SubLObject focal_arg_positions, final SubLObject fragment, final SubLObject term_phrase, final SubLObject nl_mt, final SubLObject domain_mt, final SubLObject followup_query_mt, SubLObject unknown_onlyP, SubLObject questions_onlyP) {
        if (unknown_onlyP == UNPROVIDED) {
            unknown_onlyP = NIL;
        }
        if (questions_onlyP == UNPROVIDED) {
            questions_onlyP = NIL;
        }
        SubLObject caching_state = $term_learner_types_for_fragment_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_TYPES_FOR_FRAGMENT, $term_learner_types_for_fragment_caching_state$, NIL, EQUAL, EIGHT_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_TYPES_FOR_FRAGMENT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_8(focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt, followup_query_mt, unknown_onlyP, questions_onlyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (focal_arg_positions.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (fragment.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (term_phrase.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (nl_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (domain_mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (followup_query_mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (unknown_onlyP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && questions_onlyP.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_types_for_fragment_internal(focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt, followup_query_mt, unknown_onlyP, questions_onlyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt, followup_query_mt, unknown_onlyP, questions_onlyP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject should_add_empty_bindingsP(final SubLObject known_bindings_lists, final SubLObject known_negated_bindings_lists, final SubLObject cycl, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == known_bindings_lists) && (NIL != member(NIL, known_negated_bindings_lists, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == known_bindings_lists) {
            return T;
        }
        final SubLObject pred = cycl_utilities.formula_arg0(cycl);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return makeBoolean(NIL == kb_mapping_utilities.pred_values(pred, $$singleEntryFormatInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject default_unbound_bindings_for_fragment(final SubLObject cycl, final SubLObject mt) {
        final SubLObject free_vars = obsolete.formula_free_variables(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_bindings = NIL;
        SubLObject cdolist_list_var = free_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constraints = html_complete.get_arg_constraints_for_var(cycl, var, mt);
            SubLObject cdolist_list_var_$68;
            final SubLObject isa_constraints = cdolist_list_var_$68 = getf(constraints, $ISA, UNPROVIDED);
            SubLObject constraint_cycl = NIL;
            constraint_cycl = cdolist_list_var_$68.first();
            while (NIL != cdolist_list_var_$68) {
                if ((NIL != genls.genlP(constraint_cycl, $$List, mt, UNPROVIDED)) && (NIL == genls.genlP(constraint_cycl, $$CharacterString, mt, UNPROVIDED))) {
                    final SubLObject exp_with_all_vars = list($$and, new_bindings, cycl);
                    final SubLObject new_var1 = czer_utilities.unique_el_var_wrt_expression(exp_with_all_vars, $sym282$_X);
                    final SubLObject new_var2 = czer_utilities.unique_el_var_wrt_expression(exp_with_all_vars, $sym458$_Y);
                    new_bindings = cons(bindings.make_variable_binding(var, list($$TheList, new_var1, new_var2)), new_bindings);
                }
                cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                constraint_cycl = cdolist_list_var_$68.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return new_bindings;
    }

    public static SubLObject binding_lists_passing_constraints(final SubLObject binding_lists, final SubLObject binding_constraints, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject binding_list = NIL;
        binding_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term_learner_meets_constraints(binding_list, binding_constraints, mt)) {
                result = cons(binding_list, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject term_learner_meets_constraints(final SubLObject binding_set, final SubLObject binding_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = binding_constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject possibly_met_constraint = NIL;
            SubLObject must_be_met_constraint = NIL;
            destructuring_bind_must_consp(current, datum, $list460);
            possibly_met_constraint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list460);
            must_be_met_constraint = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != ask_utilities.query_boolean(bindings.apply_bindings(binding_set, possibly_met_constraint), mt, UNPROVIDED)) && (NIL == ask_utilities.query_boolean(bindings.apply_bindings(binding_set, must_be_met_constraint), mt, UNPROVIDED))) {
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list460);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject term_learner_known_value_constraints_for_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject raw_constraints = ask_utilities.query_template($list461, listS($const462$constrainKnownValuesForPredRelati, pred, $list461), mt, UNPROVIDED);
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var = raw_constraints;
        SubLObject raw_constraint = NIL;
        raw_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_constraint;
            SubLObject allowed_val = NIL;
            SubLObject allowed_pos = NIL;
            SubLObject known_val = NIL;
            SubLObject known_pos = NIL;
            destructuring_bind_must_consp(current, datum, $list463);
            allowed_val = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list463);
            allowed_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list463);
            known_val = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list463);
            known_pos = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject allowed_var = cycl_utilities.formula_arg(sentence, allowed_pos, UNPROVIDED);
                final SubLObject known_var = cycl_utilities.formula_arg(sentence, known_pos, UNPROVIDED);
                constraints = cons(list(list($$isa, known_var, known_val), list($$isa, allowed_var, allowed_val)), constraints);
            } else {
                cdestructuring_bind_error(datum, $list463);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_constraint = cdolist_list_var.first();
        } 
        return constraints;
    }

    public static SubLObject term_learner_source_renderers_for_sentence(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject asserts = term_learner_find_visible_assertions_cycl(sentence, domain_mt);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = asserts;
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt = assertions_high.assertion_mt(v_assert);
            SubLObject cdolist_list_var_$69;
            final SubLObject v_sources = cdolist_list_var_$69 = sources_of_mt(mt, $$InferencePSC);
            SubLObject source = NIL;
            source = cdolist_list_var_$69.first();
            while (NIL != cdolist_list_var_$69) {
                if (cycl_utilities.formula_arg0(source).equal($$SentenceOfCWFn)) {
                    final SubLObject base_source = cycl_utilities.formula_arg_position(source, $list465, UNPROVIDED);
                    SubLObject source_string = NIL;
                    if (cycl_utilities.formula_arg_position(source, $list466, UNPROVIDED).equal($$WebPageCWFn)) {
                        source_string = cycl_utilities.formula_arg_position(source, $list468, UNPROVIDED);
                    } else {
                        source_string = pph_main.generate_phrase(base_source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    result = cons(new_term_learner_open_select_renderer(NIL, list(list(source_string, source, T)), source, UNPROVIDED, UNPROVIDED), result);
                }
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                source = cdolist_list_var_$69.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject clear_sources_of_mt() {
        final SubLObject cs = $sources_of_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sources_of_mt(final SubLObject source_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args($sources_of_mt_caching_state$.getGlobalValue(), list(source_mt, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sources_of_mt_internal(final SubLObject source_mt, final SubLObject mt) {
        return ask_utilities.query_variable($sym470$_PCW, list($$and, listS($$contextOfPCWInterpretation, $sym470$_PCW, source_mt, $list472)), mt, UNPROVIDED);
    }

    public static SubLObject sources_of_mt(final SubLObject source_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject caching_state = $sources_of_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOURCES_OF_MT, $sources_of_mt_caching_state$, $int$100, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SOURCES_OF_MT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(source_mt, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (source_mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sources_of_mt_internal(source_mt, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(source_mt, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject java_rendering_cycl(final SubLObject obj) {
        return second(obj);
    }

    public static SubLObject java_rendering_string(final SubLObject obj) {
        return pph_utilities.pph_javalist_string(obj.first());
    }

    public static SubLObject java_rendering_p(final SubLObject obj) {
        return makeBoolean((obj.isList() && (NIL != cycl_grammar.cycl_represented_term_p(java_rendering_cycl(obj)))) && (NIL != pph_utilities.pph_javalist_p(obj.first())));
    }

    public static SubLObject java_rendering_to_selection_renderer(final SubLObject obj) {
        final SubLObject cycl = java_rendering_cycl(obj);
        final SubLObject string = java_rendering_string(obj);
        final SubLObject cycl_id = document_annotation_widgets.term_learner_id(cycl);
        return list($STRING, string, $VALID, T, $CYCL, cycl, $CYCL_ID, cycl_id);
    }

    public static SubLObject term_learner_candidate_hierarchical_replacements_for_sentence(final SubLObject sentence_id, final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE, sentence_id, user, task));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE, sentence_id, user, task));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject this_task = (NIL != task) ? task : default_task_for_user(user);
        final SubLObject mt = followup_query_mt_for_userXtask(user, this_task);
        final SubLObject sentence = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(sentence_id);
        return term_learner_candidate_hierarchical_replacements_for_sentence_int(NIL, sentence, mt);
    }

    public static SubLObject term_learner_candidate_hierarchical_replacements_for_sentence_int(final SubLObject focal_arg_positions, final SubLObject sentence, final SubLObject mt) {
        final SubLObject raw_suggestions = gke_main.candidate_replacement_renderers_for_sentence(sentence, mt, UNPROVIDED);
        SubLObject good_suggestions = NIL;
        SubLObject cdolist_list_var = raw_suggestions;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject arg_pos = NIL;
            SubLObject suggestions = NIL;
            destructuring_bind_must_consp(current, datum, $list476);
            arg_pos = current.first();
            current = suggestions = current.rest();
            if (NIL == subl_promotions.memberP(arg_pos, focal_arg_positions, EQUAL, UNPROVIDED)) {
                SubLObject hierarchical = second(suggestions);
                final SubLObject alphabetical = suggestions.first();
                if (hierarchical.equal(NIL)) {
                    hierarchical = convert_alphabetical_to_hierarchical_replacements(alphabetical);
                }
                hierarchical = list(hierarchical);
                good_suggestions = list_utilities.alist_enter(good_suggestions, arg_pos, transform_list_utilities.transform(hierarchical, JAVA_RENDERING_P, JAVA_RENDERING_TO_SELECTION_RENDERER, UNPROVIDED), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return good_suggestions;
    }

    public static SubLObject convert_alphabetical_to_hierarchical_replacements(final SubLObject alpha_suggestions) {
        SubLObject hier_suggestions = NIL;
        SubLObject cdolist_list_var = alpha_suggestions;
        SubLObject alpha_suggestion = NIL;
        alpha_suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hier_suggestions = cons(list(alpha_suggestion), hier_suggestions);
            cdolist_list_var = cdolist_list_var.rest();
            alpha_suggestion = cdolist_list_var.first();
        } 
        return nreverse(hier_suggestions);
    }

    public static SubLObject term_learner_candidate_replacements_for_sentence(final SubLObject focal_arg_positions, final SubLObject sentence, final SubLObject mt) {
        final SubLObject raw_suggestions = gke_main.candidate_replacements_for_sentence(sentence, mt);
        SubLObject good_suggestions = NIL;
        SubLObject cdolist_list_var = raw_suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_pos = suggestion.first();
            if ((NIL == subl_promotions.memberP(arg_pos, focal_arg_positions, EQUAL, UNPROVIDED)) && (NIL == fort_types_interface.predicate_p(cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED)))) {
                good_suggestions = cons(suggestion, good_suggestions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        return good_suggestions;
    }

    public static SubLObject term_learner_candidate_replacements_for_arg_positions_in_sentence(final SubLObject arg_positions, final SubLObject sentence, final SubLObject mt) {
        final SubLObject raw_suggestions = gke_main.candidate_replacements_for_sentence(sentence, mt);
        SubLObject good_suggestions = NIL;
        SubLObject cdolist_list_var = raw_suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_pos = suggestion.first();
            if (NIL != subl_promotions.memberP(arg_pos, arg_positions, EQUAL, UNPROVIDED)) {
                good_suggestions = cons(suggestion, good_suggestions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        return good_suggestions;
    }

    public static SubLObject clear_get_arg_positions_for_terms() {
        final SubLObject cs = $get_arg_positions_for_terms_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_arg_positions_for_terms(final SubLObject sentence, final SubLObject terms) {
        return memoization_state.caching_state_remove_function_results_with_args($get_arg_positions_for_terms_caching_state$.getGlobalValue(), list(sentence, terms), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_arg_positions_for_terms_internal(final SubLObject sentence, final SubLObject terms) {
        SubLObject arg_poses = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var = cycl_utilities.arg_positions_dfs(v_term, sentence, UNPROVIDED);
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
                    arg_poses = cons(item, arg_poses);
                }
            } else {
                SubLObject cdolist_list_var_$70 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$70.first();
                while (NIL != cdolist_list_var_$70) {
                    arg_poses = cons(item2, arg_poses);
                    cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                    item2 = cdolist_list_var_$70.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return arg_poses;
    }

    public static SubLObject get_arg_positions_for_terms(final SubLObject sentence, final SubLObject terms) {
        SubLObject caching_state = $get_arg_positions_for_terms_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ARG_POSITIONS_FOR_TERMS, $get_arg_positions_for_terms_caching_state$, $int$128, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, terms);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && terms.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_arg_positions_for_terms_internal(sentence, terms)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, terms));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject term_learner_consolidate_javalist_for_arg_positions(final SubLObject cycl_sentence, final SubLObject javalist, final SubLObject arg_positions) {
        SubLObject new_javalist_items = NIL;
        SubLObject current_items = NIL;
        SubLObject current_argpos = NIL;
        SubLObject csome_list_var = pph_utilities.pph_njavalist_items(javalist);
        SubLObject item = NIL;
        item = csome_list_var.first();
        while (NIL != csome_list_var) {
            final SubLObject item_argpos = pph_utilities.pph_javalist_item_arg_position(item);
            if (((NIL != current_items) && item_argpos.isList()) && (NIL == list_prefixP(current_argpos, item_argpos))) {
                new_javalist_items = consolidate_and_add_new_javalist_items(new_javalist_items, cycl_sentence, current_argpos, current_items);
                current_argpos = NIL;
                current_items = NIL;
            }
            final SubLObject subsuming_argpos = argpos_subsumes(item_argpos, arg_positions);
            if (NIL != subsuming_argpos) {
                current_items = cons(item, current_items);
                current_argpos = subsuming_argpos;
            } else
                if ((!item_argpos.isList()) && (NIL != current_items)) {
                    current_items = cons(item, current_items);
                } else {
                    new_javalist_items = cons(item, new_javalist_items);
                }

            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
        } 
        new_javalist_items = consolidate_and_add_new_javalist_items(new_javalist_items, cycl_sentence, current_argpos, current_items);
        return pph_utilities.new_pph_javalist(pph_utilities.pph_javalist_string(javalist), nreverse(new_javalist_items));
    }

    public static SubLObject consolidate_and_add_new_javalist_items(SubLObject javalist_items, final SubLObject cycl_sentence, final SubLObject argpos, final SubLObject new_items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_item = (pph_utilities.pph_javalist_item_arg_position(new_items.first()) == $PPH_UNKNOWN_ARG_POSITION) ? new_items.first() : NIL;
        final SubLObject items_to_consolidate = (NIL != last_item) ? new_items.rest() : new_items;
        final SubLObject string = string_utilities.join_strings(Mapping.mapcar(PPH_JAVALIST_ITEM_STRING, reverse(items_to_consolidate)), $str50$);
        final SubLObject start_char = pph_utilities.pph_javalist_item_start_char(last(items_to_consolidate, UNPROVIDED).first());
        final SubLObject v_term = cycl_utilities.formula_arg_position(cycl_sentence, argpos, UNPROVIDED);
        if (NIL != string_utilities.non_empty_stringP(string)) {
            thread.resetMultipleValues();
            final SubLObject start_tag = term_learner_anchor_tags_for_term(v_term);
            final SubLObject close_tag = thread.secondMultipleValue();
            thread.resetMultipleValues();
            javalist_items = cons(pph_utilities.new_pph_javalist_item(string, v_term, argpos, start_tag, close_tag, start_char), javalist_items);
            if (NIL != last_item) {
                javalist_items = cons(last_item, javalist_items);
            }
        }
        return javalist_items;
    }

    public static SubLObject term_learner_anchor_tags_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject open_tag = NIL;
        SubLObject close_tag = NIL;
        if (NIL != narts_high.naut_p(v_term)) {
            final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$html_generation_term_id_function$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind(CB_NAUT_FRAME, thread);
                pph_vars.$html_generation_target$.bind(pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_term_id_function$.bind(PPH_NAUT_ID_FN, thread);
                thread.resetMultipleValues();
                final SubLObject open_tag_$71 = pph_html.pph_anchor_tags_for_term(v_term);
                final SubLObject close_tag_$72 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                open_tag = open_tag_$71;
                close_tag = close_tag_$72;
            } finally {
                pph_vars.$html_generation_term_id_function$.rebind(_prev_bind_3, thread);
                pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject open_tag_$72 = pph_html.pph_anchor_tags_for_term(v_term);
            final SubLObject close_tag_$73 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            open_tag = open_tag_$72;
            close_tag = close_tag_$73;
        }
        return values(open_tag, close_tag);
    }

    public static SubLObject argpos_subsumes(final SubLObject argpos, final SubLObject argpos_list) {
        if (!argpos.isList()) {
            return NIL;
        }
        SubLObject cdolist_list_var = argpos_list;
        SubLObject possible_subsumer = NIL;
        possible_subsumer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_prefixP(possible_subsumer, argpos)) {
                return possible_subsumer;
            }
            cdolist_list_var = cdolist_list_var.rest();
            possible_subsumer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject list_prefixP(final SubLObject prefix, final SubLObject list) {
        if (!list.isList()) {
            return NIL;
        }
        return eq(ZERO_INTEGER, search(prefix, list, EQL, IDENTITY, ZERO_INTEGER, length(prefix), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject term_learner_type_for_fragment_int(final SubLObject sentence, final SubLObject domain_mt, SubLObject original_sentence, SubLObject current_bindings, SubLObject suggestions, SubLObject justifications, SubLObject fragment_justification, SubLObject nl_mt, SubLObject approval_code, SubLObject display_cycl, SubLObject status, SubLObject clarifying_cycl, SubLObject allow_arbitrary_editsP, SubLObject prevent_unassertP) {
        if (original_sentence == UNPROVIDED) {
            original_sentence = NIL;
        }
        if (current_bindings == UNPROVIDED) {
            current_bindings = NIL;
        }
        if (suggestions == UNPROVIDED) {
            suggestions = NIL;
        }
        if (justifications == UNPROVIDED) {
            justifications = list(new_term_learner_justification($str50$, $str50$, $USER, UNPROVIDED, UNPROVIDED));
        }
        if (fragment_justification == UNPROVIDED) {
            fragment_justification = NIL;
        }
        if (nl_mt == UNPROVIDED) {
            nl_mt = cure_default_generation_mt(UNPROVIDED);
        }
        if (approval_code == UNPROVIDED) {
            approval_code = NIL;
        }
        if (display_cycl == UNPROVIDED) {
            display_cycl = NIL;
        }
        if (status == UNPROVIDED) {
            status = NIL;
        }
        if (clarifying_cycl == UNPROVIDED) {
            clarifying_cycl = NIL;
        }
        if (allow_arbitrary_editsP == UNPROVIDED) {
            allow_arbitrary_editsP = NIL;
        }
        if (prevent_unassertP == UNPROVIDED) {
            prevent_unassertP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == display_cycl) {
            display_cycl = sentence;
        }
        if ($DEFAULT == justifications) {
            justifications = list(new_term_learner_justification($str50$, $str50$, $USER, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject sentence_status = term_learner_fact_status_int(sentence, domain_mt, UNPROVIDED).first();
        final SubLObject status_$75 = (NIL != allow_arbitrary_editsP) ? $term_learner_unknown_assertible$.getGlobalValue() : sentence_status;
        SubLObject renderers = NIL;
        final SubLObject default_weight = $float$0_9;
        final SubLObject open_query_variables = sentence_free_variables(original_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject open_query_var_arg_poses = get_arg_positions_for_terms(original_sentence, open_query_variables);
        final SubLObject unassertible_sentence_ids = (NIL != prevent_unassertP) ? kb_utilities.compact_hl_external_id_string(sentence) : $str50$;
        final SubLObject nl_force = ((sentence_status.eql($term_learner_unknown_assertible$.getGlobalValue()) && (NIL != closedP(display_cycl, UNPROVIDED))) && (NIL != cycl_grammar.cycl_sentence_p(display_cycl))) ? $INTERROGATIVE : $DEFAULT;
        SubLObject list_item_arg_poses = NIL;
        SubLObject olist = NIL;
        if (NIL != $cure_edit_the_list_termsP$.getDynamicValue(thread)) {
            list_item_arg_poses = cure_list_item_arg_poses(sentence);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_consolidate_javalistsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        try {
            pph_vars.$pph_consolidate_javalistsP$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(T, thread);
            olist = cae_query_search.get_gloss_olist_for_indexed_query(display_cycl, nl_mt, domain_mt, $DEFAULT, nl_force, allow_arbitrary_editsP);
            if (NIL == olist) {
                return NIL;
            }
            final SubLObject clarifying_olist = (NIL != clarifying_cycl) ? pph_main.generate_pph_output_list(clarifying_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            if (NIL != clarifying_olist) {
                olist = cconcatenate(olist, new SubLObject[]{ list(pph_question.new_pph_phrase_filler_item($str486$__)), clarifying_olist, list(pph_question.new_pph_phrase_filler_item($str487$_)) });
            }
        } finally {
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_consolidate_javalistsP$.rebind(_prev_bind_0, thread);
        }
        assert NIL != pph_phrase.pph_phrase_output_list_p(olist) : "pph_phrase.pph_phrase_output_list_p(olist) " + "CommonSymbols.NIL != pph_phrase.pph_phrase_output_list_p(olist) " + olist;
        SubLObject start_char_index = ZERO_INTEGER;
        SubLObject end_char_index = ZERO_INTEGER;
        final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(olist, T);
        final SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
        final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(olist);
        while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
            final SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
            final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
            start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
            if (start_char_index.numG(end_char_index)) {
                final SubLObject v_pph_string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                final SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
                final SubLObject html_open_tag = NIL;
                final SubLObject html_close_tag = NIL;
                final SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
                final SubLObject item_$76 = pph_question.new_pph_phrase_filler_item(v_pph_string);
                final SubLObject start_char_index_$77 = end_char_index;
                final SubLObject string = pph_string.pph_string_to_cycl(v_pph_string);
                final SubLObject item_cycl = pph_data_structures.pph_phrase_output_item_cycl(item_$76);
                final SubLObject arg_pos = pph_data_structures.pph_phrase_output_item_arg_position(item_$76);
                final SubLObject current_value = (NIL != cycl_grammar.cycl_variable_p(item_cycl)) ? bindings.variable_lookup(item_cycl, current_bindings) : item_cycl;
                final SubLObject duplicatableP = subl_promotions.memberP(arg_pos, list_item_arg_poses, EQUAL, UNPROVIDED);
                final SubLObject agr_preds = (NIL != pph_data_structures.pph_phrase_output_item_agr_pred(item_$76)) ? list(pph_data_structures.pph_phrase_output_item_agr_pred(item_$76)) : $DEFAULT;
                if ((NIL != term_learner_unmodifiable_statusP(status_$75)) && item_cycl.isString()) {
                    renderers = cons(new_term_learner_string_renderer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED), renderers);
                } else
                    if (NIL != term_learner_unmodifiable_statusP(status_$75)) {
                        renderers = cons(new_term_learner_string_renderer(string, item_cycl, UNPROVIDED, UNPROVIDED), renderers);
                    } else
                        if (item_cycl.isString() && (NIL == pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item_$76)))) {
                            renderers = cons(new_term_learner_uninterpreted_renderer(string, arg_pos, sentence), renderers);
                        } else
                            if ((NIL != subl_promotions.memberP(item_cycl, open_query_variables, UNPROVIDED, UNPROVIDED)) && (NIL != constraint_filters.any_spec_ofP(at_var_types.formula_variable_isa_constraints(item_cycl, original_sentence, $$InferencePSC, UNPROVIDED), $$CharacterString, $$InferencePSC))) {
                                renderers = cons(new_term_learner_uninterpreted_renderer($str50$, arg_pos, sentence), renderers);
                            } else
                                if (NIL != constraint_filters.any_spec_ofP(at_var_types.formula_variable_isa_constraints(item_cycl, original_sentence, $$InferencePSC, UNPROVIDED), $$CharacterString, $$InferencePSC)) {
                                    renderers = cons(new_term_learner_uninterpreted_renderer(item_cycl, arg_pos, sentence), renderers);
                                } else
                                    if (NIL != get_suggested_cycls_for_arg_pos(suggestions, arg_pos)) {
                                        final SubLObject arg_suggestions = get_suggested_cycls_for_arg_pos(suggestions, arg_pos);
                                        final SubLObject arg_constraints = html_complete.get_arg_constraints_for_arg(sentence, arg_pos, domain_mt);
                                        final SubLObject suggestions_and_current_value = (NIL != current_value) ? list_utilities.snoc(current_value, remove(current_value, arg_suggestions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : list_utilities.snoc($CHOOSE_A_VALUE, arg_suggestions);
                                        final SubLObject selected_suggestion = (NIL != current_value) ? get_initial_suggestion_from_suggestions(arg_suggestions, current_value) : $$$Choose_a_value;
                                        final SubLObject triples = (NIL != list_utilities.lengthL(arg_suggestions, $int$40, UNPROVIDED)) ? make_nl_cycl_valid_triples_for_cycls(suggestions_and_current_value, agr_preds) : make_nl_cycl_valid_triples_for_cycls(last(suggestions_and_current_value, UNPROVIDED), agr_preds);
                                        renderers = cons(new_term_learner_open_select_renderer(arg_pos, triples, selected_suggestion, arg_constraints, UNPROVIDED), renderers);
                                    } else
                                        if (NIL != subl_promotions.memberP(item_cycl, open_query_variables, UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos, domain_mt);
                                            renderers = cons(new_term_learner_open_select_renderer(arg_pos, make_nl_cycl_valid_triples_for_cycls(NIL != current_value ? list(current_value) : NIL, agr_preds), current_value, arg_constraints2, duplicatableP), renderers);
                                        } else
                                            if (NIL != subl_promotions.memberP(arg_pos, open_query_var_arg_poses, UNPROVIDED, UNPROVIDED)) {
                                                final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos, domain_mt);
                                                renderers = cons(new_term_learner_open_select_renderer(arg_pos, make_nl_cycl_valid_triples_for_cycls(list(cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED)), agr_preds), current_value, arg_constraints2, T), renderers);
                                            } else
                                                if (NIL != duplicatableP) {
                                                    final SubLObject arg_suggestions = get_suggested_cycls_for_arg_pos(suggestions, arg_pos);
                                                    final SubLObject arg_constraints = html_complete.get_arg_constraints_for_arg(sentence, arg_pos, domain_mt);
                                                    final SubLObject suggestions_and_current_value = (NIL != current_value) ? list_utilities.snoc(current_value, remove(current_value, arg_suggestions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : list_utilities.snoc($CHOOSE_A_VALUE, arg_suggestions);
                                                    final SubLObject selected_suggestion = (NIL != current_value) ? get_initial_suggestion_from_suggestions(arg_suggestions, current_value) : $$$Choose_a_value;
                                                    final SubLObject triples = (NIL != list_utilities.lengthL(arg_suggestions, $int$40, UNPROVIDED)) ? make_nl_cycl_valid_triples_for_cycls(suggestions_and_current_value, agr_preds) : make_nl_cycl_valid_triples_for_cycls(last(suggestions_and_current_value, UNPROVIDED), agr_preds);
                                                    renderers = cons(new_term_learner_open_select_renderer(arg_pos, triples, selected_suggestion, arg_constraints, T), renderers);
                                                } else
                                                    if (((NIL == $cure_allow_some_predicates_to_be_edited$.getDynamicValue(thread)) || (!arg_pos.equalp($list492))) && (NIL != cure_editable_itemP(item_cycl, allow_arbitrary_editsP))) {
                                                        final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos, domain_mt);
                                                        renderers = cons(new_term_learner_open_select_renderer(arg_pos, make_nl_cycl_valid_triples_for_cycls(NIL != current_value ? list(item_cycl) : NIL, agr_preds), item_cycl, arg_constraints2, UNPROVIDED), renderers);
                                                    } else
                                                        if (NIL != forts.fort_p(item_cycl)) {
                                                            renderers = cons(new_term_learner_string_renderer(string, item_cycl, UNPROVIDED, UNPROVIDED), renderers);
                                                        } else {
                                                            renderers = cons(new_term_learner_string_renderer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED), renderers);
                                                        }










            }
            end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
            final SubLObject v_pph_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
            final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
            final SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
            final SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
            final SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject item_$77 = item;
            final SubLObject string2 = pph_string.pph_string_to_cycl(v_pph_string);
            final SubLObject item_cycl2 = pph_data_structures.pph_phrase_output_item_cycl(item_$77);
            final SubLObject arg_pos2 = pph_data_structures.pph_phrase_output_item_arg_position(item_$77);
            final SubLObject current_value2 = (NIL != cycl_grammar.cycl_variable_p(item_cycl2)) ? bindings.variable_lookup(item_cycl2, current_bindings) : item_cycl2;
            final SubLObject duplicatableP2 = subl_promotions.memberP(arg_pos2, list_item_arg_poses, EQUAL, UNPROVIDED);
            final SubLObject agr_preds2 = (NIL != pph_data_structures.pph_phrase_output_item_agr_pred(item_$77)) ? list(pph_data_structures.pph_phrase_output_item_agr_pred(item_$77)) : $DEFAULT;
            if ((NIL != term_learner_unmodifiable_statusP(status_$75)) && item_cycl2.isString()) {
                renderers = cons(new_term_learner_string_renderer(string2, UNPROVIDED, UNPROVIDED, UNPROVIDED), renderers);
            } else
                if (NIL != term_learner_unmodifiable_statusP(status_$75)) {
                    renderers = cons(new_term_learner_string_renderer(string2, item_cycl2, UNPROVIDED, UNPROVIDED), renderers);
                } else
                    if (item_cycl2.isString() && (NIL == pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item_$77)))) {
                        renderers = cons(new_term_learner_uninterpreted_renderer(string2, arg_pos2, sentence), renderers);
                    } else
                        if ((NIL != subl_promotions.memberP(item_cycl2, open_query_variables, UNPROVIDED, UNPROVIDED)) && (NIL != constraint_filters.any_spec_ofP(at_var_types.formula_variable_isa_constraints(item_cycl2, original_sentence, $$InferencePSC, UNPROVIDED), $$CharacterString, $$InferencePSC))) {
                            renderers = cons(new_term_learner_uninterpreted_renderer($str50$, arg_pos2, sentence), renderers);
                        } else
                            if (NIL != constraint_filters.any_spec_ofP(at_var_types.formula_variable_isa_constraints(item_cycl2, original_sentence, $$InferencePSC, UNPROVIDED), $$CharacterString, $$InferencePSC)) {
                                renderers = cons(new_term_learner_uninterpreted_renderer(item_cycl2, arg_pos2, sentence), renderers);
                            } else
                                if (NIL != get_suggested_cycls_for_arg_pos(suggestions, arg_pos2)) {
                                    final SubLObject arg_suggestions2 = get_suggested_cycls_for_arg_pos(suggestions, arg_pos2);
                                    final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos2, domain_mt);
                                    final SubLObject suggestions_and_current_value2 = (NIL != current_value2) ? list_utilities.snoc(current_value2, remove(current_value2, arg_suggestions2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : list_utilities.snoc($CHOOSE_A_VALUE, arg_suggestions2);
                                    final SubLObject selected_suggestion2 = (NIL != current_value2) ? get_initial_suggestion_from_suggestions(arg_suggestions2, current_value2) : $$$Choose_a_value;
                                    final SubLObject triples2 = (NIL != list_utilities.lengthL(arg_suggestions2, $int$40, UNPROVIDED)) ? make_nl_cycl_valid_triples_for_cycls(suggestions_and_current_value2, agr_preds2) : make_nl_cycl_valid_triples_for_cycls(last(suggestions_and_current_value2, UNPROVIDED), agr_preds2);
                                    renderers = cons(new_term_learner_open_select_renderer(arg_pos2, triples2, selected_suggestion2, arg_constraints2, UNPROVIDED), renderers);
                                } else
                                    if (NIL != subl_promotions.memberP(item_cycl2, open_query_variables, UNPROVIDED, UNPROVIDED)) {
                                        final SubLObject arg_constraints3 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos2, domain_mt);
                                        renderers = cons(new_term_learner_open_select_renderer(arg_pos2, make_nl_cycl_valid_triples_for_cycls(NIL != current_value2 ? list(current_value2) : NIL, agr_preds2), current_value2, arg_constraints3, duplicatableP2), renderers);
                                    } else
                                        if (NIL != subl_promotions.memberP(arg_pos2, open_query_var_arg_poses, UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject arg_constraints3 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos2, domain_mt);
                                            renderers = cons(new_term_learner_open_select_renderer(arg_pos2, make_nl_cycl_valid_triples_for_cycls(list(cycl_utilities.formula_arg_position(sentence, arg_pos2, UNPROVIDED)), agr_preds2), current_value2, arg_constraints3, T), renderers);
                                        } else
                                            if (NIL != duplicatableP2) {
                                                final SubLObject arg_suggestions2 = get_suggested_cycls_for_arg_pos(suggestions, arg_pos2);
                                                final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos2, domain_mt);
                                                final SubLObject suggestions_and_current_value2 = (NIL != current_value2) ? list_utilities.snoc(current_value2, remove(current_value2, arg_suggestions2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : list_utilities.snoc($CHOOSE_A_VALUE, arg_suggestions2);
                                                final SubLObject selected_suggestion2 = (NIL != current_value2) ? get_initial_suggestion_from_suggestions(arg_suggestions2, current_value2) : $$$Choose_a_value;
                                                final SubLObject triples2 = (NIL != list_utilities.lengthL(arg_suggestions2, $int$40, UNPROVIDED)) ? make_nl_cycl_valid_triples_for_cycls(suggestions_and_current_value2, agr_preds2) : make_nl_cycl_valid_triples_for_cycls(last(suggestions_and_current_value2, UNPROVIDED), agr_preds2);
                                                renderers = cons(new_term_learner_open_select_renderer(arg_pos2, triples2, selected_suggestion2, arg_constraints2, T), renderers);
                                            } else
                                                if (((NIL == $cure_allow_some_predicates_to_be_edited$.getDynamicValue(thread)) || (!arg_pos2.equalp($list492))) && (NIL != cure_editable_itemP(item_cycl2, allow_arbitrary_editsP))) {
                                                    final SubLObject arg_constraints3 = html_complete.get_arg_constraints_for_arg(sentence, arg_pos2, domain_mt);
                                                    renderers = cons(new_term_learner_open_select_renderer(arg_pos2, make_nl_cycl_valid_triples_for_cycls(NIL != current_value2 ? list(item_cycl2) : NIL, agr_preds2), item_cycl2, arg_constraints3, UNPROVIDED), renderers);
                                                } else
                                                    if (NIL != forts.fort_p(item_cycl2)) {
                                                        renderers = cons(new_term_learner_string_renderer(string2, item_cycl2, UNPROVIDED, UNPROVIDED), renderers);
                                                    } else {
                                                        renderers = cons(new_term_learner_string_renderer(string2, UNPROVIDED, UNPROVIDED, UNPROVIDED), renderers);
                                                    }










        } 
        return new_term_learner_type_int(sentence, default_weight, justifications, fragment_justification, $str50$, sentence, status_$75, nreverse(renderers), original_sentence, T, T, approval_code, unassertible_sentence_ids);
    }

    public static SubLObject cure_list_item_arg_poses(final SubLObject sentence) {
        SubLObject unmergeable = NIL;
        SubLObject list_arg_poses = NIL;
        final SubLObject arg_stack = stacks.create_stack();
        final SubLObject pos_stack = stacks.create_stack();
        SubLObject arg = NIL;
        SubLObject argpos = NIL;
        stacks.stack_push(sentence, arg_stack);
        stacks.stack_push(argpos, pos_stack);
        while (NIL == stacks.stack_empty_p(arg_stack)) {
            final SubLObject entry = stacks.stack_pop(arg_stack);
            final SubLObject pos_entry = stacks.stack_pop(pos_stack);
            arg = entry;
            argpos = pos_entry;
            if (cycl_utilities.formula_arg0(arg).eql($$TheList)) {
                SubLObject arg_num = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(arg, $IGNORE);
                SubLObject list_arg = NIL;
                list_arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    arg_num = add(arg_num, ONE_INTEGER);
                    final SubLObject item_var = argpos;
                    if (NIL == member(item_var, list_arg_poses, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        list_arg_poses = cons(item_var, list_arg_poses);
                    }
                    unmergeable = cons(list_utilities.snoc(arg_num, argpos), unmergeable);
                    cdolist_list_var = cdolist_list_var.rest();
                    list_arg = cdolist_list_var.first();
                } 
            }
            final SubLObject terms = cycl_utilities.formula_terms(entry, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject arg_$79 = NIL;
            SubLObject arg_num2 = NIL;
            list_var = terms;
            arg_$79 = list_var.first();
            for (arg_num2 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg_$79 = list_var.first() , arg_num2 = number_utilities.f_1X(arg_num2)) {
                stacks.stack_push(arg_$79, arg_stack);
                stacks.stack_push(list_utilities.snoc(arg_num2, argpos), pos_stack);
            }
        } 
        return values(unmergeable, list_arg_poses);
    }

    public static SubLObject cure_editable_itemP(final SubLObject cycl, SubLObject allow_arbitrary_editsP) {
        if (allow_arbitrary_editsP == UNPROVIDED) {
            allow_arbitrary_editsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == allow_arbitrary_editsP) {
            return NIL;
        }
        if ((NIL != $cure_allow_some_predicates_to_be_edited$.getDynamicValue(thread)) && (NIL != fort_types_interface.predicate_p(cycl))) {
            return T;
        }
        if (NIL != fort_types_interface.relation_p(cycl)) {
            return NIL;
        }
        if (NIL != cycl_utilities.fort_or_naut_p(cycl)) {
            return T;
        }
        if (cycl.isNumber()) {
            return T;
        }
        return NIL;
    }

    public static SubLObject cyc_terms_to_term_learner_terms(final SubLObject terms) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list($CYCL, v_term, $CONCEPT_ID, document_annotation_widgets.term_learner_id(v_term)), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject new_term_learner_uninterpreted_renderer(final SubLObject string, final SubLObject arg_pos, SubLObject current_sentence) {
        if (current_sentence == UNPROVIDED) {
            current_sentence = NIL;
        }
        if (NIL != term_learner_documentation_sentenceP(current_sentence)) {
            return new_term_learner_modifiable_text_renderer(cycl_string.cycl_string_trim($list494, string), arg_pos);
        }
        return new_term_learner_modifiable_string_renderer(cycl_string.cycl_string_trim($list494, string), arg_pos);
    }

    public static SubLObject term_learner_types_for_sentence(final SubLObject sentence, final SubLObject user, SubLObject allow_arbitrary_editsP) {
        if (allow_arbitrary_editsP == UNPROVIDED) {
            allow_arbitrary_editsP = NIL;
        }
        return term_learner_types_for_sentence_id(kb_utilities.compact_hl_external_id_string(sentence), user, allow_arbitrary_editsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_types_for_sentence_id(final SubLObject sentence_id, final SubLObject user, SubLObject allow_arbitrary_editsP, SubLObject arg_pos_to_modify, SubLObject modify_command, SubLObject prevent_unassertP) {
        if (allow_arbitrary_editsP == UNPROVIDED) {
            allow_arbitrary_editsP = NIL;
        }
        if (arg_pos_to_modify == UNPROVIDED) {
            arg_pos_to_modify = NIL;
        }
        if (modify_command == UNPROVIDED) {
            modify_command = NIL;
        }
        if (prevent_unassertP == UNPROVIDED) {
            prevent_unassertP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_TYPES_FOR_SENTENCE_ID, sentence_id, user, allow_arbitrary_editsP, arg_pos_to_modify, modify_command, prevent_unassertP));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_TYPES_FOR_SENTENCE_ID, sentence_id, user, allow_arbitrary_editsP, arg_pos_to_modify, modify_command, prevent_unassertP));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject task = default_task_for_user(user);
        final SubLObject pph_mt = cure_default_generation_mt(task);
        final SubLObject orig_sentence = document_annotation_widgets.term_learner_object_from_id(sentence_id);
        final SubLObject new_sentence = cure_possibly_duplicate_arg(orig_sentence, arg_pos_to_modify, modify_command);
        final SubLObject justifications = list(new_term_learner_justification($str50$, $str50$, $USER, UNPROVIDED, UNPROVIDED));
        final SubLObject vars = sentence_free_variables(new_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_positions = get_arg_positions_for_terms_in_sentence(new_sentence, vars);
        final SubLObject domain_mt = query_mt_for_user_and_task(user, task);
        final SubLObject suggestions = term_learner_candidate_replacements_for_arg_positions_in_sentence(arg_positions, new_sentence, $$InferencePSC);
        return list(term_learner_type_for_fragment_int(new_sentence, domain_mt, new_sentence, NIL, suggestions, NIL, justifications, pph_mt, NIL, NIL, NIL, NIL, allow_arbitrary_editsP, prevent_unassertP));
    }

    public static SubLObject cure_possibly_duplicate_arg(SubLObject sentence, final SubLObject arg_pos_string, final SubLObject command_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cure_edit_the_list_termsP$.getDynamicValue(thread)) {
            return sentence;
        }
        if (!arg_pos_string.isString()) {
            return sentence;
        }
        final SubLObject arg_pos = read_from_string_ignoring_errors(arg_pos_string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != subl_promotions.memberP(command_string, $list497, symbol_function(EQUALP), UNPROVIDED)) && (NIL != cycl_utilities.arg_position_p(arg_pos))) {
            final SubLObject original_arg = cycl_utilities.formula_arg_position(sentence, butlast(arg_pos, UNPROVIDED), UNPROVIDED);
            final SubLObject new_arg_pos = (command_string.equal($str498$add_before)) ? subtract(last(arg_pos, UNPROVIDED).first(), ONE_INTEGER) : last(arg_pos, UNPROVIDED).first();
            SubLObject new_arg = NIL;
            final SubLObject terms = cycl_utilities.formula_terms(original_arg, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject num = NIL;
            list_var = terms;
            v_term = list_var.first();
            for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , num = number_utilities.f_1X(num)) {
                new_arg = cons(v_term, new_arg);
                if (num.eql(new_arg_pos)) {
                    new_arg = cons($sym499$_NEW_VAR, new_arg);
                }
            }
            sentence = replace_formula_arg_position(butlast(arg_pos, UNPROVIDED), nreverse(new_arg), sentence);
        } else
            if (command_string.equal($$$remove) && (NIL != cycl_utilities.arg_position_p(arg_pos))) {
                sentence = cycl_utilities.formula_arg_position_subst($delete_me_token$.getGlobalValue(), arg_pos, sentence);
                sentence = list_utilities.tree_delete($delete_me_token$.getGlobalValue(), sentence, symbol_function(EQ), UNPROVIDED);
            } else {
                Errors.warn($str501$can_t_duplicate_with_uninterpreta, command_string);
            }

        return sentence;
    }

    public static SubLObject get_arg_positions_for_terms_in_sentence(final SubLObject sentence, final SubLObject vars) {
        SubLObject arg_positions = NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var = cycl_utilities.arg_positions_dfs(var, sentence, UNPROVIDED);
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
                    arg_positions = cons(item, arg_positions);
                }
            } else {
                SubLObject cdolist_list_var_$80 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$80.first();
                while (NIL != cdolist_list_var_$80) {
                    arg_positions = cons(item2, arg_positions);
                    cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                    item2 = cdolist_list_var_$80.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static SubLObject term_learner_documentation_sentenceP(final SubLObject cycl_sentence) {
        return isa.isaP(cycl_utilities.formula_arg0(cycl_sentence), $$DocumentationPredicate, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_initial_suggestion_from_suggestions(final SubLObject suggestions, SubLObject current_value) {
        if (current_value == UNPROVIDED) {
            current_value = NIL;
        }
        if (NIL != current_value) {
            return current_value;
        }
        if (NIL != list_utilities.lengthE(suggestions, ONE_INTEGER, UNPROVIDED)) {
            return suggestions.first();
        }
        return NIL;
    }

    public static SubLObject get_suggested_cycls_for_arg_pos(final SubLObject suggestions, final SubLObject arg_pos) {
        final SubLObject suggestion_list = find(arg_pos, suggestions, EQUAL, FIRST, UNPROVIDED, UNPROVIDED);
        return suggestion_list.rest();
    }

    public static SubLObject make_nl_cycl_valid_triples_for_cycls(final SubLObject cycls, SubLObject agr_preds) {
        if (agr_preds == UNPROVIDED) {
            agr_preds = $DEFAULT;
        }
        final SubLObject generations = term_learner_cycl_terms_to_nl_strings(cycls, cure_default_generation_mt(UNPROVIDED), agr_preds);
        SubLObject triples = NIL;
        SubLObject cycl = NIL;
        SubLObject cycl_$81 = NIL;
        SubLObject generation_list = NIL;
        SubLObject generation_list_$82 = NIL;
        cycl = cycls;
        cycl_$81 = cycl.first();
        generation_list = generations;
        generation_list_$82 = generation_list.first();
        while ((NIL != generation_list) || (NIL != cycl)) {
            if (cycl_$81.equal($CHOOSE_A_VALUE)) {
                triples = cons(list($$$Choose_a_value, $$$Choose_a_value, NIL), triples);
            } else
                if (NIL == cycl_grammar.cycl_variable_p(cycl_$81)) {
                    triples = cons(list(generation_list_$82, cycl_$81, T), triples);
                }

            cycl = cycl.rest();
            cycl_$81 = cycl.first();
            generation_list = generation_list.rest();
            generation_list_$82 = generation_list.first();
        } 
        return triples;
    }

    public static SubLObject term_learner_terms_mergeableP(final SubLObject t1, final SubLObject t2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != kb_accessors.individualP(t1)) && (NIL != kb_accessors.individualP(t2))) {
                result = makeBoolean(NIL == disjoint_with.instances_of_disjoint_collectionsP(t1, t2, UNPROVIDED, UNPROVIDED));
            } else
                if ((NIL != fort_types_interface.collectionP(t1)) && (NIL != fort_types_interface.collectionP(t2))) {
                    result = makeBoolean(NIL == disjoint_with.collections_disjointP(t1, t2, UNPROVIDED));
                } else
                    if (((((NIL != fort_types_interface.collectionP(t1)) && genls.min_genls(t1, UNPROVIDED, UNPROVIDED).equal(list($$Collection))) || ((NIL != fort_types_interface.collectionP(t2)) && genls.min_genls(t2, UNPROVIDED, UNPROVIDED).equal(list($$Collection)))) || ((NIL != kb_accessors.individualP(t2)) && isa.min_isa(t2, UNPROVIDED, UNPROVIDED).equal(list($$Individual)))) || ((NIL != kb_accessors.individualP(t1)) && isa.min_isa(t1, UNPROVIDED, UNPROVIDED).equal(list($$Individual)))) {
                        result = T;
                    } else
                        if (((NIL != fort_types_interface.collectionP(t1)) && (NIL != kb_accessors.individualP(t2))) || ((NIL != kb_accessors.individualP(t1)) && (NIL != fort_types_interface.collectionP(t2)))) {
                            result = NIL;
                        }



        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_learner_string_denots(final SubLObject string) {
        final SubLObject lex_entries = methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_ingester_annotation_lexicon(UNPROVIDED), GET, string);
        final SubLObject cycls = term_lexicon.denots_for_term_lexicon_entries(lex_entries);
        return cycls;
    }

    public static SubLObject term_learner_sentence_assertibleP(final SubLObject sentence, final SubLObject mt) {
        if (NIL != el_formula_with_operator_p(sentence, $$equals)) {
            return term_learner_terms_mergeableP(cycl_utilities.formula_arg1(sentence, UNPROVIDED), cycl_utilities.formula_arg2(sentence, UNPROVIDED), UNPROVIDED);
        }
        return term_learner_sentence_assertible_intP(sentence, mt);
    }

    public static SubLObject term_learner_sentence_assertible_intP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            $within_assert$.bind(T, thread);
            wff_vars.$validate_expansionsP$.bind(T, thread);
            wff_vars.$wff_mode$.bind($LENIENT, thread);
            result = wff.el_wffP(sentence, mt, UNPROVIDED);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_6, thread);
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_5, thread);
            $within_assert$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_sentence_from_template(final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_template) {
        final SubLObject focal_term = document_annotation_widgets.term_learner_object_from_id(term_id);
        final SubLObject sentence = cycl_utilities.expression_subst(focal_term, $TERM, sentence_template, EQUAL, UNPROVIDED);
        return sentence;
    }

    public static SubLObject term_learner_relevant_sentences_from_document(final SubLObject doc, final SubLObject v_term) {
        SubLObject relevant_sentences = NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$83;
        SubLObject backwardP_var_$84;
        SubLObject length_$85;
        SubLObject v_iteration_$86;
        SubLObject element_num_$87;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$83 = document.paragraph_sentences(paragraph);
            backwardP_var_$84 = NIL;
            for (length_$85 = length(vector_var_$83), v_iteration_$86 = NIL, v_iteration_$86 = ZERO_INTEGER; v_iteration_$86.numL(length_$85); v_iteration_$86 = add(v_iteration_$86, ONE_INTEGER)) {
                element_num_$87 = (NIL != backwardP_var_$84) ? subtract(length_$85, v_iteration_$86, ONE_INTEGER) : v_iteration_$86;
                sentence = aref(vector_var_$83, element_num_$87);
                if (NIL != string_utilities.substringP(v_term, document.sentence_string(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    relevant_sentences = cons(sentence, relevant_sentences);
                }
            }
        }
        return relevant_sentences;
    }

    public static SubLObject term_learner_relevant_sentences(final SubLObject sentences, final SubLObject v_term) {
        assert NIL != listp(sentences) : "Types.listp(sentences) " + "CommonSymbols.NIL != Types.listp(sentences) " + sentences;
        assert NIL != stringp(v_term) : "Types.stringp(v_term) " + "CommonSymbols.NIL != Types.stringp(v_term) " + v_term;
        SubLObject relevant_sentences = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == string_utilities.empty_string_p(sentence)) && (NIL != string_utilities.substringP(v_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                final SubLObject item_var = sentence;
                if (NIL == member(item_var, relevant_sentences, symbol_function(EQL), symbol_function(IDENTITY))) {
                    relevant_sentences = cons(item_var, relevant_sentences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return relevant_sentences;
    }

    public static SubLObject term_learner_source_documentation_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($term_learner_source_documentation_mt$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = (NIL != constants_high.find_constant($$$WebDocumentsMt)) ? $$WebDocumentsMt : $$MassMediaDataMt;
            if (init_value == $UNINITIALIZED) {
                Errors.error($str517$Unable_to_initialize__A__, $term_learner_source_documentation_mt$.getDynamicValue(thread));
            }
            $term_learner_source_documentation_mt$.setDynamicValue(init_value, thread);
        }
        return $term_learner_source_documentation_mt$.getDynamicValue(thread);
    }

    public static SubLObject cure_default_generation_mt(SubLObject task) {
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        if (NIL != task) {
            return query_library_utils.cae_default_paraphrase_mt(task);
        }
        return term_learner_default_generation_mt();
    }

    public static SubLObject term_learner_default_generation_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $term_learner_default_generation_mt$.getDynamicValue(thread)) {
            $term_learner_default_generation_mt$.setDynamicValue(pph_vars.default_pph_language_mt(list($$TechnicalEnglishLexicalMt, $$MedicalLexicalMt)), thread);
        }
        return $term_learner_default_generation_mt$.getDynamicValue(thread);
    }

    public static SubLObject term_learner_cycl_terms_to_nl_strings(final SubLObject terms, SubLObject mt, SubLObject preds) {
        if (mt == UNPROVIDED) {
            mt = cure_default_generation_mt(UNPROVIDED);
        }
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        SubLObject params = list($PPH_LEXICAL_CONTEXT, mt);
        if (NIL != preds) {
            params = putf(params, $PPH_AGREEMENT, preds);
        }
        if (NIL == terms) {
            return NIL;
        }
        return nl_generation_api.cycl_terms_to_nl_strings_internal(terms, nl_generation_api.new_pph_parameters(params));
    }

    public static SubLObject term_learner_cycl_term_to_nl_string(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cure_default_generation_mt(UNPROVIDED);
        }
        return nl_generation_api.cycl_term_to_nl_string_internal(v_term, nl_generation_api.new_pph_parameters(list($PPH_LEXICAL_CONTEXT, mt)));
    }

    public static SubLObject merge_justifications_for_ordered_types(final SubLObject initial_results) {
        SubLObject final_result = NIL;
        SubLObject cdolist_list_var = initial_results;
        SubLObject initial_result = NIL;
        initial_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject initial_cyc_term = get_cycl(initial_result);
            final SubLObject known_results_for_term = find(initial_cyc_term, final_result, EQUAL, GET_CYCL, UNPROVIDED, UNPROVIDED);
            if (NIL != known_results_for_term) {
                final SubLObject new_justification = getf(initial_result, $JUSTIFICATION, UNPROVIDED);
                final SubLObject old_justification = getf(known_results_for_term, $JUSTIFICATIONS, UNPROVIDED);
                nsubst(cconcatenate(list(new_justification), old_justification), old_justification, known_results_for_term, UNPROVIDED, UNPROVIDED);
            } else {
                final SubLObject new_just_list = list(getf(initial_result, $JUSTIFICATION, UNPROVIDED));
                SubLObject new_result = initial_result;
                new_result = list_utilities.plist_except(new_result, $list525);
                new_result = putf(new_result, $JUSTIFICATIONS, new_just_list);
                final_result = cons(new_result, final_result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            initial_result = cdolist_list_var.first();
        } 
        return final_result;
    }

    public static SubLObject term_learner_handle_user_choice(final SubLObject choice_id, final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_template, final SubLObject justifications, final SubLObject url, final SubLObject doc_title, final SubLObject user, final SubLObject accept_rejectP, SubLObject no_substitutions) {
        if (no_substitutions == UNPROVIDED) {
            no_substitutions = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_HANDLE_USER_CHOICE, choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, accept_rejectP, no_substitutions }));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(new SubLObject[]{ TERM_LEARNER_HANDLE_USER_CHOICE, choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, accept_rejectP, no_substitutions }));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            rkf_macros.$rkf_asserting_tool$.bind($$CycAssistedDocumentReader, thread);
            final SubLObject focal_term = (NIL != cycl_grammar.cycl_represented_term_p(document_annotation_widgets.maybe_term_learner_object_from_id(term_id))) ? document_annotation_widgets.term_learner_object_from_id(term_id) : NIL;
            final SubLObject sentence = ((NIL == focal_term) || (NIL != no_substitutions)) ? sentence_template : cycl_utilities.expression_subst(focal_term, $TERM, sentence_template, EQUAL, UNPROVIDED);
            final SubLObject sentence_id = document_annotation_widgets.term_learner_id(sentence_template);
            final SubLObject _prev_bind_0_$88 = czer_vars.$simplify_using_semanticsP$.currentBinding(thread);
            try {
                czer_vars.$simplify_using_semanticsP$.bind(NIL, thread);
                final SubLObject visible_sentence = simplifier.simplify_cycl_sentence(transform_list_utilities.transform(sentence, $sym527$TERM_EXPANSION_EXPECTED_SENTENCE_, TRANSFORM_TO_TRUE, UNPROVIDED), UNPROVIDED);
                SubLObject errors = NIL;
                if (accept_rejectP.eql($ACCEPT)) {
                    SubLObject cdolist_list_var;
                    final SubLObject mts = cdolist_list_var = get_mts_for_user_choice(url, doc_title, justifications, user, UNPROVIDED);
                    SubLObject mt = NIL;
                    mt = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        errors = cons(rkf_assertion_utilities.rkf_assert_with_implicature(sentence, mt, T), errors);
                        if ((NIL != focal_term) && (NIL != string_utilities.non_empty_stringP(term_string))) {
                            term_learner_assert_lexical_info(focal_term, term_string, mt, $term_learner_default_lexical_assertion_mt$.getDynamicValue(thread), UNPROVIDED);
                        }
                        if (NIL != czer_meta.find_assertions_cycl(list($$inProgressTerm, focal_term), UNPROVIDED)) {
                            rkf_assertion_utilities.rkf_assert(list($$termDependsOn, focal_term, mts.first()), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                            term_learner_lexify_from_termstrings(focal_term, $term_learner_default_lexical_assertion_mt$.getDynamicValue(thread), mt);
                            rkf_assertion_utilities.rkf_unassert(list($$inProgressTerm, focal_term), $$UniversalVocabularyMt);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    } 
                    note_accepted_choice(term_string, focal_term, sentence, justifications, user);
                } else
                    if (accept_rejectP.eql($REJECT)) {
                        final SubLObject query_mt = find_query_mt_from_justifications(justifications, user);
                        SubLObject cdolist_list_var2;
                        final SubLObject asserted_mts = cdolist_list_var2 = Mapping.mapcar(ASSERTION_MT, czer_meta.find_visible_assertions_cycl(sentence, query_mt));
                        SubLObject mt2 = NIL;
                        mt2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            errors = cons(rkf_assertion_utilities.rkf_unassert(sentence, mt2), errors);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            mt2 = cdolist_list_var2.first();
                        } 
                    }

                errors = remove(T, errors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != errors) {
                    result = list($STATUS_CODE, FIVE_INTEGER, $CHOICE_ID, choice_id, $JUSTIFICATION, cconcatenate($$$Error_while_trying_to_handle_, new SubLObject[]{ format_nil.format_nil_a_no_copy(sentence), format_nil.$format_nil_percent$.getGlobalValue() }));
                } else
                    if (accept_rejectP == $ACCEPT) {
                        final SubLObject nl_string = get_nl_generation_for_user_added_sentence(visible_sentence);
                        final SubLObject new_sentence_id = document_annotation_widgets.term_learner_id(sentence);
                        final SubLObject utf8_sentence = unicode_nauts.convert_unicode_nauts_to_utf8_strings(sentence);
                        result = list(new SubLObject[]{ $STATUS_CODE, ONE_INTEGER, $CHOICE_ID, choice_id, $SENTENCE_ID, sentence_id, $NEW_SENTENCE_CYCL, utf8_sentence, $NEW_SENTENCE_ID, new_sentence_id, $NL_STRING, nl_string });
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$89 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    fact_sheets.update_fact_sheet_data_for_term_and_user_added_sentence(focal_term, visible_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$89, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } else {
                        result = list($STATUS_CODE, THREE_INTEGER, $CHOICE_ID, choice_id, $SENTENCE_ID, sentence_id);
                        SubLObject ignore_errors_tag2 = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$90 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence(focal_term, visible_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } catch (final Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$90, thread);
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }

            } finally {
                czer_vars.$simplify_using_semanticsP$.rebind(_prev_bind_0_$88, thread);
            }
        } finally {
            rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_3, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject note_accepted_choice(final SubLObject term_string, final SubLObject focal_term, final SubLObject sentence, final SubLObject justifications, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        final SubLObject _prev_bind_0_$91 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text($term_learner_accepted_meanings_log_file$.getDynamicValue(thread), $APPEND);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$91, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error($str31$Unable_to_open__S, $term_learner_accepted_meanings_log_file$.getDynamicValue(thread));
                        }
                        final SubLObject s = stream;
                        format(s, $str533$_accepted_meaning_date___A__user_, new SubLObject[]{ numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), kb_utilities.compact_hl_external_id_string(user), term_string, kb_utilities.compact_hl_external_id_string(focal_term), string_utilities.to_string(focal_term), kb_utilities.compact_hl_external_id_string(sentence), string_utilities.to_string(sentence), justifications });
                    } finally {
                        final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return T;
    }

    public static SubLObject get_nl_generation_for_user_added_sentence(final SubLObject sentence) {
        return term_learner_cycl_term_to_nl_string(sentence, UNPROVIDED).first();
    }

    public static SubLObject transform_to_true(final SubLObject obj) {
        return $$True;
    }

    public static SubLObject term_expansion_expected_sentenceP(final SubLObject obj) {
        return makeBoolean(((NIL != cycl_grammar.cycl_sentence_p(obj)) && (NIL != list_utilities.proper_list_p(obj))) && cycl_utilities.formula_arg0(obj).eql($$termExpansionExpected));
    }

    public static SubLObject get_mts_for_user_choice(final SubLObject url, final SubLObject doc_title, final SubLObject justifications, SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == task) {
            task = default_task_for_user(user);
        }
        user = normalize_cure_user(user);
        SubLObject result_mts = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_tl_task$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            $current_tl_task$.bind(task, thread);
            if ((NIL != cure_sort_work_by_docP(user, task)) && (NIL != user_added_term_typeP(justifications))) {
                final SubLObject base_source = find_or_create_base_source_for_url(url, doc_title, user, UNPROVIDED);
                final SubLObject assert_mt = find_or_create_user_addition_mt_for_url(url, doc_title, user);
                result_mts = list(assert_mt);
            } else
                if (NIL != cure_sort_work_by_docP(user, task)) {
                    final SubLObject base_source = find_or_create_base_source_for_url(url, doc_title, user, UNPROVIDED);
                    final SubLObject context_sentence = get_context_sentences_from_justifications(justifications).first();
                    final SubLObject base_source_mt = ensure_source_contextualized_in_spindle(base_source, get_task_source_spindle(task, user), UNPROVIDED, UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject sentence_source = find_or_create_subwork_source(base_source, context_sentence, user);
                    final SubLObject sentence_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result_mts = (NIL != sentence_mt) ? list(sentence_mt) : list(base_source_mt);
                } else
                    if (NIL != default_assert_mt_for_user_and_task(user, task)) {
                        result_mts = list(default_assert_mt_for_user_and_task(user, task));
                    } else
                        if (NIL != kb_utilities.compact_hl_external_id_stringP(url)) {
                            final SubLObject base_source = document_annotation_widgets.term_learner_object_from_id(url);
                            final SubLObject context_sentence = get_context_sentences_from_justifications(justifications).first();
                            final SubLObject base_source_mt = ensure_source_contextualized_in_spindle(base_source, get_task_source_spindle(task, user), UNPROVIDED, UNPROVIDED);
                            thread.resetMultipleValues();
                            final SubLObject sentence_source = find_or_create_subwork_source(base_source, context_sentence, user);
                            final SubLObject sentence_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result_mts = (NIL != sentence_mt) ? list(sentence_mt) : list(base_source_mt);
                        } else
                            if (NIL != all_justifications_have_specified_mtsP(justifications)) {
                                SubLObject mts = NIL;
                                SubLObject cdolist_list_var = justifications;
                                SubLObject justification = NIL;
                                justification = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    mts = cons(document_annotation_widgets.term_learner_object_from_id(getf(justification, $ASSERT_MT, UNPROVIDED)), mts);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    justification = cdolist_list_var.first();
                                } 
                                result_mts = mts;
                            } else {
                                result_mts = list(get_cure_user_addition_to_spindle_mt(user, task));
                            }




        } finally {
            $current_tl_task$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return result_mts;
    }

    public static SubLObject get_cure_user_addition_to_spindle_mt(final SubLObject user, final SubLObject task) {
        final SubLObject user_addition_mt = list($$UnsourcedDataForUserByTaskMtFn, user, task);
        return user_addition_mt;
    }

    public static SubLObject cure_sort_work_by_docP(final SubLObject user, final SubLObject task) {
        return ask_utilities.query_boolean(list($$userTaskSortsWorkBySourceDocument, user, task), $$AnalystDatabaseMt, UNPROVIDED);
    }

    public static SubLObject clear_normalize_cure_user() {
        final SubLObject cs = $normalize_cure_user_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_normalize_cure_user(final SubLObject user) {
        return memoization_state.caching_state_remove_function_results_with_args($normalize_cure_user_caching_state$.getGlobalValue(), list(user), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject normalize_cure_user_internal(final SubLObject user) {
        final SubLObject base_user = ask_utilities.query_variable($sym539$_BASE_USER, list($$cureUserModel, $sym539$_BASE_USER, $sym540$_TASK, user), $$InferencePSC, UNPROVIDED).first();
        return NIL != base_user ? base_user : user;
    }

    public static SubLObject normalize_cure_user(final SubLObject user) {
        SubLObject caching_state = $normalize_cure_user_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NORMALIZE_CURE_USER, $normalize_cure_user_caching_state$, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(normalize_cure_user_internal(user)));
            memoization_state.caching_state_put(caching_state, user, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject all_justifications_have_specified_mtsP(final SubLObject justs) {
        if (NIL == justs) {
            return NIL;
        }
        SubLObject cdolist_list_var = justs;
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (getf(just, $ASSERT_MT, $NOTHING) == $NOTHING) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject user_added_term_typeP(final SubLObject justifications) {
        SubLObject cdolist_list_var = justifications;
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != getf(just, $JUSTIFICATION, UNPROVIDED)) && (getf(getf(just, $JUSTIFICATION, UNPROVIDED), $TOOL, UNPROVIDED) == $USER)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject get_task_source_spindle(final SubLObject task, final SubLObject user) {
        return list($const546$AssistedReaderSourceSpindleForTas, task, user);
    }

    public static SubLObject clear_default_assert_mt_for_user_and_task() {
        final SubLObject cs = $default_assert_mt_for_user_and_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_default_assert_mt_for_user_and_task(final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = default_task_for_user(user);
        }
        return memoization_state.caching_state_remove_function_results_with_args($default_assert_mt_for_user_and_task_caching_state$.getGlobalValue(), list(user, task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject default_assert_mt_for_user_and_task_internal(final SubLObject user, final SubLObject task) {
        return ask_utilities.query_variable($sym429$_MT, listS($const548$assistedReaderAssertionMtForTaskA, task, user, $list434), $$InferencePSC, UNPROVIDED).first();
    }

    public static SubLObject default_assert_mt_for_user_and_task(final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = default_task_for_user(user);
        }
        SubLObject caching_state = $default_assert_mt_for_user_and_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DEFAULT_ASSERT_MT_FOR_USER_AND_TASK, $default_assert_mt_for_user_and_task_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(user, task);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (user.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && task.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(default_assert_mt_for_user_and_task_internal(user, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(user, task));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_or_create_base_source_for_url(final SubLObject url, final SubLObject title, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = $current_tl_task$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject source = NIL;
        final SubLObject date = date_utilities.indexical_today();
        final SubLObject source_spindle = get_task_source_spindle(task, user);
        SubLObject release = NIL;
        try {
            release = seize_lock($term_learner_base_source_creation_lock$.getGlobalValue());
            final SubLObject existing_sources = ask_utilities.query_variable($sym551$_CW, list($$urlOfCW, $sym551$_CW, list($$URLFn, url)), $$InferencePSC, $list554);
            if (NIL != existing_sources) {
                source = existing_sources.first();
            }
            if (NIL == source) {
                source = narts_high.nart_substitute(list($$WebPageCWFn, url));
            }
            if ((NIL != $term_learner_assert_redundant_mt_info$.getDynamicValue(thread)) || (NIL == ask_utilities.query_boolean(list($$mtSpindleMember, source_spindle, list($$ContextOfPCWFn, source)), term_learner_source_documentation_mt(), UNPROVIDED))) {
                rkf_assertion_utilities.rkf_assert(listS($$isa, source, $list557), term_learner_source_documentation_mt(), T, T);
                rkf_assertion_utilities.rkf_assert(list($$titleOfWork, source, title), $term_learner_default_lexical_assertion_mt$.getDynamicValue(thread), T, T);
                rkf_assertion_utilities.rkf_assert(list($$urlOfCW, source, list($$URLFn, url)), term_learner_source_documentation_mt(), T, T);
                ensure_source_contextualized_in_spindle(source, source_spindle, date, user);
            }
        } finally {
            if (NIL != release) {
                release_lock($term_learner_base_source_creation_lock$.getGlobalValue());
            }
        }
        return source;
    }

    public static SubLObject ensure_source_contextualized_in_spindle(SubLObject source, final SubLObject spindle, SubLObject date, SubLObject user) {
        if (date == UNPROVIDED) {
            date = date_utilities.indexical_today();
        }
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(user, thread);
            final SubLObject contextualized_source = list($$ContextOfPCWFn, source);
            final SubLObject interpreted_source = list($$ContextOfPCWInterpretationFn, source, user, date);
            rkf_assertion_utilities.rkf_assert(list($$contextOfPCW, source, contextualized_source), term_learner_source_documentation_mt(), T, T);
            rkf_assertion_utilities.rkf_assert(list($$contextOfPCWInterpretation, source, interpreted_source, user, date), term_learner_source_documentation_mt(), T, T);
            rkf_assertion_utilities.rkf_assert(list($$mtSpindleMember, spindle, contextualized_source), term_learner_source_documentation_mt(), T, T);
            rkf_assertion_utilities.rkf_assert(list($$mtSpindleMember, spindle, interpreted_source), term_learner_source_documentation_mt(), T, T);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return list($$ContextOfPCWInterpretationFn, source, user, date);
    }

    public static SubLObject find_or_create_subwork_source(SubLObject source, final SubLObject sentence_string, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date = date_utilities.indexical_today();
        SubLObject sub_source = NIL;
        SubLObject interpretation_mt = NIL;
        if (NIL == sentence_string) {
            return values(NIL, NIL);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($term_learner_sub_source_creation_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(user, thread);
                final SubLObject existing_sources = ask_utilities.query_variable($sym551$_CW, list($$and, list($$asHtmlSourceString, $list563, sentence_string), listS($$subWorks, source, $list565)), $$InferencePSC, UNPROVIDED);
                if (NIL == sub_source) {
                    SubLObject csome_list_var = existing_sources;
                    SubLObject existing_source = NIL;
                    existing_source = csome_list_var.first();
                    while ((NIL == sub_source) && (NIL != csome_list_var)) {
                        final SubLObject interp_mts = ask_utilities.query_variable($sym429$_MT, list($$contextOfPCWInterpretation, existing_source, $sym429$_MT, api_control_vars.$the_cyclist$.getDynamicValue(thread), date), $$InferencePSC, $list554);
                        if (NIL != interp_mts) {
                            sub_source = existing_source;
                            interpretation_mt = interp_mts.first();
                        }
                        csome_list_var = csome_list_var.rest();
                        existing_source = csome_list_var.first();
                    } 
                }
                if ((NIL != sentence_string) && ((NIL != $term_learner_assert_redundant_mt_info$.getDynamicValue(thread)) || (NIL == interpretation_mt))) {
                    final SubLObject doc_name_length = ($int$30.numG(length(sentence_string))) ? length(sentence_string) : $int$30;
                    sub_source = list($$SentenceOfCWFn, source, string_utilities.substring(sentence_string, ZERO_INTEGER, doc_name_length));
                    interpretation_mt = narts_high.nart_substitute(list($$ContextOfPCWInterpretationFn, sub_source, user, date));
                    rkf_assertion_utilities.rkf_assert(listS($$isa, sub_source, $list567), term_learner_source_documentation_mt(), T, T);
                    rkf_assertion_utilities.rkf_assert(list($$asHtmlSourceString, list($$AISForFn, sub_source), sentence_string), term_learner_source_documentation_mt(), T, T);
                    rkf_assertion_utilities.rkf_assert(list($$contextOfPCWInterpretation, sub_source, interpretation_mt, user, date), term_learner_source_documentation_mt(), T, T);
                    rkf_assertion_utilities.rkf_assert(list($$subWorks, source, sub_source), term_learner_source_documentation_mt(), T, T);
                    rkf_assertion_utilities.rkf_assert(list($$genlMt, list($$ContextOfPCWFn, source), interpretation_mt), term_learner_source_documentation_mt(), T, T);
                }
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($term_learner_sub_source_creation_lock$.getGlobalValue());
            }
        }
        interpretation_mt = ensure_is_hlmt_p_nart(interpretation_mt);
        return values(sub_source, interpretation_mt);
    }

    public static SubLObject ensure_is_hlmt_p_nart(final SubLObject nat) {
        if (NIL == hlmt.hlmt_p(nat)) {
            isa.isaP(nat, $$Microtheory, UNPROVIDED, UNPROVIDED);
        }
        return narts_high.nart_substitute(nat);
    }

    public static SubLObject find_or_create_user_addition_mt_for_url(SubLObject source, final SubLObject sentence_string, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date = date_utilities.indexical_today();
        SubLObject interpretation_mt = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($term_learner_sub_source_creation_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(user, thread);
                final SubLObject interp_mts = ask_utilities.query_variable($sym429$_MT, list($$contextOfPCWInterpretation, source, $sym429$_MT, api_control_vars.$the_cyclist$.getDynamicValue(thread), date), $$InferencePSC, $list554);
                if (NIL != interp_mts) {
                    interpretation_mt = interp_mts.first();
                }
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
            if ((NIL == interpretation_mt) || (NIL != $term_learner_assert_redundant_mt_info$.getDynamicValue(thread))) {
                interpretation_mt = list($$ContextOfPCWInterpretationFn, source, user, date);
                rkf_assertion_utilities.rkf_assert(list($$contextOfPCWInterpretation, source, interpretation_mt, user, date), term_learner_source_documentation_mt(), T, T);
                rkf_assertion_utilities.rkf_assert(list($$genlMt, interpretation_mt, list($$ContextOfPCWFn, source)), term_learner_source_documentation_mt(), T, T);
                rkf_assertion_utilities.rkf_assert(list($$mtSpindleMember, $source_spindle$.getDynamicValue(thread), interpretation_mt), term_learner_source_documentation_mt(), T, T);
            }
        } finally {
            if (NIL != release) {
                release_lock($term_learner_sub_source_creation_lock$.getGlobalValue());
            }
        }
        return interpretation_mt;
    }

    public static SubLObject get_mts_for_urlXuser(final SubLObject url, final SubLObject title, final SubLObject user) {
        final SubLObject document_pcw = find_or_create_base_source_for_url(url, title, UNPROVIDED, UNPROVIDED);
        final SubLObject subworks = ask_utilities.query_variable($sym571$_SUBWORK, listS($$subWorks, document_pcw, $list572), $$InferencePSC, $list554);
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = cons(document_pcw, subworks);
        SubLObject subwork = NIL;
        subwork = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mts = cconcatenate(mts, ask_utilities.query_variable($sym429$_MT, listS($$contextOfPCWInterpretation, subwork, $sym429$_MT, user, $list573), $$InferencePSC, $list554));
            cdolist_list_var = cdolist_list_var.rest();
            subwork = cdolist_list_var.first();
        } 
        return mts;
    }

    public static SubLObject get_mts_for_user(final SubLObject user, SubLObject date) {
        if (date == UNPROVIDED) {
            date = date_utilities.universal_date_to_cycl_date(numeric_date_utilities.today());
        }
        return ask_utilities.query_variable($sym429$_MT, list($$contextOfPCWInterpretation, $sym574$_WORK, $sym429$_MT, user, date), $$InferencePSC, $list554);
    }

    public static SubLObject clear_mts_for_user(final SubLObject user, SubLObject date) {
        if (date == UNPROVIDED) {
            date = date_utilities.universal_date_to_cycl_date(numeric_date_utilities.today());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(CLEAR_MTS_FOR_USER, user, date));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(CLEAR_MTS_FOR_USER, user, date));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return clear_contents_from_mts(get_mts_for_user(user, date));
    }

    public static SubLObject clear_mts_for_urlXuser(final SubLObject url, final SubLObject title, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list($sym576$CLEAR_MTS_FOR_URL_USER, url, title, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list($sym576$CLEAR_MTS_FOR_URL_USER, url, title, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject mts = get_mts_for_urlXuser(url, title, user);
        return clear_contents_from_mts(mts);
    }

    public static SubLObject clear_contents_from_mts(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$93 = ask_utilities.query_variable($TERM, list($$termDependsOn, $TERM, mt), $$InferencePSC, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$93.first();
            while (NIL != cdolist_list_var_$93) {
                if (NIL != forts.fort_p(v_term)) {
                    ke.ke_kill_now(v_term);
                }
                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                v_term = cdolist_list_var_$93.first();
            } 
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql($MT)) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(v_assert));
                            if (NIL != valid) {
                                final SubLObject sentence = assertions_high.assertion_formula(v_assert);
                                final SubLObject stack = stacks.create_stack();
                                SubLObject sentence_term = NIL;
                                stacks.stack_push(sentence, stack);
                                while (NIL == stacks.stack_empty_p(stack)) {
                                    final SubLObject entry = sentence_term = stacks.stack_pop(stack);
                                    if (NIL != forts.fort_p(narts_high.nart_substitute(sentence_term))) {
                                        SubLObject ignore_errors_tag = NIL;
                                        try {
                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence(sentence_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } catch (final Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                    SubLObject cdolist_list_var_$94 = cycl_utilities.formula_args(entry, UNPROVIDED);
                                    SubLObject arg = NIL;
                                    arg = cdolist_list_var_$94.first();
                                    while (NIL != cdolist_list_var_$94) {
                                        stacks.stack_push(arg, stack);
                                        cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                        arg = cdolist_list_var_$94.first();
                                    } 
                                } 
                                ke.ke_unassert_assertion_now(v_assert);
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            } else
                if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str579$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_3 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$95 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$95, $SKIP)) {
                                final SubLObject idx_$96 = idx_$95;
                                if (NIL == id_index_dense_objects_empty_p(idx_$96, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$96);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject v_assert2;
                                    SubLObject sentence2;
                                    SubLObject stack2;
                                    SubLObject sentence_term2;
                                    SubLObject entry2;
                                    SubLObject ignore_errors_tag2;
                                    SubLObject _prev_bind_0_$97;
                                    SubLObject cdolist_list_var_$95;
                                    SubLObject arg2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            v_assert2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(v_assert2, mt, NIL, NIL)) {
                                                sentence2 = assertions_high.assertion_formula(v_assert2);
                                                stack2 = stacks.create_stack();
                                                sentence_term2 = NIL;
                                                stacks.stack_push(sentence2, stack2);
                                                while (NIL == stacks.stack_empty_p(stack2)) {
                                                    entry2 = sentence_term2 = stacks.stack_pop(stack2);
                                                    if (NIL != forts.fort_p(narts_high.nart_substitute(sentence_term2))) {
                                                        ignore_errors_tag2 = NIL;
                                                        try {
                                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                            _prev_bind_0_$97 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence(sentence_term2, sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } catch (final Throwable catch_var2) {
                                                                    Errors.handleThrowable(catch_var2, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$97, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var2) {
                                                            ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                    }
                                                    cdolist_list_var_$95 = cycl_utilities.formula_args(entry2, UNPROVIDED);
                                                    arg2 = NIL;
                                                    arg2 = cdolist_list_var_$95.first();
                                                    while (NIL != cdolist_list_var_$95) {
                                                        stacks.stack_push(arg2, stack2);
                                                        cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                                                        arg2 = cdolist_list_var_$95.first();
                                                    } 
                                                } 
                                                ke.ke_unassert_assertion_now(v_assert2);
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$97 = idx_$95;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$97)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$97);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$97);
                                    final SubLObject end_id = id_index_next_id(idx_$97);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject v_assert3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(v_assert3, mt, NIL, NIL)) {
                                                final SubLObject sentence3 = assertions_high.assertion_formula(v_assert3);
                                                final SubLObject stack3 = stacks.create_stack();
                                                SubLObject sentence_term3 = NIL;
                                                stacks.stack_push(sentence3, stack3);
                                                while (NIL == stacks.stack_empty_p(stack3)) {
                                                    final SubLObject entry3 = sentence_term3 = stacks.stack_pop(stack3);
                                                    if (NIL != forts.fort_p(narts_high.nart_substitute(sentence_term3))) {
                                                        SubLObject ignore_errors_tag3 = NIL;
                                                        try {
                                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                            final SubLObject _prev_bind_0_$98 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence(sentence_term3, sentence3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } catch (final Throwable catch_var3) {
                                                                    Errors.handleThrowable(catch_var3, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$98, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var3) {
                                                            ignore_errors_tag3 = Errors.handleThrowable(ccatch_env_var3, $IGNORE_ERRORS_TARGET);
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                    }
                                                    SubLObject cdolist_list_var_$96 = cycl_utilities.formula_args(entry3, UNPROVIDED);
                                                    SubLObject arg3 = NIL;
                                                    arg3 = cdolist_list_var_$96.first();
                                                    while (NIL != cdolist_list_var_$96) {
                                                        stacks.stack_push(arg3, stack3);
                                                        cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                                        arg3 = cdolist_list_var_$96.first();
                                                    } 
                                                } 
                                                ke.ke_unassert_assertion_now(v_assert3);
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_6, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_5, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_3, thread);
                    }
                }

            final SubLObject assertiondependson = constants_high.find_constant($$$assertionDependsOn);
            if (NIL != valid_constant(assertiondependson, UNPROVIDED)) {
                SubLObject cdolist_list_var_$97 = ask_utilities.query_variable($ASSERT, list(assertiondependson, $ASSERT, mt), $$InferencePSC, $list554);
                SubLObject v_assert4 = NIL;
                v_assert4 = cdolist_list_var_$97.first();
                while (NIL != cdolist_list_var_$97) {
                    final SubLObject sentence4 = assertions_high.assertion_formula(v_assert4);
                    final SubLObject stack4 = stacks.create_stack();
                    SubLObject sentence_term4 = NIL;
                    stacks.stack_push(sentence4, stack4);
                    while (NIL == stacks.stack_empty_p(stack4)) {
                        final SubLObject entry4 = sentence_term4 = stacks.stack_pop(stack4);
                        if (NIL != forts.fort_p(narts_high.nart_substitute(sentence_term4))) {
                            SubLObject ignore_errors_tag4 = NIL;
                            try {
                                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                final SubLObject _prev_bind_7 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence(sentence_term4, sentence4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } catch (final Throwable catch_var4) {
                                        Errors.handleThrowable(catch_var4, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_7, thread);
                                }
                            } catch (final Throwable ccatch_env_var4) {
                                ignore_errors_tag4 = Errors.handleThrowable(ccatch_env_var4, $IGNORE_ERRORS_TARGET);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                        SubLObject cdolist_list_var_$98 = cycl_utilities.formula_args(entry4, UNPROVIDED);
                        SubLObject arg4 = NIL;
                        arg4 = cdolist_list_var_$98.first();
                        while (NIL != cdolist_list_var_$98) {
                            stacks.stack_push(arg4, stack4);
                            cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                            arg4 = cdolist_list_var_$98.first();
                        } 
                    } 
                    ke.ke_unassert_assertion_now(v_assert4);
                    cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                    v_assert4 = cdolist_list_var_$97.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        cdolist_list_var = ask_utilities.query_variable($TERM, $list582, $$InferencePSC, UNPROVIDED);
        SubLObject v_term2 = NIL;
        v_term2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(v_term2)) {
                ke.ke_kill_now(v_term2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term2 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cyclist_fort(final SubLObject string) {
        final SubLObject v_forts = cb_frames.terms_for_browsing(string, UNPROVIDED, UNPROVIDED);
        final SubLObject cyclists = list_utilities.remove_if_not($sym584$HUMAN_CYCLIST_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cyclists.first();
    }

    public static SubLObject term_learner_ordered_types_for_term_in_document_string(final SubLObject doc_string, final SubLObject v_term, final SubLObject placeholderP, SubLObject lookup_onlyP, SubLObject lexicon) {
        if (lookup_onlyP == UNPROVIDED) {
            lookup_onlyP = $term_learner_use_lexical_lookup_only$.getGlobalValue();
        }
        if (lexicon == UNPROVIDED) {
            lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon(UNPROVIDED);
        }
        return term_learner_ordered_types_for_term_in_document(document.new_document(doc_string, UNPROVIDED, UNPROVIDED), v_term, placeholderP, lookup_onlyP, lexicon);
    }

    public static SubLObject term_learner_ordered_types_for_term_in_document(final SubLObject doc, final SubLObject v_term, final SubLObject placeholderP, final SubLObject lookup_onlyP, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject timed_outP = NIL;
        final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
        try {
            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(TEN_INTEGER), thread);
            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                final SubLObject types = term_learner_types_for_term_in_document(doc, v_term, placeholderP, lookup_onlyP, lexicon);
                final SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = cconcatenate(result, term_learner_types_from_types_and_justifications(v_term, doc, types, justifications));
            }
            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        } finally {
            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != timed_outP) && (NIL == lookup_onlyP)) {
            thread.resetMultipleValues();
            final SubLObject types2 = term_learner_types_for_term_in_document(doc, v_term, placeholderP, T, lexicon);
            final SubLObject justifications2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = cconcatenate(result, term_learner_types_from_types_and_justifications(v_term, doc, types2, justifications2));
        }
        return Sort.sort(result, $sym77$_, GET_WEIGHT);
    }

    public static SubLObject term_learner_types_from_types_and_justifications(final SubLObject v_term, final SubLObject doc, final SubLObject types, final SubLObject justifications) {
        SubLObject term_learner_types = NIL;
        final SubLObject nl_strings = term_learner_cycl_terms_to_nl_strings(types, UNPROVIDED, UNPROVIDED);
        SubLObject type = NIL;
        SubLObject type_$105 = NIL;
        SubLObject justification = NIL;
        SubLObject justification_$106 = NIL;
        SubLObject nl_string = NIL;
        SubLObject nl_string_$107 = NIL;
        type = types;
        type_$105 = type.first();
        justification = justifications;
        justification_$106 = justification.first();
        nl_string = nl_strings;
        nl_string_$107 = nl_string.first();
        while (((NIL != nl_string) || (NIL != justification)) || (NIL != type)) {
            final SubLObject isa_genls = ((NIL != ner_justificationP(justification_$106)) || (NIL != term_learner_create_as_individualP(v_term, doc, UNPROVIDED))) ? $ISA : $GENLS;
            final SubLObject weight = data_parser.term_log_idf_from_kb(type_$105);
            final SubLObject basic_sentence = list(isa_genls == $ISA ? $$isa : $$genls, $TERM, type_$105);
            final SubLObject assert_sentence = ((NIL != valid_constantP($$termExpansionExpected, UNPROVIDED)) && (NIL != cycl_grammar.cycl_nat_p(type_$105))) ? list($$and, list($$termExpansionExpected, type_$105), basic_sentence) : basic_sentence;
            term_learner_types = cons(new_term_learner_single_justification_type(type_$105, weight, justification_$106, nl_string_$107, assert_sentence, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED), term_learner_types);
            type = type.rest();
            type_$105 = type.first();
            justification = justification.rest();
            justification_$106 = justification.first();
            nl_string = nl_string.rest();
            nl_string_$107 = nl_string.first();
        } 
        return term_learner_types;
    }

    public static SubLObject get_weight(final SubLObject list) {
        return getf(list, $WEIGHT, UNPROVIDED);
    }

    public static SubLObject get_cycls(final SubLObject list) {
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = getf(list, $TYPES, UNPROVIDED);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != getf(type, $CYCL, UNPROVIDED)) {
                cycls = cons(getf(type, $CYCL, UNPROVIDED), cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return cycls;
    }

    public static SubLObject get_cycl(final SubLObject list) {
        SubLObject cdolist_list_var = getf(list, $TYPES, UNPROVIDED);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != getf(type, $CYCL, UNPROVIDED)) {
                return getf(type, $CYCL, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject ner_justificationP(final SubLObject justification) {
        return makeBoolean((NIL != term_learner_justification_p(justification)) && (NIL != member(term_learner_justification_tool(justification), $list588, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject term_learner_types_for_term_in_document(final SubLObject doc, final SubLObject v_term, final SubLObject placeholderP, SubLObject lookup_onlyP, SubLObject lexicon) {
        if (lookup_onlyP == UNPROVIDED) {
            lookup_onlyP = NIL;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        SubLObject def_strings = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$108 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = term_learner_relevant_sentences_from_document(doc, v_term);
                    SubLObject sentence = NIL;
                    sentence = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject sentence_types = term_learner_collections_for_term_in_sentence(document.sentence_string(sentence), v_term, placeholderP, lookup_onlyP, lexicon);
                        final SubLObject strings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject sentence_type = NIL;
                        SubLObject sentence_type_$109 = NIL;
                        SubLObject string = NIL;
                        SubLObject string_$110 = NIL;
                        sentence_type = sentence_types;
                        sentence_type_$109 = sentence_type.first();
                        string = strings;
                        string_$110 = string.first();
                        while ((NIL != string) || (NIL != sentence_type)) {
                            if (NIL == subl_promotions.memberP(sentence_type_$109, types, EQUAL, UNPROVIDED)) {
                                types = cons(sentence_type_$109, types);
                                def_strings = cons(string_$110, def_strings);
                            }
                            sentence_type = sentence_type.rest();
                            sentence_type_$109 = sentence_type.first();
                            string = string.rest();
                            string_$110 = string.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        sentence = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$108, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(types, def_strings);
    }

    public static SubLObject term_learner_collections_for_term_in_sentence(final SubLObject sentence, final SubLObject v_term, SubLObject placeholderP, SubLObject lookup_onlyP, SubLObject lexicon) {
        if (placeholderP == UNPROVIDED) {
            placeholderP = T;
        }
        if (lookup_onlyP == UNPROVIDED) {
            lookup_onlyP = NIL;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ner = object.new_class_instance(STANFORD_NER);
        final SubLObject entity_clusters = methods.funcall_instance_method_with_1_args(ner, RUN, sentence);
        SubLObject collections = NIL;
        SubLObject definitions = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = matching_named_entities(entity_clusters, v_term, sentence, NIL, lexicon);
                SubLObject named_entity = NIL;
                named_entity = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject type = methods.funcall_instance_method_with_0_args(named_entity, GET_CYC);
                    final SubLObject string = methods.funcall_instance_method_with_0_args(named_entity, GET_STRING);
                    final SubLObject _prev_bind_0_$112 = parsing_vars.$psp_concept_filters$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_concept_filters$.bind(list($list593, NIL != valid_constant($$PredicateTaxonomy, UNPROVIDED) ? $list595 : NIL), thread);
                        if ((NIL != placeholderP) || (!type.eql($$Thing))) {
                            collections = cons(type, collections);
                            definitions = cons(new_term_learner_justification(string, sentence, $STANFORD_NER, UNPROVIDED, UNPROVIDED), definitions);
                        }
                        SubLObject cdolist_list_var_$113;
                        final SubLObject tighter_types_n_strings = cdolist_list_var_$113 = list_utilities.cartesian_product(methods.funcall_instance_method_with_2_args(named_entity, TIGHTEN_TYPE, NIL, lookup_onlyP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject type_and_string = NIL;
                        type_and_string = cdolist_list_var_$113.first();
                        while (NIL != cdolist_list_var_$113) {
                            collections = cons(type_and_string.first(), collections);
                            definitions = cons(new_term_learner_justification(second(type_and_string), sentence, $STANFORD_NER_PSP, UNPROVIDED, UNPROVIDED), definitions);
                            cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                            type_and_string = cdolist_list_var_$113.first();
                        } 
                    } finally {
                        parsing_vars.$psp_concept_filters$.rebind(_prev_bind_0_$112, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    named_entity = cdolist_list_var.first();
                } 
                if (NIL == collections) {
                    cdolist_list_var = matching_named_entities(entity_clusters, v_term, sentence, T, UNPROVIDED);
                    named_entity = NIL;
                    named_entity = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject type = methods.funcall_instance_method_with_0_args(named_entity, GET_CYC);
                        final SubLObject string = methods.funcall_instance_method_with_0_args(named_entity, GET_STRING);
                        final SubLObject _prev_bind_0_$113 = parsing_vars.$psp_concept_filters$.currentBinding(thread);
                        try {
                            parsing_vars.$psp_concept_filters$.bind($list599, thread);
                            if ((NIL != placeholderP) || (!type.eql($$Thing))) {
                                collections = cons(type, collections);
                                definitions = cons(new_term_learner_justification(string, sentence, $USER, UNPROVIDED, UNPROVIDED), definitions);
                            }
                            SubLObject cdolist_list_var_$114;
                            final SubLObject tighter_types_n_strings = cdolist_list_var_$114 = list_utilities.cartesian_product(methods.funcall_instance_method_with_2_args(named_entity, TIGHTEN_TYPE, NIL, lookup_onlyP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject type_and_string = NIL;
                            type_and_string = cdolist_list_var_$114.first();
                            while (NIL != cdolist_list_var_$114) {
                                collections = cons(type_and_string.first(), collections);
                                definitions = cons(new_term_learner_justification(second(type_and_string), sentence, $USER, UNPROVIDED, UNPROVIDED), definitions);
                                cdolist_list_var_$114 = cdolist_list_var_$114.rest();
                                type_and_string = cdolist_list_var_$114.first();
                            } 
                        } finally {
                            parsing_vars.$psp_concept_filters$.rebind(_prev_bind_0_$113, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        named_entity = cdolist_list_var.first();
                    } 
                }
            } finally {
                final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(collections, definitions);
    }

    public static SubLObject matching_named_entities(final SubLObject entity_clusters, final SubLObject term_string, final SubLObject context_string, SubLObject create_if_noneP, SubLObject lexicon) {
        if (create_if_noneP == UNPROVIDED) {
            create_if_noneP = NIL;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLObject matches = NIL;
        SubLObject cdolist_list_var = entity_clusters;
        SubLObject entity_cluster = NIL;
        entity_cluster = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$117 = entity_cluster;
            SubLObject named_entity = NIL;
            named_entity = cdolist_list_var_$117.first();
            while (NIL != cdolist_list_var_$117) {
                if ((!O.eql(methods.funcall_instance_method_with_0_args(named_entity, GET_TYPE))) && term_string.equal(methods.funcall_instance_method_with_0_args(named_entity, GET_STRING))) {
                    matches = cons(named_entity, matches);
                }
                cdolist_list_var_$117 = cdolist_list_var_$117.rest();
                named_entity = cdolist_list_var_$117.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            entity_cluster = cdolist_list_var.first();
        } 
        if ((NIL != create_if_noneP) && (NIL == matches)) {
            final SubLObject contextualized_ne = named_entity_recognizer.new_contextualized_named_entity(term_string, $THING, $USER, context_string, NIL, NIL, $$Thing);
            matches = cons(contextualized_ne, matches);
        }
        return matches;
    }

    public static SubLObject clear_term_learner_type_prompt() {
        final SubLObject cs = $term_learner_type_prompt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_type_prompt(final SubLObject concept) {
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_type_prompt_caching_state$.getGlobalValue(), list(concept), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_type_prompt_internal(SubLObject concept) {
        concept = narts_high.nart_substitute(concept);
        if (NIL != lexification_utilities.unlexifiedP(concept, NIL)) {
            return NIL;
        }
        final SubLObject pred = (NIL != kb_accessors.individualP(concept)) ? $$isa : $$genls;
        final SubLObject cycl_sentence = listS(pred, concept, $list604);
        final SubLObject raw_sentence = term_learner_cycl_term_to_nl_string(cycl_sentence, UNPROVIDED).first();
        final SubLObject final_cat = last(string_utilities.search_all($$$cat, raw_sentence, UNPROVIDED, UNPROVIDED), UNPROVIDED).first();
        final SubLObject prompt = cconcatenate(subseq(raw_sentence, ZERO_INTEGER, subtract(final_cat, ONE_INTEGER)), $str606$_);
        return prompt;
    }

    public static SubLObject term_learner_type_prompt(final SubLObject concept) {
        SubLObject caching_state = $term_learner_type_prompt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_TYPE_PROMPT, $term_learner_type_prompt_caching_state$, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, concept, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(term_learner_type_prompt_internal(concept)));
            memoization_state.caching_state_put(caching_state, concept, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_term_learner_term_header_string() {
        final SubLObject cs = $term_learner_term_header_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_term_header_string(final SubLObject concept, SubLObject max_alts) {
        if (max_alts == UNPROVIDED) {
            max_alts = THREE_INTEGER;
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_term_header_string_caching_state$.getGlobalValue(), list(concept, max_alts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_term_header_string_internal(SubLObject concept, final SubLObject max_alts) {
        concept = narts_high.nart_substitute(concept);
        if (NIL != forts.fort_p(lexification_utilities.unlexifiedP(concept, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject phrases = term_learner_alternative_phrases(concept, add(TWO_INTEGER, max_alts));
        final SubLObject first_phrase = phrases.first();
        final SubLObject aka = list_utilities.first_n(max_alts, phrases.rest());
        final SubLObject moreP = list_utilities.lengthG(phrases, add(ONE_INTEGER, max_alts), UNPROVIDED);
        final SubLObject result = first_phrase;
        SubLObject sub_header = NIL;
        if (NIL != aka) {
            sub_header = aka;
            if (NIL != moreP) {
                sub_header = list_utilities.snoc($str65$___, sub_header);
            }
        }
        return list(result, sub_header);
    }

    public static SubLObject term_learner_term_header_string(final SubLObject concept, SubLObject max_alts) {
        if (max_alts == UNPROVIDED) {
            max_alts = THREE_INTEGER;
        }
        SubLObject caching_state = $term_learner_term_header_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_TERM_HEADER_STRING, $term_learner_term_header_string_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_TERM_HEADER_STRING);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(concept, max_alts);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (concept.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max_alts.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_term_header_string_internal(concept, max_alts)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(concept, max_alts));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject term_learner_alternative_phrases(final SubLObject v_term, SubLObject max_count) {
        if (max_count == UNPROVIDED) {
            max_count = number_utilities.positive_infinity();
        }
        final SubLObject params_$118;
        final SubLObject params = params_$118 = nl_generation_api.new_pph_parameters(UNPROVIDED);
        pph_parameter_declarations.set_pph_generation_count_internal(params_$118, max_count);
        final SubLObject params_$119 = params;
        pph_parameter_declarations.set_pph_lexical_context_internal(params_$119, cure_default_generation_mt(UNPROVIDED));
        final SubLObject params_$120 = params;
        pph_parameter_declarations.set_demerit_cutoff_internal(params_$120, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue());
        return nl_generation_api.cycl_term_to_nl_string_internal(v_term, params);
    }

    public static SubLObject clear_term_learner_lexical_caches() {
        clear_term_learner_term_header_string();
        clear_term_learner_type_prompt();
        return NIL;
    }

    public static SubLObject term_learner_lexify_from_termstrings(final SubLObject focal_term, final SubLObject lexical_mt, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject term_strings_strings = cdolist_list_var = ask_utilities.query_variable($sym72$_STRING, list($$ist_Asserted, lexical_mt, listS($$termStrings, focal_term, $list74)), lexical_mt, UNPROVIDED);
        SubLObject term_string = NIL;
        term_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert(list($$termStrings, focal_term, term_string), lexical_mt);
            term_learner_assert_lexical_info(focal_term, term_string, mt, lexical_mt, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            term_string = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject term_learner_assert_lexical_info(final SubLObject cycl_term, final SubLObject string, SubLObject mt, final SubLObject lexical_mt, SubLObject lexical_sentence) {
        if (lexical_sentence == UNPROVIDED) {
            lexical_sentence = NIL;
        }
        clear_term_learner_lexical_caches();
        cure_remove_from_default_lexicon(cycl_term, string);
        methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED), DELETE, string);
        mt = ensure_is_hlmt_p_nart(mt);
        if ((NIL != string_utilities.non_empty_cycl_stringP(string)) && (NIL == subl_promotions.memberP(cycl_term, term_lexicon.denots_for_term_lexicon_entries(methods.funcall_instance_method_with_1_args(document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED), GET, string)), UNPROVIDED, UNPROVIDED))) {
            if (NIL == lexical_sentence) {
                lexical_sentence = auto_lexifier.auto_lexify(string, cycl_term, lexical_mt, mt).first();
            }
            final SubLObject ret_value = rkf_assertion_utilities.rkf_assert_with_implicature(lexical_sentence, lexical_mt, $NOW);
            final SubLObject lexical_assert = list($$ist, lexical_mt, lexical_sentence);
            rkf_assertion_utilities.rkf_assert(list($$assertionDependsOn, lexical_assert, mt), $$BaseKB, UNPROVIDED, UNPROVIDED);
            return ret_value;
        }
        return NIL;
    }

    public static SubLObject default_task_for_user(final SubLObject user) {
        return default_task_for_user_int(user);
    }

    public static SubLObject clear_default_task_for_user_int() {
        final SubLObject cs = $default_task_for_user_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_default_task_for_user_int(final SubLObject user) {
        return memoization_state.caching_state_remove_function_results_with_args($default_task_for_user_int_caching_state$.getGlobalValue(), list(user), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject default_task_for_user_int_internal(final SubLObject user) {
        final SubLObject kb_value = ask_utilities.query_variable($sym540$_TASK, list($$defaultTask, $sym540$_TASK, user), $$InferencePSC, $list115).first();
        final SubLObject v_default = $$GeneralCycKETask_Allotment;
        return NIL != kb_value ? kb_value : v_default;
    }

    public static SubLObject default_task_for_user_int(final SubLObject user) {
        SubLObject caching_state = $default_task_for_user_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DEFAULT_TASK_FOR_USER_INT, $default_task_for_user_int_caching_state$, SIXTEEN_INTEGER, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_DEFAULT_TASK_FOR_USER_INT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(default_task_for_user_int_internal(user)));
            memoization_state.caching_state_put(caching_state, user, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_mt_for_task() {
        final SubLObject cs = $query_mt_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_mt_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_mt_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_mt_for_task_internal(final SubLObject task) {
        return cae_query_search.cae_default_query_mt(task);
    }

    public static SubLObject query_mt_for_task(final SubLObject task) {
        SubLObject caching_state = $query_mt_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_MT_FOR_TASK, $query_mt_for_task_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_QUERY_MT_FOR_TASK);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_mt_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_wff_checking_mt_for_task() {
        final SubLObject cs = $wff_checking_mt_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wff_checking_mt_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($wff_checking_mt_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wff_checking_mt_for_task_internal(final SubLObject task) {
        return cae_query_search.cae_default_wff_checking_mt(task);
    }

    public static SubLObject wff_checking_mt_for_task(final SubLObject task) {
        SubLObject caching_state = $wff_checking_mt_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WFF_CHECKING_MT_FOR_TASK, $wff_checking_mt_for_task_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_WFF_CHECKING_MT_FOR_TASK);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wff_checking_mt_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_mt_for_user_and_task() {
        final SubLObject cs = $query_mt_for_user_and_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_mt_for_user_and_task(final SubLObject user, final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_mt_for_user_and_task_caching_state$.getGlobalValue(), list(user, task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_mt_for_user_and_task_internal(final SubLObject user, SubLObject task) {
        if (NIL == task) {
            task = default_task_for_user(user);
        }
        return query_mt_for_task(task);
    }

    public static SubLObject query_mt_for_user_and_task(final SubLObject user, final SubLObject task) {
        SubLObject caching_state = $query_mt_for_user_and_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_MT_FOR_USER_AND_TASK, $query_mt_for_user_and_task_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_QUERY_MT_FOR_USER_AND_TASK);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(user, task);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (user.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && task.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(query_mt_for_user_and_task_internal(user, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(user, task));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_wff_checking_mt_for_user_and_task() {
        final SubLObject cs = $wff_checking_mt_for_user_and_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wff_checking_mt_for_user_and_task(final SubLObject user, final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($wff_checking_mt_for_user_and_task_caching_state$.getGlobalValue(), list(user, task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wff_checking_mt_for_user_and_task_internal(final SubLObject user, SubLObject task) {
        if (NIL == task) {
            task = default_task_for_user(user);
        }
        return wff_checking_mt_for_task(task);
    }

    public static SubLObject wff_checking_mt_for_user_and_task(final SubLObject user, final SubLObject task) {
        SubLObject caching_state = $wff_checking_mt_for_user_and_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WFF_CHECKING_MT_FOR_USER_AND_TASK, $wff_checking_mt_for_user_and_task_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_WFF_CHECKING_MT_FOR_USER_AND_TASK);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(user, task);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (user.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && task.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wff_checking_mt_for_user_and_task_internal(user, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(user, task));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject parsing_mt_for_task(final SubLObject task) {
        return query_library_utils.cae_default_parsing_mt(task);
    }

    public static SubLObject xml_output_term_types(final SubLObject types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$types, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = types;
                    SubLObject type = NIL;
                    type = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (getf(type, $CATEGORY, $NOT_FOUND) == $NOT_FOUND) {
                            xml_output_term_type(type);
                        } else {
                            final SubLObject category_label = getf(type, $CATEGORY_NL, $str50$);
                            final SubLObject attrs = list($$$category, string_utilities.to_string(getf(type, $CATEGORY, UNPROVIDED)), $$$categoryNL, category_label);
                            try {
                                final SubLObject _prev_bind_0_$122 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$123 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$typeSet, attrs, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$123 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var_$125 = getf(type, $TYPES, UNPROVIDED);
                                        SubLObject real_type = NIL;
                                        real_type = cdolist_list_var_$125.first();
                                        while (NIL != cdolist_list_var_$125) {
                                            xml_output_term_type(real_type);
                                            cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                                            real_type = cdolist_list_var_$125.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$123, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$123, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$122, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$typeSet);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        type = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$types);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_output_term_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject attrs = list(new SubLObject[]{ $$$id, web_utilities.html_url_encode(kb_utilities.compact_hl_external_id_string(getf(type, $ASSERT_SENTENCE, UNPROVIDED)), UNPROVIDED), $$$required, NIL != getf(type, $REQUIRED, UNPROVIDED) ? $$$true : $$$false, $$$display, NIL != getf(type, $DISPLAY, UNPROVIDED) ? $$$true : $$$false, $$$cyclTerm, web_utilities.html_url_encode(prin1_to_string(getf(type, $CYCL, UNPROVIDED)), UNPROVIDED), $$$conceptId, kb_utilities.compact_hl_external_id_string(getf(type, $CYCL, UNPROVIDED)), $$$justifications, web_utilities.html_url_encode(prin1_to_string(getf(type, $JUSTIFICATIONS, UNPROVIDED)), UNPROVIDED), $$$nlString, web_utilities.html_url_encode(getf(type, $NL_STRING, UNPROVIDED), UNPROVIDED), $$$legendString, web_utilities.html_url_encode(getf(type, $LEGEND_STRING, UNPROVIDED), UNPROVIDED), $$$replicationSentenceId, getf(type, $REPLICATION_SENTENCE_ID, UNPROVIDED) });
        if (NIL != getf(type, $STATUS_CODE, UNPROVIDED)) {
            attrs = cconcatenate(list($$$statusCode, write_to_string(getf(type, $STATUS_CODE, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY)), attrs);
        }
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$type, attrs, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$127 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_output_renderers(getf(type, $RENDERERS, UNPROVIDED));
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$127, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$type);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_output_renderers(final SubLObject renderers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$renderers, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$128 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = renderers;
                    SubLObject renderer = NIL;
                    renderer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        xml_output_renderer(renderer);
                        cdolist_list_var = cdolist_list_var.rest();
                        renderer = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$128, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$renderers);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return renderers;
    }

    public static SubLObject xml_output_renderer(final SubLObject renderer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$renderer, list($$$type, prin1_to_string(getf(renderer, $RENDERER_TYPE, UNPROVIDED))), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$129 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != getf(renderer, $ARG_POS, UNPROVIDED)) {
                        try {
                            final SubLObject _prev_bind_0_$130 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$131 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$argpos, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_print(getf(renderer, $ARG_POS, UNPROVIDED), UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$131, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$131, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$130, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$132 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$argpos);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                            }
                        }
                    }
                    if (NIL != getf(renderer, $STRING, UNPROVIDED)) {
                        try {
                            final SubLObject _prev_bind_0_$133 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$132 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$string, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_print(getf(renderer, $STRING, UNPROVIDED), UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$134, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$132, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$133, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$135 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$string);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$135, thread);
                            }
                        }
                    }
                    SubLObject cdolist_list_var = getf(renderer, $SELECTION_RENDERERS, UNPROVIDED);
                    SubLObject selection_renderer = NIL;
                    selection_renderer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        xml_output_selection_renderer(selection_renderer);
                        cdolist_list_var = cdolist_list_var.rest();
                        selection_renderer = cdolist_list_var.first();
                    } 
                    cdolist_list_var = getf(renderer, $ISA_CONSTRAINTS, UNPROVIDED);
                    SubLObject v_isa = NIL;
                    v_isa = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$136 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$133 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$isaConstraint, list($$$cyclTerm, kb_utilities.pretty_print_cycl_to_string(getf(v_isa, $CYCL, UNPROVIDED), UNPROVIDED), $$$conceptId, getf(v_isa, $CONCEPT_ID, UNPROVIDED)), T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$137 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$137, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$133, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$136, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_isa = cdolist_list_var.first();
                    } 
                    cdolist_list_var = getf(renderer, $GENLS_CONSTRAINTS, UNPROVIDED);
                    SubLObject genl = NIL;
                    genl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$138 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$134 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$genlsConstraint, list($$$cyclTerm, kb_utilities.pretty_print_cycl_to_string(getf(genl, $CYCL, UNPROVIDED), UNPROVIDED), $$$conceptId, getf(genl, $CONCEPT_ID, UNPROVIDED)), T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$139 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$139, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$134, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$138, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        genl = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$129, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$renderer);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_output_selection_renderer(final SubLObject renderer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (renderer.first() == $TEXT_MATCHES) {
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($str654$text_matches, list($$$heading, second(renderer)), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$144 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_output_selection_renderer(third(renderer));
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$144, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($str654$text_matches);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            return NIL;
        }
        SubLObject attrs = (getf(renderer, $VALID, UNPROVIDED) == NIL) ? $list656 : NIL;
        if (NIL != getf(renderer, $INITIALLY_SELECTED, UNPROVIDED)) {
            attrs = cconcatenate(attrs, list($$$initiallySelected, $$$true));
        }
        try {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$selectionRenderer, attrs, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$145 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != getf(renderer, $STRING, UNPROVIDED)) {
                        try {
                            final SubLObject _prev_bind_0_$146 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$147 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$string, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$147 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_print(web_utilities.html_url_encode(getf(renderer, $STRING, UNPROVIDED), UNPROVIDED), UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$147, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$147, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$146, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$148 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$string);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                            }
                        }
                    }
                    if (NIL != getf(renderer, $CYCL, UNPROVIDED)) {
                        try {
                            final SubLObject _prev_bind_0_$149 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$148 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cyclTerm, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$150 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    if (getf(renderer, $CYCL, UNPROVIDED).equal($$$newValue)) {
                                        xml_utilities.xml_print($$$newValue, UNPROVIDED);
                                    } else {
                                        xml_utilities.xml_print(web_utilities.html_url_encode(kb_utilities.pretty_print_cycl_to_string(getf(renderer, $CYCL, UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED);
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$150, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$148, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$149, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$151 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$cyclTerm);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$151, thread);
                            }
                        }
                    }
                    if (NIL != getf(renderer, $CYCL_ID, UNPROVIDED)) {
                        try {
                            final SubLObject _prev_bind_0_$152 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$149 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cyclId, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$153 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    if (getf(renderer, $CYCL, UNPROVIDED).equal($$$newValue)) {
                                        xml_utilities.xml_print($$$newValue, UNPROVIDED);
                                    } else {
                                        xml_utilities.xml_print(kb_utilities.compact_hl_external_id_string(getf(renderer, $CYCL, UNPROVIDED)), UNPROVIDED);
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$153, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$149, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$152, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$154 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$cyclId);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$154, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$145, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$selectionRenderer);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return NIL;
    }

    public static SubLObject term_learner_concept_clouds(final SubLObject terms, SubLObject user, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_CONCEPT_CLOUDS, terms, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_CONCEPT_CLOUDS, terms, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject result = NIL;
        final SubLObject query_mt = query_mt_for_user_and_task(user, task);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(list($CYCL, v_term, $CONCEPT_ID, document_annotation_widgets.term_learner_id(v_term), $TERM_WEIGHT, term_learner_term_weight(v_term), $CLOUD, term_learner_term_concept_cloud(v_term, query_mt)), result);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
        }
        return nreverse(result);
    }

    public static SubLObject term_learner_term_concept_cloud(final SubLObject v_term, SubLObject query_mt) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cloud_term_dictionary = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$158 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$159 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$160 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$161 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    if (NIL != fort_types_interface.collection_p(v_term)) {
                                        SubLObject cdolist_list_var = genls.all_genls(v_term, query_mt, UNPROVIDED);
                                        SubLObject genl = NIL;
                                        genl = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if (!v_term.equal(genl)) {
                                                final SubLObject displayP = term_learner_displayable_generalizationP(genl, query_mt);
                                                final SubLObject nl = (NIL != displayP) ? term_learner_cloud_display_nl(genl) : $str50$;
                                                final SubLObject term_weight = term_learner_term_weight(genl);
                                                final SubLObject term_info = list($GENLS, displayP, nl, genl, term_weight);
                                                dictionary.dictionary_enter(cloud_term_dictionary, document_annotation_widgets.term_learner_id(genl), term_info);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            genl = cdolist_list_var.first();
                                        } 
                                    } else {
                                        SubLObject cdolist_list_var = isa.all_isa(v_term, query_mt, UNPROVIDED);
                                        SubLObject v_isa = NIL;
                                        v_isa = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject displayP = term_learner_displayable_generalizationP(v_isa, query_mt);
                                            final SubLObject nl = (NIL != displayP) ? term_learner_cloud_display_nl(v_isa) : $str50$;
                                            final SubLObject term_weight = term_learner_term_weight(v_isa);
                                            final SubLObject term_info = list($ISA, displayP, nl, v_isa, term_weight);
                                            dictionary.dictionary_enter(cloud_term_dictionary, document_annotation_widgets.term_learner_id(v_isa), term_info);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            v_isa = cdolist_list_var.first();
                                        } 
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$162 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$162, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$161, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$160, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$159, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$163 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$163, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$158, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(dictionary_utilities.dictionary_to_alist(cloud_term_dictionary), $sym153$_, SIXTH);
    }

    public static SubLObject term_learner_concept_cloud_as_xml(final SubLObject terms, SubLObject user_id) {
        if (user_id == UNPROVIDED) {
            user_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cloud_dict = term_learner_concept_cloud_new_int(terms, user_id);
        SubLObject result_string = NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(NIL, thread);
            try {
                xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                try {
                    final SubLObject _prev_bind_0_$164 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$cloud, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$165 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cloud_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject cloud_elt_plist = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                xml_utilities.xml_terpri();
                                final SubLObject term_id = getf(cloud_elt_plist, $CYCL_ID, UNPROVIDED);
                                final SubLObject genl_ids = getf(cloud_elt_plist, $GENL_IDS, UNPROVIDED);
                                final SubLObject isa_ids = getf(cloud_elt_plist, $ISA_IDS, UNPROVIDED);
                                final SubLObject display = getf(cloud_elt_plist, $DISPLAY, UNPROVIDED);
                                final SubLObject nl = getf(cloud_elt_plist, $NL, UNPROVIDED);
                                final SubLObject weight = getf(cloud_elt_plist, $WEIGHT, UNPROVIDED);
                                SubLObject attrs = list($$$cycl, write_to_string(v_term, EMPTY_SUBL_OBJECT_ARRAY), $$$cyclId, term_id, $$$display, NIL != display ? $$$t : $$$f, $$$weight, weight);
                                if (NIL != nl) {
                                    attrs = cconcatenate(list($$$nl, nl), attrs);
                                }
                                try {
                                    final SubLObject _prev_bind_0_$166 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$167 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$concept, attrs, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$167 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            SubLObject cdolist_list_var = genl_ids;
                                            SubLObject genl_id = NIL;
                                            genl_id = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                xml_utilities.xml_terpri();
                                                final SubLObject attrs_$169 = list($$$cyclId, genl_id);
                                                final SubLObject _prev_bind_0_$168 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$168 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$genl, attrs_$169, T, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$169 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$169, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$168, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$168, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                genl_id = cdolist_list_var.first();
                                            } 
                                            cdolist_list_var = isa_ids;
                                            SubLObject isa_id = NIL;
                                            isa_id = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                xml_utilities.xml_terpri();
                                                final SubLObject attrs_$170 = list($$$conceptId, isa_id);
                                                final SubLObject _prev_bind_0_$170 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$169 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$isa, attrs_$170, T, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$171 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$171, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$169, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$170, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                isa_id = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$167, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$167, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$166, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$172 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$concept);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$172, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$165, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$164, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$173 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$cloud);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                    }
                }
                result_string = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$174 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$174, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return result_string;
    }

    public static SubLObject term_learner_concept_cloud_new(final SubLObject terms, SubLObject user_id) {
        if (user_id == UNPROVIDED) {
            user_id = NIL;
        }
        final SubLObject cloud_dict = term_learner_concept_cloud_new_int(terms, user_id);
        return dictionary.dictionary_values(cloud_dict);
    }

    public static SubLObject term_learner_concept_cloud_new_int(final SubLObject terms, SubLObject user_id) {
        if (user_id == UNPROVIDED) {
            user_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_CONCEPT_CLOUD_NEW_INT, terms, user_id));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERM_LEARNER_CONCEPT_CLOUD_NEW_INT, terms, user_id));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject cloud = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject mt = $$InferencePSC;
        SubLObject to_do = NIL;
        SubLObject current_todo = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$180 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$181 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$182 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$183 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$184 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state_$185 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$185 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state_$185, thread);
                                            final SubLObject original_memoization_process_$187 = memoization_state.memoization_state_original_process(local_state_$185);
                                            try {
                                                SubLObject cdolist_list_var = terms;
                                                SubLObject v_term = NIL;
                                                v_term = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    if (NIL == dictionary.dictionary_lookup(cloud, v_term, UNPROVIDED)) {
                                                        add_cloud_entry_for_term(cloud, v_term, mt, T);
                                                    }
                                                    if (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED)) {
                                                        final SubLObject items_var = genls.genls(v_term, mt, UNPROVIDED);
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
                                                                to_do = cons(item, to_do);
                                                            }
                                                        } else {
                                                            SubLObject cdolist_list_var_$188 = items_var;
                                                            SubLObject item2 = NIL;
                                                            item2 = cdolist_list_var_$188.first();
                                                            while (NIL != cdolist_list_var_$188) {
                                                                to_do = cons(item2, to_do);
                                                                cdolist_list_var_$188 = cdolist_list_var_$188.rest();
                                                                item2 = cdolist_list_var_$188.first();
                                                            } 
                                                        }
                                                    } else {
                                                        final SubLObject items_var = isa.isa(v_term, mt, UNPROVIDED);
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
                                                                to_do = cons(item, to_do);
                                                            }
                                                        } else {
                                                            SubLObject cdolist_list_var_$189 = items_var;
                                                            SubLObject item2 = NIL;
                                                            item2 = cdolist_list_var_$189.first();
                                                            while (NIL != cdolist_list_var_$189) {
                                                                to_do = cons(item2, to_do);
                                                                cdolist_list_var_$189 = cdolist_list_var_$189.rest();
                                                                item2 = cdolist_list_var_$189.first();
                                                            } 
                                                        }
                                                    }
                                                    while (NIL != to_do) {
                                                        current_todo = to_do.first();
                                                        to_do = to_do.rest();
                                                        if (NIL == dictionary.dictionary_lookup(cloud, current_todo, UNPROVIDED)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject updated_cloud = add_cloud_entry_for_term(cloud, current_todo, mt, UNPROVIDED);
                                                            final SubLObject new_todo = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            final SubLObject items_var2 = new_todo;
                                                            if (items_var2.isVector()) {
                                                                final SubLObject vector_var2 = items_var2;
                                                                final SubLObject backwardP_var2 = NIL;
                                                                SubLObject length2;
                                                                SubLObject v_iteration2;
                                                                SubLObject element_num2;
                                                                SubLObject item3;
                                                                for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                                                    element_num2 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                                                    item3 = aref(vector_var2, element_num2);
                                                                    to_do = cons(item3, to_do);
                                                                }
                                                            } else {
                                                                SubLObject cdolist_list_var_$190 = items_var2;
                                                                SubLObject item4 = NIL;
                                                                item4 = cdolist_list_var_$190.first();
                                                                while (NIL != cdolist_list_var_$190) {
                                                                    to_do = cons(item4, to_do);
                                                                    cdolist_list_var_$190 = cdolist_list_var_$190.rest();
                                                                    item4 = cdolist_list_var_$190.first();
                                                                } 
                                                            }
                                                        }
                                                    } 
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    v_term = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$186 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state_$185, original_memoization_process_$187);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$186, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$185, thread);
                                        }
                                    } finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$184, thread);
                                    }
                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$183, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$187 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$187, thread);
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$182, thread);
                        }
                    } finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$181, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$188 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$180, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
        }
        return cloud;
    }

    public static SubLObject add_cloud_entry_for_term(final SubLObject cloud, final SubLObject v_term, final SubLObject mt, SubLObject force_displayP) {
        if (force_displayP == UNPROVIDED) {
            force_displayP = NIL;
        }
        final SubLObject v_genls = genls.genls(v_term, mt, UNPROVIDED);
        final SubLObject genl_termids = Mapping.mapcar(TERM_LEARNER_ID, v_genls);
        final SubLObject isas = (NIL != v_genls) ? NIL : isa.isa(v_term, mt, UNPROVIDED);
        final SubLObject isa_term_ids = (NIL != isas) ? Mapping.mapcar(TERM_LEARNER_ID, isas) : NIL;
        final SubLObject displayP = (NIL != force_displayP) ? force_displayP : term_learner_displayable_generalizationP(v_term, mt);
        final SubLObject nl = (NIL != displayP) ? term_learner_cloud_display_nl(v_term) : $str50$;
        final SubLObject term_weight = term_learner_term_weight(v_term);
        final SubLObject id = document_annotation_widgets.term_learner_id(v_term);
        dictionary.dictionary_enter(cloud, v_term, list(new SubLObject[]{ $CYCL, v_term, $CYCL_ID, id, $ISA_IDS, isa_term_ids, $GENL_IDS, genl_termids, $DISPLAY, displayP, $NL, nl, $WEIGHT, term_weight }));
        return values(cloud, v_genls);
    }

    public static SubLObject term_learner_term_weight(final SubLObject v_term) {
        final SubLObject generality = log(cardinality_estimates.generality_estimate(v_term), UNPROVIDED);
        final SubLObject weight = (generality.numG(ZERO_INTEGER)) ? divide(ONE_INTEGER, generality) : ONE_INTEGER;
        return weight;
    }

    public static SubLObject clear_term_learner_cloud_display_nl() {
        final SubLObject cs = $term_learner_cloud_display_nl_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_cloud_display_nl(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_cloud_display_nl_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_cloud_display_nl_internal(final SubLObject v_term) {
        return nl_generation_api.cycl_term_to_nl_string_internal(v_term, nl_generation_api.new_pph_parameters(list($PPH_LEXICAL_CONTEXT, cure_default_generation_mt(UNPROVIDED)))).first();
    }

    public static SubLObject term_learner_cloud_display_nl(final SubLObject v_term) {
        SubLObject caching_state = $term_learner_cloud_display_nl_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_CLOUD_DISPLAY_NL, $term_learner_cloud_display_nl_caching_state$, $int$4096, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_LEARNER_CLOUD_DISPLAY_NL);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(term_learner_cloud_display_nl_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_term_learner_displayable_generalizationP() {
        final SubLObject cs = $term_learner_displayable_generalizationP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_displayable_generalizationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_displayable_generalizationP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_displayable_generalizationP_internal(final SubLObject v_term, final SubLObject mt) {
        return makeBoolean((NIL == thcl.ke_irrelevant_termP(v_term, mt)) && (NIL != rkf_concept_clarifier.rkf_clarifying_collectionP(v_term, mt)));
    }

    public static SubLObject term_learner_displayable_generalizationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $term_learner_displayable_generalizationP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_, $sym684$_TERM_LEARNER_DISPLAYABLE_GENERALIZATION__CACHING_STATE_, $int$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym685$CLEAR_TERM_LEARNER_DISPLAYABLE_GENERALIZATION_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_displayable_generalizationP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_term_learner_possibly_relevant_generalizationP() {
        final SubLObject cs = $term_learner_possibly_relevant_generalizationP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_possibly_relevant_generalizationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_possibly_relevant_generalizationP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_possibly_relevant_generalizationP_internal(final SubLObject v_term, final SubLObject mt) {
        return makeBoolean((((NIL == kb_accessors.indeterminate_termP(v_term)) || v_term.eql($$Now)) && ((NIL == cycl_grammar.cycl_nat_p(v_term)) || (NIL == subl_promotions.memberP(cycl_utilities.formula_arg0(v_term), $list687, UNPROVIDED, UNPROVIDED)))) && (NIL == thcl.ke_irrelevant_termP(narts_high.nart_substitute(v_term), mt)));
    }

    public static SubLObject term_learner_possibly_relevant_generalizationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $term_learner_possibly_relevant_generalizationP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, $sym688$_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION__CACHING_STATE_, $int$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym689$CLEAR_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_learner_possibly_relevant_generalizationP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_term_learner_irrelevancies_for_term(final SubLObject event, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        final SubLObject modified_term;
        final SubLObject event_info = modified_term = event_model.event_message(event);
        clear_term_learner_possibly_relevant_generalizationP();
        clear_term_learner_displayable_generalizationP();
        clear_term_learner_known_bindings_for_sentence();
        return NIL;
    }

    public static SubLObject cycl_terms_to_nl_strings_quick(final SubLObject term_list, SubLObject pph_params) {
        if (pph_params == UNPROVIDED) {
            pph_params = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$194 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$195 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$196 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$197 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    SubLObject cdolist_list_var = term_list;
                                    SubLObject v_term = NIL;
                                    v_term = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        result = cons(nl_generation_api.cycl_term_to_nl_string_internal(v_term, pph_params).first(), result);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_term = cdolist_list_var.first();
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$198 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$197, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$196, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$195, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$199 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$199, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$194, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject cb_show_followup_widget(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject misc_attrs = list(bq_cons($str694$_termId_, kb_utilities.compact_hl_external_id_string(fort)), bq_cons($str695$_termString_, pph_main.generate_phrase(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$cycFollowup);
        html_char(CHAR_quotation, UNPROVIDED);
        SubLObject cdolist_list_var = misc_attrs;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject attribute = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list697);
            attribute = current.first();
            current = value = current.rest();
            html_markup(attribute);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(value);
            html_char(CHAR_quotation, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        cyc_file_dependencies.javascript($FOLLOWUP_LOADER);
        return NIL;
    }

    public static SubLObject cb_cure_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cb_cure_internal_host_override$.getDynamicValue(thread) ? $cb_cure_internal_host_override$.getDynamicValue(thread) : NIL != web_utilities.local_servlet_container_runningP() ? misc_utilities.hostname() : $cb_cure_external_host$.getGlobalValue();
    }

    public static SubLObject cb_cure_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cb_cure_internal_port_override$.getDynamicValue(thread) ? $cb_cure_internal_port_override$.getDynamicValue(thread) : NIL != web_utilities.local_servlet_container_runningP() ? web_utilities.servlet_container_port() : $cb_cure_external_port$.getGlobalValue();
    }

    public static SubLObject cb_cure_context_path() {
        return NIL != web_utilities.local_servlet_container_runningP() ? $cb_cure_internal_context_path$.getGlobalValue() : $cb_cure_external_context_path$.getGlobalValue();
    }

    public static SubLObject cb_possibly_add_cure_link(final SubLObject v_term, SubLObject title_string, SubLObject link_string) {
        if (title_string == UNPROVIDED) {
            title_string = NIL;
        }
        if (link_string == UNPROVIDED) {
            link_string = $$$CURE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if ((NIL != default_task_for_user(operation_communication.the_cyclist())) && (NIL != query_mt_for_user_and_task(operation_communication.the_cyclist(), default_task_for_user(operation_communication.the_cyclist())))) {
                        return cb_cure_link(v_term, title_string, link_string);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $$$CURE_Broken);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        Errors.warn($str710$CURE_broken___S, err);
        return NIL;
    }

    public static SubLObject cb_cure_link(final SubLObject v_term, SubLObject title_string, SubLObject link_string) {
        if (title_string == UNPROVIDED) {
            title_string = NIL;
        }
        if (link_string == UNPROVIDED) {
            link_string = $$$CURE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_script_utilities.html_popup_script();
        final SubLObject href = cconcatenate($str711$http___, new SubLObject[]{ format_nil.format_nil_a_no_copy(cb_cure_host()), $str606$_, format_nil.format_nil_a_no_copy(cb_cure_port()), format_nil.format_nil_a_no_copy(cb_cure_context_path()), $str712$_edit_jsp_conceptid_, format_nil.format_nil_a_no_copy(kb_utilities.compact_hl_external_id_string(v_term)), $str713$_cycHost_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), $str714$_cycPort_, format_nil.format_nil_a_no_copy(html_kernel.html_port()), $str715$_userName_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(kb_paths.fort_name(operation_communication.the_cyclist()), UNPROVIDED)) });
        final SubLObject window_name = cconcatenate(kb_utilities.compact_hl_external_id_string(v_term), $str716$_cure);
        final SubLObject onclick = html_script_utilities.html_popup_onclick(window_name, $int$600, $int$400, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != title_string) {
            html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(title_string);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(onclick);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str719$_cycdoc_img_cb_cure_png);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != link_string) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(link_string);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($$$bottom));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_image_style$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str721$height_1_2em);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_sentence_score() {
        final SubLObject cs = $sentence_score_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sentence_score(final SubLObject sentence, final SubLObject focal_term, SubLObject type_limit, SubLObject mt) {
        if (type_limit == UNPROVIDED) {
            type_limit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args($sentence_score_caching_state$.getGlobalValue(), list(sentence, focal_term, type_limit, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_score_internal(final SubLObject sentence, final SubLObject focal_term, final SubLObject type_limit, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = get_sentence_for_scoring(sentence, focal_term, UNPROVIDED, UNPROVIDED);
        final SubLObject known_bindings_set = set_query_variable($sym282$_X, query_sentence, mt, $list723);
        final SubLObject immediate_parents = isa.min_isa(focal_term, mt, UNPROVIDED);
        SubLObject instance_set = NIL;
        SubLObject score = ZERO_INTEGER;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            instance_set = set_utilities.make_set_from_list(remove_duplicates(Mapping.mapcan(ALL_INSTANCES, immediate_parents, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), EQUAL);
            if (!set.set_size(instance_set).numE(ZERO_INTEGER)) {
                score = divide(set.set_size(set_utilities.set_intersection(list(instance_set, known_bindings_set), UNPROVIDED)), set.set_size(instance_set));
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return score;
    }

    public static SubLObject sentence_score(final SubLObject sentence, final SubLObject focal_term, SubLObject type_limit, SubLObject mt) {
        if (type_limit == UNPROVIDED) {
            type_limit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject caching_state = $sentence_score_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SENTENCE_SCORE, $sentence_score_caching_state$, NIL, EQ, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(sentence, focal_term, type_limit, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (focal_term.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (type_limit.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sentence_score_internal(sentence, focal_term, type_limit, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, focal_term, type_limit, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_sentence_score_for_type() {
        final SubLObject cs = $sentence_score_for_type_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sentence_score_for_type(final SubLObject sentence, final SubLObject focal_arg_pos, final SubLObject focal_type, SubLObject type_limit, SubLObject mt) {
        if (type_limit == UNPROVIDED) {
            type_limit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args($sentence_score_for_type_caching_state$.getGlobalValue(), list(sentence, focal_arg_pos, focal_type, type_limit, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_score_for_type_internal(final SubLObject sentence, final SubLObject focal_arg_pos, final SubLObject focal_type, final SubLObject type_limit, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = get_sentence_for_scoring(sentence, NIL, focal_arg_pos, UNPROVIDED);
        final SubLObject known_bindings_set = set_query_variable($sym727$_QUERY_VAR, query_sentence, mt, $list723);
        SubLObject instance_set = NIL;
        SubLObject score = ZERO_INTEGER;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            instance_set = set_utilities.make_set_from_list(isa.all_instances(focal_type, UNPROVIDED, UNPROVIDED), EQUAL);
            if (!set.set_size(instance_set).numE(ZERO_INTEGER)) {
                score = divide(set.set_size(set_utilities.set_intersection(list(instance_set, known_bindings_set), UNPROVIDED)), set.set_size(instance_set));
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return score;
    }

    public static SubLObject sentence_score_for_type(final SubLObject sentence, final SubLObject focal_arg_pos, final SubLObject focal_type, SubLObject type_limit, SubLObject mt) {
        if (type_limit == UNPROVIDED) {
            type_limit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject caching_state = $sentence_score_for_type_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SENTENCE_SCORE_FOR_TYPE, $sentence_score_for_type_caching_state$, NIL, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(sentence, focal_arg_pos, focal_type, type_limit, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (focal_arg_pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (focal_type.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (type_limit.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sentence_score_for_type_internal(sentence, focal_arg_pos, focal_type, type_limit, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, focal_arg_pos, focal_type, type_limit, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_set_query_variable() {
        final SubLObject cs = $set_query_variable_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_set_query_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, final SubLObject params) {
        return memoization_state.caching_state_remove_function_results_with_args($set_query_variable_caching_state$.getGlobalValue(), list(var, sentence, mt, params), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject set_query_variable_internal(final SubLObject var, final SubLObject sentence, final SubLObject mt, final SubLObject params) {
        return set_utilities.make_set_from_list(ask_utilities.query_variable(var, sentence, mt, params), EQUAL);
    }

    public static SubLObject set_query_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, final SubLObject params) {
        SubLObject caching_state = $set_query_variable_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SET_QUERY_VARIABLE, $set_query_variable_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(var, sentence, mt, params);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && params.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(set_query_variable_internal(var, sentence, mt, params)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, sentence, mt, params));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_sentence_for_scoring(final SubLObject sentence, final SubLObject focal_term, SubLObject focal_arg_pos, SubLObject asserted_onlyP) {
        if (focal_arg_pos == UNPROVIDED) {
            focal_arg_pos = NIL;
        }
        if (asserted_onlyP == UNPROVIDED) {
            asserted_onlyP = T;
        }
        final SubLObject focal_var = cycl_utilities.formula_arg_position(sentence, focal_arg_pos, UNPROVIDED);
        final SubLObject result_sentence = (NIL != asserted_onlyP) ? make_formula($$assertedSentence, list(sentence), UNPROVIDED) : sentence;
        if (NIL != focal_arg_pos) {
            return cycl_utilities.formula_subst($sym727$_QUERY_VAR, focal_var, result_sentence, UNPROVIDED, UNPROVIDED);
        }
        return cycl_utilities.formula_subst($sym727$_QUERY_VAR, focal_term, result_sentence, EQUAL, UNPROVIDED);
    }

    public static SubLObject preds_w_scores(final SubLObject focal_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject _prev_bind_0 = $current_tl_task$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            $current_tl_task$.bind($$GeneralCycKETask_Allotment, thread);
            api_control_vars.$the_cyclist$.bind($$DaveS, thread);
            final SubLObject query_mt = followup_query_mt_for_userXtask(api_control_vars.$the_cyclist$.getDynamicValue(thread), $current_tl_task$.getDynamicValue(thread));
            final SubLObject fragment_sentence = Mapping.mapcar(FIRST, cae_query_search.get_fragments_for_terms(list(list($$$something, focal_term)), NIL, query_mt, $BLANKS, NIL, UNPROVIDED));
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$201 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$202 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = fragment_sentence;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.formula_find(focal_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        sentences = cons(list(sentence, sentence_score(sentence, focal_term, UNPROVIDED, UNPROVIDED)), sentences);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$202, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$201, thread);
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
            $current_tl_task$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }

    public static SubLObject sentences_with_scores_for_type(final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $current_tl_task$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            $current_tl_task$.bind($$GeneralCycKETask_Allotment, thread);
            api_control_vars.$the_cyclist$.bind($$DaveS, thread);
            final SubLObject focal_term = czer_main.canonicalize_term_assert(list($$GenericInstanceFn, type), UNPROVIDED);
            final SubLObject query_mt = followup_query_mt_for_userXtask(api_control_vars.$the_cyclist$.getDynamicValue(thread), $current_tl_task$.getDynamicValue(thread));
            final SubLObject substituted_fragments = get_fragments_for_terms_cached(list(list($$$something, focal_term)), NIL, query_mt, $BLANKS);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$203 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$204 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$205 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = substituted_fragments;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.formula_find(focal_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        sentences = cons(list(sentence, sentence_score(sentence, focal_term, UNPROVIDED, UNPROVIDED)), sentences);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$205, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$204, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$203, thread);
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_5, thread);
            $current_tl_task$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(sentences, $sym77$_, SECOND);
    }

    public static SubLObject clear_get_fragments_for_terms_cached() {
        final SubLObject cs = $get_fragments_for_terms_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_fragments_for_terms_cached(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        return memoization_state.caching_state_remove_function_results_with_args($get_fragments_for_terms_cached_caching_state$.getGlobalValue(), list(arg1, arg2, arg3, arg4), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_fragments_for_terms_cached_internal(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        return cae_query_search.get_fragments_for_terms(arg1, arg2, arg3, arg4, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_fragments_for_terms_cached(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        SubLObject caching_state = $get_fragments_for_terms_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_FRAGMENTS_FOR_TERMS_CACHED, $get_fragments_for_terms_cached_caching_state$, NIL, EQUALP, FOUR_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_FRAGMENTS_FOR_TERMS_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(arg1, arg2, arg3, arg4);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (arg1.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (arg2.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (arg3.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg4.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_fragments_for_terms_cached_internal(arg1, arg2, arg3, arg4)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(arg1, arg2, arg3, arg4));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject assert_orderings(SubLObject type, SubLObject assert_mt) {
        if (type == UNPROVIDED) {
            type = $$Restaurant_Organization;
        }
        if (assert_mt == UNPROVIDED) {
            assert_mt = $list739;
        }
        SubLObject cdolist_list_var = genls.all_specs(type, $$InferencePSC, UNPROVIDED);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert_ordering_for_type(spec, assert_mt);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject assert_ordering_for_type(final SubLObject type, SubLObject assert_mt) {
        if (assert_mt == UNPROVIDED) {
            assert_mt = $list739;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$DaveS, thread);
            SubLObject cdolist_list_var = sentences_with_scores_for_type(type, UNPROVIDED);
            SubLObject sentence_and_score = NIL;
            sentence_and_score = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = sentence_and_score;
                SubLObject sentence = NIL;
                SubLObject score = NIL;
                destructuring_bind_must_consp(current, datum, $list740);
                sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list740);
                score = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (score.numG(ZERO_INTEGER)) {
                        preds = cons(cycl_utilities.formula_arg0(sentence), preds);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list740);
                }
                ke.ke_assert(list($const368$summaryPredicateWRTSetOrCollectio, type, bq_cons($$TheList, preds)), assert_mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                sentence_and_score = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject pred_score(final SubLObject pred, final SubLObject focal_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject pred_arity = arity.arity(pred);
        SubLObject sentence = list(pred);
        SubLObject el_vars = NIL;
        SubLObject score = ZERO_INTEGER;
        SubLObject n;
        SubLObject el_var;
        for (n = NIL, n = ZERO_INTEGER; n.numL(pred_arity); n = add(n, ONE_INTEGER)) {
            el_var = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
            el_vars = cons(el_var, el_vars);
            sentence = list_utilities.snoc(el_var, sentence);
        }
        SubLObject this_sentence;
        for (n = NIL, n = ZERO_INTEGER; n.numL(pred_arity); n = add(n, ONE_INTEGER)) {
            this_sentence = bindings.apply_bindings(cae_query_search.xyz_varmap_for_formula(sentence), sentence);
            set_nth(add(ONE_INTEGER, n), this_sentence, focal_term);
            score = add(score, sentence_score(this_sentence, focal_term, mt, UNPROVIDED));
        }
        return score;
    }

    public static SubLObject preds_w_scores_from_rules(final SubLObject focal_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predsXscores = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject list_var = applicable_relations.applicable_predicates(focal_term, mt, $list741);
            final SubLObject _prev_bind_0_$206 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$207 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$208 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$cdolist, thread);
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
                    SubLObject pred = NIL;
                    pred = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        predsXscores = cons(list(pred, pred_score(pred, focal_term, UNPROVIDED)), predsXscores);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$207 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$207, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_2_$208, thread);
                $progress_start_time$.rebind(_prev_bind_1_$207, thread);
                $progress_note$.rebind(_prev_bind_0_$206, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(predsXscores, $sym77$_, SECOND);
    }

    public static SubLObject pred_score_for_type(final SubLObject pred, final SubLObject focal_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject pred_arity = arity.arity(pred);
        SubLObject sentence = list(pred);
        SubLObject el_vars = NIL;
        SubLObject score = ZERO_INTEGER;
        SubLObject n;
        SubLObject el_var;
        for (n = NIL, n = ZERO_INTEGER; n.numL(pred_arity); n = add(n, ONE_INTEGER)) {
            el_var = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
            el_vars = cons(el_var, el_vars);
            sentence = list_utilities.snoc(el_var, sentence);
        }
        SubLObject this_sentence;
        for (n = NIL, n = ZERO_INTEGER; n.numL(pred_arity); n = add(n, ONE_INTEGER)) {
            this_sentence = bindings.apply_bindings(cae_query_search.xyz_varmap_for_formula(sentence), sentence);
            score = add(score, sentence_score_for_type(this_sentence, list(add(ONE_INTEGER, n)), focal_type, mt, UNPROVIDED));
        }
        return score;
    }

    public static SubLObject preds_w_scores_for_type_from_rules(final SubLObject focal_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predsXscores = NIL;
        final SubLObject message = cconcatenate($$$gathering_preds_for_, format_nil.format_nil_s_no_copy(focal_type));
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject list_var = applicable_relations.applicable_predicates(list($$SomeFn, focal_type), mt, $list741);
            final SubLObject _prev_bind_0_$210 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$211 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$212 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
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
                    SubLObject pred = NIL;
                    pred = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        predsXscores = cons(list(pred, pred_score_for_type(pred, focal_type, UNPROVIDED)), predsXscores);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$211 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$211, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_2_$212, thread);
                $progress_start_time$.rebind(_prev_bind_1_$211, thread);
                $progress_note$.rebind(_prev_bind_0_$210, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(predsXscores, $sym77$_, SECOND);
    }

    public static SubLObject assert_ordering_for_type_from_rules(final SubLObject type, SubLObject assert_mt) {
        if (assert_mt == UNPROVIDED) {
            assert_mt = $list739;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds_and_scores = preds_w_scores_for_type_from_rules(type, UNPROVIDED);
        SubLObject preds = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$DaveS, thread);
            api_control_vars.$ke_purpose$.bind($$GeneralCycKETask_Allotment, thread);
            SubLObject cdolist_list_var = preds_and_scores;
            SubLObject pred_and_score = NIL;
            pred_and_score = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pred_and_score;
                SubLObject pred = NIL;
                SubLObject score = NIL;
                destructuring_bind_must_consp(current, datum, $list745);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list745);
                score = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (score.numG(ZERO_INTEGER)) {
                        preds = cons(pred, preds);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list745);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred_and_score = cdolist_list_var.first();
            } 
            preds = nreverse(preds);
            ke.ke_assert(list($const368$summaryPredicateWRTSetOrCollectio, type, bq_cons($$TheList, preds)), assert_mt, UNPROVIDED, UNPROVIDED);
        } finally {
            api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject assert_ordering_for_specs_from_rules(final SubLObject type, SubLObject task) {
        if (task == UNPROVIDED) {
            task = $$GeneralCycKETask_Allotment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assert_mt = list($const746$DocumentReaderFollowupsForTaskMtF, task);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject node_var = type;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$214 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$215 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$216 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str757$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$216 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$217 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$219 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$217 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$218 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$220 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        assert_ordering_for_type_from_rules(spec, assert_mt);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$218 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$219 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                    final SubLObject _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$226;
                                                                        for (iteration_state_$226 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$226); iteration_state_$226 = dictionary_contents.do_dictionary_contents_next(iteration_state_$226)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$226);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$220 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str758$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$220, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$226);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$219, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str759$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$228;
                                                        final SubLObject new_list = cdolist_list_var_$228 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$228.first();
                                                        while (NIL != cdolist_list_var_$228) {
                                                            final SubLObject _prev_bind_0_$221 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
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
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str758$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$221, thread);
                                                            }
                                                            cdolist_list_var_$228 = cdolist_list_var_$228.rest();
                                                            generating_fn = cdolist_list_var_$228.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$219, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$218, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$220, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$218, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$217, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str760$Node__a_does_not_pass_sbhl_type_t, type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$219, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$217, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$216, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$216, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$215, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$222 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$222, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$214, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject assert_applicable_preds_for_specs(final SubLObject type, SubLObject score_limit, SubLObject task) {
        if (score_limit == UNPROVIDED) {
            score_limit = $float$0_001;
        }
        if (task == UNPROVIDED) {
            task = $$GeneralCycKETask_Allotment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assert_mt = list($const746$DocumentReaderFollowupsForTaskMtF, task);
        SubLObject assert_sentences = NIL;
        final SubLObject soon_to_add = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject node_var = type;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$231 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$232 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$233 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str757$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str752$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$233 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$234 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$236 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$234 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$235 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$237 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        assert_sentences = cconcatenate(assert_sentences, get_applicable_formula_generators_for_type(spec, assert_mt, soon_to_add, score_limit));
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$235 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$236 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                    final SubLObject _prev_bind_0_$236 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$243;
                                                                        for (iteration_state_$243 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$243); iteration_state_$243 = dictionary_contents.do_dictionary_contents_next(iteration_state_$243)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$243);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$237 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str758$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$237, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$243);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$236, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str759$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$245;
                                                        final SubLObject new_list = cdolist_list_var_$245 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$245.first();
                                                        while (NIL != cdolist_list_var_$245) {
                                                            final SubLObject _prev_bind_0_$238 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
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
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str758$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$238, thread);
                                                            }
                                                            cdolist_list_var_$245 = cdolist_list_var_$245.rest();
                                                            generating_fn = cdolist_list_var_$245.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$236, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$235, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$237, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$235, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$234, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str760$Node__a_does_not_pass_sbhl_type_t, type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$236, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$234, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$233, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$233, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$232, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$239 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$239, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$231, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$DaveS, thread);
            api_control_vars.$ke_purpose$.bind($$GeneralCycKE, thread);
            SubLObject cdolist_list_var2 = assert_sentences;
            SubLObject assert_sentence = NIL;
            assert_sentence = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                ke.ke_assert(assert_sentence, assert_mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                assert_sentence = cdolist_list_var2.first();
            } 
        } finally {
            api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return assert_sentences;
    }

    public static SubLObject assert_applicable_preds_for_type(final SubLObject type, SubLObject score_limit, SubLObject task) {
        if (score_limit == UNPROVIDED) {
            score_limit = $float$0_001;
        }
        if (task == UNPROVIDED) {
            task = $$GeneralCycKETask_Allotment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assert_mt = list($const746$DocumentReaderFollowupsForTaskMtF, task);
        SubLObject assert_sentences = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            assert_sentences = cconcatenate(assert_sentences, get_applicable_formula_generators_for_type(type, assert_mt, NIL, score_limit));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$DaveS, thread);
            api_control_vars.$ke_purpose$.bind($$GeneralCycKE, thread);
            SubLObject cdolist_list_var = assert_sentences;
            SubLObject assert_sentence = NIL;
            assert_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert(assert_sentence, assert_mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assert_sentence = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return assert_sentences;
    }

    public static SubLObject get_applicable_formula_generators_for_type(final SubLObject type, final SubLObject assert_mt, SubLObject soon_to_add, SubLObject score_limit) {
        if (soon_to_add == UNPROVIDED) {
            soon_to_add = NIL;
        }
        if (score_limit == UNPROVIDED) {
            score_limit = $float$0_001;
        }
        SubLObject assert_sentences = NIL;
        final SubLObject preds_and_scores = preds_w_scores_for_type_from_rules(type, UNPROVIDED);
        final SubLObject search_constraint = cons(type, assert_mt);
        final SubLObject asserted_search_results = cae_query_search.lookup_isa_queries(search_constraint, UNPROVIDED);
        final SubLObject known_preds = Mapping.mapcar(CAAR, asserted_search_results);
        SubLObject cdolist_list_var = preds_and_scores;
        SubLObject pred_and_score = NIL;
        pred_and_score = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pred_and_score;
            SubLObject pred = NIL;
            SubLObject score = NIL;
            destructuring_bind_must_consp(current, datum, $list745);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list745);
            score = current.first();
            current = current.rest();
            if (NIL == current) {
                if (((!score.numL(score_limit)) && (NIL == subl_promotions.memberP(pred, known_preds, EQUAL, UNPROVIDED))) && ((NIL == soon_to_add) || (NIL == list_utilities.lengthG(genls.all_genls_among(type, dictionary.dictionary_lookup(soon_to_add, pred, UNPROVIDED), UNPROVIDED, UNPROVIDED), ZERO_INTEGER, UNPROVIDED)))) {
                    if (NIL != soon_to_add) {
                        dictionary_utilities.dictionary_push(soon_to_add, pred, type);
                    }
                    assert_sentences = cons(list($const764$generateFormulasForElements_TermI, type, list($$TheSet, pred)), assert_sentences);
                }
            } else {
                cdestructuring_bind_error(datum, $list745);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred_and_score = cdolist_list_var.first();
        } 
        return assert_sentences;
    }

    public static SubLObject new_term_learner_justifications(final SubLObject string, final SubLObject context_string, final SubLObject tool, SubLObject v_sources, SubLObject assert_mt) {
        if (v_sources == UNPROVIDED) {
            v_sources = NIL;
        }
        if (assert_mt == UNPROVIDED) {
            assert_mt = NIL;
        }
        if (NIL == v_sources) {
            return list(new_term_learner_justification(string, context_string, tool, v_sources, assert_mt));
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_sources;
        SubLObject source = NIL;
        source = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(new_term_learner_justification(string, context_string, tool, source, assert_mt), result);
            cdolist_list_var = cdolist_list_var.rest();
            source = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject new_term_learner_justification(final SubLObject string, final SubLObject context_string, final SubLObject tool, SubLObject source, SubLObject assert_mt) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (assert_mt == UNPROVIDED) {
            assert_mt = NIL;
        }
        SubLObject just = list($STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(string), $LEGEND_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(string), $CONTEXT_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings(context_string), $TOOL, tool);
        if (NIL != assert_mt) {
            just = putf(just, $ASSERT_MT, assert_mt);
        }
        if (NIL != source) {
            just = putf(just, $SOURCE, source);
        }
        return just;
    }

    public static SubLObject term_learner_justification_p(final SubLObject just) {
        return list_utilities.property_list_p(just);
    }

    public static SubLObject term_learner_justification_string(final SubLObject just) {
        return getf(just, $STRING, UNPROVIDED);
    }

    public static SubLObject term_learner_justification_context_string(final SubLObject just) {
        return getf(just, $CONTEXT_STRING, UNPROVIDED);
    }

    public static SubLObject term_learner_justification_tool(final SubLObject just) {
        return getf(just, $TOOL, UNPROVIDED);
    }

    public static SubLObject term_learner_justification_source(final SubLObject just) {
        return getf(just, $SOURCE, UNPROVIDED);
    }

    public static SubLObject term_learner_justification_assert_mt(final SubLObject just) {
        final SubLObject mt_id = getf(just, $ASSERT_MT, UNPROVIDED);
        if (NIL != mt_id) {
            return document_annotation_widgets.term_learner_object_from_id(mt_id);
        }
        return NIL;
    }

    public static SubLObject get_context_sentences_from_justifications(final SubLObject justifications) {
        SubLObject context_sentences = NIL;
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term_learner_justification_context_string(justification)) {
                final SubLObject item_var = term_learner_justification_context_string(justification);
                if (NIL == member(item_var, context_sentences, EQUAL, symbol_function(IDENTITY))) {
                    context_sentences = cons(item_var, context_sentences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return context_sentences;
    }

    public static SubLObject restart_concept_search_demo_server(final SubLObject host_name, final SubLObject port_num) {
        os_process_utilities.make_os_process($$$Restarting_CCF_Demo_Cyc_Server, $str770$_cyc_java_pkg_WebServicesTester_b, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject string_likely_denotes_collectionP(final SubLObject string, SubLObject doc) {
        if (doc == UNPROVIDED) {
            doc = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doc_string = string;
        SubLObject type_keyword = NIL;
        SubLObject timed_out = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$248 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(FOUR_INTEGER, tag);
                        type_keyword = string_typing.type_string(string);
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$248, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$249 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$249, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != doc) {
                        doc_string = (doc.isString()) ? doc : document.document_string(doc);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        final SubLObject pcase_var = type_keyword;
        if (pcase_var.eql($COLLECTION)) {
            return T;
        }
        if (pcase_var.eql($INDIVIDUAL)) {
            return NIL;
        }
        return makeBoolean(((NIL == string_utilities.starts_with_one_of(string, $list773)) && (NIL == named_entity_recognizer.named_entityP(doc_string, string))) && (NIL != collection_via_web_searchP(string)));
    }

    public static SubLObject clear_collection_via_web_searchP() {
        final SubLObject cs = $collection_via_web_searchP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_collection_via_web_searchP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($collection_via_web_searchP_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject collection_via_web_searchP_internal(final SubLObject string) {
        final SubLObject plural_to_singular_collection_cutoff = $float$0_01;
        final SubLObject count_to_mass_collection_cutoff = $float$0_1;
        if (plural_to_singular_ratio(string, UNPROVIDED).numG(plural_to_singular_collection_cutoff)) {
            return T;
        }
        if (count_to_mass_ratio(string, UNPROVIDED).numG(count_to_mass_collection_cutoff)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject collection_via_web_searchP(final SubLObject string) {
        SubLObject caching_state = $collection_via_web_searchP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym774$COLLECTION_VIA_WEB_SEARCH_, $sym777$_COLLECTION_VIA_WEB_SEARCH__CACHING_STATE_, $int$50, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(collection_via_web_searchP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject plural_to_singular_ratio(final SubLObject string, SubLObject count_method) {
        if (count_method == UNPROVIDED) {
            count_method = YAHOO_COUNT_CACHED;
        }
        final SubLObject plural_string = (NIL != morphology.plural_nounP(string)) ? string : morphology.pluralize_string(string, UNPROVIDED);
        final SubLObject singular_string = morphology.singularize_string(string, UNPROVIDED);
        final SubLObject plural_count = funcall(count_method, format_nil.format_nil_s(plural_string));
        final SubLObject singular_count = funcall(count_method, format_nil.format_nil_s(singular_string));
        if (singular_count.numE(ZERO_INTEGER)) {
            return values(ZERO_INTEGER, plural_count, singular_count);
        }
        return values(divide(plural_count, singular_count), plural_count, singular_count);
    }

    public static SubLObject count_to_mass_ratio(final SubLObject string, SubLObject count_method) {
        if (count_method == UNPROVIDED) {
            count_method = YAHOO_COUNT_CACHED;
        }
        final SubLObject plural_string = (NIL != morphology.plural_nounP(string)) ? string : morphology.pluralize_string(string, UNPROVIDED);
        final SubLObject singular_string = morphology.singularize_string(string, UNPROVIDED);
        final SubLObject mass_count = funcall(count_method, cconcatenate($str780$_much_, new SubLObject[]{ singular_string, $str781$_ }));
        final SubLObject count_count = funcall(count_method, cconcatenate($str782$_many_, new SubLObject[]{ plural_string, $str781$_ }));
        if (mass_count.numE(ZERO_INTEGER)) {
            return values(ZERO_INTEGER, count_count, mass_count);
        }
        return values(divide(count_count, mass_count), count_count, mass_count);
    }

    public static SubLObject clear_get_concept_tags_from_string() {
        final SubLObject cs = $get_concept_tags_from_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_concept_tags_from_string(final SubLObject text) {
        return memoization_state.caching_state_remove_function_results_with_args($get_concept_tags_from_string_caching_state$.getGlobalValue(), list(text), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_concept_tags_from_string_internal(final SubLObject text) {
        SubLObject concept_tags = NIL;
        final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon(UNPROVIDED);
        final SubLObject vector_var = document.document_paragraphs(document_annotation_widgets.new_tagged_document(text, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        SubLObject par_concept_tags;
        SubLObject vector_var_$250;
        SubLObject backwardP_var_$251;
        SubLObject length_$252;
        SubLObject v_iteration_$253;
        SubLObject element_num_$254;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$255;
        SubLObject word_cycl;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            par = aref(vector_var, element_num);
            par_concept_tags = NIL;
            vector_var_$250 = document.paragraph_sentences(par);
            backwardP_var_$251 = NIL;
            for (length_$252 = length(vector_var_$250), v_iteration_$253 = NIL, v_iteration_$253 = ZERO_INTEGER; v_iteration_$253.numL(length_$252); v_iteration_$253 = add(v_iteration_$253, ONE_INTEGER)) {
                element_num_$254 = (NIL != backwardP_var_$251) ? subtract(length_$252, v_iteration_$253, ONE_INTEGER) : v_iteration_$253;
                sentence = aref(vector_var_$250, element_num_$254);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$255 = document.word_cycls(word);
                    word_cycl = NIL;
                    word_cycl = cdolist_list_var_$255.first();
                    while (NIL != cdolist_list_var_$255) {
                        par_concept_tags = cons(make_concept_tag(word_cycl, document.word_offset(word), document.word_length(word), document.word_string(word)), par_concept_tags);
                        cdolist_list_var_$255 = cdolist_list_var_$255.rest();
                        word_cycl = cdolist_list_var_$255.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
            concept_tags = cons(par_concept_tags, concept_tags);
        }
        return concept_tags;
    }

    public static SubLObject get_concept_tags_from_string(final SubLObject text) {
        SubLObject caching_state = $get_concept_tags_from_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_CONCEPT_TAGS_FROM_STRING, $get_concept_tags_from_string_caching_state$, $int$1024, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_CONCEPT_TAGS_FROM_STRING);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, text, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_concept_tags_from_string_internal(text)));
            memoization_state.caching_state_put(caching_state, text, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject find_fillers_in_text(final SubLObject cycl_sentences, final SubLObject var_lists, final SubLObject text, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject results = NIL;
        final SubLObject concept_tags_by_par = get_concept_tags_from_string(text);
        SubLObject cycl_sentence = NIL;
        SubLObject cycl_sentence_$256 = NIL;
        SubLObject var_list = NIL;
        SubLObject var_list_$257 = NIL;
        cycl_sentence = cycl_sentences;
        cycl_sentence_$256 = cycl_sentence.first();
        var_list = var_lists;
        var_list_$257 = var_list.first();
        while ((NIL != var_list) || (NIL != cycl_sentence)) {
            SubLObject cdolist_list_var = concept_tags_by_par;
            SubLObject concept_tags = NIL;
            concept_tags = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject tags_in_formula = find_formula_args_among_concept_tags(cycl_sentence_$256, concept_tags, UNPROVIDED);
                if (NIL != tags_in_formula) {
                    final SubLObject filler_sets = fillers_from_concept_tags_multiple(cycl_sentence_$256, var_list_$257, concept_tags, tags_in_formula, mt, UNPROVIDED);
                    results = cons(list(cycl_sentence_$256, var_list_$257, filler_sets), results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                concept_tags = cdolist_list_var.first();
            } 
            cycl_sentence = cycl_sentence.rest();
            cycl_sentence_$256 = cycl_sentence.first();
            var_list = var_list.rest();
            var_list_$257 = var_list.first();
        } 
        return results;
    }

    public static SubLObject fillers_from_concept_tags_multiple(final SubLObject cycl_sentence, final SubLObject var_list, final SubLObject concept_tags, final SubLObject tags_in_formula, SubLObject mt, SubLObject use_cutoffP) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (use_cutoffP == UNPROVIDED) {
            use_cutoffP = NIL;
        }
        SubLObject lists = NIL;
        SubLObject cdolist_list_var = var_list;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lists = cons(fillers_from_concept_tags(cycl_sentence, var, concept_tags, tags_in_formula, mt, use_cutoffP), lists);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return list_utilities.cartesian_product(lists, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fillers_from_concept_tags(final SubLObject cycl_sentence, final SubLObject var, final SubLObject concept_tags, final SubLObject tags_in_formula, SubLObject mt, SubLObject use_cutoffP) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (use_cutoffP == UNPROVIDED) {
            use_cutoffP = NIL;
        }
        final SubLObject candidate_tags = tags_satisfying_arg_constraints(cycl_sentence, var, concept_tags, mt);
        SubLObject scored_fillers = NIL;
        SubLObject cdolist_list_var = candidate_tags;
        SubLObject tag = NIL;
        tag = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = score_tag(tag, tags_in_formula);
            final SubLObject cycl = get_concept_tag_cycl(tag);
            if (!score.eql(ZERO_INTEGER)) {
                scored_fillers = cons(make_filler(cons(var, cycl), tag, score), scored_fillers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tag = cdolist_list_var.first();
        } 
        if ((NIL != use_cutoffP) && (NIL != scored_fillers)) {
            final SubLObject cutoff = number_utilities.mean(Mapping.mapcar(symbol_function(GET_FILLER_SCORE), scored_fillers));
            SubLObject fillers = NIL;
            SubLObject cdolist_list_var2 = scored_fillers;
            SubLObject filler = NIL;
            filler = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject score2 = get_filler_score(filler);
                if (score2.numGE(cutoff)) {
                    fillers = cons(filler, fillers);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                filler = cdolist_list_var2.first();
            } 
            return fillers;
        }
        return scored_fillers;
    }

    public static SubLObject find_formula_args_among_concept_tags(final SubLObject cycl_sentence, final SubLObject concept_tags, SubLObject first_only) {
        if (first_only == UNPROVIDED) {
            first_only = NIL;
        }
        SubLObject tags_in_formula = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_sentence, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$258 = concept_tags;
            SubLObject tag = NIL;
            tag = cdolist_list_var_$258.first();
            while (NIL != cdolist_list_var_$258) {
                final SubLObject concept = get_concept_tag_cycl(tag);
                if (concept.equal(v_term)) {
                    if (NIL != first_only) {
                        return list(tag);
                    }
                    tags_in_formula = cons(tag, tags_in_formula);
                }
                cdolist_list_var_$258 = cdolist_list_var_$258.rest();
                tag = cdolist_list_var_$258.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return tags_in_formula;
    }

    public static SubLObject score_tag(final SubLObject tag, final SubLObject tags_in_formula) {
        return minus(minimum_tag_distance(tag, tags_in_formula));
    }

    public static SubLObject minimum_tag_distance(final SubLObject tag, final SubLObject concept_tags) {
        SubLObject min_distance = NIL;
        SubLObject cdolist_list_var = concept_tags;
        SubLObject other_tag = NIL;
        other_tag = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject distance = tag_distance(tag, other_tag);
            if (NIL == min_distance) {
                min_distance = distance;
            } else
                if (distance.numL(min_distance)) {
                    min_distance = distance;
                }

            cdolist_list_var = cdolist_list_var.rest();
            other_tag = cdolist_list_var.first();
        } 
        return min_distance;
    }

    public static SubLObject tag_distance(final SubLObject tag1, final SubLObject tag2) {
        final SubLObject tag1offset = get_concept_tag_offset(tag1);
        final SubLObject tag2offset = get_concept_tag_offset(tag2);
        final SubLObject diff = subtract(tag1offset, tag2offset);
        return abs(diff);
    }

    public static SubLObject tags_satisfying_arg_constraints(final SubLObject cycl_sentence, final SubLObject var, final SubLObject concept_tags, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject result_tags = NIL;
        final SubLObject arg_constraints = html_complete.get_arg_constraints_for_var(cycl_sentence, var, mt);
        final SubLObject isa_filter = html_complete.get_isa_filter_from_arg_constraints(arg_constraints);
        final SubLObject genls_filter = html_complete.get_genls_filter_from_arg_constraints(arg_constraints);
        if (NIL != arg_constraints) {
            SubLObject cdolist_list_var = concept_tags;
            SubLObject tag = NIL;
            tag = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject concept = get_concept_tag_cycl(tag);
                if (NIL != html_complete.term_passes_arg_filters(concept, isa_filter, genls_filter, mt)) {
                    result_tags = cons(tag, result_tags);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tag = cdolist_list_var.first();
            } 
        }
        return result_tags;
    }

    public static SubLObject make_concept_tag(final SubLObject concept, final SubLObject offset, final SubLObject length, final SubLObject nl) {
        return list(concept, offset, length, nl);
    }

    public static SubLObject get_concept_tag_cycl(final SubLObject concept_tag) {
        return concept_tag.first();
    }

    public static SubLObject get_concept_tag_offset(final SubLObject concept_tag) {
        return second(concept_tag);
    }

    public static SubLObject get_concept_tag_length(final SubLObject concept_tag) {
        return second(concept_tag);
    }

    public static SubLObject get_concept_tag_nl(final SubLObject concept_tag) {
        return third(concept_tag);
    }

    public static SubLObject concept_tag_p(final SubLObject thing) {
        return makeBoolean(thing.isList() && ((NIL == thing) || ((((NIL != cycl_grammar.cycl_expression_p(get_concept_tag_cycl(thing))) && get_concept_tag_offset(thing).isNumber()) && get_concept_tag_length(thing).isNumber()) && get_concept_tag_nl(thing).isString())));
    }

    public static SubLObject find_sentence_fillers(final SubLObject strings, final SubLObject sentence_ids, final SubLObject arg_pos_list, SubLObject user) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(FIND_SENTENCE_FILLERS, strings, sentence_ids, arg_pos_list, user));
        }
        if (NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(FIND_SENTENCE_FILLERS, strings, sentence_ids, arg_pos_list, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject string = unicode_strings.display_to_subl_string(NIL != unicode_nauts.unicode_naut_p(caar(strings), UNPROVIDED) ? cycl_utilities.formula_arg1(caar(strings), UNPROVIDED) : caar(strings), UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sentences = reformat_sentences_and_vars(sentence_ids, arg_pos_list);
        final SubLObject var_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject task = default_task_for_user(user);
        final SubLObject mt = followup_query_mt_for_userXtask(user, task);
        final SubLObject filler_results = find_fillers_in_text(sentences, var_lists, string, mt);
        SubLObject types = NIL;
        SubLObject cdolist_list_var = filler_results;
        SubLObject filler_result = NIL;
        filler_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = filler_result;
            SubLObject sentence = NIL;
            SubLObject vars = NIL;
            SubLObject answer_sets = NIL;
            destructuring_bind_must_consp(current, datum, $list788);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list788);
            vars = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list788);
            answer_sets = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$259 = construct_sentences_from_template_and_bindings(sentence, vars, answer_sets);
                SubLObject cycl = NIL;
                cycl = cdolist_list_var_$259.first();
                while (NIL != cdolist_list_var_$259) {
                    if (NIL == term_learner_knownP(cycl, mt)) {
                        types = cons(term_learner_type_for_fragment_int(cycl, mt, $list789, NIL, NIL, $DEFAULT, NIL, cure_default_generation_mt(UNPROVIDED), $needs_approval$.getGlobalValue(), NIL, NIL, NIL, UNPROVIDED, UNPROVIDED), types);
                    }
                    cdolist_list_var_$259 = cdolist_list_var_$259.rest();
                    cycl = cdolist_list_var_$259.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list788);
            }
            cdolist_list_var = cdolist_list_var.rest();
            filler_result = cdolist_list_var.first();
        } 
        return types;
    }

    public static SubLObject reformat_sentences_and_vars(final SubLObject sentence_ids, final SubLObject arg_pos_lists) {
        final SubLObject ordered_sentence_ids = Sort.sort(sentence_ids, $sym77$_, SECOND);
        final SubLObject ordered_arg_poses = Sort.sort(arg_pos_lists, $sym77$_, SECOND);
        SubLObject result_alist = NIL;
        SubLObject sentences = NIL;
        SubLObject var_lists = NIL;
        SubLObject sentence_id = NIL;
        SubLObject sentence_id_$260 = NIL;
        SubLObject arg_pos_with_index = NIL;
        SubLObject arg_pos_with_index_$261 = NIL;
        sentence_id = ordered_sentence_ids;
        sentence_id_$260 = sentence_id.first();
        arg_pos_with_index = ordered_arg_poses;
        arg_pos_with_index_$261 = arg_pos_with_index.first();
        while ((NIL != arg_pos_with_index) || (NIL != sentence_id)) {
            final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id(sentence_id_$260.first());
            final SubLObject arg_pos = read_from_string_ignoring_errors(arg_pos_with_index_$261.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject var = cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED);
            result_alist = list_utilities.alist_push(result_alist, sentence, var, EQUAL);
            sentence_id = sentence_id.rest();
            sentence_id_$260 = sentence_id.first();
            arg_pos_with_index = arg_pos_with_index.rest();
            arg_pos_with_index_$261 = arg_pos_with_index.first();
        } 
        SubLObject cdolist_list_var = result_alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject cycl_sentence = NIL;
            SubLObject var_list = NIL;
            destructuring_bind_must_consp(current, datum, $list790);
            cycl_sentence = current.first();
            current = var_list = current.rest();
            sentences = cons(cycl_sentence, sentences);
            var_lists = cons(var_list, var_lists);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return values(sentences, var_lists);
    }

    public static SubLObject construct_sentences_from_template_and_bindings(final SubLObject sentence, final SubLObject vars, final SubLObject answer_sets) {
        SubLObject result_sentences = NIL;
        SubLObject cdolist_list_var = answer_sets;
        SubLObject answer_set = NIL;
        answer_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject temp_sentence = sentence;
            SubLObject cdolist_list_var_$262 = answer_set;
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var_$262.first();
            while (NIL != cdolist_list_var_$262) {
                temp_sentence = cycl_utilities.expression_subst(get_filler_cycl(v_answer), get_filler_var(v_answer), temp_sentence, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$262 = cdolist_list_var_$262.rest();
                v_answer = cdolist_list_var_$262.first();
            } 
            result_sentences = cons(temp_sentence, result_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            answer_set = cdolist_list_var.first();
        } 
        return result_sentences;
    }

    public static SubLObject make_filler(final SubLObject var_binding, final SubLObject concept_tag, final SubLObject score) {
        return list(var_binding, concept_tag, score);
    }

    public static SubLObject get_filler_var_binding(final SubLObject filler) {
        return filler.first();
    }

    public static SubLObject get_filler_tag(final SubLObject filler) {
        return second(filler);
    }

    public static SubLObject get_filler_score(final SubLObject filler) {
        return third(filler);
    }

    public static SubLObject get_filler_cycl(final SubLObject filler) {
        return get_filler_var_binding(filler).rest();
    }

    public static SubLObject get_filler_var(final SubLObject filler) {
        return get_filler_var_binding(filler).first();
    }

    public static SubLObject filler_p(final SubLObject thing) {
        return makeBoolean(thing.isList() && ((NIL == thing) || ((get_filler_var_binding(thing).isCons() && (NIL != concept_tag_p(get_filler_tag(thing)))) && (get_filler_score(thing).isNumber() || (NIL == get_filler_score(thing))))));
    }

    public static SubLObject get_queries_for_term(final SubLObject v_term, final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = NIL;
        }
        final SubLObject user_task = (NIL != task) ? task : default_task_for_user(user);
        final SubLObject followup_mt = followup_query_mt_for_userXtask(user, user_task);
        final SubLObject query_mt = query_mt_for_task(user_task);
        final SubLObject queries;
        final SubLObject raw_queries = queries = term_learner_unsorted_fragments_for_term(v_term, followup_mt, query_mt, NIL, T, NIL);
        return queries;
    }

    public static SubLObject get_queries_from_sentences(final SubLObject sentences, final SubLObject user, SubLObject task) {
        if (task == UNPROVIDED) {
            task = NIL;
        }
        final SubLObject user_task = (NIL != task) ? task : default_task_for_user(user);
        final SubLObject domain_mt = query_mt_for_task(user_task);
        final SubLObject nl_mt = cure_default_generation_mt(UNPROVIDED);
        SubLObject queries = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject current_sentence = NIL;
        current_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queries = cons(term_learner_type_for_fragment_int(current_sentence, domain_mt, current_sentence, NIL, NIL, NIL, NIL, nl_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), queries);
            cdolist_list_var = cdolist_list_var.rest();
            current_sentence = cdolist_list_var.first();
        } 
        return nreverse(queries);
    }

    public static SubLObject term_learner_autocomplete_native_with_cycadministrator(final SubLObject prefix, SubLObject limit, SubLObject return_attrs, SubLObject sentence, SubLObject arg_pos, SubLObject case_sensitive, SubLObject constants) {
        if (limit == UNPROVIDED) {
            limit = TWENTY_INTEGER;
        }
        if (return_attrs == UNPROVIDED) {
            return_attrs = $str50$;
        }
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (arg_pos == UNPROVIDED) {
            arg_pos = ZERO_INTEGER;
        }
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = NIL;
        }
        if (constants == UNPROVIDED) {
            constants = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$CycAdministrator, thread);
            return term_learner_autocomplete_int(prefix, string_utilities.to_string(limit), return_attrs, kb_utilities.compact_hl_external_id_string(sentence), string_utilities.to_string(arg_pos), string_utilities.to_string(case_sensitive), string_utilities.to_string(constants), T);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject valid_hierarchical_candidates_p(final SubLObject obj, final SubLObject expected_truth) {
        SubLObject cdolist_list_var = obj;
        SubLObject arg_and_candidates = NIL;
        arg_and_candidates = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == list_utilities.proper_list_p(arg_and_candidates)) || (NIL == cycl_utilities.arg_position_p(arg_and_candidates.first()))) {
                return NIL;
            }
            SubLObject cdolist_list_var_$263 = second(arg_and_candidates);
            SubLObject candidate_hierarchy = NIL;
            candidate_hierarchy = cdolist_list_var_$263.first();
            while (NIL != cdolist_list_var_$263) {
                if (NIL == candidate_renderer_p(candidate_hierarchy.first())) {
                    return NIL;
                }
                cdolist_list_var_$263 = cdolist_list_var_$263.rest();
                candidate_hierarchy = cdolist_list_var_$263.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg_and_candidates = cdolist_list_var.first();
        } 
        return NIL != expected_truth ? T : NIL;
    }

    public static SubLObject candidate_renderer_p(final SubLObject obj) {
        return makeBoolean((((NIL != list_utilities.property_list_p(obj)) && (NIL != getf(obj, $STRING, UNPROVIDED))) && (NIL != cycl_grammar.cycl_denotational_term_p(getf(obj, $CYCL, UNPROVIDED)))) && (NIL != getf(obj, $CYCL_ID, UNPROVIDED)));
    }

    public static SubLObject some_selection_renderer_has_string_p(final SubLObject fragments, final SubLObject desired_string) {
        SubLObject cdolist_list_var = fragments;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$264 = getf(fragment, $RENDERERS, UNPROVIDED);
            SubLObject renderer = NIL;
            renderer = cdolist_list_var_$264.first();
            while (NIL != cdolist_list_var_$264) {
                if (getf(renderer, $RENDERER_TYPE, UNPROVIDED) == $OPEN_SELECT_RENDERER) {
                    SubLObject cdolist_list_var_$265 = getf(renderer, $SELECTION_RENDERERS, UNPROVIDED);
                    SubLObject selection_renderer = NIL;
                    selection_renderer = cdolist_list_var_$265.first();
                    while (NIL != cdolist_list_var_$265) {
                        if (getf(selection_renderer, $STRING, UNPROVIDED).equalp(desired_string)) {
                            return T;
                        }
                        cdolist_list_var_$265 = cdolist_list_var_$265.rest();
                        selection_renderer = cdolist_list_var_$265.first();
                    } 
                }
                cdolist_list_var_$264 = cdolist_list_var_$264.rest();
                renderer = cdolist_list_var_$264.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject term_learner_types_for_sentence_id_test_fn(final SubLObject sentence, final SubLObject user, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        return term_learner_types_for_sentence_id(kb_utilities.compact_hl_external_id_string(sentence), user, arg3, arg4, arg5, arg6);
    }

    public static SubLObject term_learner_known_bindings_for_sentence_neg(final SubLObject arg1, final SubLObject arg2) {
        return term_learner_known_bindings_for_sentence(arg1, arg2, UNPROVIDED);
    }

    public static SubLObject bindings_dont_mention(final SubLObject v_bindings, final SubLObject unmentionable) {
        return makeBoolean(NIL == list_utilities.tree_find(unmentionable, v_bindings, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject bindings_mention(final SubLObject v_bindings, final SubLObject unmentionable) {
        return list_utilities.tree_find(unmentionable, v_bindings, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_cure_api_file() {
        declareMacro(me, "new_term_learner_type", "NEW-TERM-LEARNER-TYPE");
        declareMacro(me, "term_learner_type_for_fragment_int_2", "TERM-LEARNER-TYPE-FOR-FRAGMENT-INT-2");
        declareFunction(me, "term_learner_known_meanings_for_string", "TERM-LEARNER-KNOWN-MEANINGS-FOR-STRING", 1, 3, false);
        declareFunction(me, "term_learner_create_as_individualP", "TERM-LEARNER-CREATE-AS-INDIVIDUAL?", 1, 2, false);
        declareFunction(me, "term_learner_meanings_for_tagged_term", "TERM-LEARNER-MEANINGS-FOR-TAGGED-TERM", 1, 2, false);
        declareFunction(me, "find_or_create_term_learner_stub_term", "FIND-OR-CREATE-TERM-LEARNER-STUB-TERM", 2, 0, false);
        declareFunction(me, "term_learner_stub_constantP", "TERM-LEARNER-STUB-CONSTANT?", 1, 0, false);
        declareFunction(me, "new_term_learner_term_meaning", "NEW-TERM-LEARNER-TERM-MEANING", 1, 2, false);
        declareFunction(me, "cure_remove_from_default_lexicon", "CURE-REMOVE-FROM-DEFAULT-LEXICON", 2, 0, false);
        declareFunction(me, "cure_remove_lex_entry_from_default_lexicon", "CURE-REMOVE-LEX-ENTRY-FROM-DEFAULT-LEXICON", 2, 0, false);
        declareFunction(me, "term_learner_ordered_types_for_tagged_term", "TERM-LEARNER-ORDERED-TYPES-FOR-TAGGED-TERM", 1, 2, false);
        declareFunction(me, "get_taxonomic_renderers_for_term", "GET-TAXONOMIC-RENDERERS-FOR-TERM", 5, 0, false);
        declareFunction(me, "term_learner_min_genls", "TERM-LEARNER-MIN-GENLS", 2, 1, false);
        declareFunction(me, "term_learner_min_genls_int", "TERM-LEARNER-MIN-GENLS-INT", 2, 1, false);
        declareFunction(me, "term_learner_min_isa", "TERM-LEARNER-MIN-ISA", 2, 1, false);
        declareFunction(me, "term_learner_min_isa_int", "TERM-LEARNER-MIN-ISA-INT", 2, 0, false);
        declareFunction(me, "term_learner_max_specs", "TERM-LEARNER-MAX-SPECS", 2, 1, false);
        declareFunction(me, "term_learner_max_specs_int", "TERM-LEARNER-MAX-SPECS-INT", 2, 1, false);
        declareFunction(me, "term_learner_max_instances", "TERM-LEARNER-MAX-INSTANCES", 2, 1, false);
        declareFunction(me, "term_learner_max_instances_int", "TERM-LEARNER-MAX-INSTANCES-INT", 2, 0, false);
        declareFunction(me, "term_learner_asserts_for_formula", "TERM-LEARNER-ASSERTS-FOR-FORMULA", 2, 0, false);
        declareFunction(me, "make_term_learner_justifications_from_asserts", "MAKE-TERM-LEARNER-JUSTIFICATIONS-FROM-ASSERTS", 1, 0, false);
        declareFunction(me, "term_learner_lexical_types_for_tagged_term", "TERM-LEARNER-LEXICAL-TYPES-FOR-TAGGED-TERM", 1, 2, false);
        declareFunction(me, "term_learner_lexical_assertions_for_term", "TERM-LEARNER-LEXICAL-ASSERTIONS-FOR-TERM", 2, 0, false);
        declareFunction(me, "term_learner_ordered_types_for_term_in_document_string_merged_justifications", "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT-STRING-MERGED-JUSTIFICATIONS", 3, 1, false);
        declareFunction(me, "term_learner_ordered_types_for_user_added_type", "TERM-LEARNER-ORDERED-TYPES-FOR-USER-ADDED-TYPE", 3, 2, false);
        declareFunction(me, "term_learner_isa_or_genls", "TERM-LEARNER-ISA-OR-GENLS", 2, 2, false);
        declareFunction(me, "clear_default_create_as_type", "CLEAR-DEFAULT-CREATE-AS-TYPE", 0, 0, false);
        declareFunction(me, "remove_default_create_as_type", "REMOVE-DEFAULT-CREATE-AS-TYPE", 1, 1, false);
        declareFunction(me, "default_create_as_type_internal", "DEFAULT-CREATE-AS-TYPE-INTERNAL", 2, 0, false);
        declareFunction(me, "default_create_as_type", "DEFAULT-CREATE-AS-TYPE", 1, 1, false);
        declareFunction(me, "new_term_learner_type_int", "NEW-TERM-LEARNER-TYPE-INT", 7, 6, false);
        declareFunction(me, "free_some_variables", "FREE-SOME-VARIABLES", 1, 0, false);
        declareFunction(me, "get_term_learner_renderer_for_cycl_string", "GET-TERM-LEARNER-RENDERER-FOR-CYCL-STRING", 1, 0, false);
        declareFunction(me, "get_term_learner_renderer_for_cycl_id", "GET-TERM-LEARNER-RENDERER-FOR-CYCL-ID", 1, 0, false);
        declareFunction(me, "get_term_learner_renderer_for_cycl", "GET-TERM-LEARNER-RENDERER-FOR-CYCL", 1, 0, false);
        declareFunction(me, "get_term_learner_string_renderer_for_cycl_string", "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-STRING", 1, 0, false);
        declareFunction(me, "get_term_learner_string_renderer_for_cycl_id", "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-ID", 1, 0, false);
        declareFunction(me, "get_term_learner_string_renderer_for_cycl", "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL", 1, 0, false);
        declareFunction(me, "get_term_learner_string_renderer_from_open_select_renderer_list", "GET-TERM-LEARNER-STRING-RENDERER-FROM-OPEN-SELECT-RENDERER-LIST", 1, 0, false);
        declareFunction(me, "new_term_learner_string_renderer", "NEW-TERM-LEARNER-STRING-RENDERER", 1, 3, false);
        declareFunction(me, "new_term_learner_modifiable_string_renderer", "NEW-TERM-LEARNER-MODIFIABLE-STRING-RENDERER", 2, 0, false);
        declareFunction(me, "new_term_learner_modifiable_text_renderer", "NEW-TERM-LEARNER-MODIFIABLE-TEXT-RENDERER", 2, 0, false);
        declareFunction(me, "new_term_learner_open_select_renderer", "NEW-TERM-LEARNER-OPEN-SELECT-RENDERER", 2, 3, false);
        declareFunction(me, "arg_constraint_string", "ARG-CONSTRAINT-STRING", 1, 0, false);
        declareFunction(me, "new_term_learner_open_select_renderer_int", "NEW-TERM-LEARNER-OPEN-SELECT-RENDERER-INT", 1, 1, false);
        declareFunction(me, "get_legend_string_from_justifications", "GET-LEGEND-STRING-FROM-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "new_term_learner_single_justification_type", "NEW-TERM-LEARNER-SINGLE-JUSTIFICATION-TYPE", 6, 3, false);
        declareFunction(me, "term_learner_add_lexical_phrase", "TERM-LEARNER-ADD-LEXICAL-PHRASE", 2, 5, false);
        declareFunction(me, "xml_term_learner_user_choice", "XML-TERM-LEARNER-USER-CHOICE", 1, 0, false);
        declareFunction(me, "get_substitutions_from_args", "GET-SUBSTITUTIONS-FROM-ARGS", 1, 0, false);
        declareFunction(me, "string_to_user_action_keyword", "STRING-TO-USER-ACTION-KEYWORD", 1, 0, false);
        declareFunction(me, "term_learner_user_choice", "TERM-LEARNER-USER-CHOICE", 10, 0, false);
        declareFunction(me, "xml_term_learner_create_new", "XML-TERM-LEARNER-CREATE-NEW", 1, 0, false);
        declareFunction(me, "is_formula_arg_position_a_collectionP", "IS-FORMULA-ARG-POSITION-A-COLLECTION?", 2, 2, false);
        declareFunction(me, "cure_assert_sentence", "CURE-ASSERT-SENTENCE", 1, 3, false);
        declareFunction(me, "cure_unassert_sentence", "CURE-UNASSERT-SENTENCE", 1, 3, false);
        declareFunction(me, "create_new_cure_term_and_assert_sentence", "CREATE-NEW-CURE-TERM-AND-ASSERT-SENTENCE", 3, 5, false);
        declareFunction(me, "term_learner_create_new", "TERM-LEARNER-CREATE-NEW", 3, 5, false);
        declareFunction(me, "assert_mt_for_sentence", "ASSERT-MT-FOR-SENTENCE", 3, 0, false);
        declareFunction(me, "new_term_will_be_collectionP", "NEW-TERM-WILL-BE-COLLECTION?", 1, 0, false);
        declareFunction(me, "term_learner_renderer_for_new_taxonomic_relative", "TERM-LEARNER-RENDERER-FOR-NEW-TAXONOMIC-RELATIVE", 4, 2, false);
        declareFunction(me, "term_learner_get_taxonomic_sentence_for_new_type", "TERM-LEARNER-GET-TAXONOMIC-SENTENCE-FOR-NEW-TYPE", 2, 0, false);
        declareFunction(me, "get_base_sentence_from_sentence_string", "GET-BASE-SENTENCE-FROM-SENTENCE-STRING", 1, 0, false);
        declareFunction(me, "find_by_id_string_p", "FIND-BY-ID-STRING-P", 1, 0, false);
        declareFunction(me, "decode_id_string", "DECODE-ID-STRING", 1, 0, false);
        declareFunction(me, "xml_term_learner_user_substitution", "XML-TERM-LEARNER-USER-SUBSTITUTION", 1, 0, false);
        declareFunction(me, "term_learner_user_substitution", "TERM-LEARNER-USER-SUBSTITUTION", 4, 5, false);
        declareFunction(me, "get_nl_cycl_valid_triples_via_scg", "GET-NL-CYCL-VALID-TRIPLES-VIA-SCG", 5, 1, false);
        declareFunction(me, "term_learner_constraint_list_from_string", "TERM-LEARNER-CONSTRAINT-LIST-FROM-STRING", 1, 0, false);
        declareFunction(me, "clear_term_learner_valid_substitution", "CLEAR-TERM-LEARNER-VALID-SUBSTITUTION", 0, 0, false);
        declareFunction(me, "remove_term_learner_valid_substitution", "REMOVE-TERM-LEARNER-VALID-SUBSTITUTION", 5, 0, false);
        declareFunction(me, "term_learner_valid_substitution_internal", "TERM-LEARNER-VALID-SUBSTITUTION-INTERNAL", 5, 0, false);
        declareFunction(me, "term_learner_valid_substitution", "TERM-LEARNER-VALID-SUBSTITUTION", 5, 0, false);
        declareFunction(me, "subword_nl_cycl_pairs_from_string", "SUBWORD-NL-CYCL-PAIRS-FROM-STRING", 1, 0, false);
        declareFunction(me, "xml_term_learner_possible_types_from_substitution", "XML-TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION", 1, 0, false);
        declareFunction(me, "term_learner_possible_types_from_substitution", "TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION", 3, 2, false);
        declareFunction(me, "term_learner_get_word_denots_from_string", "TERM-LEARNER-GET-WORD-DENOTS-FROM-STRING", 1, 1, false);
        declareFunction(me, "first_true", "FIRST-TRUE", 2, 0, false);
        declareFunction(me, "second_true", "SECOND-TRUE", 2, 0, false);
        declareMacro(me, "term_learner_autocomplete_native", "TERM-LEARNER-AUTOCOMPLETE-NATIVE");
        declareMacro(me, "term_learner_autocomplete", "TERM-LEARNER-AUTOCOMPLETE");
        declareFunction(me, "xml_term_learner_autocomplete", "XML-TERM-LEARNER-AUTOCOMPLETE", 1, 0, false);
        declareFunction(me, "term_learner_autocomplete_int", "TERM-LEARNER-AUTOCOMPLETE-INT", 8, 0, false);
        declareFunction(me, "get_allotted_tasks", "GET-ALLOTTED-TASKS", 1, 0, false);
        declareFunction(me, "term_learner_get_fact_sheet_for_term", "TERM-LEARNER-GET-FACT-SHEET-FOR-TERM", 1, 2, false);
        declareFunction(me, "term_learner_get_fact_sheet_updates_for_term", "TERM-LEARNER-GET-FACT-SHEET-UPDATES-FOR-TERM", 1, 2, false);
        declareFunction(me, "term_learner_standard_fact_sheet_properties", "TERM-LEARNER-STANDARD-FACT-SHEET-PROPERTIES", 0, 0, false);
        declareFunction(me, "term_learner_context_sensitive_fact_sheet_properties", "TERM-LEARNER-CONTEXT-SENSITIVE-FACT-SHEET-PROPERTIES", 3, 0, false);
        declareFunction(me, "term_learner_prefer_slot_value_fact_sheetsP", "TERM-LEARNER-PREFER-SLOT-VALUE-FACT-SHEETS?", 3, 0, false);
        declareFunction(me, "forbidden_slot_value_fact_sheet_category_preds", "FORBIDDEN-SLOT-VALUE-FACT-SHEET-CATEGORY-PREDS", 3, 0, false);
        declareFunction(me, "concept_naked_for_factsheetP", "CONCEPT-NAKED-FOR-FACTSHEET?", 1, 1, false);
        declareFunction(me, "term_learner_unmodifiable_statusP", "TERM-LEARNER-UNMODIFIABLE-STATUS?", 1, 0, false);
        declareFunction(me, "term_learner_known_statusP", "TERM-LEARNER-KNOWN-STATUS?", 1, 0, false);
        declareFunction(me, "term_learner_fact_status", "TERM-LEARNER-FACT-STATUS", 7, 0, false);
        declareFunction(me, "cure_specify_is", "CURE-SPECIFY-IS", 2, 0, false);
        declareFunction(me, "find_query_mt_from_justifications", "FIND-QUERY-MT-FROM-JUSTIFICATIONS", 1, 1, false);
        declareFunction(me, "clear_term_learner_fact_status_int", "CLEAR-TERM-LEARNER-FACT-STATUS-INT", 0, 0, false);
        declareFunction(me, "remove_term_learner_fact_status_int", "REMOVE-TERM-LEARNER-FACT-STATUS-INT", 2, 1, false);
        declareFunction(me, "term_learner_fact_status_int_internal", "TERM-LEARNER-FACT-STATUS-INT-INTERNAL", 3, 0, false);
        declareFunction(me, "term_learner_fact_status_int", "TERM-LEARNER-FACT-STATUS-INT", 2, 1, false);
        declareFunction(me, "term_learner_knownP", "TERM-LEARNER-KNOWN?", 2, 0, false);
        declareFunction(me, "sentence_removable_by_userP", "SENTENCE-REMOVABLE-BY-USER?", 2, 0, false);
        declareFunction(me, "cure_user_has_arbitrary_deletion_privileges", "CURE-USER-HAS-ARBITRARY-DELETION-PRIVILEGES", 0, 1, false);
        declareFunction(me, "derived_sentenceP", "DERIVED-SENTENCE?", 2, 0, false);
        declareFunction(me, "term_learner_find_visible_assertions_cycl_internal", "TERM-LEARNER-FIND-VISIBLE-ASSERTIONS-CYCL-INTERNAL", 1, 1, false);
        declareFunction(me, "term_learner_find_visible_assertions_cycl", "TERM-LEARNER-FIND-VISIBLE-ASSERTIONS-CYCL", 1, 1, false);
        declareFunction(me, "xml_term_learner_get_followups_for_term", "XML-TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM", 0, 1, false);
        declareFunction(me, "term_learner_get_followups_for_cycl_term", "TERM-LEARNER-GET-FOLLOWUPS-FOR-CYCL-TERM", 1, 5, false);
        declareFunction(me, "term_learner_get_followups_for_term", "TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM", 1, 5, false);
        declareFunction(me, "term_learner_unsorted_fragments_for_term", "TERM-LEARNER-UNSORTED-FRAGMENTS-FOR-TERM", 6, 0, false);
        declareFunction(me, "sort_followups", "SORT-FOLLOWUPS", 3, 2, false);
        declareFunction(me, "clear_term_learner_category_label", "CLEAR-TERM-LEARNER-CATEGORY-LABEL", 0, 0, false);
        declareFunction(me, "remove_term_learner_category_label", "REMOVE-TERM-LEARNER-CATEGORY-LABEL", 1, 1, false);
        declareFunction(me, "term_learner_category_label_internal", "TERM-LEARNER-CATEGORY-LABEL-INTERNAL", 2, 0, false);
        declareFunction(me, "term_learner_category_label", "TERM-LEARNER-CATEGORY-LABEL", 1, 1, false);
        declareFunction(me, "clear_get_followup_categories_for_type", "CLEAR-GET-FOLLOWUP-CATEGORIES-FOR-TYPE", 0, 0, false);
        declareFunction(me, "remove_get_followup_categories_for_type", "REMOVE-GET-FOLLOWUP-CATEGORIES-FOR-TYPE", 1, 1, false);
        declareFunction(me, "get_followup_categories_for_type_internal", "GET-FOLLOWUP-CATEGORIES-FOR-TYPE-INTERNAL", 2, 0, false);
        declareFunction(me, "get_followup_categories_for_type", "GET-FOLLOWUP-CATEGORIES-FOR-TYPE", 1, 1, false);
        declareFunction(me, "clear_get_pred_list_order_for_type", "CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE", 0, 0, false);
        declareFunction(me, "remove_get_pred_list_order_for_type", "REMOVE-GET-PRED-LIST-ORDER-FOR-TYPE", 1, 1, false);
        declareFunction(me, "get_pred_list_order_for_type_internal", "GET-PRED-LIST-ORDER-FOR-TYPE-INTERNAL", 2, 0, false);
        declareFunction(me, "get_pred_list_order_for_type", "GET-PRED-LIST-ORDER-FOR-TYPE", 1, 1, false);
        declareFunction(me, "categories_and_types_for_sentence_and_term", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM", 2, 1, false);
        declareFunction(me, "substitute_arg_constraints_for_vars", "SUBSTITUTE-ARG-CONSTRAINTS-FOR-VARS", 1, 1, false);
        declareFunction(me, "clear_substitutable_arg_constraint_for_reln", "CLEAR-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN", 0, 0, false);
        declareFunction(me, "remove_substitutable_arg_constraint_for_reln", "REMOVE-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN", 2, 0, false);
        declareFunction(me, "substitutable_arg_constraint_for_reln_internal", "SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN-INTERNAL", 2, 0, false);
        declareFunction(me, "substitutable_arg_constraint_for_reln", "SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN", 2, 0, false);
        declareFunction(me, "categories_and_types_for_sentence_and_term_int", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT", 3, 0, false);
        declareFunction(me, "categories_and_types_for_sentence_and_term_int_via_query", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-QUERY", 3, 0, false);
        declareFunction(me, "clear_categories_and_types_for_sentence_and_term_int_via_indexing", "CLEAR-CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING", 0, 0, false);
        declareFunction(me, "remove_categories_and_types_for_sentence_and_term_int_via_indexing", "REMOVE-CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING", 3, 0, false);
        declareFunction(me, "categories_and_types_for_sentence_and_term_int_via_indexing_internal", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING-INTERNAL", 3, 0, false);
        declareFunction(me, "categories_and_types_for_sentence_and_term_int_via_indexing", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING", 3, 0, false);
        declareFunction(me, "sort_by_category", "SORT-BY-CATEGORY", 3, 0, false);
        declareFunction(me, "clear_summary_pred_sort_order_for_focal_term", "CLEAR-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM", 0, 0, false);
        declareFunction(me, "remove_summary_pred_sort_order_for_focal_term", "REMOVE-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM", 2, 0, false);
        declareFunction(me, "summary_pred_sort_order_for_focal_term_internal", "SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM-INTERNAL", 2, 0, false);
        declareFunction(me, "summary_pred_sort_order_for_focal_term", "SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM", 2, 0, false);
        declareFunction(me, "higher_priority_followup_in_category", "HIGHER-PRIORITY-FOLLOWUP-IN-CATEGORY", 2, 1, false);
        declareFunction(me, "get_justifying_type_from_fragment_justification", "GET-JUSTIFYING-TYPE-FROM-FRAGMENT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "debug_followups_for_term", "DEBUG-FOLLOWUPS-FOR-TERM", 1, 1, false);
        declareFunction(me, "clear_followup_query_mt_for_user", "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER", 0, 0, false);
        declareFunction(me, "remove_followup_query_mt_for_user", "REMOVE-FOLLOWUP-QUERY-MT-FOR-USER", 1, 0, false);
        declareFunction(me, "followup_query_mt_for_user_internal", "FOLLOWUP-QUERY-MT-FOR-USER-INTERNAL", 1, 0, false);
        declareFunction(me, "followup_query_mt_for_user", "FOLLOWUP-QUERY-MT-FOR-USER", 1, 0, false);
        declareFunction(me, "default_followup_query_mt", "DEFAULT-FOLLOWUP-QUERY-MT", 0, 2, false);
        declareFunction(me, "clear_followup_query_mt_for_userXtask", "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK", 0, 0, false);
        declareFunction(me, "remove_followup_query_mt_for_userXtask", "REMOVE-FOLLOWUP-QUERY-MT-FOR-USER&TASK", 1, 1, false);
        declareFunction(me, "followup_query_mt_for_userXtask_internal", "FOLLOWUP-QUERY-MT-FOR-USER&TASK-INTERNAL", 2, 0, false);
        declareFunction(me, "followup_query_mt_for_userXtask", "FOLLOWUP-QUERY-MT-FOR-USER&TASK", 1, 1, false);
        declareFunction(me, "clear_term_learner_known_bindings_for_sentence", "CLEAR-TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE", 0, 0, false);
        declareFunction(me, "remove_term_learner_known_bindings_for_sentence", "REMOVE-TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "term_learner_known_bindings_for_sentence_internal", "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-INTERNAL", 3, 0, false);
        declareFunction(me, "term_learner_known_bindings_for_sentence", "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "cure_get_best_bindings", "CURE-GET-BEST-BINDINGS", 2, 0, false);
        declareFunction(me, "clear_term_learner_known_negated_bindings_for_sentence", "CLEAR-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE", 0, 0, false);
        declareFunction(me, "remove_term_learner_known_negated_bindings_for_sentence", "REMOVE-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "term_learner_known_negated_bindings_for_sentence_internal", "TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE-INTERNAL", 3, 0, false);
        declareFunction(me, "term_learner_known_negated_bindings_for_sentence", "TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "clear_term_learner_types_for_fragment", "CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT", 0, 0, false);
        declareFunction(me, "remove_term_learner_types_for_fragment", "REMOVE-TERM-LEARNER-TYPES-FOR-FRAGMENT", 6, 2, false);
        declareFunction(me, "term_learner_types_for_fragment_internal", "TERM-LEARNER-TYPES-FOR-FRAGMENT-INTERNAL", 8, 0, false);
        declareFunction(me, "term_learner_types_for_fragment", "TERM-LEARNER-TYPES-FOR-FRAGMENT", 6, 2, false);
        declareFunction(me, "should_add_empty_bindingsP", "SHOULD-ADD-EMPTY-BINDINGS?", 4, 0, false);
        declareFunction(me, "default_unbound_bindings_for_fragment", "DEFAULT-UNBOUND-BINDINGS-FOR-FRAGMENT", 2, 0, false);
        declareFunction(me, "binding_lists_passing_constraints", "BINDING-LISTS-PASSING-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "term_learner_meets_constraints", "TERM-LEARNER-MEETS-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "term_learner_known_value_constraints_for_sentence", "TERM-LEARNER-KNOWN-VALUE-CONSTRAINTS-FOR-SENTENCE", 2, 0, false);
        declareFunction(me, "term_learner_source_renderers_for_sentence", "TERM-LEARNER-SOURCE-RENDERERS-FOR-SENTENCE", 2, 0, false);
        declareFunction(me, "clear_sources_of_mt", "CLEAR-SOURCES-OF-MT", 0, 0, false);
        declareFunction(me, "remove_sources_of_mt", "REMOVE-SOURCES-OF-MT", 1, 1, false);
        declareFunction(me, "sources_of_mt_internal", "SOURCES-OF-MT-INTERNAL", 2, 0, false);
        declareFunction(me, "sources_of_mt", "SOURCES-OF-MT", 1, 1, false);
        declareFunction(me, "java_rendering_cycl", "JAVA-RENDERING-CYCL", 1, 0, false);
        declareFunction(me, "java_rendering_string", "JAVA-RENDERING-STRING", 1, 0, false);
        declareFunction(me, "java_rendering_p", "JAVA-RENDERING-P", 1, 0, false);
        declareFunction(me, "java_rendering_to_selection_renderer", "JAVA-RENDERING-TO-SELECTION-RENDERER", 1, 0, false);
        declareFunction(me, "term_learner_candidate_hierarchical_replacements_for_sentence", "TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "term_learner_candidate_hierarchical_replacements_for_sentence_int", "TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE-INT", 3, 0, false);
        declareFunction(me, "convert_alphabetical_to_hierarchical_replacements", "CONVERT-ALPHABETICAL-TO-HIERARCHICAL-REPLACEMENTS", 1, 0, false);
        declareFunction(me, "term_learner_candidate_replacements_for_sentence", "TERM-LEARNER-CANDIDATE-REPLACEMENTS-FOR-SENTENCE", 3, 0, false);
        declareFunction(me, "term_learner_candidate_replacements_for_arg_positions_in_sentence", "TERM-LEARNER-CANDIDATE-REPLACEMENTS-FOR-ARG-POSITIONS-IN-SENTENCE", 3, 0, false);
        declareFunction(me, "clear_get_arg_positions_for_terms", "CLEAR-GET-ARG-POSITIONS-FOR-TERMS", 0, 0, false);
        declareFunction(me, "remove_get_arg_positions_for_terms", "REMOVE-GET-ARG-POSITIONS-FOR-TERMS", 2, 0, false);
        declareFunction(me, "get_arg_positions_for_terms_internal", "GET-ARG-POSITIONS-FOR-TERMS-INTERNAL", 2, 0, false);
        declareFunction(me, "get_arg_positions_for_terms", "GET-ARG-POSITIONS-FOR-TERMS", 2, 0, false);
        declareFunction(me, "term_learner_consolidate_javalist_for_arg_positions", "TERM-LEARNER-CONSOLIDATE-JAVALIST-FOR-ARG-POSITIONS", 3, 0, false);
        declareFunction(me, "consolidate_and_add_new_javalist_items", "CONSOLIDATE-AND-ADD-NEW-JAVALIST-ITEMS", 4, 0, false);
        declareFunction(me, "term_learner_anchor_tags_for_term", "TERM-LEARNER-ANCHOR-TAGS-FOR-TERM", 1, 0, false);
        declareFunction(me, "argpos_subsumes", "ARGPOS-SUBSUMES", 2, 0, false);
        declareFunction(me, "list_prefixP", "LIST-PREFIX?", 2, 0, false);
        declareFunction(me, "term_learner_type_for_fragment_int", "TERM-LEARNER-TYPE-FOR-FRAGMENT-INT", 2, 12, false);
        declareFunction(me, "cure_list_item_arg_poses", "CURE-LIST-ITEM-ARG-POSES", 1, 0, false);
        declareFunction(me, "cure_editable_itemP", "CURE-EDITABLE-ITEM?", 1, 1, false);
        declareFunction(me, "cyc_terms_to_term_learner_terms", "CYC-TERMS-TO-TERM-LEARNER-TERMS", 1, 0, false);
        declareFunction(me, "new_term_learner_uninterpreted_renderer", "NEW-TERM-LEARNER-UNINTERPRETED-RENDERER", 2, 1, false);
        declareFunction(me, "term_learner_types_for_sentence", "TERM-LEARNER-TYPES-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "term_learner_types_for_sentence_id", "TERM-LEARNER-TYPES-FOR-SENTENCE-ID", 2, 4, false);
        declareFunction(me, "cure_possibly_duplicate_arg", "CURE-POSSIBLY-DUPLICATE-ARG", 3, 0, false);
        declareFunction(me, "get_arg_positions_for_terms_in_sentence", "GET-ARG-POSITIONS-FOR-TERMS-IN-SENTENCE", 2, 0, false);
        declareFunction(me, "term_learner_documentation_sentenceP", "TERM-LEARNER-DOCUMENTATION-SENTENCE?", 1, 0, false);
        declareFunction(me, "get_initial_suggestion_from_suggestions", "GET-INITIAL-SUGGESTION-FROM-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "get_suggested_cycls_for_arg_pos", "GET-SUGGESTED-CYCLS-FOR-ARG-POS", 2, 0, false);
        declareFunction(me, "make_nl_cycl_valid_triples_for_cycls", "MAKE-NL-CYCL-VALID-TRIPLES-FOR-CYCLS", 1, 1, false);
        declareFunction(me, "term_learner_terms_mergeableP", "TERM-LEARNER-TERMS-MERGEABLE?", 2, 1, false);
        declareFunction(me, "term_learner_string_denots", "TERM-LEARNER-STRING-DENOTS", 1, 0, false);
        declareFunction(me, "term_learner_sentence_assertibleP", "TERM-LEARNER-SENTENCE-ASSERTIBLE?", 2, 0, false);
        declareFunction(me, "term_learner_sentence_assertible_intP", "TERM-LEARNER-SENTENCE-ASSERTIBLE-INT?", 2, 0, false);
        declareFunction(me, "get_sentence_from_template", "GET-SENTENCE-FROM-TEMPLATE", 3, 0, false);
        declareFunction(me, "term_learner_relevant_sentences_from_document", "TERM-LEARNER-RELEVANT-SENTENCES-FROM-DOCUMENT", 2, 0, false);
        declareFunction(me, "term_learner_relevant_sentences", "TERM-LEARNER-RELEVANT-SENTENCES", 2, 0, false);
        declareFunction(me, "term_learner_source_documentation_mt", "TERM-LEARNER-SOURCE-DOCUMENTATION-MT", 0, 0, false);
        declareFunction(me, "cure_default_generation_mt", "CURE-DEFAULT-GENERATION-MT", 0, 1, false);
        declareFunction(me, "term_learner_default_generation_mt", "TERM-LEARNER-DEFAULT-GENERATION-MT", 0, 0, false);
        declareFunction(me, "term_learner_cycl_terms_to_nl_strings", "TERM-LEARNER-CYCL-TERMS-TO-NL-STRINGS", 1, 2, false);
        declareFunction(me, "term_learner_cycl_term_to_nl_string", "TERM-LEARNER-CYCL-TERM-TO-NL-STRING", 1, 1, false);
        declareFunction(me, "merge_justifications_for_ordered_types", "MERGE-JUSTIFICATIONS-FOR-ORDERED-TYPES", 1, 0, false);
        declareFunction(me, "term_learner_handle_user_choice", "TERM-LEARNER-HANDLE-USER-CHOICE", 9, 1, false);
        declareFunction(me, "note_accepted_choice", "NOTE-ACCEPTED-CHOICE", 5, 0, false);
        declareFunction(me, "get_nl_generation_for_user_added_sentence", "GET-NL-GENERATION-FOR-USER-ADDED-SENTENCE", 1, 0, false);
        declareFunction(me, "transform_to_true", "TRANSFORM-TO-TRUE", 1, 0, false);
        declareFunction(me, "term_expansion_expected_sentenceP", "TERM-EXPANSION-EXPECTED-SENTENCE?", 1, 0, false);
        declareFunction(me, "get_mts_for_user_choice", "GET-MTS-FOR-USER-CHOICE", 4, 1, false);
        declareFunction(me, "get_cure_user_addition_to_spindle_mt", "GET-CURE-USER-ADDITION-TO-SPINDLE-MT", 2, 0, false);
        declareFunction(me, "cure_sort_work_by_docP", "CURE-SORT-WORK-BY-DOC?", 2, 0, false);
        declareFunction(me, "clear_normalize_cure_user", "CLEAR-NORMALIZE-CURE-USER", 0, 0, false);
        declareFunction(me, "remove_normalize_cure_user", "REMOVE-NORMALIZE-CURE-USER", 1, 0, false);
        declareFunction(me, "normalize_cure_user_internal", "NORMALIZE-CURE-USER-INTERNAL", 1, 0, false);
        declareFunction(me, "normalize_cure_user", "NORMALIZE-CURE-USER", 1, 0, false);
        declareFunction(me, "all_justifications_have_specified_mtsP", "ALL-JUSTIFICATIONS-HAVE-SPECIFIED-MTS?", 1, 0, false);
        declareFunction(me, "user_added_term_typeP", "USER-ADDED-TERM-TYPE?", 1, 0, false);
        declareFunction(me, "get_task_source_spindle", "GET-TASK-SOURCE-SPINDLE", 2, 0, false);
        declareFunction(me, "clear_default_assert_mt_for_user_and_task", "CLEAR-DEFAULT-ASSERT-MT-FOR-USER-AND-TASK", 0, 0, false);
        declareFunction(me, "remove_default_assert_mt_for_user_and_task", "REMOVE-DEFAULT-ASSERT-MT-FOR-USER-AND-TASK", 1, 1, false);
        declareFunction(me, "default_assert_mt_for_user_and_task_internal", "DEFAULT-ASSERT-MT-FOR-USER-AND-TASK-INTERNAL", 2, 0, false);
        declareFunction(me, "default_assert_mt_for_user_and_task", "DEFAULT-ASSERT-MT-FOR-USER-AND-TASK", 1, 1, false);
        declareFunction(me, "find_or_create_base_source_for_url", "FIND-OR-CREATE-BASE-SOURCE-FOR-URL", 2, 2, false);
        declareFunction(me, "ensure_source_contextualized_in_spindle", "ENSURE-SOURCE-CONTEXTUALIZED-IN-SPINDLE", 2, 2, false);
        declareFunction(me, "find_or_create_subwork_source", "FIND-OR-CREATE-SUBWORK-SOURCE", 3, 0, false);
        declareFunction(me, "ensure_is_hlmt_p_nart", "ENSURE-IS-HLMT-P-NART", 1, 0, false);
        declareFunction(me, "find_or_create_user_addition_mt_for_url", "FIND-OR-CREATE-USER-ADDITION-MT-FOR-URL", 3, 0, false);
        declareFunction(me, "get_mts_for_urlXuser", "GET-MTS-FOR-URL&USER", 3, 0, false);
        declareFunction(me, "get_mts_for_user", "GET-MTS-FOR-USER", 1, 1, false);
        declareFunction(me, "clear_mts_for_user", "CLEAR-MTS-FOR-USER", 1, 1, false);
        declareFunction(me, "clear_mts_for_urlXuser", "CLEAR-MTS-FOR-URL&USER", 3, 0, false);
        declareFunction(me, "clear_contents_from_mts", "CLEAR-CONTENTS-FROM-MTS", 1, 0, false);
        declareFunction(me, "cyclist_fort", "CYCLIST-FORT", 1, 0, false);
        declareFunction(me, "term_learner_ordered_types_for_term_in_document_string", "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT-STRING", 3, 2, false);
        declareFunction(me, "term_learner_ordered_types_for_term_in_document", "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT", 5, 0, false);
        declareFunction(me, "term_learner_types_from_types_and_justifications", "TERM-LEARNER-TYPES-FROM-TYPES-AND-JUSTIFICATIONS", 4, 0, false);
        declareFunction(me, "get_weight", "GET-WEIGHT", 1, 0, false);
        declareFunction(me, "get_cycls", "GET-CYCLS", 1, 0, false);
        declareFunction(me, "get_cycl", "GET-CYCL", 1, 0, false);
        declareFunction(me, "ner_justificationP", "NER-JUSTIFICATION?", 1, 0, false);
        declareFunction(me, "term_learner_types_for_term_in_document", "TERM-LEARNER-TYPES-FOR-TERM-IN-DOCUMENT", 3, 2, false);
        declareFunction(me, "term_learner_collections_for_term_in_sentence", "TERM-LEARNER-COLLECTIONS-FOR-TERM-IN-SENTENCE", 2, 3, false);
        declareFunction(me, "matching_named_entities", "MATCHING-NAMED-ENTITIES", 3, 2, false);
        declareFunction(me, "clear_term_learner_type_prompt", "CLEAR-TERM-LEARNER-TYPE-PROMPT", 0, 0, false);
        declareFunction(me, "remove_term_learner_type_prompt", "REMOVE-TERM-LEARNER-TYPE-PROMPT", 1, 0, false);
        declareFunction(me, "term_learner_type_prompt_internal", "TERM-LEARNER-TYPE-PROMPT-INTERNAL", 1, 0, false);
        declareFunction(me, "term_learner_type_prompt", "TERM-LEARNER-TYPE-PROMPT", 1, 0, false);
        declareFunction(me, "clear_term_learner_term_header_string", "CLEAR-TERM-LEARNER-TERM-HEADER-STRING", 0, 0, false);
        declareFunction(me, "remove_term_learner_term_header_string", "REMOVE-TERM-LEARNER-TERM-HEADER-STRING", 1, 1, false);
        declareFunction(me, "term_learner_term_header_string_internal", "TERM-LEARNER-TERM-HEADER-STRING-INTERNAL", 2, 0, false);
        declareFunction(me, "term_learner_term_header_string", "TERM-LEARNER-TERM-HEADER-STRING", 1, 1, false);
        declareFunction(me, "term_learner_alternative_phrases", "TERM-LEARNER-ALTERNATIVE-PHRASES", 1, 1, false);
        declareFunction(me, "clear_term_learner_lexical_caches", "CLEAR-TERM-LEARNER-LEXICAL-CACHES", 0, 0, false);
        declareFunction(me, "term_learner_lexify_from_termstrings", "TERM-LEARNER-LEXIFY-FROM-TERMSTRINGS", 3, 0, false);
        declareFunction(me, "term_learner_assert_lexical_info", "TERM-LEARNER-ASSERT-LEXICAL-INFO", 4, 1, false);
        declareFunction(me, "default_task_for_user", "DEFAULT-TASK-FOR-USER", 1, 0, false);
        declareFunction(me, "clear_default_task_for_user_int", "CLEAR-DEFAULT-TASK-FOR-USER-INT", 0, 0, false);
        declareFunction(me, "remove_default_task_for_user_int", "REMOVE-DEFAULT-TASK-FOR-USER-INT", 1, 0, false);
        declareFunction(me, "default_task_for_user_int_internal", "DEFAULT-TASK-FOR-USER-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "default_task_for_user_int", "DEFAULT-TASK-FOR-USER-INT", 1, 0, false);
        declareFunction(me, "clear_query_mt_for_task", "CLEAR-QUERY-MT-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_query_mt_for_task", "REMOVE-QUERY-MT-FOR-TASK", 1, 0, false);
        declareFunction(me, "query_mt_for_task_internal", "QUERY-MT-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "query_mt_for_task", "QUERY-MT-FOR-TASK", 1, 0, false);
        declareFunction(me, "clear_wff_checking_mt_for_task", "CLEAR-WFF-CHECKING-MT-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_wff_checking_mt_for_task", "REMOVE-WFF-CHECKING-MT-FOR-TASK", 1, 0, false);
        declareFunction(me, "wff_checking_mt_for_task_internal", "WFF-CHECKING-MT-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "wff_checking_mt_for_task", "WFF-CHECKING-MT-FOR-TASK", 1, 0, false);
        declareFunction(me, "clear_query_mt_for_user_and_task", "CLEAR-QUERY-MT-FOR-USER-AND-TASK", 0, 0, false);
        declareFunction(me, "remove_query_mt_for_user_and_task", "REMOVE-QUERY-MT-FOR-USER-AND-TASK", 2, 0, false);
        declareFunction(me, "query_mt_for_user_and_task_internal", "QUERY-MT-FOR-USER-AND-TASK-INTERNAL", 2, 0, false);
        declareFunction(me, "query_mt_for_user_and_task", "QUERY-MT-FOR-USER-AND-TASK", 2, 0, false);
        declareFunction(me, "clear_wff_checking_mt_for_user_and_task", "CLEAR-WFF-CHECKING-MT-FOR-USER-AND-TASK", 0, 0, false);
        declareFunction(me, "remove_wff_checking_mt_for_user_and_task", "REMOVE-WFF-CHECKING-MT-FOR-USER-AND-TASK", 2, 0, false);
        declareFunction(me, "wff_checking_mt_for_user_and_task_internal", "WFF-CHECKING-MT-FOR-USER-AND-TASK-INTERNAL", 2, 0, false);
        declareFunction(me, "wff_checking_mt_for_user_and_task", "WFF-CHECKING-MT-FOR-USER-AND-TASK", 2, 0, false);
        declareFunction(me, "parsing_mt_for_task", "PARSING-MT-FOR-TASK", 1, 0, false);
        declareFunction(me, "xml_output_term_types", "XML-OUTPUT-TERM-TYPES", 1, 0, false);
        declareFunction(me, "xml_output_term_type", "XML-OUTPUT-TERM-TYPE", 1, 0, false);
        declareFunction(me, "xml_output_renderers", "XML-OUTPUT-RENDERERS", 1, 0, false);
        declareFunction(me, "xml_output_renderer", "XML-OUTPUT-RENDERER", 1, 0, false);
        declareFunction(me, "xml_output_selection_renderer", "XML-OUTPUT-SELECTION-RENDERER", 1, 0, false);
        declareFunction(me, "term_learner_concept_clouds", "TERM-LEARNER-CONCEPT-CLOUDS", 1, 2, false);
        declareFunction(me, "term_learner_term_concept_cloud", "TERM-LEARNER-TERM-CONCEPT-CLOUD", 1, 1, false);
        declareFunction(me, "term_learner_concept_cloud_as_xml", "TERM-LEARNER-CONCEPT-CLOUD-AS-XML", 1, 1, false);
        declareFunction(me, "term_learner_concept_cloud_new", "TERM-LEARNER-CONCEPT-CLOUD-NEW", 1, 1, false);
        declareFunction(me, "term_learner_concept_cloud_new_int", "TERM-LEARNER-CONCEPT-CLOUD-NEW-INT", 1, 1, false);
        declareFunction(me, "add_cloud_entry_for_term", "ADD-CLOUD-ENTRY-FOR-TERM", 3, 1, false);
        declareFunction(me, "term_learner_term_weight", "TERM-LEARNER-TERM-WEIGHT", 1, 0, false);
        declareFunction(me, "clear_term_learner_cloud_display_nl", "CLEAR-TERM-LEARNER-CLOUD-DISPLAY-NL", 0, 0, false);
        declareFunction(me, "remove_term_learner_cloud_display_nl", "REMOVE-TERM-LEARNER-CLOUD-DISPLAY-NL", 1, 0, false);
        declareFunction(me, "term_learner_cloud_display_nl_internal", "TERM-LEARNER-CLOUD-DISPLAY-NL-INTERNAL", 1, 0, false);
        declareFunction(me, "term_learner_cloud_display_nl", "TERM-LEARNER-CLOUD-DISPLAY-NL", 1, 0, false);
        declareFunction(me, "clear_term_learner_displayable_generalizationP", "CLEAR-TERM-LEARNER-DISPLAYABLE-GENERALIZATION?", 0, 0, false);
        declareFunction(me, "remove_term_learner_displayable_generalizationP", "REMOVE-TERM-LEARNER-DISPLAYABLE-GENERALIZATION?", 1, 1, false);
        declareFunction(me, "term_learner_displayable_generalizationP_internal", "TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-INTERNAL", 2, 0, false);
        declareFunction(me, "term_learner_displayable_generalizationP", "TERM-LEARNER-DISPLAYABLE-GENERALIZATION?", 1, 1, false);
        declareFunction(me, "clear_term_learner_possibly_relevant_generalizationP", "CLEAR-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?", 0, 0, false);
        declareFunction(me, "remove_term_learner_possibly_relevant_generalizationP", "REMOVE-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?", 1, 1, false);
        declareFunction(me, "term_learner_possibly_relevant_generalizationP_internal", "TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-INTERNAL", 2, 0, false);
        declareFunction(me, "term_learner_possibly_relevant_generalizationP", "TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?", 1, 1, false);
        declareFunction(me, "clear_term_learner_irrelevancies_for_term", "CLEAR-TERM-LEARNER-IRRELEVANCIES-FOR-TERM", 1, 1, false);
        declareFunction(me, "cycl_terms_to_nl_strings_quick", "CYCL-TERMS-TO-NL-STRINGS-QUICK", 1, 1, false);
        declareFunction(me, "cb_show_followup_widget", "CB-SHOW-FOLLOWUP-WIDGET", 1, 0, false);
        declareFunction(me, "cb_cure_host", "CB-CURE-HOST", 0, 0, false);
        declareFunction(me, "cb_cure_port", "CB-CURE-PORT", 0, 0, false);
        declareFunction(me, "cb_cure_context_path", "CB-CURE-CONTEXT-PATH", 0, 0, false);
        declareFunction(me, "cb_possibly_add_cure_link", "CB-POSSIBLY-ADD-CURE-LINK", 1, 2, false);
        declareFunction(me, "cb_cure_link", "CB-CURE-LINK", 1, 2, false);
        declareFunction(me, "clear_sentence_score", "CLEAR-SENTENCE-SCORE", 0, 0, false);
        declareFunction(me, "remove_sentence_score", "REMOVE-SENTENCE-SCORE", 2, 2, false);
        declareFunction(me, "sentence_score_internal", "SENTENCE-SCORE-INTERNAL", 4, 0, false);
        declareFunction(me, "sentence_score", "SENTENCE-SCORE", 2, 2, false);
        declareFunction(me, "clear_sentence_score_for_type", "CLEAR-SENTENCE-SCORE-FOR-TYPE", 0, 0, false);
        declareFunction(me, "remove_sentence_score_for_type", "REMOVE-SENTENCE-SCORE-FOR-TYPE", 3, 2, false);
        declareFunction(me, "sentence_score_for_type_internal", "SENTENCE-SCORE-FOR-TYPE-INTERNAL", 5, 0, false);
        declareFunction(me, "sentence_score_for_type", "SENTENCE-SCORE-FOR-TYPE", 3, 2, false);
        declareFunction(me, "clear_set_query_variable", "CLEAR-SET-QUERY-VARIABLE", 0, 0, false);
        declareFunction(me, "remove_set_query_variable", "REMOVE-SET-QUERY-VARIABLE", 4, 0, false);
        declareFunction(me, "set_query_variable_internal", "SET-QUERY-VARIABLE-INTERNAL", 4, 0, false);
        declareFunction(me, "set_query_variable", "SET-QUERY-VARIABLE", 4, 0, false);
        declareFunction(me, "get_sentence_for_scoring", "GET-SENTENCE-FOR-SCORING", 2, 2, false);
        declareFunction(me, "preds_w_scores", "PREDS-W-SCORES", 1, 1, false);
        declareFunction(me, "sentences_with_scores_for_type", "SENTENCES-WITH-SCORES-FOR-TYPE", 1, 1, false);
        declareFunction(me, "clear_get_fragments_for_terms_cached", "CLEAR-GET-FRAGMENTS-FOR-TERMS-CACHED", 0, 0, false);
        declareFunction(me, "remove_get_fragments_for_terms_cached", "REMOVE-GET-FRAGMENTS-FOR-TERMS-CACHED", 4, 0, false);
        declareFunction(me, "get_fragments_for_terms_cached_internal", "GET-FRAGMENTS-FOR-TERMS-CACHED-INTERNAL", 4, 0, false);
        declareFunction(me, "get_fragments_for_terms_cached", "GET-FRAGMENTS-FOR-TERMS-CACHED", 4, 0, false);
        declareFunction(me, "assert_orderings", "ASSERT-ORDERINGS", 0, 2, false);
        declareFunction(me, "assert_ordering_for_type", "ASSERT-ORDERING-FOR-TYPE", 1, 1, false);
        declareFunction(me, "pred_score", "PRED-SCORE", 2, 1, false);
        declareFunction(me, "preds_w_scores_from_rules", "PREDS-W-SCORES-FROM-RULES", 1, 1, false);
        declareFunction(me, "pred_score_for_type", "PRED-SCORE-FOR-TYPE", 2, 1, false);
        declareFunction(me, "preds_w_scores_for_type_from_rules", "PREDS-W-SCORES-FOR-TYPE-FROM-RULES", 1, 1, false);
        declareFunction(me, "assert_ordering_for_type_from_rules", "ASSERT-ORDERING-FOR-TYPE-FROM-RULES", 1, 1, false);
        declareFunction(me, "assert_ordering_for_specs_from_rules", "ASSERT-ORDERING-FOR-SPECS-FROM-RULES", 1, 1, false);
        declareFunction(me, "assert_applicable_preds_for_specs", "ASSERT-APPLICABLE-PREDS-FOR-SPECS", 1, 2, false);
        declareFunction(me, "assert_applicable_preds_for_type", "ASSERT-APPLICABLE-PREDS-FOR-TYPE", 1, 2, false);
        declareFunction(me, "get_applicable_formula_generators_for_type", "GET-APPLICABLE-FORMULA-GENERATORS-FOR-TYPE", 2, 2, false);
        declareFunction(me, "new_term_learner_justifications", "NEW-TERM-LEARNER-JUSTIFICATIONS", 3, 2, false);
        declareFunction(me, "new_term_learner_justification", "NEW-TERM-LEARNER-JUSTIFICATION", 3, 2, false);
        declareFunction(me, "term_learner_justification_p", "TERM-LEARNER-JUSTIFICATION-P", 1, 0, false);
        declareFunction(me, "term_learner_justification_string", "TERM-LEARNER-JUSTIFICATION-STRING", 1, 0, false);
        declareFunction(me, "term_learner_justification_context_string", "TERM-LEARNER-JUSTIFICATION-CONTEXT-STRING", 1, 0, false);
        declareFunction(me, "term_learner_justification_tool", "TERM-LEARNER-JUSTIFICATION-TOOL", 1, 0, false);
        declareFunction(me, "term_learner_justification_source", "TERM-LEARNER-JUSTIFICATION-SOURCE", 1, 0, false);
        declareFunction(me, "term_learner_justification_assert_mt", "TERM-LEARNER-JUSTIFICATION-ASSERT-MT", 1, 0, false);
        declareFunction(me, "get_context_sentences_from_justifications", "GET-CONTEXT-SENTENCES-FROM-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "restart_concept_search_demo_server", "RESTART-CONCEPT-SEARCH-DEMO-SERVER", 2, 0, false);
        declareFunction(me, "string_likely_denotes_collectionP", "STRING-LIKELY-DENOTES-COLLECTION?", 1, 1, false);
        declareFunction(me, "clear_collection_via_web_searchP", "CLEAR-COLLECTION-VIA-WEB-SEARCH?", 0, 0, false);
        declareFunction(me, "remove_collection_via_web_searchP", "REMOVE-COLLECTION-VIA-WEB-SEARCH?", 1, 0, false);
        declareFunction(me, "collection_via_web_searchP_internal", "COLLECTION-VIA-WEB-SEARCH?-INTERNAL", 1, 0, false);
        declareFunction(me, "collection_via_web_searchP", "COLLECTION-VIA-WEB-SEARCH?", 1, 0, false);
        declareFunction(me, "plural_to_singular_ratio", "PLURAL-TO-SINGULAR-RATIO", 1, 1, false);
        declareFunction(me, "count_to_mass_ratio", "COUNT-TO-MASS-RATIO", 1, 1, false);
        declareFunction(me, "clear_get_concept_tags_from_string", "CLEAR-GET-CONCEPT-TAGS-FROM-STRING", 0, 0, false);
        declareFunction(me, "remove_get_concept_tags_from_string", "REMOVE-GET-CONCEPT-TAGS-FROM-STRING", 1, 0, false);
        declareFunction(me, "get_concept_tags_from_string_internal", "GET-CONCEPT-TAGS-FROM-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "get_concept_tags_from_string", "GET-CONCEPT-TAGS-FROM-STRING", 1, 0, false);
        declareFunction(me, "find_fillers_in_text", "FIND-FILLERS-IN-TEXT", 3, 1, false);
        declareFunction(me, "fillers_from_concept_tags_multiple", "FILLERS-FROM-CONCEPT-TAGS-MULTIPLE", 4, 2, false);
        declareFunction(me, "fillers_from_concept_tags", "FILLERS-FROM-CONCEPT-TAGS", 4, 2, false);
        declareFunction(me, "find_formula_args_among_concept_tags", "FIND-FORMULA-ARGS-AMONG-CONCEPT-TAGS", 2, 1, false);
        declareFunction(me, "score_tag", "SCORE-TAG", 2, 0, false);
        declareFunction(me, "minimum_tag_distance", "MINIMUM-TAG-DISTANCE", 2, 0, false);
        declareFunction(me, "tag_distance", "TAG-DISTANCE", 2, 0, false);
        declareFunction(me, "tags_satisfying_arg_constraints", "TAGS-SATISFYING-ARG-CONSTRAINTS", 3, 1, false);
        declareFunction(me, "make_concept_tag", "MAKE-CONCEPT-TAG", 4, 0, false);
        declareFunction(me, "get_concept_tag_cycl", "GET-CONCEPT-TAG-CYCL", 1, 0, false);
        declareFunction(me, "get_concept_tag_offset", "GET-CONCEPT-TAG-OFFSET", 1, 0, false);
        declareFunction(me, "get_concept_tag_length", "GET-CONCEPT-TAG-LENGTH", 1, 0, false);
        declareFunction(me, "get_concept_tag_nl", "GET-CONCEPT-TAG-NL", 1, 0, false);
        declareFunction(me, "concept_tag_p", "CONCEPT-TAG-P", 1, 0, false);
        declareFunction(me, "find_sentence_fillers", "FIND-SENTENCE-FILLERS", 3, 1, false);
        declareFunction(me, "reformat_sentences_and_vars", "REFORMAT-SENTENCES-AND-VARS", 2, 0, false);
        declareFunction(me, "construct_sentences_from_template_and_bindings", "CONSTRUCT-SENTENCES-FROM-TEMPLATE-AND-BINDINGS", 3, 0, false);
        declareFunction(me, "make_filler", "MAKE-FILLER", 3, 0, false);
        declareFunction(me, "get_filler_var_binding", "GET-FILLER-VAR-BINDING", 1, 0, false);
        declareFunction(me, "get_filler_tag", "GET-FILLER-TAG", 1, 0, false);
        declareFunction(me, "get_filler_score", "GET-FILLER-SCORE", 1, 0, false);
        declareFunction(me, "get_filler_cycl", "GET-FILLER-CYCL", 1, 0, false);
        declareFunction(me, "get_filler_var", "GET-FILLER-VAR", 1, 0, false);
        declareFunction(me, "filler_p", "FILLER-P", 1, 0, false);
        declareFunction(me, "get_queries_for_term", "GET-QUERIES-FOR-TERM", 2, 1, false);
        declareFunction(me, "get_queries_from_sentences", "GET-QUERIES-FROM-SENTENCES", 2, 1, false);
        declareFunction(me, "term_learner_autocomplete_native_with_cycadministrator", "TERM-LEARNER-AUTOCOMPLETE-NATIVE-WITH-CYCADMINISTRATOR", 1, 6, false);
        declareFunction(me, "valid_hierarchical_candidates_p", "VALID-HIERARCHICAL-CANDIDATES-P", 2, 0, false);
        declareFunction(me, "candidate_renderer_p", "CANDIDATE-RENDERER-P", 1, 0, false);
        declareFunction(me, "some_selection_renderer_has_string_p", "SOME-SELECTION-RENDERER-HAS-STRING-P", 2, 0, false);
        declareFunction(me, "term_learner_types_for_sentence_id_test_fn", "TERM-LEARNER-TYPES-FOR-SENTENCE-ID-TEST-FN", 6, 0, false);
        declareFunction(me, "term_learner_known_bindings_for_sentence_neg", "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-NEG", 2, 0, false);
        declareFunction(me, "bindings_dont_mention", "BINDINGS-DONT-MENTION", 2, 0, false);
        declareFunction(me, "bindings_mention", "BINDINGS-MENTION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_cure_api_file() {
        defparameter("*TERM-LEARNER-USER-CREATED-TERM-LOG-FILE*", $str0$_cyc_projects_doc_annotation_logs);
        defparameter("*TERM-LEARNER-USER-ADDED-TYPES-LOG-FILE*", $str1$_cyc_projects_doc_annotation_logs);
        defparameter("*TERM-LEARNER-ACCEPTED-MEANINGS-LOG-FILE*", $str2$_cyc_projects_doc_annotation_logs);
        deflexical("*TERM-LEARNER-USE-LEXICAL-LOOKUP-ONLY*", T);
        defparameter("*CURRENT-TL-TASK*", NIL);
        defparameter("*TERM-LEARNER-DEFAULT-LEXICAL-ASSERTION-MT*", $$EnglishMt);
        defparameter("*CURE-EDIT-THE-LIST-TERMS?*", T);
        defparameter("*CURE-ALLOW-SOME-PREDICATES-TO-BE-EDITED*", T);
        deflexical("*DEFAULT-CREATE-AS-TYPE-CACHING-STATE*", NIL);
        defparameter("*ALLOW-CHANGES-TO-FOCAL-TERM-ON-REPLICATE*", NIL);
        deflexical("*TERM-LEARNER-VALID-SUBSTITUTION-CACHING-STATE*", NIL);
        defconstant("*TERM-LEARNER-UNKNOWN-STATUS*", ZERO_INTEGER);
        defconstant("*TERM-LEARNER-KNOWN-REMOVABLE*", ONE_INTEGER);
        defconstant("*TERM-LEARNER-KNOWN-DERIVED*", TWO_INTEGER);
        defconstant("*TERM-LEARNER-UNKNOWN-ASSERTIBLE*", THREE_INTEGER);
        defconstant("*TERM-LEARNER-IMPOSSIBLE*", FOUR_INTEGER);
        defconstant("*TERM-LEARNER-CYC-ERROR*", FIVE_INTEGER);
        defconstant("*TERM-LEARNER-DOWNSTREAM-ERROR*", SIX_INTEGER);
        defconstant("*TERM-LEARNER-WORKING*", SEVEN_INTEGER);
        defconstant("*TERM-LEARNER-KNOWN-NOT-REMOVABLE*", EIGHT_INTEGER);
        defconstant("*TERM-LEARNER-REJECTED*", NINE_INTEGER);
        defconstant("*TERM-LEARNER-INCOMPLETE*", TEN_INTEGER);
        deflexical("*TERM-LEARNER-UNMODIFIABLE*", list($term_learner_known_derived$.getGlobalValue(), $term_learner_known_not_removable$.getGlobalValue()));
        deflexical("*TERM-LEARNER-FACT-STATUS-INT-CACHING-STATE*", NIL);
        defparameter("*FOLLOWUP-QUERY-MT*", $list331);
        deflexical("*TERM-LEARNER-CATEGORY-LABEL-CACHING-STATE*", NIL);
        deflexical("*GET-FOLLOWUP-CATEGORIES-FOR-TYPE-CACHING-STATE*", NIL);
        deflexical("*GET-PRED-LIST-ORDER-FOR-TYPE-CACHING-STATE*", NIL);
        deflexical("*SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN-CACHING-STATE*", NIL);
        deflexical("*CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING-CACHING-STATE*", NIL);
        deflexical("*SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM-CACHING-STATE*", NIL);
        deflexical("*FOLLOWUP-QUERY-MT-FOR-USER-CACHING-STATE*", NIL);
        deflexical("*FOLLOWUP-QUERY-MT-FOR-USER&TASK-CACHING-STATE*", NIL);
        defparameter("*CURE-SHOW-BEST-BINDINGS*", T);
        deflexical("*TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-TYPES-FOR-FRAGMENT-CACHING-STATE*", NIL);
        deflexical("*SOURCES-OF-MT-CACHING-STATE*", NIL);
        deflexical("*GET-ARG-POSITIONS-FOR-TERMS-CACHING-STATE*", NIL);
        deflexical("*DELETE-ME-TOKEN*", gensym(UNPROVIDED));
        defparameter("*TERM-LEARNER-SOURCE-DOCUMENTATION-MT*", $UNINITIALIZED);
        defparameter("*SOURCE-SPINDLE*", $$AssistedReaderSourceSpindle);
        defparameter("*SOURCE-SPINDLE-QUERY-MT*", $const519$AssistedReaderSourceSpindleCollec);
        defparameter("*TERM-LEARNER-DEFAULT-GENERATION-MT*", NIL);
        deflexical("*NORMALIZE-CURE-USER-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-BASE-SOURCE-CREATION-LOCK*", make_lock($str545$term_learner_base_source_creation));
        defparameter("*TERM-LEARNER-ASSERT-REDUNDANT-MT-INFO*", T);
        deflexical("*DEFAULT-ASSERT-MT-FOR-USER-AND-TASK-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-SUB-SOURCE-CREATION-LOCK*", make_lock($str561$term_learner_sub_source_creation_));
        defconstant("*NEEDS-APPROVAL*", $$$needsApproval);
        defconstant("*DISAPPROVED*", $$$disapproved);
        defconstant("*APPROVED*", $$$approved);
        deflexical("*TERM-LEARNER-TYPE-PROMPT-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-TERM-HEADER-STRING-CACHING-STATE*", NIL);
        deflexical("*DEFAULT-TASK-FOR-USER-INT-CACHING-STATE*", NIL);
        deflexical("*QUERY-MT-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*WFF-CHECKING-MT-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*QUERY-MT-FOR-USER-AND-TASK-CACHING-STATE*", NIL);
        deflexical("*WFF-CHECKING-MT-FOR-USER-AND-TASK-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-CLOUD-DISPLAY-NL-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-IRRELEVANCE-LISTENER*", event_broker.describe_funcall_listener($KB_MODIFY_IRRELEVANCE, CLEAR_TERM_LEARNER_IRRELEVANCIES_FOR_TERM, UNPROVIDED, UNPROVIDED));
        defparameter("*CB-SHOW-FOLLOWUP-WIDGET*", NIL);
        deflexical("*CB-CURE-EXTERNAL-HOST*", $str701$cure_cyc_com);
        deflexical("*CB-CURE-EXTERNAL-PORT*", $int$8080);
        deflexical("*CB-CURE-EXTERNAL-CONTEXT-PATH*", $str703$_ConceptSearch);
        deflexical("*CB-CURE-INTERNAL-CONTEXT-PATH*", $str704$_cure);
        defparameter("*CB-CURE-INTERNAL-HOST-OVERRIDE*", NIL);
        defparameter("*CB-CURE-INTERNAL-PORT-OVERRIDE*", NIL);
        deflexical("*CB-SHOW-CURE-LINK*", NIL);
        deflexical("*SENTENCE-SCORE-CACHING-STATE*", NIL);
        deflexical("*SENTENCE-SCORE-FOR-TYPE-CACHING-STATE*", NIL);
        deflexical("*SET-QUERY-VARIABLE-CACHING-STATE*", NIL);
        deflexical("*GET-FRAGMENTS-FOR-TERMS-CACHED-CACHING-STATE*", NIL);
        deflexical("*COLLECTION-VIA-WEB-SEARCH?-CACHING-STATE*", NIL);
        deflexical("*GET-CONCEPT-TAGS-FROM-STRING-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_cure_api_file() {
        register_external_symbol(TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING);
        register_external_symbol(TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM);
        register_external_symbol(TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM);
        register_external_symbol(GET_TAXONOMIC_RENDERERS_FOR_TERM);
        register_external_symbol($sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS);
        register_external_symbol(TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE);
        memoization_state.note_globally_cached_function(DEFAULT_CREATE_AS_TYPE);
        register_external_symbol(GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING);
        register_external_symbol(GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID);
        register_external_symbol(GET_TERM_LEARNER_RENDERER_FOR_CYCL);
        register_external_symbol(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING);
        register_external_symbol(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID);
        register_external_symbol(GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL);
        register_external_symbol(GET_TERM_LEARNER_STRING_RENDERER_FROM_OPEN_SELECT_RENDERER_LIST);
        register_external_symbol(TERM_LEARNER_ADD_LEXICAL_PHRASE);
        html_macros.note_cgi_handler_function(XML_TERM_LEARNER_USER_CHOICE, $XML_HANDLER);
        register_external_symbol(TERM_LEARNER_USER_CHOICE);
        html_macros.note_cgi_handler_function(XML_TERM_LEARNER_CREATE_NEW, $XML_HANDLER);
        register_external_symbol(CURE_ASSERT_SENTENCE);
        register_external_symbol(CURE_UNASSERT_SENTENCE);
        register_external_symbol(CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE);
        register_external_symbol(TERM_LEARNER_CREATE_NEW);
        register_external_symbol(TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE);
        html_macros.note_cgi_handler_function(XML_TERM_LEARNER_USER_SUBSTITUTION, $XML_HANDLER);
        register_external_symbol(TERM_LEARNER_USER_SUBSTITUTION);
        memoization_state.note_globally_cached_function(TERM_LEARNER_VALID_SUBSTITUTION);
        html_macros.note_cgi_handler_function(XML_TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION, $XML_HANDLER);
        register_external_symbol(TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION);
        note_funcall_helper_function(FIRST_TRUE);
        note_funcall_helper_function(SECOND_TRUE);
        register_external_symbol(TERM_LEARNER_AUTOCOMPLETE_NATIVE);
        register_external_symbol(TERM_LEARNER_AUTOCOMPLETE);
        html_macros.note_cgi_handler_function(XML_TERM_LEARNER_AUTOCOMPLETE, $XML_HANDLER);
        register_external_symbol(GET_ALLOTTED_TASKS);
        register_external_symbol(TERM_LEARNER_GET_FACT_SHEET_FOR_TERM);
        register_external_symbol(TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM);
        register_external_symbol(TERM_LEARNER_FACT_STATUS);
        memoization_state.note_globally_cached_function(TERM_LEARNER_FACT_STATUS_INT);
        memoization_state.note_memoized_function(TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL);
        html_macros.note_cgi_handler_function(XML_TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM, $XML_HANDLER);
        register_external_symbol(TERM_LEARNER_GET_FOLLOWUPS_FOR_CYCL_TERM);
        register_external_symbol(TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM);
        memoization_state.note_globally_cached_function(TERM_LEARNER_CATEGORY_LABEL);
        memoization_state.note_globally_cached_function(GET_FOLLOWUP_CATEGORIES_FOR_TYPE);
        memoization_state.note_globally_cached_function(GET_PRED_LIST_ORDER_FOR_TYPE);
        memoization_state.note_globally_cached_function(SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN);
        memoization_state.note_globally_cached_function(CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING);
        memoization_state.note_globally_cached_function(SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM);
        note_funcall_helper_function(HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY);
        memoization_state.note_globally_cached_function(FOLLOWUP_QUERY_MT_FOR_USER);
        memoization_state.note_globally_cached_function($sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK);
        memoization_state.note_globally_cached_function(TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE);
        memoization_state.note_globally_cached_function(TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE);
        memoization_state.note_globally_cached_function(TERM_LEARNER_TYPES_FOR_FRAGMENT);
        memoization_state.note_globally_cached_function(SOURCES_OF_MT);
        register_external_symbol(TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE);
        memoization_state.note_globally_cached_function(GET_ARG_POSITIONS_FOR_TERMS);
        register_external_symbol(TERM_LEARNER_TYPES_FOR_SENTENCE);
        register_external_symbol(TERM_LEARNER_TYPES_FOR_SENTENCE_ID);
        define_test_case_table_int(CURE_POSSIBLY_DUPLICATE_ARG, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list509);
        register_external_symbol(TERM_LEARNER_HANDLE_USER_CHOICE);
        note_funcall_helper_function(TRANSFORM_TO_TRUE);
        note_funcall_helper_function($sym527$TERM_EXPANSION_EXPECTED_SENTENCE_);
        memoization_state.note_globally_cached_function(NORMALIZE_CURE_USER);
        memoization_state.note_globally_cached_function(DEFAULT_ASSERT_MT_FOR_USER_AND_TASK);
        register_external_symbol(CLEAR_MTS_FOR_USER);
        register_external_symbol($sym576$CLEAR_MTS_FOR_URL_USER);
        register_external_symbol(CYCLIST_FORT);
        memoization_state.note_globally_cached_function(TERM_LEARNER_TYPE_PROMPT);
        memoization_state.note_globally_cached_function(TERM_LEARNER_TERM_HEADER_STRING);
        register_external_symbol(TERM_LEARNER_ALTERNATIVE_PHRASES);
        register_external_symbol(DEFAULT_TASK_FOR_USER);
        memoization_state.note_globally_cached_function(DEFAULT_TASK_FOR_USER_INT);
        memoization_state.note_globally_cached_function(QUERY_MT_FOR_TASK);
        memoization_state.note_globally_cached_function(WFF_CHECKING_MT_FOR_TASK);
        memoization_state.note_globally_cached_function(QUERY_MT_FOR_USER_AND_TASK);
        memoization_state.note_globally_cached_function(WFF_CHECKING_MT_FOR_USER_AND_TASK);
        register_external_symbol(TERM_LEARNER_CONCEPT_CLOUDS);
        register_external_symbol(TERM_LEARNER_TERM_CONCEPT_CLOUD);
        register_external_symbol(TERM_LEARNER_CONCEPT_CLOUD_AS_XML);
        memoization_state.note_globally_cached_function(TERM_LEARNER_CLOUD_DISPLAY_NL);
        memoization_state.note_globally_cached_function($sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_);
        memoization_state.note_globally_cached_function($sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_);
        kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($term_learner_irrelevance_listener$.getGlobalValue());
        register_external_symbol(CYCL_TERMS_TO_NL_STRINGS_QUICK);
        register_html_state_variable($cb_show_followup_widget$);
        sethash($CURE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str700$cure_png, NIL));
        register_html_state_variable($cb_cure_internal_host_override$);
        register_html_state_variable($cb_cure_internal_port_override$);
        memoization_state.note_globally_cached_function(SENTENCE_SCORE);
        memoization_state.note_globally_cached_function(SENTENCE_SCORE_FOR_TYPE);
        memoization_state.note_globally_cached_function(SET_QUERY_VARIABLE);
        memoization_state.note_globally_cached_function(GET_FRAGMENTS_FOR_TERMS_CACHED);
        register_external_symbol(RESTART_CONCEPT_SEARCH_DEMO_SERVER);
        memoization_state.note_globally_cached_function($sym774$COLLECTION_VIA_WEB_SEARCH_);
        memoization_state.note_globally_cached_function(GET_CONCEPT_TAGS_FROM_STRING);
        register_external_symbol(FIND_SENTENCE_FILLERS);
        register_external_symbol(GET_QUERIES_FOR_TERM);
        register_external_symbol(GET_QUERIES_FROM_SENTENCES);
        define_test_case_table_int(TERM_LEARNER_AUTOCOMPLETE_NATIVE_WITH_CYCADMINISTRATOR, list(new SubLObject[]{ $TEST, $sym794$LENGTH_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list795);
        define_test_case_table_int(TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE_INT, list(new SubLObject[]{ $TEST, VALID_HIERARCHICAL_CANDIDATES_P, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list798);
        define_test_case_table_int(TERM_LEARNER_TYPES_FOR_SENTENCE_ID_TEST_FN, list(new SubLObject[]{ $TEST, SOME_SELECTION_RENDERER_HAS_STRING_P, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list801);
        define_test_case_table_int(TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_NEG, list(new SubLObject[]{ $TEST, BINDINGS_DONT_MENTION, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list804);
        define_test_case_table_int(TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE, list(new SubLObject[]{ $TEST, BINDINGS_MENTION, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list806);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cure_api_file();
    }

    @Override
    public void initializeVariables() {
        init_cure_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cure_api_file();
    }

    static {





















































































































































































































































































































































































































































































































































































































































































































































































































































































































    }
}

/**
 * Total time: 8691 ms
 */
