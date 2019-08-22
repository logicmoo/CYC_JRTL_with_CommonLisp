package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$highlight_demerits_in_generated_phrasesP$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view extends SubLTranslatedFile {
	public static final SubLFile me = new proof_view();

	public static final String myName = "com.cyc.cycjava.cycl.proof_view";

	public static final String myFingerPrint = "a70566ea8bbc397328d42a8a076e035c513a291eea3e0f20c6efa7a8333b29b1";

	// defparameter
	// Definitions
	// STRINGP; label to use for asserted supports
	public static final SubLSymbol $proof_view_asserted_label$ = makeSymbol("*PROOF-VIEW-ASSERTED-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_inferred_label$ = makeSymbol("*PROOF-VIEW-INFERRED-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_opaque_label$ = makeSymbol("*PROOF-VIEW-OPAQUE-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_assertion_bookkeeping_label$ = makeSymbol("*PROOF-VIEW-ASSERTION-BOOKKEEPING-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_sources_label$ = makeSymbol("*PROOF-VIEW-SOURCES-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_source_as_mt_label$ = makeSymbol("*PROOF-VIEW-SOURCE-AS-MT-LABEL*");

	// defparameter
	/**
	 * STRINGP; label to use for the section of the proof view that contains the
	 * actual justification
	 */
	public static final SubLSymbol $proof_view_justification_label$ = makeSymbol("*PROOF-VIEW-JUSTIFICATION-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_linear_label$ = makeSymbol("*PROOF-VIEW-LINEAR-LABEL*");

	// defparameter
	/**
	 * STRINGP; label to use for the section of the proof view that contains the
	 * facts used
	 */
	public static final SubLSymbol $proof_view_facts_used_label$ = makeSymbol("*PROOF-VIEW-FACTS-USED-LABEL*");

	// defparameter
	public static final SubLSymbol $proof_view_tab_entry_labels$ = makeSymbol("*PROOF-VIEW-TAB-ENTRY-LABELS*");

	// defparameter
	public static final SubLSymbol $proof_view_rules_used_label$ = makeSymbol("*PROOF-VIEW-RULES-USED-LABEL*");

	// deflexical
	// STRINGP; label to use to indicate that we've hit a circularity in a proof
	public static final SubLSymbol $proof_view_circular_support_label$ = makeSymbol("*PROOF-VIEW-CIRCULAR-SUPPORT-LABEL*");

	// defparameter
	private static final SubLSymbol $proof_view_validate_supportsP$ = makeSymbol("*PROOF-VIEW-VALIDATE-SUPPORTS?*");

	// deflexical
	private static final SubLSymbol $proof_view_font_colors$ = makeSymbol("*PROOF-VIEW-FONT-COLORS*");

	// deflexical
	private static final SubLSymbol $proof_view_abduction_support_color$ = makeSymbol("*PROOF-VIEW-ABDUCTION-SUPPORT-COLOR*");

	// deflexical
	private static final SubLSymbol $proof_view_abduction_support_confirmed_color$ = makeSymbol("*PROOF-VIEW-ABDUCTION-SUPPORT-CONFIRMED-COLOR*");

	// deflexical
	private static final SubLSymbol $proof_view_abduction_support_denied_color$ = makeSymbol("*PROOF-VIEW-ABDUCTION-SUPPORT-DENIED-COLOR*");

	// defparameter
	// How many characters do we display before and after the source 'sentence'.
	private static final SubLSymbol $proof_view_external_sentence_padding$ = makeSymbol("*PROOF-VIEW-EXTERNAL-SENTENCE-PADDING*");

	// defparameter
	// How many characters do we display before and after the source 'mention'.
	private static final SubLSymbol $proof_view_entity_mention_padding$ = makeSymbol("*PROOF-VIEW-ENTITY-MENTION-PADDING*");

	// defconstant
	public static final SubLSymbol $dtp_proof_view$ = makeSymbol("*DTP-PROOF-VIEW*");

	// defconstant
	// The ID of the root entry of any proof view
	public static final SubLSymbol $proof_view_root_entry_id$ = makeSymbol("*PROOF-VIEW-ROOT-ENTRY-ID*");

	// defparameter
	public static final SubLSymbol $break_on_proof_view_filteringP$ = makeSymbol("*BREAK-ON-PROOF-VIEW-FILTERING?*");

	// defconstant
	public static final SubLSymbol $dtp_proof_view_entry$ = makeSymbol("*DTP-PROOF-VIEW-ENTRY*");

	// defvar
	public static final SubLSymbol $proof_view_debugP$ = makeSymbol("*PROOF-VIEW-DEBUG?*");

	// deflexical
	private static final SubLSymbol $proof_view_entry_showers$ = makeSymbol("*PROOF-VIEW-ENTRY-SHOWERS*");

	// deflexical
	private static final SubLSymbol $proof_view_object_type_output_fns$ = makeSymbol("*PROOF-VIEW-OBJECT-TYPE-OUTPUT-FNS*");

	// defparameter
	/**
	 * the list of changed proof view entry ids as a result of the user confirming
	 * or denying an abduced support.
	 */
	public static final SubLSymbol $changed_proof_view_entry_ids$ = makeSymbol("*CHANGED-PROOF-VIEW-ENTRY-IDS*");

	// defparameter
	private static final SubLSymbol $use_get_employer_cacheP$ = makeSymbol("*USE-GET-EMPLOYER-CACHE?*");

	// defparameter
	private static final SubLSymbol $proof_view_allow_trivial_partial_proof_conclusion_supportsP$ = makeSymbol("*PROOF-VIEW-ALLOW-TRIVIAL-PARTIAL-PROOF-CONCLUSION-SUPPORTS?*");

	// defparameter
	public static final SubLSymbol $proof_view_literals_to_suppress$ = makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*");

	// Internal Constants
	public static final SubLString $str0$ = makeString("");

	public static final SubLString $str1$External_Sources_ = makeString("External Sources:");

	public static final SubLString $str2$Source_ = makeString("Source:");

	public static final SubLString $str3$Detailed_Justification_ = makeString("Detailed Justification:");

	private static final SubLString $str4$Linear_Justification_ = makeString("Linear Justification:");

	private static final SubLString $str5$Because_ = makeString("Because:");

	private static final SubLString $str6$Key_Rules_ = makeString("Key Rules:");

	private static final SubLString $str7$Justified_above_ = makeString("Justified above.");

	private static final SubLInteger $int$200 = makeInteger(200);

	private static final SubLInteger $int$150 = makeInteger(150);

	private static final SubLSymbol $pph_language_mt$ = makeSymbol("*PPH-LANGUAGE-MT*");

	public static final SubLSymbol $proof_view_citation_format$ = makeSymbol("*PROOF-VIEW-CITATION-FORMAT*");

	private static final SubLSymbol PROOF_VIEW = makeSymbol("PROOF-VIEW");

	private static final SubLSymbol PROOF_VIEW_P = makeSymbol("PROOF-VIEW-P");

	private static final SubLList $list17 = list(makeSymbol("ID"), makeSymbol("PROOF"), makeSymbol("ANSWER"), makeSymbol("ID-INDEX"), makeSymbol("PROPERTIES"));

	private static final SubLList $list18 = list(makeKeyword("ID"), makeKeyword("PROOF"), makeKeyword("ANSWER"), makeKeyword("ID-INDEX"), makeKeyword("PROPERTIES"));

	private static final SubLList $list19 = list(makeSymbol("PROOF-VIEW-INT-ID"), makeSymbol("PROOF-VIEW-INT-PROOF"), makeSymbol("PROOF-VIEW-INT-ANSWER"), makeSymbol("PROOF-VIEW-INT-ID-INDEX"), makeSymbol("PROOF-VIEW-INT-PROPERTIES"));

	private static final SubLList $list20 = list(makeSymbol("_CSETF-PROOF-VIEW-INT-ID"), makeSymbol("_CSETF-PROOF-VIEW-INT-PROOF"), makeSymbol("_CSETF-PROOF-VIEW-INT-ANSWER"), makeSymbol("_CSETF-PROOF-VIEW-INT-ID-INDEX"), makeSymbol("_CSETF-PROOF-VIEW-INT-PROPERTIES"));

	private static final SubLSymbol PROOF_VIEW_INT_PRINT = makeSymbol("PROOF-VIEW-INT-PRINT");

	private static final SubLSymbol PROOF_VIEW_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROOF-VIEW-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list23 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROOF-VIEW-P"));

	private static final SubLSymbol PROOF_VIEW_INT_ID = makeSymbol("PROOF-VIEW-INT-ID");

	private static final SubLSymbol _CSETF_PROOF_VIEW_INT_ID = makeSymbol("_CSETF-PROOF-VIEW-INT-ID");

	private static final SubLSymbol PROOF_VIEW_INT_PROOF = makeSymbol("PROOF-VIEW-INT-PROOF");

	private static final SubLSymbol _CSETF_PROOF_VIEW_INT_PROOF = makeSymbol("_CSETF-PROOF-VIEW-INT-PROOF");

	private static final SubLSymbol PROOF_VIEW_INT_ANSWER = makeSymbol("PROOF-VIEW-INT-ANSWER");

	private static final SubLSymbol _CSETF_PROOF_VIEW_INT_ANSWER = makeSymbol("_CSETF-PROOF-VIEW-INT-ANSWER");

	private static final SubLSymbol PROOF_VIEW_INT_ID_INDEX = makeSymbol("PROOF-VIEW-INT-ID-INDEX");

	private static final SubLSymbol _CSETF_PROOF_VIEW_INT_ID_INDEX = makeSymbol("_CSETF-PROOF-VIEW-INT-ID-INDEX");

	private static final SubLSymbol PROOF_VIEW_INT_PROPERTIES = makeSymbol("PROOF-VIEW-INT-PROPERTIES");

	private static final SubLSymbol _CSETF_PROOF_VIEW_INT_PROPERTIES = makeSymbol("_CSETF-PROOF-VIEW-INT-PROPERTIES");

	private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_PROOF_VIEW = makeSymbol("MAKE-PROOF-VIEW");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-METHOD");

	private static final SubLString $str43$__PROOF_VIEW_ = makeString("#<PROOF-VIEW ");

	private static final SubLString $str44$_proof_ = makeString(" proof=");

	private static final SubLString $str45$_ = makeString(">");

	private static final SubLSymbol $proof_view_id_index$ = makeSymbol("*PROOF-VIEW-ID-INDEX*");

	private static final SubLList $list48 = list(list(makeSymbol("ENTRY"), makeSymbol("PROOF-VIEW"), makeSymbol("&KEY"), list(makeSymbol("ENTRY-ID"), list(makeSymbol("QUOTE"), makeSymbol("ENTRY-ID"))), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list49 = list(makeKeyword("ENTRY-ID"), makeKeyword("DONE"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLSymbol ENTRY_ID = makeSymbol("ENTRY-ID");

	private static final SubLSymbol PROOF_VIEW_GET_ID_INDEX = makeSymbol("PROOF-VIEW-GET-ID-INDEX");

	private static final SubLList $list57 = list(list(makeSymbol("DTR-ENTRY"), makeSymbol("ENTRY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list58 = list(makeKeyword("DONE"));

	private static final SubLSymbol PROOF_VIEW_ENTRY_GET_CHILDREN = makeSymbol("PROOF-VIEW-ENTRY-GET-CHILDREN");

	private static final SubLList $list61 = list(list(makeSymbol("PROOF-VIEW"), makeSymbol("&KEY"), list(makeSymbol("ID"), list(makeSymbol("QUOTE"), makeSymbol("ID"))), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list62 = list(makeKeyword("ID"), makeKeyword("DONE"));

	private static final SubLList $list64 = list(makeSymbol("PROOF-VIEW-ID-INDEX"));

	private static final SubLList $list68 = list(list(makeSymbol("PROOF-VIEW")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym69$STATE = makeUninternedSymbol("STATE");

	private static final SubLSymbol FIND_PROOF_VIEW_MEMOIZATION_STATE = makeSymbol("FIND-PROOF-VIEW-MEMOIZATION-STATE");

	private static final SubLSymbol MAYBE_WITH_PROOF_VIEW_MEMOIZATION = makeSymbol("MAYBE-WITH-PROOF-VIEW-MEMOIZATION");

	private static final SubLSymbol CLEAR_PROOF_VIEW_MEMOIZATION_STATE_BY_ID = makeSymbol("CLEAR-PROOF-VIEW-MEMOIZATION-STATE-BY-ID");

	private static final SubLSymbol $sym76$SET_PROOF_VIEW_ALLOW_EXTERNAL_LINKS_ = makeSymbol("SET-PROOF-VIEW-ALLOW-EXTERNAL-LINKS?");

	private static final SubLSymbol SET_PROOF_VIEW_LANGUAGE_MT = makeSymbol("SET-PROOF-VIEW-LANGUAGE-MT");

	private static final SubLSymbol SET_PROOF_VIEW_DOMAIN_MT = makeSymbol("SET-PROOF-VIEW-DOMAIN-MT");

	private static final SubLSymbol GET_PROOF_VIEW_DOMAIN_MT = makeSymbol("GET-PROOF-VIEW-DOMAIN-MT");

	private static final SubLSymbol GET_PROOF_VIEW_LANGUAGE_MT = makeSymbol("GET-PROOF-VIEW-LANGUAGE-MT");

	private static final SubLSymbol GET_PROOF_VIEW_INCLUDE_LINEAR = makeSymbol("GET-PROOF-VIEW-INCLUDE-LINEAR");

	private static final SubLSymbol SET_PROOF_VIEW_INCLUDE_LINEAR = makeSymbol("SET-PROOF-VIEW-INCLUDE-LINEAR");

	private static final SubLSymbol GET_PROOF_VIEW_INCLUDE_DETAILS = makeSymbol("GET-PROOF-VIEW-INCLUDE-DETAILS");

	private static final SubLSymbol SET_PROOF_VIEW_INCLUDE_DETAILS = makeSymbol("SET-PROOF-VIEW-INCLUDE-DETAILS");

	private static final SubLSymbol GET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING = makeSymbol("GET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING");

	private static final SubLSymbol SET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING = makeSymbol("SET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING");

	private static final SubLSymbol GET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS = makeSymbol("GET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS");

	private static final SubLSymbol SET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS = makeSymbol("SET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS");

	private static final SubLSymbol SET_PROOF_VIEW_ADDRESSEE = makeSymbol("SET-PROOF-VIEW-ADDRESSEE");

	private static final SubLSymbol SET_PROOF_VIEW_INCLUDE_CYCML = makeSymbol("SET-PROOF-VIEW-INCLUDE-CYCML");

	private static final SubLSymbol $sym91$PROOF_VIEW_ENTRY_ = makeSymbol("PROOF-VIEW-ENTRY<");

	private static final SubLString $str98$filtering__S____reason___S_ = makeString("filtering ~S~% (reason: ~S)");

	private static final SubLObject $$SpecificationVariantFn = reader_make_constant_shell(makeString("SpecificationVariantFn"));

	private static final SubLList $list101 = list(makeSymbol("NEW-SPECIFICATION"), makeSymbol("CYCL-PARAM"), makeSymbol("CYCL-VALUE"));

	private static final SubLList $list102 = cons(makeSymbol("CYCL-PARAM"), makeSymbol("CYCL-VALUE"));

	private static final SubLList $list103 = cons(makeSymbol("?PARAM"), makeSymbol("?VALUE"));

	private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

	private static final SubLList $list105 = list(reader_make_constant_shell(makeString("parameterOfProgram")), makeSymbol("?PARAM"), reader_make_constant_shell(makeString("CycProofViewGenerator")));

	private static final SubLSymbol $sym106$_PARAM = makeSymbol("?PARAM");

	private static final SubLList $list107 = list(makeSymbol("?VALUE"));

	private static final SubLObject $$CycArchitectureMt = reader_make_constant_shell(makeString("CycArchitectureMt"));

	private static final SubLSymbol $kw111$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

	private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");

	private static final SubLSymbol $kw114$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

	private static final SubLSymbol $kw115$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

	private static final SubLSymbol $kw116$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

	private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

	private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

	private static final SubLFloat $float$1_0 = makeDouble(1.0);

	private static final SubLObject $$suppressProofViewSection = reader_make_constant_shell(makeString("suppressProofViewSection"));

	private static final SubLObject $$CycProofViewSummarySection = reader_make_constant_shell(makeString("CycProofViewSummarySection"));

	private static final SubLObject $$CycProofViewJustificationSection = reader_make_constant_shell(makeString("CycProofViewJustificationSection"));

	private static final SubLObject $$CycProofViewLinearSection = reader_make_constant_shell(makeString("CycProofViewLinearSection"));

	private static final SubLObject $$includeProofViewSection = reader_make_constant_shell(makeString("includeProofViewSection"));

	private static final SubLObject $$showAssertionBookkeeping = reader_make_constant_shell(makeString("showAssertionBookkeeping"));

	private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

	private static final SubLObject $$showAssertionDates = reader_make_constant_shell(makeString("showAssertionDates"));

	private static final SubLObject $$showAssertionCyclists = reader_make_constant_shell(makeString("showAssertionCyclists"));

	private static final SubLObject $$showAssertionCyclistEmployers = reader_make_constant_shell(makeString("showAssertionCyclistEmployers"));

	private static final SubLString $str132$Don_t_know_how_to_set_proof_view_ = makeString("Don't know how to set proof-view parameter ~S to ~S");

	private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

	private static final SubLSymbol $kw136$INCLUDE_RULES_SECTION_ = makeKeyword("INCLUDE-RULES-SECTION?");

	private static final SubLSymbol $kw138$INCLUDE_JUSTIFICATION_SECTION_ = makeKeyword("INCLUDE-JUSTIFICATION-SECTION?");

	private static final SubLSymbol $kw139$ENABLE_DEBUG_ = makeKeyword("ENABLE-DEBUG?");

	private static final SubLSymbol $kw140$SHOW_CB_BUG_REPORT_LINKS_ = makeKeyword("SHOW-CB-BUG-REPORT-LINKS?");

	private static final SubLSymbol $kw141$INCLUDE_CYCL_IN_OUTPUT_ = makeKeyword("INCLUDE-CYCL-IN-OUTPUT?");

	private static final SubLSymbol $kw142$INCLUDE_SOURCES_ = makeKeyword("INCLUDE-SOURCES?");

	private static final SubLSymbol $kw143$LINK_PHRASES_ = makeKeyword("LINK-PHRASES?");

	private static final SubLSymbol PROOF_VIEW_INCLUDE_SOURCES_SPEC_P = makeSymbol("PROOF-VIEW-INCLUDE-SOURCES-SPEC-P");

	private static final SubLSymbol $kw146$INCLUDE_CYCML_IN_XML_ = makeKeyword("INCLUDE-CYCML-IN-XML?");

	private static final SubLString $str147$SILK_not_supported_in_non_Cyc_HAL = makeString("SILK not supported in non Cyc-HALO builds.");

	private static final SubLSymbol $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_ = makeKeyword("SUPPRESS-ASSERTION-BOOKKEEPING?");

	private static final SubLSymbol $kw149$SUPPRESS_ASSERTION_CYCLISTS_ = makeKeyword("SUPPRESS-ASSERTION-CYCLISTS?");

	private static final SubLSymbol $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_ = makeKeyword("SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?");

	private static final SubLSymbol $kw151$SUPPRESS_ASSERTION_DATES_ = makeKeyword("SUPPRESS-ASSERTION-DATES?");

	private static final SubLSymbol $kw152$ALLOW_EXTERNAL_LINKS_ = makeKeyword("ALLOW-EXTERNAL-LINKS?");

	private static final SubLSymbol $kw153$ALLOW_INTERNAL_LINKS_ = makeKeyword("ALLOW-INTERNAL-LINKS?");

	private static final SubLSymbol $sym155$HLMT_ = makeSymbol("HLMT?");

	private static final SubLSymbol $CREATION_UNIVERSAL_TIME = makeKeyword("CREATION-UNIVERSAL-TIME");

	private static final SubLSymbol $POPULATED_UNIVERSAL_TIME = makeKeyword("POPULATED-UNIVERSAL-TIME");

	private static final SubLSymbol $DISPLAYED_UNIVERSAL_TIME = makeKeyword("DISPLAYED-UNIVERSAL-TIME");

	private static final SubLSymbol PROOF_VIEW_ENTRY = makeSymbol("PROOF-VIEW-ENTRY");

	private static final SubLSymbol PROOF_VIEW_ENTRY_P = makeSymbol("PROOF-VIEW-ENTRY-P");

	private static final SubLList $list167 = list(makeSymbol("ID"), makeSymbol("PARENT-ID"), makeSymbol("LABEL"), makeSymbol("OBJECT-TYPE"), makeSymbol("OBJECT"), makeSymbol("PROOF-VIEW"), makeSymbol("PROPERTIES"));

	private static final SubLList $list168 = list(makeKeyword("ID"), makeKeyword("PARENT-ID"), makeKeyword("LABEL"), makeKeyword("OBJECT-TYPE"), makeKeyword("OBJECT"), makeKeyword("PROOF-VIEW"), makeKeyword("PROPERTIES"));

	private static final SubLList $list169 = list(makeSymbol("PROOF-VIEW-ENTRY-INT-ID"), makeSymbol("PROOF-VIEW-ENTRY-INT-PARENT-ID"), makeSymbol("PROOF-VIEW-ENTRY-INT-LABEL"), makeSymbol("PROOF-VIEW-ENTRY-INT-OBJECT-TYPE"), makeSymbol("PROOF-VIEW-ENTRY-INT-OBJECT"), makeSymbol("PROOF-VIEW-ENTRY-INT-PROOF-VIEW"), makeSymbol("PROOF-VIEW-ENTRY-INT-PROPERTIES"));

	private static final SubLList $list170 = list(makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-ID"), makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-PARENT-ID"), makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-LABEL"), makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT-TYPE"), makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT"), makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-PROOF-VIEW"), makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-PROPERTIES"));

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_PRINT = makeSymbol("PROOF-VIEW-ENTRY-INT-PRINT");

	private static final SubLSymbol PROOF_VIEW_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROOF-VIEW-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list173 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROOF-VIEW-ENTRY-P"));

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_ID = makeSymbol("PROOF-VIEW-ENTRY-INT-ID");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_ID = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-ID");

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_PARENT_ID = makeSymbol("PROOF-VIEW-ENTRY-INT-PARENT-ID");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_PARENT_ID = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-PARENT-ID");

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_LABEL = makeSymbol("PROOF-VIEW-ENTRY-INT-LABEL");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_LABEL = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-LABEL");

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_OBJECT_TYPE = makeSymbol("PROOF-VIEW-ENTRY-INT-OBJECT-TYPE");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_OBJECT_TYPE = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT-TYPE");

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_OBJECT = makeSymbol("PROOF-VIEW-ENTRY-INT-OBJECT");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_OBJECT = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT");

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_PROOF_VIEW = makeSymbol("PROOF-VIEW-ENTRY-INT-PROOF-VIEW");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_PROOF_VIEW = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-PROOF-VIEW");

	private static final SubLSymbol PROOF_VIEW_ENTRY_INT_PROPERTIES = makeSymbol("PROOF-VIEW-ENTRY-INT-PROPERTIES");

	private static final SubLSymbol _CSETF_PROOF_VIEW_ENTRY_INT_PROPERTIES = makeSymbol("_CSETF-PROOF-VIEW-ENTRY-INT-PROPERTIES");

	private static final SubLSymbol MAKE_PROOF_VIEW_ENTRY = makeSymbol("MAKE-PROOF-VIEW-ENTRY");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-ENTRY-METHOD");

	private static final SubLString $str195$__PROOF_VIEW_ENTRY_ = makeString("#<PROOF-VIEW-ENTRY ");

	private static final SubLString $str196$_D__D = makeString("~D.~D");

	private static final SubLString $str197$_label_ = makeString(" label=");

	private static final SubLString $str198$_S_has_no_root_entry___ = makeString("~S has no root entry.~%");

	public static final SubLList $list199 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

	private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

	private static final SubLSymbol VALID_PROOF_VIEW_P = makeSymbol("VALID-PROOF-VIEW-P");

	private static final SubLString $str202$_ = makeString("-");

	private static final SubLList $list206 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLSymbol $sym208$_PROOF_VIEW_DEBUG__ = makeSymbol("*PROOF-VIEW-DEBUG?*");

	private static final SubLSymbol FORCE_FORMAT = makeSymbol("FORCE-FORMAT");

	private static final SubLSymbol PROOF_VIEW_ENTRY_SPECIFICITY = makeSymbol("PROOF-VIEW-ENTRY-SPECIFICITY");

	private static final SubLSymbol PROOF_VIEW_ENTRY_GET_DEPTH = makeSymbol("PROOF-VIEW-ENTRY-GET-DEPTH");

	private static final SubLSymbol $kw215$EXPAND_INITIALLY_ = makeKeyword("EXPAND-INITIALLY?");

	private static final SubLSymbol $kw219$HIGHLIGHT_PHRASE_DEMERITS_ = makeKeyword("HIGHLIGHT-PHRASE-DEMERITS?");

	private static final SubLSymbol GENERATE_HTML_FROM_PROOF_VIEW_ENTRY_IDS = makeSymbol("GENERATE-HTML-FROM-PROOF-VIEW-ENTRY-IDS");

	private static final SubLString $str223$can_t_find_proof_view_entry_for_i = makeString("can't find proof-view-entry for ids (~A ~A)");

	private static final SubLSymbol PROOF_VIEW_ENTRY_HTML = makeSymbol("PROOF-VIEW-ENTRY-HTML");

	private static final SubLSymbol FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS = makeSymbol("FACT-SHEET-TERM-ID-IF-OK-FOR-PROOF-VIEW-FACT-SHEETS");

	private static final SubLSymbol $ENTRY_PARAPHRASE_FN = makeKeyword("ENTRY-PARAPHRASE-FN");

	private static final SubLSymbol PROOF_VIEW_ENTRY_GENERATE_HTML_STANDARD = makeSymbol("PROOF-VIEW-ENTRY-GENERATE-HTML-STANDARD");

	private static final SubLSymbol $sym228$_EXIT = makeSymbol("%EXIT");

	private static final SubLSymbol PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL = makeSymbol("PROOF-VIEW-ENTRY-GENERATE-HTML-INTERNAL");

	private static final SubLList $list232 = list(list(makeSymbol("COLOR"), makeSymbol("DEFAULT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol HTML_FANCY_FONT = makeSymbol("HTML-FANCY-FONT");

	private static final SubLSymbol GENERATE_SKOLEM_TERM_EXISTENTIALLY = makeSymbol("GENERATE-SKOLEM-TERM-EXISTENTIALLY");

	private static final SubLSymbol GENERATE_SKOLEM_TERM_SMART = makeSymbol("GENERATE-SKOLEM-TERM-SMART");

	private static final SubLString $str239$_A__ = makeString("~A. ");

	private static final SubLSymbol PROOF_VIEW_SUPPORT_HTML = makeSymbol("PROOF-VIEW-SUPPORT-HTML");

	private static final SubLSymbol $PROOF_VIEW_ENTRY_CONFIRMED = makeKeyword("PROOF-VIEW-ENTRY-CONFIRMED");

	private static final SubLSymbol $PROOF_VIEW_ENTRY_DENIED = makeKeyword("PROOF-VIEW-ENTRY-DENIED");

	private static final SubLString $str244$_A = makeString("~A");

	private static final SubLSymbol EL_TERM_P = makeSymbol("EL-TERM-P");

	private static final SubLList $list249 = list(makeSymbol("SENTENCE"), makeSymbol("TERMS"), makeSymbol("MT"));

	private static final SubLList $list251 = list(makeSymbol("DOCUMENT"), makeSymbol("ENTITY-MENTION"), makeSymbol("TERMS"), makeSymbol("MT"));

	private static final SubLObject $$keyRuleEnglishSummary = reader_make_constant_shell(makeString("keyRuleEnglishSummary"));

	private static final SubLString $str257$Fact_computed_by_Cyc_ = makeString("Fact computed by Cyc.");

	private static final SubLString $str259$No_justification_available_ = makeString("No justification available.");

	private static final SubLString $str262$Cyc_thinks_this_might_be_true_but = makeString("Cyc thinks this might be true but can't prove it.");

	private static final SubLSymbol $ABDUCED_SUPPORT_CONFIRMED = makeKeyword("ABDUCED-SUPPORT-CONFIRMED");

	private static final SubLString $str264$Confirmed__but_not_provable_from_ = makeString("Confirmed, but not provable from previous knowledge.");

	private static final SubLSymbol $ABDUCED_SUPPORT_DENIED = makeKeyword("ABDUCED-SUPPORT-DENIED");

	private static final SubLString $str266$Denied__and_not_provable_from_pre = makeString("Denied, and not provable from previous knowledge.");

	private static final SubLString $str268$Given_in_the_question_ = makeString("Given in the question.");

	private static final SubLString $str270$This_rule_has_exceptions__but_non = makeString("This rule has exceptions, but none that apply in this case.");

	private static final SubLString $str272$This_rule_has_further_conditions_ = makeString("This rule has further conditions on its application, but all are met in this case.");

	private static final SubLSymbol $NO_SOURCE_DOCUMENT = makeKeyword("NO-SOURCE-DOCUMENT");

	private static final SubLString $$$From_ = makeString("From ");

	private static final SubLString $str283$_A_and__A = makeString("~A and ~A");

	private static final SubLString $$$and_ = makeString("and ");

	private static final SubLString $str285$__ = makeString(", ");

	private static final SubLString $str286$no_output_method_for__S = makeString("no output method for ~S");

	private static final SubLSymbol $kw287$HAS_ABDUCED_SUPPORT_ = makeKeyword("HAS-ABDUCED-SUPPORT?");

	private static final SubLSymbol $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_ = makeKeyword("HAS-ABDUCED-SUPPORT-CONFIRMED?");

	private static final SubLSymbol $kw289$HAS_ABDUCED_SUPPORT_DENIED_ = makeKeyword("HAS-ABDUCED-SUPPORT-DENIED?");

	private static final SubLSymbol PPH_SOURCE_CITATION_P = makeSymbol("PPH-SOURCE-CITATION-P");

	private static final SubLList $list291 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));

	private static final SubLString $str292$__ = makeString(": ");

	private static final SubLString $$$Given_in_the_query = makeString("Given in the query");

	private static final SubLString $$$Entered = makeString("Entered");

	private static final SubLString $$$_by_an_employee_ = makeString(" by an employee ");

	private static final SubLString $$$_by_ = makeString(" by ");

	private static final SubLString $$$_of_ = makeString(" of ");

	private static final SubLString $$$_on_ = makeString(" on ");

	private static final SubLString $$$_at_ = makeString(" at ");

	private static final SubLString $$$_for_ = makeString(" for ");

	private static final SubLString $str301$Fact_asserted_in_Cyc_Knowledge_Ba = makeString("Fact asserted in Cyc Knowledge Base");

	private static final SubLString $str302$_ = makeString(".");

	private static final SubLObject $$HypotheticalContext = reader_make_constant_shell(makeString("HypotheticalContext"));

	private static final SubLList $list304 = list(makeSymbol("THIS-EMPLOYER"), makeSymbol("THIS-MT"));

	private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

	private static final SubLSymbol $sym306$_EMPLOYER = makeSymbol("?EMPLOYER");

	private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

	private static final SubLSymbol $sym308$_MT = makeSymbol("?MT");

	private static final SubLObject $$employees = reader_make_constant_shell(makeString("employees"));

	private static final SubLList $list310 = list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?MT"), makeSymbol("?TIME"));

	private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

	private static final SubLSymbol $sym312$_TIME = makeSymbol("?TIME");

	private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

	private static final SubLList $list314 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

	private static final SubLSymbol EMPLOYEE_EMPLOYERS_AND_MTS = makeSymbol("EMPLOYEE-EMPLOYERS-AND-MTS");

	private static final SubLList $list316 = list(makeSymbol("?EMPLOYER"), makeSymbol("?MT"));

	private static final SubLList $list317 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

	private static final SubLSymbol $employee_employers_and_mts_caching_state$ = makeSymbol("*EMPLOYEE-EMPLOYERS-AND-MTS-CACHING-STATE*");

	private static final SubLList $list319 = list(makeSymbol("?OFFSET"), makeSymbol("?LENGTH"), makeSymbol("?TEXT"));

	private static final SubLObject $$lengthOfList = reader_make_constant_shell(makeString("lengthOfList"));

	private static final SubLList $list321 = list(makeSymbol("?LENGTH"));

	private static final SubLList $list322 = list(reader_make_constant_shell(makeString("textOfWork")), makeSymbol("?DOCUMENT"), makeSymbol("?TEXT"));

	private static final SubLObject $$startOffset = reader_make_constant_shell(makeString("startOffset"));

	private static final SubLSymbol $sym324$_DOCUMENT = makeSymbol("?DOCUMENT");

	private static final SubLList $list325 = list(makeSymbol("?OFFSET"));

	public static final SubLList $list326 = list(makeSymbol("OFFSET"), makeSymbol("LENGTH"), makeSymbol("TEXT"));

	private static final SubLString $str327$___ = makeString("...");

	private static final SubLList $list328 = list(makeSymbol("TERM-STRING"), makeSymbol("TERM-START-POS"), makeSymbol("TERM-END-POS"), makeSymbol("COLOR"));

	private static final SubLSymbol $sym329$_TEXT = makeSymbol("?TEXT");

	private static final SubLObject $$textOfWork = reader_make_constant_shell(makeString("textOfWork"));

	private static final SubLList $list331 = list(makeSymbol("?TEXT"));

	private static final SubLList $list332 = list(makeSymbol("OFFSET"), makeSymbol("LENGTH"));

	public static final SubLList $list333 = list(makeSymbol("?OFFSET"), makeSymbol("?LENGTH"));

	private static final SubLObject $$startOffsetForMention = reader_make_constant_shell(makeString("startOffsetForMention"));

	private static final SubLObject $$stringLengthForMention = reader_make_constant_shell(makeString("stringLengthForMention"));

	private static final SubLString $$$black = makeString("black");

	private static final SubLSymbol $sym339$_ = makeSymbol("<");

	private static final SubLSymbol $sym341$_STRING = makeSymbol("?STRING");

	private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

	private static final SubLList $list343 = list(makeSymbol("?STRING"));

	private static final SubLList $list344 = list(makeKeyword("REWRITE-ALLOWED?"), T);

	private static final SubLString $str345$__ = makeString(" ,");

	private static final SubLString $str346$_ = makeString(",");

	private static final SubLSymbol PROOF_VIEW_REFERENCE_SUBSUMES_P = makeSymbol("PROOF-VIEW-REFERENCE-SUBSUMES-P");

	private static final SubLSymbol GET_ABDUCED_SUPPORT_SENTENCE_FOR_PROOF_VIEW = makeSymbol("GET-ABDUCED-SUPPORT-SENTENCE-FOR-PROOF-VIEW");

	private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

	private static final SubLSymbol ASSERT_ABDUCTION_SUPPORT_FOR_PROOF_VIEW = makeSymbol("ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW");

	private static final SubLObject $$ContextOfPCWFn = reader_make_constant_shell(makeString("ContextOfPCWFn"));

	private static final SubLSymbol GET_QUERY_URL_FOR_PROOF_VIEW = makeSymbol("GET-QUERY-URL-FOR-PROOF-VIEW");

	private static final SubLSymbol GET_SENTENCE_FOR_PROOF_VIEW = makeSymbol("GET-SENTENCE-FOR-PROOF-VIEW");

	private static final SubLSymbol CONSTRUCT_PROOF_VIEWS_JAVA_ITERATIVELY = makeSymbol("CONSTRUCT-PROOF-VIEWS-JAVA-ITERATIVELY");

	private static final SubLSymbol PROOF_ABDUCTIONS = makeSymbol("PROOF-ABDUCTIONS");

	private static final SubLSymbol PROOF_ABDUCED_SUPPORT_RATIO = makeSymbol("PROOF-ABDUCED-SUPPORT-RATIO");

	private static final SubLSymbol INFERENCE_PROOF_GET_DEPTH = makeSymbol("INFERENCE-PROOF-GET-DEPTH");

	private static final SubLSymbol CONSTRUCT_PROOF_VIEWS_JAVA_LIST = makeSymbol("CONSTRUCT-PROOF-VIEWS-JAVA-LIST");

	private static final SubLString $str360$inference_answer___A__ = makeString("inference-answer: ~A~%");

	private static final SubLString $str361$proofs___A__ = makeString("proofs: ~A~%");

	private static final SubLSymbol CONSTRUCT_XML_PROOF_VIEW_FOR_SENTENCE = makeSymbol("CONSTRUCT-XML-PROOF-VIEW-FOR-SENTENCE");

	private static final SubLSymbol PROOF_VIEW_ID_POPULATE = makeSymbol("PROOF-VIEW-ID-POPULATE");

	private static final SubLSymbol PROOF_VIEW_XML = makeSymbol("PROOF-VIEW-XML");

	private static final SubLString $str366$_s_Does_not_identify_existing_pro = makeString("~s Does not identify existing proof-view");

	private static final SubLString $str367$UTF_8 = makeString("UTF-8");

	private static final SubLSymbol PROOF_VIEW_ENTRY_XML = makeSymbol("PROOF-VIEW-ENTRY-XML");

	private static final SubLSymbol $TOP_LEVEL_ONLY = makeKeyword("TOP-LEVEL-ONLY");

	public static final SubLList $list370 = list(list(makeSymbol("LOCAL-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("ATTRIBUTES"), NIL), makeSymbol("ATOMIC?")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list372 = list(NIL, NIL, list(makeSymbol("PROOF-VIEW-NAMESPACE")));

	private static final SubLList $list373 = list(list(makeSymbol("*CYCML-INCLUDE-NAMESPACE?*"), makeSymbol("*PROOF-VIEW-INCLUDE-NAMESPACE?*")));

	private static final SubLString $str374$proof_view = makeString("proof-view");

	private static final SubLString $$$id = makeString("id");

	private static final SubLString $str377$proof_view_details = makeString("proof-view-details");

	private static final SubLString $str379$proof_view_sources = makeString("proof-view-sources");

	private static final SubLString $str381$proof_view_rules = makeString("proof-view-rules");

	private static final SubLString $str382$proof_view_id = makeString("proof-view-id");

	private static final SubLString $str383$proof_view_entry = makeString("proof-view-entry");

	private static final SubLString $str384$sub_entries = makeString("sub-entries");

	private static final SubLList $list385 = list(makeSymbol("HTML"), makeSymbol("CYCL"));

	private static final SubLString $$$cycl = makeString("cycl");

	private static final SubLString $str387$expand_initially = makeString("expand-initially");

	private static final SubLString $$$label = makeString("label");

	private static final SubLString $str389$object_type = makeString("object-type");

	private static final SubLString $str390$abduced_support = makeString("abduced-support");

	private static final SubLString $$$content = makeString("content");

	private static final SubLSymbol $kw395$ABDUCED_SUPPORT_ = makeKeyword("ABDUCED-SUPPORT?");

	private static final SubLSymbol GET_NEW_EMPTY_PROOF_VIEW_ID = makeSymbol("GET-NEW-EMPTY-PROOF-VIEW-ID");

	private static final SubLString $str398$Yes_ = makeString("Yes.");

	private static final SubLSymbol $USED_RULES_ROOT = makeKeyword("USED-RULES-ROOT");

	private static final SubLSymbol $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_ = makeSymbol("PROOF-VIEW-FACT-TRIVIALLY-IMPLIES-PROOF-CONCLUSION?");

	private static final SubLList $list402 = list(makeSymbol("MT"), makeSymbol("ASENT"));

	private static final SubLString $str403$_S___trivially_implies_answer_con = makeString("~S~% trivially implies answer conjunct ~S");

	private static final SubLList $list405 = list(makeSymbol("ASSERTION-P"), makeSymbol("SUPPORT-P"), makeSymbol("EL-SENTENCE-P"), makeKeyword("EXTERNAL-SENTENCE"));

	private static final SubLList $list406 = list(makeSymbol("ASSERTION-P"), makeSymbol("SUPPORT-P"));

	private static final SubLSymbol $sym407$PROOF_VIEW_FACT_IMPLIES_ = makeSymbol("PROOF-VIEW-FACT-IMPLIES?");

	private static final SubLList $list408 = list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("typeChangesQuantityByFactor"))), list(makeKeyword("BIND"), makeSymbol("EVENT")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("SLOT")), list(makeKeyword("BIND"), makeSymbol("FACTOR")));

	private static final SubLList $list412 = list(makeKeyword("OR"), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("subEventTypes")));

	private static final SubLObject $$IncreaseOnSlotFn = reader_make_constant_shell(makeString("IncreaseOnSlotFn"));

	private static final SubLList $list414 = list(reader_make_constant_shell(makeString("relationAllExists")), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), list(makeKeyword("BIND"), makeSymbol("COL1")), list(makeKeyword("BIND"), makeSymbol("COL2")));

	private static final SubLList $list418 = list(makeKeyword("BIND"), makeSymbol("PRED"));

	private static final SubLObject $$Kappa = reader_make_constant_shell(makeString("Kappa"));

	private static final SubLList $list421 = list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

	private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

	private static final SubLObject $$coGenlPreds = reader_make_constant_shell(makeString("coGenlPreds"));

	private static final SubLList $list424 = list(reader_make_constant_shell(makeString("relationAllExistsMin")), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), list(makeKeyword("BIND"), makeSymbol("COL1")), list(makeKeyword("BIND"), makeSymbol("COL2")), list(makeKeyword("BIND"), makeSymbol("MIN")));

	private static final SubLList $list426 = list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("coveringOfEventType"))), list(makeKeyword("BIND"), makeSymbol("SUPER")), list(makeKeyword("BIND"), makeSymbol("SUBS")));

	private static final SubLSymbol SUBS = makeSymbol("SUBS");

	private static final SubLList $list429 = list(makeKeyword("SPEC-PRED"), reader_make_constant_shell(makeString("lastProperSubEventTypes")));

	private static final SubLList $list430 = list(makeKeyword("SPEC-PRED"), reader_make_constant_shell(makeString("startsAfterEndOfInSituationType")));

	private static final SubLList $list431 = list(list(makeKeyword("BIND"), makeSymbol("SUB1")), list(makeKeyword("BIND"), makeSymbol("SUB2")));

	private static final SubLSymbol SUB2 = makeSymbol("SUB2");

	private static final SubLSymbol SUB1 = makeSymbol("SUB1");

	private static final SubLList $list434 = list(makeKeyword("OR"), reader_make_constant_shell(makeString("partTypesFactsForType")), reader_make_constant_shell(makeString("resultTypesFactsForType")));

	private static final SubLList $list436 = list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("firstProperSubSituationTypes"))), list(makeKeyword("BIND"), makeSymbol("SUP")), list(makeKeyword("BIND"), makeSymbol("SUB")));

	private static final SubLSymbol SUB = makeSymbol("SUB");

	private static final SubLSymbol SUP = makeSymbol("SUP");

	private static final SubLObject $$startTogetherInSituationType = reader_make_constant_shell(makeString("startTogetherInSituationType"));

	private static final SubLString $str441$_S___trivially_implies__S = makeString("~S~% trivially implies ~S");

	private static final SubLSymbol PROOF_VIEW_FACT_SENTENCE = makeSymbol("PROOF-VIEW-FACT-SENTENCE");

	private static final SubLString $str443$Don_t_know_how_to_get_sentence_of = makeString("Don't know how to get sentence of ~S");

	private static final SubLSymbol PROOF_VIEW_FACT_HL_SENTENCE = makeSymbol("PROOF-VIEW-FACT-HL-SENTENCE");

	private static final SubLString $str445$Don_t_know_how_to_get_HL_sentence = makeString("Don't know how to get HL sentence of ~S");

	private static final SubLSymbol PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS = makeSymbol("PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS");

	private static final SubLList $list447 = list(makeKeyword("ISA"), makeKeyword("GENLS"), makeKeyword("DISJOINTWITH"), makeKeyword("TRANSITIVITY"), makeKeyword("TVA"), makeKeyword("GENLPREDS"));

	private static final SubLList $list448 = list(makeKeyword("UNKNOWN"), makeKeyword("FALSE"));

	private static final SubLString $str449$Suppressing__S___because_it_match = makeString("Suppressing ~S~% because it matches ~S");

	private static final SubLSymbol $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_ = makeSymbol("SENTENCE-MATCHES-SUPPRESSED-LITERAL?");

	private static final SubLSymbol $sym452$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

	private static final SubLList $list453 = list(makeKeyword("SKSI"), makeKeyword("GIS"));

	private static final SubLSymbol PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS = makeSymbol("PROOF-VIEW-GET-DOCUMENT-FOR-HYPOTHESIS");

	private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

	private static final SubLList $list456 = list(reader_make_constant_shell(makeString("TextualPCW")));

	private static final SubLObject $$sourceOfTerm = reader_make_constant_shell(makeString("sourceOfTerm"));

	private static final SubLList $list458 = list(makeSymbol("?DOCUMENT"));

	private static final SubLSymbol INFERENCE_PROOF_GET_DEPTH_MEMOIZED = makeSymbol("INFERENCE-PROOF-GET-DEPTH-MEMOIZED");

	private static final SubLString $str460$_____Answer____ = makeString("~%~% Answer: ~%");

	private static final SubLObject $$SomethingExisting = reader_make_constant_shell(makeString("SomethingExisting"));

	private static final SubLSymbol FORMULA_ARG3 = makeSymbol("FORMULA-ARG3");

	private static final SubLObject $const463$assertionRequiredForJustification = reader_make_constant_shell(makeString("assertionRequiredForJustificationParaphrase"));

	private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

	public static SubLObject proof_view_default_color() {
		return html_macros.$html_color_black$.getGlobalValue();
	}

	public static SubLObject proof_view_params(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject alist = NIL;
		alist = list_utilities.alist_enter(alist, $PROOF, proof_view_get_proof(v_proof_view), UNPROVIDED);
		alist = list_utilities.alist_enter(alist, $ANSWER, proof_view_get_answer(v_proof_view), UNPROVIDED);
		alist = list_utilities.alist_enter(alist, $pph_language_mt$, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED);
		alist = list_utilities.alist_enter(alist, $proof_view_citation_format$, $proof_view_citation_format$.getDynamicValue(thread), UNPROVIDED);
		return alist;
	}

	public static SubLObject proof_view_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		proof_view_int_print(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject proof_view_p(final SubLObject v_object) {
		return v_object.getJavaClass() ==$proof_view_native.class ? T : NIL;
	}

	public static SubLObject proof_view_int_id(final SubLObject v_object) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject proof_view_int_proof(final SubLObject v_object) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject proof_view_int_answer(final SubLObject v_object) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.getField4();
	}

	public static SubLObject proof_view_int_id_index(final SubLObject v_object) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.getField5();
	}

	public static SubLObject proof_view_int_properties(final SubLObject v_object) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.getField6();
	}

	public static SubLObject _csetf_proof_view_int_id(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_proof_view_int_proof(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_proof_view_int_answer(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_proof_view_int_id_index(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.setField5(value);
	}

	public static SubLObject _csetf_proof_view_int_properties(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_p(v_object) : "proof_view.proof_view_p error :" + v_object;
		return v_object.setField6(value);
	}

	public static SubLObject make_proof_view(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $proof_view_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($ID)) {
				_csetf_proof_view_int_id(v_new, current_value);
			} else if (pcase_var.eql($PROOF)) {
				_csetf_proof_view_int_proof(v_new, current_value);
			} else if (pcase_var.eql($ANSWER)) {
				_csetf_proof_view_int_answer(v_new, current_value);
			} else if (pcase_var.eql($ID_INDEX)) {
				_csetf_proof_view_int_id_index(v_new, current_value);
			} else if (pcase_var.eql($PROPERTIES)) {
				_csetf_proof_view_int_properties(v_new, current_value);
			} else {
				Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_proof_view(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_PROOF_VIEW, FIVE_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $ID, proof_view_int_id(obj));
		funcall(visitor_fn, obj, $SLOT, $PROOF, proof_view_int_proof(obj));
		funcall(visitor_fn, obj, $SLOT, $ANSWER, proof_view_int_answer(obj));
		funcall(visitor_fn, obj, $SLOT, $ID_INDEX, proof_view_int_id_index(obj));
		funcall(visitor_fn, obj, $SLOT, $PROPERTIES, proof_view_int_properties(obj));
		funcall(visitor_fn, obj, $END, MAKE_PROOF_VIEW, FIVE_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_proof_view_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_proof_view(obj, visitor_fn);
	}

	public static SubLObject valid_proof_view_p(final SubLObject v_object) {
		return makeBoolean((NIL != proof_view_p(v_object)) && proof_view_int_id(v_object).isInteger());
	}

	public static SubLObject proof_view_int_print(final SubLObject v_proof_view, final SubLObject stream, final SubLObject depth) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		write_string($str43$__PROOF_VIEW_, stream, UNPROVIDED, UNPROVIDED);
		prin1(proof_view_int_id(v_proof_view), stream);
		write_string($str44$_proof_, stream, UNPROVIDED, UNPROVIDED);
		prin1(proof_view_int_proof(v_proof_view), stream);
		write_string($str45$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject proof_view_id_index() {
		return $proof_view_id_index$.getGlobalValue();
	}

	public static SubLObject get_next_proof_view_id() {
		final SubLObject v_id_index = proof_view_id_index();
		return id_index_reserve(v_id_index);
	}

	public static SubLObject find_proof_view_by_id(final SubLObject proof_view_id) {
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		return id_index_lookup(proof_view_id_index(), proof_view_id, UNPROVIDED);
	}

	public static SubLObject proof_view_do_entries(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list48);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject entry = NIL;
		SubLObject v_proof_view = NIL;
		destructuring_bind_must_consp(current, datum, $list48);
		entry = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list48);
		v_proof_view = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list48);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list48);
			if (NIL == member(current_$1, $list49, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list48);
		}
		final SubLObject entry_id_tail = property_list_member($ENTRY_ID, current);
		final SubLObject entry_id = (NIL != entry_id_tail) ? cadr(entry_id_tail) : ENTRY_ID;
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(DO_ID_INDEX, list(entry_id, entry, list(PROOF_VIEW_GET_ID_INDEX, v_proof_view), $DONE, done), list(IGNORE, entry_id), append(body, NIL));
	}

	public static SubLObject proof_view_entry_do_children(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list57);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject dtr_entry = NIL;
		SubLObject entry = NIL;
		destructuring_bind_must_consp(current, datum, $list57);
		dtr_entry = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list57);
		entry = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$2 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list57);
			current_$2 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list57);
			if (NIL == member(current_$2, $list58, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list57);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(CSOME, list(dtr_entry, list(PROOF_VIEW_ENTRY_GET_CHILDREN, entry), done), append(body, NIL));
	}

	public static SubLObject most_recent_proof_view() {
		final SubLObject start = get_next_proof_view_id();
		SubLObject end_var;
		SubLObject i;
		SubLObject view;
		for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
			view = find_proof_view_by_id(i);
			if (NIL != view) {
				return view;
			}
		}
		return NIL;
	}

	public static SubLObject do_all_proof_views(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list61);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject v_proof_view = NIL;
		destructuring_bind_must_consp(current, datum, $list61);
		v_proof_view = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$3 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list61);
			current_$3 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list61);
			if (NIL == member(current_$3, $list62, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list61);
		}
		final SubLObject id_tail = property_list_member($ID, current);
		final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : ID;
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(DO_ID_INDEX, list(id, v_proof_view, $list64, $DONE, done), list(IGNORE, id), append(body, NIL));
	}

	public static SubLObject new_proof_view(SubLObject proof, SubLObject v_answer) {
		if (proof == UNPROVIDED) {
			proof = NIL;
		}
		if (v_answer == UNPROVIDED) {
			v_answer = NIL;
		}
		if (((NIL != proof) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_proof.proof_p(proof))) {
			throw new AssertionError(proof);
		}
		final SubLObject id = get_next_proof_view_id();
		final SubLObject v_proof_view = make_proof_view(list(new SubLObject[] { $ID, id, $PROOF, proof, $ANSWER, v_answer, $ID_INDEX, new_id_index(ZERO_INTEGER, $proof_view_root_entry_id$.getGlobalValue()), $PROPERTIES, NIL }));
		proof_view_populator.proof_view_add_root_entry(v_proof_view);
		id_index_enter(proof_view_id_index(), id, v_proof_view);
		proof_view_set_creation_universal_time(v_proof_view, UNPROVIDED);
		return v_proof_view;
	}

	public static SubLObject destroy_proof_view(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		if (NIL != valid_proof_view_p(v_proof_view)) {
			final SubLObject id = proof_view_get_id(v_proof_view);
			try {
				destroy_proof_view_int(v_proof_view);
				final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
				try {
					bind($is_thread_performing_cleanupP$, T);
					final SubLObject _values = getValuesAsVector();
					id_index_remove(proof_view_id_index(), id);
					restoreValuesFromVector(_values);
				} finally {
					rebind($is_thread_performing_cleanupP$, _prev_bind_0);
				}
			} finally {
				final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
				try {
					bind($is_thread_performing_cleanupP$, T);
					final SubLObject _values2 = getValuesAsVector();
					id_index_remove(proof_view_id_index(), id);
					restoreValuesFromVector(_values2);
				} finally {
					rebind($is_thread_performing_cleanupP$, _prev_bind_2);
				}
			}
		}
		return NIL;
	}

	public static SubLObject destroy_all_proof_views() {
		SubLObject proof_views = NIL;
		final SubLObject id_index_lock = id_index_lock(proof_view_id_index());
		SubLObject release = NIL;
		try {
			release = seize_lock(id_index_lock);
			final SubLObject idx = proof_view_id_index();
			if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
				final SubLObject idx_$4 = idx;
				if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
					final SubLObject vector_var = id_index_dense_objects(idx_$4);
					final SubLObject backwardP_var = NIL;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject id;
					SubLObject v_proof_view;
					for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
						id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
						v_proof_view = aref(vector_var, id);
						if ((NIL == id_index_tombstone_p(v_proof_view)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							if (NIL != id_index_tombstone_p(v_proof_view)) {
								v_proof_view = $SKIP;
							}
							proof_views = cons(v_proof_view, proof_views);
						}
					}
				}
				final SubLObject idx_$5 = idx;
				if (NIL == id_index_sparse_objects_empty_p(idx_$5)) {
					final SubLObject cdohash_table = id_index_sparse_objects(idx_$5);
					SubLObject id2 = NIL;
					SubLObject v_proof_view2 = NIL;
					final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
					try {
						while (iteratorHasNext(cdohash_iterator)) {
							final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
							id2 = getEntryKey(cdohash_entry);
							v_proof_view2 = getEntryValue(cdohash_entry);
							proof_views = cons(v_proof_view2, proof_views);
						}
					} finally {
						releaseEntrySetIterator(cdohash_iterator);
					}
				}
			}
			SubLObject cdolist_list_var = proof_views;
			SubLObject v_proof_view3 = NIL;
			v_proof_view3 = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				destroy_proof_view(v_proof_view3);
				cdolist_list_var = cdolist_list_var.rest();
				v_proof_view3 = cdolist_list_var.first();
			}
			clear_id_index(proof_view_id_index());
		} finally {
			if (NIL != release) {
				release_lock(id_index_lock);
			}
		}
		return length(proof_views);
	}

	public static SubLObject destroy_proof_view_int(final SubLObject v_proof_view) {
		final SubLObject v_id_index = proof_view_get_id_index(v_proof_view);
		SubLObject entries = NIL;
		final SubLObject id_index_lock = id_index_lock(v_id_index);
		SubLObject release = NIL;
		try {
			release = seize_lock(id_index_lock);
			final SubLObject idx = v_id_index;
			if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
				final SubLObject idx_$6 = idx;
				if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
					final SubLObject vector_var = id_index_dense_objects(idx_$6);
					final SubLObject backwardP_var = NIL;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject id;
					SubLObject entry;
					for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
						id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
						entry = aref(vector_var, id);
						if ((NIL == id_index_tombstone_p(entry)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							if (NIL != id_index_tombstone_p(entry)) {
								entry = $SKIP;
							}
							entries = cons(entry, entries);
						}
					}
				}
				final SubLObject idx_$7 = idx;
				if (NIL == id_index_sparse_objects_empty_p(idx_$7)) {
					final SubLObject cdohash_table = id_index_sparse_objects(idx_$7);
					SubLObject id2 = NIL;
					SubLObject entry2 = NIL;
					final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
					try {
						while (iteratorHasNext(cdohash_iterator)) {
							final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
							id2 = getEntryKey(cdohash_entry);
							entry2 = getEntryValue(cdohash_entry);
							entries = cons(entry2, entries);
						}
					} finally {
						releaseEntrySetIterator(cdohash_iterator);
					}
				}
			}
			SubLObject cdolist_list_var = entries;
			SubLObject entry3 = NIL;
			entry3 = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				destroy_proof_view_entry(entry3);
				cdolist_list_var = cdolist_list_var.rest();
				entry3 = cdolist_list_var.first();
			}
			clear_id_index(v_id_index);
		} finally {
			if (NIL != release) {
				release_lock(id_index_lock);
			}
		}
		_csetf_proof_view_int_id_index(v_proof_view, $FREE);
		_csetf_proof_view_int_id(v_proof_view, $FREE);
		_csetf_proof_view_int_proof(v_proof_view, $FREE);
		_csetf_proof_view_int_answer(v_proof_view, $FREE);
		clear_proof_view_memoization_state(v_proof_view);
		_csetf_proof_view_int_properties(v_proof_view, $FREE);
		return NIL;
	}

	public static SubLObject maybe_with_proof_view_memoization(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list68);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject v_proof_view = NIL;
		destructuring_bind_must_consp(current, datum, $list68);
		v_proof_view = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject state = $sym69$STATE;
			return list(CLET, list(list(state, list(FIND_PROOF_VIEW_MEMOIZATION_STATE, v_proof_view))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list68);
		return NIL;
	}

	public static SubLObject find_proof_view_memoization_state(final SubLObject v_proof_view) {
		SubLObject v_memoization_state = memoization_state.current_memoization_state();
		if (NIL == memoization_state.memoization_state_p(v_memoization_state)) {
			v_memoization_state = proof_view_find_or_create_cached_memoization_state(v_proof_view);
		}
		return v_memoization_state;
	}

	public static SubLObject proof_view_find_or_create_cached_memoization_state(final SubLObject v_proof_view) {
		SubLObject v_memoization_state = proof_view_get_cached_memoization_state(v_proof_view);
		if (NIL == memoization_state.memoization_state_p(v_memoization_state)) {
			v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			proof_view_set_cached_memoization_state(v_proof_view, v_memoization_state);
		}
		return v_memoization_state;
	}

	public static SubLObject proof_view_get_cached_memoization_state(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $MEMOIZATION_STATE, UNPROVIDED);
	}

	public static SubLObject proof_view_set_cached_memoization_state(final SubLObject v_proof_view, final SubLObject v_memoization_state) {
		return proof_view_set_property(v_proof_view, $MEMOIZATION_STATE, v_memoization_state);
	}

	public static SubLObject clear_proof_view_memoization_state_by_id(final SubLObject proof_view_id) {
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		final SubLObject v_proof_view = find_proof_view_by_id(proof_view_id);
		if (NIL != proof_view_p(v_proof_view)) {
			clear_proof_view_memoization_state(v_proof_view);
		}
		return NIL;
	}

	public static SubLObject clear_proof_view_memoization_state(final SubLObject v_proof_view) {
		final SubLObject state = proof_view_get_cached_memoization_state(v_proof_view);
		if (NIL != memoization_state.memoization_state_p(state)) {
			memoization_state.clear_all_memoization(state);
		}
		return v_proof_view;
	}

	public static SubLObject set_proof_view_allow_external_linksP(final SubLObject proof_view_id, final SubLObject allow_external_linksP) {
		proof_view_set_allow_external_linksP(find_proof_view_by_id(proof_view_id), allow_external_linksP);
		return T;
	}

	public static SubLObject set_proof_view_language_mt(final SubLObject proof_view_id, final SubLObject language_mt) {
		proof_view_set_language_mt(find_proof_view_by_id(proof_view_id), language_mt);
		return T;
	}

	public static SubLObject set_proof_view_domain_mt(final SubLObject proof_view_id, final SubLObject domain_mt) {
		proof_view_set_domain_mt(find_proof_view_by_id(proof_view_id), domain_mt);
		return T;
	}

	public static SubLObject get_proof_view_domain_mt(final SubLObject proof_view_id) {
		return proof_view_get_domain_mt(find_proof_view_by_id(proof_view_id));
	}

	public static SubLObject get_proof_view_language_mt(final SubLObject proof_view_id) {
		return proof_view_get_language_mt(find_proof_view_by_id(proof_view_id));
	}

	public static SubLObject get_proof_view_include_linear(final SubLObject proof_view_id) {
		return proof_view_linear.proof_view_get_include_linear_sectionP(find_proof_view_by_id(proof_view_id));
	}

	public static SubLObject set_proof_view_include_linear(final SubLObject proof_view_id, final SubLObject bool) {
		proof_view_linear.proof_view_set_include_linear_sectionP(find_proof_view_by_id(proof_view_id), bool);
		return T;
	}

	public static SubLObject get_proof_view_include_details(final SubLObject proof_view_id) {
		return proof_view_get_include_justification_sectionP(find_proof_view_by_id(proof_view_id));
	}

	public static SubLObject set_proof_view_include_details(final SubLObject proof_view_id, final SubLObject bool) {
		proof_view_set_include_justification_sectionP(find_proof_view_by_id(proof_view_id), bool);
		return T;
	}

	public static SubLObject get_proof_view_suppress_assertion_bookkeeping(final SubLObject proof_view_id) {
		return proof_view_get_suppress_assertion_bookkeepingP(find_proof_view_by_id(proof_view_id));
	}

	public static SubLObject set_proof_view_suppress_assertion_bookkeeping(final SubLObject proof_view_id, final SubLObject bool) {
		proof_view_set_suppress_assertion_bookkeepingP(find_proof_view_by_id(proof_view_id), bool);
		return T;
	}

	public static SubLObject get_proof_view_suppress_assertion_cyclists(final SubLObject proof_view_id) {
		return proof_view_get_suppress_assertion_cyclistsP(find_proof_view_by_id(proof_view_id));
	}

	public static SubLObject set_proof_view_suppress_assertion_cyclists(final SubLObject proof_view_id, final SubLObject bool) {
		proof_view_set_suppress_assertion_cyclistsP(find_proof_view_by_id(proof_view_id), bool);
		return T;
	}

	public static SubLObject set_proof_view_addressee(final SubLObject proof_view_id, final SubLObject addressee) {
		proof_view_set_addressee(find_proof_view_by_id(proof_view_id), addressee);
		return T;
	}

	public static SubLObject set_proof_view_include_cycml(final SubLObject proof_view_id, final SubLObject bool) {
		proof_view_set_include_cycml_in_xmlP(find_proof_view_by_id(proof_view_id), bool);
		return T;
	}

	public static SubLObject proof_view_get_id(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return proof_view_int_id(v_proof_view);
	}

	public static SubLObject proof_view_get_id_index(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return proof_view_int_id_index(v_proof_view);
	}

	public static SubLObject proof_view_get_proof(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return proof_view_int_proof(v_proof_view);
	}

	public static SubLObject proof_view_get_answer(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return proof_view_int_answer(v_proof_view);
	}

	public static SubLObject proof_view_get_entries(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return Sort.sort(id_index_values(proof_view_int_id_index(v_proof_view)), $sym91$PROOF_VIEW_ENTRY_, UNPROVIDED);
	}

	public static SubLObject proof_view_get_facts_used(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return proof_view_get_property(v_proof_view, $FACTS_USED, UNPROVIDED);
	}

	public static SubLObject proof_view_get_used_supports(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $USED_SUPPORTS, UNPROVIDED);
	}

	public static SubLObject proof_view_get_source_index(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $SOURCE_INDEX, UNPROVIDED);
	}

	public static SubLObject proof_view_get_source_id(final SubLObject v_proof_view, SubLObject source) {
		if (NIL == proof_view_valid_source_p(source)) {
			return NIL;
		}
		final SubLObject source_index = proof_view_get_source_index(v_proof_view);
		final SubLObject citation = (NIL != dictionary.dictionary_p(source_index)) ? dictionary.dictionary_lookup(source_index, source, NIL) : NIL;
		final SubLObject source_id = (NIL != pph_html.pph_source_citation_p(citation)) ? pph_html.pph_source_citation_id(citation) : NIL;
		return source_id;
	}

	public static SubLObject proof_view_get_source_isg(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $SOURCE_ISG, UNPROVIDED);
	}

	public static SubLObject proof_view_get_filtered_items(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $FILTERED_ITEMS, UNPROVIDED);
	}

	public static SubLObject proof_view_note_filtered_item(final SubLObject v_proof_view, final SubLObject support, SubLObject reason) {
		if (reason == UNPROVIDED) {
			reason = $UNKNOWN;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $break_on_proof_view_filteringP$.getDynamicValue(thread)) {
			Errors.sublisp_break($str98$filtering__S____reason___S_, new SubLObject[] { support, reason });
		}
		SubLObject filtered_items = proof_view_get_filtered_items(v_proof_view);
		if (NIL == filtered_items) {
			filtered_items = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
			proof_view_set_property(v_proof_view, $FILTERED_ITEMS, filtered_items);
		}
		return dictionary_utilities.dictionary_pushnew(filtered_items, reason, support, symbol_function(EQUAL), UNPROVIDED);
	}

	public static SubLObject proof_view_set_parameters_from_specification(final SubLObject v_proof_view, SubLObject specification) {
		assert NIL != indexed_term_p(specification) : "kb_indexing_datastructures.indexed_term_p(specification) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(specification) " + specification;
		set.clear_set(proof_view_populator.proof_view_special_sections_to_include(v_proof_view));
		final SubLObject overrides = stacks.create_stack();
		while ((NIL != cycl_grammar.cycl_nat_p(specification)) && $$SpecificationVariantFn.eql(cycl_utilities.nat_functor(specification))) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.nat_args(specification, UNPROVIDED);
			SubLObject new_specification = NIL;
			SubLObject cycl_param = NIL;
			SubLObject cycl_value = NIL;
			destructuring_bind_must_consp(current, datum, $list101);
			new_specification = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list101);
			cycl_param = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list101);
			cycl_value = current.first();
			current = current.rest();
			if (NIL == current) {
				stacks.stack_push(cons(cycl_param, cycl_value), overrides);
				specification = new_specification;
			} else {
				cdestructuring_bind_error(datum, $list101);
			}
		}
		SubLObject cdolist_list_var = ask_utilities.query_template($list103, list($$and, $list105, listS($sym106$_PARAM, specification, $list107)), $$CycArchitectureMt,
				list(new SubLObject[] { $INFERENCE_MODE, $SHALLOW, $kw111$ALLOW_INDETERMINATE_RESULTS_, NIL, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $kw114$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw115$NEW_TERMS_ALLOWED_, NIL, $kw116$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $ANSWER_LANGUAGE, $HL }));
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current2;
			final SubLObject datum2 = current2 = cons;
			SubLObject cycl_param2 = NIL;
			SubLObject cycl_value2 = NIL;
			destructuring_bind_must_consp(current2, datum2, $list102);
			cycl_param2 = current2.first();
			current2 = cycl_value2 = current2.rest();
			proof_view_set_parameter_from_specification(v_proof_view, cycl_param2, cycl_value2);
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		while (NIL == stacks.stack_empty_p(overrides)) {
			SubLObject current;
			final SubLObject datum = current = stacks.stack_pop(overrides);
			SubLObject cycl_param3 = NIL;
			SubLObject cycl_value3 = NIL;
			destructuring_bind_must_consp(current, datum, $list102);
			cycl_param3 = current.first();
			current = cycl_value3 = current.rest();
			proof_view_set_parameter_from_specification(v_proof_view, cycl_param3, cycl_value3);
		}
		return v_proof_view;
	}

	public static SubLObject proof_view_set_parameter_from_specification(final SubLObject v_proof_view, final SubLObject cycl_param, final SubLObject cycl_value) {
		final SubLObject property = parameter_specification_utilities.software_parameter_value_subl_identifier(cycl_param);
		if (property.isKeyword()) {
			proof_view_set_property(v_proof_view, property, proof_view_property_value_from_cycl(cycl_value));
		} else if ($$suppressProofViewSection.eql(cycl_param)) {
			if (cycl_value.eql($$CycProofViewSummarySection)) {
				proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, NIL);
			} else if (cycl_value.eql($$CycProofViewJustificationSection)) {
				proof_view_set_include_justification_sectionP(v_proof_view, NIL);
			} else if (cycl_value.eql($$CycProofViewLinearSection)) {
				proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, NIL);
			} else {
				proof_view_populator.proof_view_set_include_special_sectionP(v_proof_view, cycl_value, NIL);
			}

		} else if ($$includeProofViewSection.eql(cycl_param)) {
			if (cycl_value.eql($$CycProofViewSummarySection)) {
				proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, T);
			} else if (cycl_value.eql($$CycProofViewJustificationSection)) {
				proof_view_set_include_justification_sectionP(v_proof_view, T);
			} else if (cycl_value.eql($$CycProofViewLinearSection)) {
				proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, T);
			} else {
				proof_view_populator.proof_view_set_include_special_sectionP(v_proof_view, cycl_value, T);
			}

		} else if (cycl_param.eql($$showAssertionBookkeeping)) {
			proof_view_set_suppress_assertion_bookkeepingP(v_proof_view, eql(cycl_value, $$False));
		} else if (cycl_param.eql($$showAssertionDates)) {
			proof_view_set_suppress_assertion_datesP(v_proof_view, eql(cycl_value, $$False));
		} else if (cycl_param.eql($$showAssertionCyclists)) {
			proof_view_set_suppress_assertion_cyclistsP(v_proof_view, eql(cycl_value, $$False));
		} else if (cycl_param.eql($$showAssertionCyclistEmployers)) {
			proof_view_set_suppress_assertion_cyclist_employersP(v_proof_view, eql(cycl_value, $$False));
		} else {
			Errors.error($str132$Don_t_know_how_to_set_proof_view_, cycl_param, cycl_value);
		}

		return v_proof_view;
	}

	public static SubLObject proof_view_property_value_from_cycl(final SubLObject cycl_value) {
		if (cycl_value.eql($$True)) {
			return T;
		}
		if (cycl_value.eql($$False)) {
			return NIL;
		}
		return cycl_value;
	}

	public static SubLObject proof_view_get_addressee(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return proof_view_get_property(v_proof_view, $ADDRESSEE, pph_vars.$pph_addressee$.getDynamicValue(thread));
	}

	public static SubLObject proof_view_set_addressee(final SubLObject v_proof_view, final SubLObject addressee) {
		assert NIL != cycl_grammar.cycl_denotational_term_p(addressee) : "cycl_grammar.cycl_denotational_term_p(addressee) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(addressee) " + addressee;
		return proof_view_set_property(v_proof_view, $ADDRESSEE, addressee);
	}

	public static SubLObject proof_view_get_include_rules_sectionP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw136$INCLUDE_RULES_SECTION_, T);
	}

	public static SubLObject proof_view_set_include_rules_sectionP(final SubLObject v_proof_view, final SubLObject include_rules_sectionP) {
		assert NIL != booleanp(include_rules_sectionP) : "Types.booleanp(include_rules_sectionP) " + "CommonSymbols.NIL != Types.booleanp(include_rules_sectionP) " + include_rules_sectionP;
		return proof_view_set_property(v_proof_view, $kw136$INCLUDE_RULES_SECTION_, include_rules_sectionP);
	}

	public static SubLObject proof_view_get_include_justification_sectionP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw138$INCLUDE_JUSTIFICATION_SECTION_, T);
	}

	public static SubLObject proof_view_set_include_justification_sectionP(final SubLObject v_proof_view, final SubLObject include_justification_sectionP) {
		assert NIL != booleanp(include_justification_sectionP) : "Types.booleanp(include_justification_sectionP) " + "CommonSymbols.NIL != Types.booleanp(include_justification_sectionP) " + include_justification_sectionP;
		return proof_view_set_property(v_proof_view, $kw138$INCLUDE_JUSTIFICATION_SECTION_, include_justification_sectionP);
	}

	public static SubLObject proof_view_get_enable_debugP(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return proof_view_get_property(v_proof_view, $kw139$ENABLE_DEBUG_, $proof_view_debugP$.getDynamicValue(thread));
	}

	public static SubLObject proof_view_set_enable_debugP(final SubLObject v_proof_view, final SubLObject enable_debugP) {
		assert NIL != booleanp(enable_debugP) : "Types.booleanp(enable_debugP) " + "CommonSymbols.NIL != Types.booleanp(enable_debugP) " + enable_debugP;
		return proof_view_set_property(v_proof_view, $kw139$ENABLE_DEBUG_, enable_debugP);
	}

	public static SubLObject proof_view_set_show_cb_bug_report_linksP(final SubLObject v_proof_view, final SubLObject show_linksP) {
		assert NIL != booleanp(show_linksP) : "Types.booleanp(show_linksP) " + "CommonSymbols.NIL != Types.booleanp(show_linksP) " + show_linksP;
		return proof_view_set_property(v_proof_view, $kw140$SHOW_CB_BUG_REPORT_LINKS_, show_linksP);
	}

	public static SubLObject proof_view_get_show_cb_bug_report_linksP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw140$SHOW_CB_BUG_REPORT_LINKS_, NIL);
	}

	public static SubLObject proof_view_get_include_cycl_in_outputP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw141$INCLUDE_CYCL_IN_OUTPUT_, T);
	}

	public static SubLObject proof_view_set_include_cycl_in_outputP(final SubLObject v_proof_view, final SubLObject include_cycl_in_outputP) {
		assert NIL != booleanp(include_cycl_in_outputP) : "Types.booleanp(include_cycl_in_outputP) " + "CommonSymbols.NIL != Types.booleanp(include_cycl_in_outputP) " + include_cycl_in_outputP;
		return proof_view_set_property(v_proof_view, $kw141$INCLUDE_CYCL_IN_OUTPUT_, include_cycl_in_outputP);
	}

	public static SubLObject proof_view_get_include_sourcesP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw142$INCLUDE_SOURCES_, T);
	}

	public static SubLObject proof_view_set_link_phrasesP(final SubLObject v_proof_view, final SubLObject link_phrasesP) {
		return proof_view_set_property(v_proof_view, $kw143$LINK_PHRASES_, link_phrasesP);
	}

	public static SubLObject proof_view_get_link_phrasesP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw143$LINK_PHRASES_, NIL);
	}

	public static SubLObject proof_view_include_sources_spec_p(final SubLObject obj) {
		return makeBoolean((NIL != booleanp(obj)) || obj.eql($SUMMARY_ONLY));
	}

	public static SubLObject proof_view_set_include_sourcesP(final SubLObject v_proof_view, final SubLObject include_sourcesP) {
		assert NIL != proof_view_include_sources_spec_p(include_sourcesP) : "proof_view.proof_view_include_sources_spec_p(include_sourcesP) " + "CommonSymbols.NIL != proof_view.proof_view_include_sources_spec_p(include_sourcesP) " + include_sourcesP;
		return proof_view_set_property(v_proof_view, $kw142$INCLUDE_SOURCES_, include_sourcesP);
	}

	public static SubLObject proof_view_entry_get_include_sourcesP(final SubLObject entry) {
		final SubLObject v_proof_view = proof_view_entry_get_proof_view(entry);
		final SubLObject spec = proof_view_get_include_sourcesP(v_proof_view);
		return makeBoolean((NIL != list_utilities.sublisp_boolean(spec)) && ((!spec.eql($SUMMARY_ONLY)) || (NIL != proof_view_entry_has_ancestorP(entry, proof_view_summary.proof_view_get_summary_root(v_proof_view), UNPROVIDED))));
	}

	public static SubLObject proof_view_get_include_cycml_in_xmlP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw146$INCLUDE_CYCML_IN_XML_, NIL);
	}

	public static SubLObject proof_view_set_include_cycml_in_xmlP(final SubLObject v_proof_view, final SubLObject include_cycml_in_xmlP) {
		assert NIL != booleanp(include_cycml_in_xmlP) : "Types.booleanp(include_cycml_in_xmlP) " + "CommonSymbols.NIL != Types.booleanp(include_cycml_in_xmlP) " + include_cycml_in_xmlP;
		return proof_view_set_property(v_proof_view, $kw146$INCLUDE_CYCML_IN_XML_, include_cycml_in_xmlP);
	}

	public static SubLObject proof_view_get_include_silkP(final SubLObject v_proof_view) {
		return NIL;
	}

	public static SubLObject proof_view_set_include_silkP(final SubLObject v_proof_view, final SubLObject include_silkP) {
		assert NIL != booleanp(include_silkP) : "Types.booleanp(include_silkP) " + "CommonSymbols.NIL != Types.booleanp(include_silkP) " + include_silkP;
		if (NIL != include_silkP) {
			Errors.error($str147$SILK_not_supported_in_non_Cyc_HAL);
			return NIL;
		}
		return v_proof_view;
	}

	public static SubLObject proof_view_get_suppress_assertion_bookkeepingP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_, NIL);
	}

	public static SubLObject proof_view_set_suppress_assertion_bookkeepingP(final SubLObject v_proof_view, final SubLObject suppress_assertion_bookkeepingP) {
		assert NIL != booleanp(suppress_assertion_bookkeepingP) : "Types.booleanp(suppress_assertion_bookkeepingP) " + "CommonSymbols.NIL != Types.booleanp(suppress_assertion_bookkeepingP) " + suppress_assertion_bookkeepingP;
		return proof_view_set_property(v_proof_view, $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_, suppress_assertion_bookkeepingP);
	}

	public static SubLObject proof_view_get_suppress_assertion_cyclistsP(final SubLObject v_proof_view) {
		return makeBoolean((NIL != proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) || (NIL != proof_view_get_property(v_proof_view, $kw149$SUPPRESS_ASSERTION_CYCLISTS_, NIL)));
	}

	public static SubLObject proof_view_set_suppress_assertion_cyclistsP(final SubLObject v_proof_view, final SubLObject suppress_assertion_cyclistsP) {
		assert NIL != booleanp(suppress_assertion_cyclistsP) : "Types.booleanp(suppress_assertion_cyclistsP) " + "CommonSymbols.NIL != Types.booleanp(suppress_assertion_cyclistsP) " + suppress_assertion_cyclistsP;
		return proof_view_set_property(v_proof_view, $kw149$SUPPRESS_ASSERTION_CYCLISTS_, suppress_assertion_cyclistsP);
	}

	public static SubLObject proof_view_get_suppress_assertion_cyclist_employersP(final SubLObject v_proof_view) {
		return makeBoolean((NIL != proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) || (NIL != proof_view_get_property(v_proof_view, $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_, NIL)));
	}

	public static SubLObject proof_view_set_suppress_assertion_cyclist_employersP(final SubLObject v_proof_view, final SubLObject suppress_assertion_cyclist_employersP) {
		assert NIL != booleanp(suppress_assertion_cyclist_employersP) : "Types.booleanp(suppress_assertion_cyclist_employersP) " + "CommonSymbols.NIL != Types.booleanp(suppress_assertion_cyclist_employersP) " + suppress_assertion_cyclist_employersP;
		return proof_view_set_property(v_proof_view, $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_, suppress_assertion_cyclist_employersP);
	}

	public static SubLObject proof_view_get_suppress_assertion_datesP(final SubLObject v_proof_view) {
		return makeBoolean((NIL != proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) || (NIL != proof_view_get_property(v_proof_view, $kw151$SUPPRESS_ASSERTION_DATES_, NIL)));
	}

	public static SubLObject proof_view_set_suppress_assertion_datesP(final SubLObject v_proof_view, final SubLObject suppress_assertion_datesP) {
		assert NIL != booleanp(suppress_assertion_datesP) : "Types.booleanp(suppress_assertion_datesP) " + "CommonSymbols.NIL != Types.booleanp(suppress_assertion_datesP) " + suppress_assertion_datesP;
		return proof_view_set_property(v_proof_view, $kw151$SUPPRESS_ASSERTION_DATES_, suppress_assertion_datesP);
	}

	public static SubLObject proof_view_get_allow_external_linksP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw152$ALLOW_EXTERNAL_LINKS_, T);
	}

	public static SubLObject proof_view_set_allow_external_linksP(final SubLObject v_proof_view, final SubLObject allow_external_linksP) {
		assert NIL != booleanp(allow_external_linksP) : "Types.booleanp(allow_external_linksP) " + "CommonSymbols.NIL != Types.booleanp(allow_external_linksP) " + allow_external_linksP;
		return proof_view_set_property(v_proof_view, $kw152$ALLOW_EXTERNAL_LINKS_, allow_external_linksP);
	}

	public static SubLObject proof_view_get_allow_internal_linksP(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $kw153$ALLOW_INTERNAL_LINKS_, NIL);
	}

	public static SubLObject proof_view_set_allow_internal_linksP(final SubLObject v_proof_view, final SubLObject allow_internal_linksP) {
		assert NIL != booleanp(allow_internal_linksP) : "Types.booleanp(allow_internal_linksP) " + "CommonSymbols.NIL != Types.booleanp(allow_internal_linksP) " + allow_internal_linksP;
		return proof_view_set_property(v_proof_view, $kw153$ALLOW_INTERNAL_LINKS_, allow_internal_linksP);
	}

	public static SubLObject proof_view_get_language_mt(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return proof_view_get_property(v_proof_view, $LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue(thread));
	}

	public static SubLObject proof_view_set_language_mt(final SubLObject v_proof_view, final SubLObject language_mt) {
		assert NIL != hlmt.hlmtP(language_mt) : "hlmt.hlmtP(language_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(language_mt) " + language_mt;
		return proof_view_set_property(v_proof_view, $LANGUAGE_MT, language_mt);
	}

	public static SubLObject proof_view_get_domain_mt(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != proof_view_has_propertyP(v_proof_view, $DOMAIN_MT)) {
			return proof_view_get_property(v_proof_view, $DOMAIN_MT, UNPROVIDED);
		}
		final SubLObject inference_answer = proof_view_get_answer(v_proof_view);
		final SubLObject inference = (NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) ? inference_datastructures_inference.inference_answer_inference(inference_answer) : NIL;
		final SubLObject inference_mt = (NIL != inference_datastructures_inference.inference_p(inference)) ? pph_proof.pph_get_inference_mt(inference) : NIL;
		return NIL != inference_mt ? pph_methods.pph_enhanced_domain_mt(inference_mt, UNPROVIDED) : pph_vars.$pph_domain_mt$.getDynamicValue(thread);
	}

	public static SubLObject proof_view_set_domain_mt(final SubLObject v_proof_view, final SubLObject domain_mt) {
		assert NIL != hlmt.hlmtP(domain_mt) : "hlmt.hlmtP(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(domain_mt) " + domain_mt;
		return proof_view_set_property(v_proof_view, $DOMAIN_MT, domain_mt);
	}

	public static SubLObject proof_view_get_creation_universal_time(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $CREATION_UNIVERSAL_TIME, UNPROVIDED);
	}

	public static SubLObject proof_view_set_creation_universal_time(final SubLObject v_proof_view, SubLObject universal_time) {
		if (universal_time == UNPROVIDED) {
			universal_time = get_universal_time();
		}
		assert NIL != numeric_date_utilities.universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
		return proof_view_set_property(v_proof_view, $CREATION_UNIVERSAL_TIME, universal_time);
	}

	public static SubLObject proof_view_get_populated_universal_time(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $POPULATED_UNIVERSAL_TIME, UNPROVIDED);
	}

	public static SubLObject proof_view_get_displayed_universal_time(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $DISPLAYED_UNIVERSAL_TIME, UNPROVIDED);
	}

	public static SubLObject proof_view_set_displayed_universal_time(final SubLObject v_proof_view, SubLObject universal_time) {
		if (universal_time == UNPROVIDED) {
			universal_time = get_universal_time();
		}
		assert NIL != numeric_date_utilities.universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
		return proof_view_set_property(v_proof_view, $DISPLAYED_UNIVERSAL_TIME, universal_time);
	}

	public static SubLObject proof_view_set_preparer_thread(final SubLObject v_proof_view, SubLObject thread) {
		if (thread == UNPROVIDED) {
			thread = current_process();
		}
		assert NIL != processp(thread) : "Types.processp(thread) " + "CommonSymbols.NIL != Types.processp(thread) " + thread;
		return proof_view_set_property(v_proof_view, $PREPARER_THREAD, thread);
	}

	public static SubLObject proof_view_get_preparer_thread(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $PREPARER_THREAD, UNPROVIDED);
	}

	public static SubLObject proof_view_get_error_output(final SubLObject v_proof_view) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		return proof_view_get_property(v_proof_view, $ERROR_OUTPUT, $str0$);
	}

	public static SubLObject proof_view_has_propertyP(final SubLObject v_proof_view, final SubLObject property) {
		return list_utilities.plist_has_keyP(proof_view_int_properties(v_proof_view), property);
	}

	public static SubLObject proof_view_set_property(final SubLObject v_proof_view, final SubLObject property, final SubLObject value) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
		final SubLObject existing = proof_view_int_properties(v_proof_view);
		final SubLObject v_new = putf(existing, property, value);
		_csetf_proof_view_int_properties(v_proof_view, v_new);
		return v_new;
	}

	public static SubLObject proof_view_get_property(final SubLObject v_proof_view, final SubLObject property, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
		return getf(proof_view_int_properties(v_proof_view), property, v_default);
	}

	public static SubLObject proof_view_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		proof_view_entry_int_print(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject proof_view_entry_p(final SubLObject v_object) {
		return v_object.getJavaClass() ==$proof_view_entry_native.class ? T : NIL;
	}

	public static SubLObject proof_view_entry_int_id(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject proof_view_entry_int_parent_id(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject proof_view_entry_int_label(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField4();
	}

	public static SubLObject proof_view_entry_int_object_type(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField5();
	}

	public static SubLObject proof_view_entry_int_object(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField6();
	}

	public static SubLObject proof_view_entry_int_proof_view(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField7();
	}

	public static SubLObject proof_view_entry_int_properties(final SubLObject v_object) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.getField8();
	}

	public static SubLObject _csetf_proof_view_entry_int_id(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_proof_view_entry_int_parent_id(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_proof_view_entry_int_label(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_proof_view_entry_int_object_type(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField5(value);
	}

	public static SubLObject _csetf_proof_view_entry_int_object(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField6(value);
	}

	public static SubLObject _csetf_proof_view_entry_int_proof_view(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField7(value);
	}

	public static SubLObject _csetf_proof_view_entry_int_properties(final SubLObject v_object, final SubLObject value) {
		assert NIL != proof_view_entry_p(v_object) : "proof_view.proof_view_entry_p error :" + v_object;
		return v_object.setField8(value);
	}

	public static SubLObject make_proof_view_entry(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $proof_view_entry_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($ID)) {
				_csetf_proof_view_entry_int_id(v_new, current_value);
			} else if (pcase_var.eql($PARENT_ID)) {
				_csetf_proof_view_entry_int_parent_id(v_new, current_value);
			} else if (pcase_var.eql($LABEL)) {
				_csetf_proof_view_entry_int_label(v_new, current_value);
			} else if (pcase_var.eql($OBJECT_TYPE)) {
				_csetf_proof_view_entry_int_object_type(v_new, current_value);
			} else if (pcase_var.eql($OBJECT)) {
				_csetf_proof_view_entry_int_object(v_new, current_value);
			} else if (pcase_var.eql($PROOF_VIEW)) {
				_csetf_proof_view_entry_int_proof_view(v_new, current_value);
			} else if (pcase_var.eql($PROPERTIES)) {
				_csetf_proof_view_entry_int_properties(v_new, current_value);
			} else {
				Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_proof_view_entry(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_PROOF_VIEW_ENTRY, SEVEN_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $ID, proof_view_entry_int_id(obj));
		funcall(visitor_fn, obj, $SLOT, $PARENT_ID, proof_view_entry_int_parent_id(obj));
		funcall(visitor_fn, obj, $SLOT, $LABEL, proof_view_entry_int_label(obj));
		funcall(visitor_fn, obj, $SLOT, $OBJECT_TYPE, proof_view_entry_int_object_type(obj));
		funcall(visitor_fn, obj, $SLOT, $OBJECT, proof_view_entry_int_object(obj));
		funcall(visitor_fn, obj, $SLOT, $PROOF_VIEW, proof_view_entry_int_proof_view(obj));
		funcall(visitor_fn, obj, $SLOT, $PROPERTIES, proof_view_entry_int_properties(obj));
		funcall(visitor_fn, obj, $END, MAKE_PROOF_VIEW_ENTRY, SEVEN_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_proof_view_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_proof_view_entry(obj, visitor_fn);
	}

	public static SubLObject valid_proof_view_entry_p(final SubLObject v_object) {
		return makeBoolean((NIL != proof_view_entry_p(v_object)) && proof_view_entry_int_id(v_object).isInteger());
	}

	public static SubLObject proof_view_entry_int_print(final SubLObject proof_view_entry, final SubLObject stream, final SubLObject depth) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		write_string($str195$__PROOF_VIEW_ENTRY_, stream, UNPROVIDED, UNPROVIDED);
		format(stream, $str196$_D__D, proof_view_int_id(proof_view_entry_int_proof_view(proof_view_entry)), proof_view_entry_int_id(proof_view_entry));
		write_string($str197$_label_, stream, UNPROVIDED, UNPROVIDED);
		prin1(proof_view_entry_int_label(proof_view_entry), stream);
		write_string($str45$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject destroy_proof_view_entry(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		if (NIL != valid_proof_view_entry_p(proof_view_entry)) {
			final SubLObject id = proof_view_entry_get_id(proof_view_entry);
			final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
			final SubLObject v_id_index = proof_view_get_id_index(v_proof_view);
			try {
				destroy_proof_view_entry_int(proof_view_entry);
			} finally {
				final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
				try {
					bind($is_thread_performing_cleanupP$, T);
					final SubLObject _values = getValuesAsVector();
					id_index_remove(v_id_index, id);
					restoreValuesFromVector(_values);
				} finally {
					rebind($is_thread_performing_cleanupP$, _prev_bind_0);
				}
			}
		}
		return NIL;
	}

	public static SubLObject destroy_proof_view_entry_int(final SubLObject proof_view_entry) {
		_csetf_proof_view_entry_int_id(proof_view_entry, $FREE);
		_csetf_proof_view_entry_int_proof_view(proof_view_entry, $FREE);
		_csetf_proof_view_entry_int_parent_id(proof_view_entry, $FREE);
		_csetf_proof_view_entry_int_label(proof_view_entry, $FREE);
		_csetf_proof_view_entry_int_object_type(proof_view_entry, $FREE);
		_csetf_proof_view_entry_int_object(proof_view_entry, $FREE);
		_csetf_proof_view_entry_int_properties(proof_view_entry, $FREE);
		return NIL;
	}

	public static SubLObject proof_view_get_root_entry(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject root = find_proof_view_entry_by_id(v_proof_view, $proof_view_root_entry_id$.getGlobalValue());
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == proof_view_entry_p(root))) {
			Errors.error($str198$_S_has_no_root_entry___, v_proof_view);
		}
		return root;
	}

	public static SubLObject proof_view_count_entries_with_values(final SubLObject v_proof_view, final SubLObject label, final SubLObject parent_proof_view_entry, final SubLObject object_type, final SubLObject v_object, final SubLObject v_properties) {
		final SubLObject valid_parentP = valid_proof_view_entry_p(parent_proof_view_entry);
		SubLObject count = ZERO_INTEGER;
		final SubLObject idx = proof_view_get_id_index(v_proof_view);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$8 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$8);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject entry_id;
				SubLObject existing;
				SubLObject existing_parent_id;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					entry_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					existing = aref(vector_var, entry_id);
					if ((NIL == id_index_tombstone_p(existing)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(existing)) {
							existing = $SKIP;
						}
						existing_parent_id = proof_view_entry_get_parent_id(existing);
						if (((label.equal(proof_view_entry_get_label(existing)) && (NIL != (NIL != valid_parentP ? eq(proof_view_entry_get_id(parent_proof_view_entry), existing_parent_id) : sublisp_null(existing_parent_id)))) && object_type.eql(proof_view_entry_get_object_type(existing))) && v_object.equal(proof_view_entry_get_object(existing))) {
							count = add(count, ONE_INTEGER);
						}
					}
				}
			}
			final SubLObject idx_$9 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$9)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$9);
				SubLObject entry_id2 = NIL;
				SubLObject existing2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						entry_id2 = getEntryKey(cdohash_entry);
						existing2 = getEntryValue(cdohash_entry);
						final SubLObject existing_parent_id2 = proof_view_entry_get_parent_id(existing2);
						if (((label.equal(proof_view_entry_get_label(existing2)) && (NIL != (NIL != valid_parentP ? eq(proof_view_entry_get_id(parent_proof_view_entry), existing_parent_id2) : sublisp_null(existing_parent_id2)))) && object_type.eql(proof_view_entry_get_object_type(existing2))) && v_object.equal(proof_view_entry_get_object(existing2))) {
							count = add(count, ONE_INTEGER);
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return count;
	}

	public static SubLObject proof_view_has_entry_for_objectP(final SubLObject v_proof_view, final SubLObject v_object, final SubLObject parent_proof_view_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject valid_parentP = valid_proof_view_entry_p(parent_proof_view_entry);
		SubLObject foundP = NIL;
		final SubLObject idx = proof_view_get_id_index(v_proof_view);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$10 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$10);
				final SubLObject backwardP_var = NIL;
				final SubLObject length = length(vector_var);
				SubLObject current;
				final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
				SubLObject start = NIL;
				SubLObject end = NIL;
				SubLObject delta = NIL;
				destructuring_bind_must_consp(current, datum, $list199);
				start = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list199);
				end = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list199);
				delta = current.first();
				current = current.rest();
				if (NIL == current) {
					if (NIL == foundP) {
						SubLObject end_var;
						SubLObject entry_id;
						SubLObject existing;
						SubLObject existing_parent_id;
						for (end_var = end, entry_id = NIL, entry_id = start; (NIL == foundP) && (NIL == subl_macros.do_numbers_endtest(entry_id, delta, end_var)); entry_id = add(entry_id, delta)) {
							existing = aref(vector_var, entry_id);
							if ((NIL == id_index_tombstone_p(existing)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
								if (NIL != id_index_tombstone_p(existing)) {
									existing = $SKIP;
								}
								existing_parent_id = proof_view_entry_get_parent_id(existing);
								if ((NIL != (NIL != valid_parentP ? eq(proof_view_entry_get_id(parent_proof_view_entry), existing_parent_id) : sublisp_null(existing_parent_id))) && v_object.equal(proof_view_entry_get_object(existing))) {
									foundP = T;
								}
							}
						}
					}
				} else {
					cdestructuring_bind_error(datum, $list199);
				}
			}
			final SubLObject idx_$11 = idx;
			if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) && (NIL == foundP)) {
				SubLObject catch_var = NIL;
				try {
					thread.throwStack.push($DO_HASH_TABLE);
					final SubLObject cdohash_table = id_index_sparse_objects(idx_$11);
					SubLObject entry_id2 = NIL;
					SubLObject existing2 = NIL;
					final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
					try {
						while (iteratorHasNext(cdohash_iterator)) {
							final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
							entry_id2 = getEntryKey(cdohash_entry);
							existing2 = getEntryValue(cdohash_entry);
							subl_macros.do_hash_table_done_check(foundP);
							final SubLObject existing_parent_id2 = proof_view_entry_get_parent_id(existing2);
							if ((NIL != (NIL != valid_parentP ? eq(proof_view_entry_get_id(parent_proof_view_entry), existing_parent_id2) : sublisp_null(existing_parent_id2))) && v_object.equal(proof_view_entry_get_object(existing2))) {
								foundP = T;
							}
						}
					} finally {
						releaseEntrySetIterator(cdohash_iterator);
					}
				} catch (final Throwable ccatch_env_var) {
					catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
				} finally {
					thread.throwStack.pop();
				}
			}
		}
		return foundP;
	}

	public static SubLObject find_proof_view_entry_by_id(final SubLObject v_proof_view, final SubLObject proof_view_entry_id) {
		assert NIL != valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		final SubLObject v_id_index = proof_view_get_id_index(v_proof_view);
		return id_index_lookup(v_id_index, proof_view_entry_id, UNPROVIDED);
	}

	public static SubLObject find_proof_view_entry_by_ids(final SubLObject proof_view_id, final SubLObject proof_view_entry_id) {
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		final SubLObject v_proof_view = find_proof_view_by_id(proof_view_id);
		return NIL != valid_proof_view_p(v_proof_view) ? find_proof_view_entry_by_id(v_proof_view, proof_view_entry_id) : NIL;
	}

	public static SubLObject proof_view_entry_get_id(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return proof_view_entry_int_id(proof_view_entry);
	}

	public static SubLObject proof_view_entry_get_parent_id(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return proof_view_entry_int_parent_id(proof_view_entry);
	}

	public static SubLObject proof_view_entry_get_path_string(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		SubLObject stack = list(proof_view_entry_get_id(proof_view_entry));
		final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
		SubLObject parent_id = proof_view_entry_get_parent_id(proof_view_entry);
		SubLObject parent = (NIL != parent_id) ? find_proof_view_entry_by_id(v_proof_view, parent_id) : NIL;
		SubLObject path_string = NIL;
		while (NIL != parent_id) {
			stack = cons(parent_id, stack);
			parent_id = proof_view_entry_get_parent_id(parent);
			parent = (NIL != parent_id) ? find_proof_view_entry_by_id(v_proof_view, parent_id) : NIL;
		}
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			while (NIL == list_utilities.empty_list_p(stack)) {
				princ(stack.first(), stream);
				stack = stack.rest();
				if (NIL == list_utilities.empty_list_p(stack)) {
					princ($str202$_, stream);
				}
			}
			path_string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
				bind($is_thread_performing_cleanupP$, T);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return path_string;
	}

	public static SubLObject proof_view_entry_set_parent_id(final SubLObject proof_view_entry, final SubLObject parent_id) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		assert NIL != subl_promotions.non_negative_integer_p(parent_id) : "subl_promotions.non_negative_integer_p(parent_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parent_id) " + parent_id;
		_csetf_proof_view_entry_int_parent_id(proof_view_entry, parent_id);
		return parent_id;
	}

	public static SubLObject proof_view_entry_set_label(final SubLObject proof_view_entry, final SubLObject label) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		assert NIL != stringp(label) : "Types.stringp(label) " + "CommonSymbols.NIL != Types.stringp(label) " + label;
		_csetf_proof_view_entry_int_label(proof_view_entry, label);
		return label;
	}

	public static SubLObject proof_view_entry_get_proof_view(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return proof_view_entry_int_proof_view(proof_view_entry);
	}

	public static SubLObject proof_view_entry_has_ancestorP(final SubLObject descendent_entry, final SubLObject ancestor_entry, SubLObject include_selfP) {
		if (include_selfP == UNPROVIDED) {
			include_selfP = NIL;
		}
		if ((NIL != include_selfP) && descendent_entry.eql(ancestor_entry)) {
			return T;
		}
		final SubLObject parent_id = proof_view_entry_get_parent_id(descendent_entry);
		final SubLObject parent = (NIL != parent_id) ? find_proof_view_entry_by_id(proof_view_entry_get_proof_view(descendent_entry), parent_id) : NIL;
		return makeBoolean((NIL != parent) && (NIL != proof_view_entry_has_ancestorP(parent, ancestor_entry, T)));
	}

	public static SubLObject proof_view_entry_get_label(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return proof_view_entry_int_label(proof_view_entry);
	}

	public static SubLObject proof_view_entry_get_object_type(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return proof_view_entry_int_object_type(proof_view_entry);
	}

	public static SubLObject proof_view_entry_set_object_type(final SubLObject proof_view_entry, final SubLObject type) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		assert NIL != symbolp(type) : "Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) " + type;
		_csetf_proof_view_entry_int_object_type(proof_view_entry, type);
		return type;
	}

	public static SubLObject proof_view_entry_get_object(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return proof_view_entry_int_object(proof_view_entry);
	}

	public static SubLObject proof_view_entry_get_property(final SubLObject proof_view_entry, final SubLObject property, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
		return getf(proof_view_entry_int_properties(proof_view_entry), property, v_default);
	}

	public static SubLObject proof_view_entry_set_property(final SubLObject proof_view_entry, final SubLObject property, final SubLObject value) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
		_csetf_proof_view_entry_int_properties(proof_view_entry, putf(proof_view_entry_int_properties(proof_view_entry), property, value));
		return proof_view_entry;
	}

	public static SubLObject proof_view_entry_rem_property(final SubLObject proof_view_entry, final SubLObject property) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
		return remf(proof_view_entry_int_properties(proof_view_entry), property);
	}

	public static SubLObject proof_view_entryL(final SubLObject proof_view_entry1, final SubLObject proof_view_entry2) {
		assert NIL != proof_view_entry_p(proof_view_entry1) : "proof_view.proof_view_entry_p(proof_view_entry1) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry1) " + proof_view_entry1;
		assert NIL != proof_view_entry_p(proof_view_entry2) : "proof_view.proof_view_entry_p(proof_view_entry2) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry2) " + proof_view_entry2;
		final SubLObject proof_view_entry1_id = proof_view_entry_get_id(proof_view_entry1);
		final SubLObject proof_view_entry2_id = proof_view_entry_get_id(proof_view_entry2);
		if (proof_view_entry1_id.numL(proof_view_entry2_id)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject proof_view_warn(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject format_string = NIL;
		destructuring_bind_must_consp(current, datum, $list206);
		format_string = current.first();
		final SubLObject args;
		current = args = current.rest();
		return list(PWHEN, $sym208$_PROOF_VIEW_DEBUG__, listS(WARN, format_string, args));
	}

	public static SubLObject proof_view_info(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject format_string = NIL;
		destructuring_bind_must_consp(current, datum, $list206);
		format_string = current.first();
		final SubLObject args;
		current = args = current.rest();
		return list(PWHEN, $sym208$_PROOF_VIEW_DEBUG__, listS(FORCE_FORMAT, T, format_string, args));
	}

	public static SubLObject proof_view_entry_get_children(final SubLObject proof_view_entry) {
		return proof_view_entry_get_property(proof_view_entry, $CHILDREN, UNPROVIDED);
	}

	public static SubLObject proof_view_entry_more_generalP(final SubLObject general_entry, final SubLObject specific_entry) {
		return numL(proof_view_entry_specificity(general_entry), proof_view_entry_specificity(specific_entry));
	}

	public static SubLObject proof_view_entry_specificity_internal(final SubLObject entry) {
		final SubLObject query_sentence = proof_view_entry_get_object(proof_view_get_query_root(proof_view_entry_get_proof_view(entry)));
		final SubLObject entry_object = proof_view_entry_get_object(entry);
		SubLObject score = ZERO_INTEGER;
		if ((NIL != assertion_handles.assertion_p(entry_object)) && (NIL != assertions_high.rule_assertionP(entry_object))) {
			return MINUS_ONE_INTEGER;
		}
		SubLObject cdolist_list_var;
		final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(query_sentence, $IGNORE);
		SubLObject v_term = NIL;
		v_term = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != cycl_utilities.expression_find(v_term, entry_object, T, symbol_function(EQUAL), UNPROVIDED)) {
				score = add(score, ONE_INTEGER);
			}
			cdolist_list_var = cdolist_list_var.rest();
			v_term = cdolist_list_var.first();
		}
		return score;
	}

	public static SubLObject proof_view_entry_specificity(final SubLObject entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_entry_specificity_internal(entry);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_ENTRY_SPECIFICITY, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_ENTRY_SPECIFICITY, ONE_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_ENTRY_SPECIFICITY, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, entry, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_entry_specificity_internal(entry)));
			memoization_state.caching_state_put(caching_state, entry, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_view_count_entries(final SubLObject root) {
		SubLObject count = ONE_INTEGER;
		SubLObject cdolist_list_var = proof_view_entry_get_children(root);
		SubLObject child = NIL;
		child = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			count = add(count, proof_view_count_entries(child));
			cdolist_list_var = cdolist_list_var.rest();
			child = cdolist_list_var.first();
		}
		return count;
	}

	public static SubLObject proof_view_entry_top_level_p(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return sublisp_null(proof_view_entry_get_parent_id(proof_view_entry));
	}

	public static SubLObject proof_view_entry_get_depth_internal(final SubLObject entry) {
		final SubLObject v_proof_view = proof_view_entry_get_proof_view(entry);
		final SubLObject parent_id = proof_view_entry_get_parent_id(entry);
		final SubLObject parent = (NIL != parent_id) ? find_proof_view_entry_by_id(v_proof_view, parent_id) : NIL;
		return NIL != parent ? number_utilities.f_1X(proof_view_entry_get_depth(parent)) : ZERO_INTEGER;
	}

	public static SubLObject proof_view_entry_get_depth(final SubLObject entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_entry_get_depth_internal(entry);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_ENTRY_GET_DEPTH, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_ENTRY_GET_DEPTH, ONE_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_ENTRY_GET_DEPTH, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, entry, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_entry_get_depth_internal(entry)));
			memoization_state.caching_state_put(caching_state, entry, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_view_entry_expand_intiallyP(final SubLObject proof_view_entry) {
		return proof_view_entry_get_property(proof_view_entry, $kw215$EXPAND_INITIALLY_, UNPROVIDED);
	}

	public static SubLObject proof_view_entry_get_sources(final SubLObject proof_view_entry) {
		return proof_view_entry_get_property(proof_view_entry, $SOURCES, UNPROVIDED);
	}

	public static SubLObject proof_view_entry_get_proof(SubLObject entry, SubLObject inherit_from_parentP) {
		if (inherit_from_parentP == UNPROVIDED) {
			inherit_from_parentP = NIL;
		}
		SubLObject proof = proof_view_entry_get_property(entry, $PROOF, NIL);
		for (final SubLObject v_proof_view = proof_view_entry_get_proof_view(entry); ((NIL == proof) && (NIL != inherit_from_parentP)) && (NIL != proof_view_entry_get_parent_id(entry)); entry = find_proof_view_entry_by_id(v_proof_view, proof_view_entry_get_parent_id(entry)), proof = proof_view_entry_get_property(entry, $PROOF, NIL)) {
		}
		return proof;
	}

	public static SubLObject proof_view_entry_set_proof(final SubLObject entry, final SubLObject proof) {
		return proof_view_entry_set_property(entry, $PROOF, proof);
	}

	public static SubLObject proof_view_entry_get_function(final SubLObject entry) {
		return proof_view_entry_get_property(entry, $FN, NIL);
	}

	public static SubLObject proof_view_entry_get_function_section(final SubLObject entry) {
		return proof_view_entry_get_property(entry, $FN_SECTION, NIL);
	}

	public static SubLObject proof_view_set_highlight_phrase_demeritsP(final SubLObject v_proof_view, final SubLObject highlightP) {
		return proof_view_set_property(v_proof_view, $kw219$HIGHLIGHT_PHRASE_DEMERITS_, highlightP);
	}

	public static SubLObject proof_view_get_highlight_phrase_demeritsP(final SubLObject v_proof_view) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return proof_view_get_property(v_proof_view, $kw219$HIGHLIGHT_PHRASE_DEMERITS_, $highlight_demerits_in_generated_phrasesP$.getDynamicValue(thread));
	}

	public static SubLObject register_proof_view_entry_shower(final SubLObject fn) {
		if (NIL == member(fn, $proof_view_entry_showers$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
			$proof_view_entry_showers$.setGlobalValue(cons(fn, $proof_view_entry_showers$.getGlobalValue()));
		}
		return fn;
	}

	public static SubLObject proof_view_entry_showers() {
		return $proof_view_entry_showers$.getGlobalValue();
	}

	public static SubLObject proof_view_entry_generate_cycl(final SubLObject proof_view_entry) {
		final SubLObject v_object = proof_view_entry_get_object(proof_view_entry);
		SubLObject cycl = NIL;
		if (NIL != proof_view_entry_p(proof_view_entry)) {
			final SubLObject pcase_var = proof_view_entry_get_object_type(proof_view_entry);
			if (pcase_var.eql(SUPPORT_P) || pcase_var.eql(ASSERTION_P)) {
				cycl = pph_proof.pph_support_sentence(v_object, UNPROVIDED);
			} else {
				cycl = v_object;
			}
		}
		return cycl;
	}

	public static SubLObject generate_html_from_proof_view_entry_ids(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject allow_external_linksP, SubLObject allow_internal_linksP, SubLObject language_mt) {
		if (allow_external_linksP == UNPROVIDED) {
			allow_external_linksP = T;
		}
		if (allow_internal_linksP == UNPROVIDED) {
			allow_internal_linksP = allow_external_linksP;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		final SubLObject proof_view_entry = find_proof_view_entry_by_ids(proof_view_id, proof_view_entry_id);
		SubLObject cycl = NIL;
		SubLObject html = NIL;
		if (NIL != proof_view_entry_p(proof_view_entry)) {
			final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
			final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding(thread);
			try {
				pph_vars.$pph_addressee$.bind(proof_view_get_addressee(v_proof_view), thread);
				proof_view_set_allow_external_linksP(v_proof_view, allow_external_linksP);
				proof_view_set_allow_internal_linksP(v_proof_view, allow_internal_linksP);
				proof_view_set_language_mt(v_proof_view, language_mt);
				cycl = proof_view_entry_generate_cycl(proof_view_entry);
				final SubLObject local_state;
				final SubLObject state = local_state = find_proof_view_memoization_state(v_proof_view);
				final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding(thread);
				try {
					memoization_state.$memoization_state$.bind(local_state, thread);
					final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
					try {
						html = proof_view_entry_generate_html(proof_view_entry);
					} finally {
						final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values = getValuesAsVector();
							memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
							restoreValuesFromVector(_values);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
						}
					}
				} finally {
					memoization_state.$memoization_state$.rebind(_prev_bind_0_$12, thread);
				}
			} finally {
				pph_vars.$pph_addressee$.rebind(_prev_bind_0, thread);
			}
		} else {
			Errors.error($str223$can_t_find_proof_view_entry_for_i, proof_view_id, proof_view_entry_id);
		}
		return list(html, cycl);
	}

	public static SubLObject proof_view_entry_html(final SubLObject proof_view_id, final SubLObject proof_view_entry_id) {
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		final SubLObject proof_view_entry = find_proof_view_entry_by_ids(proof_view_id, proof_view_entry_id);
		if (NIL == proof_view_entry_p(proof_view_entry)) {
			Errors.error($str223$can_t_find_proof_view_entry_for_i, proof_view_id, proof_view_entry_id);
		}
		return proof_view_entry_html_internal(proof_view_entry);
	}

	public static SubLObject proof_view_entry_html_internal(final SubLObject proof_view_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject cycl = NIL;
		SubLObject html = NIL;
		if (NIL != proof_view_entry_p(proof_view_entry)) {
			final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
			final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding(thread);
			try {
				pph_vars.$pph_addressee$.bind(proof_view_get_addressee(v_proof_view), thread);
				cycl = proof_view_entry_generate_cycl(proof_view_entry);
				final SubLObject local_state;
				final SubLObject state = local_state = find_proof_view_memoization_state(v_proof_view);
				final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding(thread);
				try {
					memoization_state.$memoization_state$.bind(local_state, thread);
					final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
					try {
						html = proof_view_entry_generate_html(proof_view_entry);
					} finally {
						final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values = getValuesAsVector();
							memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
							restoreValuesFromVector(_values);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
						}
					}
				} finally {
					memoization_state.$memoization_state$.rebind(_prev_bind_0_$14, thread);
				}
			} finally {
				pph_vars.$pph_addressee$.rebind(_prev_bind_0, thread);
			}
		}
		return list(html, NIL != cycl_grammar.cycl_expression_p(cycl) ? cycl : NIL);
	}

	public static SubLObject fact_sheet_term_id_if_ok_for_proof_view_fact_sheets(final SubLObject v_term) {
		return NIL != fact_sheets.term_ok_for_fact_sheet_p(v_term, UNPROVIDED) ? fact_sheets.fact_sheet_term_id(v_term, UNPROVIDED) : NIL;
	}

	public static SubLObject proof_view_entry_generate_html(final SubLObject proof_view_entry) {
		final SubLObject paraphrase_fn = proof_view_get_property(proof_view_entry_get_proof_view(proof_view_entry), $ENTRY_PARAPHRASE_FN, PROOF_VIEW_ENTRY_GENERATE_HTML_STANDARD);
		return funcall(paraphrase_fn, proof_view_entry);
	}

	public static SubLObject proof_view_entry_generate_html_standard(final SubLObject proof_view_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject local_state;
		final SubLObject state = local_state = find_proof_view_memoization_state(proof_view_entry_get_proof_view(proof_view_entry));
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
				final SubLObject allow_external_linksP = proof_view_get_allow_external_linksP(v_proof_view);
				final SubLObject allow_internal_linksP = proof_view_get_allow_internal_linksP(v_proof_view);
				final SubLObject language_mt = proof_view_get_language_mt(v_proof_view);
				final SubLObject include_sourcesP = proof_view_entry_get_include_sourcesP(proof_view_entry);
				final SubLObject link_phrasesP = proof_view_get_link_phrasesP(v_proof_view);
				final SubLObject highlight_demeritsP = proof_view_get_highlight_phrase_demeritsP(v_proof_view);
				return proof_view_entry_generate_html_internal(proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP);
			} finally {
				final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject proof_view_entry_generate_html_internal_internal(final SubLObject proof_view_entry, final SubLObject allow_external_linksP, final SubLObject allow_internal_linksP, final SubLObject language_mt, final SubLObject include_sourcesP, final SubLObject link_phrasesP, final SubLObject highlight_demeritsP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		final SubLObject object_type = proof_view_entry_get_object_type(proof_view_entry);
		final SubLObject v_object = proof_view_entry_get_object(proof_view_entry);
		final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
		SubLObject object_html = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $highlight_demerits_in_generated_phrasesP$.currentBinding(thread);
		final SubLObject _prev_bind_3 = pph_vars.$html_generation_term_id_function$.currentBinding(thread);
		final SubLObject _prev_bind_4 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
		final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding(thread);
		final SubLObject _prev_bind_6 = pph_vars.$pph_inference_answer$.currentBinding(thread);
		final SubLObject _prev_bind_7 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
		final SubLObject _prev_bind_8 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
		final SubLObject _prev_bind_9 = pph_vars.$pph_domain_mt$.currentBinding(thread);
		try {
			pph_vars.$constant_link_function$.bind(NIL != allow_internal_linksP ? $FACT_SHEET : $NONE, thread);
			$highlight_demerits_in_generated_phrasesP$.bind(highlight_demeritsP, thread);
			pph_vars.$html_generation_term_id_function$.bind(NIL != allow_internal_linksP ? FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS : NIL, thread);
			pph_vars.$pph_introduce_anaphorsP$.bind(NIL, thread);
			pph_vars.$pph_language_mt$.bind(language_mt, thread);
			pph_vars.$pph_inference_answer$.bind(proof_view_get_answer(v_proof_view), thread);
			pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(proof_view_get_answer(v_proof_view))), thread);
			pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
			pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(proof_view_get_answer(v_proof_view))), UNPROVIDED), thread);
			object_html = proof_view_html_for_object(proof_view_entry, v_object, object_type, allow_external_linksP, link_phrasesP);
			if (NIL != include_sourcesP) {
				final SubLObject v_sources = proof_view_entry_get_sources(proof_view_entry);
				SubLObject source_ids = NIL;
				SubLObject cdolist_list_var = v_sources;
				SubLObject source = NIL;
				source = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL != proof_view_valid_source_p(source)) {
						final SubLObject source_id = proof_view_get_source_id(v_proof_view, source);
						if (NIL != subl_promotions.positive_integer_p(source_id)) {
							source_ids = cons(cons(source_id, source), source_ids);
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					source = cdolist_list_var.first();
				}
				object_html = cconcatenate(object_html, pph_html.pph_footnote_string_for_source_ids(source_ids));
			}
		} finally {
			pph_vars.$pph_domain_mt$.rebind(_prev_bind_9, thread);
			pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_8, thread);
			pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_7, thread);
			pph_vars.$pph_inference_answer$.rebind(_prev_bind_6, thread);
			pph_vars.$pph_language_mt$.rebind(_prev_bind_5, thread);
			pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_4, thread);
			pph_vars.$html_generation_term_id_function$.rebind(_prev_bind_3, thread);
			$highlight_demerits_in_generated_phrasesP$.rebind(_prev_bind_2, thread);
			pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
		}
		return object_html;
	}

	public static SubLObject proof_view_entry_generate_html_internal(final SubLObject proof_view_entry, final SubLObject allow_external_linksP, final SubLObject allow_internal_linksP, final SubLObject language_mt, final SubLObject include_sourcesP, final SubLObject link_phrasesP, final SubLObject highlight_demeritsP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_entry_generate_html_internal_internal(proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL, SEVEN_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_7(proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (proof_view_entry.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (allow_external_linksP.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (allow_internal_linksP.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (language_mt.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (include_sourcesP.equal(cached_args.first())) {
									cached_args = cached_args.rest();
									if (link_phrasesP.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && highlight_demeritsP.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
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
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_entry_generate_html_internal_internal(proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject proof_view_valid_source_p(final SubLObject v_object) {
		return makeBoolean((NIL != v_object) && (NIL != cycl_grammar.cycl_term_p(v_object)));
	}

	public static SubLObject maybe_with_font_color(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list232);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject color = NIL;
		SubLObject v_default = NIL;
		destructuring_bind_must_consp(current, datum, $list232);
		color = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list232);
		v_default = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PIF, list(EQL, color, v_default), append(body, list(listS(HTML_FANCY_FONT, list($COLOR, color), append(body, NIL)))));
		}
		cdestructuring_bind_error(datum, $list232);
		return NIL;
	}

	public static SubLObject proof_view_html_for_object(final SubLObject proof_view_entry, final SubLObject v_object, final SubLObject object_type, final SubLObject allow_external_linksP, final SubLObject link_phrasesP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject html_string = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
		try {
			pph_vars.$pph_use_showXhideP$.bind(NIL, thread);
			final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
			final SubLObject inference_answer = proof_view_get_answer(v_proof_view);
			final SubLObject _prev_bind_0_$17 = pph_vars.$pph_domain_mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
			final SubLObject _prev_bind_3 = pph_vars.$pph_addressee$.currentBinding(thread);
			final SubLObject _prev_bind_4 = pph_vars.$pph_top_level_demerits$.currentBinding(thread);
			final SubLObject _prev_bind_5 = pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.currentBinding(thread);
			final SubLObject _prev_bind_6 = pph_vars.$pph_proof_include_phrase_linksP$.currentBinding(thread);
			try {
				pph_vars.$pph_domain_mt$.bind(proof_view_get_domain_mt(v_proof_view), thread);
				pph_vars.$pph_language_mt$.bind(proof_view_get_language_mt(v_proof_view), thread);
				pph_vars.$pph_addressee$.bind(proof_view_get_addressee(v_proof_view), thread);
				pph_vars.$pph_top_level_demerits$.bind(ZERO_INTEGER, thread);
				pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.bind(NIL, thread);
				pph_vars.$pph_proof_include_phrase_linksP$.bind(link_phrasesP, thread);
				final SubLObject main_font_color = proof_view_find_main_font_color(v_object, object_type, proof_view_entry);
				final SubLObject info = pph_types.pph_method_info(GENERATE_SKOLEM_TERM_EXISTENTIALLY, NIL);
				pph_types.pph_deregister_method_info(GENERATE_SKOLEM_TERM_EXISTENTIALLY, info);
				try {
					final SubLObject info_$18 = pph_types.pph_method_info(GENERATE_SKOLEM_TERM_SMART, NIL);
					pph_types.pph_deregister_method_info(GENERATE_SKOLEM_TERM_SMART, info_$18);
					try {
						final SubLObject _prev_bind_0_$18 = pph_vars.$pph_inference_answer$.currentBinding(thread);
						final SubLObject _prev_bind_1_$20 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
						final SubLObject _prev_bind_2_$21 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
						final SubLObject _prev_bind_3_$22 = pph_vars.$pph_domain_mt$.currentBinding(thread);
						final SubLObject _prev_bind_4_$23 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
						final SubLObject _prev_bind_5_$24 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
						final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
						final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
						final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
						final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
						try {
							pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
							pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
							pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
							pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
							pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
							pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
							pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
							pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
							pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
							pph_vars.$pph_displayed_supports$.bind(NIL, thread);
							thread.resetMultipleValues();
							final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
							final SubLObject html_target = thread.secondMultipleValue();
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$19 = pph_vars.$constant_link_function$.currentBinding(thread);
							final SubLObject _prev_bind_1_$21 = pph_vars.$html_generation_target$.currentBinding(thread);
							try {
								pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
								pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
								SubLObject stream = NIL;
								try {
									stream = make_private_string_output_stream();
									final SubLObject _prev_bind_0_$20 = html_macros.$html_stream$.currentBinding(thread);
									try {
										html_macros.$html_stream$.bind(stream, thread);
										if (main_font_color.eql(proof_view_default_color())) {
											final SubLObject linear_id = proof_view_entry_get_property(proof_view_entry, $LINEAR_ID, UNPROVIDED);
											if (NIL != linear_id) {
												format(html_macros.$html_stream$.getDynamicValue(thread), $str239$_A__, linear_id);
											}
											final SubLObject output_fn = proof_view_output_fn_for_object_type(object_type);
											if (NIL != output_fn) {
												funcall(output_fn, v_proof_view, v_object, allow_external_linksP);
											} else {
												proof_view_html_for_object_cases(v_proof_view, object_type, v_object, allow_external_linksP);
											}
										} else {
											html_markup(html_macros.$html_font_head$.getGlobalValue());
											if (NIL != main_font_color) {
												html_markup(html_macros.$html_font_color$.getGlobalValue());
												html_char(CHAR_quotation, UNPROVIDED);
												html_markup(html_color(main_font_color));
												html_char(CHAR_quotation, UNPROVIDED);
											}
											html_char(CHAR_greater, UNPROVIDED);
											final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
												final SubLObject linear_id2 = proof_view_entry_get_property(proof_view_entry, $LINEAR_ID, UNPROVIDED);
												if (NIL != linear_id2) {
													format(html_macros.$html_stream$.getDynamicValue(thread), $str239$_A__, linear_id2);
												}
												final SubLObject output_fn2 = proof_view_output_fn_for_object_type(object_type);
												if (NIL != output_fn2) {
													funcall(output_fn2, v_proof_view, v_object, allow_external_linksP);
												} else {
													proof_view_html_for_object_cases(v_proof_view, object_type, v_object, allow_external_linksP);
												}
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
											}
											html_markup(html_macros.$html_font_tail$.getGlobalValue());
										}
									} finally {
										html_macros.$html_stream$.rebind(_prev_bind_0_$20, thread);
									}
									html_string = get_output_stream_string(stream);
								} finally {
									final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										close(stream, UNPROVIDED);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
									}
								}
							} finally {
								pph_vars.$html_generation_target$.rebind(_prev_bind_1_$21, thread);
								pph_vars.$constant_link_function$.rebind(_prev_bind_0_$19, thread);
							}
						} finally {
							pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
							pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
							pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
							pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
							pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_5_$24, thread);
							pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_4_$23, thread);
							pph_vars.$pph_domain_mt$.rebind(_prev_bind_3_$22, thread);
							pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_2_$21, thread);
							pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_1_$20, thread);
							pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$18, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							pph_types.pph_register_method_info(GENERATE_SKOLEM_TERM_SMART, info_$18);
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
						}
					}
				} finally {
					final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values3 = getValuesAsVector();
						pph_types.pph_register_method_info(GENERATE_SKOLEM_TERM_EXISTENTIALLY, info);
						restoreValuesFromVector(_values3);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
					}
				}
				if (pph_vars.$pph_top_level_demerits$.getDynamicValue(thread).isPositive()) {
					proof_view_entry_set_paraphrase_demerits(proof_view_entry, pph_vars.$pph_top_level_demerits$.getDynamicValue(thread));
				}
			} finally {
				pph_vars.$pph_proof_include_phrase_linksP$.rebind(_prev_bind_6, thread);
				pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.rebind(_prev_bind_5, thread);
				pph_vars.$pph_top_level_demerits$.rebind(_prev_bind_4, thread);
				pph_vars.$pph_addressee$.rebind(_prev_bind_3, thread);
				pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
				pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$17, thread);
			}
		} finally {
			pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_0, thread);
		}
		return html_string;
	}

	public static SubLObject proof_view_entry_get_paraphrase_demerits(final SubLObject entry, SubLObject descend_into_childrenP) {
		if (descend_into_childrenP == UNPROVIDED) {
			descend_into_childrenP = T;
		}
		SubLObject demerits = proof_view_entry_get_property(entry, $PPH_DEMERITS, ZERO_INTEGER);
		if (NIL != descend_into_childrenP) {
			SubLObject cdolist_list_var = proof_view_entry_get_children(entry);
			SubLObject child = NIL;
			child = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				demerits = add(demerits, proof_view_entry_get_paraphrase_demerits(child, T));
				cdolist_list_var = cdolist_list_var.rest();
				child = cdolist_list_var.first();
			}
		}
		return demerits;
	}

	public static SubLObject proof_view_entry_set_paraphrase_demerits(final SubLObject entry, final SubLObject demerits) {
		assert NIL != subl_promotions.non_negative_integer_p(demerits) : "subl_promotions.non_negative_integer_p(demerits) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(demerits) " + demerits;
		return proof_view_entry_set_property(entry, $PPH_DEMERITS, demerits);
	}

	public static SubLObject proof_view_support_html_internal(final SubLObject support) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject html = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
			final SubLObject _prev_bind_2 = pph_vars.$pph_show_meta_supports_with_supportsP$.currentBinding(thread);
			final SubLObject _prev_bind_3 = pph_vars.$pph_show_assert_info_with_assertionsP$.currentBinding(thread);
			final SubLObject _prev_bind_4 = pph_vars.$validate_proof_supportsP$.currentBinding(thread);
			try {
				html_macros.$html_stream$.bind(stream, thread);
				pph_vars.$pph_show_meta_supports_with_supportsP$.bind(NIL, thread);
				pph_vars.$pph_show_assert_info_with_assertionsP$.bind(NIL, thread);
				pph_vars.$validate_proof_supportsP$.bind($proof_view_validate_supportsP$.getDynamicValue(thread), thread);
				pph_proof.pph_show_support(support, UNPROVIDED, UNPROVIDED);
			} finally {
				pph_vars.$validate_proof_supportsP$.rebind(_prev_bind_4, thread);
				pph_vars.$pph_show_assert_info_with_assertionsP$.rebind(_prev_bind_3, thread);
				pph_vars.$pph_show_meta_supports_with_supportsP$.rebind(_prev_bind_2, thread);
				html_macros.$html_stream$.rebind(_prev_bind_0, thread);
			}
			html = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
			}
		}
		return html;
	}

	public static SubLObject proof_view_support_html(final SubLObject support) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_support_html_internal(support);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_SUPPORT_HTML, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_SUPPORT_HTML, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_SUPPORT_HTML, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_support_html_internal(support)));
			memoization_state.caching_state_put(caching_state, support, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject register_proof_view_output_fn_for_object_type(final SubLObject object_type, final SubLObject fn) {
		return dictionary.dictionary_enter($proof_view_object_type_output_fns$.getGlobalValue(), object_type, fn);
	}

	public static SubLObject proof_view_output_fn_for_object_type(final SubLObject object_type) {
		return dictionary.dictionary_lookup_without_values($proof_view_object_type_output_fns$.getGlobalValue(), object_type, UNPROVIDED);
	}

	public static SubLObject proof_view_html_for_object_cases(final SubLObject v_proof_view, final SubLObject object_type, final SubLObject v_object, final SubLObject allow_external_linksP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((object_type.eql(ASSERTION_P) || object_type.eql(SUPPORT_P)) || object_type.eql($PROOF_VIEW_ENTRY_CONFIRMED)) || object_type.eql($PROOF_VIEW_ENTRY_DENIED)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str244$_A, proof_view_support_html(v_object));
		} else if (object_type.eql(EL_SENTENCE_P)) {
			pph_proof.pph_show_sentence(v_object, UNPROVIDED, UNPROVIDED);
		} else if (object_type.eql(EL_TERM_P)) {
			pph_proof.pph_show_term(v_object, UNPROVIDED, UNPROVIDED);
		} else if (object_type.eql($SOURCE_CITATION)) {
			proof_view_output_citation(v_object, $proof_view_citation_format$.getDynamicValue(thread), allow_external_linksP);
		} else if (object_type.eql($EXTERNAL_SENTENCE)) {
			SubLObject sentence = NIL;
			SubLObject terms = NIL;
			SubLObject mt = NIL;
			destructuring_bind_must_consp(v_object, v_object, $list249);
			sentence = v_object.first();
			SubLObject current = v_object.rest();
			destructuring_bind_must_consp(current, v_object, $list249);
			terms = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, v_object, $list249);
			mt = current.first();
			current = current.rest();
			if (NIL == current) {
				proof_view_output_external_sentence(v_proof_view, sentence, terms, mt);
			} else {
				cdestructuring_bind_error(v_object, $list249);
			}
		} else if (object_type.eql($ENTITY_MENTION)) {
			SubLObject v_document = NIL;
			SubLObject entity_mention = NIL;
			SubLObject terms2 = NIL;
			SubLObject mt2 = NIL;
			destructuring_bind_must_consp(v_object, v_object, $list251);
			v_document = v_object.first();
			SubLObject current = v_object.rest();
			destructuring_bind_must_consp(current, v_object, $list251);
			entity_mention = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, v_object, $list251);
			terms2 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, v_object, $list251);
			mt2 = current.first();
			current = current.rest();
			if (NIL == current) {
				proof_view_output_entity_mention(v_proof_view, v_document, entity_mention, terms2, mt2);
			} else {
				cdestructuring_bind_error(v_object, $list251);
			}
		} else if (object_type.eql($QUERY_SENTENCE)) {
			pph_proof.pph_show_question(v_object);
		} else if (object_type.eql($BINDINGS)) {
			proof_view_show_bindings(v_proof_view, v_object);
		} else if (object_type.eql($RULE_USED)) {
			final SubLObject gloss = kb_mapping_utilities.fpred_value_in_any_mt(v_object, $$keyRuleEnglishSummary, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != gloss) {
				html_princ(gloss);
			} else {
				proof_view_html_for_object_cases(v_proof_view, ASSERTION_P, v_object, allow_external_linksP);
			}
		} else if (object_type.eql($UNSUPPORTED_SUPPORT)) {
			html_princ($str257$Fact_computed_by_Cyc_);
		} else if (object_type.eql($NO_JUSTIFICATION)) {
			html_princ($str259$No_justification_available_);
		} else if (object_type.eql($CIRCULAR_SUPPORT)) {
			html_princ($proof_view_circular_support_label$.getGlobalValue());
		} else if (object_type.eql($ABDUCED_SUPPORT)) {
			html_princ($str262$Cyc_thinks_this_might_be_true_but);
		} else if (object_type.eql($ABDUCED_SUPPORT_CONFIRMED)) {
			html_princ($str264$Confirmed__but_not_provable_from_);
		} else if (object_type.eql($ABDUCED_SUPPORT_DENIED)) {
			html_princ($str266$Denied__and_not_provable_from_pre);
		} else if (object_type.eql($GIVEN)) {
			html_princ($str268$Given_in_the_question_);
		} else if (object_type.eql($EXCEPTION)) {
			html_princ($str270$This_rule_has_exceptions__but_non);
		} else if (object_type.eql($PRAGMATICS)) {
			html_princ($str272$This_rule_has_further_conditions_);
		} else if (object_type.eql($ASSERTION_BOOKKEEPING)) {
			proof_view_output_assertion_bookkeeping_info(v_object, v_proof_view);
		} else if (((object_type.eql($ROOT) || object_type.eql($SECTION_ROOT)) || object_type.eql($NO_SOURCE_DOCUMENT)) || object_type.eql($EMPTY_JUSTIFICATION)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str0$);
		} else if ((object_type.eql($PREMISE) || object_type.eql($RULE)) || object_type.eql($CONCLUSION)) {
			proof_view_html_for_object_cases(v_proof_view, proof_view_entry_get_object_type(v_object), proof_view_entry_get_object(v_object), allow_external_linksP);
		} else if (object_type.eql($FROM)) {
			SubLObject supporting_entries = v_object;
			html_princ($$$From_);
			if (NIL != list_utilities.singletonP(supporting_entries)) {
				html_princ(proof_view_entry_get_property(list_utilities.only_one(supporting_entries), $LINEAR_ID, UNPROVIDED));
			} else if (NIL != list_utilities.doubletonP(supporting_entries)) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str283$_A_and__A, proof_view_entry_get_property(supporting_entries.first(), $LINEAR_ID, UNPROVIDED), proof_view_entry_get_property(second(supporting_entries), $LINEAR_ID, UNPROVIDED));
			} else {
				while (NIL == list_utilities.empty_list_p(supporting_entries)) {
					final SubLObject supporting_entry = supporting_entries.first();
					supporting_entries = supporting_entries.rest();
					final SubLObject now_emptyP = list_utilities.empty_list_p(supporting_entries);
					if (NIL != now_emptyP) {
						html_princ($$$and_);
					}
					html_princ(proof_view_entry_get_property(supporting_entry, $LINEAR_ID, UNPROVIDED));
					if (NIL == now_emptyP) {
						html_princ($str285$__);
					}
				}
			}

		} else {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str286$no_output_method_for__S, object_type);
		}

		return NIL;
	}

	public static SubLObject proof_view_html_for_object_cond(final SubLObject v_proof_view, final SubLObject object_type, final SubLObject v_object, final SubLObject allow_external_linksP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((((object_type == ASSERTION_P) || (object_type == SUPPORT_P)) || (object_type == $PROOF_VIEW_ENTRY_CONFIRMED)) || (object_type == $PROOF_VIEW_ENTRY_DENIED)) {
			final SubLObject _prev_bind_0 = pph_vars.$pph_show_meta_supports_with_supportsP$.currentBinding(thread);
			final SubLObject _prev_bind_2 = pph_vars.$pph_show_assert_info_with_assertionsP$.currentBinding(thread);
			final SubLObject _prev_bind_3 = pph_vars.$validate_proof_supportsP$.currentBinding(thread);
			try {
				pph_vars.$pph_show_meta_supports_with_supportsP$.bind(NIL, thread);
				pph_vars.$pph_show_assert_info_with_assertionsP$.bind(NIL, thread);
				pph_vars.$validate_proof_supportsP$.bind($proof_view_validate_supportsP$.getDynamicValue(thread), thread);
				pph_proof.pph_show_support(v_object, UNPROVIDED, UNPROVIDED);
			} finally {
				pph_vars.$validate_proof_supportsP$.rebind(_prev_bind_3, thread);
				pph_vars.$pph_show_assert_info_with_assertionsP$.rebind(_prev_bind_2, thread);
				pph_vars.$pph_show_meta_supports_with_supportsP$.rebind(_prev_bind_0, thread);
			}
		} else if (object_type == EL_SENTENCE_P) {
			pph_proof.pph_show_sentence(v_object, UNPROVIDED, UNPROVIDED);
		} else if (object_type == EL_TERM_P) {
			pph_proof.pph_show_term(v_object, UNPROVIDED, UNPROVIDED);
		} else if (object_type == $SOURCE_CITATION) {
			proof_view_output_citation(v_object, $proof_view_citation_format$.getDynamicValue(thread), allow_external_linksP);
		} else if (object_type == $EXTERNAL_SENTENCE) {
			SubLObject sentence = NIL;
			SubLObject terms = NIL;
			SubLObject mt = NIL;
			destructuring_bind_must_consp(v_object, v_object, $list249);
			sentence = v_object.first();
			SubLObject current = v_object.rest();
			destructuring_bind_must_consp(current, v_object, $list249);
			terms = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, v_object, $list249);
			mt = current.first();
			current = current.rest();
			if (NIL == current) {
				proof_view_output_external_sentence(v_proof_view, sentence, terms, mt);
			} else {
				cdestructuring_bind_error(v_object, $list249);
			}
		} else if (object_type == $ENTITY_MENTION) {
			SubLObject v_document = NIL;
			SubLObject entity_mention = NIL;
			SubLObject terms2 = NIL;
			SubLObject mt2 = NIL;
			destructuring_bind_must_consp(v_object, v_object, $list251);
			v_document = v_object.first();
			SubLObject current = v_object.rest();
			destructuring_bind_must_consp(current, v_object, $list251);
			entity_mention = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, v_object, $list251);
			terms2 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, v_object, $list251);
			mt2 = current.first();
			current = current.rest();
			if (NIL == current) {
				proof_view_output_entity_mention(v_proof_view, v_document, entity_mention, terms2, mt2);
			} else {
				cdestructuring_bind_error(v_object, $list251);
			}
		} else if (object_type == $QUERY_SENTENCE) {
			pph_proof.pph_show_question(v_object);
		} else if (object_type == $BINDINGS) {
			proof_view_show_bindings(v_proof_view, v_object);
		} else if (object_type == $UNSUPPORTED_SUPPORT) {
			html_princ($str257$Fact_computed_by_Cyc_);
		} else if (object_type == $CIRCULAR_SUPPORT) {
			html_princ($proof_view_circular_support_label$.getGlobalValue());
		} else if (object_type == $ABDUCED_SUPPORT) {
			html_princ($str262$Cyc_thinks_this_might_be_true_but);
		} else if (object_type == $ABDUCED_SUPPORT_CONFIRMED) {
			html_princ($str264$Confirmed__but_not_provable_from_);
		} else if (object_type == $ABDUCED_SUPPORT_DENIED) {
			html_princ($str266$Denied__and_not_provable_from_pre);
		} else if (object_type == $GIVEN) {
			html_princ($str268$Given_in_the_question_);
		} else if (object_type == $EXCEPTION) {
			html_princ($str270$This_rule_has_exceptions__but_non);
		} else if (object_type == $PRAGMATICS) {
			html_princ($str272$This_rule_has_further_conditions_);
		} else if (object_type == $ASSERTION_BOOKKEEPING) {
			proof_view_output_assertion_bookkeeping_info(v_object, v_proof_view);
		} else if (NIL == object_type) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str0$);
		} else {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str286$no_output_method_for__S, object_type);
		}

		return NIL;
	}

	public static SubLObject proof_view_find_main_font_color(final SubLObject v_object, final SubLObject object_type, final SubLObject proof_view_entry) {
		if (object_type == $ABDUCED_SUPPORT_CONFIRMED) {
			return $proof_view_abduction_support_confirmed_color$.getGlobalValue();
		}
		if (object_type == $ABDUCED_SUPPORT_DENIED) {
			return $proof_view_abduction_support_denied_color$.getGlobalValue();
		}
		if (NIL != proof_view_entry_has_abduction_confirmed_p(proof_view_entry)) {
			return $proof_view_abduction_support_confirmed_color$.getGlobalValue();
		}
		if (NIL != proof_view_entry_has_abduction_denied_p(proof_view_entry)) {
			return $proof_view_abduction_support_denied_color$.getGlobalValue();
		}
		if (NIL != proof_view_entry_has_abduced_support_p(proof_view_entry)) {
			return $proof_view_abduction_support_color$.getGlobalValue();
		}
		if (NIL != proof_view_entry_has_abduced_support_confirmed_p(proof_view_entry)) {
			return $proof_view_abduction_support_confirmed_color$.getGlobalValue();
		}
		if (NIL != proof_view_entry_has_abduced_support_denied_p(proof_view_entry)) {
			return $proof_view_abduction_support_denied_color$.getGlobalValue();
		}
		if (NIL != abduction.abduction_support_p(v_object)) {
			return $proof_view_abduction_support_color$.getGlobalValue();
		}
		return proof_view_default_color();
	}

	public static SubLObject proof_view_entry_has_abduced_support_p(final SubLObject proof_view_entry) {
		return list_utilities.sublisp_boolean(proof_view_entry_get_property(proof_view_entry, $kw287$HAS_ABDUCED_SUPPORT_, UNPROVIDED));
	}

	public static SubLObject proof_view_entry_has_abduced_support_confirmed_p(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return list_utilities.sublisp_boolean(proof_view_entry_get_property(proof_view_entry, $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_, UNPROVIDED));
	}

	public static SubLObject proof_view_entry_has_abduced_support_denied_p(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return list_utilities.sublisp_boolean(proof_view_entry_get_property(proof_view_entry, $kw289$HAS_ABDUCED_SUPPORT_DENIED_, UNPROVIDED));
	}

	public static SubLObject proof_view_entry_has_abduction_confirmed_p(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return eq(proof_view_entry_get_object_type(proof_view_entry), $PROOF_VIEW_ENTRY_CONFIRMED);
	}

	public static SubLObject proof_view_entry_has_abduction_denied_p(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		return eq(proof_view_entry_get_object_type(proof_view_entry), $PROOF_VIEW_ENTRY_DENIED);
	}

	public static SubLObject proof_view_output_citation(final SubLObject citation, SubLObject type, SubLObject allow_external_linksP) {
		if (type == UNPROVIDED) {
			type = $proof_view_citation_format$.getDynamicValue();
		}
		if (allow_external_linksP == UNPROVIDED) {
			allow_external_linksP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != pph_html.pph_source_citation_p(citation) : "pph_html.pph_source_citation_p(citation) " + "CommonSymbols.NIL != pph_html.pph_source_citation_p(citation) " + citation;
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(NIL, thread);
			html_princ(pph_html.pph_html_citation_string(citation, type, allow_external_linksP));
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		return citation;
	}

	public static SubLObject proof_view_show_bindings(final SubLObject v_proof_view, final SubLObject v_bindings) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject cdolist_list_var = pph_utilities.pph_sort_bindings(copy_list(v_bindings));
			SubLObject binding = NIL;
			binding = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = binding;
				SubLObject var = NIL;
				SubLObject value = NIL;
				destructuring_bind_must_consp(current, datum, $list291);
				var = current.first();
				current = value = current.rest();
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_no_break_head$.getGlobalValue());
						final SubLObject _prev_bind_0_$34 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
						try {
							pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
							pph_proof.pph_show_term(var, UNPROVIDED, UNPROVIDED);
						} finally {
							pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0_$34, thread);
						}
						html_princ($str292$__);
						html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						final SubLObject color = proof_view_display_color_for_term(v_proof_view, value);
						html_markup(html_macros.$html_font_head$.getGlobalValue());
						if (NIL != color) {
							html_markup(html_macros.$html_font_color$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(color));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							pph_proof.pph_show_term(value, UNPROVIDED, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
						}
						html_markup(html_macros.$html_font_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				cdolist_list_var = cdolist_list_var.rest();
				binding = cdolist_list_var.first();
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return v_bindings;
	}

	public static SubLObject proof_view_output_assertion_bookkeeping_info(final SubLObject assertion, final SubLObject v_proof_view) {
		final SubLObject cyclist = (NIL != proof_view_get_suppress_assertion_cyclistsP(v_proof_view)) ? NIL : assertions_high.asserted_by(assertion);
		final SubLObject date = (NIL != proof_view_get_suppress_assertion_datesP(v_proof_view)) ? NIL : assertions_high.asserted_when(assertion);
		final SubLObject show_secondP = NIL;
		final SubLObject second = (NIL != show_secondP) ? assertions_high.asserted_second(assertion) : NIL;
		final SubLObject show_purposeP = NIL;
		final SubLObject purpose = (NIL != show_purposeP) ? assertions_high.asserted_why(assertion) : NIL;
		final SubLObject show_employerP = makeBoolean(NIL == proof_view_get_suppress_assertion_cyclist_employersP(v_proof_view));
		final SubLObject employer = ((NIL != cyclist) && (NIL != show_employerP)) ? get_employer(cyclist, date) : NIL;
		if (NIL != proof_view_assertion_givenP(v_proof_view, assertion)) {
			html_princ($$$Given_in_the_query);
		} else if (((NIL != cyclist) || (NIL != date)) || (NIL != purpose)) {
			html_princ($$$Entered);
			if (NIL != cyclist) {
				if (NIL != proof_view_get_suppress_assertion_cyclistsP(v_proof_view)) {
					if (NIL != employer) {
						html_princ($$$_by_an_employee_);
					}
				} else {
					html_princ($$$_by_);
					pph_proof.pph_show_term(cyclist, UNPROVIDED, UNPROVIDED);
				}
			}
			if (NIL != employer) {
				html_princ($$$_of_);
				pph_proof.pph_show_term(employer, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != date) {
				html_princ($$$_on_);
				cb_show_date(date);
				if (NIL != second) {
					html_princ($$$_at_);
					cb_show_second(second);
				}
			}
			if (NIL != purpose) {
				html_princ($$$_for_);
				pph_proof.pph_show_term(purpose, UNPROVIDED, UNPROVIDED);
			}
		} else {
			html_princ($str301$Fact_asserted_in_Cyc_Knowledge_Ba);
		}

		html_princ($str302$_);
		return assertion;
	}

	public static SubLObject proof_view_assertion_givenP(final SubLObject v_proof_view, final SubLObject assertion) {
		if (NIL != isa.isaP(hlmt.hlmt_monad_mt(hlmt.assertion_hlmt(assertion)), $$HypotheticalContext, UNPROVIDED, UNPROVIDED)) {
			final SubLObject query_sentence = proof_view_entry_get_object(proof_view_get_query_root(v_proof_view));
			final SubLObject assertion_sentence = uncanonicalizer.assertion_el_formula(assertion);
			final SubLObject hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(proof_view_get_answer(v_proof_view)));
			if ((NIL != gafP(assertion_sentence)) && (NIL != el_implication_p(query_sentence))) {
				final SubLObject antecedent = cycl_utilities.formula_arg1(query_sentence, UNPROVIDED);
				SubLObject cdolist_list_var = (NIL != el_conjunction_p(antecedent)) ? cycl_utilities.formula_args(antecedent, UNPROVIDED) : list(antecedent);
				SubLObject conjunct = NIL;
				conjunct = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (bindings.apply_bindings(hypothetical_bindings, conjunct).equal(assertion_sentence)) {
						return T;
					}
					cdolist_list_var = cdolist_list_var.rest();
					conjunct = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject get_employer(final SubLObject cyclist, SubLObject date) {
		if (date == UNPROVIDED) {
			date = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == numeric_date_utilities.universal_date_p(date)) {
			date = fi.the_date();
		}
		SubLObject employer = NIL;
		final SubLObject cycl_date = date_utilities.universal_time_to_cycl_date(numeric_date_utilities.universal_time_for_start_of_universal_date(date, UNPROVIDED));
		if (NIL != $use_get_employer_cacheP$.getDynamicValue(thread)) {
			if (NIL == employer) {
				SubLObject csome_list_var = employee_employers_and_mts(cyclist);
				SubLObject pair = NIL;
				pair = csome_list_var.first();
				while ((NIL == employer) && (NIL != csome_list_var)) {
					SubLObject current;
					final SubLObject datum = current = pair;
					SubLObject this_employer = NIL;
					SubLObject this_mt = NIL;
					destructuring_bind_must_consp(current, datum, $list304);
					this_employer = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list304);
					this_mt = current.first();
					current = current.rest();
					if (NIL == current) {
						if (NIL != hlmt.monad_mtP(this_mt)) {
							employer = this_employer;
						} else if (NIL != hlmt.hlmtP(this_mt)) {
							thread.resetMultipleValues();
							final SubLObject interval = hlmt.explode_hlmt_temporal_facets_with_defaults(this_mt);
							final SubLObject parameter = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (NIL != hlmt_relevance.mt_times_visible_p(cycl_date, interval, $$Null_TimeParameter, parameter)) {
								employer = this_employer;
							}
						}

					} else {
						cdestructuring_bind_error(datum, $list304);
					}
					csome_list_var = csome_list_var.rest();
					pair = csome_list_var.first();
				}
			}
		} else {
			employer = ask_utilities.query_variable($sym306$_EMPLOYER, list($$and, list($$ist, $sym308$_MT, list($$employees, $sym306$_EMPLOYER, cyclist)), $list310, list($$temporallySubsumes, $sym312$_TIME, cycl_date)), $$InferencePSC, $list314).first();
		}
		return employer;
	}

	public static SubLObject clear_employee_employers_and_mts() {
		final SubLObject cs = $employee_employers_and_mts_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_employee_employers_and_mts(final SubLObject cyclist) {
		return memoization_state.caching_state_remove_function_results_with_args($employee_employers_and_mts_caching_state$.getGlobalValue(), list(cyclist), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject employee_employers_and_mts_internal(final SubLObject cyclist) {
		return ask_utilities.query_template($list316, list($$ist, $sym308$_MT, list($$employees, $sym306$_EMPLOYER, cyclist)), $$InferencePSC, $list317);
	}

	public static SubLObject employee_employers_and_mts(final SubLObject cyclist) {
		SubLObject caching_state = $employee_employers_and_mts_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(EMPLOYEE_EMPLOYERS_AND_MTS, $employee_employers_and_mts_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(employee_employers_and_mts_internal(cyclist)));
			memoization_state.caching_state_put(caching_state, cyclist, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_view_output_external_sentence(final SubLObject v_proof_view, final SubLObject sentence, final SubLObject terms, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject tuples = pph_utilities.pph_ask_template_new($list319, list($$and, listS($$lengthOfList, sentence, $list321), $list322, listS($$startOffset, $sym324$_DOCUMENT, sentence, $list325)), mt, UNPROVIDED);
		SubLObject doneP = NIL;
		final SubLObject padding = $proof_view_external_sentence_padding$.getDynamicValue(thread);
		if (NIL == doneP) {
			SubLObject csome_list_var = tuples;
			SubLObject tuple = NIL;
			tuple = csome_list_var.first();
			while ((NIL == doneP) && (NIL != csome_list_var)) {
				SubLObject current;
				final SubLObject datum = current = tuple;
				SubLObject offset = NIL;
				SubLObject length = NIL;
				SubLObject text = NIL;
				destructuring_bind_must_consp(current, datum, $list326);
				offset = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list326);
				length = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list326);
				text = current.first();
				current = current.rest();
				if (NIL == current) {
					final SubLObject stripped_text = pph_utilities.pph_remove_html_tags(text, UNPROVIDED);
					final SubLObject initial_padding_size = (offset.numL(padding)) ? offset : padding;
					final SubLObject stripped_text_length = length(stripped_text);
					final SubLObject start_char = max(ZERO_INTEGER, subtract(offset, padding));
					final SubLObject main_end_char = subtract(add(offset, length), start_char);
					final SubLObject end_char = min(stripped_text_length, add(offset, length, padding));
					final SubLObject sentence_text = string_utilities.substring(stripped_text, start_char, end_char);
					SubLObject curr_char = ZERO_INTEGER;
					final SubLObject padding_color = html_macros.$html_color_dark_grey$.getGlobalValue();
					final SubLObject term_starts_and_ends = proof_view_find_terms_in_string(v_proof_view, terms, sentence_text, mt, padding);
					html_markup(html_macros.$html_teletype_head$.getGlobalValue());
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != padding_color) {
						html_markup(html_macros.$html_font_color$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(padding_color));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						if (offset.isPositive()) {
							html_princ($str327$___);
						}
						html_princ(string_utilities.substring(sentence_text, ZERO_INTEGER, initial_padding_size));
						curr_char = padding;
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					SubLObject cdolist_list_var = term_starts_and_ends;
					SubLObject pair = NIL;
					pair = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						SubLObject current_$38;
						final SubLObject datum_$37 = current_$38 = pair;
						SubLObject term_string = NIL;
						SubLObject term_start_pos = NIL;
						SubLObject term_end_pos = NIL;
						SubLObject color = NIL;
						destructuring_bind_must_consp(current_$38, datum_$37, $list328);
						term_string = current_$38.first();
						current_$38 = current_$38.rest();
						destructuring_bind_must_consp(current_$38, datum_$37, $list328);
						term_start_pos = current_$38.first();
						current_$38 = current_$38.rest();
						destructuring_bind_must_consp(current_$38, datum_$37, $list328);
						term_end_pos = current_$38.first();
						current_$38 = current_$38.rest();
						destructuring_bind_must_consp(current_$38, datum_$37, $list328);
						color = current_$38.first();
						current_$38 = current_$38.rest();
						if (NIL == current_$38) {
							html_princ(string_utilities.substring(sentence_text, curr_char, term_start_pos));
							if (term_start_pos.isPositive() && (NIL != alpha_char_p(Strings.sublisp_char(sentence_text, number_utilities.f_1_(term_start_pos))))) {
								html_princ(term_string);
							} else {
								html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
								html_markup(html_macros.$html_font_head$.getGlobalValue());
								if (NIL != color) {
									html_markup(html_macros.$html_font_color$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_color(color));
									html_char(CHAR_quotation, UNPROVIDED);
								}
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_princ_strong(term_string);
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
								}
								html_markup(html_macros.$html_font_tail$.getGlobalValue());
								html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
							}
							curr_char = term_end_pos;
						} else {
							cdestructuring_bind_error(datum_$37, $list328);
						}
						cdolist_list_var = cdolist_list_var.rest();
						pair = cdolist_list_var.first();
					}
					html_princ(string_utilities.substring(sentence_text, curr_char, main_end_char));
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != padding_color) {
						html_markup(html_macros.$html_font_color$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(padding_color));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_princ(string_utilities.substring(sentence_text, main_end_char, UNPROVIDED));
						if (end_char.numL(stripped_text_length)) {
							html_princ($str327$___);
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
				} else {
					cdestructuring_bind_error(datum, $list326);
				}
				doneP = T;
				csome_list_var = csome_list_var.rest();
				tuple = csome_list_var.first();
			}
		}
		return sentence;
	}

	public static SubLObject proof_view_output_entity_mention(final SubLObject v_proof_view, final SubLObject v_document, final SubLObject entity_mention, final SubLObject terms, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject tuples = proof_view_get_document_locations_for_entity_mention(entity_mention, mt);
		final SubLObject text = pph_utilities.pph_ask_variable_new($sym329$_TEXT, listS($$textOfWork, v_document, $list331), mt, UNPROVIDED).first();
		SubLObject doneP = makeBoolean(!text.isString());
		final SubLObject padding = $proof_view_entity_mention_padding$.getDynamicValue(thread);
		if (NIL == doneP) {
			SubLObject csome_list_var = tuples;
			SubLObject tuple = NIL;
			tuple = csome_list_var.first();
			while ((NIL == doneP) && (NIL != csome_list_var)) {
				SubLObject current;
				final SubLObject datum = current = tuple;
				SubLObject offset = NIL;
				SubLObject length = NIL;
				destructuring_bind_must_consp(current, datum, $list332);
				offset = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list332);
				length = current.first();
				current = current.rest();
				if (NIL == current) {
					final SubLObject stripped_text = pph_utilities.pph_remove_html_tags(text, UNPROVIDED);
					final SubLObject initial_padding_size = (offset.numL(padding)) ? offset : padding;
					final SubLObject stripped_text_length = length(stripped_text);
					final SubLObject start_char = max(ZERO_INTEGER, subtract(offset, padding));
					final SubLObject main_end_char = subtract(add(offset, length), start_char);
					final SubLObject end_char = min(stripped_text_length, add(offset, length, padding));
					final SubLObject entity_mention_text = string_utilities.substring(stripped_text, start_char, end_char);
					SubLObject curr_char = ZERO_INTEGER;
					final SubLObject padding_color = html_macros.$html_color_dark_grey$.getGlobalValue();
					final SubLObject term_starts_and_ends = proof_view_find_terms_in_string(v_proof_view, terms, entity_mention_text, mt, padding);
					html_markup(html_macros.$html_teletype_head$.getGlobalValue());
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != padding_color) {
						html_markup(html_macros.$html_font_color$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(padding_color));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						if (offset.isPositive()) {
							html_princ($str327$___);
						}
						html_princ(string_utilities.substring(entity_mention_text, ZERO_INTEGER, initial_padding_size));
						curr_char = padding;
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					SubLObject cdolist_list_var = term_starts_and_ends;
					SubLObject pair = NIL;
					pair = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						SubLObject current_$40;
						final SubLObject datum_$39 = current_$40 = pair;
						SubLObject term_string = NIL;
						SubLObject term_start_pos = NIL;
						SubLObject term_end_pos = NIL;
						SubLObject color = NIL;
						destructuring_bind_must_consp(current_$40, datum_$39, $list328);
						term_string = current_$40.first();
						current_$40 = current_$40.rest();
						destructuring_bind_must_consp(current_$40, datum_$39, $list328);
						term_start_pos = current_$40.first();
						current_$40 = current_$40.rest();
						destructuring_bind_must_consp(current_$40, datum_$39, $list328);
						term_end_pos = current_$40.first();
						current_$40 = current_$40.rest();
						destructuring_bind_must_consp(current_$40, datum_$39, $list328);
						color = current_$40.first();
						current_$40 = current_$40.rest();
						if (NIL == current_$40) {
							html_princ(string_utilities.substring(entity_mention_text, curr_char, term_start_pos));
							if (term_start_pos.isPositive() && (NIL != alpha_char_p(Strings.sublisp_char(entity_mention_text, number_utilities.f_1_(term_start_pos))))) {
								html_princ(term_string);
							} else {
								html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
								html_markup(html_macros.$html_font_head$.getGlobalValue());
								if (NIL != color) {
									html_markup(html_macros.$html_font_color$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_color(color));
									html_char(CHAR_quotation, UNPROVIDED);
								}
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_princ_strong(term_string);
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
								}
								html_markup(html_macros.$html_font_tail$.getGlobalValue());
								html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
							}
							curr_char = term_end_pos;
						} else {
							cdestructuring_bind_error(datum_$39, $list328);
						}
						cdolist_list_var = cdolist_list_var.rest();
						pair = cdolist_list_var.first();
					}
					html_princ(string_utilities.substring(entity_mention_text, curr_char, main_end_char));
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != padding_color) {
						html_markup(html_macros.$html_font_color$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(padding_color));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_princ(string_utilities.substring(entity_mention_text, main_end_char, UNPROVIDED));
						if (end_char.numL(stripped_text_length)) {
							html_princ($str327$___);
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
				} else {
					cdestructuring_bind_error(datum, $list332);
				}
				doneP = T;
				csome_list_var = csome_list_var.rest();
				tuple = csome_list_var.first();
			}
		}
		return entity_mention;
	}

	public static SubLObject proof_view_get_document_locations_for_entity_mention(final SubLObject entity_mention, final SubLObject mt) {
		return pph_utilities.pph_ask_template_new($list333, list($$and, listS($$startOffsetForMention, entity_mention, $list325), listS($$stringLengthForMention, entity_mention, $list321)), mt, UNPROVIDED);
	}

	public static SubLObject proof_view_display_color_for_term(final SubLObject v_proof_view, final SubLObject v_term) {
		if (NIL == sksi_external_term_browser.sksi_supported_external_termP(v_term)) {
			return $$$black;
		}
		SubLObject external_terms = proof_view_get_property(v_proof_view, $EXTERNAL_TERMS, UNPROVIDED);
		if (NIL == dictionary.dictionary_p(external_terms)) {
			external_terms = dictionary.new_dictionary(symbol_function(EQUAL), TEN_INTEGER);
			proof_view_set_property(v_proof_view, $EXTERNAL_TERMS, external_terms);
		}
		SubLObject color = dictionary.dictionary_lookup(external_terms, v_term, $NOT_FOUND);
		if (!color.isString()) {
			color = proof_view_nth_display_color(dictionary.dictionary_length(external_terms));
			dictionary.dictionary_enter(external_terms, v_term, color);
		}
		return color;
	}

	public static SubLObject proof_view_nth_display_color(final SubLObject n) {
		return nth(mod(n, length($proof_view_font_colors$.getGlobalValue())), $proof_view_font_colors$.getGlobalValue());
	}

	public static SubLObject proof_view_find_terms_in_string(final SubLObject v_proof_view, final SubLObject terms, final SubLObject sentence_text, final SubLObject mt, SubLObject padding) {
		if (padding == UNPROVIDED) {
			padding = ZERO_INTEGER;
		}
		SubLObject tuples = NIL;
		SubLObject list_var = NIL;
		SubLObject v_term = NIL;
		SubLObject i = NIL;
		list_var = terms;
		v_term = list_var.first();
		for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), i = add(ONE_INTEGER, i)) {
			final SubLObject color = proof_view_display_color_for_term(v_proof_view, v_term);
			tuples = append(tuples, proof_view_find_term_in_string(v_term, color, sentence_text, mt, padding));
		}
		tuples = proof_view_delete_subsumed_references(tuples);
		return Sort.sort(tuples, symbol_function($sym339$_), symbol_function(SECOND));
	}

	public static SubLObject proof_view_find_term_in_string(final SubLObject v_term, final SubLObject color, final SubLObject sentence_text, final SubLObject mt, SubLObject padding) {
		if (padding == UNPROVIDED) {
			padding = ZERO_INTEGER;
		}
		SubLObject tuples = NIL;
		SubLObject cdolist_list_var;
		final SubLObject term_strings = cdolist_list_var = pph_utilities.pph_ask_variable_new($sym341$_STRING, listS($$termStrings, v_term, $list343), mt, $list344);
		SubLObject term_string = NIL;
		term_string = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			tuples = append(tuples, proof_view_find_term_string_in_string(term_string, color, sentence_text, padding));
			cdolist_list_var = cdolist_list_var.rest();
			term_string = cdolist_list_var.first();
		}
		return tuples;
	}

	public static SubLObject proof_view_find_term_string_in_string(SubLObject term_string, final SubLObject color, final SubLObject sentence_text, SubLObject padding) {
		if (padding == UNPROVIDED) {
			padding = ZERO_INTEGER;
		}
		SubLObject tuples = NIL;
		term_string = proof_view_remove_leading_commas(term_string);
		final SubLObject term_string_length = length(term_string);
		SubLObject cdolist_list_var = string_utilities.search_all(term_string, sentence_text, symbol_function(EQUAL), UNPROVIDED);
		SubLObject start_pos = NIL;
		start_pos = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((!start_pos.numL(padding)) && (!start_pos.numG(subtract(length(sentence_text), length(term_string), padding)))) {
				tuples = cons(list(term_string, start_pos, add(start_pos, term_string_length), color), tuples);
			}
			cdolist_list_var = cdolist_list_var.rest();
			start_pos = cdolist_list_var.first();
		}
		return tuples;
	}

	public static SubLObject proof_view_remove_leading_commas(final SubLObject term_string) {
		return string_utilities.replace_substring(term_string, $str345$__, $str346$_);
	}

	public static SubLObject proof_view_delete_subsumed_references(final SubLObject tuples) {
		return list_utilities.delete_subsumed_items(tuples, PROOF_VIEW_REFERENCE_SUBSUMES_P, UNPROVIDED);
	}

	public static SubLObject proof_view_reference_subsumes_p(final SubLObject ref1, final SubLObject ref2) {
		return makeBoolean(second(ref1).numLE(second(ref2)) && third(ref1).numGE(third(ref2)));
	}

	public static SubLObject get_abduced_support_sentence_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject negatedP) {
		if (negatedP == UNPROVIDED) {
			negatedP = NIL;
		}
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		assert NIL != booleanp(negatedP) : "Types.booleanp(negatedP) " + "CommonSymbols.NIL != Types.booleanp(negatedP) " + negatedP;
		final SubLObject proof_view_entry = find_proof_view_entry_by_ids(proof_view_id, proof_view_entry_id);
		if (NIL != proof_view_entry_p(proof_view_entry)) {
			final SubLObject v_object = proof_view_entry_get_object(proof_view_entry);
			if (NIL != abduction.abduction_support_p(v_object)) {
				SubLObject sentence = arguments.support_sentence(v_object);
				if (NIL != negatedP) {
					sentence = list($$not, sentence);
				}
				return sentence;
			}
		}
		return NIL;
	}

	public static SubLObject assert_abduction_support_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject source, SubLObject negatedP) {
		if (negatedP == UNPROVIDED) {
			negatedP = NIL;
		}
		final SubLObject proof_view_entry = find_proof_view_entry_by_ids(proof_view_id, proof_view_entry_id);
		final SubLObject proof_view_root_entry = find_proof_view_entry_by_ids(proof_view_id, ZERO_INTEGER);
		return assert_abduction_support_for_proof_view_recursive(proof_view_id, proof_view_entry, proof_view_root_entry, source, negatedP);
	}

	public static SubLObject assert_abduction_support_for_proof_view_recursive(final SubLObject proof_view_id, final SubLObject proof_view_entry, final SubLObject proof_view_root_entry, SubLObject source, final SubLObject negatedP) {
		SubLObject changed_proof_view_entry_ids = NIL;
		SubLObject cdolist_list_var = proof_view_entry_get_children(proof_view_root_entry);
		SubLObject child_entry = NIL;
		child_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$41 = assert_abduction_support_for_proof_view_recursive(proof_view_id, proof_view_entry, child_entry, source, negatedP);
			SubLObject id = NIL;
			id = cdolist_list_var_$41.first();
			while (NIL != cdolist_list_var_$41) {
				final SubLObject item_var = id;
				if (NIL == member(item_var, changed_proof_view_entry_ids, symbol_function(EQL), symbol_function(IDENTITY))) {
					changed_proof_view_entry_ids = cons(item_var, changed_proof_view_entry_ids);
				}
				cdolist_list_var_$41 = cdolist_list_var_$41.rest();
				id = cdolist_list_var_$41.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			child_entry = cdolist_list_var.first();
		}
		if (proof_view_entry_get_object(proof_view_root_entry).eql(proof_view_entry_get_object(proof_view_entry))) {
			cdolist_list_var = assert_abduction_support_for_proof_view_int(proof_view_id, proof_view_entry_get_id(proof_view_root_entry), source, negatedP);
			SubLObject id2 = NIL;
			id2 = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject item_var2 = id2;
				if (NIL == member(item_var2, changed_proof_view_entry_ids, symbol_function(EQL), symbol_function(IDENTITY))) {
					changed_proof_view_entry_ids = cons(item_var2, changed_proof_view_entry_ids);
				}
				cdolist_list_var = cdolist_list_var.rest();
				id2 = cdolist_list_var.first();
			}
		}
		return changed_proof_view_entry_ids;
	}

	public static SubLObject assert_abduction_support_for_proof_view_int(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject source, SubLObject negatedP) {
		if (negatedP == UNPROVIDED) {
			negatedP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		assert NIL != booleanp(negatedP) : "Types.booleanp(negatedP) " + "CommonSymbols.NIL != Types.booleanp(negatedP) " + negatedP;
		final SubLObject proof_view_entry = find_proof_view_entry_by_ids(proof_view_id, proof_view_entry_id);
		if (NIL != proof_view_entry_p(proof_view_entry)) {
			final SubLObject v_object = proof_view_entry_get_object(proof_view_entry);
			SubLObject changed_proof_view_entry_ids = NIL;
			if (NIL != abduction.abduction_support_p(v_object)) {
				SubLObject sentence = arguments.support_sentence(v_object);
				final SubLObject v_hlmt = czer_main.canonicalize_term(list($$ContextOfPCWFn, source), UNPROVIDED);
				if (NIL != negatedP) {
					sentence = list($$not, sentence);
				}
				final SubLObject successP = ke.ke_assert_now_with_implicature(sentence, v_hlmt, UNPROVIDED, UNPROVIDED);
				if (NIL == successP) {
					return NIL;
				}
				final SubLObject _prev_bind_0 = $changed_proof_view_entry_ids$.currentBinding(thread);
				try {
					$changed_proof_view_entry_ids$.bind(NIL, thread);
					if (NIL != negatedP) {
						proof_view_entry_note_abduced_support_denied(proof_view_entry, v_object);
					} else {
						proof_view_entry_note_abduced_support_confirmed(proof_view_entry, v_object);
					}
					changed_proof_view_entry_ids = $changed_proof_view_entry_ids$.getDynamicValue(thread);
				} finally {
					$changed_proof_view_entry_ids$.rebind(_prev_bind_0, thread);
				}
				return changed_proof_view_entry_ids;
			}
		}
		return NIL;
	}

	public static SubLObject proof_view_entry_note_abduced_support_confirmed(final SubLObject proof_view_entry, final SubLObject support) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$changed_proof_view_entry_ids$.setDynamicValue(cons(proof_view_entry_get_id(proof_view_entry), $changed_proof_view_entry_ids$.getDynamicValue(thread)), thread);
		if (proof_view_entry_get_object_type(proof_view_entry) == $ABDUCED_SUPPORT) {
			proof_view_entry_set_object_type(proof_view_entry, $ABDUCED_SUPPORT_CONFIRMED);
		} else if (NIL != abduction.abduction_support_p(proof_view_entry_get_object(proof_view_entry))) {
			proof_view_entry_set_object_type(proof_view_entry, $PROOF_VIEW_ENTRY_CONFIRMED);
		} else if (NIL != proof_view_entry_has_abduced_support_p(proof_view_entry)) {
			proof_view_entry_rem_property(proof_view_entry, $kw287$HAS_ABDUCED_SUPPORT_);
			proof_view_entry_set_property(proof_view_entry, $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_, support);
		}

		final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
		final SubLObject parent_id = proof_view_entry_get_parent_id(proof_view_entry);
		final SubLObject parent = (parent_id.isInteger()) ? find_proof_view_entry_by_id(v_proof_view, parent_id) : NIL;
		if (NIL != parent) {
			proof_view_entry_note_abduced_support_confirmed(parent, support);
		}
		return proof_view_entry;
	}

	public static SubLObject proof_view_entry_note_abduced_support_denied(final SubLObject proof_view_entry, final SubLObject support) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$changed_proof_view_entry_ids$.setDynamicValue(cons(proof_view_entry_get_id(proof_view_entry), $changed_proof_view_entry_ids$.getDynamicValue(thread)), thread);
		if (proof_view_entry_get_object_type(proof_view_entry) == $ABDUCED_SUPPORT) {
			proof_view_entry_set_object_type(proof_view_entry, $ABDUCED_SUPPORT_DENIED);
		} else if (NIL != abduction.abduction_support_p(proof_view_entry_get_object(proof_view_entry))) {
			proof_view_entry_set_object_type(proof_view_entry, $PROOF_VIEW_ENTRY_DENIED);
		} else if (NIL != proof_view_entry_has_abduced_support_p(proof_view_entry)) {
			proof_view_entry_rem_property(proof_view_entry, $kw287$HAS_ABDUCED_SUPPORT_);
			proof_view_entry_set_property(proof_view_entry, $kw289$HAS_ABDUCED_SUPPORT_DENIED_, support);
		}

		final SubLObject v_proof_view = proof_view_entry_get_proof_view(proof_view_entry);
		final SubLObject parent_id = proof_view_entry_get_parent_id(proof_view_entry);
		final SubLObject parent = (parent_id.isInteger()) ? find_proof_view_entry_by_id(v_proof_view, parent_id) : NIL;
		if (NIL != parent) {
			proof_view_entry_note_abduced_support_denied(parent, support);
		}
		return proof_view_entry;
	}

	public static SubLObject get_query_url_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id) {
		assert NIL != integerp(proof_view_id) : "Types.integerp(proof_view_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_id) " + proof_view_id;
		assert NIL != integerp(proof_view_entry_id) : "Types.integerp(proof_view_entry_id) " + "CommonSymbols.NIL != Types.integerp(proof_view_entry_id) " + proof_view_entry_id;
		final SubLObject sentence = get_sentence_for_proof_view(proof_view_id, proof_view_entry_id);
		if (NIL != sentence) {
			return qua_query.get_query_url_for_sentence(sentence, UNPROVIDED, UNPROVIDED);
		}
		return $str0$;
	}

	public static SubLObject get_sentence_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id) {
		final SubLObject proof_view_entry = find_proof_view_entry_by_ids(proof_view_id, proof_view_entry_id);
		if (NIL == proof_view_entry_p(proof_view_entry)) {
			return NIL;
		}
		final SubLObject v_object = proof_view_entry_get_object(proof_view_entry);
		if (NIL != arguments.support_p(v_object)) {
			return arguments.support_sentence(v_object);
		}
		if (NIL != cycl_grammar.cycl_sentence_p(v_object)) {
			return v_object;
		}
		return NIL;
	}

	public static SubLObject construct_proof_views_java_iteratively(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject inference_answer_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != integerp(problem_store_id) : "Types.integerp(problem_store_id) " + "CommonSymbols.NIL != Types.integerp(problem_store_id) " + problem_store_id;
		assert NIL != integerp(inference_id) : "Types.integerp(inference_id) " + "CommonSymbols.NIL != Types.integerp(inference_id) " + inference_id;
		assert NIL != integerp(inference_answer_id) : "Types.integerp(inference_answer_id) " + "CommonSymbols.NIL != Types.integerp(inference_answer_id) " + inference_answer_id;
		SubLObject num_answers = ZERO_INTEGER;
		SubLObject error = NIL;
		try {
			thread.throwStack.push($catch_error_message_target$.getGlobalValue());
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
					final SubLObject mt = pph_proof.pph_get_inference_mt(inference);
					final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(problem_store_id, inference_id, inference_answer_id);
					final SubLObject proofs = pph_proof.inference_answer_get_proofs(inference_answer);
					SubLObject cdolist_list_var;
					final SubLObject sorted_proofs = cdolist_list_var = proof_view_sort_proofs(proofs);
					SubLObject proof = NIL;
					proof = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						final SubLObject v_proof_view = construct_inference_proof_view(proof, inference_answer, mt);
						final SubLObject java_list = proof_view_construct_java_list(v_proof_view);
						num_answers = add(num_answers, ONE_INTEGER);
						task_processor.post_task_info_processor_partial_results(java_list);
						cdolist_list_var = cdolist_list_var.rest();
						proof = cdolist_list_var.first();
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
			return error;
		}
		return num_answers;
	}

	public static SubLObject proof_view_sort_proofs(final SubLObject proofs) {
		if (NIL != find_if(PROOF_ABDUCTIONS, proofs, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return Sort.sort(proofs, $sym339$_, PROOF_ABDUCED_SUPPORT_RATIO);
		}
		return Sort.sort(proofs, $sym339$_, INFERENCE_PROOF_GET_DEPTH);
	}

	public static SubLObject construct_proof_views_java_list(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject inference_answer_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != integerp(problem_store_id) : "Types.integerp(problem_store_id) " + "CommonSymbols.NIL != Types.integerp(problem_store_id) " + problem_store_id;
		assert NIL != integerp(inference_id) : "Types.integerp(inference_id) " + "CommonSymbols.NIL != Types.integerp(inference_id) " + inference_id;
		assert NIL != integerp(inference_answer_id) : "Types.integerp(inference_answer_id) " + "CommonSymbols.NIL != Types.integerp(inference_answer_id) " + inference_answer_id;
		final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
		final SubLObject mt = pph_proof.pph_get_inference_mt(inference);
		final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(problem_store_id, inference_id, inference_answer_id);
		final SubLObject proofs = Sort.sort(pph_proof.inference_answer_get_proofs(inference_answer), $sym339$_, INFERENCE_PROOF_GET_DEPTH);
		SubLObject proof_view_lists = NIL;
		format(T, $str360$inference_answer___A__, inference_answer);
		format(T, $str361$proofs___A__, proofs);
		SubLObject cdolist_list_var = proofs;
		SubLObject proof = NIL;
		proof = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject v_proof_view = construct_inference_proof_view(proof, inference_answer, mt);
			proof_view_set_addressee(v_proof_view, pph_vars.$pph_addressee$.getDynamicValue(thread));
			proof_view_lists = cons(proof_view_construct_java_list(v_proof_view), proof_view_lists);
			cdolist_list_var = cdolist_list_var.rest();
			proof = cdolist_list_var.first();
		}
		return nreverse(proof_view_lists);
	}

	public static SubLObject construct_xml_proof_view_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_properties, SubLObject include_contentP, SubLObject allow_external_linksP, SubLObject allow_internal_linksP) {
		if (inference_properties == UNPROVIDED) {
			inference_properties = NIL;
		}
		if (include_contentP == UNPROVIDED) {
			include_contentP = T;
		}
		if (allow_external_linksP == UNPROVIDED) {
			allow_external_linksP = T;
		}
		if (allow_internal_linksP == UNPROVIDED) {
			allow_internal_linksP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, inference_datastructures_enumerated_types.extract_query_static_properties(inference_properties));
		SubLObject xml = NIL;
		inference_kernel.continue_inference(inference, putf(inference_datastructures_enumerated_types.extract_query_dynamic_properties(inference_properties), $MAX_NUMBER, ONE_INTEGER));
		if (NIL != inference_datastructures_inference.inference_has_some_answerP(inference)) {
			final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
			if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
				final SubLObject idx_$42 = idx;
				if (NIL == id_index_dense_objects_empty_p(idx_$42, $SKIP)) {
					final SubLObject vector_var = id_index_dense_objects(idx_$42);
					final SubLObject backwardP_var = NIL;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject id;
					SubLObject inference_answer;
					SubLObject csome_list_var;
					SubLObject proof;
					SubLObject v_proof_view;
					SubLObject stream;
					SubLObject _prev_bind_0;
					SubLObject _prev_bind_2;
					SubLObject _values;
					for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
						id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
						inference_answer = aref(vector_var, id);
						if ((NIL == id_index_tombstone_p(inference_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							if (NIL != id_index_tombstone_p(inference_answer)) {
								inference_answer = $SKIP;
							}
							if ((NIL == xml) && (NIL == xml)) {
								csome_list_var = Sort.sort(pph_proof.inference_answer_get_proofs(inference_answer), symbol_function($sym339$_), INFERENCE_PROOF_GET_DEPTH);
								proof = NIL;
								proof = csome_list_var.first();
								while ((NIL == xml) && (NIL != csome_list_var)) {
									v_proof_view = new_proof_view(proof, inference_answer);
									proof_view_set_include_cycml_in_xmlP(v_proof_view, include_contentP);
									proof_view_set_allow_external_linksP(v_proof_view, allow_external_linksP);
									proof_view_set_allow_internal_linksP(v_proof_view, allow_internal_linksP);
									proof_view_populator.proof_view_populate(v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									stream = NIL;
									try {
										stream = make_private_string_output_stream();
										_prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
										try {
											xml_vars.$xml_stream$.bind(stream, thread);
											output_proof_view_in_xml(v_proof_view, UNPROVIDED);
										} finally {
											xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
										}
										xml = get_output_stream_string(stream);
									} finally {
										_prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											_values = getValuesAsVector();
											close(stream, UNPROVIDED);
											restoreValuesFromVector(_values);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
										}
									}
									csome_list_var = csome_list_var.rest();
									proof = csome_list_var.first();
								}
							}
						}
					}
				}
				final SubLObject idx_$43 = idx;
				if (NIL == id_index_sparse_objects_empty_p(idx_$43)) {
					final SubLObject cdohash_table = id_index_sparse_objects(idx_$43);
					SubLObject id2 = NIL;
					SubLObject inference_answer2 = NIL;
					final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
					try {
						while (iteratorHasNext(cdohash_iterator)) {
							final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
							id2 = getEntryKey(cdohash_entry);
							inference_answer2 = getEntryValue(cdohash_entry);
							if ((NIL == xml) && (NIL == xml)) {
								SubLObject csome_list_var2 = Sort.sort(pph_proof.inference_answer_get_proofs(inference_answer2), symbol_function($sym339$_), INFERENCE_PROOF_GET_DEPTH);
								SubLObject proof2 = NIL;
								proof2 = csome_list_var2.first();
								while ((NIL == xml) && (NIL != csome_list_var2)) {
									final SubLObject v_proof_view2 = new_proof_view(proof2, inference_answer2);
									proof_view_set_include_cycml_in_xmlP(v_proof_view2, include_contentP);
									proof_view_set_allow_external_linksP(v_proof_view2, allow_external_linksP);
									proof_view_set_allow_internal_linksP(v_proof_view2, allow_internal_linksP);
									proof_view_populator.proof_view_populate(v_proof_view2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									SubLObject stream2 = NIL;
									try {
										stream2 = make_private_string_output_stream();
										final SubLObject _prev_bind_3 = xml_vars.$xml_stream$.currentBinding(thread);
										try {
											xml_vars.$xml_stream$.bind(stream2, thread);
											output_proof_view_in_xml(v_proof_view2, UNPROVIDED);
										} finally {
											xml_vars.$xml_stream$.rebind(_prev_bind_3, thread);
										}
										xml = get_output_stream_string(stream2);
									} finally {
										final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											final SubLObject _values2 = getValuesAsVector();
											close(stream2, UNPROVIDED);
											restoreValuesFromVector(_values2);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
										}
									}
									csome_list_var2 = csome_list_var2.rest();
									proof2 = csome_list_var2.first();
								}
							}
						}
					} finally {
						releaseEntrySetIterator(cdohash_iterator);
					}
				}
			}
		}
		inference_datastructures_inference.destroy_inference(inference);
		return xml;
	}

	public static SubLObject proof_view_id_populate(final SubLObject proof_view_id) {
		proof_view_populator.proof_view_populate(find_proof_view_by_id(proof_view_id), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return T;
	}

	public static SubLObject proof_view_xml(final SubLObject proof_view_id, SubLObject include_entry_detailsP) {
		if (include_entry_detailsP == UNPROVIDED) {
			include_entry_detailsP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_proof_view = find_proof_view_by_id(proof_view_id);
		SubLObject xml = NIL;
		if (NIL == v_proof_view) {
			Errors.error($str366$_s_Does_not_identify_existing_pro, proof_view_id);
		}
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
			try {
				xml_vars.$xml_stream$.bind(stream, thread);
				xml_utilities.xml_header($float$1_0, $str367$UTF_8, NIL);
				output_proof_view_in_xml(v_proof_view, include_entry_detailsP);
			} finally {
				xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
			}
			xml = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return xml;
	}

	public static SubLObject proof_view_entry_xml(final SubLObject proof_view_id, final SubLObject entry_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject entry = find_proof_view_entry_by_ids(proof_view_id, entry_id);
		SubLObject xml = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
			try {
				xml_vars.$xml_stream$.bind(stream, thread);
				output_proof_view_entry_in_xml(entry, $TOP_LEVEL_ONLY);
			} finally {
				xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
			}
			xml = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return xml;
	}

	public static SubLObject proof_view_xml_tag(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list370);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject local_name = NIL;
		destructuring_bind_must_consp(current, datum, $list370);
		local_name = current.first();
		current = current.rest();
		final SubLObject attributes = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list370);
		current = current.rest();
		final SubLObject atomicP = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list370);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(XML_TAG, listS(local_name, attributes, atomicP, $list372), listS(CLET, $list373, append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list370);
		return NIL;
	}

	public static SubLObject output_proof_view_in_xml(final SubLObject v_proof_view, SubLObject include_entry_detailsP) {
		if (include_entry_detailsP == UNPROVIDED) {
			include_entry_detailsP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject id = proof_view_get_id(v_proof_view);
		try {
			final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
			final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
			try {
				xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
				xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
				xml_utilities.xml_start_tag_internal($str374$proof_view, list($$$id, id), NIL, NIL, xml_vars.proof_view_namespace());
				final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding(thread);
				final SubLObject _prev_bind_1_$45 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
				try {
					xml_vars.$xml_default_namespace$.bind(xml_vars.proof_view_namespace(), thread);
					xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread), thread);
					output_proof_view_entry_in_xml(proof_view_get_root_entry(v_proof_view), include_entry_detailsP);
				} finally {
					xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$45, thread);
					xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$44, thread);
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
				xml_utilities.xml_end_tag_internal($str374$proof_view);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return NIL;
	}

	public static SubLObject output_proof_view_details_in_xml(final SubLObject v_proof_view) {
		output_proof_view_section_in_xml(v_proof_view, $JUSTIFICATION_ROOT, $str377$proof_view_details);
		return v_proof_view;
	}

	public static SubLObject output_proof_view_sources_in_xml(final SubLObject v_proof_view) {
		output_proof_view_section_in_xml(v_proof_view, $SOURCES_ROOT, $str379$proof_view_sources);
		return v_proof_view;
	}

	public static SubLObject output_proof_view_rules_in_xml(final SubLObject v_proof_view) {
		output_proof_view_section_in_xml(v_proof_view, $RULES_USED, $str381$proof_view_rules);
		return v_proof_view;
	}

	public static SubLObject output_proof_view_section_in_xml(final SubLObject v_proof_view, final SubLObject section_key, final SubLObject tag_name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject id = proof_view_get_id(v_proof_view);
		final SubLObject section_root = proof_view_get_property(v_proof_view, section_key, UNPROVIDED);
		try {
			final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
			final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
			try {
				xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
				xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
				xml_utilities.xml_start_tag_internal(tag_name, list($str382$proof_view_id, id), NIL, NIL, xml_vars.proof_view_namespace());
				final SubLObject _prev_bind_0_$46 = xml_vars.$xml_default_namespace$.currentBinding(thread);
				final SubLObject _prev_bind_1_$47 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
				try {
					xml_vars.$xml_default_namespace$.bind(xml_vars.proof_view_namespace(), thread);
					xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread), thread);
					if (NIL != section_root) {
						final SubLObject children = proof_view_entry_get_children(section_root);
						if (NIL != list_utilities.non_empty_list_p(children)) {
							SubLObject cdolist_list_var = children;
							SubLObject child_entry = NIL;
							child_entry = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								output_proof_view_entry_in_xml(child_entry, UNPROVIDED);
								cdolist_list_var = cdolist_list_var.rest();
								child_entry = cdolist_list_var.first();
							}
						}
					}
				} finally {
					xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$47, thread);
					xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$46, thread);
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
				xml_utilities.xml_end_tag_internal(tag_name);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return v_proof_view;
	}

	public static SubLObject output_proof_view_entry_in_xml(final SubLObject entry, SubLObject include_entry_detailsP) {
		if (include_entry_detailsP == UNPROVIDED) {
			include_entry_detailsP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject entry_id = proof_view_entry_get_id(entry);
		final SubLObject v_proof_view = proof_view_entry_get_proof_view(entry);
		final SubLObject proof_view_id = proof_view_get_id(v_proof_view);
		final SubLObject attributes = proof_view_entry_xml_attributes(entry);
		try {
			final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
			final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
			try {
				xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
				xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
				xml_utilities.xml_start_tag_internal($str383$proof_view_entry, attributes, NIL, NIL, xml_vars.proof_view_namespace());
				final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
				final SubLObject _prev_bind_1_$49 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
				try {
					xml_vars.$xml_default_namespace$.bind(xml_vars.proof_view_namespace(), thread);
					xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread), thread);
					if ((!entry.eql(proof_view_get_root_entry(v_proof_view))) && (NIL != include_entry_detailsP)) {
						output_proof_view_entry_details_in_xml(proof_view_id, entry_id);
					}
					final SubLObject children = proof_view_entry_get_children(entry);
					include_entry_detailsP = makeBoolean((NIL != include_entry_detailsP) && (include_entry_detailsP != $TOP_LEVEL_ONLY));
					if (NIL != list_utilities.non_empty_list_p(children)) {
						try {
							final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
							final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
							try {
								xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
								xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
								xml_utilities.xml_start_tag_internal($str384$sub_entries, NIL, NIL, NIL, xml_vars.proof_view_namespace());
								final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding(thread);
								final SubLObject _prev_bind_1_$51 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
								try {
									xml_vars.$xml_default_namespace$.bind(xml_vars.proof_view_namespace(), thread);
									xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread), thread);
									SubLObject cdolist_list_var = children;
									SubLObject child_entry = NIL;
									child_entry = cdolist_list_var.first();
									while (NIL != cdolist_list_var) {
										output_proof_view_entry_in_xml(child_entry, include_entry_detailsP);
										cdolist_list_var = cdolist_list_var.rest();
										child_entry = cdolist_list_var.first();
									}
								} finally {
									xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$51, thread);
									xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$50, thread);
								}
							} finally {
								xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$50, thread);
								xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$49, thread);
							}
						} finally {
							final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								final SubLObject _values = getValuesAsVector();
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($str384$sub_entries);
								restoreValuesFromVector(_values);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
							}
						}
					}
				} finally {
					xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$49, thread);
					xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
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
				xml_utilities.xml_end_tag_internal($str383$proof_view_entry);
				restoreValuesFromVector(_values2);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return entry;
	}

	public static SubLObject output_proof_view_entry_details_in_xml(final SubLObject proof_view_id, final SubLObject entry_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject entry = find_proof_view_entry_by_ids(proof_view_id, entry_id);
		final SubLObject v_proof_view = proof_view_entry_get_proof_view(entry);
		if (NIL == v_proof_view) {
			Errors.error($str366$_s_Does_not_identify_existing_pro, proof_view_id);
		}
		SubLObject current;
		final SubLObject datum = current = proof_view_entry_html(proof_view_id, entry_id);
		SubLObject html = NIL;
		SubLObject cycl = NIL;
		destructuring_bind_must_consp(current, datum, $list385);
		html = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list385);
		cycl = current.first();
		current = current.rest();
		if (NIL == current) {
			cycml.cycml_serialize_paraphrase(html, UNPROVIDED);
			if ((NIL != proof_view_get_include_cycl_in_outputP(v_proof_view)) && (NIL != cycl_grammar.cycl_expression_p(cycl))) {
				try {
					final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
					final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
					try {
						xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
						xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
						xml_utilities.xml_start_tag_internal($$$cycl, NIL, NIL, NIL, xml_vars.proof_view_namespace());
						final SubLObject _prev_bind_0_$55 = xml_vars.$xml_default_namespace$.currentBinding(thread);
						final SubLObject _prev_bind_1_$56 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
						try {
							xml_vars.$xml_default_namespace$.bind(xml_vars.proof_view_namespace(), thread);
							xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread), thread);
							xml_utilities.xml_cdata(princ_to_string(cycl));
						} finally {
							xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$56, thread);
							xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$55, thread);
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
						xml_utilities.xml_end_tag_internal($$$cycl);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
					}
				}
			}
			if (NIL != proof_view_get_include_cycml_in_xmlP(v_proof_view)) {
				output_proof_view_entry_content_in_xml(cycl);
			}
		} else {
			cdestructuring_bind_error(datum, $list385);
		}
		return NIL;
	}

	public static SubLObject proof_view_cycl_silk_string(final SubLObject value) {
		return NIL;
	}

	public static SubLObject proof_view_entry_xml_attributes(final SubLObject entry) {
		final SubLObject entry_id = proof_view_entry_get_id(entry);
		final SubLObject expand_initiallyP = proof_view_entry_expand_intiallyP(entry);
		final SubLObject label = proof_view_entry_get_label(entry);
		final SubLObject abduced_supportP = abduction.abduction_support_p(proof_view_entry_get_object(entry));
		final SubLObject attributes = list(new SubLObject[] { $$$id, princ_to_string(entry_id), $str387$expand_initially, xml_utilities.boolean_to_trueXfalse_string(expand_initiallyP), $$$label, label, $str389$object_type, Strings.string_downcase(princ_to_string(proof_view_entry_get_object_type(entry)), UNPROVIDED, UNPROVIDED), $str390$abduced_support, xml_utilities.boolean_to_trueXfalse_string(abduced_supportP) });
		return attributes;
	}

	public static SubLObject output_proof_view_entry_content_in_xml(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		try {
			final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
			final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
			try {
				xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
				xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
				xml_utilities.xml_start_tag_internal($$$content, NIL, NIL, NIL, xml_vars.proof_view_namespace());
				final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
				final SubLObject _prev_bind_1_$58 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
				try {
					xml_vars.$xml_default_namespace$.bind(xml_vars.proof_view_namespace(), thread);
					xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread), thread);
					if (NIL != cycl_grammar.cycl_denotational_term_p(cycl)) {
						cycml.cycml_serialize_term(cycl);
					} else if (NIL != cycl_grammar.cycl_sentence_p(cycl)) {
						cycml.cycml_serialize_sentence(cycl);
					} else if (NIL != cycl) {
						cycml_generator.cycml_serialize_object(cycl);
					}

				} finally {
					xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$58, thread);
					xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
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
				xml_utilities.xml_end_tag_internal($$$content);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return cycl;
	}

	public static SubLObject proof_view_construct_java_list(final SubLObject v_proof_view) {
		assert NIL != valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
		SubLObject proof_view_entry_lists = NIL;
		SubLObject cdolist_list_var = proof_view_get_entries(v_proof_view);
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			proof_view_entry_lists = cons(proof_view_entry_construct_java_list(entry), proof_view_entry_lists);
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		return list($ID, proof_view_get_id(v_proof_view), $ENTRIES, nreverse(proof_view_entry_lists));
	}

	public static SubLObject proof_view_entry_construct_java_list(final SubLObject proof_view_entry) {
		assert NIL != proof_view_entry_p(proof_view_entry) : "proof_view.proof_view_entry_p(proof_view_entry) " + "CommonSymbols.NIL != proof_view.proof_view_entry_p(proof_view_entry) " + proof_view_entry;
		final SubLObject id = proof_view_entry_get_id(proof_view_entry);
		final SubLObject parent_id = proof_view_entry_get_parent_id(proof_view_entry);
		final SubLObject expand_initiallyP = (NIL != proof_view_entry_expand_intiallyP(proof_view_entry)) ? $TRUE : $FALSE;
		final SubLObject label = proof_view_entry_get_label(proof_view_entry);
		final SubLObject abduced_supportP = (NIL != abduction.abduction_support_p(proof_view_entry_get_object(proof_view_entry))) ? $TRUE : $FALSE;
		SubLObject result = NIL;
		result = list(new SubLObject[] { $ID, id, $PARENT_ID, parent_id, $kw215$EXPAND_INITIALLY_, expand_initiallyP, $LABEL, label, $kw395$ABDUCED_SUPPORT_, abduced_supportP });
		return result;
	}

	public static SubLObject get_new_empty_proof_view(SubLObject inference_answer, SubLObject proof) {
		if (inference_answer == UNPROVIDED) {
			inference_answer = NIL;
		}
		if (proof == UNPROVIDED) {
			proof = NIL;
		}
		final SubLObject v_proof_view = new_proof_view(UNPROVIDED, UNPROVIDED);
		if (NIL != inference_answer) {
			proof_view_set_answer(v_proof_view, inference_answer);
			SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
			SubLObject justification = NIL;
			justification = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cdolist_list_var_$59 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
				SubLObject one_proof = NIL;
				one_proof = cdolist_list_var_$59.first();
				while (NIL != cdolist_list_var_$59) {
					if (NIL == proof) {
						proof = one_proof;
					}
					cdolist_list_var_$59 = cdolist_list_var_$59.rest();
					one_proof = cdolist_list_var_$59.first();
				}
				cdolist_list_var = cdolist_list_var.rest();
				justification = cdolist_list_var.first();
			}
			proof_view_set_proof(v_proof_view, proof);
		}
		return v_proof_view;
	}

	public static SubLObject get_new_empty_proof_view_id(SubLObject problem_store_id, SubLObject inference_id, SubLObject inference_answer_id, SubLObject proof_id) {
		if (problem_store_id == UNPROVIDED) {
			problem_store_id = NIL;
		}
		if (inference_id == UNPROVIDED) {
			inference_id = NIL;
		}
		if (inference_answer_id == UNPROVIDED) {
			inference_answer_id = NIL;
		}
		if (proof_id == UNPROVIDED) {
			proof_id = NIL;
		}
		SubLObject inference_answer = NIL;
		SubLObject proof = NIL;
		if (NIL != problem_store_id) {
			final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
			final SubLObject inference = (NIL != problem_store) ? inference_datastructures_problem_store.find_inference_by_id(problem_store, NIL != inference_id ? inference_id : ZERO_INTEGER) : NIL;
			if (NIL != inference) {
				inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, NIL != inference_answer_id ? inference_answer_id : ZERO_INTEGER);
			}
			if (((NIL != problem_store) && (NIL != inference_answer)) && (NIL != proof_id)) {
				proof = inference_datastructures_problem_store.find_proof_by_id(problem_store, proof_id);
			}
		}
		return proof_view_get_id(get_new_empty_proof_view(inference_answer, proof));
	}

	public static SubLObject proof_view_set_proof(final SubLObject v_proof_view, final SubLObject proof) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
		_csetf_proof_view_int_proof(v_proof_view, proof);
		return v_proof_view;
	}

	public static SubLObject proof_view_set_answer(final SubLObject v_proof_view, final SubLObject inference_answer) {
		assert NIL != proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
		assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
		_csetf_proof_view_int_answer(v_proof_view, inference_answer);
		return v_proof_view;
	}

	public static SubLObject construct_inference_proof_view(final SubLObject proof, final SubLObject inference_answer, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer));
		}
		assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
		assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
		final SubLObject v_proof_view = new_proof_view(proof, inference_answer);
		proof_view_populator.proof_view_populate(v_proof_view, mt, UNPROVIDED, UNPROVIDED);
		return v_proof_view;
	}

	public static SubLObject proof_view_closed_query_success_value() {
		return $str398$Yes_;
	}

	public static SubLObject proof_view_get_used_rules_root(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $USED_RULES_ROOT, UNPROVIDED);
	}

	public static SubLObject proof_view_get_query_root(final SubLObject v_proof_view) {
		return proof_view_get_property(v_proof_view, $QUERY_ROOT, UNPROVIDED);
	}

	public static SubLObject proof_view_fact_trivially_implies_proof_conclusionP_internal(final SubLObject item, final SubLObject v_proof_view, SubLObject allow_partialP) {
		if (allow_partialP == UNPROVIDED) {
			allow_partialP = $proof_view_allow_trivial_partial_proof_conclusion_supportsP$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject inference = inference_datastructures_inference.inference_answer_inference(proof_view_get_answer(v_proof_view));
		final SubLObject conclusion = pph_proof.pph_proof_conclusion(proof_view_get_proof(v_proof_view), pph_proof.pph_get_inference_mt(inference));
		SubLObject candidates = NIL;
		if ((NIL != el_conjunction_p(conclusion)) && (NIL == allow_partialP)) {
			return NIL;
		}
		SubLObject cdolist_list_var = (NIL != el_conjunction_p(conclusion)) ? cycl_utilities.formula_args(conclusion, UNPROVIDED) : list(conclusion);
		SubLObject conjunct = NIL;
		conjunct = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject conjunct_asent = proof_view_fact_sentence(conjunct);
			if (NIL != proof_view_fact_trivially_impliesP(item, conjunct, UNPROVIDED)) {
				candidates = cons(conjunct_asent, candidates);
			}
			cdolist_list_var = cdolist_list_var.rest();
			conjunct = cdolist_list_var.first();
		}
		if (NIL != candidates) {
			final SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
			SubLObject cdolist_list_var2 = candidates;
			SubLObject conjunct2 = NIL;
			conjunct2 = cdolist_list_var2.first();
			while (NIL != cdolist_list_var2) {
				SubLObject cdolist_list_var_$60 = hl_query;
				SubLObject clause = NIL;
				clause = cdolist_list_var_$60.first();
				while (NIL != cdolist_list_var_$60) {
					SubLObject cdolist_list_var_$61 = clauses.pos_lits(clause);
					SubLObject lit = NIL;
					lit = cdolist_list_var_$61.first();
					while (NIL != cdolist_list_var_$61) {
						SubLObject current;
						final SubLObject datum = current = lit;
						SubLObject mt = NIL;
						SubLObject asent = NIL;
						destructuring_bind_must_consp(current, datum, $list402);
						mt = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list402);
						asent = current.first();
						current = current.rest();
						if (NIL == current) {
							final SubLObject v_bindings = unification_utilities.asent_unify(conjunct2, asent, UNPROVIDED, UNPROVIDED);
							SubLObject abortP = sublisp_null(v_bindings);
							if (NIL == abortP) {
								SubLObject csome_list_var = v_bindings;
								SubLObject binding = NIL;
								binding = csome_list_var.first();
								while ((NIL == abortP) && (NIL != csome_list_var)) {
									final SubLObject var = bindings.variable_binding_variable(binding);
									if ((NIL != cycl_grammar.hl_variable_p(var)) && (NIL == subl_promotions.memberP(var, inference_datastructures_inference.inference_free_hl_vars(inference), UNPROVIDED, UNPROVIDED))) {
										abortP = T;
									}
									csome_list_var = csome_list_var.rest();
									binding = csome_list_var.first();
								}
							}
							if (NIL == abortP) {
								if (NIL != $proof_view_debugP$.getDynamicValue(thread)) {
									Errors.warn($str403$_S___trivially_implies_answer_con, item, conjunct2);
								}
								return T;
							}
						} else {
							cdestructuring_bind_error(datum, $list402);
						}
						cdolist_list_var_$61 = cdolist_list_var_$61.rest();
						lit = cdolist_list_var_$61.first();
					}
					cdolist_list_var_$60 = cdolist_list_var_$60.rest();
					clause = cdolist_list_var_$60.first();
				}
				cdolist_list_var2 = cdolist_list_var2.rest();
				conjunct2 = cdolist_list_var2.first();
			}
		}
		return NIL;
	}

	public static SubLObject proof_view_fact_trivially_implies_proof_conclusionP(final SubLObject item, final SubLObject v_proof_view, SubLObject allow_partialP) {
		if (allow_partialP == UNPROVIDED) {
			allow_partialP = $proof_view_allow_trivial_partial_proof_conclusion_supportsP$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_fact_trivially_implies_proof_conclusionP_internal(item, v_proof_view, allow_partialP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(item, v_proof_view, allow_partialP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (item.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (v_proof_view.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && allow_partialP.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_fact_trivially_implies_proof_conclusionP_internal(item, v_proof_view, allow_partialP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(item, v_proof_view, allow_partialP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject proof_view_tva_support_entryP(final SubLObject entry, SubLObject check_parent_tooP) {
		if (check_parent_tooP == UNPROVIDED) {
			check_parent_tooP = T;
		}
		final SubLObject entry_object = (NIL != entry) ? proof_view_entry_get_object(entry) : NIL;
		if ((NIL != arguments.support_p(entry_object)) && $TVA.eql(arguments.support_module(entry_object))) {
			return T;
		}
		if (NIL != check_parent_tooP) {
			final SubLObject parent = find_proof_view_entry_by_id(proof_view_entry_get_proof_view(entry), proof_view_entry_get_parent_id(entry));
			return proof_view_tva_support_entryP(parent, NIL);
		}
		return NIL;
	}

	public static SubLObject proof_view_entry_has_support_entryP(final SubLObject entry) {
		SubLObject ans = NIL;
		if (NIL == ans) {
			SubLObject csome_list_var = proof_view_entry_get_children(entry);
			SubLObject child_entry = NIL;
			child_entry = csome_list_var.first();
			while ((NIL == ans) && (NIL != csome_list_var)) {
				if (NIL != member(proof_view_entry_get_object_type(child_entry), $list405, UNPROVIDED, UNPROVIDED)) {
					ans = T;
				}
				csome_list_var = csome_list_var.rest();
				child_entry = csome_list_var.first();
			}
		}
		return ans;
	}

	public static SubLObject proof_view_rule_support_entryP(final SubLObject entry) {
		return makeBoolean((NIL != member(proof_view_entry_get_object_type(entry), $list406, symbol_function(EQUAL), UNPROVIDED)) && (NIL != assertions_high.rule_assertionP(proof_view_entry_get_object(entry))));
	}

	public static SubLObject proof_view_has_sourcesP(final SubLObject v_proof_view) {
		return dictionary.dictionary_p(proof_view_get_source_index(v_proof_view));
	}

	public static SubLObject proof_view_has_justification_sectionP(final SubLObject v_proof_view) {
		return proof_view_has_sectionP(v_proof_view, $JUSTIFICATION_ROOT);
	}

	public static SubLObject proof_view_has_sectionP(final SubLObject v_proof_view, final SubLObject section_key) {
		return proof_view_entry_p(proof_view_get_property(v_proof_view, section_key, NIL));
	}

	public static SubLObject proof_view_fact_trivially_impliesP(final SubLObject fact1, final SubLObject fact2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_proof.pph_triviality_check_mt();
		}
		return proof_view_fact_impliesP(fact1, fact2, mt, T);
	}

	public static SubLObject proof_view_fact_impliesP_internal(final SubLObject fact1, final SubLObject fact2, SubLObject mt, SubLObject triviallyP) {
		if (mt == UNPROVIDED) {
			mt = pph_proof.pph_triviality_check_mt();
		}
		if (triviallyP == UNPROVIDED) {
			triviallyP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject s1 = proof_view_fact_sentence(fact1);
		final SubLObject s2 = proof_view_fact_sentence(fact2);
		SubLObject trivialP = NIL;
		if (s1.equal(s2)) {
			return T;
		}
		if (NIL != fact_sheets.fact_sheet_sentence_trivially_impliesP(narts_high.nart_substitute(s1), narts_high.nart_substitute(s2), mt, triviallyP, NIL)) {
			trivialP = T;
		}
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(s1, $list408);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			final SubLObject factor = list_utilities.alist_lookup_without_values(v_bindings, FACTOR, UNPROVIDED, UNPROVIDED);
			final SubLObject slot = list_utilities.alist_lookup_without_values(v_bindings, SLOT, UNPROVIDED, UNPROVIDED);
			final SubLObject event = list_utilities.alist_lookup_without_values(v_bindings, EVENT, UNPROVIDED, UNPROVIDED);
			if ((factor.isNumber() && factor.numG(ONE_INTEGER)) && (NIL != formula_pattern_match.formula_matches_pattern(s2, list($list412, event, list($$IncreaseOnSlotFn, slot))))) {
				trivialP = T;
			}
		}
		thread.resetMultipleValues();
		success = formula_pattern_match.formula_matches_pattern(s1, $list414);
		v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			final SubLObject col2 = list_utilities.alist_lookup_without_values(v_bindings, COL2, UNPROVIDED, UNPROVIDED);
			final SubLObject col3 = list_utilities.alist_lookup_without_values(v_bindings, COL1, UNPROVIDED, UNPROVIDED);
			final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
			thread.resetMultipleValues();
			final SubLObject success_$62 = formula_pattern_match.formula_matches_pattern(s2, list($list418, col3, col2));
			final SubLObject v_bindings_$63 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != success_$62) {
				final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings_$63, PRED, UNPROVIDED, UNPROVIDED);
				if (NIL == trivialP) {
					SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(pred, $$coGenlPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject kappa = NIL;
					kappa = csome_list_var.first();
					while ((NIL == trivialP) && (NIL != csome_list_var)) {
						if (NIL != formula_pattern_match.formula_matches_pattern(kappa, list($$Kappa, $list421, listS($$relationAllExists, bin_pred, $list421)))) {
							trivialP = T;
						}
						csome_list_var = csome_list_var.rest();
						kappa = csome_list_var.first();
					}
				}
			}
		}
		thread.resetMultipleValues();
		success = formula_pattern_match.formula_matches_pattern(s1, $list424);
		v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			final SubLObject min = list_utilities.alist_lookup_without_values(v_bindings, MIN, UNPROVIDED, UNPROVIDED);
			final SubLObject col4 = list_utilities.alist_lookup_without_values(v_bindings, COL2, UNPROVIDED, UNPROVIDED);
			final SubLObject col5 = list_utilities.alist_lookup_without_values(v_bindings, COL1, UNPROVIDED, UNPROVIDED);
			final SubLObject bin_pred2 = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
			if ((min.isNumber() && min.isPositive()) && (NIL != formula_pattern_match.formula_matches_pattern(s2, list($$relationAllExists, bin_pred2, col5, col4)))) {
				trivialP = T;
			}
		}
		thread.resetMultipleValues();
		success = formula_pattern_match.formula_matches_pattern(s1, $list426);
		v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			final SubLObject subs = list_utilities.alist_lookup_without_values(v_bindings, SUBS, UNPROVIDED, UNPROVIDED);
			final SubLObject v_super = list_utilities.alist_lookup_without_values(v_bindings, SUPER, UNPROVIDED, UNPROVIDED);
			if (NIL != formula_pattern_match.formula_matches_pattern(s2, list($list429, v_super, list_utilities.last_one(el_list_items(subs))))) {
				trivialP = T;
			}
			thread.resetMultipleValues();
			final SubLObject success_$63 = formula_pattern_match.formula_matches_pattern(s2, listS($list430, v_super, $list431));
			final SubLObject v_bindings_$64 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != success_$63) {
				final SubLObject sub2 = list_utilities.alist_lookup_without_values(v_bindings_$64, SUB2, UNPROVIDED, UNPROVIDED);
				final SubLObject sub3 = list_utilities.alist_lookup_without_values(v_bindings_$64, SUB1, UNPROVIDED, UNPROVIDED);
				final SubLObject pos1 = position(sub3, subs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
				final SubLObject pos2 = position(sub2, subs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
				trivialP = makeBoolean(((NIL != pos1) && (NIL != pos2)) && pos1.numG(pos2));
			}
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(s2, list($list434, $FULLY_BOUND, s1))) {
			trivialP = T;
		}
		thread.resetMultipleValues();
		success = formula_pattern_match.formula_matches_pattern(s1, $list436);
		v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			final SubLObject sub4 = list_utilities.alist_lookup_without_values(v_bindings, SUB, UNPROVIDED, UNPROVIDED);
			final SubLObject sup = list_utilities.alist_lookup_without_values(v_bindings, SUP, UNPROVIDED, UNPROVIDED);
			if (NIL != formula_pattern_match.formula_matches_pattern(s2, list($$startTogetherInSituationType, $ANYTHING, sup, sub4))) {
				trivialP = T;
			}
		}
		if ((NIL != trivialP) && (NIL != $proof_view_debugP$.getDynamicValue(thread))) {
			Errors.warn($str441$_S___trivially_implies__S, fact1, fact2);
		}
		return trivialP;
	}

	public static SubLObject proof_view_fact_impliesP(final SubLObject fact1, final SubLObject fact2, SubLObject mt, SubLObject triviallyP) {
		if (mt == UNPROVIDED) {
			mt = pph_proof.pph_triviality_check_mt();
		}
		if (triviallyP == UNPROVIDED) {
			triviallyP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_fact_impliesP_internal(fact1, fact2, mt, triviallyP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym407$PROOF_VIEW_FACT_IMPLIES_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym407$PROOF_VIEW_FACT_IMPLIES_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym407$PROOF_VIEW_FACT_IMPLIES_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(fact1, fact2, mt, triviallyP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (fact1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (fact2.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && triviallyP.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_fact_impliesP_internal(fact1, fact2, mt, triviallyP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fact1, fact2, mt, triviallyP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject proof_view_fact_sentence_internal(final SubLObject fact) {
		if (NIL != arguments.support_p(fact)) {
			return arguments.support_el_sentence(fact);
		}
		if (NIL != cycl_grammar.cycl_sentence_p(fact)) {
			return cycl_utilities.hl_to_el(fact);
		}
		Errors.error($str443$Don_t_know_how_to_get_sentence_of, fact);
		return NIL;
	}

	public static SubLObject proof_view_fact_sentence(final SubLObject fact) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_fact_sentence_internal(fact);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_FACT_SENTENCE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_FACT_SENTENCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_FACT_SENTENCE, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, fact, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_fact_sentence_internal(fact)));
			memoization_state.caching_state_put(caching_state, fact, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_view_fact_hl_sentence_internal(final SubLObject fact) {
		if (NIL != assertion_handles.assertion_p(fact)) {
			return fact;
		}
		if (NIL != arguments.support_p(fact)) {
			return arguments.support_sentence(fact);
		}
		if (NIL != cycl_grammar.cycl_sentence_p(fact)) {
			return pph_proof.pph_sub_isomorphic_assertions_into_supports(narts_high.nart_substitute(fact));
		}
		Errors.error($str445$Don_t_know_how_to_get_HL_sentence, fact);
		return NIL;
	}

	public static SubLObject proof_view_fact_hl_sentence(final SubLObject fact) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_fact_hl_sentence_internal(fact);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_FACT_HL_SENTENCE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_FACT_HL_SENTENCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_FACT_HL_SENTENCE, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, fact, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_fact_hl_sentence_internal(fact)));
			memoization_state.caching_state_put(caching_state, fact, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_view_fact_sentence_with_hl_terms_internal(final SubLObject fact) {
		if (NIL != assertions_high.gaf_assertionP(fact)) {
			return fi.assertion_hl_formula(fact, UNPROVIDED);
		}
		if (NIL != assertion_handles.assertion_p(fact)) {
			return fact;
		}
		if (NIL != arguments.support_p(fact)) {
			return arguments.support_sentence(fact);
		}
		if (NIL != cycl_grammar.cycl_sentence_p(fact)) {
			return pph_proof.pph_sub_isomorphic_assertions_into_supports(narts_high.nart_substitute(fact));
		}
		if (NIL != proof_view_entry_p(fact)) {
			return proof_view_fact_sentence_with_hl_terms(proof_view_entry_get_object(fact));
		}
		Errors.error($str445$Don_t_know_how_to_get_HL_sentence, fact);
		return NIL;
	}

	public static SubLObject proof_view_fact_sentence_with_hl_terms(final SubLObject fact) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_fact_sentence_with_hl_terms_internal(fact);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, fact, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_fact_sentence_with_hl_terms_internal(fact)));
			memoization_state.caching_state_put(caching_state, fact, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_view_transitive_support_p(final SubLObject obj) {
		return makeBoolean((((NIL != arguments.support_p(obj)) && (NIL != member(arguments.support_module(obj), $list447, UNPROVIDED, UNPROVIDED))) && (NIL == el_negation_p(arguments.support_sentence(obj)))) && (NIL == member(arguments.support_truth(obj), $list448, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject proof_view_rule_suitable_for_rules_sectionP(final SubLObject rule) {
		return makeBoolean((NIL != assertions_high.rule_assertionP(rule)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(rule, $$keyRuleEnglishSummary, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject suppress_proof_supportP(final SubLObject support) {
		return suppress_proof_view_literalP(arguments.support_sentence(support));
	}

	public static SubLObject suppress_proof_view_literalP(final SubLObject asent) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != misc_utilities.initialized_p($proof_view_literals_to_suppress$.getDynamicValue(thread))) {
			final SubLObject el_asent = cycl_utilities.naut_substitute(asent);
			SubLObject cdolist_list_var = $proof_view_literals_to_suppress$.getDynamicValue(thread);
			SubLObject lit = NIL;
			lit = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != sentence_matches_suppressed_literalP(el_asent, lit)) {
					if (NIL != $proof_view_debugP$.getDynamicValue(thread)) {
						Errors.warn($str449$Suppressing__S___because_it_match, asent, lit);
					}
					return T;
				}
				cdolist_list_var = cdolist_list_var.rest();
				lit = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static SubLObject sentence_matches_suppressed_literalP_internal(final SubLObject sentence, final SubLObject lit) {
		if ((NIL != forts.fort_p(lit.first())) && (NIL != fort_types_interface.predicate_p(lit.first()))) {
			rplaca(lit, list($TEST, $sym452$GENL_PREDICATE_, lit.first()));
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(sentence, lit)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject sentence_matches_suppressed_literalP(final SubLObject sentence, final SubLObject lit) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return sentence_matches_suppressed_literalP_internal(sentence, lit);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, lit);
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
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && lit.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sentence_matches_suppressed_literalP_internal(sentence, lit)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, lit));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject anything_token(SubLObject ignore) {
		if (ignore == UNPROVIDED) {
			ignore = NIL;
		}
		return $ANYTHING;
	}

	public static SubLObject proof_view_external_support_p(final SubLObject v_object) {
		return makeBoolean((NIL != arguments.support_p(v_object)) && (NIL != subl_promotions.memberP(arguments.support_module(v_object), $list453, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject proof_view_get_document_for_hypothesis_internal(final SubLObject hypothesis, final SubLObject mt) {
		SubLObject cdolist_list_var = pph_utilities.pph_ask_variable_new($sym324$_DOCUMENT, listS($$sourceOfTerm, hypothesis, $list458), mt, UNPROVIDED);
		SubLObject source = NIL;
		source = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != pph_utilities.pph_removal_ask_boolean(listS($$isa, source, $list456), mt)) {
				return source;
			}
			cdolist_list_var = cdolist_list_var.rest();
			source = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject proof_view_get_document_for_hypothesis(final SubLObject hypothesis, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return proof_view_get_document_for_hypothesis_internal(hypothesis, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(hypothesis, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (hypothesis.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_get_document_for_hypothesis_internal(hypothesis, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(hypothesis, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject inference_proofE(final SubLObject proof1, final SubLObject proof2) {
		final SubLObject supports1 = inference_datastructures_proof.proof_direct_supports(proof1);
		final SubLObject supports2 = inference_datastructures_proof.proof_direct_supports(proof2);
		return makeBoolean(((NIL != list_utilities.same_length_p(supports1, supports2)) && (NIL != list_utilities.proper_list_p(supports1))) && (NIL == set_difference(supports1, supports2, symbol_function(EQUAL), UNPROVIDED)));
	}

	public static SubLObject inference_proof_get_depth(final SubLObject proof) {
		return inference_proof_get_depth_memoized(proof);
	}

	public static SubLObject inference_proof_get_depth_memoized_internal(final SubLObject proof) {
		if (NIL == inference_datastructures_proof.proof_direct_subproofs(proof)) {
			return ONE_INTEGER;
		}
		return number_utilities.f_1X(number_utilities.maximum(Mapping.mapcar(INFERENCE_PROOF_GET_DEPTH_MEMOIZED, inference_datastructures_proof.proof_direct_subproofs(proof)), UNPROVIDED));
	}

	public static SubLObject inference_proof_get_depth_memoized(final SubLObject proof) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return inference_proof_get_depth_memoized_internal(proof);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_PROOF_GET_DEPTH_MEMOIZED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_PROOF_GET_DEPTH_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, INFERENCE_PROOF_GET_DEPTH_MEMOIZED, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_proof_get_depth_memoized_internal(proof)));
			memoization_state.caching_state_put(caching_state, proof, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject proof_el_formula(final SubLObject proof, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_proof_mt(proof);
		}
		final SubLObject query_dnfs = inference_worker.proof_proven_query(proof);
		final SubLObject query_el_formula = inference_czer.contextualized_dnf_clauses_formula(query_dnfs, mt);
		return query_el_formula;
	}

	public static SubLObject pph_proof_mt(final SubLObject proof) {
		final SubLObject dnf = inference_datastructures_proof.proof_supported_problem_query(proof);
		final SubLObject clause = dnf.first();
		final SubLObject pos_lit = clauses.pos_lits(clause).first();
		return pos_lit.first();
	}

	public static SubLObject terse_justification_for_inference_ids(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject mt) {
		final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
		if (NIL != inference) {
			return terse_justification_for_inference(inference, mt);
		}
		return NIL;
	}

	public static SubLObject terse_justification_for_inference(final SubLObject inference, SubLObject mt) {
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
			SubLObject return_value = NIL;
			final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
			if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
				final SubLObject idx_$66 = idx;
				if (NIL == id_index_dense_objects_empty_p(idx_$66, $SKIP)) {
					final SubLObject vector_var = id_index_dense_objects(idx_$66);
					final SubLObject backwardP_var = NIL;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject id;
					SubLObject this_answer;
					SubLObject entry_for_answer;
					SubLObject inference_entities;
					SubLObject cdolist_list_var;
					SubLObject this_justification;
					SubLObject lst_of_answers;
					SubLObject result;
					SubLObject cdolist_list_var_$67;
					SubLObject this_proof;
					SubLObject cdolist_list_var_$68;
					SubLObject subproof;
					SubLObject conclusion;
					SubLObject result_entry;
					SubLObject cdolist_list_var_$69;
					SubLObject support;
					SubLObject gaf;
					SubLObject result_entry2;
					SubLObject cdolist_list_var_$70;
					SubLObject support_just;
					SubLObject cdolist_list_var_$71;
					SubLObject argument;
					SubLObject cdolist_list_var_$72;
					SubLObject deduction_support;
					SubLObject deduction_gaf;
					SubLObject result_entry3;
					for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
						id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
						this_answer = aref(vector_var, id);
						if ((NIL == id_index_tombstone_p(this_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							if (NIL != id_index_tombstone_p(this_answer)) {
								this_answer = $SKIP;
							}
							entry_for_answer = NIL;
							inference_entities = entities_in_bindings(inference_datastructures_inference.inference_answer_bindings(this_answer), UNPROVIDED);
							cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
							this_justification = NIL;
							this_justification = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								lst_of_answers = NIL;
								result = NIL;
								cdolist_list_var_$67 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
								this_proof = NIL;
								this_proof = cdolist_list_var_$67.first();
								while (NIL != cdolist_list_var_$67) {
									cdolist_list_var_$68 = inference_datastructures_proof.all_proof_subproofs(this_proof);
									subproof = NIL;
									subproof = cdolist_list_var_$68.first();
									while (NIL != cdolist_list_var_$68) {
										if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(subproof)) {
											conclusion = proof_view_residual.pph_residual_transformation_proof_conclusion(subproof, mt);
											result_entry = find_result_entry_for_gaf(conclusion, lst_of_answers, NIL, inference_datastructures_proof.proof_suid(subproof));
											if (NIL != result_entry) {
												lst_of_answers = cons(conclusion, lst_of_answers);
												result = cons(result_entry, result);
											}
										}
										cdolist_list_var_$69 = inference_datastructures_proof.all_proof_supports(subproof);
										support = NIL;
										support = cdolist_list_var_$69.first();
										while (NIL != cdolist_list_var_$69) {
											if (NIL != assertion_handles.assertion_p(support)) {
												gaf = assertions_high.gaf_formula(support);
												result_entry2 = find_result_entry_for_gaf(gaf, lst_of_answers, support, inference_datastructures_proof.proof_suid(subproof));
												if (NIL != result_entry2) {
													lst_of_answers = cons(gaf, lst_of_answers);
													result = cons(result_entry2, result);
												}
												cdolist_list_var_$70 = arguments.support_justification(support);
												support_just = NIL;
												support_just = cdolist_list_var_$70.first();
												while (NIL != cdolist_list_var_$70) {
													if (NIL != assertion_handles.assertion_p(support_just)) {
														cdolist_list_var_$71 = assertions_high.assertion_arguments(support_just);
														argument = NIL;
														argument = cdolist_list_var_$71.first();
														while (NIL != cdolist_list_var_$71) {
															if (NIL != deduction_handles.deduction_p(argument)) {
																cdolist_list_var_$72 = deductions_high.deduction_supports(argument);
																deduction_support = NIL;
																deduction_support = cdolist_list_var_$72.first();
																while (NIL != cdolist_list_var_$72) {
																	if (NIL != assertion_handles.assertion_p(deduction_support)) {
																		deduction_gaf = assertions_high.assertion_formula(deduction_support);
																		result_entry3 = find_result_entry_for_gaf(deduction_gaf, lst_of_answers, deduction_support, inference_datastructures_proof.proof_suid(subproof));
																		if (NIL != result_entry3) {
																			lst_of_answers = cons(deduction_gaf, lst_of_answers);
																			result = cons(result_entry3, result);
																		}
																	}
																	cdolist_list_var_$72 = cdolist_list_var_$72.rest();
																	deduction_support = cdolist_list_var_$72.first();
																}
															}
															cdolist_list_var_$71 = cdolist_list_var_$71.rest();
															argument = cdolist_list_var_$71.first();
														}
													}
													cdolist_list_var_$70 = cdolist_list_var_$70.rest();
													support_just = cdolist_list_var_$70.first();
												}
											}
											cdolist_list_var_$69 = cdolist_list_var_$69.rest();
											support = cdolist_list_var_$69.first();
										}
										cdolist_list_var_$68 = cdolist_list_var_$68.rest();
										subproof = cdolist_list_var_$68.first();
									}
									cdolist_list_var_$67 = cdolist_list_var_$67.rest();
									this_proof = cdolist_list_var_$67.first();
								}
								entry_for_answer = cons(order_justifications_in_result_entry(reverse(result), inference_entities), entry_for_answer);
								cdolist_list_var = cdolist_list_var.rest();
								this_justification = cdolist_list_var.first();
							}
							format(T, $str460$_____Answer____);
							print(entry_for_answer, UNPROVIDED);
							return_value = cons(entry_for_answer, return_value);
						}
					}
				}
				final SubLObject idx_$67 = idx;
				if (NIL == id_index_sparse_objects_empty_p(idx_$67)) {
					final SubLObject cdohash_table = id_index_sparse_objects(idx_$67);
					SubLObject id2 = NIL;
					SubLObject this_answer2 = NIL;
					final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
					try {
						while (iteratorHasNext(cdohash_iterator)) {
							final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
							id2 = getEntryKey(cdohash_entry);
							this_answer2 = getEntryValue(cdohash_entry);
							SubLObject entry_for_answer2 = NIL;
							final SubLObject inference_entities2 = entities_in_bindings(inference_datastructures_inference.inference_answer_bindings(this_answer2), UNPROVIDED);
							SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
							SubLObject this_justification2 = NIL;
							this_justification2 = cdolist_list_var2.first();
							while (NIL != cdolist_list_var2) {
								SubLObject lst_of_answers2 = NIL;
								SubLObject result2 = NIL;
								SubLObject cdolist_list_var_$73 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
								SubLObject this_proof2 = NIL;
								this_proof2 = cdolist_list_var_$73.first();
								while (NIL != cdolist_list_var_$73) {
									SubLObject cdolist_list_var_$74 = inference_datastructures_proof.all_proof_subproofs(this_proof2);
									SubLObject subproof2 = NIL;
									subproof2 = cdolist_list_var_$74.first();
									while (NIL != cdolist_list_var_$74) {
										if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(subproof2)) {
											final SubLObject conclusion2 = proof_view_residual.pph_residual_transformation_proof_conclusion(subproof2, mt);
											final SubLObject result_entry4 = find_result_entry_for_gaf(conclusion2, lst_of_answers2, NIL, inference_datastructures_proof.proof_suid(subproof2));
											if (NIL != result_entry4) {
												lst_of_answers2 = cons(conclusion2, lst_of_answers2);
												result2 = cons(result_entry4, result2);
											}
										}
										SubLObject cdolist_list_var_$75 = inference_datastructures_proof.all_proof_supports(subproof2);
										SubLObject support2 = NIL;
										support2 = cdolist_list_var_$75.first();
										while (NIL != cdolist_list_var_$75) {
											if (NIL != assertion_handles.assertion_p(support2)) {
												final SubLObject gaf2 = assertions_high.gaf_formula(support2);
												final SubLObject result_entry5 = find_result_entry_for_gaf(gaf2, lst_of_answers2, support2, inference_datastructures_proof.proof_suid(subproof2));
												if (NIL != result_entry5) {
													lst_of_answers2 = cons(gaf2, lst_of_answers2);
													result2 = cons(result_entry5, result2);
												}
												SubLObject cdolist_list_var_$76 = arguments.support_justification(support2);
												SubLObject support_just2 = NIL;
												support_just2 = cdolist_list_var_$76.first();
												while (NIL != cdolist_list_var_$76) {
													if (NIL != assertion_handles.assertion_p(support_just2)) {
														SubLObject cdolist_list_var_$77 = assertions_high.assertion_arguments(support_just2);
														SubLObject argument2 = NIL;
														argument2 = cdolist_list_var_$77.first();
														while (NIL != cdolist_list_var_$77) {
															if (NIL != deduction_handles.deduction_p(argument2)) {
																SubLObject cdolist_list_var_$78 = deductions_high.deduction_supports(argument2);
																SubLObject deduction_support2 = NIL;
																deduction_support2 = cdolist_list_var_$78.first();
																while (NIL != cdolist_list_var_$78) {
																	if (NIL != assertion_handles.assertion_p(deduction_support2)) {
																		final SubLObject deduction_gaf2 = assertions_high.assertion_formula(deduction_support2);
																		final SubLObject result_entry6 = find_result_entry_for_gaf(deduction_gaf2, lst_of_answers2, deduction_support2, inference_datastructures_proof.proof_suid(subproof2));
																		if (NIL != result_entry6) {
																			lst_of_answers2 = cons(deduction_gaf2, lst_of_answers2);
																			result2 = cons(result_entry6, result2);
																		}
																	}
																	cdolist_list_var_$78 = cdolist_list_var_$78.rest();
																	deduction_support2 = cdolist_list_var_$78.first();
																}
															}
															cdolist_list_var_$77 = cdolist_list_var_$77.rest();
															argument2 = cdolist_list_var_$77.first();
														}
													}
													cdolist_list_var_$76 = cdolist_list_var_$76.rest();
													support_just2 = cdolist_list_var_$76.first();
												}
											}
											cdolist_list_var_$75 = cdolist_list_var_$75.rest();
											support2 = cdolist_list_var_$75.first();
										}
										cdolist_list_var_$74 = cdolist_list_var_$74.rest();
										subproof2 = cdolist_list_var_$74.first();
									}
									cdolist_list_var_$73 = cdolist_list_var_$73.rest();
									this_proof2 = cdolist_list_var_$73.first();
								}
								entry_for_answer2 = cons(order_justifications_in_result_entry(reverse(result2), inference_entities2), entry_for_answer2);
								cdolist_list_var2 = cdolist_list_var2.rest();
								this_justification2 = cdolist_list_var2.first();
							}
							format(T, $str460$_____Answer____);
							print(entry_for_answer2, UNPROVIDED);
							return_value = cons(entry_for_answer2, return_value);
						}
					} finally {
						releaseEntrySetIterator(cdohash_iterator);
					}
				}
			}
			return return_value;
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject entities_in_bindings(final SubLObject v_bindings, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		SubLObject result = NIL;
		SubLObject cdolist_list_var = v_bindings;
		SubLObject x = NIL;
		x = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject entity = bindings.variable_binding_value(x);
			if (NIL != isa.isaP(entity, $$SomethingExisting, mt, UNPROVIDED)) {
				result = cons(entity, result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			x = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject order_justifications_in_result_entry(final SubLObject entry, final SubLObject inference_entities) {
		final SubLObject list_of_proof_suids = Mapping.mapcar(symbol_function(FORMULA_ARG3), entry);
		SubLObject list_of_proof_suids_with_entities_in_bindings = NIL;
		SubLObject result = NIL;
		SubLObject cdolist_list_var = list_of_proof_suids;
		SubLObject proof_suid = NIL;
		proof_suid = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != entry_with_proof_suid_has_entities_in_bindingsP(proof_suid, entry, inference_entities)) {
				list_of_proof_suids_with_entities_in_bindings = cons(proof_suid, list_of_proof_suids_with_entities_in_bindings);
			}
			cdolist_list_var = cdolist_list_var.rest();
			proof_suid = cdolist_list_var.first();
		}
		cdolist_list_var = entry;
		SubLObject x = NIL;
		x = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != member(cycl_utilities.formula_arg3(x, UNPROVIDED), list_of_proof_suids_with_entities_in_bindings, UNPROVIDED, UNPROVIDED)) {
				result = cons(list(cycl_utilities.formula_arg0(x), cycl_utilities.formula_arg1(x, UNPROVIDED)), result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			x = cdolist_list_var.first();
		}
		cdolist_list_var = entry;
		x = NIL;
		x = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL == member(cycl_utilities.formula_arg3(x, UNPROVIDED), list_of_proof_suids_with_entities_in_bindings, UNPROVIDED, UNPROVIDED)) {
				result = cons(list(cycl_utilities.formula_arg0(x), cycl_utilities.formula_arg1(x, UNPROVIDED)), result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			x = cdolist_list_var.first();
		}
		return reverse(result);
	}

	public static SubLObject entry_with_proof_suid_has_entities_in_bindingsP(final SubLObject proof_suid, final SubLObject entry, final SubLObject inference_entities) {
		SubLObject cdolist_list_var = entry;
		SubLObject x = NIL;
		x = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (proof_suid.numE(cycl_utilities.formula_arg3(x, UNPROVIDED))) {
				final SubLObject gaf = cycl_utilities.formula_arg2(x, UNPROVIDED);
				if (NIL != intersection(inference_entities, gaf, symbol_function(EQUAL), UNPROVIDED)) {
					return T;
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			x = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject find_result_entry_for_gaf(final SubLObject gaf, final SubLObject lst_of_answers, final SubLObject assertion, final SubLObject proof_suid) {
		if (((NIL == member(gaf, lst_of_answers, symbol_function(EQUAL), UNPROVIDED)) && (NIL != assertion)) && (NIL != kb_mapping_utilities.pred_value_gafs(assertion, $const463$assertionRequiredForJustification, UNPROVIDED, UNPROVIDED))) {
			final SubLObject source = get_source_for_assertion(assertion);
			if (NIL != source) {
				return list(pph_main.generate_phrase(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_main.generate_phrase(source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), gaf, proof_suid);
			}
			return list(pph_main.generate_phrase(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, gaf, proof_suid);
		} else {
			if ((NIL == member(gaf, lst_of_answers, symbol_function(EQUAL), UNPROVIDED)) && (NIL != is_relevant_gaf_for_justificationP(gaf))) {
				if (NIL != assertion) {
					final SubLObject source = get_source_for_assertion(assertion);
					if (NIL != source) {
						return list(pph_main.generate_phrase(gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_main.generate_phrase(source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), gaf, proof_suid);
					}
				}
				return list(pph_main.generate_phrase(gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, gaf, proof_suid);
			}
			return NIL;
		}
	}

	public static SubLObject is_relevant_gaf_for_justificationP(final SubLObject gaf) {
		return pph_proof.pph_justification_pred_highly_relevantP(cycl_utilities.formula_arg0(gaf), UNPROVIDED);
	}

	public static SubLObject get_source_for_assertion(final SubLObject assertion) {
		final SubLObject source_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_relevant_mts(assertion, $$sourceOfTerm, $$BookkeepingMt, UNPROVIDED, UNPROVIDED));
		if (NIL != source_assertion) {
			final SubLObject gaf = assertions_high.gaf_formula(source_assertion);
			return cycl_utilities.formula_arg2(gaf, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject declare_proof_view_file() {
		declareFunction(me, "proof_view_default_color", "PROOF-VIEW-DEFAULT-COLOR", 0, 0, false);
		declareFunction(me, "proof_view_params", "PROOF-VIEW-PARAMS", 1, 0, false);
		declareFunction(me, "proof_view_print_function_trampoline", "PROOF-VIEW-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "proof_view_p", "PROOF-VIEW-P", 1, 0, false);
		new proof_view.$proof_view_p$UnaryFunction();
		declareFunction(me, "proof_view_int_id", "PROOF-VIEW-INT-ID", 1, 0, false);
		declareFunction(me, "proof_view_int_proof", "PROOF-VIEW-INT-PROOF", 1, 0, false);
		declareFunction(me, "proof_view_int_answer", "PROOF-VIEW-INT-ANSWER", 1, 0, false);
		declareFunction(me, "proof_view_int_id_index", "PROOF-VIEW-INT-ID-INDEX", 1, 0, false);
		declareFunction(me, "proof_view_int_properties", "PROOF-VIEW-INT-PROPERTIES", 1, 0, false);
		declareFunction(me, "_csetf_proof_view_int_id", "_CSETF-PROOF-VIEW-INT-ID", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_int_proof", "_CSETF-PROOF-VIEW-INT-PROOF", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_int_answer", "_CSETF-PROOF-VIEW-INT-ANSWER", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_int_id_index", "_CSETF-PROOF-VIEW-INT-ID-INDEX", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_int_properties", "_CSETF-PROOF-VIEW-INT-PROPERTIES", 2, 0, false);
		declareFunction(me, "make_proof_view", "MAKE-PROOF-VIEW", 0, 1, false);
		declareFunction(me, "visit_defstruct_proof_view", "VISIT-DEFSTRUCT-PROOF-VIEW", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_proof_view_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-METHOD", 2, 0, false);
		declareFunction(me, "valid_proof_view_p", "VALID-PROOF-VIEW-P", 1, 0, false);
		declareFunction(me, "proof_view_int_print", "PROOF-VIEW-INT-PRINT", 3, 0, false);
		declareFunction(me, "proof_view_id_index", "PROOF-VIEW-ID-INDEX", 0, 0, false);
		declareFunction(me, "get_next_proof_view_id", "GET-NEXT-PROOF-VIEW-ID", 0, 0, false);
		declareFunction(me, "find_proof_view_by_id", "FIND-PROOF-VIEW-BY-ID", 1, 0, false);
		declareMacro(me, "proof_view_do_entries", "PROOF-VIEW-DO-ENTRIES");
		declareMacro(me, "proof_view_entry_do_children", "PROOF-VIEW-ENTRY-DO-CHILDREN");
		declareFunction(me, "most_recent_proof_view", "MOST-RECENT-PROOF-VIEW", 0, 0, false);
		declareMacro(me, "do_all_proof_views", "DO-ALL-PROOF-VIEWS");
		declareFunction(me, "new_proof_view", "NEW-PROOF-VIEW", 0, 2, false);
		declareFunction(me, "destroy_proof_view", "DESTROY-PROOF-VIEW", 1, 0, false);
		declareFunction(me, "destroy_all_proof_views", "DESTROY-ALL-PROOF-VIEWS", 0, 0, false);
		declareFunction(me, "destroy_proof_view_int", "DESTROY-PROOF-VIEW-INT", 1, 0, false);
		declareMacro(me, "maybe_with_proof_view_memoization", "MAYBE-WITH-PROOF-VIEW-MEMOIZATION");
		declareFunction(me, "find_proof_view_memoization_state", "FIND-PROOF-VIEW-MEMOIZATION-STATE", 1, 0, false);
		declareFunction(me, "proof_view_find_or_create_cached_memoization_state", "PROOF-VIEW-FIND-OR-CREATE-CACHED-MEMOIZATION-STATE", 1, 0, false);
		declareFunction(me, "proof_view_get_cached_memoization_state", "PROOF-VIEW-GET-CACHED-MEMOIZATION-STATE", 1, 0, false);
		declareFunction(me, "proof_view_set_cached_memoization_state", "PROOF-VIEW-SET-CACHED-MEMOIZATION-STATE", 2, 0, false);
		declareFunction(me, "clear_proof_view_memoization_state_by_id", "CLEAR-PROOF-VIEW-MEMOIZATION-STATE-BY-ID", 1, 0, false);
		declareFunction(me, "clear_proof_view_memoization_state", "CLEAR-PROOF-VIEW-MEMOIZATION-STATE", 1, 0, false);
		declareFunction(me, "set_proof_view_allow_external_linksP", "SET-PROOF-VIEW-ALLOW-EXTERNAL-LINKS?", 2, 0, false);
		declareFunction(me, "set_proof_view_language_mt", "SET-PROOF-VIEW-LANGUAGE-MT", 2, 0, false);
		declareFunction(me, "set_proof_view_domain_mt", "SET-PROOF-VIEW-DOMAIN-MT", 2, 0, false);
		declareFunction(me, "get_proof_view_domain_mt", "GET-PROOF-VIEW-DOMAIN-MT", 1, 0, false);
		declareFunction(me, "get_proof_view_language_mt", "GET-PROOF-VIEW-LANGUAGE-MT", 1, 0, false);
		declareFunction(me, "get_proof_view_include_linear", "GET-PROOF-VIEW-INCLUDE-LINEAR", 1, 0, false);
		declareFunction(me, "set_proof_view_include_linear", "SET-PROOF-VIEW-INCLUDE-LINEAR", 2, 0, false);
		declareFunction(me, "get_proof_view_include_details", "GET-PROOF-VIEW-INCLUDE-DETAILS", 1, 0, false);
		declareFunction(me, "set_proof_view_include_details", "SET-PROOF-VIEW-INCLUDE-DETAILS", 2, 0, false);
		declareFunction(me, "get_proof_view_suppress_assertion_bookkeeping", "GET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING", 1, 0, false);
		declareFunction(me, "set_proof_view_suppress_assertion_bookkeeping", "SET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING", 2, 0, false);
		declareFunction(me, "get_proof_view_suppress_assertion_cyclists", "GET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS", 1, 0, false);
		declareFunction(me, "set_proof_view_suppress_assertion_cyclists", "SET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS", 2, 0, false);
		declareFunction(me, "set_proof_view_addressee", "SET-PROOF-VIEW-ADDRESSEE", 2, 0, false);
		declareFunction(me, "set_proof_view_include_cycml", "SET-PROOF-VIEW-INCLUDE-CYCML", 2, 0, false);
		declareFunction(me, "proof_view_get_id", "PROOF-VIEW-GET-ID", 1, 0, false);
		declareFunction(me, "proof_view_get_id_index", "PROOF-VIEW-GET-ID-INDEX", 1, 0, false);
		declareFunction(me, "proof_view_get_proof", "PROOF-VIEW-GET-PROOF", 1, 0, false);
		declareFunction(me, "proof_view_get_answer", "PROOF-VIEW-GET-ANSWER", 1, 0, false);
		declareFunction(me, "proof_view_get_entries", "PROOF-VIEW-GET-ENTRIES", 1, 0, false);
		declareFunction(me, "proof_view_get_facts_used", "PROOF-VIEW-GET-FACTS-USED", 1, 0, false);
		declareFunction(me, "proof_view_get_used_supports", "PROOF-VIEW-GET-USED-SUPPORTS", 1, 0, false);
		declareFunction(me, "proof_view_get_source_index", "PROOF-VIEW-GET-SOURCE-INDEX", 1, 0, false);
		declareFunction(me, "proof_view_get_source_id", "PROOF-VIEW-GET-SOURCE-ID", 2, 0, false);
		declareFunction(me, "proof_view_get_source_isg", "PROOF-VIEW-GET-SOURCE-ISG", 1, 0, false);
		declareFunction(me, "proof_view_get_filtered_items", "PROOF-VIEW-GET-FILTERED-ITEMS", 1, 0, false);
		declareFunction(me, "proof_view_note_filtered_item", "PROOF-VIEW-NOTE-FILTERED-ITEM", 2, 1, false);
		declareFunction(me, "proof_view_set_parameters_from_specification", "PROOF-VIEW-SET-PARAMETERS-FROM-SPECIFICATION", 2, 0, false);
		declareFunction(me, "proof_view_set_parameter_from_specification", "PROOF-VIEW-SET-PARAMETER-FROM-SPECIFICATION", 3, 0, false);
		declareFunction(me, "proof_view_property_value_from_cycl", "PROOF-VIEW-PROPERTY-VALUE-FROM-CYCL", 1, 0, false);
		declareFunction(me, "proof_view_get_addressee", "PROOF-VIEW-GET-ADDRESSEE", 1, 0, false);
		declareFunction(me, "proof_view_set_addressee", "PROOF-VIEW-SET-ADDRESSEE", 2, 0, false);
		declareFunction(me, "proof_view_get_include_rules_sectionP", "PROOF-VIEW-GET-INCLUDE-RULES-SECTION?", 1, 0, false);
		declareFunction(me, "proof_view_set_include_rules_sectionP", "PROOF-VIEW-SET-INCLUDE-RULES-SECTION?", 2, 0, false);
		declareFunction(me, "proof_view_get_include_justification_sectionP", "PROOF-VIEW-GET-INCLUDE-JUSTIFICATION-SECTION?", 1, 0, false);
		declareFunction(me, "proof_view_set_include_justification_sectionP", "PROOF-VIEW-SET-INCLUDE-JUSTIFICATION-SECTION?", 2, 0, false);
		declareFunction(me, "proof_view_get_enable_debugP", "PROOF-VIEW-GET-ENABLE-DEBUG?", 1, 0, false);
		declareFunction(me, "proof_view_set_enable_debugP", "PROOF-VIEW-SET-ENABLE-DEBUG?", 2, 0, false);
		declareFunction(me, "proof_view_set_show_cb_bug_report_linksP", "PROOF-VIEW-SET-SHOW-CB-BUG-REPORT-LINKS?", 2, 0, false);
		declareFunction(me, "proof_view_get_show_cb_bug_report_linksP", "PROOF-VIEW-GET-SHOW-CB-BUG-REPORT-LINKS?", 1, 0, false);
		declareFunction(me, "proof_view_get_include_cycl_in_outputP", "PROOF-VIEW-GET-INCLUDE-CYCL-IN-OUTPUT?", 1, 0, false);
		declareFunction(me, "proof_view_set_include_cycl_in_outputP", "PROOF-VIEW-SET-INCLUDE-CYCL-IN-OUTPUT?", 2, 0, false);
		declareFunction(me, "proof_view_get_include_sourcesP", "PROOF-VIEW-GET-INCLUDE-SOURCES?", 1, 0, false);
		declareFunction(me, "proof_view_set_link_phrasesP", "PROOF-VIEW-SET-LINK-PHRASES?", 2, 0, false);
		declareFunction(me, "proof_view_get_link_phrasesP", "PROOF-VIEW-GET-LINK-PHRASES?", 1, 0, false);
		declareFunction(me, "proof_view_include_sources_spec_p", "PROOF-VIEW-INCLUDE-SOURCES-SPEC-P", 1, 0, false);
		declareFunction(me, "proof_view_set_include_sourcesP", "PROOF-VIEW-SET-INCLUDE-SOURCES?", 2, 0, false);
		declareFunction(me, "proof_view_entry_get_include_sourcesP", "PROOF-VIEW-ENTRY-GET-INCLUDE-SOURCES?", 1, 0, false);
		declareFunction(me, "proof_view_get_include_cycml_in_xmlP", "PROOF-VIEW-GET-INCLUDE-CYCML-IN-XML?", 1, 0, false);
		declareFunction(me, "proof_view_set_include_cycml_in_xmlP", "PROOF-VIEW-SET-INCLUDE-CYCML-IN-XML?", 2, 0, false);
		declareFunction(me, "proof_view_get_include_silkP", "PROOF-VIEW-GET-INCLUDE-SILK?", 1, 0, false);
		declareFunction(me, "proof_view_set_include_silkP", "PROOF-VIEW-SET-INCLUDE-SILK?", 2, 0, false);
		declareFunction(me, "proof_view_get_suppress_assertion_bookkeepingP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-BOOKKEEPING?", 1, 0, false);
		declareFunction(me, "proof_view_set_suppress_assertion_bookkeepingP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-BOOKKEEPING?", 2, 0, false);
		declareFunction(me, "proof_view_get_suppress_assertion_cyclistsP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-CYCLISTS?", 1, 0, false);
		declareFunction(me, "proof_view_set_suppress_assertion_cyclistsP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-CYCLISTS?", 2, 0, false);
		declareFunction(me, "proof_view_get_suppress_assertion_cyclist_employersP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?", 1, 0, false);
		declareFunction(me, "proof_view_set_suppress_assertion_cyclist_employersP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?", 2, 0, false);
		declareFunction(me, "proof_view_get_suppress_assertion_datesP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-DATES?", 1, 0, false);
		declareFunction(me, "proof_view_set_suppress_assertion_datesP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-DATES?", 2, 0, false);
		declareFunction(me, "proof_view_get_allow_external_linksP", "PROOF-VIEW-GET-ALLOW-EXTERNAL-LINKS?", 1, 0, false);
		declareFunction(me, "proof_view_set_allow_external_linksP", "PROOF-VIEW-SET-ALLOW-EXTERNAL-LINKS?", 2, 0, false);
		declareFunction(me, "proof_view_get_allow_internal_linksP", "PROOF-VIEW-GET-ALLOW-INTERNAL-LINKS?", 1, 0, false);
		declareFunction(me, "proof_view_set_allow_internal_linksP", "PROOF-VIEW-SET-ALLOW-INTERNAL-LINKS?", 2, 0, false);
		declareFunction(me, "proof_view_get_language_mt", "PROOF-VIEW-GET-LANGUAGE-MT", 1, 0, false);
		declareFunction(me, "proof_view_set_language_mt", "PROOF-VIEW-SET-LANGUAGE-MT", 2, 0, false);
		declareFunction(me, "proof_view_get_domain_mt", "PROOF-VIEW-GET-DOMAIN-MT", 1, 0, false);
		declareFunction(me, "proof_view_set_domain_mt", "PROOF-VIEW-SET-DOMAIN-MT", 2, 0, false);
		declareFunction(me, "proof_view_get_creation_universal_time", "PROOF-VIEW-GET-CREATION-UNIVERSAL-TIME", 1, 0, false);
		declareFunction(me, "proof_view_set_creation_universal_time", "PROOF-VIEW-SET-CREATION-UNIVERSAL-TIME", 1, 1, false);
		declareFunction(me, "proof_view_get_populated_universal_time", "PROOF-VIEW-GET-POPULATED-UNIVERSAL-TIME", 1, 0, false);
		declareFunction(me, "proof_view_get_displayed_universal_time", "PROOF-VIEW-GET-DISPLAYED-UNIVERSAL-TIME", 1, 0, false);
		declareFunction(me, "proof_view_set_displayed_universal_time", "PROOF-VIEW-SET-DISPLAYED-UNIVERSAL-TIME", 1, 1, false);
		declareFunction(me, "proof_view_set_preparer_thread", "PROOF-VIEW-SET-PREPARER-THREAD", 1, 1, false);
		declareFunction(me, "proof_view_get_preparer_thread", "PROOF-VIEW-GET-PREPARER-THREAD", 1, 0, false);
		declareFunction(me, "proof_view_get_error_output", "PROOF-VIEW-GET-ERROR-OUTPUT", 1, 0, false);
		declareFunction(me, "proof_view_has_propertyP", "PROOF-VIEW-HAS-PROPERTY?", 2, 0, false);
		declareFunction(me, "proof_view_set_property", "PROOF-VIEW-SET-PROPERTY", 3, 0, false);
		declareFunction(me, "proof_view_get_property", "PROOF-VIEW-GET-PROPERTY", 2, 1, false);
		declareFunction(me, "proof_view_entry_print_function_trampoline", "PROOF-VIEW-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "proof_view_entry_p", "PROOF-VIEW-ENTRY-P", 1, 0, false);
		new proof_view.$proof_view_entry_p$UnaryFunction();
		declareFunction(me, "proof_view_entry_int_id", "PROOF-VIEW-ENTRY-INT-ID", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_parent_id", "PROOF-VIEW-ENTRY-INT-PARENT-ID", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_label", "PROOF-VIEW-ENTRY-INT-LABEL", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_object_type", "PROOF-VIEW-ENTRY-INT-OBJECT-TYPE", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_object", "PROOF-VIEW-ENTRY-INT-OBJECT", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_proof_view", "PROOF-VIEW-ENTRY-INT-PROOF-VIEW", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_properties", "PROOF-VIEW-ENTRY-INT-PROPERTIES", 1, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_id", "_CSETF-PROOF-VIEW-ENTRY-INT-ID", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_parent_id", "_CSETF-PROOF-VIEW-ENTRY-INT-PARENT-ID", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_label", "_CSETF-PROOF-VIEW-ENTRY-INT-LABEL", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_object_type", "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT-TYPE", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_object", "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_proof_view", "_CSETF-PROOF-VIEW-ENTRY-INT-PROOF-VIEW", 2, 0, false);
		declareFunction(me, "_csetf_proof_view_entry_int_properties", "_CSETF-PROOF-VIEW-ENTRY-INT-PROPERTIES", 2, 0, false);
		declareFunction(me, "make_proof_view_entry", "MAKE-PROOF-VIEW-ENTRY", 0, 1, false);
		declareFunction(me, "visit_defstruct_proof_view_entry", "VISIT-DEFSTRUCT-PROOF-VIEW-ENTRY", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_proof_view_entry_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-ENTRY-METHOD", 2, 0, false);
		declareFunction(me, "valid_proof_view_entry_p", "VALID-PROOF-VIEW-ENTRY-P", 1, 0, false);
		declareFunction(me, "proof_view_entry_int_print", "PROOF-VIEW-ENTRY-INT-PRINT", 3, 0, false);
		declareFunction(me, "destroy_proof_view_entry", "DESTROY-PROOF-VIEW-ENTRY", 1, 0, false);
		declareFunction(me, "destroy_proof_view_entry_int", "DESTROY-PROOF-VIEW-ENTRY-INT", 1, 0, false);
		declareFunction(me, "proof_view_get_root_entry", "PROOF-VIEW-GET-ROOT-ENTRY", 1, 0, false);
		declareFunction(me, "proof_view_count_entries_with_values", "PROOF-VIEW-COUNT-ENTRIES-WITH-VALUES", 6, 0, false);
		declareFunction(me, "proof_view_has_entry_for_objectP", "PROOF-VIEW-HAS-ENTRY-FOR-OBJECT?", 3, 0, false);
		declareFunction(me, "find_proof_view_entry_by_id", "FIND-PROOF-VIEW-ENTRY-BY-ID", 2, 0, false);
		declareFunction(me, "find_proof_view_entry_by_ids", "FIND-PROOF-VIEW-ENTRY-BY-IDS", 2, 0, false);
		declareFunction(me, "proof_view_entry_get_id", "PROOF-VIEW-ENTRY-GET-ID", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_parent_id", "PROOF-VIEW-ENTRY-GET-PARENT-ID", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_path_string", "PROOF-VIEW-ENTRY-GET-PATH-STRING", 1, 0, false);
		declareFunction(me, "proof_view_entry_set_parent_id", "PROOF-VIEW-ENTRY-SET-PARENT-ID", 2, 0, false);
		declareFunction(me, "proof_view_entry_set_label", "PROOF-VIEW-ENTRY-SET-LABEL", 2, 0, false);
		declareFunction(me, "proof_view_entry_get_proof_view", "PROOF-VIEW-ENTRY-GET-PROOF-VIEW", 1, 0, false);
		declareFunction(me, "proof_view_entry_has_ancestorP", "PROOF-VIEW-ENTRY-HAS-ANCESTOR?", 2, 1, false);
		declareFunction(me, "proof_view_entry_get_label", "PROOF-VIEW-ENTRY-GET-LABEL", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_object_type", "PROOF-VIEW-ENTRY-GET-OBJECT-TYPE", 1, 0, false);
		declareFunction(me, "proof_view_entry_set_object_type", "PROOF-VIEW-ENTRY-SET-OBJECT-TYPE", 2, 0, false);
		declareFunction(me, "proof_view_entry_get_object", "PROOF-VIEW-ENTRY-GET-OBJECT", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_property", "PROOF-VIEW-ENTRY-GET-PROPERTY", 2, 1, false);
		declareFunction(me, "proof_view_entry_set_property", "PROOF-VIEW-ENTRY-SET-PROPERTY", 3, 0, false);
		declareFunction(me, "proof_view_entry_rem_property", "PROOF-VIEW-ENTRY-REM-PROPERTY", 2, 0, false);
		declareFunction(me, "proof_view_entryL", "PROOF-VIEW-ENTRY<", 2, 0, false);
		declareMacro(me, "proof_view_warn", "PROOF-VIEW-WARN");
		declareMacro(me, "proof_view_info", "PROOF-VIEW-INFO");
		declareFunction(me, "proof_view_entry_get_children", "PROOF-VIEW-ENTRY-GET-CHILDREN", 1, 0, false);
		declareFunction(me, "proof_view_entry_more_generalP", "PROOF-VIEW-ENTRY-MORE-GENERAL?", 2, 0, false);
		declareFunction(me, "proof_view_entry_specificity_internal", "PROOF-VIEW-ENTRY-SPECIFICITY-INTERNAL", 1, 0, false);
		declareFunction(me, "proof_view_entry_specificity", "PROOF-VIEW-ENTRY-SPECIFICITY", 1, 0, false);
		declareFunction(me, "proof_view_count_entries", "PROOF-VIEW-COUNT-ENTRIES", 1, 0, false);
		declareFunction(me, "proof_view_entry_top_level_p", "PROOF-VIEW-ENTRY-TOP-LEVEL-P", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_depth_internal", "PROOF-VIEW-ENTRY-GET-DEPTH-INTERNAL", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_depth", "PROOF-VIEW-ENTRY-GET-DEPTH", 1, 0, false);
		declareFunction(me, "proof_view_entry_expand_intiallyP", "PROOF-VIEW-ENTRY-EXPAND-INTIALLY?", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_sources", "PROOF-VIEW-ENTRY-GET-SOURCES", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_proof", "PROOF-VIEW-ENTRY-GET-PROOF", 1, 1, false);
		declareFunction(me, "proof_view_entry_set_proof", "PROOF-VIEW-ENTRY-SET-PROOF", 2, 0, false);
		declareFunction(me, "proof_view_entry_get_function", "PROOF-VIEW-ENTRY-GET-FUNCTION", 1, 0, false);
		declareFunction(me, "proof_view_entry_get_function_section", "PROOF-VIEW-ENTRY-GET-FUNCTION-SECTION", 1, 0, false);
		declareFunction(me, "proof_view_set_highlight_phrase_demeritsP", "PROOF-VIEW-SET-HIGHLIGHT-PHRASE-DEMERITS?", 2, 0, false);
		declareFunction(me, "proof_view_get_highlight_phrase_demeritsP", "PROOF-VIEW-GET-HIGHLIGHT-PHRASE-DEMERITS?", 1, 0, false);
		declareFunction(me, "register_proof_view_entry_shower", "REGISTER-PROOF-VIEW-ENTRY-SHOWER", 1, 0, false);
		declareFunction(me, "proof_view_entry_showers", "PROOF-VIEW-ENTRY-SHOWERS", 0, 0, false);
		declareFunction(me, "proof_view_entry_generate_cycl", "PROOF-VIEW-ENTRY-GENERATE-CYCL", 1, 0, false);
		declareFunction(me, "generate_html_from_proof_view_entry_ids", "GENERATE-HTML-FROM-PROOF-VIEW-ENTRY-IDS", 2, 3, false);
		declareFunction(me, "proof_view_entry_html", "PROOF-VIEW-ENTRY-HTML", 2, 0, false);
		declareFunction(me, "proof_view_entry_html_internal", "PROOF-VIEW-ENTRY-HTML-INTERNAL", 1, 0, false);
		declareFunction(me, "fact_sheet_term_id_if_ok_for_proof_view_fact_sheets", "FACT-SHEET-TERM-ID-IF-OK-FOR-PROOF-VIEW-FACT-SHEETS", 1, 0, false);
		declareFunction(me, "proof_view_entry_generate_html", "PROOF-VIEW-ENTRY-GENERATE-HTML", 1, 0, false);
		declareFunction(me, "proof_view_entry_generate_html_standard", "PROOF-VIEW-ENTRY-GENERATE-HTML-STANDARD", 1, 0, false);
		declareFunction(me, "proof_view_entry_generate_html_internal_internal", "PROOF-VIEW-ENTRY-GENERATE-HTML-INTERNAL-INTERNAL", 7, 0, false);
		declareFunction(me, "proof_view_entry_generate_html_internal", "PROOF-VIEW-ENTRY-GENERATE-HTML-INTERNAL", 7, 0, false);
		declareFunction(me, "proof_view_valid_source_p", "PROOF-VIEW-VALID-SOURCE-P", 1, 0, false);
		declareMacro(me, "maybe_with_font_color", "MAYBE-WITH-FONT-COLOR");
		declareFunction(me, "proof_view_html_for_object", "PROOF-VIEW-HTML-FOR-OBJECT", 5, 0, false);
		declareFunction(me, "proof_view_entry_get_paraphrase_demerits", "PROOF-VIEW-ENTRY-GET-PARAPHRASE-DEMERITS", 1, 1, false);
		declareFunction(me, "proof_view_entry_set_paraphrase_demerits", "PROOF-VIEW-ENTRY-SET-PARAPHRASE-DEMERITS", 2, 0, false);
		declareFunction(me, "proof_view_support_html_internal", "PROOF-VIEW-SUPPORT-HTML-INTERNAL", 1, 0, false);
		declareFunction(me, "proof_view_support_html", "PROOF-VIEW-SUPPORT-HTML", 1, 0, false);
		declareFunction(me, "register_proof_view_output_fn_for_object_type", "REGISTER-PROOF-VIEW-OUTPUT-FN-FOR-OBJECT-TYPE", 2, 0, false);
		declareFunction(me, "proof_view_output_fn_for_object_type", "PROOF-VIEW-OUTPUT-FN-FOR-OBJECT-TYPE", 1, 0, false);
		declareFunction(me, "proof_view_html_for_object_cases", "PROOF-VIEW-HTML-FOR-OBJECT-CASES", 4, 0, false);
		declareFunction(me, "proof_view_html_for_object_cond", "PROOF-VIEW-HTML-FOR-OBJECT-COND", 4, 0, false);
		declareFunction(me, "proof_view_find_main_font_color", "PROOF-VIEW-FIND-MAIN-FONT-COLOR", 3, 0, false);
		declareFunction(me, "proof_view_entry_has_abduced_support_p", "PROOF-VIEW-ENTRY-HAS-ABDUCED-SUPPORT-P", 1, 0, false);
		declareFunction(me, "proof_view_entry_has_abduced_support_confirmed_p", "PROOF-VIEW-ENTRY-HAS-ABDUCED-SUPPORT-CONFIRMED-P", 1, 0, false);
		declareFunction(me, "proof_view_entry_has_abduced_support_denied_p", "PROOF-VIEW-ENTRY-HAS-ABDUCED-SUPPORT-DENIED-P", 1, 0, false);
		declareFunction(me, "proof_view_entry_has_abduction_confirmed_p", "PROOF-VIEW-ENTRY-HAS-ABDUCTION-CONFIRMED-P", 1, 0, false);
		declareFunction(me, "proof_view_entry_has_abduction_denied_p", "PROOF-VIEW-ENTRY-HAS-ABDUCTION-DENIED-P", 1, 0, false);
		declareFunction(me, "proof_view_output_citation", "PROOF-VIEW-OUTPUT-CITATION", 1, 2, false);
		declareFunction(me, "proof_view_show_bindings", "PROOF-VIEW-SHOW-BINDINGS", 2, 0, false);
		declareFunction(me, "proof_view_output_assertion_bookkeeping_info", "PROOF-VIEW-OUTPUT-ASSERTION-BOOKKEEPING-INFO", 2, 0, false);
		declareFunction(me, "proof_view_assertion_givenP", "PROOF-VIEW-ASSERTION-GIVEN?", 2, 0, false);
		declareFunction(me, "get_employer", "GET-EMPLOYER", 1, 1, false);
		declareFunction(me, "clear_employee_employers_and_mts", "CLEAR-EMPLOYEE-EMPLOYERS-AND-MTS", 0, 0, false);
		declareFunction(me, "remove_employee_employers_and_mts", "REMOVE-EMPLOYEE-EMPLOYERS-AND-MTS", 1, 0, false);
		declareFunction(me, "employee_employers_and_mts_internal", "EMPLOYEE-EMPLOYERS-AND-MTS-INTERNAL", 1, 0, false);
		declareFunction(me, "employee_employers_and_mts", "EMPLOYEE-EMPLOYERS-AND-MTS", 1, 0, false);
		declareFunction(me, "proof_view_output_external_sentence", "PROOF-VIEW-OUTPUT-EXTERNAL-SENTENCE", 4, 0, false);
		declareFunction(me, "proof_view_output_entity_mention", "PROOF-VIEW-OUTPUT-ENTITY-MENTION", 5, 0, false);
		declareFunction(me, "proof_view_get_document_locations_for_entity_mention", "PROOF-VIEW-GET-DOCUMENT-LOCATIONS-FOR-ENTITY-MENTION", 2, 0, false);
		declareFunction(me, "proof_view_display_color_for_term", "PROOF-VIEW-DISPLAY-COLOR-FOR-TERM", 2, 0, false);
		declareFunction(me, "proof_view_nth_display_color", "PROOF-VIEW-NTH-DISPLAY-COLOR", 1, 0, false);
		declareFunction(me, "proof_view_find_terms_in_string", "PROOF-VIEW-FIND-TERMS-IN-STRING", 4, 1, false);
		declareFunction(me, "proof_view_find_term_in_string", "PROOF-VIEW-FIND-TERM-IN-STRING", 4, 1, false);
		declareFunction(me, "proof_view_find_term_string_in_string", "PROOF-VIEW-FIND-TERM-STRING-IN-STRING", 3, 1, false);
		declareFunction(me, "proof_view_remove_leading_commas", "PROOF-VIEW-REMOVE-LEADING-COMMAS", 1, 0, false);
		declareFunction(me, "proof_view_delete_subsumed_references", "PROOF-VIEW-DELETE-SUBSUMED-REFERENCES", 1, 0, false);
		declareFunction(me, "proof_view_reference_subsumes_p", "PROOF-VIEW-REFERENCE-SUBSUMES-P", 2, 0, false);
		declareFunction(me, "get_abduced_support_sentence_for_proof_view", "GET-ABDUCED-SUPPORT-SENTENCE-FOR-PROOF-VIEW", 2, 1, false);
		declareFunction(me, "assert_abduction_support_for_proof_view", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW", 3, 1, false);
		declareFunction(me, "assert_abduction_support_for_proof_view_recursive", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW-RECURSIVE", 5, 0, false);
		declareFunction(me, "assert_abduction_support_for_proof_view_int", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW-INT", 3, 1, false);
		declareFunction(me, "proof_view_entry_note_abduced_support_confirmed", "PROOF-VIEW-ENTRY-NOTE-ABDUCED-SUPPORT-CONFIRMED", 2, 0, false);
		declareFunction(me, "proof_view_entry_note_abduced_support_denied", "PROOF-VIEW-ENTRY-NOTE-ABDUCED-SUPPORT-DENIED", 2, 0, false);
		declareFunction(me, "get_query_url_for_proof_view", "GET-QUERY-URL-FOR-PROOF-VIEW", 2, 0, false);
		declareFunction(me, "get_sentence_for_proof_view", "GET-SENTENCE-FOR-PROOF-VIEW", 2, 0, false);
		declareFunction(me, "construct_proof_views_java_iteratively", "CONSTRUCT-PROOF-VIEWS-JAVA-ITERATIVELY", 3, 0, false);
		declareFunction(me, "proof_view_sort_proofs", "PROOF-VIEW-SORT-PROOFS", 1, 0, false);
		declareFunction(me, "construct_proof_views_java_list", "CONSTRUCT-PROOF-VIEWS-JAVA-LIST", 3, 0, false);
		declareFunction(me, "construct_xml_proof_view_for_sentence", "CONSTRUCT-XML-PROOF-VIEW-FOR-SENTENCE", 2, 4, false);
		declareFunction(me, "proof_view_id_populate", "PROOF-VIEW-ID-POPULATE", 1, 0, false);
		declareFunction(me, "proof_view_xml", "PROOF-VIEW-XML", 1, 1, false);
		declareFunction(me, "proof_view_entry_xml", "PROOF-VIEW-ENTRY-XML", 2, 0, false);
		declareMacro(me, "proof_view_xml_tag", "PROOF-VIEW-XML-TAG");
		declareFunction(me, "output_proof_view_in_xml", "OUTPUT-PROOF-VIEW-IN-XML", 1, 1, false);
		declareFunction(me, "output_proof_view_details_in_xml", "OUTPUT-PROOF-VIEW-DETAILS-IN-XML", 1, 0, false);
		declareFunction(me, "output_proof_view_sources_in_xml", "OUTPUT-PROOF-VIEW-SOURCES-IN-XML", 1, 0, false);
		declareFunction(me, "output_proof_view_rules_in_xml", "OUTPUT-PROOF-VIEW-RULES-IN-XML", 1, 0, false);
		declareFunction(me, "output_proof_view_section_in_xml", "OUTPUT-PROOF-VIEW-SECTION-IN-XML", 3, 0, false);
		declareFunction(me, "output_proof_view_entry_in_xml", "OUTPUT-PROOF-VIEW-ENTRY-IN-XML", 1, 1, false);
		declareFunction(me, "output_proof_view_entry_details_in_xml", "OUTPUT-PROOF-VIEW-ENTRY-DETAILS-IN-XML", 2, 0, false);
		declareFunction(me, "proof_view_cycl_silk_string", "PROOF-VIEW-CYCL-SILK-STRING", 1, 0, false);
		declareFunction(me, "proof_view_entry_xml_attributes", "PROOF-VIEW-ENTRY-XML-ATTRIBUTES", 1, 0, false);
		declareFunction(me, "output_proof_view_entry_content_in_xml", "OUTPUT-PROOF-VIEW-ENTRY-CONTENT-IN-XML", 1, 0, false);
		declareFunction(me, "proof_view_construct_java_list", "PROOF-VIEW-CONSTRUCT-JAVA-LIST", 1, 0, false);
		declareFunction(me, "proof_view_entry_construct_java_list", "PROOF-VIEW-ENTRY-CONSTRUCT-JAVA-LIST", 1, 0, false);
		declareFunction(me, "get_new_empty_proof_view", "GET-NEW-EMPTY-PROOF-VIEW", 0, 2, false);
		declareFunction(me, "get_new_empty_proof_view_id", "GET-NEW-EMPTY-PROOF-VIEW-ID", 0, 4, false);
		declareFunction(me, "proof_view_set_proof", "PROOF-VIEW-SET-PROOF", 2, 0, false);
		declareFunction(me, "proof_view_set_answer", "PROOF-VIEW-SET-ANSWER", 2, 0, false);
		declareFunction(me, "construct_inference_proof_view", "CONSTRUCT-INFERENCE-PROOF-VIEW", 2, 1, false);
		declareFunction(me, "proof_view_closed_query_success_value", "PROOF-VIEW-CLOSED-QUERY-SUCCESS-VALUE", 0, 0, false);
		declareFunction(me, "proof_view_get_used_rules_root", "PROOF-VIEW-GET-USED-RULES-ROOT", 1, 0, false);
		declareFunction(me, "proof_view_get_query_root", "PROOF-VIEW-GET-QUERY-ROOT", 1, 0, false);
		declareFunction(me, "proof_view_fact_trivially_implies_proof_conclusionP_internal", "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES-PROOF-CONCLUSION?-INTERNAL", 2, 1, false);
		declareFunction(me, "proof_view_fact_trivially_implies_proof_conclusionP", "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES-PROOF-CONCLUSION?", 2, 1, false);
		declareFunction(me, "proof_view_tva_support_entryP", "PROOF-VIEW-TVA-SUPPORT-ENTRY?", 1, 1, false);
		declareFunction(me, "proof_view_entry_has_support_entryP", "PROOF-VIEW-ENTRY-HAS-SUPPORT-ENTRY?", 1, 0, false);
		declareFunction(me, "proof_view_rule_support_entryP", "PROOF-VIEW-RULE-SUPPORT-ENTRY?", 1, 0, false);
		declareFunction(me, "proof_view_has_sourcesP", "PROOF-VIEW-HAS-SOURCES?", 1, 0, false);
		declareFunction(me, "proof_view_has_justification_sectionP", "PROOF-VIEW-HAS-JUSTIFICATION-SECTION?", 1, 0, false);
		declareFunction(me, "proof_view_has_sectionP", "PROOF-VIEW-HAS-SECTION?", 2, 0, false);
		declareFunction(me, "proof_view_fact_trivially_impliesP", "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES?", 2, 1, false);
		declareFunction(me, "proof_view_fact_impliesP_internal", "PROOF-VIEW-FACT-IMPLIES?-INTERNAL", 2, 2, false);
		declareFunction(me, "proof_view_fact_impliesP", "PROOF-VIEW-FACT-IMPLIES?", 2, 2, false);
		declareFunction(me, "proof_view_fact_sentence_internal", "PROOF-VIEW-FACT-SENTENCE-INTERNAL", 1, 0, false);
		declareFunction(me, "proof_view_fact_sentence", "PROOF-VIEW-FACT-SENTENCE", 1, 0, false);
		declareFunction(me, "proof_view_fact_hl_sentence_internal", "PROOF-VIEW-FACT-HL-SENTENCE-INTERNAL", 1, 0, false);
		declareFunction(me, "proof_view_fact_hl_sentence", "PROOF-VIEW-FACT-HL-SENTENCE", 1, 0, false);
		declareFunction(me, "proof_view_fact_sentence_with_hl_terms_internal", "PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS-INTERNAL", 1, 0, false);
		declareFunction(me, "proof_view_fact_sentence_with_hl_terms", "PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS", 1, 0, false);
		declareFunction(me, "proof_view_transitive_support_p", "PROOF-VIEW-TRANSITIVE-SUPPORT-P", 1, 0, false);
		declareFunction(me, "proof_view_rule_suitable_for_rules_sectionP", "PROOF-VIEW-RULE-SUITABLE-FOR-RULES-SECTION?", 1, 0, false);
		declareFunction(me, "suppress_proof_supportP", "SUPPRESS-PROOF-SUPPORT?", 1, 0, false);
		declareFunction(me, "suppress_proof_view_literalP", "SUPPRESS-PROOF-VIEW-LITERAL?", 1, 0, false);
		declareFunction(me, "sentence_matches_suppressed_literalP_internal", "SENTENCE-MATCHES-SUPPRESSED-LITERAL?-INTERNAL", 2, 0, false);
		declareFunction(me, "sentence_matches_suppressed_literalP", "SENTENCE-MATCHES-SUPPRESSED-LITERAL?", 2, 0, false);
		declareFunction(me, "anything_token", "ANYTHING-TOKEN", 0, 1, false);
		declareFunction(me, "proof_view_external_support_p", "PROOF-VIEW-EXTERNAL-SUPPORT-P", 1, 0, false);
		declareFunction(me, "proof_view_get_document_for_hypothesis_internal", "PROOF-VIEW-GET-DOCUMENT-FOR-HYPOTHESIS-INTERNAL", 2, 0, false);
		declareFunction(me, "proof_view_get_document_for_hypothesis", "PROOF-VIEW-GET-DOCUMENT-FOR-HYPOTHESIS", 2, 0, false);
		declareFunction(me, "inference_proofE", "INFERENCE-PROOF=", 2, 0, false);
		declareFunction(me, "inference_proof_get_depth", "INFERENCE-PROOF-GET-DEPTH", 1, 0, false);
		declareFunction(me, "inference_proof_get_depth_memoized_internal", "INFERENCE-PROOF-GET-DEPTH-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction(me, "inference_proof_get_depth_memoized", "INFERENCE-PROOF-GET-DEPTH-MEMOIZED", 1, 0, false);
		declareFunction(me, "proof_el_formula", "PROOF-EL-FORMULA", 1, 1, false);
		declareFunction(me, "pph_proof_mt", "PPH-PROOF-MT", 1, 0, false);
		declareFunction(me, "terse_justification_for_inference_ids", "TERSE-JUSTIFICATION-FOR-INFERENCE-IDS", 3, 0, false);
		declareFunction(me, "terse_justification_for_inference", "TERSE-JUSTIFICATION-FOR-INFERENCE", 1, 1, false);
		declareFunction(me, "entities_in_bindings", "ENTITIES-IN-BINDINGS", 1, 1, false);
		declareFunction(me, "order_justifications_in_result_entry", "ORDER-JUSTIFICATIONS-IN-RESULT-ENTRY", 2, 0, false);
		declareFunction(me, "entry_with_proof_suid_has_entities_in_bindingsP", "ENTRY-WITH-PROOF-SUID-HAS-ENTITIES-IN-BINDINGS?", 3, 0, false);
		declareFunction(me, "find_result_entry_for_gaf", "FIND-RESULT-ENTRY-FOR-GAF", 4, 0, false);
		declareFunction(me, "is_relevant_gaf_for_justificationP", "IS-RELEVANT-GAF-FOR-JUSTIFICATION?", 1, 0, false);
		declareFunction(me, "get_source_for_assertion", "GET-SOURCE-FOR-ASSERTION", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_proof_view_file() {
		defparameter("*PROOF-VIEW-ASSERTED-LABEL*", $str0$);
		defparameter("*PROOF-VIEW-INFERRED-LABEL*", $str0$);
		defparameter("*PROOF-VIEW-OPAQUE-LABEL*", $str0$);
		defparameter("*PROOF-VIEW-ASSERTION-BOOKKEEPING-LABEL*", $str0$);
		defparameter("*PROOF-VIEW-SOURCES-LABEL*", $str1$External_Sources_);
		defparameter("*PROOF-VIEW-SOURCE-AS-MT-LABEL*", $str2$Source_);
		defparameter("*PROOF-VIEW-JUSTIFICATION-LABEL*", $str3$Detailed_Justification_);
		defparameter("*PROOF-VIEW-LINEAR-LABEL*", $str4$Linear_Justification_);
		defparameter("*PROOF-VIEW-FACTS-USED-LABEL*", $str5$Because_);
		defparameter("*PROOF-VIEW-TAB-ENTRY-LABELS*", list($proof_view_linear_label$.getDynamicValue(), $proof_view_justification_label$.getDynamicValue(), $proof_view_facts_used_label$.getDynamicValue()));
		defparameter("*PROOF-VIEW-RULES-USED-LABEL*", $str6$Key_Rules_);
		deflexical("*PROOF-VIEW-CIRCULAR-SUPPORT-LABEL*", $str7$Justified_above_);
		defparameter("*PROOF-VIEW-VALIDATE-SUPPORTS?*", NIL);
		deflexical("*PROOF-VIEW-FONT-COLORS*", list(html_macros.$html_color_cyc_logo_violet$.getGlobalValue(), html_macros.$html_color_dark_green$.getGlobalValue(), html_macros.$html_color_dark_blue$.getGlobalValue(), html_macros.$html_color_darker_purple$.getGlobalValue(), html_macros.$html_color_dark_yellow$.getGlobalValue(), html_macros.$html_color_dark_red$.getGlobalValue()));
		deflexical("*PROOF-VIEW-ABDUCTION-SUPPORT-COLOR*", html_macros.$html_color_sat_blue$.getGlobalValue());
		deflexical("*PROOF-VIEW-ABDUCTION-SUPPORT-CONFIRMED-COLOR*", html_macros.$html_color_black$.getGlobalValue());
		deflexical("*PROOF-VIEW-ABDUCTION-SUPPORT-DENIED-COLOR*", html_macros.$html_color_sat_red$.getGlobalValue());
		defparameter("*PROOF-VIEW-EXTERNAL-SENTENCE-PADDING*", $int$200);
		defparameter("*PROOF-VIEW-ENTITY-MENTION-PADDING*", $int$150);
		defparameter("*PROOF-VIEW-CITATION-FORMAT*", $SUPERSCRIPTS);
		defconstant("*DTP-PROOF-VIEW*", PROOF_VIEW);
		deflexical("*PROOF-VIEW-ID-INDEX*", SubLTrampolineFile.maybeDefault($proof_view_id_index$, $proof_view_id_index$, () -> new_id_index(UNPROVIDED, UNPROVIDED)));
		defconstant("*PROOF-VIEW-ROOT-ENTRY-ID*", ZERO_INTEGER);
		defparameter("*BREAK-ON-PROOF-VIEW-FILTERING?*", NIL);
		defconstant("*DTP-PROOF-VIEW-ENTRY*", PROOF_VIEW_ENTRY);
		defvar("*PROOF-VIEW-DEBUG?*", NIL);
		deflexical("*PROOF-VIEW-ENTRY-SHOWERS*", NIL);
		deflexical("*PROOF-VIEW-OBJECT-TYPE-OUTPUT-FNS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
		defparameter("*CHANGED-PROOF-VIEW-ENTRY-IDS*", NIL);
		defparameter("*USE-GET-EMPLOYER-CACHE?*", T);
		deflexical("*EMPLOYEE-EMPLOYERS-AND-MTS-CACHING-STATE*", NIL);
		defparameter("*PROOF-VIEW-ALLOW-TRIVIAL-PARTIAL-PROOF-CONCLUSION-SUPPORTS?*", NIL);
		defparameter("*PROOF-VIEW-LITERALS-TO-SUPPRESS*", misc_utilities.uninitialized());
		return NIL;
	}

	public static SubLObject setup_proof_view_file() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_proof_view$.getGlobalValue(), symbol_function(PROOF_VIEW_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list23);
		def_csetf(PROOF_VIEW_INT_ID, _CSETF_PROOF_VIEW_INT_ID);
		def_csetf(PROOF_VIEW_INT_PROOF, _CSETF_PROOF_VIEW_INT_PROOF);
		def_csetf(PROOF_VIEW_INT_ANSWER, _CSETF_PROOF_VIEW_INT_ANSWER);
		def_csetf(PROOF_VIEW_INT_ID_INDEX, _CSETF_PROOF_VIEW_INT_ID_INDEX);
		def_csetf(PROOF_VIEW_INT_PROPERTIES, _CSETF_PROOF_VIEW_INT_PROPERTIES);
		identity(PROOF_VIEW);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof_view$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_METHOD));
		declare_defglobal($proof_view_id_index$);
		register_macro_helper(FIND_PROOF_VIEW_MEMOIZATION_STATE, MAYBE_WITH_PROOF_VIEW_MEMOIZATION);
		register_external_symbol(CLEAR_PROOF_VIEW_MEMOIZATION_STATE_BY_ID);
		register_external_symbol($sym76$SET_PROOF_VIEW_ALLOW_EXTERNAL_LINKS_);
		register_external_symbol(SET_PROOF_VIEW_LANGUAGE_MT);
		register_external_symbol(SET_PROOF_VIEW_DOMAIN_MT);
		register_external_symbol(GET_PROOF_VIEW_DOMAIN_MT);
		register_external_symbol(GET_PROOF_VIEW_LANGUAGE_MT);
		register_external_symbol(GET_PROOF_VIEW_INCLUDE_LINEAR);
		register_external_symbol(SET_PROOF_VIEW_INCLUDE_LINEAR);
		register_external_symbol(GET_PROOF_VIEW_INCLUDE_DETAILS);
		register_external_symbol(SET_PROOF_VIEW_INCLUDE_DETAILS);
		register_external_symbol(GET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING);
		register_external_symbol(SET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING);
		register_external_symbol(GET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS);
		register_external_symbol(SET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS);
		register_external_symbol(SET_PROOF_VIEW_ADDRESSEE);
		register_external_symbol(SET_PROOF_VIEW_INCLUDE_CYCML);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_proof_view_entry$.getGlobalValue(), symbol_function(PROOF_VIEW_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list173);
		def_csetf(PROOF_VIEW_ENTRY_INT_ID, _CSETF_PROOF_VIEW_ENTRY_INT_ID);
		def_csetf(PROOF_VIEW_ENTRY_INT_PARENT_ID, _CSETF_PROOF_VIEW_ENTRY_INT_PARENT_ID);
		def_csetf(PROOF_VIEW_ENTRY_INT_LABEL, _CSETF_PROOF_VIEW_ENTRY_INT_LABEL);
		def_csetf(PROOF_VIEW_ENTRY_INT_OBJECT_TYPE, _CSETF_PROOF_VIEW_ENTRY_INT_OBJECT_TYPE);
		def_csetf(PROOF_VIEW_ENTRY_INT_OBJECT, _CSETF_PROOF_VIEW_ENTRY_INT_OBJECT);
		def_csetf(PROOF_VIEW_ENTRY_INT_PROOF_VIEW, _CSETF_PROOF_VIEW_ENTRY_INT_PROOF_VIEW);
		def_csetf(PROOF_VIEW_ENTRY_INT_PROPERTIES, _CSETF_PROOF_VIEW_ENTRY_INT_PROPERTIES);
		identity(PROOF_VIEW_ENTRY);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof_view_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_ENTRY_METHOD));
		memoization_state.note_memoized_function(PROOF_VIEW_ENTRY_SPECIFICITY);
		memoization_state.note_memoized_function(PROOF_VIEW_ENTRY_GET_DEPTH);
		register_external_symbol(GENERATE_HTML_FROM_PROOF_VIEW_ENTRY_IDS);
		register_external_symbol(PROOF_VIEW_ENTRY_HTML);
		note_funcall_helper_function(FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS);
		memoization_state.note_memoized_function(PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL);
		memoization_state.note_memoized_function(PROOF_VIEW_SUPPORT_HTML);
		memoization_state.note_globally_cached_function(EMPLOYEE_EMPLOYERS_AND_MTS);
		register_external_symbol(GET_ABDUCED_SUPPORT_SENTENCE_FOR_PROOF_VIEW);
		register_external_symbol(ASSERT_ABDUCTION_SUPPORT_FOR_PROOF_VIEW);
		register_external_symbol(GET_QUERY_URL_FOR_PROOF_VIEW);
		register_external_symbol(GET_SENTENCE_FOR_PROOF_VIEW);
		register_external_symbol(CONSTRUCT_PROOF_VIEWS_JAVA_ITERATIVELY);
		register_external_symbol(CONSTRUCT_PROOF_VIEWS_JAVA_LIST);
		register_external_symbol(CONSTRUCT_XML_PROOF_VIEW_FOR_SENTENCE);
		register_external_symbol(PROOF_VIEW_ID_POPULATE);
		register_external_symbol(PROOF_VIEW_XML);
		register_external_symbol(PROOF_VIEW_ENTRY_XML);
		register_external_symbol(GET_NEW_EMPTY_PROOF_VIEW_ID);
		memoization_state.note_memoized_function($sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_);
		memoization_state.note_memoized_function($sym407$PROOF_VIEW_FACT_IMPLIES_);
		memoization_state.note_memoized_function(PROOF_VIEW_FACT_SENTENCE);
		memoization_state.note_memoized_function(PROOF_VIEW_FACT_HL_SENTENCE);
		memoization_state.note_memoized_function(PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS);
		memoization_state.note_memoized_function($sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_);
		memoization_state.note_memoized_function(PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS);
		memoization_state.note_memoized_function(INFERENCE_PROOF_GET_DEPTH_MEMOIZED);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_proof_view_file();
	}

	@Override
	public void initializeVariables() {
		init_proof_view_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_proof_view_file();
	}

	

	public static final class $proof_view_native extends SubLStructNative {
		public SubLObject $id;

		public SubLObject $proof;

		public SubLObject $answer;

		public SubLObject $id_index;

		public SubLObject $properties;

		private static final SubLStructDeclNative structDecl;

		private $proof_view_native() {
			this.$id = Lisp.NIL;
			this.$proof = Lisp.NIL;
			this.$answer = Lisp.NIL;
			this.$id_index = Lisp.NIL;
			this.$properties = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$id;
		}

		@Override
		public SubLObject getField3() {
			return this.$proof;
		}

		@Override
		public SubLObject getField4() {
			return this.$answer;
		}

		@Override
		public SubLObject getField5() {
			return this.$id_index;
		}

		@Override
		public SubLObject getField6() {
			return this.$properties;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$id = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$proof = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value) {
			return this.$answer = value;
		}

		@Override
		public SubLObject setField5(final SubLObject value) {
			return this.$id_index = value;
		}

		@Override
		public SubLObject setField6(final SubLObject value) {
			return this.$properties = value;
		}

		static {
			structDecl = makeStructDeclNative($proof_view_native.class, PROOF_VIEW, PROOF_VIEW_P, $list17, $list18, new String[] { "$id", "$proof", "$answer", "$id_index", "$properties" }, $list19, $list20, PROOF_VIEW_INT_PRINT);
		}
	}

	public static final class $proof_view_p$UnaryFunction extends UnaryFunction {
		public $proof_view_p$UnaryFunction() {
			super(extractFunctionNamed("PROOF-VIEW-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return proof_view_p(arg1);
		}
	}

	public static final class $proof_view_entry_native extends SubLStructNative {
		public SubLObject $id;

		public SubLObject $parent_id;

		public SubLObject $label;

		public SubLObject $object_type;

		public SubLObject $object;

		public SubLObject $proof_view;

		public SubLObject $properties;

		private static final SubLStructDeclNative structDecl;

		private $proof_view_entry_native() {
			this.$id = Lisp.NIL;
			this.$parent_id = Lisp.NIL;
			this.$label = Lisp.NIL;
			this.$object_type = Lisp.NIL;
			this.$object = Lisp.NIL;
			this.$proof_view = Lisp.NIL;
			this.$properties = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$id;
		}

		@Override
		public SubLObject getField3() {
			return this.$parent_id;
		}

		@Override
		public SubLObject getField4() {
			return this.$label;
		}

		@Override
		public SubLObject getField5() {
			return this.$object_type;
		}

		@Override
		public SubLObject getField6() {
			return this.$object;
		}

		@Override
		public SubLObject getField7() {
			return this.$proof_view;
		}

		@Override
		public SubLObject getField8() {
			return this.$properties;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$id = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$parent_id = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value) {
			return this.$label = value;
		}

		@Override
		public SubLObject setField5(final SubLObject value) {
			return this.$object_type = value;
		}

		@Override
		public SubLObject setField6(final SubLObject value) {
			return this.$object = value;
		}

		@Override
		public SubLObject setField7(final SubLObject value) {
			return this.$proof_view = value;
		}

		@Override
		public SubLObject setField8(final SubLObject value) {
			return this.$properties = value;
		}

		static {
			structDecl = makeStructDeclNative($proof_view_entry_native.class, PROOF_VIEW_ENTRY, PROOF_VIEW_ENTRY_P, $list167, $list168, new String[] { "$id", "$parent_id", "$label", "$object_type", "$object", "$proof_view", "$properties" }, $list169, $list170, PROOF_VIEW_ENTRY_INT_PRINT);
		}
	}

	public static final class $proof_view_entry_p$UnaryFunction extends UnaryFunction {
		public $proof_view_entry_p$UnaryFunction() {
			super(extractFunctionNamed("PROOF-VIEW-ENTRY-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return proof_view_entry_p(arg1);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static SubLObject get_tkb_image_root() {
		if (true)
			Errors.unimplementedMethod(myName);

		// TODO Auto-generated method stub
		return null;
	}
}

/**
 * Total time: 2843 ms synthetic
 */
