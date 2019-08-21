package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cb_browser;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_browser.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

public final class cb_browser extends SubLTranslatedFile {
	public static final SubLFile me = new cb_browser();

	public static final String myName = "com.cyc.cycjava.cycl.cb_browser";

	public static final String myFingerPrint = "80ea9914098b136b303715ac29dd4a6b2c86e88a08846827953e1ddd46348959";

	// deflexical
	/**
	 * A list of the adornments for pages that represent different ways of viewing a
	 * term. @note that because of the feature conditionals this may have nils in
	 * it.
	 */
	private static final SubLSymbol $cb_term_page_adornments$ = makeSymbol("*CB-TERM-PAGE-ADORNMENTS*");

	// deflexical
	private static final SubLSymbol $semantic_web_uri_data$ = makeSymbol("*SEMANTIC-WEB-URI-DATA*");

	// defparameter
	private static final SubLSymbol $cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$ = makeSymbol("*CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NEGATED*");

	// defparameter
	private static final SubLSymbol $cb_c_gaf_arg_rec_arg_pred_mt_binary$ = makeSymbol("*CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY*");

	// defparameter
	/**
	 * A list of assertions generated in the course of displaying a group of
	 * assertions. An element of this list is such that its EL formula differs from
	 * its HL formula other than on account of an embedded arg2 assertion the EL
	 * formula of which differs from the HL formula.
	 */
	private static final SubLSymbol $cb_c_gaf_arg_rec_arg_pred_mt_binary_el$ = makeSymbol("*CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-EL*");

	// defparameter
	private static final SubLSymbol $cb_c_nart_arg_rec_arg_func_binary$ = makeSymbol("*CB-C-NART-ARG-REC-ARG-FUNC-BINARY*");

	// defparameter
	/**
	 * A list of assertions generated in the course of displaying a group of
	 * assertions. An element of this list is such that its EL formula differs from
	 * its HL formula other than on account of an embedded arg2 assertion the EL
	 * formula of which differs from the HL formula.
	 */
	private static final SubLSymbol $cb_c_nart_arg_rec_arg_func_binary_el$ = makeSymbol("*CB-C-NART-ARG-REC-ARG-FUNC-BINARY-EL*");

	// defparameter
	public static final SubLSymbol $bookmarked_term_caption$ = makeSymbol("*BOOKMARKED-TERM-CAPTION*");

	// defparameter
	public static final SubLSymbol $unbookmarked_term_caption$ = makeSymbol("*UNBOOKMARKED-TERM-CAPTION*");

	// defvar
	public static final SubLSymbol $cb_c_gaf_arg_show_arg_headerP$ = makeSymbol("*CB-C-GAF-ARG-SHOW-ARG-HEADER?*");

	// defvar
	public static final SubLSymbol $cb_c_gaf_arg_show_mt_headerP$ = makeSymbol("*CB-C-GAF-ARG-SHOW-MT-HEADER?*");

	// defparameter
	private static final SubLSymbol $cb_alpha_before$ = makeSymbol("*CB-ALPHA-BEFORE*");

	// defparameter
	private static final SubLSymbol $cb_alpha_after$ = makeSymbol("*CB-ALPHA-AFTER*");

	// defparameter
	private static final SubLSymbol $cb_alpha_total$ = makeSymbol("*CB-ALPHA-TOTAL*");

	// defparameter
	private static final SubLSymbol $cb_before_alpha_top$ = makeSymbol("*CB-BEFORE-ALPHA-TOP*");

	// defparameter
	private static final SubLSymbol $cb_after_alpha_bottom$ = makeSymbol("*CB-AFTER-ALPHA-BOTTOM*");

	// defparameter
	private static final SubLSymbol $cb_alpha_upper_char_order$ = makeSymbol("*CB-ALPHA-UPPER-CHAR-ORDER*");

	// defparameter
	private static final SubLSymbol $cb_alpha_lower_char_order$ = makeSymbol("*CB-ALPHA-LOWER-CHAR-ORDER*");

	// defparameter
	private static final SubLSymbol $cb_alpha_around_total$ = makeSymbol("*CB-ALPHA-AROUND-TOTAL*");

	// defparameter
	private static final SubLSymbol $cb_alpha_around_sofar$ = makeSymbol("*CB-ALPHA-AROUND-SOFAR*");

	// defparameter
	private static final SubLSymbol $cb_alpha_around_gather$ = makeSymbol("*CB-ALPHA-AROUND-GATHER*");

	private static final SubLString $str0$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

	private static final SubLString $str1$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

	private static final SubLSymbol $CB_C_INDEX = makeKeyword("CB-C-INDEX");

	private static final SubLString $str5$cb_c_index_html = makeString("cb-c-index.html");

	private static final SubLSymbol INDEX_BROWSER = makeSymbol("INDEX-BROWSER");

	private static final SubLInteger $int$200 = makeInteger(200);

	private static final SubLSymbol CB_C_PERTINENT_QUERY_LINKS = makeSymbol("CB-C-PERTINENT-QUERY-LINKS");

	private static final SubLString $$$term = makeString("term");

	private static final SubLString $str24$Checking_for_Pertinent_Queries___ = makeString("Checking for Pertinent Queries...");

	private static final SubLString $$$div = makeString("div");

	private static final SubLInteger $int$50 = makeInteger(50);

	private static final SubLSymbol $ALL_ASSERTED_KNOWLEDGE = makeKeyword("ALL-ASSERTED-KNOWLEDGE");

	private static final SubLString $$$Inferred_Index = makeString("Inferred Index");

	private static final SubLSymbol HIERARCHY_DEFAULT = makeSymbol("HIERARCHY-DEFAULT");

	private static final SubLSymbol VFACETS = makeSymbol("VFACETS");

	private static final SubLSymbol VCLUMPS = makeSymbol("VCLUMPS");

	private static final SubLSymbol ALPHABETICAL_SEARCH = makeSymbol("ALPHABETICAL-SEARCH");

	private static final SubLString $$$lightyellow = makeString("lightyellow");

	public static final SubLString $$$Viewpoint_Filters = makeString("Viewpoint Filters");

	private static final SubLString $str44$Unknown_auxiliary_index__a = makeString("Unknown auxiliary index ~a");

	private static final SubLSymbol $SKSI_EXTERNAL_GAF_ARGUMENT = makeKeyword("SKSI-EXTERNAL-GAF-ARGUMENT");

	private static final SubLString $str47$ = makeString("");

	private static final SubLSymbol $GAF_ARG_PREDICATE = makeKeyword("GAF-ARG-PREDICATE");

	private static final SubLSymbol $GAF_ARG_PREDICATE_CONTENT = makeKeyword("GAF-ARG-PREDICATE-CONTENT");

	private static final SubLString $str54$_arg_ = makeString("_arg_");

	private static final SubLString $str55$arg_ = makeString("arg_");

	private static final SubLString $str57$nart_arg__A = makeString("nart_arg_~A");

	private static final SubLSymbol $NART_ARG_FUNCTION = makeKeyword("NART-ARG-FUNCTION");

	private static final SubLSymbol $NART_ARG_FUNCTION_CONTENT = makeKeyword("NART-ARG-FUNCTION-CONTENT");

	private static final SubLString $str60$pred_extent = makeString("pred_extent");

	private static final SubLInteger $int$12000000 = makeInteger(12000000);

	private static final SubLSymbol $SKSI_EXTERNAL_PREDICATE_EXTENT = makeKeyword("SKSI-EXTERNAL-PREDICATE-EXTENT");

	public static final SubLString $str68$pred_rule__A = makeString("pred_rule_~A");

	public static final SubLString $str69$rule__A__A__A = makeString("rule_~A_~A_~A");

	private static final SubLSymbol $DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");

	public static final SubLString $str71$decontextualized_ist_pred_rule__A = makeString("decontextualized_ist_pred_rule_~A");

	public static final SubLString $str73$isa_rule__A = makeString("isa_rule_~A");

	private static final SubLSymbol $QUOTED_ISA_RULE = makeKeyword("QUOTED-ISA-RULE");

	public static final SubLString $str75$quoted_isa_rule__A = makeString("quoted_isa_rule_~A");

	public static final SubLString $str77$genl_rule__A = makeString("genl_rule_~A");

	private static final SubLSymbol $GENL_MT_RULE = makeKeyword("GENL-MT-RULE");

	public static final SubLString $str79$genl_mt_rule__A = makeString("genl_mt_rule_~A");

	private static final SubLSymbol $SKSI_EXTERNAL_MT_CONTENTS = makeKeyword("SKSI-EXTERNAL-MT-CONTENTS");

	private static final SubLSymbol $HL_FORMULAS_FOR_INDEX_HOOK = makeKeyword("HL-FORMULAS-FOR-INDEX-HOOK");

	private static final SubLSymbol $EL_FORMULAS_FOR_INDEX_HOOK = makeKeyword("EL-FORMULAS-FOR-INDEX-HOOK");

	private static final SubLSymbol $EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS = makeKeyword("EL-FORMULAS-EXCEPT-WHEN-BROWSING-SKOLEMS");

	public static final SubLList $list94 = list(makeSymbol("INDEX-SPEC"));

	public static final SubLString $str95$Could_not_determine_an_index_hook = makeString("Could not determine an index-hook from ~a");

	public static final SubLString $str96$_ = makeString(":");

	public static final SubLSymbol CB_C_EL = makeSymbol("CB-C-EL");

	private static final SubLString $str99$_EL_Formulas_ = makeString("[EL Formulas]");

	private static final SubLString $str100$cb_c_el__A = makeString("cb-c-el&~A");

	private static final SubLSymbol CB_LINK_EL_FORMULAS_FOR_INDEX_HOOK = makeSymbol("CB-LINK-EL-FORMULAS-FOR-INDEX-HOOK");

	private static final SubLSymbol CB_C_HL = makeSymbol("CB-C-HL");

	private static final SubLString $str103$_HL_Formulas_ = makeString("[HL Formulas]");

	private static final SubLString $str104$cb_c_hl__A = makeString("cb-c-hl&~A");

	private static final SubLSymbol CB_LINK_HL_FORMULAS_FOR_INDEX_HOOK = makeSymbol("CB-LINK-HL-FORMULAS-FOR-INDEX-HOOK");

	private static final SubLList $list106 = list(makeSymbol("FORT-SPEC"));

	private static final SubLString $str107$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

	private static final SubLSymbol CB_C_DOCUMENTATION = makeSymbol("CB-C-DOCUMENTATION");

	private static final SubLString $$$Documentation = makeString("Documentation");

	private static final SubLString $str110$cb_c_documentation__A = makeString("cb-c-documentation&~A");

	private static final SubLSymbol CB_LINK_DOCUMENTATION = makeSymbol("CB-LINK-DOCUMENTATION");

	private static final SubLSymbol CB_DOCUMENTATION_PREDICATE_P = makeSymbol("CB-DOCUMENTATION-PREDICATE-P");

	private static final SubLSymbol $cb_documentation_predicate_p_caching_state$ = makeSymbol("*CB-DOCUMENTATION-PREDICATE-P-CACHING-STATE*");

	private static final SubLList $list115 = list(cons(makeString("latest OpenCyc"), makeSymbol("OWL-OPENCYC-LATEST-URI-FOR-FORT")), cons(makeString("versioned OpenCyc"), makeSymbol("OWL-OPENCYC-VERSIONED-URI-FOR-FORT")), cons(makeString("readable OpenCyc"), makeSymbol("OWL-OPENCYC-READABLE-URI-FOR-FORT")), cons(makeString("latest Cyc"), makeSymbol("OWL-CYC-LATEST-URI-FOR-FORT")),
			cons(makeString("versioned Cyc"), makeSymbol("OWL-CYC-VERSIONED-URI-FOR-FORT")), cons(makeString("readable Cyc"), makeSymbol("OWL-CYC-READABLE-URI-FOR-FORT")));

	private static final SubLString $str117$_documentation__ = makeString(" documentation :");

	private static final SubLString $str119$_is_mentioned_in_code_ = makeString(" is mentioned in code.");

	public static final SubLSymbol CB_SUMMARY_SENTENCE = makeSymbol("CB-SUMMARY-SENTENCE");

	public static final SubLString $str121$Getting_summary_sentence___ = makeString("Getting summary sentence...");

	public static final SubLString $$$span = makeString("span");

	private static final SubLString $str123$semantic_web_uris = makeString("semantic_web_uris");

	private static final SubLString $$$Semantic_Web_URIs = makeString("Semantic Web URIs");

	private static final SubLList $list125 = cons(makeSymbol("LABEL"), makeSymbol("METHOD"));

	private static final SubLString $str128$___ = makeString(" : ");

	private static final SubLObject $const129$GetPredsAndMetaDataForExternalDoc = reader_make_constant_shell(makeString("GetPredsAndMetaDataForExternalDocumentationURL"));

	private static final SubLSymbol $sym130$_MT = makeSymbol("?MT");

	private static final SubLSymbol $sym131$_PRED = makeSymbol("?PRED");

	private static final SubLSymbol $sym132$_DISPLAY_STRING = makeSymbol("?DISPLAY-STRING");

	private static final SubLObject $$GetURLsFromExternalURLPred = reader_make_constant_shell(makeString("GetURLsFromExternalURLPred"));

	private static final SubLList $list134 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("Thing")));

	private static final SubLList $list135 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("DocumentationPageExternalURLPredicate")));

	private static final SubLList $list136 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("Microtheory")));

	private static final SubLString $str137$external_links = makeString("external_links");

	private static final SubLString $$$External_Links = makeString("External Links");

	private static final SubLSymbol $sym139$_ = makeSymbol("<");

	private static final SubLSymbol QUOTED_INSTANCE_CARDINALITY = makeSymbol("QUOTED-INSTANCE-CARDINALITY");

	private static final SubLString $str141$kb_subsets = makeString("kb_subsets");

	private static final SubLString $$$Relevant_KB_Subsets = makeString("Relevant KB Subsets");

	private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

	private static final SubLString $$$Summary_of_ = makeString("Summary of ");

	private static final SubLSymbol CB_CF = makeSymbol("CB-CF");

	private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

	private static final SubLObject $$CycKBSubsetCollection = reader_make_constant_shell(makeString("CycKBSubsetCollection"));

	private static final SubLSymbol $sym149$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

	private static final SubLString $$$Created = makeString("Created");

	private static final SubLString $$$_by_ = makeString(" by ");

	private static final SubLString $$$_on_ = makeString(" on ");

	private static final SubLString $$$_at_ = makeString(" at ");

	private static final SubLString $$$_for_ = makeString(" for ");

	private static final SubLObject $$myCreator = reader_make_constant_shell(makeString("myCreator"));

	private static final SubLObject $$myCreationPurpose = reader_make_constant_shell(makeString("myCreationPurpose"));

	private static final SubLObject $$myCreationTime = reader_make_constant_shell(makeString("myCreationTime"));

	private static final SubLObject $$myCreationSecond = reader_make_constant_shell(makeString("myCreationSecond"));

	private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

	private static final SubLString $str160$___ = makeString(";; ");

	private static final SubLString $str161$Bookkeeping_Assertions___ = makeString("Bookkeeping Assertions : ");

	private static final SubLString $str162$Documentation_for__S = makeString("Documentation for ~S");

	private static final SubLString $str163$yui_skin_sam = makeString("yui-skin-sam");

	private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

	private static final SubLString $$$button = makeString("button");

	private static final SubLString $$$reload = makeString("reload");

	private static final SubLString $$$Refresh = makeString("Refresh");

	private static final SubLString $str168$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

	private static final SubLString $str170$Bad_type_of_term__A__ = makeString("Bad type of term ~A~%");

	private static final SubLObject $$sharedNotes = reader_make_constant_shell(makeString("sharedNotes"));

	private static final SubLString $$$No_documentation_assertions_for_ = makeString("No documentation assertions for ");

	private static final SubLString $str175$In_Mt___ = makeString("In Mt : ");

	private static final SubLString $str176$Mt___ = makeString("Mt : ");

	private static final SubLString $str177$__ = makeString(" .");

	private static final SubLList $list178 = list(makeSymbol("TERM-SPEC"));

	private static final SubLSymbol CB_C_DEFINITIONAL = makeSymbol("CB-C-DEFINITIONAL");

	private static final SubLString $$$Definitional_Info = makeString("Definitional Info");

	private static final SubLString $str181$cb_c_definitional__A = makeString("cb-c-definitional&~A");

	private static final SubLSymbol CB_LINK_DEFINITIONAL = makeSymbol("CB-LINK-DEFINITIONAL");

	private static final SubLString $str184$Definitional_info_for__S = makeString("Definitional info for ~S");

	private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

	private static final SubLObject $$salientAssertions = reader_make_constant_shell(makeString("salientAssertions"));

	private static final SubLSymbol $CB_DESCRIBE_CONSTANT = makeKeyword("CB-DESCRIBE-CONSTANT");

	private static final SubLString $str188$cb_describe_constant_html = makeString("cb-describe-constant.html");

	private static final SubLString $$$the_Constant_Internal_Data_page = makeString("the Constant Internal Data page");

	private static final SubLString $str190$_a_does_not_specify_a_Cyc_constan = makeString("~a does not specify a Cyc constant");

	private static final SubLString $$$Constant_Internal_Data = makeString("Constant Internal Data");

	private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

	private static final SubLString $str194$Internal_data_for_constant__ = makeString("Internal data for constant :");

	private static final SubLString $str195$Name__ = makeString("Name :");

	private static final SubLString $str196$_ephemeral__internal__ = makeString("(ephemeral, internal) ");

	private static final SubLString $str197$SUID__ = makeString("SUID :");

	private static final SubLString $str198$_permanent__external__ = makeString("(permanent, external) ");

	private static final SubLString $str199$GUID__ = makeString("GUID :");

	private static final SubLString $str200$_compact_external__ = makeString("(compact external) ");

	private static final SubLString $str201$HL_ID__ = makeString("HL ID :");

	private static final SubLString $str202$To_use_in_Java_OpenCYC_API_ = makeString("To use in Java OpenCYC API:");

	private static final SubLString $str203$new_CycConstant__S__new_Guid__S__ = makeString("new CycConstant(~S, new Guid(~S))");

	private static final SubLSymbol CB_DESCRIBE_CONSTANT = makeSymbol("CB-DESCRIBE-CONSTANT");

	private static final SubLString $str205$cb_describe_constant__A = makeString("cb-describe-constant&~A");

	private static final SubLString $$$Internal_Data = makeString("Internal Data");

	private static final SubLSymbol CB_LINK_DESCRIBE_CONSTANT = makeSymbol("CB-LINK-DESCRIBE-CONSTANT");

	private static final SubLSymbol $CB_DESCRIBE_NAT = makeKeyword("CB-DESCRIBE-NAT");

	private static final SubLString $str209$cb_describe_nat_html = makeString("cb-describe-nat.html");

	private static final SubLString $str210$the_Reified_NAT_Internal_Data_pag = makeString("the Reified NAT Internal Data page");

	private static final SubLString $str211$_a_does_not_specify_a_Cyc_reified = makeString("~a does not specify a Cyc reified NAT");

	private static final SubLString $$$Reified_NAT_Internal_Data = makeString("Reified NAT Internal Data");

	private static final SubLString $str213$Internal_data_for_Reified_NAT__ = makeString("Internal data for Reified NAT :");

	private static final SubLString $str214$ID_Number__ = makeString("ID Number :");

	private static final SubLString $str215$HL_Formula__ = makeString("HL Formula :");

	private static final SubLString $str216$_compact__external__ = makeString("(compact, external) ");

	private static final SubLString $str217$HL_ID_String___ = makeString("HL ID String : ");

	private static final SubLSymbol CB_DESCRIBE_NART = makeSymbol("CB-DESCRIBE-NART");

	private static final SubLString $str219$cb_describe_nart__A = makeString("cb-describe-nart&~A");

	private static final SubLSymbol CB_LINK_DESCRIBE_NART = makeSymbol("CB-LINK-DESCRIBE-NART");

	private static final SubLString $$$Inference_Data = makeString("Inference Data");

	private static final SubLSymbol $PREDICATE_SPECIFIC_REMOVAL_MODULES = makeKeyword("PREDICATE-SPECIFIC-REMOVAL-MODULES");

	private static final SubLString $str223$_Removal_Modules_ = makeString("[Removal Modules]");

	private static final SubLSymbol $PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeKeyword("PREDICATE-SPECIFIC-PREFERENCE-MODULES");

	private static final SubLString $str225$_Preference_Modules_ = makeString("[Preference Modules]");

	private static final SubLSymbol $PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeKeyword("PREDICATE-SPECIFIC-HL-STORAGE-MODULES");

	private static final SubLString $str227$_Storage_Modules_ = makeString("[Storage Modules]");

	private static final SubLSymbol CB_C_ALL_ASSERTED_KNOWLEDGE = makeSymbol("CB-C-ALL-ASSERTED-KNOWLEDGE");

	private static final SubLString $str229$All_assertions_for__S = makeString("All assertions for ~S");

	private static final SubLString $str230$cb_c_all_asserted_knowledge__A = makeString("cb-c-all-asserted-knowledge&~A");

	private static final SubLString $$$All_Asserted_Knowledge = makeString("All Asserted Knowledge");

	private static final SubLString $str232$___a_ = makeString(" (~a)");

	private static final SubLSymbol CB_LINK_ALL_ASSERTED_KNOWLEDGE = makeSymbol("CB-LINK-ALL-ASSERTED-KNOWLEDGE");

	private static final SubLString $str234$All_bookeeping_assertions_for__S = makeString("All bookeeping assertions for ~S");

	private static final SubLSymbol CB_C_BOOKKEEPING_ASSERTIONS = makeSymbol("CB-C-BOOKKEEPING-ASSERTIONS");

	private static final SubLString $str236$cb_c_bookkeeping_assertions__A = makeString("cb-c-bookkeeping-assertions&~A");

	private static final SubLString $$$Bookkeeping_Info = makeString("Bookkeeping Info");

	private static final SubLSymbol CB_LINK_BOOKKEEPING_ASSERTIONS = makeSymbol("CB-LINK-BOOKKEEPING-ASSERTIONS");

	private static final SubLSymbol CB_C_TOTAL = makeSymbol("CB-C-TOTAL");

	private static final SubLString $str240$cb_c_total__A = makeString("cb-c-total&~A");

	private static final SubLString $$$All_KB_Assertions = makeString("All KB Assertions");

	private static final SubLSymbol CB_LINK_CONSTANT_TOTAL = makeSymbol("CB-LINK-CONSTANT-TOTAL");

	private static final SubLString $str243$cb_assertion_chronology__A = makeString("cb-assertion-chronology&~A");

	private static final SubLString $$$Assertions_History = makeString("Assertions History");

	private static final SubLSymbol CB_LINK_CHRONOLOGICAL_ORDER = makeSymbol("CB-LINK-CHRONOLOGICAL-ORDER");

	private static final SubLString $$$Assertion_History = makeString("Assertion History");

	private static final SubLSymbol CB_ASSERTION_CHRONOLOGY = makeSymbol("CB-ASSERTION-CHRONOLOGY");

	private static final SubLString $$$unknown = makeString("unknown");

	private static final SubLString $str249$cb_assertions_id_order__A = makeString("cb-assertions-id-order&~A");

	private static final SubLString $$$Assertions_by_ID = makeString("Assertions by ID");

	private static final SubLSymbol $ASSERTIONS_ID_ORDER = makeKeyword("ASSERTIONS-ID-ORDER");

	private static final SubLSymbol CB_LINK_ASSERTIONS_ID_ORDER = makeSymbol("CB-LINK-ASSERTIONS-ID-ORDER");

	private static final SubLSymbol CB_ASSERTIONS_ID_ORDER = makeSymbol("CB-ASSERTIONS-ID-ORDER");

	private static final SubLList $list254 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ARG-STRING"), makeSymbol("PRED-SPEC"), makeSymbol("MT-SPEC"));

	private static final SubLString $str255$Could_not_determine_an_arg_from__ = makeString("Could not determine an arg from ~a");

	private static final SubLString $str256$Could_not_determine_a_microtheory = makeString("Could not determine a microtheory from ~a");

	private static final SubLSymbol CB_C_GAF_ARG = makeSymbol("CB-C-GAF-ARG");

	private static final SubLString $str258$GAF_index_for__S = makeString("GAF index for ~S");

	private static final SubLString $str259$cb_c_gaf_arg__A = makeString("cb-c-gaf-arg&~A");

	private static final SubLString $str260$__a = makeString("&~a");

	private static final SubLString $str261$Arg__a = makeString("Arg ~a");

	private static final SubLString $$$All_GAFs = makeString("All GAFs");

	private static final SubLSymbol CB_LINK_GAF_ARG = makeSymbol("CB-LINK-GAF-ARG");

	private static final SubLSymbol LITERAL_QUERY_INDEX_DISPLAY = makeSymbol("LITERAL-QUERY-INDEX-DISPLAY");

	private static final SubLSymbol $sym268$FAST_FI_NOT_EL_TERM_ = makeSymbol("FAST-FI-NOT-EL-TERM?");

	private static final SubLSymbol CB_C_GAF_ARG_REC_ARG_PRED_MT_BINARY_NOTE_EL = makeSymbol("CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NOTE-EL");

	private static final SubLSymbol CB_C_GAF_ARG_REC_ARG_PRED_MT_BINARY_NOTE = makeSymbol("CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NOTE");

	private static final SubLSymbol CB_EL_ASSERTION_LINK_BINARY_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY");

	private static final SubLSymbol CB_ASSERTION_LINK_BINARY = makeSymbol("CB-ASSERTION-LINK-BINARY");

	private static final SubLSymbol ASSERTION_CONS = makeSymbol("ASSERTION-CONS");

	private static final SubLSymbol CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");

	private static final SubLSymbol CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");

	private static final SubLSymbol CB_ASSERTION_LINK_WITH_MT = makeSymbol("CB-ASSERTION-LINK-WITH-MT");

	private static final SubLSymbol CB_ASSERTION_LINK = makeSymbol("CB-ASSERTION-LINK");

	private static final SubLString $str278$__ = makeString("#$");

	private static final SubLString $str279$_arg_S___S_ = makeString(" arg~S (~S)");

	private static final SubLList $list282 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ARG-STRING"), makeSymbol("FUNC-SPEC"));

	private static final SubLString $str283$NART_index_for__S = makeString("NART index for ~S");

	private static final SubLSymbol CB_C_NART_ARG = makeSymbol("CB-C-NART-ARG");

	private static final SubLString $str285$cb_c_nart_arg__A = makeString("cb-c-nart-arg&~A");

	private static final SubLString $$$All_NARTs = makeString("All NARTs");

	private static final SubLSymbol CB_LINK_NART_ARG = makeSymbol("CB-LINK-NART-ARG");

	private static final SubLSymbol CB_C_NART_ARG_REC_ARG_FUNC_BINARY_NOTE_EL = makeSymbol("CB-C-NART-ARG-REC-ARG-FUNC-BINARY-NOTE-EL");

	private static final SubLSymbol CB_C_NART_ARG_REC_ARG_FUNC_BINARY_NOTE = makeSymbol("CB-C-NART-ARG-REC-ARG-FUNC-BINARY-NOTE");

	private static final SubLSymbol CB_TERM_OF_UNIT_LINK = makeSymbol("CB-TERM-OF-UNIT-LINK");

	private static final SubLString $$$Individual = makeString("Individual");

	private static final SubLString $$$Index = makeString("Index");

	private static final SubLString $$$NAUT = makeString("NAUT");

	private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

	private static final SubLString $$$Function = makeString("Function");

	private static final SubLString $str297$implementation_constants_html = makeString("implementation-constants.html");

	private static final SubLObject $$ImplementationConstant = reader_make_constant_shell(makeString("ImplementationConstant"));

	private static final SubLString $str299$_is_not_used_to_represent_common_ = makeString(" is not used to represent common sense knowledge.");

	private static final SubLString $str300$_1 = makeString("-1");

	private static final SubLString $str302$_Explain_ = makeString("[Explain]");

	private static final SubLString $$$Open_the_CURE_on_ = makeString("Open the CURE on ");

	private static final SubLString $str304$_to_add_more_facts_ = makeString(" to add more facts.");

	private static final SubLString $str305$This_term_is_bookmarked___Click_t = makeString("This term is bookmarked.  Click to remove it from the 'Interesting Items' of your history page.");

	private static final SubLString $str306$Bookmark_this_term___It_will_be_v = makeString("Bookmark this term.  It will be visible in the 'Interesting Items' section of the history page.");

	private static final SubLString $$$bookmarked = makeString("bookmarked");

	private static final SubLString $$$_bookmarkButton_ = makeString(" bookmarkButton ");

	private static final SubLString $str309$width_21px = makeString("width:21px");

	private static final SubLSymbol $HTML_INTERESTING_IMG = makeKeyword("HTML-INTERESTING-IMG");

	private static final SubLString $$$bookmarkOn = makeString("bookmarkOn");

	private static final SubLSymbol $HTML_NOT_INTERESTING_IMG = makeKeyword("HTML-NOT-INTERESTING-IMG");

	private static final SubLString $$$bookmarkOff = makeString("bookmarkOff");

	private static final SubLSymbol $HTML_INTERESTING_WORKING_IMG = makeKeyword("HTML-INTERESTING-WORKING-IMG");

	private static final SubLString $$$bookmarkWorking = makeString("bookmarkWorking");

	private static final SubLString $str316$cb_yellow_star_21x21_png = makeString("cb/yellow-star-21x21.png");

	private static final SubLString $str317$_Bookmark_Term_ = makeString("[Bookmark Term]");

	private static final SubLSymbol $HTML_INTERESTING_ARMED_IMG = makeKeyword("HTML-INTERESTING-ARMED-IMG");

	private static final SubLString $str319$cb_yellow_star_armed_21x21_png = makeString("cb/yellow-star-armed-21x21.png");

	private static final SubLString $str320$cb_yellow_star_off_21x21_png = makeString("cb/yellow-star-off-21x21.png");

	private static final SubLString $str321$_Remove_Bookmark_ = makeString("[Remove Bookmark]");

	private static final SubLString $str322$cb_yellow_star_armed_rotating_21x = makeString("cb/yellow-star-armed-rotating-21x21.gif");

	private static final SubLString $str323$GAF_Arg____A = makeString("GAF Arg : ~A");

	private static final SubLString $str324$NART_Arg____A = makeString("NART Arg : ~A");

	private static final SubLString $str325$mt_header = makeString("mt-header");

	private static final SubLList $list326 = list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("IntervalEndedByFn")), makeKeyword("ANYTHING")), makeKeyword("STRING"));

	private static final SubLString $$$throughout_some_time_before = makeString("throughout some time before");

	public static final SubLList $list328 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), makeKeyword("ANYTHING"), reader_make_constant_shell(makeString("Now")));

	private static final SubLString $$$since = makeString("since");

	private static final SubLList $list330 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

	private static final SubLList $list331 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("BIND"), makeSymbol("START")), list(makeKeyword("BIND"), makeSymbol("END")));

	private static final SubLString $$$throughout = makeString("throughout");

	private static final SubLString $$$until = makeString("until");

	private static final SubLString $$$during_some_time_before = makeString("during some time before");

	private static final SubLString $$$from = makeString("from");

	private static final SubLString $$$until_now = makeString("until now");

	private static final SubLString $$$in = makeString("in");

	private static final SubLString $$$Monadic_ = makeString("Monadic ");

	private static final SubLString $str341$Time_Interval___ = makeString("Time Interval : ");

	private static final SubLString $str342$Time_Parameter___ = makeString("Time Parameter : ");

	private static final SubLObject $$DateFromStringFn = reader_make_constant_shell(makeString("DateFromStringFn"));

	private static final SubLString $str344$Predicate___ = makeString("Predicate : ");

	private static final SubLString $$$neg = makeString("neg");

	private static final SubLString $$$not = makeString("not");

	private static final SubLString $str347$Predicate_extent_index_for__S = makeString("Predicate extent index for ~S");

	private static final SubLList $list348 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT-SPEC"));

	private static final SubLSymbol CB_C_PREDICATE_EXTENT = makeSymbol("CB-C-PREDICATE-EXTENT");

	private static final SubLString $str350$cb_c_predicate_extent__A = makeString("cb-c-predicate-extent&~A");

	private static final SubLString $$$Predicate_Extent = makeString("Predicate Extent");

	private static final SubLSymbol CB_LINK_PREDICATE_EXTENT = makeSymbol("CB-LINK-PREDICATE-EXTENT");

	private static final SubLString $str353$_Extent__ = makeString(" Extent :");

	private static final SubLString $str354$Function_extent_index_for__S = makeString("Function extent index for ~S");

	private static final SubLSymbol CB_C_FUNCTION_EXTENT = makeSymbol("CB-C-FUNCTION-EXTENT");

	private static final SubLString $str356$cb_c_function_extent__A = makeString("cb-c-function-extent&~A");

	private static final SubLString $$$Function_Extent = makeString("Function Extent");

	private static final SubLSymbol CB_LINK_FUNCTION_EXTENT = makeSymbol("CB-LINK-FUNCTION-EXTENT");

	private static final SubLList $list359 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE-STRING"), makeSymbol("MT-SPEC"), makeSymbol("DIRECTION-STRING"));

	private static final SubLString $str360$Could_not_determine_a_literal_sen = makeString("Could not determine a literal sense ~S");

	private static final SubLString $str361$Could_not_determine_a_direction_f = makeString("Could not determine a direction from ~S");

	private static final SubLString $str362$Predicate_rule_index_for__S = makeString("Predicate rule index for ~S");

	private static final SubLSymbol CB_C_PREDICATE_RULE = makeSymbol("CB-C-PREDICATE-RULE");

	private static final SubLString $str364$cb_c_predicate_rule__A = makeString("cb-c-predicate-rule&~A");

	private static final SubLString $str365$__s = makeString("&~s");

	private static final SubLString $$$Antecedent = makeString("Antecedent");

	private static final SubLString $$$Consequent = makeString("Consequent");

	private static final SubLString $$$All_Rules = makeString("All Rules");

	private static final SubLSymbol CB_LINK_PREDICATE_RULE = makeSymbol("CB-LINK-PREDICATE-RULE");

	private static final SubLList $list370 = list(makeKeyword("NEG"), makeKeyword("POS"));

	private static final SubLList $list371 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE-STRING"), makeSymbol("DIRECTION-STRING"));

	private static final SubLString $str372$ist_Predicate_rule_index_for__S = makeString("ist Predicate rule index for ~S");

	private static final SubLSymbol CB_C_DECONTEXTUALIZED_IST_PREDICATE_RULE = makeSymbol("CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE");

	private static final SubLString $str374$cb_c_decontextualized_ist_predica = makeString("cb-c-decontextualized-ist-predicate-rule&~A");

	private static final SubLString $$$All_Lifting_Rules = makeString("All Lifting Rules");

	private static final SubLSymbol CB_LINK_DECONTEXTUALIZED_IST_PREDICATE_RULE = makeSymbol("CB-LINK-DECONTEXTUALIZED-IST-PREDICATE-RULE");

	private static final SubLString $str377$isa_rule_index_for__S = makeString("isa rule index for ~S");

	private static final SubLSymbol CB_C_ISA_RULE = makeSymbol("CB-C-ISA-RULE");

	private static final SubLString $str379$cb_c_isa_rule__A = makeString("cb-c-isa-rule&~A");

	private static final SubLString $$$All_isa_Rules = makeString("All isa Rules");

	private static final SubLSymbol CB_LINK_ISA_RULE = makeSymbol("CB-LINK-ISA-RULE");

	private static final SubLString $$$isa = makeString("isa");

	private static final SubLString $str383$quoted_isa_rule_index_for__S = makeString("quoted isa rule index for ~S");

	private static final SubLSymbol CB_C_QUOTED_ISA_RULE = makeSymbol("CB-C-QUOTED-ISA-RULE");

	private static final SubLString $str385$cb_c_quoted_isa_rule__A = makeString("cb-c-quoted-isa-rule&~A");

	private static final SubLString $$$All_quoted_isa_Rules = makeString("All quoted isa Rules");

	private static final SubLSymbol CB_LINK_QUOTED_ISA_RULE = makeSymbol("CB-LINK-QUOTED-ISA-RULE");

	private static final SubLString $$$quoted_isa = makeString("quoted isa");

	private static final SubLString $str389$genls_rule_index_for__S = makeString("genls rule index for ~S");

	private static final SubLSymbol CB_C_GENLS_RULE = makeSymbol("CB-C-GENLS-RULE");

	private static final SubLString $str391$cb_c_genls_rule__A = makeString("cb-c-genls-rule&~A");

	private static final SubLString $$$All_genls_Rules = makeString("All genls Rules");

	private static final SubLSymbol CB_LINK_GENLS_RULE = makeSymbol("CB-LINK-GENLS-RULE");

	private static final SubLString $$$genls = makeString("genls");

	private static final SubLString $str395$genlMt_rule_index_for__S = makeString("genlMt rule index for ~S");

	private static final SubLSymbol CB_C_GENL_MT_RULE = makeSymbol("CB-C-GENL-MT-RULE");

	private static final SubLString $str397$cb_c_genl_mt_rule__A = makeString("cb-c-genl-mt-rule&~A");

	private static final SubLString $$$All_genlMt_Rules = makeString("All genlMt Rules");

	private static final SubLSymbol CB_LINK_GENL_MT_RULE = makeSymbol("CB-LINK-GENL-MT-RULE");

	private static final SubLString $$$genlMt = makeString("genlMt");

	private static final SubLList $list401 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT-SPEC"), makeSymbol("DIRECTION-STRING"));

	private static final SubLString $str402$Function_rule_index_for__S = makeString("Function rule index for ~S");

	private static final SubLSymbol CB_C_FUNCTION_RULE = makeSymbol("CB-C-FUNCTION-RULE");

	private static final SubLString $str404$cb_c_function_rule__A = makeString("cb-c-function-rule&~A");

	private static final SubLString $$$Function_Rules = makeString("Function Rules");

	private static final SubLSymbol CB_LINK_FUNCTION_RULE = makeSymbol("CB-LINK-FUNCTION-RULE");

	private static final SubLString $str407$_Rules__ = makeString(" Rules :");

	private static final SubLList $list408 = list(makeSymbol("&OPTIONAL"), makeSymbol("SENSE-STRING"), makeSymbol("MT-SPEC"), makeSymbol("DIRECTION-STRING"));

	private static final SubLString $str409$Could_not_determine_an_index_hook = makeString("Could not determine an index-hook");

	private static final SubLString $$$Unbound_rule_index = makeString("Unbound rule index");

	private static final SubLSymbol CB_C_UNBOUND_RULE = makeSymbol("CB-C-UNBOUND-RULE");

	private static final SubLString $str412$cb_c_unbound_rule = makeString("cb-c-unbound-rule");

	private static final SubLSymbol CB_LINK_UNBOUND_RULE = makeSymbol("CB-LINK-UNBOUND-RULE");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLString $$$Antecedent_Rules = makeString("Antecedent Rules");

	private static final SubLString $$$Consequent_Rules = makeString("Consequent Rules");

	private static final SubLString $str417$Direction___ = makeString("Direction : ");

	private static final SubLString $str418$MT_index_for__S = makeString("MT index for ~S");

	private static final SubLSymbol CB_C_IST = makeSymbol("CB-C-IST");

	private static final SubLString $str420$cb_c_ist__A = makeString("cb-c-ist&~A");

	private static final SubLString $$$Microtheory_Contents = makeString("Microtheory Contents");

	private static final SubLSymbol CB_LINK_IST = makeSymbol("CB-LINK-IST");

	private static final SubLString $str423$__expensive__ = makeString(" (expensive!)");

	private static final SubLSymbol CB_LINK_IST_BROAD = makeSymbol("CB-LINK-IST-BROAD");

	private static final SubLString $str425$Microtheory_Contents__ = makeString("Microtheory Contents :");

	private static final SubLString $str426$MT_GAFs_for__S = makeString("MT GAFs for ~S");

	private static final SubLSymbol CB_C_MT_GAFS = makeSymbol("CB-C-MT-GAFS");

	private static final SubLString $str428$cb_c_mt_gafs__A = makeString("cb-c-mt-gafs&~A");

	private static final SubLString $$$Microtheory_GAFs = makeString("Microtheory GAFs");

	private static final SubLString $str430$____ = makeString(" (?)");

	private static final SubLSymbol CB_LINK_MT_GAFS = makeSymbol("CB-LINK-MT-GAFS");

	private static final SubLString $str432$Microtheory_GAFs__ = makeString("Microtheory GAFs :");

	private static final SubLString $str436$do_broad_mt_index = makeString("do-broad-mt-index");

	private static final SubLSymbol $sym440$CB_TERM__ = makeSymbol("CB-TERM-<");

	private static final SubLSymbol $sym441$CB_PREDICATE__ = makeSymbol("CB-PREDICATE-<");

	private static final SubLString $str442$MT_Rules_for__S = makeString("MT Rules for ~S");

	private static final SubLSymbol CB_C_MT_RULES = makeSymbol("CB-C-MT-RULES");

	private static final SubLString $str444$cb_c_mt_rules__A = makeString("cb-c-mt-rules&~A");

	private static final SubLString $$$Microtheory_Rules = makeString("Microtheory Rules");

	private static final SubLSymbol CB_LINK_MT_RULES = makeSymbol("CB-LINK-MT-RULES");

	private static final SubLString $str447$Microtheory_Rules__ = makeString("Microtheory Rules :");

	private static final SubLString $str449$OTHER_index_for__S = makeString("OTHER index for ~S");

	private static final SubLSymbol CB_C_OTHER = makeSymbol("CB-C-OTHER");

	private static final SubLString $str451$cb_c_other__A = makeString("cb-c-other&~A");

	private static final SubLString $$$Miscellaneous = makeString("Miscellaneous");

	private static final SubLSymbol CB_LINK_OTHER = makeSymbol("CB-LINK-OTHER");

	private static final SubLString $str454$Miscellaneous_References__ = makeString("Miscellaneous References :");

	private static final SubLSymbol $CB_AUXILIARY_INDICES = makeKeyword("CB-AUXILIARY-INDICES");

	private static final SubLString $str459$cb_auxiliary_indices_html = makeString("cb-auxiliary-indices.html");

	private static final SubLString $$$Auxiliary_Indices = makeString("Auxiliary Indices");

	private static final SubLSymbol AUXILIARY_INDEX_NAME = makeSymbol("AUXILIARY-INDEX-NAME");

	private static final SubLString $str463$Choose_an_auxiliary_index___ = makeString("Choose an auxiliary index : ");

	private static final SubLString $str464$No_auxiliary_indexes_exist_ = makeString("No auxiliary indexes exist.");

	private static final SubLSymbol CB_AUXILIARY_INDICES = makeSymbol("CB-AUXILIARY-INDICES");

	private static final SubLString $$$Auxiliary_Index_List = makeString("Auxiliary Index List");

	private static final SubLString $str467$cb_auxiliary_indices = makeString("cb-auxiliary-indices");

	private static final SubLSymbol CB_LINK_AUXILIARY_INDICES = makeSymbol("CB-LINK-AUXILIARY-INDICES");

	private static final SubLString $str469$_S_did_not_specify_an_auxiliary_i = makeString("~S did not specify an auxiliary index.");

	private static final SubLString $str470$The_auxiliary_index__S_is_current = makeString("The auxiliary index ~S is currently empty.");

	private static final SubLString $str471$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

	private static final SubLString $str472$30___ = makeString("30%,*");

	private static final SubLSymbol CB_AUXILIARY_INDEX = makeSymbol("CB-AUXILIARY-INDEX");

	private static final SubLString $str475$cb_auxiliary_index__A = makeString("cb-auxiliary-index&~A");

	private static final SubLSymbol CB_LINK_AUXILIARY_INDEX = makeSymbol("CB-LINK-AUXILIARY-INDEX");

	private static final SubLInteger $int$25 = makeInteger(25);

	private static final SubLString $str478$Alphabetical_search_for___A_ = makeString("Alphabetical search for `~A'");

	private static final SubLSymbol CB_ALPHA = makeSymbol("CB-ALPHA");

	private static final SubLSymbol CB_AD = makeSymbol("CB-AD");

	private static final SubLString $str484$alpha_gif = makeString("alpha.gif");

	private static final SubLString $str485$_Alpha_ = makeString("[Alpha]");

	private static final SubLString $str486$_A = makeString("~A");

	private static final SubLString $str487$cb_ad__A = makeString("cb-ad|~A");

	private static final SubLSymbol CB_LINK_ALPHABETICAL = makeSymbol("CB-LINK-ALPHABETICAL");

	private static final SubLString $$$Alph = makeString("Alph");

	private static final SubLString $$$The_Alphabetical_Browser = makeString("The Alphabetical Browser");

	private static final SubLString $$$Top_of_Alphabetical_Index = makeString("Top of Alphabetical Index");

	private static final SubLSymbol CB_ALPHA_TOP = makeSymbol("CB-ALPHA-TOP");

	private static final SubLString $$$Top = makeString("Top");

	private static final SubLString $str496$cb_alpha_top = makeString("cb-alpha-top");

	private static final SubLSymbol CB_LINK_ALPHA_TOP = makeSymbol("CB-LINK-ALPHA-TOP");

	private static final SubLInteger $int$127 = makeInteger(127);

	private static final SubLString $$$Bottom_of_Alphabetical_Index = makeString("Bottom of Alphabetical Index");

	private static final SubLSymbol CB_ALPHA_BOTTOM = makeSymbol("CB-ALPHA-BOTTOM");

	private static final SubLString $$$Bottom = makeString("Bottom");

	private static final SubLString $str503$cb_alpha_bottom = makeString("cb-alpha-bottom");

	private static final SubLSymbol CB_LINK_ALPHA_BOTTOM = makeSymbol("CB-LINK-ALPHA-BOTTOM");

	private static final SubLSymbol CB_ALPHA_PAGEUP = makeSymbol("CB-ALPHA-PAGEUP");

	private static final SubLString $$$Page_Up = makeString("Page Up");

	private static final SubLString $str509$cb_alpha_pageup__A = makeString("cb-alpha-pageup|~A");

	private static final SubLSymbol CB_LINK_ALPHA_PAGEUP = makeSymbol("CB-LINK-ALPHA-PAGEUP");

	private static final SubLSymbol CB_ALPHA_PAGEDN = makeSymbol("CB-ALPHA-PAGEDN");

	private static final SubLString $$$Page_Down = makeString("Page Down");

	private static final SubLString $str515$cb_alpha_pagedn__A = makeString("cb-alpha-pagedn|~A");

	private static final SubLSymbol CB_LINK_ALPHA_PAGEDN = makeSymbol("CB-LINK-ALPHA-PAGEDN");

	private static final SubLString $$$Alphabetical_index_scroll = makeString("Alphabetical index scroll");

	private static final SubLString $$$ABCDEFGHIJKLMNOPQRSTUVWXYZ = makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

	private static final SubLString $$$abcdefghijklmnopqrstuvwxyz = makeString("abcdefghijklmnopqrstuvwxyz");

	private static final SubLSymbol $CB_ALPHA_INDEX = makeKeyword("CB-ALPHA-INDEX");

	private static final SubLString $str522$cb_alpha_index_html = makeString("cb-alpha-index.html");

	private static final SubLString $str523$_ = makeString("|");

	private static final SubLString $str525$_____ = makeString("---> ");

	private static final SubLString $str526$__A_ = makeString(" ~A ");

	private static final SubLString $str527$would_be_here_ = makeString("would be here.");

	private static final SubLString $str529$cb_c_graph__A = makeString("cb-c-graph&~A");

	private static final SubLSymbol CB_LINK_GRAPH = makeSymbol("CB-LINK-GRAPH");

	private static final SubLSymbol CB_C_GRAPH = makeSymbol("CB-C-GRAPH");

	private static final SubLString $str532$Assertion_Graph_for__S = makeString("Assertion Graph for ~S");

	private static final SubLString $$$_assertion_graph = makeString(" assertion graph");

	private static final SubLString $$$Script_Graph = makeString("Script Graph");

	private static final SubLString $$$Unknown_Graph = makeString("Unknown Graph");

	private static final SubLObject $$Situation = reader_make_constant_shell(makeString("Situation"));

	private static final SubLString $str537$_a = makeString("~a");

	private static final SubLInteger $int$30 = makeInteger(30);

	private static final SubLString $str539$Graphical_editing_of_this_script_ = makeString("Graphical editing of this script will not work until this term has a ");

	private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

	private static final SubLString $str541$_assertion_ = makeString(" assertion.");

	private static final SubLString $$$candidateProperSubSituationTypes = makeString("candidateProperSubSituationTypes");

	private static final SubLSymbol $sym543$_ARG2 = makeSymbol("?ARG2");

	private static final SubLObject $$candidateProperSubSituationTypes = reader_make_constant_shell(makeString("candidateProperSubSituationTypes"));

	private static final SubLString $str545$Note_that_since_no_scenes_were_fo = makeString("Note that since no scenes were found the editor will start blank.");

	private static final SubLString $str546$com_cyc_framework_ui_scriptEditor = makeString("com.cyc.framework.ui.scriptEditor.command.AddGraphScriptCommand");

	private static final SubLSymbol BBF_SCRIPT = makeSymbol("BBF-SCRIPT");

	private static final SubLString $str553$com_cyc_framework_ui_scriptEditor = makeString("com.cyc.framework.ui.scriptEditor.ScriptEditorApplet");

	private static final SubLString $str555$100_ = makeString("100%");

	private static final SubLString $str557$90_ = makeString("90%");

	private static final SubLString $str559$pertinent_queries = makeString("pertinent_queries");

	private static final SubLString $$$Troubleshooting = makeString("Troubleshooting");

	private static final SubLString $$$Java_Profile = makeString("Java Profile");

	private static final SubLString $str562$In_order_for_the_Grapher_applet_t = makeString("In order for the Grapher applet to contact the Cyc image, your java profile file needs to enable the following permissions:");

	private static final SubLString $str563$_grant_codeBase__http___localhost = makeString(
			"\ngrant codeBase \"http://localhost\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant codeBase \"http://127.0.0.1\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant codeBase \"http://$HOST\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant codeBase \"http://$HOSTNAME\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant {\n permission java.util.PropertyPermission \"*\", \"read\";\n permission java.util.logging.LoggingPermission \"control\";\n};");

	private static final SubLString $str564$On_Linux_systems_this_file_should = makeString("On Linux systems this file should be located at ");

	private static final SubLString $str565$_HOME__java_policy = makeString("$HOME/.java.policy");

	private static final SubLString $str566$____See_ = makeString(" .  See ");

	private static final SubLString $str567$http___download_oracle_com_javase = makeString("http://download.oracle.com/javase/1.3/docs/guide/security/PolicyFiles.html#DefaultLocs");

	private static final SubLString $$$the_Oracle_documentation = makeString("the Oracle documentation");

	private static final SubLString $str569$_for_other_OS_s_ = makeString(" for other OS's.");

	private static final SubLString $str570$It_worked_once_but_then_stopped_w = makeString("It worked once but then stopped working");

	private static final SubLString $str571$In_your_Java_console__clear_the_c = makeString("In your Java console, clear the classloader cache by hitting 'x'.  If that doesn't work you may need need to restart your browser.");

	private static final SubLString $str572$Pertinent_Queries___S_ = makeString("Pertinent Queries (~S)");

	private static final SubLSymbol $sym573$_EXIT = makeSymbol("%EXIT");

	private static final SubLSymbol $sym574$_QUERY = makeSymbol("?QUERY");

	private static final SubLObject $const575$queryHasVeryHighPertinenceForThin = reader_make_constant_shell(makeString("queryHasVeryHighPertinenceForThing"));

	private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

	private static final SubLList $list577 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));

	private static final SubLString $str579$cb_c_pertinent_query_term__A_quer = makeString("cb-c-pertinent-query&term=~A&query=~A");

	private static final SubLSymbol CB_LINK_PERTINENT_QUERY = makeSymbol("CB-LINK-PERTINENT-QUERY");

	private static final SubLString $$$query = makeString("query");

	private static final SubLSymbol CB_C_PERTINENT_QUERY = makeSymbol("CB-C-PERTINENT-QUERY");

	public static SubLObject cb_c_index(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str1$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			final SubLObject _prev_bind_0_$1 = dhtml_macros.$html_element_id$.currentBinding(thread);
			try {
				dhtml_macros.$html_element_id$.bind(ZERO_INTEGER, thread);
				dhtml_macros.basic_ajax_scripts();
				html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				dhtml_macros.dhtml_creation_scripts();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$1, thread);
			}
			final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
				html_macros.$html_inside_bodyP$.bind(T, thread);
				html_markup(html_macros.$html_body_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					cb_c_index_guts(index_hook);
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
				}
				html_markup(html_macros.$html_body_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_content_page_no_frames_index(final SubLObject index_hook) {
		if (NIL != index_hook) {
			return cb_c_index_guts(index_hook);
		}
		return cb_frames.cb_empty_index_frame();
	}

	public static SubLObject cb_c_index_guts(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_markup(html_macros.$html_big_head$.getGlobalValue());
			cb_link($AUXILIARY_INDEX, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_big_tail$.getGlobalValue());
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_help_preamble($CB_C_INDEX, $MAIN, UNPROVIDED);
		} else if (NIL != forts.fort_p(index_hook)) {
			cb_term_page_heading(index_hook, INDEX_BROWSER);
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_help_preamble($CB_C_INDEX, $MAIN, UNPROVIDED);
		}

		if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
			if (cb_relevant_num_all_assertions(index_hook).numG(ZERO_INTEGER) && ($CYCL == $cb_major_presentation_language$.getDynamicValue(thread))) {
				cb_c_el_hl_formulas_link(index_hook);
				html_hr(UNPROVIDED, UNPROVIDED);
			}
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($AUXILIARY_INDICES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		} else if (NIL != forts.fort_p(index_hook)) {
			cb_editor.cb_term_toolbar(index_hook);
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($DOCUMENTATION, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($DEFINITIONAL, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			cb_link($GRAPH, index_hook, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			if (NIL != nart_handles.nart_p(index_hook)) {
				cb_link($DESCRIBE_NART, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else if (NIL != constant_p(index_hook)) {
				cb_link($DESCRIBE_CONSTANT, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}

			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			thread.resetMultipleValues();
			final SubLObject lexical_assertions = (NIL != cb_tools.cb_fastP()) ? NIL : cb_lexical_info.cb_lexical_information(index_hook, NIL, $int$200);
			final SubLObject incompleteP = thread.secondMultipleValue();
			thread.resetMultipleValues();
			final SubLObject num_lexical = length(lexical_assertions);
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($LEXICAL, index_hook, num_lexical, NIL, incompleteP, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($CHRONOLOGICAL_ORDER, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_c_index_views(index_hook, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			if (NIL == cb_tools.cb_fastP()) {
				dhtml_macros.js_delayed_load_int(list(new SubLObject[] { $HANDLER, CB_C_PERTINENT_QUERY_LINKS, $ARGS, list(bq_cons($$$term, index_hook)), $MESSAGE, $str24$Checking_for_Pertinent_Queries___, $TAG, $$$div, $DELAY, $int$50 }));
			}
		}

		html_hr(UNPROVIDED, UNPROVIDED);
		if (NIL == auxiliary_indexing.auxiliary_index_p(index_hook)) {
			final SubLObject total_num = bookkeeping_store.total_num_assertions_on_term(index_hook);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($ALL_ASSERTED_KNOWLEDGE, index_hook, total_num, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			cb_c_index_other_assertions_guts(index_hook);
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($INFERRED_INDEX, index_hook, $$$Inferred_Index, $SELF, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_hr(UNPROVIDED, UNPROVIDED);
		}
		cb_c_index_kb_assertions_guts(index_hook);
		html_hr(UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_term_page_heading(final SubLObject v_term, SubLObject current_page) {
		if (current_page == UNPROVIDED) {
			current_page = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
		html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_markup(html_macros.$html_table_data_align$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($LEFT);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align($TOP));
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					if (NIL != constant_p(v_term)) {
						html_markup(html_macros.$html_strong_head$.getGlobalValue());
						cb_show_term(v_term, UNPROVIDED, UNPROVIDED);
						html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					} else {
						html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_markup(html_macros.$html_small_head$.getGlobalValue());
						html_markup(html_macros.$html_no_break_head$.getGlobalValue());
						cb_show_term(v_term, ZERO_INTEGER, T);
						html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
						html_markup(html_macros.$html_small_tail$.getGlobalValue());
						html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_markup(html_macros.$html_table_data_align$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($LEFT);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align($TOP));
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_markup(html_macros.$html_table_data_align$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($LEFT);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align($TOP));
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_head$.getGlobalValue());
					html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							SubLObject cdolist_list_var = $cb_term_page_adornments$.getGlobalValue();
							SubLObject adornment_symbol = NIL;
							adornment_symbol = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								final SubLObject adornment = cb_adornments.find_adornment(adornment_symbol);
								if (NIL != cb_adornments.adornment_p(adornment)) {
									if (adornment_symbol.eql(current_page)) {
										html_markup(html_macros.$html_table_data_head$.getGlobalValue());
										html_char(CHAR_greater, UNPROVIDED);
										final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
										try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_markup(html_macros.$html_table_head$.getGlobalValue());
											html_markup(html_macros.$html_table_border$.getGlobalValue());
											html_char(CHAR_quotation, UNPROVIDED);
											html_markup(ONE_INTEGER);
											html_char(CHAR_quotation, UNPROVIDED);
											html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
											html_char(CHAR_quotation, UNPROVIDED);
											html_markup(ONE_INTEGER);
											html_char(CHAR_quotation, UNPROVIDED);
											html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
											html_char(CHAR_quotation, UNPROVIDED);
											html_markup(ZERO_INTEGER);
											html_char(CHAR_quotation, UNPROVIDED);
											html_char(CHAR_greater, UNPROVIDED);
											final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_markup(html_macros.$html_table_row_head$.getGlobalValue());
												html_char(CHAR_greater, UNPROVIDED);
												final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
												try {
													html_macros.$html_safe_print$.bind(T, thread);
													html_markup(html_macros.$html_table_data_head$.getGlobalValue());
													html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
													html_char(CHAR_quotation, UNPROVIDED);
													html_markup($$$lightyellow);
													html_char(CHAR_quotation, UNPROVIDED);
													html_char(CHAR_greater, UNPROVIDED);
													final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
													try {
														html_macros.$html_safe_print$.bind(T, thread);
														cb_adornments.display_adornment(adornment, $MAIN, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
													} finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
													}
													html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
												} finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
												}
												html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
												html_source_readability_terpri(UNPROVIDED);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
											}
											html_markup(html_macros.$html_table_tail$.getGlobalValue());
										} finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
										}
										html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									} else if (NIL != cb_adornments.adorn_thingo_p(adornment, v_term, UNPROVIDED, UNPROVIDED)) {
										html_markup(html_macros.$html_table_data_head$.getGlobalValue());
										html_char(CHAR_greater, UNPROVIDED);
										final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
										try {
											html_macros.$html_safe_print$.bind(T, thread);
											cb_adornments.display_adornment(adornment, $MAIN, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
										} finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
										}
										html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									} else {
										html_markup(html_macros.$html_table_data_head$.getGlobalValue());
										html_char(CHAR_greater, UNPROVIDED);
										final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
										try {
											html_macros.$html_safe_print$.bind(T, thread);
											cb_adornments.display_adornment_disabled(adornment, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
										} finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
										}
										html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									}

									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_glyph($NBSP, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								}
								cdolist_list_var = cdolist_list_var.rest();
								adornment_symbol = cdolist_list_var.first();
							}
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
						}
						html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
					}
					html_markup(html_macros.$html_table_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_c_index_views(final SubLObject index_hook, SubLObject link_text) {
		if (link_text == UNPROVIDED) {
			link_text = $$$Viewpoint_Filters;
		}
		return NIL;
	}

	public static SubLObject cb_c_index_other_assertions_guts(final SubLObject index_hook) {
		cb_c_index_bookkeeping_assertions_guts(index_hook);
		return NIL;
	}

	public static SubLObject cb_c_index_bookkeeping_assertions_guts(final SubLObject index_hook) {
		final SubLObject count = bookkeeping_store.num_bookkeeping_binary_gafs_on_term(index_hook);
		if (count.isPositive()) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($BOOKKEEPING_ASSERTIONS, index_hook, count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_c_index_kb_assertions_guts(final SubLObject index_hook) {
		cb_link($CONSTANT_TOTAL, index_hook, cb_relevant_num_all_assertions(index_hook), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
			cb_c_index_auxiliary_index(index_hook);
		} else if (NIL != forts.fort_p(index_hook)) {
			cb_c_index_fort_index(index_hook);
		} else if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
			cb_naut_utilities.cb_c_index_naut_index(index_hook);
		}

		return NIL;
	}

	public static SubLObject cb_c_index_auxiliary_index(final SubLObject index_hook) {
		if (index_hook.eql(auxiliary_indexing.unbound_rule_index())) {
			cb_c_index_unbound_rules();
		} else {
			cb_error($str44$Unknown_auxiliary_index__a, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_fort_index(final SubLObject fort) {
		cb_c_index_gaf_args(fort);
		cb_show_term_index_besides_gaf_arg(fort);
		return NIL;
	}

	public static SubLObject cb_show_term_index_besides_gaf_arg(final SubLObject v_term) {
		cb_c_index_nart_args(v_term);
		if (NIL != fort_types_interface.predicate_in_any_mtP(v_term)) {
			cb_c_index_predicate_extent(v_term);
			cb_c_index_predicate_rules(v_term);
			cb_c_index_decontextualized_ist_predicate_rules(v_term);
		} else if (NIL != fort_types_interface.function_in_any_mtP(v_term)) {
			cb_c_index_function_extent(v_term);
			cb_c_index_function_rules(v_term);
		} else if (NIL != fort_types_interface.collection_in_any_mtP(v_term)) {
			cb_c_index_isa_rules(v_term);
			cb_c_index_quoted_isa_rules(v_term);
			cb_c_index_genls_rules(v_term);
		} else if (NIL != fort_types_interface.mt_in_any_mtP(v_term)) {
			cb_c_index_genl_mt_rules(v_term);
		}

		cb_c_index_other(v_term);
		if (NIL != fort_types_interface.mt_in_any_mtP(v_term)) {
			cb_c_index_mt(v_term);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_gaf_args(final SubLObject index_hook) {
		final SubLObject gaf_count = cb_relevant_num_gaf_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (gaf_count.numG(ZERO_INTEGER)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($GAF_ARG, index_hook, gaf_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			SubLObject cdolist_list_var;
			final SubLObject arg_list = cdolist_list_var = cb_relevant_key_gaf_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject arg = NIL;
			arg = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				cb_gaf_arg_index(index_hook, arg);
				cdolist_list_var = cdolist_list_var.rest();
				arg = cdolist_list_var.first();
			}
		}
		if (NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(index_hook)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($SKSI_EXTERNAL_GAF_ARGUMENT, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			sksi_external_gaf_argument_browser.display_sksi_supported_gaf_argument_positions_for_term(index_hook);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_gaf_arg_index(final SubLObject index_hook, final SubLObject arg) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_gaf_arg_index(index_hook, arg, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = cb_make_gaf_arg_pred_object_id(arg, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($GAF_ARG, index_hook, count, arg, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject preds = cb_relevant_key_gaf_arg_index(index_hook, arg, UNPROVIDED, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $VISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = preds;
				SubLObject pred = NIL;
				pred = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_gaf_arg_pred_index(index_hook, arg, pred);
					cdolist_list_var = cdolist_list_var.rest();
					pred = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_gaf_arg_pred_index(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_gaf_arg_index(index_hook, arg, pred, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject mts = cb_relevant_key_gaf_arg_index(index_hook, arg, pred, UNPROVIDED);
			final SubLObject dhtml_object_id = cb_make_gaf_arg_pred_object_id(arg, pred);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(TWO_INTEGER);
			if (length(mts).numLE(ONE_INTEGER)) {
				dhtml_macros.dhtml_switch_visibility_no_arrow();
			} else {
				dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			}
			cb_link($GAF_ARG, index_hook, count, arg, pred, UNPROVIDED);
			cb_adornments.handle_adornments($GAF_ARG_PREDICATE, $MAIN, index_hook, arg, pred, NIL);
			cb_adornments.handle_adornments($GAF_ARG_PREDICATE_CONTENT, $CONTENT, index_hook, arg, pred, NIL);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			if (!length(mts).numLE(ONE_INTEGER)) {
				dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
				html_markup(html_macros.$html_div_head$.getGlobalValue());
				if (NIL != dhtml_object_id) {
					html_markup(html_macros.$html_attribute_id$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(dhtml_object_id);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					SubLObject cdolist_list_var = mts;
					SubLObject mt = NIL;
					mt = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						cb_gaf_arg_pred_mt_index(index_hook, arg, pred, mt);
						cdolist_list_var = cdolist_list_var.rest();
						mt = cdolist_list_var.first();
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
				}
				html_markup(html_macros.$html_div_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject cb_make_gaf_arg_pred_object_id(final SubLObject arg, SubLObject pred) {
		if (pred == UNPROVIDED) {
			pred = NIL;
		}
		if (NIL != pred) {
			return cconcatenate(format_nil.format_nil_a_no_copy(cb_fort_identifier(pred)), new SubLObject[] { $str54$_arg_, format_nil.format_nil_a_no_copy(arg) });
		}
		return cconcatenate($str55$arg_, format_nil.format_nil_a_no_copy(arg));
	}

	public static SubLObject cb_gaf_arg_pred_mt_index(final SubLObject index_hook, final SubLObject arg, final SubLObject pred, final SubLObject mt) {
		final SubLObject count = cb_relevant_num_gaf_arg_index(index_hook, arg, pred, mt);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($GAF_ARG, index_hook, count, arg, pred, mt);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			cb_adornments.handle_adornments($GAF_ARG_PREDICATE, $MAIN, index_hook, arg, pred, mt);
			cb_adornments.handle_adornments($GAF_ARG_PREDICATE_CONTENT, $CONTENT, index_hook, arg, pred, mt);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_nart_args(final SubLObject index_hook) {
		final SubLObject nart_count = cb_relevant_num_nart_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (nart_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($NART_ARG, index_hook, nart_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			SubLObject cdolist_list_var;
			final SubLObject arg_list = cdolist_list_var = cb_relevant_key_nart_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject arg = NIL;
			arg = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				cb_nart_arg_index(index_hook, arg);
				cdolist_list_var = cdolist_list_var.rest();
				arg = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static SubLObject cb_nart_arg_index(final SubLObject index_hook, final SubLObject arg) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_nart_arg_index(index_hook, arg, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = cb_make_nart_arg_object_id(arg);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($NART_ARG, index_hook, count, arg, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject funcs = cb_relevant_key_nart_arg_index(index_hook, arg, UNPROVIDED, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = funcs;
				SubLObject func = NIL;
				func = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_nart_arg_func_index(index_hook, arg, func);
					cdolist_list_var = cdolist_list_var.rest();
					func = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_make_nart_arg_object_id(final SubLObject arg) {
		return format(NIL, $str57$nart_arg__A, arg);
	}

	public static SubLObject cb_nart_arg_func_index(final SubLObject index_hook, final SubLObject arg, final SubLObject func) {
		final SubLObject count = cb_relevant_num_nart_arg_index(index_hook, arg, func, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			cb_link($NART_ARG, index_hook, count, arg, func, UNPROVIDED);
			cb_adornments.handle_adornments($NART_ARG_FUNCTION, $MAIN, index_hook, arg, func, mt_vars.$tou_mt$.getGlobalValue());
			cb_adornments.handle_adornments($NART_ARG_FUNCTION_CONTENT, $CONTENT, index_hook, arg, func, mt_vars.$tou_mt$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_predicate_extent(final SubLObject predicate) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_predicate_extent_index(predicate, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			final SubLObject dhtml_object_id = $str60$pred_extent;
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($PREDICATE_EXTENT, predicate, count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject mts = cb_relevant_key_predicate_extent_index(predicate);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				if (NIL != mts.rest()) {
					SubLObject cdolist_list_var = mts;
					SubLObject mt = NIL;
					mt = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						cb_predicate_extent_mt_index(predicate, mt, count.numLE($int$12000000) ? NIL : T);
						cdolist_list_var = cdolist_list_var.rest();
						mt = cdolist_list_var.first();
					}
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		if (NIL != sksi_sks_predicate_indexing.sksi_supported_predicateP(predicate)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($SKSI_EXTERNAL_PREDICATE_EXTENT, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_predicate_extent_mt_index(final SubLObject predicate, final SubLObject mt, SubLObject should_bypass_countsP) {
		if (should_bypass_countsP == UNPROVIDED) {
			should_bypass_countsP = NIL;
		}
		final SubLObject count = (NIL != should_bypass_countsP) ? ONE_INTEGER : kb_indexing.num_predicate_extent_index(predicate, mt);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			cb_link($PREDICATE_EXTENT, predicate, count, mt, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_function_extent(final SubLObject function) {
		final SubLObject count = cb_relevant_num_function_extent_index(function, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($FUNCTION_EXTENT, function, count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_c_index_predicate_rules(final SubLObject predicate) {
		final SubLObject rule_count = cb_relevant_num_predicate_rule_index(predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($PREDICATE_RULE, predicate, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			cb_predicate_rule_index(predicate, $NEG);
			cb_predicate_rule_index(predicate, $POS);
		}
		return NIL;
	}

	public static SubLObject cb_predicate_rule_index(final SubLObject predicate, final SubLObject sense) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_predicate_rule_index(predicate, sense, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = format(NIL, $str68$pred_rule__A, sense);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($PREDICATE_RULE, predicate, count, sense, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject mts = cb_relevant_key_predicate_rule_index(predicate, sense, UNPROVIDED, UNPROVIDED);
			final SubLObject mts_count = length(mts);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = mts;
				SubLObject mt = NIL;
				mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_predicate_rule_mt_index(predicate, sense, mt, mts_count.numLE($int$12000000) ? NIL : T);
					cdolist_list_var = cdolist_list_var.rest();
					mt = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_predicate_rule_mt_index(final SubLObject predicate, final SubLObject sense, final SubLObject mt, SubLObject should_bypass_countsP) {
		if (should_bypass_countsP == UNPROVIDED) {
			should_bypass_countsP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = (NIL != should_bypass_countsP) ? ONE_INTEGER : cb_relevant_num_predicate_rule_index(predicate, sense, mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject directions = cb_relevant_key_predicate_rule_index(predicate, sense, mt, UNPROVIDED);
			final SubLObject dhtml_object_id = cb_make_predicate_rule_mt_id(predicate, sense, mt);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(TWO_INTEGER);
			if (length(directions).numLE(ONE_INTEGER)) {
				dhtml_macros.dhtml_switch_visibility_no_arrow();
			} else {
				dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			}
			cb_link($PREDICATE_RULE, predicate, count, sense, mt, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			if (NIL != directions.rest()) {
				dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
				html_markup(html_macros.$html_div_head$.getGlobalValue());
				if (NIL != dhtml_object_id) {
					html_markup(html_macros.$html_attribute_id$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(dhtml_object_id);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					SubLObject cdolist_list_var = directions;
					SubLObject direction = NIL;
					direction = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						cb_predicate_rule_mt_direction_index(predicate, sense, mt, direction, should_bypass_countsP);
						cdolist_list_var = cdolist_list_var.rest();
						direction = cdolist_list_var.first();
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
				}
				html_markup(html_macros.$html_div_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject cb_make_predicate_rule_mt_id(final SubLObject predicate, final SubLObject sense, final SubLObject mt) {
		return format(NIL, $str69$rule__A__A__A, new SubLObject[] { cb_fort_identifier(predicate), sense, cb_fort_identifier(mt) });
	}

	public static SubLObject cb_predicate_rule_mt_direction_index(final SubLObject predicate, final SubLObject sense, final SubLObject mt, final SubLObject direction, SubLObject should_bypass_countsP) {
		if (should_bypass_countsP == UNPROVIDED) {
			should_bypass_countsP = NIL;
		}
		final SubLObject count = (NIL != should_bypass_countsP) ? ONE_INTEGER : cb_relevant_num_predicate_rule_index(predicate, sense, mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($PREDICATE_RULE, predicate, count, sense, mt, direction);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_decontextualized_ist_predicate_rules(final SubLObject predicate) {
		final SubLObject rule_count = cb_relevant_num_decontextualized_ist_predicate_rule_index(predicate, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($DECONTEXTUALIZED_IST_PREDICATE_RULE, predicate, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			cb_decontextualized_ist_predicate_rule_index(predicate, $NEG);
			cb_decontextualized_ist_predicate_rule_index(predicate, $POS);
		}
		return NIL;
	}

	public static SubLObject cb_decontextualized_ist_predicate_rule_index(final SubLObject predicate, final SubLObject sense) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_decontextualized_ist_predicate_rule_index(predicate, sense, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = format(NIL, $str71$decontextualized_ist_pred_rule__A, sense);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($DECONTEXTUALIZED_IST_PREDICATE_RULE, predicate, count, sense, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject directions = cb_relevant_key_decontextualized_ist_predicate_rule_index(predicate, sense, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_decontextualized_ist_predicate_rule_direction_index(predicate, sense, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_decontextualized_ist_predicate_rule_direction_index(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_decontextualized_ist_predicate_rule_index(predicate, sense, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($DECONTEXTUALIZED_IST_PREDICATE_RULE, predicate, count, sense, direction, UNPROVIDED);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_isa_rules(final SubLObject collection) {
		final SubLObject rule_count = cb_relevant_num_isa_rule_index(collection, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($ISA_RULE, collection, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			cb_isa_rule_index(collection, $NEG);
			cb_isa_rule_index(collection, $POS);
		}
		return NIL;
	}

	public static SubLObject cb_isa_rule_index(final SubLObject collection, final SubLObject sense) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_isa_rule_index(collection, sense, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = format(NIL, $str73$isa_rule__A, sense);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($ISA_RULE, collection, count, sense, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject mts = cb_relevant_key_isa_rule_index(collection, sense, UNPROVIDED, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = mts;
				SubLObject mt = NIL;
				mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_isa_rule_mt_index(collection, sense, mt);
					cdolist_list_var = cdolist_list_var.rest();
					mt = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_isa_rule_mt_index(final SubLObject collection, final SubLObject sense, final SubLObject mt) {
		final SubLObject count = cb_relevant_num_isa_rule_index(collection, sense, mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			cb_link($ISA_RULE, collection, count, sense, mt, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject directions = cb_relevant_key_isa_rule_index(collection, sense, mt, UNPROVIDED);
			if (NIL != directions.rest()) {
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_isa_rule_mt_direction_index(collection, sense, mt, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject cb_isa_rule_mt_direction_index(final SubLObject collection, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_isa_rule_index(collection, sense, mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($ISA_RULE, collection, count, sense, mt, direction);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_quoted_isa_rules(final SubLObject collection) {
		final SubLObject rule_count = cb_relevant_num_quoted_isa_rule_index(collection, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($QUOTED_ISA_RULE, collection, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			cb_quoted_isa_rule_index(collection, $NEG);
			cb_quoted_isa_rule_index(collection, $POS);
		}
		return NIL;
	}

	public static SubLObject cb_quoted_isa_rule_index(final SubLObject collection, final SubLObject sense) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_quoted_isa_rule_index(collection, sense, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = format(NIL, $str75$quoted_isa_rule__A, sense);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($QUOTED_ISA_RULE, collection, count, sense, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject mts = cb_relevant_key_quoted_isa_rule_index(collection, sense, UNPROVIDED, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = mts;
				SubLObject mt = NIL;
				mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_quoted_isa_rule_mt_index(collection, sense, mt);
					cdolist_list_var = cdolist_list_var.rest();
					mt = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_quoted_isa_rule_mt_index(final SubLObject collection, final SubLObject sense, final SubLObject mt) {
		final SubLObject count = cb_relevant_num_quoted_isa_rule_index(collection, sense, mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			cb_link($QUOTED_ISA_RULE, collection, count, sense, mt, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject directions = cb_relevant_key_quoted_isa_rule_index(collection, sense, mt, UNPROVIDED);
			if (NIL != directions.rest()) {
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_quoted_isa_rule_mt_direction_index(collection, sense, mt, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject cb_quoted_isa_rule_mt_direction_index(final SubLObject collection, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_quoted_isa_rule_index(collection, sense, mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($QUOTED_ISA_RULE, collection, count, sense, mt, direction);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_genls_rules(final SubLObject collection) {
		final SubLObject rule_count = cb_relevant_num_genls_rule_index(collection, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($GENLS_RULE, collection, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			cb_genls_rule_index(collection, $NEG);
			cb_genls_rule_index(collection, $POS);
		}
		return NIL;
	}

	public static SubLObject cb_genls_rule_index(final SubLObject collection, final SubLObject sense) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_genls_rule_index(collection, sense, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = format(NIL, $str77$genl_rule__A, sense);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($GENLS_RULE, collection, count, sense, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject mts = cb_relevant_key_genls_rule_index(collection, sense, UNPROVIDED, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = mts;
				SubLObject mt = NIL;
				mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_genls_rule_mt_index(collection, sense, mt);
					cdolist_list_var = cdolist_list_var.rest();
					mt = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_genls_rule_mt_index(final SubLObject collection, final SubLObject sense, final SubLObject mt) {
		final SubLObject count = cb_relevant_num_genls_rule_index(collection, sense, mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			cb_link($GENLS_RULE, collection, count, sense, mt, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject directions = cb_relevant_key_genls_rule_index(collection, sense, mt, UNPROVIDED);
			if (NIL != directions.rest()) {
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_genls_rule_mt_direction_index(collection, sense, mt, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject cb_genls_rule_mt_direction_index(final SubLObject collection, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_genls_rule_index(collection, sense, mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($GENLS_RULE, collection, count, sense, mt, direction);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_genl_mt_rules(final SubLObject genl_mt) {
		final SubLObject rule_count = cb_relevant_num_genl_mt_rule_index(genl_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($GENL_MT_RULE, genl_mt, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			cb_genl_mt_rule_index(genl_mt, $NEG);
			cb_genl_mt_rule_index(genl_mt, $POS);
		}
		return NIL;
	}

	public static SubLObject cb_genl_mt_rule_index(final SubLObject genl_mt, final SubLObject sense) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = cb_relevant_num_genl_mt_rule_index(genl_mt, sense, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			final SubLObject dhtml_object_id = format(NIL, $str79$genl_mt_rule__A, sense);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			cb_link($GENL_MT_RULE, genl_mt, count, sense, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject mts = cb_relevant_key_genl_mt_rule_index(genl_mt, sense, UNPROVIDED, UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = mts;
				SubLObject mt = NIL;
				mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_genl_mt_rule_mt_index(genl_mt, sense, mt);
					cdolist_list_var = cdolist_list_var.rest();
					mt = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_genl_mt_rule_mt_index(final SubLObject genl_mt, final SubLObject sense, final SubLObject rule_mt) {
		final SubLObject count = cb_relevant_num_genl_mt_rule_index(genl_mt, sense, rule_mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			cb_link($GENL_MT_RULE, genl_mt, count, sense, rule_mt, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject directions = cb_relevant_key_genl_mt_rule_index(genl_mt, sense, rule_mt, UNPROVIDED);
			if (NIL != directions.rest()) {
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_genl_mt_rule_mt_direction_index(genl_mt, sense, rule_mt, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject cb_genl_mt_rule_mt_direction_index(final SubLObject genl_mt, final SubLObject sense, final SubLObject rule_mt, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_genl_mt_rule_index(genl_mt, sense, rule_mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(SIX_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($GENL_MT_RULE, genl_mt, count, sense, rule_mt, direction);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_index_function_rules(final SubLObject function) {
		final SubLObject rule_count = cb_relevant_num_function_rule_index(function, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($FUNCTION_RULE, function, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			SubLObject cdolist_list_var;
			final SubLObject mts = cdolist_list_var = cb_relevant_key_function_rule_index(function, UNPROVIDED, UNPROVIDED);
			SubLObject mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				cb_function_rule_mt_index(function, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static SubLObject cb_function_rule_mt_index(final SubLObject function, final SubLObject mt) {
		final SubLObject count = cb_relevant_num_function_rule_index(function, mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(TWO_INTEGER);
			cb_link($FUNCTION_RULE, function, count, mt, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			final SubLObject directions = cb_relevant_key_function_rule_index(function, mt, UNPROVIDED);
			if (NIL != directions.rest()) {
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_function_rule_mt_direction_index(function, mt, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject cb_function_rule_mt_direction_index(final SubLObject function, final SubLObject mt, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_function_rule_index(function, mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(THREE_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($FUNCTION_RULE, function, count, mt, direction, UNPROVIDED);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_c_index_unbound_rules() {
		final SubLObject rule_count = cb_relevant_num_unbound_rule_index(UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (rule_count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($UNBOUND_RULE, rule_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			cb_unbound_rule_index($NEG);
			cb_unbound_rule_index($POS);
		}
		return NIL;
	}

	public static SubLObject cb_unbound_rule_index(final SubLObject sense) {
		final SubLObject count = cb_relevant_num_unbound_rule_index(sense, UNPROVIDED, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(TWO_INTEGER);
			cb_link($UNBOUND_RULE, count, sense, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			SubLObject cdolist_list_var;
			final SubLObject mts = cdolist_list_var = cb_relevant_key_unbound_rule_index(sense, UNPROVIDED, UNPROVIDED);
			SubLObject mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				cb_unbound_rule_mt_index(sense, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static SubLObject cb_unbound_rule_mt_index(final SubLObject sense, final SubLObject mt) {
		final SubLObject count = cb_relevant_num_unbound_rule_index(sense, mt, UNPROVIDED);
		if (count.numG(ZERO_INTEGER)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(THREE_INTEGER);
			cb_link($UNBOUND_RULE, count, sense, mt, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			final SubLObject directions = cb_relevant_key_unbound_rule_index(sense, mt, UNPROVIDED);
			if (NIL != directions.rest()) {
				SubLObject cdolist_list_var = directions;
				SubLObject direction = NIL;
				direction = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_unbound_rule_mt_direction_index(sense, mt, direction);
					cdolist_list_var = cdolist_list_var.rest();
					direction = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject cb_unbound_rule_mt_direction_index(final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLObject count = cb_relevant_num_unbound_rule_index(sense, mt, direction);
		if (count.numG(ZERO_INTEGER)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(FOUR_INTEGER);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_link($UNBOUND_RULE, count, sense, mt, direction, UNPROVIDED);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_c_index_other(final SubLObject index_hook) {
		final SubLObject count = cb_relevant_num_other_index(index_hook);
		if (count.numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($OTHER, index_hook, count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_c_index_mt(final SubLObject index_hook) {
		if ((NIL != forts.fort_p(index_hook)) && (NIL != kb_indexing.broad_mtP(index_hook))) {
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			cb_link($IST_BROAD, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		} else {
			final SubLObject count = (NIL != hlmt.monad_mtP(index_hook)) ? cb_relevant_num_mt_index(index_hook) : cb_relevant_num_hlmt_index(index_hook);
			if (count.numG(ZERO_INTEGER)) {
				html_hr(UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				html_indent(ZERO_INTEGER);
				cb_link($IST, index_hook, count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
				html_newline(UNPROVIDED);
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				html_indent(TWO_INTEGER);
				cb_link($MT_GAFS, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
				html_newline(UNPROVIDED);
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				html_indent(TWO_INTEGER);
				cb_link($MT_RULES, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			}
			if (NIL != sksi_sks_mt_indexing.sksi_supported_mtP(index_hook)) {
				html_hr(UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				html_indent(ZERO_INTEGER);
				cb_link($SKSI_EXTERNAL_MT_CONTENTS, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			}
		}
		return NIL;
	}

	public static SubLObject cb_c_el_hl_formulas_link(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (!$cb_c_formula_display_exception_index_hook$.getDynamicValue(thread).eql(index_hook)) {
			$cb_c_formula_display_exception_index_hook$.setDynamicValue(NIL, thread);
		}
		html_indent(UNPROVIDED);
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		if (NIL != cb_c_show_el_formulas_for_index_hookP(index_hook)) {
			cb_link($HL_FORMULAS_FOR_INDEX_HOOK, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} else {
			cb_link($EL_FORMULAS_FOR_INDEX_HOOK, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_c_show_el_formulas_for_index_hookP(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != assertion_handles.assertion_p(index_hook)) {
			return NIL;
		}
		final SubLObject pcase_var = $cb_c_assertion_formulas_display$.getDynamicValue(thread);
		if (pcase_var.eql($HL_FORMULAS)) {
			return cb_c_assertion_formula_display_exceptionP(index_hook);
		}
		if (pcase_var.eql($EL_FORMULAS)) {
			return makeBoolean(NIL == cb_c_assertion_formula_display_exceptionP(index_hook));
		}
		if (pcase_var.eql($EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS)) {
			return NIL != term.fast_reified_skolemP(index_hook) ? cb_c_assertion_formula_display_exceptionP(index_hook) : makeBoolean(NIL == cb_c_assertion_formula_display_exceptionP(index_hook));
		}
		return NIL;
	}

	public static SubLObject cb_c_assertion_formula_display_exceptionP(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return eql($cb_c_formula_display_exception_index_hook$.getDynamicValue(thread), index_hook);
	}

	public static SubLObject cb_show_el_formulas_for_hookP(final SubLObject hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != cb_index_hook_p(hook)) {
			return cb_c_show_el_formulas_for_index_hookP(hook);
		}
		if (NIL != term.closed_nautP(hook, UNPROVIDED)) {
			return cb_c_show_el_formulas_for_index_hookP(hook);
		}
		if (hook == $HISTORY) {
			return $cb_history_show_el_formulasP$.getDynamicValue(thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_el(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			SubLObject index_hook = cb_guess_index(index_spec);
			if (NIL == cb_index_hook_p(index_hook)) {
				index_hook = cb_guess_naut_spec(index_spec);
			}
			if (NIL == index_hook) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject pcase_var = $cb_c_assertion_formulas_display$.getDynamicValue(thread);
			if (pcase_var.eql($HL_FORMULAS)) {
				$cb_c_formula_display_exception_index_hook$.setDynamicValue(index_hook, thread);
			} else if (pcase_var.eql($EL_FORMULAS)) {
				$cb_c_formula_display_exception_index_hook$.setDynamicValue(NIL, thread);
			} else if (pcase_var.eql($EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS)) {
				$cb_c_formula_display_exception_index_hook$.setDynamicValue(NIL != term.fast_reified_skolemP(index_hook) ? index_hook : NIL, thread);
			}

			if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
				cb_auxiliary_index(list(cconcatenate($str96$_, Strings.string(index_hook))));
			} else if (NIL != forts.fort_p(index_hook)) {
				cb_frames.cb_term_frame_internal(index_hook);
			} else if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
				cb_frames.cb_term_frame_internal(index_hook);
			}

		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_el_formulas_for_index_hook(final SubLObject index_hook, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $str99$_EL_Formulas_;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		if (NIL != cb_index_hook_p(index_hook)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str100$cb_c_el__A, cb_index_identifier(index_hook));
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return index_hook;
	}

	public static SubLObject cb_c_hl(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			SubLObject index_hook = cb_guess_index(index_spec);
			if (NIL == cb_index_hook_p(index_hook)) {
				index_hook = cb_guess_naut_spec(index_spec);
			}
			if (NIL == index_hook) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject pcase_var = $cb_c_assertion_formulas_display$.getDynamicValue(thread);
			if (pcase_var.eql($HL_FORMULAS)) {
				$cb_c_formula_display_exception_index_hook$.setDynamicValue(NIL, thread);
			} else if (pcase_var.eql($EL_FORMULAS)) {
				$cb_c_formula_display_exception_index_hook$.setDynamicValue(index_hook, thread);
			} else if (pcase_var.eql($EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS)) {
				$cb_c_formula_display_exception_index_hook$.setDynamicValue(NIL != term.fast_reified_skolemP(index_hook) ? NIL : index_hook, thread);
			}

			if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
				cb_auxiliary_index(list(cconcatenate($str96$_, Strings.string(index_hook))));
			} else if (NIL != forts.fort_p(index_hook)) {
				cb_frames.cb_term_frame_internal(index_hook);
			} else if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
				cb_frames.cb_term_frame_internal(index_hook);
			}

		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_hl_formulas_for_index_hook(final SubLObject index_hook, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $str103$_HL_Formulas_;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		if (NIL != cb_index_hook_p(index_hook)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str104$cb_c_hl__A, cb_index_identifier(index_hook));
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return index_hook;
	}

	public static SubLObject cb_c_documentation(final SubLObject args) {
		if (NIL != forts.fort_p(args)) {
			SubLObject fort_spec = NIL;
			destructuring_bind_must_consp(args, args, $list106);
			fort_spec = args.first();
			final SubLObject current = args.rest();
			if (NIL == current) {
				final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
				if (NIL == forts.fort_p(fort)) {
					return cb_error($str107$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				cb_c_documentation_internal(fort);
			} else {
				cdestructuring_bind_error(args, $list106);
			}
		} else {
			cb_c_documentation_internal(cb_guess_term(args, UNPROVIDED));
		}
		return NIL;
	}

	public static SubLObject cb_link_documentation(final SubLObject v_term, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Documentation;
		}
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str110$cb_c_documentation__A, cb_term_identifier(v_term));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return v_term;
	}

	public static SubLObject clear_cb_documentation_predicate_p() {
		final SubLObject cs = $cb_documentation_predicate_p_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_cb_documentation_predicate_p(final SubLObject obj) {
		return memoization_state.caching_state_remove_function_results_with_args($cb_documentation_predicate_p_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cb_documentation_predicate_p_internal(final SubLObject obj) {
		return kb_accessors.documentation_predicate_in_any_mt_p(obj);
	}

	public static SubLObject cb_documentation_predicate_p(final SubLObject obj) {
		SubLObject caching_state = $cb_documentation_predicate_p_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(CB_DOCUMENTATION_PREDICATE_P, $cb_documentation_predicate_p_caching_state$, $int$64, EQL, ONE_INTEGER, TWENTY_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(cb_documentation_predicate_p_internal(obj)));
			memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject cb_print_documentation_information(final SubLObject fort, SubLObject terse) {
		if (terse == UNPROVIDED) {
			terse = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_markup(html_macros.$html_font_head$.getGlobalValue());
		html_markup(html_macros.$html_font_size$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(FIVE_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			cb_show_term(fort, UNPROVIDED, UNPROVIDED);
			html_princ($str117$_documentation__);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_font_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(TWO_INTEGER);
		if (NIL == terse) {
			if (NIL != cb_c_bookkeeping_info(fort)) {
				html_newline(UNPROVIDED);
			}
			if (NIL != constant_completion.constant_mentioned_in_codeP(fort)) {
				final SubLObject color_val = $RED;
				html_markup(html_macros.$html_font_head$.getGlobalValue());
				if (NIL != color_val) {
					html_markup(html_macros.$html_font_color$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_color(color_val));
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					cb_show_term(fort, UNPROVIDED, UNPROVIDED);
					html_princ($str119$_is_mentioned_in_code_);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
				}
				html_markup(html_macros.$html_font_tail$.getGlobalValue());
				html_newline(UNPROVIDED);
			}
			display_semantic_web_uris(fort);
			display_external_links(fort);
			display_kb_subsets(fort);
		}
		cb_c_documentation_internal_guts(fort);
		if (NIL == cb_tools.cb_fastP()) {
			dhtml_macros.js_delayed_load_int(list(new SubLObject[] { $HANDLER, CB_SUMMARY_SENTENCE, $ARGS, list(bq_cons($$$term, fort)), $MESSAGE, $str121$Getting_summary_sentence___, $TAG, $$$span, $DELAY, $int$50 }));
		}
		return NIL;
	}

	public static SubLObject display_semantic_web_uris(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject dhtml_object_id = $str123$semantic_web_uris;
		html_newline(UNPROVIDED);
		dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
		html_princ_strong($$$Semantic_Web_URIs);
		dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
		html_markup(html_macros.$html_div_head$.getGlobalValue());
		if (NIL != dhtml_object_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(dhtml_object_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = $semantic_web_uri_data$.getGlobalValue();
				SubLObject cons = NIL;
				cons = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject current;
					final SubLObject datum = current = cons;
					SubLObject label = NIL;
					SubLObject method = NIL;
					destructuring_bind_must_consp(current, datum, $list125);
					label = current.first();
					current = method = current.rest();
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ(label);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($CENTER));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ($str128$___);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						final SubLObject owl_uri = funcall(method, fort);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($LEFT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(owl_uri);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_princ(owl_uri);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					cdolist_list_var = cdolist_list_var.rest();
					cons = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_div_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return fort;
	}

	public static SubLObject display_external_links(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject data = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
		if (NIL != valid_constantP($const129$GetPredsAndMetaDataForExternalDoc, UNPROVIDED)) {
			SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq($const129$GetPredsAndMetaDataForExternalDoc, UNPROVIDED, UNPROVIDED);
			SubLObject v_bindings = NIL;
			v_bindings = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject docs_mt = bindings.variable_lookup($sym130$_MT, v_bindings);
				final SubLObject docs_pred = bindings.variable_lookup($sym131$_PRED, v_bindings);
				final SubLObject display_string = bindings.variable_lookup($sym132$_DISPLAY_STRING, v_bindings);
				final SubLObject query_spec = $$GetURLsFromExternalURLPred;
				final SubLObject raw_sentence = kb_query.kbq_sentence($$GetURLsFromExternalURLPred);
				final SubLObject sentence = cycl_utilities.expression_subst(fort, $list134, cycl_utilities.expression_subst(docs_pred, $list135, cycl_utilities.expression_subst(docs_mt, $list136, raw_sentence, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
				final SubLObject query_mt = kb_query.kbq_mt(query_spec);
				SubLObject cdolist_list_var_$25 = inference_kernel.new_cyc_query(sentence, query_mt, kb_query.kbq_query_properties(query_spec));
				SubLObject url_bindings = NIL;
				url_bindings = cdolist_list_var_$25.first();
				while (NIL != cdolist_list_var_$25) {
					if (NIL != list_utilities.singletonP(url_bindings)) {
						dictionary_utilities.dictionary_pushnew(data, display_string, bindings.variable_binding_value(list_utilities.only_one(url_bindings)), symbol_function(EQUAL), UNPROVIDED);
					}
					cdolist_list_var_$25 = cdolist_list_var_$25.rest();
					url_bindings = cdolist_list_var_$25.first();
				}
				cdolist_list_var = cdolist_list_var.rest();
				v_bindings = cdolist_list_var.first();
			}
		}
		if (NIL == dictionary.dictionary_empty_p(data)) {
			final SubLObject dhtml_object_id = $str137$external_links;
			html_newline(UNPROVIDED);
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			html_princ_strong($$$External_Links);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					SubLObject iteration_state;
					for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(data)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
						thread.resetMultipleValues();
						final SubLObject display_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						final SubLObject urls = thread.secondMultipleValue();
						thread.resetMultipleValues();
						html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_indent(THREE_INTEGER);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($RIGHT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_princ(display_string);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($CENTER));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_princ($str128$___);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								SubLObject list_var = NIL;
								SubLObject url = NIL;
								SubLObject i = NIL;
								list_var = urls;
								url = list_var.first();
								for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), url = list_var.first(), i = add(ONE_INTEGER, i)) {
									if (!i.eql(ZERO_INTEGER)) {
										html_newline(UNPROVIDED);
									}
									html_markup(html_macros.$html_anchor_head$.getGlobalValue());
									html_markup(html_macros.$html_anchor_href$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(url);
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_princ(web_utilities.html_url_decode(url));
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
									}
									html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
								}
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
						}
						html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					}
					dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
				}
				html_markup(html_macros.$html_table_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return fort;
	}

	public static SubLObject display_kb_subsets(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject kb_subset_cols = all_kb_subset_collections(fort);
		if (NIL != kb_subset_cols) {
			html_newline(UNPROVIDED);
			kb_subset_cols = Sort.sort(kb_subset_cols, symbol_function($sym139$_), symbol_function(QUOTED_INSTANCE_CARDINALITY));
			final SubLObject dhtml_object_id = $str141$kb_subsets;
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			html_princ_strong($$$Relevant_KB_Subsets);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = kb_subset_cols;
				SubLObject kb_subset_col = NIL;
				kb_subset_col = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject assertions = kb_indexing.find_all_gafs(list($$quotedIsa, fort, kb_subset_col));
					html_indent(ONE_INTEGER);
					if (NIL != assertions) {
						SubLObject cdolist_list_var_$33 = assertions;
						SubLObject assertion = NIL;
						assertion = cdolist_list_var_$33.first();
						while (NIL != cdolist_list_var_$33) {
							cb_assertion_link_binary(assertion, T);
							cdolist_list_var_$33 = cdolist_list_var_$33.rest();
							assertion = cdolist_list_var_$33.first();
						}
					} else {
						cb_show_term(kb_subset_col, UNPROVIDED, UNPROVIDED);
					}
					cdolist_list_var = cdolist_list_var.rest();
					kb_subset_col = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return fort;
	}

	public static SubLObject cb_summary_sentence(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject fort = cb_guess_term(html_extract_input($$$term, args), UNPROVIDED);
		final SubLObject summary_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(fort, pph_vars.$pph_domain_mt$.getDynamicValue(thread), TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
		if (NIL != summary_sentences) {
			html_newline(ONE_INTEGER);
			html_markup(html_macros.$html_bold_head$.getGlobalValue());
			html_princ($$$Summary_of_);
			cb_show_term(fort, UNPROVIDED, UNPROVIDED);
			html_princ($str96$_);
			html_indent(TWO_INTEGER);
			html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
			final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
			final SubLObject _prev_bind_4 = pph_vars.$pph_use_bulleted_lists_min_level$.currentBinding(thread);
			try {
				pph_vars.$constant_link_function$.bind(CB_CF, thread);
				pph_vars.$html_generation_target$.bind(NIL != html_macros.$html_parent_target$.getGlobalValue() ? html_macros.$html_parent_target$.getGlobalValue() : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
				pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
				pph_vars.$pph_use_bulleted_lists_min_level$.bind(ZERO_INTEGER, thread);
				html_markup(rkf_concept_communicator.rkf_html_summary_sentence(fort, summary_sentences, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread)));
			} finally {
				pph_vars.$pph_use_bulleted_lists_min_level$.rebind(_prev_bind_4, thread);
				pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
				pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
				pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
			}
		}
		return NIL;
	}

	public static SubLObject all_kb_subset_collections(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject collections = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			collections = isa.all_quoted_isas_wrt(fort, $$CycKBSubsetCollection, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		collections = Sort.sort(collections, symbol_function($sym149$GENERALITY_ESTIMATE_), UNPROVIDED);
		return collections;
	}

	public static SubLObject cb_c_bookkeeping_info(final SubLObject fort) {
		if (NIL != forts.fort_p(fort)) {
			final SubLObject creator = bookkeeping_store.creator(fort, UNPROVIDED);
			final SubLObject creation_time = bookkeeping_store.creation_time(fort, UNPROVIDED);
			final SubLObject creation_purpose = bookkeeping_store.creation_purpose(fort, UNPROVIDED);
			final SubLObject creation_second = bookkeeping_store.creation_second(fort, UNPROVIDED);
			if ((((NIL != creator) || (NIL != creation_time)) || (NIL != creation_second)) || (NIL != creation_purpose)) {
				html_princ($$$Created);
				if (NIL != creator) {
					html_princ($$$_by_);
					cb_show_cyclist(creator);
				}
				if (NIL != creation_time) {
					html_princ($$$_on_);
					cb_show_date(creation_time);
				}
				if (NIL != creation_second) {
					html_princ($$$_at_);
					cb_show_second(creation_second);
				}
				if (NIL != creation_purpose) {
					html_princ($$$_for_);
					cb_show_term(creation_purpose, UNPROVIDED, UNPROVIDED);
				}
				return T;
			}
		}
		return NIL;
	}

	public static SubLObject cb_c_bookkeeping_gafs(final SubLObject fort) {
		if (NIL != forts.fort_p(fort)) {
			final SubLObject creator = bookkeeping_store.creator(fort, UNPROVIDED);
			final SubLObject creation_time = bookkeeping_store.creation_time(fort, UNPROVIDED);
			final SubLObject creation_purpose = bookkeeping_store.creation_purpose(fort, UNPROVIDED);
			final SubLObject creation_second = bookkeeping_store.creation_second(fort, UNPROVIDED);
			if ((((NIL != creator) || (NIL != creation_time)) || (NIL != creation_second)) || (NIL != creation_purpose)) {
				cb_c_bookkeeping_header();
				if (NIL != creator) {
					cb_display_bookkeeping_gaf($$myCreator, fort, creator);
					html_newline(UNPROVIDED);
				}
				if (NIL != creation_purpose) {
					cb_display_bookkeeping_gaf($$myCreationPurpose, fort, creation_purpose);
					html_newline(UNPROVIDED);
				}
				if (NIL != creation_time) {
					cb_display_bookkeeping_gaf($$myCreationTime, fort, creation_time);
					html_newline(UNPROVIDED);
				}
				if (NIL != creation_second) {
					cb_display_bookkeeping_gaf($$myCreationSecond, fort, creation_second);
					html_newline(UNPROVIDED);
				}
				return T;
			}
		}
		return NIL;
	}

	public static SubLObject cb_display_bookkeeping_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
		final SubLObject asent = make_binary_formula(pred, arg1, arg2);
		cb_sentence_browser.cb_show_sentence_readably(asent, $$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_bookkeeping_header() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
			html_princ($str160$___);
		}
		format(html_macros.$html_stream$.getDynamicValue(thread), $str161$Bookkeeping_Assertions___);
		html_newline(TWO_INTEGER);
		return NIL;
	}

	public static SubLObject cb_c_documentation_internal(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject title_var;
		final SubLObject title = title_var = format(NIL, $str162$Documentation_for__S, v_term);
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$34 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				dhtml_macros.html_basic_cb_scripts();
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$35 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($str168$reloadCurrentFrame__reloadFrameBu);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						final SubLObject _prev_bind_0_$38 = dhtml_macros.$html_element_id$.currentBinding(thread);
						try {
							dhtml_macros.$html_element_id$.bind(ZERO_INTEGER, thread);
							dhtml_macros.basic_ajax_scripts();
							html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
							final SubLObject _prev_bind_0_$39 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
							try {
								pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
								thread.resetMultipleValues();
								final SubLObject _prev_bind_0_$40 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
								try {
									pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
									final SubLObject reuseP = thread.secondMultipleValue();
									thread.resetMultipleValues();
									try {
										thread.resetMultipleValues();
										final SubLObject _prev_bind_0_$41 = pph_macros.$pph_memoization_state$.currentBinding(thread);
										try {
											pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
											final SubLObject new_or_reused = thread.secondMultipleValue();
											thread.resetMultipleValues();
											final SubLObject _prev_bind_0_$42 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
											try {
												pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
												final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
												final SubLObject _prev_bind_0_$43 = memoization_state.$memoization_state$.currentBinding(thread);
												try {
													memoization_state.$memoization_state$.bind(local_state, thread);
													final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
													try {
														final SubLObject _prev_bind_0_$44 = pph_vars.$pph_language_mt$.currentBinding(thread);
														final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
														try {
															pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
															pph_vars.$paraphrase_mode$.bind($HTML, thread);
															if (NIL != forts.fort_p(v_term)) {
																cb_print_documentation_information(v_term, UNPROVIDED);
															} else if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
																cb_naut_utilities.cb_print_documentation_information_naut(v_term);
															} else {
																Errors.warn($str170$Bad_type_of_term__A__, v_term);
															}

														} finally {
															pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
															pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$44, thread);
														}
													} finally {
														final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															final SubLObject _values = getValuesAsVector();
															memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
															restoreValuesFromVector(_values);
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
														}
													}
												} finally {
													memoization_state.$memoization_state$.rebind(_prev_bind_0_$43, thread);
												}
											} finally {
												pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$42, thread);
											}
											if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
												memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
											}
										} finally {
											pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$41, thread);
										}
									} finally {
										final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											final SubLObject _values2 = getValuesAsVector();
											if (NIL == reuseP) {
												pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
											}
											restoreValuesFromVector(_values2);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
										}
									}
								} finally {
									pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$40, thread);
								}
							} finally {
								pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$39, thread);
							}
						} finally {
							dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$38, thread);
						}
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$35, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$34, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_documentation_internal_guts(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $cb_c_gaf_arg_last_mt$.currentBinding(thread);
		try {
			$cb_c_gaf_arg_last_mt$.bind(NIL, thread);
			SubLObject current_mt = NIL;
			SubLObject relevant_doc_preds = NIL;
			SubLObject cdolist_list_var = kb_indexing.key_gaf_arg_index(fort, ONE_INTEGER, UNPROVIDED);
			SubLObject pred = NIL;
			pred = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != cb_documentation_predicate_p(pred)) {
					relevant_doc_preds = cons(pred, relevant_doc_preds);
				}
				cdolist_list_var = cdolist_list_var.rest();
				pred = cdolist_list_var.first();
			}
			relevant_doc_preds = cb_sort_preds_for_display(fort, relevant_doc_preds, UNPROVIDED);
			html_newline(TWO_INTEGER);
			if (NIL != relevant_doc_preds) {
				cdolist_list_var = relevant_doc_preds;
				pred = NIL;
				pred = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject documentation_assertions = NIL;
					final SubLObject _prev_bind_0_$47 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						documentation_assertions = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$47, thread);
					}
					if (NIL != documentation_assertions) {
						SubLObject cdolist_list_var_$48 = documentation_assertions;
						SubLObject documentation_assertion = NIL;
						documentation_assertion = cdolist_list_var_$48.first();
						while (NIL != cdolist_list_var_$48) {
							current_mt = cb_c_documentation_assertion(documentation_assertion, current_mt, UNPROVIDED);
							if (pred.eql($$sharedNotes)) {
								final SubLObject note_fort = assertions_high.gaf_arg2(documentation_assertion);
								SubLObject shared_comments = NIL;
								SubLObject cdolist_list_var_$49 = kb_indexing.key_gaf_arg_index(note_fort, ONE_INTEGER, UNPROVIDED);
								SubLObject pred2 = NIL;
								pred2 = cdolist_list_var_$49.first();
								while (NIL != cdolist_list_var_$49) {
									if (NIL != cb_documentation_predicate_p(pred2)) {
										final SubLObject _prev_bind_0_$48 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
										final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
										try {
											mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
											mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
											shared_comments = kb_mapping.gather_gaf_arg_index(note_fort, ONE_INTEGER, pred2, UNPROVIDED, UNPROVIDED);
										} finally {
											mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
											mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$48, thread);
										}
										if (NIL != shared_comments) {
											SubLObject cdolist_list_var_$50 = shared_comments;
											SubLObject shared_comment = NIL;
											shared_comment = cdolist_list_var_$50.first();
											while (NIL != cdolist_list_var_$50) {
												current_mt = cb_c_documentation_assertion(shared_comment, current_mt, NIL);
												cdolist_list_var_$50 = cdolist_list_var_$50.rest();
												shared_comment = cdolist_list_var_$50.first();
											}
										}
									}
									cdolist_list_var_$49 = cdolist_list_var_$49.rest();
									pred2 = cdolist_list_var_$49.first();
								}
							}
							html_newline(UNPROVIDED);
							cdolist_list_var_$48 = cdolist_list_var_$48.rest();
							documentation_assertion = cdolist_list_var_$48.first();
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					pred = cdolist_list_var.first();
				}
			} else {
				html_markup(html_macros.$html_strong_head$.getGlobalValue());
				html_princ($$$No_documentation_assertions_for_);
				cb_show_term(fort, UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
				html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			}
		} finally {
			$cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_documentation_assertion(final SubLObject assertion, SubLObject current_mt, SubLObject abbreviateP) {
		if (current_mt == UNPROVIDED) {
			current_mt = NIL;
		}
		if (abbreviateP == UNPROVIDED) {
			abbreviateP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
		final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
		if (NIL == hlmt.hlmt_equal(assertion_mt, current_mt)) {
			html_markup(html_macros.$html_bold_head$.getGlobalValue());
			if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
				html_princ($str175$In_Mt___);
			} else {
				html_princ($str176$Mt___);
			}
			cb_show_term(assertion_mt, UNPROVIDED, UNPROVIDED);
			if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
				html_princ($str177$__);
			}
			html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		if ((NIL != abbreviateP) && (NIL != kb_accessors.binary_predicateP(assertions_high.gaf_arg0(assertion)))) {
			cb_show_term(assertions_high.gaf_arg0(assertion), UNPROVIDED, UNPROVIDED);
			html_princ($str128$___);
			cb_assertion_link_binary(assertion, T);
		} else {
			cb_form(assertion, UNPROVIDED, UNPROVIDED);
		}
		html_newline(UNPROVIDED);
		return assertion_mt;
	}

	public static SubLObject cb_c_documentation_string(final SubLObject string) {
		cb_show_term(string, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_definitional(final SubLObject args) {
		SubLObject term_spec = NIL;
		destructuring_bind_must_consp(args, args, $list178);
		term_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject v_term = cb_guess_term(term_spec, UNPROVIDED);
			if (NIL != forts.fort_p(v_term)) {
				cb_c_definitional_internal(v_term);
			} else {
				if (NIL == term.closed_nautP(v_term, UNPROVIDED)) {
					return cb_error($str107$Could_not_determine_a_term_from__, term_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				cb_naut_utilities.cb_c_definitional_internal_naut(v_term);
			}
		} else {
			cdestructuring_bind_error(args, $list178);
		}
		return NIL;
	}

	public static SubLObject cb_link_definitional(final SubLObject v_term, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Definitional_Info;
		}
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str181$cb_c_definitional__A, cb_term_identifier(v_term));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return v_term;
	}

	public static SubLObject cb_c_definitional_internal(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ($INFERRED == cb_frames.$cb_default_index_view$.getDynamicValue(thread)) {
			return cb_inferred_index.cb_inferred_index_definitional_information(fort);
		}
		cb_possibly_show_followup_widget(fort);
		final SubLObject title_var;
		final SubLObject title = title_var = format(NIL, $str184$Definitional_info_for__S, fort);
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$52 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				dhtml_macros.html_basic_cb_scripts();
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($str168$reloadCurrentFrame__reloadFrameBu);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						cb_print_definitional_information(fort);
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$52, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_possibly_show_followup_widget(final SubLObject fort) {
		return NIL;
	}

	public static SubLObject cb_print_definitional_information(final SubLObject fort) {
		cb_c_term_header(fort);
		html_newline(TWO_INTEGER);
		cb_c_definitional_internal_guts_fort(fort);
		return NIL;
	}

	public static SubLObject cb_c_definitional_internal_guts_fort(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_div_head$.getGlobalValue());
		html_markup(html_macros.$html_attribute_id$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$reloadFrameButton);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_input_head$.getGlobalValue());
			html_markup(html_macros.$html_input_type$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$button);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$reload);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ($$$Refresh_Frames);
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
				html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
			}
			html_char(CHAR_greater, UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_div_tail$.getGlobalValue());
		_prev_bind_0 = cb_viewpoint.$cb_use_mts_filter$.currentBinding(thread);
		try {
			cb_viewpoint.$cb_use_mts_filter$.bind(NIL, thread);
			cb_c_gaf_arg_header(ONE_INTEGER);
			final SubLObject _prev_bind_0_$56 = $cb_c_gaf_arg_last_mt$.currentBinding(thread);
			try {
				$cb_c_gaf_arg_last_mt$.bind(NIL, thread);
				SubLObject cdolist_list_var;
				final SubLObject preds = cdolist_list_var = cb_definitional_preds_for_fort(fort);
				SubLObject pred = NIL;
				pred = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_c_gaf_arg_rec_arg_pred(fort, ONE_INTEGER, pred);
					cdolist_list_var = cdolist_list_var.rest();
					pred = cdolist_list_var.first();
				}
				cb_c_gaf_arg_rec_arg_pred(fort, ONE_INTEGER, $$salientAssertions);
			} finally {
				$cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0_$56, thread);
			}
		} finally {
			cb_viewpoint.$cb_use_mts_filter$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_describe_constant(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != ke.cyclist_is_guest()) {
			cyc_navigator_internals.guest_warn($$$the_Constant_Internal_Data_page);
			return NIL;
		}
		final SubLObject constant = cb_guess_constant(args);
		if (NIL == constant_p(constant)) {
			cb_error($str190$_a_does_not_specify_a_Cyc_constan, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		final SubLObject title_var = $$$Constant_Internal_Data;
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$57 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				dhtml_macros.html_basic_cb_scripts();
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$58 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh_Frames);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						if (NIL != title_var) {
							html_markup(html_macros.$html_heading_head$.getGlobalValue());
							html_markup(TWO_INTEGER);
							html_char(CHAR_greater, UNPROVIDED);
							html_princ(title_var);
							html_markup(html_macros.$html_heading_tail$.getGlobalValue());
							html_markup(TWO_INTEGER);
							html_char(CHAR_greater, UNPROVIDED);
						}
						html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
						final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
						final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							cb_help_preamble($CB_DESCRIBE_CONSTANT, UNPROVIDED, UNPROVIDED);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str194$Internal_data_for_constant__);
							html_indent(UNPROVIDED);
							cb_show_term(constant, ZERO_INTEGER, T);
							html_newline(TWO_INTEGER);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_head$.getGlobalValue());
							html_markup(html_macros.$html_table_border$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(ZERO_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_align($TOP));
								html_char(CHAR_quotation, UNPROVIDED);
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($RIGHT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_markup(html_macros.$html_strong_head$.getGlobalValue());
										html_princ($str195$Name__);
										html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($LEFT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										cb_form(constants_high.constant_name(constant), UNPROVIDED, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_align($TOP));
								html_char(CHAR_quotation, UNPROVIDED);
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($RIGHT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_markup(html_macros.$html_small_head$.getGlobalValue());
										html_markup(html_macros.$html_italic_head$.getGlobalValue());
										html_princ($str196$_ephemeral__internal__);
										html_markup(html_macros.$html_italic_tail$.getGlobalValue());
										html_markup(html_macros.$html_small_tail$.getGlobalValue());
										html_markup(html_macros.$html_strong_head$.getGlobalValue());
										html_princ($str197$SUID__);
										html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($LEFT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										cb_form(constant_suid(constant), UNPROVIDED, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_align($TOP));
								html_char(CHAR_quotation, UNPROVIDED);
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($RIGHT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_markup(html_macros.$html_small_head$.getGlobalValue());
										html_markup(html_macros.$html_italic_head$.getGlobalValue());
										html_princ($str198$_permanent__external__);
										html_markup(html_macros.$html_italic_tail$.getGlobalValue());
										html_markup(html_macros.$html_small_tail$.getGlobalValue());
										html_markup(html_macros.$html_strong_head$.getGlobalValue());
										html_princ($str199$GUID__);
										html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($LEFT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										cb_form(Guids.guid_to_string(constants_high.constant_guid(constant)), UNPROVIDED, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_align($TOP));
								html_char(CHAR_quotation, UNPROVIDED);
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($RIGHT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_markup(html_macros.$html_small_head$.getGlobalValue());
										html_markup(html_macros.$html_italic_head$.getGlobalValue());
										html_princ($str200$_compact_external__);
										html_markup(html_macros.$html_italic_tail$.getGlobalValue());
										html_markup(html_macros.$html_small_tail$.getGlobalValue());
										html_markup(html_macros.$html_strong_head$.getGlobalValue());
										html_princ($str201$HL_ID__);
										html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($LEFT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										cb_form(kb_utilities.compact_hl_external_id_string(constant), UNPROVIDED, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
							}
							html_markup(html_macros.$html_table_tail$.getGlobalValue());
							cb_describe_inference_modules(constant);
							html_newline(TWO_INTEGER);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str202$To_use_in_Java_OpenCYC_API_);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							html_newline(UNPROVIDED);
							html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
							html_macros.verify_not_within_html_pre();
							html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
							final SubLObject _prev_bind_0_$75 = html_macros.$within_html_pre$.currentBinding(thread);
							try {
								html_macros.$within_html_pre$.bind(T, thread);
								format(html_macros.$html_stream$.getDynamicValue(thread), $str203$new_CycConstant__S__new_Guid__S__, constants_high.constant_name(constant), Guids.guid_to_string(constants_high.constant_guid(constant)));
							} finally {
								html_macros.$within_html_pre$.rebind(_prev_bind_0_$75, thread);
							}
							html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
							html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
						}
						html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$58, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$57, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_link_describe_constant(final SubLObject constant) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str205$cb_describe_constant__A, cb_fort_identifier(constant));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Internal_Data);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return constant;
	}

	public static SubLObject cb_describe_nart(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != ke.cyclist_is_guest()) {
			cyc_navigator_internals.guest_warn($str210$the_Reified_NAT_Internal_Data_pag);
			return NIL;
		}
		final SubLObject nart = cb_guess_fort(args, UNPROVIDED);
		if (NIL == nart_handles.nart_p(nart)) {
			cb_error($str211$_a_does_not_specify_a_Cyc_reified, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		final SubLObject title_var = $$$Reified_NAT_Internal_Data;
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$76 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				dhtml_macros.html_basic_cb_scripts();
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$77 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh_Frames);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						if (NIL != title_var) {
							html_markup(html_macros.$html_heading_head$.getGlobalValue());
							html_markup(TWO_INTEGER);
							html_char(CHAR_greater, UNPROVIDED);
							html_princ(title_var);
							html_markup(html_macros.$html_heading_tail$.getGlobalValue());
							html_markup(TWO_INTEGER);
							html_char(CHAR_greater, UNPROVIDED);
						}
						html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
						final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
						final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							cb_help_preamble($CB_DESCRIBE_NAT, UNPROVIDED, UNPROVIDED);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str213$Internal_data_for_Reified_NAT__);
							html_indent(UNPROVIDED);
							cb_show_term(nart, ZERO_INTEGER, T);
							html_newline(TWO_INTEGER);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_head$.getGlobalValue());
							html_markup(html_macros.$html_table_border$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(ZERO_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_align($TOP));
								html_char(CHAR_quotation, UNPROVIDED);
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($RIGHT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_princ($str196$_ephemeral__internal__);
										html_markup(html_macros.$html_strong_head$.getGlobalValue());
										html_princ($str214$ID_Number__);
										html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($LEFT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										cb_form(nart_handles.nart_id(nart), UNPROVIDED, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_align($TOP));
								html_char(CHAR_quotation, UNPROVIDED);
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($RIGHT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_markup(html_macros.$html_strong_head$.getGlobalValue());
										html_princ($str215$HL_Formula__);
										html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_markup(html_macros.$html_table_data_align$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(html_align($LEFT));
									html_char(CHAR_quotation, UNPROVIDED);
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										cb_show_term(narts_high.nart_hl_formula(nart), UNPROVIDED, UNPROVIDED);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
							}
							html_markup(html_macros.$html_table_tail$.getGlobalValue());
							html_markup(html_macros.$html_no_break_head$.getGlobalValue());
							html_princ($str216$_compact__external__);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str217$HL_ID_String___);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							html_princ(kb_utilities.compact_hl_external_id_string(nart));
							html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
							cb_describe_inference_modules(nart);
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
						}
						html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$77, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$76, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_link_describe_nart(final SubLObject nart) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str219$cb_describe_nart__A, cb_fort_identifier(nart));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Internal_Data);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return nart;
	}

	public static SubLObject cb_describe_index(final SubLObject index) {
		if (NIL == simple_index_p(index)) {
			return cb_form(index, UNPROVIDED, UNPROVIDED);
		}
		SubLObject cdolist_list_var = index;
		SubLObject assertion = NIL;
		assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (!assertion.eql(index.first())) {
				html_newline(UNPROVIDED);
			}
			cb_show_assertion_readably(assertion, T, UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			assertion = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_describe_inference_modules(final SubLObject fort) {
		final SubLObject predicate_has_specific_removal_modulesP = inference_modules.predicate_has_specific_removal_modulesP(fort);
		final SubLObject predicate_has_specific_hl_storage_modulesP = hl_storage_modules.predicate_has_specific_hl_storage_modulesP(fort);
		if (((NIL != predicate_has_specific_removal_modulesP) || (NIL != predicate_has_specific_hl_storage_modulesP)) || (NIL != fort)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_center_head$.getGlobalValue());
			html_princ_strong($$$Inference_Data);
			html_markup(html_macros.$html_center_tail$.getGlobalValue());
			if (NIL != predicate_has_specific_removal_modulesP) {
				cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, fort, $str223$_Removal_Modules_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
			}
			if (NIL != preference_modules.predicate_has_specific_preference_modulesP(fort)) {
				cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, fort, $str225$_Preference_Modules_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
			}
			if (NIL != hl_storage_modules.predicate_has_specific_hl_storage_modulesP(fort)) {
				cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, fort, $str227$_Storage_Modules_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject cb_c_all_asserted_knowledge(final SubLObject args) {
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL != current) {
			cdestructuring_bind_error(args, $list94);
			return NIL;
		}
		final SubLObject index_hook = cb_guess_index(index_spec);
		if (NIL == cb_index_hook_p(index_hook)) {
			return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return cb_c_all_asserted_knowledge_guts(index_hook);
	}

	public static SubLObject cb_c_all_asserted_knowledge_guts(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != forts.fort_p(index_hook)) && ($INFERRED == cb_frames.$cb_default_index_view$.getDynamicValue(thread))) {
			return cb_inferred_index.cb_inferred_gaf_arg_assertions_guts(index_hook, index_hook, NIL, NIL);
		}
		final SubLObject title_var;
		final SubLObject title = title_var = format(NIL, $str229$All_assertions_for__S, index_hook);
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$88 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				dhtml_macros.html_basic_cb_scripts();
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$89 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($str168$reloadCurrentFrame__reloadFrameBu);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						cb_possibly_show_followup_widget(index_hook);
						cb_c_term_header(index_hook);
						html_newline(TWO_INTEGER);
						if (NIL != cb_c_bookkeeping_gafs(index_hook)) {
							html_newline(UNPROVIDED);
						}
						cb_c_total_internal(index_hook);
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$89, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$88, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_link_all_asserted_knowledge(final SubLObject index_hook, final SubLObject count, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str230$cb_c_all_asserted_knowledge__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != linktext) {
				html_princ(linktext);
			} else {
				html_princ($$$All_Asserted_Knowledge);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.isPositive()) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_bookkeeping_assertions(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str234$All_bookeeping_assertions_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$92 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$93 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_bookkeeping_gafs(index_hook);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$93, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$92, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_bookkeeping_assertions(final SubLObject index_hook, final SubLObject count, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str236$cb_c_bookkeeping_assertions__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != linktext) {
				html_princ(linktext);
			} else {
				html_princ($$$Bookkeeping_Info);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.isPositive()) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_total(final SubLObject args) {
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL != current) {
			cdestructuring_bind_error(args, $list94);
			return NIL;
		}
		SubLObject index_hook = cb_guess_index(index_spec);
		if (NIL == cb_index_hook_p(index_hook)) {
			index_hook = cb_guess_naut(index_spec, UNPROVIDED);
		}
		if (NIL == index_hook) {
			return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return cb_c_total_guts(index_hook);
	}

	public static SubLObject cb_c_total_guts(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != forts.fort_p(index_hook)) && ($INFERRED == cb_frames.$cb_default_index_view$.getDynamicValue(thread))) {
			return cb_inferred_index.cb_inferred_gaf_arg_assertions_guts(index_hook, index_hook, NIL, NIL);
		}
		final SubLObject title_var;
		final SubLObject title = title_var = format(NIL, $str229$All_assertions_for__S, index_hook);
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$96 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				dhtml_macros.html_basic_cb_scripts();
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$97 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($str168$reloadCurrentFrame__reloadFrameBu);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						cb_possibly_show_followup_widget(index_hook);
						cb_c_term_header(index_hook);
						html_newline(UNPROVIDED);
						html_newline(UNPROVIDED);
						if (NIL != cb_index_hook_p(index_hook)) {
							cb_c_total_internal(index_hook);
						} else if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
							cb_naut_utilities.cb_c_total_internal_naut(index_hook);
						}

						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$97, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$96, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_link_constant_total(final SubLObject index_hook, final SubLObject count, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str240$cb_c_total__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != linktext) {
				html_princ(linktext);
			} else {
				html_princ($$$All_KB_Assertions);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_total_internal(final SubLObject index_hook) {
		if (kb_indexing.num_gaf_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			cb_c_gaf_arg_internal(index_hook, NIL, NIL, NIL);
		}
		if (kb_indexing.num_nart_arg_index(index_hook, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_nart_arg_internal(index_hook, NIL, NIL);
		}
		if (kb_indexing.num_predicate_extent_index(index_hook, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_predicate_extent_internal(index_hook, NIL);
		}
		if (kb_indexing.num_function_extent_index(index_hook).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_function_extent_internal(index_hook);
		}
		if (kb_indexing.num_predicate_rule_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_predicate_rule_internal(index_hook, NIL, NIL, NIL);
		}
		if (kb_indexing.num_decontextualized_ist_predicate_rule_index(index_hook, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_decontextualized_ist_predicate_rule_internal(index_hook, NIL, NIL);
		}
		if (kb_indexing.num_isa_rule_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_isa_rule_internal(index_hook, NIL, NIL, NIL);
		}
		if (kb_indexing.num_genls_rule_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_genls_rule_internal(index_hook, NIL, NIL, NIL);
		}
		if (kb_indexing.num_genl_mt_rule_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_genl_mt_rule_internal(index_hook, NIL, NIL, NIL);
		}
		if (kb_indexing.num_function_rule_index(index_hook, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_function_rule_internal(index_hook, NIL, NIL);
		}
		if (kb_indexing.num_other_index(index_hook).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_other_internal(index_hook);
		}
		if (((NIL != forts.fort_p(index_hook)) && (NIL == kb_indexing.broad_mtP(index_hook))) && kb_indexing.num_mt_index(index_hook).numG(ZERO_INTEGER)) {
			html_hr(UNPROVIDED, UNPROVIDED);
			cb_c_ist_internal(index_hook);
		}
		return NIL;
	}

	public static SubLObject cb_link_chronological_order(final SubLObject index_hook, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str243$cb_assertion_chronology__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != linktext) {
				html_princ(linktext);
			} else {
				html_princ($$$Assertions_History);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return index_hook;
	}

	public static SubLObject cb_assertion_chronology(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject fort = cb_guess_fort(args, UNPROVIDED);
		if (NIL != forts.fort_p(fort)) {
			final SubLObject title_var = $$$Assertion_History;
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$100 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$101 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_assertions_in_chronological_order(fort);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$101, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$100, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		}
		return NIL;
	}

	public static SubLObject cb_assertions_in_chronological_order(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject assertions = kb_utilities.term_assertions_in_chronological_order(fort);
		SubLObject last_date = NIL;
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject cdolist_list_var = assertions;
			SubLObject assertion = NIL;
			assertion = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject when = assertions_high.asserted_when(assertion);
				final SubLObject second = assertions_high.asserted_second(assertion);
				final SubLObject asserted_by = assertions_high.asserted_by(assertion);
				final SubLObject new_dateP = makeBoolean(!last_date.equal(when));
				if (NIL != new_dateP) {
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							last_date = when;
							html_markup(html_macros.$html_bold_head$.getGlobalValue());
							html_princ(NIL != when ? numeric_date_utilities.datestring(when) : $$$unknown);
							html_markup(html_macros.$html_bold_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($RIGHT));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						if (NIL != second) {
							html_princ(numeric_date_utilities.secondstring(second));
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($LEFT));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						cb_show_assertion_readably(assertion, T, NIL);
						if (NIL != asserted_by) {
							html_markup(html_macros.$html_no_break_head$.getGlobalValue());
							html_princ($$$_by_);
							cb_show_term(asserted_by, UNPROVIDED, UNPROVIDED);
							html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				cdolist_list_var = cdolist_list_var.rest();
				assertion = cdolist_list_var.first();
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return fort;
	}

	public static SubLObject cb_link_assertions_id_order(final SubLObject index_hook, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str249$cb_assertions_id_order__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != linktext) {
				html_princ(linktext);
			} else {
				html_princ($$$Assertions_by_ID);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return index_hook;
	}

	public static SubLObject cb_assertions_id_order(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject fort = cb_guess_fort(args, UNPROVIDED);
		if (NIL != forts.fort_p(fort)) {
			final SubLObject title_var = $$$Assertions_by_ID;
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$110 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$111 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_assertions_in_id_order(fort);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$111, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$110, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		}
		return NIL;
	}

	public static SubLObject cb_assertions_in_id_order(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject assertions = kb_utilities.term_assertions_in_id_order(fort);
		SubLObject last_date = NIL;
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject cdolist_list_var = assertions;
			SubLObject assertion = NIL;
			assertion = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject when = assertions_high.asserted_when(assertion);
				final SubLObject second = assertions_high.asserted_second(assertion);
				final SubLObject asserted_by = assertions_high.asserted_by(assertion);
				final SubLObject new_dateP = makeBoolean(!last_date.equal(when));
				if (NIL != new_dateP) {
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							last_date = when;
							html_markup(html_macros.$html_bold_head$.getGlobalValue());
							html_princ(NIL != when ? numeric_date_utilities.datestring(when) : $$$unknown);
							html_markup(html_macros.$html_bold_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($RIGHT));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						if (NIL != second) {
							html_princ(numeric_date_utilities.secondstring(second));
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($LEFT));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						cb_show_assertion_readably(assertion, T, NIL);
						if (NIL != asserted_by) {
							html_markup(html_macros.$html_no_break_head$.getGlobalValue());
							html_princ($$$_by_);
							cb_show_term(asserted_by, UNPROVIDED, UNPROVIDED);
							html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				cdolist_list_var = cdolist_list_var.rest();
				assertion = cdolist_list_var.first();
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return fort;
	}

	public static SubLObject cb_c_gaf_arg(final SubLObject args) {
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list254);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject arg_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list254);
		current = current.rest();
		final SubLObject pred_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list254);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list254);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject arg = NIL;
			SubLObject predicate = NIL;
			SubLObject mt = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != arg_string) {
				arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (!arg.isFixnum()) {
					return cb_error($str255$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != pred_spec) {
					predicate = cb_guess_fort(pred_spec, UNPROVIDED);
					if (NIL == forts.fort_p(predicate)) {
						return cb_error($str107$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != mt_spec) {
						mt = cb_guess_hlmt(mt_spec);
						if (NIL == hlmt.hlmt_p(mt)) {
							return cb_error($str256$Could_not_determine_a_microtheory, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			cb_c_gaf_arg_guts(index_hook, arg, predicate, mt);
		} else {
			cdestructuring_bind_error(args, $list254);
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_guts(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL == mt) && (NIL != forts.fort_p(index_hook))) && ($INFERRED == cb_frames.$cb_default_index_view$.getDynamicValue(thread))) {
			return cb_inferred_index.cb_inferred_gaf_arg_assertions_guts(index_hook, index_hook, arg, predicate);
		}
		final SubLObject title_var;
		final SubLObject title = title_var = format(NIL, $str258$GAF_index_for__S, index_hook);
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$120 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				dhtml_macros.html_basic_cb_scripts();
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$121 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($str168$reloadCurrentFrame__reloadFrameBu);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						cb_possibly_show_followup_widget(index_hook);
						cb_c_term_header(index_hook);
						html_newline(TWO_INTEGER);
						cb_c_gaf_arg_internal(index_hook, arg, predicate, mt);
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$121, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$120, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_link_gaf_arg(final SubLObject index_hook, final SubLObject count, SubLObject arg, SubLObject predicate, SubLObject mt) {
		if (arg == UNPROVIDED) {
			arg = NIL;
		}
		if (predicate == UNPROVIDED) {
			predicate = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str259$cb_c_gaf_arg__A, cb_index_identifier(index_hook));
		if (NIL != arg) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, arg);
			if (NIL != predicate) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_fort_identifier(predicate));
				if (NIL != mt) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != predicate) {
				html_princ(cb_fort_display_string(predicate));
			} else if (NIL != arg) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str261$Arg__a, arg);
			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_GAFs);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_gaf_arg_internal(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $cb_c_gaf_arg_last_mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $assertion_filter_hook$.currentBinding(thread);
		final SubLObject _prev_bind_3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			$cb_c_gaf_arg_last_mt$.bind(NIL, thread);
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$124 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$125 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$126 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$127 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$128 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_1_$129 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										if (NIL == arg) {
											cb_c_gaf_arg_rec(index_hook);
										} else if (NIL == predicate) {
											cb_c_gaf_arg_rec_arg(index_hook, arg);
										} else {
											cb_c_gaf_arg_header(arg);
											if (NIL == mt) {
												final SubLObject mts = kb_indexing.key_gaf_arg_index(index_hook, arg, predicate);
												if (NIL != list_utilities.singletonP(mts)) {
													mt = mts.first();
												}
											}
											if (NIL == mt) {
												cb_c_gaf_arg_rec_arg_pred(index_hook, arg, predicate);
											} else {
												final SubLObject _prev_bind_0_$129 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
												try {
													$cb_c_gaf_arg_use_binary$.bind(makeBoolean(((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && (NIL == auxiliary_indexing.auxiliary_index_p(index_hook))) && arg.eql(ONE_INTEGER)), thread);
													if (NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
														final SubLObject _prev_bind_0_$130 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
														final SubLObject _prev_bind_1_$130 = mt_relevance_macros.$mt$.currentBinding(thread);
														try {
															mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
															mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
															$cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
														} finally {
															mt_relevance_macros.$mt$.rebind(_prev_bind_1_$130, thread);
															mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$130, thread);
														}
													}
													cb_c_gaf_arg_rec_arg_pred_mt(index_hook, arg, predicate, mt);
													cb_adornments.handle_specific_adornment($GAF_ARG_PREDICATE, LITERAL_QUERY_INDEX_DISPLAY, $MAIN, index_hook, arg, predicate, mt);
												} finally {
													$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0_$129, thread);
												}
											}
										}

									} finally {
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$129, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$128, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$127, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$126, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$125, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$132 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$124, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_3, thread);
			$assertion_filter_hook$.rebind(_prev_bind_2, thread);
			$cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec(final SubLObject index_hook) {
		SubLObject some_arg_done = NIL;
		SubLObject cdolist_list_var;
		final SubLObject args = cdolist_list_var = cb_relevant_key_gaf_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != some_arg_done) {
				html_hr(UNPROVIDED, UNPROVIDED);
			}
			cb_c_gaf_arg_rec_arg(index_hook, arg);
			some_arg_done = T;
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg(final SubLObject index_hook, final SubLObject arg) {
		cb_c_gaf_arg_header(arg);
		final SubLObject predicates = cb_relevant_key_gaf_arg_index(index_hook, arg, UNPROVIDED, UNPROVIDED);
		$cb_c_gaf_arg_last_mt$.setDynamicValue(NIL);
		SubLObject cdolist_list_var = predicates;
		SubLObject predicate = NIL;
		predicate = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_gaf_arg_rec_arg_pred(index_hook, arg, predicate);
			cdolist_list_var = cdolist_list_var.rest();
			predicate = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
		try {
			$cb_c_gaf_arg_use_binary$.bind(makeBoolean(((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && (NIL == auxiliary_indexing.auxiliary_index_p(index_hook))) && arg.eql(ONE_INTEGER)), thread);
			final SubLObject mts = cb_relevant_key_gaf_arg_index(index_hook, arg, predicate, UNPROVIDED);
			if (NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
				final SubLObject _prev_bind_0_$135 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
					mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
					$cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$135, thread);
				}
			}
			SubLObject cdolist_list_var = mts;
			SubLObject mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				cb_c_gaf_arg_rec_arg_pred_mt(index_hook, arg, predicate, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
		} finally {
			$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_mt_header(mt, $cb_c_gaf_arg_last_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		$cb_c_gaf_arg_last_mt$.setDynamicValue(mt, thread);
		if (NIL != cb_c_gaf_arg_use_binaryP()) {
			cb_c_gaf_arg_rec_arg_pred_mt_binary(index_hook, arg, predicate, mt);
		} else {
			cb_c_gaf_arg_rec_arg_pred_mt_non_binary(index_hook, arg, predicate, mt);
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.setDynamicValue(cons(assertion, $cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.getDynamicValue(thread)), thread);
		return assertion;
	}

	public static SubLObject cb_c_gaf_arg_use_binaryP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && (NIL != cb_use_binary_for_major_presentation_languageP(UNPROVIDED)));
	}

	public static SubLObject cb_use_binary_for_major_presentation_languageP(SubLObject lang) {
		if (lang == UNPROVIDED) {
			lang = $cb_major_presentation_language$.getDynamicValue();
		}
		final SubLObject pcase_var = lang;
		if (pcase_var.eql($NL)) {
			return NIL;
		}
		if (pcase_var.eql($SILK) || pcase_var.eql($CYCL)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt_binary_note(final SubLObject assertion, SubLObject showing_negatedP) {
		if (showing_negatedP == UNPROVIDED) {
			showing_negatedP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
			if ((NIL == showing_negatedP) && ($FALSE == assertions_high.assertion_truth(assertion))) {
				if (NIL == $cb_ke_text_mode$.getDynamicValue(thread)) {
					return cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated(assertion);
				}
				cb_show_assertion_readably(assertion, T, NIL);
			} else {
				$cb_c_gaf_arg_rec_arg_pred_mt_binary$.setDynamicValue(cons(assertion, $cb_c_gaf_arg_rec_arg_pred_mt_binary$.getDynamicValue(thread)), thread);
			}
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt_binary_note_el(final SubLObject assertion, SubLObject showing_negatedP) {
		if (showing_negatedP == UNPROVIDED) {
			showing_negatedP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
			if ((NIL == showing_negatedP) && ($FALSE == assertions_high.assertion_truth(assertion))) {
				return cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated(assertion);
			}
			final SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
			final SubLObject arg2 = cycl_utilities.formula_arg2(hl_formula, UNPROVIDED);
			SubLObject el_formula = NIL;
			if ((NIL == assertion_handles.assertion_p(arg2)) || (NIL != list_utilities.tree_find_if(symbol_function($sym268$FAST_FI_NOT_EL_TERM_), narts_high.nart_expand(remove(arg2, hl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED))) {
				el_formula = cb_assertion_el_formula(assertion, hl_formula);
			}
			if ((NIL == el_formula) || fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula)))) {
				$cb_c_gaf_arg_rec_arg_pred_mt_binary$.setDynamicValue(cons(assertion, $cb_c_gaf_arg_rec_arg_pred_mt_binary$.getDynamicValue(thread)), thread);
			} else {
				$cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.setDynamicValue(cons(assertion, $cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.getDynamicValue(thread)), thread);
			}
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt_binary(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_c_gaf_arg_rec_arg_pred_mt_binary$.currentBinding(thread);
		final SubLObject _prev_bind_3 = $cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.currentBinding(thread);
		try {
			$cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.bind(NIL, thread);
			$cb_c_gaf_arg_rec_arg_pred_mt_binary$.bind(NIL, thread);
			$cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.bind(NIL, thread);
			final SubLObject noting_fn = (NIL != cb_c_show_el_formulas_for_index_hookP(index_hook)) ? symbol_function(CB_C_GAF_ARG_REC_ARG_PRED_MT_BINARY_NOTE_EL) : symbol_function(CB_C_GAF_ARG_REC_ARG_PRED_MT_BINARY_NOTE);
			if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
				kb_utilities.map_gaf_arg_index_naut(noting_fn, index_hook, arg, predicate, NIL, mt);
			} else {
				kb_mapping.map_gaf_arg_index(noting_fn, index_hook, arg, predicate, NIL, mt);
			}
			if (NIL != $cb_c_gaf_arg_rec_arg_pred_mt_binary$.getDynamicValue(thread)) {
				html_markup(html_macros.$html_table_head$.getGlobalValue());
				html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
				html_markup(html_macros.$html_table_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(ZERO_INTEGER);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(ZERO_INTEGER);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(ZERO_INTEGER);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							cb_c_binary_pred_header(predicate, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							final SubLObject assertion_link_binary_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_BINARY_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK_BINARY);
							final SubLObject _prev_bind_0_$140 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
							final SubLObject _prev_bind_1_$141 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
							try {
								$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
								$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
								Mapping.mapcar(assertion_link_binary_fn, kb_utilities.sort_terms($cb_c_gaf_arg_rec_arg_pred_mt_binary$.getDynamicValue(thread), T, T, T, T, symbol_function(ASSERTION_CONS), UNPROVIDED));
							} finally {
								$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$141, thread);
								$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$140, thread);
							}
							if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
								html_princ($str177$__);
							}
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
				}
				html_markup(html_macros.$html_table_tail$.getGlobalValue());
			}
			if (NIL != $cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.getDynamicValue(thread)) {
				final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
				final SubLObject _prev_bind_0_$141 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
				final SubLObject _prev_bind_1_$142 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
				try {
					$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
					$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
					Mapping.mapcar(assertion_link_fn, kb_utilities.sort_terms($cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.getDynamicValue(thread), T, T, T, T, symbol_function(ASSERTION_CONS), UNPROVIDED));
				} finally {
					$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$142, thread);
					$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$141, thread);
				}
			}
			if (NIL != $cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.getDynamicValue(thread)) {
				$cb_c_gaf_arg_rec_arg_pred_mt_binary$.setDynamicValue(NIL, thread);
				$cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.setDynamicValue(NIL, thread);
				SubLObject cdolist_list_var = $cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.getDynamicValue(thread);
				SubLObject assertion = NIL;
				assertion = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					funcall(noting_fn, assertion, T);
					cdolist_list_var = cdolist_list_var.rest();
					assertion = cdolist_list_var.first();
				}
				if (NIL != $cb_c_gaf_arg_rec_arg_pred_mt_binary$.getDynamicValue(thread)) {
					html_markup(html_macros.$html_table_head$.getGlobalValue());
					html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
					html_markup(html_macros.$html_table_border$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($TOP));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								cb_c_binary_pred_header(predicate, T);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($TOP));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								final SubLObject assertion_link_binary_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_BINARY_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK_BINARY);
								final SubLObject _prev_bind_0_$146 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
								final SubLObject _prev_bind_1_$143 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
								try {
									$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
									$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
									SubLObject cdolist_list_var2 = kb_utilities.sort_terms($cb_c_gaf_arg_rec_arg_pred_mt_binary$.getDynamicValue(thread), T, T, T, T, symbol_function(ASSERTION_CONS), UNPROVIDED);
									SubLObject assertion2 = NIL;
									assertion2 = cdolist_list_var2.first();
									while (NIL != cdolist_list_var2) {
										funcall(assertion_link_binary_fn, assertion2, T);
										cdolist_list_var2 = cdolist_list_var2.rest();
										assertion2 = cdolist_list_var2.first();
									}
								} finally {
									$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$143, thread);
									$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$146, thread);
								}
								if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
									html_princ($str177$__);
								}
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
						}
						html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
					}
					html_markup(html_macros.$html_table_tail$.getGlobalValue());
				}
				if (NIL != $cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.getDynamicValue(thread)) {
					final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
					final SubLObject _prev_bind_0_$147 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
					final SubLObject _prev_bind_1_$144 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
					try {
						$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
						$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
						Mapping.mapcar(assertion_link_fn, kb_utilities.sort_terms($cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.getDynamicValue(thread), T, T, T, T, symbol_function(ASSERTION_CONS), UNPROVIDED));
					} finally {
						$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$144, thread);
						$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$147, thread);
					}
				}
			}
		} finally {
			$cb_c_gaf_arg_rec_arg_pred_mt_binary_el$.rebind(_prev_bind_3, thread);
			$cb_c_gaf_arg_rec_arg_pred_mt_binary$.rebind(_prev_bind_2, thread);
			$cb_c_gaf_arg_rec_arg_pred_mt_binary_negated$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt_non_binary(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject count = kb_indexing.num_gaf_arg_index(index_hook, arg, predicate, mt);
		if (NIL != number_utilities.potentially_infinite_number_G(count, $cb_max_assertions_non_collapsed$.getDynamicValue(thread))) {
			final SubLObject id = string_utilities.string_subst($str47$, $str278$__, cconcatenate(format_nil.format_nil_s_no_copy(index_hook), new SubLObject[] { format_nil.format_nil_s_no_copy(arg), format_nil.format_nil_s_no_copy(predicate), format_nil.format_nil_s_no_copy(mt) }), UNPROVIDED);
			dhtml_macros.dhtml_switch_visibility_links_arrows(id, $str47$);
			cb_form(predicate, UNPROVIDED, UNPROVIDED);
			format(html_macros.$html_stream$.getDynamicValue(thread), $str279$_arg_S___S_, arg, count);
			dhtml_macros.dhtml_set_switched_visibility(id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				cb_c_gaf_arg_rec_arg_pred_mt_non_binary_int(index_hook, arg, predicate, mt);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
		} else {
			cb_c_gaf_arg_rec_arg_pred_mt_non_binary_int(index_hook, arg, predicate, mt);
		}
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_rec_arg_pred_mt_non_binary_int(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
				SubLObject asserts = NIL;
				final SubLObject _prev_bind_0_$152 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$153 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
					mt_relevance_macros.$mt$.bind(mt, thread);
					SubLObject indexed_terms = cycl_utilities.expression_gather(index_hook, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
					if (NIL != indexed_term_p(predicate)) {
						indexed_terms = cons(predicate, indexed_terms);
					}
					SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
					SubLObject v_assert = NIL;
					v_assert = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						if (((NIL == predicate) || predicate.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(v_assert)))) && (NIL != (NIL != arg ? equal(index_hook, cycl_utilities.formula_arg(assertions_high.assertion_formula(v_assert), arg, UNPROVIDED)) : term_occurs_as_formula_argument(index_hook, assertions_high.assertion_formula(v_assert))))) {
							asserts = cons(v_assert, asserts);
						}
						cdolist_list_var = cdolist_list_var.rest();
						v_assert = cdolist_list_var.first();
					}
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$153, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$152, thread);
				}
				SubLObject cdolist_list_var2 = kb_utilities.sort_terms(asserts, T, T, T, T, symbol_function(ASSERTION_CONS), UNPROVIDED);
				SubLObject v_assert2 = NIL;
				v_assert2 = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					funcall(assertion_link_fn, v_assert2);
					cdolist_list_var2 = cdolist_list_var2.rest();
					v_assert2 = cdolist_list_var2.first();
				}
			} else {
				SubLObject cdolist_list_var3 = kb_utilities.sort_terms(kb_mapping.gather_gaf_arg_index(index_hook, arg, predicate, mt, NIL), T, T, T, T, symbol_function(ASSERTION_CONS), UNPROVIDED);
				SubLObject v_assert3 = NIL;
				v_assert3 = cdolist_list_var3.first();
				while (NIL != cdolist_list_var3) {
					funcall(assertion_link_fn, v_assert3);
					cdolist_list_var3 = cdolist_list_var3.rest();
					v_assert3 = cdolist_list_var3.first();
				}
			}
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list282);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject arg_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list282);
		current = current.rest();
		final SubLObject func_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list282);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject arg = NIL;
			SubLObject function = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != arg_string) {
				arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (!arg.isFixnum()) {
					return cb_error($str255$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != func_spec) {
					function = cb_guess_fort(func_spec, UNPROVIDED);
					if (NIL == forts.fort_p(function)) {
						return cb_error($str107$Could_not_determine_a_term_from__, func_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str283$NART_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$154 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$155 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_nart_arg_internal(index_hook, arg, function);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$155, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$154, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list282);
		}
		return NIL;
	}

	public static SubLObject cb_link_nart_arg(final SubLObject index_hook, final SubLObject count, SubLObject arg, SubLObject function) {
		if (arg == UNPROVIDED) {
			arg = NIL;
		}
		if (function == UNPROVIDED) {
			function = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str285$cb_c_nart_arg__A, cb_index_identifier(index_hook));
		if (NIL != arg) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, arg);
			if (NIL != function) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_fort_identifier(function));
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != function) {
				html_princ(cb_fort_display_string(function));
			} else if (NIL != arg) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str261$Arg__a, arg);
			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_NARTs);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_nart_arg_internal(final SubLObject index_hook, final SubLObject arg, final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		final SubLObject _prev_bind_2 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
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
									final SubLObject _prev_bind_0_$162 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_1_$163 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										if (NIL == arg) {
											cb_c_nart_arg_rec(index_hook);
										} else if (NIL == function) {
											cb_c_nart_arg_rec_arg(index_hook, arg);
										} else {
											cb_c_nart_arg_header(arg);
											final SubLObject _prev_bind_0_$163 = $cb_c_nart_arg_use_binary$.currentBinding(thread);
											try {
												$cb_c_nart_arg_use_binary$.bind(makeBoolean(((NIL != $cb_c_nart_arg_use_binary$.getDynamicValue(thread)) && (NIL == auxiliary_indexing.auxiliary_index_p(index_hook))) && arg.eql(ONE_INTEGER)), thread);
												if (NIL != $cb_c_nart_arg_use_binary$.getDynamicValue(thread)) {
													final SubLObject _prev_bind_0_$164 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
													final SubLObject _prev_bind_1_$164 = mt_relevance_macros.$mt$.currentBinding(thread);
													try {
														mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
														mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
														$cb_c_nart_arg_use_binary$.setDynamicValue(arity.binaryP(function), thread);
													} finally {
														mt_relevance_macros.$mt$.rebind(_prev_bind_1_$164, thread);
														mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$164, thread);
													}
												}
												cb_c_nart_arg_rec_arg_func(index_hook, arg, function);
												cb_adornments.handle_specific_adornment($NART_ARG_FUNCTION, LITERAL_QUERY_INDEX_DISPLAY, $MAIN, index_hook, arg, function, UNPROVIDED);
											} finally {
												$cb_c_nart_arg_use_binary$.rebind(_prev_bind_0_$163, thread);
											}
										}

									} finally {
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$163, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$162, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$165 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
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
					final SubLObject _prev_bind_0_$166 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$158, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_2, thread);
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_rec(final SubLObject index_hook) {
		SubLObject some_arg_done = NIL;
		SubLObject cdolist_list_var;
		final SubLObject args = cdolist_list_var = cb_relevant_key_nart_arg_index(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != some_arg_done) {
				html_hr(UNPROVIDED, UNPROVIDED);
			}
			cb_c_nart_arg_rec_arg(index_hook, arg);
			some_arg_done = T;
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_rec_arg(final SubLObject index_hook, final SubLObject arg) {
		cb_c_nart_arg_header(arg);
		SubLObject cdolist_list_var;
		final SubLObject functions = cdolist_list_var = cb_relevant_key_nart_arg_index(index_hook, arg, UNPROVIDED, UNPROVIDED);
		SubLObject function = NIL;
		function = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_nart_arg_rec_arg_func(index_hook, arg, function);
			cdolist_list_var = cdolist_list_var.rest();
			function = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_rec_arg_func(final SubLObject index_hook, final SubLObject arg, final SubLObject function) {
		if (NIL != cb_c_nart_arg_use_binaryP()) {
			cb_c_nart_arg_rec_arg_func_binary(index_hook, arg, function);
		} else {
			cb_c_nart_arg_rec_arg_func_non_binary(index_hook, arg, function);
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_use_binaryP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL != $cb_c_nart_arg_use_binary$.getDynamicValue(thread)) && ($CYCL == $cb_major_presentation_language$.getDynamicValue(thread)));
	}

	public static SubLObject cb_c_nart_arg_rec_arg_func_binary_note(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
			$cb_c_nart_arg_rec_arg_func_binary$.setDynamicValue(cons(assertion, $cb_c_nart_arg_rec_arg_func_binary$.getDynamicValue(thread)), thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_rec_arg_func_binary_note_el(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
			final SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
			final SubLObject arg2 = cycl_utilities.formula_arg2(hl_formula, UNPROVIDED);
			SubLObject el_formula = NIL;
			if ((NIL == assertion_handles.assertion_p(arg2)) || (NIL != list_utilities.tree_find_if(symbol_function($sym268$FAST_FI_NOT_EL_TERM_), narts_high.nart_expand(remove(arg2, hl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED))) {
				el_formula = cb_assertion_el_formula(assertion, hl_formula);
			}
			if ((NIL == el_formula) || fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula)))) {
				$cb_c_nart_arg_rec_arg_func_binary$.setDynamicValue(cons(assertion, $cb_c_nart_arg_rec_arg_func_binary$.getDynamicValue(thread)), thread);
			} else {
				$cb_c_nart_arg_rec_arg_func_binary_el$.setDynamicValue(cons(assertion, $cb_c_nart_arg_rec_arg_func_binary_el$.getDynamicValue(thread)), thread);
			}
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_rec_arg_func_binary(final SubLObject index_hook, final SubLObject arg, final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $cb_c_nart_arg_rec_arg_func_binary$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_c_nart_arg_rec_arg_func_binary_el$.currentBinding(thread);
		try {
			$cb_c_nart_arg_rec_arg_func_binary$.bind(NIL, thread);
			$cb_c_nart_arg_rec_arg_func_binary_el$.bind(NIL, thread);
			final SubLObject noting_fn = (NIL != cb_c_show_el_formulas_for_index_hookP(index_hook)) ? symbol_function(CB_C_NART_ARG_REC_ARG_FUNC_BINARY_NOTE_EL) : symbol_function(CB_C_NART_ARG_REC_ARG_FUNC_BINARY_NOTE);
			kb_mapping.map_nart_arg_index(noting_fn, index_hook, arg, function);
			if (NIL != $cb_c_nart_arg_rec_arg_func_binary$.getDynamicValue(thread)) {
				html_markup(html_macros.$html_table_head$.getGlobalValue());
				html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
				html_markup(html_macros.$html_table_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(ZERO_INTEGER);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(ZERO_INTEGER);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(ZERO_INTEGER);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$169 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$170 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							Mapping.mapcar(symbol_function(CB_TERM_OF_UNIT_LINK), nreverse($cb_c_nart_arg_rec_arg_func_binary$.getDynamicValue(thread)));
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$171, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$170, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$169, thread);
				}
				html_markup(html_macros.$html_table_tail$.getGlobalValue());
			}
			if (NIL != $cb_c_nart_arg_rec_arg_func_binary_el$.getDynamicValue(thread)) {
				final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
				final SubLObject _prev_bind_0_$172 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
				final SubLObject _prev_bind_1_$173 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
				try {
					$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
					$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
					Mapping.mapcar(assertion_link_fn, nreverse($cb_c_nart_arg_rec_arg_func_binary_el$.getDynamicValue(thread)));
				} finally {
					$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$173, thread);
					$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$172, thread);
				}
			}
		} finally {
			$cb_c_nart_arg_rec_arg_func_binary_el$.rebind(_prev_bind_2, thread);
			$cb_c_nart_arg_rec_arg_func_binary$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_rec_arg_func_non_binary(final SubLObject index_hook, final SubLObject arg, final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_nart_arg_index(assertion_link_fn, index_hook, arg, function);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_type(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != forts.fort_p(index_hook)) {
			SubLObject type = NIL;
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
				mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
				type = fort_types_interface.definitional_fort_type(index_hook, NIL);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
			if (NIL != type) {
				html_princ(cb_c_definitional_fort_type_name(type));
			} else {
				html_princ($$$Individual);
			}
		} else if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
			html_princ($$$Index);
		} else if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
			html_princ($$$NAUT);
		}

		return index_hook;
	}

	public static SubLObject cb_c_definitional_fort_type_name(final SubLObject type) {
		if (type.eql($$Function_Denotational)) {
			return $$$Function;
		}
		return kb_paths.fort_name(type);
	}

	public static SubLObject cb_c_term_header_possible_implementation_constant_note(final SubLObject fort) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != isa.quoted_isa_in_any_mtP(fort, $$ImplementationConstant)) {
			html_markup(html_macros.$html_font_head$.getGlobalValue());
			if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
				html_markup(html_macros.$html_font_color$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_newline(TWO_INTEGER);
				cb_show_term(fort, UNPROVIDED, UNPROVIDED);
				html_princ($str299$_is_not_used_to_represent_common_);
				html_glyph($NBSP, UNPROVIDED);
				html_markup(html_macros.$html_font_head$.getGlobalValue());
				html_markup(html_macros.$html_font_size$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str300$_1);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					final SubLObject href = cyc_file_dependencies.cb_help_file_path($IMPLEMENTATION_CONSTANTS);
					final SubLObject frame_name = cb_frame_name(NIL != $cb_separate_doc_frame$.getDynamicValue(thread) ? $DOC : $MAIN);
					html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(href);
					html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != frame_name) {
						html_markup(html_macros.$html_anchor_target$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(frame_name);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_princ($str302$_Explain_);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
					}
					html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$174, thread);
				}
				html_markup(html_macros.$html_font_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_font_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject cb_c_term_header(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != cb_tools.cb_bookmarks_supported_for_current_user()) {
			cb_add_bookmark_term_link(index_hook);
		}
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		SubLObject size_val = FIVE_INTEGER;
		html_markup(html_macros.$html_font_head$.getGlobalValue());
		if (NIL != size_val) {
			html_markup(html_macros.$html_font_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size_val);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			cb_c_type(index_hook);
			html_princ($str128$___);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_font_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		if (NIL != forts.fort_p(index_hook)) {
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			if (NIL != nart_handles.nart_p(index_hook)) {
				html_newline(UNPROVIDED);
				html_markup(html_macros.$html_small_head$.getGlobalValue());
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				cb_show_term(index_hook, ZERO_INTEGER, T);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
				html_markup(html_macros.$html_small_tail$.getGlobalValue());
			} else {
				final SubLObject size_val2 = FIVE_INTEGER;
				html_markup(html_macros.$html_font_head$.getGlobalValue());
				if (NIL != size_val2) {
					html_markup(html_macros.$html_font_size$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(size_val2);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					cb_show_term(index_hook, UNPROVIDED, UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
				}
				html_markup(html_macros.$html_font_tail$.getGlobalValue());
			}
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			cb_c_term_header_possible_implementation_constant_note(index_hook);
		} else if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			size_val = FIVE_INTEGER;
			html_markup(html_macros.$html_font_head$.getGlobalValue());
			if (NIL != size_val) {
				html_markup(html_macros.$html_font_size$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(size_val);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				cb_link($AUXILIARY_INDEX, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_font_tail$.getGlobalValue());
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		} else if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
			html_newline(UNPROVIDED);
			final SubLObject _prev_bind_3 = $cb_inside_quoteP$.currentBinding(thread);
			try {
				$cb_inside_quoteP$.bind(T, thread);
				html_markup(html_macros.$html_strong_head$.getGlobalValue());
				html_markup(html_macros.$html_small_head$.getGlobalValue());
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				cb_show_term(index_hook, ZERO_INTEGER, T);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
				html_markup(html_macros.$html_small_tail$.getGlobalValue());
				html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			} finally {
				$cb_inside_quoteP$.rebind(_prev_bind_3, thread);
			}
		} else {
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_princ(index_hook);
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		}

		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
			html_princ($str177$__);
		}
		if (NIL != cure_api.$cb_show_cure_link$.getGlobalValue()) {
			html_indent(TWO_INTEGER);
			cure_api.cb_possibly_add_cure_link(index_hook, cconcatenate($$$Open_the_CURE_on_, new SubLObject[] { format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(index_hook)), $str304$_to_add_more_facts_ }), UNPROVIDED);
		}
		if (NIL != indexed_term_p(index_hook)) {
			final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread));
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(browsing_mt);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				cb_inferred_index.cb_possibly_show_term_as_seen_from_mt_header(browsing_mt, UNPROVIDED);
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			}
		}
		return NIL;
	}

	public static SubLObject cb_add_bookmark_term_link(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject bookmarkedP = cb_web_services.currently_bookmarkedP(v_term, UNPROVIDED);
		final SubLObject bookmarked_title = (NIL != bookmarkedP) ? $bookmarked_term_caption$.getDynamicValue(thread) : $unbookmarked_term_caption$.getDynamicValue(thread);
		final SubLObject bookmarked_class = (NIL != bookmarkedP) ? $$$bookmarked : $str47$;
		final SubLObject term_id = cb_term_identifier(v_term);
		final SubLObject v_class = cconcatenate($$$term, new SubLObject[] { format_nil.format_nil_a_no_copy(term_id), $$$_bookmarkButton_, format_nil.format_nil_a_no_copy(bookmarked_class) });
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != v_class) {
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(v_class);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != bookmarked_title) {
			html_markup(html_macros.$html_attribute_title$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(bookmarked_title);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str309$width_21px);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($HTML_INTERESTING_IMG));
			SubLObject align = $TOP;
			SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($HTML_INTERESTING_IMG);
			SubLObject border = ZERO_INTEGER;
			html_markup(html_macros.$html_image_head$.getGlobalValue());
			html_markup(html_macros.$html_image_src$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(image_src);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$bookmarkOn);
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != alt) {
				html_markup(html_macros.$html_image_alt$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(alt);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != align) {
				html_markup(html_macros.$html_image_align$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_align(align));
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != border) {
				html_markup(html_macros.$html_image_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(border);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
			}
			html_markup(html_macros.$html_image_tail$.getGlobalValue());
			image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($HTML_NOT_INTERESTING_IMG));
			align = $TOP;
			alt = cyc_file_dependencies.get_html_icon_alt_string($HTML_NOT_INTERESTING_IMG);
			border = ZERO_INTEGER;
			html_markup(html_macros.$html_image_head$.getGlobalValue());
			html_markup(html_macros.$html_image_src$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(image_src);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$bookmarkOff);
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != alt) {
				html_markup(html_macros.$html_image_alt$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(alt);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != align) {
				html_markup(html_macros.$html_image_align$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_align(align));
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != border) {
				html_markup(html_macros.$html_image_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(border);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$177, thread);
			}
			html_markup(html_macros.$html_image_tail$.getGlobalValue());
			image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($HTML_INTERESTING_WORKING_IMG));
			align = $TOP;
			alt = cyc_file_dependencies.get_html_icon_alt_string($HTML_INTERESTING_WORKING_IMG);
			border = ZERO_INTEGER;
			html_markup(html_macros.$html_image_head$.getGlobalValue());
			html_markup(html_macros.$html_image_src$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(image_src);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$bookmarkWorking);
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != alt) {
				html_markup(html_macros.$html_image_alt$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(alt);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != align) {
				html_markup(html_macros.$html_image_align$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_align(align));
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != border) {
				html_markup(html_macros.$html_image_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(border);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$178, thread);
			}
			html_markup(html_macros.$html_image_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_indent(ONE_INTEGER);
		return v_term;
	}

	public static SubLObject cb_c_gaf_arg_header(final SubLObject arg) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $cb_c_gaf_arg_show_arg_headerP$.getDynamicValue(thread)) {
			if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
				html_princ($str160$___);
			}
			format(html_macros.$html_stream$.getDynamicValue(thread), $str323$GAF_Arg____A, arg);
			html_newline(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_c_nart_arg_header(final SubLObject arg) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_markup(html_macros.$html_big_head$.getGlobalValue());
		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
			html_princ($str160$___);
		}
		format(html_macros.$html_stream$.getDynamicValue(thread), $str324$NART_Arg____A, arg);
		html_markup(html_macros.$html_big_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_mt_header(final SubLObject mt, SubLObject last_mt, SubLObject strongP, SubLObject newline_at_endP) {
		if (last_mt == UNPROVIDED) {
			last_mt = NIL;
		}
		if (strongP == UNPROVIDED) {
			strongP = NIL;
		}
		if (newline_at_endP == UNPROVIDED) {
			newline_at_endP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $cb_c_gaf_arg_show_mt_headerP$.getDynamicValue(thread)) {
			html_markup(html_macros.$html_span_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($str325$mt_header);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				if (NIL == hlmt.hlmt_equal(mt, last_mt)) {
					html_newline(UNPROVIDED);
					if (NIL != strongP) {
						html_markup(html_macros.$html_strong_head$.getGlobalValue());
						cb_c_mt_header_int(mt, last_mt);
						html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					} else {
						cb_c_mt_header_int(mt, last_mt);
					}
					if (NIL != newline_at_endP) {
						html_newline(UNPROVIDED);
					}
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_span_tail$.getGlobalValue());
			return NIL;
		}
		return NIL;
	}

	public static SubLObject cb_c_mt_header_int(final SubLObject mt, final SubLObject last_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
			html_princ($str175$In_Mt___);
			cb_form(mt, UNPROVIDED, UNPROVIDED);
			html_princ($str177$__);
		} else if (NIL == hlmt.hlmts_supportedP()) {
			html_princ($str176$Mt___);
			cb_show_term(mt, UNPROVIDED, UNPROVIDED);
		} else {
			final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
			SubLObject time_interval = NIL;
			SubLObject time_parameter = NIL;
			thread.resetMultipleValues();
			final SubLObject time_interval_$179 = hlmt.explode_hlmt_temporal_facets_with_defaults(mt);
			final SubLObject time_parameter_$180 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			time_interval = time_interval_$179;
			time_parameter = time_parameter_$180;
			if ((NIL != hlmt.default_mt_time_interval_p(time_interval)) && (NIL != hlmt.default_mt_time_parameter_p(time_parameter))) {
				cb_show_monadic_mt_header(monad_mt);
			} else {
				cb_show_naut_mt_header(monad_mt, time_interval, time_parameter);
			}
		}

		return NIL;
	}

	public static SubLObject cb_show_monadic_mt_header(final SubLObject monad_mt) {
		html_princ($str176$Mt___);
		cb_show_term(monad_mt, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_show_naut_mt_header(final SubLObject monad_mt, final SubLObject time_interval, final SubLObject time_parameter) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != hlmt.time_point_mt_time_parameter_p(time_parameter)) {
			if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list326, time_interval)) {
				final SubLObject end = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(time_interval, UNPROVIDED), UNPROVIDED);
				cb_show_monadic_mt_header(monad_mt);
				html_indent(UNPROVIDED);
				html_princ($$$throughout_some_time_before);
				html_indent(UNPROVIDED);
				cb_show_time_interval_in_mt_header(end);
			} else if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list328, time_interval)) {
				final SubLObject start = cycl_utilities.formula_arg1(time_interval, UNPROVIDED);
				cb_show_monadic_mt_header(monad_mt);
				html_indent(UNPROVIDED);
				html_princ($$$since);
				html_indent(UNPROVIDED);
				cb_show_time_interval_in_mt_header(start);
			} else if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list330, time_interval)) {
				thread.resetMultipleValues();
				final SubLObject success = pattern_match.tree_matches_pattern(time_interval, $list331);
				final SubLObject v_bindings = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != success) {
					final SubLObject end2 = list_utilities.alist_lookup_without_values(v_bindings, END, UNPROVIDED, UNPROVIDED);
					final SubLObject start2 = list_utilities.alist_lookup_without_values(v_bindings, START, UNPROVIDED, UNPROVIDED);
					cb_show_monadic_mt_header(monad_mt);
					html_indent(UNPROVIDED);
					html_princ($$$throughout);
					html_indent(UNPROVIDED);
					cb_show_time_interval_in_mt_header(start2);
					html_indent(UNPROVIDED);
					html_princ($$$until);
					html_indent(UNPROVIDED);
					cb_show_time_interval_in_mt_header(end2);
				}
			} else {
				cb_show_monadic_mt_header(monad_mt);
				html_indent(UNPROVIDED);
				html_princ($$$throughout);
				html_indent(UNPROVIDED);
				cb_show_time_interval_in_mt_header(time_interval);
			}

		} else {
			if (NIL == hlmt.default_mt_time_parameter_p(time_parameter)) {
				html_princ($$$Monadic_);
				cb_show_monadic_mt_header(monad_mt);
				html_newline(UNPROVIDED);
				html_princ($str341$Time_Interval___);
				cb_show_term(time_interval, UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
				html_princ($str342$Time_Parameter___);
				cb_show_term(time_parameter, UNPROVIDED, UNPROVIDED);
				return NIL;
			}
			if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list326, time_interval)) {
				final SubLObject end = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(time_interval, UNPROVIDED), UNPROVIDED);
				cb_show_monadic_mt_header(monad_mt);
				html_indent(UNPROVIDED);
				html_princ($$$during_some_time_before);
				html_indent(UNPROVIDED);
				cb_show_time_interval_in_mt_header(end);
			} else if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list328, time_interval)) {
				final SubLObject start = cycl_utilities.formula_arg1(time_interval, UNPROVIDED);
				cb_show_monadic_mt_header(monad_mt);
				html_indent(UNPROVIDED);
				html_princ($$$from);
				html_indent(UNPROVIDED);
				cb_show_time_interval_in_mt_header(start);
				html_indent(UNPROVIDED);
				html_princ($$$until_now);
			} else if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list330, time_interval)) {
				thread.resetMultipleValues();
				final SubLObject success = pattern_match.tree_matches_pattern(time_interval, $list331);
				final SubLObject v_bindings = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != success) {
					final SubLObject end2 = list_utilities.alist_lookup_without_values(v_bindings, END, UNPROVIDED, UNPROVIDED);
					final SubLObject start2 = list_utilities.alist_lookup_without_values(v_bindings, START, UNPROVIDED, UNPROVIDED);
					cb_show_monadic_mt_header(monad_mt);
					html_indent(UNPROVIDED);
					html_princ($$$from);
					html_indent(UNPROVIDED);
					cb_show_time_interval_in_mt_header(start2);
					html_indent(UNPROVIDED);
					html_princ($$$until);
					html_indent(UNPROVIDED);
					cb_show_time_interval_in_mt_header(end2);
				}
			} else {
				cb_show_monadic_mt_header(monad_mt);
				html_indent(UNPROVIDED);
				html_princ($$$in);
				html_indent(UNPROVIDED);
				cb_show_time_interval_in_mt_header(time_interval);
			}

		}
		return NIL;
	}

	public static SubLObject cb_show_time_interval_in_mt_header(final SubLObject time_interval) {
		if ((NIL != el_formula_with_operator_p(time_interval, $$DateFromStringFn)) && (NIL != el_unary_formula_p(time_interval))) {
			return html_princ(cycl_utilities.formula_arg1(time_interval, UNPROVIDED));
		}
		if (NIL != date_utilities.el_date_year_p(time_interval)) {
			return html_princ(cycl_utilities.formula_arg1(time_interval, UNPROVIDED));
		}
		if (NIL != date_utilities.simple_el_date_p(time_interval)) {
			final SubLObject optimized_time_interval = cb_possibly_optimize_date_for_display(time_interval);
			if (!optimized_time_interval.equal(time_interval)) {
				return cb_show_time_interval_in_mt_header(optimized_time_interval);
			}
		}
		return cb_show_term(time_interval, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cb_c_pred_header(final SubLObject pred) {
		html_newline(UNPROVIDED);
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_princ($str344$Predicate___);
		cb_show_term(pred, UNPROVIDED, UNPROVIDED);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_binary_pred_header(final SubLObject predicate, SubLObject negatedP) {
		if (negatedP == UNPROVIDED) {
			negatedP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		if (NIL != negatedP) {
			final SubLObject negation_phrase = ($SILK == $cb_major_presentation_language$.getDynamicValue(thread)) ? $$$neg : $$$not;
			final SubLObject color_val = $RED;
			html_markup(html_macros.$html_font_head$.getGlobalValue());
			if (NIL != color_val) {
				html_markup(html_macros.$html_font_color$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_color(color_val));
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(negation_phrase);
				html_indent(UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_font_tail$.getGlobalValue());
		}
		cb_show_term(predicate, UNPROVIDED, UNPROVIDED);
		html_princ($str128$___);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_c_gaf_arg_and_extent(final SubLObject args) {
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list254);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject arg_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list254);
		current = current.rest();
		final SubLObject pred_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list254);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list254);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(args, $list254);
			return NIL;
		}
		final SubLObject index_hook = cb_guess_index(index_spec);
		SubLObject arg = NIL;
		SubLObject predicate = NIL;
		SubLObject mt = NIL;
		if (NIL == cb_index_hook_p(index_hook)) {
			return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != arg_string) {
			arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
			if (!arg.isFixnum()) {
				return cb_error($str255$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != pred_spec) {
				predicate = cb_guess_fort(pred_spec, UNPROVIDED);
				if (NIL == forts.fort_p(predicate)) {
					return cb_error($str107$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str256$Could_not_determine_a_microtheory, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
				}
			}
		}
		return cb_c_gaf_arg_and_extent_guts(index_hook, arg, predicate, mt);
	}

	public static SubLObject cb_c_gaf_arg_and_extent_guts(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL != forts.fort_p(index_hook)) && (NIL == mt)) && ($INFERRED == cb_frames.$cb_default_index_view$.getDynamicValue(thread))) {
			return cb_inferred_index.cb_inferred_gaf_arg_assertions_guts(index_hook, index_hook, arg, predicate);
		}
		final SubLObject title_var;
		final SubLObject title = title_var = format(NIL, $str347$Predicate_extent_index_for__S, index_hook);
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$181 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				if (NIL != title_var) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title_var);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				dhtml_macros.html_basic_cb_scripts();
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$182 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$183 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$184 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($str168$reloadCurrentFrame__reloadFrameBu);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$184, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						cb_possibly_show_followup_widget(index_hook);
						cb_c_term_header(index_hook);
						html_newline(TWO_INTEGER);
						cb_c_gaf_arg_internal(index_hook, arg, predicate, mt);
						html_hr(UNPROVIDED, UNPROVIDED);
						if (NIL != fort_types_interface.predicate_in_any_mtP(index_hook)) {
							cb_c_predicate_extent_internal(index_hook, mt);
						} else if (NIL != fort_types_interface.function_in_any_mtP(index_hook)) {
							cb_c_function_extent_internal(index_hook);
						}

						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$183, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$182, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$181, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_extent(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list348);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list348);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject mt = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != mt_spec) {
				mt = cb_guess_hlmt(mt_spec);
				if (NIL == hlmt.hlmt_p(mt)) {
					return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str347$Predicate_extent_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$185 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$186 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$188, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_predicate_extent_internal(index_hook, mt);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$187, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$186, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$185, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list348);
		}
		return NIL;
	}

	public static SubLObject cb_link_predicate_extent(final SubLObject index_hook, final SubLObject count, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str350$cb_c_predicate_extent__A, cb_index_identifier(index_hook));
		if (NIL != mt) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else {
				html_princ($$$Predicate_Extent);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_predicate_extent_internal(final SubLObject index_hook, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_markup(html_macros.$html_big_head$.getGlobalValue());
			cb_c_type(index_hook);
			html_princ($str353$_Extent__);
			html_markup(html_macros.$html_big_tail$.getGlobalValue());
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			final SubLObject _prev_bind_0_$189 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
			try {
				pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
				thread.resetMultipleValues();
				final SubLObject _prev_bind_0_$190 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
				try {
					pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
					final SubLObject reuseP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					try {
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$191 = pph_macros.$pph_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
							final SubLObject new_or_reused = thread.secondMultipleValue();
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$192 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
							try {
								pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
								final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
								final SubLObject _prev_bind_0_$193 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
									try {
										final SubLObject _prev_bind_0_$194 = pph_vars.$pph_language_mt$.currentBinding(thread);
										final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
										try {
											pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
											pph_vars.$paraphrase_mode$.bind($HTML, thread);
											if (NIL != mt) {
												cb_c_predicate_extent_rec_mt(index_hook, mt);
											} else {
												cb_c_predicate_extent_rec(index_hook);
											}
										} finally {
											pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
											pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$194, thread);
										}
									} finally {
										final SubLObject _prev_bind_0_$195 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											final SubLObject _values = getValuesAsVector();
											memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
											restoreValuesFromVector(_values);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$195, thread);
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_$193, thread);
								}
							} finally {
								pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$192, thread);
							}
							if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
								memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
							}
						} finally {
							pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$191, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$196 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							if (NIL == reuseP) {
								pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
							}
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$196, thread);
						}
					}
				} finally {
					pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$190, thread);
				}
			} finally {
				pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$189, thread);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_extent_rec(final SubLObject index_hook) {
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_predicate_extent_index(index_hook);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_predicate_extent_rec_mt(index_hook, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_extent_rec_mt(final SubLObject index_hook, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_predicate_extent_index(assertion_link_fn, index_hook, NIL, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_function_extent(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str354$Function_extent_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$197 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$198 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_function_extent_internal(index_hook);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$199, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$198, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$197, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_function_extent(final SubLObject index_hook, final SubLObject count) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str356$cb_c_function_extent__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Function_Extent);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_function_extent_internal(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_markup(html_macros.$html_big_head$.getGlobalValue());
			cb_c_type(index_hook);
			html_princ($str353$_Extent__);
			html_markup(html_macros.$html_big_tail$.getGlobalValue());
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_newline(TWO_INTEGER);
			final SubLObject _prev_bind_0_$201 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
			try {
				pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
				thread.resetMultipleValues();
				final SubLObject _prev_bind_0_$202 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
				try {
					pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
					final SubLObject reuseP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					try {
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$203 = pph_macros.$pph_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
							final SubLObject new_or_reused = thread.secondMultipleValue();
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$204 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
							try {
								pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
								final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
								final SubLObject _prev_bind_0_$205 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
									try {
										final SubLObject _prev_bind_0_$206 = pph_vars.$pph_language_mt$.currentBinding(thread);
										final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
										try {
											pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
											pph_vars.$paraphrase_mode$.bind($HTML, thread);
											cb_c_function_extent_rec(index_hook);
										} finally {
											pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
											pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$206, thread);
										}
									} finally {
										final SubLObject _prev_bind_0_$207 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											final SubLObject _values = getValuesAsVector();
											memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
											restoreValuesFromVector(_values);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$207, thread);
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_$205, thread);
								}
							} finally {
								pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$204, thread);
							}
							if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
								memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
							}
						} finally {
							pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$203, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$208 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							if (NIL == reuseP) {
								pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
							}
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
						}
					}
				} finally {
					pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$202, thread);
				}
			} finally {
				pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$201, thread);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_function_extent_rec(final SubLObject index_hook) {
		kb_mapping.map_function_extent_index(symbol_function(CB_TERM_OF_UNIT_LINK), index_hook);
		return NIL;
	}

	public static SubLObject cb_c_predicate_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list359);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject sense_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject sense = NIL;
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != direction_string) {
						direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
						if (NIL == enumeration_types.direction_p(direction)) {
							return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str362$Predicate_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$209 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$210 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$211 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$212 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$212, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_predicate_rule_internal(index_hook, sense, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$211, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$210, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$209, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list359);
		}
		return NIL;
	}

	public static SubLObject cb_link_predicate_rule(final SubLObject index_hook, final SubLObject count, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str364$cb_c_predicate_rule__A, cb_index_identifier(index_hook));
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != mt) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				if (NIL != direction) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_predicate_rule_internal(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$213 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$214 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$215 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$216 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$217 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
									final SubLObject _prev_bind_4 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_predicate_rule_rec(index_hook);
										} else if (NIL == mt) {
											cb_c_predicate_rule_rec_sense(index_hook, sense);
										} else {
											cb_c_sense_header(sense, UNPROVIDED);
											if (NIL == direction) {
												cb_c_predicate_rule_rec_sense_mt(index_hook, sense, mt);
											} else {
												cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												cb_c_predicate_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
											}
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_4, thread);
										pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$217, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$218 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$218, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$216, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$215, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$214, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$219 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$219, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$213, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_rule_rec(final SubLObject index_hook) {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_predicate_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_predicate_rule_rec_sense(index_hook, sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_rule_rec_sense(final SubLObject index_hook, final SubLObject sense) {
		cb_c_sense_header(sense, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_predicate_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_predicate_rule_rec_sense_mt(index_hook, sense, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_rule_rec_sense_mt(final SubLObject index_hook, final SubLObject sense, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_predicate_rule_index(index_hook, sense, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_predicate_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_predicate_rule_rec_sense_mt_direction(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_predicate_rule_index(assertion_link_fn, index_hook, sense, direction, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_decontextualized_ist_predicate_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list371);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject sense_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list371);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list371);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject sense = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != direction_string) {
					direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
					if (NIL == enumeration_types.direction_p(direction)) {
						return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str372$ist_Predicate_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$220 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$221 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$223, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_decontextualized_ist_predicate_rule_internal(index_hook, sense, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$222, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$221, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$220, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list371);
		}
		return NIL;
	}

	public static SubLObject cb_link_decontextualized_ist_predicate_rule(final SubLObject index_hook, final SubLObject count, SubLObject sense, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str374$cb_c_decontextualized_ist_predica, cb_index_identifier(index_hook));
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != direction) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_Lifting_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_decontextualized_ist_predicate_rule_internal(final SubLObject index_hook, final SubLObject sense, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$224 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$225 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$226 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$227 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$228 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
									final SubLObject _prev_bind_4 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_decontextualized_ist_predicate_rule_rec(index_hook);
										} else if (NIL == direction) {
											cb_c_decontextualized_ist_predicate_rule_rec_sense(index_hook, sense);
										} else {
											cb_c_decontextualized_ist_predicate_rule_rec_sense_direction(index_hook, sense, direction);
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_4, thread);
										pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$228, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$229 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$229, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$227, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$226, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$225, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$230 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$224, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_decontextualized_ist_predicate_rule_rec(final SubLObject index_hook) {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_decontextualized_ist_predicate_rule_index(index_hook, sense, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_decontextualized_ist_predicate_rule_rec_sense(index_hook, sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_decontextualized_ist_predicate_rule_rec_sense(final SubLObject index_hook, final SubLObject sense) {
		cb_c_sense_header(sense, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_decontextualized_ist_predicate_rule_index(index_hook, sense, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_decontextualized_ist_predicate_rule_rec_sense_direction(index_hook, sense, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_decontextualized_ist_predicate_rule_rec_sense_direction(final SubLObject index_hook, final SubLObject sense, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK_WITH_MT);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			kb_mapping.map_decontextualized_ist_predicate_rule_index(assertion_link_fn, index_hook, sense, direction);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_isa_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list359);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject sense_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject sense = NIL;
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != direction_string) {
						direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
						if (NIL == enumeration_types.direction_p(direction)) {
							return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str377$isa_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$231 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$232 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$233 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$234 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$234, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_isa_rule_internal(index_hook, sense, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$233, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$232, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$231, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list359);
		}
		return NIL;
	}

	public static SubLObject cb_link_isa_rule(final SubLObject index_hook, final SubLObject count, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str379$cb_c_isa_rule__A, cb_index_identifier(index_hook));
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != mt) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				if (NIL != direction) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_isa_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_isa_rule_internal(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$235 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$236 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$237 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$238 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$239 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_isa_rule_rec(index_hook);
										} else if (NIL == mt) {
											cb_c_isa_rule_rec_sense(index_hook, sense);
										} else {
											cb_c_sense_header(sense, $$$isa);
											if (NIL == direction) {
												cb_c_isa_rule_rec_sense_mt(index_hook, sense, mt);
											} else {
												cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												cb_c_isa_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
											}
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$239, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$240 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$240, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$238, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$237, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$236, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$241 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$241, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$235, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_isa_rule_rec(final SubLObject index_hook) {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_isa_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_isa_rule_rec_sense(index_hook, sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_isa_rule_rec_sense(final SubLObject index_hook, final SubLObject sense) {
		cb_c_sense_header(sense, $$$isa);
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_isa_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_isa_rule_rec_sense_mt(index_hook, sense, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_isa_rule_rec_sense_mt(final SubLObject index_hook, final SubLObject sense, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_isa_rule_index(index_hook, sense, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_isa_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_isa_rule_rec_sense_mt_direction(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_isa_rule_index(assertion_link_fn, index_hook, sense, direction, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_quoted_isa_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list359);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject sense_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject sense = NIL;
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != direction_string) {
						direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
						if (NIL == enumeration_types.direction_p(direction)) {
							return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str383$quoted_isa_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$242 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$243 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$244 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$245 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$245, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_quoted_isa_rule_internal(index_hook, sense, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$244, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$243, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$242, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list359);
		}
		return NIL;
	}

	public static SubLObject cb_link_quoted_isa_rule(final SubLObject index_hook, final SubLObject count, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str385$cb_c_quoted_isa_rule__A, cb_index_identifier(index_hook));
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != mt) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				if (NIL != direction) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_quoted_isa_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_quoted_isa_rule_internal(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$246 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$247 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$248 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$249 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$250 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_quoted_isa_rule_rec(index_hook);
										} else if (NIL == mt) {
											cb_c_quoted_isa_rule_rec_sense(index_hook, sense);
										} else {
											cb_c_sense_header(sense, $$$quoted_isa);
											if (NIL == direction) {
												cb_c_quoted_isa_rule_rec_sense_mt(index_hook, sense, mt);
											} else {
												cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												cb_c_quoted_isa_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
											}
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$250, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$251 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$251, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$249, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$248, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$247, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$252 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$252, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$246, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_quoted_isa_rule_rec(final SubLObject index_hook) {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_quoted_isa_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_quoted_isa_rule_rec_sense(index_hook, sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_quoted_isa_rule_rec_sense(final SubLObject index_hook, final SubLObject sense) {
		cb_c_sense_header(sense, $$$quoted_isa);
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_quoted_isa_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_quoted_isa_rule_rec_sense_mt(index_hook, sense, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_quoted_isa_rule_rec_sense_mt(final SubLObject index_hook, final SubLObject sense, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_quoted_isa_rule_index(index_hook, sense, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_quoted_isa_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_quoted_isa_rule_rec_sense_mt_direction(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_quoted_isa_rule_index(assertion_link_fn, index_hook, sense, direction, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_genls_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list359);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject sense_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject sense = NIL;
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != direction_string) {
						direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
						if (NIL == enumeration_types.direction_p(direction)) {
							return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str389$genls_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$253 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$254 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$255 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$256 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$256, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_genls_rule_internal(index_hook, sense, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$255, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$254, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$253, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list359);
		}
		return NIL;
	}

	public static SubLObject cb_link_genls_rule(final SubLObject index_hook, final SubLObject count, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str391$cb_c_genls_rule__A, cb_index_identifier(index_hook));
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != mt) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				if (NIL != direction) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_genls_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_genls_rule_internal(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$257 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$258 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$259 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$260 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$261 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_genls_rule_rec(index_hook);
										} else if (NIL == mt) {
											cb_c_genls_rule_rec_sense(index_hook, sense);
										} else {
											cb_c_sense_header(sense, $$$genls);
											if (NIL == direction) {
												cb_c_genls_rule_rec_sense_mt(index_hook, sense, mt);
											} else {
												cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												cb_c_genls_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
											}
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$261, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$262 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$262, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$260, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$259, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$258, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$263 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$263, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$257, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_genls_rule_rec(final SubLObject index_hook) {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_genls_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_genls_rule_rec_sense(index_hook, sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_genls_rule_rec_sense(final SubLObject index_hook, final SubLObject sense) {
		cb_c_sense_header(sense, $$$genls);
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_genls_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_genls_rule_rec_sense_mt(index_hook, sense, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_genls_rule_rec_sense_mt(final SubLObject index_hook, final SubLObject sense, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_genls_rule_index(index_hook, sense, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_genls_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_genls_rule_rec_sense_mt_direction(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_genls_rule_index(assertion_link_fn, index_hook, sense, direction, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_genl_mt_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list359);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject sense_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list359);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject sense = NIL;
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != direction_string) {
						direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
						if (NIL == enumeration_types.direction_p(direction)) {
							return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str395$genlMt_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$264 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$265 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$266 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$267 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$267, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_genl_mt_rule_internal(index_hook, sense, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$266, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$265, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$264, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list359);
		}
		return NIL;
	}

	public static SubLObject cb_link_genl_mt_rule(final SubLObject index_hook, final SubLObject count, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str397$cb_c_genl_mt_rule__A, cb_index_identifier(index_hook));
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != mt) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				if (NIL != direction) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_genlMt_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_genl_mt_rule_internal(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$268 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$269 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$270 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$271 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$272 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_genl_mt_rule_rec(index_hook);
										} else if (NIL == mt) {
											cb_c_genl_mt_rule_rec_sense(index_hook, sense);
										} else {
											cb_c_sense_header(sense, $$$genlMt);
											if (NIL == direction) {
												cb_c_genl_mt_rule_rec_sense_mt(index_hook, sense, mt);
											} else {
												cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												cb_c_genl_mt_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
											}
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$272, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$273 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$273, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$271, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$270, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$269, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$274 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$274, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$268, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_genl_mt_rule_rec(final SubLObject index_hook) {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_genl_mt_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_genl_mt_rule_rec_sense(index_hook, sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_genl_mt_rule_rec_sense(final SubLObject index_hook, final SubLObject sense) {
		cb_c_sense_header(sense, $$$genlMt);
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_genl_mt_rule_index(index_hook, sense, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_genl_mt_rule_rec_sense_mt(index_hook, sense, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_genl_mt_rule_rec_sense_mt(final SubLObject index_hook, final SubLObject sense, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_genl_mt_rule_index(index_hook, sense, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_genl_mt_rule_rec_sense_mt_direction(index_hook, sense, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_genl_mt_rule_rec_sense_mt_direction(final SubLObject index_hook, final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_genl_mt_rule_index(assertion_link_fn, index_hook, sense, direction, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_function_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list401);
		index_spec = args.first();
		SubLObject current = args.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list401);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list401);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != mt_spec) {
				mt = cb_guess_hlmt(mt_spec);
				if (NIL == hlmt.hlmt_p(mt)) {
					return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != direction_string) {
					direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
					if (NIL == enumeration_types.direction_p(direction)) {
						return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str402$Function_rule_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$275 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$276 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$277 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$278 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$278, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_function_rule_internal(index_hook, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$277, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$276, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$275, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list401);
		}
		return NIL;
	}

	public static SubLObject cb_link_function_rule(final SubLObject index_hook, final SubLObject count, SubLObject mt, SubLObject direction) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str404$cb_c_function_rule__A, cb_index_identifier(index_hook));
		if (NIL != mt) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
			if (NIL != direction) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$Function_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_function_rule_internal(final SubLObject index_hook, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_markup(html_macros.$html_big_head$.getGlobalValue());
		cb_c_type(index_hook);
		html_princ($str407$_Rules__);
		html_markup(html_macros.$html_big_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$279 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$280 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$281 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$282 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$283 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == mt) {
											cb_c_function_rule_rec(index_hook);
										} else if (NIL == direction) {
											cb_c_function_rule_rec_mt(index_hook, mt);
										} else {
											cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											cb_c_function_rule_rec_mt_direction(index_hook, mt, direction);
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$283, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$284 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$284, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$282, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$281, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$280, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$285 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$285, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$279, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_function_rule_rec(final SubLObject index_hook) {
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_function_rule_index(index_hook, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_function_rule_rec_mt(index_hook, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_function_rule_rec_mt(final SubLObject index_hook, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_function_rule_index(index_hook, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_function_rule_rec_mt_direction(index_hook, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_function_rule_rec_mt_direction(final SubLObject index_hook, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			kb_mapping.map_function_rule_index(assertion_link_fn, index_hook, direction, mt);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_unbound_rule(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject sense_string = (args.isCons()) ? args.first() : NIL;
		destructuring_bind_must_listp(args, args, $list408);
		SubLObject current = args.rest();
		final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list408);
		current = current.rest();
		final SubLObject direction_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, args, $list408);
		current = current.rest();
		if (NIL == current) {
			final SubLObject index_hook = auxiliary_indexing.unbound_rule_index();
			SubLObject sense = NIL;
			SubLObject mt = NIL;
			SubLObject direction = NIL;
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str409$Could_not_determine_an_index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != sense_string) {
				sense = read_from_string_ignoring_errors(sense_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (NIL == enumeration_types.sense_p(sense)) {
					return cb_error($str360$Could_not_determine_a_literal_sen, sense_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				if (NIL != mt_spec) {
					mt = cb_guess_hlmt(mt_spec);
					if (NIL == hlmt.hlmt_p(mt)) {
						return cb_error($str107$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					if (NIL != direction_string) {
						direction = read_from_string_ignoring_errors(direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
						if (NIL == enumeration_types.direction_p(direction)) {
							return cb_error($str361$Could_not_determine_a_direction_f, direction_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $$$Unbound_rule_index);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$286 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$287 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$288 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$289 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$289, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_unbound_rule_internal(sense, mt, direction);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$288, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$287, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$286, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list408);
		}
		return NIL;
	}

	public static SubLObject cb_link_unbound_rule(final SubLObject count, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str412$cb_c_unbound_rule);
		if (NIL != sense) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, sense);
			if (NIL != mt) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str260$__a, cb_hlmt_identifier(mt));
				if (NIL != direction) {
					format(html_macros.$html_stream$.getDynamicValue(thread), $str365$__s, direction);
				}
			}
		}
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != direction) {
				cb_show_direction(direction);
			} else if (NIL != mt) {
				cb_show_assertion_hlmt_readably(mt);
			} else if (NIL != sense) {
				final SubLObject pcase_var = sense;
				if (pcase_var.eql($NEG)) {
					html_princ($$$Antecedent);
				} else if (pcase_var.eql($POS)) {
					html_princ($$$Consequent);
				} else {
					html_princ(sense);
				}

			} else {
				format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_Rules);
			}

		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return auxiliary_indexing.unbound_rule_index();
	}

	public static SubLObject cb_c_unbound_rule_internal(final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$290 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$291 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$292 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$293 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$294 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL == sense) {
											cb_c_unbound_rule_rec();
										} else if (NIL == mt) {
											cb_c_unbound_rule_rec_sense(sense);
										} else {
											cb_c_sense_header(sense, UNPROVIDED);
											if (NIL == direction) {
												cb_c_unbound_rule_rec_sense_mt(sense, mt);
											} else {
												cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												cb_c_unbound_rule_rec_sense_mt_direction(sense, mt, direction);
											}
										}

									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$294, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$295 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$295, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$293, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$292, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$291, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$296 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$290, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_unbound_rule_rec() {
		SubLObject some_sense_done = NIL;
		SubLObject cdolist_list_var = $list370;
		SubLObject sense = NIL;
		sense = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (cb_relevant_num_unbound_rule_index(sense, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
				if (NIL != some_sense_done) {
					html_hr(UNPROVIDED, UNPROVIDED);
				}
				cb_c_unbound_rule_rec_sense(sense);
				some_sense_done = T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_unbound_rule_rec_sense(final SubLObject sense) {
		cb_c_sense_header(sense, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject mts = cdolist_list_var = cb_relevant_key_unbound_rule_index(sense, UNPROVIDED, UNPROVIDED);
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_unbound_rule_rec_sense_mt(sense, mt);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_unbound_rule_rec_sense_mt(final SubLObject sense, final SubLObject mt) {
		cb_c_mt_header(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject directions = cdolist_list_var = cb_relevant_key_unbound_rule_index(sense, mt, UNPROVIDED);
		SubLObject direction = NIL;
		direction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cb_c_unbound_rule_rec_sense_mt_direction(sense, mt, direction);
			cdolist_list_var = cdolist_list_var.rest();
			direction = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cb_c_unbound_rule_rec_sense_mt_direction(final SubLObject sense, final SubLObject mt, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cb_c_direction_header(direction);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(auxiliary_indexing.unbound_rule_index())) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			auxiliary_indexing.map_unbound_rule_mt_index(assertion_link_fn, sense, mt, direction);
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_sense_header(final SubLObject sense, SubLObject predicate_string) {
		if (predicate_string == UNPROVIDED) {
			predicate_string = NIL;
		}
		html_markup(html_macros.$html_big_head$.getGlobalValue());
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		if (NIL != predicate_string) {
			html_princ(predicate_string);
			html_princ($$$_);
		}
		if (sense.eql($NEG)) {
			html_princ($$$Antecedent_Rules);
		} else if (sense.eql($POS)) {
			html_princ($$$Consequent_Rules);
		} else {
			html_princ(sense);
		}

		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_markup(html_macros.$html_big_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_direction_header(final SubLObject direction) {
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_princ($str417$Direction___);
		cb_show_direction(direction);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_ist(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_term(index_spec, UNPROVIDED);
			if (NIL == hlmt.hlmt_p(index_hook)) {
				return cb_error($str107$Could_not_determine_a_term_from__, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str418$MT_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$297 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$298 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$299 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$300 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$300, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_ist_internal(index_hook);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$299, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$298, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$297, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_ist(final SubLObject index_hook, final SubLObject count) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str420$cb_c_ist__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Microtheory_Contents);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_link_ist_broad(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str420$cb_c_ist__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Microtheory_Contents);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		html_princ($str423$__expensive__);
		return index_hook;
	}

	public static SubLObject cb_c_ist_internal(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_markup(html_macros.$html_big_head$.getGlobalValue());
		html_princ($str425$Microtheory_Contents__);
		html_markup(html_macros.$html_big_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(TWO_INTEGER);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			if (NIL != hlmt.hlmt_naut_p(index_hook)) {
				kb_mapping.map_hlmt_contents(assertion_link_fn, index_hook, NIL, NIL);
			} else {
				kb_mapping.map_mt_contents(assertion_link_fn, index_hook, NIL, NIL);
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_mt_gafs(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_term(index_spec, UNPROVIDED);
			if (NIL == hlmt.hlmt_p(index_hook)) {
				return cb_error($str107$Could_not_determine_a_term_from__, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str426$MT_GAFs_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$301 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$302 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$303 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$304 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$304, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_mt_gafs_internal(index_hook);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$303, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$302, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$301, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_mt_gafs(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str428$cb_c_mt_gafs__A, cb_index_identifier(mt));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Microtheory_GAFs);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		html_princ($str430$____);
		return NIL;
	}

	public static SubLObject cb_c_mt_gafs_internal(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_markup(html_macros.$html_big_head$.getGlobalValue());
		html_princ($str432$Microtheory_GAFs__);
		html_markup(html_macros.$html_big_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		final SubLObject mt_gafs = (NIL != hlmt.hlmt_naut_p(mt)) ? cb_c_gather_hlmt_gafs(mt) : cb_c_gather_mt_gafs(mt);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(mt)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			SubLObject last_term = NIL;
			SubLObject cdolist_list_var = mt_gafs;
			SubLObject gaf = NIL;
			gaf = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject current_term = assertions_high.gaf_arg1(gaf);
				if (!current_term.eql(last_term)) {
					html_newline(UNPROVIDED);
				}
				last_term = current_term;
				funcall(assertion_link_fn, gaf);
				cdolist_list_var = cdolist_list_var.rest();
				gaf = cdolist_list_var.first();
			}
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_gather_mt_gafs(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject gafs = NIL;
		final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
		if (pcase_var.eql($MT)) {
			if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, $GAF)) {
				final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
				SubLObject final_index_iterator = NIL;
				try {
					final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
					SubLObject done_var = NIL;
					final SubLObject token_var = NIL;
					while (NIL == done_var) {
						final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
						final SubLObject valid = makeBoolean(!token_var.eql(ass));
						if (NIL != valid) {
							gafs = cons(ass, gafs);
						}
						done_var = makeBoolean(NIL == valid);
					}
				} finally {
					final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						if (NIL != final_index_iterator) {
							kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
					}
				}
			}
		} else if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, $GAF))) {
			final SubLObject idx = assertion_handles.do_assertions_table();
			final SubLObject mess = $str436$do_broad_mt_index;
			final SubLObject total = id_index_count(idx);
			SubLObject sofar = ZERO_INTEGER;
			assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
			final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
			final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
			final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
			final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
			try {
				$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
				$last_percent_progress_prediction$.bind(NIL, thread);
				$within_noting_percent_progress$.bind(T, thread);
				$percent_progress_start_time$.bind(get_universal_time(), thread);
				try {
					noting_percent_progress_preamble(mess);
					final SubLObject idx_$305 = idx;
					if (NIL == id_index_objects_empty_p(idx_$305, $SKIP)) {
						final SubLObject idx_$306 = idx_$305;
						if (NIL == id_index_dense_objects_empty_p(idx_$306, $SKIP)) {
							final SubLObject vector_var = id_index_dense_objects(idx_$306);
							final SubLObject backwardP_var = NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject a_id;
							SubLObject a_handle;
							SubLObject ass2;
							for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
								a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
								a_handle = aref(vector_var, a_id);
								if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
									if (NIL != id_index_tombstone_p(a_handle)) {
										a_handle = $SKIP;
									}
									ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
									if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, $GAF, NIL)) {
										gafs = cons(ass2, gafs);
									}
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
								}
							}
						}
						final SubLObject idx_$307 = idx_$305;
						if ((NIL == id_index_sparse_objects_empty_p(idx_$307)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							final SubLObject sparse = id_index_sparse_objects(idx_$307);
							SubLObject a_id2 = id_index_sparse_id_threshold(idx_$307);
							final SubLObject end_id = id_index_next_id(idx_$307);
							final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
							while (a_id2.numL(end_id)) {
								final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
								if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
									final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
									if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, $GAF, NIL)) {
										gafs = cons(ass3, gafs);
									}
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
								}
								a_id2 = add(a_id2, ONE_INTEGER);
							}
						}
					}
				} finally {
					final SubLObject _prev_bind_0_$308 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						noting_percent_progress_postamble();
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$308, thread);
					}
				}
			} finally {
				$percent_progress_start_time$.rebind(_prev_bind_5, thread);
				$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
				$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
				$last_percent_progress_index$.rebind(_prev_bind_2, thread);
			}
		}

		if (NIL != list_utilities.lengthLE(gafs, $int$1000, UNPROVIDED)) {
			gafs = assertion_utilities.sort_gafs_by_term(gafs, $sym440$CB_TERM__, $sym441$CB_PREDICATE__);
		} else {
			gafs = assertion_utilities.sort_assertions(gafs);
		}
		return gafs;
	}

	public static SubLObject cb_c_gather_hlmt_gafs(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject gafs = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list_utilities.flatten(mt), UNPROVIDED);
			SubLObject ass = NIL;
			ass = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(ass), mt)) {
					gafs = cons(ass, gafs);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return assertion_utilities.sort_gafs_by_term(gafs, $sym440$CB_TERM__, $sym441$CB_PREDICATE__);
	}

	public static SubLObject cb_term_L(final SubLObject term1, final SubLObject term2) {
		return kb_utilities.term_L(term1, term2, T, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cb_predicate_L(final SubLObject pred1, final SubLObject pred2) {
		return kb_utilities.definitional_pred_L(pred1, pred2, T);
	}

	public static SubLObject cb_c_mt_rules(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_fort(index_spec, UNPROVIDED);
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str107$Could_not_determine_a_term_from__, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str442$MT_Rules_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$309 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$310 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$311 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$312 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$312, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_mt_rules_internal(index_hook);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$311, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$310, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$309, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_mt_rules(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str444$cb_c_mt_rules__A, cb_index_identifier(mt));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Microtheory_Rules);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		html_princ($str430$____);
		return NIL;
	}

	public static SubLObject cb_c_mt_rules_internal(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_markup(html_macros.$html_big_head$.getGlobalValue());
		html_princ($str447$Microtheory_Rules__);
		html_markup(html_macros.$html_big_tail$.getGlobalValue());
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(TWO_INTEGER);
		final SubLObject mt_rules = cb_c_gather_mt_rules(mt);
		final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(mt)) ? symbol_function(CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK);
		final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
		try {
			$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
			SubLObject cdolist_list_var = mt_rules;
			SubLObject rule = NIL;
			rule = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				funcall(assertion_link_fn, rule);
				cdolist_list_var = cdolist_list_var.rest();
				rule = cdolist_list_var.first();
			}
		} finally {
			$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
			$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_c_gather_mt_rules(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rules = NIL;
		final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
		if (pcase_var.eql($MT)) {
			if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, $RULE)) {
				final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
				SubLObject final_index_iterator = NIL;
				try {
					final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
					SubLObject done_var = NIL;
					final SubLObject token_var = NIL;
					while (NIL == done_var) {
						final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
						final SubLObject valid = makeBoolean(!token_var.eql(ass));
						if (NIL != valid) {
							rules = cons(ass, rules);
						}
						done_var = makeBoolean(NIL == valid);
					}
				} finally {
					final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						if (NIL != final_index_iterator) {
							kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
					}
				}
			}
		} else if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, $RULE))) {
			final SubLObject idx = assertion_handles.do_assertions_table();
			final SubLObject mess = $str436$do_broad_mt_index;
			final SubLObject total = id_index_count(idx);
			SubLObject sofar = ZERO_INTEGER;
			assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
			final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
			final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
			final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
			final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
			try {
				$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
				$last_percent_progress_prediction$.bind(NIL, thread);
				$within_noting_percent_progress$.bind(T, thread);
				$percent_progress_start_time$.bind(get_universal_time(), thread);
				try {
					noting_percent_progress_preamble(mess);
					final SubLObject idx_$313 = idx;
					if (NIL == id_index_objects_empty_p(idx_$313, $SKIP)) {
						final SubLObject idx_$314 = idx_$313;
						if (NIL == id_index_dense_objects_empty_p(idx_$314, $SKIP)) {
							final SubLObject vector_var = id_index_dense_objects(idx_$314);
							final SubLObject backwardP_var = NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject a_id;
							SubLObject a_handle;
							SubLObject ass2;
							for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
								a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
								a_handle = aref(vector_var, a_id);
								if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
									if (NIL != id_index_tombstone_p(a_handle)) {
										a_handle = $SKIP;
									}
									ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
									if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, $RULE, NIL)) {
										rules = cons(ass2, rules);
									}
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
								}
							}
						}
						final SubLObject idx_$315 = idx_$313;
						if ((NIL == id_index_sparse_objects_empty_p(idx_$315)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							final SubLObject sparse = id_index_sparse_objects(idx_$315);
							SubLObject a_id2 = id_index_sparse_id_threshold(idx_$315);
							final SubLObject end_id = id_index_next_id(idx_$315);
							final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
							while (a_id2.numL(end_id)) {
								final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
								if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
									final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
									if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, $RULE, NIL)) {
										rules = cons(ass3, rules);
									}
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
								}
								a_id2 = add(a_id2, ONE_INTEGER);
							}
						}
					}
				} finally {
					final SubLObject _prev_bind_0_$316 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						noting_percent_progress_postamble();
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$316, thread);
					}
				}
			} finally {
				$percent_progress_start_time$.rebind(_prev_bind_5, thread);
				$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
				$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
				$last_percent_progress_index$.rebind(_prev_bind_2, thread);
			}
		}

		return assertion_utilities.sort_assertions(rules);
	}

	public static SubLObject cb_c_other(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(args, args, $list94);
		index_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject index_hook = cb_guess_index(index_spec);
			if (NIL == cb_index_hook_p(index_hook)) {
				return cb_error($str95$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			final SubLObject title_var;
			final SubLObject title = title_var = format(NIL, $str449$OTHER_index_for__S, index_hook);
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$317 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					dhtml_macros.html_basic_cb_scripts();
					dhtml_macros.dhtml_with_dom_script();
					dhtml_macros.dhtml_with_toggle_visibility_support();
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$318 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$319 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$320 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($str168$reloadCurrentFrame__reloadFrameBu);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$320, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							cb_c_term_header(index_hook);
							html_newline(TWO_INTEGER);
							cb_c_other_internal(index_hook);
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$319, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$318, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$317, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(args, $list94);
		}
		return NIL;
	}

	public static SubLObject cb_link_other(final SubLObject index_hook, final SubLObject count) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject frame_name_var = cb_frame_name($CONTENT);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str451$cb_c_other__A, cb_index_identifier(index_hook));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($$$Miscellaneous);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		if (count.numG(ONE_INTEGER)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str232$___a_, count);
		}
		return index_hook;
	}

	public static SubLObject cb_c_other_internal(final SubLObject index_hook) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (cb_relevant_num_other_index(index_hook).numG(ZERO_INTEGER)) {
				html_markup(html_macros.$html_strong_head$.getGlobalValue());
				html_markup(html_macros.$html_big_head$.getGlobalValue());
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				html_princ($str454$Miscellaneous_References__);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
				html_markup(html_macros.$html_big_tail$.getGlobalValue());
				html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				html_newline(TWO_INTEGER);
				final SubLObject assertion_link_fn = (NIL != cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK_WITH_MT);
				final SubLObject _prev_bind_0_$321 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
				final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
				final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					$cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
					$cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
					mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
					cb_relevant_key_other_index(assertion_link_fn, index_hook, NIL, NIL);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
					$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
					$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$321, thread);
				}
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_relevant_key_other_index(final SubLObject function, final SubLObject v_term, final SubLObject truth, final SubLObject gafs) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$322 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$323 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$324 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$325 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$326 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($HTML, thread);
										$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
										if (NIL != cb_viewpoint.active_filter_p(MTS)) {
											if (NIL != cb_mts_filter_use_genlmt()) {
												final SubLObject _prev_bind_0_$327 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
												final SubLObject _prev_bind_1_$328 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
												try {
													mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
													mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
													answer_list = kb_mapping.map_other_index(function, v_term, truth, gafs);
												} finally {
													mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$328, thread);
													mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$327, thread);
												}
											} else {
												final SubLObject _prev_bind_0_$328 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
												final SubLObject _prev_bind_1_$329 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
												try {
													mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
													mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
													answer_list = kb_mapping.map_other_index(function, v_term, truth, gafs);
												} finally {
													mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$329, thread);
													mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$328, thread);
												}
											}
										} else {
											answer_list = kb_mapping.map_other_index(function, v_term, truth, gafs);
										}
									} finally {
										$assertion_filter_hook$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$326, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$329 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$329, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$325, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$324, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$323, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$330 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$330, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$322, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return answer_list;
	}

	public static SubLObject cb_auxiliary_indices(SubLObject args) {
		if (args == UNPROVIDED) {
			args = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject indices = auxiliary_indexing.auxiliary_indices();
		if (NIL != indices) {
			final SubLObject title_var = $$$Auxiliary_Indices;
			final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
				html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup($str1$_meta_http_equiv__X_UA_Compatible);
				}
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$333 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
					html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_head_shortcut_icon();
					html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($CB_CYC);
					dhtml_macros.html_basic_cb_scripts();
					if (NIL != title_var) {
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_princ(title_var);
						html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					final SubLObject _prev_bind_0_$334 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($str163$yui_skin_sam);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$335 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reloadFrameButton);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$336 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$button);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup($$$reload);
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_princ($$$Refresh_Frames);
								html_char(CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_char(CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$336, thread);
							}
							html_markup(html_macros.$html_div_tail$.getGlobalValue());
							if (NIL != title_var) {
								html_markup(html_macros.$html_heading_head$.getGlobalValue());
								html_markup(TWO_INTEGER);
								html_char(CHAR_greater, UNPROVIDED);
								html_princ(title_var);
								html_markup(html_macros.$html_heading_tail$.getGlobalValue());
								html_markup(TWO_INTEGER);
								html_char(CHAR_greater, UNPROVIDED);
							}
							html_markup(html_macros.$html_form_head$.getGlobalValue());
							html_markup(html_macros.$html_form_action$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$337 = html_macros.$html_safe_print$.currentBinding(thread);
							final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
							final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_macros.$within_html_form$.bind(T, thread);
								html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
								cb_help_preamble($CB_AUXILIARY_INDICES, UNPROVIDED, UNPROVIDED);
								html_newline(TWO_INTEGER);
								indices = Sort.sort(indices, symbol_function(STRING_LESSP), symbol_function(AUXILIARY_INDEX_NAME));
								html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_princ($str463$Choose_an_auxiliary_index___);
								html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$338 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									SubLObject cdolist_list_var = indices;
									SubLObject index = NIL;
									index = cdolist_list_var.first();
									while (NIL != cdolist_list_var) {
										html_markup(html_macros.$html_list_item_head$.getGlobalValue());
										html_char(CHAR_greater, UNPROVIDED);
										final SubLObject _prev_bind_0_$339 = html_macros.$html_safe_print$.currentBinding(thread);
										try {
											html_macros.$html_safe_print$.bind(T, thread);
											cb_link($AUXILIARY_INDEX, index, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
										} finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_$339, thread);
										}
										html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
										cdolist_list_var = cdolist_list_var.rest();
										index = cdolist_list_var.first();
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$338, thread);
								}
								html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
								html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
							} finally {
								html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
								html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$337, thread);
							}
							html_markup(html_macros.$html_form_tail$.getGlobalValue());
							html_source_readability_terpri(UNPROVIDED);
							html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$335, thread);
						}
						html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$334, thread);
					}
					html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$333, thread);
				}
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cb_error($str464$No_auxiliary_indexes_exist_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject cb_link_auxiliary_indices(SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Auxiliary_Index_List;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		html_princ($str467$cb_auxiliary_indices);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_auxiliary_index(SubLObject args) {
		if (args == UNPROVIDED) {
			args = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject index = cb_guess_index(args.first());
		if (NIL == auxiliary_indexing.auxiliary_index_p(index)) {
			cb_error($str469$_S_did_not_specify_an_auxiliary_i, index, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} else if (!kb_indexing.num_index(index).numG(ZERO_INTEGER)) {
			final SubLObject message = format(NIL, $str470$The_auxiliary_index__S_is_current, auxiliary_indexing.auxiliary_index_name(index));
			cb_simple_message_page(message, UNPROVIDED, UNPROVIDED);
		} else {
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				if (NIL != html_macros.html_inside_body_p()) {
					Errors.error($str471$Cannot_have_a_FRAMESET_tag_inside);
				}
				html_markup(html_macros.$html_frameset_head$.getGlobalValue());
				html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str472$30___);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$340 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					cb_frame($INDEX, index, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					cb_frame($CONTENT, index, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$340, thread);
				}
				html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		}

		return NIL;
	}

	public static SubLObject cb_link_auxiliary_index(final SubLObject aux_index, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != auxiliary_indexing.auxiliary_index_p(aux_index)) {
			if (NIL == linktext) {
				linktext = auxiliary_indexing.auxiliary_index_name(aux_index);
			}
			final SubLObject frame_name_var = cb_frame_name($MAIN);
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			cyc_cgi_url_int();
			format(html_macros.$html_stream$.getDynamicValue(thread), $str475$cb_auxiliary_index__A, aux_index);
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != frame_name_var) {
				html_markup(html_macros.$html_anchor_target$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(frame_name_var);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(linktext);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			return aux_index;
		}
		return NIL;
	}

	public static SubLObject cb_alpha(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject raw_string = args.first();
		final SubLObject v_term = cb_guess_term(raw_string, UNPROVIDED);
		final SubLObject string = (NIL != v_term) ? string_utilities.fort_print_name(v_term) : raw_string;
		final SubLObject title = format(NIL, $str478$Alphabetical_search_for___A_, string);
		SubLObject use_type = $ALPHA_TERM;
		thread.resetMultipleValues();
		SubLObject current_item = cb_alphabetical_placement(string, $cb_alpha_before$.getDynamicValue(thread), $cb_alpha_after$.getDynamicValue(thread));
		final SubLObject before_items = thread.secondMultipleValue();
		final SubLObject after_items = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (NIL == current_item) {
			use_type = $MISSING;
			current_item = string;
		}
		cb_alpha_index(use_type, title, NIL, before_items, current_item, after_items);
		return NIL;
	}

	public static SubLObject cb_ad(final SubLObject args) {
		return cb_alpha(args);
	}

	public static SubLObject cb_link_alphabetical(final SubLObject v_object, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject string = NIL;
		if (NIL != nart_handles.nart_p(v_object)) {
			return NIL;
		}
		if (NIL != constant_p(v_object)) {
			string = constants_high.constant_name(v_object);
		} else if (v_object.isString()) {
			string = v_object;
		} else if (v_object.isChar()) {
			string = v_object;
		} else {
			string = format(NIL, $str486$_A, v_object);
		}

		if (NIL == linktext) {
			linktext = string;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str487$cb_ad__A, string);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != constant_p(v_object)) {
				final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($ALPHA);
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($ALPHA);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
				html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != alt) {
					html_markup(html_macros.$html_image_alt$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(alt);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				if (NIL != align) {
					html_markup(html_macros.$html_image_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align(align));
					html_char(CHAR_quotation, UNPROVIDED);
				}
				if (NIL != border) {
					html_markup(html_macros.$html_image_border$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(border);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$341 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$341, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} else {
				html_princ(linktext);
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return v_object;
	}

	public static SubLObject cb_alpha_top(SubLObject args) {
		if (args == UNPROVIDED) {
			args = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject title = $$$Top_of_Alphabetical_Index;
		thread.resetMultipleValues();
		final SubLObject current_item = cb_alphabetical_placement($cb_before_alpha_top$.getDynamicValue(thread), ZERO_INTEGER, $cb_alpha_total$.getDynamicValue(thread));
		final SubLObject before_items = thread.secondMultipleValue();
		final SubLObject after_items = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		cb_alpha_index($TOP, title, NIL, before_items, current_item, after_items);
		return NIL;
	}

	public static SubLObject cb_link_alpha_top(SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Top;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		html_princ($str496$cb_alpha_top);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_alpha_bottom(SubLObject args) {
		if (args == UNPROVIDED) {
			args = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject title = $$$Bottom_of_Alphabetical_Index;
		thread.resetMultipleValues();
		final SubLObject current_item = cb_alphabetical_placement($cb_after_alpha_bottom$.getDynamicValue(thread), $cb_alpha_total$.getDynamicValue(thread), ZERO_INTEGER);
		final SubLObject before_items = thread.secondMultipleValue();
		final SubLObject after_items = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		cb_alpha_index($BOTTOM, title, NIL, before_items, current_item, after_items);
		return NIL;
	}

	public static SubLObject cb_link_alpha_bottom(SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Bottom;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		html_princ($str503$cb_alpha_bottom);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_alpha_pageup(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return cb_alpha_scroll($PAGEUP, subtract($cb_alpha_total$.getDynamicValue(thread), ONE_INTEGER), ONE_INTEGER, args);
	}

	public static SubLObject cb_link_alpha_pageup(final SubLObject string, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Page_Up;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str509$cb_alpha_pageup__A, string);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return string;
	}

	public static SubLObject cb_alpha_pagedn(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return cb_alpha_scroll($PAGEDN, ZERO_INTEGER, $cb_alpha_total$.getDynamicValue(thread), args);
	}

	public static SubLObject cb_link_alpha_pagedn(final SubLObject string, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $$$Page_Down;
		}
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str515$cb_alpha_pagedn__A, string);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return string;
	}

	public static SubLObject cb_alpha_scroll(final SubLObject use_type, final SubLObject before_count, final SubLObject after_count, final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject string = args.first();
		final SubLObject title = $$$Alphabetical_index_scroll;
		thread.resetMultipleValues();
		SubLObject current_item = cb_alphabetical_placement(string, before_count, after_count);
		final SubLObject before_items = thread.secondMultipleValue();
		SubLObject after_items = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (NIL != current_item) {
			after_items = cons(current_item, after_items);
			current_item = NIL;
		}
		cb_alpha_index(use_type, title, NIL, before_items, NIL, after_items);
		return NIL;
	}

	public static SubLObject cb_alpha_index(final SubLObject use_type, final SubLObject title, final SubLObject message, final SubLObject before_items, final SubLObject central_item, final SubLObject after_items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup($str1$_meta_http_equiv__X_UA_Compatible);
			}
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$342 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
			try {
				cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
				html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				dhtml_macros.html_basic_cb_scripts();
				if (NIL != title) {
					html_source_readability_terpri(UNPROVIDED);
					html_markup(html_macros.$html_title_head$.getGlobalValue());
					html_princ(title);
					html_markup(html_macros.$html_title_tail$.getGlobalValue());
				}
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$343 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
						html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_body_class$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str163$yui_skin_sam);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$344 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup($$$reloadFrameButton);
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$345 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_input_head$.getGlobalValue());
							html_markup(html_macros.$html_input_type$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$button);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_name$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup($$$reload);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_input_value$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_princ($$$Refresh_Frames);
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
								html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
							}
							html_char(CHAR_greater, UNPROVIDED);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$345, thread);
						}
						html_markup(html_macros.$html_div_tail$.getGlobalValue());
						if (NIL != title) {
							html_markup(html_macros.$html_heading_head$.getGlobalValue());
							html_markup(TWO_INTEGER);
							html_char(CHAR_greater, UNPROVIDED);
							html_princ(title);
							html_markup(html_macros.$html_heading_tail$.getGlobalValue());
							html_markup(TWO_INTEGER);
							html_char(CHAR_greater, UNPROVIDED);
						}
						html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$346 = html_macros.$html_safe_print$.currentBinding(thread);
						final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
						final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							if (NIL != message) {
								html_princ(message);
							}
							html_hr(UNPROVIDED, UNPROVIDED);
							cb_alpha_position_bar(use_type, before_items, after_items);
							html_hr(UNPROVIDED, UNPROVIDED);
							html_markup(html_macros.$html_table_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
							html_markup(html_macros.$html_table_border$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(ZERO_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(ZERO_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(ZERO_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$347 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								SubLObject cdolist_list_var = before_items;
								SubLObject item = NIL;
								item = cdolist_list_var.first();
								while (NIL != cdolist_list_var) {
									cb_alphabetical_item(item, UNPROVIDED);
									cdolist_list_var = cdolist_list_var.rest();
									item = cdolist_list_var.first();
								}
								if (NIL != central_item) {
									cb_alphabetical_central_item(use_type, central_item);
								}
								cdolist_list_var = after_items;
								item = NIL;
								item = cdolist_list_var.first();
								while (NIL != cdolist_list_var) {
									cb_alphabetical_item(item, UNPROVIDED);
									cdolist_list_var = cdolist_list_var.rest();
									item = cdolist_list_var.first();
								}
								html_markup(html_macros.$html_table_row_head$.getGlobalValue());
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$348 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$349 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_indent(FIVE_INTEGER);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$349, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									html_markup(html_macros.$html_table_data_head$.getGlobalValue());
									html_char(CHAR_greater, UNPROVIDED);
									final SubLObject _prev_bind_0_$350 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_indent(FIVE_INTEGER);
									} finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_$350, thread);
									}
									html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$348, thread);
								}
								html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
								html_source_readability_terpri(UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$347, thread);
							}
							html_markup(html_macros.$html_table_tail$.getGlobalValue());
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$346, thread);
						}
						html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$344, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$343, thread);
				}
				html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$342, thread);
			}
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject cb_alpha_position_bar(final SubLObject use_type, final SubLObject before_items, final SubLObject after_items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pageup_possible = NIL;
		SubLObject pageup_item = NIL;
		SubLObject pagedn_possible = NIL;
		SubLObject pagedn_item = NIL;
		if (use_type.eql($PAGEUP)) {
			pageup_possible = numE(length(before_items), subtract($cb_alpha_total$.getDynamicValue(thread), ONE_INTEGER));
			pagedn_possible = T;
		} else if (use_type.eql($PAGEDN)) {
			pageup_possible = T;
			pagedn_possible = numE(length(after_items), $cb_alpha_total$.getDynamicValue(thread));
		} else if (use_type.eql($ALPHA_TERM)) {
			pageup_possible = numE(length(before_items), $cb_alpha_before$.getDynamicValue(thread));
			pagedn_possible = numE(length(after_items), subtract($cb_alpha_after$.getDynamicValue(thread), ONE_INTEGER));
		} else if (use_type.eql($TOP)) {
			pageup_possible = NIL;
			pagedn_possible = numE(length(after_items), $cb_alpha_total$.getDynamicValue(thread));
		} else if (use_type.eql($BOTTOM)) {
			pageup_possible = numE(length(before_items), $cb_alpha_total$.getDynamicValue(thread));
			pagedn_possible = NIL;
		} else {
			pageup_possible = numE(length(before_items), $cb_alpha_before$.getDynamicValue(thread));
			pagedn_possible = numE(length(after_items), $cb_alpha_after$.getDynamicValue(thread));
		}

		if (NIL != pageup_possible) {
			if (NIL != before_items) {
				pageup_item = constants_high.constant_name(before_items.first());
			} else if (NIL != after_items) {
				pageup_item = constants_high.constant_name(after_items.first());
			}

		}
		if (NIL != pagedn_possible) {
			if (NIL != after_items) {
				pagedn_item = constants_high.constant_name(last(after_items, UNPROVIDED).first());
			} else if (NIL != before_items) {
				pagedn_item = constants_high.constant_name(last(before_items, UNPROVIDED).first());
			}

		}
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
		html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$351 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$352 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					cb_help_preamble($CB_ALPHA_INDEX, UNPROVIDED, UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$352, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$353 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_head$.getGlobalValue());
					html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
					html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
					html_markup(html_macros.$html_table_border$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$354 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$355 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$356 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								if (NIL != pageup_possible) {
									cb_link($ALPHA_PAGEUP, pageup_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									html_indent(TWO_INTEGER);
								}
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$356, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$357 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								cb_link($ALPHA_TOP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								html_indent(TWO_INTEGER);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$357, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$358 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								final SubLObject size_val = TWO_INTEGER;
								html_markup(html_macros.$html_font_head$.getGlobalValue());
								if (NIL != size_val) {
									html_markup(html_macros.$html_font_size$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(size_val);
									html_char(CHAR_quotation, UNPROVIDED);
								}
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$359 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_teletype_head$.getGlobalValue());
									final SubLObject string_var = $cb_alpha_upper_char_order$.getDynamicValue(thread);
									SubLObject end_var_$360;
									SubLObject end_var;
									SubLObject i;
									SubLObject v_char;
									for (end_var = end_var_$360 = length(string_var), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$360); i = number_utilities.f_1X(i)) {
										v_char = Strings.sublisp_char(string_var, i);
										if (!i.numE(ZERO_INTEGER)) {
											html_princ($str523$_);
										}
										cb_link($ALPHABETICAL, v_char, v_char, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									}
									html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$359, thread);
								}
								html_markup(html_macros.$html_font_tail$.getGlobalValue());
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$358, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$355, thread);
						}
						html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
						html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$360 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$361 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								if (NIL != pagedn_possible) {
									cb_link($ALPHA_PAGEDN, pagedn_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									html_indent(TWO_INTEGER);
								}
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$361, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$362 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								cb_link($ALPHA_BOTTOM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								html_indent(TWO_INTEGER);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$362, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$363 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								final SubLObject size_val = TWO_INTEGER;
								html_markup(html_macros.$html_font_head$.getGlobalValue());
								if (NIL != size_val) {
									html_markup(html_macros.$html_font_size$.getGlobalValue());
									html_char(CHAR_quotation, UNPROVIDED);
									html_markup(size_val);
									html_char(CHAR_quotation, UNPROVIDED);
								}
								html_char(CHAR_greater, UNPROVIDED);
								final SubLObject _prev_bind_0_$364 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_teletype_head$.getGlobalValue());
									final SubLObject string_var = $cb_alpha_lower_char_order$.getDynamicValue(thread);
									SubLObject end_var;
									SubLObject i;
									SubLObject v_char;
									SubLObject end_var_$361;
									for (end_var = end_var_$361 = length(string_var), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$361); i = number_utilities.f_1X(i)) {
										v_char = Strings.sublisp_char(string_var, i);
										if (!i.numE(ZERO_INTEGER)) {
											html_princ($str523$_);
										}
										cb_link($ALPHABETICAL, v_char, v_char, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									}
									html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_$364, thread);
								}
								html_markup(html_macros.$html_font_tail$.getGlobalValue());
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$363, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$360, thread);
						}
						html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$354, thread);
					}
					html_markup(html_macros.$html_table_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$353, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$351, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_alphabetical_central_item(final SubLObject use_type, final SubLObject central_item) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (central_item.isString()) {
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align($MIDDLE));
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_markup(html_macros.$html_table_data_align$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_align($RIGHT));
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$367 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_strong_head$.getGlobalValue());
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					html_markup(html_macros.$html_font_size$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(FIVE_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_font_color$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_color($RED));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$368 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_princ($str525$_____);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$368, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$367, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_markup(html_macros.$html_table_data_align$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_align($LEFT));
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$369 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_strong_head$.getGlobalValue());
					SubLObject size_val = FIVE_INTEGER;
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != size_val) {
						html_markup(html_macros.$html_font_size$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(size_val);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$370 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						format(html_macros.$html_stream$.getDynamicValue(thread), $str526$__A_, central_item);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$370, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					if (use_type == $MISSING) {
						size_val = FOUR_INTEGER;
						html_markup(html_macros.$html_font_head$.getGlobalValue());
						if (NIL != size_val) {
							html_markup(html_macros.$html_font_size$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(size_val);
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$371 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ($str527$would_be_here_);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$371, thread);
						}
						html_markup(html_macros.$html_font_tail$.getGlobalValue());
					}
					html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$369, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} else {
			cb_alphabetical_item(central_item, T);
		}
		return NIL;
	}

	public static SubLObject cb_alphabetical_item(final SubLObject constant, SubLObject highlight) {
		if (highlight == UNPROVIDED) {
			highlight = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_row_head$.getGlobalValue());
		html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_align($MIDDLE));
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_data_head$.getGlobalValue());
			html_markup(html_macros.$html_table_data_align$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align($RIGHT));
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$372 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_indent(UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$372, thread);
			}
			html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			html_markup(html_macros.$html_table_data_head$.getGlobalValue());
			html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$373 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				if (NIL != highlight) {
					html_markup(html_macros.$html_strong_head$.getGlobalValue());
					final SubLObject size_val = FIVE_INTEGER;
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != size_val) {
						html_markup(html_macros.$html_font_size$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(size_val);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$374 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						cb_show_term(constant, UNPROVIDED, UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$374, thread);
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
					html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				} else {
					cb_show_term(constant, UNPROVIDED, UNPROVIDED);
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$373, thread);
			}
			html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_alphabetical_placement(final SubLObject string, final SubLObject n_before, final SubLObject n_after) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject before_items = cb_alpha_around(string, n_before, n_after);
		final SubLObject after_items = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != after_items) && constants_high.constant_name(after_items.first()).equal(string)) {
			return values(after_items.first(), before_items, after_items.rest());
		}
		return values(NIL, before_items, after_items);
	}

	public static SubLObject cb_alpha_around(final SubLObject string, final SubLObject n_before, final SubLObject n_after) {
		assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
		assert NIL != fixnump(n_before) : "Types.fixnump(n_before) " + "CommonSymbols.NIL != Types.fixnump(n_before) " + n_before;
		assert NIL != fixnump(n_after) : "Types.fixnump(n_after) " + "CommonSymbols.NIL != Types.fixnump(n_after) " + n_after;
		final SubLObject before = constant_completion_high.n_constants_before(n_before, string, T, ZERO_INTEGER, NIL, T);
		final SubLObject after = constant_completion_high.n_constants_after(n_after, string, T, ZERO_INTEGER, NIL, NIL);
		return values(nreverse(before), after);
	}

	public static SubLObject cb_add_from_trie_map(final SubLObject constant) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != valid_constantP(constant, UNPROVIDED)) {
			$cb_alpha_around_sofar$.setDynamicValue(add($cb_alpha_around_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			$cb_alpha_around_gather$.setDynamicValue(cons(constant, $cb_alpha_around_gather$.getDynamicValue(thread)), thread);
			if ($cb_alpha_around_sofar$.getDynamicValue(thread).numGE($cb_alpha_around_total$.getDynamicValue(thread))) {
				mapping_finished();
			}
		}
		return NIL;
	}

	public static SubLObject cb_relevant_num_all_assertions(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				result = add(new SubLObject[] { cb_relevant_num_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), cb_relevant_num_nart_arg_index(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), cb_relevant_num_predicate_extent_index(v_term, UNPROVIDED), cb_relevant_num_function_extent_index(v_term, UNPROVIDED), cb_relevant_num_predicate_rule_index(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED),
						cb_relevant_num_decontextualized_ist_predicate_rule_index(v_term, UNPROVIDED, UNPROVIDED), cb_relevant_num_isa_rule_index(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), cb_relevant_num_genls_rule_index(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), cb_relevant_num_genl_mt_rule_index(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), cb_relevant_num_function_rule_index(v_term, UNPROVIDED, UNPROVIDED),
						cb_relevant_num_mt_index(v_term), cb_relevant_num_other_index(v_term) });
			} else {
				result = kb_indexing.num_index(v_term);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject cb_relevant_num_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
		if (argnum == UNPROVIDED) {
			argnum = NIL;
		}
		if (pred == UNPROVIDED) {
			pred = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$375 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_gaf_arg_index(v_term, argnum, pred);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$375, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$376 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_gaf_arg_index(v_term, argnum, pred);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$376, thread);
					}
				}
			} else {
				count = kb_indexing.num_gaf_arg_index(v_term, argnum, pred, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_nart_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject func, SubLObject mt) {
		if (argnum == UNPROVIDED) {
			argnum = NIL;
		}
		if (func == UNPROVIDED) {
			func = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$377 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_nart_arg_index(v_term, argnum, func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$377, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$378 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_nart_arg_index(v_term, argnum, func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$378, thread);
					}
				}
			} else {
				count = kb_indexing.num_nart_arg_index(v_term, argnum, func);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_predicate_extent_index(final SubLObject pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$379 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_predicate_extent_index(pred);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$379, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$380 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_predicate_extent_index(pred);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$380, thread);
					}
				}
			} else {
				count = kb_indexing.num_predicate_extent_index(pred, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_function_extent_index(final SubLObject func, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$381 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_function_extent_index(func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$381, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$382 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_function_extent_index(func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$382, thread);
					}
				}
			} else {
				count = kb_indexing.num_function_extent_index(func);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_predicate_rule_index(final SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$383 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_predicate_rule_index(pred, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$383, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$384 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_predicate_rule_index(pred, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$384, thread);
					}
				}
			} else {
				count = kb_indexing.num_predicate_rule_index(pred, sense, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_decontextualized_ist_predicate_rule_index(final SubLObject pred, SubLObject sense, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$385 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.num_decontextualized_ist_predicate_rule_index(pred, sense, UNPROVIDED);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$385, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$386 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.num_decontextualized_ist_predicate_rule_index(pred, sense, UNPROVIDED);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$386, thread);
					}
				}
			} else {
				count = kb_indexing.num_decontextualized_ist_predicate_rule_index(pred, sense, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_isa_rule_index(final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$387 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_isa_rule_index(col, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$387, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$388 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_isa_rule_index(col, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$388, thread);
					}
				}
			} else {
				count = kb_indexing.num_isa_rule_index(col, sense, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_quoted_isa_rule_index(final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$389 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_quoted_isa_rule_index(col, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$389, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$390 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_quoted_isa_rule_index(col, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$390, thread);
					}
				}
			} else {
				count = kb_indexing.num_quoted_isa_rule_index(col, sense, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_genls_rule_index(final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$391 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_genls_rule_index(col, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$391, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$392 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_genls_rule_index(col, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$392, thread);
					}
				}
			} else {
				count = kb_indexing.num_genls_rule_index(col, sense, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_genl_mt_rule_index(final SubLObject genl_mt, SubLObject sense, SubLObject rule_mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (rule_mt == UNPROVIDED) {
			rule_mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == rule_mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$393 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_genl_mt_rule_index(genl_mt, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$393, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$394 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_genl_mt_rule_index(genl_mt, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$394, thread);
					}
				}
			} else {
				count = kb_indexing.num_genl_mt_rule_index(genl_mt, sense, rule_mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_function_rule_index(final SubLObject func, SubLObject mt, SubLObject direction) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$395 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_function_rule_index(func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$395, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$396 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_function_rule_index(func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$396, thread);
					}
				}
			} else {
				count = kb_indexing.num_function_rule_index(func, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_exception_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$397 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_exception_rule_index(rule);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$397, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$398 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_exception_rule_index(rule);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$398, thread);
					}
				}
			} else {
				count = kb_indexing.num_exception_rule_index(rule, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_pragma_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$399 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_pragma_rule_index(rule);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$399, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$400 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_pragma_rule_index(rule);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$400, thread);
					}
				}
			} else {
				count = kb_indexing.num_pragma_rule_index(rule, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_unbound_rule_index(SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$401 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = auxiliary_indexing.relevant_num_unbound_rule_index(sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$401, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$402 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = auxiliary_indexing.relevant_num_unbound_rule_index(sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$402, thread);
					}
				}
			} else {
				count = auxiliary_indexing.num_unbound_rule_index(sense, mt, direction);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_other_index(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$403 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_other_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$403, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$404 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_other_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$404, thread);
					}
				}
			} else {
				count = kb_indexing.num_other_index(v_term);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_mt_index(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$405 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_mt_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$405, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$406 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_mt_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$406, thread);
					}
				}
			} else {
				count = kb_indexing.num_mt_index(v_term);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_num_hlmt_index(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$407 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_hlmt_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$407, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$408 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						count = kb_indexing.relevant_num_hlmt_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$408, thread);
					}
				}
			} else {
				count = kb_indexing.num_hlmt_index(v_term);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject cb_relevant_key_gaf_arg_index(final SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject mt) {
		if (arg == UNPROVIDED) {
			arg = NIL;
		}
		if (pred == UNPROVIDED) {
			pred = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$409 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_gaf_arg_index(v_term, arg, pred);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$409, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$410 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_gaf_arg_index(v_term, arg, pred);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$410, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_gaf_arg_index(v_term, arg, pred);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if (NIL == pred) {
			if (NIL == arg) {
				sorted_answer_list = cb_sort_args_for_display(answer_list);
			} else {
				sorted_answer_list = cb_sort_preds_for_display(v_term, answer_list, UNPROVIDED);
			}
		} else {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_nart_arg_index(final SubLObject v_term, SubLObject arg, SubLObject func, SubLObject mt) {
		if (arg == UNPROVIDED) {
			arg = NIL;
		}
		if (func == UNPROVIDED) {
			func = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$411 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_nart_arg_index(v_term, arg, func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$411, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$412 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_nart_arg_index(v_term, arg, func);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$412, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_nart_arg_index(v_term, arg, func);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if (NIL == func) {
			if (NIL == arg) {
				sorted_answer_list = cb_sort_args_for_display(answer_list);
			} else {
				sorted_answer_list = cb_sort_preds_for_display(v_term, answer_list, UNPROVIDED);
			}
		} else {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_predicate_extent_index(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$413 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_predicate_extent_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$413, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$414 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_predicate_extent_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$414, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_predicate_extent_index(v_term);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_predicate_rule_index(final SubLObject v_term, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$415 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_predicate_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$415, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$416 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_predicate_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$416, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_predicate_rule_index(v_term, sense, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if ((NIL != sense) && (NIL == mt)) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_decontextualized_ist_predicate_rule_index(final SubLObject v_term, SubLObject sense, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if (NIL != cb_viewpoint.active_filter_p(MTS)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$417 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.key_decontextualized_ist_predicate_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$417, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$418 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.key_decontextualized_ist_predicate_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$418, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_decontextualized_ist_predicate_rule_index(v_term, sense);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		return answer_list;
	}

	public static SubLObject cb_relevant_key_isa_rule_index(final SubLObject v_term, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$419 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_isa_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$419, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$420 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_isa_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$420, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_isa_rule_index(v_term, sense, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if ((NIL != sense) && (NIL == mt)) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_quoted_isa_rule_index(final SubLObject v_term, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$421 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_quoted_isa_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$421, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$422 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_quoted_isa_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$422, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_quoted_isa_rule_index(v_term, sense, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if ((NIL != sense) && (NIL == mt)) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_genls_rule_index(final SubLObject v_term, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$423 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_genls_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$423, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$424 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_genls_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$424, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_genls_rule_index(v_term, sense, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if ((NIL != sense) && (NIL == mt)) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_genl_mt_rule_index(final SubLObject v_term, SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$425 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_genl_mt_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$425, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$426 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_genl_mt_rule_index(v_term, sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$426, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_genl_mt_rule_index(v_term, sense, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if ((NIL != sense) && (NIL == mt)) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_function_rule_index(final SubLObject v_term, SubLObject mt, SubLObject direction) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$427 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_function_rule_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$427, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$428 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = kb_indexing.relevant_key_function_rule_index(v_term);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$428, thread);
					}
				}
			} else {
				answer_list = kb_indexing.key_function_rule_index(v_term, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if (NIL == mt) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_relevant_key_unbound_rule_index(SubLObject sense, SubLObject mt, SubLObject direction) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject answer_list = NIL;
		SubLObject sorted_answer_list = NIL;
		final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
		try {
			$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
			if ((NIL != cb_viewpoint.active_filter_p(MTS)) && (NIL == mt)) {
				if (NIL != cb_mts_filter_use_genlmt()) {
					final SubLObject _prev_bind_0_$429 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = auxiliary_indexing.relevant_key_unbound_rule_index(sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$429, thread);
					}
				} else {
					final SubLObject _prev_bind_0_$430 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
						mt_relevance_macros.$relevant_mts$.bind(cb_viewpoint.cb_mts_filter(), thread);
						answer_list = auxiliary_indexing.relevant_key_unbound_rule_index(sense);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$430, thread);
					}
				}
			} else {
				answer_list = auxiliary_indexing.key_unbound_rule_index(sense, mt);
			}
		} finally {
			$assertion_filter_hook$.rebind(_prev_bind_0, thread);
		}
		if ((NIL != sense) && (NIL == mt)) {
			sorted_answer_list = cb_sort_mts_for_display(answer_list, UNPROVIDED);
		} else {
			sorted_answer_list = answer_list;
		}
		return sorted_answer_list;
	}

	public static SubLObject cb_my_creator_lookup(final SubLObject fort) {
		return bookkeeping_store.creator(fort, UNPROVIDED);
	}

	public static SubLObject cb_my_creation_time_lookup(final SubLObject fort) {
		return bookkeeping_store.creation_time(fort, UNPROVIDED);
	}

	public static SubLObject cb_my_creation_purpose_lookup(final SubLObject fort) {
		return bookkeeping_store.creation_purpose(fort, UNPROVIDED);
	}

	public static SubLObject cb_my_creation_second_lookup(final SubLObject fort) {
		return bookkeeping_store.creation_second(fort, UNPROVIDED);
	}

	public static SubLObject cb_link_graph(final SubLObject v_term, SubLObject newlineP) {
		if (newlineP == UNPROVIDED) {
			newlineP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != cb_c_check_graph(v_term)) {
			if (NIL != newlineP) {
				html_newline(UNPROVIDED);
			}
			final SubLObject frame_name_var = cb_frame_name($CONTENT);
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			cyc_cgi_url_int();
			format(html_macros.$html_stream$.getDynamicValue(thread), $str529$cb_c_graph__A, cb_term_identifier(v_term));
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != frame_name_var) {
				html_markup(html_macros.$html_anchor_target$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(frame_name_var);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(cb_c_graph_type_string(v_term));
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
		return v_term;
	}

	public static SubLObject cb_c_graph(final SubLObject args) {
		SubLObject term_spec = NIL;
		destructuring_bind_must_consp(args, args, $list178);
		term_spec = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			final SubLObject v_term = cb_guess_term(term_spec, UNPROVIDED);
			cb_c_graph_internal(v_term);
		} else {
			cdestructuring_bind_error(args, $list178);
		}
		return NIL;
	}

	public static SubLObject cb_c_graph_internal(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject title = format(NIL, $str532$Assertion_Graph_for__S, v_term);
		html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str1$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			final SubLObject _prev_bind_0_$431 = dhtml_macros.$html_element_id$.currentBinding(thread);
			try {
				dhtml_macros.$html_element_id$.bind(ZERO_INTEGER, thread);
				dhtml_macros.basic_ajax_scripts();
				html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
				html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				cb_head_shortcut_icon();
				html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
				cyc_file_dependencies.css($CB_CYC);
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_title_head$.getGlobalValue());
				html_princ(title);
				html_markup(html_macros.$html_title_tail$.getGlobalValue());
				dhtml_macros.dhtml_with_dom_script();
				dhtml_macros.dhtml_with_toggle_visibility_support();
				dhtml_macros.dhtml_creation_scripts();
				html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				final SubLObject _prev_bind_0_$432 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$433 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_bold_head$.getGlobalValue());
						cb_show_term(v_term, UNPROVIDED, UNPROVIDED);
						html_princ($$$_assertion_graph);
						html_markup(html_macros.$html_bold_tail$.getGlobalValue());
						cb_c_print_graph(v_term);
						html_source_readability_terpri(UNPROVIDED);
						html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$433, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$432, thread);
				}
			} finally {
				dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$431, thread);
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_graph_type_string(final SubLObject v_term) {
		if (NIL != cb_c_check_graph_of_script(v_term)) {
			return $$$Script_Graph;
		}
		return $$$Unknown_Graph;
	}

	public static SubLObject cb_c_print_graph(final SubLObject v_term) {
		if (NIL != cb_c_check_graph_of_script(v_term)) {
			cb_c_print_graph_of_script(v_term);
		}
		return NIL;
	}

	public static SubLObject cb_c_check_graph(final SubLObject v_term) {
		return cb_c_check_graph_of_script(v_term);
	}

	public static SubLObject cb_c_check_graph_of_script(final SubLObject v_term) {
		return makeBoolean((NIL != forts.fort_p(v_term)) && (NIL != genls.genl_in_any_mtP(v_term, $$Situation)));
	}

	public static SubLObject cb_c_print_graph_of_script(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_newline(TWO_INTEGER);
		final SubLObject signature = format(NIL, $str537$_a, random.random(expt(TWO_INTEGER, $int$30)));
		final SubLObject defining_mt = kb_accessors.defining_mt(v_term);
		if (NIL == defining_mt) {
			html_markup(html_macros.$html_italic_head$.getGlobalValue());
			html_princ($str539$Graphical_editing_of_this_script_);
			cb_show_term($$definingMt, UNPROVIDED, UNPROVIDED);
			html_princ($str541$_assertion_);
			html_markup(html_macros.$html_italic_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		if ((NIL != constants_high.find_constant($$$candidateProperSubSituationTypes)) && (NIL == ask_utilities.ask_template($sym543$_ARG2, list($$candidateProperSubSituationTypes, v_term, $sym543$_ARG2), NIL != defining_mt ? defining_mt : $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			html_markup(html_macros.$html_italic_head$.getGlobalValue());
			html_princ($str545$Note_that_since_no_scenes_were_fo);
			html_markup(html_macros.$html_italic_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		blue_grapher_utilities.blue_event(signature, list($str546$com_cyc_framework_ui_scriptEditor, list(new SubLObject[] { $BUILDER_FN, BBF_SCRIPT, $PREDS, NIL, $FORTS, list(v_term), $MT, NIL, $DEPTH, ONE_INTEGER })));
		cb_blue_grapher.cb_blue_applet(list($CLASS_FILE, $str553$com_cyc_framework_ui_scriptEditor, $WIDTH, $str555$100_, $HEIGHT, $str557$90_, $SIGNATURE, signature));
		html_newline(UNPROVIDED);
		final SubLObject dhtml_object_id = $str559$pertinent_queries;
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
		html_princ($$$Troubleshooting);
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
		html_markup(html_macros.$html_div_head$.getGlobalValue());
		if (NIL != dhtml_object_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(dhtml_object_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_bold_head$.getGlobalValue());
			html_princ($$$Java_Profile);
			html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			html_newline(TWO_INTEGER);
			html_princ($str562$In_order_for_the_Grapher_applet_t);
			html_macros.verify_not_within_html_pre();
			html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
			final SubLObject _prev_bind_0_$434 = html_macros.$within_html_pre$.currentBinding(thread);
			try {
				html_macros.$within_html_pre$.bind(T, thread);
				html_princ($str563$_grant_codeBase__http___localhost);
			} finally {
				html_macros.$within_html_pre$.rebind(_prev_bind_0_$434, thread);
			}
			html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
			html_princ($str564$On_Linux_systems_this_file_should);
			html_markup(html_macros.$html_code_head$.getGlobalValue());
			html_princ($str565$_HOME__java_policy);
			html_markup(html_macros.$html_code_tail$.getGlobalValue());
			html_princ($str566$____See_);
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($str567$http___download_oracle_com_javase);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($MAIN);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$435 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ($$$the_Oracle_documentation);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$435, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_princ($str569$_for_other_OS_s_);
			html_newline(TWO_INTEGER);
			html_markup(html_macros.$html_bold_head$.getGlobalValue());
			html_princ($str570$It_worked_once_but_then_stopped_w);
			html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			html_newline(TWO_INTEGER);
			html_princ($str571$In_your_Java_console__clear_the_c);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_div_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_c_pertinent_query_links(final SubLObject args) {
		final SubLObject v_term = cb_guess_term(html_extract_input($$$term, args), UNPROVIDED);
		return cb_c_print_pertinent_query_links(v_term);
	}

	public static SubLObject cb_c_print_pertinent_query_links(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject queries = pertinent_queries_for_term(v_term);
		if (NIL != queries) {
			final SubLObject dhtml_object_id = $str559$pertinent_queries;
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_indent(ZERO_INTEGER);
			html_hr(UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str47$);
			format(html_macros.$html_stream$.getDynamicValue(thread), $str572$Pertinent_Queries___S_, length(queries));
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
			dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			if (NIL != dhtml_object_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(dhtml_object_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject cdolist_list_var = kb_utilities.sort_terms(queries, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject query = NIL;
				query = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					cb_c_print_pertinent_query_link(v_term, query);
					cdolist_list_var = cdolist_list_var.rest();
					query = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject pertinent_queries_for_term(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
		try {
			czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
			return ask_utilities.query_variable($sym574$_QUERY, list($const575$queryHasVeryHighPertinenceForThin, $sym574$_QUERY, v_term), $$InferencePSC, $list577);
		} finally {
			czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject cb_c_print_pertinent_query_link(final SubLObject v_term, final SubLObject query) {
		cb_link($PERTINENT_QUERY, v_term, query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		html_newline(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_link_pertinent_query(final SubLObject v_term, final SubLObject query) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		html_indent(TWO_INTEGER);
		final SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str579$cb_c_pertinent_query_term__A_quer, cb_term_identifier(v_term), cb_term_identifier(query));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(kb_paths.fort_name(query));
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_c_pertinent_query(final SubLObject args) {
		final SubLObject v_term = cb_guess_term(html_extract_input($$$term, args), UNPROVIDED);
		final SubLObject possibly_quoted_term = possibly_quote_reifiable_naut(v_term);
		final SubLObject query_spec = cb_guess_term(html_extract_input($$$query, args), UNPROVIDED);
		final SubLObject raw_sentence = kb_query.kbq_sentence(query_spec);
		final SubLObject sentence = query_utilities.indexicalized_query_substitute_term(possibly_quoted_term, raw_sentence);
		final SubLObject raw_mt = kb_query.kbq_mt(query_spec);
		final SubLObject mt = query_utilities.indexicalized_query_substitute_term(possibly_quoted_term, raw_mt);
		final SubLObject non_explanatory_sentence = kb_query.kbq_pragmatics(query_spec);
		final SubLObject v_properties = inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec));
		if (NIL != non_explanatory_sentence) {
			return cb_query.cb_kb_query(sentence, mt, v_properties, query_spec, non_explanatory_sentence);
		}
		return cb_query.cb_kb_query(sentence, mt, v_properties, query_spec, UNPROVIDED);
	}

	public static SubLObject declare_cb_browser_file() {
		declareFunction(me, "cb_c_index", "CB-C-INDEX", 1, 0, false);
		declareFunction(me, "cb_c_content_page_no_frames_index", "CB-C-CONTENT-PAGE-NO-FRAMES-INDEX", 1, 0, false);
		declareFunction(me, "cb_c_index_guts", "CB-C-INDEX-GUTS", 1, 0, false);
		declareFunction(me, "cb_term_page_heading", "CB-TERM-PAGE-HEADING", 1, 1, false);
		declareFunction(me, "cb_c_index_views", "CB-C-INDEX-VIEWS", 1, 1, false);
		declareFunction(me, "cb_c_index_other_assertions_guts", "CB-C-INDEX-OTHER-ASSERTIONS-GUTS", 1, 0, false);
		declareFunction(me, "cb_c_index_bookkeeping_assertions_guts", "CB-C-INDEX-BOOKKEEPING-ASSERTIONS-GUTS", 1, 0, false);
		declareFunction(me, "cb_c_index_kb_assertions_guts", "CB-C-INDEX-KB-ASSERTIONS-GUTS", 1, 0, false);
		declareFunction(me, "cb_c_index_auxiliary_index", "CB-C-INDEX-AUXILIARY-INDEX", 1, 0, false);
		declareFunction(me, "cb_c_index_fort_index", "CB-C-INDEX-FORT-INDEX", 1, 0, false);
		declareFunction(me, "cb_show_term_index_besides_gaf_arg", "CB-SHOW-TERM-INDEX-BESIDES-GAF-ARG", 1, 0, false);
		declareFunction(me, "cb_c_index_gaf_args", "CB-C-INDEX-GAF-ARGS", 1, 0, false);
		declareFunction(me, "cb_gaf_arg_index", "CB-GAF-ARG-INDEX", 2, 0, false);
		declareFunction(me, "cb_gaf_arg_pred_index", "CB-GAF-ARG-PRED-INDEX", 3, 0, false);
		declareFunction(me, "cb_make_gaf_arg_pred_object_id", "CB-MAKE-GAF-ARG-PRED-OBJECT-ID", 1, 1, false);
		declareFunction(me, "cb_gaf_arg_pred_mt_index", "CB-GAF-ARG-PRED-MT-INDEX", 4, 0, false);
		declareFunction(me, "cb_c_index_nart_args", "CB-C-INDEX-NART-ARGS", 1, 0, false);
		declareFunction(me, "cb_nart_arg_index", "CB-NART-ARG-INDEX", 2, 0, false);
		declareFunction(me, "cb_make_nart_arg_object_id", "CB-MAKE-NART-ARG-OBJECT-ID", 1, 0, false);
		declareFunction(me, "cb_nart_arg_func_index", "CB-NART-ARG-FUNC-INDEX", 3, 0, false);
		declareFunction(me, "cb_c_index_predicate_extent", "CB-C-INDEX-PREDICATE-EXTENT", 1, 0, false);
		declareFunction(me, "cb_predicate_extent_mt_index", "CB-PREDICATE-EXTENT-MT-INDEX", 2, 1, false);
		declareFunction(me, "cb_c_index_function_extent", "CB-C-INDEX-FUNCTION-EXTENT", 1, 0, false);
		declareFunction(me, "cb_c_index_predicate_rules", "CB-C-INDEX-PREDICATE-RULES", 1, 0, false);
		declareFunction(me, "cb_predicate_rule_index", "CB-PREDICATE-RULE-INDEX", 2, 0, false);
		declareFunction(me, "cb_predicate_rule_mt_index", "CB-PREDICATE-RULE-MT-INDEX", 3, 1, false);
		declareFunction(me, "cb_make_predicate_rule_mt_id", "CB-MAKE-PREDICATE-RULE-MT-ID", 3, 0, false);
		declareFunction(me, "cb_predicate_rule_mt_direction_index", "CB-PREDICATE-RULE-MT-DIRECTION-INDEX", 4, 1, false);
		declareFunction(me, "cb_c_index_decontextualized_ist_predicate_rules", "CB-C-INDEX-DECONTEXTUALIZED-IST-PREDICATE-RULES", 1, 0, false);
		declareFunction(me, "cb_decontextualized_ist_predicate_rule_index", "CB-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 0, false);
		declareFunction(me, "cb_decontextualized_ist_predicate_rule_direction_index", "CB-DECONTEXTUALIZED-IST-PREDICATE-RULE-DIRECTION-INDEX", 3, 0, false);
		declareFunction(me, "cb_c_index_isa_rules", "CB-C-INDEX-ISA-RULES", 1, 0, false);
		declareFunction(me, "cb_isa_rule_index", "CB-ISA-RULE-INDEX", 2, 0, false);
		declareFunction(me, "cb_isa_rule_mt_index", "CB-ISA-RULE-MT-INDEX", 3, 0, false);
		declareFunction(me, "cb_isa_rule_mt_direction_index", "CB-ISA-RULE-MT-DIRECTION-INDEX", 4, 0, false);
		declareFunction(me, "cb_c_index_quoted_isa_rules", "CB-C-INDEX-QUOTED-ISA-RULES", 1, 0, false);
		declareFunction(me, "cb_quoted_isa_rule_index", "CB-QUOTED-ISA-RULE-INDEX", 2, 0, false);
		declareFunction(me, "cb_quoted_isa_rule_mt_index", "CB-QUOTED-ISA-RULE-MT-INDEX", 3, 0, false);
		declareFunction(me, "cb_quoted_isa_rule_mt_direction_index", "CB-QUOTED-ISA-RULE-MT-DIRECTION-INDEX", 4, 0, false);
		declareFunction(me, "cb_c_index_genls_rules", "CB-C-INDEX-GENLS-RULES", 1, 0, false);
		declareFunction(me, "cb_genls_rule_index", "CB-GENLS-RULE-INDEX", 2, 0, false);
		declareFunction(me, "cb_genls_rule_mt_index", "CB-GENLS-RULE-MT-INDEX", 3, 0, false);
		declareFunction(me, "cb_genls_rule_mt_direction_index", "CB-GENLS-RULE-MT-DIRECTION-INDEX", 4, 0, false);
		declareFunction(me, "cb_c_index_genl_mt_rules", "CB-C-INDEX-GENL-MT-RULES", 1, 0, false);
		declareFunction(me, "cb_genl_mt_rule_index", "CB-GENL-MT-RULE-INDEX", 2, 0, false);
		declareFunction(me, "cb_genl_mt_rule_mt_index", "CB-GENL-MT-RULE-MT-INDEX", 3, 0, false);
		declareFunction(me, "cb_genl_mt_rule_mt_direction_index", "CB-GENL-MT-RULE-MT-DIRECTION-INDEX", 4, 0, false);
		declareFunction(me, "cb_c_index_function_rules", "CB-C-INDEX-FUNCTION-RULES", 1, 0, false);
		declareFunction(me, "cb_function_rule_mt_index", "CB-FUNCTION-RULE-MT-INDEX", 2, 0, false);
		declareFunction(me, "cb_function_rule_mt_direction_index", "CB-FUNCTION-RULE-MT-DIRECTION-INDEX", 3, 0, false);
		declareFunction(me, "cb_c_index_unbound_rules", "CB-C-INDEX-UNBOUND-RULES", 0, 0, false);
		declareFunction(me, "cb_unbound_rule_index", "CB-UNBOUND-RULE-INDEX", 1, 0, false);
		declareFunction(me, "cb_unbound_rule_mt_index", "CB-UNBOUND-RULE-MT-INDEX", 2, 0, false);
		declareFunction(me, "cb_unbound_rule_mt_direction_index", "CB-UNBOUND-RULE-MT-DIRECTION-INDEX", 3, 0, false);
		declareFunction(me, "cb_c_index_other", "CB-C-INDEX-OTHER", 1, 0, false);
		declareFunction(me, "cb_c_index_mt", "CB-C-INDEX-MT", 1, 0, false);
		declareFunction(me, "cb_c_el_hl_formulas_link", "CB-C-EL-HL-FORMULAS-LINK", 1, 0, false);
		declareFunction(me, "cb_c_show_el_formulas_for_index_hookP", "CB-C-SHOW-EL-FORMULAS-FOR-INDEX-HOOK?", 1, 0, false);
		declareFunction(me, "cb_c_assertion_formula_display_exceptionP", "CB-C-ASSERTION-FORMULA-DISPLAY-EXCEPTION?", 1, 0, false);
		declareFunction(me, "cb_show_el_formulas_for_hookP", "CB-SHOW-EL-FORMULAS-FOR-HOOK?", 1, 0, false);
		declareFunction(me, "cb_c_el", "CB-C-EL", 1, 0, false);
		declareFunction(me, "cb_link_el_formulas_for_index_hook", "CB-LINK-EL-FORMULAS-FOR-INDEX-HOOK", 1, 1, false);
		declareFunction(me, "cb_c_hl", "CB-C-HL", 1, 0, false);
		declareFunction(me, "cb_link_hl_formulas_for_index_hook", "CB-LINK-HL-FORMULAS-FOR-INDEX-HOOK", 1, 1, false);
		declareFunction(me, "cb_c_documentation", "CB-C-DOCUMENTATION", 1, 0, false);
		declareFunction(me, "cb_link_documentation", "CB-LINK-DOCUMENTATION", 1, 1, false);
		declareFunction(me, "clear_cb_documentation_predicate_p", "CLEAR-CB-DOCUMENTATION-PREDICATE-P", 0, 0, false);
		declareFunction(me, "remove_cb_documentation_predicate_p", "REMOVE-CB-DOCUMENTATION-PREDICATE-P", 1, 0, false);
		declareFunction(me, "cb_documentation_predicate_p_internal", "CB-DOCUMENTATION-PREDICATE-P-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_documentation_predicate_p", "CB-DOCUMENTATION-PREDICATE-P", 1, 0, false);
		declareFunction(me, "cb_print_documentation_information", "CB-PRINT-DOCUMENTATION-INFORMATION", 1, 1, false);
		declareFunction(me, "display_semantic_web_uris", "DISPLAY-SEMANTIC-WEB-URIS", 1, 0, false);
		declareFunction(me, "display_external_links", "DISPLAY-EXTERNAL-LINKS", 1, 0, false);
		declareFunction(me, "display_kb_subsets", "DISPLAY-KB-SUBSETS", 1, 0, false);
		declareFunction(me, "cb_summary_sentence", "CB-SUMMARY-SENTENCE", 1, 0, false);
		declareFunction(me, "all_kb_subset_collections", "ALL-KB-SUBSET-COLLECTIONS", 1, 0, false);
		declareFunction(me, "cb_c_bookkeeping_info", "CB-C-BOOKKEEPING-INFO", 1, 0, false);
		declareFunction(me, "cb_c_bookkeeping_gafs", "CB-C-BOOKKEEPING-GAFS", 1, 0, false);
		declareFunction(me, "cb_display_bookkeeping_gaf", "CB-DISPLAY-BOOKKEEPING-GAF", 3, 0, false);
		declareFunction(me, "cb_c_bookkeeping_header", "CB-C-BOOKKEEPING-HEADER", 0, 0, false);
		declareFunction(me, "cb_c_documentation_internal", "CB-C-DOCUMENTATION-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_c_documentation_internal_guts", "CB-C-DOCUMENTATION-INTERNAL-GUTS", 1, 0, false);
		declareFunction(me, "cb_c_documentation_assertion", "CB-C-DOCUMENTATION-ASSERTION", 1, 2, false);
		declareFunction(me, "cb_c_documentation_string", "CB-C-DOCUMENTATION-STRING", 1, 0, false);
		declareFunction(me, "cb_c_definitional", "CB-C-DEFINITIONAL", 1, 0, false);
		declareFunction(me, "cb_link_definitional", "CB-LINK-DEFINITIONAL", 1, 1, false);
		declareFunction(me, "cb_c_definitional_internal", "CB-C-DEFINITIONAL-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_possibly_show_followup_widget", "CB-POSSIBLY-SHOW-FOLLOWUP-WIDGET", 1, 0, false);
		declareFunction(me, "cb_print_definitional_information", "CB-PRINT-DEFINITIONAL-INFORMATION", 1, 0, false);
		declareFunction(me, "cb_c_definitional_internal_guts_fort", "CB-C-DEFINITIONAL-INTERNAL-GUTS-FORT", 1, 0, false);
		declareFunction(me, "cb_describe_constant", "CB-DESCRIBE-CONSTANT", 1, 0, false);
		declareFunction(me, "cb_link_describe_constant", "CB-LINK-DESCRIBE-CONSTANT", 1, 0, false);
		declareFunction(me, "cb_describe_nart", "CB-DESCRIBE-NART", 1, 0, false);
		declareFunction(me, "cb_link_describe_nart", "CB-LINK-DESCRIBE-NART", 1, 0, false);
		declareFunction(me, "cb_describe_index", "CB-DESCRIBE-INDEX", 1, 0, false);
		declareFunction(me, "cb_describe_inference_modules", "CB-DESCRIBE-INFERENCE-MODULES", 1, 0, false);
		declareFunction(me, "cb_c_all_asserted_knowledge", "CB-C-ALL-ASSERTED-KNOWLEDGE", 1, 0, false);
		declareFunction(me, "cb_c_all_asserted_knowledge_guts", "CB-C-ALL-ASSERTED-KNOWLEDGE-GUTS", 1, 0, false);
		declareFunction(me, "cb_link_all_asserted_knowledge", "CB-LINK-ALL-ASSERTED-KNOWLEDGE", 2, 1, false);
		declareFunction(me, "cb_c_bookkeeping_assertions", "CB-C-BOOKKEEPING-ASSERTIONS", 1, 0, false);
		declareFunction(me, "cb_link_bookkeeping_assertions", "CB-LINK-BOOKKEEPING-ASSERTIONS", 2, 1, false);
		declareFunction(me, "cb_c_total", "CB-C-TOTAL", 1, 0, false);
		declareFunction(me, "cb_c_total_guts", "CB-C-TOTAL-GUTS", 1, 0, false);
		declareFunction(me, "cb_link_constant_total", "CB-LINK-CONSTANT-TOTAL", 2, 1, false);
		declareFunction(me, "cb_c_total_internal", "CB-C-TOTAL-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_link_chronological_order", "CB-LINK-CHRONOLOGICAL-ORDER", 1, 1, false);
		declareFunction(me, "cb_assertion_chronology", "CB-ASSERTION-CHRONOLOGY", 1, 0, false);
		declareFunction(me, "cb_assertions_in_chronological_order", "CB-ASSERTIONS-IN-CHRONOLOGICAL-ORDER", 1, 0, false);
		declareFunction(me, "cb_link_assertions_id_order", "CB-LINK-ASSERTIONS-ID-ORDER", 1, 1, false);
		declareFunction(me, "cb_assertions_id_order", "CB-ASSERTIONS-ID-ORDER", 1, 0, false);
		declareFunction(me, "cb_assertions_in_id_order", "CB-ASSERTIONS-IN-ID-ORDER", 1, 0, false);
		declareFunction(me, "cb_c_gaf_arg", "CB-C-GAF-ARG", 1, 0, false);
		declareFunction(me, "cb_c_gaf_arg_guts", "CB-C-GAF-ARG-GUTS", 4, 0, false);
		declareFunction(me, "cb_link_gaf_arg", "CB-LINK-GAF-ARG", 2, 3, false);
		declareFunction(me, "cb_c_gaf_arg_internal", "CB-C-GAF-ARG-INTERNAL", 4, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec", "CB-C-GAF-ARG-REC", 1, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg", "CB-C-GAF-ARG-REC-ARG", 2, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred", "CB-C-GAF-ARG-REC-ARG-PRED", 3, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt", "CB-C-GAF-ARG-REC-ARG-PRED-MT", 4, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated", "CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NOTE-NEGATED", 1, 0, false);
		declareFunction(me, "cb_c_gaf_arg_use_binaryP", "CB-C-GAF-ARG-USE-BINARY?", 0, 0, false);
		declareFunction(me, "cb_use_binary_for_major_presentation_languageP", "CB-USE-BINARY-FOR-MAJOR-PRESENTATION-LANGUAGE?", 0, 1, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt_binary_note", "CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NOTE", 1, 1, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt_binary_note_el", "CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NOTE-EL", 1, 1, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt_binary", "CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY", 4, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt_non_binary", "CB-C-GAF-ARG-REC-ARG-PRED-MT-NON-BINARY", 4, 0, false);
		declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_mt_non_binary_int", "CB-C-GAF-ARG-REC-ARG-PRED-MT-NON-BINARY-INT", 4, 0, false);
		declareFunction(me, "cb_c_nart_arg", "CB-C-NART-ARG", 1, 0, false);
		declareFunction(me, "cb_link_nart_arg", "CB-LINK-NART-ARG", 2, 2, false);
		declareFunction(me, "cb_c_nart_arg_internal", "CB-C-NART-ARG-INTERNAL", 3, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec", "CB-C-NART-ARG-REC", 1, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec_arg", "CB-C-NART-ARG-REC-ARG", 2, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec_arg_func", "CB-C-NART-ARG-REC-ARG-FUNC", 3, 0, false);
		declareFunction(me, "cb_c_nart_arg_use_binaryP", "CB-C-NART-ARG-USE-BINARY?", 0, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec_arg_func_binary_note", "CB-C-NART-ARG-REC-ARG-FUNC-BINARY-NOTE", 1, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec_arg_func_binary_note_el", "CB-C-NART-ARG-REC-ARG-FUNC-BINARY-NOTE-EL", 1, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec_arg_func_binary", "CB-C-NART-ARG-REC-ARG-FUNC-BINARY", 3, 0, false);
		declareFunction(me, "cb_c_nart_arg_rec_arg_func_non_binary", "CB-C-NART-ARG-REC-ARG-FUNC-NON-BINARY", 3, 0, false);
		declareFunction(me, "cb_c_type", "CB-C-TYPE", 1, 0, false);
		declareFunction(me, "cb_c_definitional_fort_type_name", "CB-C-DEFINITIONAL-FORT-TYPE-NAME", 1, 0, false);
		declareFunction(me, "cb_c_term_header_possible_implementation_constant_note", "CB-C-TERM-HEADER-POSSIBLE-IMPLEMENTATION-CONSTANT-NOTE", 1, 0, false);
		declareFunction(me, "cb_c_term_header", "CB-C-TERM-HEADER", 1, 0, false);
		declareFunction(me, "cb_add_bookmark_term_link", "CB-ADD-BOOKMARK-TERM-LINK", 1, 0, false);
		declareFunction(me, "cb_c_gaf_arg_header", "CB-C-GAF-ARG-HEADER", 1, 0, false);
		declareFunction(me, "cb_c_nart_arg_header", "CB-C-NART-ARG-HEADER", 1, 0, false);
		declareFunction(me, "cb_c_mt_header", "CB-C-MT-HEADER", 1, 3, false);
		declareFunction(me, "cb_c_mt_header_int", "CB-C-MT-HEADER-INT", 2, 0, false);
		declareFunction(me, "cb_show_monadic_mt_header", "CB-SHOW-MONADIC-MT-HEADER", 1, 0, false);
		declareFunction(me, "cb_show_naut_mt_header", "CB-SHOW-NAUT-MT-HEADER", 3, 0, false);
		declareFunction(me, "cb_show_time_interval_in_mt_header", "CB-SHOW-TIME-INTERVAL-IN-MT-HEADER", 1, 0, false);
		declareFunction(me, "cb_c_pred_header", "CB-C-PRED-HEADER", 1, 0, false);
		declareFunction(me, "cb_c_binary_pred_header", "CB-C-BINARY-PRED-HEADER", 1, 1, false);
		declareFunction(me, "cb_c_gaf_arg_and_extent", "CB-C-GAF-ARG-AND-EXTENT", 1, 0, false);
		declareFunction(me, "cb_c_gaf_arg_and_extent_guts", "CB-C-GAF-ARG-AND-EXTENT-GUTS", 4, 0, false);
		declareFunction(me, "cb_c_predicate_extent", "CB-C-PREDICATE-EXTENT", 1, 0, false);
		declareFunction(me, "cb_link_predicate_extent", "CB-LINK-PREDICATE-EXTENT", 2, 1, false);
		declareFunction(me, "cb_c_predicate_extent_internal", "CB-C-PREDICATE-EXTENT-INTERNAL", 2, 0, false);
		declareFunction(me, "cb_c_predicate_extent_rec", "CB-C-PREDICATE-EXTENT-REC", 1, 0, false);
		declareFunction(me, "cb_c_predicate_extent_rec_mt", "CB-C-PREDICATE-EXTENT-REC-MT", 2, 0, false);
		declareFunction(me, "cb_c_function_extent", "CB-C-FUNCTION-EXTENT", 1, 0, false);
		declareFunction(me, "cb_link_function_extent", "CB-LINK-FUNCTION-EXTENT", 2, 0, false);
		declareFunction(me, "cb_c_function_extent_internal", "CB-C-FUNCTION-EXTENT-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_c_function_extent_rec", "CB-C-FUNCTION-EXTENT-REC", 1, 0, false);
		declareFunction(me, "cb_c_predicate_rule", "CB-C-PREDICATE-RULE", 1, 0, false);
		declareFunction(me, "cb_link_predicate_rule", "CB-LINK-PREDICATE-RULE", 2, 3, false);
		declareFunction(me, "cb_c_predicate_rule_internal", "CB-C-PREDICATE-RULE-INTERNAL", 4, 0, false);
		declareFunction(me, "cb_c_predicate_rule_rec", "CB-C-PREDICATE-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_predicate_rule_rec_sense", "CB-C-PREDICATE-RULE-REC-SENSE", 2, 0, false);
		declareFunction(me, "cb_c_predicate_rule_rec_sense_mt", "CB-C-PREDICATE-RULE-REC-SENSE-MT", 3, 0, false);
		declareFunction(me, "cb_c_predicate_rule_rec_sense_mt_direction", "CB-C-PREDICATE-RULE-REC-SENSE-MT-DIRECTION", 4, 0, false);
		declareFunction(me, "cb_c_decontextualized_ist_predicate_rule", "CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE", 1, 0, false);
		declareFunction(me, "cb_link_decontextualized_ist_predicate_rule", "CB-LINK-DECONTEXTUALIZED-IST-PREDICATE-RULE", 2, 2, false);
		declareFunction(me, "cb_c_decontextualized_ist_predicate_rule_internal", "CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE-INTERNAL", 3, 0, false);
		declareFunction(me, "cb_c_decontextualized_ist_predicate_rule_rec", "CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_decontextualized_ist_predicate_rule_rec_sense", "CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE-REC-SENSE", 2, 0, false);
		declareFunction(me, "cb_c_decontextualized_ist_predicate_rule_rec_sense_direction", "CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE-REC-SENSE-DIRECTION", 3, 0, false);
		declareFunction(me, "cb_c_isa_rule", "CB-C-ISA-RULE", 1, 0, false);
		declareFunction(me, "cb_link_isa_rule", "CB-LINK-ISA-RULE", 2, 3, false);
		declareFunction(me, "cb_c_isa_rule_internal", "CB-C-ISA-RULE-INTERNAL", 4, 0, false);
		declareFunction(me, "cb_c_isa_rule_rec", "CB-C-ISA-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_isa_rule_rec_sense", "CB-C-ISA-RULE-REC-SENSE", 2, 0, false);
		declareFunction(me, "cb_c_isa_rule_rec_sense_mt", "CB-C-ISA-RULE-REC-SENSE-MT", 3, 0, false);
		declareFunction(me, "cb_c_isa_rule_rec_sense_mt_direction", "CB-C-ISA-RULE-REC-SENSE-MT-DIRECTION", 4, 0, false);
		declareFunction(me, "cb_c_quoted_isa_rule", "CB-C-QUOTED-ISA-RULE", 1, 0, false);
		declareFunction(me, "cb_link_quoted_isa_rule", "CB-LINK-QUOTED-ISA-RULE", 2, 3, false);
		declareFunction(me, "cb_c_quoted_isa_rule_internal", "CB-C-QUOTED-ISA-RULE-INTERNAL", 4, 0, false);
		declareFunction(me, "cb_c_quoted_isa_rule_rec", "CB-C-QUOTED-ISA-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_quoted_isa_rule_rec_sense", "CB-C-QUOTED-ISA-RULE-REC-SENSE", 2, 0, false);
		declareFunction(me, "cb_c_quoted_isa_rule_rec_sense_mt", "CB-C-QUOTED-ISA-RULE-REC-SENSE-MT", 3, 0, false);
		declareFunction(me, "cb_c_quoted_isa_rule_rec_sense_mt_direction", "CB-C-QUOTED-ISA-RULE-REC-SENSE-MT-DIRECTION", 4, 0, false);
		declareFunction(me, "cb_c_genls_rule", "CB-C-GENLS-RULE", 1, 0, false);
		declareFunction(me, "cb_link_genls_rule", "CB-LINK-GENLS-RULE", 2, 3, false);
		declareFunction(me, "cb_c_genls_rule_internal", "CB-C-GENLS-RULE-INTERNAL", 4, 0, false);
		declareFunction(me, "cb_c_genls_rule_rec", "CB-C-GENLS-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_genls_rule_rec_sense", "CB-C-GENLS-RULE-REC-SENSE", 2, 0, false);
		declareFunction(me, "cb_c_genls_rule_rec_sense_mt", "CB-C-GENLS-RULE-REC-SENSE-MT", 3, 0, false);
		declareFunction(me, "cb_c_genls_rule_rec_sense_mt_direction", "CB-C-GENLS-RULE-REC-SENSE-MT-DIRECTION", 4, 0, false);
		declareFunction(me, "cb_c_genl_mt_rule", "CB-C-GENL-MT-RULE", 1, 0, false);
		declareFunction(me, "cb_link_genl_mt_rule", "CB-LINK-GENL-MT-RULE", 2, 3, false);
		declareFunction(me, "cb_c_genl_mt_rule_internal", "CB-C-GENL-MT-RULE-INTERNAL", 4, 0, false);
		declareFunction(me, "cb_c_genl_mt_rule_rec", "CB-C-GENL-MT-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_genl_mt_rule_rec_sense", "CB-C-GENL-MT-RULE-REC-SENSE", 2, 0, false);
		declareFunction(me, "cb_c_genl_mt_rule_rec_sense_mt", "CB-C-GENL-MT-RULE-REC-SENSE-MT", 3, 0, false);
		declareFunction(me, "cb_c_genl_mt_rule_rec_sense_mt_direction", "CB-C-GENL-MT-RULE-REC-SENSE-MT-DIRECTION", 4, 0, false);
		declareFunction(me, "cb_c_function_rule", "CB-C-FUNCTION-RULE", 1, 0, false);
		declareFunction(me, "cb_link_function_rule", "CB-LINK-FUNCTION-RULE", 2, 2, false);
		declareFunction(me, "cb_c_function_rule_internal", "CB-C-FUNCTION-RULE-INTERNAL", 3, 0, false);
		declareFunction(me, "cb_c_function_rule_rec", "CB-C-FUNCTION-RULE-REC", 1, 0, false);
		declareFunction(me, "cb_c_function_rule_rec_mt", "CB-C-FUNCTION-RULE-REC-MT", 2, 0, false);
		declareFunction(me, "cb_c_function_rule_rec_mt_direction", "CB-C-FUNCTION-RULE-REC-MT-DIRECTION", 3, 0, false);
		declareFunction(me, "cb_c_unbound_rule", "CB-C-UNBOUND-RULE", 1, 0, false);
		declareFunction(me, "cb_link_unbound_rule", "CB-LINK-UNBOUND-RULE", 1, 3, false);
		declareFunction(me, "cb_c_unbound_rule_internal", "CB-C-UNBOUND-RULE-INTERNAL", 3, 0, false);
		declareFunction(me, "cb_c_unbound_rule_rec", "CB-C-UNBOUND-RULE-REC", 0, 0, false);
		declareFunction(me, "cb_c_unbound_rule_rec_sense", "CB-C-UNBOUND-RULE-REC-SENSE", 1, 0, false);
		declareFunction(me, "cb_c_unbound_rule_rec_sense_mt", "CB-C-UNBOUND-RULE-REC-SENSE-MT", 2, 0, false);
		declareFunction(me, "cb_c_unbound_rule_rec_sense_mt_direction", "CB-C-UNBOUND-RULE-REC-SENSE-MT-DIRECTION", 3, 0, false);
		declareFunction(me, "cb_c_sense_header", "CB-C-SENSE-HEADER", 1, 1, false);
		declareFunction(me, "cb_c_direction_header", "CB-C-DIRECTION-HEADER", 1, 0, false);
		declareFunction(me, "cb_c_ist", "CB-C-IST", 1, 0, false);
		declareFunction(me, "cb_link_ist", "CB-LINK-IST", 2, 0, false);
		declareFunction(me, "cb_link_ist_broad", "CB-LINK-IST-BROAD", 1, 0, false);
		declareFunction(me, "cb_c_ist_internal", "CB-C-IST-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_c_mt_gafs", "CB-C-MT-GAFS", 1, 0, false);
		declareFunction(me, "cb_link_mt_gafs", "CB-LINK-MT-GAFS", 1, 0, false);
		declareFunction(me, "cb_c_mt_gafs_internal", "CB-C-MT-GAFS-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_c_gather_mt_gafs", "CB-C-GATHER-MT-GAFS", 1, 0, false);
		declareFunction(me, "cb_c_gather_hlmt_gafs", "CB-C-GATHER-HLMT-GAFS", 1, 0, false);
		declareFunction(me, "cb_term_L", "CB-TERM-<", 2, 0, false);
		declareFunction(me, "cb_predicate_L", "CB-PREDICATE-<", 2, 0, false);
		declareFunction(me, "cb_c_mt_rules", "CB-C-MT-RULES", 1, 0, false);
		declareFunction(me, "cb_link_mt_rules", "CB-LINK-MT-RULES", 1, 0, false);
		declareFunction(me, "cb_c_mt_rules_internal", "CB-C-MT-RULES-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_c_gather_mt_rules", "CB-C-GATHER-MT-RULES", 1, 0, false);
		declareFunction(me, "cb_c_other", "CB-C-OTHER", 1, 0, false);
		declareFunction(me, "cb_link_other", "CB-LINK-OTHER", 2, 0, false);
		declareFunction(me, "cb_c_other_internal", "CB-C-OTHER-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_relevant_key_other_index", "CB-RELEVANT-KEY-OTHER-INDEX", 4, 0, false);
		declareFunction(me, "cb_auxiliary_indices", "CB-AUXILIARY-INDICES", 0, 1, false);
		declareFunction(me, "cb_link_auxiliary_indices", "CB-LINK-AUXILIARY-INDICES", 0, 1, false);
		declareFunction(me, "cb_auxiliary_index", "CB-AUXILIARY-INDEX", 0, 1, false);
		declareFunction(me, "cb_link_auxiliary_index", "CB-LINK-AUXILIARY-INDEX", 1, 1, false);
		declareFunction(me, "cb_alpha", "CB-ALPHA", 1, 0, false);
		declareFunction(me, "cb_ad", "CB-AD", 1, 0, false);
		declareFunction(me, "cb_link_alphabetical", "CB-LINK-ALPHABETICAL", 1, 1, false);
		declareFunction(me, "cb_alpha_top", "CB-ALPHA-TOP", 0, 1, false);
		declareFunction(me, "cb_link_alpha_top", "CB-LINK-ALPHA-TOP", 0, 1, false);
		declareFunction(me, "cb_alpha_bottom", "CB-ALPHA-BOTTOM", 0, 1, false);
		declareFunction(me, "cb_link_alpha_bottom", "CB-LINK-ALPHA-BOTTOM", 0, 1, false);
		declareFunction(me, "cb_alpha_pageup", "CB-ALPHA-PAGEUP", 1, 0, false);
		declareFunction(me, "cb_link_alpha_pageup", "CB-LINK-ALPHA-PAGEUP", 1, 1, false);
		declareFunction(me, "cb_alpha_pagedn", "CB-ALPHA-PAGEDN", 1, 0, false);
		declareFunction(me, "cb_link_alpha_pagedn", "CB-LINK-ALPHA-PAGEDN", 1, 1, false);
		declareFunction(me, "cb_alpha_scroll", "CB-ALPHA-SCROLL", 4, 0, false);
		declareFunction(me, "cb_alpha_index", "CB-ALPHA-INDEX", 6, 0, false);
		declareFunction(me, "cb_alpha_position_bar", "CB-ALPHA-POSITION-BAR", 3, 0, false);
		declareFunction(me, "cb_alphabetical_central_item", "CB-ALPHABETICAL-CENTRAL-ITEM", 2, 0, false);
		declareFunction(me, "cb_alphabetical_item", "CB-ALPHABETICAL-ITEM", 1, 1, false);
		declareFunction(me, "cb_alphabetical_placement", "CB-ALPHABETICAL-PLACEMENT", 3, 0, false);
		declareFunction(me, "cb_alpha_around", "CB-ALPHA-AROUND", 3, 0, false);
		declareFunction(me, "cb_add_from_trie_map", "CB-ADD-FROM-TRIE-MAP", 1, 0, false);
		declareFunction(me, "cb_relevant_num_all_assertions", "CB-RELEVANT-NUM-ALL-ASSERTIONS", 1, 0, false);
		declareFunction(me, "cb_relevant_num_gaf_arg_index", "CB-RELEVANT-NUM-GAF-ARG-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_nart_arg_index", "CB-RELEVANT-NUM-NART-ARG-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_predicate_extent_index", "CB-RELEVANT-NUM-PREDICATE-EXTENT-INDEX", 1, 1, false);
		declareFunction(me, "cb_relevant_num_function_extent_index", "CB-RELEVANT-NUM-FUNCTION-EXTENT-INDEX", 1, 1, false);
		declareFunction(me, "cb_relevant_num_predicate_rule_index", "CB-RELEVANT-NUM-PREDICATE-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_decontextualized_ist_predicate_rule_index", "CB-RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 2, false);
		declareFunction(me, "cb_relevant_num_isa_rule_index", "CB-RELEVANT-NUM-ISA-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_quoted_isa_rule_index", "CB-RELEVANT-NUM-QUOTED-ISA-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_genls_rule_index", "CB-RELEVANT-NUM-GENLS-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_genl_mt_rule_index", "CB-RELEVANT-NUM-GENL-MT-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_num_function_rule_index", "CB-RELEVANT-NUM-FUNCTION-RULE-INDEX", 1, 2, false);
		declareFunction(me, "cb_relevant_num_exception_rule_index", "CB-RELEVANT-NUM-EXCEPTION-RULE-INDEX", 1, 2, false);
		declareFunction(me, "cb_relevant_num_pragma_rule_index", "CB-RELEVANT-NUM-PRAGMA-RULE-INDEX", 1, 2, false);
		declareFunction(me, "cb_relevant_num_unbound_rule_index", "CB-RELEVANT-NUM-UNBOUND-RULE-INDEX", 0, 3, false);
		declareFunction(me, "cb_relevant_num_other_index", "CB-RELEVANT-NUM-OTHER-INDEX", 1, 0, false);
		declareFunction(me, "cb_relevant_num_mt_index", "CB-RELEVANT-NUM-MT-INDEX", 1, 0, false);
		declareFunction(me, "cb_relevant_num_hlmt_index", "CB-RELEVANT-NUM-HLMT-INDEX", 1, 0, false);
		declareFunction(me, "cb_relevant_key_gaf_arg_index", "CB-RELEVANT-KEY-GAF-ARG-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_nart_arg_index", "CB-RELEVANT-KEY-NART-ARG-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_predicate_extent_index", "CB-RELEVANT-KEY-PREDICATE-EXTENT-INDEX", 1, 0, false);
		declareFunction(me, "cb_relevant_key_predicate_rule_index", "CB-RELEVANT-KEY-PREDICATE-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_decontextualized_ist_predicate_rule_index", "CB-RELEVANT-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 2, false);
		declareFunction(me, "cb_relevant_key_isa_rule_index", "CB-RELEVANT-KEY-ISA-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_quoted_isa_rule_index", "CB-RELEVANT-KEY-QUOTED-ISA-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_genls_rule_index", "CB-RELEVANT-KEY-GENLS-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_genl_mt_rule_index", "CB-RELEVANT-KEY-GENL-MT-RULE-INDEX", 1, 3, false);
		declareFunction(me, "cb_relevant_key_function_rule_index", "CB-RELEVANT-KEY-FUNCTION-RULE-INDEX", 1, 2, false);
		declareFunction(me, "cb_relevant_key_unbound_rule_index", "CB-RELEVANT-KEY-UNBOUND-RULE-INDEX", 0, 3, false);
		declareFunction(me, "cb_my_creator_lookup", "CB-MY-CREATOR-LOOKUP", 1, 0, false);
		declareFunction(me, "cb_my_creation_time_lookup", "CB-MY-CREATION-TIME-LOOKUP", 1, 0, false);
		declareFunction(me, "cb_my_creation_purpose_lookup", "CB-MY-CREATION-PURPOSE-LOOKUP", 1, 0, false);
		declareFunction(me, "cb_my_creation_second_lookup", "CB-MY-CREATION-SECOND-LOOKUP", 1, 0, false);
		declareFunction(me, "cb_link_graph", "CB-LINK-GRAPH", 1, 1, false);
		declareFunction(me, "cb_c_graph", "CB-C-GRAPH", 1, 0, false);
		declareFunction(me, "cb_c_graph_internal", "CB-C-GRAPH-INTERNAL", 1, 0, false);
		declareFunction(me, "cb_c_graph_type_string", "CB-C-GRAPH-TYPE-STRING", 1, 0, false);
		declareFunction(me, "cb_c_print_graph", "CB-C-PRINT-GRAPH", 1, 0, false);
		declareFunction(me, "cb_c_check_graph", "CB-C-CHECK-GRAPH", 1, 0, false);
		declareFunction(me, "cb_c_check_graph_of_script", "CB-C-CHECK-GRAPH-OF-SCRIPT", 1, 0, false);
		declareFunction(me, "cb_c_print_graph_of_script", "CB-C-PRINT-GRAPH-OF-SCRIPT", 1, 0, false);
		declareFunction(me, "cb_c_pertinent_query_links", "CB-C-PERTINENT-QUERY-LINKS", 1, 0, false);
		declareFunction(me, "cb_c_print_pertinent_query_links", "CB-C-PRINT-PERTINENT-QUERY-LINKS", 1, 0, false);
		declareFunction(me, "pertinent_queries_for_term", "PERTINENT-QUERIES-FOR-TERM", 1, 0, false);
		declareFunction(me, "cb_c_print_pertinent_query_link", "CB-C-PRINT-PERTINENT-QUERY-LINK", 2, 0, false);
		declareFunction(me, "cb_link_pertinent_query", "CB-LINK-PERTINENT-QUERY", 2, 0, false);
		declareFunction(me, "cb_c_pertinent_query", "CB-C-PERTINENT-QUERY", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_cb_browser_file() {
		deflexical("*CB-TERM-PAGE-ADORNMENTS*", list(INDEX_BROWSER, HIERARCHY_DEFAULT, VFACETS, VCLUMPS, ALPHABETICAL_SEARCH));
		deflexical("*CB-DOCUMENTATION-PREDICATE-P-CACHING-STATE*", NIL);
		deflexical("*SEMANTIC-WEB-URI-DATA*", $list115);
		defparameter("*CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-NEGATED*", NIL);
		defparameter("*CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY*", NIL);
		defparameter("*CB-C-GAF-ARG-REC-ARG-PRED-MT-BINARY-EL*", NIL);
		defparameter("*CB-C-NART-ARG-REC-ARG-FUNC-BINARY*", NIL);
		defparameter("*CB-C-NART-ARG-REC-ARG-FUNC-BINARY-EL*", NIL);
		defparameter("*BOOKMARKED-TERM-CAPTION*", $str305$This_term_is_bookmarked___Click_t);
		defparameter("*UNBOOKMARKED-TERM-CAPTION*", $str306$Bookmark_this_term___It_will_be_v);
		defvar("*CB-C-GAF-ARG-SHOW-ARG-HEADER?*", T);
		defvar("*CB-C-GAF-ARG-SHOW-MT-HEADER?*", T);
		defparameter("*CB-ALPHA-BEFORE*", FIVE_INTEGER);
		defparameter("*CB-ALPHA-AFTER*", $int$25);
		defparameter("*CB-ALPHA-TOTAL*", add($cb_alpha_before$.getDynamicValue(), $cb_alpha_after$.getDynamicValue()));
		defparameter("*CB-BEFORE-ALPHA-TOP*", $str47$);
		defparameter("*CB-AFTER-ALPHA-BOTTOM*", Strings.string(code_char($int$127)));
		defparameter("*CB-ALPHA-UPPER-CHAR-ORDER*", $$$ABCDEFGHIJKLMNOPQRSTUVWXYZ);
		defparameter("*CB-ALPHA-LOWER-CHAR-ORDER*", $$$abcdefghijklmnopqrstuvwxyz);
		defparameter("*CB-ALPHA-AROUND-TOTAL*", NIL);
		defparameter("*CB-ALPHA-AROUND-SOFAR*", NIL);
		defparameter("*CB-ALPHA-AROUND-GATHER*", NIL);
		return NIL;
	}

	public static SubLObject setup_cb_browser_file() {
		sethash($CB_C_INDEX, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str5$cb_c_index_html, NIL));
		html_macros.note_cgi_handler_function(CB_C_EL, $HTML_HANDLER);
		setup_cb_link_method($EL_FORMULAS_FOR_INDEX_HOOK, CB_LINK_EL_FORMULAS_FOR_INDEX_HOOK, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_HL, $HTML_HANDLER);
		setup_cb_link_method($HL_FORMULAS_FOR_INDEX_HOOK, CB_LINK_HL_FORMULAS_FOR_INDEX_HOOK, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_DOCUMENTATION, $HTML_HANDLER);
		setup_cb_link_method($DOCUMENTATION, CB_LINK_DOCUMENTATION, TWO_INTEGER);
		memoization_state.note_globally_cached_function(CB_DOCUMENTATION_PREDICATE_P);
		html_macros.note_cgi_handler_function(CB_SUMMARY_SENTENCE, $HTML_HANDLER);
		html_macros.note_cgi_handler_function(CB_C_DEFINITIONAL, $HTML_HANDLER);
		setup_cb_link_method($DEFINITIONAL, CB_LINK_DEFINITIONAL, TWO_INTEGER);
		sethash($CB_DESCRIBE_CONSTANT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str188$cb_describe_constant_html, NIL));
		html_macros.note_cgi_handler_function(CB_DESCRIBE_CONSTANT, $HTML_HANDLER);
		setup_cb_link_method($DESCRIBE_CONSTANT, CB_LINK_DESCRIBE_CONSTANT, ONE_INTEGER);
		sethash($CB_DESCRIBE_NAT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str209$cb_describe_nat_html, NIL));
		html_macros.note_cgi_handler_function(CB_DESCRIBE_NART, $HTML_HANDLER);
		setup_cb_link_method($DESCRIBE_NART, CB_LINK_DESCRIBE_NART, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_ALL_ASSERTED_KNOWLEDGE, $HTML_HANDLER);
		setup_cb_link_method($ALL_ASSERTED_KNOWLEDGE, CB_LINK_ALL_ASSERTED_KNOWLEDGE, THREE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_BOOKKEEPING_ASSERTIONS, $HTML_HANDLER);
		setup_cb_link_method($BOOKKEEPING_ASSERTIONS, CB_LINK_BOOKKEEPING_ASSERTIONS, THREE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_TOTAL, $HTML_HANDLER);
		setup_cb_link_method($CONSTANT_TOTAL, CB_LINK_CONSTANT_TOTAL, THREE_INTEGER);
		setup_cb_link_method($CHRONOLOGICAL_ORDER, CB_LINK_CHRONOLOGICAL_ORDER, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_ASSERTION_CHRONOLOGY, $HTML_HANDLER);
		setup_cb_link_method($ASSERTIONS_ID_ORDER, CB_LINK_ASSERTIONS_ID_ORDER, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_ASSERTIONS_ID_ORDER, $HTML_HANDLER);
		html_macros.note_cgi_handler_function(CB_C_GAF_ARG, $HTML_HANDLER);
		setup_cb_link_method($GAF_ARG, CB_LINK_GAF_ARG, FIVE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_NART_ARG, $HTML_HANDLER);
		setup_cb_link_method($NART_ARG, CB_LINK_NART_ARG, FOUR_INTEGER);
		sethash($IMPLEMENTATION_CONSTANTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str297$implementation_constants_html, NIL));
		sethash($HTML_INTERESTING_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str316$cb_yellow_star_21x21_png, $str317$_Bookmark_Term_));
		sethash($HTML_INTERESTING_ARMED_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str319$cb_yellow_star_armed_21x21_png, $str47$));
		sethash($HTML_NOT_INTERESTING_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str320$cb_yellow_star_off_21x21_png, $str321$_Remove_Bookmark_));
		sethash($HTML_INTERESTING_WORKING_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str322$cb_yellow_star_armed_rotating_21x, $str47$));
		html_macros.note_cgi_handler_function(CB_C_PREDICATE_EXTENT, $HTML_HANDLER);
		setup_cb_link_method($PREDICATE_EXTENT, CB_LINK_PREDICATE_EXTENT, THREE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_FUNCTION_EXTENT, $HTML_HANDLER);
		setup_cb_link_method($FUNCTION_EXTENT, CB_LINK_FUNCTION_EXTENT, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_PREDICATE_RULE, $HTML_HANDLER);
		setup_cb_link_method($PREDICATE_RULE, CB_LINK_PREDICATE_RULE, FIVE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_DECONTEXTUALIZED_IST_PREDICATE_RULE, $HTML_HANDLER);
		setup_cb_link_method($DECONTEXTUALIZED_IST_PREDICATE_RULE, CB_LINK_DECONTEXTUALIZED_IST_PREDICATE_RULE, FOUR_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_ISA_RULE, $HTML_HANDLER);
		setup_cb_link_method($ISA_RULE, CB_LINK_ISA_RULE, FIVE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_QUOTED_ISA_RULE, $HTML_HANDLER);
		setup_cb_link_method($QUOTED_ISA_RULE, CB_LINK_QUOTED_ISA_RULE, FIVE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_GENLS_RULE, $HTML_HANDLER);
		setup_cb_link_method($GENLS_RULE, CB_LINK_GENLS_RULE, FIVE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_GENL_MT_RULE, $HTML_HANDLER);
		setup_cb_link_method($GENL_MT_RULE, CB_LINK_GENL_MT_RULE, FIVE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_FUNCTION_RULE, $HTML_HANDLER);
		setup_cb_link_method($FUNCTION_RULE, CB_LINK_FUNCTION_RULE, FOUR_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_UNBOUND_RULE, $HTML_HANDLER);
		setup_cb_link_method($UNBOUND_RULE, CB_LINK_UNBOUND_RULE, FOUR_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_IST, $HTML_HANDLER);
		setup_cb_link_method($IST, CB_LINK_IST, TWO_INTEGER);
		setup_cb_link_method($IST_BROAD, CB_LINK_IST_BROAD, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_MT_GAFS, $HTML_HANDLER);
		setup_cb_link_method($MT_GAFS, CB_LINK_MT_GAFS, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_MT_RULES, $HTML_HANDLER);
		setup_cb_link_method($MT_RULES, CB_LINK_MT_RULES, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_OTHER, $HTML_HANDLER);
		setup_cb_link_method($OTHER, CB_LINK_OTHER, TWO_INTEGER);
		sethash($CB_AUXILIARY_INDICES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str459$cb_auxiliary_indices_html, NIL));
		html_macros.note_cgi_handler_function(CB_AUXILIARY_INDICES, $HTML_HANDLER);
		setup_cb_link_method($AUXILIARY_INDICES, CB_LINK_AUXILIARY_INDICES, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_AUXILIARY_INDEX, $HTML_HANDLER);
		setup_cb_link_method($AUXILIARY_INDEX, CB_LINK_AUXILIARY_INDEX, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_ALPHA, $HTML_HANDLER);
		html_macros.note_cgi_handler_function(CB_AD, $HTML_HANDLER);
		sethash($ALPHA, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str484$alpha_gif, $str485$_Alpha_));
		setup_cb_link_method($ALPHABETICAL, CB_LINK_ALPHABETICAL, TWO_INTEGER);
		declare_deprecated_cb_tool($ALPHA_TOP, $$$Alph, $$$Alph, $$$The_Alphabetical_Browser);
		html_macros.note_cgi_handler_function(CB_ALPHA_TOP, $HTML_HANDLER);
		setup_cb_link_method($ALPHA_TOP, CB_LINK_ALPHA_TOP, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_ALPHA_BOTTOM, $HTML_HANDLER);
		setup_cb_link_method($ALPHA_BOTTOM, CB_LINK_ALPHA_BOTTOM, ONE_INTEGER);
		html_macros.note_cgi_handler_function(CB_ALPHA_PAGEUP, $HTML_HANDLER);
		setup_cb_link_method($ALPHA_PAGEUP, CB_LINK_ALPHA_PAGEUP, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_ALPHA_PAGEDN, $HTML_HANDLER);
		setup_cb_link_method($ALPHA_PAGEDN, CB_LINK_ALPHA_PAGEDN, TWO_INTEGER);
		sethash($CB_ALPHA_INDEX, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str522$cb_alpha_index_html, NIL));
		setup_cb_link_method($GRAPH, CB_LINK_GRAPH, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_GRAPH, $HTML_HANDLER);
		html_macros.note_cgi_handler_function(CB_C_PERTINENT_QUERY_LINKS, $HTML_HANDLER);
		setup_cb_link_method($PERTINENT_QUERY, CB_LINK_PERTINENT_QUERY, TWO_INTEGER);
		html_macros.note_cgi_handler_function(CB_C_PERTINENT_QUERY, $HTML_HANDLER);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_cb_browser_file();
	}

	@Override
	public void initializeVariables() {
		init_cb_browser_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_cb_browser_file();
	}

	static {

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param structure
	 * @return
	 */
	public static SubLObject public_assertionP(SubLObject structure) {
		// TODO Auto-generated method stub
		return T;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param formula
	 * @return
	 */
	public static SubLObject public_el_formulaP(SubLObject formula) {
		// TODO Auto-generated method stub
		return T;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param fort
	 * @return
	 */
	public static SubLBoolean public_fortP(SubLObject fort) {
		// TODO Auto-generated method stub
		return T;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param fort
	 * @return
	 */
	public static SubLBoolean ikb_fortP(SubLObject fort) {
		// TODO Auto-generated method stub
		return T;
	}
}

/**
 * Total time: 7734 ms
 */
