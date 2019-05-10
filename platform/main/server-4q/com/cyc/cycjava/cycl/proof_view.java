package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.proof_view";
  public static final String myFingerPrint = "a70566ea8bbc397328d42a8a076e035c513a291eea3e0f20c6efa7a8333b29b1";
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 912L)
  public static SubLSymbol $proof_view_asserted_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1123L)
  public static SubLSymbol $proof_view_inferred_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1228L)
  public static SubLSymbol $proof_view_opaque_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1329L)
  public static SubLSymbol $proof_view_assertion_bookkeeping_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1456L)
  public static SubLSymbol $proof_view_sources_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1579L)
  public static SubLSymbol $proof_view_source_as_mt_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1710L)
  public static SubLSymbol $proof_view_justification_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 1895L)
  public static SubLSymbol $proof_view_linear_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2084L)
  public static SubLSymbol $proof_view_facts_used_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2240L)
  public static SubLSymbol $proof_view_tab_entry_labels$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2460L)
  public static SubLSymbol $proof_view_rules_used_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2618L)
  public static SubLSymbol $proof_view_circular_support_label$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2775L)
  private static SubLSymbol $proof_view_validate_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2978L)
  private static SubLSymbol $proof_view_font_colors$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3218L)
  private static SubLSymbol $proof_view_abduction_support_color$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3299L)
  private static SubLSymbol $proof_view_abduction_support_confirmed_color$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3387L)
  private static SubLSymbol $proof_view_abduction_support_denied_color$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3474L)
  private static SubLSymbol $proof_view_external_sentence_padding$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3619L)
  private static SubLSymbol $proof_view_entity_mention_padding$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3760L)
  public static SubLSymbol $proof_view_citation_format$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLSymbol $dtp_proof_view$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 5448L)
  private static SubLSymbol $proof_view_id_index$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 6745L)
  public static SubLSymbol $proof_view_root_entry_id$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 14930L)
  public static SubLSymbol $break_on_proof_view_filteringP$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLSymbol $dtp_proof_view_entry$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 37868L)
  public static SubLSymbol $proof_view_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41551L)
  private static SubLSymbol $proof_view_entry_showers$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 50894L)
  private static SubLSymbol $proof_view_object_type_output_fns$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 58315L)
  public static SubLSymbol $changed_proof_view_entry_ids$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 63023L)
  private static SubLSymbol $use_get_employer_cacheP$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 64260L)
  private static SubLSymbol $employee_employers_and_mts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 94343L)
  private static SubLSymbol $proof_view_allow_trivial_partial_proof_conclusion_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 102062L)
  public static SubLSymbol $proof_view_literals_to_suppress$;
  private static final SubLString $str0$;
  private static final SubLString $str1$External_Sources_;
  private static final SubLString $str2$Source_;
  private static final SubLString $str3$Detailed_Justification_;
  private static final SubLString $str4$Linear_Justification_;
  private static final SubLString $str5$Because_;
  private static final SubLString $str6$Key_Rules_;
  private static final SubLString $str7$Justified_above_;
  private static final SubLInteger $int8$200;
  private static final SubLInteger $int9$150;
  private static final SubLSymbol $kw10$SUPERSCRIPTS;
  private static final SubLSymbol $kw11$PROOF;
  private static final SubLSymbol $kw12$ANSWER;
  private static final SubLSymbol $sym13$_PPH_LANGUAGE_MT_;
  private static final SubLSymbol $sym14$_PROOF_VIEW_CITATION_FORMAT_;
  private static final SubLSymbol $sym15$PROOF_VIEW;
  private static final SubLSymbol $sym16$PROOF_VIEW_P;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$PROOF_VIEW_INT_PRINT;
  private static final SubLSymbol $sym22$PROOF_VIEW_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$PROOF_VIEW_INT_ID;
  private static final SubLSymbol $sym25$_CSETF_PROOF_VIEW_INT_ID;
  private static final SubLSymbol $sym26$PROOF_VIEW_INT_PROOF;
  private static final SubLSymbol $sym27$_CSETF_PROOF_VIEW_INT_PROOF;
  private static final SubLSymbol $sym28$PROOF_VIEW_INT_ANSWER;
  private static final SubLSymbol $sym29$_CSETF_PROOF_VIEW_INT_ANSWER;
  private static final SubLSymbol $sym30$PROOF_VIEW_INT_ID_INDEX;
  private static final SubLSymbol $sym31$_CSETF_PROOF_VIEW_INT_ID_INDEX;
  private static final SubLSymbol $sym32$PROOF_VIEW_INT_PROPERTIES;
  private static final SubLSymbol $sym33$_CSETF_PROOF_VIEW_INT_PROPERTIES;
  private static final SubLSymbol $kw34$ID;
  private static final SubLSymbol $kw35$ID_INDEX;
  private static final SubLSymbol $kw36$PROPERTIES;
  private static final SubLString $str37$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw38$BEGIN;
  private static final SubLSymbol $sym39$MAKE_PROOF_VIEW;
  private static final SubLSymbol $kw40$SLOT;
  private static final SubLSymbol $kw41$END;
  private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_METHOD;
  private static final SubLString $str43$__PROOF_VIEW_;
  private static final SubLString $str44$_proof_;
  private static final SubLString $str45$_;
  private static final SubLSymbol $sym46$_PROOF_VIEW_ID_INDEX_;
  private static final SubLSymbol $sym47$INTEGERP;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $kw50$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw51$ENTRY_ID;
  private static final SubLSymbol $sym52$ENTRY_ID;
  private static final SubLSymbol $kw53$DONE;
  private static final SubLSymbol $sym54$DO_ID_INDEX;
  private static final SubLSymbol $sym55$PROOF_VIEW_GET_ID_INDEX;
  private static final SubLSymbol $sym56$IGNORE;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$CSOME;
  private static final SubLSymbol $sym60$PROOF_VIEW_ENTRY_GET_CHILDREN;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$ID;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$PROOF_P;
  private static final SubLSymbol $kw66$SKIP;
  private static final SubLSymbol $kw67$FREE;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$STATE;
  private static final SubLSymbol $sym70$CLET;
  private static final SubLSymbol $sym71$FIND_PROOF_VIEW_MEMOIZATION_STATE;
  private static final SubLSymbol $sym72$WITH_MEMOIZATION_STATE;
  private static final SubLSymbol $sym73$MAYBE_WITH_PROOF_VIEW_MEMOIZATION;
  private static final SubLSymbol $kw74$MEMOIZATION_STATE;
  private static final SubLSymbol $sym75$CLEAR_PROOF_VIEW_MEMOIZATION_STATE_BY_ID;
  private static final SubLSymbol $sym76$SET_PROOF_VIEW_ALLOW_EXTERNAL_LINKS_;
  private static final SubLSymbol $sym77$SET_PROOF_VIEW_LANGUAGE_MT;
  private static final SubLSymbol $sym78$SET_PROOF_VIEW_DOMAIN_MT;
  private static final SubLSymbol $sym79$GET_PROOF_VIEW_DOMAIN_MT;
  private static final SubLSymbol $sym80$GET_PROOF_VIEW_LANGUAGE_MT;
  private static final SubLSymbol $sym81$GET_PROOF_VIEW_INCLUDE_LINEAR;
  private static final SubLSymbol $sym82$SET_PROOF_VIEW_INCLUDE_LINEAR;
  private static final SubLSymbol $sym83$GET_PROOF_VIEW_INCLUDE_DETAILS;
  private static final SubLSymbol $sym84$SET_PROOF_VIEW_INCLUDE_DETAILS;
  private static final SubLSymbol $sym85$GET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING;
  private static final SubLSymbol $sym86$SET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING;
  private static final SubLSymbol $sym87$GET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS;
  private static final SubLSymbol $sym88$SET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS;
  private static final SubLSymbol $sym89$SET_PROOF_VIEW_ADDRESSEE;
  private static final SubLSymbol $sym90$SET_PROOF_VIEW_INCLUDE_CYCML;
  private static final SubLSymbol $sym91$PROOF_VIEW_ENTRY_;
  private static final SubLSymbol $kw92$FACTS_USED;
  private static final SubLSymbol $kw93$USED_SUPPORTS;
  private static final SubLSymbol $kw94$SOURCE_INDEX;
  private static final SubLSymbol $kw95$SOURCE_ISG;
  private static final SubLSymbol $kw96$FILTERED_ITEMS;
  private static final SubLSymbol $kw97$UNKNOWN;
  private static final SubLString $str98$filtering__S____reason___S_;
  private static final SubLSymbol $sym99$INDEXED_TERM_P;
  private static final SubLObject $const100$SpecificationVariantFn;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLObject $const104$and;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$_PARAM;
  private static final SubLList $list107;
  private static final SubLObject $const108$CycArchitectureMt;
  private static final SubLSymbol $kw109$INFERENCE_MODE;
  private static final SubLSymbol $kw110$SHALLOW;
  private static final SubLSymbol $kw111$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw112$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw113$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw114$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw115$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw116$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw117$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw118$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float119$1_0;
  private static final SubLSymbol $kw120$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw121$HL;
  private static final SubLObject $const122$suppressProofViewSection;
  private static final SubLObject $const123$CycProofViewSummarySection;
  private static final SubLObject $const124$CycProofViewJustificationSection;
  private static final SubLObject $const125$CycProofViewLinearSection;
  private static final SubLObject $const126$includeProofViewSection;
  private static final SubLObject $const127$showAssertionBookkeeping;
  private static final SubLObject $const128$False;
  private static final SubLObject $const129$showAssertionDates;
  private static final SubLObject $const130$showAssertionCyclists;
  private static final SubLObject $const131$showAssertionCyclistEmployers;
  private static final SubLString $str132$Don_t_know_how_to_set_proof_view_;
  private static final SubLObject $const133$True;
  private static final SubLSymbol $kw134$ADDRESSEE;
  private static final SubLSymbol $sym135$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $kw136$INCLUDE_RULES_SECTION_;
  private static final SubLSymbol $sym137$BOOLEANP;
  private static final SubLSymbol $kw138$INCLUDE_JUSTIFICATION_SECTION_;
  private static final SubLSymbol $kw139$ENABLE_DEBUG_;
  private static final SubLSymbol $kw140$SHOW_CB_BUG_REPORT_LINKS_;
  private static final SubLSymbol $kw141$INCLUDE_CYCL_IN_OUTPUT_;
  private static final SubLSymbol $kw142$INCLUDE_SOURCES_;
  private static final SubLSymbol $kw143$LINK_PHRASES_;
  private static final SubLSymbol $kw144$SUMMARY_ONLY;
  private static final SubLSymbol $sym145$PROOF_VIEW_INCLUDE_SOURCES_SPEC_P;
  private static final SubLSymbol $kw146$INCLUDE_CYCML_IN_XML_;
  private static final SubLString $str147$SILK_not_supported_in_non_Cyc_HAL;
  private static final SubLSymbol $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_;
  private static final SubLSymbol $kw149$SUPPRESS_ASSERTION_CYCLISTS_;
  private static final SubLSymbol $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_;
  private static final SubLSymbol $kw151$SUPPRESS_ASSERTION_DATES_;
  private static final SubLSymbol $kw152$ALLOW_EXTERNAL_LINKS_;
  private static final SubLSymbol $kw153$ALLOW_INTERNAL_LINKS_;
  private static final SubLSymbol $kw154$LANGUAGE_MT;
  private static final SubLSymbol $sym155$HLMT_;
  private static final SubLSymbol $kw156$DOMAIN_MT;
  private static final SubLSymbol $kw157$CREATION_UNIVERSAL_TIME;
  private static final SubLSymbol $sym158$UNIVERSAL_TIME_P;
  private static final SubLSymbol $kw159$POPULATED_UNIVERSAL_TIME;
  private static final SubLSymbol $kw160$DISPLAYED_UNIVERSAL_TIME;
  private static final SubLSymbol $sym161$PROCESSP;
  private static final SubLSymbol $kw162$PREPARER_THREAD;
  private static final SubLSymbol $kw163$ERROR_OUTPUT;
  private static final SubLSymbol $sym164$KEYWORDP;
  private static final SubLSymbol $sym165$PROOF_VIEW_ENTRY;
  private static final SubLSymbol $sym166$PROOF_VIEW_ENTRY_P;
  private static final SubLList $list167;
  private static final SubLList $list168;
  private static final SubLList $list169;
  private static final SubLList $list170;
  private static final SubLSymbol $sym171$PROOF_VIEW_ENTRY_INT_PRINT;
  private static final SubLSymbol $sym172$PROOF_VIEW_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$PROOF_VIEW_ENTRY_INT_ID;
  private static final SubLSymbol $sym175$_CSETF_PROOF_VIEW_ENTRY_INT_ID;
  private static final SubLSymbol $sym176$PROOF_VIEW_ENTRY_INT_PARENT_ID;
  private static final SubLSymbol $sym177$_CSETF_PROOF_VIEW_ENTRY_INT_PARENT_ID;
  private static final SubLSymbol $sym178$PROOF_VIEW_ENTRY_INT_LABEL;
  private static final SubLSymbol $sym179$_CSETF_PROOF_VIEW_ENTRY_INT_LABEL;
  private static final SubLSymbol $sym180$PROOF_VIEW_ENTRY_INT_OBJECT_TYPE;
  private static final SubLSymbol $sym181$_CSETF_PROOF_VIEW_ENTRY_INT_OBJECT_TYPE;
  private static final SubLSymbol $sym182$PROOF_VIEW_ENTRY_INT_OBJECT;
  private static final SubLSymbol $sym183$_CSETF_PROOF_VIEW_ENTRY_INT_OBJECT;
  private static final SubLSymbol $sym184$PROOF_VIEW_ENTRY_INT_PROOF_VIEW;
  private static final SubLSymbol $sym185$_CSETF_PROOF_VIEW_ENTRY_INT_PROOF_VIEW;
  private static final SubLSymbol $sym186$PROOF_VIEW_ENTRY_INT_PROPERTIES;
  private static final SubLSymbol $sym187$_CSETF_PROOF_VIEW_ENTRY_INT_PROPERTIES;
  private static final SubLSymbol $kw188$PARENT_ID;
  private static final SubLSymbol $kw189$LABEL;
  private static final SubLSymbol $kw190$OBJECT_TYPE;
  private static final SubLSymbol $kw191$OBJECT;
  private static final SubLSymbol $kw192$PROOF_VIEW;
  private static final SubLSymbol $sym193$MAKE_PROOF_VIEW_ENTRY;
  private static final SubLSymbol $sym194$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_ENTRY_METHOD;
  private static final SubLString $str195$__PROOF_VIEW_ENTRY_;
  private static final SubLString $str196$_D__D;
  private static final SubLString $str197$_label_;
  private static final SubLString $str198$_S_has_no_root_entry___;
  private static final SubLList $list199;
  private static final SubLSymbol $kw200$DO_HASH_TABLE;
  private static final SubLSymbol $sym201$VALID_PROOF_VIEW_P;
  private static final SubLString $str202$_;
  private static final SubLSymbol $sym203$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym204$STRINGP;
  private static final SubLSymbol $sym205$SYMBOLP;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$PWHEN;
  private static final SubLSymbol $sym208$_PROOF_VIEW_DEBUG__;
  private static final SubLSymbol $sym209$WARN;
  private static final SubLSymbol $sym210$FORCE_FORMAT;
  private static final SubLSymbol $kw211$CHILDREN;
  private static final SubLSymbol $sym212$PROOF_VIEW_ENTRY_SPECIFICITY;
  private static final SubLSymbol $kw213$IGNORE;
  private static final SubLSymbol $sym214$PROOF_VIEW_ENTRY_GET_DEPTH;
  private static final SubLSymbol $kw215$EXPAND_INITIALLY_;
  private static final SubLSymbol $kw216$SOURCES;
  private static final SubLSymbol $kw217$FN;
  private static final SubLSymbol $kw218$FN_SECTION;
  private static final SubLSymbol $kw219$HIGHLIGHT_PHRASE_DEMERITS_;
  private static final SubLSymbol $sym220$SUPPORT_P;
  private static final SubLSymbol $sym221$ASSERTION_P;
  private static final SubLSymbol $sym222$GENERATE_HTML_FROM_PROOF_VIEW_ENTRY_IDS;
  private static final SubLString $str223$can_t_find_proof_view_entry_for_i;
  private static final SubLSymbol $sym224$PROOF_VIEW_ENTRY_HTML;
  private static final SubLSymbol $sym225$FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS;
  private static final SubLSymbol $kw226$ENTRY_PARAPHRASE_FN;
  private static final SubLSymbol $sym227$PROOF_VIEW_ENTRY_GENERATE_HTML_STANDARD;
  private static final SubLSymbol $sym228$_EXIT;
  private static final SubLSymbol $sym229$PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL;
  private static final SubLSymbol $kw230$FACT_SHEET;
  private static final SubLSymbol $kw231$NONE;
  private static final SubLList $list232;
  private static final SubLSymbol $sym233$PIF;
  private static final SubLSymbol $sym234$HTML_FANCY_FONT;
  private static final SubLSymbol $kw235$COLOR;
  private static final SubLSymbol $sym236$GENERATE_SKOLEM_TERM_EXISTENTIALLY;
  private static final SubLSymbol $sym237$GENERATE_SKOLEM_TERM_SMART;
  private static final SubLSymbol $kw238$LINEAR_ID;
  private static final SubLString $str239$_A__;
  private static final SubLSymbol $kw240$PPH_DEMERITS;
  private static final SubLSymbol $sym241$PROOF_VIEW_SUPPORT_HTML;
  private static final SubLSymbol $kw242$PROOF_VIEW_ENTRY_CONFIRMED;
  private static final SubLSymbol $kw243$PROOF_VIEW_ENTRY_DENIED;
  private static final SubLString $str244$_A;
  private static final SubLSymbol $sym245$EL_SENTENCE_P;
  private static final SubLSymbol $sym246$EL_TERM_P;
  private static final SubLSymbol $kw247$SOURCE_CITATION;
  private static final SubLSymbol $kw248$EXTERNAL_SENTENCE;
  private static final SubLList $list249;
  private static final SubLSymbol $kw250$ENTITY_MENTION;
  private static final SubLList $list251;
  private static final SubLSymbol $kw252$QUERY_SENTENCE;
  private static final SubLSymbol $kw253$BINDINGS;
  private static final SubLSymbol $kw254$RULE_USED;
  private static final SubLObject $const255$keyRuleEnglishSummary;
  private static final SubLSymbol $kw256$UNSUPPORTED_SUPPORT;
  private static final SubLString $str257$Fact_computed_by_Cyc_;
  private static final SubLSymbol $kw258$NO_JUSTIFICATION;
  private static final SubLString $str259$No_justification_available_;
  private static final SubLSymbol $kw260$CIRCULAR_SUPPORT;
  private static final SubLSymbol $kw261$ABDUCED_SUPPORT;
  private static final SubLString $str262$Cyc_thinks_this_might_be_true_but;
  private static final SubLSymbol $kw263$ABDUCED_SUPPORT_CONFIRMED;
  private static final SubLString $str264$Confirmed__but_not_provable_from_;
  private static final SubLSymbol $kw265$ABDUCED_SUPPORT_DENIED;
  private static final SubLString $str266$Denied__and_not_provable_from_pre;
  private static final SubLSymbol $kw267$GIVEN;
  private static final SubLString $str268$Given_in_the_question_;
  private static final SubLSymbol $kw269$EXCEPTION;
  private static final SubLString $str270$This_rule_has_exceptions__but_non;
  private static final SubLSymbol $kw271$PRAGMATICS;
  private static final SubLString $str272$This_rule_has_further_conditions_;
  private static final SubLSymbol $kw273$ASSERTION_BOOKKEEPING;
  private static final SubLSymbol $kw274$ROOT;
  private static final SubLSymbol $kw275$SECTION_ROOT;
  private static final SubLSymbol $kw276$NO_SOURCE_DOCUMENT;
  private static final SubLSymbol $kw277$EMPTY_JUSTIFICATION;
  private static final SubLSymbol $kw278$PREMISE;
  private static final SubLSymbol $kw279$RULE;
  private static final SubLSymbol $kw280$CONCLUSION;
  private static final SubLSymbol $kw281$FROM;
  private static final SubLString $str282$From_;
  private static final SubLString $str283$_A_and__A;
  private static final SubLString $str284$and_;
  private static final SubLString $str285$__;
  private static final SubLString $str286$no_output_method_for__S;
  private static final SubLSymbol $kw287$HAS_ABDUCED_SUPPORT_;
  private static final SubLSymbol $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_;
  private static final SubLSymbol $kw289$HAS_ABDUCED_SUPPORT_DENIED_;
  private static final SubLSymbol $sym290$PPH_SOURCE_CITATION_P;
  private static final SubLList $list291;
  private static final SubLString $str292$__;
  private static final SubLString $str293$Given_in_the_query;
  private static final SubLString $str294$Entered;
  private static final SubLString $str295$_by_an_employee_;
  private static final SubLString $str296$_by_;
  private static final SubLString $str297$_of_;
  private static final SubLString $str298$_on_;
  private static final SubLString $str299$_at_;
  private static final SubLString $str300$_for_;
  private static final SubLString $str301$Fact_asserted_in_Cyc_Knowledge_Ba;
  private static final SubLString $str302$_;
  private static final SubLObject $const303$HypotheticalContext;
  private static final SubLList $list304;
  private static final SubLObject $const305$Null_TimeParameter;
  private static final SubLSymbol $sym306$_EMPLOYER;
  private static final SubLObject $const307$ist;
  private static final SubLSymbol $sym308$_MT;
  private static final SubLObject $const309$employees;
  private static final SubLList $list310;
  private static final SubLObject $const311$temporallySubsumes;
  private static final SubLSymbol $sym312$_TIME;
  private static final SubLObject $const313$InferencePSC;
  private static final SubLList $list314;
  private static final SubLSymbol $sym315$EMPLOYEE_EMPLOYERS_AND_MTS;
  private static final SubLList $list316;
  private static final SubLList $list317;
  private static final SubLSymbol $sym318$_EMPLOYEE_EMPLOYERS_AND_MTS_CACHING_STATE_;
  private static final SubLList $list319;
  private static final SubLObject $const320$lengthOfList;
  private static final SubLList $list321;
  private static final SubLList $list322;
  private static final SubLObject $const323$startOffset;
  private static final SubLSymbol $sym324$_DOCUMENT;
  private static final SubLList $list325;
  private static final SubLList $list326;
  private static final SubLString $str327$___;
  private static final SubLList $list328;
  private static final SubLSymbol $sym329$_TEXT;
  private static final SubLObject $const330$textOfWork;
  private static final SubLList $list331;
  private static final SubLList $list332;
  private static final SubLList $list333;
  private static final SubLObject $const334$startOffsetForMention;
  private static final SubLObject $const335$stringLengthForMention;
  private static final SubLString $str336$black;
  private static final SubLSymbol $kw337$EXTERNAL_TERMS;
  private static final SubLSymbol $kw338$NOT_FOUND;
  private static final SubLSymbol $sym339$_;
  private static final SubLSymbol $sym340$SECOND;
  private static final SubLSymbol $sym341$_STRING;
  private static final SubLObject $const342$termStrings;
  private static final SubLList $list343;
  private static final SubLList $list344;
  private static final SubLString $str345$__;
  private static final SubLString $str346$_;
  private static final SubLSymbol $sym347$PROOF_VIEW_REFERENCE_SUBSUMES_P;
  private static final SubLSymbol $sym348$GET_ABDUCED_SUPPORT_SENTENCE_FOR_PROOF_VIEW;
  private static final SubLObject $const349$not;
  private static final SubLSymbol $sym350$ASSERT_ABDUCTION_SUPPORT_FOR_PROOF_VIEW;
  private static final SubLObject $const351$ContextOfPCWFn;
  private static final SubLSymbol $sym352$GET_QUERY_URL_FOR_PROOF_VIEW;
  private static final SubLSymbol $sym353$GET_SENTENCE_FOR_PROOF_VIEW;
  private static final SubLSymbol $sym354$CONSTRUCT_PROOF_VIEWS_JAVA_ITERATIVELY;
  private static final SubLSymbol $sym355$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym356$PROOF_ABDUCTIONS;
  private static final SubLSymbol $sym357$PROOF_ABDUCED_SUPPORT_RATIO;
  private static final SubLSymbol $sym358$INFERENCE_PROOF_GET_DEPTH;
  private static final SubLSymbol $sym359$CONSTRUCT_PROOF_VIEWS_JAVA_LIST;
  private static final SubLString $str360$inference_answer___A__;
  private static final SubLString $str361$proofs___A__;
  private static final SubLSymbol $sym362$CONSTRUCT_XML_PROOF_VIEW_FOR_SENTENCE;
  private static final SubLSymbol $kw363$MAX_NUMBER;
  private static final SubLSymbol $sym364$PROOF_VIEW_ID_POPULATE;
  private static final SubLSymbol $sym365$PROOF_VIEW_XML;
  private static final SubLString $str366$_s_Does_not_identify_existing_pro;
  private static final SubLString $str367$UTF_8;
  private static final SubLSymbol $sym368$PROOF_VIEW_ENTRY_XML;
  private static final SubLSymbol $kw369$TOP_LEVEL_ONLY;
  private static final SubLList $list370;
  private static final SubLSymbol $sym371$XML_TAG;
  private static final SubLList $list372;
  private static final SubLList $list373;
  private static final SubLString $str374$proof_view;
  private static final SubLString $str375$id;
  private static final SubLSymbol $kw376$JUSTIFICATION_ROOT;
  private static final SubLString $str377$proof_view_details;
  private static final SubLSymbol $kw378$SOURCES_ROOT;
  private static final SubLString $str379$proof_view_sources;
  private static final SubLSymbol $kw380$RULES_USED;
  private static final SubLString $str381$proof_view_rules;
  private static final SubLString $str382$proof_view_id;
  private static final SubLString $str383$proof_view_entry;
  private static final SubLString $str384$sub_entries;
  private static final SubLList $list385;
  private static final SubLString $str386$cycl;
  private static final SubLString $str387$expand_initially;
  private static final SubLString $str388$label;
  private static final SubLString $str389$object_type;
  private static final SubLString $str390$abduced_support;
  private static final SubLString $str391$content;
  private static final SubLSymbol $kw392$ENTRIES;
  private static final SubLSymbol $kw393$TRUE;
  private static final SubLSymbol $kw394$FALSE;
  private static final SubLSymbol $kw395$ABDUCED_SUPPORT_;
  private static final SubLSymbol $sym396$GET_NEW_EMPTY_PROOF_VIEW_ID;
  private static final SubLSymbol $sym397$INFERENCE_ANSWER_P;
  private static final SubLString $str398$Yes_;
  private static final SubLSymbol $kw399$USED_RULES_ROOT;
  private static final SubLSymbol $kw400$QUERY_ROOT;
  private static final SubLSymbol $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_;
  private static final SubLList $list402;
  private static final SubLString $str403$_S___trivially_implies_answer_con;
  private static final SubLSymbol $kw404$TVA;
  private static final SubLList $list405;
  private static final SubLList $list406;
  private static final SubLSymbol $sym407$PROOF_VIEW_FACT_IMPLIES_;
  private static final SubLList $list408;
  private static final SubLSymbol $sym409$FACTOR;
  private static final SubLSymbol $sym410$SLOT;
  private static final SubLSymbol $sym411$EVENT;
  private static final SubLList $list412;
  private static final SubLObject $const413$IncreaseOnSlotFn;
  private static final SubLList $list414;
  private static final SubLSymbol $sym415$COL2;
  private static final SubLSymbol $sym416$COL1;
  private static final SubLSymbol $sym417$BIN_PRED;
  private static final SubLList $list418;
  private static final SubLSymbol $sym419$PRED;
  private static final SubLObject $const420$Kappa;
  private static final SubLList $list421;
  private static final SubLObject $const422$relationAllExists;
  private static final SubLObject $const423$coGenlPreds;
  private static final SubLList $list424;
  private static final SubLSymbol $sym425$MIN;
  private static final SubLList $list426;
  private static final SubLSymbol $sym427$SUBS;
  private static final SubLSymbol $sym428$SUPER;
  private static final SubLList $list429;
  private static final SubLList $list430;
  private static final SubLList $list431;
  private static final SubLSymbol $sym432$SUB2;
  private static final SubLSymbol $sym433$SUB1;
  private static final SubLList $list434;
  private static final SubLSymbol $kw435$FULLY_BOUND;
  private static final SubLList $list436;
  private static final SubLSymbol $sym437$SUB;
  private static final SubLSymbol $sym438$SUP;
  private static final SubLObject $const439$startTogetherInSituationType;
  private static final SubLSymbol $kw440$ANYTHING;
  private static final SubLString $str441$_S___trivially_implies__S;
  private static final SubLSymbol $sym442$PROOF_VIEW_FACT_SENTENCE;
  private static final SubLString $str443$Don_t_know_how_to_get_sentence_of;
  private static final SubLSymbol $sym444$PROOF_VIEW_FACT_HL_SENTENCE;
  private static final SubLString $str445$Don_t_know_how_to_get_HL_sentence;
  private static final SubLSymbol $sym446$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS;
  private static final SubLList $list447;
  private static final SubLList $list448;
  private static final SubLString $str449$Suppressing__S___because_it_match;
  private static final SubLSymbol $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_;
  private static final SubLSymbol $kw451$TEST;
  private static final SubLSymbol $sym452$GENL_PREDICATE_;
  private static final SubLList $list453;
  private static final SubLSymbol $sym454$PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS;
  private static final SubLObject $const455$isa;
  private static final SubLList $list456;
  private static final SubLObject $const457$sourceOfTerm;
  private static final SubLList $list458;
  private static final SubLSymbol $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED;
  private static final SubLString $str460$_____Answer____;
  private static final SubLObject $const461$SomethingExisting;
  private static final SubLSymbol $sym462$FORMULA_ARG3;
  private static final SubLObject $const463$assertionRequiredForJustification;
  private static final SubLObject $const464$BookkeepingMt;

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 2905L)
  public static SubLObject proof_view_default_color()
  {
    return html_macros.$html_color_black$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 3877L)
  public static SubLObject proof_view_params(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject alist = NIL;
    alist = list_utilities.alist_enter( alist, $kw11$PROOF, proof_view_get_proof( v_proof_view ), UNPROVIDED );
    alist = list_utilities.alist_enter( alist, $kw12$ANSWER, proof_view_get_answer( v_proof_view ), UNPROVIDED );
    alist = list_utilities.alist_enter( alist, $sym13$_PPH_LANGUAGE_MT_, pph_vars.$pph_language_mt$.getDynamicValue( thread ), UNPROVIDED );
    alist = list_utilities.alist_enter( alist, $sym14$_PROOF_VIEW_CITATION_FORMAT_, $proof_view_citation_format$.getDynamicValue( thread ), UNPROVIDED );
    return alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    proof_view_int_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $proof_view_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_int_id(final SubLObject v_object)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_int_proof(final SubLObject v_object)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_int_answer(final SubLObject v_object)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_int_id_index(final SubLObject v_object)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject proof_view_int_properties(final SubLObject v_object)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject _csetf_proof_view_int_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject _csetf_proof_view_int_proof(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject _csetf_proof_view_int_answer(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject _csetf_proof_view_int_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject _csetf_proof_view_int_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject make_proof_view(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $proof_view_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_proof_view_int_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw11$PROOF ) )
      {
        _csetf_proof_view_int_proof( v_new, current_value );
      }
      else if( pcase_var.eql( $kw12$ANSWER ) )
      {
        _csetf_proof_view_int_answer( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$ID_INDEX ) )
      {
        _csetf_proof_view_int_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$PROPERTIES ) )
      {
        _csetf_proof_view_int_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str37$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject visit_defstruct_proof_view(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw38$BEGIN, $sym39$MAKE_PROOF_VIEW, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw34$ID, proof_view_int_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw11$PROOF, proof_view_int_proof( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw12$ANSWER, proof_view_int_answer( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw35$ID_INDEX, proof_view_int_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw36$PROPERTIES, proof_view_int_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw41$END, $sym39$MAKE_PROOF_VIEW, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4679L)
  public static SubLObject visit_defstruct_object_proof_view_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_proof_view( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 4932L)
  public static SubLObject valid_proof_view_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != proof_view_p( v_object ) && proof_view_int_id( v_object ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 5058L)
  public static SubLObject proof_view_int_print(final SubLObject v_proof_view, final SubLObject stream, final SubLObject depth)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    streams_high.write_string( $str43$__PROOF_VIEW_, stream, UNPROVIDED, UNPROVIDED );
    print_high.prin1( proof_view_int_id( v_proof_view ), stream );
    streams_high.write_string( $str44$_proof_, stream, UNPROVIDED, UNPROVIDED );
    print_high.prin1( proof_view_int_proof( v_proof_view ), stream );
    streams_high.write_string( $str45$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 5563L)
  public static SubLObject proof_view_id_index()
  {
    return $proof_view_id_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 5634L)
  public static SubLObject get_next_proof_view_id()
  {
    final SubLObject v_id_index = proof_view_id_index();
    return id_index.id_index_reserve( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 5760L)
  public static SubLObject find_proof_view_by_id(final SubLObject proof_view_id)
  {
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    return id_index.id_index_lookup( proof_view_id_index(), proof_view_id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 5915L)
  public static SubLObject proof_view_do_entries(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject entry = NIL;
    SubLObject v_proof_view = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    entry = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    v_proof_view = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list48 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list48 );
      if( NIL == conses_high.member( current_$1, $list49, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw50$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
    }
    final SubLObject entry_id_tail = cdestructuring_bind.property_list_member( $kw51$ENTRY_ID, current );
    final SubLObject entry_id = ( NIL != entry_id_tail ) ? conses_high.cadr( entry_id_tail ) : $sym52$ENTRY_ID;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw53$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym54$DO_ID_INDEX, ConsesLow.list( entry_id, entry, ConsesLow.list( $sym55$PROOF_VIEW_GET_ID_INDEX, v_proof_view ), $kw53$DONE, done ), ConsesLow.list( $sym56$IGNORE, entry_id ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 6150L)
  public static SubLObject proof_view_entry_do_children(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dtr_entry = NIL;
    SubLObject entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    dtr_entry = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    entry = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$2, $list58, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw50$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw53$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym59$CSOME, ConsesLow.list( dtr_entry, ConsesLow.list( $sym60$PROOF_VIEW_ENTRY_GET_CHILDREN, entry ), done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 6327L)
  public static SubLObject most_recent_proof_view()
  {
    final SubLObject start = get_next_proof_view_id();
    SubLObject end_var;
    SubLObject i;
    SubLObject view;
    for( end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE( end_var ); i = Numbers.add( i, MINUS_ONE_INTEGER ) )
    {
      view = find_proof_view_by_id( i );
      if( NIL != view )
      {
        return view;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 6557L)
  public static SubLObject do_all_proof_views(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_proof_view = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    v_proof_view = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
      if( NIL == conses_high.member( current_$3, $list62, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw50$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw34$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : $sym63$ID;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw53$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym54$DO_ID_INDEX, ConsesLow.list( id, v_proof_view, $list64, $kw53$DONE, done ), ConsesLow.list( $sym56$IGNORE, id ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 6846L)
  public static SubLObject new_proof_view(SubLObject proof, SubLObject v_answer)
  {
    if( proof == UNPROVIDED )
    {
      proof = NIL;
    }
    if( v_answer == UNPROVIDED )
    {
      v_answer = NIL;
    }
    if( NIL != proof && !assertionsDisabledInClass && NIL == inference_datastructures_proof.proof_p( proof ) )
    {
      throw new AssertionError( proof );
    }
    final SubLObject id = get_next_proof_view_id();
    final SubLObject v_proof_view = make_proof_view( ConsesLow.list( new SubLObject[] { $kw34$ID, id, $kw11$PROOF, proof, $kw12$ANSWER, v_answer, $kw35$ID_INDEX, id_index.new_id_index( ZERO_INTEGER,
        $proof_view_root_entry_id$.getGlobalValue() ), $kw36$PROPERTIES, NIL
    } ) );
    proof_view_populator.proof_view_add_root_entry( v_proof_view );
    id_index.id_index_enter( proof_view_id_index(), id, v_proof_view );
    proof_view_set_creation_universal_time( v_proof_view, UNPROVIDED );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 7363L)
  public static SubLObject destroy_proof_view(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    if( NIL != valid_proof_view_p( v_proof_view ) )
    {
      final SubLObject id = proof_view_get_id( v_proof_view );
      try
      {
        destroy_proof_view_int( v_proof_view );
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          id_index.id_index_remove( proof_view_id_index(), id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values2 = Values.getValuesAsVector();
          id_index.id_index_remove( proof_view_id_index(), id );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 7658L)
  public static SubLObject destroy_all_proof_views()
  {
    SubLObject proof_views = NIL;
    final SubLObject id_index_lock = id_index.id_index_lock( proof_view_id_index() );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject idx = proof_view_id_index();
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw66$SKIP ) )
      {
        final SubLObject idx_$4 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$4, $kw66$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject v_proof_view;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            v_proof_view = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( v_proof_view ) || NIL == id_index.id_index_skip_tombstones_p( $kw66$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( v_proof_view ) )
              {
                v_proof_view = $kw66$SKIP;
              }
              proof_views = ConsesLow.cons( v_proof_view, proof_views );
            }
          }
        }
        final SubLObject idx_$5 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$5 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$5 );
          SubLObject id2 = NIL;
          SubLObject v_proof_view2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              v_proof_view2 = Hashtables.getEntryValue( cdohash_entry );
              proof_views = ConsesLow.cons( v_proof_view2, proof_views );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      SubLObject cdolist_list_var = proof_views;
      SubLObject v_proof_view3 = NIL;
      v_proof_view3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        destroy_proof_view( v_proof_view3 );
        cdolist_list_var = cdolist_list_var.rest();
        v_proof_view3 = cdolist_list_var.first();
      }
      id_index.clear_id_index( proof_view_id_index() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return Sequences.length( proof_views );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 8001L)
  public static SubLObject destroy_proof_view_int(final SubLObject v_proof_view)
  {
    final SubLObject v_id_index = proof_view_get_id_index( v_proof_view );
    SubLObject entries = NIL;
    final SubLObject id_index_lock = id_index.id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject idx = v_id_index;
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw66$SKIP ) )
      {
        final SubLObject idx_$6 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw66$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject entry;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            entry = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( entry ) || NIL == id_index.id_index_skip_tombstones_p( $kw66$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( entry ) )
              {
                entry = $kw66$SKIP;
              }
              entries = ConsesLow.cons( entry, entries );
            }
          }
        }
        final SubLObject idx_$7 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$7 );
          SubLObject id2 = NIL;
          SubLObject entry2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              entry2 = Hashtables.getEntryValue( cdohash_entry );
              entries = ConsesLow.cons( entry2, entries );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      SubLObject cdolist_list_var = entries;
      SubLObject entry3 = NIL;
      entry3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        destroy_proof_view_entry( entry3 );
        cdolist_list_var = cdolist_list_var.rest();
        entry3 = cdolist_list_var.first();
      }
      id_index.clear_id_index( v_id_index );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    _csetf_proof_view_int_id_index( v_proof_view, $kw67$FREE );
    _csetf_proof_view_int_id( v_proof_view, $kw67$FREE );
    _csetf_proof_view_int_proof( v_proof_view, $kw67$FREE );
    _csetf_proof_view_int_answer( v_proof_view, $kw67$FREE );
    clear_proof_view_memoization_state( v_proof_view );
    _csetf_proof_view_int_properties( v_proof_view, $kw67$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 8665L)
  public static SubLObject maybe_with_proof_view_memoization(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_proof_view = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    v_proof_view = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject state = $sym69$STATE;
      return ConsesLow.list( $sym70$CLET, ConsesLow.list( ConsesLow.list( state, ConsesLow.list( $sym71$FIND_PROOF_VIEW_MEMOIZATION_STATE, v_proof_view ) ) ), ConsesLow.listS( $sym72$WITH_MEMOIZATION_STATE, ConsesLow
          .list( state ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list68 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 8904L)
  public static SubLObject find_proof_view_memoization_state(final SubLObject v_proof_view)
  {
    SubLObject v_memoization_state = memoization_state.current_memoization_state();
    if( NIL == memoization_state.memoization_state_p( v_memoization_state ) )
    {
      v_memoization_state = proof_view_find_or_create_cached_memoization_state( v_proof_view );
    }
    return v_memoization_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 9256L)
  public static SubLObject proof_view_find_or_create_cached_memoization_state(final SubLObject v_proof_view)
  {
    SubLObject v_memoization_state = proof_view_get_cached_memoization_state( v_proof_view );
    if( NIL == memoization_state.memoization_state_p( v_memoization_state ) )
    {
      v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      proof_view_set_cached_memoization_state( v_proof_view, v_memoization_state );
    }
    return v_memoization_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 9637L)
  public static SubLObject proof_view_get_cached_memoization_state(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw74$MEMOIZATION_STATE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 9771L)
  public static SubLObject proof_view_set_cached_memoization_state(final SubLObject v_proof_view, final SubLObject v_memoization_state)
  {
    return proof_view_set_property( v_proof_view, $kw74$MEMOIZATION_STATE, v_memoization_state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 9941L)
  public static SubLObject clear_proof_view_memoization_state_by_id(final SubLObject proof_view_id)
  {
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    final SubLObject v_proof_view = find_proof_view_by_id( proof_view_id );
    if( NIL != proof_view_p( v_proof_view ) )
    {
      clear_proof_view_memoization_state( v_proof_view );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 10221L)
  public static SubLObject clear_proof_view_memoization_state(final SubLObject v_proof_view)
  {
    final SubLObject state = proof_view_get_cached_memoization_state( v_proof_view );
    if( NIL != memoization_state.memoization_state_p( state ) )
    {
      memoization_state.clear_all_memoization( state );
    }
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 10454L)
  public static SubLObject set_proof_view_allow_external_linksP(final SubLObject proof_view_id, final SubLObject allow_external_linksP)
  {
    proof_view_set_allow_external_linksP( find_proof_view_by_id( proof_view_id ), allow_external_linksP );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 10775L)
  public static SubLObject set_proof_view_language_mt(final SubLObject proof_view_id, final SubLObject language_mt)
  {
    proof_view_set_language_mt( find_proof_view_by_id( proof_view_id ), language_mt );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 10940L)
  public static SubLObject set_proof_view_domain_mt(final SubLObject proof_view_id, final SubLObject domain_mt)
  {
    proof_view_set_domain_mt( find_proof_view_by_id( proof_view_id ), domain_mt );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 11097L)
  public static SubLObject get_proof_view_domain_mt(final SubLObject proof_view_id)
  {
    return proof_view_get_domain_mt( find_proof_view_by_id( proof_view_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 11230L)
  public static SubLObject get_proof_view_language_mt(final SubLObject proof_view_id)
  {
    return proof_view_get_language_mt( find_proof_view_by_id( proof_view_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 11367L)
  public static SubLObject get_proof_view_include_linear(final SubLObject proof_view_id)
  {
    return proof_view_linear.proof_view_get_include_linear_sectionP( find_proof_view_by_id( proof_view_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 11519L)
  public static SubLObject set_proof_view_include_linear(final SubLObject proof_view_id, final SubLObject bool)
  {
    proof_view_linear.proof_view_set_include_linear_sectionP( find_proof_view_by_id( proof_view_id ), bool );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 11685L)
  public static SubLObject get_proof_view_include_details(final SubLObject proof_view_id)
  {
    return proof_view_get_include_justification_sectionP( find_proof_view_by_id( proof_view_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 11845L)
  public static SubLObject set_proof_view_include_details(final SubLObject proof_view_id, final SubLObject bool)
  {
    proof_view_set_include_justification_sectionP( find_proof_view_by_id( proof_view_id ), bool );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 12019L)
  public static SubLObject get_proof_view_suppress_assertion_bookkeeping(final SubLObject proof_view_id)
  {
    return proof_view_get_suppress_assertion_bookkeepingP( find_proof_view_by_id( proof_view_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 12195L)
  public static SubLObject set_proof_view_suppress_assertion_bookkeeping(final SubLObject proof_view_id, final SubLObject bool)
  {
    proof_view_set_suppress_assertion_bookkeepingP( find_proof_view_by_id( proof_view_id ), bool );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 12385L)
  public static SubLObject get_proof_view_suppress_assertion_cyclists(final SubLObject proof_view_id)
  {
    return proof_view_get_suppress_assertion_cyclistsP( find_proof_view_by_id( proof_view_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 12555L)
  public static SubLObject set_proof_view_suppress_assertion_cyclists(final SubLObject proof_view_id, final SubLObject bool)
  {
    proof_view_set_suppress_assertion_cyclistsP( find_proof_view_by_id( proof_view_id ), bool );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 12739L)
  public static SubLObject set_proof_view_addressee(final SubLObject proof_view_id, final SubLObject addressee)
  {
    proof_view_set_addressee( find_proof_view_by_id( proof_view_id ), addressee );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 12896L)
  public static SubLObject set_proof_view_include_cycml(final SubLObject proof_view_id, final SubLObject bool)
  {
    proof_view_set_include_cycml_in_xmlP( find_proof_view_by_id( proof_view_id ), bool );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13059L)
  public static SubLObject proof_view_get_id(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return proof_view_int_id( v_proof_view );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13185L)
  public static SubLObject proof_view_get_id_index(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return proof_view_int_id_index( v_proof_view );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13326L)
  public static SubLObject proof_view_get_proof(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return proof_view_int_proof( v_proof_view );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13458L)
  public static SubLObject proof_view_get_answer(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return proof_view_int_answer( v_proof_view );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13592L)
  public static SubLObject proof_view_get_entries(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return Sort.sort( id_index.id_index_values( proof_view_int_id_index( v_proof_view ) ), $sym91$PROOF_VIEW_ENTRY_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13773L)
  public static SubLObject proof_view_get_facts_used(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return proof_view_get_property( v_proof_view, $kw92$FACTS_USED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 13925L)
  public static SubLObject proof_view_get_used_supports(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw93$USED_SUPPORTS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 14045L)
  public static SubLObject proof_view_get_source_index(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw94$SOURCE_INDEX, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 14165L)
  public static SubLObject proof_view_get_source_id(final SubLObject v_proof_view, SubLObject source)
  {
    if( NIL == proof_view_valid_source_p( source ) )
    {
      return NIL;
    }
    final SubLObject source_index = proof_view_get_source_index( v_proof_view );
    final SubLObject citation = ( NIL != dictionary.dictionary_p( source_index ) ) ? dictionary.dictionary_lookup( source_index, source, NIL ) : NIL;
    final SubLObject source_id = ( NIL != pph_html.pph_source_citation_p( citation ) ) ? pph_html.pph_source_citation_id( citation ) : NIL;
    return source_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 14575L)
  public static SubLObject proof_view_get_source_isg(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw95$SOURCE_ISG, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 14691L)
  public static SubLObject proof_view_get_filtered_items(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw96$FILTERED_ITEMS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 14993L)
  public static SubLObject proof_view_note_filtered_item(final SubLObject v_proof_view, final SubLObject support, SubLObject reason)
  {
    if( reason == UNPROVIDED )
    {
      reason = $kw97$UNKNOWN;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $break_on_proof_view_filteringP$.getDynamicValue( thread ) )
    {
      Errors.sublisp_break( $str98$filtering__S____reason___S_, new SubLObject[] { support, reason
      } );
    }
    SubLObject filtered_items = proof_view_get_filtered_items( v_proof_view );
    if( NIL == filtered_items )
    {
      filtered_items = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
      proof_view_set_property( v_proof_view, $kw96$FILTERED_ITEMS, filtered_items );
    }
    return dictionary_utilities.dictionary_pushnew( filtered_items, reason, support, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 15552L)
  public static SubLObject proof_view_set_parameters_from_specification(final SubLObject v_proof_view, SubLObject specification)
  {
    assert NIL != kb_indexing_datastructures.indexed_term_p( specification ) : specification;
    set.clear_set( proof_view_populator.proof_view_special_sections_to_include( v_proof_view ) );
    final SubLObject overrides = stacks.create_stack();
    while ( NIL != cycl_grammar.cycl_nat_p( specification ) && $const100$SpecificationVariantFn.eql( cycl_utilities.nat_functor( specification ) ))
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( specification, UNPROVIDED );
      SubLObject new_specification = NIL;
      SubLObject cycl_param = NIL;
      SubLObject cycl_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      new_specification = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      cycl_param = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      cycl_value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        stacks.stack_push( ConsesLow.cons( cycl_param, cycl_value ), overrides );
        specification = new_specification;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
      }
    }
    SubLObject cdolist_list_var = ask_utilities.query_template( $list103, ConsesLow.list( $const104$and, $list105, ConsesLow.listS( $sym106$_PARAM, specification, $list107 ) ), $const108$CycArchitectureMt, ConsesLow
        .list( new SubLObject[]
        { $kw109$INFERENCE_MODE, $kw110$SHALLOW, $kw111$ALLOW_INDETERMINATE_RESULTS_, NIL, $kw112$DISJUNCTION_FREE_EL_VARS_POLICY, $kw113$COMPUTE_INTERSECTION, $kw114$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T,
          $kw115$NEW_TERMS_ALLOWED_, NIL, $kw116$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL, $kw117$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw118$PROBABLY_APPROXIMATELY_DONE, $float119$1_0, $kw120$ANSWER_LANGUAGE, $kw121$HL
    } ) );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current2;
      final SubLObject datum2 = current2 = cons;
      SubLObject cycl_param2 = NIL;
      SubLObject cycl_value2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list102 );
      cycl_param2 = current2.first();
      current2 = ( cycl_value2 = current2.rest() );
      proof_view_set_parameter_from_specification( v_proof_view, cycl_param2, cycl_value2 );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    while ( NIL == stacks.stack_empty_p( overrides ))
    {
      SubLObject current;
      final SubLObject datum = current = stacks.stack_pop( overrides );
      SubLObject cycl_param3 = NIL;
      SubLObject cycl_value3 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
      cycl_param3 = current.first();
      current = ( cycl_value3 = current.rest() );
      proof_view_set_parameter_from_specification( v_proof_view, cycl_param3, cycl_value3 );
    }
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 17056L)
  public static SubLObject proof_view_set_parameter_from_specification(final SubLObject v_proof_view, final SubLObject cycl_param, final SubLObject cycl_value)
  {
    final SubLObject property = parameter_specification_utilities.software_parameter_value_subl_identifier( cycl_param );
    if( property.isKeyword() )
    {
      proof_view_set_property( v_proof_view, property, proof_view_property_value_from_cycl( cycl_value ) );
    }
    else if( $const122$suppressProofViewSection.eql( cycl_param ) )
    {
      if( cycl_value.eql( $const123$CycProofViewSummarySection ) )
      {
        proof_view_summary.proof_view_set_include_summary_sectionP( v_proof_view, NIL );
      }
      else if( cycl_value.eql( $const124$CycProofViewJustificationSection ) )
      {
        proof_view_set_include_justification_sectionP( v_proof_view, NIL );
      }
      else if( cycl_value.eql( $const125$CycProofViewLinearSection ) )
      {
        proof_view_linear.proof_view_set_include_linear_sectionP( v_proof_view, NIL );
      }
      else
      {
        proof_view_populator.proof_view_set_include_special_sectionP( v_proof_view, cycl_value, NIL );
      }
    }
    else if( $const126$includeProofViewSection.eql( cycl_param ) )
    {
      if( cycl_value.eql( $const123$CycProofViewSummarySection ) )
      {
        proof_view_summary.proof_view_set_include_summary_sectionP( v_proof_view, T );
      }
      else if( cycl_value.eql( $const124$CycProofViewJustificationSection ) )
      {
        proof_view_set_include_justification_sectionP( v_proof_view, T );
      }
      else if( cycl_value.eql( $const125$CycProofViewLinearSection ) )
      {
        proof_view_linear.proof_view_set_include_linear_sectionP( v_proof_view, T );
      }
      else
      {
        proof_view_populator.proof_view_set_include_special_sectionP( v_proof_view, cycl_value, T );
      }
    }
    else if( cycl_param.eql( $const127$showAssertionBookkeeping ) )
    {
      proof_view_set_suppress_assertion_bookkeepingP( v_proof_view, Equality.eql( cycl_value, $const128$False ) );
    }
    else if( cycl_param.eql( $const129$showAssertionDates ) )
    {
      proof_view_set_suppress_assertion_datesP( v_proof_view, Equality.eql( cycl_value, $const128$False ) );
    }
    else if( cycl_param.eql( $const130$showAssertionCyclists ) )
    {
      proof_view_set_suppress_assertion_cyclistsP( v_proof_view, Equality.eql( cycl_value, $const128$False ) );
    }
    else if( cycl_param.eql( $const131$showAssertionCyclistEmployers ) )
    {
      proof_view_set_suppress_assertion_cyclist_employersP( v_proof_view, Equality.eql( cycl_value, $const128$False ) );
    }
    else
    {
      Errors.error( $str132$Don_t_know_how_to_set_proof_view_, cycl_param, cycl_value );
    }
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 18845L)
  public static SubLObject proof_view_property_value_from_cycl(final SubLObject cycl_value)
  {
    if( cycl_value.eql( $const133$True ) )
    {
      return T;
    }
    if( cycl_value.eql( $const128$False ) )
    {
      return NIL;
    }
    return cycl_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 19011L)
  public static SubLObject proof_view_get_addressee(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return proof_view_get_property( v_proof_view, $kw134$ADDRESSEE, pph_vars.$pph_addressee$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 19138L)
  public static SubLObject proof_view_set_addressee(final SubLObject v_proof_view, final SubLObject addressee)
  {
    assert NIL != cycl_grammar.cycl_denotational_term_p( addressee ) : addressee;
    return proof_view_set_property( v_proof_view, $kw134$ADDRESSEE, addressee );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 19319L)
  public static SubLObject proof_view_get_include_rules_sectionP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw136$INCLUDE_RULES_SECTION_, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 19458L)
  public static SubLObject proof_view_set_include_rules_sectionP(final SubLObject v_proof_view, final SubLObject include_rules_sectionP)
  {
    assert NIL != Types.booleanp( include_rules_sectionP ) : include_rules_sectionP;
    return proof_view_set_property( v_proof_view, $kw136$INCLUDE_RULES_SECTION_, include_rules_sectionP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 19688L)
  public static SubLObject proof_view_get_include_justification_sectionP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw138$INCLUDE_JUSTIFICATION_SECTION_, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 19843L)
  public static SubLObject proof_view_set_include_justification_sectionP(final SubLObject v_proof_view, final SubLObject include_justification_sectionP)
  {
    assert NIL != Types.booleanp( include_justification_sectionP ) : include_justification_sectionP;
    return proof_view_set_property( v_proof_view, $kw138$INCLUDE_JUSTIFICATION_SECTION_, include_justification_sectionP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 20113L)
  public static SubLObject proof_view_get_enable_debugP(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return proof_view_get_property( v_proof_view, $kw139$ENABLE_DEBUG_, $proof_view_debugP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 20252L)
  public static SubLObject proof_view_set_enable_debugP(final SubLObject v_proof_view, final SubLObject enable_debugP)
  {
    assert NIL != Types.booleanp( enable_debugP ) : enable_debugP;
    return proof_view_set_property( v_proof_view, $kw139$ENABLE_DEBUG_, enable_debugP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 20437L)
  public static SubLObject proof_view_set_show_cb_bug_report_linksP(final SubLObject v_proof_view, final SubLObject show_linksP)
  {
    assert NIL != Types.booleanp( show_linksP ) : show_linksP;
    return proof_view_set_property( v_proof_view, $kw140$SHOW_CB_BUG_REPORT_LINKS_, show_linksP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 20640L)
  public static SubLObject proof_view_get_show_cb_bug_report_linksP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw140$SHOW_CB_BUG_REPORT_LINKS_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 20787L)
  public static SubLObject proof_view_get_include_cycl_in_outputP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw141$INCLUDE_CYCL_IN_OUTPUT_, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 20928L)
  public static SubLObject proof_view_set_include_cycl_in_outputP(final SubLObject v_proof_view, final SubLObject include_cycl_in_outputP)
  {
    assert NIL != Types.booleanp( include_cycl_in_outputP ) : include_cycl_in_outputP;
    return proof_view_set_property( v_proof_view, $kw141$INCLUDE_CYCL_IN_OUTPUT_, include_cycl_in_outputP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 21163L)
  public static SubLObject proof_view_get_include_sourcesP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw142$INCLUDE_SOURCES_, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 21290L)
  public static SubLObject proof_view_set_link_phrasesP(final SubLObject v_proof_view, final SubLObject link_phrasesP)
  {
    return proof_view_set_property( v_proof_view, $kw143$LINK_PHRASES_, link_phrasesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 21437L)
  public static SubLObject proof_view_get_link_phrasesP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw143$LINK_PHRASES_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 21560L)
  public static SubLObject proof_view_include_sources_spec_p(final SubLObject obj)
  {
    return makeBoolean( NIL != Types.booleanp( obj ) || obj.eql( $kw144$SUMMARY_ONLY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 21675L)
  public static SubLObject proof_view_set_include_sourcesP(final SubLObject v_proof_view, final SubLObject include_sourcesP)
  {
    assert NIL != proof_view_include_sources_spec_p( include_sourcesP ) : include_sourcesP;
    return proof_view_set_property( v_proof_view, $kw142$INCLUDE_SOURCES_, include_sourcesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 21900L)
  public static SubLObject proof_view_entry_get_include_sourcesP(final SubLObject entry)
  {
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( entry );
    final SubLObject spec = proof_view_get_include_sourcesP( v_proof_view );
    return makeBoolean( NIL != list_utilities.sublisp_boolean( spec ) && ( !spec.eql( $kw144$SUMMARY_ONLY ) || NIL != proof_view_entry_has_ancestorP( entry, proof_view_summary.proof_view_get_summary_root( v_proof_view ),
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 22241L)
  public static SubLObject proof_view_get_include_cycml_in_xmlP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw146$INCLUDE_CYCML_IN_XML_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 22380L)
  public static SubLObject proof_view_set_include_cycml_in_xmlP(final SubLObject v_proof_view, final SubLObject include_cycml_in_xmlP)
  {
    assert NIL != Types.booleanp( include_cycml_in_xmlP ) : include_cycml_in_xmlP;
    return proof_view_set_property( v_proof_view, $kw146$INCLUDE_CYCML_IN_XML_, include_cycml_in_xmlP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 22605L)
  public static SubLObject proof_view_get_include_silkP(final SubLObject v_proof_view)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 22756L)
  public static SubLObject proof_view_set_include_silkP(final SubLObject v_proof_view, final SubLObject include_silkP)
  {
    assert NIL != Types.booleanp( include_silkP ) : include_silkP;
    if( NIL != include_silkP )
    {
      Errors.error( $str147$SILK_not_supported_in_non_Cyc_HAL );
      return NIL;
    }
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 23111L)
  public static SubLObject proof_view_get_suppress_assertion_bookkeepingP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 23270L)
  public static SubLObject proof_view_set_suppress_assertion_bookkeepingP(final SubLObject v_proof_view, final SubLObject suppress_assertion_bookkeepingP)
  {
    assert NIL != Types.booleanp( suppress_assertion_bookkeepingP ) : suppress_assertion_bookkeepingP;
    return proof_view_set_property( v_proof_view, $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_, suppress_assertion_bookkeepingP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 23545L)
  public static SubLObject proof_view_get_suppress_assertion_cyclistsP(final SubLObject v_proof_view)
  {
    return makeBoolean( NIL != proof_view_get_suppress_assertion_bookkeepingP( v_proof_view ) || NIL != proof_view_get_property( v_proof_view, $kw149$SUPPRESS_ASSERTION_CYCLISTS_, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 23769L)
  public static SubLObject proof_view_set_suppress_assertion_cyclistsP(final SubLObject v_proof_view, final SubLObject suppress_assertion_cyclistsP)
  {
    assert NIL != Types.booleanp( suppress_assertion_cyclistsP ) : suppress_assertion_cyclistsP;
    return proof_view_set_property( v_proof_view, $kw149$SUPPRESS_ASSERTION_CYCLISTS_, suppress_assertion_cyclistsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 24029L)
  public static SubLObject proof_view_get_suppress_assertion_cyclist_employersP(final SubLObject v_proof_view)
  {
    return makeBoolean( NIL != proof_view_get_suppress_assertion_bookkeepingP( v_proof_view ) || NIL != proof_view_get_property( v_proof_view, $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 24271L)
  public static SubLObject proof_view_set_suppress_assertion_cyclist_employersP(final SubLObject v_proof_view, final SubLObject suppress_assertion_cyclist_employersP)
  {
    assert NIL != Types.booleanp( suppress_assertion_cyclist_employersP ) : suppress_assertion_cyclist_employersP;
    return proof_view_set_property( v_proof_view, $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_, suppress_assertion_cyclist_employersP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 24576L)
  public static SubLObject proof_view_get_suppress_assertion_datesP(final SubLObject v_proof_view)
  {
    return makeBoolean( NIL != proof_view_get_suppress_assertion_bookkeepingP( v_proof_view ) || NIL != proof_view_get_property( v_proof_view, $kw151$SUPPRESS_ASSERTION_DATES_, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 24794L)
  public static SubLObject proof_view_set_suppress_assertion_datesP(final SubLObject v_proof_view, final SubLObject suppress_assertion_datesP)
  {
    assert NIL != Types.booleanp( suppress_assertion_datesP ) : suppress_assertion_datesP;
    return proof_view_set_property( v_proof_view, $kw151$SUPPRESS_ASSERTION_DATES_, suppress_assertion_datesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 25039L)
  public static SubLObject proof_view_get_allow_external_linksP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw152$ALLOW_EXTERNAL_LINKS_, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 25176L)
  public static SubLObject proof_view_set_allow_external_linksP(final SubLObject v_proof_view, final SubLObject allow_external_linksP)
  {
    assert NIL != Types.booleanp( allow_external_linksP ) : allow_external_linksP;
    return proof_view_set_property( v_proof_view, $kw152$ALLOW_EXTERNAL_LINKS_, allow_external_linksP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 25401L)
  public static SubLObject proof_view_get_allow_internal_linksP(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw153$ALLOW_INTERNAL_LINKS_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 25540L)
  public static SubLObject proof_view_set_allow_internal_linksP(final SubLObject v_proof_view, final SubLObject allow_internal_linksP)
  {
    assert NIL != Types.booleanp( allow_internal_linksP ) : allow_internal_linksP;
    return proof_view_set_property( v_proof_view, $kw153$ALLOW_INTERNAL_LINKS_, allow_internal_linksP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 25765L)
  public static SubLObject proof_view_get_language_mt(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return proof_view_get_property( v_proof_view, $kw154$LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 25898L)
  public static SubLObject proof_view_set_language_mt(final SubLObject v_proof_view, final SubLObject language_mt)
  {
    assert NIL != hlmt.hlmtP( language_mt ) : language_mt;
    return proof_view_set_property( v_proof_view, $kw154$LANGUAGE_MT, language_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 26070L)
  public static SubLObject proof_view_get_domain_mt(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != proof_view_has_propertyP( v_proof_view, $kw156$DOMAIN_MT ) )
    {
      return proof_view_get_property( v_proof_view, $kw156$DOMAIN_MT, UNPROVIDED );
    }
    final SubLObject inference_answer = proof_view_get_answer( v_proof_view );
    final SubLObject inference = ( NIL != inference_datastructures_inference.inference_answer_p( inference_answer ) ) ? inference_datastructures_inference.inference_answer_inference( inference_answer ) : NIL;
    final SubLObject inference_mt = ( NIL != inference_datastructures_inference.inference_p( inference ) ) ? pph_proof.pph_get_inference_mt( inference ) : NIL;
    return ( NIL != inference_mt ) ? pph_methods.pph_enhanced_domain_mt( inference_mt, UNPROVIDED ) : pph_vars.$pph_domain_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 26617L)
  public static SubLObject proof_view_set_domain_mt(final SubLObject v_proof_view, final SubLObject domain_mt)
  {
    assert NIL != hlmt.hlmtP( domain_mt ) : domain_mt;
    return proof_view_set_property( v_proof_view, $kw156$DOMAIN_MT, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 26779L)
  public static SubLObject proof_view_get_creation_universal_time(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw157$CREATION_UNIVERSAL_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 26921L)
  public static SubLObject proof_view_set_creation_universal_time(final SubLObject v_proof_view, SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    assert NIL != numeric_date_utilities.universal_time_p( universal_time ) : universal_time;
    return proof_view_set_property( v_proof_view, $kw157$CREATION_UNIVERSAL_TIME, universal_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 27171L)
  public static SubLObject proof_view_get_populated_universal_time(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw159$POPULATED_UNIVERSAL_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 27315L)
  public static SubLObject proof_view_get_displayed_universal_time(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw160$DISPLAYED_UNIVERSAL_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 27459L)
  public static SubLObject proof_view_set_displayed_universal_time(final SubLObject v_proof_view, SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    assert NIL != numeric_date_utilities.universal_time_p( universal_time ) : universal_time;
    return proof_view_set_property( v_proof_view, $kw160$DISPLAYED_UNIVERSAL_TIME, universal_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 27713L)
  public static SubLObject proof_view_set_preparer_thread(final SubLObject v_proof_view, SubLObject thread)
  {
    if( thread == UNPROVIDED )
    {
      thread = Threads.current_process();
    }
    assert NIL != Types.processp( thread ) : thread;
    return proof_view_set_property( v_proof_view, $kw162$PREPARER_THREAD, thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 27914L)
  public static SubLObject proof_view_get_preparer_thread(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw162$PREPARER_THREAD, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 28040L)
  public static SubLObject proof_view_get_error_output(final SubLObject v_proof_view)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    return proof_view_get_property( v_proof_view, $kw163$ERROR_OUTPUT, $str0$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 28199L)
  public static SubLObject proof_view_has_propertyP(final SubLObject v_proof_view, final SubLObject property)
  {
    return list_utilities.plist_has_keyP( proof_view_int_properties( v_proof_view ), property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 28337L)
  public static SubLObject proof_view_set_property(final SubLObject v_proof_view, final SubLObject property, final SubLObject value)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    assert NIL != Types.keywordp( property ) : property;
    final SubLObject existing = proof_view_int_properties( v_proof_view );
    final SubLObject v_new = conses_high.putf( existing, property, value );
    _csetf_proof_view_int_properties( v_proof_view, v_new );
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 28650L)
  public static SubLObject proof_view_get_property(final SubLObject v_proof_view, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    assert NIL != Types.keywordp( property ) : property;
    return conses_high.getf( proof_view_int_properties( v_proof_view ), property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    proof_view_entry_int_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $proof_view_entry_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_id(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_parent_id(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_label(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_object_type(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_object(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_proof_view(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject proof_view_entry_int_properties(final SubLObject v_object)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_parent_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_label(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_object_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_object(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_proof_view(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject _csetf_proof_view_entry_int_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject make_proof_view_entry(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $proof_view_entry_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_proof_view_entry_int_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw188$PARENT_ID ) )
      {
        _csetf_proof_view_entry_int_parent_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw189$LABEL ) )
      {
        _csetf_proof_view_entry_int_label( v_new, current_value );
      }
      else if( pcase_var.eql( $kw190$OBJECT_TYPE ) )
      {
        _csetf_proof_view_entry_int_object_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw191$OBJECT ) )
      {
        _csetf_proof_view_entry_int_object( v_new, current_value );
      }
      else if( pcase_var.eql( $kw192$PROOF_VIEW ) )
      {
        _csetf_proof_view_entry_int_proof_view( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$PROPERTIES ) )
      {
        _csetf_proof_view_entry_int_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str37$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject visit_defstruct_proof_view_entry(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw38$BEGIN, $sym193$MAKE_PROOF_VIEW_ENTRY, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw34$ID, proof_view_entry_int_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw188$PARENT_ID, proof_view_entry_int_parent_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw189$LABEL, proof_view_entry_int_label( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw190$OBJECT_TYPE, proof_view_entry_int_object_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw191$OBJECT, proof_view_entry_int_object( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw192$PROOF_VIEW, proof_view_entry_int_proof_view( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw36$PROPERTIES, proof_view_entry_int_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw41$END, $sym193$MAKE_PROOF_VIEW_ENTRY, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29316L)
  public static SubLObject visit_defstruct_object_proof_view_entry_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_proof_view_entry( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29516L)
  public static SubLObject valid_proof_view_entry_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != proof_view_entry_p( v_object ) && proof_view_entry_int_id( v_object ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 29660L)
  public static SubLObject proof_view_entry_int_print(final SubLObject proof_view_entry, final SubLObject stream, final SubLObject depth)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    streams_high.write_string( $str195$__PROOF_VIEW_ENTRY_, stream, UNPROVIDED, UNPROVIDED );
    PrintLow.format( stream, $str196$_D__D, proof_view_int_id( proof_view_entry_int_proof_view( proof_view_entry ) ), proof_view_entry_int_id( proof_view_entry ) );
    streams_high.write_string( $str197$_label_, stream, UNPROVIDED, UNPROVIDED );
    print_high.prin1( proof_view_entry_int_label( proof_view_entry ), stream );
    streams_high.write_string( $str45$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 30201L)
  public static SubLObject destroy_proof_view_entry(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    if( NIL != valid_proof_view_entry_p( proof_view_entry ) )
    {
      final SubLObject id = proof_view_entry_get_id( proof_view_entry );
      final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
      final SubLObject v_id_index = proof_view_get_id_index( v_proof_view );
      try
      {
        destroy_proof_view_entry_int( proof_view_entry );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          id_index.id_index_remove( v_id_index, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 30663L)
  public static SubLObject destroy_proof_view_entry_int(final SubLObject proof_view_entry)
  {
    _csetf_proof_view_entry_int_id( proof_view_entry, $kw67$FREE );
    _csetf_proof_view_entry_int_proof_view( proof_view_entry, $kw67$FREE );
    _csetf_proof_view_entry_int_parent_id( proof_view_entry, $kw67$FREE );
    _csetf_proof_view_entry_int_label( proof_view_entry, $kw67$FREE );
    _csetf_proof_view_entry_int_object_type( proof_view_entry, $kw67$FREE );
    _csetf_proof_view_entry_int_object( proof_view_entry, $kw67$FREE );
    _csetf_proof_view_entry_int_properties( proof_view_entry, $kw67$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 31192L)
  public static SubLObject proof_view_get_root_entry(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject root = find_proof_view_entry_by_id( v_proof_view, $proof_view_root_entry_id$.getGlobalValue() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == proof_view_entry_p( root ) )
    {
      Errors.error( $str198$_S_has_no_root_entry___, v_proof_view );
    }
    return root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 31432L)
  public static SubLObject proof_view_count_entries_with_values(final SubLObject v_proof_view, final SubLObject label, final SubLObject parent_proof_view_entry, final SubLObject object_type, final SubLObject v_object,
      final SubLObject v_properties)
  {
    final SubLObject valid_parentP = valid_proof_view_entry_p( parent_proof_view_entry );
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = proof_view_get_id_index( v_proof_view );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw66$SKIP ) )
    {
      final SubLObject idx_$8 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$8, $kw66$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$8 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject entry_id;
        SubLObject existing;
        SubLObject existing_parent_id;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          entry_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          existing = Vectors.aref( vector_var, entry_id );
          if( NIL == id_index.id_index_tombstone_p( existing ) || NIL == id_index.id_index_skip_tombstones_p( $kw66$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( existing ) )
            {
              existing = $kw66$SKIP;
            }
            existing_parent_id = proof_view_entry_get_parent_id( existing );
            if( label.equal( proof_view_entry_get_label( existing ) ) && NIL != ( ( NIL != valid_parentP ) ? Equality.eq( proof_view_entry_get_id( parent_proof_view_entry ), existing_parent_id )
                : Types.sublisp_null( existing_parent_id ) ) && object_type.eql( proof_view_entry_get_object_type( existing ) ) && v_object.equal( proof_view_entry_get_object( existing ) ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$9 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$9 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$9 );
        SubLObject entry_id2 = NIL;
        SubLObject existing2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            entry_id2 = Hashtables.getEntryKey( cdohash_entry );
            existing2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject existing_parent_id2 = proof_view_entry_get_parent_id( existing2 );
            if( label.equal( proof_view_entry_get_label( existing2 ) ) && NIL != ( ( NIL != valid_parentP ) ? Equality.eq( proof_view_entry_get_id( parent_proof_view_entry ), existing_parent_id2 )
                : Types.sublisp_null( existing_parent_id2 ) ) && object_type.eql( proof_view_entry_get_object_type( existing2 ) ) && v_object.equal( proof_view_entry_get_object( existing2 ) ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 32239L)
  public static SubLObject proof_view_has_entry_for_objectP(final SubLObject v_proof_view, final SubLObject v_object, final SubLObject parent_proof_view_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject valid_parentP = valid_proof_view_entry_p( parent_proof_view_entry );
    SubLObject foundP = NIL;
    final SubLObject idx = proof_view_get_id_index( v_proof_view );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw66$SKIP ) )
    {
      final SubLObject idx_$10 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw66$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
        final SubLObject backwardP_var = NIL;
        final SubLObject length = Sequences.length( vector_var );
        SubLObject current;
        final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
        SubLObject start = NIL;
        SubLObject end = NIL;
        SubLObject delta = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
        start = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
        end = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
        delta = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL == foundP )
          {
            SubLObject end_var;
            SubLObject entry_id;
            SubLObject existing;
            SubLObject existing_parent_id;
            for( end_var = end, entry_id = NIL, entry_id = start; NIL == foundP && NIL == subl_macros.do_numbers_endtest( entry_id, delta, end_var ); entry_id = Numbers.add( entry_id, delta ) )
            {
              existing = Vectors.aref( vector_var, entry_id );
              if( NIL == id_index.id_index_tombstone_p( existing ) || NIL == id_index.id_index_skip_tombstones_p( $kw66$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( existing ) )
                {
                  existing = $kw66$SKIP;
                }
                existing_parent_id = proof_view_entry_get_parent_id( existing );
                if( NIL != ( ( NIL != valid_parentP ) ? Equality.eq( proof_view_entry_get_id( parent_proof_view_entry ), existing_parent_id ) : Types.sublisp_null( existing_parent_id ) ) && v_object.equal(
                    proof_view_entry_get_object( existing ) ) )
                {
                  foundP = T;
                }
              }
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
        }
      }
      final SubLObject idx_$11 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) && NIL == foundP )
      {
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw200$DO_HASH_TABLE );
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$11 );
          SubLObject entry_id2 = NIL;
          SubLObject existing2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              entry_id2 = Hashtables.getEntryKey( cdohash_entry );
              existing2 = Hashtables.getEntryValue( cdohash_entry );
              subl_macros.do_hash_table_done_check( foundP );
              final SubLObject existing_parent_id2 = proof_view_entry_get_parent_id( existing2 );
              if( NIL != ( ( NIL != valid_parentP ) ? Equality.eq( proof_view_entry_get_id( parent_proof_view_entry ), existing_parent_id2 ) : Types.sublisp_null( existing_parent_id2 ) ) && v_object.equal(
                  proof_view_entry_get_object( existing2 ) ) )
              {
                foundP = T;
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw200$DO_HASH_TABLE );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 32823L)
  public static SubLObject find_proof_view_entry_by_id(final SubLObject v_proof_view, final SubLObject proof_view_entry_id)
  {
    assert NIL != valid_proof_view_p( v_proof_view ) : v_proof_view;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    final SubLObject v_id_index = proof_view_get_id_index( v_proof_view );
    return id_index.id_index_lookup( v_id_index, proof_view_entry_id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 33231L)
  public static SubLObject find_proof_view_entry_by_ids(final SubLObject proof_view_id, final SubLObject proof_view_entry_id)
  {
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    final SubLObject v_proof_view = find_proof_view_by_id( proof_view_id );
    return ( NIL != valid_proof_view_p( v_proof_view ) ) ? find_proof_view_entry_by_id( v_proof_view, proof_view_entry_id ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 33575L)
  public static SubLObject proof_view_entry_get_id(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return proof_view_entry_int_id( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 33737L)
  public static SubLObject proof_view_entry_get_parent_id(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return proof_view_entry_int_parent_id( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 33913L)
  public static SubLObject proof_view_entry_get_path_string(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    SubLObject stack = ConsesLow.list( proof_view_entry_get_id( proof_view_entry ) );
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
    SubLObject parent_id = proof_view_entry_get_parent_id( proof_view_entry );
    SubLObject parent = ( NIL != parent_id ) ? find_proof_view_entry_by_id( v_proof_view, parent_id ) : NIL;
    SubLObject path_string = NIL;
    while ( NIL != parent_id)
    {
      stack = ConsesLow.cons( parent_id, stack );
      parent_id = proof_view_entry_get_parent_id( parent );
      parent = ( NIL != parent_id ) ? find_proof_view_entry_by_id( v_proof_view, parent_id ) : NIL;
    }
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      while ( NIL == list_utilities.empty_list_p( stack ))
      {
        print_high.princ( stack.first(), stream );
        stack = stack.rest();
        if( NIL == list_utilities.empty_list_p( stack ) )
        {
          print_high.princ( $str202$_, stream );
        }
      }
      path_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return path_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 34729L)
  public static SubLObject proof_view_entry_set_parent_id(final SubLObject proof_view_entry, final SubLObject parent_id)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    assert NIL != subl_promotions.non_negative_integer_p( parent_id ) : parent_id;
    _csetf_proof_view_entry_int_parent_id( proof_view_entry, parent_id );
    return parent_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 34996L)
  public static SubLObject proof_view_entry_set_label(final SubLObject proof_view_entry, final SubLObject label)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    assert NIL != Types.stringp( label ) : label;
    _csetf_proof_view_entry_int_label( proof_view_entry, label );
    return label;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 35224L)
  public static SubLObject proof_view_entry_get_proof_view(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return proof_view_entry_int_proof_view( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 35402L)
  public static SubLObject proof_view_entry_has_ancestorP(final SubLObject descendent_entry, final SubLObject ancestor_entry, SubLObject include_selfP)
  {
    if( include_selfP == UNPROVIDED )
    {
      include_selfP = NIL;
    }
    if( NIL != include_selfP && descendent_entry.eql( ancestor_entry ) )
    {
      return T;
    }
    final SubLObject parent_id = proof_view_entry_get_parent_id( descendent_entry );
    final SubLObject parent = ( NIL != parent_id ) ? find_proof_view_entry_by_id( proof_view_entry_get_proof_view( descendent_entry ), parent_id ) : NIL;
    return makeBoolean( NIL != parent && NIL != proof_view_entry_has_ancestorP( parent, ancestor_entry, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 35877L)
  public static SubLObject proof_view_entry_get_label(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return proof_view_entry_int_label( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 36045L)
  public static SubLObject proof_view_entry_get_object_type(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return proof_view_entry_int_object_type( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 36228L)
  public static SubLObject proof_view_entry_set_object_type(final SubLObject proof_view_entry, final SubLObject type)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    assert NIL != Types.symbolp( type ) : type;
    _csetf_proof_view_entry_int_object_type( proof_view_entry, type );
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 36464L)
  public static SubLObject proof_view_entry_get_object(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return proof_view_entry_int_object( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 36637L)
  public static SubLObject proof_view_entry_get_property(final SubLObject proof_view_entry, final SubLObject property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    assert NIL != Types.keywordp( property ) : property;
    return conses_high.getf( proof_view_entry_int_properties( proof_view_entry ), property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 36900L)
  public static SubLObject proof_view_entry_set_property(final SubLObject proof_view_entry, final SubLObject property, final SubLObject value)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    assert NIL != Types.keywordp( property ) : property;
    _csetf_proof_view_entry_int_properties( proof_view_entry, conses_high.putf( proof_view_entry_int_properties( proof_view_entry ), property, value ) );
    return proof_view_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 37229L)
  public static SubLObject proof_view_entry_rem_property(final SubLObject proof_view_entry, final SubLObject property)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    assert NIL != Types.keywordp( property ) : property;
    return conses_high.remf( proof_view_entry_int_properties( proof_view_entry ), property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 37466L)
  public static SubLObject proof_view_entryL(final SubLObject proof_view_entry1, final SubLObject proof_view_entry2)
  {
    assert NIL != proof_view_entry_p( proof_view_entry1 ) : proof_view_entry1;
    assert NIL != proof_view_entry_p( proof_view_entry2 ) : proof_view_entry2;
    final SubLObject proof_view_entry1_id = proof_view_entry_get_id( proof_view_entry1 );
    final SubLObject proof_view_entry2_id = proof_view_entry_get_id( proof_view_entry2 );
    if( proof_view_entry1_id.numL( proof_view_entry2_id ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 37912L)
  public static SubLObject proof_view_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
    format_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym207$PWHEN, $sym208$_PROOF_VIEW_DEBUG__, ConsesLow.listS( $sym209$WARN, format_string, args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 38044L)
  public static SubLObject proof_view_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
    format_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym207$PWHEN, $sym208$_PROOF_VIEW_DEBUG__, ConsesLow.listS( $sym210$FORCE_FORMAT, T, format_string, args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 38186L)
  public static SubLObject proof_view_entry_get_children(final SubLObject proof_view_entry)
  {
    return proof_view_entry_get_property( proof_view_entry, $kw211$CHILDREN, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 38322L)
  public static SubLObject proof_view_entry_more_generalP(final SubLObject general_entry, final SubLObject specific_entry)
  {
    return Numbers.numL( proof_view_entry_specificity( general_entry ), proof_view_entry_specificity( specific_entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 38510L)
  public static SubLObject proof_view_entry_specificity_internal(final SubLObject entry)
  {
    final SubLObject query_sentence = proof_view_entry_get_object( proof_view_get_query_root( proof_view_entry_get_proof_view( entry ) ) );
    final SubLObject entry_object = proof_view_entry_get_object( entry );
    SubLObject score = ZERO_INTEGER;
    if( NIL != assertion_handles.assertion_p( entry_object ) && NIL != assertions_high.rule_assertionP( entry_object ) )
    {
      return MINUS_ONE_INTEGER;
    }
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( query_sentence, $kw213$IGNORE );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.expression_find( v_term, entry_object, T, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        score = Numbers.add( score, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 38510L)
  public static SubLObject proof_view_entry_specificity(final SubLObject entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_entry_specificity_internal( entry );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym212$PROOF_VIEW_ENTRY_SPECIFICITY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym212$PROOF_VIEW_ENTRY_SPECIFICITY, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym212$PROOF_VIEW_ENTRY_SPECIFICITY, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, entry, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_entry_specificity_internal( entry ) ) );
      memoization_state.caching_state_put( caching_state, entry, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 39093L)
  public static SubLObject proof_view_count_entries(final SubLObject root)
  {
    SubLObject count = ONE_INTEGER;
    SubLObject cdolist_list_var = proof_view_entry_get_children( root );
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, proof_view_count_entries( child ) );
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 39357L)
  public static SubLObject proof_view_entry_top_level_p(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return Types.sublisp_null( proof_view_entry_get_parent_id( proof_view_entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 39539L)
  public static SubLObject proof_view_entry_get_depth_internal(final SubLObject entry)
  {
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( entry );
    final SubLObject parent_id = proof_view_entry_get_parent_id( entry );
    final SubLObject parent = ( NIL != parent_id ) ? find_proof_view_entry_by_id( v_proof_view, parent_id ) : NIL;
    return ( NIL != parent ) ? number_utilities.f_1X( proof_view_entry_get_depth( parent ) ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 39539L)
  public static SubLObject proof_view_entry_get_depth(final SubLObject entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_entry_get_depth_internal( entry );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym214$PROOF_VIEW_ENTRY_GET_DEPTH, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym214$PROOF_VIEW_ENTRY_GET_DEPTH, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym214$PROOF_VIEW_ENTRY_GET_DEPTH, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, entry, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_entry_get_depth_internal( entry ) ) );
      memoization_state.caching_state_put( caching_state, entry, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 39879L)
  public static SubLObject proof_view_entry_expand_intiallyP(final SubLObject proof_view_entry)
  {
    return proof_view_entry_get_property( proof_view_entry, $kw215$EXPAND_INITIALLY_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 40028L)
  public static SubLObject proof_view_entry_get_sources(final SubLObject proof_view_entry)
  {
    return proof_view_entry_get_property( proof_view_entry, $kw216$SOURCES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 40162L)
  public static SubLObject proof_view_entry_get_proof(SubLObject entry, SubLObject inherit_from_parentP)
  {
    if( inherit_from_parentP == UNPROVIDED )
    {
      inherit_from_parentP = NIL;
    }
    SubLObject proof = proof_view_entry_get_property( entry, $kw11$PROOF, NIL );
    for( final SubLObject v_proof_view = proof_view_entry_get_proof_view( entry ); NIL == proof && NIL != inherit_from_parentP && NIL != proof_view_entry_get_parent_id( entry ); entry = find_proof_view_entry_by_id(
        v_proof_view, proof_view_entry_get_parent_id( entry ) ), proof = proof_view_entry_get_property( entry, $kw11$PROOF, NIL ) )
    {
    }
    return proof;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 40685L)
  public static SubLObject proof_view_entry_set_proof(final SubLObject entry, final SubLObject proof)
  {
    return proof_view_entry_set_property( entry, $kw11$PROOF, proof );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 40850L)
  public static SubLObject proof_view_entry_get_function(final SubLObject entry)
  {
    return proof_view_entry_get_property( entry, $kw217$FN, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41027L)
  public static SubLObject proof_view_entry_get_function_section(final SubLObject entry)
  {
    return proof_view_entry_get_property( entry, $kw218$FN_SECTION, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41155L)
  public static SubLObject proof_view_set_highlight_phrase_demeritsP(final SubLObject v_proof_view, final SubLObject highlightP)
  {
    return proof_view_set_property( v_proof_view, $kw219$HIGHLIGHT_PHRASE_DEMERITS_, highlightP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41355L)
  public static SubLObject proof_view_get_highlight_phrase_demeritsP(final SubLObject v_proof_view)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return proof_view_get_property( v_proof_view, $kw219$HIGHLIGHT_PHRASE_DEMERITS_, control_vars.$highlight_demerits_in_generated_phrasesP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41733L)
  public static SubLObject register_proof_view_entry_shower(final SubLObject fn)
  {
    if( NIL == conses_high.member( fn, $proof_view_entry_showers$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $proof_view_entry_showers$.setGlobalValue( ConsesLow.cons( fn, $proof_view_entry_showers$.getGlobalValue() ) );
    }
    return fn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41845L)
  public static SubLObject proof_view_entry_showers()
  {
    return $proof_view_entry_showers$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 41928L)
  public static SubLObject proof_view_entry_generate_cycl(final SubLObject proof_view_entry)
  {
    final SubLObject v_object = proof_view_entry_get_object( proof_view_entry );
    SubLObject cycl = NIL;
    if( NIL != proof_view_entry_p( proof_view_entry ) )
    {
      final SubLObject pcase_var = proof_view_entry_get_object_type( proof_view_entry );
      if( pcase_var.eql( $sym220$SUPPORT_P ) || pcase_var.eql( $sym221$ASSERTION_P ) )
      {
        cycl = pph_proof.pph_support_sentence( v_object, UNPROVIDED );
      }
      else
      {
        cycl = v_object;
      }
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 42314L)
  public static SubLObject generate_html_from_proof_view_entry_ids(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject allow_external_linksP, SubLObject allow_internal_linksP,
      SubLObject language_mt)
  {
    if( allow_external_linksP == UNPROVIDED )
    {
      allow_external_linksP = T;
    }
    if( allow_internal_linksP == UNPROVIDED )
    {
      allow_internal_linksP = allow_external_linksP;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    final SubLObject proof_view_entry = find_proof_view_entry_by_ids( proof_view_id, proof_view_entry_id );
    SubLObject cycl = NIL;
    SubLObject html = NIL;
    if( NIL != proof_view_entry_p( proof_view_entry ) )
    {
      final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
      final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding( thread );
      try
      {
        pph_vars.$pph_addressee$.bind( proof_view_get_addressee( v_proof_view ), thread );
        proof_view_set_allow_external_linksP( v_proof_view, allow_external_linksP );
        proof_view_set_allow_internal_linksP( v_proof_view, allow_internal_linksP );
        proof_view_set_language_mt( v_proof_view, language_mt );
        cycl = proof_view_entry_generate_cycl( proof_view_entry );
        final SubLObject local_state;
        final SubLObject state = local_state = find_proof_view_memoization_state( v_proof_view );
        final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            html = proof_view_entry_generate_html( proof_view_entry );
          }
          finally
          {
            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$12, thread );
        }
      }
      finally
      {
        pph_vars.$pph_addressee$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      Errors.error( $str223$can_t_find_proof_view_entry_for_i, proof_view_id, proof_view_entry_id );
    }
    return ConsesLow.list( html, cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 43581L)
  public static SubLObject proof_view_entry_html(final SubLObject proof_view_id, final SubLObject proof_view_entry_id)
  {
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    final SubLObject proof_view_entry = find_proof_view_entry_by_ids( proof_view_id, proof_view_entry_id );
    if( NIL == proof_view_entry_p( proof_view_entry ) )
    {
      Errors.error( $str223$can_t_find_proof_view_entry_for_i, proof_view_id, proof_view_entry_id );
    }
    return proof_view_entry_html_internal( proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 44121L)
  public static SubLObject proof_view_entry_html_internal(final SubLObject proof_view_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycl = NIL;
    SubLObject html = NIL;
    if( NIL != proof_view_entry_p( proof_view_entry ) )
    {
      final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
      final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding( thread );
      try
      {
        pph_vars.$pph_addressee$.bind( proof_view_get_addressee( v_proof_view ), thread );
        cycl = proof_view_entry_generate_cycl( proof_view_entry );
        final SubLObject local_state;
        final SubLObject state = local_state = find_proof_view_memoization_state( v_proof_view );
        final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            html = proof_view_entry_generate_html( proof_view_entry );
          }
          finally
          {
            final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$14, thread );
        }
      }
      finally
      {
        pph_vars.$pph_addressee$.rebind( _prev_bind_0, thread );
      }
    }
    return ConsesLow.list( html, ( NIL != cycl_grammar.cycl_expression_p( cycl ) ) ? cycl : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 44724L)
  public static SubLObject fact_sheet_term_id_if_ok_for_proof_view_fact_sheets(final SubLObject v_term)
  {
    return ( NIL != fact_sheets.term_ok_for_fact_sheet_p( v_term, UNPROVIDED ) ) ? fact_sheets.fact_sheet_term_id( v_term, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 44966L)
  public static SubLObject proof_view_entry_generate_html(final SubLObject proof_view_entry)
  {
    final SubLObject paraphrase_fn = proof_view_get_property( proof_view_entry_get_proof_view( proof_view_entry ), $kw226$ENTRY_PARAPHRASE_FN, $sym227$PROOF_VIEW_ENTRY_GENERATE_HTML_STANDARD );
    return Functions.funcall( paraphrase_fn, proof_view_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 45260L)
  public static SubLObject proof_view_entry_generate_html_standard(final SubLObject proof_view_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = find_proof_view_memoization_state( proof_view_entry_get_proof_view( proof_view_entry ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
        final SubLObject allow_external_linksP = proof_view_get_allow_external_linksP( v_proof_view );
        final SubLObject allow_internal_linksP = proof_view_get_allow_internal_linksP( v_proof_view );
        final SubLObject language_mt = proof_view_get_language_mt( v_proof_view );
        final SubLObject include_sourcesP = proof_view_entry_get_include_sourcesP( proof_view_entry );
        final SubLObject link_phrasesP = proof_view_get_link_phrasesP( v_proof_view );
        final SubLObject highlight_demeritsP = proof_view_get_highlight_phrase_demeritsP( v_proof_view );
        return proof_view_entry_generate_html_internal( proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP );
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 46244L)
  public static SubLObject proof_view_entry_generate_html_internal_internal(final SubLObject proof_view_entry, final SubLObject allow_external_linksP, final SubLObject allow_internal_linksP, final SubLObject language_mt,
      final SubLObject include_sourcesP, final SubLObject link_phrasesP, final SubLObject highlight_demeritsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    final SubLObject object_type = proof_view_entry_get_object_type( proof_view_entry );
    final SubLObject v_object = proof_view_entry_get_object( proof_view_entry );
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
    SubLObject object_html = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$highlight_demerits_in_generated_phrasesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_vars.$html_generation_term_id_function$.currentBinding( thread );
    final SubLObject _prev_bind_4 = pph_vars.$pph_introduce_anaphorsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding( thread );
    final SubLObject _prev_bind_6 = pph_vars.$pph_inference_answer$.currentBinding( thread );
    final SubLObject _prev_bind_7 = pph_vars.$pph_hypothetical_vars$.currentBinding( thread );
    final SubLObject _prev_bind_8 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      pph_vars.$constant_link_function$.bind( ( NIL != allow_internal_linksP ) ? $kw230$FACT_SHEET : $kw231$NONE, thread );
      control_vars.$highlight_demerits_in_generated_phrasesP$.bind( highlight_demeritsP, thread );
      pph_vars.$html_generation_term_id_function$.bind( ( NIL != allow_internal_linksP ) ? $sym225$FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS : NIL, thread );
      pph_vars.$pph_introduce_anaphorsP$.bind( NIL, thread );
      pph_vars.$pph_language_mt$.bind( language_mt, thread );
      pph_vars.$pph_inference_answer$.bind( proof_view_get_answer( v_proof_view ), thread );
      pph_vars.$pph_hypothetical_vars$.bind( inference_datastructures_inference.inference_hypothetical_bindings( inference_datastructures_inference.inference_answer_inference( proof_view_get_answer( v_proof_view ) ) ),
          thread );
      pph_vars.$pph_handle_hypotheticalsP$.bind( T, thread );
      pph_vars.$pph_domain_mt$.bind( pph_methods.pph_enhanced_domain_mt( pph_proof.pph_get_inference_mt( inference_datastructures_inference.inference_answer_inference( proof_view_get_answer( v_proof_view ) ) ),
          UNPROVIDED ), thread );
      object_html = proof_view_html_for_object( proof_view_entry, v_object, object_type, allow_external_linksP, link_phrasesP );
      if( NIL != include_sourcesP )
      {
        final SubLObject v_sources = proof_view_entry_get_sources( proof_view_entry );
        SubLObject source_ids = NIL;
        SubLObject cdolist_list_var = v_sources;
        SubLObject source = NIL;
        source = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != proof_view_valid_source_p( source ) )
          {
            final SubLObject source_id = proof_view_get_source_id( v_proof_view, source );
            if( NIL != subl_promotions.positive_integer_p( source_id ) )
            {
              source_ids = ConsesLow.cons( ConsesLow.cons( source_id, source ), source_ids );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          source = cdolist_list_var.first();
        }
        object_html = Sequences.cconcatenate( object_html, pph_html.pph_footnote_string_for_source_ids( source_ids ) );
      }
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_9, thread );
      pph_vars.$pph_handle_hypotheticalsP$.rebind( _prev_bind_8, thread );
      pph_vars.$pph_hypothetical_vars$.rebind( _prev_bind_7, thread );
      pph_vars.$pph_inference_answer$.rebind( _prev_bind_6, thread );
      pph_vars.$pph_language_mt$.rebind( _prev_bind_5, thread );
      pph_vars.$pph_introduce_anaphorsP$.rebind( _prev_bind_4, thread );
      pph_vars.$html_generation_term_id_function$.rebind( _prev_bind_3, thread );
      control_vars.$highlight_demerits_in_generated_phrasesP$.rebind( _prev_bind_2, thread );
      pph_vars.$constant_link_function$.rebind( _prev_bind_0, thread );
    }
    return object_html;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 46244L)
  public static SubLObject proof_view_entry_generate_html_internal(final SubLObject proof_view_entry, final SubLObject allow_external_linksP, final SubLObject allow_internal_linksP, final SubLObject language_mt,
      final SubLObject include_sourcesP, final SubLObject link_phrasesP, final SubLObject highlight_demeritsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_entry_generate_html_internal_internal( proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym229$PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym229$PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL, SEVEN_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym229$PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( proof_view_entry.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( allow_external_linksP.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( allow_internal_linksP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( language_mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( include_sourcesP.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( link_phrasesP.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && highlight_demeritsP.equal( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_entry_generate_html_internal_internal( proof_view_entry, allow_external_linksP, allow_internal_linksP,
        language_mt, include_sourcesP, link_phrasesP, highlight_demeritsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( proof_view_entry, allow_external_linksP, allow_internal_linksP, language_mt, include_sourcesP,
        link_phrasesP, highlight_demeritsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 47870L)
  public static SubLObject proof_view_valid_source_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && NIL != cycl_grammar.cycl_term_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 47968L)
  public static SubLObject maybe_with_font_color(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list232 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject color = NIL;
    SubLObject v_default = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list232 );
    color = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list232 );
    v_default = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym233$PIF, ConsesLow.list( EQL, color, v_default ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym234$HTML_FANCY_FONT, ConsesLow.list( $kw235$COLOR, color ), ConsesLow
          .append( body, NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list232 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 48144L)
  public static SubLObject proof_view_html_for_object(final SubLObject proof_view_entry, final SubLObject v_object, final SubLObject object_type, final SubLObject allow_external_linksP, final SubLObject link_phrasesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject html_string = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_use_showXhideP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_use_showXhideP$.bind( NIL, thread );
      final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
      final SubLObject inference_answer = proof_view_get_answer( v_proof_view );
      final SubLObject _prev_bind_0_$17 = pph_vars.$pph_domain_mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding( thread );
      final SubLObject _prev_bind_3 = pph_vars.$pph_addressee$.currentBinding( thread );
      final SubLObject _prev_bind_4 = pph_vars.$pph_top_level_demerits$.currentBinding( thread );
      final SubLObject _prev_bind_5 = pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = pph_vars.$pph_proof_include_phrase_linksP$.currentBinding( thread );
      try
      {
        pph_vars.$pph_domain_mt$.bind( proof_view_get_domain_mt( v_proof_view ), thread );
        pph_vars.$pph_language_mt$.bind( proof_view_get_language_mt( v_proof_view ), thread );
        pph_vars.$pph_addressee$.bind( proof_view_get_addressee( v_proof_view ), thread );
        pph_vars.$pph_top_level_demerits$.bind( ZERO_INTEGER, thread );
        pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.bind( NIL, thread );
        pph_vars.$pph_proof_include_phrase_linksP$.bind( link_phrasesP, thread );
        final SubLObject main_font_color = proof_view_find_main_font_color( v_object, object_type, proof_view_entry );
        final SubLObject info = pph_types.pph_method_info( $sym236$GENERATE_SKOLEM_TERM_EXISTENTIALLY, NIL );
        pph_types.pph_deregister_method_info( $sym236$GENERATE_SKOLEM_TERM_EXISTENTIALLY, info );
        try
        {
          final SubLObject info_$18 = pph_types.pph_method_info( $sym237$GENERATE_SKOLEM_TERM_SMART, NIL );
          pph_types.pph_deregister_method_info( $sym237$GENERATE_SKOLEM_TERM_SMART, info_$18 );
          try
          {
            final SubLObject _prev_bind_0_$18 = pph_vars.$pph_inference_answer$.currentBinding( thread );
            final SubLObject _prev_bind_1_$20 = pph_vars.$pph_hypothetical_vars$.currentBinding( thread );
            final SubLObject _prev_bind_2_$21 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding( thread );
            final SubLObject _prev_bind_3_$22 = pph_vars.$pph_domain_mt$.currentBinding( thread );
            final SubLObject _prev_bind_4_$23 = pph_vars.$pph_use_bulleted_listsP$.currentBinding( thread );
            final SubLObject _prev_bind_5_$24 = pph_vars.$pph_repositioned_proofs$.currentBinding( thread );
            final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding( thread );
            final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding( thread );
            final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding( thread );
            final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding( thread );
            try
            {
              pph_vars.$pph_inference_answer$.bind( inference_answer, thread );
              pph_vars.$pph_hypothetical_vars$.bind( inference_datastructures_inference.inference_hypothetical_bindings( inference_datastructures_inference.inference_answer_inference( inference_answer ) ), thread );
              pph_vars.$pph_handle_hypotheticalsP$.bind( T, thread );
              pph_vars.$pph_domain_mt$.bind( pph_methods.pph_enhanced_domain_mt( pph_proof.pph_get_inference_mt( inference_datastructures_inference.inference_answer_inference( inference_answer ) ), UNPROVIDED ),
                  thread );
              pph_vars.$pph_use_bulleted_listsP$.bind( T, thread );
              pph_vars.$pph_repositioned_proofs$.bind( NIL, thread );
              pph_vars.$pph_displayed_proofs$.bind( pph_proof.find_or_create_pph_displayed_proof_stack(), thread );
              pph_vars.$pph_justified_proofs$.bind( pph_proof.find_or_create_pph_justified_proof_set(), thread );
              pph_vars.$pph_proof_depth$.bind( ZERO_INTEGER, thread );
              pph_vars.$pph_displayed_supports$.bind( NIL, thread );
              thread.resetMultipleValues();
              final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
              final SubLObject html_target = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$19 = pph_vars.$constant_link_function$.currentBinding( thread );
              final SubLObject _prev_bind_1_$21 = pph_vars.$html_generation_target$.currentBinding( thread );
              try
              {
                pph_vars.$constant_link_function$.bind( ( NIL != link_function ) ? link_function : pph_vars.$constant_link_function$.getDynamicValue( thread ), thread );
                pph_vars.$html_generation_target$.bind( ( NIL != html_target ) ? html_target : pph_vars.$html_generation_target$.getDynamicValue( thread ), thread );
                SubLObject stream = NIL;
                try
                {
                  stream = streams_high.make_private_string_output_stream();
                  final SubLObject _prev_bind_0_$20 = html_macros.$html_stream$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_stream$.bind( stream, thread );
                    if( main_font_color.eql( proof_view_default_color() ) )
                    {
                      final SubLObject linear_id = proof_view_entry_get_property( proof_view_entry, $kw238$LINEAR_ID, UNPROVIDED );
                      if( NIL != linear_id )
                      {
                        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str239$_A__, linear_id );
                      }
                      final SubLObject output_fn = proof_view_output_fn_for_object_type( object_type );
                      if( NIL != output_fn )
                      {
                        Functions.funcall( output_fn, v_proof_view, v_object, allow_external_linksP );
                      }
                      else
                      {
                        proof_view_html_for_object_cases( v_proof_view, object_type, v_object, allow_external_linksP );
                      }
                    }
                    else
                    {
                      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                      if( NIL != main_font_color )
                      {
                        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_utilities.html_color( main_font_color ) );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        final SubLObject linear_id2 = proof_view_entry_get_property( proof_view_entry, $kw238$LINEAR_ID, UNPROVIDED );
                        if( NIL != linear_id2 )
                        {
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str239$_A__, linear_id2 );
                        }
                        final SubLObject output_fn2 = proof_view_output_fn_for_object_type( object_type );
                        if( NIL != output_fn2 )
                        {
                          Functions.funcall( output_fn2, v_proof_view, v_object, allow_external_linksP );
                        }
                        else
                        {
                          proof_view_html_for_object_cases( v_proof_view, object_type, v_object, allow_external_linksP );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    }
                  }
                  finally
                  {
                    html_macros.$html_stream$.rebind( _prev_bind_0_$20, thread );
                  }
                  html_string = streams_high.get_output_stream_string( stream );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close( stream, UNPROVIDED );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
                  }
                }
              }
              finally
              {
                pph_vars.$html_generation_target$.rebind( _prev_bind_1_$21, thread );
                pph_vars.$constant_link_function$.rebind( _prev_bind_0_$19, thread );
              }
            }
            finally
            {
              pph_vars.$pph_displayed_supports$.rebind( _prev_bind_10, thread );
              pph_vars.$pph_proof_depth$.rebind( _prev_bind_9, thread );
              pph_vars.$pph_justified_proofs$.rebind( _prev_bind_8, thread );
              pph_vars.$pph_displayed_proofs$.rebind( _prev_bind_7, thread );
              pph_vars.$pph_repositioned_proofs$.rebind( _prev_bind_5_$24, thread );
              pph_vars.$pph_use_bulleted_listsP$.rebind( _prev_bind_4_$23, thread );
              pph_vars.$pph_domain_mt$.rebind( _prev_bind_3_$22, thread );
              pph_vars.$pph_handle_hypotheticalsP$.rebind( _prev_bind_2_$21, thread );
              pph_vars.$pph_hypothetical_vars$.rebind( _prev_bind_1_$20, thread );
              pph_vars.$pph_inference_answer$.rebind( _prev_bind_0_$18, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              pph_types.pph_register_method_info( $sym237$GENERATE_SKOLEM_TERM_SMART, info_$18 );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            pph_types.pph_register_method_info( $sym236$GENERATE_SKOLEM_TERM_EXISTENTIALLY, info );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
          }
        }
        if( pph_vars.$pph_top_level_demerits$.getDynamicValue( thread ).isPositive() )
        {
          proof_view_entry_set_paraphrase_demerits( proof_view_entry, pph_vars.$pph_top_level_demerits$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        pph_vars.$pph_proof_include_phrase_linksP$.rebind( _prev_bind_6, thread );
        pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.rebind( _prev_bind_5, thread );
        pph_vars.$pph_top_level_demerits$.rebind( _prev_bind_4, thread );
        pph_vars.$pph_addressee$.rebind( _prev_bind_3, thread );
        pph_vars.$pph_language_mt$.rebind( _prev_bind_2, thread );
        pph_vars.$pph_domain_mt$.rebind( _prev_bind_0_$17, thread );
      }
    }
    finally
    {
      pph_vars.$pph_use_showXhideP$.rebind( _prev_bind_0, thread );
    }
    return html_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 49975L)
  public static SubLObject proof_view_entry_get_paraphrase_demerits(final SubLObject entry, SubLObject descend_into_childrenP)
  {
    if( descend_into_childrenP == UNPROVIDED )
    {
      descend_into_childrenP = T;
    }
    SubLObject demerits = proof_view_entry_get_property( entry, $kw240$PPH_DEMERITS, ZERO_INTEGER );
    if( NIL != descend_into_childrenP )
    {
      SubLObject cdolist_list_var = proof_view_entry_get_children( entry );
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        demerits = Numbers.add( demerits, proof_view_entry_get_paraphrase_demerits( child, T ) );
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
    }
    return demerits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 50338L)
  public static SubLObject proof_view_entry_set_paraphrase_demerits(final SubLObject entry, final SubLObject demerits)
  {
    assert NIL != subl_promotions.non_negative_integer_p( demerits ) : demerits;
    return proof_view_entry_set_property( entry, $kw240$PPH_DEMERITS, demerits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 50529L)
  public static SubLObject proof_view_support_html_internal(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject html = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_show_meta_supports_with_supportsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = pph_vars.$pph_show_assert_info_with_assertionsP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = pph_vars.$validate_proof_supportsP$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        pph_vars.$pph_show_meta_supports_with_supportsP$.bind( NIL, thread );
        pph_vars.$pph_show_assert_info_with_assertionsP$.bind( NIL, thread );
        pph_vars.$validate_proof_supportsP$.bind( $proof_view_validate_supportsP$.getDynamicValue( thread ), thread );
        pph_proof.pph_show_support( support, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$validate_proof_supportsP$.rebind( _prev_bind_4, thread );
        pph_vars.$pph_show_assert_info_with_assertionsP$.rebind( _prev_bind_3, thread );
        pph_vars.$pph_show_meta_supports_with_supportsP$.rebind( _prev_bind_2, thread );
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      html = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return html;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 50529L)
  public static SubLObject proof_view_support_html(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_support_html_internal( support );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym241$PROOF_VIEW_SUPPORT_HTML, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym241$PROOF_VIEW_SUPPORT_HTML, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym241$PROOF_VIEW_SUPPORT_HTML, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_support_html_internal( support ) ) );
      memoization_state.caching_state_put( caching_state, support, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 50969L)
  public static SubLObject register_proof_view_output_fn_for_object_type(final SubLObject object_type, final SubLObject fn)
  {
    return dictionary.dictionary_enter( $proof_view_object_type_output_fns$.getGlobalValue(), object_type, fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 51201L)
  public static SubLObject proof_view_output_fn_for_object_type(final SubLObject object_type)
  {
    return dictionary.dictionary_lookup_without_values( $proof_view_object_type_output_fns$.getGlobalValue(), object_type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 51361L)
  public static SubLObject proof_view_html_for_object_cases(final SubLObject v_proof_view, final SubLObject object_type, final SubLObject v_object, final SubLObject allow_external_linksP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( object_type.eql( $sym221$ASSERTION_P ) || object_type.eql( $sym220$SUPPORT_P ) || object_type.eql( $kw242$PROOF_VIEW_ENTRY_CONFIRMED ) || object_type.eql( $kw243$PROOF_VIEW_ENTRY_DENIED ) )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str244$_A, proof_view_support_html( v_object ) );
    }
    else if( object_type.eql( $sym245$EL_SENTENCE_P ) )
    {
      pph_proof.pph_show_sentence( v_object, UNPROVIDED, UNPROVIDED );
    }
    else if( object_type.eql( $sym246$EL_TERM_P ) )
    {
      pph_proof.pph_show_term( v_object, UNPROVIDED, UNPROVIDED );
    }
    else if( object_type.eql( $kw247$SOURCE_CITATION ) )
    {
      proof_view_output_citation( v_object, $proof_view_citation_format$.getDynamicValue( thread ), allow_external_linksP );
    }
    else if( object_type.eql( $kw248$EXTERNAL_SENTENCE ) )
    {
      SubLObject sentence = NIL;
      SubLObject terms = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list249 );
      sentence = v_object.first();
      SubLObject current = v_object.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list249 );
      terms = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list249 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        proof_view_output_external_sentence( v_proof_view, sentence, terms, mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_object, $list249 );
      }
    }
    else if( object_type.eql( $kw250$ENTITY_MENTION ) )
    {
      SubLObject v_document = NIL;
      SubLObject entity_mention = NIL;
      SubLObject terms2 = NIL;
      SubLObject mt2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list251 );
      v_document = v_object.first();
      SubLObject current = v_object.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list251 );
      entity_mention = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list251 );
      terms2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list251 );
      mt2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        proof_view_output_entity_mention( v_proof_view, v_document, entity_mention, terms2, mt2 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_object, $list251 );
      }
    }
    else if( object_type.eql( $kw252$QUERY_SENTENCE ) )
    {
      pph_proof.pph_show_question( v_object );
    }
    else if( object_type.eql( $kw253$BINDINGS ) )
    {
      proof_view_show_bindings( v_proof_view, v_object );
    }
    else if( object_type.eql( $kw254$RULE_USED ) )
    {
      final SubLObject gloss = kb_mapping_utilities.fpred_value_in_any_mt( v_object, $const255$keyRuleEnglishSummary, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != gloss )
      {
        html_utilities.html_princ( gloss );
      }
      else
      {
        proof_view_html_for_object_cases( v_proof_view, $sym221$ASSERTION_P, v_object, allow_external_linksP );
      }
    }
    else if( object_type.eql( $kw256$UNSUPPORTED_SUPPORT ) )
    {
      html_utilities.html_princ( $str257$Fact_computed_by_Cyc_ );
    }
    else if( object_type.eql( $kw258$NO_JUSTIFICATION ) )
    {
      html_utilities.html_princ( $str259$No_justification_available_ );
    }
    else if( object_type.eql( $kw260$CIRCULAR_SUPPORT ) )
    {
      html_utilities.html_princ( $proof_view_circular_support_label$.getGlobalValue() );
    }
    else if( object_type.eql( $kw261$ABDUCED_SUPPORT ) )
    {
      html_utilities.html_princ( $str262$Cyc_thinks_this_might_be_true_but );
    }
    else if( object_type.eql( $kw263$ABDUCED_SUPPORT_CONFIRMED ) )
    {
      html_utilities.html_princ( $str264$Confirmed__but_not_provable_from_ );
    }
    else if( object_type.eql( $kw265$ABDUCED_SUPPORT_DENIED ) )
    {
      html_utilities.html_princ( $str266$Denied__and_not_provable_from_pre );
    }
    else if( object_type.eql( $kw267$GIVEN ) )
    {
      html_utilities.html_princ( $str268$Given_in_the_question_ );
    }
    else if( object_type.eql( $kw269$EXCEPTION ) )
    {
      html_utilities.html_princ( $str270$This_rule_has_exceptions__but_non );
    }
    else if( object_type.eql( $kw271$PRAGMATICS ) )
    {
      html_utilities.html_princ( $str272$This_rule_has_further_conditions_ );
    }
    else if( object_type.eql( $kw273$ASSERTION_BOOKKEEPING ) )
    {
      proof_view_output_assertion_bookkeeping_info( v_object, v_proof_view );
    }
    else if( object_type.eql( $kw274$ROOT ) || object_type.eql( $kw275$SECTION_ROOT ) || object_type.eql( $kw276$NO_SOURCE_DOCUMENT ) || object_type.eql( $kw277$EMPTY_JUSTIFICATION ) )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str0$ );
    }
    else if( object_type.eql( $kw278$PREMISE ) || object_type.eql( $kw279$RULE ) || object_type.eql( $kw280$CONCLUSION ) )
    {
      proof_view_html_for_object_cases( v_proof_view, proof_view_entry_get_object_type( v_object ), proof_view_entry_get_object( v_object ), allow_external_linksP );
    }
    else if( object_type.eql( $kw281$FROM ) )
    {
      SubLObject supporting_entries = v_object;
      html_utilities.html_princ( $str282$From_ );
      if( NIL != list_utilities.singletonP( supporting_entries ) )
      {
        html_utilities.html_princ( proof_view_entry_get_property( list_utilities.only_one( supporting_entries ), $kw238$LINEAR_ID, UNPROVIDED ) );
      }
      else if( NIL != list_utilities.doubletonP( supporting_entries ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str283$_A_and__A, proof_view_entry_get_property( supporting_entries.first(), $kw238$LINEAR_ID, UNPROVIDED ), proof_view_entry_get_property(
            conses_high.second( supporting_entries ), $kw238$LINEAR_ID, UNPROVIDED ) );
      }
      else
      {
        while ( NIL == list_utilities.empty_list_p( supporting_entries ))
        {
          final SubLObject supporting_entry = supporting_entries.first();
          supporting_entries = supporting_entries.rest();
          final SubLObject now_emptyP = list_utilities.empty_list_p( supporting_entries );
          if( NIL != now_emptyP )
          {
            html_utilities.html_princ( $str284$and_ );
          }
          html_utilities.html_princ( proof_view_entry_get_property( supporting_entry, $kw238$LINEAR_ID, UNPROVIDED ) );
          if( NIL == now_emptyP )
          {
            html_utilities.html_princ( $str285$__ );
          }
        }
      }
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str286$no_output_method_for__S, object_type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 54790L)
  public static SubLObject proof_view_html_for_object_cond(final SubLObject v_proof_view, final SubLObject object_type, final SubLObject v_object, final SubLObject allow_external_linksP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( object_type == $sym221$ASSERTION_P || object_type == $sym220$SUPPORT_P || object_type == $kw242$PROOF_VIEW_ENTRY_CONFIRMED || object_type == $kw243$PROOF_VIEW_ENTRY_DENIED )
    {
      final SubLObject _prev_bind_0 = pph_vars.$pph_show_meta_supports_with_supportsP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_show_assert_info_with_assertionsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = pph_vars.$validate_proof_supportsP$.currentBinding( thread );
      try
      {
        pph_vars.$pph_show_meta_supports_with_supportsP$.bind( NIL, thread );
        pph_vars.$pph_show_assert_info_with_assertionsP$.bind( NIL, thread );
        pph_vars.$validate_proof_supportsP$.bind( $proof_view_validate_supportsP$.getDynamicValue( thread ), thread );
        pph_proof.pph_show_support( v_object, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$validate_proof_supportsP$.rebind( _prev_bind_3, thread );
        pph_vars.$pph_show_assert_info_with_assertionsP$.rebind( _prev_bind_2, thread );
        pph_vars.$pph_show_meta_supports_with_supportsP$.rebind( _prev_bind_0, thread );
      }
    }
    else if( object_type == $sym245$EL_SENTENCE_P )
    {
      pph_proof.pph_show_sentence( v_object, UNPROVIDED, UNPROVIDED );
    }
    else if( object_type == $sym246$EL_TERM_P )
    {
      pph_proof.pph_show_term( v_object, UNPROVIDED, UNPROVIDED );
    }
    else if( object_type == $kw247$SOURCE_CITATION )
    {
      proof_view_output_citation( v_object, $proof_view_citation_format$.getDynamicValue( thread ), allow_external_linksP );
    }
    else if( object_type == $kw248$EXTERNAL_SENTENCE )
    {
      SubLObject sentence = NIL;
      SubLObject terms = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list249 );
      sentence = v_object.first();
      SubLObject current = v_object.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list249 );
      terms = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list249 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        proof_view_output_external_sentence( v_proof_view, sentence, terms, mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_object, $list249 );
      }
    }
    else if( object_type == $kw250$ENTITY_MENTION )
    {
      SubLObject v_document = NIL;
      SubLObject entity_mention = NIL;
      SubLObject terms2 = NIL;
      SubLObject mt2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list251 );
      v_document = v_object.first();
      SubLObject current = v_object.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list251 );
      entity_mention = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list251 );
      terms2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list251 );
      mt2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        proof_view_output_entity_mention( v_proof_view, v_document, entity_mention, terms2, mt2 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_object, $list251 );
      }
    }
    else if( object_type == $kw252$QUERY_SENTENCE )
    {
      pph_proof.pph_show_question( v_object );
    }
    else if( object_type == $kw253$BINDINGS )
    {
      proof_view_show_bindings( v_proof_view, v_object );
    }
    else if( object_type == $kw256$UNSUPPORTED_SUPPORT )
    {
      html_utilities.html_princ( $str257$Fact_computed_by_Cyc_ );
    }
    else if( object_type == $kw260$CIRCULAR_SUPPORT )
    {
      html_utilities.html_princ( $proof_view_circular_support_label$.getGlobalValue() );
    }
    else if( object_type == $kw261$ABDUCED_SUPPORT )
    {
      html_utilities.html_princ( $str262$Cyc_thinks_this_might_be_true_but );
    }
    else if( object_type == $kw263$ABDUCED_SUPPORT_CONFIRMED )
    {
      html_utilities.html_princ( $str264$Confirmed__but_not_provable_from_ );
    }
    else if( object_type == $kw265$ABDUCED_SUPPORT_DENIED )
    {
      html_utilities.html_princ( $str266$Denied__and_not_provable_from_pre );
    }
    else if( object_type == $kw267$GIVEN )
    {
      html_utilities.html_princ( $str268$Given_in_the_question_ );
    }
    else if( object_type == $kw269$EXCEPTION )
    {
      html_utilities.html_princ( $str270$This_rule_has_exceptions__but_non );
    }
    else if( object_type == $kw271$PRAGMATICS )
    {
      html_utilities.html_princ( $str272$This_rule_has_further_conditions_ );
    }
    else if( object_type == $kw273$ASSERTION_BOOKKEEPING )
    {
      proof_view_output_assertion_bookkeeping_info( v_object, v_proof_view );
    }
    else if( NIL == object_type )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str0$ );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str286$no_output_method_for__S, object_type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 57254L)
  public static SubLObject proof_view_find_main_font_color(final SubLObject v_object, final SubLObject object_type, final SubLObject proof_view_entry)
  {
    if( object_type == $kw263$ABDUCED_SUPPORT_CONFIRMED )
    {
      return $proof_view_abduction_support_confirmed_color$.getGlobalValue();
    }
    if( object_type == $kw265$ABDUCED_SUPPORT_DENIED )
    {
      return $proof_view_abduction_support_denied_color$.getGlobalValue();
    }
    if( NIL != proof_view_entry_has_abduction_confirmed_p( proof_view_entry ) )
    {
      return $proof_view_abduction_support_confirmed_color$.getGlobalValue();
    }
    if( NIL != proof_view_entry_has_abduction_denied_p( proof_view_entry ) )
    {
      return $proof_view_abduction_support_denied_color$.getGlobalValue();
    }
    if( NIL != proof_view_entry_has_abduced_support_p( proof_view_entry ) )
    {
      return $proof_view_abduction_support_color$.getGlobalValue();
    }
    if( NIL != proof_view_entry_has_abduced_support_confirmed_p( proof_view_entry ) )
    {
      return $proof_view_abduction_support_confirmed_color$.getGlobalValue();
    }
    if( NIL != proof_view_entry_has_abduced_support_denied_p( proof_view_entry ) )
    {
      return $proof_view_abduction_support_denied_color$.getGlobalValue();
    }
    if( NIL != abduction.abduction_support_p( v_object ) )
    {
      return $proof_view_abduction_support_color$.getGlobalValue();
    }
    return proof_view_default_color();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 58490L)
  public static SubLObject proof_view_entry_has_abduced_support_p(final SubLObject proof_view_entry)
  {
    return list_utilities.sublisp_boolean( proof_view_entry_get_property( proof_view_entry, $kw287$HAS_ABDUCED_SUPPORT_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 58661L)
  public static SubLObject proof_view_entry_has_abduced_support_confirmed_p(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return list_utilities.sublisp_boolean( proof_view_entry_get_property( proof_view_entry, $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 58964L)
  public static SubLObject proof_view_entry_has_abduced_support_denied_p(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return list_utilities.sublisp_boolean( proof_view_entry_get_property( proof_view_entry, $kw289$HAS_ABDUCED_SUPPORT_DENIED_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 59410L)
  public static SubLObject proof_view_entry_has_abduction_confirmed_p(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return Equality.eq( proof_view_entry_get_object_type( proof_view_entry ), $kw242$PROOF_VIEW_ENTRY_CONFIRMED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 59696L)
  public static SubLObject proof_view_entry_has_abduction_denied_p(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    return Equality.eq( proof_view_entry_get_object_type( proof_view_entry ), $kw243$PROOF_VIEW_ENTRY_DENIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 59973L)
  public static SubLObject proof_view_output_citation(final SubLObject citation, SubLObject type, SubLObject allow_external_linksP)
  {
    if( type == UNPROVIDED )
    {
      type = $proof_view_citation_format$.getDynamicValue();
    }
    if( allow_external_linksP == UNPROVIDED )
    {
      allow_external_linksP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != pph_html.pph_source_citation_p( citation ) : citation;
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( NIL, thread );
      html_utilities.html_princ( pph_html.pph_html_citation_string( citation, type, allow_external_linksP ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    return citation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 60279L)
  public static SubLObject proof_view_show_bindings(final SubLObject v_proof_view, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = pph_utilities.pph_sort_bindings( conses_high.copy_list( v_bindings ) );
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = binding;
        SubLObject var = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
        var = current.first();
        current = ( value = current.rest() );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            final SubLObject _prev_bind_0_$34 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
            try
            {
              pph_vars.$pph_quantify_varsP$.bind( NIL, thread );
              pph_proof.pph_show_term( var, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_0_$34, thread );
            }
            html_utilities.html_princ( $str292$__ );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject color = proof_view_display_color_for_term( v_proof_view, value );
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != color )
            {
              html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( color ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              pph_proof.pph_show_term( value, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 60803L)
  public static SubLObject proof_view_output_assertion_bookkeeping_info(final SubLObject assertion, final SubLObject v_proof_view)
  {
    final SubLObject cyclist = ( NIL != proof_view_get_suppress_assertion_cyclistsP( v_proof_view ) ) ? NIL : assertions_high.asserted_by( assertion );
    final SubLObject date = ( NIL != proof_view_get_suppress_assertion_datesP( v_proof_view ) ) ? NIL : assertions_high.asserted_when( assertion );
    final SubLObject show_secondP = NIL;
    final SubLObject second = ( NIL != show_secondP ) ? assertions_high.asserted_second( assertion ) : NIL;
    final SubLObject show_purposeP = NIL;
    final SubLObject purpose = ( NIL != show_purposeP ) ? assertions_high.asserted_why( assertion ) : NIL;
    final SubLObject show_employerP = makeBoolean( NIL == proof_view_get_suppress_assertion_cyclist_employersP( v_proof_view ) );
    final SubLObject employer = ( NIL != cyclist && NIL != show_employerP ) ? get_employer( cyclist, date ) : NIL;
    if( NIL != proof_view_assertion_givenP( v_proof_view, assertion ) )
    {
      html_utilities.html_princ( $str293$Given_in_the_query );
    }
    else if( NIL != cyclist || NIL != date || NIL != purpose )
    {
      html_utilities.html_princ( $str294$Entered );
      if( NIL != cyclist )
      {
        if( NIL != proof_view_get_suppress_assertion_cyclistsP( v_proof_view ) )
        {
          if( NIL != employer )
          {
            html_utilities.html_princ( $str295$_by_an_employee_ );
          }
        }
        else
        {
          html_utilities.html_princ( $str296$_by_ );
          pph_proof.pph_show_term( cyclist, UNPROVIDED, UNPROVIDED );
        }
      }
      if( NIL != employer )
      {
        html_utilities.html_princ( $str297$_of_ );
        pph_proof.pph_show_term( employer, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != date )
      {
        html_utilities.html_princ( $str298$_on_ );
        cb_utilities.cb_show_date( date );
        if( NIL != second )
        {
          html_utilities.html_princ( $str299$_at_ );
          cb_utilities.cb_show_second( second );
        }
      }
      if( NIL != purpose )
      {
        html_utilities.html_princ( $str300$_for_ );
        pph_proof.pph_show_term( purpose, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      html_utilities.html_princ( $str301$Fact_asserted_in_Cyc_Knowledge_Ba );
    }
    html_utilities.html_princ( $str302$_ );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 62232L)
  public static SubLObject proof_view_assertion_givenP(final SubLObject v_proof_view, final SubLObject assertion)
  {
    if( NIL != isa.isaP( hlmt.hlmt_monad_mt( hlmt.assertion_hlmt( assertion ) ), $const303$HypotheticalContext, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_sentence = proof_view_entry_get_object( proof_view_get_query_root( v_proof_view ) );
      final SubLObject assertion_sentence = uncanonicalizer.assertion_el_formula( assertion );
      final SubLObject hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings( inference_datastructures_inference.inference_answer_inference( proof_view_get_answer( v_proof_view ) ) );
      if( NIL != el_utilities.gafP( assertion_sentence ) && NIL != el_utilities.el_implication_p( query_sentence ) )
      {
        final SubLObject antecedent = cycl_utilities.formula_arg1( query_sentence, UNPROVIDED );
        SubLObject cdolist_list_var = ( NIL != el_utilities.el_conjunction_p( antecedent ) ) ? cycl_utilities.formula_args( antecedent, UNPROVIDED ) : ConsesLow.list( antecedent );
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( bindings.apply_bindings( hypothetical_bindings, conjunct ).equal( assertion_sentence ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          conjunct = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 63079L)
  public static SubLObject get_employer(final SubLObject cyclist, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == numeric_date_utilities.universal_date_p( date ) )
    {
      date = fi.the_date();
    }
    SubLObject employer = NIL;
    final SubLObject cycl_date = date_utilities.universal_time_to_cycl_date( numeric_date_utilities.universal_time_for_start_of_universal_date( date, UNPROVIDED ) );
    if( NIL != $use_get_employer_cacheP$.getDynamicValue( thread ) )
    {
      if( NIL == employer )
      {
        SubLObject csome_list_var = employee_employers_and_mts( cyclist );
        SubLObject pair = NIL;
        pair = csome_list_var.first();
        while ( NIL == employer && NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = pair;
          SubLObject this_employer = NIL;
          SubLObject this_mt = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
          this_employer = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
          this_mt = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != hlmt.monad_mtP( this_mt ) )
            {
              employer = this_employer;
            }
            else if( NIL != hlmt.hlmtP( this_mt ) )
            {
              thread.resetMultipleValues();
              final SubLObject interval = hlmt.explode_hlmt_temporal_facets_with_defaults( this_mt );
              final SubLObject parameter = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != hlmt_relevance.mt_times_visible_p( cycl_date, interval, $const305$Null_TimeParameter, parameter ) )
              {
                employer = this_employer;
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list304 );
          }
          csome_list_var = csome_list_var.rest();
          pair = csome_list_var.first();
        }
      }
    }
    else
    {
      employer = ask_utilities.query_variable( $sym306$_EMPLOYER, ConsesLow.list( $const104$and, ConsesLow.list( $const307$ist, $sym308$_MT, ConsesLow.list( $const309$employees, $sym306$_EMPLOYER, cyclist ) ), $list310,
          ConsesLow.list( $const311$temporallySubsumes, $sym312$_TIME, cycl_date ) ), $const313$InferencePSC, $list314 ).first();
    }
    return employer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 64260L)
  public static SubLObject clear_employee_employers_and_mts()
  {
    final SubLObject cs = $employee_employers_and_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 64260L)
  public static SubLObject remove_employee_employers_and_mts(final SubLObject cyclist)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $employee_employers_and_mts_caching_state$.getGlobalValue(), ConsesLow.list( cyclist ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 64260L)
  public static SubLObject employee_employers_and_mts_internal(final SubLObject cyclist)
  {
    return ask_utilities.query_template( $list316, ConsesLow.list( $const307$ist, $sym308$_MT, ConsesLow.list( $const309$employees, $sym306$_EMPLOYER, cyclist ) ), $const313$InferencePSC, $list317 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 64260L)
  public static SubLObject employee_employers_and_mts(final SubLObject cyclist)
  {
    SubLObject caching_state = $employee_employers_and_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym315$EMPLOYEE_EMPLOYERS_AND_MTS, $sym318$_EMPLOYEE_EMPLOYERS_AND_MTS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( employee_employers_and_mts_internal( cyclist ) ) );
      memoization_state.caching_state_put( caching_state, cyclist, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 64509L)
  public static SubLObject proof_view_output_external_sentence(final SubLObject v_proof_view, final SubLObject sentence, final SubLObject terms, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tuples = pph_utilities.pph_ask_template_new( $list319, ConsesLow.list( $const104$and, ConsesLow.listS( $const320$lengthOfList, sentence, $list321 ), $list322, ConsesLow.listS( $const323$startOffset,
        $sym324$_DOCUMENT, sentence, $list325 ) ), mt, UNPROVIDED );
    SubLObject doneP = NIL;
    final SubLObject padding = $proof_view_external_sentence_padding$.getDynamicValue( thread );
    if( NIL == doneP )
    {
      SubLObject csome_list_var = tuples;
      SubLObject tuple = NIL;
      tuple = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = tuple;
        SubLObject offset = NIL;
        SubLObject length = NIL;
        SubLObject text = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
        offset = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
        length = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
        text = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject stripped_text = pph_utilities.pph_remove_html_tags( text, UNPROVIDED );
          final SubLObject initial_padding_size = offset.numL( padding ) ? offset : padding;
          final SubLObject stripped_text_length = Sequences.length( stripped_text );
          final SubLObject start_char = Numbers.max( ZERO_INTEGER, Numbers.subtract( offset, padding ) );
          final SubLObject main_end_char = Numbers.subtract( Numbers.add( offset, length ), start_char );
          final SubLObject end_char = Numbers.min( stripped_text_length, Numbers.add( offset, length, padding ) );
          final SubLObject sentence_text = string_utilities.substring( stripped_text, start_char, end_char );
          SubLObject curr_char = ZERO_INTEGER;
          final SubLObject padding_color = html_macros.$html_color_dark_grey$.getGlobalValue();
          final SubLObject term_starts_and_ends = proof_view_find_terms_in_string( v_proof_view, terms, sentence_text, mt, padding );
          html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != padding_color )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( padding_color ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( offset.isPositive() )
            {
              html_utilities.html_princ( $str327$___ );
            }
            html_utilities.html_princ( string_utilities.substring( sentence_text, ZERO_INTEGER, initial_padding_size ) );
            curr_char = padding;
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          SubLObject cdolist_list_var = term_starts_and_ends;
          SubLObject pair = NIL;
          pair = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current_$38;
            final SubLObject datum_$37 = current_$38 = pair;
            SubLObject term_string = NIL;
            SubLObject term_start_pos = NIL;
            SubLObject term_end_pos = NIL;
            SubLObject color = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$38, datum_$37, $list328 );
            term_string = current_$38.first();
            current_$38 = current_$38.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$38, datum_$37, $list328 );
            term_start_pos = current_$38.first();
            current_$38 = current_$38.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$38, datum_$37, $list328 );
            term_end_pos = current_$38.first();
            current_$38 = current_$38.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$38, datum_$37, $list328 );
            color = current_$38.first();
            current_$38 = current_$38.rest();
            if( NIL == current_$38 )
            {
              html_utilities.html_princ( string_utilities.substring( sentence_text, curr_char, term_start_pos ) );
              if( term_start_pos.isPositive() && NIL != Characters.alpha_char_p( Strings.sublisp_char( sentence_text, number_utilities.f_1_( term_start_pos ) ) ) )
              {
                html_utilities.html_princ( term_string );
              }
              else
              {
                html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != color )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( color ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ_strong( term_string );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
              }
              curr_char = term_end_pos;
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$37, $list328 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
          }
          html_utilities.html_princ( string_utilities.substring( sentence_text, curr_char, main_end_char ) );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != padding_color )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( padding_color ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( string_utilities.substring( sentence_text, main_end_char, UNPROVIDED ) );
            if( end_char.numL( stripped_text_length ) )
            {
              html_utilities.html_princ( $str327$___ );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list326 );
        }
        doneP = T;
        csome_list_var = csome_list_var.rest();
        tuple = csome_list_var.first();
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 66687L)
  public static SubLObject proof_view_output_entity_mention(final SubLObject v_proof_view, final SubLObject v_document, final SubLObject entity_mention, final SubLObject terms, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tuples = proof_view_get_document_locations_for_entity_mention( entity_mention, mt );
    final SubLObject text = pph_utilities.pph_ask_variable_new( $sym329$_TEXT, ConsesLow.listS( $const330$textOfWork, v_document, $list331 ), mt, UNPROVIDED ).first();
    SubLObject doneP = makeBoolean( !text.isString() );
    final SubLObject padding = $proof_view_entity_mention_padding$.getDynamicValue( thread );
    if( NIL == doneP )
    {
      SubLObject csome_list_var = tuples;
      SubLObject tuple = NIL;
      tuple = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = tuple;
        SubLObject offset = NIL;
        SubLObject length = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list332 );
        offset = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list332 );
        length = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject stripped_text = pph_utilities.pph_remove_html_tags( text, UNPROVIDED );
          final SubLObject initial_padding_size = offset.numL( padding ) ? offset : padding;
          final SubLObject stripped_text_length = Sequences.length( stripped_text );
          final SubLObject start_char = Numbers.max( ZERO_INTEGER, Numbers.subtract( offset, padding ) );
          final SubLObject main_end_char = Numbers.subtract( Numbers.add( offset, length ), start_char );
          final SubLObject end_char = Numbers.min( stripped_text_length, Numbers.add( offset, length, padding ) );
          final SubLObject entity_mention_text = string_utilities.substring( stripped_text, start_char, end_char );
          SubLObject curr_char = ZERO_INTEGER;
          final SubLObject padding_color = html_macros.$html_color_dark_grey$.getGlobalValue();
          final SubLObject term_starts_and_ends = proof_view_find_terms_in_string( v_proof_view, terms, entity_mention_text, mt, padding );
          html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != padding_color )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( padding_color ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( offset.isPositive() )
            {
              html_utilities.html_princ( $str327$___ );
            }
            html_utilities.html_princ( string_utilities.substring( entity_mention_text, ZERO_INTEGER, initial_padding_size ) );
            curr_char = padding;
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          SubLObject cdolist_list_var = term_starts_and_ends;
          SubLObject pair = NIL;
          pair = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current_$40;
            final SubLObject datum_$39 = current_$40 = pair;
            SubLObject term_string = NIL;
            SubLObject term_start_pos = NIL;
            SubLObject term_end_pos = NIL;
            SubLObject color = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$40, datum_$39, $list328 );
            term_string = current_$40.first();
            current_$40 = current_$40.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$40, datum_$39, $list328 );
            term_start_pos = current_$40.first();
            current_$40 = current_$40.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$40, datum_$39, $list328 );
            term_end_pos = current_$40.first();
            current_$40 = current_$40.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$40, datum_$39, $list328 );
            color = current_$40.first();
            current_$40 = current_$40.rest();
            if( NIL == current_$40 )
            {
              html_utilities.html_princ( string_utilities.substring( entity_mention_text, curr_char, term_start_pos ) );
              if( term_start_pos.isPositive() && NIL != Characters.alpha_char_p( Strings.sublisp_char( entity_mention_text, number_utilities.f_1_( term_start_pos ) ) ) )
              {
                html_utilities.html_princ( term_string );
              }
              else
              {
                html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != color )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( color ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ_strong( term_string );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
              }
              curr_char = term_end_pos;
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$39, $list328 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
          }
          html_utilities.html_princ( string_utilities.substring( entity_mention_text, curr_char, main_end_char ) );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != padding_color )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( padding_color ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( string_utilities.substring( entity_mention_text, main_end_char, UNPROVIDED ) );
            if( end_char.numL( stripped_text_length ) )
            {
              html_utilities.html_princ( $str327$___ );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list332 );
        }
        doneP = T;
        csome_list_var = csome_list_var.rest();
        tuple = csome_list_var.first();
      }
    }
    return entity_mention;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 68912L)
  public static SubLObject proof_view_get_document_locations_for_entity_mention(final SubLObject entity_mention, final SubLObject mt)
  {
    return pph_utilities.pph_ask_template_new( $list333, ConsesLow.list( $const104$and, ConsesLow.listS( $const334$startOffsetForMention, entity_mention, $list325 ), ConsesLow.listS( $const335$stringLengthForMention,
        entity_mention, $list321 ) ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 69176L)
  public static SubLObject proof_view_display_color_for_term(final SubLObject v_proof_view, final SubLObject v_term)
  {
    if( NIL == sksi_external_term_browser.sksi_supported_external_termP( v_term ) )
    {
      return $str336$black;
    }
    SubLObject external_terms = proof_view_get_property( v_proof_view, $kw337$EXTERNAL_TERMS, UNPROVIDED );
    if( NIL == dictionary.dictionary_p( external_terms ) )
    {
      external_terms = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), TEN_INTEGER );
      proof_view_set_property( v_proof_view, $kw337$EXTERNAL_TERMS, external_terms );
    }
    SubLObject color = dictionary.dictionary_lookup( external_terms, v_term, $kw338$NOT_FOUND );
    if( !color.isString() )
    {
      color = proof_view_nth_display_color( dictionary.dictionary_length( external_terms ) );
      dictionary.dictionary_enter( external_terms, v_term, color );
    }
    return color;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 69850L)
  public static SubLObject proof_view_nth_display_color(final SubLObject n)
  {
    return ConsesLow.nth( Numbers.mod( n, Sequences.length( $proof_view_font_colors$.getGlobalValue() ) ), $proof_view_font_colors$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 69987L)
  public static SubLObject proof_view_find_terms_in_string(final SubLObject v_proof_view, final SubLObject terms, final SubLObject sentence_text, final SubLObject mt, SubLObject padding)
  {
    if( padding == UNPROVIDED )
    {
      padding = ZERO_INTEGER;
    }
    SubLObject tuples = NIL;
    SubLObject list_var = NIL;
    SubLObject v_term = NIL;
    SubLObject i = NIL;
    list_var = terms;
    v_term = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject color = proof_view_display_color_for_term( v_proof_view, v_term );
      tuples = ConsesLow.append( tuples, proof_view_find_term_in_string( v_term, color, sentence_text, mt, padding ) );
    }
    tuples = proof_view_delete_subsumed_references( tuples );
    return Sort.sort( tuples, Symbols.symbol_function( $sym339$_ ), Symbols.symbol_function( $sym340$SECOND ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 70459L)
  public static SubLObject proof_view_find_term_in_string(final SubLObject v_term, final SubLObject color, final SubLObject sentence_text, final SubLObject mt, SubLObject padding)
  {
    if( padding == UNPROVIDED )
    {
      padding = ZERO_INTEGER;
    }
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var;
    final SubLObject term_strings = cdolist_list_var = pph_utilities.pph_ask_variable_new( $sym341$_STRING, ConsesLow.listS( $const342$termStrings, v_term, $list343 ), mt, $list344 );
    SubLObject term_string = NIL;
    term_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      tuples = ConsesLow.append( tuples, proof_view_find_term_string_in_string( term_string, color, sentence_text, padding ) );
      cdolist_list_var = cdolist_list_var.rest();
      term_string = cdolist_list_var.first();
    }
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 70920L)
  public static SubLObject proof_view_find_term_string_in_string(SubLObject term_string, final SubLObject color, final SubLObject sentence_text, SubLObject padding)
  {
    if( padding == UNPROVIDED )
    {
      padding = ZERO_INTEGER;
    }
    SubLObject tuples = NIL;
    term_string = proof_view_remove_leading_commas( term_string );
    final SubLObject term_string_length = Sequences.length( term_string );
    SubLObject cdolist_list_var = string_utilities.search_all( term_string, sentence_text, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject start_pos = NIL;
    start_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !start_pos.numL( padding ) && !start_pos.numG( Numbers.subtract( Sequences.length( sentence_text ), Sequences.length( term_string ), padding ) ) )
      {
        tuples = ConsesLow.cons( ConsesLow.list( term_string, start_pos, Numbers.add( start_pos, term_string_length ), color ), tuples );
      }
      cdolist_list_var = cdolist_list_var.rest();
      start_pos = cdolist_list_var.first();
    }
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 71507L)
  public static SubLObject proof_view_remove_leading_commas(final SubLObject term_string)
  {
    return string_utilities.replace_substring( term_string, $str345$__, $str346$_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 71621L)
  public static SubLObject proof_view_delete_subsumed_references(final SubLObject tuples)
  {
    return list_utilities.delete_subsumed_items( tuples, $sym347$PROOF_VIEW_REFERENCE_SUBSUMES_P, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 71758L)
  public static SubLObject proof_view_reference_subsumes_p(final SubLObject ref1, final SubLObject ref2)
  {
    return makeBoolean( conses_high.second( ref1 ).numLE( conses_high.second( ref2 ) ) && conses_high.third( ref1 ).numGE( conses_high.third( ref2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 71905L)
  public static SubLObject get_abduced_support_sentence_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject negatedP)
  {
    if( negatedP == UNPROVIDED )
    {
      negatedP = NIL;
    }
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    assert NIL != Types.booleanp( negatedP ) : negatedP;
    final SubLObject proof_view_entry = find_proof_view_entry_by_ids( proof_view_id, proof_view_entry_id );
    if( NIL != proof_view_entry_p( proof_view_entry ) )
    {
      final SubLObject v_object = proof_view_entry_get_object( proof_view_entry );
      if( NIL != abduction.abduction_support_p( v_object ) )
      {
        SubLObject sentence = arguments.support_sentence( v_object );
        if( NIL != negatedP )
        {
          sentence = ConsesLow.list( $const349$not, sentence );
        }
        return sentence;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 72680L)
  public static SubLObject assert_abduction_support_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject source, SubLObject negatedP)
  {
    if( negatedP == UNPROVIDED )
    {
      negatedP = NIL;
    }
    final SubLObject proof_view_entry = find_proof_view_entry_by_ids( proof_view_id, proof_view_entry_id );
    final SubLObject proof_view_root_entry = find_proof_view_entry_by_ids( proof_view_id, ZERO_INTEGER );
    return assert_abduction_support_for_proof_view_recursive( proof_view_id, proof_view_entry, proof_view_root_entry, source, negatedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 73387L)
  public static SubLObject assert_abduction_support_for_proof_view_recursive(final SubLObject proof_view_id, final SubLObject proof_view_entry, final SubLObject proof_view_root_entry, SubLObject source,
      final SubLObject negatedP)
  {
    SubLObject changed_proof_view_entry_ids = NIL;
    SubLObject cdolist_list_var = proof_view_entry_get_children( proof_view_root_entry );
    SubLObject child_entry = NIL;
    child_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$41 = assert_abduction_support_for_proof_view_recursive( proof_view_id, proof_view_entry, child_entry, source, negatedP );
      SubLObject id = NIL;
      id = cdolist_list_var_$41.first();
      while ( NIL != cdolist_list_var_$41)
      {
        final SubLObject item_var = id;
        if( NIL == conses_high.member( item_var, changed_proof_view_entry_ids, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          changed_proof_view_entry_ids = ConsesLow.cons( item_var, changed_proof_view_entry_ids );
        }
        cdolist_list_var_$41 = cdolist_list_var_$41.rest();
        id = cdolist_list_var_$41.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      child_entry = cdolist_list_var.first();
    }
    if( proof_view_entry_get_object( proof_view_root_entry ).eql( proof_view_entry_get_object( proof_view_entry ) ) )
    {
      cdolist_list_var = assert_abduction_support_for_proof_view_int( proof_view_id, proof_view_entry_get_id( proof_view_root_entry ), source, negatedP );
      SubLObject id2 = NIL;
      id2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var2 = id2;
        if( NIL == conses_high.member( item_var2, changed_proof_view_entry_ids, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          changed_proof_view_entry_ids = ConsesLow.cons( item_var2, changed_proof_view_entry_ids );
        }
        cdolist_list_var = cdolist_list_var.rest();
        id2 = cdolist_list_var.first();
      }
    }
    return changed_proof_view_entry_ids;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 74174L)
  public static SubLObject assert_abduction_support_for_proof_view_int(final SubLObject proof_view_id, final SubLObject proof_view_entry_id, SubLObject source, SubLObject negatedP)
  {
    if( negatedP == UNPROVIDED )
    {
      negatedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    assert NIL != Types.booleanp( negatedP ) : negatedP;
    final SubLObject proof_view_entry = find_proof_view_entry_by_ids( proof_view_id, proof_view_entry_id );
    if( NIL != proof_view_entry_p( proof_view_entry ) )
    {
      final SubLObject v_object = proof_view_entry_get_object( proof_view_entry );
      SubLObject changed_proof_view_entry_ids = NIL;
      if( NIL != abduction.abduction_support_p( v_object ) )
      {
        SubLObject sentence = arguments.support_sentence( v_object );
        final SubLObject v_hlmt = czer_main.canonicalize_term( ConsesLow.list( $const351$ContextOfPCWFn, source ), UNPROVIDED );
        if( NIL != negatedP )
        {
          sentence = ConsesLow.list( $const349$not, sentence );
        }
        final SubLObject successP = ke.ke_assert_now_with_implicature( sentence, v_hlmt, UNPROVIDED, UNPROVIDED );
        if( NIL == successP )
        {
          return NIL;
        }
        final SubLObject _prev_bind_0 = $changed_proof_view_entry_ids$.currentBinding( thread );
        try
        {
          $changed_proof_view_entry_ids$.bind( NIL, thread );
          if( NIL != negatedP )
          {
            proof_view_entry_note_abduced_support_denied( proof_view_entry, v_object );
          }
          else
          {
            proof_view_entry_note_abduced_support_confirmed( proof_view_entry, v_object );
          }
          changed_proof_view_entry_ids = $changed_proof_view_entry_ids$.getDynamicValue( thread );
        }
        finally
        {
          $changed_proof_view_entry_ids$.rebind( _prev_bind_0, thread );
        }
        return changed_proof_view_entry_ids;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 75604L)
  public static SubLObject proof_view_entry_note_abduced_support_confirmed(final SubLObject proof_view_entry, final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $changed_proof_view_entry_ids$.setDynamicValue( ConsesLow.cons( proof_view_entry_get_id( proof_view_entry ), $changed_proof_view_entry_ids$.getDynamicValue( thread ) ), thread );
    if( proof_view_entry_get_object_type( proof_view_entry ) == $kw261$ABDUCED_SUPPORT )
    {
      proof_view_entry_set_object_type( proof_view_entry, $kw263$ABDUCED_SUPPORT_CONFIRMED );
    }
    else if( NIL != abduction.abduction_support_p( proof_view_entry_get_object( proof_view_entry ) ) )
    {
      proof_view_entry_set_object_type( proof_view_entry, $kw242$PROOF_VIEW_ENTRY_CONFIRMED );
    }
    else if( NIL != proof_view_entry_has_abduced_support_p( proof_view_entry ) )
    {
      proof_view_entry_rem_property( proof_view_entry, $kw287$HAS_ABDUCED_SUPPORT_ );
      proof_view_entry_set_property( proof_view_entry, $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_, support );
    }
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
    final SubLObject parent_id = proof_view_entry_get_parent_id( proof_view_entry );
    final SubLObject parent = parent_id.isInteger() ? find_proof_view_entry_by_id( v_proof_view, parent_id ) : NIL;
    if( NIL != parent )
    {
      proof_view_entry_note_abduced_support_confirmed( parent, support );
    }
    return proof_view_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 76796L)
  public static SubLObject proof_view_entry_note_abduced_support_denied(final SubLObject proof_view_entry, final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $changed_proof_view_entry_ids$.setDynamicValue( ConsesLow.cons( proof_view_entry_get_id( proof_view_entry ), $changed_proof_view_entry_ids$.getDynamicValue( thread ) ), thread );
    if( proof_view_entry_get_object_type( proof_view_entry ) == $kw261$ABDUCED_SUPPORT )
    {
      proof_view_entry_set_object_type( proof_view_entry, $kw265$ABDUCED_SUPPORT_DENIED );
    }
    else if( NIL != abduction.abduction_support_p( proof_view_entry_get_object( proof_view_entry ) ) )
    {
      proof_view_entry_set_object_type( proof_view_entry, $kw243$PROOF_VIEW_ENTRY_DENIED );
    }
    else if( NIL != proof_view_entry_has_abduced_support_p( proof_view_entry ) )
    {
      proof_view_entry_rem_property( proof_view_entry, $kw287$HAS_ABDUCED_SUPPORT_ );
      proof_view_entry_set_property( proof_view_entry, $kw289$HAS_ABDUCED_SUPPORT_DENIED_, support );
    }
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( proof_view_entry );
    final SubLObject parent_id = proof_view_entry_get_parent_id( proof_view_entry );
    final SubLObject parent = parent_id.isInteger() ? find_proof_view_entry_by_id( v_proof_view, parent_id ) : NIL;
    if( NIL != parent )
    {
      proof_view_entry_note_abduced_support_denied( parent, support );
    }
    return proof_view_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 77979L)
  public static SubLObject get_query_url_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id)
  {
    assert NIL != Types.integerp( proof_view_id ) : proof_view_id;
    assert NIL != Types.integerp( proof_view_entry_id ) : proof_view_entry_id;
    final SubLObject sentence = get_sentence_for_proof_view( proof_view_id, proof_view_entry_id );
    if( NIL != sentence )
    {
      return qua_query.get_query_url_for_sentence( sentence, UNPROVIDED, UNPROVIDED );
    }
    return $str0$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 78499L)
  public static SubLObject get_sentence_for_proof_view(final SubLObject proof_view_id, final SubLObject proof_view_entry_id)
  {
    final SubLObject proof_view_entry = find_proof_view_entry_by_ids( proof_view_id, proof_view_entry_id );
    if( NIL == proof_view_entry_p( proof_view_entry ) )
    {
      return NIL;
    }
    final SubLObject v_object = proof_view_entry_get_object( proof_view_entry );
    if( NIL != arguments.support_p( v_object ) )
    {
      return arguments.support_sentence( v_object );
    }
    if( NIL != cycl_grammar.cycl_sentence_p( v_object ) )
    {
      return v_object;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 79055L)
  public static SubLObject construct_proof_views_java_iteratively(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject inference_answer_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( problem_store_id ) : problem_store_id;
    assert NIL != Types.integerp( inference_id ) : inference_id;
    assert NIL != Types.integerp( inference_answer_id ) : inference_answer_id;
    SubLObject num_answers = ZERO_INTEGER;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym355$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id );
          final SubLObject mt = pph_proof.pph_get_inference_mt( inference );
          final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids( problem_store_id, inference_id, inference_answer_id );
          final SubLObject proofs = pph_proof.inference_answer_get_proofs( inference_answer );
          SubLObject cdolist_list_var;
          final SubLObject sorted_proofs = cdolist_list_var = proof_view_sort_proofs( proofs );
          SubLObject proof = NIL;
          proof = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject v_proof_view = construct_inference_proof_view( proof, inference_answer, mt );
            final SubLObject java_list = proof_view_construct_java_list( v_proof_view );
            num_answers = Numbers.add( num_answers, ONE_INTEGER );
            task_processor.post_task_info_processor_partial_results( java_list );
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      return error;
    }
    return num_answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 80474L)
  public static SubLObject proof_view_sort_proofs(final SubLObject proofs)
  {
    if( NIL != Sequences.find_if( $sym356$PROOF_ABDUCTIONS, proofs, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return Sort.sort( proofs, $sym339$_, $sym357$PROOF_ABDUCED_SUPPORT_RATIO );
    }
    return Sort.sort( proofs, $sym339$_, $sym358$INFERENCE_PROOF_GET_DEPTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 80687L)
  public static SubLObject construct_proof_views_java_list(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject inference_answer_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( problem_store_id ) : problem_store_id;
    assert NIL != Types.integerp( inference_id ) : inference_id;
    assert NIL != Types.integerp( inference_answer_id ) : inference_answer_id;
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id );
    final SubLObject mt = pph_proof.pph_get_inference_mt( inference );
    final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids( problem_store_id, inference_id, inference_answer_id );
    final SubLObject proofs = Sort.sort( pph_proof.inference_answer_get_proofs( inference_answer ), $sym339$_, $sym358$INFERENCE_PROOF_GET_DEPTH );
    SubLObject proof_view_lists = NIL;
    PrintLow.format( T, $str360$inference_answer___A__, inference_answer );
    PrintLow.format( T, $str361$proofs___A__, proofs );
    SubLObject cdolist_list_var = proofs;
    SubLObject proof = NIL;
    proof = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_proof_view = construct_inference_proof_view( proof, inference_answer, mt );
      proof_view_set_addressee( v_proof_view, pph_vars.$pph_addressee$.getDynamicValue( thread ) );
      proof_view_lists = ConsesLow.cons( proof_view_construct_java_list( v_proof_view ), proof_view_lists );
      cdolist_list_var = cdolist_list_var.rest();
      proof = cdolist_list_var.first();
    }
    return Sequences.nreverse( proof_view_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 81621L)
  public static SubLObject construct_xml_proof_view_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_properties, SubLObject include_contentP, SubLObject allow_external_linksP,
      SubLObject allow_internal_linksP)
  {
    if( inference_properties == UNPROVIDED )
    {
      inference_properties = NIL;
    }
    if( include_contentP == UNPROVIDED )
    {
      include_contentP = T;
    }
    if( allow_external_linksP == UNPROVIDED )
    {
      allow_external_linksP = T;
    }
    if( allow_internal_linksP == UNPROVIDED )
    {
      allow_internal_linksP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference = inference_kernel.new_continuable_inference( sentence, mt, inference_datastructures_enumerated_types.extract_query_static_properties( inference_properties ) );
    SubLObject xml = NIL;
    inference_kernel.continue_inference( inference, conses_high.putf( inference_datastructures_enumerated_types.extract_query_dynamic_properties( inference_properties ), $kw363$MAX_NUMBER, ONE_INTEGER ) );
    if( NIL != inference_datastructures_inference.inference_has_some_answerP( inference ) )
    {
      final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw66$SKIP ) )
      {
        final SubLObject idx_$42 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$42, $kw66$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$42 );
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
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            inference_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( inference_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw66$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( inference_answer ) )
              {
                inference_answer = $kw66$SKIP;
              }
              if( NIL == xml && NIL == xml )
              {
                csome_list_var = Sort.sort( pph_proof.inference_answer_get_proofs( inference_answer ), Symbols.symbol_function( $sym339$_ ), $sym358$INFERENCE_PROOF_GET_DEPTH );
                proof = NIL;
                proof = csome_list_var.first();
                while ( NIL == xml && NIL != csome_list_var)
                {
                  v_proof_view = new_proof_view( proof, inference_answer );
                  proof_view_set_include_cycml_in_xmlP( v_proof_view, include_contentP );
                  proof_view_set_allow_external_linksP( v_proof_view, allow_external_linksP );
                  proof_view_set_allow_internal_linksP( v_proof_view, allow_internal_linksP );
                  proof_view_populator.proof_view_populate( v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  stream = NIL;
                  try
                  {
                    stream = streams_high.make_private_string_output_stream();
                    _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_stream$.bind( stream, thread );
                      output_proof_view_in_xml( v_proof_view, UNPROVIDED );
                    }
                    finally
                    {
                      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
                    }
                    xml = streams_high.get_output_stream_string( stream );
                  }
                  finally
                  {
                    _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      _values = Values.getValuesAsVector();
                      streams_high.close( stream, UNPROVIDED );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
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
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$43 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$43 );
          SubLObject id2 = NIL;
          SubLObject inference_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              inference_answer2 = Hashtables.getEntryValue( cdohash_entry );
              if( NIL == xml && NIL == xml )
              {
                SubLObject csome_list_var2 = Sort.sort( pph_proof.inference_answer_get_proofs( inference_answer2 ), Symbols.symbol_function( $sym339$_ ), $sym358$INFERENCE_PROOF_GET_DEPTH );
                SubLObject proof2 = NIL;
                proof2 = csome_list_var2.first();
                while ( NIL == xml && NIL != csome_list_var2)
                {
                  final SubLObject v_proof_view2 = new_proof_view( proof2, inference_answer2 );
                  proof_view_set_include_cycml_in_xmlP( v_proof_view2, include_contentP );
                  proof_view_set_allow_external_linksP( v_proof_view2, allow_external_linksP );
                  proof_view_set_allow_internal_linksP( v_proof_view2, allow_internal_linksP );
                  proof_view_populator.proof_view_populate( v_proof_view2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  SubLObject stream2 = NIL;
                  try
                  {
                    stream2 = streams_high.make_private_string_output_stream();
                    final SubLObject _prev_bind_3 = xml_vars.$xml_stream$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_stream$.bind( stream2, thread );
                      output_proof_view_in_xml( v_proof_view2, UNPROVIDED );
                    }
                    finally
                    {
                      xml_vars.$xml_stream$.rebind( _prev_bind_3, thread );
                    }
                    xml = streams_high.get_output_stream_string( stream2 );
                  }
                  finally
                  {
                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      streams_high.close( stream2, UNPROVIDED );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                    }
                  }
                  csome_list_var2 = csome_list_var2.rest();
                  proof2 = csome_list_var2.first();
                }
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
    }
    inference_datastructures_inference.destroy_inference( inference );
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 83346L)
  public static SubLObject proof_view_id_populate(final SubLObject proof_view_id)
  {
    proof_view_populator.proof_view_populate( find_proof_view_by_id( proof_view_id ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 83531L)
  public static SubLObject proof_view_xml(final SubLObject proof_view_id, SubLObject include_entry_detailsP)
  {
    if( include_entry_detailsP == UNPROVIDED )
    {
      include_entry_detailsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_proof_view = find_proof_view_by_id( proof_view_id );
    SubLObject xml = NIL;
    if( NIL == v_proof_view )
    {
      Errors.error( $str366$_s_Does_not_identify_existing_pro, proof_view_id );
    }
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        xml_utilities.xml_header( $float119$1_0, $str367$UTF_8, NIL );
        output_proof_view_in_xml( v_proof_view, include_entry_detailsP );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      xml = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 84259L)
  public static SubLObject proof_view_entry_xml(final SubLObject proof_view_id, final SubLObject entry_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entry = find_proof_view_entry_by_ids( proof_view_id, entry_id );
    SubLObject xml = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        output_proof_view_entry_in_xml( entry, $kw369$TOP_LEVEL_ONLY );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      xml = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 84656L)
  public static SubLObject proof_view_xml_tag(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject local_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list370 );
    local_name = current.first();
    current = current.rest();
    final SubLObject attributes = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list370 );
    current = current.rest();
    final SubLObject atomicP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list370 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym371$XML_TAG, ConsesLow.listS( local_name, attributes, atomicP, $list372 ), ConsesLow.listS( $sym70$CLET, $list373, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list370 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 84925L)
  public static SubLObject output_proof_view_in_xml(final SubLObject v_proof_view, SubLObject include_entry_detailsP)
  {
    if( include_entry_detailsP == UNPROVIDED )
    {
      include_entry_detailsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = proof_view_get_id( v_proof_view );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str374$proof_view, ConsesLow.list( $str375$id, id ), NIL, NIL, xml_vars.proof_view_namespace() );
        final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        final SubLObject _prev_bind_1_$45 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( xml_vars.proof_view_namespace(), thread );
          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$proof_view_include_namespaceP$.getDynamicValue( thread ), thread );
          output_proof_view_entry_in_xml( proof_view_get_root_entry( v_proof_view ), include_entry_detailsP );
        }
        finally
        {
          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$45, thread );
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$44, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str374$proof_view );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 85232L)
  public static SubLObject output_proof_view_details_in_xml(final SubLObject v_proof_view)
  {
    output_proof_view_section_in_xml( v_proof_view, $kw376$JUSTIFICATION_ROOT, $str377$proof_view_details );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 85406L)
  public static SubLObject output_proof_view_sources_in_xml(final SubLObject v_proof_view)
  {
    output_proof_view_section_in_xml( v_proof_view, $kw378$SOURCES_ROOT, $str379$proof_view_sources );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 85574L)
  public static SubLObject output_proof_view_rules_in_xml(final SubLObject v_proof_view)
  {
    output_proof_view_section_in_xml( v_proof_view, $kw380$RULES_USED, $str381$proof_view_rules );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 85736L)
  public static SubLObject output_proof_view_section_in_xml(final SubLObject v_proof_view, final SubLObject section_key, final SubLObject tag_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = proof_view_get_id( v_proof_view );
    final SubLObject section_root = proof_view_get_property( v_proof_view, section_key, UNPROVIDED );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( tag_name, ConsesLow.list( $str382$proof_view_id, id ), NIL, NIL, xml_vars.proof_view_namespace() );
        final SubLObject _prev_bind_0_$46 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        final SubLObject _prev_bind_1_$47 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( xml_vars.proof_view_namespace(), thread );
          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$proof_view_include_namespaceP$.getDynamicValue( thread ), thread );
          if( NIL != section_root )
          {
            final SubLObject children = proof_view_entry_get_children( section_root );
            if( NIL != list_utilities.non_empty_list_p( children ) )
            {
              SubLObject cdolist_list_var = children;
              SubLObject child_entry = NIL;
              child_entry = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                output_proof_view_entry_in_xml( child_entry, UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                child_entry = cdolist_list_var.first();
              }
            }
          }
        }
        finally
        {
          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$47, thread );
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$46, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( tag_name );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 86236L)
  public static SubLObject output_proof_view_entry_in_xml(final SubLObject entry, SubLObject include_entry_detailsP)
  {
    if( include_entry_detailsP == UNPROVIDED )
    {
      include_entry_detailsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entry_id = proof_view_entry_get_id( entry );
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( entry );
    final SubLObject proof_view_id = proof_view_get_id( v_proof_view );
    final SubLObject attributes = proof_view_entry_xml_attributes( entry );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str383$proof_view_entry, attributes, NIL, NIL, xml_vars.proof_view_namespace() );
        final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        final SubLObject _prev_bind_1_$49 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( xml_vars.proof_view_namespace(), thread );
          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$proof_view_include_namespaceP$.getDynamicValue( thread ), thread );
          if( !entry.eql( proof_view_get_root_entry( v_proof_view ) ) && NIL != include_entry_detailsP )
          {
            output_proof_view_entry_details_in_xml( proof_view_id, entry_id );
          }
          final SubLObject children = proof_view_entry_get_children( entry );
          include_entry_detailsP = makeBoolean( NIL != include_entry_detailsP && include_entry_detailsP != $kw369$TOP_LEVEL_ONLY );
          if( NIL != list_utilities.non_empty_list_p( children ) )
          {
            try
            {
              final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str384$sub_entries, NIL, NIL, NIL, xml_vars.proof_view_namespace() );
                final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                final SubLObject _prev_bind_1_$51 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( xml_vars.proof_view_namespace(), thread );
                  xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$proof_view_include_namespaceP$.getDynamicValue( thread ), thread );
                  SubLObject cdolist_list_var = children;
                  SubLObject child_entry = NIL;
                  child_entry = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    output_proof_view_entry_in_xml( child_entry, include_entry_detailsP );
                    cdolist_list_var = cdolist_list_var.rest();
                    child_entry = cdolist_list_var.first();
                  }
                }
                finally
                {
                  xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$51, thread );
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$50, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$50, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$49, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str384$sub_entries );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
              }
            }
          }
        }
        finally
        {
          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$49, thread );
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$48, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str383$proof_view_entry );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 87309L)
  public static SubLObject output_proof_view_entry_details_in_xml(final SubLObject proof_view_id, final SubLObject entry_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entry = find_proof_view_entry_by_ids( proof_view_id, entry_id );
    final SubLObject v_proof_view = proof_view_entry_get_proof_view( entry );
    if( NIL == v_proof_view )
    {
      Errors.error( $str366$_s_Does_not_identify_existing_pro, proof_view_id );
    }
    SubLObject current;
    final SubLObject datum = current = proof_view_entry_html( proof_view_id, entry_id );
    SubLObject html = NIL;
    SubLObject cycl = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    html = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    cycl = current.first();
    current = current.rest();
    if( NIL == current )
    {
      cycml.cycml_serialize_paraphrase( html, UNPROVIDED );
      if( NIL != proof_view_get_include_cycl_in_outputP( v_proof_view ) && NIL != cycl_grammar.cycl_expression_p( cycl ) )
      {
        try
        {
          final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str386$cycl, NIL, NIL, NIL, xml_vars.proof_view_namespace() );
            final SubLObject _prev_bind_0_$55 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$56 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( xml_vars.proof_view_namespace(), thread );
              xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$proof_view_include_namespaceP$.getDynamicValue( thread ), thread );
              xml_utilities.xml_cdata( print_high.princ_to_string( cycl ) );
            }
            finally
            {
              xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$56, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$55, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str386$cycl );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
      }
      if( NIL != proof_view_get_include_cycml_in_xmlP( v_proof_view ) )
      {
        output_proof_view_entry_content_in_xml( cycl );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list385 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 88317L)
  public static SubLObject proof_view_cycl_silk_string(final SubLObject value)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 89243L)
  public static SubLObject proof_view_entry_xml_attributes(final SubLObject entry)
  {
    final SubLObject entry_id = proof_view_entry_get_id( entry );
    final SubLObject expand_initiallyP = proof_view_entry_expand_intiallyP( entry );
    final SubLObject label = proof_view_entry_get_label( entry );
    final SubLObject abduced_supportP = abduction.abduction_support_p( proof_view_entry_get_object( entry ) );
    final SubLObject attributes = ConsesLow.list( new SubLObject[] { $str375$id, print_high.princ_to_string( entry_id ), $str387$expand_initially, xml_utilities.boolean_to_trueXfalse_string( expand_initiallyP ),
      $str388$label, label, $str389$object_type, Strings.string_downcase( print_high.princ_to_string( proof_view_entry_get_object_type( entry ) ), UNPROVIDED, UNPROVIDED ), $str390$abduced_support, xml_utilities
          .boolean_to_trueXfalse_string( abduced_supportP )
    } );
    return attributes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 89893L)
  public static SubLObject output_proof_view_entry_content_in_xml(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str391$content, NIL, NIL, NIL, xml_vars.proof_view_namespace() );
        final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        final SubLObject _prev_bind_1_$58 = xml_vars.$cycml_include_namespaceP$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( xml_vars.proof_view_namespace(), thread );
          xml_vars.$cycml_include_namespaceP$.bind( xml_vars.$proof_view_include_namespaceP$.getDynamicValue( thread ), thread );
          if( NIL != cycl_grammar.cycl_denotational_term_p( cycl ) )
          {
            cycml.cycml_serialize_term( cycl );
          }
          else if( NIL != cycl_grammar.cycl_sentence_p( cycl ) )
          {
            cycml.cycml_serialize_sentence( cycl );
          }
          else if( NIL != cycl )
          {
            cycml_generator.cycml_serialize_object( cycl );
          }
        }
        finally
        {
          xml_vars.$cycml_include_namespaceP$.rebind( _prev_bind_1_$58, thread );
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$57, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str391$content );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 90242L)
  public static SubLObject proof_view_construct_java_list(final SubLObject v_proof_view)
  {
    assert NIL != valid_proof_view_p( v_proof_view ) : v_proof_view;
    SubLObject proof_view_entry_lists = NIL;
    SubLObject cdolist_list_var = proof_view_get_entries( v_proof_view );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      proof_view_entry_lists = ConsesLow.cons( proof_view_entry_construct_java_list( entry ), proof_view_entry_lists );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return ConsesLow.list( $kw34$ID, proof_view_get_id( v_proof_view ), $kw392$ENTRIES, Sequences.nreverse( proof_view_entry_lists ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 90618L)
  public static SubLObject proof_view_entry_construct_java_list(final SubLObject proof_view_entry)
  {
    assert NIL != proof_view_entry_p( proof_view_entry ) : proof_view_entry;
    final SubLObject id = proof_view_entry_get_id( proof_view_entry );
    final SubLObject parent_id = proof_view_entry_get_parent_id( proof_view_entry );
    final SubLObject expand_initiallyP = ( NIL != proof_view_entry_expand_intiallyP( proof_view_entry ) ) ? $kw393$TRUE : $kw394$FALSE;
    final SubLObject label = proof_view_entry_get_label( proof_view_entry );
    final SubLObject abduced_supportP = ( NIL != abduction.abduction_support_p( proof_view_entry_get_object( proof_view_entry ) ) ) ? $kw393$TRUE : $kw394$FALSE;
    SubLObject result = NIL;
    result = ConsesLow.list( new SubLObject[] { $kw34$ID, id, $kw188$PARENT_ID, parent_id, $kw215$EXPAND_INITIALLY_, expand_initiallyP, $kw189$LABEL, label, $kw395$ABDUCED_SUPPORT_, abduced_supportP
    } );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 91378L)
  public static SubLObject get_new_empty_proof_view(SubLObject inference_answer, SubLObject proof)
  {
    if( inference_answer == UNPROVIDED )
    {
      inference_answer = NIL;
    }
    if( proof == UNPROVIDED )
    {
      proof = NIL;
    }
    final SubLObject v_proof_view = new_proof_view( UNPROVIDED, UNPROVIDED );
    if( NIL != inference_answer )
    {
      proof_view_set_answer( v_proof_view, inference_answer );
      SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( inference_answer );
      SubLObject justification = NIL;
      justification = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$59 = inference_datastructures_inference.inference_answer_justification_proofs( justification );
        SubLObject one_proof = NIL;
        one_proof = cdolist_list_var_$59.first();
        while ( NIL != cdolist_list_var_$59)
        {
          if( NIL == proof )
          {
            proof = one_proof;
          }
          cdolist_list_var_$59 = cdolist_list_var_$59.rest();
          one_proof = cdolist_list_var_$59.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        justification = cdolist_list_var.first();
      }
      proof_view_set_proof( v_proof_view, proof );
    }
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 91839L)
  public static SubLObject get_new_empty_proof_view_id(SubLObject problem_store_id, SubLObject inference_id, SubLObject inference_answer_id, SubLObject proof_id)
  {
    if( problem_store_id == UNPROVIDED )
    {
      problem_store_id = NIL;
    }
    if( inference_id == UNPROVIDED )
    {
      inference_id = NIL;
    }
    if( inference_answer_id == UNPROVIDED )
    {
      inference_answer_id = NIL;
    }
    if( proof_id == UNPROVIDED )
    {
      proof_id = NIL;
    }
    SubLObject inference_answer = NIL;
    SubLObject proof = NIL;
    if( NIL != problem_store_id )
    {
      final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id( problem_store_id );
      final SubLObject inference = ( NIL != problem_store ) ? inference_datastructures_problem_store.find_inference_by_id( problem_store, ( NIL != inference_id ) ? inference_id : ZERO_INTEGER ) : NIL;
      if( NIL != inference )
      {
        inference_answer = inference_datastructures_inference.find_inference_answer_by_id( inference, ( NIL != inference_answer_id ) ? inference_answer_id : ZERO_INTEGER );
      }
      if( NIL != problem_store && NIL != inference_answer && NIL != proof_id )
      {
        proof = inference_datastructures_problem_store.find_proof_by_id( problem_store, proof_id );
      }
    }
    return proof_view_get_id( get_new_empty_proof_view( inference_answer, proof ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 93182L)
  public static SubLObject proof_view_set_proof(final SubLObject v_proof_view, final SubLObject proof)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    _csetf_proof_view_int_proof( v_proof_view, proof );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 93376L)
  public static SubLObject proof_view_set_answer(final SubLObject v_proof_view, final SubLObject inference_answer)
  {
    assert NIL != proof_view_p( v_proof_view ) : v_proof_view;
    assert NIL != inference_datastructures_inference.inference_answer_p( inference_answer ) : inference_answer;
    _csetf_proof_view_int_answer( v_proof_view, inference_answer );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 93616L)
  public static SubLObject construct_inference_proof_view(final SubLObject proof, final SubLObject inference_answer, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_proof.pph_get_inference_mt( inference_datastructures_inference.inference_answer_inference( inference_answer ) );
    }
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    assert NIL != inference_datastructures_inference.inference_answer_p( inference_answer ) : inference_answer;
    final SubLObject v_proof_view = new_proof_view( proof, inference_answer );
    proof_view_populator.proof_view_populate( v_proof_view, mt, UNPROVIDED, UNPROVIDED );
    return v_proof_view;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 94025L)
  public static SubLObject proof_view_closed_query_success_value()
  {
    return $str398$Yes_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 94101L)
  public static SubLObject proof_view_get_used_rules_root(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw399$USED_RULES_ROOT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 94227L)
  public static SubLObject proof_view_get_query_root(final SubLObject v_proof_view)
  {
    return proof_view_get_property( v_proof_view, $kw400$QUERY_ROOT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 94528L)
  public static SubLObject proof_view_fact_trivially_implies_proof_conclusionP_internal(final SubLObject item, final SubLObject v_proof_view, SubLObject allow_partialP)
  {
    if( allow_partialP == UNPROVIDED )
    {
      allow_partialP = $proof_view_allow_trivial_partial_proof_conclusion_supportsP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( proof_view_get_answer( v_proof_view ) );
    final SubLObject conclusion = pph_proof.pph_proof_conclusion( proof_view_get_proof( v_proof_view ), pph_proof.pph_get_inference_mt( inference ) );
    SubLObject candidates = NIL;
    if( NIL != el_utilities.el_conjunction_p( conclusion ) && NIL == allow_partialP )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = ( NIL != el_utilities.el_conjunction_p( conclusion ) ) ? cycl_utilities.formula_args( conclusion, UNPROVIDED ) : ConsesLow.list( conclusion );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject conjunct_asent = proof_view_fact_sentence( conjunct );
      if( NIL != proof_view_fact_trivially_impliesP( item, conjunct, UNPROVIDED ) )
      {
        candidates = ConsesLow.cons( conjunct_asent, candidates );
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    if( NIL != candidates )
    {
      final SubLObject hl_query = inference_datastructures_inference.inference_hl_query( inference );
      SubLObject cdolist_list_var2 = candidates;
      SubLObject conjunct2 = NIL;
      conjunct2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$60 = hl_query;
        SubLObject clause = NIL;
        clause = cdolist_list_var_$60.first();
        while ( NIL != cdolist_list_var_$60)
        {
          SubLObject cdolist_list_var_$61 = clauses.pos_lits( clause );
          SubLObject lit = NIL;
          lit = cdolist_list_var_$61.first();
          while ( NIL != cdolist_list_var_$61)
          {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list402 );
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list402 );
            asent = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject v_bindings = unification_utilities.asent_unify( conjunct2, asent, UNPROVIDED, UNPROVIDED );
              SubLObject abortP = Types.sublisp_null( v_bindings );
              if( NIL == abortP )
              {
                SubLObject csome_list_var = v_bindings;
                SubLObject binding = NIL;
                binding = csome_list_var.first();
                while ( NIL == abortP && NIL != csome_list_var)
                {
                  final SubLObject var = bindings.variable_binding_variable( binding );
                  if( NIL != cycl_grammar.hl_variable_p( var ) && NIL == subl_promotions.memberP( var, inference_datastructures_inference.inference_free_hl_vars( inference ), UNPROVIDED, UNPROVIDED ) )
                  {
                    abortP = T;
                  }
                  csome_list_var = csome_list_var.rest();
                  binding = csome_list_var.first();
                }
              }
              if( NIL == abortP )
              {
                if( NIL != $proof_view_debugP$.getDynamicValue( thread ) )
                {
                  Errors.warn( $str403$_S___trivially_implies_answer_con, item, conjunct2 );
                }
                return T;
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list402 );
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

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 94528L)
  public static SubLObject proof_view_fact_trivially_implies_proof_conclusionP(final SubLObject item, final SubLObject v_proof_view, SubLObject allow_partialP)
  {
    if( allow_partialP == UNPROVIDED )
    {
      allow_partialP = $proof_view_allow_trivial_partial_proof_conclusion_supportsP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_fact_trivially_implies_proof_conclusionP_internal( item, v_proof_view, allow_partialP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_, THREE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( item, v_proof_view, allow_partialP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( item.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_proof_view.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && allow_partialP.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_fact_trivially_implies_proof_conclusionP_internal( item, v_proof_view, allow_partialP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( item, v_proof_view, allow_partialP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 96086L)
  public static SubLObject proof_view_tva_support_entryP(final SubLObject entry, SubLObject check_parent_tooP)
  {
    if( check_parent_tooP == UNPROVIDED )
    {
      check_parent_tooP = T;
    }
    final SubLObject entry_object = ( NIL != entry ) ? proof_view_entry_get_object( entry ) : NIL;
    if( NIL != arguments.support_p( entry_object ) && $kw404$TVA.eql( arguments.support_module( entry_object ) ) )
    {
      return T;
    }
    if( NIL != check_parent_tooP )
    {
      final SubLObject parent = find_proof_view_entry_by_id( proof_view_entry_get_proof_view( entry ), proof_view_entry_get_parent_id( entry ) );
      return proof_view_tva_support_entryP( parent, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 96575L)
  public static SubLObject proof_view_entry_has_support_entryP(final SubLObject entry)
  {
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var = proof_view_entry_get_children( entry );
      SubLObject child_entry = NIL;
      child_entry = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( NIL != conses_high.member( proof_view_entry_get_object_type( child_entry ), $list405, UNPROVIDED, UNPROVIDED ) )
        {
          ans = T;
        }
        csome_list_var = csome_list_var.rest();
        child_entry = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 96884L)
  public static SubLObject proof_view_rule_support_entryP(final SubLObject entry)
  {
    return makeBoolean( NIL != conses_high.member( proof_view_entry_get_object_type( entry ), $list406, Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL != assertions_high.rule_assertionP(
        proof_view_entry_get_object( entry ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 97101L)
  public static SubLObject proof_view_has_sourcesP(final SubLObject v_proof_view)
  {
    return dictionary.dictionary_p( proof_view_get_source_index( v_proof_view ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 97219L)
  public static SubLObject proof_view_has_justification_sectionP(final SubLObject v_proof_view)
  {
    return proof_view_has_sectionP( v_proof_view, $kw376$JUSTIFICATION_ROOT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 97352L)
  public static SubLObject proof_view_has_sectionP(final SubLObject v_proof_view, final SubLObject section_key)
  {
    return proof_view_entry_p( proof_view_get_property( v_proof_view, section_key, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 97493L)
  public static SubLObject proof_view_fact_trivially_impliesP(final SubLObject fact1, final SubLObject fact2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_proof.pph_triviality_check_mt();
    }
    return proof_view_fact_impliesP( fact1, fact2, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 97658L)
  public static SubLObject proof_view_fact_impliesP_internal(final SubLObject fact1, final SubLObject fact2, SubLObject mt, SubLObject triviallyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_proof.pph_triviality_check_mt();
    }
    if( triviallyP == UNPROVIDED )
    {
      triviallyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject s1 = proof_view_fact_sentence( fact1 );
    final SubLObject s2 = proof_view_fact_sentence( fact2 );
    SubLObject trivialP = NIL;
    if( s1.equal( s2 ) )
    {
      return T;
    }
    if( NIL != fact_sheets.fact_sheet_sentence_trivially_impliesP( narts_high.nart_substitute( s1 ), narts_high.nart_substitute( s2 ), mt, triviallyP, NIL ) )
    {
      trivialP = T;
    }
    thread.resetMultipleValues();
    SubLObject success = formula_pattern_match.formula_matches_pattern( s1, $list408 );
    SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject factor = list_utilities.alist_lookup_without_values( v_bindings, $sym409$FACTOR, UNPROVIDED, UNPROVIDED );
      final SubLObject slot = list_utilities.alist_lookup_without_values( v_bindings, $sym410$SLOT, UNPROVIDED, UNPROVIDED );
      final SubLObject event = list_utilities.alist_lookup_without_values( v_bindings, $sym411$EVENT, UNPROVIDED, UNPROVIDED );
      if( factor.isNumber() && factor.numG( ONE_INTEGER ) && NIL != formula_pattern_match.formula_matches_pattern( s2, ConsesLow.list( $list412, event, ConsesLow.list( $const413$IncreaseOnSlotFn, slot ) ) ) )
      {
        trivialP = T;
      }
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( s1, $list414 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject col2 = list_utilities.alist_lookup_without_values( v_bindings, $sym415$COL2, UNPROVIDED, UNPROVIDED );
      final SubLObject col3 = list_utilities.alist_lookup_without_values( v_bindings, $sym416$COL1, UNPROVIDED, UNPROVIDED );
      final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym417$BIN_PRED, UNPROVIDED, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject success_$62 = formula_pattern_match.formula_matches_pattern( s2, ConsesLow.list( $list418, col3, col2 ) );
      final SubLObject v_bindings_$63 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success_$62 )
      {
        final SubLObject pred = list_utilities.alist_lookup_without_values( v_bindings_$63, $sym419$PRED, UNPROVIDED, UNPROVIDED );
        if( NIL == trivialP )
        {
          SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt( pred, $const423$coGenlPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject kappa = NIL;
          kappa = csome_list_var.first();
          while ( NIL == trivialP && NIL != csome_list_var)
          {
            if( NIL != formula_pattern_match.formula_matches_pattern( kappa, ConsesLow.list( $const420$Kappa, $list421, ConsesLow.listS( $const422$relationAllExists, bin_pred, $list421 ) ) ) )
            {
              trivialP = T;
            }
            csome_list_var = csome_list_var.rest();
            kappa = csome_list_var.first();
          }
        }
      }
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( s1, $list424 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject min = list_utilities.alist_lookup_without_values( v_bindings, $sym425$MIN, UNPROVIDED, UNPROVIDED );
      final SubLObject col4 = list_utilities.alist_lookup_without_values( v_bindings, $sym415$COL2, UNPROVIDED, UNPROVIDED );
      final SubLObject col5 = list_utilities.alist_lookup_without_values( v_bindings, $sym416$COL1, UNPROVIDED, UNPROVIDED );
      final SubLObject bin_pred2 = list_utilities.alist_lookup_without_values( v_bindings, $sym417$BIN_PRED, UNPROVIDED, UNPROVIDED );
      if( min.isNumber() && min.isPositive() && NIL != formula_pattern_match.formula_matches_pattern( s2, ConsesLow.list( $const422$relationAllExists, bin_pred2, col5, col4 ) ) )
      {
        trivialP = T;
      }
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( s1, $list426 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject subs = list_utilities.alist_lookup_without_values( v_bindings, $sym427$SUBS, UNPROVIDED, UNPROVIDED );
      final SubLObject v_super = list_utilities.alist_lookup_without_values( v_bindings, $sym428$SUPER, UNPROVIDED, UNPROVIDED );
      if( NIL != formula_pattern_match.formula_matches_pattern( s2, ConsesLow.list( $list429, v_super, list_utilities.last_one( el_utilities.el_list_items( subs ) ) ) ) )
      {
        trivialP = T;
      }
      thread.resetMultipleValues();
      final SubLObject success_$63 = formula_pattern_match.formula_matches_pattern( s2, ConsesLow.listS( $list430, v_super, $list431 ) );
      final SubLObject v_bindings_$64 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success_$63 )
      {
        final SubLObject sub2 = list_utilities.alist_lookup_without_values( v_bindings_$64, $sym432$SUB2, UNPROVIDED, UNPROVIDED );
        final SubLObject sub3 = list_utilities.alist_lookup_without_values( v_bindings_$64, $sym433$SUB1, UNPROVIDED, UNPROVIDED );
        final SubLObject pos1 = Sequences.position( sub3, subs, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject pos2 = Sequences.position( sub2, subs, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        trivialP = makeBoolean( NIL != pos1 && NIL != pos2 && pos1.numG( pos2 ) );
      }
    }
    if( NIL != formula_pattern_match.formula_matches_pattern( s2, ConsesLow.list( $list434, $kw435$FULLY_BOUND, s1 ) ) )
    {
      trivialP = T;
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( s1, $list436 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject sub4 = list_utilities.alist_lookup_without_values( v_bindings, $sym437$SUB, UNPROVIDED, UNPROVIDED );
      final SubLObject sup = list_utilities.alist_lookup_without_values( v_bindings, $sym438$SUP, UNPROVIDED, UNPROVIDED );
      if( NIL != formula_pattern_match.formula_matches_pattern( s2, ConsesLow.list( $const439$startTogetherInSituationType, $kw440$ANYTHING, sup, sub4 ) ) )
      {
        trivialP = T;
      }
    }
    if( NIL != trivialP && NIL != $proof_view_debugP$.getDynamicValue( thread ) )
    {
      Errors.warn( $str441$_S___trivially_implies__S, fact1, fact2 );
    }
    return trivialP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 97658L)
  public static SubLObject proof_view_fact_impliesP(final SubLObject fact1, final SubLObject fact2, SubLObject mt, SubLObject triviallyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_proof.pph_triviality_check_mt();
    }
    if( triviallyP == UNPROVIDED )
    {
      triviallyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_fact_impliesP_internal( fact1, fact2, mt, triviallyP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym407$PROOF_VIEW_FACT_IMPLIES_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym407$PROOF_VIEW_FACT_IMPLIES_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym407$PROOF_VIEW_FACT_IMPLIES_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( fact1, fact2, mt, triviallyP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( fact1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( fact2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && triviallyP.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_fact_impliesP_internal( fact1, fact2, mt, triviallyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fact1, fact2, mt, triviallyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 100393L)
  public static SubLObject proof_view_fact_sentence_internal(final SubLObject fact)
  {
    if( NIL != arguments.support_p( fact ) )
    {
      return arguments.support_el_sentence( fact );
    }
    if( NIL != cycl_grammar.cycl_sentence_p( fact ) )
    {
      return cycl_utilities.hl_to_el( fact );
    }
    Errors.error( $str443$Don_t_know_how_to_get_sentence_of, fact );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 100393L)
  public static SubLObject proof_view_fact_sentence(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_fact_sentence_internal( fact );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym442$PROOF_VIEW_FACT_SENTENCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym442$PROOF_VIEW_FACT_SENTENCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym442$PROOF_VIEW_FACT_SENTENCE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fact, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_fact_sentence_internal( fact ) ) );
      memoization_state.caching_state_put( caching_state, fact, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 100663L)
  public static SubLObject proof_view_fact_hl_sentence_internal(final SubLObject fact)
  {
    if( NIL != assertion_handles.assertion_p( fact ) )
    {
      return fact;
    }
    if( NIL != arguments.support_p( fact ) )
    {
      return arguments.support_sentence( fact );
    }
    if( NIL != cycl_grammar.cycl_sentence_p( fact ) )
    {
      return pph_proof.pph_sub_isomorphic_assertions_into_supports( narts_high.nart_substitute( fact ) );
    }
    Errors.error( $str445$Don_t_know_how_to_get_HL_sentence, fact );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 100663L)
  public static SubLObject proof_view_fact_hl_sentence(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_fact_hl_sentence_internal( fact );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym444$PROOF_VIEW_FACT_HL_SENTENCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym444$PROOF_VIEW_FACT_HL_SENTENCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym444$PROOF_VIEW_FACT_HL_SENTENCE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fact, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_fact_hl_sentence_internal( fact ) ) );
      memoization_state.caching_state_put( caching_state, fact, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 101028L)
  public static SubLObject proof_view_fact_sentence_with_hl_terms_internal(final SubLObject fact)
  {
    if( NIL != assertions_high.gaf_assertionP( fact ) )
    {
      return fi.assertion_hl_formula( fact, UNPROVIDED );
    }
    if( NIL != assertion_handles.assertion_p( fact ) )
    {
      return fact;
    }
    if( NIL != arguments.support_p( fact ) )
    {
      return arguments.support_sentence( fact );
    }
    if( NIL != cycl_grammar.cycl_sentence_p( fact ) )
    {
      return pph_proof.pph_sub_isomorphic_assertions_into_supports( narts_high.nart_substitute( fact ) );
    }
    if( NIL != proof_view_entry_p( fact ) )
    {
      return proof_view_fact_sentence_with_hl_terms( proof_view_entry_get_object( fact ) );
    }
    Errors.error( $str445$Don_t_know_how_to_get_HL_sentence, fact );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 101028L)
  public static SubLObject proof_view_fact_sentence_with_hl_terms(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_fact_sentence_with_hl_terms_internal( fact );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym446$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym446$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym446$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fact, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_fact_sentence_with_hl_terms_internal( fact ) ) );
      memoization_state.caching_state_put( caching_state, fact, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 101590L)
  public static SubLObject proof_view_transitive_support_p(final SubLObject obj)
  {
    return makeBoolean( NIL != arguments.support_p( obj ) && NIL != conses_high.member( arguments.support_module( obj ), $list447, UNPROVIDED, UNPROVIDED ) && NIL == el_utilities.el_negation_p( arguments
        .support_sentence( obj ) ) && NIL == conses_high.member( arguments.support_truth( obj ), $list448, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 101886L)
  public static SubLObject proof_view_rule_suitable_for_rules_sectionP(final SubLObject rule)
  {
    return makeBoolean( NIL != assertions_high.rule_assertionP( rule ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( rule, $const255$keyRuleEnglishSummary, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 102138L)
  public static SubLObject suppress_proof_supportP(final SubLObject support)
  {
    return suppress_proof_view_literalP( arguments.support_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 102258L)
  public static SubLObject suppress_proof_view_literalP(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.initialized_p( $proof_view_literals_to_suppress$.getDynamicValue( thread ) ) )
    {
      final SubLObject el_asent = cycl_utilities.naut_substitute( asent );
      SubLObject cdolist_list_var = $proof_view_literals_to_suppress$.getDynamicValue( thread );
      SubLObject lit = NIL;
      lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != sentence_matches_suppressed_literalP( el_asent, lit ) )
        {
          if( NIL != $proof_view_debugP$.getDynamicValue( thread ) )
          {
            Errors.warn( $str449$Suppressing__S___because_it_match, asent, lit );
          }
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 102635L)
  public static SubLObject sentence_matches_suppressed_literalP_internal(final SubLObject sentence, final SubLObject lit)
  {
    if( NIL != forts.fort_p( lit.first() ) && NIL != fort_types_interface.predicate_p( lit.first() ) )
    {
      ConsesLow.rplaca( lit, ConsesLow.list( $kw451$TEST, $sym452$GENL_PREDICATE_, lit.first() ) );
    }
    if( NIL != formula_pattern_match.formula_matches_pattern( sentence, lit ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 102635L)
  public static SubLObject sentence_matches_suppressed_literalP(final SubLObject sentence, final SubLObject lit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sentence_matches_suppressed_literalP_internal( sentence, lit );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sentence, lit );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lit.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sentence_matches_suppressed_literalP_internal( sentence, lit ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, lit ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 102980L)
  public static SubLObject anything_token(SubLObject ignore)
  {
    if( ignore == UNPROVIDED )
    {
      ignore = NIL;
    }
    return $kw440$ANYTHING;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 103068L)
  public static SubLObject proof_view_external_support_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != arguments.support_p( v_object ) && NIL != subl_promotions.memberP( arguments.support_module( v_object ), $list453, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 103225L)
  public static SubLObject proof_view_get_document_for_hypothesis_internal(final SubLObject hypothesis, final SubLObject mt)
  {
    SubLObject cdolist_list_var = pph_utilities.pph_ask_variable_new( $sym324$_DOCUMENT, ConsesLow.listS( $const457$sourceOfTerm, hypothesis, $list458 ), mt, UNPROVIDED );
    SubLObject source = NIL;
    source = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pph_utilities.pph_removal_ask_boolean( ConsesLow.listS( $const455$isa, source, $list456 ), mt ) )
      {
        return source;
      }
      cdolist_list_var = cdolist_list_var.rest();
      source = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 103225L)
  public static SubLObject proof_view_get_document_for_hypothesis(final SubLObject hypothesis, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return proof_view_get_document_for_hypothesis_internal( hypothesis, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym454$PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym454$PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym454$PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( hypothesis, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( hypothesis.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( proof_view_get_document_for_hypothesis_internal( hypothesis, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( hypothesis, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 103523L)
  public static SubLObject inference_proofE(final SubLObject proof1, final SubLObject proof2)
  {
    final SubLObject supports1 = inference_datastructures_proof.proof_direct_supports( proof1 );
    final SubLObject supports2 = inference_datastructures_proof.proof_direct_supports( proof2 );
    return makeBoolean( NIL != list_utilities.same_length_p( supports1, supports2 ) && NIL != list_utilities.proper_list_p( supports1 ) && NIL == conses_high.set_difference( supports1, supports2, Symbols.symbol_function(
        EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 104069L)
  public static SubLObject inference_proof_get_depth(final SubLObject proof)
  {
    return inference_proof_get_depth_memoized( proof );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 104195L)
  public static SubLObject inference_proof_get_depth_memoized_internal(final SubLObject proof)
  {
    if( NIL == inference_datastructures_proof.proof_direct_subproofs( proof ) )
    {
      return ONE_INTEGER;
    }
    return number_utilities.f_1X( number_utilities.maximum( Mapping.mapcar( $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED, inference_datastructures_proof.proof_direct_subproofs( proof ) ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 104195L)
  public static SubLObject inference_proof_get_depth_memoized(final SubLObject proof)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_proof_get_depth_memoized_internal( proof );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, proof, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_proof_get_depth_memoized_internal( proof ) ) );
      memoization_state.caching_state_put( caching_state, proof, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 104541L)
  public static SubLObject proof_el_formula(final SubLObject proof, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_proof_mt( proof );
    }
    final SubLObject query_dnfs = inference_worker.proof_proven_query( proof );
    final SubLObject query_el_formula = inference_czer.contextualized_dnf_clauses_formula( query_dnfs, mt );
    return query_el_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 104844L)
  public static SubLObject pph_proof_mt(final SubLObject proof)
  {
    final SubLObject dnf = inference_datastructures_proof.proof_supported_problem_query( proof );
    final SubLObject clause = dnf.first();
    final SubLObject pos_lit = clauses.pos_lits( clause ).first();
    return pos_lit.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 111049L)
  public static SubLObject terse_justification_for_inference_ids(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject mt)
  {
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id );
    if( NIL != inference )
    {
      return terse_justification_for_inference( inference, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 111341L)
  public static SubLObject terse_justification_for_inference(final SubLObject inference, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject return_value = NIL;
      final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw66$SKIP ) )
      {
        final SubLObject idx_$66 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$66, $kw66$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$66 );
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
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            this_answer = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( this_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw66$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( this_answer ) )
              {
                this_answer = $kw66$SKIP;
              }
              entry_for_answer = NIL;
              inference_entities = entities_in_bindings( inference_datastructures_inference.inference_answer_bindings( this_answer ), UNPROVIDED );
              cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( this_answer );
              this_justification = NIL;
              this_justification = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                lst_of_answers = NIL;
                result = NIL;
                cdolist_list_var_$67 = inference_datastructures_inference.inference_answer_justification_proofs( this_justification );
                this_proof = NIL;
                this_proof = cdolist_list_var_$67.first();
                while ( NIL != cdolist_list_var_$67)
                {
                  cdolist_list_var_$68 = inference_datastructures_proof.all_proof_subproofs( this_proof );
                  subproof = NIL;
                  subproof = cdolist_list_var_$68.first();
                  while ( NIL != cdolist_list_var_$68)
                  {
                    if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( subproof ) )
                    {
                      conclusion = proof_view_residual.pph_residual_transformation_proof_conclusion( subproof, mt );
                      result_entry = find_result_entry_for_gaf( conclusion, lst_of_answers, NIL, inference_datastructures_proof.proof_suid( subproof ) );
                      if( NIL != result_entry )
                      {
                        lst_of_answers = ConsesLow.cons( conclusion, lst_of_answers );
                        result = ConsesLow.cons( result_entry, result );
                      }
                    }
                    cdolist_list_var_$69 = inference_datastructures_proof.all_proof_supports( subproof );
                    support = NIL;
                    support = cdolist_list_var_$69.first();
                    while ( NIL != cdolist_list_var_$69)
                    {
                      if( NIL != assertion_handles.assertion_p( support ) )
                      {
                        gaf = assertions_high.gaf_formula( support );
                        result_entry2 = find_result_entry_for_gaf( gaf, lst_of_answers, support, inference_datastructures_proof.proof_suid( subproof ) );
                        if( NIL != result_entry2 )
                        {
                          lst_of_answers = ConsesLow.cons( gaf, lst_of_answers );
                          result = ConsesLow.cons( result_entry2, result );
                        }
                        cdolist_list_var_$70 = arguments.support_justification( support );
                        support_just = NIL;
                        support_just = cdolist_list_var_$70.first();
                        while ( NIL != cdolist_list_var_$70)
                        {
                          if( NIL != assertion_handles.assertion_p( support_just ) )
                          {
                            cdolist_list_var_$71 = assertions_high.assertion_arguments( support_just );
                            argument = NIL;
                            argument = cdolist_list_var_$71.first();
                            while ( NIL != cdolist_list_var_$71)
                            {
                              if( NIL != deduction_handles.deduction_p( argument ) )
                              {
                                cdolist_list_var_$72 = deductions_high.deduction_supports( argument );
                                deduction_support = NIL;
                                deduction_support = cdolist_list_var_$72.first();
                                while ( NIL != cdolist_list_var_$72)
                                {
                                  if( NIL != assertion_handles.assertion_p( deduction_support ) )
                                  {
                                    deduction_gaf = assertions_high.assertion_formula( deduction_support );
                                    result_entry3 = find_result_entry_for_gaf( deduction_gaf, lst_of_answers, deduction_support, inference_datastructures_proof.proof_suid( subproof ) );
                                    if( NIL != result_entry3 )
                                    {
                                      lst_of_answers = ConsesLow.cons( deduction_gaf, lst_of_answers );
                                      result = ConsesLow.cons( result_entry3, result );
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
                entry_for_answer = ConsesLow.cons( order_justifications_in_result_entry( Sequences.reverse( result ), inference_entities ), entry_for_answer );
                cdolist_list_var = cdolist_list_var.rest();
                this_justification = cdolist_list_var.first();
              }
              PrintLow.format( T, $str460$_____Answer____ );
              print_high.print( entry_for_answer, UNPROVIDED );
              return_value = ConsesLow.cons( entry_for_answer, return_value );
            }
          }
        }
        final SubLObject idx_$67 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$67 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$67 );
          SubLObject id2 = NIL;
          SubLObject this_answer2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              this_answer2 = Hashtables.getEntryValue( cdohash_entry );
              SubLObject entry_for_answer2 = NIL;
              final SubLObject inference_entities2 = entities_in_bindings( inference_datastructures_inference.inference_answer_bindings( this_answer2 ), UNPROVIDED );
              SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( this_answer2 );
              SubLObject this_justification2 = NIL;
              this_justification2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                SubLObject lst_of_answers2 = NIL;
                SubLObject result2 = NIL;
                SubLObject cdolist_list_var_$73 = inference_datastructures_inference.inference_answer_justification_proofs( this_justification2 );
                SubLObject this_proof2 = NIL;
                this_proof2 = cdolist_list_var_$73.first();
                while ( NIL != cdolist_list_var_$73)
                {
                  SubLObject cdolist_list_var_$74 = inference_datastructures_proof.all_proof_subproofs( this_proof2 );
                  SubLObject subproof2 = NIL;
                  subproof2 = cdolist_list_var_$74.first();
                  while ( NIL != cdolist_list_var_$74)
                  {
                    if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( subproof2 ) )
                    {
                      final SubLObject conclusion2 = proof_view_residual.pph_residual_transformation_proof_conclusion( subproof2, mt );
                      final SubLObject result_entry4 = find_result_entry_for_gaf( conclusion2, lst_of_answers2, NIL, inference_datastructures_proof.proof_suid( subproof2 ) );
                      if( NIL != result_entry4 )
                      {
                        lst_of_answers2 = ConsesLow.cons( conclusion2, lst_of_answers2 );
                        result2 = ConsesLow.cons( result_entry4, result2 );
                      }
                    }
                    SubLObject cdolist_list_var_$75 = inference_datastructures_proof.all_proof_supports( subproof2 );
                    SubLObject support2 = NIL;
                    support2 = cdolist_list_var_$75.first();
                    while ( NIL != cdolist_list_var_$75)
                    {
                      if( NIL != assertion_handles.assertion_p( support2 ) )
                      {
                        final SubLObject gaf2 = assertions_high.gaf_formula( support2 );
                        final SubLObject result_entry5 = find_result_entry_for_gaf( gaf2, lst_of_answers2, support2, inference_datastructures_proof.proof_suid( subproof2 ) );
                        if( NIL != result_entry5 )
                        {
                          lst_of_answers2 = ConsesLow.cons( gaf2, lst_of_answers2 );
                          result2 = ConsesLow.cons( result_entry5, result2 );
                        }
                        SubLObject cdolist_list_var_$76 = arguments.support_justification( support2 );
                        SubLObject support_just2 = NIL;
                        support_just2 = cdolist_list_var_$76.first();
                        while ( NIL != cdolist_list_var_$76)
                        {
                          if( NIL != assertion_handles.assertion_p( support_just2 ) )
                          {
                            SubLObject cdolist_list_var_$77 = assertions_high.assertion_arguments( support_just2 );
                            SubLObject argument2 = NIL;
                            argument2 = cdolist_list_var_$77.first();
                            while ( NIL != cdolist_list_var_$77)
                            {
                              if( NIL != deduction_handles.deduction_p( argument2 ) )
                              {
                                SubLObject cdolist_list_var_$78 = deductions_high.deduction_supports( argument2 );
                                SubLObject deduction_support2 = NIL;
                                deduction_support2 = cdolist_list_var_$78.first();
                                while ( NIL != cdolist_list_var_$78)
                                {
                                  if( NIL != assertion_handles.assertion_p( deduction_support2 ) )
                                  {
                                    final SubLObject deduction_gaf2 = assertions_high.assertion_formula( deduction_support2 );
                                    final SubLObject result_entry6 = find_result_entry_for_gaf( deduction_gaf2, lst_of_answers2, deduction_support2, inference_datastructures_proof.proof_suid( subproof2 ) );
                                    if( NIL != result_entry6 )
                                    {
                                      lst_of_answers2 = ConsesLow.cons( deduction_gaf2, lst_of_answers2 );
                                      result2 = ConsesLow.cons( result_entry6, result2 );
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
                entry_for_answer2 = ConsesLow.cons( order_justifications_in_result_entry( Sequences.reverse( result2 ), inference_entities2 ), entry_for_answer2 );
                cdolist_list_var2 = cdolist_list_var2.rest();
                this_justification2 = cdolist_list_var2.first();
              }
              PrintLow.format( T, $str460$_____Answer____ );
              print_high.print( entry_for_answer2, UNPROVIDED );
              return_value = ConsesLow.cons( entry_for_answer2, return_value );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
      return return_value;
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 113512L)
  public static SubLObject entities_in_bindings(final SubLObject v_bindings, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const313$InferencePSC;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject entity = bindings.variable_binding_value( x );
      if( NIL != isa.isaP( entity, $const461$SomethingExisting, mt, UNPROVIDED ) )
      {
        result = ConsesLow.cons( entity, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 113785L)
  public static SubLObject order_justifications_in_result_entry(final SubLObject entry, final SubLObject inference_entities)
  {
    final SubLObject list_of_proof_suids = Mapping.mapcar( Symbols.symbol_function( $sym462$FORMULA_ARG3 ), entry );
    SubLObject list_of_proof_suids_with_entities_in_bindings = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = list_of_proof_suids;
    SubLObject proof_suid = NIL;
    proof_suid = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != entry_with_proof_suid_has_entities_in_bindingsP( proof_suid, entry, inference_entities ) )
      {
        list_of_proof_suids_with_entities_in_bindings = ConsesLow.cons( proof_suid, list_of_proof_suids_with_entities_in_bindings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      proof_suid = cdolist_list_var.first();
    }
    cdolist_list_var = entry;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.member( cycl_utilities.formula_arg3( x, UNPROVIDED ), list_of_proof_suids_with_entities_in_bindings, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg0( x ), cycl_utilities.formula_arg1( x, UNPROVIDED ) ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    cdolist_list_var = entry;
    x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == conses_high.member( cycl_utilities.formula_arg3( x, UNPROVIDED ), list_of_proof_suids_with_entities_in_bindings, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg0( x ), cycl_utilities.formula_arg1( x, UNPROVIDED ) ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return Sequences.reverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 114587L)
  public static SubLObject entry_with_proof_suid_has_entities_in_bindingsP(final SubLObject proof_suid, final SubLObject entry, final SubLObject inference_entities)
  {
    SubLObject cdolist_list_var = entry;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( proof_suid.numE( cycl_utilities.formula_arg3( x, UNPROVIDED ) ) )
      {
        final SubLObject gaf = cycl_utilities.formula_arg2( x, UNPROVIDED );
        if( NIL != conses_high.intersection( inference_entities, gaf, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          return T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 114873L)
  public static SubLObject find_result_entry_for_gaf(final SubLObject gaf, final SubLObject lst_of_answers, final SubLObject assertion, final SubLObject proof_suid)
  {
    if( NIL == conses_high.member( gaf, lst_of_answers, Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL != assertion && NIL != kb_mapping_utilities.pred_value_gafs( assertion,
        $const463$assertionRequiredForJustification, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject source = get_source_for_assertion( assertion );
      if( NIL != source )
      {
        return ConsesLow.list( pph_main.generate_phrase( assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), pph_main.generate_phrase( source, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), gaf, proof_suid );
      }
      return ConsesLow.list( pph_main.generate_phrase( assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), NIL, gaf, proof_suid );
    }
    else
    {
      if( NIL == conses_high.member( gaf, lst_of_answers, Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL != is_relevant_gaf_for_justificationP( gaf ) )
      {
        if( NIL != assertion )
        {
          final SubLObject source = get_source_for_assertion( assertion );
          if( NIL != source )
          {
            return ConsesLow.list( pph_main.generate_phrase( gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), pph_main.generate_phrase( source, UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), gaf, proof_suid );
          }
        }
        return ConsesLow.list( pph_main.generate_phrase( gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), NIL, gaf, proof_suid );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 115706L)
  public static SubLObject is_relevant_gaf_for_justificationP(final SubLObject gaf)
  {
    return pph_proof.pph_justification_pred_highly_relevantP( cycl_utilities.formula_arg0( gaf ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view.lisp", position = 115835L)
  public static SubLObject get_source_for_assertion(final SubLObject assertion)
  {
    final SubLObject source_assertion = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_relevant_mts( assertion, $const457$sourceOfTerm, $const464$BookkeepingMt, UNPROVIDED, UNPROVIDED ) );
    if( NIL != source_assertion )
    {
      final SubLObject gaf = assertions_high.gaf_formula( source_assertion );
      return cycl_utilities.formula_arg2( gaf, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject declare_proof_view_file()
  {
    SubLFiles.declareFunction( me, "proof_view_default_color", "PROOF-VIEW-DEFAULT-COLOR", 0, 0, false );
    SubLFiles.declareFunction( me, "proof_view_params", "PROOF-VIEW-PARAMS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_print_function_trampoline", "PROOF-VIEW-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_p", "PROOF-VIEW-P", 1, 0, false );
    new $proof_view_p$UnaryFunction();
    SubLFiles.declareFunction( me, "proof_view_int_id", "PROOF-VIEW-INT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_int_proof", "PROOF-VIEW-INT-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_int_answer", "PROOF-VIEW-INT-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_int_id_index", "PROOF-VIEW-INT-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_int_properties", "PROOF-VIEW-INT-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_int_id", "_CSETF-PROOF-VIEW-INT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_int_proof", "_CSETF-PROOF-VIEW-INT-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_int_answer", "_CSETF-PROOF-VIEW-INT-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_int_id_index", "_CSETF-PROOF-VIEW-INT-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_int_properties", "_CSETF-PROOF-VIEW-INT-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_proof_view", "MAKE-PROOF-VIEW", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_proof_view", "VISIT-DEFSTRUCT-PROOF-VIEW", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_proof_view_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_proof_view_p", "VALID-PROOF-VIEW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_int_print", "PROOF-VIEW-INT-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_id_index", "PROOF-VIEW-ID-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "get_next_proof_view_id", "GET-NEXT-PROOF-VIEW-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "find_proof_view_by_id", "FIND-PROOF-VIEW-BY-ID", 1, 0, false );
    SubLFiles.declareMacro( me, "proof_view_do_entries", "PROOF-VIEW-DO-ENTRIES" );
    SubLFiles.declareMacro( me, "proof_view_entry_do_children", "PROOF-VIEW-ENTRY-DO-CHILDREN" );
    SubLFiles.declareFunction( me, "most_recent_proof_view", "MOST-RECENT-PROOF-VIEW", 0, 0, false );
    SubLFiles.declareMacro( me, "do_all_proof_views", "DO-ALL-PROOF-VIEWS" );
    SubLFiles.declareFunction( me, "new_proof_view", "NEW-PROOF-VIEW", 0, 2, false );
    SubLFiles.declareFunction( me, "destroy_proof_view", "DESTROY-PROOF-VIEW", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_all_proof_views", "DESTROY-ALL-PROOF-VIEWS", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_proof_view_int", "DESTROY-PROOF-VIEW-INT", 1, 0, false );
    SubLFiles.declareMacro( me, "maybe_with_proof_view_memoization", "MAYBE-WITH-PROOF-VIEW-MEMOIZATION" );
    SubLFiles.declareFunction( me, "find_proof_view_memoization_state", "FIND-PROOF-VIEW-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_find_or_create_cached_memoization_state", "PROOF-VIEW-FIND-OR-CREATE-CACHED-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_cached_memoization_state", "PROOF-VIEW-GET-CACHED-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_cached_memoization_state", "PROOF-VIEW-SET-CACHED-MEMOIZATION-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_proof_view_memoization_state_by_id", "CLEAR-PROOF-VIEW-MEMOIZATION-STATE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_proof_view_memoization_state", "CLEAR-PROOF-VIEW-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_allow_external_linksP", "SET-PROOF-VIEW-ALLOW-EXTERNAL-LINKS?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_language_mt", "SET-PROOF-VIEW-LANGUAGE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_domain_mt", "SET-PROOF-VIEW-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_proof_view_domain_mt", "GET-PROOF-VIEW-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_proof_view_language_mt", "GET-PROOF-VIEW-LANGUAGE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_proof_view_include_linear", "GET-PROOF-VIEW-INCLUDE-LINEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_include_linear", "SET-PROOF-VIEW-INCLUDE-LINEAR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_proof_view_include_details", "GET-PROOF-VIEW-INCLUDE-DETAILS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_include_details", "SET-PROOF-VIEW-INCLUDE-DETAILS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_proof_view_suppress_assertion_bookkeeping", "GET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_suppress_assertion_bookkeeping", "SET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_proof_view_suppress_assertion_cyclists", "GET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_suppress_assertion_cyclists", "SET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_addressee", "SET-PROOF-VIEW-ADDRESSEE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_proof_view_include_cycml", "SET-PROOF-VIEW-INCLUDE-CYCML", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_id", "PROOF-VIEW-GET-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_id_index", "PROOF-VIEW-GET-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_proof", "PROOF-VIEW-GET-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_answer", "PROOF-VIEW-GET-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_entries", "PROOF-VIEW-GET-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_facts_used", "PROOF-VIEW-GET-FACTS-USED", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_used_supports", "PROOF-VIEW-GET-USED-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_source_index", "PROOF-VIEW-GET-SOURCE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_source_id", "PROOF-VIEW-GET-SOURCE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_source_isg", "PROOF-VIEW-GET-SOURCE-ISG", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_filtered_items", "PROOF-VIEW-GET-FILTERED-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_note_filtered_item", "PROOF-VIEW-NOTE-FILTERED-ITEM", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_set_parameters_from_specification", "PROOF-VIEW-SET-PARAMETERS-FROM-SPECIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_parameter_from_specification", "PROOF-VIEW-SET-PARAMETER-FROM-SPECIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_property_value_from_cycl", "PROOF-VIEW-PROPERTY-VALUE-FROM-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_addressee", "PROOF-VIEW-GET-ADDRESSEE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_addressee", "PROOF-VIEW-SET-ADDRESSEE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_include_rules_sectionP", "PROOF-VIEW-GET-INCLUDE-RULES-SECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_include_rules_sectionP", "PROOF-VIEW-SET-INCLUDE-RULES-SECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_include_justification_sectionP", "PROOF-VIEW-GET-INCLUDE-JUSTIFICATION-SECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_include_justification_sectionP", "PROOF-VIEW-SET-INCLUDE-JUSTIFICATION-SECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_enable_debugP", "PROOF-VIEW-GET-ENABLE-DEBUG?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_enable_debugP", "PROOF-VIEW-SET-ENABLE-DEBUG?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_show_cb_bug_report_linksP", "PROOF-VIEW-SET-SHOW-CB-BUG-REPORT-LINKS?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_show_cb_bug_report_linksP", "PROOF-VIEW-GET-SHOW-CB-BUG-REPORT-LINKS?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_include_cycl_in_outputP", "PROOF-VIEW-GET-INCLUDE-CYCL-IN-OUTPUT?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_include_cycl_in_outputP", "PROOF-VIEW-SET-INCLUDE-CYCL-IN-OUTPUT?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_include_sourcesP", "PROOF-VIEW-GET-INCLUDE-SOURCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_link_phrasesP", "PROOF-VIEW-SET-LINK-PHRASES?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_link_phrasesP", "PROOF-VIEW-GET-LINK-PHRASES?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_include_sources_spec_p", "PROOF-VIEW-INCLUDE-SOURCES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_include_sourcesP", "PROOF-VIEW-SET-INCLUDE-SOURCES?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_include_sourcesP", "PROOF-VIEW-ENTRY-GET-INCLUDE-SOURCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_include_cycml_in_xmlP", "PROOF-VIEW-GET-INCLUDE-CYCML-IN-XML?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_include_cycml_in_xmlP", "PROOF-VIEW-SET-INCLUDE-CYCML-IN-XML?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_include_silkP", "PROOF-VIEW-GET-INCLUDE-SILK?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_include_silkP", "PROOF-VIEW-SET-INCLUDE-SILK?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_suppress_assertion_bookkeepingP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-BOOKKEEPING?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_suppress_assertion_bookkeepingP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-BOOKKEEPING?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_suppress_assertion_cyclistsP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-CYCLISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_suppress_assertion_cyclistsP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-CYCLISTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_suppress_assertion_cyclist_employersP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_suppress_assertion_cyclist_employersP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_suppress_assertion_datesP", "PROOF-VIEW-GET-SUPPRESS-ASSERTION-DATES?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_suppress_assertion_datesP", "PROOF-VIEW-SET-SUPPRESS-ASSERTION-DATES?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_allow_external_linksP", "PROOF-VIEW-GET-ALLOW-EXTERNAL-LINKS?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_allow_external_linksP", "PROOF-VIEW-SET-ALLOW-EXTERNAL-LINKS?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_allow_internal_linksP", "PROOF-VIEW-GET-ALLOW-INTERNAL-LINKS?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_allow_internal_linksP", "PROOF-VIEW-SET-ALLOW-INTERNAL-LINKS?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_language_mt", "PROOF-VIEW-GET-LANGUAGE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_language_mt", "PROOF-VIEW-SET-LANGUAGE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_domain_mt", "PROOF-VIEW-GET-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_domain_mt", "PROOF-VIEW-SET-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_creation_universal_time", "PROOF-VIEW-GET-CREATION-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_creation_universal_time", "PROOF-VIEW-SET-CREATION-UNIVERSAL-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_get_populated_universal_time", "PROOF-VIEW-GET-POPULATED-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_displayed_universal_time", "PROOF-VIEW-GET-DISPLAYED-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_displayed_universal_time", "PROOF-VIEW-SET-DISPLAYED-UNIVERSAL-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_set_preparer_thread", "PROOF-VIEW-SET-PREPARER-THREAD", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_get_preparer_thread", "PROOF-VIEW-GET-PREPARER-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_error_output", "PROOF-VIEW-GET-ERROR-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_has_propertyP", "PROOF-VIEW-HAS-PROPERTY?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_property", "PROOF-VIEW-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_property", "PROOF-VIEW-GET-PROPERTY", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_print_function_trampoline", "PROOF-VIEW-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_p", "PROOF-VIEW-ENTRY-P", 1, 0, false );
    new $proof_view_entry_p$UnaryFunction();
    SubLFiles.declareFunction( me, "proof_view_entry_int_id", "PROOF-VIEW-ENTRY-INT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_parent_id", "PROOF-VIEW-ENTRY-INT-PARENT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_label", "PROOF-VIEW-ENTRY-INT-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_object_type", "PROOF-VIEW-ENTRY-INT-OBJECT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_object", "PROOF-VIEW-ENTRY-INT-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_proof_view", "PROOF-VIEW-ENTRY-INT-PROOF-VIEW", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_properties", "PROOF-VIEW-ENTRY-INT-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_id", "_CSETF-PROOF-VIEW-ENTRY-INT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_parent_id", "_CSETF-PROOF-VIEW-ENTRY-INT-PARENT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_label", "_CSETF-PROOF-VIEW-ENTRY-INT-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_object_type", "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_object", "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_proof_view", "_CSETF-PROOF-VIEW-ENTRY-INT-PROOF-VIEW", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_proof_view_entry_int_properties", "_CSETF-PROOF-VIEW-ENTRY-INT-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_proof_view_entry", "MAKE-PROOF-VIEW-ENTRY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_proof_view_entry", "VISIT-DEFSTRUCT-PROOF-VIEW-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_proof_view_entry_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_proof_view_entry_p", "VALID-PROOF-VIEW-ENTRY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_int_print", "PROOF-VIEW-ENTRY-INT-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "destroy_proof_view_entry", "DESTROY-PROOF-VIEW-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_proof_view_entry_int", "DESTROY-PROOF-VIEW-ENTRY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_root_entry", "PROOF-VIEW-GET-ROOT-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_count_entries_with_values", "PROOF-VIEW-COUNT-ENTRIES-WITH-VALUES", 6, 0, false );
    SubLFiles.declareFunction( me, "proof_view_has_entry_for_objectP", "PROOF-VIEW-HAS-ENTRY-FOR-OBJECT?", 3, 0, false );
    SubLFiles.declareFunction( me, "find_proof_view_entry_by_id", "FIND-PROOF-VIEW-ENTRY-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_proof_view_entry_by_ids", "FIND-PROOF-VIEW-ENTRY-BY-IDS", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_id", "PROOF-VIEW-ENTRY-GET-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_parent_id", "PROOF-VIEW-ENTRY-GET-PARENT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_path_string", "PROOF-VIEW-ENTRY-GET-PATH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_set_parent_id", "PROOF-VIEW-ENTRY-SET-PARENT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_set_label", "PROOF-VIEW-ENTRY-SET-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_proof_view", "PROOF-VIEW-ENTRY-GET-PROOF-VIEW", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_ancestorP", "PROOF-VIEW-ENTRY-HAS-ANCESTOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_label", "PROOF-VIEW-ENTRY-GET-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_object_type", "PROOF-VIEW-ENTRY-GET-OBJECT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_set_object_type", "PROOF-VIEW-ENTRY-SET-OBJECT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_object", "PROOF-VIEW-ENTRY-GET-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_property", "PROOF-VIEW-ENTRY-GET-PROPERTY", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_set_property", "PROOF-VIEW-ENTRY-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_rem_property", "PROOF-VIEW-ENTRY-REM-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entryL", "PROOF-VIEW-ENTRY<", 2, 0, false );
    SubLFiles.declareMacro( me, "proof_view_warn", "PROOF-VIEW-WARN" );
    SubLFiles.declareMacro( me, "proof_view_info", "PROOF-VIEW-INFO" );
    SubLFiles.declareFunction( me, "proof_view_entry_get_children", "PROOF-VIEW-ENTRY-GET-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_more_generalP", "PROOF-VIEW-ENTRY-MORE-GENERAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_specificity_internal", "PROOF-VIEW-ENTRY-SPECIFICITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_specificity", "PROOF-VIEW-ENTRY-SPECIFICITY", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_count_entries", "PROOF-VIEW-COUNT-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_top_level_p", "PROOF-VIEW-ENTRY-TOP-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_depth_internal", "PROOF-VIEW-ENTRY-GET-DEPTH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_depth", "PROOF-VIEW-ENTRY-GET-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_expand_intiallyP", "PROOF-VIEW-ENTRY-EXPAND-INTIALLY?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_sources", "PROOF-VIEW-ENTRY-GET-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_proof", "PROOF-VIEW-ENTRY-GET-PROOF", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_set_proof", "PROOF-VIEW-ENTRY-SET-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_function", "PROOF-VIEW-ENTRY-GET-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_function_section", "PROOF-VIEW-ENTRY-GET-FUNCTION-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_highlight_phrase_demeritsP", "PROOF-VIEW-SET-HIGHLIGHT-PHRASE-DEMERITS?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_highlight_phrase_demeritsP", "PROOF-VIEW-GET-HIGHLIGHT-PHRASE-DEMERITS?", 1, 0, false );
    SubLFiles.declareFunction( me, "register_proof_view_entry_shower", "REGISTER-PROOF-VIEW-ENTRY-SHOWER", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_showers", "PROOF-VIEW-ENTRY-SHOWERS", 0, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_generate_cycl", "PROOF-VIEW-ENTRY-GENERATE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_html_from_proof_view_entry_ids", "GENERATE-HTML-FROM-PROOF-VIEW-ENTRY-IDS", 2, 3, false );
    SubLFiles.declareFunction( me, "proof_view_entry_html", "PROOF-VIEW-ENTRY-HTML", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_html_internal", "PROOF-VIEW-ENTRY-HTML-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_term_id_if_ok_for_proof_view_fact_sheets", "FACT-SHEET-TERM-ID-IF-OK-FOR-PROOF-VIEW-FACT-SHEETS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_generate_html", "PROOF-VIEW-ENTRY-GENERATE-HTML", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_generate_html_standard", "PROOF-VIEW-ENTRY-GENERATE-HTML-STANDARD", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_generate_html_internal_internal", "PROOF-VIEW-ENTRY-GENERATE-HTML-INTERNAL-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_generate_html_internal", "PROOF-VIEW-ENTRY-GENERATE-HTML-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "proof_view_valid_source_p", "PROOF-VIEW-VALID-SOURCE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "maybe_with_font_color", "MAYBE-WITH-FONT-COLOR" );
    SubLFiles.declareFunction( me, "proof_view_html_for_object", "PROOF-VIEW-HTML-FOR-OBJECT", 5, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_get_paraphrase_demerits", "PROOF-VIEW-ENTRY-GET-PARAPHRASE-DEMERITS", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_set_paraphrase_demerits", "PROOF-VIEW-ENTRY-SET-PARAPHRASE-DEMERITS", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_support_html_internal", "PROOF-VIEW-SUPPORT-HTML-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_support_html", "PROOF-VIEW-SUPPORT-HTML", 1, 0, false );
    SubLFiles.declareFunction( me, "register_proof_view_output_fn_for_object_type", "REGISTER-PROOF-VIEW-OUTPUT-FN-FOR-OBJECT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_output_fn_for_object_type", "PROOF-VIEW-OUTPUT-FN-FOR-OBJECT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_html_for_object_cases", "PROOF-VIEW-HTML-FOR-OBJECT-CASES", 4, 0, false );
    SubLFiles.declareFunction( me, "proof_view_html_for_object_cond", "PROOF-VIEW-HTML-FOR-OBJECT-COND", 4, 0, false );
    SubLFiles.declareFunction( me, "proof_view_find_main_font_color", "PROOF-VIEW-FIND-MAIN-FONT-COLOR", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_abduced_support_p", "PROOF-VIEW-ENTRY-HAS-ABDUCED-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_abduced_support_confirmed_p", "PROOF-VIEW-ENTRY-HAS-ABDUCED-SUPPORT-CONFIRMED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_abduced_support_denied_p", "PROOF-VIEW-ENTRY-HAS-ABDUCED-SUPPORT-DENIED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_abduction_confirmed_p", "PROOF-VIEW-ENTRY-HAS-ABDUCTION-CONFIRMED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_abduction_denied_p", "PROOF-VIEW-ENTRY-HAS-ABDUCTION-DENIED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_output_citation", "PROOF-VIEW-OUTPUT-CITATION", 1, 2, false );
    SubLFiles.declareFunction( me, "proof_view_show_bindings", "PROOF-VIEW-SHOW-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_output_assertion_bookkeeping_info", "PROOF-VIEW-OUTPUT-ASSERTION-BOOKKEEPING-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_assertion_givenP", "PROOF-VIEW-ASSERTION-GIVEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_employer", "GET-EMPLOYER", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_employee_employers_and_mts", "CLEAR-EMPLOYEE-EMPLOYERS-AND-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_employee_employers_and_mts", "REMOVE-EMPLOYEE-EMPLOYERS-AND-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "employee_employers_and_mts_internal", "EMPLOYEE-EMPLOYERS-AND-MTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "employee_employers_and_mts", "EMPLOYEE-EMPLOYERS-AND-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_output_external_sentence", "PROOF-VIEW-OUTPUT-EXTERNAL-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "proof_view_output_entity_mention", "PROOF-VIEW-OUTPUT-ENTITY-MENTION", 5, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_document_locations_for_entity_mention", "PROOF-VIEW-GET-DOCUMENT-LOCATIONS-FOR-ENTITY-MENTION", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_display_color_for_term", "PROOF-VIEW-DISPLAY-COLOR-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_nth_display_color", "PROOF-VIEW-NTH-DISPLAY-COLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_find_terms_in_string", "PROOF-VIEW-FIND-TERMS-IN-STRING", 4, 1, false );
    SubLFiles.declareFunction( me, "proof_view_find_term_in_string", "PROOF-VIEW-FIND-TERM-IN-STRING", 4, 1, false );
    SubLFiles.declareFunction( me, "proof_view_find_term_string_in_string", "PROOF-VIEW-FIND-TERM-STRING-IN-STRING", 3, 1, false );
    SubLFiles.declareFunction( me, "proof_view_remove_leading_commas", "PROOF-VIEW-REMOVE-LEADING-COMMAS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_delete_subsumed_references", "PROOF-VIEW-DELETE-SUBSUMED-REFERENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_reference_subsumes_p", "PROOF-VIEW-REFERENCE-SUBSUMES-P", 2, 0, false );
    SubLFiles.declareFunction( me, "get_abduced_support_sentence_for_proof_view", "GET-ABDUCED-SUPPORT-SENTENCE-FOR-PROOF-VIEW", 2, 1, false );
    SubLFiles.declareFunction( me, "assert_abduction_support_for_proof_view", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW", 3, 1, false );
    SubLFiles.declareFunction( me, "assert_abduction_support_for_proof_view_recursive", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "assert_abduction_support_for_proof_view_int", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_note_abduced_support_confirmed", "PROOF-VIEW-ENTRY-NOTE-ABDUCED-SUPPORT-CONFIRMED", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_note_abduced_support_denied", "PROOF-VIEW-ENTRY-NOTE-ABDUCED-SUPPORT-DENIED", 2, 0, false );
    SubLFiles.declareFunction( me, "get_query_url_for_proof_view", "GET-QUERY-URL-FOR-PROOF-VIEW", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sentence_for_proof_view", "GET-SENTENCE-FOR-PROOF-VIEW", 2, 0, false );
    SubLFiles.declareFunction( me, "construct_proof_views_java_iteratively", "CONSTRUCT-PROOF-VIEWS-JAVA-ITERATIVELY", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_sort_proofs", "PROOF-VIEW-SORT-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_proof_views_java_list", "CONSTRUCT-PROOF-VIEWS-JAVA-LIST", 3, 0, false );
    SubLFiles.declareFunction( me, "construct_xml_proof_view_for_sentence", "CONSTRUCT-XML-PROOF-VIEW-FOR-SENTENCE", 2, 4, false );
    SubLFiles.declareFunction( me, "proof_view_id_populate", "PROOF-VIEW-ID-POPULATE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_xml", "PROOF-VIEW-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_xml", "PROOF-VIEW-ENTRY-XML", 2, 0, false );
    SubLFiles.declareMacro( me, "proof_view_xml_tag", "PROOF-VIEW-XML-TAG" );
    SubLFiles.declareFunction( me, "output_proof_view_in_xml", "OUTPUT-PROOF-VIEW-IN-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "output_proof_view_details_in_xml", "OUTPUT-PROOF-VIEW-DETAILS-IN-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "output_proof_view_sources_in_xml", "OUTPUT-PROOF-VIEW-SOURCES-IN-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "output_proof_view_rules_in_xml", "OUTPUT-PROOF-VIEW-RULES-IN-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "output_proof_view_section_in_xml", "OUTPUT-PROOF-VIEW-SECTION-IN-XML", 3, 0, false );
    SubLFiles.declareFunction( me, "output_proof_view_entry_in_xml", "OUTPUT-PROOF-VIEW-ENTRY-IN-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "output_proof_view_entry_details_in_xml", "OUTPUT-PROOF-VIEW-ENTRY-DETAILS-IN-XML", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_cycl_silk_string", "PROOF-VIEW-CYCL-SILK-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_xml_attributes", "PROOF-VIEW-ENTRY-XML-ATTRIBUTES", 1, 0, false );
    SubLFiles.declareFunction( me, "output_proof_view_entry_content_in_xml", "OUTPUT-PROOF-VIEW-ENTRY-CONTENT-IN-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_construct_java_list", "PROOF-VIEW-CONSTRUCT-JAVA-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_entry_construct_java_list", "PROOF-VIEW-ENTRY-CONSTRUCT-JAVA-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_new_empty_proof_view", "GET-NEW-EMPTY-PROOF-VIEW", 0, 2, false );
    SubLFiles.declareFunction( me, "get_new_empty_proof_view_id", "GET-NEW-EMPTY-PROOF-VIEW-ID", 0, 4, false );
    SubLFiles.declareFunction( me, "proof_view_set_proof", "PROOF-VIEW-SET-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_set_answer", "PROOF-VIEW-SET-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "construct_inference_proof_view", "CONSTRUCT-INFERENCE-PROOF-VIEW", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_closed_query_success_value", "PROOF-VIEW-CLOSED-QUERY-SUCCESS-VALUE", 0, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_used_rules_root", "PROOF-VIEW-GET-USED-RULES-ROOT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_query_root", "PROOF-VIEW-GET-QUERY-ROOT", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_trivially_implies_proof_conclusionP_internal", "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES-PROOF-CONCLUSION?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_fact_trivially_implies_proof_conclusionP", "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES-PROOF-CONCLUSION?", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_tva_support_entryP", "PROOF-VIEW-TVA-SUPPORT-ENTRY?", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_view_entry_has_support_entryP", "PROOF-VIEW-ENTRY-HAS-SUPPORT-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_rule_support_entryP", "PROOF-VIEW-RULE-SUPPORT-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_has_sourcesP", "PROOF-VIEW-HAS-SOURCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_has_justification_sectionP", "PROOF-VIEW-HAS-JUSTIFICATION-SECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_has_sectionP", "PROOF-VIEW-HAS-SECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_trivially_impliesP", "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES?", 2, 1, false );
    SubLFiles.declareFunction( me, "proof_view_fact_impliesP_internal", "PROOF-VIEW-FACT-IMPLIES?-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "proof_view_fact_impliesP", "PROOF-VIEW-FACT-IMPLIES?", 2, 2, false );
    SubLFiles.declareFunction( me, "proof_view_fact_sentence_internal", "PROOF-VIEW-FACT-SENTENCE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_sentence", "PROOF-VIEW-FACT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_hl_sentence_internal", "PROOF-VIEW-FACT-HL-SENTENCE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_hl_sentence", "PROOF-VIEW-FACT-HL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_sentence_with_hl_terms_internal", "PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_fact_sentence_with_hl_terms", "PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_transitive_support_p", "PROOF-VIEW-TRANSITIVE-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_rule_suitable_for_rules_sectionP", "PROOF-VIEW-RULE-SUITABLE-FOR-RULES-SECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "suppress_proof_supportP", "SUPPRESS-PROOF-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "suppress_proof_view_literalP", "SUPPRESS-PROOF-VIEW-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_matches_suppressed_literalP_internal", "SENTENCE-MATCHES-SUPPRESSED-LITERAL?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_matches_suppressed_literalP", "SENTENCE-MATCHES-SUPPRESSED-LITERAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "anything_token", "ANYTHING-TOKEN", 0, 1, false );
    SubLFiles.declareFunction( me, "proof_view_external_support_p", "PROOF-VIEW-EXTERNAL-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_document_for_hypothesis_internal", "PROOF-VIEW-GET-DOCUMENT-FOR-HYPOTHESIS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_document_for_hypothesis", "PROOF-VIEW-GET-DOCUMENT-FOR-HYPOTHESIS", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_proofE", "INFERENCE-PROOF=", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_proof_get_depth", "INFERENCE-PROOF-GET-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_proof_get_depth_memoized_internal", "INFERENCE-PROOF-GET-DEPTH-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_proof_get_depth_memoized", "INFERENCE-PROOF-GET-DEPTH-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_el_formula", "PROOF-EL-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_proof_mt", "PPH-PROOF-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "terse_justification_for_inference_ids", "TERSE-JUSTIFICATION-FOR-INFERENCE-IDS", 3, 0, false );
    SubLFiles.declareFunction( me, "terse_justification_for_inference", "TERSE-JUSTIFICATION-FOR-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "entities_in_bindings", "ENTITIES-IN-BINDINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "order_justifications_in_result_entry", "ORDER-JUSTIFICATIONS-IN-RESULT-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "entry_with_proof_suid_has_entities_in_bindingsP", "ENTRY-WITH-PROOF-SUID-HAS-ENTITIES-IN-BINDINGS?", 3, 0, false );
    SubLFiles.declareFunction( me, "find_result_entry_for_gaf", "FIND-RESULT-ENTRY-FOR-GAF", 4, 0, false );
    SubLFiles.declareFunction( me, "is_relevant_gaf_for_justificationP", "IS-RELEVANT-GAF-FOR-JUSTIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_source_for_assertion", "GET-SOURCE-FOR-ASSERTION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_proof_view_file()
  {
    $proof_view_asserted_label$ = SubLFiles.defparameter( "*PROOF-VIEW-ASSERTED-LABEL*", $str0$ );
    $proof_view_inferred_label$ = SubLFiles.defparameter( "*PROOF-VIEW-INFERRED-LABEL*", $str0$ );
    $proof_view_opaque_label$ = SubLFiles.defparameter( "*PROOF-VIEW-OPAQUE-LABEL*", $str0$ );
    $proof_view_assertion_bookkeeping_label$ = SubLFiles.defparameter( "*PROOF-VIEW-ASSERTION-BOOKKEEPING-LABEL*", $str0$ );
    $proof_view_sources_label$ = SubLFiles.defparameter( "*PROOF-VIEW-SOURCES-LABEL*", $str1$External_Sources_ );
    $proof_view_source_as_mt_label$ = SubLFiles.defparameter( "*PROOF-VIEW-SOURCE-AS-MT-LABEL*", $str2$Source_ );
    $proof_view_justification_label$ = SubLFiles.defparameter( "*PROOF-VIEW-JUSTIFICATION-LABEL*", $str3$Detailed_Justification_ );
    $proof_view_linear_label$ = SubLFiles.defparameter( "*PROOF-VIEW-LINEAR-LABEL*", $str4$Linear_Justification_ );
    $proof_view_facts_used_label$ = SubLFiles.defparameter( "*PROOF-VIEW-FACTS-USED-LABEL*", $str5$Because_ );
    $proof_view_tab_entry_labels$ = SubLFiles.defparameter( "*PROOF-VIEW-TAB-ENTRY-LABELS*", ConsesLow.list( $proof_view_linear_label$.getDynamicValue(), $proof_view_justification_label$.getDynamicValue(),
        $proof_view_facts_used_label$.getDynamicValue() ) );
    $proof_view_rules_used_label$ = SubLFiles.defparameter( "*PROOF-VIEW-RULES-USED-LABEL*", $str6$Key_Rules_ );
    $proof_view_circular_support_label$ = SubLFiles.deflexical( "*PROOF-VIEW-CIRCULAR-SUPPORT-LABEL*", $str7$Justified_above_ );
    $proof_view_validate_supportsP$ = SubLFiles.defparameter( "*PROOF-VIEW-VALIDATE-SUPPORTS?*", NIL );
    $proof_view_font_colors$ = SubLFiles.deflexical( "*PROOF-VIEW-FONT-COLORS*", ConsesLow.list( html_macros.$html_color_cyc_logo_violet$.getGlobalValue(), html_macros.$html_color_dark_green$.getGlobalValue(),
        html_macros.$html_color_dark_blue$.getGlobalValue(), html_macros.$html_color_darker_purple$.getGlobalValue(), html_macros.$html_color_dark_yellow$.getGlobalValue(), html_macros.$html_color_dark_red$
            .getGlobalValue() ) );
    $proof_view_abduction_support_color$ = SubLFiles.deflexical( "*PROOF-VIEW-ABDUCTION-SUPPORT-COLOR*", html_macros.$html_color_sat_blue$.getGlobalValue() );
    $proof_view_abduction_support_confirmed_color$ = SubLFiles.deflexical( "*PROOF-VIEW-ABDUCTION-SUPPORT-CONFIRMED-COLOR*", html_macros.$html_color_black$.getGlobalValue() );
    $proof_view_abduction_support_denied_color$ = SubLFiles.deflexical( "*PROOF-VIEW-ABDUCTION-SUPPORT-DENIED-COLOR*", html_macros.$html_color_sat_red$.getGlobalValue() );
    $proof_view_external_sentence_padding$ = SubLFiles.defparameter( "*PROOF-VIEW-EXTERNAL-SENTENCE-PADDING*", $int8$200 );
    $proof_view_entity_mention_padding$ = SubLFiles.defparameter( "*PROOF-VIEW-ENTITY-MENTION-PADDING*", $int9$150 );
    $proof_view_citation_format$ = SubLFiles.defparameter( "*PROOF-VIEW-CITATION-FORMAT*", $kw10$SUPERSCRIPTS );
    $dtp_proof_view$ = SubLFiles.defconstant( "*DTP-PROOF-VIEW*", $sym15$PROOF_VIEW );
    $proof_view_id_index$ = SubLFiles.deflexical( "*PROOF-VIEW-ID-INDEX*", maybeDefault( $sym46$_PROOF_VIEW_ID_INDEX_, $proof_view_id_index$, () -> ( id_index.new_id_index( UNPROVIDED, UNPROVIDED ) ) ) );
    $proof_view_root_entry_id$ = SubLFiles.defconstant( "*PROOF-VIEW-ROOT-ENTRY-ID*", ZERO_INTEGER );
    $break_on_proof_view_filteringP$ = SubLFiles.defparameter( "*BREAK-ON-PROOF-VIEW-FILTERING?*", NIL );
    $dtp_proof_view_entry$ = SubLFiles.defconstant( "*DTP-PROOF-VIEW-ENTRY*", $sym165$PROOF_VIEW_ENTRY );
    $proof_view_debugP$ = SubLFiles.defvar( "*PROOF-VIEW-DEBUG?*", NIL );
    $proof_view_entry_showers$ = SubLFiles.deflexical( "*PROOF-VIEW-ENTRY-SHOWERS*", NIL );
    $proof_view_object_type_output_fns$ = SubLFiles.deflexical( "*PROOF-VIEW-OBJECT-TYPE-OUTPUT-FNS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $changed_proof_view_entry_ids$ = SubLFiles.defparameter( "*CHANGED-PROOF-VIEW-ENTRY-IDS*", NIL );
    $use_get_employer_cacheP$ = SubLFiles.defparameter( "*USE-GET-EMPLOYER-CACHE?*", T );
    $employee_employers_and_mts_caching_state$ = SubLFiles.deflexical( "*EMPLOYEE-EMPLOYERS-AND-MTS-CACHING-STATE*", NIL );
    $proof_view_allow_trivial_partial_proof_conclusion_supportsP$ = SubLFiles.defparameter( "*PROOF-VIEW-ALLOW-TRIVIAL-PARTIAL-PROOF-CONCLUSION-SUPPORTS?*", NIL );
    $proof_view_literals_to_suppress$ = SubLFiles.defparameter( "*PROOF-VIEW-LITERALS-TO-SUPPRESS*", misc_utilities.uninitialized() );
    return NIL;
  }

  public static SubLObject setup_proof_view_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_proof_view$.getGlobalValue(), Symbols.symbol_function( $sym22$PROOF_VIEW_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list23 );
    Structures.def_csetf( $sym24$PROOF_VIEW_INT_ID, $sym25$_CSETF_PROOF_VIEW_INT_ID );
    Structures.def_csetf( $sym26$PROOF_VIEW_INT_PROOF, $sym27$_CSETF_PROOF_VIEW_INT_PROOF );
    Structures.def_csetf( $sym28$PROOF_VIEW_INT_ANSWER, $sym29$_CSETF_PROOF_VIEW_INT_ANSWER );
    Structures.def_csetf( $sym30$PROOF_VIEW_INT_ID_INDEX, $sym31$_CSETF_PROOF_VIEW_INT_ID_INDEX );
    Structures.def_csetf( $sym32$PROOF_VIEW_INT_PROPERTIES, $sym33$_CSETF_PROOF_VIEW_INT_PROPERTIES );
    Equality.identity( $sym15$PROOF_VIEW );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof_view$.getGlobalValue(), Symbols.symbol_function( $sym42$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym46$_PROOF_VIEW_ID_INDEX_ );
    access_macros.register_macro_helper( $sym71$FIND_PROOF_VIEW_MEMOIZATION_STATE, $sym73$MAYBE_WITH_PROOF_VIEW_MEMOIZATION );
    access_macros.register_external_symbol( $sym75$CLEAR_PROOF_VIEW_MEMOIZATION_STATE_BY_ID );
    access_macros.register_external_symbol( $sym76$SET_PROOF_VIEW_ALLOW_EXTERNAL_LINKS_ );
    access_macros.register_external_symbol( $sym77$SET_PROOF_VIEW_LANGUAGE_MT );
    access_macros.register_external_symbol( $sym78$SET_PROOF_VIEW_DOMAIN_MT );
    access_macros.register_external_symbol( $sym79$GET_PROOF_VIEW_DOMAIN_MT );
    access_macros.register_external_symbol( $sym80$GET_PROOF_VIEW_LANGUAGE_MT );
    access_macros.register_external_symbol( $sym81$GET_PROOF_VIEW_INCLUDE_LINEAR );
    access_macros.register_external_symbol( $sym82$SET_PROOF_VIEW_INCLUDE_LINEAR );
    access_macros.register_external_symbol( $sym83$GET_PROOF_VIEW_INCLUDE_DETAILS );
    access_macros.register_external_symbol( $sym84$SET_PROOF_VIEW_INCLUDE_DETAILS );
    access_macros.register_external_symbol( $sym85$GET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING );
    access_macros.register_external_symbol( $sym86$SET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING );
    access_macros.register_external_symbol( $sym87$GET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS );
    access_macros.register_external_symbol( $sym88$SET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS );
    access_macros.register_external_symbol( $sym89$SET_PROOF_VIEW_ADDRESSEE );
    access_macros.register_external_symbol( $sym90$SET_PROOF_VIEW_INCLUDE_CYCML );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_proof_view_entry$.getGlobalValue(), Symbols.symbol_function( $sym172$PROOF_VIEW_ENTRY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list173 );
    Structures.def_csetf( $sym174$PROOF_VIEW_ENTRY_INT_ID, $sym175$_CSETF_PROOF_VIEW_ENTRY_INT_ID );
    Structures.def_csetf( $sym176$PROOF_VIEW_ENTRY_INT_PARENT_ID, $sym177$_CSETF_PROOF_VIEW_ENTRY_INT_PARENT_ID );
    Structures.def_csetf( $sym178$PROOF_VIEW_ENTRY_INT_LABEL, $sym179$_CSETF_PROOF_VIEW_ENTRY_INT_LABEL );
    Structures.def_csetf( $sym180$PROOF_VIEW_ENTRY_INT_OBJECT_TYPE, $sym181$_CSETF_PROOF_VIEW_ENTRY_INT_OBJECT_TYPE );
    Structures.def_csetf( $sym182$PROOF_VIEW_ENTRY_INT_OBJECT, $sym183$_CSETF_PROOF_VIEW_ENTRY_INT_OBJECT );
    Structures.def_csetf( $sym184$PROOF_VIEW_ENTRY_INT_PROOF_VIEW, $sym185$_CSETF_PROOF_VIEW_ENTRY_INT_PROOF_VIEW );
    Structures.def_csetf( $sym186$PROOF_VIEW_ENTRY_INT_PROPERTIES, $sym187$_CSETF_PROOF_VIEW_ENTRY_INT_PROPERTIES );
    Equality.identity( $sym165$PROOF_VIEW_ENTRY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof_view_entry$.getGlobalValue(), Symbols.symbol_function(
        $sym194$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_ENTRY_METHOD ) );
    memoization_state.note_memoized_function( $sym212$PROOF_VIEW_ENTRY_SPECIFICITY );
    memoization_state.note_memoized_function( $sym214$PROOF_VIEW_ENTRY_GET_DEPTH );
    access_macros.register_external_symbol( $sym222$GENERATE_HTML_FROM_PROOF_VIEW_ENTRY_IDS );
    access_macros.register_external_symbol( $sym224$PROOF_VIEW_ENTRY_HTML );
    utilities_macros.note_funcall_helper_function( $sym225$FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS );
    memoization_state.note_memoized_function( $sym229$PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL );
    memoization_state.note_memoized_function( $sym241$PROOF_VIEW_SUPPORT_HTML );
    memoization_state.note_globally_cached_function( $sym315$EMPLOYEE_EMPLOYERS_AND_MTS );
    access_macros.register_external_symbol( $sym348$GET_ABDUCED_SUPPORT_SENTENCE_FOR_PROOF_VIEW );
    access_macros.register_external_symbol( $sym350$ASSERT_ABDUCTION_SUPPORT_FOR_PROOF_VIEW );
    access_macros.register_external_symbol( $sym352$GET_QUERY_URL_FOR_PROOF_VIEW );
    access_macros.register_external_symbol( $sym353$GET_SENTENCE_FOR_PROOF_VIEW );
    access_macros.register_external_symbol( $sym354$CONSTRUCT_PROOF_VIEWS_JAVA_ITERATIVELY );
    access_macros.register_external_symbol( $sym359$CONSTRUCT_PROOF_VIEWS_JAVA_LIST );
    access_macros.register_external_symbol( $sym362$CONSTRUCT_XML_PROOF_VIEW_FOR_SENTENCE );
    access_macros.register_external_symbol( $sym364$PROOF_VIEW_ID_POPULATE );
    access_macros.register_external_symbol( $sym365$PROOF_VIEW_XML );
    access_macros.register_external_symbol( $sym368$PROOF_VIEW_ENTRY_XML );
    access_macros.register_external_symbol( $sym396$GET_NEW_EMPTY_PROOF_VIEW_ID );
    memoization_state.note_memoized_function( $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_ );
    memoization_state.note_memoized_function( $sym407$PROOF_VIEW_FACT_IMPLIES_ );
    memoization_state.note_memoized_function( $sym442$PROOF_VIEW_FACT_SENTENCE );
    memoization_state.note_memoized_function( $sym444$PROOF_VIEW_FACT_HL_SENTENCE );
    memoization_state.note_memoized_function( $sym446$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS );
    memoization_state.note_memoized_function( $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_ );
    memoization_state.note_memoized_function( $sym454$PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS );
    memoization_state.note_memoized_function( $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_proof_view_file();
  }

  @Override
  public void initializeVariables()
  {
    init_proof_view_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_proof_view_file();
  }
  static
  {
    me = new proof_view();
    $proof_view_asserted_label$ = null;
    $proof_view_inferred_label$ = null;
    $proof_view_opaque_label$ = null;
    $proof_view_assertion_bookkeeping_label$ = null;
    $proof_view_sources_label$ = null;
    $proof_view_source_as_mt_label$ = null;
    $proof_view_justification_label$ = null;
    $proof_view_linear_label$ = null;
    $proof_view_facts_used_label$ = null;
    $proof_view_tab_entry_labels$ = null;
    $proof_view_rules_used_label$ = null;
    $proof_view_circular_support_label$ = null;
    $proof_view_validate_supportsP$ = null;
    $proof_view_font_colors$ = null;
    $proof_view_abduction_support_color$ = null;
    $proof_view_abduction_support_confirmed_color$ = null;
    $proof_view_abduction_support_denied_color$ = null;
    $proof_view_external_sentence_padding$ = null;
    $proof_view_entity_mention_padding$ = null;
    $proof_view_citation_format$ = null;
    $dtp_proof_view$ = null;
    $proof_view_id_index$ = null;
    $proof_view_root_entry_id$ = null;
    $break_on_proof_view_filteringP$ = null;
    $dtp_proof_view_entry$ = null;
    $proof_view_debugP$ = null;
    $proof_view_entry_showers$ = null;
    $proof_view_object_type_output_fns$ = null;
    $changed_proof_view_entry_ids$ = null;
    $use_get_employer_cacheP$ = null;
    $employee_employers_and_mts_caching_state$ = null;
    $proof_view_allow_trivial_partial_proof_conclusion_supportsP$ = null;
    $proof_view_literals_to_suppress$ = null;
    $str0$ = makeString( "" );
    $str1$External_Sources_ = makeString( "External Sources:" );
    $str2$Source_ = makeString( "Source:" );
    $str3$Detailed_Justification_ = makeString( "Detailed Justification:" );
    $str4$Linear_Justification_ = makeString( "Linear Justification:" );
    $str5$Because_ = makeString( "Because:" );
    $str6$Key_Rules_ = makeString( "Key Rules:" );
    $str7$Justified_above_ = makeString( "Justified above." );
    $int8$200 = makeInteger( 200 );
    $int9$150 = makeInteger( 150 );
    $kw10$SUPERSCRIPTS = makeKeyword( "SUPERSCRIPTS" );
    $kw11$PROOF = makeKeyword( "PROOF" );
    $kw12$ANSWER = makeKeyword( "ANSWER" );
    $sym13$_PPH_LANGUAGE_MT_ = makeSymbol( "*PPH-LANGUAGE-MT*" );
    $sym14$_PROOF_VIEW_CITATION_FORMAT_ = makeSymbol( "*PROOF-VIEW-CITATION-FORMAT*" );
    $sym15$PROOF_VIEW = makeSymbol( "PROOF-VIEW" );
    $sym16$PROOF_VIEW_P = makeSymbol( "PROOF-VIEW-P" );
    $list17 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "PROOF" ), makeSymbol( "ANSWER" ), makeSymbol( "ID-INDEX" ), makeSymbol( "PROPERTIES" ) );
    $list18 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "PROOF" ), makeKeyword( "ANSWER" ), makeKeyword( "ID-INDEX" ), makeKeyword( "PROPERTIES" ) );
    $list19 = ConsesLow.list( makeSymbol( "PROOF-VIEW-INT-ID" ), makeSymbol( "PROOF-VIEW-INT-PROOF" ), makeSymbol( "PROOF-VIEW-INT-ANSWER" ), makeSymbol( "PROOF-VIEW-INT-ID-INDEX" ), makeSymbol(
        "PROOF-VIEW-INT-PROPERTIES" ) );
    $list20 = ConsesLow.list( makeSymbol( "_CSETF-PROOF-VIEW-INT-ID" ), makeSymbol( "_CSETF-PROOF-VIEW-INT-PROOF" ), makeSymbol( "_CSETF-PROOF-VIEW-INT-ANSWER" ), makeSymbol( "_CSETF-PROOF-VIEW-INT-ID-INDEX" ),
        makeSymbol( "_CSETF-PROOF-VIEW-INT-PROPERTIES" ) );
    $sym21$PROOF_VIEW_INT_PRINT = makeSymbol( "PROOF-VIEW-INT-PRINT" );
    $sym22$PROOF_VIEW_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROOF-VIEW-PRINT-FUNCTION-TRAMPOLINE" );
    $list23 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROOF-VIEW-P" ) );
    $sym24$PROOF_VIEW_INT_ID = makeSymbol( "PROOF-VIEW-INT-ID" );
    $sym25$_CSETF_PROOF_VIEW_INT_ID = makeSymbol( "_CSETF-PROOF-VIEW-INT-ID" );
    $sym26$PROOF_VIEW_INT_PROOF = makeSymbol( "PROOF-VIEW-INT-PROOF" );
    $sym27$_CSETF_PROOF_VIEW_INT_PROOF = makeSymbol( "_CSETF-PROOF-VIEW-INT-PROOF" );
    $sym28$PROOF_VIEW_INT_ANSWER = makeSymbol( "PROOF-VIEW-INT-ANSWER" );
    $sym29$_CSETF_PROOF_VIEW_INT_ANSWER = makeSymbol( "_CSETF-PROOF-VIEW-INT-ANSWER" );
    $sym30$PROOF_VIEW_INT_ID_INDEX = makeSymbol( "PROOF-VIEW-INT-ID-INDEX" );
    $sym31$_CSETF_PROOF_VIEW_INT_ID_INDEX = makeSymbol( "_CSETF-PROOF-VIEW-INT-ID-INDEX" );
    $sym32$PROOF_VIEW_INT_PROPERTIES = makeSymbol( "PROOF-VIEW-INT-PROPERTIES" );
    $sym33$_CSETF_PROOF_VIEW_INT_PROPERTIES = makeSymbol( "_CSETF-PROOF-VIEW-INT-PROPERTIES" );
    $kw34$ID = makeKeyword( "ID" );
    $kw35$ID_INDEX = makeKeyword( "ID-INDEX" );
    $kw36$PROPERTIES = makeKeyword( "PROPERTIES" );
    $str37$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw38$BEGIN = makeKeyword( "BEGIN" );
    $sym39$MAKE_PROOF_VIEW = makeSymbol( "MAKE-PROOF-VIEW" );
    $kw40$SLOT = makeKeyword( "SLOT" );
    $kw41$END = makeKeyword( "END" );
    $sym42$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-METHOD" );
    $str43$__PROOF_VIEW_ = makeString( "#<PROOF-VIEW " );
    $str44$_proof_ = makeString( " proof=" );
    $str45$_ = makeString( ">" );
    $sym46$_PROOF_VIEW_ID_INDEX_ = makeSymbol( "*PROOF-VIEW-ID-INDEX*" );
    $sym47$INTEGERP = makeSymbol( "INTEGERP" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "PROOF-VIEW" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ENTRY-ID" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "ENTRY-ID" ) ) ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list49 = ConsesLow.list( makeKeyword( "ENTRY-ID" ), makeKeyword( "DONE" ) );
    $kw50$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw51$ENTRY_ID = makeKeyword( "ENTRY-ID" );
    $sym52$ENTRY_ID = makeSymbol( "ENTRY-ID" );
    $kw53$DONE = makeKeyword( "DONE" );
    $sym54$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $sym55$PROOF_VIEW_GET_ID_INDEX = makeSymbol( "PROOF-VIEW-GET-ID-INDEX" );
    $sym56$IGNORE = makeSymbol( "IGNORE" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "DTR-ENTRY" ), makeSymbol( "ENTRY" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list58 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym59$CSOME = makeSymbol( "CSOME" );
    $sym60$PROOF_VIEW_ENTRY_GET_CHILDREN = makeSymbol( "PROOF-VIEW-ENTRY-GET-CHILDREN" );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROOF-VIEW" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ), makeSymbol( "DONE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list62 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "DONE" ) );
    $sym63$ID = makeSymbol( "ID" );
    $list64 = ConsesLow.list( makeSymbol( "PROOF-VIEW-ID-INDEX" ) );
    $sym65$PROOF_P = makeSymbol( "PROOF-P" );
    $kw66$SKIP = makeKeyword( "SKIP" );
    $kw67$FREE = makeKeyword( "FREE" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROOF-VIEW" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym69$STATE = makeUninternedSymbol( "STATE" );
    $sym70$CLET = makeSymbol( "CLET" );
    $sym71$FIND_PROOF_VIEW_MEMOIZATION_STATE = makeSymbol( "FIND-PROOF-VIEW-MEMOIZATION-STATE" );
    $sym72$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $sym73$MAYBE_WITH_PROOF_VIEW_MEMOIZATION = makeSymbol( "MAYBE-WITH-PROOF-VIEW-MEMOIZATION" );
    $kw74$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $sym75$CLEAR_PROOF_VIEW_MEMOIZATION_STATE_BY_ID = makeSymbol( "CLEAR-PROOF-VIEW-MEMOIZATION-STATE-BY-ID" );
    $sym76$SET_PROOF_VIEW_ALLOW_EXTERNAL_LINKS_ = makeSymbol( "SET-PROOF-VIEW-ALLOW-EXTERNAL-LINKS?" );
    $sym77$SET_PROOF_VIEW_LANGUAGE_MT = makeSymbol( "SET-PROOF-VIEW-LANGUAGE-MT" );
    $sym78$SET_PROOF_VIEW_DOMAIN_MT = makeSymbol( "SET-PROOF-VIEW-DOMAIN-MT" );
    $sym79$GET_PROOF_VIEW_DOMAIN_MT = makeSymbol( "GET-PROOF-VIEW-DOMAIN-MT" );
    $sym80$GET_PROOF_VIEW_LANGUAGE_MT = makeSymbol( "GET-PROOF-VIEW-LANGUAGE-MT" );
    $sym81$GET_PROOF_VIEW_INCLUDE_LINEAR = makeSymbol( "GET-PROOF-VIEW-INCLUDE-LINEAR" );
    $sym82$SET_PROOF_VIEW_INCLUDE_LINEAR = makeSymbol( "SET-PROOF-VIEW-INCLUDE-LINEAR" );
    $sym83$GET_PROOF_VIEW_INCLUDE_DETAILS = makeSymbol( "GET-PROOF-VIEW-INCLUDE-DETAILS" );
    $sym84$SET_PROOF_VIEW_INCLUDE_DETAILS = makeSymbol( "SET-PROOF-VIEW-INCLUDE-DETAILS" );
    $sym85$GET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING = makeSymbol( "GET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING" );
    $sym86$SET_PROOF_VIEW_SUPPRESS_ASSERTION_BOOKKEEPING = makeSymbol( "SET-PROOF-VIEW-SUPPRESS-ASSERTION-BOOKKEEPING" );
    $sym87$GET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS = makeSymbol( "GET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS" );
    $sym88$SET_PROOF_VIEW_SUPPRESS_ASSERTION_CYCLISTS = makeSymbol( "SET-PROOF-VIEW-SUPPRESS-ASSERTION-CYCLISTS" );
    $sym89$SET_PROOF_VIEW_ADDRESSEE = makeSymbol( "SET-PROOF-VIEW-ADDRESSEE" );
    $sym90$SET_PROOF_VIEW_INCLUDE_CYCML = makeSymbol( "SET-PROOF-VIEW-INCLUDE-CYCML" );
    $sym91$PROOF_VIEW_ENTRY_ = makeSymbol( "PROOF-VIEW-ENTRY<" );
    $kw92$FACTS_USED = makeKeyword( "FACTS-USED" );
    $kw93$USED_SUPPORTS = makeKeyword( "USED-SUPPORTS" );
    $kw94$SOURCE_INDEX = makeKeyword( "SOURCE-INDEX" );
    $kw95$SOURCE_ISG = makeKeyword( "SOURCE-ISG" );
    $kw96$FILTERED_ITEMS = makeKeyword( "FILTERED-ITEMS" );
    $kw97$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str98$filtering__S____reason___S_ = makeString( "filtering ~S~% (reason: ~S)" );
    $sym99$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $const100$SpecificationVariantFn = constant_handles.reader_make_constant_shell( makeString( "SpecificationVariantFn" ) );
    $list101 = ConsesLow.list( makeSymbol( "NEW-SPECIFICATION" ), makeSymbol( "CYCL-PARAM" ), makeSymbol( "CYCL-VALUE" ) );
    $list102 = ConsesLow.cons( makeSymbol( "CYCL-PARAM" ), makeSymbol( "CYCL-VALUE" ) );
    $list103 = ConsesLow.cons( makeSymbol( "?PARAM" ), makeSymbol( "?VALUE" ) );
    $const104$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list105 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "parameterOfProgram" ) ), makeSymbol( "?PARAM" ), constant_handles.reader_make_constant_shell( makeString(
        "CycProofViewGenerator" ) ) );
    $sym106$_PARAM = makeSymbol( "?PARAM" );
    $list107 = ConsesLow.list( makeSymbol( "?VALUE" ) );
    $const108$CycArchitectureMt = constant_handles.reader_make_constant_shell( makeString( "CycArchitectureMt" ) );
    $kw109$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw110$SHALLOW = makeKeyword( "SHALLOW" );
    $kw111$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw112$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw113$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw114$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw115$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw116$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw117$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw118$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float119$1_0 = makeDouble( 1.0 );
    $kw120$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw121$HL = makeKeyword( "HL" );
    $const122$suppressProofViewSection = constant_handles.reader_make_constant_shell( makeString( "suppressProofViewSection" ) );
    $const123$CycProofViewSummarySection = constant_handles.reader_make_constant_shell( makeString( "CycProofViewSummarySection" ) );
    $const124$CycProofViewJustificationSection = constant_handles.reader_make_constant_shell( makeString( "CycProofViewJustificationSection" ) );
    $const125$CycProofViewLinearSection = constant_handles.reader_make_constant_shell( makeString( "CycProofViewLinearSection" ) );
    $const126$includeProofViewSection = constant_handles.reader_make_constant_shell( makeString( "includeProofViewSection" ) );
    $const127$showAssertionBookkeeping = constant_handles.reader_make_constant_shell( makeString( "showAssertionBookkeeping" ) );
    $const128$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $const129$showAssertionDates = constant_handles.reader_make_constant_shell( makeString( "showAssertionDates" ) );
    $const130$showAssertionCyclists = constant_handles.reader_make_constant_shell( makeString( "showAssertionCyclists" ) );
    $const131$showAssertionCyclistEmployers = constant_handles.reader_make_constant_shell( makeString( "showAssertionCyclistEmployers" ) );
    $str132$Don_t_know_how_to_set_proof_view_ = makeString( "Don't know how to set proof-view parameter ~S to ~S" );
    $const133$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $kw134$ADDRESSEE = makeKeyword( "ADDRESSEE" );
    $sym135$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $kw136$INCLUDE_RULES_SECTION_ = makeKeyword( "INCLUDE-RULES-SECTION?" );
    $sym137$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw138$INCLUDE_JUSTIFICATION_SECTION_ = makeKeyword( "INCLUDE-JUSTIFICATION-SECTION?" );
    $kw139$ENABLE_DEBUG_ = makeKeyword( "ENABLE-DEBUG?" );
    $kw140$SHOW_CB_BUG_REPORT_LINKS_ = makeKeyword( "SHOW-CB-BUG-REPORT-LINKS?" );
    $kw141$INCLUDE_CYCL_IN_OUTPUT_ = makeKeyword( "INCLUDE-CYCL-IN-OUTPUT?" );
    $kw142$INCLUDE_SOURCES_ = makeKeyword( "INCLUDE-SOURCES?" );
    $kw143$LINK_PHRASES_ = makeKeyword( "LINK-PHRASES?" );
    $kw144$SUMMARY_ONLY = makeKeyword( "SUMMARY-ONLY" );
    $sym145$PROOF_VIEW_INCLUDE_SOURCES_SPEC_P = makeSymbol( "PROOF-VIEW-INCLUDE-SOURCES-SPEC-P" );
    $kw146$INCLUDE_CYCML_IN_XML_ = makeKeyword( "INCLUDE-CYCML-IN-XML?" );
    $str147$SILK_not_supported_in_non_Cyc_HAL = makeString( "SILK not supported in non Cyc-HALO builds." );
    $kw148$SUPPRESS_ASSERTION_BOOKKEEPING_ = makeKeyword( "SUPPRESS-ASSERTION-BOOKKEEPING?" );
    $kw149$SUPPRESS_ASSERTION_CYCLISTS_ = makeKeyword( "SUPPRESS-ASSERTION-CYCLISTS?" );
    $kw150$SUPPRESS_ASSERTION_CYCLIST_EMPLOYERS_ = makeKeyword( "SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?" );
    $kw151$SUPPRESS_ASSERTION_DATES_ = makeKeyword( "SUPPRESS-ASSERTION-DATES?" );
    $kw152$ALLOW_EXTERNAL_LINKS_ = makeKeyword( "ALLOW-EXTERNAL-LINKS?" );
    $kw153$ALLOW_INTERNAL_LINKS_ = makeKeyword( "ALLOW-INTERNAL-LINKS?" );
    $kw154$LANGUAGE_MT = makeKeyword( "LANGUAGE-MT" );
    $sym155$HLMT_ = makeSymbol( "HLMT?" );
    $kw156$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $kw157$CREATION_UNIVERSAL_TIME = makeKeyword( "CREATION-UNIVERSAL-TIME" );
    $sym158$UNIVERSAL_TIME_P = makeSymbol( "UNIVERSAL-TIME-P" );
    $kw159$POPULATED_UNIVERSAL_TIME = makeKeyword( "POPULATED-UNIVERSAL-TIME" );
    $kw160$DISPLAYED_UNIVERSAL_TIME = makeKeyword( "DISPLAYED-UNIVERSAL-TIME" );
    $sym161$PROCESSP = makeSymbol( "PROCESSP" );
    $kw162$PREPARER_THREAD = makeKeyword( "PREPARER-THREAD" );
    $kw163$ERROR_OUTPUT = makeKeyword( "ERROR-OUTPUT" );
    $sym164$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym165$PROOF_VIEW_ENTRY = makeSymbol( "PROOF-VIEW-ENTRY" );
    $sym166$PROOF_VIEW_ENTRY_P = makeSymbol( "PROOF-VIEW-ENTRY-P" );
    $list167 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "PARENT-ID" ), makeSymbol( "LABEL" ), makeSymbol( "OBJECT-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "PROOF-VIEW" ), makeSymbol( "PROPERTIES" ) );
    $list168 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "PARENT-ID" ), makeKeyword( "LABEL" ), makeKeyword( "OBJECT-TYPE" ), makeKeyword( "OBJECT" ), makeKeyword( "PROOF-VIEW" ), makeKeyword( "PROPERTIES" ) );
    $list169 = ConsesLow.list( makeSymbol( "PROOF-VIEW-ENTRY-INT-ID" ), makeSymbol( "PROOF-VIEW-ENTRY-INT-PARENT-ID" ), makeSymbol( "PROOF-VIEW-ENTRY-INT-LABEL" ), makeSymbol( "PROOF-VIEW-ENTRY-INT-OBJECT-TYPE" ),
        makeSymbol( "PROOF-VIEW-ENTRY-INT-OBJECT" ), makeSymbol( "PROOF-VIEW-ENTRY-INT-PROOF-VIEW" ), makeSymbol( "PROOF-VIEW-ENTRY-INT-PROPERTIES" ) );
    $list170 = ConsesLow.list( makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-ID" ), makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-PARENT-ID" ), makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-LABEL" ), makeSymbol(
        "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT-TYPE" ), makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT" ), makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-PROOF-VIEW" ), makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-PROPERTIES" ) );
    $sym171$PROOF_VIEW_ENTRY_INT_PRINT = makeSymbol( "PROOF-VIEW-ENTRY-INT-PRINT" );
    $sym172$PROOF_VIEW_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROOF-VIEW-ENTRY-PRINT-FUNCTION-TRAMPOLINE" );
    $list173 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROOF-VIEW-ENTRY-P" ) );
    $sym174$PROOF_VIEW_ENTRY_INT_ID = makeSymbol( "PROOF-VIEW-ENTRY-INT-ID" );
    $sym175$_CSETF_PROOF_VIEW_ENTRY_INT_ID = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-ID" );
    $sym176$PROOF_VIEW_ENTRY_INT_PARENT_ID = makeSymbol( "PROOF-VIEW-ENTRY-INT-PARENT-ID" );
    $sym177$_CSETF_PROOF_VIEW_ENTRY_INT_PARENT_ID = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-PARENT-ID" );
    $sym178$PROOF_VIEW_ENTRY_INT_LABEL = makeSymbol( "PROOF-VIEW-ENTRY-INT-LABEL" );
    $sym179$_CSETF_PROOF_VIEW_ENTRY_INT_LABEL = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-LABEL" );
    $sym180$PROOF_VIEW_ENTRY_INT_OBJECT_TYPE = makeSymbol( "PROOF-VIEW-ENTRY-INT-OBJECT-TYPE" );
    $sym181$_CSETF_PROOF_VIEW_ENTRY_INT_OBJECT_TYPE = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT-TYPE" );
    $sym182$PROOF_VIEW_ENTRY_INT_OBJECT = makeSymbol( "PROOF-VIEW-ENTRY-INT-OBJECT" );
    $sym183$_CSETF_PROOF_VIEW_ENTRY_INT_OBJECT = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-OBJECT" );
    $sym184$PROOF_VIEW_ENTRY_INT_PROOF_VIEW = makeSymbol( "PROOF-VIEW-ENTRY-INT-PROOF-VIEW" );
    $sym185$_CSETF_PROOF_VIEW_ENTRY_INT_PROOF_VIEW = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-PROOF-VIEW" );
    $sym186$PROOF_VIEW_ENTRY_INT_PROPERTIES = makeSymbol( "PROOF-VIEW-ENTRY-INT-PROPERTIES" );
    $sym187$_CSETF_PROOF_VIEW_ENTRY_INT_PROPERTIES = makeSymbol( "_CSETF-PROOF-VIEW-ENTRY-INT-PROPERTIES" );
    $kw188$PARENT_ID = makeKeyword( "PARENT-ID" );
    $kw189$LABEL = makeKeyword( "LABEL" );
    $kw190$OBJECT_TYPE = makeKeyword( "OBJECT-TYPE" );
    $kw191$OBJECT = makeKeyword( "OBJECT" );
    $kw192$PROOF_VIEW = makeKeyword( "PROOF-VIEW" );
    $sym193$MAKE_PROOF_VIEW_ENTRY = makeSymbol( "MAKE-PROOF-VIEW-ENTRY" );
    $sym194$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_ENTRY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-ENTRY-METHOD" );
    $str195$__PROOF_VIEW_ENTRY_ = makeString( "#<PROOF-VIEW-ENTRY " );
    $str196$_D__D = makeString( "~D.~D" );
    $str197$_label_ = makeString( " label=" );
    $str198$_S_has_no_root_entry___ = makeString( "~S has no root entry.~%" );
    $list199 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $kw200$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $sym201$VALID_PROOF_VIEW_P = makeSymbol( "VALID-PROOF-VIEW-P" );
    $str202$_ = makeString( "-" );
    $sym203$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym204$STRINGP = makeSymbol( "STRINGP" );
    $sym205$SYMBOLP = makeSymbol( "SYMBOLP" );
    $list206 = ConsesLow.list( makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym207$PWHEN = makeSymbol( "PWHEN" );
    $sym208$_PROOF_VIEW_DEBUG__ = makeSymbol( "*PROOF-VIEW-DEBUG?*" );
    $sym209$WARN = makeSymbol( "WARN" );
    $sym210$FORCE_FORMAT = makeSymbol( "FORCE-FORMAT" );
    $kw211$CHILDREN = makeKeyword( "CHILDREN" );
    $sym212$PROOF_VIEW_ENTRY_SPECIFICITY = makeSymbol( "PROOF-VIEW-ENTRY-SPECIFICITY" );
    $kw213$IGNORE = makeKeyword( "IGNORE" );
    $sym214$PROOF_VIEW_ENTRY_GET_DEPTH = makeSymbol( "PROOF-VIEW-ENTRY-GET-DEPTH" );
    $kw215$EXPAND_INITIALLY_ = makeKeyword( "EXPAND-INITIALLY?" );
    $kw216$SOURCES = makeKeyword( "SOURCES" );
    $kw217$FN = makeKeyword( "FN" );
    $kw218$FN_SECTION = makeKeyword( "FN-SECTION" );
    $kw219$HIGHLIGHT_PHRASE_DEMERITS_ = makeKeyword( "HIGHLIGHT-PHRASE-DEMERITS?" );
    $sym220$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $sym221$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym222$GENERATE_HTML_FROM_PROOF_VIEW_ENTRY_IDS = makeSymbol( "GENERATE-HTML-FROM-PROOF-VIEW-ENTRY-IDS" );
    $str223$can_t_find_proof_view_entry_for_i = makeString( "can't find proof-view-entry for ids (~A ~A)" );
    $sym224$PROOF_VIEW_ENTRY_HTML = makeSymbol( "PROOF-VIEW-ENTRY-HTML" );
    $sym225$FACT_SHEET_TERM_ID_IF_OK_FOR_PROOF_VIEW_FACT_SHEETS = makeSymbol( "FACT-SHEET-TERM-ID-IF-OK-FOR-PROOF-VIEW-FACT-SHEETS" );
    $kw226$ENTRY_PARAPHRASE_FN = makeKeyword( "ENTRY-PARAPHRASE-FN" );
    $sym227$PROOF_VIEW_ENTRY_GENERATE_HTML_STANDARD = makeSymbol( "PROOF-VIEW-ENTRY-GENERATE-HTML-STANDARD" );
    $sym228$_EXIT = makeSymbol( "%EXIT" );
    $sym229$PROOF_VIEW_ENTRY_GENERATE_HTML_INTERNAL = makeSymbol( "PROOF-VIEW-ENTRY-GENERATE-HTML-INTERNAL" );
    $kw230$FACT_SHEET = makeKeyword( "FACT-SHEET" );
    $kw231$NONE = makeKeyword( "NONE" );
    $list232 = ConsesLow.list( ConsesLow.list( makeSymbol( "COLOR" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym233$PIF = makeSymbol( "PIF" );
    $sym234$HTML_FANCY_FONT = makeSymbol( "HTML-FANCY-FONT" );
    $kw235$COLOR = makeKeyword( "COLOR" );
    $sym236$GENERATE_SKOLEM_TERM_EXISTENTIALLY = makeSymbol( "GENERATE-SKOLEM-TERM-EXISTENTIALLY" );
    $sym237$GENERATE_SKOLEM_TERM_SMART = makeSymbol( "GENERATE-SKOLEM-TERM-SMART" );
    $kw238$LINEAR_ID = makeKeyword( "LINEAR-ID" );
    $str239$_A__ = makeString( "~A. " );
    $kw240$PPH_DEMERITS = makeKeyword( "PPH-DEMERITS" );
    $sym241$PROOF_VIEW_SUPPORT_HTML = makeSymbol( "PROOF-VIEW-SUPPORT-HTML" );
    $kw242$PROOF_VIEW_ENTRY_CONFIRMED = makeKeyword( "PROOF-VIEW-ENTRY-CONFIRMED" );
    $kw243$PROOF_VIEW_ENTRY_DENIED = makeKeyword( "PROOF-VIEW-ENTRY-DENIED" );
    $str244$_A = makeString( "~A" );
    $sym245$EL_SENTENCE_P = makeSymbol( "EL-SENTENCE-P" );
    $sym246$EL_TERM_P = makeSymbol( "EL-TERM-P" );
    $kw247$SOURCE_CITATION = makeKeyword( "SOURCE-CITATION" );
    $kw248$EXTERNAL_SENTENCE = makeKeyword( "EXTERNAL-SENTENCE" );
    $list249 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "TERMS" ), makeSymbol( "MT" ) );
    $kw250$ENTITY_MENTION = makeKeyword( "ENTITY-MENTION" );
    $list251 = ConsesLow.list( makeSymbol( "DOCUMENT" ), makeSymbol( "ENTITY-MENTION" ), makeSymbol( "TERMS" ), makeSymbol( "MT" ) );
    $kw252$QUERY_SENTENCE = makeKeyword( "QUERY-SENTENCE" );
    $kw253$BINDINGS = makeKeyword( "BINDINGS" );
    $kw254$RULE_USED = makeKeyword( "RULE-USED" );
    $const255$keyRuleEnglishSummary = constant_handles.reader_make_constant_shell( makeString( "keyRuleEnglishSummary" ) );
    $kw256$UNSUPPORTED_SUPPORT = makeKeyword( "UNSUPPORTED-SUPPORT" );
    $str257$Fact_computed_by_Cyc_ = makeString( "Fact computed by Cyc." );
    $kw258$NO_JUSTIFICATION = makeKeyword( "NO-JUSTIFICATION" );
    $str259$No_justification_available_ = makeString( "No justification available." );
    $kw260$CIRCULAR_SUPPORT = makeKeyword( "CIRCULAR-SUPPORT" );
    $kw261$ABDUCED_SUPPORT = makeKeyword( "ABDUCED-SUPPORT" );
    $str262$Cyc_thinks_this_might_be_true_but = makeString( "Cyc thinks this might be true but can't prove it." );
    $kw263$ABDUCED_SUPPORT_CONFIRMED = makeKeyword( "ABDUCED-SUPPORT-CONFIRMED" );
    $str264$Confirmed__but_not_provable_from_ = makeString( "Confirmed, but not provable from previous knowledge." );
    $kw265$ABDUCED_SUPPORT_DENIED = makeKeyword( "ABDUCED-SUPPORT-DENIED" );
    $str266$Denied__and_not_provable_from_pre = makeString( "Denied, and not provable from previous knowledge." );
    $kw267$GIVEN = makeKeyword( "GIVEN" );
    $str268$Given_in_the_question_ = makeString( "Given in the question." );
    $kw269$EXCEPTION = makeKeyword( "EXCEPTION" );
    $str270$This_rule_has_exceptions__but_non = makeString( "This rule has exceptions, but none that apply in this case." );
    $kw271$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $str272$This_rule_has_further_conditions_ = makeString( "This rule has further conditions on its application, but all are met in this case." );
    $kw273$ASSERTION_BOOKKEEPING = makeKeyword( "ASSERTION-BOOKKEEPING" );
    $kw274$ROOT = makeKeyword( "ROOT" );
    $kw275$SECTION_ROOT = makeKeyword( "SECTION-ROOT" );
    $kw276$NO_SOURCE_DOCUMENT = makeKeyword( "NO-SOURCE-DOCUMENT" );
    $kw277$EMPTY_JUSTIFICATION = makeKeyword( "EMPTY-JUSTIFICATION" );
    $kw278$PREMISE = makeKeyword( "PREMISE" );
    $kw279$RULE = makeKeyword( "RULE" );
    $kw280$CONCLUSION = makeKeyword( "CONCLUSION" );
    $kw281$FROM = makeKeyword( "FROM" );
    $str282$From_ = makeString( "From " );
    $str283$_A_and__A = makeString( "~A and ~A" );
    $str284$and_ = makeString( "and " );
    $str285$__ = makeString( ", " );
    $str286$no_output_method_for__S = makeString( "no output method for ~S" );
    $kw287$HAS_ABDUCED_SUPPORT_ = makeKeyword( "HAS-ABDUCED-SUPPORT?" );
    $kw288$HAS_ABDUCED_SUPPORT_CONFIRMED_ = makeKeyword( "HAS-ABDUCED-SUPPORT-CONFIRMED?" );
    $kw289$HAS_ABDUCED_SUPPORT_DENIED_ = makeKeyword( "HAS-ABDUCED-SUPPORT-DENIED?" );
    $sym290$PPH_SOURCE_CITATION_P = makeSymbol( "PPH-SOURCE-CITATION-P" );
    $list291 = ConsesLow.cons( makeSymbol( "VAR" ), makeSymbol( "VALUE" ) );
    $str292$__ = makeString( ": " );
    $str293$Given_in_the_query = makeString( "Given in the query" );
    $str294$Entered = makeString( "Entered" );
    $str295$_by_an_employee_ = makeString( " by an employee " );
    $str296$_by_ = makeString( " by " );
    $str297$_of_ = makeString( " of " );
    $str298$_on_ = makeString( " on " );
    $str299$_at_ = makeString( " at " );
    $str300$_for_ = makeString( " for " );
    $str301$Fact_asserted_in_Cyc_Knowledge_Ba = makeString( "Fact asserted in Cyc Knowledge Base" );
    $str302$_ = makeString( "." );
    $const303$HypotheticalContext = constant_handles.reader_make_constant_shell( makeString( "HypotheticalContext" ) );
    $list304 = ConsesLow.list( makeSymbol( "THIS-EMPLOYER" ), makeSymbol( "THIS-MT" ) );
    $const305$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
    $sym306$_EMPLOYER = makeSymbol( "?EMPLOYER" );
    $const307$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym308$_MT = makeSymbol( "?MT" );
    $const309$employees = constant_handles.reader_make_constant_shell( makeString( "employees" ) );
    $list310 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtTimeIndex" ) ), makeSymbol( "?MT" ), makeSymbol( "?TIME" ) );
    $const311$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $sym312$_TIME = makeSymbol( "?TIME" );
    $const313$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list314 = ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $sym315$EMPLOYEE_EMPLOYERS_AND_MTS = makeSymbol( "EMPLOYEE-EMPLOYERS-AND-MTS" );
    $list316 = ConsesLow.list( makeSymbol( "?EMPLOYER" ), makeSymbol( "?MT" ) );
    $list317 = ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL );
    $sym318$_EMPLOYEE_EMPLOYERS_AND_MTS_CACHING_STATE_ = makeSymbol( "*EMPLOYEE-EMPLOYERS-AND-MTS-CACHING-STATE*" );
    $list319 = ConsesLow.list( makeSymbol( "?OFFSET" ), makeSymbol( "?LENGTH" ), makeSymbol( "?TEXT" ) );
    $const320$lengthOfList = constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) );
    $list321 = ConsesLow.list( makeSymbol( "?LENGTH" ) );
    $list322 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "textOfWork" ) ), makeSymbol( "?DOCUMENT" ), makeSymbol( "?TEXT" ) );
    $const323$startOffset = constant_handles.reader_make_constant_shell( makeString( "startOffset" ) );
    $sym324$_DOCUMENT = makeSymbol( "?DOCUMENT" );
    $list325 = ConsesLow.list( makeSymbol( "?OFFSET" ) );
    $list326 = ConsesLow.list( makeSymbol( "OFFSET" ), makeSymbol( "LENGTH" ), makeSymbol( "TEXT" ) );
    $str327$___ = makeString( "..." );
    $list328 = ConsesLow.list( makeSymbol( "TERM-STRING" ), makeSymbol( "TERM-START-POS" ), makeSymbol( "TERM-END-POS" ), makeSymbol( "COLOR" ) );
    $sym329$_TEXT = makeSymbol( "?TEXT" );
    $const330$textOfWork = constant_handles.reader_make_constant_shell( makeString( "textOfWork" ) );
    $list331 = ConsesLow.list( makeSymbol( "?TEXT" ) );
    $list332 = ConsesLow.list( makeSymbol( "OFFSET" ), makeSymbol( "LENGTH" ) );
    $list333 = ConsesLow.list( makeSymbol( "?OFFSET" ), makeSymbol( "?LENGTH" ) );
    $const334$startOffsetForMention = constant_handles.reader_make_constant_shell( makeString( "startOffsetForMention" ) );
    $const335$stringLengthForMention = constant_handles.reader_make_constant_shell( makeString( "stringLengthForMention" ) );
    $str336$black = makeString( "black" );
    $kw337$EXTERNAL_TERMS = makeKeyword( "EXTERNAL-TERMS" );
    $kw338$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $sym339$_ = makeSymbol( "<" );
    $sym340$SECOND = makeSymbol( "SECOND" );
    $sym341$_STRING = makeSymbol( "?STRING" );
    $const342$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $list343 = ConsesLow.list( makeSymbol( "?STRING" ) );
    $list344 = ConsesLow.list( makeKeyword( "REWRITE-ALLOWED?" ), T );
    $str345$__ = makeString( " ," );
    $str346$_ = makeString( "," );
    $sym347$PROOF_VIEW_REFERENCE_SUBSUMES_P = makeSymbol( "PROOF-VIEW-REFERENCE-SUBSUMES-P" );
    $sym348$GET_ABDUCED_SUPPORT_SENTENCE_FOR_PROOF_VIEW = makeSymbol( "GET-ABDUCED-SUPPORT-SENTENCE-FOR-PROOF-VIEW" );
    $const349$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $sym350$ASSERT_ABDUCTION_SUPPORT_FOR_PROOF_VIEW = makeSymbol( "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW" );
    $const351$ContextOfPCWFn = constant_handles.reader_make_constant_shell( makeString( "ContextOfPCWFn" ) );
    $sym352$GET_QUERY_URL_FOR_PROOF_VIEW = makeSymbol( "GET-QUERY-URL-FOR-PROOF-VIEW" );
    $sym353$GET_SENTENCE_FOR_PROOF_VIEW = makeSymbol( "GET-SENTENCE-FOR-PROOF-VIEW" );
    $sym354$CONSTRUCT_PROOF_VIEWS_JAVA_ITERATIVELY = makeSymbol( "CONSTRUCT-PROOF-VIEWS-JAVA-ITERATIVELY" );
    $sym355$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym356$PROOF_ABDUCTIONS = makeSymbol( "PROOF-ABDUCTIONS" );
    $sym357$PROOF_ABDUCED_SUPPORT_RATIO = makeSymbol( "PROOF-ABDUCED-SUPPORT-RATIO" );
    $sym358$INFERENCE_PROOF_GET_DEPTH = makeSymbol( "INFERENCE-PROOF-GET-DEPTH" );
    $sym359$CONSTRUCT_PROOF_VIEWS_JAVA_LIST = makeSymbol( "CONSTRUCT-PROOF-VIEWS-JAVA-LIST" );
    $str360$inference_answer___A__ = makeString( "inference-answer: ~A~%" );
    $str361$proofs___A__ = makeString( "proofs: ~A~%" );
    $sym362$CONSTRUCT_XML_PROOF_VIEW_FOR_SENTENCE = makeSymbol( "CONSTRUCT-XML-PROOF-VIEW-FOR-SENTENCE" );
    $kw363$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $sym364$PROOF_VIEW_ID_POPULATE = makeSymbol( "PROOF-VIEW-ID-POPULATE" );
    $sym365$PROOF_VIEW_XML = makeSymbol( "PROOF-VIEW-XML" );
    $str366$_s_Does_not_identify_existing_pro = makeString( "~s Does not identify existing proof-view" );
    $str367$UTF_8 = makeString( "UTF-8" );
    $sym368$PROOF_VIEW_ENTRY_XML = makeSymbol( "PROOF-VIEW-ENTRY-XML" );
    $kw369$TOP_LEVEL_ONLY = makeKeyword( "TOP-LEVEL-ONLY" );
    $list370 = ConsesLow.list( ConsesLow.list( makeSymbol( "LOCAL-NAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "ATTRIBUTES" ), NIL ), makeSymbol( "ATOMIC?" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym371$XML_TAG = makeSymbol( "XML-TAG" );
    $list372 = ConsesLow.list( NIL, NIL, ConsesLow.list( makeSymbol( "PROOF-VIEW-NAMESPACE" ) ) );
    $list373 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCML-INCLUDE-NAMESPACE?*" ), makeSymbol( "*PROOF-VIEW-INCLUDE-NAMESPACE?*" ) ) );
    $str374$proof_view = makeString( "proof-view" );
    $str375$id = makeString( "id" );
    $kw376$JUSTIFICATION_ROOT = makeKeyword( "JUSTIFICATION-ROOT" );
    $str377$proof_view_details = makeString( "proof-view-details" );
    $kw378$SOURCES_ROOT = makeKeyword( "SOURCES-ROOT" );
    $str379$proof_view_sources = makeString( "proof-view-sources" );
    $kw380$RULES_USED = makeKeyword( "RULES-USED" );
    $str381$proof_view_rules = makeString( "proof-view-rules" );
    $str382$proof_view_id = makeString( "proof-view-id" );
    $str383$proof_view_entry = makeString( "proof-view-entry" );
    $str384$sub_entries = makeString( "sub-entries" );
    $list385 = ConsesLow.list( makeSymbol( "HTML" ), makeSymbol( "CYCL" ) );
    $str386$cycl = makeString( "cycl" );
    $str387$expand_initially = makeString( "expand-initially" );
    $str388$label = makeString( "label" );
    $str389$object_type = makeString( "object-type" );
    $str390$abduced_support = makeString( "abduced-support" );
    $str391$content = makeString( "content" );
    $kw392$ENTRIES = makeKeyword( "ENTRIES" );
    $kw393$TRUE = makeKeyword( "TRUE" );
    $kw394$FALSE = makeKeyword( "FALSE" );
    $kw395$ABDUCED_SUPPORT_ = makeKeyword( "ABDUCED-SUPPORT?" );
    $sym396$GET_NEW_EMPTY_PROOF_VIEW_ID = makeSymbol( "GET-NEW-EMPTY-PROOF-VIEW-ID" );
    $sym397$INFERENCE_ANSWER_P = makeSymbol( "INFERENCE-ANSWER-P" );
    $str398$Yes_ = makeString( "Yes." );
    $kw399$USED_RULES_ROOT = makeKeyword( "USED-RULES-ROOT" );
    $kw400$QUERY_ROOT = makeKeyword( "QUERY-ROOT" );
    $sym401$PROOF_VIEW_FACT_TRIVIALLY_IMPLIES_PROOF_CONCLUSION_ = makeSymbol( "PROOF-VIEW-FACT-TRIVIALLY-IMPLIES-PROOF-CONCLUSION?" );
    $list402 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $str403$_S___trivially_implies_answer_con = makeString( "~S~% trivially implies answer conjunct ~S" );
    $kw404$TVA = makeKeyword( "TVA" );
    $list405 = ConsesLow.list( makeSymbol( "ASSERTION-P" ), makeSymbol( "SUPPORT-P" ), makeSymbol( "EL-SENTENCE-P" ), makeKeyword( "EXTERNAL-SENTENCE" ) );
    $list406 = ConsesLow.list( makeSymbol( "ASSERTION-P" ), makeSymbol( "SUPPORT-P" ) );
    $sym407$PROOF_VIEW_FACT_IMPLIES_ = makeSymbol( "PROOF-VIEW-FACT-IMPLIES?" );
    $list408 = ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "typeChangesQuantityByFactor" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
        "EVENT" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SLOT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FACTOR" ) ) );
    $sym409$FACTOR = makeSymbol( "FACTOR" );
    $sym410$SLOT = makeSymbol( "SLOT" );
    $sym411$EVENT = makeSymbol( "EVENT" );
    $list412 = ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "subEventTypes" ) ) );
    $const413$IncreaseOnSlotFn = constant_handles.reader_make_constant_shell( makeString( "IncreaseOnSlotFn" ) );
    $list414 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "COL1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COL2" ) ) );
    $sym415$COL2 = makeSymbol( "COL2" );
    $sym416$COL1 = makeSymbol( "COL1" );
    $sym417$BIN_PRED = makeSymbol( "BIN-PRED" );
    $list418 = ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) );
    $sym419$PRED = makeSymbol( "PRED" );
    $const420$Kappa = constant_handles.reader_make_constant_shell( makeString( "Kappa" ) );
    $list421 = ConsesLow.list( makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) );
    $const422$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $const423$coGenlPreds = constant_handles.reader_make_constant_shell( makeString( "coGenlPreds" ) );
    $list424 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMin" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ), ConsesLow.list( makeKeyword(
        "BIND" ), makeSymbol( "COL1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COL2" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MIN" ) ) );
    $sym425$MIN = makeSymbol( "MIN" );
    $list426 = ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "coveringOfEventType" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
        "SUPER" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUBS" ) ) );
    $sym427$SUBS = makeSymbol( "SUBS" );
    $sym428$SUPER = makeSymbol( "SUPER" );
    $list429 = ConsesLow.list( makeKeyword( "SPEC-PRED" ), constant_handles.reader_make_constant_shell( makeString( "lastProperSubEventTypes" ) ) );
    $list430 = ConsesLow.list( makeKeyword( "SPEC-PRED" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndOfInSituationType" ) ) );
    $list431 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUB1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUB2" ) ) );
    $sym432$SUB2 = makeSymbol( "SUB2" );
    $sym433$SUB1 = makeSymbol( "SUB1" );
    $list434 = ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "partTypesFactsForType" ) ), constant_handles.reader_make_constant_shell( makeString(
        "resultTypesFactsForType" ) ) );
    $kw435$FULLY_BOUND = makeKeyword( "FULLY-BOUND" );
    $list436 = ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "firstProperSubSituationTypes" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
        "SUP" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUB" ) ) );
    $sym437$SUB = makeSymbol( "SUB" );
    $sym438$SUP = makeSymbol( "SUP" );
    $const439$startTogetherInSituationType = constant_handles.reader_make_constant_shell( makeString( "startTogetherInSituationType" ) );
    $kw440$ANYTHING = makeKeyword( "ANYTHING" );
    $str441$_S___trivially_implies__S = makeString( "~S~% trivially implies ~S" );
    $sym442$PROOF_VIEW_FACT_SENTENCE = makeSymbol( "PROOF-VIEW-FACT-SENTENCE" );
    $str443$Don_t_know_how_to_get_sentence_of = makeString( "Don't know how to get sentence of ~S" );
    $sym444$PROOF_VIEW_FACT_HL_SENTENCE = makeSymbol( "PROOF-VIEW-FACT-HL-SENTENCE" );
    $str445$Don_t_know_how_to_get_HL_sentence = makeString( "Don't know how to get HL sentence of ~S" );
    $sym446$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS = makeSymbol( "PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS" );
    $list447 = ConsesLow.list( makeKeyword( "ISA" ), makeKeyword( "GENLS" ), makeKeyword( "DISJOINTWITH" ), makeKeyword( "TRANSITIVITY" ), makeKeyword( "TVA" ), makeKeyword( "GENLPREDS" ) );
    $list448 = ConsesLow.list( makeKeyword( "UNKNOWN" ), makeKeyword( "FALSE" ) );
    $str449$Suppressing__S___because_it_match = makeString( "Suppressing ~S~% because it matches ~S" );
    $sym450$SENTENCE_MATCHES_SUPPRESSED_LITERAL_ = makeSymbol( "SENTENCE-MATCHES-SUPPRESSED-LITERAL?" );
    $kw451$TEST = makeKeyword( "TEST" );
    $sym452$GENL_PREDICATE_ = makeSymbol( "GENL-PREDICATE?" );
    $list453 = ConsesLow.list( makeKeyword( "SKSI" ), makeKeyword( "GIS" ) );
    $sym454$PROOF_VIEW_GET_DOCUMENT_FOR_HYPOTHESIS = makeSymbol( "PROOF-VIEW-GET-DOCUMENT-FOR-HYPOTHESIS" );
    $const455$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list456 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TextualPCW" ) ) );
    $const457$sourceOfTerm = constant_handles.reader_make_constant_shell( makeString( "sourceOfTerm" ) );
    $list458 = ConsesLow.list( makeSymbol( "?DOCUMENT" ) );
    $sym459$INFERENCE_PROOF_GET_DEPTH_MEMOIZED = makeSymbol( "INFERENCE-PROOF-GET-DEPTH-MEMOIZED" );
    $str460$_____Answer____ = makeString( "~%~% Answer: ~%" );
    $const461$SomethingExisting = constant_handles.reader_make_constant_shell( makeString( "SomethingExisting" ) );
    $sym462$FORMULA_ARG3 = makeSymbol( "FORMULA-ARG3" );
    $const463$assertionRequiredForJustification = constant_handles.reader_make_constant_shell( makeString( "assertionRequiredForJustificationParaphrase" ) );
    $const464$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
  }

  public static final class $proof_view_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $proof;
    public SubLObject $answer;
    public SubLObject $id_index;
    public SubLObject $properties;
    private static final SubLStructDeclNative structDecl;

    public $proof_view_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$proof = CommonSymbols.NIL;
      this.$answer = CommonSymbols.NIL;
      this.$id_index = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $proof_view_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$proof;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$answer;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$id_index;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$proof = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$answer = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$id_index = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $proof_view_native.class, $sym15$PROOF_VIEW, $sym16$PROOF_VIEW_P, $list17, $list18, new String[] { "$id", "$proof", "$answer", "$id_index", "$properties"
      }, $list19, $list20, $sym21$PROOF_VIEW_INT_PRINT );
    }
  }

  public static final class $proof_view_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $proof_view_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROOF-VIEW-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return proof_view_p( arg1 );
    }
  }

  public static final class $proof_view_entry_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $parent_id;
    public SubLObject $label;
    public SubLObject $object_type;
    public SubLObject $object;
    public SubLObject $proof_view;
    public SubLObject $properties;
    private static final SubLStructDeclNative structDecl;

    public $proof_view_entry_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$parent_id = CommonSymbols.NIL;
      this.$label = CommonSymbols.NIL;
      this.$object_type = CommonSymbols.NIL;
      this.$object = CommonSymbols.NIL;
      this.$proof_view = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $proof_view_entry_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parent_id;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$label;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$object_type;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$object;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$proof_view;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parent_id = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$label = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$object_type = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$object = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$proof_view = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $proof_view_entry_native.class, $sym165$PROOF_VIEW_ENTRY, $sym166$PROOF_VIEW_ENTRY_P, $list167, $list168, new String[] { "$id", "$parent_id", "$label", "$object_type",
        "$object", "$proof_view", "$properties"
      }, $list169, $list170, $sym171$PROOF_VIEW_ENTRY_INT_PRINT );
    }
  }

  public static final class $proof_view_entry_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $proof_view_entry_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROOF-VIEW-ENTRY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return proof_view_entry_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2843 ms synthetic
 */