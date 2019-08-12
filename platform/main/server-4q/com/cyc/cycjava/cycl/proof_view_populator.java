package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view_populator extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new proof_view_populator();

    public static final String myName = "com.cyc.cycjava_2.cycl.proof_view_populator";


    // defconstant
    public static final SubLSymbol $dtp_proof_view_populator$ = makeSymbol("*DTP-PROOF-VIEW-POPULATOR*");

    // defparameter
    private static final SubLSymbol $proof_view_allow_unlimited_duplicationP$ = makeSymbol("*PROOF-VIEW-ALLOW-UNLIMITED-DUPLICATION?*");

    // defparameter
    private static final SubLSymbol $proof_view_duplicate_entry_max$ = makeSymbol("*PROOF-VIEW-DUPLICATE-ENTRY-MAX*");

    // defparameter
    private static final SubLSymbol $suspend_generality_sorting_of_proof_view_entriesP$ = makeSymbol("*SUSPEND-GENERALITY-SORTING-OF-PROOF-VIEW-ENTRIES?*");

    // defparameter
    public static final SubLSymbol $suspend_auto_sorting_of_proof_view_entriesP$ = makeSymbol("*SUSPEND-AUTO-SORTING-OF-PROOF-VIEW-ENTRIES?*");

    // defparameter
    private static final SubLSymbol $proof_view_populator$ = makeSymbol("*PROOF-VIEW-POPULATOR*");

    // defparameter
    private static final SubLSymbol $proof_view_track_fnsP$ = makeSymbol("*PROOF-VIEW-TRACK-FNS?*");

    // defparameter
    private static final SubLSymbol $proof_scores$ = makeSymbol("*PROOF-SCORES*");

    private static final SubLSymbol PROOF_VIEW_POPULATOR = makeSymbol("PROOF-VIEW-POPULATOR");

    private static final SubLSymbol PROOF_VIEW_POPULATOR_P = makeSymbol("PROOF-VIEW-POPULATOR-P");

    private static final SubLList $list2 = list(makeSymbol("PROOF-VIEW"), makeSymbol("WORKER-SEMAPHORE"), makeSymbol("MASTER-SEMAPHORE"), makeSymbol("PROCESS"));

    private static final SubLList $list3 = list(makeKeyword("PROOF-VIEW"), makeKeyword("WORKER-SEMAPHORE"), makeKeyword("MASTER-SEMAPHORE"), makeKeyword("PROCESS"));

    private static final SubLList $list4 = list(makeSymbol("PVP-PROOF-VIEW"), makeSymbol("PVP-WORKER-SEMAPHORE"), makeSymbol("PVP-MASTER-SEMAPHORE"), makeSymbol("PVP-PROCESS"));

    private static final SubLList $list5 = list(makeSymbol("_CSETF-PVP-PROOF-VIEW"), makeSymbol("_CSETF-PVP-WORKER-SEMAPHORE"), makeSymbol("_CSETF-PVP-MASTER-SEMAPHORE"), makeSymbol("_CSETF-PVP-PROCESS"));

    private static final SubLSymbol PRINT_PROOF_VIEW_POPULATOR = makeSymbol("PRINT-PROOF-VIEW-POPULATOR");

    private static final SubLSymbol PROOF_VIEW_POPULATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROOF-VIEW-POPULATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROOF-VIEW-POPULATOR-P"));

    private static final SubLSymbol PVP_PROOF_VIEW = makeSymbol("PVP-PROOF-VIEW");

    private static final SubLSymbol _CSETF_PVP_PROOF_VIEW = makeSymbol("_CSETF-PVP-PROOF-VIEW");

    private static final SubLSymbol PVP_WORKER_SEMAPHORE = makeSymbol("PVP-WORKER-SEMAPHORE");

    private static final SubLSymbol _CSETF_PVP_WORKER_SEMAPHORE = makeSymbol("_CSETF-PVP-WORKER-SEMAPHORE");

    private static final SubLSymbol PVP_MASTER_SEMAPHORE = makeSymbol("PVP-MASTER-SEMAPHORE");

    private static final SubLSymbol _CSETF_PVP_MASTER_SEMAPHORE = makeSymbol("_CSETF-PVP-MASTER-SEMAPHORE");

    private static final SubLSymbol PVP_PROCESS = makeSymbol("PVP-PROCESS");

    private static final SubLSymbol _CSETF_PVP_PROCESS = makeSymbol("_CSETF-PVP-PROCESS");

    private static final SubLSymbol $WORKER_SEMAPHORE = makeKeyword("WORKER-SEMAPHORE");

    private static final SubLSymbol $MASTER_SEMAPHORE = makeKeyword("MASTER-SEMAPHORE");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PROOF_VIEW_POPULATOR = makeSymbol("MAKE-PROOF-VIEW-POPULATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_POPULATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-POPULATOR-METHOD");

    private static final SubLString $str27$_PROOF_VIEW_POPULATOR_ = makeString("<PROOF-VIEW-POPULATOR>");

    private static final SubLString $$$PVP_Worker_Semaphore = makeString("PVP Worker Semaphore");

    private static final SubLString $$$PVP_Master_Semaphore = makeString("PVP Master Semaphore");

    private static final SubLSymbol SXHASH_PROOF_VIEW_POPULATOR_METHOD = makeSymbol("SXHASH-PROOF-VIEW-POPULATOR-METHOD");

    private static final SubLString $$$proof = makeString("proof");

    private static final SubLString $str33$Proof_View_Populator = makeString("Proof-View Populator");

    private static final SubLSymbol PROOF_VIEW_POPULATE = makeSymbol("PROOF-VIEW-POPULATE");

    private static final SubLSymbol PROOF_VIEW_P = makeSymbol("PROOF-VIEW-P");

    private static final SubLString $str39$ = makeString("");

    private static final SubLString $$$IGNORE = makeString("IGNORE");

    private static final SubLSymbol $POPULATED_UNIVERSAL_TIME = makeKeyword("POPULATED-UNIVERSAL-TIME");

    private static final SubLSymbol $sym46$_ = makeSymbol("<");

    private static final SubLSymbol PPH_SOURCE_CITATION_ID = makeSymbol("PPH-SOURCE-CITATION-ID");

    private static final SubLSymbol PROOF_VIEW_MAYBE_ADD_SOURCE_CITATIONS = makeSymbol("PROOF-VIEW-MAYBE-ADD-SOURCE-CITATIONS");

    private static final SubLSymbol $sym51$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_OBJECT = makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT");

    private static final SubLSymbol $sym53$PROOF_VIEW_RULE_SUITABLE_FOR_RULES_SECTION_ = makeSymbol("PROOF-VIEW-RULE-SUITABLE-FOR-RULES-SECTION?");

    private static final SubLList $list54 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), list(makeSymbol("SECTION-KEY"), makeSymbol("INCLUDE-BY-DEFAULT?"), makeSymbol("CYC-TERM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFINE_PRIVATE_FUNCALL = makeSymbol("DEFINE-PRIVATE-FUNCALL");

    private static final SubLSymbol NOTE_PROOF_VIEW_SPECIAL_SECTION_POPULATOR = makeSymbol("NOTE-PROOF-VIEW-SPECIAL-SECTION-POPULATOR");

    private static final SubLSymbol $proof_view_special_sections$ = makeSymbol("*PROOF-VIEW-SPECIAL-SECTIONS*");

    private static final SubLSymbol $proof_view_special_section_terms$ = makeSymbol("*PROOF-VIEW-SPECIAL-SECTION-TERMS*");

    private static final SubLString $str61$Can_t_use__S_to_generate__S_secti = makeString("Can't use ~S to generate ~S section.");

    private static final SubLSymbol $SPECIAL_SECTION_ROOTS = makeKeyword("SPECIAL-SECTION-ROOTS");

    private static final SubLSymbol $SPECIAL_SECTIONS = makeKeyword("SPECIAL-SECTIONS");

    private static final SubLString $str64$Nothing_interesting_available_ = makeString("Nothing interesting available.");

    private static final SubLSymbol PROOF_VIEW_MAYBE_ADD_JUSTIFICATION_SECTION = makeSymbol("PROOF-VIEW-MAYBE-ADD-JUSTIFICATION-SECTION");

    private static final SubLString $str67$__Done_adding_justification_secti = makeString("~&Done adding justification section.~%");

    private static final SubLSymbol $proof_conclusion_proof_view_counts$ = makeSymbol("*PROOF-CONCLUSION-PROOF-VIEW-COUNTS*");

    private static final SubLList $list69 = list(list(makeSymbol("NEW-LITS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list71 = list(list(makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*"), list(makeSymbol("FIF"), list(makeSymbol("INITIALIZED-P"), makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*")), makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*"), NIL)));

    private static final SubLSymbol CPUSH_ALL = makeSymbol("CPUSH-ALL");

    private static final SubLList $list73 = list(makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*"));

    private static final SubLSymbol VALID_PROOF_VIEW_P = makeSymbol("VALID-PROOF-VIEW-P");

    private static final SubLSymbol PROOF_VIEW_ENTRY_P = makeSymbol("PROOF-VIEW-ENTRY-P");

    private static final SubLString $str76$__Adding__S___under__S__ = makeString("~&Adding ~S~% under ~S~%");

    private static final SubLSymbol $sym77$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    private static final SubLString $str78$Relocated___S = makeString("Relocated: ~S");

    private static final SubLSymbol $RELOCATED = makeKeyword("RELOCATED");

    private static final SubLString $$$Trivial = makeString("Trivial");

    private static final SubLSymbol $QUERY_PRAGMA = makeKeyword("QUERY-PRAGMA");

    private static final SubLString $str83$Has_entry_already_ = makeString("Has entry already.");

    private static final SubLSymbol $DUPLICATE = makeKeyword("DUPLICATE");

    private static final SubLSymbol $ALREADY_HANDLED = makeKeyword("ALREADY-HANDLED");

    private static final SubLString $str87$Proof_has_isomorphic_support___A = makeString("Proof has isomorphic support: ~A");

    private static final SubLSymbol $SUPPRESSED = makeKeyword("SUPPRESSED");

    private static final SubLString $str89$Constructing_default_proof_view_f = makeString("Constructing default proof view for ~S");

    private static final SubLSymbol CONSTRUCT_DEFAULT_PROOF_VIEW = makeSymbol("CONSTRUCT-DEFAULT-PROOF-VIEW");

    private static final SubLString $str94$Adding_sub_entries_under__S = makeString("Adding sub-entries under ~S");

    private static final SubLString $str95$Couldn_t_add_entry_for_support___ = makeString("Couldn't add entry for support:~% ~S");

    private static final SubLSymbol VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");

    private static final SubLSymbol $sym98$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol ANYTHING_TOKEN = makeSymbol("ANYTHING-TOKEN");

    private static final SubLSymbol PROOF_LITERALS_TO_SUPPRESS = makeSymbol("PROOF-LITERALS-TO-SUPPRESS");

    private static final SubLSymbol $sym101$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $ALREADY_HANDLED_PROOFS = makeKeyword("ALREADY-HANDLED-PROOFS");

    private static final SubLSymbol $USED_RULES_ROOT = makeKeyword("USED-RULES-ROOT");

    private static final SubLString $str104$Query_ = makeString("Query:");

    private static final SubLSymbol PROOF_VIEW_ADD_QUERY_AND_ANSWER_SECTION = makeSymbol("PROOF-VIEW-ADD-QUERY-AND-ANSWER-SECTION");

    private static final SubLString $str108$Answer_ = makeString("Answer:");

    private static final SubLSymbol EL_TERM_P = makeSymbol("EL-TERM-P");

    private static final SubLSymbol CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY = makeSymbol("CONSTRUCT-PROOF-VIEW-ANSWER-ENTRY");

    private static final SubLSymbol NULL_BINDINGS = makeSymbol("NULL-BINDINGS");

    private static final SubLSymbol ONE_BINDING = makeSymbol("ONE-BINDING");

    private static final SubLSymbol ATOMIC_QUERY_SENTENCE = makeSymbol("ATOMIC-QUERY-SENTENCE");

    private static final SubLString $str121$_S_already_exists___S_time__P__in = makeString("~S already exists (~S time~:P) in ~S");

    private static final SubLString $str122$__Added__S___for__S___under__S__ = makeString("~&Added ~S~% for ~S~% under ~S~%");

    private static final SubLSymbol VALID_PROOF_VIEW_ENTRY_P = makeSymbol("VALID-PROOF-VIEW-ENTRY-P");

    private static final SubLSymbol $kw124$EXPAND_INITIALLY_ = makeKeyword("EXPAND-INITIALLY?");

    private static final SubLSymbol PROOF_VIEW_ADD_SECTION_ROOT = makeSymbol("PROOF-VIEW-ADD-SECTION-ROOT");

    private static final SubLSymbol PROOF_VIEW_ADD_RULE_USED = makeSymbol("PROOF-VIEW-ADD-RULE-USED");

    private static final SubLSymbol $LINEAR_ROOT = makeKeyword("LINEAR-ROOT");

    private static final SubLString $str132$__Inference_entities___S__ = makeString("~&Inference entities: ~S~%");

    private static final SubLString $str134$___D_Entry_FORTs___S___S = makeString("~&~D Entry FORTs: ~S~%~S");

    private static final SubLString $str135$__Found_preferred_FORT__S__ = makeString("~&Found preferred FORT ~S~%");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_PROOF_SUID = makeSymbol("PROOF-VIEW-ENTRY-GET-PROOF-SUID");

    private static final SubLSymbol $sym137$_ = makeSymbol(">");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_SCORE = makeSymbol("PROOF-VIEW-ENTRY-GET-SCORE");

    private static final SubLSymbol PROOF_VIEW_ADD_FACT_USED = makeSymbol("PROOF-VIEW-ADD-FACT-USED");

    private static final SubLString $str142$Failed_to_store__S_on__S = makeString("Failed to store ~S on ~S");

    private static final SubLSymbol $GIS = makeKeyword("GIS");

    private static final SubLString $str145$Cycorp_ArcMap_GIS_KS = makeString("Cycorp-ArcMap-GIS-KS");

    private static final SubLSymbol $sym146$_KS = makeSymbol("?KS");

    private static final SubLObject $$contentMt = reader_make_constant_shell(makeString("contentMt"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$Saffron_KS = reader_make_constant_shell(makeString("Saffron-KS"));

    private static final SubLList $list150 = listS(list(makeKeyword("OR"), reader_make_constant_shell(makeString("situationConstituentWithTypeAndDesc")), reader_make_constant_shell(makeString("situationConstituentWithType")), reader_make_constant_shell(makeString("situationConstituentWithDesc"))),
	    list($BIND, makeSymbol("HYPOTHESIS")), list($BIND, makeSymbol("TERM")), makeKeyword("ANYTHING"));

    private static final SubLSymbol HYPOTHESIS = makeSymbol("HYPOTHESIS");

    private static final SubLSymbol PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS = makeSymbol("PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-HYPOTHESIS-AND-TERMS");

    private static final SubLSymbol $REMOVAL_SAFFRON_CONJUNCTION_069 = makeKeyword("REMOVAL-SAFFRON-CONJUNCTION-069");

    private static final SubLObject $$substring = reader_make_constant_shell(makeString("substring"));

    private static final SubLObject $const156$situationConstituentWithTypeAndDe = reader_make_constant_shell(makeString("situationConstituentWithTypeAndDesc"));

    private static final SubLObject $$situationConstituentWithType = reader_make_constant_shell(makeString("situationConstituentWithType"));

    private static final SubLObject $$situationConstituentWithDesc = reader_make_constant_shell(makeString("situationConstituentWithDesc"));

    private static final SubLList $list159 = list(makeSymbol("THIS-HYPOTHESIS"), makeSymbol("THIS-TERM"), makeSymbol("ARG2"), makeSymbol("&OPTIONAL"), makeSymbol("ARG3"));

    private static final SubLString $str160$Source_Text_ = makeString("Source Text:");

    private static final SubLString $str162$Title_ = makeString("Title:");

    private static final SubLString $str163$Date_ = makeString("Date:");

    private static final SubLString $str164$Author_ = makeString("Author:");

    private static final SubLString $str165$Publisher_ = makeString("Publisher:");

    private static final SubLString $str166$Couldn_t_find_source_document_ = makeString("Couldn't find source document.");

    private static final SubLSymbol $NO_SOURCE_DOCUMENT = makeKeyword("NO-SOURCE-DOCUMENT");

    private static final SubLString $$$Root = makeString("Root");

    private static final SubLString $str173$Initial_ID_in__S_is__S__should_be = makeString("Initial ID in ~S is ~S; should be 0.");

    private static final SubLSymbol $sym174$_SENTENCE = makeSymbol("?SENTENCE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list176 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SENTENCE"), reader_make_constant_shell(makeString("NLSentence")));

    private static final SubLObject $$sourceOfTerm = reader_make_constant_shell(makeString("sourceOfTerm"));

    private static final SubLList $list178 = list(makeSymbol("?SENTENCE"));

    private static final SubLString $str179$Already_have_entry_for__S = makeString("Already have entry for ~S");

    private static final SubLSymbol PROOF_VIEW_ADD_SUPPORT_TREE = makeSymbol("PROOF-VIEW-ADD-SUPPORT-TREE");

    private static final SubLSymbol NON_DEDUCED_ASSERTION = makeSymbol("NON-DEDUCED-ASSERTION");

    private static final SubLSymbol CIRCULAR_ASSERTION = makeSymbol("CIRCULAR-ASSERTION");

    private static final SubLSymbol CIRCULAR_SUPPORT = makeSymbol("CIRCULAR-SUPPORT");

    private static final SubLString $str184$__Skipping_over_trivial_symmetric = makeString("~&Skipping over trivial symmetric sentence ~S~% supporting ~S~%");

    private static final SubLSymbol NORMAL_SUPPORT = makeSymbol("NORMAL-SUPPORT");

    private static final SubLSymbol ABDUCED_SUPPORT = makeSymbol("ABDUCED-SUPPORT");

    private static final SubLSymbol UNSUPPORTED_SUPPORT = makeSymbol("UNSUPPORTED-SUPPORT");

    private static final SubLString $str190$unknown_support_type_for__A = makeString("unknown support type for ~A");

    private static final SubLString $str191$Already_shown___S = makeString("Already shown: ~S");

    private static final SubLString $str192$Circularity_in_meta_supports__Alr = makeString("Circularity in meta-supports. Already seen~% ~S~%");

    private static final SubLList $list193 = list(makeKeyword("GENLS"));

    private static final SubLString $str194$Not_proof_view_worthy___S = makeString("Not proof-view worthy: ~S");

    private static final SubLSymbol $sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_ = makeSymbol("ENTITY-MENTIONS-PROOF-POSSIBLE?");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$hypothesizedFormula = reader_make_constant_shell(makeString("hypothesizedFormula"));

    private static final SubLObject $$hypothesizedFormulaStrengthenedTo = reader_make_constant_shell(makeString("hypothesizedFormulaStrengthenedTo"));

    private static final SubLSymbol PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS = makeSymbol("PROOF-VIEW-ENTITY-MENTIONS-PROOF-HYPOTHESES-AND-TERMS");

    private static final SubLSymbol $sym203$SKSI_SUPPORTED_EXTERNAL_TERM_ = makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?");

    private static final SubLSymbol PROOF_VIEW_ADD_ENTITY_MENTION_ENTRIES = makeSymbol("PROOF-VIEW-ADD-ENTITY-MENTION-ENTRIES");

    private static final SubLSymbol SOURCE_TEXT = makeSymbol("SOURCE-TEXT");

    private static final SubLSymbol $kw207$HAS_ABDUCED_SUPPORT_ = makeKeyword("HAS-ABDUCED-SUPPORT?");

    private static final SubLSymbol $sym208$_HYPOTHESIS = makeSymbol("?HYPOTHESIS");

    private static final SubLSymbol $sym209$_ENTITY_MENTION = makeSymbol("?ENTITY-MENTION");

    private static final SubLList $list210 = list(reader_make_constant_shell(makeString("mentionForMentionHypothesis")), makeSymbol("?ENTITY-MENTION-HYPOTHESIS"), makeSymbol("?ENTITY-MENTION"));

    private static final SubLObject $$dependsOnEMHyp = reader_make_constant_shell(makeString("dependsOnEMHyp"));

    private static final SubLList $list212 = list(makeSymbol("?ENTITY-MENTION-HYPOTHESIS"));

    private static final SubLList $list213 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $sym214$_PUBLISHER = makeSymbol("?PUBLISHER");

    private static final SubLObject $$publisherOfWork = reader_make_constant_shell(makeString("publisherOfWork"));

    private static final SubLList $list216 = list(reader_make_constant_shell(makeString("ContentMtFn")), reader_make_constant_shell(makeString("BBN-KS")));

    private static final SubLSymbol $sym217$_DATE = makeSymbol("?DATE");

    private static final SubLObject $$dateOfPublication_CW = reader_make_constant_shell(makeString("dateOfPublication-CW"));

    private static final SubLList $list219 = list(makeSymbol("?DATE"));

    private static final SubLSymbol $sym220$_AUTHOR = makeSymbol("?AUTHOR");

    private static final SubLObject $$authorOfLiteraryWork_CW = reader_make_constant_shell(makeString("authorOfLiteraryWork-CW"));

    private static final SubLList $list222 = list(makeSymbol("?AUTHOR"));

    private static final SubLSymbol $sym223$_TITLE = makeSymbol("?TITLE");

    private static final SubLObject $$titleOfWork = reader_make_constant_shell(makeString("titleOfWork"));

    private static final SubLList $list225 = list(makeSymbol("?TITLE"));

    private static final SubLSymbol $sym227$PROOF_VIEW_ENTRY_ = makeSymbol("PROOF-VIEW-ENTRY<");

    private static final SubLSymbol $sym228$PROOF_VIEW_ENTRY_MORE_GENERAL_ = makeSymbol("PROOF-VIEW-ENTRY-MORE-GENERAL?");

    private static final SubLString $str229$Sort_by_specificity_changed_order = makeString("Sort by specificity changed order~% from ~S~%   to ~S~%");

    private static final SubLString $str230$Sort_by_causality_changed_order__ = makeString("Sort by causality changed order~% from ~S~%   to ~S~%");

    private static final SubLSymbol $CAUSE = makeKeyword("CAUSE");

    private static final SubLSymbol CAUSE_ARG_NUM_OF_PRED = makeSymbol("CAUSE-ARG-NUM-OF-PRED");

    private static final SubLSymbol $sym234$_ARG = makeSymbol("?ARG");

    private static final SubLObject $$causeArg = reader_make_constant_shell(makeString("causeArg"));

    private static final SubLList $list236 = list(makeSymbol("?ARG"));

    private static final SubLList $list237 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $EFFECT = makeKeyword("EFFECT");

    private static final SubLSymbol EFFECT_ARG_NUM_OF_PRED = makeSymbol("EFFECT-ARG-NUM-OF-PRED");

    private static final SubLObject $$effectArg = reader_make_constant_shell(makeString("effectArg"));

    private static final SubLSymbol PPH_SUPPORT_EL_SENTENCE = makeSymbol("PPH-SUPPORT-EL-SENTENCE");

    private static final SubLString $str243$Given_ = makeString("Given:");

    private static final SubLString $str246$Pragmatics_ = makeString("Pragmatics:");

    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");

    private static final SubLString $str252$Trivially__ = makeString("Trivially: ");

    public static SubLObject proof_view_populator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_proof_view_populator(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject proof_view_populator_p(final SubLObject v_object) {
	return v_object.getClass() == $proof_view_populator_native.class ? T : NIL;
    }

    public static SubLObject pvp_proof_view(final SubLObject v_object) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject pvp_worker_semaphore(final SubLObject v_object) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject pvp_master_semaphore(final SubLObject v_object) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject pvp_process(final SubLObject v_object) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject _csetf_pvp_proof_view(final SubLObject v_object, final SubLObject value) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_pvp_worker_semaphore(final SubLObject v_object, final SubLObject value) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_pvp_master_semaphore(final SubLObject v_object, final SubLObject value) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_pvp_process(final SubLObject v_object, final SubLObject value) {
	assert NIL != proof_view_populator_p(v_object) : "proof_view_populator.proof_view_populator_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject make_proof_view_populator(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $proof_view_populator_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($PROOF_VIEW)) {
		_csetf_pvp_proof_view(v_new, current_value);
	    } else if (pcase_var.eql($WORKER_SEMAPHORE)) {
		_csetf_pvp_worker_semaphore(v_new, current_value);
	    } else if (pcase_var.eql($MASTER_SEMAPHORE)) {
		_csetf_pvp_master_semaphore(v_new, current_value);
	    } else if (pcase_var.eql($PROCESS)) {
		_csetf_pvp_process(v_new, current_value);
	    } else {
		Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_proof_view_populator(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_PROOF_VIEW_POPULATOR, FOUR_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $PROOF_VIEW, pvp_proof_view(obj));
	funcall(visitor_fn, obj, $SLOT, $WORKER_SEMAPHORE, pvp_worker_semaphore(obj));
	funcall(visitor_fn, obj, $SLOT, $MASTER_SEMAPHORE, pvp_master_semaphore(obj));
	funcall(visitor_fn, obj, $SLOT, $PROCESS, pvp_process(obj));
	funcall(visitor_fn, obj, $END, MAKE_PROOF_VIEW_POPULATOR, FOUR_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_proof_view_populator_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_proof_view_populator(obj, visitor_fn);
    }

    public static SubLObject print_proof_view_populator(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	format(stream, $str27$_PROOF_VIEW_POPULATOR_);
	return v_object;
    }

    public static SubLObject new_proof_view_populator(final SubLObject v_proof_view) {
	final SubLObject populator = make_proof_view_populator(UNPROVIDED);
	_csetf_pvp_proof_view(populator, v_proof_view);
	_csetf_pvp_worker_semaphore(populator, Semaphores.new_semaphore($$$PVP_Worker_Semaphore, ZERO_INTEGER));
	_csetf_pvp_master_semaphore(populator, Semaphores.new_semaphore($$$PVP_Master_Semaphore, ZERO_INTEGER));
	return populator;
    }

    public static SubLObject proof_view_populator_proof_view(final SubLObject populator) {
	assert NIL != proof_view_populator_p(populator) : "proof_view_populator.proof_view_populator_p(populator) " + "CommonSymbols.NIL != proof_view_populator.proof_view_populator_p(populator) " + populator;
	return pvp_proof_view(populator);
    }

    public static SubLObject proof_view_populator_worker_semaphore(final SubLObject populator) {
	assert NIL != proof_view_populator_p(populator) : "proof_view_populator.proof_view_populator_p(populator) " + "CommonSymbols.NIL != proof_view_populator.proof_view_populator_p(populator) " + populator;
	return pvp_worker_semaphore(populator);
    }

    public static SubLObject proof_view_populator_master_semaphore(final SubLObject populator) {
	assert NIL != proof_view_populator_p(populator) : "proof_view_populator.proof_view_populator_p(populator) " + "CommonSymbols.NIL != proof_view_populator.proof_view_populator_p(populator) " + populator;
	return pvp_master_semaphore(populator);
    }

    public static SubLObject proof_view_populator_process(final SubLObject populator) {
	assert NIL != proof_view_populator_p(populator) : "proof_view_populator.proof_view_populator_p(populator) " + "CommonSymbols.NIL != proof_view_populator.proof_view_populator_p(populator) " + populator;
	return pvp_process(populator);
    }

    public static SubLObject sxhash_proof_view_populator_method(final SubLObject v_object) {
	return sxhash_proof_view_populator(v_object);
    }

    public static SubLObject sxhash_proof_view_populator(final SubLObject populator) {
	return Sxhash.sxhash(pvp_proof_view(populator));
    }

    public static SubLObject proof_view_populator_doneP(final SubLObject populator) {
	return eql($DONE, proof_view_populator_process(populator));
    }

    public static SubLObject proof_view_populator_do_one_step(final SubLObject populator) {
	if (NIL == proof_view_populator_doneP(populator)) {
	    Semaphores.semaphore_signal(proof_view_populator_worker_semaphore(populator));
	    Semaphores.semaphore_wait(proof_view_populator_master_semaphore(populator));
	}
	return list_utilities.last_one(proof_view.proof_view_get_entries(proof_view_populator_proof_view(populator)));
    }

    public static SubLObject proof_view_populator_note_done(final SubLObject populator) {
	_csetf_pvp_process(populator, $DONE);
	Semaphores.semaphore_signal(proof_view_populator_master_semaphore(populator));
	return pvp_process(populator);
    }

    public static SubLObject proof_view_launch_stepwise_populator(final SubLObject v_proof_view, SubLObject mt, SubLObject proof_index_string) {
	if (mt == UNPROVIDED) {
	    mt = pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(proof_view.proof_view_get_answer(v_proof_view)));
	}
	if (proof_index_string == UNPROVIDED) {
	    proof_index_string = $$$proof;
	}
	final SubLObject populator = new_proof_view_populator(v_proof_view);
	_csetf_pvp_process(populator, process_utilities.make_cyc_server_process_with_args($str33$Proof_View_Populator, PROOF_VIEW_POPULATE, list(v_proof_view, mt, proof_index_string, populator)));
	return populator;
    }

    public static SubLObject proof_view_populate(final SubLObject v_proof_view, SubLObject mt, SubLObject proof_index_string, SubLObject populator) {
	if (mt == UNPROVIDED) {
	    mt = pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(proof_view.proof_view_get_answer(v_proof_view)));
	}
	if (proof_index_string == UNPROVIDED) {
	    proof_index_string = $$$proof;
	}
	if (populator == UNPROVIDED) {
	    populator = $proof_view_populator$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != proof_view.proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
	assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
	assert NIL != stringp(proof_index_string) : "Types.stringp(proof_index_string) " + "CommonSymbols.NIL != Types.stringp(proof_index_string) " + proof_index_string;
	final SubLObject _prev_bind_0 = $proof_view_populator$.currentBinding(thread);
	final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
	final SubLObject _prev_bind_3 = pph_vars.$pph_language_mt$.currentBinding(thread);
	final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
	final SubLObject _prev_bind_5 = proof_view.$proof_view_debugP$.currentBinding(thread);
	final SubLObject _prev_bind_6 = pph_vars.$pph_irrelevant_warnP$.currentBinding(thread);
	try {
	    $proof_view_populator$.bind(populator, thread);
	    pph_vars.$pph_domain_mt$.bind(proof_view.proof_view_get_domain_mt(v_proof_view), thread);
	    pph_vars.$pph_language_mt$.bind(proof_view.proof_view_get_language_mt(v_proof_view), thread);
	    pph_vars.$pph_addressee$.bind(proof_view.proof_view_get_addressee(v_proof_view), thread);
	    proof_view.$proof_view_debugP$.bind(makeBoolean((NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) || (NIL != proof_view.proof_view_get_enable_debugP(v_proof_view))), thread);
	    pph_vars.$pph_irrelevant_warnP$.bind(makeBoolean((NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) || (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))), thread);
	    SubLObject error_output = NIL;
	    maybe_pause_proof_view_population(UNPROVIDED);
	    SubLObject error_output_stream = NIL;
	    try {
		error_output_stream = make_private_string_output_stream();
		final SubLObject _prev_bind_0_$1 = StreamsLow.$error_output$.currentBinding(thread);
		try {
		    StreamsLow.$error_output$.bind(make_broadcast_stream(list(StreamsLow.$error_output$.getDynamicValue(thread), error_output_stream)), thread);
		    proof_view.proof_view_set_addressee(v_proof_view, pph_vars.$pph_addressee$.getDynamicValue(thread));
		    proof_view_add_query_and_answer_section(v_proof_view, mt);
		    if (NIL != proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view)) {
			proof_view_summary.proof_view_add_inference_proof_summary_root(v_proof_view);
		    }
		    if (NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) {
			proof_view_add_inference_proof_used_rules_root(v_proof_view);
		    }
		    proof_view_maybe_add_justification_section(v_proof_view, mt, proof_index_string);
		    proof_view_add_special_sections(v_proof_view);
		    if (NIL != proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view)) {
			proof_view_summary.proof_view_flesh_out_inference_proof_summary(v_proof_view, mt);
		    }
		    proof_view_maybe_flesh_out_rules_section(v_proof_view, mt);
		    proof_view_summary.proof_view_maybe_remove_inference_proof_summary_root(v_proof_view);
		    if ((NIL == proof_view.proof_view_get_include_justification_sectionP(v_proof_view)) && (NIL != proof_view.proof_view_has_justification_sectionP(v_proof_view))) {
			proof_view_remove_entry(v_proof_view, proof_view_get_justification_root_entry(v_proof_view));
			proof_view_rem_property(v_proof_view, $JUSTIFICATION_ROOT);
		    }
		    proof_view_maybe_add_source_citations(v_proof_view);
		    final SubLObject summary_root = proof_view_summary.proof_view_get_summary_root(v_proof_view);
		    if ((((NIL != summary_root) && (NIL == proof_view.proof_view_entry_get_children(summary_root))) && (NIL == proof_view.proof_view_has_justification_sectionP(v_proof_view))) && (NIL == proof_view_linear.proof_view_has_linear_sectionP(v_proof_view))) {
			proof_view_note_no_justification(v_proof_view, summary_root);
		    }
		} finally {
		    StreamsLow.$error_output$.rebind(_prev_bind_0_$1, thread);
		}
		error_output = get_output_stream_string(error_output_stream);
	    } finally {
		final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    close(error_output_stream, UNPROVIDED);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
		}
	    }
	    proof_view_set_error_output(v_proof_view, error_output);
	} finally {
	    pph_vars.$pph_irrelevant_warnP$.rebind(_prev_bind_6, thread);
	    proof_view.$proof_view_debugP$.rebind(_prev_bind_5, thread);
	    pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
	    pph_vars.$pph_language_mt$.rebind(_prev_bind_3, thread);
	    pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
	    $proof_view_populator$.rebind(_prev_bind_0, thread);
	}
	proof_view_set_populated_universal_time(v_proof_view, UNPROVIDED);
	if (NIL != misc_utilities.initialized_p(populator)) {
	    proof_view_populator_note_done(populator);
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_note_no_justification(final SubLObject v_proof_view, final SubLObject parent) {
	proof_view_entry_note_expand_initially(parent);
	return proof_view_add_new_entry(v_proof_view, $str39$, parent, $NO_JUSTIFICATION, $$$IGNORE, UNPROVIDED);
    }

    public static SubLObject proof_view_set_populated_universal_time(final SubLObject v_proof_view, SubLObject universal_time) {
	if (universal_time == UNPROVIDED) {
	    universal_time = get_universal_time();
	}
	assert NIL != numeric_date_utilities.universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
	return proof_view.proof_view_set_property(v_proof_view, $POPULATED_UNIVERSAL_TIME, universal_time);
    }

    public static SubLObject proof_view_set_error_output(final SubLObject v_proof_view, final SubLObject error_output) {
	return proof_view.proof_view_set_property(v_proof_view, $ERROR_OUTPUT, error_output);
    }

    public static SubLObject proof_view_maybe_add_source_citations(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject source_index = proof_view.proof_view_get_source_index(v_proof_view);
	if ((NIL != dictionary.dictionary_p(source_index)) && (NIL == dictionary.dictionary_empty_p(source_index))) {
	    final SubLObject root_entry = proof_view_add_section_root(v_proof_view, proof_view.$proof_view_sources_label$.getDynamicValue(thread));
	    SubLObject source_citations = NIL;
	    proof_view.proof_view_set_property(v_proof_view, $SOURCES_ROOT, root_entry);
	    proof_view_entry_note_expand_initially(root_entry);
	    SubLObject iteration_state;
	    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
		thread.resetMultipleValues();
		final SubLObject source = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
		final SubLObject citation = thread.secondMultipleValue();
		thread.resetMultipleValues();
		source_citations = cons(citation, source_citations);
	    }
	    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    SubLObject cdolist_list_var;
	    source_citations = cdolist_list_var = Sort.sort(source_citations, symbol_function($sym46$_), PPH_SOURCE_CITATION_ID);
	    SubLObject citation2 = NIL;
	    citation2 = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		proof_view_add_new_entry(v_proof_view, $str39$, root_entry, $SOURCE_CITATION, citation2, list($FN, PROOF_VIEW_MAYBE_ADD_SOURCE_CITATIONS));
		cdolist_list_var = cdolist_list_var.rest();
		citation2 = cdolist_list_var.first();
	    }
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_maybe_flesh_out_rules_section(final SubLObject v_proof_view, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) {
	    SubLObject rules = list_utilities.remove_if_not($sym51$RULE_ASSERTION_, Mapping.mapcar(PROOF_VIEW_ENTRY_GET_OBJECT, proof_view_summary.proof_view_get_proof_summary_items(v_proof_view)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    final SubLObject minimum_worth_showing = ONE_INTEGER;
	    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
	    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
	    try {
		mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
		mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
		mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
		rules = list_utilities.remove_if_not($sym53$PROOF_VIEW_RULE_SUITABLE_FOR_RULES_SECTION_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    } finally {
		mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
		mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
		mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
	    }
	    final SubLObject rules_used_section_root = proof_view.proof_view_get_used_rules_root(v_proof_view);
	    if (NIL != list_utilities.lengthGE(rules, minimum_worth_showing, UNPROVIDED)) {
		SubLObject cdolist_list_var = rules;
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    proof_view_add_rule_used(v_proof_view, rules_used_section_root, item, mt);
		    cdolist_list_var = cdolist_list_var.rest();
		    item = cdolist_list_var.first();
		}
	    } else {
		proof_view_remove_entry(v_proof_view, rules_used_section_root);
	    }
	}
	return v_proof_view;
    }

    public static SubLObject define_proof_view_special_section_populator(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject name = NIL;
	SubLObject arglist = NIL;
	destructuring_bind_must_consp(current, datum, $list54);
	name = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list54);
	arglist = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list54);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject section_key = NIL;
	SubLObject include_by_defaultP = NIL;
	SubLObject cyc_term = NIL;
	destructuring_bind_must_consp(current, datum, $list54);
	section_key = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list54);
	include_by_defaultP = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list54);
	cyc_term = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return list(PROGN, listS(DEFINE_PRIVATE_FUNCALL, name, arglist, append(body, NIL)), list(NOTE_PROOF_VIEW_SPECIAL_SECTION_POPULATOR, list(QUOTE, name), section_key, include_by_defaultP, cyc_term));
	}
	cdestructuring_bind_error(datum, $list54);
	return NIL;
    }

    public static SubLObject proof_view_add_special_sections(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject set_var = proof_view_special_sections_to_include(v_proof_view);
	final SubLObject set_contents_var = set.do_set_internal(set_var);
	SubLObject basis_object;
	SubLObject state;
	SubLObject section_key;
	SubLObject fn;
	SubLObject section_root;
	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		state); state = set_contents.do_set_contents_update_state(state)) {
	    section_key = set_contents.do_set_contents_next(basis_object, state);
	    if (NIL != set_contents.do_set_contents_element_validP(state, section_key)) {
		fn = dictionary.dictionary_lookup_without_values($proof_view_special_sections$.getGlobalValue(), section_key, UNPROVIDED).first();
		if (fn.isFunctionSpec()) {
		    section_root = funcall(fn, v_proof_view);
		    proof_view_note_special_section_root(v_proof_view, section_key, section_root);
		} else if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		    Errors.warn($str61$Can_t_use__S_to_generate__S_secti, fn, section_key);
		}

	    }
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_note_special_section_root(final SubLObject v_proof_view, final SubLObject section_key, final SubLObject section_root) {
	return dictionary.dictionary_enter(proof_view_get_special_section_roots(v_proof_view), section_key, section_root);
    }

    public static SubLObject proof_view_get_special_section_roots(final SubLObject v_proof_view) {
	SubLObject roots = proof_view.proof_view_get_property(v_proof_view, $SPECIAL_SECTION_ROOTS, misc_utilities.uninitialized());
	if (NIL == misc_utilities.initialized_p(roots)) {
	    roots = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
	    proof_view.proof_view_set_property(v_proof_view, $SPECIAL_SECTION_ROOTS, roots);
	}
	return roots;
    }

    public static SubLObject proof_view_get_special_section_root(final SubLObject v_proof_view, final SubLObject section_key) {
	return dictionary.dictionary_lookup_without_values(proof_view_get_special_section_roots(v_proof_view), section_key, UNPROVIDED);
    }

    public static SubLObject proof_view_special_sections_to_include(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject sections = proof_view.proof_view_get_property(v_proof_view, $SPECIAL_SECTIONS, misc_utilities.uninitialized());
	if (NIL != misc_utilities.uninitialized_p(sections)) {
	    sections = set.new_set(symbol_function(EQL), UNPROVIDED);
	    SubLObject iteration_state;
	    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($proof_view_special_sections$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(
		    iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
		thread.resetMultipleValues();
		final SubLObject section_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
		final SubLObject data = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != data.rest()) {
		    set.set_add(section_key, sections);
		}
	    }
	    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    proof_view.proof_view_set_property(v_proof_view, $SPECIAL_SECTIONS, sections);
	}
	return sections;
    }

    public static SubLObject proof_view_set_include_special_sectionP(final SubLObject v_proof_view, final SubLObject section_id, final SubLObject includeP) {
	final SubLObject section_key = proof_view_section_key_from_id(section_id);
	final SubLObject sections = proof_view_special_sections_to_include(v_proof_view);
	return NIL != includeP ? set.set_add(section_key, sections) : set.set_remove(section_key, sections);
    }

    public static SubLObject proof_view_section_key_from_id(final SubLObject section_id) {
	if (section_id.isKeyword()) {
	    return section_id;
	}
	return dictionary.dictionary_lookup($proof_view_special_section_terms$.getGlobalValue(), section_id, UNPROVIDED);
    }

    public static SubLObject note_proof_view_special_section_populator(final SubLObject name, final SubLObject section_key, final SubLObject include_by_defaultP, final SubLObject cyc_term) {
	dictionary.dictionary_enter($proof_view_special_sections$.getGlobalValue(), section_key, cons(name, include_by_defaultP));
	return dictionary.dictionary_enter($proof_view_special_section_terms$.getGlobalValue(), cyc_term, section_key);
    }

    public static SubLObject proof_view_maybe_add_justification_section(final SubLObject v_proof_view, final SubLObject mt, final SubLObject proof_index_string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((((NIL != proof_view.proof_view_get_include_justification_sectionP(v_proof_view)) || (NIL != proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view))) || (NIL != proof_view_linear.proof_view_get_include_linear_sectionP(v_proof_view)))
		|| (NIL != set.non_empty_set_p(proof_view_special_sections_to_include(v_proof_view)))) {
	    final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
	    final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
	    final SubLObject justification_section_root = proof_view_add_section_root(v_proof_view, proof_view.$proof_view_justification_label$.getDynamicValue(thread));
	    final SubLObject _prev_bind_0 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
	    try {
		pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(proof), thread);
		final SubLObject pph_relevance_safe_list = pph_relevance_safe_list_for_justification(inference_answer);
		proof_view.proof_view_set_property(v_proof_view, $JUSTIFICATION_ROOT, justification_section_root);
		construct_inference_proof_view_int(proof, inference_answer, mt, proof_index_string, v_proof_view, justification_section_root, pph_relevance_safe_list);
		proof_view_entry_note_expand_initially(justification_section_root);
		if (NIL == list_utilities.sublisp_boolean(proof_view.proof_view_entry_get_children(justification_section_root))) {
		    if (NIL != proof_view_summary.proof_view_has_summary_sectionP(v_proof_view)) {
			proof_view_remove_entry(v_proof_view, justification_section_root);
		    } else {
			proof_view_add_new_entry(v_proof_view, $str64$Nothing_interesting_available_, justification_section_root, $EMPTY_JUSTIFICATION, NIL, list($FN, PROOF_VIEW_MAYBE_ADD_JUSTIFICATION_SECTION));
		    }
		}
	    } finally {
		pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0, thread);
	    }
	}
	if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
	    format_nil.force_format(T, $str67$__Done_adding_justification_secti, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	return v_proof_view;
    }

    public static SubLObject note_constructing_proof_view_for_conclusion(final SubLObject proof_conclusion) {
	dictionary_utilities.dictionary_increment($proof_conclusion_proof_view_counts$.getGlobalValue(), proof_conclusion, UNPROVIDED);
	return dictionary.dictionary_lookup_without_values($proof_conclusion_proof_view_counts$.getGlobalValue(), proof_conclusion, UNPROVIDED);
    }

    public static SubLObject tracking_proof_view_literals_to_suppress(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list69);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject new_lits = NIL;
	destructuring_bind_must_consp(current, datum, $list69);
	new_lits = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(CLET, $list71, listS(CPUSH_ALL, new_lits, $list73), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list69);
	return NIL;
    }

    public static SubLObject construct_inference_proof_view_int(final SubLObject proof, final SubLObject inference_answer, final SubLObject mt, final SubLObject proof_index_string, final SubLObject v_proof_view, SubLObject parent_proof_view_entry, SubLObject pph_relevance_safe_list) {
	if (parent_proof_view_entry == UNPROVIDED) {
	    parent_proof_view_entry = NIL;
	}
	if (pph_relevance_safe_list == UNPROVIDED) {
	    pph_relevance_safe_list = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != proof_view.valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
	if (((NIL != parent_proof_view_entry) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == proof_view.proof_view_entry_p(parent_proof_view_entry))) {
	    throw new AssertionError(parent_proof_view_entry);
	}
	parent_proof_view_entry = proof_view_residual.maybe_reconsider_parent_proof_view_entry(parent_proof_view_entry, proof);
	final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof, mt);
	final SubLObject traceP = NIL;
	SubLObject suppressP = NIL;
	SubLObject suppression_reason = NIL;
	final SubLObject _prev_bind_0 = proof_view.$proof_view_literals_to_suppress$.currentBinding(thread);
	try {
	    proof_view.$proof_view_literals_to_suppress$.bind(NIL != misc_utilities.initialized_p(proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)) ? proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread) : NIL, thread);
	    final SubLObject items_var = proof_view_proof_literals_to_suppress(proof, v_proof_view);
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
		    proof_view.$proof_view_literals_to_suppress$.setDynamicValue(cons(item, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
		}
	    } else {
		SubLObject cdolist_list_var = items_var;
		SubLObject item2 = NIL;
		item2 = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    proof_view.$proof_view_literals_to_suppress$.setDynamicValue(cons(item2, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
		    cdolist_list_var = cdolist_list_var.rest();
		    item2 = cdolist_list_var.first();
		}
	    }
	    note_constructing_proof_view_for_conclusion(proof_conclusion);
	    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		format_nil.force_format(T, $str76$__Adding__S___under__S__, proof, parent_proof_view_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    if (NIL == pph_proof.formula_too_complex_for_proof_paraphraseP(proof_conclusion, UNPROVIDED)) {
		SubLObject cdolist_list_var = cycl_utilities.expression_gather(proof_conclusion, $sym77$FAST_REIFIED_SKOLEM_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject skolem = NIL;
		skolem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject item_var = skolem;
		    if (NIL == member(item_var, pph_relevance_safe_list, symbol_function(EQL), symbol_function(IDENTITY))) {
			pph_relevance_safe_list = cons(item_var, pph_relevance_safe_list);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    skolem = cdolist_list_var.first();
		}
	    }
	    if (NIL != proof_view_residual.proof_view_proof_relocated_p(proof)) {
		if (NIL != traceP) {
		    Errors.sublisp_break($str78$Relocated___S, new SubLObject[] { proof_conclusion });
		}
		suppressP = T;
		suppression_reason = $RELOCATED;
	    } else if (NIL != proof_view_trivial_proofP(proof, mt)) {
		proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, $TRIVIAL);
		if (NIL != traceP) {
		    Errors.sublisp_break($$$Trivial, EMPTY_SUBL_OBJECT_ARRAY);
		}
		suppressP = T;
		suppression_reason = $TRIVIAL;
	    } else if (NIL != proof_conclusion_for_query_pragmaP(proof_conclusion, inference_answer)) {
		proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, $QUERY_PRAGMA);
		suppressP = T;
		suppression_reason = $QUERY_PRAGMA;
	    } else if (NIL != proof_view.proof_view_has_entry_for_objectP(v_proof_view, proof_conclusion, parent_proof_view_entry)) {
		if (NIL != traceP) {
		    Errors.sublisp_break($str83$Has_entry_already_, EMPTY_SUBL_OBJECT_ARRAY);
		}
		suppressP = T;
		suppression_reason = $DUPLICATE;
	    } else if ((NIL != parent_proof_view_entry) && (NIL != proof_view_residual.proof_view_conjunctive_removal_proof_p(proof, mt))) {
		SubLObject cdolist_list_var2;
		final SubLObject supports = cdolist_list_var2 = pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_displayworthy_supports(proof, NIL, mt, UNPROVIDED, UNPROVIDED));
		SubLObject support = NIL;
		support = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
		    final SubLObject support_entry = proof_view_add_support_tree(v_proof_view, support, parent_proof_view_entry, mt, UNPROVIDED, UNPROVIDED);
		    if (NIL != support_entry) {
			proof_view.proof_view_entry_set_proof(support_entry, proof);
		    }
		    cdolist_list_var2 = cdolist_list_var2.rest();
		    support = cdolist_list_var2.first();
		}
		proof_view_note_already_handled(v_proof_view, proof);
	    } else if (NIL != proof_view_situation_constituents_proof_p(proof)) {
		proof_view_add_entries_for_situation_constituents_proof(v_proof_view, proof, parent_proof_view_entry, mt);
	    } else if (NIL != proof_view_entity_mentions_proofP(proof, mt)) {
		proof_view_add_entity_mention_entries(v_proof_view, proof, parent_proof_view_entry, mt);
	    } else if (NIL != inference_worker.structural_proof_p(proof)) {
		SubLObject list_var = NIL;
		SubLObject subproof = NIL;
		SubLObject i = NIL;
		list_var = pph_proof.pph_proof_subproofs(proof);
		subproof = list_var.first();
		for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), subproof = list_var.first(), i = add(ONE_INTEGER, i)) {
		    construct_inference_proof_view_int(subproof, inference_answer, mt, proof_index_string, v_proof_view, parent_proof_view_entry, pph_relevance_safe_list);
		}
	    } else if (NIL != proof_view_proof_already_handledP(v_proof_view, proof)) {
		suppressP = T;
		suppression_reason = $ALREADY_HANDLED;
	    } else if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
		proof_view_residual.proof_view_add_entries_for_residual_transformation_proof(v_proof_view, proof, parent_proof_view_entry, mt, inference_answer, proof_index_string, pph_relevance_safe_list);
	    } else if (NIL != pph_proof.pph_irrelevant_formulaP(proof_conclusion, pph_relevance_safe_list, UNPROVIDED)) {
		proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, $IRRELEVANT);
		suppressP = T;
		suppression_reason = $IRRELEVANT;
	    } else if (NIL != pph_proof.pph_proof_wX_isomorphic_support_p(proof)) {
		final SubLObject isomorphic_support = pph_proof.pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof)).first();
		if (NIL != traceP) {
		    format(T, $str87$Proof_has_isomorphic_support___A, isomorphic_support);
		}
		if (NIL != pph_proof.pph_irrelevant_supportP(isomorphic_support, pph_relevance_safe_list, UNPROVIDED)) {
		    proof_view.proof_view_note_filtered_item(v_proof_view, isomorphic_support, $IRRELEVANT);
		} else {
		    final SubLObject support_entry2 = proof_view_add_support_tree(v_proof_view, isomorphic_support, parent_proof_view_entry, mt, UNPROVIDED, UNPROVIDED);
		    if (NIL != support_entry2) {
			proof_view.proof_view_entry_set_proof(support_entry2, proof);
		    }
		}
	    } else if (NIL != proof_view.suppress_proof_view_literalP(proof_view.proof_view_fact_sentence(proof_conclusion))) {
		suppressP = T;
		suppression_reason = $SUPPRESSED;
	    } else {
		construct_default_proof_view(proof, inference_answer, v_proof_view, parent_proof_view_entry, mt, proof_index_string, traceP, pph_relevance_safe_list);
	    }

	} finally {
	    proof_view.$proof_view_literals_to_suppress$.rebind(_prev_bind_0, thread);
	}
	if (NIL != suppressP) {
	    proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, suppression_reason);
	}
	return NIL != parent_proof_view_entry ? proof_view.proof_view_entry_get_children(parent_proof_view_entry) : proof_view.proof_view_get_root_entry(v_proof_view);
    }

    public static SubLObject construct_default_proof_view(final SubLObject proof, final SubLObject inference_answer, final SubLObject v_proof_view, final SubLObject parent_proof_view_entry, final SubLObject mt, final SubLObject proof_index_string, SubLObject traceP,
	    SubLObject pph_relevance_safe_list) {
	if (traceP == UNPROVIDED) {
	    traceP = NIL;
	}
	if (pph_relevance_safe_list == UNPROVIDED) {
	    pph_relevance_safe_list = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != traceP) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
	    Errors.warn($str89$Constructing_default_proof_view_f, proof);
	}
	final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof, mt);
	final SubLObject object_type = (NIL != assertion_handles.assertion_p(proof_conclusion)) ? ASSERTION_P : EL_SENTENCE_P;
	final SubLObject supports = pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_displayworthy_supports(proof, NIL, mt, UNPROVIDED, UNPROVIDED));
	final SubLObject subproofs = pph_proof.pph_proof_subproofs(proof);
	final SubLObject label = ((NIL != supports) || (NIL != subproofs)) ? proof_view.$proof_view_inferred_label$.getDynamicValue(thread) : proof_view.$proof_view_opaque_label$.getDynamicValue(thread);
	final SubLObject subentry_parent_entry = (NIL != proof_view.proof_view_has_entry_for_objectP(v_proof_view, proof_conclusion, parent_proof_view_entry)) ? parent_proof_view_entry
		: proof_view_add_new_entry(v_proof_view, label, parent_proof_view_entry, object_type, proof_conclusion, list($FN, CONSTRUCT_DEFAULT_PROOF_VIEW, $PROOF, proof));
	if ((NIL != traceP) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
	    Errors.warn($str94$Adding_sub_entries_under__S, subentry_parent_entry);
	}
	SubLObject cdolist_list_var = supports;
	SubLObject support = NIL;
	support = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject support_entry = proof_view_add_support_tree(v_proof_view, support, subentry_parent_entry, mt, UNPROVIDED, UNPROVIDED);
	    if (NIL != support_entry) {
		proof_view.proof_view_entry_set_proof(support_entry, proof);
	    } else if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		Errors.warn($str95$Couldn_t_add_entry_for_support___, support);
	    }

	    cdolist_list_var = cdolist_list_var.rest();
	    support = cdolist_list_var.first();
	}
	SubLObject list_var = NIL;
	SubLObject subproof = NIL;
	SubLObject i = NIL;
	list_var = subproofs;
	subproof = list_var.first();
	for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), subproof = list_var.first(), i = add(ONE_INTEGER, i)) {
	    final SubLObject index_string = cconcatenate(proof_index_string, princ_to_string(i));
	    construct_inference_proof_view_int(subproof, inference_answer, mt, index_string, v_proof_view, subentry_parent_entry, pph_relevance_safe_list);
	}
	return proof;
    }

    public static SubLObject proof_view_trivial_proofP(final SubLObject proof, final SubLObject mt) {
	if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
	    return NIL;
	}
	if (NIL != trivial_proof_conclusionP(proof, mt)) {
	    return T;
	}
	return NIL;
    }

    public static SubLObject trivial_proof_conclusionP(final SubLObject proof, final SubLObject mt) {
	final SubLObject conclusion = pph_proof.pph_proof_conclusion(proof, mt);
	SubLObject trivialP = pph_proof.pph_trivial_sentenceP(conclusion, UNPROVIDED);
	if ((NIL != assertion_handles.assertion_p(conclusion)) && (NIL == assertions_high.asserted_assertionP(conclusion))) {
	    final SubLObject args = cycl_utilities.formula_args(conclusion, $IGNORE);
	    SubLObject rest;
	    SubLObject assertion_arg;
	    SubLObject nart;
	    SubLObject okP;
	    SubLObject args_$3;
	    SubLObject rest_$4;
	    SubLObject other_assertion_arg;
	    for (rest = NIL, rest = args; (NIL == trivialP) && (NIL != rest); rest = rest.rest()) {
		assertion_arg = rest.first();
		if (NIL != nart_handles.nart_p(assertion_arg)) {
		    nart = assertion_arg;
		    okP = proof_binds_some_variable_to_valueP(proof, nart, UNPROVIDED);
		    args_$3 = cycl_utilities.formula_args(conclusion, $IGNORE);
		    for (rest_$4 = NIL, rest_$4 = args_$3; (NIL == okP) && (NIL != rest_$4); rest_$4 = rest_$4.rest()) {
			other_assertion_arg = rest_$4.first();
			if ((!other_assertion_arg.eql(nart)) && (NIL == subl_promotions.memberP(other_assertion_arg, cycl_utilities.nat_args(nart, UNPROVIDED), symbol_function(EQL), UNPROVIDED))) {
			    okP = T;
			}
		    }
		    trivialP = makeBoolean(NIL == okP);
		}
	    }
	}
	return trivialP;
    }

    public static SubLObject proof_binds_some_variable_to_valueP(final SubLObject proof, final SubLObject value, SubLObject seen) {
	if (seen == UNPROVIDED) {
	    seen = set.new_set(UNPROVIDED, UNPROVIDED);
	}
	if (NIL == set.set_memberP(proof, seen)) {
	    set.set_add(proof, seen);
	    if (NIL != subl_promotions.memberP(value, inference_datastructures_proof.proof_bindings(proof), EQUAL, VARIABLE_BINDING_VALUE)) {
		return T;
	    }
	    SubLObject cdolist_list_var = inference_datastructures_proof.proof_dependent_proofs(proof, UNPROVIDED);
	    SubLObject dependent_proof = NIL;
	    dependent_proof = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != proof_binds_some_variable_to_valueP(dependent_proof, value, seen)) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		dependent_proof = cdolist_list_var.first();
	    }
	}
	return NIL;
    }

    public static SubLObject proof_conclusion_for_query_pragmaP(final SubLObject proof_conclusion, final SubLObject inference_answer) {
	if (NIL != el_formula_p(proof_conclusion)) {
	    final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
	    final SubLObject pragma = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
	    SubLObject cdolist_list_var;
	    final SubLObject pragma_conjuncts = cdolist_list_var = (NIL != pragma) ? NIL != el_conjunction_p(pragma) ? cycl_utilities.formula_args(pragma, UNPROVIDED) : list(pragma) : NIL;
	    SubLObject pragma_conjunct = NIL;
	    pragma_conjunct = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		final SubLObject pattern = cycl_utilities.expression_transform(pragma_conjunct, $sym98$EL_VAR_, ANYTHING_TOKEN, UNPROVIDED, UNPROVIDED);
		if (NIL != formula_pattern_match.formula_matches_pattern(proof_conclusion, pattern)) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		pragma_conjunct = cdolist_list_var.first();
	    }
	}
	return NIL;
    }

    public static SubLObject proof_view_proof_literals_to_suppress(final SubLObject proof, final SubLObject v_proof_view) {
	return proof_literals_to_suppress(proof, proof_view.proof_view_get_addressee(v_proof_view));
    }

    public static SubLObject proof_literals_to_suppress_internal(final SubLObject proof, SubLObject addressee) {
	if (addressee == UNPROVIDED) {
	    addressee = pph_vars.$pph_addressee$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding(thread);
	try {
	    pph_vars.$pph_addressee$.bind(addressee, thread);
	    SubLObject lits = NIL;
	    SubLObject cdolist_list_var = inference_datastructures_proof.proof_supports(proof);
	    SubLObject support = NIL;
	    support = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject literals_to_suppress = (NIL != assertions_high.rule_assertionP(support)) ? pph_proof.pph_rule_literals_to_suppress(support, UNPROVIDED) : NIL;
		if (NIL != literals_to_suppress) {
		    final SubLObject rule = support;
		    final SubLObject rule_bindings = (NIL != inference_worker_transformation.transformation_proof_p(proof)) ? inference_worker_transformation.transformation_proof_rule_bindings(proof)
			    : NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof) ? inference_worker_residual_transformation.residual_transformation_proof_rule_bindings(proof) : NIL;
		    final SubLObject variable_map = inference_worker_transformation.rule_assertion_variable_map(rule);
		    final SubLObject rule_el_bindings = bindings.transfer_variable_map_to_bindings_backwards_filtered(variable_map, rule_bindings);
		    if (NIL != rule_el_bindings) {
			literals_to_suppress = bindings.apply_bindings(rule_el_bindings, literals_to_suppress);
		    }
		    final SubLObject items_var = literals_to_suppress;
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
			    lits = cons(item, lits);
			}
		    } else {
			SubLObject cdolist_list_var_$5 = items_var;
			SubLObject item2 = NIL;
			item2 = cdolist_list_var_$5.first();
			while (NIL != cdolist_list_var_$5) {
			    lits = cons(item2, lits);
			    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
			    item2 = cdolist_list_var_$5.first();
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		support = cdolist_list_var.first();
	    }
	    return lits;
	} finally {
	    pph_vars.$pph_addressee$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject proof_literals_to_suppress(final SubLObject proof, SubLObject addressee) {
	if (addressee == UNPROVIDED) {
	    addressee = pph_vars.$pph_addressee$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return proof_literals_to_suppress_internal(proof, addressee);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_LITERALS_TO_SUPPRESS, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_LITERALS_TO_SUPPRESS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PROOF_LITERALS_TO_SUPPRESS, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, addressee);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (proof.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && addressee.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_literals_to_suppress_internal(proof, addressee)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, addressee));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject proof_view_proof_already_handledP(final SubLObject v_proof_view, final SubLObject proof) {
	final SubLObject already_handled = proof_view.proof_view_get_property(v_proof_view, $ALREADY_HANDLED_PROOFS, UNPROVIDED);
	return makeBoolean((NIL != set.set_p(already_handled)) && (NIL != set.set_memberP(proof, already_handled)));
    }

    public static SubLObject proof_view_note_already_handled(final SubLObject v_proof_view, final SubLObject proof) {
	SubLObject already_handled = proof_view.proof_view_get_property(v_proof_view, $ALREADY_HANDLED_PROOFS, UNPROVIDED);
	if (NIL == set.set_p(already_handled)) {
	    already_handled = set.new_set(symbol_function(EQL), UNPROVIDED);
	    proof_view.proof_view_set_property(v_proof_view, $ALREADY_HANDLED_PROOFS, already_handled);
	}
	set.set_add(proof, already_handled);
	return already_handled;
    }

    public static SubLObject pph_relevance_safe_list_for_justification(final SubLObject inference_answer) {
	return cons(inference_datastructures_inference.inference_el_query(inference_datastructures_inference.inference_answer_inference(inference_answer)), inference_answer_binding_targets(inference_answer));
    }

    public static SubLObject inference_answer_binding_targets(final SubLObject inference_answer) {
	return list_utilities.alist_values(inference_datastructures_inference.inference_answer_bindings(inference_answer));
    }

    public static SubLObject proof_view_add_inference_proof_used_rules_root(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject root = proof_view_add_section_root(v_proof_view, proof_view.$proof_view_rules_used_label$.getDynamicValue(thread));
	proof_view.proof_view_set_property(v_proof_view, $USED_RULES_ROOT, root);
	return root;
    }

    public static SubLObject proof_view_add_query_and_answer_section(final SubLObject v_proof_view, final SubLObject mt) {
	final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
	final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
	final SubLObject input_query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
	final SubLObject query_sentence = (NIL != ist_sentence_p(input_query_sentence, UNPROVIDED)) ? cycl_utilities.formula_arg2(input_query_sentence, UNPROVIDED) : input_query_sentence;
	final SubLObject query_entry = proof_view_add_new_entry(v_proof_view, $str104$Query_, NIL, $QUERY_SENTENCE, query_sentence, list($FN, PROOF_VIEW_ADD_QUERY_AND_ANSWER_SECTION));
	proof_view_entry_note_expand_initially(query_entry);
	proof_view.proof_view_set_property(v_proof_view, $QUERY_ROOT, query_entry);
	final SubLObject answer_entry = construct_proof_view_answer_entry(v_proof_view, mt, query_entry);
	proof_view_entry_note_expand_initially(answer_entry);
	return v_proof_view;
    }

    public static SubLObject construct_proof_view_answer_entry(final SubLObject v_proof_view, final SubLObject mt, final SubLObject query_entry) {
	final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
	final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
	final SubLObject input_query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
	final SubLObject query_sentence = (NIL != ist_sentence_p(input_query_sentence, UNPROVIDED)) ? cycl_utilities.formula_arg2(input_query_sentence, UNPROVIDED) : input_query_sentence;
	final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
	final SubLObject answer_label = $str108$Answer_;
	if (NIL == v_bindings) {
	    final SubLObject value = proof_view.proof_view_closed_query_success_value();
	    return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, EL_TERM_P, value, list($FN, CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, $FN_SECTION, NULL_BINDINGS));
	}
	if (NIL != list_utilities.singletonP(v_bindings)) {
	    final SubLObject binding = v_bindings.first();
	    final SubLObject value2 = bindings.variable_binding_value(binding);
	    if (NIL != cycl_grammar.cycl_expression_p(value2)) {
		return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, EL_TERM_P, value2, list($FN, CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, $FN_SECTION, ONE_BINDING));
	    }
	}
	if (NIL != atomic_sentenceP(query_sentence)) {
	    final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
	    final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof, mt);
	    final SubLObject type = (NIL != assertion_handles.assertion_p(proof_conclusion)) ? ASSERTION_P : EL_SENTENCE_P;
	    return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, type, proof_conclusion, list($FN, CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, $FN_SECTION, ATOMIC_QUERY_SENTENCE));
	}
	return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, $BINDINGS, v_bindings, list($FN, CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, $FN_SECTION, DEFAULT));
    }

    public static SubLObject new_proof_view_entry(final SubLObject v_proof_view, final SubLObject v_object) {
	final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
	final SubLObject id = get_new_proof_view_entry_id(v_proof_view);
	final SubLObject entry = proof_view.make_proof_view_entry(list($ID, id, $OBJECT, v_object, $PROOF_VIEW, v_proof_view));
	id_index_enter(v_id_index, id, entry);
	return entry;
    }

    public static SubLObject proof_view_add_new_entry(final SubLObject v_proof_view, final SubLObject label, SubLObject parent_proof_view_entry, final SubLObject object_type, final SubLObject v_object, SubLObject v_properties) {
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != proof_view.valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
	assert NIL != stringp(label) : "Types.stringp(label) " + "CommonSymbols.NIL != Types.stringp(label) " + label;
	if (NIL == parent_proof_view_entry) {
	    parent_proof_view_entry = proof_view.proof_view_get_root_entry(v_proof_view);
	}
	assert NIL != proof_view.proof_view_entry_p(parent_proof_view_entry) : "proof_view.proof_view_entry_p(parent_proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(parent_proof_view_entry) " + parent_proof_view_entry;
	assert NIL != symbolp(object_type) : "Types.symbolp(object_type) " + "CommonSymbols.NIL != Types.symbolp(object_type) " + object_type;
	assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
	v_properties = copy_list(v_properties);
	if (NIL == $proof_view_track_fnsP$.getDynamicValue(thread)) {
	    v_properties = remf(remf(v_properties, $FN_SECTION), $FN);
	}
	if (NIL == $proof_view_allow_unlimited_duplicationP$.getDynamicValue(thread)) {
	    final SubLObject existing_count = proof_view.proof_view_count_entries_with_values(v_proof_view, label, parent_proof_view_entry, object_type, v_object, v_properties);
	    if (existing_count.numG($proof_view_duplicate_entry_max$.getDynamicValue(thread))) {
		Errors.error($str121$_S_already_exists___S_time__P__in, v_object, existing_count, v_proof_view);
	    }
	}
	final SubLObject parent_id = (NIL != proof_view.proof_view_entry_p(parent_proof_view_entry)) ? proof_view.proof_view_entry_int_id(parent_proof_view_entry) : NIL;
	final SubLObject proof_view_entry = new_proof_view_entry(v_proof_view, v_object);
	proof_view.proof_view_entry_set_parent_id(proof_view_entry, parent_id);
	proof_view.proof_view_entry_set_label(proof_view_entry, label);
	proof_view.proof_view_entry_set_object_type(proof_view_entry, object_type);
	SubLObject remainder;
	SubLObject property;
	SubLObject value;
	for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
	    property = remainder.first();
	    value = cadr(remainder);
	    proof_view.proof_view_entry_set_property(proof_view_entry, property, value);
	}
	if (NIL != proof_view.proof_view_entry_p(parent_proof_view_entry)) {
	    final SubLObject new_children = list_utilities.add_to_end(proof_view_entry, proof_view.proof_view_entry_get_children(parent_proof_view_entry));
	    proof_view_entry_set_children(parent_proof_view_entry, new_children);
	}
	if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
	    format_nil.force_format(T, $str122$__Added__S___for__S___under__S__, proof_view_entry, v_object, parent_proof_view_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	maybe_pause_proof_view_population(proof_view_entry);
	return proof_view_entry;
    }

    public static SubLObject maybe_pause_proof_view_population(SubLObject new_object) {
	if (new_object == UNPROVIDED) {
	    new_object = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != misc_utilities.initialized_p($proof_view_populator$.getDynamicValue(thread))) {
	    Semaphores.semaphore_signal(proof_view_populator_master_semaphore($proof_view_populator$.getDynamicValue(thread)));
	    Semaphores.semaphore_wait(proof_view_populator_worker_semaphore($proof_view_populator$.getDynamicValue(thread)));
	}
	return $proof_view_populator$.getDynamicValue(thread);
    }

    public static SubLObject proof_view_entry_note_expand_initially(final SubLObject proof_view_entry) {
	assert NIL != proof_view.valid_proof_view_entry_p(proof_view_entry) : "proof_view.valid_proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.valid_proof_view_entry_p(proof_view_entry) " + proof_view_entry;
	return proof_view.proof_view_entry_set_property(proof_view_entry, $kw124$EXPAND_INITIALLY_, T);
    }

    public static SubLObject proof_view_add_section_root(final SubLObject v_proof_view, final SubLObject label) {
	assert NIL != proof_view.valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
	assert NIL != stringp(label) : "Types.stringp(label) " + "CommonSymbols.NIL != Types.stringp(label) " + label;
	final SubLObject section_root = proof_view_add_new_entry(v_proof_view, label, NIL, $SECTION_ROOT, NIL, list($FN, PROOF_VIEW_ADD_SECTION_ROOT));
	return section_root;
    }

    public static SubLObject proof_view_rem_property(final SubLObject v_proof_view, final SubLObject property) {
	assert NIL != proof_view.proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
	assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
	return remf(proof_view.proof_view_int_properties(v_proof_view), property);
    }

    public static SubLObject proof_view_remove_entry(final SubLObject v_proof_view, final SubLObject proof_view_entry) {
	final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
	final SubLObject id = proof_view.proof_view_entry_get_id(proof_view_entry);
	final SubLObject parent_entry_id = proof_view.proof_view_entry_get_parent_id(proof_view_entry);
	final SubLObject parent_entry = proof_view.find_proof_view_entry_by_id(v_proof_view, parent_entry_id);
	SubLObject siblings = proof_view.proof_view_entry_get_children(parent_entry);
	siblings = delete(proof_view_entry, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	proof_view_entry_set_children(parent_entry, siblings);
	id_index_remove(v_id_index, id);
	proof_view._csetf_proof_view_entry_int_proof_view(proof_view_entry, v_proof_view);
	return proof_view_entry;
    }

    public static SubLObject proof_view_add_rule_used(final SubLObject v_proof_view, final SubLObject rules_used_section_root, final SubLObject used_rule, final SubLObject inference_mt) {
	final SubLObject rule_entry = proof_view_add_new_entry(v_proof_view, $str39$, rules_used_section_root, $RULE_USED, used_rule, list($FN, PROOF_VIEW_ADD_RULE_USED));
	SubLObject rules_used = proof_view.proof_view_get_property(v_proof_view, $RULES_USED, UNPROVIDED);
	rules_used = cons(used_rule, rules_used);
	proof_view.proof_view_set_property(v_proof_view, $RULES_USED, rules_used);
	return rule_entry;
    }

    public static SubLObject proof_view_get_justification_root_entry(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
	SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(root_entry);
	SubLObject child_entry = NIL;
	child_entry = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (proof_view.proof_view_entry_get_label(child_entry).equal(proof_view.$proof_view_justification_label$.getDynamicValue(thread))) {
		return child_entry;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    child_entry = cdolist_list_var.first();
	}
	return proof_view.proof_view_get_property(v_proof_view, $JUSTIFICATION_ROOT, NIL);
    }

    public static SubLObject proof_view_get_linear_root_entry(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
	SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(root_entry);
	SubLObject child_entry = NIL;
	child_entry = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (proof_view.proof_view_entry_get_label(child_entry).equal(proof_view.$proof_view_linear_label$.getDynamicValue(thread))) {
		return child_entry;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    child_entry = cdolist_list_var.first();
	}
	return proof_view.proof_view_get_property(v_proof_view, $LINEAR_ROOT, NIL);
    }

    public static SubLObject proof_view_sort_entries_to_maximize_coherence(final SubLObject v_proof_view, final SubLObject mt, final SubLObject entries) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject inference_entities = proof_view.entities_in_bindings(inference_datastructures_inference.inference_answer_bindings(proof_view.proof_view_get_answer(v_proof_view)), mt);
	final SubLObject _prev_bind_0 = $proof_scores$.currentBinding(thread);
	try {
	    $proof_scores$.bind(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED), thread);
	    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		format_nil.force_format(T, $str132$__Inference_entities___S__, inference_entities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    SubLObject cdolist_list_var = entries;
	    SubLObject entry = NIL;
	    entry = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		final SubLObject proof = proof_view.proof_view_entry_get_proof(entry, T);
		final SubLObject v_forts = (NIL != proof)
			? cycl_utilities.expression_gather(NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof) ? proof_view_residual.pph_residual_transformation_proof_conclusion(proof, mt) : pph_proof.pph_proof_conclusion(proof, mt), FORT_P, T, UNPROVIDED,
				UNPROVIDED, UNPROVIDED)
			: NIL;
		if (NIL == dictionary_utilities.dictionary_has_keyP($proof_scores$.getDynamicValue(thread), proof)) {
		    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
			format_nil.force_format(T, $str134$___D_Entry_FORTs___S___S, proof_view.proof_view_entry_get_id(entry), v_forts, proof_view.proof_view_entry_get_object(entry), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    SubLObject cdolist_list_var_$6 = v_forts;
		    SubLObject fort = NIL;
		    fort = cdolist_list_var_$6.first();
		    while (NIL != cdolist_list_var_$6) {
			if (NIL != subl_promotions.memberP(fort, inference_entities, UNPROVIDED, UNPROVIDED)) {
			    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
				format_nil.force_format(T, $str135$__Found_preferred_FORT__S__, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    dictionary_utilities.dictionary_increment($proof_scores$.getDynamicValue(thread), proof, UNPROVIDED);
			}
			cdolist_list_var_$6 = cdolist_list_var_$6.rest();
			fort = cdolist_list_var_$6.first();
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		entry = cdolist_list_var.first();
	    }
	    return Sort.stable_sort(Sort.sort(entries, symbol_function($sym46$_), PROOF_VIEW_ENTRY_GET_PROOF_SUID), symbol_function($sym137$_), PROOF_VIEW_ENTRY_GET_SCORE);
	} finally {
	    $proof_scores$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject proof_view_entry_get_proof_suid(final SubLObject entry) {
	final SubLObject proof = proof_view.proof_view_entry_get_proof(entry, T);
	return NIL != proof ? inference_datastructures_proof.proof_suid(proof) : MINUS_ONE_INTEGER;
    }

    public static SubLObject proof_view_entry_get_score(final SubLObject entry) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject proof = proof_view.proof_view_entry_get_proof(entry, T);
	return dictionary.dictionary_lookup_without_values($proof_scores$.getDynamicValue(thread), proof, ZERO_INTEGER);
    }

    public static SubLObject proof_view_add_fact_used(final SubLObject v_proof_view, final SubLObject facts_used_section_root, final SubLObject used_fact, final SubLObject inference_mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject fact_entry = proof_view_add_new_entry(v_proof_view, $str39$, facts_used_section_root, NIL != arguments.support_p(used_fact) ? NIL != assertion_handles.assertion_p(used_fact) ? ASSERTION_P : SUPPORT_P : EL_SENTENCE_P, used_fact, list($FN, PROOF_VIEW_ADD_FACT_USED));
	SubLObject facts_used = proof_view.proof_view_get_property(v_proof_view, $FACTS_USED, UNPROVIDED);
	proof_view_entry_note_expand_initially(fact_entry);
	facts_used = cons(used_fact, facts_used);
	proof_view.proof_view_set_property(v_proof_view, $FACTS_USED, facts_used);
	if (NIL == subl_promotions.memberP(used_fact, proof_view.proof_view_get_property(v_proof_view, $FACTS_USED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED)) {
	    Errors.sublisp_break($str142$Failed_to_store__S_on__S, new SubLObject[] { used_fact, v_proof_view });
	}
	if (NIL != assertion_handles.assertion_p(used_fact)) {
	    thread.resetMultipleValues();
	    final SubLObject mt = pph_proof.pph_assert_info(used_fact);
	    SubLObject v_sources = thread.secondMultipleValue();
	    final SubLObject strengthenedP = thread.thirdMultipleValue();
	    thread.resetMultipleValues();
	    SubLObject cdolist_list_var = sources.assertion_corroborating_sources(used_fact, inference_mt);
	    SubLObject corroborating_source = NIL;
	    corroborating_source = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		final SubLObject item_var = corroborating_source;
		if (NIL == member(item_var, v_sources, symbol_function(EQUAL), symbol_function(IDENTITY))) {
		    v_sources = cons(item_var, v_sources);
		}
		cdolist_list_var = cdolist_list_var.rest();
		corroborating_source = cdolist_list_var.first();
	    }
	    cdolist_list_var = v_sources;
	    SubLObject source = NIL;
	    source = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		proof_view_note_source(v_proof_view, fact_entry, source, strengthenedP);
		cdolist_list_var = cdolist_list_var.rest();
		source = cdolist_list_var.first();
	    }
	} else if (NIL != proof_view.proof_view_external_support_p(used_fact)) {
	    final SubLObject ks = proof_view_knowledge_source_for_hl_support(used_fact);
	    if (NIL != ks) {
		proof_view_note_source(v_proof_view, fact_entry, ks, UNPROVIDED);
	    }
	}

	return fact_entry;
    }

    public static SubLObject proof_view_note_source(final SubLObject v_proof_view, final SubLObject entry, SubLObject source, SubLObject strengthenedP) {
	if (strengthenedP == UNPROVIDED) {
	    strengthenedP = NIL;
	}
	if ((NIL != proof_view.proof_view_entry_get_include_sourcesP(entry)) && (NIL != proof_view.proof_view_valid_source_p(source))) {
	    proof_view_entry_add_source(entry, source, strengthenedP);
	    proof_view_possibly_register_source(v_proof_view, source, strengthenedP);
	}
	return entry;
    }

    public static SubLObject proof_view_add_external_source_entry(final SubLObject v_proof_view, final SubLObject support, final SubLObject support_entry) {
	final SubLObject ks = proof_view_knowledge_source_for_hl_support(support);
	if (NIL != cycl_grammar.cycl_denotational_term_p(ks)) {
	    proof_view_note_source(v_proof_view, support_entry, ks, UNPROVIDED);
	    proof_view_maybe_add_document_display_entry(v_proof_view, support, support_entry, ks);
	}
	return ks;
    }

    public static SubLObject proof_view_knowledge_source_for_hl_support(final SubLObject hl_support) {
	final SubLObject pcase_var = arguments.support_module(hl_support);
	if (pcase_var.eql($SKSI)) {
	    return sources.sksi_support_sources(hl_support).first();
	}
	if (pcase_var.eql($GIS)) {
	    final SubLObject ks = constants_high.find_constant($str145$Cycorp_ArcMap_GIS_KS);
	    if (NIL != valid_constantP(ks, UNPROVIDED)) {
		return ks;
	    }
	}
	return NIL;
    }

    public static SubLObject proof_view_knowledge_source_for_mt(final SubLObject mt) {
	return ask_utilities.ask_variable($sym146$_KS, list($$contentMt, $sym146$_KS, mt), $$InferencePSC, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject proof_view_maybe_add_document_display_entry(final SubLObject v_proof_view, final SubLObject support, final SubLObject support_entry, final SubLObject ks) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (ks.eql($$Saffron_KS)) {
	    thread.resetMultipleValues();
	    final SubLObject successP = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), $list150);
	    final SubLObject v_bindings = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL != successP) {
		final SubLObject hypothesis = list_utilities.alist_lookup(v_bindings, HYPOTHESIS, UNPROVIDED, UNPROVIDED);
		final SubLObject v_term = list_utilities.alist_lookup(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
		final SubLObject mt = arguments.support_mt(support);
		proof_view_add_external_sentence_entries(v_proof_view, support_entry, hypothesis, list(v_term), mt);
	    }
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_situation_constituents_proof_p(final SubLObject proof) {
	return list_utilities.sublisp_boolean(proof_view_situation_constituents_proof_hypothesis_and_terms(proof));
    }

    public static SubLObject proof_view_situation_constituents_proof_hypothesis_and_terms_internal(final SubLObject proof) {
	final SubLObject hl_module = inference_modules.find_hl_module_by_name($REMOVAL_SAFFRON_CONJUNCTION_069);
	SubLObject terms = NIL;
	SubLObject hypothesis = NIL;
	SubLObject failP = NIL;
	if ((NIL != inference_modules.hl_module_p(hl_module)) && (NIL == failP)) {
	    SubLObject csome_list_var = pph_proof.pph_proof_subproofs(proof);
	    SubLObject subproof = NIL;
	    subproof = csome_list_var.first();
	    while ((NIL == failP) && (NIL != csome_list_var)) {
		if ((NIL == inference_worker.content_proof_p(subproof)) || (!hl_module.eql(inference_worker.content_proof_hl_module(subproof)))) {
		    failP = T;
		}
		if (NIL == failP) {
		    SubLObject csome_list_var_$7 = inference_datastructures_proof.proof_supports(subproof);
		    SubLObject support = NIL;
		    support = csome_list_var_$7.first();
		    while ((NIL == failP) && (NIL != csome_list_var_$7)) {
			final SubLObject pcase_var = arguments.support_sentence_operator(support);
			if (!pcase_var.eql($$substring)) {
			    if ((pcase_var.eql($const156$situationConstituentWithTypeAndDe) || pcase_var.eql($$situationConstituentWithType)) || pcase_var.eql($$situationConstituentWithDesc)) {
				SubLObject current;
				final SubLObject datum = current = cycl_utilities.atomic_sentence_args(arguments.support_sentence(support), UNPROVIDED);
				SubLObject this_hypothesis = NIL;
				SubLObject this_term = NIL;
				SubLObject arg2 = NIL;
				destructuring_bind_must_consp(current, datum, $list159);
				this_hypothesis = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list159);
				this_term = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list159);
				arg2 = current.first();
				current = current.rest();
				final SubLObject arg3 = (current.isCons()) ? current.first() : NIL;
				destructuring_bind_must_listp(current, datum, $list159);
				current = current.rest();
				if (NIL == current) {
				    if ((NIL == hypothesis) || hypothesis.equal(this_hypothesis)) {
					hypothesis = this_hypothesis;
				    } else {
					failP = T;
				    }
				    final SubLObject item_var = this_term;
				    if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					terms = cons(item_var, terms);
				    }
				} else {
				    cdestructuring_bind_error(datum, $list159);
				}
			    }
			}
			csome_list_var_$7 = csome_list_var_$7.rest();
			support = csome_list_var_$7.first();
		    }
		}
		csome_list_var = csome_list_var.rest();
		subproof = csome_list_var.first();
	    }
	}
	if (NIL != failP) {
	    hypothesis = NIL;
	    terms = NIL;
	}
	return values(hypothesis, nreverse(terms));
    }

    public static SubLObject proof_view_situation_constituents_proof_hypothesis_and_terms(final SubLObject proof) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return proof_view_situation_constituents_proof_hypothesis_and_terms_internal(proof);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_situation_constituents_proof_hypothesis_and_terms_internal(proof)));
	    memoization_state.caching_state_put(caching_state, proof, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject proof_view_add_entries_for_situation_constituents_proof(final SubLObject v_proof_view, final SubLObject proof, final SubLObject parent_entry, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject hypothesis = proof_view_situation_constituents_proof_hypothesis_and_terms(proof);
	final SubLObject terms = thread.secondMultipleValue();
	thread.resetMultipleValues();
	proof_view_add_external_sentence_entries(v_proof_view, parent_entry, hypothesis, terms, mt);
	return v_proof_view;
    }

    public static SubLObject proof_view_add_external_sentence_entries(final SubLObject v_proof_view, final SubLObject parent_entry, final SubLObject hypothesis, final SubLObject terms, final SubLObject mt) {
	SubLObject addedP = NIL;
	SubLObject cdolist_list_var = proof_view_get_sentences_for_hypothesis(hypothesis, mt);
	SubLObject sentence = NIL;
	sentence = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != sentence) {
		final SubLObject source_sentence_entry = proof_view_add_new_entry(v_proof_view, $str160$Source_Text_, parent_entry, $EXTERNAL_SENTENCE, list(sentence, terms, mt), UNPROVIDED);
		final SubLObject v_document = proof_view.proof_view_get_document_for_hypothesis(hypothesis, mt);
		final SubLObject ks = proof_view_knowledge_source_for_mt(mt);
		addedP = T;
		if (NIL != v_document) {
		    final SubLObject publisher = proof_view_get_publisher_for_document(v_document, mt);
		    final SubLObject title = proof_view_get_title_for_document(v_document, mt);
		    final SubLObject date = proof_view_get_date_for_document(v_document, mt);
		    final SubLObject author = proof_view_get_author_for_document(v_document, mt);
		    if (NIL != title) {
			proof_view_add_new_entry(v_proof_view, $str162$Title_, source_sentence_entry, EL_TERM_P, title, UNPROVIDED);
		    }
		    if (NIL != date) {
			proof_view_add_new_entry(v_proof_view, $str163$Date_, source_sentence_entry, EL_TERM_P, date, UNPROVIDED);
		    }
		    if (NIL != author) {
			proof_view_add_new_entry(v_proof_view, $str164$Author_, source_sentence_entry, EL_TERM_P, author, UNPROVIDED);
		    }
		    if (NIL != publisher) {
			proof_view_add_new_entry(v_proof_view, $str165$Publisher_, source_sentence_entry, EL_TERM_P, publisher, UNPROVIDED);
		    }
		}
		proof_view_note_source(v_proof_view, source_sentence_entry, ks, UNPROVIDED);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    sentence = cdolist_list_var.first();
	}
	if (NIL == addedP) {
	    proof_view_add_new_entry(v_proof_view, $str166$Couldn_t_find_source_document_, parent_entry, $NO_SOURCE_DOCUMENT, NIL, UNPROVIDED);
	    proof_view_entry_note_expand_initially(parent_entry);
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_add_root_entry(final SubLObject v_proof_view) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != proof_view.valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
	final SubLObject id = get_new_proof_view_entry_id(v_proof_view);
	final SubLObject parent_id = NIL;
	final SubLObject root_entry = proof_view.make_proof_view_entry(list(new SubLObject[] { $ID, id, $PARENT_ID, parent_id, $PROOF_VIEW, v_proof_view, $OBJECT_TYPE, $ROOT, $LABEL, $$$Root }));
	final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
	proof_view_entry_note_expand_initially(root_entry);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id.eql(proof_view.$proof_view_root_entry_id$.getGlobalValue()))) {
	    Errors.error($str173$Initial_ID_in__S_is__S__should_be, v_proof_view, id, proof_view.$proof_view_root_entry_id$.getGlobalValue());
	}
	id_index_enter(v_id_index, id, root_entry);
	return root_entry;
    }

    public static SubLObject proof_view_get_sentences_for_hypothesis(final SubLObject hypothesis, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym174$_SENTENCE, list($$and, $list176, listS($$sourceOfTerm, hypothesis, $list178)), mt, UNPROVIDED);
    }

    public static SubLObject proof_view_add_support_tree(final SubLObject v_proof_view, final SubLObject support, final SubLObject parent_proof_view_entry, final SubLObject inference_mt, SubLObject current_depth, SubLObject seen_supports) {
	if (current_depth == UNPROVIDED) {
	    current_depth = ZERO_INTEGER;
	}
	if (seen_supports == UNPROVIDED) {
	    seen_supports = set.new_set(symbol_function(EQUAL), UNPROVIDED);
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != proof_view.valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
	assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
	if (((NIL != parent_proof_view_entry) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == proof_view.proof_view_entry_p(parent_proof_view_entry))) {
	    throw new AssertionError(parent_proof_view_entry);
	}
	final SubLObject _prev_bind_0 = $suspend_generality_sorting_of_proof_view_entriesP$.currentBinding(thread);
	try {
	    $suspend_generality_sorting_of_proof_view_entriesP$.bind(T, thread);
	    final SubLObject circularP = makeBoolean(NIL == set.set_add(support, seen_supports));
	    SubLObject support_entry = NIL;
	    if (NIL != proof_view.proof_view_has_entry_for_objectP(v_proof_view, support, parent_proof_view_entry)) {
		if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		    Errors.warn($str179$Already_have_entry_for__S, support);
		}
	    } else if (NIL == proof_view.suppress_proof_supportP(support)) {
		if ((NIL != assertion_handles.assertion_p(support)) && (NIL == assertions_high.deduced_assertionP(support))) {
		    support_entry = proof_view_add_new_entry(v_proof_view, proof_view.$proof_view_asserted_label$.getDynamicValue(thread), parent_proof_view_entry, ASSERTION_P, support, list($FN, PROOF_VIEW_ADD_SUPPORT_TREE, $FN_SECTION, NON_DEDUCED_ASSERTION));
		    proof_view_add_assert_info_entries(v_proof_view, support, support_entry, inference_mt);
		} else if ((NIL != assertion_handles.assertion_p(support)) && (NIL != circularP)) {
		    support_entry = proof_view_add_new_entry(v_proof_view, proof_view.$proof_view_asserted_label$.getDynamicValue(thread), parent_proof_view_entry, ASSERTION_P, support, list($FN, PROOF_VIEW_ADD_SUPPORT_TREE, $FN_SECTION, CIRCULAR_ASSERTION));
		    proof_view_add_circular_support_entry(v_proof_view, support, support_entry, inference_mt);
		} else if ((NIL != arguments.support_p(support)) && (NIL != circularP)) {
		    support_entry = proof_view_add_new_entry(v_proof_view, $str39$, parent_proof_view_entry, SUPPORT_P, support, list($FN, PROOF_VIEW_ADD_SUPPORT_TREE, $FN_SECTION, CIRCULAR_SUPPORT));
		    proof_view_add_circular_support_entry(v_proof_view, support, support_entry, inference_mt);
		} else if (NIL != arguments.support_p(support)) {
		    final SubLObject meta_supports = pph_check_meta_supports_for_circularity(pph_proof.pph_sort_meta_supports(pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_meta_supports_to_show(support, v_proof_view, inference_mt))), seen_supports);
		    final SubLObject label = (NIL != meta_supports) ? proof_view.$proof_view_inferred_label$.getDynamicValue(thread) : proof_view.$proof_view_opaque_label$.getDynamicValue(thread);
		    final SubLObject object_type = (NIL != assertion_handles.assertion_p(support)) ? ASSERTION_P : SUPPORT_P;
		    final SubLObject support_sentence = arguments.support_sentence(support);
		    final SubLObject parent_object = proof_view.proof_view_entry_get_object(parent_proof_view_entry);
		    final SubLObject parent_sentence = (NIL != cycl_grammar.cycl_sentence_p(parent_object)) ? proof_view_summary.proof_view_summary_item_sentence(parent_object) : NIL;
		    if (((((NIL != formula_arityE(support_sentence, TWO_INTEGER, UNPROVIDED)) && (NIL != formula_arityE(parent_sentence, TWO_INTEGER, UNPROVIDED))) && cycl_utilities.formula_arg0(support_sentence).equal(cycl_utilities.formula_arg0(parent_sentence)))
			    && cycl_utilities.formula_arg1(support_sentence, UNPROVIDED).equal(cycl_utilities.formula_arg2(parent_sentence, UNPROVIDED))) && cycl_utilities.formula_arg2(support_sentence, UNPROVIDED).equal(cycl_utilities.formula_arg1(parent_sentence, UNPROVIDED))) {
			if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
			    format_nil.force_format(T, $str184$__Skipping_over_trivial_symmetric, support_sentence, parent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			support_entry = parent_proof_view_entry;
		    } else {
			support_entry = proof_view_add_new_entry(v_proof_view, label, parent_proof_view_entry, object_type, support, list($FN, PROOF_VIEW_ADD_SUPPORT_TREE, $FN_SECTION, NORMAL_SUPPORT));
		    }
		    if (NIL != meta_supports) {
			SubLObject cdolist_list_var = meta_supports;
			SubLObject sub_support = NIL;
			sub_support = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
			    proof_view_add_support_tree(v_proof_view, sub_support, support_entry, inference_mt, number_utilities.f_1X(current_depth), seen_supports);
			    cdolist_list_var = cdolist_list_var.rest();
			    sub_support = cdolist_list_var.first();
			}
		    } else if (NIL != proof_view.proof_view_external_support_p(support)) {
			proof_view_add_external_source_entry(v_proof_view, support, support_entry);
		    } else if (NIL != abduction.abduction_support_p(support)) {
			proof_view_add_new_entry(v_proof_view, $str39$, support_entry, $ABDUCED_SUPPORT, support, list($FN, PROOF_VIEW_ADD_SUPPORT_TREE, $FN_SECTION, ABDUCED_SUPPORT));
			proof_view_entry_note_abduced_support(support_entry, support);
		    } else if (NIL == proof_view.proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) {
			if (NIL != assertion_handles.assertion_p(support)) {
			    proof_view_add_assert_info_entries(v_proof_view, support, support_entry, inference_mt);
			} else {
			    proof_view_add_new_entry(v_proof_view, $str39$, support_entry, $UNSUPPORTED_SUPPORT, support, list($FN, PROOF_VIEW_ADD_SUPPORT_TREE, $FN_SECTION, UNSUPPORTED_SUPPORT));
			}
		    }

		} else if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		    Errors.warn($str190$unknown_support_type_for__A, support);
		}

	    }

	    proof_view_maybe_add_used_support(v_proof_view, support, current_depth, circularP);
	    if ((NIL != subl_promotions.memberP(support, proof_view.proof_view_get_property(v_proof_view, $FACTS_USED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED)) && (NIL == proof_view.proof_view_entry_get_children(support_entry))) {
		if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		    Errors.warn($str191$Already_shown___S, support);
		}
		proof_view_remove_entry(v_proof_view, support_entry);
	    }
	    return support_entry;
	} finally {
	    $suspend_generality_sorting_of_proof_view_entriesP$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject pph_check_meta_supports_for_circularity(final SubLObject meta_supports, final SubLObject seen_supports) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject cdolist_list_var = meta_supports;
	SubLObject sub_support = NIL;
	sub_support = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != set.set_memberP(sub_support, seen_supports)) {
		if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		    Errors.warn($str192$Circularity_in_meta_supports__Alr, sub_support);
		}
		return NIL;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    sub_support = cdolist_list_var.first();
	}
	return meta_supports;
    }

    public static SubLObject proof_view_maybe_add_used_support(final SubLObject v_proof_view, final SubLObject support, final SubLObject current_depth, final SubLObject circularP) {
	if (NIL != proof_view_add_used_supportP(v_proof_view, support, current_depth, circularP)) {
	    if ((NIL != groundP(arguments.support_sentence(support), UNPROVIDED)) && (NIL != atomic_sentenceP(arguments.support_sentence(support)))) {
		proof_view_add_used_support(v_proof_view, support);
	    } else if ((NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) && (NIL != assertions_high.rule_assertionP(support))) {
		proof_view_add_used_support(v_proof_view, support);
	    }

	}
	return support;
    }

    public static SubLObject proof_view_add_used_supportP(final SubLObject v_proof_view, final SubLObject support, final SubLObject current_depth, final SubLObject circularP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((((NIL != pph_vars.$pph_proof_show_facts_usedP$.getDynamicValue(thread)) || (NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)))
		&& ((((NIL == proof_view_depth_exceeds_cutoffP(current_depth)) || ((NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) && (NIL != assertions_high.rule_assertionP(support))))
			|| ((NIL != assertion_handles.assertion_p(support)) && (NIL != sources.assertion_sourcedP(support)))) || (NIL != abduction.abduction_support_p(support))))
		&& (((NIL != abduction.abduction_support_p(support)) || ((NIL != arguments.support_p(support)) && (NIL != member(arguments.support_module(support), $list193, UNPROVIDED, UNPROVIDED))))
			|| ((NIL != assertion_handles.assertion_p(support)) && (((NIL != assertions_high.asserted_assertionP(support)) || (NIL != circularP)) || (NIL != derived_assertion_proof_view_worthyP(support, v_proof_view, current_depth, circularP))))));
    }

    public static SubLObject derived_assertion_proof_view_worthyP(final SubLObject assertion, final SubLObject v_proof_view, final SubLObject current_depth, final SubLObject circularP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = pph_vars.$pph_proof_show_facts_depth_cutoff$.currentBinding(thread);
	try {
	    pph_vars.$pph_proof_show_facts_depth_cutoff$.bind(TEN_INTEGER, thread);
	    if (NIL != proof_view_depth_exceeds_cutoffP(current_depth)) {
		if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
		    Errors.warn($str194$Not_proof_view_worthy___S, assertion);
		}
		return NIL;
	    }
	} finally {
	    pph_vars.$pph_proof_show_facts_depth_cutoff$.rebind(_prev_bind_0, thread);
	}
	final SubLObject meta_supports = pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_meta_supports(assertion));
	SubLObject display_worthy_meta_support = NIL;
	if (NIL == display_worthy_meta_support) {
	    SubLObject csome_list_var = meta_supports;
	    SubLObject meta_support = NIL;
	    meta_support = csome_list_var.first();
	    while ((NIL == display_worthy_meta_support) && (NIL != csome_list_var)) {
		if (NIL != proof_view_add_used_supportP(v_proof_view, meta_support, number_utilities.f_1X(current_depth), circularP)) {
		    display_worthy_meta_support = meta_support;
		}
		csome_list_var = csome_list_var.rest();
		meta_support = csome_list_var.first();
	    }
	}
	return sublisp_null(display_worthy_meta_support);
    }

    public static SubLObject proof_view_depth_exceeds_cutoffP(final SubLObject current_depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(pph_vars.$pph_proof_show_facts_depth_cutoff$.getDynamicValue(thread).isInteger() && current_depth.numG(pph_vars.$pph_proof_show_facts_depth_cutoff$.getDynamicValue(thread)));
    }

    public static SubLObject proof_view_entry_add_source(final SubLObject proof_view_entry, SubLObject source, final SubLObject strengthenedP) {
	assert NIL != cycl_grammar.cycl_term_p(source) : "cycl_grammar.cycl_term_p(source) " + "CommonSymbols.NIL != cycl_grammar.cycl_term_p(source) " + source;
	final SubLObject existing = proof_view.proof_view_entry_get_property(proof_view_entry, $SOURCES, UNPROVIDED);
	if (NIL == subl_promotions.memberP(source, existing, symbol_function(EQUAL), UNPROVIDED)) {
	    proof_view.proof_view_entry_set_property(proof_view_entry, $SOURCES, cons(source, existing));
	}
	return proof_view_entry;
    }

    public static SubLObject proof_view_entity_mentions_proofP(final SubLObject proof, final SubLObject mt) {
	return makeBoolean((NIL != entity_mentions_proof_possibleP()) && (NIL != list_utilities.non_empty_list_p(proof_view_entity_mentions_proof_hypotheses_and_terms(proof, mt))));
    }

    public static SubLObject entity_mentions_proof_possibleP_internal() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
	    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
	    return makeBoolean(kb_indexing.num_predicate_extent_index($$hypothesizedFormula, UNPROVIDED).isPositive() || kb_indexing.num_predicate_extent_index($$hypothesizedFormulaStrengthenedTo, UNPROVIDED).isPositive());
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject entity_mentions_proof_possibleP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return entity_mentions_proof_possibleP_internal();
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, $sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_, caching_state);
	}
	SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(entity_mentions_proof_possibleP_internal()));
	    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject proof_view_entity_mentions_proof_hypotheses_and_terms_internal(final SubLObject proof, final SubLObject mt) {
	final SubLObject proven_sentence = pph_proof.pph_proof_el_formula(proof, mt);
	final SubLObject terms = cycl_utilities.expression_gather(proven_sentence, $sym203$SKSI_SUPPORTED_EXTERNAL_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject hypotheses = (NIL != terms) ? proof_view_get_hypotheses_for_sentence(proven_sentence, mt) : NIL;
	return values(hypotheses, nreverse(terms));
    }

    public static SubLObject proof_view_entity_mentions_proof_hypotheses_and_terms(final SubLObject proof, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return proof_view_entity_mentions_proof_hypotheses_and_terms_internal(proof, mt);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (proof.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_entity_mentions_proof_hypotheses_and_terms_internal(proof, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, mt));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject proof_view_add_entity_mention_entries(final SubLObject v_proof_view, final SubLObject proof, final SubLObject parent_entry, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject hypotheses = proof_view_entity_mentions_proof_hypotheses_and_terms(proof, mt);
	final SubLObject terms = thread.secondMultipleValue();
	thread.resetMultipleValues();
	SubLObject addedP = NIL;
	SubLObject cdolist_list_var = hypotheses;
	SubLObject hypothesis = NIL;
	hypothesis = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$8 = proof_view_get_entity_mentions_for_hypothesis(hypothesis, mt);
	    SubLObject entity_mention = NIL;
	    entity_mention = cdolist_list_var_$8.first();
	    while (NIL != cdolist_list_var_$8) {
		final SubLObject v_document = proof_view.proof_view_get_document_for_hypothesis(hypothesis, mt);
		if (NIL != v_document) {
		    final SubLObject source_entity_mention_entry = proof_view_add_new_entry(v_proof_view, $str160$Source_Text_, parent_entry, $ENTITY_MENTION, list(v_document, entity_mention, terms, mt), list($FN, PROOF_VIEW_ADD_ENTITY_MENTION_ENTRIES, $FN_SECTION, SOURCE_TEXT));
		    final SubLObject ks = proof_view_knowledge_source_for_mt(mt);
		    addedP = T;
		    final SubLObject publisher = proof_view_get_publisher_for_document(v_document, mt);
		    final SubLObject title = proof_view_get_title_for_document(v_document, mt);
		    final SubLObject date = proof_view_get_date_for_document(v_document, mt);
		    final SubLObject author = proof_view_get_author_for_document(v_document, mt);
		    if (NIL != title) {
			proof_view_add_new_entry(v_proof_view, $str162$Title_, source_entity_mention_entry, EL_TERM_P, title, UNPROVIDED);
		    }
		    if (NIL != date) {
			proof_view_add_new_entry(v_proof_view, $str163$Date_, source_entity_mention_entry, EL_TERM_P, date, UNPROVIDED);
		    }
		    if (NIL != author) {
			proof_view_add_new_entry(v_proof_view, $str164$Author_, source_entity_mention_entry, EL_TERM_P, author, UNPROVIDED);
		    }
		    if (NIL != publisher) {
			proof_view_add_new_entry(v_proof_view, $str165$Publisher_, source_entity_mention_entry, EL_TERM_P, publisher, UNPROVIDED);
		    }
		    if (NIL != ks) {
			proof_view_note_source(v_proof_view, source_entity_mention_entry, ks, UNPROVIDED);
		    }
		}
		cdolist_list_var_$8 = cdolist_list_var_$8.rest();
		entity_mention = cdolist_list_var_$8.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    hypothesis = cdolist_list_var.first();
	}
	if (NIL == addedP) {
	    proof_view_add_new_entry(v_proof_view, $str166$Couldn_t_find_source_document_, parent_entry, $NO_SOURCE_DOCUMENT, NIL, UNPROVIDED);
	    proof_view_entry_note_expand_initially(parent_entry);
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_entry_note_abduced_support(final SubLObject proof_view_entry, final SubLObject support) {
	proof_view.proof_view_entry_set_property(proof_view_entry, $kw207$HAS_ABDUCED_SUPPORT_, support);
	final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(proof_view_entry);
	final SubLObject parent_id = proof_view.proof_view_entry_get_parent_id(proof_view_entry);
	final SubLObject parent = (parent_id.isInteger()) ? proof_view.find_proof_view_entry_by_id(v_proof_view, parent_id) : NIL;
	if (NIL != parent) {
	    proof_view_entry_note_abduced_support(parent, support);
	}
	return proof_view_entry;
    }

    public static SubLObject proof_view_get_hypotheses_for_sentence(final SubLObject sentence, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym208$_HYPOTHESIS, list($$hypothesizedFormula, $sym208$_HYPOTHESIS, sentence), mt, UNPROVIDED);
    }

    public static SubLObject proof_view_get_entity_mentions_for_hypothesis(final SubLObject hypothesis, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym209$_ENTITY_MENTION, list($$and, $list210, listS($$dependsOnEMHyp, hypothesis, $list212)), mt, $list213);
    }

    public static SubLObject proof_view_get_publisher_for_document(final SubLObject v_document, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym214$_PUBLISHER, list($$publisherOfWork, $sym214$_PUBLISHER, v_document), $list216, UNPROVIDED).first();
    }

    public static SubLObject proof_view_get_date_for_document(final SubLObject v_document, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym217$_DATE, listS($$dateOfPublication_CW, v_document, $list219), $list216, UNPROVIDED).first();
    }

    public static SubLObject proof_view_get_author_for_document(final SubLObject v_document, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym220$_AUTHOR, listS($$authorOfLiteraryWork_CW, v_document, $list222), $list216, UNPROVIDED).first();
    }

    public static SubLObject proof_view_get_title_for_document(final SubLObject v_document, final SubLObject mt) {
	return pph_utilities.pph_ask_variable_new($sym223$_TITLE, listS($$titleOfWork, v_document, $list225), $list216, UNPROVIDED).first();
    }

    public static SubLObject proof_view_entry_remove_label(final SubLObject proof_view_entry) {
	assert NIL != proof_view.proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
	return proof_view.proof_view_entry_set_label(proof_view_entry, $str39$);
    }

    public static SubLObject proof_view_entry_set_children(final SubLObject proof_view_entry, SubLObject children) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject list_var = children;
	assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
	SubLObject cdolist_list_var = list_var;
	SubLObject elem = NIL;
	elem = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    assert NIL != proof_view.proof_view_entry_p(elem) : "proof_view.proof_view_entry_p(elem) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(elem) " + elem;
	    cdolist_list_var = cdolist_list_var.rest();
	    elem = cdolist_list_var.first();
	}
	children = Sort.sort(children, $sym227$PROOF_VIEW_ENTRY_, UNPROVIDED);
	SubLObject pre_sorted = copy_list(children);
	if (NIL == $suspend_auto_sorting_of_proof_view_entriesP$.getDynamicValue(thread)) {
	    if (NIL == $suspend_generality_sorting_of_proof_view_entriesP$.getDynamicValue(thread)) {
		final SubLObject justification_root_entry = proof_view_get_justification_root_entry(proof_view.proof_view_entry_get_proof_view(proof_view_entry));
		if ((NIL != justification_root_entry) && (NIL != proof_view.proof_view_entry_has_ancestorP(proof_view_entry, justification_root_entry, UNPROVIDED))) {
		    children = Sort.stable_sort(children, $sym228$PROOF_VIEW_ENTRY_MORE_GENERAL_, UNPROVIDED);
		}
		if (!pre_sorted.equal(children)) {
		    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
			Errors.warn($str229$Sort_by_specificity_changed_order, pre_sorted, children);
		    }
		    pre_sorted = copy_list(children);
		}
	    }
	    children = link_proof_view_causal_chains(children);
	    if ((!pre_sorted.equal(children)) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
		Errors.warn($str230$Sort_by_causality_changed_order__, pre_sorted, children);
	    }
	}
	return proof_view_entry_set_children_low(proof_view_entry, children);
    }

    public static SubLObject proof_view_entry_set_children_low(final SubLObject proof_view_entry, final SubLObject children) {
	return proof_view.proof_view_entry_set_property(proof_view_entry, $CHILDREN, children);
    }

    public static SubLObject link_proof_view_causal_chains(final SubLObject entries) {
	SubLObject chains = NIL;
	SubLObject reordered = NIL;
	SubLObject cdolist_list_var = entries;
	SubLObject entry = NIL;
	entry = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    chains = add_proof_view_entry_to_causal_chains(entry, chains);
	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	cdolist_list_var = chains;
	SubLObject chain = NIL;
	chain = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != list_utilities.lengthG(chain, ONE_INTEGER, UNPROVIDED)) {
		SubLObject cdolist_list_var_$9 = chain;
		SubLObject entry2 = NIL;
		entry2 = cdolist_list_var_$9.first();
		while (NIL != cdolist_list_var_$9) {
		    final SubLObject item_var = entry2;
		    if (NIL == member(item_var, reordered, symbol_function(EQL), symbol_function(IDENTITY))) {
			reordered = cons(item_var, reordered);
		    }
		    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
		    entry2 = cdolist_list_var_$9.first();
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    chain = cdolist_list_var.first();
	}
	if (NIL != list_utilities.empty_list_p(reordered)) {
	    return entries;
	}
	cdolist_list_var = entries;
	entry = NIL;
	entry = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject item_var2 = entry;
	    if (NIL == member(item_var2, reordered, symbol_function(EQL), symbol_function(IDENTITY))) {
		reordered = cons(item_var2, reordered);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	return nreverse(reordered);
    }

    public static SubLObject add_proof_view_entry_to_causal_chains(final SubLObject entry, final SubLObject chains) {
	final SubLObject cause = proof_view_entry_get_cause(entry);
	final SubLObject effect = proof_view_entry_get_effect(entry);
	if ((NIL == cause) || (NIL == effect)) {
	    return chains;
	}
	SubLObject list_var = NIL;
	SubLObject chain = NIL;
	SubLObject i = NIL;
	list_var = chains;
	chain = list_var.first();
	for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), chain = list_var.first(), i = add(ONE_INTEGER, i)) {
	    if (effect.equal(proof_view_entry_get_cause(chain.first()))) {
		final SubLObject new_chain = cons(entry, chain);
		return list_utilities.replace_nth(i, new_chain, chains);
	    }
	    if (cause.equal(proof_view_entry_get_effect(list_utilities.last_one(chain)))) {
		final SubLObject new_chain = list_utilities.add_to_end(entry, chain);
		return list_utilities.replace_nth(i, new_chain, chains);
	    }
	}
	return cons(list(entry), chains);
    }

    public static SubLObject proof_view_entry_get_cause(final SubLObject entry) {
	final SubLObject cause = proof_view.proof_view_entry_get_property(entry, $CAUSE, misc_utilities.uninitialized());
	if (NIL != misc_utilities.initialized_p(cause)) {
	    return cause;
	}
	return initialize_proof_view_entry_cause(entry);
    }

    public static SubLObject initialize_proof_view_entry_cause(final SubLObject entry) {
	final SubLObject v_object = proof_view.proof_view_entry_get_object(entry);
	SubLObject cause = NIL;
	if ((NIL != arguments.support_p(v_object)) || (NIL != cycl_grammar.cycl_formulaic_sentence_p(v_object))) {
	    final SubLObject sentence = proof_view.proof_view_fact_sentence(v_object);
	    final SubLObject pred = cycl_utilities.formula_arg0(sentence);
	    final SubLObject cause_arg_num = cause_arg_num_of_pred(pred);
	    cause = (NIL != cause_arg_num) ? cycl_utilities.formula_arg(sentence, cause_arg_num, UNPROVIDED) : NIL;
	}
	proof_view.proof_view_entry_set_property(entry, $CAUSE, cause);
	return cause;
    }

    public static SubLObject cause_arg_num_of_pred_internal(final SubLObject pred) {
	return ask_utilities.query_variable($sym234$_ARG, listS($$causeArg, pred, $list236), $$InferencePSC, $list237).first();
    }

    public static SubLObject cause_arg_num_of_pred(final SubLObject pred) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return cause_arg_num_of_pred_internal(pred);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CAUSE_ARG_NUM_OF_PRED, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CAUSE_ARG_NUM_OF_PRED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, CAUSE_ARG_NUM_OF_PRED, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(cause_arg_num_of_pred_internal(pred)));
	    memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject proof_view_entry_get_effect(final SubLObject entry) {
	final SubLObject effect = proof_view.proof_view_entry_get_property(entry, $EFFECT, misc_utilities.uninitialized());
	if (NIL != misc_utilities.initialized_p(effect)) {
	    return effect;
	}
	return initialize_proof_view_entry_effect(entry);
    }

    public static SubLObject initialize_proof_view_entry_effect(final SubLObject entry) {
	final SubLObject v_object = proof_view.proof_view_entry_get_object(entry);
	SubLObject effect = NIL;
	if ((NIL != arguments.support_p(v_object)) || (NIL != cycl_grammar.cycl_formulaic_sentence_p(v_object))) {
	    final SubLObject sentence = proof_view.proof_view_fact_sentence(v_object);
	    final SubLObject pred = cycl_utilities.formula_arg0(sentence);
	    final SubLObject effect_arg_num = effect_arg_num_of_pred(pred);
	    effect = (NIL != effect_arg_num) ? cycl_utilities.formula_arg(sentence, effect_arg_num, UNPROVIDED) : NIL;
	}
	proof_view.proof_view_entry_set_property(entry, $EFFECT, effect);
	return effect;
    }

    public static SubLObject effect_arg_num_of_pred_internal(final SubLObject pred) {
	return ask_utilities.query_variable($sym234$_ARG, listS($$effectArg, pred, $list236), $$InferencePSC, $list237).first();
    }

    public static SubLObject effect_arg_num_of_pred(final SubLObject pred) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return effect_arg_num_of_pred_internal(pred);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, EFFECT_ARG_NUM_OF_PRED, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), EFFECT_ARG_NUM_OF_PRED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, EFFECT_ARG_NUM_OF_PRED, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(effect_arg_num_of_pred_internal(pred)));
	    memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject get_new_proof_view_entry_id(final SubLObject v_proof_view) {
	final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
	return id_index_reserve(v_id_index);
    }

    public static SubLObject proof_view_add_used_support(final SubLObject v_proof_view, final SubLObject used_support) {
	final SubLObject existing = proof_view.proof_view_get_property(v_proof_view, $USED_SUPPORTS, UNPROVIDED);
	if (NIL == subl_promotions.memberP(pph_proof.pph_support_el_sentence(used_support), existing, symbol_function(EQUAL), symbol_function(PPH_SUPPORT_EL_SENTENCE))) {
	    proof_view.proof_view_set_property(v_proof_view, $USED_SUPPORTS, list_utilities.add_to_end(used_support, existing));
	}
	return v_proof_view;
    }

    public static SubLObject proof_view_add_assert_info_entries(final SubLObject v_proof_view, final SubLObject assertion, final SubLObject assertion_entry, final SubLObject inference_mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject mt = pph_proof.pph_assert_info(assertion);
	SubLObject v_sources = thread.secondMultipleValue();
	final SubLObject strengthenedP = thread.thirdMultipleValue();
	thread.resetMultipleValues();
	SubLObject cdolist_list_var = sources.assertion_corroborating_sources(assertion, inference_mt);
	SubLObject corroborating_source = NIL;
	corroborating_source = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject item_var = corroborating_source;
	    if (NIL == member(item_var, v_sources, symbol_function(EQUAL), symbol_function(IDENTITY))) {
		v_sources = cons(item_var, v_sources);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    corroborating_source = cdolist_list_var.first();
	}
	final SubLObject givenP = proof_view.proof_view_assertion_givenP(v_proof_view, assertion);
	if (NIL != v_sources) {
	    SubLObject cdolist_list_var2 = v_sources;
	    SubLObject source = NIL;
	    source = cdolist_list_var2.first();
	    while (NIL != cdolist_list_var2) {
		proof_view_note_source(v_proof_view, assertion_entry, source, strengthenedP);
		cdolist_list_var2 = cdolist_list_var2.rest();
		source = cdolist_list_var2.first();
	    }
	} else if ((NIL != givenP) && (NIL == proof_view.proof_view_get_suppress_assertion_bookkeepingP(v_proof_view))) {
	    proof_view_add_new_entry(v_proof_view, $str243$Given_, assertion_entry, $GIVEN, mt, UNPROVIDED);
	}

	if (((NIL == givenP) && (NIL != assertions_high.asserted_assertionP(assertion))) && (NIL == proof_view.proof_view_get_suppress_assertion_bookkeepingP(v_proof_view))) {
	    proof_view_add_new_entry(v_proof_view, proof_view.$proof_view_assertion_bookkeeping_label$.getDynamicValue(thread), assertion_entry, $ASSERTION_BOOKKEEPING, assertion, UNPROVIDED);
	}
	if ((NIL != assertions_high.rule_assertionP(assertion)) && (NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(assertion, $$InferencePSC))) {
	    proof_view_add_new_entry(v_proof_view, $str246$Pragmatics_, assertion_entry, $PRAGMATICS, NIL, UNPROVIDED);
	}
	return v_proof_view;
    }

    public static SubLObject suppress_proof_view_section_with_rootP(final SubLObject entry) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject label = proof_view.proof_view_entry_get_label(entry);
	final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
	if (label.equal(proof_view.$proof_view_justification_label$.getDynamicValue(thread))) {
	    return makeBoolean(NIL == proof_view.proof_view_get_include_justification_sectionP(v_proof_view));
	}
	if (label.equal(proof_view.$proof_view_facts_used_label$.getDynamicValue(thread))) {
	    return makeBoolean(NIL == proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view));
	}
	if (label.equal(proof_view.$proof_view_linear_label$.getDynamicValue(thread))) {
	    return makeBoolean(NIL == proof_view_linear.proof_view_get_include_linear_sectionP(v_proof_view));
	}
	return NIL;
    }

    public static SubLObject proof_view_possibly_register_source(final SubLObject v_proof_view, SubLObject source, SubLObject strengthenedP) {
	if (strengthenedP == UNPROVIDED) {
	    strengthenedP = NIL;
	}
	if (NIL != proof_view.proof_view_valid_source_p(source)) {
	    SubLObject id = proof_view.proof_view_get_source_id(v_proof_view, source);
	    if (NIL == subl_promotions.positive_integer_p(id)) {
		SubLObject source_index = proof_view.proof_view_get_source_index(v_proof_view);
		SubLObject source_isg = proof_view.proof_view_get_source_isg(v_proof_view);
		if (NIL == dictionary.dictionary_p(source_index)) {
		    source_index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
		    source_isg = integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED);
		    proof_view_set_source_index(v_proof_view, source_index);
		    proof_view_set_source_isg(v_proof_view, source_isg);
		}
		id = integer_sequence_generator.integer_sequence_generator_next(source_isg);
		final SubLObject citation = pph_html.new_pph_source_citation(source, id, strengthenedP);
		dictionary.dictionary_enter(source_index, source, citation);
	    }
	}
	return source;
    }

    public static SubLObject proof_view_set_source_isg(final SubLObject v_proof_view, final SubLObject isg) {
	assert NIL != integer_sequence_generator.integer_sequence_generator_p(isg) : "integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) " + isg;
	return proof_view.proof_view_set_property(v_proof_view, $SOURCE_ISG, isg);
    }

    public static SubLObject proof_view_set_source_index(final SubLObject v_proof_view, final SubLObject source_index) {
	return proof_view.proof_view_set_property(v_proof_view, $SOURCE_INDEX, source_index);
    }

    public static SubLObject proof_view_add_circular_support_entry(final SubLObject v_proof_view, final SubLObject support, final SubLObject parent_entry, final SubLObject inference_mt) {
	return proof_view_add_new_entry(v_proof_view, $str39$, parent_entry, $CIRCULAR_SUPPORT, NIL, UNPROVIDED);
    }

    public static SubLObject add_trivial_proof_view_entry(final SubLObject v_proof_view, final SubLObject proof, final SubLObject mt, final SubLObject parent_proof_view_entry) {
	final SubLObject parent_proof_view_entry_id = proof_view.proof_view_entry_get_id(parent_proof_view_entry);
	return proof_view_add_new_entry(v_proof_view, $str252$Trivially__, parent_proof_view_entry_id, EL_FORMULA_P, pph_proof.pph_proof_el_formula(proof, mt), list($PROOF, proof));
    }

    public static SubLObject declare_proof_view_populator_file() {
	declareFunction("proof_view_populator_print_function_trampoline", "PROOF-VIEW-POPULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("proof_view_populator_p", "PROOF-VIEW-POPULATOR-P", 1, 0, false);
	new proof_view_populator.$proof_view_populator_p$UnaryFunction();
	declareFunction("pvp_proof_view", "PVP-PROOF-VIEW", 1, 0, false);
	declareFunction("pvp_worker_semaphore", "PVP-WORKER-SEMAPHORE", 1, 0, false);
	declareFunction("pvp_master_semaphore", "PVP-MASTER-SEMAPHORE", 1, 0, false);
	declareFunction("pvp_process", "PVP-PROCESS", 1, 0, false);
	declareFunction("_csetf_pvp_proof_view", "_CSETF-PVP-PROOF-VIEW", 2, 0, false);
	declareFunction("_csetf_pvp_worker_semaphore", "_CSETF-PVP-WORKER-SEMAPHORE", 2, 0, false);
	declareFunction("_csetf_pvp_master_semaphore", "_CSETF-PVP-MASTER-SEMAPHORE", 2, 0, false);
	declareFunction("_csetf_pvp_process", "_CSETF-PVP-PROCESS", 2, 0, false);
	declareFunction("make_proof_view_populator", "MAKE-PROOF-VIEW-POPULATOR", 0, 1, false);
	declareFunction("visit_defstruct_proof_view_populator", "VISIT-DEFSTRUCT-PROOF-VIEW-POPULATOR", 2, 0, false);
	declareFunction("visit_defstruct_object_proof_view_populator_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-POPULATOR-METHOD", 2, 0, false);
	declareFunction("print_proof_view_populator", "PRINT-PROOF-VIEW-POPULATOR", 3, 0, false);
	declareFunction("new_proof_view_populator", "NEW-PROOF-VIEW-POPULATOR", 1, 0, false);
	declareFunction("proof_view_populator_proof_view", "PROOF-VIEW-POPULATOR-PROOF-VIEW", 1, 0, false);
	declareFunction("proof_view_populator_worker_semaphore", "PROOF-VIEW-POPULATOR-WORKER-SEMAPHORE", 1, 0, false);
	declareFunction("proof_view_populator_master_semaphore", "PROOF-VIEW-POPULATOR-MASTER-SEMAPHORE", 1, 0, false);
	declareFunction("proof_view_populator_process", "PROOF-VIEW-POPULATOR-PROCESS", 1, 0, false);
	declareFunction("sxhash_proof_view_populator_method", "SXHASH-PROOF-VIEW-POPULATOR-METHOD", 1, 0, false);
	declareFunction("sxhash_proof_view_populator", "SXHASH-PROOF-VIEW-POPULATOR", 1, 0, false);
	declareFunction("proof_view_populator_doneP", "PROOF-VIEW-POPULATOR-DONE?", 1, 0, false);
	declareFunction("proof_view_populator_do_one_step", "PROOF-VIEW-POPULATOR-DO-ONE-STEP", 1, 0, false);
	declareFunction("proof_view_populator_note_done", "PROOF-VIEW-POPULATOR-NOTE-DONE", 1, 0, false);
	declareFunction("proof_view_launch_stepwise_populator", "PROOF-VIEW-LAUNCH-STEPWISE-POPULATOR", 1, 2, false);
	declareFunction("proof_view_populate", "PROOF-VIEW-POPULATE", 1, 3, false);
	declareFunction("proof_view_note_no_justification", "PROOF-VIEW-NOTE-NO-JUSTIFICATION", 2, 0, false);
	declareFunction("proof_view_set_populated_universal_time", "PROOF-VIEW-SET-POPULATED-UNIVERSAL-TIME", 1, 1, false);
	declareFunction("proof_view_set_error_output", "PROOF-VIEW-SET-ERROR-OUTPUT", 2, 0, false);
	declareFunction("proof_view_maybe_add_source_citations", "PROOF-VIEW-MAYBE-ADD-SOURCE-CITATIONS", 1, 0, false);
	declareFunction("proof_view_maybe_flesh_out_rules_section", "PROOF-VIEW-MAYBE-FLESH-OUT-RULES-SECTION", 2, 0, false);
	declareMacro("define_proof_view_special_section_populator", "DEFINE-PROOF-VIEW-SPECIAL-SECTION-POPULATOR");
	declareFunction("proof_view_add_special_sections", "PROOF-VIEW-ADD-SPECIAL-SECTIONS", 1, 0, false);
	declareFunction("proof_view_note_special_section_root", "PROOF-VIEW-NOTE-SPECIAL-SECTION-ROOT", 3, 0, false);
	declareFunction("proof_view_get_special_section_roots", "PROOF-VIEW-GET-SPECIAL-SECTION-ROOTS", 1, 0, false);
	declareFunction("proof_view_get_special_section_root", "PROOF-VIEW-GET-SPECIAL-SECTION-ROOT", 2, 0, false);
	declareFunction("proof_view_special_sections_to_include", "PROOF-VIEW-SPECIAL-SECTIONS-TO-INCLUDE", 1, 0, false);
	declareFunction("proof_view_set_include_special_sectionP", "PROOF-VIEW-SET-INCLUDE-SPECIAL-SECTION?", 3, 0, false);
	declareFunction("proof_view_section_key_from_id", "PROOF-VIEW-SECTION-KEY-FROM-ID", 1, 0, false);
	declareFunction("note_proof_view_special_section_populator", "NOTE-PROOF-VIEW-SPECIAL-SECTION-POPULATOR", 4, 0, false);
	declareFunction("proof_view_maybe_add_justification_section", "PROOF-VIEW-MAYBE-ADD-JUSTIFICATION-SECTION", 3, 0, false);
	declareFunction("note_constructing_proof_view_for_conclusion", "NOTE-CONSTRUCTING-PROOF-VIEW-FOR-CONCLUSION", 1, 0, false);
	declareMacro("tracking_proof_view_literals_to_suppress", "TRACKING-PROOF-VIEW-LITERALS-TO-SUPPRESS");
	declareFunction("construct_inference_proof_view_int", "CONSTRUCT-INFERENCE-PROOF-VIEW-INT", 5, 2, false);
	declareFunction("construct_default_proof_view", "CONSTRUCT-DEFAULT-PROOF-VIEW", 6, 2, false);
	declareFunction("proof_view_trivial_proofP", "PROOF-VIEW-TRIVIAL-PROOF?", 2, 0, false);
	declareFunction("trivial_proof_conclusionP", "TRIVIAL-PROOF-CONCLUSION?", 2, 0, false);
	declareFunction("proof_binds_some_variable_to_valueP", "PROOF-BINDS-SOME-VARIABLE-TO-VALUE?", 2, 1, false);
	declareFunction("proof_conclusion_for_query_pragmaP", "PROOF-CONCLUSION-FOR-QUERY-PRAGMA?", 2, 0, false);
	declareFunction("proof_view_proof_literals_to_suppress", "PROOF-VIEW-PROOF-LITERALS-TO-SUPPRESS", 2, 0, false);
	declareFunction("proof_literals_to_suppress_internal", "PROOF-LITERALS-TO-SUPPRESS-INTERNAL", 1, 1, false);
	declareFunction("proof_literals_to_suppress", "PROOF-LITERALS-TO-SUPPRESS", 1, 1, false);
	declareFunction("proof_view_proof_already_handledP", "PROOF-VIEW-PROOF-ALREADY-HANDLED?", 2, 0, false);
	declareFunction("proof_view_note_already_handled", "PROOF-VIEW-NOTE-ALREADY-HANDLED", 2, 0, false);
	declareFunction("pph_relevance_safe_list_for_justification", "PPH-RELEVANCE-SAFE-LIST-FOR-JUSTIFICATION", 1, 0, false);
	declareFunction("inference_answer_binding_targets", "INFERENCE-ANSWER-BINDING-TARGETS", 1, 0, false);
	declareFunction("proof_view_add_inference_proof_used_rules_root", "PROOF-VIEW-ADD-INFERENCE-PROOF-USED-RULES-ROOT", 1, 0, false);
	declareFunction("proof_view_add_query_and_answer_section", "PROOF-VIEW-ADD-QUERY-AND-ANSWER-SECTION", 2, 0, false);
	declareFunction("construct_proof_view_answer_entry", "CONSTRUCT-PROOF-VIEW-ANSWER-ENTRY", 3, 0, false);
	declareFunction("new_proof_view_entry", "NEW-PROOF-VIEW-ENTRY", 2, 0, false);
	declareFunction("proof_view_add_new_entry", "PROOF-VIEW-ADD-NEW-ENTRY", 5, 1, false);
	declareFunction("maybe_pause_proof_view_population", "MAYBE-PAUSE-PROOF-VIEW-POPULATION", 0, 1, false);
	declareFunction("proof_view_entry_note_expand_initially", "PROOF-VIEW-ENTRY-NOTE-EXPAND-INITIALLY", 1, 0, false);
	declareFunction("proof_view_add_section_root", "PROOF-VIEW-ADD-SECTION-ROOT", 2, 0, false);
	declareFunction("proof_view_rem_property", "PROOF-VIEW-REM-PROPERTY", 2, 0, false);
	declareFunction("proof_view_remove_entry", "PROOF-VIEW-REMOVE-ENTRY", 2, 0, false);
	declareFunction("proof_view_add_rule_used", "PROOF-VIEW-ADD-RULE-USED", 4, 0, false);
	declareFunction("proof_view_get_justification_root_entry", "PROOF-VIEW-GET-JUSTIFICATION-ROOT-ENTRY", 1, 0, false);
	declareFunction("proof_view_get_linear_root_entry", "PROOF-VIEW-GET-LINEAR-ROOT-ENTRY", 1, 0, false);
	declareFunction("proof_view_sort_entries_to_maximize_coherence", "PROOF-VIEW-SORT-ENTRIES-TO-MAXIMIZE-COHERENCE", 3, 0, false);
	declareFunction("proof_view_entry_get_proof_suid", "PROOF-VIEW-ENTRY-GET-PROOF-SUID", 1, 0, false);
	declareFunction("proof_view_entry_get_score", "PROOF-VIEW-ENTRY-GET-SCORE", 1, 0, false);
	declareFunction("proof_view_add_fact_used", "PROOF-VIEW-ADD-FACT-USED", 4, 0, false);
	declareFunction("proof_view_note_source", "PROOF-VIEW-NOTE-SOURCE", 3, 1, false);
	declareFunction("proof_view_add_external_source_entry", "PROOF-VIEW-ADD-EXTERNAL-SOURCE-ENTRY", 3, 0, false);
	declareFunction("proof_view_knowledge_source_for_hl_support", "PROOF-VIEW-KNOWLEDGE-SOURCE-FOR-HL-SUPPORT", 1, 0, false);
	declareFunction("proof_view_knowledge_source_for_mt", "PROOF-VIEW-KNOWLEDGE-SOURCE-FOR-MT", 1, 0, false);
	declareFunction("proof_view_maybe_add_document_display_entry", "PROOF-VIEW-MAYBE-ADD-DOCUMENT-DISPLAY-ENTRY", 4, 0, false);
	declareFunction("proof_view_situation_constituents_proof_p", "PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-P", 1, 0, false);
	declareFunction("proof_view_situation_constituents_proof_hypothesis_and_terms_internal", "PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-HYPOTHESIS-AND-TERMS-INTERNAL", 1, 0, false);
	declareFunction("proof_view_situation_constituents_proof_hypothesis_and_terms", "PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-HYPOTHESIS-AND-TERMS", 1, 0, false);
	declareFunction("proof_view_add_entries_for_situation_constituents_proof", "PROOF-VIEW-ADD-ENTRIES-FOR-SITUATION-CONSTITUENTS-PROOF", 4, 0, false);
	declareFunction("proof_view_add_external_sentence_entries", "PROOF-VIEW-ADD-EXTERNAL-SENTENCE-ENTRIES", 5, 0, false);
	declareFunction("proof_view_add_root_entry", "PROOF-VIEW-ADD-ROOT-ENTRY", 1, 0, false);
	declareFunction("proof_view_get_sentences_for_hypothesis", "PROOF-VIEW-GET-SENTENCES-FOR-HYPOTHESIS", 2, 0, false);
	declareFunction("proof_view_add_support_tree", "PROOF-VIEW-ADD-SUPPORT-TREE", 4, 2, false);
	declareFunction("pph_check_meta_supports_for_circularity", "PPH-CHECK-META-SUPPORTS-FOR-CIRCULARITY", 2, 0, false);
	declareFunction("proof_view_maybe_add_used_support", "PROOF-VIEW-MAYBE-ADD-USED-SUPPORT", 4, 0, false);
	declareFunction("proof_view_add_used_supportP", "PROOF-VIEW-ADD-USED-SUPPORT?", 4, 0, false);
	declareFunction("derived_assertion_proof_view_worthyP", "DERIVED-ASSERTION-PROOF-VIEW-WORTHY?", 4, 0, false);
	declareFunction("proof_view_depth_exceeds_cutoffP", "PROOF-VIEW-DEPTH-EXCEEDS-CUTOFF?", 1, 0, false);
	declareFunction("proof_view_entry_add_source", "PROOF-VIEW-ENTRY-ADD-SOURCE", 3, 0, false);
	declareFunction("proof_view_entity_mentions_proofP", "PROOF-VIEW-ENTITY-MENTIONS-PROOF?", 2, 0, false);
	declareFunction("entity_mentions_proof_possibleP_internal", "ENTITY-MENTIONS-PROOF-POSSIBLE?-INTERNAL", 0, 0, false);
	declareFunction("entity_mentions_proof_possibleP", "ENTITY-MENTIONS-PROOF-POSSIBLE?", 0, 0, false);
	declareFunction("proof_view_entity_mentions_proof_hypotheses_and_terms_internal", "PROOF-VIEW-ENTITY-MENTIONS-PROOF-HYPOTHESES-AND-TERMS-INTERNAL", 2, 0, false);
	declareFunction("proof_view_entity_mentions_proof_hypotheses_and_terms", "PROOF-VIEW-ENTITY-MENTIONS-PROOF-HYPOTHESES-AND-TERMS", 2, 0, false);
	declareFunction("proof_view_add_entity_mention_entries", "PROOF-VIEW-ADD-ENTITY-MENTION-ENTRIES", 4, 0, false);
	declareFunction("proof_view_entry_note_abduced_support", "PROOF-VIEW-ENTRY-NOTE-ABDUCED-SUPPORT", 2, 0, false);
	declareFunction("proof_view_get_hypotheses_for_sentence", "PROOF-VIEW-GET-HYPOTHESES-FOR-SENTENCE", 2, 0, false);
	declareFunction("proof_view_get_entity_mentions_for_hypothesis", "PROOF-VIEW-GET-ENTITY-MENTIONS-FOR-HYPOTHESIS", 2, 0, false);
	declareFunction("proof_view_get_publisher_for_document", "PROOF-VIEW-GET-PUBLISHER-FOR-DOCUMENT", 2, 0, false);
	declareFunction("proof_view_get_date_for_document", "PROOF-VIEW-GET-DATE-FOR-DOCUMENT", 2, 0, false);
	declareFunction("proof_view_get_author_for_document", "PROOF-VIEW-GET-AUTHOR-FOR-DOCUMENT", 2, 0, false);
	declareFunction("proof_view_get_title_for_document", "PROOF-VIEW-GET-TITLE-FOR-DOCUMENT", 2, 0, false);
	declareFunction("proof_view_entry_remove_label", "PROOF-VIEW-ENTRY-REMOVE-LABEL", 1, 0, false);
	declareFunction("proof_view_entry_set_children", "PROOF-VIEW-ENTRY-SET-CHILDREN", 2, 0, false);
	declareFunction("proof_view_entry_set_children_low", "PROOF-VIEW-ENTRY-SET-CHILDREN-LOW", 2, 0, false);
	declareFunction("link_proof_view_causal_chains", "LINK-PROOF-VIEW-CAUSAL-CHAINS", 1, 0, false);
	declareFunction("add_proof_view_entry_to_causal_chains", "ADD-PROOF-VIEW-ENTRY-TO-CAUSAL-CHAINS", 2, 0, false);
	declareFunction("proof_view_entry_get_cause", "PROOF-VIEW-ENTRY-GET-CAUSE", 1, 0, false);
	declareFunction("initialize_proof_view_entry_cause", "INITIALIZE-PROOF-VIEW-ENTRY-CAUSE", 1, 0, false);
	declareFunction("cause_arg_num_of_pred_internal", "CAUSE-ARG-NUM-OF-PRED-INTERNAL", 1, 0, false);
	declareFunction("cause_arg_num_of_pred", "CAUSE-ARG-NUM-OF-PRED", 1, 0, false);
	declareFunction("proof_view_entry_get_effect", "PROOF-VIEW-ENTRY-GET-EFFECT", 1, 0, false);
	declareFunction("initialize_proof_view_entry_effect", "INITIALIZE-PROOF-VIEW-ENTRY-EFFECT", 1, 0, false);
	declareFunction("effect_arg_num_of_pred_internal", "EFFECT-ARG-NUM-OF-PRED-INTERNAL", 1, 0, false);
	declareFunction("effect_arg_num_of_pred", "EFFECT-ARG-NUM-OF-PRED", 1, 0, false);
	declareFunction("get_new_proof_view_entry_id", "GET-NEW-PROOF-VIEW-ENTRY-ID", 1, 0, false);
	declareFunction("proof_view_add_used_support", "PROOF-VIEW-ADD-USED-SUPPORT", 2, 0, false);
	declareFunction("proof_view_add_assert_info_entries", "PROOF-VIEW-ADD-ASSERT-INFO-ENTRIES", 4, 0, false);
	declareFunction("suppress_proof_view_section_with_rootP", "SUPPRESS-PROOF-VIEW-SECTION-WITH-ROOT?", 1, 0, false);
	declareFunction("proof_view_possibly_register_source", "PROOF-VIEW-POSSIBLY-REGISTER-SOURCE", 2, 1, false);
	declareFunction("proof_view_set_source_isg", "PROOF-VIEW-SET-SOURCE-ISG", 2, 0, false);
	declareFunction("proof_view_set_source_index", "PROOF-VIEW-SET-SOURCE-INDEX", 2, 0, false);
	declareFunction("proof_view_add_circular_support_entry", "PROOF-VIEW-ADD-CIRCULAR-SUPPORT-ENTRY", 4, 0, false);
	declareFunction("add_trivial_proof_view_entry", "ADD-TRIVIAL-PROOF-VIEW-ENTRY", 4, 0, false);
	return NIL;
    }

    public static SubLObject init_proof_view_populator_file() {
	defconstant("*DTP-PROOF-VIEW-POPULATOR*", PROOF_VIEW_POPULATOR);
	defparameter("*PROOF-VIEW-ALLOW-UNLIMITED-DUPLICATION?*", NIL);
	defparameter("*PROOF-VIEW-DUPLICATE-ENTRY-MAX*", FIVE_INTEGER);
	defparameter("*SUSPEND-GENERALITY-SORTING-OF-PROOF-VIEW-ENTRIES?*", NIL);
	defparameter("*SUSPEND-AUTO-SORTING-OF-PROOF-VIEW-ENTRIES?*", NIL);
	defparameter("*PROOF-VIEW-POPULATOR*", misc_utilities.uninitialized());
	deflexical("*PROOF-VIEW-SPECIAL-SECTIONS*", SubLTrampolineFile.maybeDefault($proof_view_special_sections$, $proof_view_special_sections$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
	deflexical("*PROOF-VIEW-SPECIAL-SECTION-TERMS*", SubLTrampolineFile.maybeDefault($proof_view_special_section_terms$, $proof_view_special_section_terms$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
	deflexical("*PROOF-CONCLUSION-PROOF-VIEW-COUNTS*", SubLTrampolineFile.maybeDefault($proof_conclusion_proof_view_counts$, $proof_conclusion_proof_view_counts$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
	defparameter("*PROOF-VIEW-TRACK-FNS?*", T);
	defparameter("*PROOF-SCORES*", misc_utilities.uninitialized());
	return NIL;
    }

    public static SubLObject setup_proof_view_populator_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_proof_view_populator$.getGlobalValue(), symbol_function(PROOF_VIEW_POPULATOR_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list8);
	def_csetf(PVP_PROOF_VIEW, _CSETF_PVP_PROOF_VIEW);
	def_csetf(PVP_WORKER_SEMAPHORE, _CSETF_PVP_WORKER_SEMAPHORE);
	def_csetf(PVP_MASTER_SEMAPHORE, _CSETF_PVP_MASTER_SEMAPHORE);
	def_csetf(PVP_PROCESS, _CSETF_PVP_PROCESS);
	identity(PROOF_VIEW_POPULATOR);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof_view_populator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_POPULATOR_METHOD));
	note_funcall_helper_function(PRINT_PROOF_VIEW_POPULATOR);
	register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_proof_view_populator$.getGlobalValue(), symbol_function(SXHASH_PROOF_VIEW_POPULATOR_METHOD));
	declare_defglobal($proof_view_special_sections$);
	declare_defglobal($proof_view_special_section_terms$);
	declare_defglobal($proof_conclusion_proof_view_counts$);
	memoization_state.note_memoized_function(PROOF_LITERALS_TO_SUPPRESS);
	memoization_state.note_memoized_function(PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS);
	memoization_state.note_memoized_function($sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_);
	memoization_state.note_memoized_function(PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS);
	memoization_state.note_memoized_function(CAUSE_ARG_NUM_OF_PRED);
	memoization_state.note_memoized_function(EFFECT_ARG_NUM_OF_PRED);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_proof_view_populator_file();
    }

    @Override
    public void initializeVariables() {
	init_proof_view_populator_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_proof_view_populator_file();
    }

    static {

    }

    public static final class $proof_view_populator_native extends SubLStructNative {
	public SubLObject $proof_view;

	public SubLObject $worker_semaphore;

	public SubLObject $master_semaphore;

	public SubLObject $process;

	private static final SubLStructDeclNative structDecl;

	private $proof_view_populator_native() {
	    this.$proof_view = Lisp.NIL;
	    this.$worker_semaphore = Lisp.NIL;
	    this.$master_semaphore = Lisp.NIL;
	    this.$process = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$proof_view;
	}

	@Override
	public SubLObject getField3() {
	    return this.$worker_semaphore;
	}

	@Override
	public SubLObject getField4() {
	    return this.$master_semaphore;
	}

	@Override
	public SubLObject getField5() {
	    return this.$process;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$proof_view = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$worker_semaphore = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$master_semaphore = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$process = value;
	}

	static {
	    structDecl = makeStructDeclNative($proof_view_populator_native.class, PROOF_VIEW_POPULATOR, PROOF_VIEW_POPULATOR_P, $list2, $list3, new String[] { "$proof_view", "$worker_semaphore", "$master_semaphore", "$process" }, $list4, $list5, PRINT_PROOF_VIEW_POPULATOR);
	}
    }

    public static final class $proof_view_populator_p$UnaryFunction extends UnaryFunction {
	public $proof_view_populator_p$UnaryFunction() {
	    super(extractFunctionNamed("PROOF-VIEW-POPULATOR-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return proof_view_populator_p(arg1);
	}
    }
}

/**
 * Total time: 773 ms synthetic
 */
