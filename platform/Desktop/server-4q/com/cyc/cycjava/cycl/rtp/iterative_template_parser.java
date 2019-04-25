package com.cyc.cycjava.cycl.rtp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.psp_syntax;
import com.cyc.cycjava.cycl.numeral_parser;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.psp_lexicon;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.psp_chart;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class iterative_template_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtp.iterative_template_parser";
  public static final String myFingerPrint = "a89e63379d6045ab04a38278dc15526839cd0fe47494f71a7d4957c80f2fc991";
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 715L)
  public static SubLSymbol $kb_node_gathering_modeP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 2909L)
  public static SubLSymbol $kb_node_reify_as_functionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 4968L)
  private static SubLSymbol $kb_node_internal_counter$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 11953L)
  private static SubLSymbol $last_itp_state_created$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12172L)
  private static SubLSymbol $rtp_graphing_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12223L)
  public static SubLSymbol $rtp_trace_aggressivelyP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12356L)
  public static SubLSymbol $rtp_kb_parse_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12637L)
  private static SubLSymbol $rtp_exhaustive_kb_parseP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12872L)
  public static SubLSymbol $rtp_reify_doomed_parsesP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13056L)
  public static SubLSymbol $rtp_latest_kb_parse_tree$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13739L)
  private static SubLSymbol $rtp_component_tokenizations$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13912L)
  private static SubLSymbol $rtp_relevant_tokenization$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLSymbol $dtp_itp_node$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLSymbol $dtp_itp_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 38345L)
  private static SubLSymbol $extend_itp_state_analyze_assertionP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 42043L)
  private static SubLSymbol $npparse_graph_type$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 43771L)
  private static SubLSymbol $trace_itp_state_expansion$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 49537L)
  public static SubLSymbol $possible_nps$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
  private static SubLSymbol $verb_phrasal_template_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
  private static SubLSymbol $verbal_template_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
  private static SubLSymbol $vbar_template_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
  private static SubLSymbol $rtp_vbar_template_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
  private static SubLSymbol $predicative_adjp_template_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
  private static SubLSymbol $nominal_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
  private static SubLSymbol $adjectival_categoryP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58607L)
  private static SubLSymbol $compute_top_level_form_only$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58777L)
  private static SubLSymbol $compute_all_resolvable_expansions$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58980L)
  private static SubLSymbol $inform_about_pruned_templates$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 59038L)
  private static SubLSymbol $set_of_attempted_subparses$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 62747L)
  private static SubLSymbol $ternary_quant_fns$;
  private static final SubLObject $const0$SyntacticNode;
  private static final SubLSymbol $sym1$_CAT;
  private static final SubLObject $const2$relationAllInstance;
  private static final SubLObject $const3$syntacticNodeCategory;
  private static final SubLList $list4;
  private static final SubLObject $const5$ParsingTemplateCategory;
  private static final SubLObject $const6$TemplateParsingMt;
  private static final SubLSymbol $sym7$_TYPE;
  private static final SubLObject $const8$and;
  private static final SubLObject $const9$genls;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLObject $const12$RKFParsingMt;
  private static final SubLSymbol $sym13$_NODE;
  private static final SubLObject $const14$NLPhraseType;
  private static final SubLObject $const15$NLWordForm;
  private static final SubLString $str16$Node__A__D;
  private static final SubLObject $const17$NLPhrase;
  private static final SubLSymbol $sym18$NON_NEGATIVE_INTEGER_P;
  private static final SubLList $list19;
  private static final SubLObject $const20$SyntacticNode_MatrixClause;
  private static final SubLString $str21$Root;
  private static final SubLString $str22$Unrecognized;
  private static final SubLList $list23;
  private static final SubLString $str24$_A_A;
  private static final SubLObject $const25$PhraseFn;
  private static final SubLString $str26$P;
  private static final SubLString $str27$Bar;
  private static final SubLString $str28$____creating_a__A_node__of_type__;
  private static final SubLObject $const29$SententialConstituentType;
  private static final SubLObject $const30$SyntacticChoiceNode;
  private static final SubLString $str31$Choice;
  private static final SubLObject $const32$optionNodes;
  private static final SubLObject $const33$isa;
  private static final SubLSymbol $kw34$BREADTH;
  private static final SubLSymbol $kw35$QUEUE;
  private static final SubLSymbol $kw36$STACK;
  private static final SubLSymbol $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw38$ERROR;
  private static final SubLString $str39$_A_is_not_a__A;
  private static final SubLSymbol $sym40$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw41$CERROR;
  private static final SubLString $str42$continue_anyway;
  private static final SubLSymbol $kw43$WARN;
  private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str45$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str46$attempting_to_bind_direction_link;
  private static final SubLList $list47;
  private static final SubLString $str48$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLObject $const49$CycParseTree;
  private static final SubLObject $const50$CycTokenization;
  private static final SubLObject $const51$CycParsingToken;
  private static final SubLSymbol $sym52$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const53$EverythingPSC;
  private static final SubLObject $const54$syntacticDescendants;
  private static final SubLSymbol $kw55$GAF;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw59$CATEGORY;
  private static final SubLSymbol $kw60$OPTIONS;
  private static final SubLSymbol $kw61$CHOICE;
  private static final SubLSymbol $kw62$SOURCE;
  private static final SubLObject $const63$CycRecursiveTemplateParser;
  private static final SubLSymbol $sym64$CHOICE_CAT;
  private static final SubLSymbol $sym65$CLET;
  private static final SubLSymbol $sym66$PWHEN;
  private static final SubLSymbol $sym67$CAND;
  private static final SubLSymbol $sym68$NULL;
  private static final SubLSymbol $sym69$CSETQ;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$FIF;
  private static final SubLSymbol $sym72$NEW_SYNTACTIC_CHOICE_NODE;
  private static final SubLSymbol $sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE;
  private static final SubLSymbol $sym74$FORT_P;
  private static final SubLSymbol $sym75$FI_ASSERT_INT;
  private static final SubLSymbol $sym76$LIST;
  private static final SubLObject $const77$syntacticNodeCreator;
  private static final SubLObject $const78$InstanceWithRelationFromFn;
  private static final SubLObject $const79$ProgramCopyFn;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$TEST_GAF;
  private static final SubLSymbol $sym83$CHOICE_CAT;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym86$CDOLIST;
  private static final SubLSymbol $sym87$CPUSH;
  private static final SubLObject $const88$excludedOptionNodes;
  private static final SubLSymbol $kw89$MAIN;
  private static final SubLString $str90$restore_syntactic_option__A;
  private static final SubLString $str91$_Restore_Syntactic_Option_;
  private static final SubLString $str92$exclude_syntactic_option__A;
  private static final SubLString $str93$_Exclude_Syntactic_Option_;
  private static final SubLSymbol $kw94$SYNTACTIC_NODE_TOOLKIT;
  private static final SubLSymbol $sym95$CB_LINK_SYNTACTIC_NODE_TOOLKIT;
  private static final SubLSymbol $sym96$EXCLUDE_SYNTACTIC_OPTION;
  private static final SubLSymbol $kw97$HTML_HANDLER;
  private static final SubLSymbol $sym98$RESTORE_SYNTACTIC_OPTION;
  private static final SubLSymbol $kw99$RTP;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$SAVE;
  private static final SubLSymbol $sym102$_RTP_COMPONENT_TOKENIZATIONS_;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$WITH_PARSE_TOKENIZATION;
  private static final SubLSymbol $sym105$_RTP_RELEVANT_TOKENIZATION_;
  private static final SubLSymbol $kw106$OFFSET;
  private static final SubLSymbol $sym107$PIF;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$PROGN;
  private static final SubLSymbol $sym110$SETTING_PARSE_ROOT_NODE;
  private static final SubLObject $const111$tokenizationInputString;
  private static final SubLObject $const112$tokenString;
  private static final SubLObject $const113$nthTokenInTokenization;
  private static final SubLObject $const114$numberOfTokensInTokenization;
  private static final SubLObject $const115$STemplate;
  private static final SubLObject $const116$InferencePSC;
  private static final SubLSymbol $sym117$RELEVANT_MT_IS_GENL_MT;
  private static final SubLString $str118$_S_is_not_a_template_category__;
  private static final SubLObject $const119$parseTreeOfTokenization;
  private static final SubLSymbol $kw120$ASSERTION;
  private static final SubLObject $const121$RewriteSequenceFn;
  private static final SubLObject $const122$ToyParseTreeMt_FullSentences;
  private static final SubLSymbol $sym123$ITP_NODE;
  private static final SubLSymbol $sym124$ITP_NODE_P;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$PRINT_ITP_NODE;
  private static final SubLSymbol $sym130$ITP_NODE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$ITP_NODE_ID;
  private static final SubLSymbol $sym133$_CSETF_ITP_NODE_ID;
  private static final SubLSymbol $sym134$ITP_NODE_PARENT;
  private static final SubLSymbol $sym135$_CSETF_ITP_NODE_PARENT;
  private static final SubLSymbol $sym136$ITP_NODE_COMPONENT;
  private static final SubLSymbol $sym137$_CSETF_ITP_NODE_COMPONENT;
  private static final SubLSymbol $sym138$ITP_NODE_SPAN;
  private static final SubLSymbol $sym139$_CSETF_ITP_NODE_SPAN;
  private static final SubLSymbol $sym140$ITP_NODE_NEW_PARSE;
  private static final SubLSymbol $sym141$_CSETF_ITP_NODE_NEW_PARSE;
  private static final SubLSymbol $sym142$ITP_NODE_ASSERTION;
  private static final SubLSymbol $sym143$_CSETF_ITP_NODE_ASSERTION;
  private static final SubLSymbol $sym144$ITP_NODE_CHILDREN;
  private static final SubLSymbol $sym145$_CSETF_ITP_NODE_CHILDREN;
  private static final SubLSymbol $sym146$ITP_NODE_PERMUTATIONS;
  private static final SubLSymbol $sym147$_CSETF_ITP_NODE_PERMUTATIONS;
  private static final SubLSymbol $sym148$ITP_NODE_SYNTACTIC_NODE;
  private static final SubLSymbol $sym149$_CSETF_ITP_NODE_SYNTACTIC_NODE;
  private static final SubLSymbol $sym150$ITP_NODE_SYNTACTIC_CHOICES;
  private static final SubLSymbol $sym151$_CSETF_ITP_NODE_SYNTACTIC_CHOICES;
  private static final SubLSymbol $kw152$ID;
  private static final SubLSymbol $kw153$PARENT;
  private static final SubLSymbol $kw154$COMPONENT;
  private static final SubLSymbol $kw155$SPAN;
  private static final SubLSymbol $kw156$NEW_PARSE;
  private static final SubLSymbol $kw157$CHILDREN;
  private static final SubLSymbol $kw158$PERMUTATIONS;
  private static final SubLSymbol $kw159$SYNTACTIC_NODE;
  private static final SubLSymbol $kw160$SYNTACTIC_CHOICES;
  private static final SubLString $str161$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw162$BEGIN;
  private static final SubLSymbol $sym163$MAKE_ITP_NODE;
  private static final SubLSymbol $kw164$SLOT;
  private static final SubLSymbol $kw165$END;
  private static final SubLSymbol $sym166$VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD;
  private static final SubLString $str167$_;
  private static final SubLString $str168$__;
  private static final SubLSymbol $sym169$PROPER_LIST_P;
  private static final SubLObject $const170$partOfIBT;
  private static final SubLObject $const171$Cyc;
  private static final SubLObject $const172$NLFunction;
  private static final SubLObject $const173$NLTaggedTermDenotingFunction;
  private static final SubLObject $const174$VPTemplate;
  private static final SubLObject $const175$TheRNPParse;
  private static final SubLSymbol $sym176$_VBAR;
  private static final SubLObject $const177$memberOfList;
  private static final SubLSymbol $sym178$_CHILD;
  private static final SubLObject $const179$TheList;
  private static final SubLList $list180;
  private static final SubLSymbol $sym181$_V;
  private static final SubLObject $const182$syntacticDaughters;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLObject $const185$Verb;
  private static final SubLObject $const186$syntacticNodeNthDaughter;
  private static final SubLList $list187;
  private static final SubLList $list188;
  private static final SubLString $str189$____RTP_____Couldn_t_create_KB_no;
  private static final SubLSymbol $sym190$ITP_STATE;
  private static final SubLSymbol $sym191$ITP_STATE_P;
  private static final SubLList $list192;
  private static final SubLList $list193;
  private static final SubLList $list194;
  private static final SubLList $list195;
  private static final SubLSymbol $sym196$PRINT_ITP_STATE;
  private static final SubLSymbol $sym197$ITP_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list198;
  private static final SubLSymbol $sym199$ITP_STATE_SEQUENCE;
  private static final SubLSymbol $sym200$_CSETF_ITP_STATE_SEQUENCE;
  private static final SubLSymbol $sym201$ITP_STATE_COMPLETE_PARSES_ONLY;
  private static final SubLSymbol $sym202$_CSETF_ITP_STATE_COMPLETE_PARSES_ONLY;
  private static final SubLSymbol $sym203$ITP_STATE_WORK_SET;
  private static final SubLSymbol $sym204$_CSETF_ITP_STATE_WORK_SET;
  private static final SubLSymbol $sym205$ITP_STATE_SOLUTION_SET;
  private static final SubLSymbol $sym206$_CSETF_ITP_STATE_SOLUTION_SET;
  private static final SubLSymbol $sym207$ITP_STATE_SENTENCE;
  private static final SubLSymbol $sym208$_CSETF_ITP_STATE_SENTENCE;
  private static final SubLSymbol $sym209$ITP_STATE_CATEGORY;
  private static final SubLSymbol $sym210$_CSETF_ITP_STATE_CATEGORY;
  private static final SubLSymbol $sym211$ITP_STATE_CACHE;
  private static final SubLSymbol $sym212$_CSETF_ITP_STATE_CACHE;
  private static final SubLSymbol $sym213$ITP_STATE_PSP_CHARTS;
  private static final SubLSymbol $sym214$_CSETF_ITP_STATE_PSP_CHARTS;
  private static final SubLSymbol $sym215$ITP_STATE_WORKING_MT;
  private static final SubLSymbol $sym216$_CSETF_ITP_STATE_WORKING_MT;
  private static final SubLSymbol $kw217$SEQUENCE;
  private static final SubLSymbol $kw218$COMPLETE_PARSES_ONLY;
  private static final SubLSymbol $kw219$WORK_SET;
  private static final SubLSymbol $kw220$SOLUTION_SET;
  private static final SubLSymbol $kw221$SENTENCE;
  private static final SubLSymbol $kw222$CACHE;
  private static final SubLSymbol $kw223$PSP_CHARTS;
  private static final SubLSymbol $kw224$WORKING_MT;
  private static final SubLSymbol $sym225$MAKE_ITP_STATE;
  private static final SubLSymbol $sym226$VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD;
  private static final SubLString $str227$Work___D_Solution___D_KB_Mt___A;
  private static final SubLSymbol $sym228$ITP_NODE_MAX_CHILD_SPAN_LENGTH;
  private static final SubLSymbol $sym229$_;
  private static final SubLSymbol $kw230$DESTROYED;
  private static final SubLSymbol $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY;
  private static final SubLObject $const232$syntacticNodeString;
  private static final SubLString $str233$R;
  private static final SubLObject $const234$proposedMeaning;
  private static final SubLObject $const235$SubLQuoteFn;
  private static final SubLString $str236$Expanding_itp_node__A________S__;
  private static final SubLObject $const237$NBarTemplate;
  private static final SubLList $list238;
  private static final SubLSymbol $kw239$ANY;
  private static final SubLObject $const240$NPTemplate;
  private static final SubLObject $const241$NounPhrase;
  private static final SubLSymbol $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE;
  private static final SubLSymbol $sym243$ITP_PS_PARSE_VBAR;
  private static final SubLSymbol $kw244$NONE;
  private static final SubLString $str245$length_of_chart_for__S____S__;
  private static final SubLObject $const246$gapTypeForTemplateCategory;
  private static final SubLObject $const247$posPredForTemplateCategory;
  private static final SubLString $str248$sent_a_weird_category___S__to_pre;
  private static final SubLObject $const249$verbStrings;
  private static final SubLString $str250$sent_a_non_categorized_pred___S__;
  private static final SubLObject $const251$Noun;
  private static final SubLObject $const252$posForTemplateCategory;
  private static final SubLString $str253$sent_un_categorized_category__s_t;
  private static final SubLSymbol $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_;
  private static final SubLSymbol $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_;
  private static final SubLInteger $int256$64;
  private static final SubLSymbol $sym257$VERBAL_TEMPLATE_CATEGORY_;
  private static final SubLSymbol $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_;
  private static final SubLSymbol $sym259$VBAR_TEMPLATE_CATEGORY_;
  private static final SubLObject $const260$VBarTemplate;
  private static final SubLSymbol $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_;
  private static final SubLSymbol $sym262$RTP_VBAR_TEMPLATE_CATEGORY_;
  private static final SubLObject $const263$RTPVBarTemplateMt;
  private static final SubLObject $const264$assertTemplate_Reln;
  private static final SubLSymbol $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_;
  private static final SubLSymbol $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_;
  private static final SubLObject $const267$AdjPTemplate_Predicative;
  private static final SubLSymbol $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_;
  private static final SubLSymbol $sym269$NOMINAL_CATEGORY_;
  private static final SubLSymbol $sym270$_NOMINAL_CATEGORY__CACHING_STATE_;
  private static final SubLSymbol $sym271$ADJECTIVAL_CATEGORY_;
  private static final SubLObject $const272$Adjective;
  private static final SubLSymbol $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_;
  private static final SubLList $list274;
  private static final SubLSymbol $sym275$RESULT_OF_PARSING_SPAN_LENGTH;
  private static final SubLInteger $int276$100;
  private static final SubLSymbol $sym277$IS_THIS_A_THELIST_SPAN_;
  private static final SubLSymbol $sym278$_;
  private static final SubLSymbol $sym279$_FUNC;
  private static final SubLList $list280;
  private static final SubLSymbol $sym281$MT_IN_ANY_MT_;
  private static final SubLObject $const282$genlMt;
  private static final SubLObject $const283$ParseTreeSandboxMt;
  private static final SubLObject $const284$UniversalVocabularyMt;
  private static final SubLString $str285$Couldn_t_find_a_parse_tree_mt_to_;
  private static final SubLObject $const286$SyntacticNode_Sentential;
  private static final SubLSymbol $sym287$_N;
  private static final SubLObject $const288$dependentMeaning;
  private static final SubLSymbol $sym289$RESULT_OF_PARSING_FORMULA_;
  private static final SubLList $list290;
  private static final SubLList $list291;
  private static final SubLString $str292$____can_t_build_any_meaning_combi;
  private static final SubLList $list293;
  private static final SubLList $list294;
  private static final SubLObject $const295$TheSentenceSubject;
  private static final SubLSymbol $kw296$SUBJECT;
  private static final SubLSymbol $sym297$NL_ATTR_W_LOCATION_;
  private static final SubLList $list298;
  private static final SubLSymbol $sym299$ITP_OUTPUT_SORTING_FUNCTION;
  private static final SubLSymbol $sym300$FIRST;
  private static final SubLObject $const301$AssemblePhraseFn;
  private static final SubLSymbol $sym302$STRINGP;
  private static final SubLSymbol $sym303$UNASSEMBLED_PHRASE_;
  private static final SubLSymbol $sym304$REWRITE_ASSEMBLE_PHRASE;
  private static final SubLSymbol $kw305$SIMPLE;
  private static final SubLObject $const306$termTemplate;
  private static final SubLList $list307;
  private static final SubLObject $const308$assertTemplate;
  private static final SubLObject $const309$termTemplate_Reln;
  private static final SubLObject $const310$termTemplate_Test;
  private static final SubLObject $const311$assertTemplate_Test;
  private static final SubLObject $const312$queryTemplate;
  private static final SubLObject $const313$queryTemplate_Reln;
  private static final SubLObject $const314$queryTemplate_Test;
  private static final SubLString $str315$sent__S_to_force_for_result__;
  private static final SubLList $list316;
  private static final SubLObject $const317$joinTemplateComponents;
  private static final SubLSymbol $kw318$IGNORE;
  private static final SubLSymbol $sym319$SUBSTITUTABLE_CHILD_FORMULA_;
  private static final SubLSymbol $sym320$PARTIAL_PARSE_FILTER_FUNCTION;

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 3092L)
  public static SubLObject kb_node_analyze_category(final SubLObject category, final SubLObject into_mt)
  {
    if( NIL == category )
    {
      return NIL;
    }
    if( NIL == fort_types_interface.mt_in_any_mtP( into_mt ) )
    {
      return NIL;
    }
    SubLObject node_type = NIL;
    SubLObject ling_cat = NIL;
    if( NIL != genls.genlP( category, $const0$SyntacticNode, into_mt, UNPROVIDED ) )
    {
      node_type = category;
      ling_cat = ask_utilities.ask_variable( $sym1$_CAT, ConsesLow.listS( $const2$relationAllInstance, $const3$syntacticNodeCategory, category, $list4 ), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
    }
    else if( NIL != genls.genlP( category, $const5$ParsingTemplateCategory, $const6$TemplateParsingMt, UNPROVIDED ) )
    {
      final SubLObject types = ask_utilities.ask_variable( $sym7$_TYPE, ConsesLow.listS( $const8$and, ConsesLow.listS( $const9$genls, category, $list10 ), $list11 ), $const12$RKFParsingMt, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      ling_cat = types.first();
      final SubLObject node_types = ask_utilities.ask_variable( $sym13$_NODE, ConsesLow.list( $const2$relationAllInstance, $const3$syntacticNodeCategory, $sym13$_NODE, ling_cat ), into_mt, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      node_type = ( ( NIL != list_utilities.singletonP( node_types ) ) ? node_types.first() : $const0$SyntacticNode );
    }
    else if( NIL != isa.isaP( category, $const14$NLPhraseType, into_mt, UNPROVIDED ) )
    {
      ling_cat = category;
      final SubLObject node_types2 = ask_utilities.ask_variable( $sym13$_NODE, ConsesLow.list( $const2$relationAllInstance, $const3$syntacticNodeCategory, $sym13$_NODE, ling_cat ), into_mt, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      node_type = ( ( NIL != list_utilities.singletonP( node_types2 ) ) ? node_types2.first() : $const0$SyntacticNode );
    }
    else
    {
      if( NIL == genls.genlsP( category, $const15$NLWordForm, into_mt, UNPROVIDED ) )
      {
        return NIL;
      }
      ling_cat = category;
      node_type = $const0$SyntacticNode;
    }
    return ConsesLow.list( node_type, ling_cat );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 5021L)
  public static SubLObject reset_kb_node_internal_counter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $kb_node_internal_counter$.setDynamicValue( ZERO_INTEGER, thread );
    return $kb_node_internal_counter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 5148L)
  public static SubLObject next_available_kb_node(final SubLObject type, final SubLObject mt, SubLObject label)
  {
    if( label == UNPROVIDED )
    {
      label = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject kb_node = NIL;
    while ( NIL == kb_node)
    {
      kb_node = parsing_utilities.hypothesize_parse_tree_element( type, mt, UNPROVIDED );
      if( NIL != kb_node && NIL != label )
      {
        fi.fi_rename_int( kb_node, PrintLow.format( NIL, $str16$Node__A__D, label, $kb_node_internal_counter$.getDynamicValue( thread ) ) );
        $kb_node_internal_counter$.setDynamicValue( Numbers.add( $kb_node_internal_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      }
    }
    return kb_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 5689L)
  public static SubLObject new_syntactic_functional_node(final SubLObject into_mt, SubLObject category, SubLObject label)
  {
    if( category == UNPROVIDED )
    {
      category = $const17$NLPhrase;
    }
    if( label == UNPROVIDED )
    {
      label = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kb_node_internal_counter$.getDynamicValue( thread ) && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( $kb_node_internal_counter$.getDynamicValue( thread ) ) )
    {
      throw new AssertionError( $kb_node_internal_counter$.getDynamicValue( thread ) );
    }
    SubLObject current;
    final SubLObject datum = current = kb_node_analyze_category( category, into_mt );
    SubLObject node_type = NIL;
    SubLObject linguistic_category = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    node_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    linguistic_category = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject node_string = NIL;
      SubLObject kb_node = NIL;
      SubLObject instructions = NIL;
      if( label.isString() )
      {
        node_string = label;
      }
      else if( node_type.eql( $const20$SyntacticNode_MatrixClause ) )
      {
        node_string = $str21$Root;
      }
      else if( NIL == linguistic_category )
      {
        node_string = $str22$Unrecognized;
      }
      else if( NIL != list_utilities.proper_list_p( linguistic_category ) )
      {
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = linguistic_category;
        SubLObject func = NIL;
        SubLObject cat = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list23 );
        func = current_$2.first();
        current_$2 = current_$2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list23 );
        cat = current_$2.first();
        current_$2 = current_$2.rest();
        if( NIL == current_$2 )
        {
          node_string = PrintLow.format( NIL, $str24$_A_A, string_utilities.substring( string_utilities.fort_to_string( cat ), TWO_INTEGER, THREE_INTEGER ), func.eql( $const25$PhraseFn ) ? $str26$P : $str27$Bar );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list23 );
        }
      }
      else
      {
        node_string = string_utilities.substring( string_utilities.fort_to_string( linguistic_category ), TWO_INTEGER, UNPROVIDED );
      }
      if( NIL != $rtp_trace_aggressivelyP$.getDynamicValue( thread ) )
      {
        Errors.warn( $str28$____creating_a__A_node__of_type__, node_string, node_type, linguistic_category );
      }
      kb_node = next_available_kb_node( node_type, into_mt, node_string );
      if( NIL != kb_node )
      {
        if( NIL != isa.isaP( linguistic_category, $const29$SententialConstituentType, into_mt, UNPROVIDED ) )
        {
          final SubLObject cat_gaf = ConsesLow.list( $const3$syntacticNodeCategory, kb_node, linguistic_category );
          if( NIL != $kb_node_gathering_modeP$.getDynamicValue( thread ) )
          {
            instructions = ConsesLow.cons( cat_gaf, instructions );
          }
          else
          {
            fi.fi_assert_int( cat_gaf, into_mt, UNPROVIDED, UNPROVIDED );
          }
        }
        return Values.values( kb_node, Sequences.reverse( instructions ) );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 7550L)
  public static SubLObject new_syntactic_choice_node(final SubLObject into_mt, SubLObject options, SubLObject category, SubLObject label)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    if( category == UNPROVIDED )
    {
      category = $const30$SyntacticChoiceNode;
    }
    if( label == UNPROVIDED )
    {
      label = $str31$Choice;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject kb_node = new_syntactic_functional_node( into_mt, category, label );
    SubLObject gafs = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = options;
    SubLObject this_opt = NIL;
    this_opt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isaP( this_opt, $const0$SyntacticNode, into_mt, UNPROVIDED ) )
      {
        final SubLObject daughter_gaf = ConsesLow.list( $const32$optionNodes, kb_node, this_opt );
        if( NIL != $kb_node_gathering_modeP$.getDynamicValue( thread ) )
        {
          gafs = ConsesLow.cons( daughter_gaf, gafs );
        }
        else
        {
          fi.fi_assert_int( daughter_gaf, into_mt, UNPROVIDED, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_opt = cdolist_list_var.first();
    }
    return Values.values( kb_node, Sequences.reverse( gafs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 8073L)
  public static SubLObject kb_nodes_kill(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject kills = ZERO_INTEGER;
    SubLObject cdolist_list_var = ConsesLow.list( $const0$SyntacticNode, $const30$SyntacticChoiceNode, $const49$CycParseTree, $const50$CycTokenization, $const51$CycParsingToken );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node_var = col;
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const33$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$3 = node_var;
          final SubLObject deck_type = $kw36$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw38$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw41$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw43$WARN ) )
                    {
                      Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const33$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const33$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const33$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const33$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const33$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$3, UNPROVIDED );
                        while ( NIL != node_var_$3)
                        {
                          final SubLObject tt_node_var = node_var_$3;
                          SubLObject cdolist_list_var_$15;
                          final SubLObject accessible_modules = cdolist_list_var_$15 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const33$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var_$15.first();
                          while ( NIL != cdolist_list_var_$15)
                          {
                            final SubLObject _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const33$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$18 ) )
                                      {
                                        final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$18, thread );
                                          SubLObject iteration_state_$20;
                                          for( iteration_state_$20 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$20 ); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next( iteration_state_$20 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$20 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject node_$22;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_$22 = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_$22 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_$22,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_$22, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( node_$22 ) && NIL != fi.fi_kill_int( node_$22 ) )
                                                      {
                                                        kills = Numbers.add( kills, ONE_INTEGER );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject node_$23 = NIL;
                                                  node_$23 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_$23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_$23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( node_$23 ) && NIL != fi.fi_kill_int( node_$23 ) )
                                                      {
                                                        kills = Numbers.add( kills, ONE_INTEGER );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_$23 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$11, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$20 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$10, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt_$19 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
                                    mt_$19 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$19 ) )
                                      {
                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$19, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_$24;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_$24 = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_$24 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_$24,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_$24, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( node_$24 ) && NIL != fi.fi_kill_int( node_$24 ) )
                                                    {
                                                      kills = Numbers.add( kills, ONE_INTEGER );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$28 = sol;
                                                SubLObject node_$25 = NIL;
                                                node_$25 = csome_list_var_$28.first();
                                                while ( NIL != csome_list_var_$28)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_$25, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_$25, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( node_$25 ) && NIL != fi.fi_kill_int( node_$25 ) )
                                                    {
                                                      kills = Numbers.add( kills, ONE_INTEGER );
                                                    }
                                                  }
                                                  csome_list_var_$28 = csome_list_var_$28.rest();
                                                  node_$25 = csome_list_var_$28.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$13, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$12, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$16;
                                final SubLObject new_list = cdolist_list_var_$16 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const33$isa ) ), sbhl_search_vars.$sbhl_tv$
                                        .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const33$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$16.first();
                                while ( NIL != cdolist_list_var_$16)
                                {
                                  final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject node_$26;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_$26 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_$26 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_$26,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_$26, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( node_$26 ) && NIL != fi.fi_kill_int( node_$26 ) )
                                          {
                                            kills = Numbers.add( kills, ONE_INTEGER );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject node_$27 = NIL;
                                      node_$27 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_$27, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_$27, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( node_$27 ) && NIL != fi.fi_kill_int( node_$27 ) )
                                          {
                                            kills = Numbers.add( kills, ONE_INTEGER );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        node_$27 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$14, thread );
                                  }
                                  cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                  generating_fn = cdolist_list_var_$16.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$10, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$9, thread );
                            }
                            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                            module_var = cdolist_list_var_$15.first();
                          }
                          SubLObject cdolist_list_var_$17;
                          final SubLObject accessible_modules2 = cdolist_list_var_$17 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const33$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var_$17.first();
                          while ( NIL != cdolist_list_var_$17)
                          {
                            final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$3 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt_$20 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$20 ) )
                                      {
                                        final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$20, thread );
                                          SubLObject iteration_state_$21;
                                          for( iteration_state_$21 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$21 ); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next( iteration_state_$21 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$21 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$17, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$21 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$16, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$18;
                                final SubLObject new_list2 = cdolist_list_var_$18 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$18.first();
                                while ( NIL != cdolist_list_var_$18)
                                {
                                  final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$18, thread );
                                  }
                                  cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                  generating_fn2 = cdolist_list_var_$18.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$11, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$15, thread );
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            module_var2 = cdolist_list_var_$17.first();
                          }
                          node_var_$3 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$12, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$9, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$8, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$11, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$8, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$7, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$7, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$6, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$6, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$5, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return kills;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 8480L)
  public static SubLObject kill_syntactic_node_tree(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym52$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const53$EverythingPSC, thread );
      SubLObject pred_var = $const54$syntacticDescendants;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( self, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( self, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw55$GAF, NIL, NIL );
              SubLObject done_var_$45 = NIL;
              final SubLObject token_var_$46 = NIL;
              while ( NIL == done_var_$45)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$46 );
                final SubLObject valid_$47 = makeBoolean( !token_var_$46.eql( ass ) );
                if( NIL != valid_$47 )
                {
                  kill_syntactic_node_tree( cycl_utilities.formula_arg2( assertions_high.assertion_formula( ass ), UNPROVIDED ) );
                }
                done_var_$45 = makeBoolean( NIL == valid_$47 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      pred_var = $const32$optionNodes;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( self, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( self, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw55$GAF, NIL, NIL );
              SubLObject done_var_$46 = NIL;
              final SubLObject token_var_$47 = NIL;
              while ( NIL == done_var_$46)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$47 );
                final SubLObject valid_$48 = makeBoolean( !token_var_$47.eql( ass ) );
                if( NIL != valid_$48 )
                {
                  kill_syntactic_node_tree( cycl_utilities.formula_arg2( assertions_high.assertion_formula( ass ), UNPROVIDED ) );
                }
                done_var_$46 = makeBoolean( NIL == valid_$48 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return fi.fi_kill_int( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 8962L)
  public static SubLObject with_new_syntactic_kb_node(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject node = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$53 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list56 );
      current_$53 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list56 );
      if( NIL == conses_high.member( current_$53, $list57, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$53 == $kw58$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    }
    final SubLObject category_tail = cdestructuring_bind.property_list_member( $kw59$CATEGORY, current );
    final SubLObject category = ( NIL != category_tail ) ? conses_high.cadr( category_tail ) : NIL;
    final SubLObject options_tail = cdestructuring_bind.property_list_member( $kw60$OPTIONS, current );
    final SubLObject options = ( NIL != options_tail ) ? conses_high.cadr( options_tail ) : NIL;
    final SubLObject choice_tail = cdestructuring_bind.property_list_member( $kw61$CHOICE, current );
    final SubLObject choice = ( NIL != choice_tail ) ? conses_high.cadr( choice_tail ) : NIL;
    final SubLObject source_tail = cdestructuring_bind.property_list_member( $kw62$SOURCE, current );
    final SubLObject source = ( NIL != source_tail ) ? conses_high.cadr( source_tail ) : $const63$CycRecursiveTemplateParser;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject choice_cat = $sym64$CHOICE_CAT;
    return ConsesLow.list( $sym65$CLET, ConsesLow.list( ConsesLow.list( choice_cat, category ) ), ConsesLow.list( $sym66$PWHEN, ConsesLow.list( $sym67$CAND, choice, ConsesLow.list( $sym68$NULL, choice_cat ) ), ConsesLow
        .listS( $sym69$CSETQ, choice_cat, $list70 ) ), ConsesLow.listS( $sym65$CLET, ConsesLow.list( ConsesLow.list( node, ConsesLow.list( $sym71$FIF, choice, ConsesLow.list( $sym72$NEW_SYNTACTIC_CHOICE_NODE, mt,
            options, choice_cat ), ConsesLow.list( $sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category ) ) ) ), ConsesLow.list( $sym66$PWHEN, ConsesLow.list( $sym74$FORT_P, source ), ConsesLow.list( $sym75$FI_ASSERT_INT,
                ConsesLow.list( $sym76$LIST, $const77$syntacticNodeCreator, ConsesLow.listS( $sym76$LIST, $const78$InstanceWithRelationFromFn, ConsesLow.list( $sym76$LIST, $const79$ProgramCopyFn, source ), $list80 ),
                    node ), mt ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 9651L)
  public static SubLObject with_new_syntactic_kb_node_wXgafs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list81 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject node = NIL;
    SubLObject mt = NIL;
    SubLObject new_gafs = NIL;
    SubLObject old_gafs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list81 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list81 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list81 );
    new_gafs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list81 );
    old_gafs = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$54 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list81 );
      current_$54 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list81 );
      if( NIL == conses_high.member( current_$54, $list57, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$54 == $kw58$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list81 );
    }
    final SubLObject category_tail = cdestructuring_bind.property_list_member( $kw59$CATEGORY, current );
    final SubLObject category = ( NIL != category_tail ) ? conses_high.cadr( category_tail ) : NIL;
    final SubLObject options_tail = cdestructuring_bind.property_list_member( $kw60$OPTIONS, current );
    final SubLObject options = ( NIL != options_tail ) ? conses_high.cadr( options_tail ) : NIL;
    final SubLObject choice_tail = cdestructuring_bind.property_list_member( $kw61$CHOICE, current );
    final SubLObject choice = ( NIL != choice_tail ) ? conses_high.cadr( choice_tail ) : NIL;
    final SubLObject source_tail = cdestructuring_bind.property_list_member( $kw62$SOURCE, current );
    final SubLObject source = ( NIL != source_tail ) ? conses_high.cadr( source_tail ) : $const63$CycRecursiveTemplateParser;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject test_gaf = $sym82$TEST_GAF;
    final SubLObject choice_cat = $sym83$CHOICE_CAT;
    return ConsesLow.list( $sym65$CLET, ConsesLow.list( $list84, ConsesLow.list( choice_cat, category ) ), ConsesLow.list( $sym66$PWHEN, ConsesLow.list( $sym67$CAND, choice, ConsesLow.list( $sym68$NULL, choice_cat ) ),
        ConsesLow.listS( $sym69$CSETQ, choice_cat, $list70 ) ), ConsesLow.listS( $sym85$CMULTIPLE_VALUE_BIND, ConsesLow.list( node, new_gafs ), ConsesLow.list( $sym71$FIF, choice, ConsesLow.list(
            $sym72$NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat ), ConsesLow.list( $sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category ) ), ConsesLow.list( $sym66$PWHEN, ConsesLow.list( $sym74$FORT_P, source ),
                ConsesLow.list( $sym75$FI_ASSERT_INT, ConsesLow.list( $sym76$LIST, $const77$syntacticNodeCreator, ConsesLow.listS( $sym76$LIST, $const78$InstanceWithRelationFromFn, ConsesLow.list( $sym76$LIST,
                    $const79$ProgramCopyFn, source ), $list80 ), node ), mt ) ), ConsesLow.list( $sym86$CDOLIST, ConsesLow.list( test_gaf, new_gafs ), ConsesLow.list( $sym87$CPUSH, test_gaf, old_gafs ) ), ConsesLow
                        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 10496L)
  public static SubLObject syntactic_option_node_p(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject trueP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym52$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const53$EverythingPSC, thread );
      trueP = list_utilities.sublisp_boolean( kb_mapping.gather_gaf_arg_index( v_term, TWO_INTEGER, $const32$optionNodes, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return trueP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 10679L)
  public static SubLObject cb_link_syntactic_node_toolkit(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym52$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const53$EverythingPSC, thread );
      if( NIL != kb_mapping.gather_gaf_arg_index( v_term, TWO_INTEGER, $const88$excludedOptionNodes, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw89$MAIN );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str90$restore_syntactic_option__A, cb_utilities.cb_fort_identifier( v_term ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str91$_Restore_Syntactic_Option_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      }
      else
      {
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw89$MAIN );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str92$exclude_syntactic_option__A, cb_utilities.cb_fort_identifier( v_term ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str93$_Exclude_Syntactic_Option_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 11177L)
  public static SubLObject exclude_syntactic_option(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject this_node = cb_utilities.cb_guess_fort( id, UNPROVIDED );
    SubLObject assertion = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym52$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const53$EverythingPSC, thread );
      assertion = kb_mapping.gather_gaf_arg_index( this_node, TWO_INTEGER, $const32$optionNodes, UNPROVIDED, UNPROVIDED ).first();
      if( NIL != assertion )
      {
        result = fi.fi_assert_int( ConsesLow.list( $const88$excludedOptionNodes, cycl_utilities.formula_arg1( assertions_high.assertion_formula( assertion ), UNPROVIDED ), this_node ), assertions_high.assertion_mt(
            assertion ), UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 11587L)
  public static SubLObject restore_syntactic_option(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject this_node = cb_utilities.cb_guess_fort( id, UNPROVIDED );
    SubLObject assertion = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym52$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const53$EverythingPSC, thread );
      assertion = kb_mapping.gather_gaf_arg_index( this_node, TWO_INTEGER, $const88$excludedOptionNodes, UNPROVIDED, UNPROVIDED ).first();
      if( NIL != assertion )
      {
        result = fi.fi_unassert_int( assertions_high.assertion_formula( assertion ), assertions_high.assertion_mt( assertion ) );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12502L)
  public static SubLObject asserting_treesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $rtp_kb_parse_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13212L)
  public static SubLObject while_saving_rtp_parse_into_kb(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym65$CLET, $list100, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13340L)
  public static SubLObject save_rtp_kb_parse_if_desired(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $rtp_latest_kb_parse_tree$.getDynamicValue( thread ).eql( $kw101$SAVE ) )
    {
      $rtp_latest_kb_parse_tree$.setDynamicValue( node, thread );
      return node;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13503L)
  public static SubLObject get_rtp_kb_parse_node()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $rtp_latest_kb_parse_tree$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13582L)
  public static SubLObject get_and_erase_rtp_kb_parse_node()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject node = $rtp_latest_kb_parse_tree$.getDynamicValue( thread );
    $rtp_latest_kb_parse_tree$.setDynamicValue( NIL, thread );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 14042L)
  public static SubLObject with_the_rtp_parse_tokenization(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject save_here = NIL;
    SubLObject offset = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    save_here = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    offset = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym104$WITH_PARSE_TOKENIZATION, ConsesLow.list( $sym105$_RTP_RELEVANT_TOKENIZATION_, $kw106$OFFSET, offset ), ConsesLow.list( $sym107$PIF, $list108, ConsesLow.list( $sym109$PROGN, ConsesLow
          .listS( $sym110$SETTING_PARSE_ROOT_NODE, ConsesLow.list( save_here ), ConsesLow.append( body, NIL ) ) ), reader.bq_cons( $sym109$PROGN, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 14460L)
  public static SubLObject rtp_component_tokenization(final SubLObject component, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $rtp_kb_parse_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !component.isString() && NIL == join_template_components_p( component ) && NIL == parsing_utilities.result_of_parsing_formulaP( component ) )
    {
      return NIL;
    }
    SubLObject tokenization = dictionary.dictionary_lookup( $rtp_component_tokenizations$.getGlobalValue(), component, UNPROVIDED );
    if( NIL == constant_handles.valid_constantP( tokenization, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding( thread );
      final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding( thread );
      try
      {
        fi.$fi_error$.bind( NIL, thread );
        fi.$fi_warning$.bind( NIL, thread );
        SubLObject input_string = NIL;
        if( component.isString() )
        {
          input_string = component;
        }
        else if( NIL != join_template_components_p( component ) )
        {
          input_string = join_template_components_word_list( component );
        }
        else if( NIL != parsing_utilities.result_of_parsing_formulaP( component ) )
        {
          input_string = parsing_utilities.result_of_parsing_words( component );
        }
        if( NIL != asserting_treesP() )
        {
          tokenization = parsing_utilities.hypothesize_parse_tree_element( $const50$CycTokenization, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED );
          dictionary.dictionary_enter( $rtp_component_tokenizations$.getGlobalValue(), component, tokenization );
          if( NIL != tokenization && NIL != input_string )
          {
            fi.fi_assert_int( ConsesLow.list( $const111$tokenizationInputString, tokenization, input_string ), mt, UNPROVIDED, UNPROVIDED );
          }
          SubLObject num = NIL;
          SubLObject list_var = NIL;
          SubLObject word = NIL;
          SubLObject n = NIL;
          list_var = rkf_concept_harvester.rkf_ch_string_tokenize( input_string );
          word = list_var.first();
          for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), n = Numbers.add( ONE_INTEGER, n ) )
          {
            num = number_utilities.f_1X( n );
            final SubLObject kb_token = parsing_utilities.hypothesize_parse_tree_element( $const51$CycParsingToken, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED );
            fi.fi_assert_int( ConsesLow.list( $const112$tokenString, kb_token, word ), mt, UNPROVIDED, UNPROVIDED );
            fi.fi_assert_int( ConsesLow.list( $const113$nthTokenInTokenization, tokenization, num, kb_token ), mt, UNPROVIDED, UNPROVIDED );
          }
          fi.fi_assert_int( ConsesLow.list( $const114$numberOfTokensInTokenization, tokenization, num ), mt, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        fi.$fi_warning$.rebind( _prev_bind_2, thread );
        fi.$fi_error$.rebind( _prev_bind_0, thread );
      }
    }
    return tokenization;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 16248L)
  public static SubLObject rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    rtp_datastructures.reset_all_rtp_datastructure_caches();
    return itp_sequel( sentence, category, syntax_mt, semantics_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 16631L)
  public static SubLObject rtp_parse_exp_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    rtp_datastructures.reset_all_rtp_datastructure_caches();
    final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding( thread );
    try
    {
      parsing_vars.$perform_vp_parser_expansion$.bind( T, thread );
      answers = itp_sequel( sentence, category, syntax_mt, semantics_mt );
    }
    finally
    {
      parsing_vars.$perform_vp_parser_expansion$.rebind( _prev_bind_0, thread );
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 17142L)
  public static SubLObject rtp_parse_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding( thread );
    try
    {
      parsing_vars.$perform_vp_parser_expansion$.bind( T, thread );
      answers = itp_sequel( sentence, category, syntax_mt, semantics_mt );
    }
    finally
    {
      parsing_vars.$perform_vp_parser_expansion$.rebind( _prev_bind_0, thread );
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 17605L)
  public static SubLObject itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject the_cyc_parse_tree = NIL;
    final SubLObject _prev_bind_0 = rtp_vars.$rtp_semantic_mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = rtp_vars.$rtp_syntactic_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $rtp_relevant_tokenization$.currentBinding( thread );
    try
    {
      rtp_vars.$rtp_semantic_mt$.bind( ( NIL != semantics_mt ) ? semantics_mt : $const116$InferencePSC, thread );
      rtp_vars.$rtp_syntactic_mt$.bind( syntax_mt, thread );
      $rtp_relevant_tokenization$.bind( rtp_component_tokenization( sentence, UNPROVIDED ), thread );
      rtp_initialize.possibly_initialize_and_populate_rtp( UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$58 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
        if( NIL == genls.genlP( category, $const5$ParsingTemplateCategory, UNPROVIDED, UNPROVIDED ) )
        {
          Errors.warn( $str118$_S_is_not_a_template_category__, category );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$58, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$57, thread );
      }
      final SubLObject state = new_itp_state( sentence, category, UNPROVIDED );
      $last_itp_state_created$.setDynamicValue( state, thread );
      prime_itp_pump( state, syntax_mt );
      expand_itp_state_completely( state, syntax_mt );
      answers = cat_itp( state );
      if( NIL != asserting_treesP() && NIL == $rtp_exhaustive_kb_parseP$.getDynamicValue( thread ) )
      {
        the_cyc_parse_tree = reify_itp( state );
        if( NIL != the_cyc_parse_tree && NIL != $rtp_relevant_tokenization$.getDynamicValue( thread ) )
        {
          fi.fi_assert_int( ConsesLow.list( $const119$parseTreeOfTokenization, the_cyc_parse_tree, $rtp_relevant_tokenization$.getDynamicValue( thread ) ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED,
              UNPROVIDED );
        }
        save_rtp_kb_parse_if_desired( the_cyc_parse_tree );
      }
      destroy_itp_state( state );
    }
    finally
    {
      $rtp_relevant_tokenization$.rebind( _prev_bind_3, thread );
      rtp_vars.$rtp_syntactic_mt$.rebind( _prev_bind_2, thread );
      rtp_vars.$rtp_semantic_mt$.rebind( _prev_bind_0, thread );
    }
    answers = rkf_concept_harvester.rkf_ch_simplify_assemble_phrases( answers );
    if( rtp_vars.$rtp_return_style$.getDynamicValue( thread ) != $kw120$ASSERTION )
    {
      answers = delete_duplicate_tp_results( answers );
    }
    return Values.values( answers, the_cyc_parse_tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 19218L)
  public static SubLObject categorized_rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    rtp_datastructures.reset_all_rtp_datastructure_caches();
    return categorized_itp_sequel( sentence, category, syntax_mt, semantics_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 19657L)
  public static SubLObject categorized_itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding( thread );
    try
    {
      rtp_vars.$rtp_return_style$.bind( $kw120$ASSERTION, thread );
      result = itp_sequel( sentence, category, syntax_mt, semantics_mt );
    }
    finally
    {
      rtp_vars.$rtp_return_style$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 20075L)
  public static SubLObject delete_duplicate_tp_results(final SubLObject answers)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = answers;
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( v_answer.first(), Sequences.delete_duplicates( conses_high.second( v_answer ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 20303L)
  public static SubLObject itp_rewrite(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( syntax_mt == UNPROVIDED )
    {
      syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( semantics_mt == UNPROVIDED )
    {
      semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rewrites_only( itp_sequel( sentence, category, syntax_mt, semantics_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 20596L)
  public static SubLObject rewrites_only(final SubLObject answers)
  {
    SubLObject result = NIL;
    SubLObject rewrites = NIL;
    SubLObject cdolist_list_var = answers;
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rewrites = rewrites_helper( conses_high.second( v_answer ) );
      if( NIL != rewrites )
      {
        result = ConsesLow.cons( ConsesLow.list( v_answer.first(), rewrites ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21097L)
  public static SubLObject rewrites_helper(final SubLObject answers)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = answers;
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( v_answer ).eql( $const121$RewriteSequenceFn ) )
      {
        result = ConsesLow.cons( v_answer, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21480L)
  public static SubLObject itp_nuke_syntactic_nodes(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const122$ToyParseTreeMt_FullSentences;
    }
    return kb_nodes_kill( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_itp_node( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $itp_node_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_id(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_parent(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_component(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_span(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_new_parse(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_assertion(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_children(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_permutations(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_syntactic_node(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject itp_node_syntactic_choices(final SubLObject v_object)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_parent(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_component(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_span(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_new_parse(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_assertion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_children(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_permutations(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_syntactic_node(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject _csetf_itp_node_syntactic_choices(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_node_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject make_itp_node(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $itp_node_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw152$ID ) )
      {
        _csetf_itp_node_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw153$PARENT ) )
      {
        _csetf_itp_node_parent( v_new, current_value );
      }
      else if( pcase_var.eql( $kw154$COMPONENT ) )
      {
        _csetf_itp_node_component( v_new, current_value );
      }
      else if( pcase_var.eql( $kw155$SPAN ) )
      {
        _csetf_itp_node_span( v_new, current_value );
      }
      else if( pcase_var.eql( $kw156$NEW_PARSE ) )
      {
        _csetf_itp_node_new_parse( v_new, current_value );
      }
      else if( pcase_var.eql( $kw120$ASSERTION ) )
      {
        _csetf_itp_node_assertion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw157$CHILDREN ) )
      {
        _csetf_itp_node_children( v_new, current_value );
      }
      else if( pcase_var.eql( $kw158$PERMUTATIONS ) )
      {
        _csetf_itp_node_permutations( v_new, current_value );
      }
      else if( pcase_var.eql( $kw159$SYNTACTIC_NODE ) )
      {
        _csetf_itp_node_syntactic_node( v_new, current_value );
      }
      else if( pcase_var.eql( $kw160$SYNTACTIC_CHOICES ) )
      {
        _csetf_itp_node_syntactic_choices( v_new, current_value );
      }
      else
      {
        Errors.error( $str161$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject visit_defstruct_itp_node(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw162$BEGIN, $sym163$MAKE_ITP_NODE, TEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw152$ID, itp_node_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw153$PARENT, itp_node_parent( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw154$COMPONENT, itp_node_component( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw155$SPAN, itp_node_span( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw156$NEW_PARSE, itp_node_new_parse( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw120$ASSERTION, itp_node_assertion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw157$CHILDREN, itp_node_children( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw158$PERMUTATIONS, itp_node_permutations( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw159$SYNTACTIC_NODE, itp_node_syntactic_node( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw160$SYNTACTIC_CHOICES, itp_node_syntactic_choices( obj ) );
    Functions.funcall( visitor_fn, obj, $kw165$END, $sym163$MAKE_ITP_NODE, TEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
  public static SubLObject visit_defstruct_object_itp_node_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_itp_node( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 22387L)
  public static SubLObject print_itp_node(final SubLObject itp_node, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( itp_node, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, itp_node, T, T );
      print_high.princ( itp_node_id( itp_node ), stream );
      print_high.princ( $str167$_, stream );
      print_high.princ( itp_node_component( itp_node ), stream );
      if( NIL != $rtp_trace_aggressivelyP$.getDynamicValue( thread ) )
      {
        PrintLow.format( stream, $str168$__ );
      }
      else
      {
        print_high.princ( $str167$_, stream );
      }
      print_high.prin1( itp_node_new_parse( itp_node ), stream );
      print_high.princ( $str167$_, stream );
      print_high.prin1( itp_node_syntactic_node( itp_node ), stream );
      print_macros.print_unreadable_object_postamble( stream, itp_node, T, T );
    }
    return itp_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 22866L)
  public static SubLObject construct_itp_node(final SubLObject parent, final SubLObject span, final SubLObject component, final SubLObject assertion, final SubLObject id)
  {
    final SubLObject self = make_itp_node( UNPROVIDED );
    _csetf_itp_node_id( self, id );
    _csetf_itp_node_parent( self, parent );
    _csetf_itp_node_span( self, span );
    _csetf_itp_node_component( self, component );
    _csetf_itp_node_assertion( self, assertion );
    _csetf_itp_node_new_parse( self, NIL );
    _csetf_itp_node_children( self, NIL );
    _csetf_itp_node_permutations( self, NIL );
    _csetf_itp_node_syntactic_node( self, NIL );
    _csetf_itp_node_syntactic_choices( self, NIL );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 23427L)
  public static SubLObject add_itp_node_child(final SubLObject self, final SubLObject child, SubLObject kb_node)
  {
    if( kb_node == UNPROVIDED )
    {
      kb_node = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject children = itp_node_children( self );
    children = ConsesLow.cons( child, children );
    _csetf_itp_node_children( self, children );
    if( NIL != kb_node )
    {
      _csetf_itp_node_syntactic_node( child, kb_node );
      if( NIL != asserting_treesP() )
      {
        final SubLObject parental_node = itp_node_syntactic_node( self );
        if( NIL != parental_node )
        {
          parsing_utilities.syntactic_node_add_dtr( parental_node, kb_node, NIL, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
        }
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 23889L)
  public static SubLObject itp_node_create_initial_head(final SubLObject self, final SubLObject gene_pool, final SubLObject cat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != itp_node_p( self ) : self;
    assert NIL != list_utilities.proper_list_p( gene_pool ) : gene_pool;
    final SubLObject my_node = itp_node_syntactic_node( self );
    SubLObject new_itp_node = NIL;
    final SubLObject the_span = initial_span_gap( self, gene_pool );
    if( NIL == my_node )
    {
      return NIL;
    }
    final SubLObject head_node = new_syntactic_functional_node( $rtp_kb_parse_mt$.getDynamicValue( thread ), cat, UNPROVIDED );
    if( NIL != forts.fort_p( $const63$CycRecursiveTemplateParser ) )
    {
      fi.fi_assert_int( ConsesLow.list( $const77$syntacticNodeCreator, ConsesLow.list( $const78$InstanceWithRelationFromFn, ConsesLow.list( $const79$ProgramCopyFn, $const63$CycRecursiveTemplateParser ),
          $const170$partOfIBT, $const171$Cyc ), head_node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    }
    parsing_utilities.syntactic_node_add_head_dtr( my_node, head_node, NIL, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
    new_itp_node = construct_itp_node( self, itp_node_span( self ), cat, NIL, NIL );
    return new_itp_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 24882L)
  public static SubLObject itp_node_get_legitimate_children(final SubLObject self)
  {
    SubLObject valid_children = NIL;
    SubLObject cdolist_list_var = itp_node_children( self );
    SubLObject this_child = NIL;
    this_child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject the_parse = itp_node_new_parse( this_child );
      if( NIL != parsing_utilities.vp_parse_from_pspP( the_parse ) )
      {
        valid_children = ConsesLow.cons( this_child, valid_children );
      }
      else if( NIL != itp_node_get_legitimate_children( this_child ) )
      {
        valid_children = ConsesLow.cons( this_child, valid_children );
      }
      else if( NIL == parsing_utilities.result_of_parsing_formulaP( the_parse ) && ( NIL == isa.isa_in_any_mtP( cycl_utilities.formula_arg0( the_parse ), $const172$NLFunction ) || NIL != isa.isa_in_any_mtP(
          cycl_utilities.formula_arg0( the_parse ), $const173$NLTaggedTermDenotingFunction ) ) && !parsing_utilities.result_of_parsing_category( itp_node_component( this_child ) ).eql( $const174$VPTemplate ) )
      {
        valid_children = ConsesLow.cons( this_child, valid_children );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_child = cdolist_list_var.first();
    }
    if( NIL != list_utilities.proper_list_p( valid_children ) && NIL == full_span_coverageP( self, valid_children ) )
    {
      final SubLObject my_parse = itp_node_new_parse( self );
      final SubLObject my_component = itp_node_component( self );
      if( NIL != join_template_components_p( my_parse ) || cycl_utilities.formula_arg0( my_parse ).eql( $const175$TheRNPParse ) )
      {
        return NIL;
      }
      if( NIL != parsing_utilities.result_of_parsing_formulaP( my_component ) && NIL != verb_phrasal_template_categoryP( parsing_utilities.result_of_parsing_category( my_component ) ) )
      {
        final SubLObject vbars = ask_utilities.ask_variable( $sym176$_VBAR, ConsesLow.listS( $const8$and, ConsesLow.list( $const177$memberOfList, $sym178$_CHILD, reader.bq_cons( $const179$TheList, Mapping.mapcar(
            $sym148$ITP_NODE_SYNTACTIC_NODE, valid_children ) ) ), $list180 ), $const53$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject head_itp_node = NIL;
        SubLObject my_kb_node = NIL;
        if( NIL != list_utilities.singletonP( vbars ) )
        {
          my_kb_node = vbars.first();
          _csetf_itp_node_syntactic_node( self, my_kb_node );
          final SubLObject head_verb = ask_utilities.ask_variable( $sym181$_V, ConsesLow.listS( $const8$and, ConsesLow.listS( $const182$syntacticDaughters, my_kb_node, $list183 ), $list184 ), $const53$EverythingPSC,
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != list_utilities.singletonP( head_verb ) )
          {
            head_itp_node = construct_itp_node( self, itp_node_span( self ), $const185$Verb, NIL, NIL );
            _csetf_itp_node_syntactic_node( head_itp_node, head_verb.first() );
          }
        }
        if( NIL == head_itp_node && NIL != extended_vbar_template_categoryP( parsing_utilities.result_of_parsing_category( my_component ) ) && NIL == ask_utilities.ask_variable( $sym13$_NODE, ConsesLow.listS(
            $const8$and, ConsesLow.listS( $const186$syntacticNodeNthDaughter, itp_node_syntactic_node( self ), $list187 ), $list188 ), $const53$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          head_itp_node = itp_node_create_initial_head( self, valid_children, $const185$Verb );
        }
        if( NIL != itp_node_p( head_itp_node ) )
        {
          _csetf_itp_node_new_parse( head_itp_node, cycl_utilities.formula_arg0( my_parse ) );
          valid_children = ConsesLow.cons( head_itp_node, valid_children );
        }
      }
    }
    return valid_children;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 27672L)
  public static SubLObject itp_node_get_dominance_gafs(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == itp_node_syntactic_choices( self ) )
    {
      return NIL;
    }
    SubLObject gafs = NIL;
    final SubLObject my_node = itp_node_syntactic_node( self );
    if( NIL == my_node )
    {
      return NIL;
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( itp_node_syntactic_choices( self ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject component = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject node_and_children = thread.secondMultipleValue();
      thread.resetMultipleValues();
      gafs = ConsesLow.cons( ConsesLow.list( $const32$optionNodes, my_node, node_and_children.first() ), gafs );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 28192L)
  public static SubLObject itp_node_clear_syntactic_choices(final SubLObject self, SubLObject cat)
  {
    if( cat == UNPROVIDED )
    {
      cat = NIL;
    }
    if( NIL != itp_node_syntactic_choices( self ) )
    {
      if( NIL != cat )
      {
        SubLObject cdolist_list_var = dictionary.dictionary_keys( itp_node_syntactic_choices( self ) );
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != genls.genlP( key, cat, $const6$TemplateParsingMt, UNPROVIDED ) )
          {
            dictionary.dictionary_enter( itp_node_syntactic_choices( self ), key, NIL );
          }
          cdolist_list_var = cdolist_list_var.rest();
          key = cdolist_list_var.first();
        }
      }
      else
      {
        _csetf_itp_node_syntactic_choices( self, dictionary.new_dictionary( EQL, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 28940L)
  public static SubLObject itp_node_initialize_syntactic_choices(final SubLObject self, SubLObject cat)
  {
    if( cat == UNPROVIDED )
    {
      cat = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject offspring = dictionary.new_dictionary( EQL, UNPROVIDED );
    final SubLObject valid_children = itp_node_get_legitimate_children( self );
    SubLObject return_gafs = NIL;
    itp_node_clear_syntactic_choices( self, cat );
    SubLObject cdolist_list_var = valid_children;
    SubLObject this_child = NIL;
    this_child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject this_comp = itp_node_component( this_child );
      if( NIL != parsing_utilities.result_of_parsing_formulaP( this_comp ) )
      {
        final SubLObject raw_cat = parsing_utilities.result_of_parsing_category( this_comp );
        final SubLObject high_cat = parsing_utilities.result_of_parsing_highest_category( this_comp, cat );
        if( NIL == cat || NIL != genls.genl_in_any_mtP( raw_cat, cat ) )
        {
          dictionary.dictionary_enter( offspring, high_cat, ConsesLow.cons( this_child, dictionary.dictionary_lookup( offspring, high_cat, UNPROVIDED ) ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_child = cdolist_list_var.first();
    }
    if( NIL != list_utilities.lengthG( dictionary.dictionary_keys( offspring ), ONE_INTEGER, UNPROVIDED ) )
    {
      SubLObject new_nodes = NIL;
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( offspring ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject category = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject kids = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding( thread );
        try
        {
          $kb_node_gathering_modeP$.bind( T, thread );
          final SubLObject choice_cat = category;
          thread.resetMultipleValues();
          final SubLObject node = new_syntactic_functional_node( $rtp_kb_parse_mt$.getDynamicValue( thread ), category, UNPROVIDED );
          final SubLObject ignore_this = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != forts.fort_p( $const63$CycRecursiveTemplateParser ) )
          {
            fi.fi_assert_int( ConsesLow.list( $const77$syntacticNodeCreator, ConsesLow.list( $const78$InstanceWithRelationFromFn, ConsesLow.list( $const79$ProgramCopyFn, $const63$CycRecursiveTemplateParser ),
                $const170$partOfIBT, $const171$Cyc ), node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          }
          SubLObject cdolist_list_var2 = ignore_this;
          SubLObject test_gaf = NIL;
          test_gaf = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            return_gafs = ConsesLow.cons( test_gaf, return_gafs );
            cdolist_list_var2 = cdolist_list_var2.rest();
            test_gaf = cdolist_list_var2.first();
          }
          dictionary.dictionary_enter( itp_node_syntactic_choices( self ), category, ConsesLow.cons( node, kids ) );
          new_nodes = ConsesLow.cons( node, new_nodes );
        }
        finally
        {
          $kb_node_gathering_modeP$.rebind( _prev_bind_0, thread );
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      final SubLObject _prev_bind_2 = $kb_node_gathering_modeP$.currentBinding( thread );
      try
      {
        $kb_node_gathering_modeP$.bind( T, thread );
        SubLObject choice_cat2 = NIL;
        if( NIL == choice_cat2 )
        {
          choice_cat2 = $const30$SyntacticChoiceNode;
        }
        thread.resetMultipleValues();
        final SubLObject choice_node = new_syntactic_choice_node( $rtp_kb_parse_mt$.getDynamicValue( thread ), new_nodes, choice_cat2, UNPROVIDED );
        final SubLObject ignore_this2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != forts.fort_p( $const63$CycRecursiveTemplateParser ) )
        {
          fi.fi_assert_int( ConsesLow.list( $const77$syntacticNodeCreator, ConsesLow.list( $const78$InstanceWithRelationFromFn, ConsesLow.list( $const79$ProgramCopyFn, $const63$CycRecursiveTemplateParser ),
              $const170$partOfIBT, $const171$Cyc ), choice_node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        }
        SubLObject cdolist_list_var3 = ignore_this2;
        SubLObject test_gaf2 = NIL;
        test_gaf2 = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          return_gafs = ConsesLow.cons( test_gaf2, return_gafs );
          cdolist_list_var3 = cdolist_list_var3.rest();
          test_gaf2 = cdolist_list_var3.first();
        }
        parsing_utilities.syntactic_node_add_dtr( itp_node_syntactic_node( self ), choice_node, NIL, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
      }
      finally
      {
        $kb_node_gathering_modeP$.rebind( _prev_bind_2, thread );
      }
    }
    return Values.values( T, return_gafs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 31188L)
  public static SubLObject itp_choice_node_for_component(final SubLObject self, final SubLObject key_component)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != itp_node_syntactic_choices( self ) )
    {
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( itp_node_syntactic_choices( self ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject this_component = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject node_and_references = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( this_component.equal( key_component ) )
        {
          return Values.values( node_and_references.first(), node_and_references.rest() );
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 31679L)
  public static SubLObject itp_node_find_or_initialize_syntactic_choices(final SubLObject self, final SubLObject component)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject the_node = itp_choice_node_for_component( self, component );
    SubLObject the_gafs = NIL;
    if( NIL == the_node )
    {
      thread.resetMultipleValues();
      final SubLObject initP = itp_node_initialize_syntactic_choices( self, ( NIL != parsing_utilities.result_of_parsing_formulaP( component ) ) ? parsing_utilities.result_of_parsing_highest_category( component,
          UNPROVIDED ) : NIL );
      final SubLObject gafs = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != initP )
      {
        the_node = itp_choice_node_for_component( self, component );
      }
      if( NIL != gafs )
      {
        the_gafs = gafs;
      }
    }
    return Values.values( the_node, the_gafs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 32405L)
  public static SubLObject itp_node_tokenization(final SubLObject self)
  {
    return rtp_component_tokenization( itp_node_new_parse( self ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 32621L)
  public static SubLObject itp_node_equalP(final SubLObject one, final SubLObject other)
  {
    return makeBoolean( itp_node_span( other ).equal( itp_node_span( one ) ) && itp_node_component( one ).equal( itp_node_component( other ) ) && itp_node_new_parse( one ).equal( itp_node_new_parse( other ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 32940L)
  public static SubLObject find_or_create_itp_node_syntactic_node(final SubLObject itp_node, final SubLObject into_mt, SubLObject category, SubLObject parent)
  {
    if( category == UNPROVIDED )
    {
      category = NIL;
    }
    if( parent == UNPROVIDED )
    {
      parent = NIL;
    }
    if( NIL == itp_node )
    {
      return NIL;
    }
    final SubLObject old_node = itp_node_syntactic_node( itp_node );
    if( NIL != old_node )
    {
      return old_node;
    }
    if( NIL == fort_types_interface.mt_in_any_mtP( into_mt ) )
    {
      return NIL;
    }
    final SubLObject kb_node = new_syntactic_functional_node( into_mt, category, UNPROVIDED );
    if( NIL != kb_node )
    {
      _csetf_itp_node_syntactic_node( itp_node, kb_node );
      if( NIL != itp_node_p( parent ) )
      {
        final SubLObject parent_kb_node = itp_node_syntactic_node( parent );
        if( NIL != isa.isaP( parent_kb_node, $const0$SyntacticNode, into_mt, UNPROVIDED ) )
        {
          parsing_utilities.syntactic_node_add_dtr( parent_kb_node, kb_node, NIL, into_mt );
        }
      }
    }
    else
    {
      Errors.warn( $str189$____RTP_____Couldn_t_create_KB_no, itp_node, into_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_itp_state( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $itp_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_sequence(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_complete_parses_only(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_work_set(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_solution_set(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_sentence(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_category(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_cache(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_psp_charts(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject itp_state_working_mt(final SubLObject v_object)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_sequence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_complete_parses_only(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_work_set(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_solution_set(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_category(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_psp_charts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject _csetf_itp_state_working_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject make_itp_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $itp_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw217$SEQUENCE ) )
      {
        _csetf_itp_state_sequence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw218$COMPLETE_PARSES_ONLY ) )
      {
        _csetf_itp_state_complete_parses_only( v_new, current_value );
      }
      else if( pcase_var.eql( $kw219$WORK_SET ) )
      {
        _csetf_itp_state_work_set( v_new, current_value );
      }
      else if( pcase_var.eql( $kw220$SOLUTION_SET ) )
      {
        _csetf_itp_state_solution_set( v_new, current_value );
      }
      else if( pcase_var.eql( $kw221$SENTENCE ) )
      {
        _csetf_itp_state_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$CATEGORY ) )
      {
        _csetf_itp_state_category( v_new, current_value );
      }
      else if( pcase_var.eql( $kw222$CACHE ) )
      {
        _csetf_itp_state_cache( v_new, current_value );
      }
      else if( pcase_var.eql( $kw223$PSP_CHARTS ) )
      {
        _csetf_itp_state_psp_charts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw224$WORKING_MT ) )
      {
        _csetf_itp_state_working_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str161$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject visit_defstruct_itp_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw162$BEGIN, $sym225$MAKE_ITP_STATE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw217$SEQUENCE, itp_state_sequence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw218$COMPLETE_PARSES_ONLY, itp_state_complete_parses_only( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw219$WORK_SET, itp_state_work_set( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw220$SOLUTION_SET, itp_state_solution_set( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw221$SENTENCE, itp_state_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw59$CATEGORY, itp_state_category( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw222$CACHE, itp_state_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw223$PSP_CHARTS, itp_state_psp_charts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw164$SLOT, $kw224$WORKING_MT, itp_state_working_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw165$END, $sym225$MAKE_ITP_STATE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
  public static SubLObject visit_defstruct_object_itp_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_itp_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34819L)
  public static SubLObject print_itp_state(final SubLObject itp_state, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( itp_state, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, itp_state, T, T );
      PrintLow.format( stream, $str227$Work___D_Solution___D_KB_Mt___A, new SubLObject[] { queues.p_queue_size( itp_state_work_set( itp_state ) ), Sequences.length( itp_state_solution_set( itp_state ) ),
        itp_state_working_mt( itp_state )
      } );
      print_macros.print_unreadable_object_postamble( stream, itp_state, T, T );
    }
    return itp_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 35189L)
  public static SubLObject new_itp_state(final SubLObject sentence, SubLObject category, SubLObject complete_parses_only)
  {
    if( category == UNPROVIDED )
    {
      category = $const115$STemplate;
    }
    if( complete_parses_only == UNPROVIDED )
    {
      complete_parses_only = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state = make_itp_state( UNPROVIDED );
    _csetf_itp_state_sequence( state, ZERO_INTEGER );
    _csetf_itp_state_complete_parses_only( state, complete_parses_only );
    _csetf_itp_state_sentence( state, sentence );
    _csetf_itp_state_category( state, category );
    _csetf_itp_state_cache( state, dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    _csetf_itp_state_work_set( state, queues.create_p_queue( NIL, $sym228$ITP_NODE_MAX_CHILD_SPAN_LENGTH, $sym229$_ ) );
    _csetf_itp_state_solution_set( state, NIL );
    _csetf_itp_state_psp_charts( state, new_itp_state_psp_chart_dictionary() );
    _csetf_itp_state_working_mt( state, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 35986L)
  public static SubLObject destroy_itp_state(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary.clear_dictionary( itp_state_cache( state ) );
    final SubLObject chart_dictionary = itp_state_psp_charts( state );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( chart_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject chart = thread.secondMultipleValue();
      thread.resetMultipleValues();
      psp_chart.destroy_psp_chart( chart );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    dictionary.clear_dictionary( chart_dictionary );
    return $kw230$DESTROYED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36309L)
  public static SubLObject new_itp_state_psp_chart_dictionary_internal()
  {
    return dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36309L)
  public static SubLObject new_itp_state_psp_chart_dictionary()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return new_itp_state_psp_chart_dictionary_internal();
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY, ZERO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY, caching_state );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( new_itp_state_psp_chart_dictionary_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36455L)
  public static SubLObject add_to_itp_solution(final SubLObject state, final SubLObject solution)
  {
    SubLObject current = solution;
    SubLObject solutions = itp_state_solution_set( state );
    while ( NIL != itp_node_p( current ))
    {
      final SubLObject item_var = current;
      if( NIL == conses_high.member( item_var, solutions, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
      {
        solutions = ConsesLow.cons( item_var, solutions );
      }
      current = itp_node_parent( current );
    }
    _csetf_itp_state_solution_set( state, solutions );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36833L)
  public static SubLObject memoize_itp_attempt(final SubLObject state, final SubLObject node)
  {
    final SubLObject v_cache = itp_state_cache( state );
    final SubLObject key = itp_node_component( node );
    if( NIL != key )
    {
      dictionary_utilities.dictionary_pushnew( v_cache, key, node, UNPROVIDED, UNPROVIDED );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 37163L)
  public static SubLObject is_a_known_itp_attemptP(final SubLObject state, final SubLObject problem)
  {
    final SubLObject v_cache = itp_state_cache( state );
    final SubLObject hit = dictionary.dictionary_lookup( v_cache, problem, UNPROVIDED );
    return hit;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 37400L)
  public static SubLObject prime_itp_pump(final SubLObject itp_state, final SubLObject mt)
  {
    final SubLObject parses = recognition.categorizing_template_parse( itp_state_sentence( itp_state ), mt, itp_state_category( itp_state ), itp_state_complete_parses_only( itp_state ) );
    final SubLObject undo_extension_traceP = NIL;
    SubLObject cdolist_list_var = parses;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject span = parse.first();
      SubLObject cdolist_list_var_$59;
      final SubLObject possibles = cdolist_list_var_$59 = conses_high.second( parse );
      SubLObject possible = NIL;
      possible = cdolist_list_var_$59.first();
      while ( NIL != cdolist_list_var_$59)
      {
        final SubLObject formula = possible.first();
        final SubLObject assertion = conses_high.second( possible );
        extend_itp_state( itp_state, span, NIL, formula, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cdolist_list_var_$59 = cdolist_list_var_$59.rest();
        possible = cdolist_list_var_$59.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return itp_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 38411L)
  public static SubLObject extend_itp_state(final SubLObject state, final SubLObject span, final SubLObject old_formula, final SubLObject new_parse, final SubLObject assertion, SubLObject parent,
      SubLObject psp_node_if_any, SubLObject graph_type)
  {
    if( parent == UNPROVIDED )
    {
      parent = NIL;
    }
    if( psp_node_if_any == UNPROVIDED )
    {
      psp_node_if_any = NIL;
    }
    if( graph_type == UNPROVIDED )
    {
      graph_type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != itp_state_p( state ) : state;
    if( NIL != parent && !assertionsDisabledInClass && NIL == itp_node_p( parent ) )
    {
      throw new AssertionError( parent );
    }
    SubLObject id = itp_state_sequence( state );
    final SubLObject node = construct_itp_node( parent, span, old_formula, assertion, id );
    _csetf_itp_node_new_parse( node, new_parse );
    _csetf_itp_node_syntactic_node( node, psp_node_if_any );
    final SubLObject into_mt = ( NIL != $rtp_exhaustive_kb_parseP$.getDynamicValue( thread ) ) ? itp_state_working_mt( state ) : NIL;
    if( NIL == parent )
    {
      if( NIL != into_mt )
      {
        final SubLObject kb_node = find_or_create_itp_node_syntactic_node( node, into_mt, $const20$SyntacticNode_MatrixClause, UNPROVIDED );
        if( NIL != kb_node && NIL != parsing_utilities.result_of_parsing_formulaP( old_formula ) )
        {
          fi.fi_assert_int( ConsesLow.list( $const232$syntacticNodeString, kb_node, parsing_utilities.result_of_parsing_words( old_formula ) ), into_mt, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    else
    {
      SubLObject child_kb_node = NIL;
      if( NIL != into_mt && NIL == child_kb_node )
      {
        final SubLObject category = ( NIL != $extend_itp_state_analyze_assertionP$.getDynamicValue( thread ) && NIL != assertion_handles.assertion_p( assertion ) ) ? cycl_utilities.formula_arg1( assertions_high
            .assertion_formula( assertion ), UNPROVIDED ) : assertion;
        if( NIL == assertion_handles.assertion_p( category ) && NIL != genls.genlP( category, $const5$ParsingTemplateCategory, $const6$TemplateParsingMt, UNPROVIDED ) )
        {
          child_kb_node = new_syntactic_functional_node( into_mt, category, UNPROVIDED );
          if( NIL != child_kb_node && NIL != parsing_utilities.result_of_parsing_formulaP( old_formula ) )
          {
            fi.fi_assert_int( ConsesLow.list( $const232$syntacticNodeString, child_kb_node, parsing_utilities.result_of_parsing_words( old_formula ) ), into_mt, UNPROVIDED, UNPROVIDED );
          }
        }
      }
      add_itp_node_child( parent, node, child_kb_node );
    }
    queues.p_enqueue( node, itp_state_work_set( state ) );
    id = Numbers.add( id, ONE_INTEGER );
    _csetf_itp_state_sequence( state, id );
    memoize_itp_attempt( state, node );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 40795L)
  public static SubLObject extend_itp_state_multiple(final SubLObject state, final SubLObject span, final SubLObject formula, final SubLObject answers, final SubLObject parent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != itp_state_p( state ) : state;
    assert NIL != itp_node_p( parent ) : parent;
    final SubLObject solution = answers.first();
    final SubLObject subspan = solution.first();
    final SubLObject subparses = conses_high.second( solution );
    SubLObject absolute_span = NIL;
    SubLObject listy_span = NIL;
    if( span.first().eql( $const179$TheList ) )
    {
      listy_span = span;
    }
    else
    {
      listy_span = ConsesLow.cons( $const179$TheList, span );
    }
    absolute_span = compute_correct_span( listy_span, subspan );
    adjust_the_spans( subparses, absolute_span, UNPROVIDED );
    final SubLObject kb_node = NIL;
    SubLObject cdolist_list_var = subparses;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject form = parse.first();
      final SubLObject assertion = conses_high.second( parse );
      final SubLObject undo_extension_traceP = NIL;
      if( !form.isList() || NIL == conses_high.member( formula, form, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0 = $extend_itp_state_analyze_assertionP$.currentBinding( thread );
        try
        {
          $extend_itp_state_analyze_assertionP$.bind( T, thread );
          extend_itp_state( state, absolute_span, formula, form, assertion, parent, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          $extend_itp_state_analyze_assertionP$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 42092L)
  public static SubLObject extend_itp_state_by_ps_parse(final SubLObject state, final SubLObject span, final SubLObject component, SubLObject psp_parse, final SubLObject parent, final SubLObject pos_of_parse)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject real_span = span.first().eql( $const179$TheList ) ? span.rest() : span;
    SubLObject interpretations = NIL;
    SubLObject psp_node_if_any = psp_parse.first();
    SubLObject node = NIL;
    if( NIL == psp_node_if_any || NIL != forts.fort_p( psp_node_if_any ) )
    {
      psp_parse = psp_parse.rest();
    }
    else
    {
      psp_node_if_any = NIL;
    }
    SubLObject cdolist_list_var = psp_parse;
    SubLObject meaning = NIL;
    meaning = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject formula = narts_high.nart_expand( meaning );
      final SubLObject item_var;
      final SubLObject adjusted_formula = item_var = adjust_the_spans( formula, real_span, UNPROVIDED );
      if( NIL == conses_high.member( item_var, interpretations, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        interpretations = ConsesLow.cons( item_var, interpretations );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meaning = cdolist_list_var.first();
    }
    cdolist_list_var = interpretations;
    SubLObject interpretation = NIL;
    interpretation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      node = extend_itp_state( state, real_span, component, interpretation, pos_of_parse, parent, psp_node_if_any, $npparse_graph_type$.getDynamicValue( thread ) );
      if( NIL != $rtp_exhaustive_kb_parseP$.getDynamicValue( thread ) )
      {
        final SubLObject kb_node = itp_node_syntactic_node( node );
        final SubLObject into_mt = itp_state_working_mt( state );
        if( NIL != kb_node && NIL != into_mt )
        {
          fi.fi_assert_int( ConsesLow.list( $const234$proposedMeaning, kb_node, ConsesLow.list( $const235$SubLQuoteFn, interpretation ) ), into_mt, UNPROVIDED, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      interpretation = cdolist_list_var.first();
    }
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 43828L)
  public static SubLObject expand_itp_state(final SubLObject state, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current = queues.p_dequeue( itp_state_work_set( state ), UNPROVIDED );
    final SubLObject span = itp_node_span( current );
    final SubLObject formula = itp_node_new_parse( current );
    final SubLObject components = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates( formula );
    SubLObject parts = ZERO_INTEGER;
    SubLObject good = ZERO_INTEGER;
    SubLObject listy_span = NIL;
    if( NIL != $trace_itp_state_expansion$.getDynamicValue( thread ) )
    {
      PrintLow.format( T, $str236$Expanding_itp_node__A________S__, current, itp_node_new_parse( current ) );
    }
    if( NIL != components )
    {
      if( span.first().eql( $const179$TheList ) )
      {
        listy_span = span;
      }
      else
      {
        listy_span = ConsesLow.cons( $const179$TheList, span );
      }
    }
    SubLObject cdolist_list_var = components;
    SubLObject component = NIL;
    component = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject words = parsing_utilities.result_of_parsing_words( component );
      final SubLObject subspan = parsing_utilities.result_of_parsing_span( component );
      final SubLObject category = parsing_utilities.result_of_parsing_category( component );
      parts = Numbers.add( parts, ONE_INTEGER );
      if( NIL == parsing_utilities.result_of_parsing_formulaP( component ) && ( ( NIL == verbal_template_categoryP( category ) && NIL == number_template_categoryP( category )
          && ( NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue( thread ) || ( NIL == adjectival_categoryP( category ) && NIL == nominal_categoryP( category ) ) ) ) || ( NIL != nominal_categoryP(
              category ) && NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue( thread ) ) ) )
      {
        good = Numbers.add( good, ONE_INTEGER );
      }
      else
      {
        final SubLObject v_cache = is_a_known_itp_attemptP( state, component );
        if( NIL != v_cache && !v_cache.eql( current ) )
        {
          SubLObject cdolist_list_var_$60 = v_cache;
          SubLObject known_node = NIL;
          known_node = cdolist_list_var_$60.first();
          while ( NIL != cdolist_list_var_$60)
          {
            add_itp_node_child( current, known_node, UNPROVIDED );
            cdolist_list_var_$60 = cdolist_list_var_$60.rest();
            known_node = cdolist_list_var_$60.first();
          }
          good = Numbers.add( good, ONE_INTEGER );
        }
        else if( NIL == v_cache || v_cache.eql( current ) )
        {
          final SubLObject answers = recognition.categorizing_template_parse( words, mt, category, UNPROVIDED );
          final SubLObject absolute_span = compute_correct_span( listy_span, subspan );
          if( NIL != answers )
          {
            extend_itp_state_multiple( state, absolute_span, component, answers, current );
          }
          if( NIL != nominal_categoryP( category ) )
          {
            if( NIL != parsing_vars.$perform_np_parser_expansion$.getDynamicValue( thread ) )
            {
              final SubLObject pcase_var = category;
              if( pcase_var.eql( $const237$NBarTemplate ) )
              {
                if( NIL != appropriate_span_for_nbar_parsingP( words, subspan ) )
                {
                  final SubLObject chart = itp_find_or_create_appropriate_chart( state, subspan, words, mt );
                  final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart );
                  final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state, thread );
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                    try
                    {
                      final SubLObject _prev_bind_0_$61 = parsing_vars.$psp_chart$.currentBinding( thread );
                      final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
                      try
                      {
                        parsing_vars.$psp_chart$.bind( chart, thread );
                        parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
                        final SubLObject parses = itp_ps_get_cycls_for_phrase( words, span, $list238, $kw239$ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ) );
                        extend_itp_state_by_ps_parse( state, absolute_span, component, parses, current, $const237$NBarTemplate );
                      }
                      finally
                      {
                        parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_2, thread );
                        parsing_vars.$psp_chart$.rebind( _prev_bind_0_$61, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              else if( pcase_var.eql( $const240$NPTemplate ) && NIL != appropriate_span_for_np_parsingP( words, subspan ) )
              {
                final SubLObject chart = itp_find_or_create_appropriate_chart( state, subspan, words, mt );
                final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart );
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    final SubLObject _prev_bind_0_$63 = parsing_vars.$psp_chart$.currentBinding( thread );
                    try
                    {
                      parsing_vars.$psp_chart$.bind( chart, thread );
                      final SubLObject np_parses = itp_ps_get_cycls_for_phrase( words, span, $const241$NounPhrase, $kw239$ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ) );
                      extend_itp_state_by_ps_parse( state, absolute_span, component, np_parses, current, $const240$NPTemplate );
                    }
                    finally
                    {
                      parsing_vars.$psp_chart$.rebind( _prev_bind_0_$63, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
                }
              }
            }
            good = Numbers.add( good, ONE_INTEGER );
          }
          else if( NIL != predicative_adjp_template_categoryP( category ) )
          {
            if( NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue( thread ) )
            {
              SubLObject psp_node_if_any = NIL;
              SubLObject adjp_parses = NIL;
              final SubLObject chart2 = itp_find_or_create_appropriate_chart( state, subspan, words, mt );
              final SubLObject local_state2 = psp_chart.psp_chart_memoization_state( chart2 );
              final SubLObject _prev_bind_3 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state2, thread );
                final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
                try
                {
                  final SubLObject _prev_bind_0_$65 = parsing_vars.$psp_chart$.currentBinding( thread );
                  try
                  {
                    parsing_vars.$psp_chart$.bind( chart2, thread );
                    final SubLObject _prev_bind_0_$66 = parsing_vars.$parse_tokenization$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = parsing_vars.$parse_tokenization_offset$.currentBinding( thread );
                    try
                    {
                      parsing_vars.$parse_tokenization$.bind( $rtp_relevant_tokenization$.getDynamicValue( thread ), thread );
                      parsing_vars.$parse_tokenization_offset$.bind( span.first(), thread );
                      if( NIL != asserting_treesP() )
                      {
                        final SubLObject _prev_bind_0_$67 = parsing_vars.$parse_root_node$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$68 = parsing_vars.$reify_parse_nodesP$.currentBinding( thread );
                        try
                        {
                          parsing_vars.$parse_root_node$.bind( NIL, thread );
                          parsing_vars.$reify_parse_nodesP$.bind( Symbols.boundp( psp_node_if_any ), thread );
                          adjp_parses = psp_main.ps_parse_predicative_adjp( words, pred_for_category( category ), psp_lexicon.get_default_psp_lexicon( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), UNPROVIDED,
                              UNPROVIDED ), UNPROVIDED );
                          psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue( thread );
                        }
                        finally
                        {
                          parsing_vars.$reify_parse_nodesP$.rebind( _prev_bind_1_$68, thread );
                          parsing_vars.$parse_root_node$.rebind( _prev_bind_0_$67, thread );
                        }
                      }
                      else
                      {
                        adjp_parses = psp_main.ps_parse_predicative_adjp( words, pred_for_category( category ), psp_lexicon.get_default_psp_lexicon( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), UNPROVIDED,
                            UNPROVIDED ), UNPROVIDED );
                      }
                    }
                    finally
                    {
                      parsing_vars.$parse_tokenization_offset$.rebind( _prev_bind_4, thread );
                      parsing_vars.$parse_tokenization$.rebind( _prev_bind_0_$66, thread );
                    }
                    adjp_parses = ConsesLow.cons( psp_node_if_any, adjp_parses );
                    extend_itp_state_by_ps_parse( state, absolute_span, component, adjp_parses, current, category );
                  }
                  finally
                  {
                    parsing_vars.$psp_chart$.rebind( _prev_bind_0_$65, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_3, thread );
              }
            }
            good = Numbers.add( good, ONE_INTEGER );
          }
          else if( NIL != vbar_template_categoryP( category ) )
          {
            if( NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue( thread ) && NIL != appropriate_span_for_vbar_parsingP( words, subspan ) )
            {
              final SubLObject chart3 = itp_find_or_create_appropriate_chart( state, subspan, words, mt );
              final SubLObject local_state3 = psp_chart.psp_chart_memoization_state( chart3 );
              final SubLObject _prev_bind_5 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state3, thread );
                final SubLObject original_memoization_process3 = memoization_state.memoization_state_original_process( local_state3 );
                try
                {
                  final SubLObject _prev_bind_0_$69 = parsing_vars.$psp_chart$.currentBinding( thread );
                  try
                  {
                    parsing_vars.$psp_chart$.bind( chart3, thread );
                    final SubLObject vp_parses = itp_ps_parse_vbar( words, span, category, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ) );
                    extend_itp_state_by_ps_parse( state, absolute_span, component, vp_parses, current, category );
                  }
                  finally
                  {
                    parsing_vars.$psp_chart$.rebind( _prev_bind_0_$69, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state3, original_memoization_process3 );
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_5, thread );
              }
            }
            good = Numbers.add( good, ONE_INTEGER );
          }
          else if( NIL != number_template_categoryP( category ) )
          {
            final SubLObject number_parses = ConsesLow.list( numeral_parser.string_to_interval( ( NIL != string_utilities.english_ordinal_number_string_p( words ) ) ? string_utilities
                .english_ordinal_string_to_cardinal_string( words ) : words ) );
            extend_itp_state_by_ps_parse( state, absolute_span, component, number_parses, current, category );
            good = Numbers.add( good, ONE_INTEGER );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      component = cdolist_list_var.first();
    }
    if( good.numE( parts ) )
    {
      add_to_itp_solution( state, current );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 49646L)
  public static SubLObject appropriate_span_for_np_parsingP(final SubLObject words, final SubLObject subspan)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $possible_nps$.getDynamicValue( thread ) )
    {
      return subl_promotions.memberP( words, $possible_nps$.getDynamicValue( thread ), EQUALP, UNPROVIDED );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 49978L)
  public static SubLObject appropriate_span_for_vbar_parsingP(final SubLObject words, final SubLObject subspan)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50092L)
  public static SubLObject appropriate_span_for_nbar_parsingP(final SubLObject words, final SubLObject subspan)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50206L)
  public static SubLObject itp_ps_get_cycls_for_phrase_internal(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject psp_node_if_any = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_return_mode$.bind( parsing_vars.$psp_return_mode$.getDynamicValue( thread ), thread );
      final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon( mt, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$72 = parsing_vars.$parse_tokenization$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization_offset$.currentBinding( thread );
      try
      {
        parsing_vars.$parse_tokenization$.bind( $rtp_relevant_tokenization$.getDynamicValue( thread ), thread );
        parsing_vars.$parse_tokenization_offset$.bind( span.first(), thread );
        if( NIL != asserting_treesP() )
        {
          final SubLObject _prev_bind_0_$73 = parsing_vars.$parse_root_node$.currentBinding( thread );
          final SubLObject _prev_bind_1_$74 = parsing_vars.$reify_parse_nodesP$.currentBinding( thread );
          try
          {
            parsing_vars.$parse_root_node$.bind( NIL, thread );
            parsing_vars.$reify_parse_nodesP$.bind( Symbols.boundp( psp_node_if_any ), thread );
            ans = psp_main.ps_get_cycls_for_phrase( words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED );
            psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue( thread );
          }
          finally
          {
            parsing_vars.$reify_parse_nodesP$.rebind( _prev_bind_1_$74, thread );
            parsing_vars.$parse_root_node$.rebind( _prev_bind_0_$73, thread );
          }
        }
        else
        {
          ans = psp_main.ps_get_cycls_for_phrase( words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        parsing_vars.$parse_tokenization_offset$.rebind( _prev_bind_2, thread );
        parsing_vars.$parse_tokenization$.rebind( _prev_bind_0_$72, thread );
      }
    }
    finally
    {
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.cons( psp_node_if_any, ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50206L)
  public static SubLObject itp_ps_get_cycls_for_phrase(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return itp_ps_get_cycls_for_phrase_internal( words, span, category, pos_pred, non_trivialP, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE, SIX_INTEGER, NIL, EQUALP, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( words, span, category, pos_pred, non_trivialP, mt );
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
        if( words.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( span.equalp( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( category.equalp( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( pos_pred.equalp( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( non_trivialP.equalp( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && mt.equalp( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( itp_ps_get_cycls_for_phrase_internal( words, span, category, pos_pred, non_trivialP, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( words, span, category, pos_pred, non_trivialP, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50644L)
  public static SubLObject itp_ps_parse_vbar_internal(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt)
  {
    if( category == UNPROVIDED )
    {
      category = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_pred = pred_for_category( category );
    final SubLObject gap_type = gap_type_for_category( category );
    SubLObject psp_node_if_any = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_vars.$parse_tokenization_offset$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_return_mode$.bind( parsing_vars.$psp_return_mode$.getDynamicValue( thread ), thread );
      parsing_vars.$parse_tokenization$.bind( $rtp_relevant_tokenization$.getDynamicValue( thread ), thread );
      parsing_vars.$parse_tokenization_offset$.bind( span.first(), thread );
      if( NIL != asserting_treesP() )
      {
        final SubLObject _prev_bind_0_$75 = parsing_vars.$parse_root_node$.currentBinding( thread );
        final SubLObject _prev_bind_1_$76 = parsing_vars.$reify_parse_nodesP$.currentBinding( thread );
        try
        {
          parsing_vars.$parse_root_node$.bind( NIL, thread );
          parsing_vars.$reify_parse_nodesP$.bind( Symbols.boundp( psp_node_if_any ), thread );
          ans = psp_main.ps_parse_vbar( words, pos_pred, psp_lexicon.get_default_psp_lexicon( mt, UNPROVIDED, UNPROVIDED ), gap_type );
          psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue( thread );
        }
        finally
        {
          parsing_vars.$reify_parse_nodesP$.rebind( _prev_bind_1_$76, thread );
          parsing_vars.$parse_root_node$.rebind( _prev_bind_0_$75, thread );
        }
      }
      else
      {
        ans = psp_main.ps_parse_vbar( words, pos_pred, psp_lexicon.get_default_psp_lexicon( mt, UNPROVIDED, UNPROVIDED ), gap_type );
      }
    }
    finally
    {
      parsing_vars.$parse_tokenization_offset$.rebind( _prev_bind_3, thread );
      parsing_vars.$parse_tokenization$.rebind( _prev_bind_2, thread );
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.cons( psp_node_if_any, ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50644L)
  public static SubLObject itp_ps_parse_vbar(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt)
  {
    if( category == UNPROVIDED )
    {
      category = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return itp_ps_parse_vbar_internal( words, span, category, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym243$ITP_PS_PARSE_VBAR, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym243$ITP_PS_PARSE_VBAR, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym243$ITP_PS_PARSE_VBAR, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( words, span, category, mt );
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
        if( words.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( span.equalp( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( category.equalp( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt.equalp( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( itp_ps_parse_vbar_internal( words, span, category, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( words, span, category, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 51104L)
  public static SubLObject itp_find_or_create_appropriate_chart(final SubLObject state, final SubLObject span_with_the_list, final SubLObject words, final SubLObject lex_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject chart_dictionary = itp_state_psp_charts( state );
    final SubLObject span = span_with_the_list.rest();
    SubLObject result;
    SubLObject iteration_state;
    for( result = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( chart_dictionary ) ); NIL == result && NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject chart = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != itp_subspanP( span, chart_span ) )
      {
        result = chart;
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    if( NIL == result )
    {
      result = get_chart_from_extra_psp_charts( words );
    }
    if( NIL == result )
    {
      final SubLObject new_chart = psp_syntax.psp_chart_for_string( words, psp_lexicon.get_default_psp_lexicon( lex_mt, UNPROVIDED, UNPROVIDED ), $kw244$NONE, NIL );
      dictionary.dictionary_enter( itp_state_psp_charts( state ), conses_high.copy_list( span ), new_chart );
      result = new_chart;
    }
    if( rtp_vars.$rtp_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      recognition.rtp_tracer_output( ONE_INTEGER, ConsesLow.list( $str245$length_of_chart_for__S____S__, words, psp_chart.psp_edge_count( result ) ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52173L)
  public static SubLObject get_chart_from_extra_psp_charts(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject good_chart = NIL;
    if( NIL == good_chart )
    {
      SubLObject csome_list_var = parsing_vars.$psp_extra_charts$.getDynamicValue( thread );
      SubLObject chart = NIL;
      chart = csome_list_var.first();
      while ( NIL == good_chart && NIL != csome_list_var)
      {
        if( NIL != psp_main.psp_find_string_in_chart( string, chart ) )
        {
          good_chart = chart;
        }
        csome_list_var = csome_list_var.rest();
        chart = csome_list_var.first();
      }
    }
    return good_chart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52407L)
  public static SubLObject itp_subspanP(final SubLObject subspan, final SubLObject superspan)
  {
    return Sequences.search( subspan, superspan, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52493L)
  public static SubLObject gap_type_for_category(final SubLObject cat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( cat ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.fpred_value( cat, $const246$gapTypeForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      return $kw244$NONE;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52920L)
  public static SubLObject pred_for_category(final SubLObject cat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( cat ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.fpred_value( cat, $const247$posPredForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      Errors.warn( $str248$sent_a_weird_category___S__to_pre, cat );
      return $const249$verbStrings;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 53469L)
  public static SubLObject rtp_cat_for_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( pred ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.fpred_value( pred, $const247$posPredForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      Errors.warn( $str250$sent_a_non_categorized_pred___S__, pred );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 53998L)
  public static SubLObject rtp_cat_for_pos(final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( pos ) )
    {
      return NIL;
    }
    if( pos.eql( $const251$Noun ) )
    {
      return $const240$NPTemplate;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.fpred_value( pos, $const252$posForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      Errors.warn( $str253$sent_un_categorized_category__s_t, pos );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 54558L)
  public static SubLObject pos_for_rtp_cat(final SubLObject cat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( cat ) )
    {
      return NIL;
    }
    if( cat.eql( $const240$NPTemplate ) )
    {
      return $const251$Noun;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.fpred_value( cat, $const252$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      Errors.warn( $str253$sent_un_categorized_category__s_t, cat );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55128L)
  public static SubLObject best_rtp_cat_for_preds(final SubLObject preds)
  {
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var;
      SubLObject pred;
      for( csome_list_var = preds, pred = NIL, pred = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = rtp_cat_for_pred( pred ), csome_list_var = csome_list_var.rest(), pred = csome_list_var
          .first() )
      {
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
  public static SubLObject clear_verb_phrasal_template_categoryP()
  {
    final SubLObject cs = $verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
  public static SubLObject remove_verb_phrasal_template_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $verb_phrasal_template_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
  public static SubLObject verb_phrasal_template_categoryP_internal(final SubLObject category)
  {
    return makeBoolean( NIL != verbal_template_categoryP( category ) && NIL == genls.genl_in_any_mtP( category, $const115$STemplate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
  public static SubLObject verb_phrasal_template_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_, $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_, $int256$64, EQL, ONE_INTEGER,
          SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( verb_phrasal_template_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
  public static SubLObject clear_verbal_template_categoryP()
  {
    final SubLObject cs = $verbal_template_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
  public static SubLObject remove_verbal_template_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $verbal_template_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
  public static SubLObject verbal_template_categoryP_internal(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( category ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.pred_values( category, $const252$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.memberP( $const185$Verb, result, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
  public static SubLObject verbal_template_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $verbal_template_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym257$VERBAL_TEMPLATE_CATEGORY_, $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_, $int256$64, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( verbal_template_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
  public static SubLObject clear_vbar_template_categoryP()
  {
    final SubLObject cs = $vbar_template_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
  public static SubLObject remove_vbar_template_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $vbar_template_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
  public static SubLObject vbar_template_categoryP_internal(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( category ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = genls.genlP( category, $const260$VBarTemplate, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
  public static SubLObject vbar_template_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $vbar_template_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym259$VBAR_TEMPLATE_CATEGORY_, $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( vbar_template_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
  public static SubLObject clear_rtp_vbar_template_categoryP()
  {
    final SubLObject cs = $rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
  public static SubLObject remove_rtp_vbar_template_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rtp_vbar_template_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
  public static SubLObject rtp_vbar_template_categoryP_internal(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( category ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( $const263$RTPVBarTemplateMt, thread );
      SubLObject template = NIL;
      final SubLObject pred_var = $const264$assertTemplate_Reln;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( category, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( category, TWO_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw55$GAF, NIL, NIL );
              SubLObject done_var_$77 = NIL;
              final SubLObject token_var_$78 = NIL;
              while ( NIL == done_var_$77)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$78 );
                final SubLObject valid_$79 = makeBoolean( !token_var_$78.eql( assertion ) );
                if( NIL != valid_$79 )
                {
                  template = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                  if( NIL != genls.genlP( template, $const174$VPTemplate, UNPROVIDED, UNPROVIDED ) )
                  {
                    result = T;
                  }
                }
                done_var_$77 = makeBoolean( NIL == valid_$79 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$80, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
  public static SubLObject rtp_vbar_template_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym262$RTP_VBAR_TEMPLATE_CATEGORY_, $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rtp_vbar_template_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56638L)
  public static SubLObject extended_vbar_template_categoryP(final SubLObject category)
  {
    return makeBoolean( NIL != vbar_template_categoryP( category ) || NIL != rtp_vbar_template_categoryP( category ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
  public static SubLObject clear_predicative_adjp_template_categoryP()
  {
    final SubLObject cs = $predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
  public static SubLObject remove_predicative_adjp_template_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $predicative_adjp_template_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
  public static SubLObject predicative_adjp_template_categoryP_internal(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( category ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = genls.genlP( category, $const267$AdjPTemplate_Predicative, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
  public static SubLObject predicative_adjp_template_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_, $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( predicative_adjp_template_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
  public static SubLObject clear_nominal_categoryP()
  {
    final SubLObject cs = $nominal_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
  public static SubLObject remove_nominal_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $nominal_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
  public static SubLObject nominal_categoryP_internal(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( category ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.pred_values( category, $const252$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.memberP( $const251$Noun, result, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
  public static SubLObject nominal_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $nominal_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym269$NOMINAL_CATEGORY_, $sym270$_NOMINAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( nominal_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
  public static SubLObject clear_adjectival_categoryP()
  {
    final SubLObject cs = $adjectival_categoryP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
  public static SubLObject remove_adjectival_categoryP(final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $adjectival_categoryP_caching_state$.getGlobalValue(), ConsesLow.list( category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
  public static SubLObject adjectival_categoryP_internal(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( category ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym117$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ), thread );
      result = kb_mapping_utilities.pred_values( category, $const252$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.memberP( $const272$Adjective, result, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
  public static SubLObject adjectival_categoryP(final SubLObject category)
  {
    SubLObject caching_state = $adjectival_categoryP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym271$ADJECTIVAL_CATEGORY_, $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( adjectival_categoryP_internal( category ) ) );
      memoization_state.caching_state_put( caching_state, category, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57765L)
  public static SubLObject number_template_categoryP(final SubLObject category)
  {
    return subl_promotions.memberP( category, $list274, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57885L)
  public static SubLObject verbal_categoryP(final SubLObject word_cat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return lexicon_accessors.genl_posP( word_cat, $const185$Verb, rtp_vars.$rtp_syntactic_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58032L)
  public static SubLObject expand_itp_state_completely(final SubLObject state, final SubLObject mt)
  {
    while ( queues.p_queue_size( itp_state_work_set( state ) ).isPositive())
    {
      expand_itp_state( state, mt );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58200L)
  public static SubLObject itp_node_max_child_span_length(final SubLObject node)
  {
    final SubLObject biggest_kid = list_utilities.extremal( rkf_concept_harvester.rkf_ch_gather_parsing_surrogates( itp_node_new_parse( node ) ), $sym229$_, $sym275$RESULT_OF_PARSING_SPAN_LENGTH );
    if( NIL != biggest_kid )
    {
      return parsing_utilities.result_of_parsing_span_length( biggest_kid );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58471L)
  public static SubLObject itp_output_sorting_function(final SubLObject item)
  {
    final SubLObject span = item.first();
    return Numbers.add( Numbers.multiply( Sequences.length( span ), $int276$100 ), span.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 59094L)
  public static SubLObject compute_correct_span(final SubLObject absolute, final SubLObject relative)
  {
    final SubLObject offset = conses_high.second( absolute );
    SubLObject new_span = NIL;
    final SubLObject numeric_part = relative.first().eql( $const179$TheList ) ? relative.rest() : relative;
    final SubLObject numeric_base = absolute.rest();
    if( NIL != Sequences.search( numeric_part, numeric_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return relative;
    }
    SubLObject cdolist_list_var = relative;
    SubLObject position = NIL;
    position = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( position.isNumber() )
      {
        new_span = ConsesLow.cons( Numbers.add( offset, position ), new_span );
      }
      else
      {
        new_span = ConsesLow.cons( position, new_span );
      }
      cdolist_list_var = cdolist_list_var.rest();
      position = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_span );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 59854L)
  public static SubLObject adjust_the_spans(final SubLObject formula, final SubLObject span, SubLObject span_test)
  {
    if( span_test == UNPROVIDED )
    {
      span_test = $sym277$IS_THIS_A_THELIST_SPAN_;
    }
    final SubLObject lists = list_utilities.tree_gather( formula, span_test, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject base_span = ( NIL != is_this_a_thelist_spanP( span ) ) ? span.rest() : span;
    SubLObject cdolist_list_var = lists;
    SubLObject a_span = NIL;
    a_span = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject spot = a_span;
      SubLObject cdolist_list_var_$81 = a_span;
      SubLObject number = NIL;
      number = cdolist_list_var_$81.first();
      while ( NIL != cdolist_list_var_$81)
      {
        if( number.isNumber() )
        {
          final SubLObject index = ConsesLow.nth( number, base_span );
          if( NIL != index )
          {
            conses_high.nsubst( index, number, spot, UNPROVIDED, UNPROVIDED );
          }
        }
        spot = spot.rest();
        cdolist_list_var_$81 = cdolist_list_var_$81.rest();
        number = cdolist_list_var_$81.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      a_span = cdolist_list_var.first();
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 60500L)
  public static SubLObject is_this_a_thelist_spanP(final SubLObject obj)
  {
    if( !obj.isCons() || !obj.first().eql( $const179$TheList ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = obj.rest();
    SubLObject part = NIL;
    part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !part.isFixnum() )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      part = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 60709L)
  public static SubLObject is_this_a_numeric_spanP(final SubLObject obj)
  {
    if( !obj.isCons() )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = obj;
    SubLObject part = NIL;
    part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !part.isFixnum() )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      part = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 60873L)
  public static SubLObject dependent_span_coverage(final SubLObject dependents)
  {
    final SubLObject dep_coverage = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject dep_span = NIL;
    SubLObject cdolist_list_var = dependents;
    SubLObject this_dep = NIL;
    this_dep = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != itp_node_p( this_dep ) )
      {
        dep_span = itp_node_span( this_dep );
      }
      else if( NIL != is_this_a_thelist_spanP( this_dep ) )
      {
        dep_span = this_dep.rest();
      }
      else if( NIL != is_this_a_numeric_spanP( this_dep ) )
      {
        dep_span = this_dep;
      }
      SubLObject cdolist_list_var_$82 = dep_span;
      SubLObject n = NIL;
      n = cdolist_list_var_$82.first();
      while ( NIL != cdolist_list_var_$82)
      {
        set.set_add( n, dep_coverage );
        cdolist_list_var_$82 = cdolist_list_var_$82.rest();
        n = cdolist_list_var_$82.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_dep = cdolist_list_var.first();
    }
    return Sort.sort( set.set_element_list( dep_coverage ), $sym278$_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 61652L)
  public static SubLObject initial_span_gap(final SubLObject self, final SubLObject dependents)
  {
    assert NIL != itp_node_p( self ) : self;
    final SubLObject dep_coverage = dependent_span_coverage( dependents );
    SubLObject initial_span = NIL;
    SubLObject span_knownP = NIL;
    if( NIL == span_knownP )
    {
      SubLObject csome_list_var = itp_node_span( self );
      SubLObject n = NIL;
      n = csome_list_var.first();
      while ( NIL == span_knownP && NIL != csome_list_var)
      {
        if( NIL != subl_promotions.memberP( n, dep_coverage, UNPROVIDED, UNPROVIDED ) )
        {
          span_knownP = T;
        }
        else
        {
          initial_span = ConsesLow.cons( n, initial_span );
        }
        csome_list_var = csome_list_var.rest();
        n = csome_list_var.first();
      }
    }
    return Sequences.reverse( initial_span );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 62262L)
  public static SubLObject full_span_coverageP(final SubLObject self, final SubLObject dependents)
  {
    assert NIL != itp_node_p( self ) : self;
    return list_utilities.fast_sets_equalP( itp_node_span( self ), dependent_span_coverage( dependents ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 62910L)
  public static SubLObject get_ternary_quant_fns()
  {
    if( NIL == $ternary_quant_fns$.getGlobalValue() )
    {
      final SubLObject the_fns = ask_utilities.ask_variable( $sym279$_FUNC, $list280, $const53$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != the_fns )
      {
        $ternary_quant_fns$.setGlobalValue( the_fns );
      }
      else
      {
        $ternary_quant_fns$.setGlobalValue( $kw244$NONE );
      }
    }
    if( !$ternary_quant_fns$.getGlobalValue().eql( $kw244$NONE ) )
    {
      return $ternary_quant_fns$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 63309L)
  public static SubLObject is_this_a_quant_fnP(final SubLObject obj)
  {
    if( !obj.isCons() )
    {
      return NIL;
    }
    if( NIL != subl_promotions.memberP( obj.first(), get_ternary_quant_fns(), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 63471L)
  public static SubLObject surrogate_multi_word_componentP(final SubLObject surrogate)
  {
    return Numbers.numL( TWO_INTEGER, Sequences.length( conses_high.third( surrogate ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 63709L)
  public static SubLObject reify_itp(SubLObject state)
  {
    if( state == UNPROVIDED )
    {
      state = $last_itp_state_created$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != fort_types_interface.mt_in_any_mtP( $rtp_kb_parse_mt$.getDynamicValue( thread ) ) : $rtp_kb_parse_mt$.getDynamicValue( thread );
    if( NIL == fi.fi_assert_int( ConsesLow.list( $const282$genlMt, $rtp_kb_parse_mt$.getDynamicValue( thread ), ( NIL != parsing_vars.$parse_tree_mt$.getDynamicValue( thread ) ) ? parsing_vars.$parse_tree_mt$
        .getDynamicValue( thread ) : $const283$ParseTreeSandboxMt ), $const284$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.warn( $str285$Couldn_t_find_a_parse_tree_mt_to_, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
    }
    SubLObject good_roots = NIL;
    SubLObject cdolist_list_var = itp_state_solution_set( state );
    SubLObject this_root = NIL;
    this_root = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == itp_node_parent( this_root ) )
      {
        final SubLObject undo_assert_traceP = NIL;
        final SubLObject instructions = reify_itp_int( this_root );
        final SubLObject more_instructions = NIL;
        if( NIL != instructions )
        {
          if( NIL == good_roots )
          {
            good_roots = this_root;
          }
          else if( NIL != itp_node_p( good_roots ) )
          {
            SubLObject choice_cat = NIL;
            if( NIL == choice_cat )
            {
              choice_cat = $const30$SyntacticChoiceNode;
            }
            final SubLObject new_node = new_syntactic_choice_node( $rtp_kb_parse_mt$.getDynamicValue( thread ), Mapping.mapcar( $sym148$ITP_NODE_SYNTACTIC_NODE, ConsesLow.list( this_root, good_roots ) ), choice_cat,
                UNPROVIDED );
            if( NIL != forts.fort_p( $const63$CycRecursiveTemplateParser ) )
            {
              fi.fi_assert_int( ConsesLow.list( $const77$syntacticNodeCreator, ConsesLow.list( $const78$InstanceWithRelationFromFn, ConsesLow.list( $const79$ProgramCopyFn, $const63$CycRecursiveTemplateParser ),
                  $const170$partOfIBT, $const171$Cyc ), new_node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
            }
            good_roots = new_node;
          }
          else
          {
            final SubLObject choice_cat = NIL;
            final SubLObject new_node = new_syntactic_functional_node( $rtp_kb_parse_mt$.getDynamicValue( thread ), NIL, UNPROVIDED );
            if( NIL != forts.fort_p( $const63$CycRecursiveTemplateParser ) )
            {
              fi.fi_assert_int( ConsesLow.list( $const77$syntacticNodeCreator, ConsesLow.list( $const78$InstanceWithRelationFromFn, ConsesLow.list( $const79$ProgramCopyFn, $const63$CycRecursiveTemplateParser ),
                  $const170$partOfIBT, $const171$Cyc ), new_node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
            }
            parsing_utilities.syntactic_node_add_dtr( new_node, itp_node_syntactic_node( this_root ), NIL, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
          }
        }
        SubLObject cdolist_list_var_$83 = instructions;
        SubLObject this_gaf = NIL;
        this_gaf = cdolist_list_var_$83.first();
        while ( NIL != cdolist_list_var_$83)
        {
          fi.fi_assert_int( this_gaf, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          cdolist_list_var_$83 = cdolist_list_var_$83.rest();
          this_gaf = cdolist_list_var_$83.first();
        }
        SubLObject cdolist_list_var_$84 = more_instructions;
        this_gaf = NIL;
        this_gaf = cdolist_list_var_$84.first();
        while ( NIL != cdolist_list_var_$84)
        {
          fi.fi_assert_int( this_gaf, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          cdolist_list_var_$84 = cdolist_list_var_$84.rest();
          this_gaf = cdolist_list_var_$84.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_root = cdolist_list_var.first();
    }
    if( NIL == good_roots )
    {
      return NIL;
    }
    return parsing_utilities.create_parse_tree_with_root_node( ( NIL != itp_node_p( good_roots ) ) ? itp_node_syntactic_node( good_roots ) : good_roots, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 65781L)
  public static SubLObject reify_itp_int(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject itp_leafP = makeBoolean( NIL == itp_node_children( self ) && NIL == itp_node_syntactic_node( self ) );
    final SubLObject valid_children = ( NIL != itp_leafP ) ? NIL : itp_node_get_legitimate_children( self );
    SubLObject these_instructions = NIL;
    if( NIL == valid_children && NIL == itp_leafP )
    {
      return NIL;
    }
    final SubLObject my_component = itp_node_component( self );
    SubLObject my_category = ( NIL != parsing_utilities.result_of_parsing_formulaP( my_component ) ) ? parsing_utilities.result_of_parsing_category( my_component ) : NIL;
    final SubLObject my_real_parent = itp_node_parent( self );
    SubLObject my_kb_parent = NIL;
    SubLObject my_kb_node = itp_node_syntactic_node( self );
    final SubLObject my_meaning = itp_node_new_parse( self );
    if( NIL == my_category )
    {
      my_category = ( ( NIL != my_real_parent ) ? $const286$SyntacticNode_Sentential : $const20$SyntacticNode_MatrixClause );
    }
    if( NIL != my_real_parent )
    {
      my_kb_parent = itp_choice_node_for_component( my_real_parent, my_component );
      if( NIL == my_kb_parent )
      {
        my_kb_parent = itp_node_syntactic_node( my_real_parent );
      }
    }
    if( NIL != itp_node_p( my_real_parent ) && NIL == my_kb_node )
    {
      SubLObject csome_list_var = itp_node_get_legitimate_children( my_real_parent );
      SubLObject other_child = NIL;
      other_child = csome_list_var.first();
      while ( NIL == my_kb_node && NIL != csome_list_var)
      {
        if( !other_child.equal( self ) && itp_node_component( self ).equal( itp_node_component( other_child ) ) )
        {
          my_kb_node = itp_node_syntactic_node( other_child );
        }
        csome_list_var = csome_list_var.rest();
        other_child = csome_list_var.first();
      }
    }
    if( NIL == my_kb_node )
    {
      final SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding( thread );
      try
      {
        $kb_node_gathering_modeP$.bind( T, thread );
        final SubLObject choice_cat = my_category;
        thread.resetMultipleValues();
        final SubLObject new_node = new_syntactic_functional_node( $rtp_kb_parse_mt$.getDynamicValue( thread ), my_category, UNPROVIDED );
        final SubLObject new_gafs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != forts.fort_p( $const63$CycRecursiveTemplateParser ) )
        {
          fi.fi_assert_int( ConsesLow.list( $const77$syntacticNodeCreator, ConsesLow.list( $const78$InstanceWithRelationFromFn, ConsesLow.list( $const79$ProgramCopyFn, $const63$CycRecursiveTemplateParser ),
              $const170$partOfIBT, $const171$Cyc ), new_node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        }
        SubLObject cdolist_list_var = new_gafs;
        SubLObject test_gaf = NIL;
        test_gaf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          these_instructions = ConsesLow.cons( test_gaf, these_instructions );
          cdolist_list_var = cdolist_list_var.rest();
          test_gaf = cdolist_list_var.first();
        }
        my_kb_node = new_node;
        if( NIL != parsing_utilities.result_of_parsing_formulaP( my_component ) )
        {
          these_instructions = ConsesLow.cons( ConsesLow.list( $const232$syntacticNodeString, my_kb_node, parsing_utilities.result_of_parsing_words( my_component ) ), these_instructions );
        }
        else if( NIL != join_template_components_node_p( self ) )
        {
          these_instructions = ConsesLow.cons( ConsesLow.list( $const232$syntacticNodeString, my_kb_node, join_template_components_node_word_list( self ) ), these_instructions );
        }
        cdolist_list_var = valid_children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject this_child_node = itp_node_syntactic_node( child );
          if( NIL != this_child_node && NIL == ask_utilities.ask_variable( $sym287$_N, ConsesLow.list( $const186$syntacticNodeNthDaughter, my_kb_node, $sym287$_N, this_child_node ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED, UNPROVIDED ) )
          {
            parsing_utilities.syntactic_node_add_dtr( my_kb_node, this_child_node, NIL, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
            if( NIL != full_span_coverageP( self, ConsesLow.list( child ) ) )
            {
              SubLObject cdolist_list_var_$85 = parsing_utilities.syntactic_node_proposed_meanings( this_child_node, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED );
              SubLObject meaning = NIL;
              meaning = cdolist_list_var_$85.first();
              while ( NIL != cdolist_list_var_$85)
              {
                these_instructions = ConsesLow.cons( ConsesLow.list( $const288$dependentMeaning, my_kb_node, meaning, this_child_node, meaning ), these_instructions );
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                meaning = cdolist_list_var_$85.first();
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          child = cdolist_list_var.first();
        }
      }
      finally
      {
        $kb_node_gathering_modeP$.rebind( _prev_bind_0, thread );
      }
    }
    _csetf_itp_node_syntactic_node( self, my_kb_node );
    if( my_category.eql( $const174$VPTemplate ) && NIL == valid_children && NIL != isa.isa_in_any_mtP( my_kb_parent, $const30$SyntacticChoiceNode ) )
    {
      these_instructions = ConsesLow.cons( ConsesLow.list( $const88$excludedOptionNodes, my_kb_parent, my_kb_node ), these_instructions );
    }
    if( NIL != my_real_parent && NIL == my_kb_parent )
    {
      my_kb_parent = itp_node_syntactic_node( my_real_parent );
    }
    if( NIL != my_kb_parent )
    {
      if( NIL != isa.isa_in_any_mtP( my_kb_parent, $const30$SyntacticChoiceNode ) )
      {
        these_instructions = ConsesLow.cons( ConsesLow.list( $const32$optionNodes, my_kb_parent, my_kb_node ), these_instructions );
      }
      else if( NIL == ask_utilities.ask_variable( $sym287$_N, ConsesLow.list( $const186$syntacticNodeNthDaughter, my_kb_parent, $sym287$_N, my_kb_node ), $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        parsing_utilities.syntactic_node_add_dtr( my_kb_parent, my_kb_node, NIL, $rtp_kb_parse_mt$.getDynamicValue( thread ) );
      }
    }
    SubLObject cdolist_list_var2 = valid_children;
    SubLObject this_child = NIL;
    this_child = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      thread.resetMultipleValues();
      final SubLObject v_answer = itp_node_find_or_initialize_syntactic_choices( self, itp_node_component( this_child ) );
      final SubLObject the_gafs = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_answer )
      {
        SubLObject cdolist_list_var_$86 = the_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var_$86.first();
        while ( NIL != cdolist_list_var_$86)
        {
          these_instructions = ConsesLow.cons( gaf, these_instructions );
          cdolist_list_var_$86 = cdolist_list_var_$86.rest();
          gaf = cdolist_list_var_$86.first();
        }
      }
      final SubLObject gafs = reify_itp_int( this_child );
      final SubLObject join_componentP = join_template_components_node_p( self );
      final SubLObject need_componentP = makeBoolean( NIL == join_componentP && NIL != list_utilities.sublisp_boolean( list_utilities.tree_find_if( $sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED ) ) );
      final SubLObject kids_component = ( NIL != need_componentP ) ? itp_node_component( this_child ) : NIL;
      if( NIL != list_utilities.proper_list_p( gafs ) )
      {
        SubLObject cdolist_list_var_$87 = gafs;
        SubLObject this_gaf = NIL;
        this_gaf = cdolist_list_var_$87.first();
        while ( NIL != cdolist_list_var_$87)
        {
          these_instructions = ConsesLow.cons( this_gaf, these_instructions );
          if( NIL != need_componentP && cycl_utilities.formula_arg1( this_gaf, UNPROVIDED ).eql( itp_node_syntactic_node( this_child ) ) && ( cycl_utilities.formula_arg0( this_gaf ).eql( $const234$proposedMeaning )
              || cycl_utilities.formula_arg0( this_gaf ).eql( $const288$dependentMeaning ) ) )
          {
            final SubLObject kids_meaning = cycl_utilities.formula_arg2( this_gaf, UNPROVIDED );
            SubLObject this_meaning = list_utilities.tree_substitute( my_meaning, kids_component, kids_meaning );
            if( this_meaning.equalp( my_meaning ) )
            {
              this_meaning = conses_high.copy_tree( kids_meaning );
            }
            if( !cycl_utilities.formula_arg0( this_meaning ).eql( $const235$SubLQuoteFn ) )
            {
              this_meaning = ConsesLow.list( $const235$SubLQuoteFn, this_meaning );
            }
            these_instructions = ConsesLow.cons( ConsesLow.list( $const288$dependentMeaning, my_kb_node, this_meaning, itp_node_syntactic_node( this_child ), kids_meaning ), these_instructions );
          }
          cdolist_list_var_$87 = cdolist_list_var_$87.rest();
          this_gaf = cdolist_list_var_$87.first();
        }
      }
      else if( NIL != $kb_node_gathering_modeP$.getDynamicValue( thread ) )
      {
        kill_syntactic_node_tree( my_kb_node );
        return NIL;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      this_child = cdolist_list_var2.first();
    }
    if( NIL != join_template_components_node_p( self ) && NIL != isa.isaP( my_kb_node, $const286$SyntacticNode_Sentential, $rtp_kb_parse_mt$.getDynamicValue( thread ), UNPROVIDED ) && cycl_utilities.formula_arg1(
        my_meaning, UNPROVIDED ).equal( $list290 ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.formula_args( cycl_utilities.formula_arg2( my_meaning, UNPROVIDED ), UNPROVIDED );
      SubLObject subj_component = NIL;
      SubLObject vp_component = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
      subj_component = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
      vp_component = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject subj_options = NIL;
        SubLObject subj_nodes = NIL;
        SubLObject vp_options = NIL;
        SubLObject vp_nodes = NIL;
        SubLObject cdolist_list_var3 = valid_children;
        SubLObject this_child2 = NIL;
        this_child2 = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          final SubLObject this_component = itp_node_component( this_child2 );
          final SubLObject this_node = itp_node_syntactic_node( this_child2 );
          if( this_component.equal( subj_component ) )
          {
            subj_nodes = ConsesLow.cons( this_node, subj_nodes );
          }
          else if( this_component.equal( vp_component ) )
          {
            vp_nodes = ConsesLow.cons( this_node, vp_nodes );
          }
          cdolist_list_var3 = cdolist_list_var3.rest();
          this_child2 = cdolist_list_var3.first();
        }
        cdolist_list_var3 = these_instructions;
        SubLObject this_gaf2 = NIL;
        this_gaf2 = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          if( cycl_utilities.formula_arg0( this_gaf2 ).eql( $const234$proposedMeaning ) || cycl_utilities.formula_arg0( this_gaf2 ).eql( $const288$dependentMeaning ) )
          {
            if( NIL != subl_promotions.memberP( cycl_utilities.formula_arg1( this_gaf2, UNPROVIDED ), subj_nodes, UNPROVIDED, UNPROVIDED ) )
            {
              final SubLObject item_var = ConsesLow.list( cycl_utilities.formula_arg1( this_gaf2, UNPROVIDED ), cycl_utilities.formula_arg2( this_gaf2, UNPROVIDED ) );
              if( NIL == conses_high.member( item_var, subj_options, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
              {
                subj_options = ConsesLow.cons( item_var, subj_options );
              }
            }
            else if( NIL != subl_promotions.memberP( cycl_utilities.formula_arg1( this_gaf2, UNPROVIDED ), vp_nodes, UNPROVIDED, UNPROVIDED ) )
            {
              final SubLObject item_var = ConsesLow.list( cycl_utilities.formula_arg1( this_gaf2, UNPROVIDED ), cycl_utilities.formula_arg2( this_gaf2, UNPROVIDED ) );
              if( NIL == conses_high.member( item_var, vp_options, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
              {
                vp_options = ConsesLow.cons( item_var, vp_options );
              }
            }
          }
          cdolist_list_var3 = cdolist_list_var3.rest();
          this_gaf2 = cdolist_list_var3.first();
        }
        cdolist_list_var3 = subj_nodes;
        SubLObject node = NIL;
        node = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          SubLObject cdolist_list_var_$88 = parsing_utilities.syntactic_node_proposed_meanings( node, $rtp_kb_parse_mt$.getDynamicValue( thread ), $const234$proposedMeaning );
          SubLObject this_meaning2 = NIL;
          this_meaning2 = cdolist_list_var_$88.first();
          while ( NIL != cdolist_list_var_$88)
          {
            final SubLObject item_var2 = ConsesLow.list( node, this_meaning2 );
            if( NIL == conses_high.member( item_var2, subj_options, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              subj_options = ConsesLow.cons( item_var2, subj_options );
            }
            cdolist_list_var_$88 = cdolist_list_var_$88.rest();
            this_meaning2 = cdolist_list_var_$88.first();
          }
          cdolist_list_var3 = cdolist_list_var3.rest();
          node = cdolist_list_var3.first();
        }
        cdolist_list_var3 = vp_nodes;
        node = NIL;
        node = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          SubLObject cdolist_list_var_$89 = parsing_utilities.syntactic_node_proposed_meanings( node, $rtp_kb_parse_mt$.getDynamicValue( thread ), $const234$proposedMeaning );
          SubLObject this_meaning2 = NIL;
          this_meaning2 = cdolist_list_var_$89.first();
          while ( NIL != cdolist_list_var_$89)
          {
            final SubLObject item_var2 = ConsesLow.list( node, this_meaning2 );
            if( NIL == conses_high.member( item_var2, vp_options, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              vp_options = ConsesLow.cons( item_var2, vp_options );
            }
            cdolist_list_var_$89 = cdolist_list_var_$89.rest();
            this_meaning2 = cdolist_list_var_$89.first();
          }
          cdolist_list_var3 = cdolist_list_var3.rest();
          node = cdolist_list_var3.first();
        }
        if( NIL == subj_options || NIL == vp_options )
        {
          Errors.warn( $str292$____can_t_build_any_meaning_combi, my_kb_node );
        }
        else
        {
          cdolist_list_var3 = vp_options;
          SubLObject this_vp_option = NIL;
          this_vp_option = cdolist_list_var3.first();
          while ( NIL != cdolist_list_var3)
          {
            SubLObject current_$91;
            final SubLObject datum_$90 = current_$91 = this_vp_option;
            SubLObject vp_node = NIL;
            SubLObject vp_meaning = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$91, datum_$90, $list293 );
            vp_node = current_$91.first();
            current_$91 = current_$91.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$91, datum_$90, $list293 );
            vp_meaning = current_$91.first();
            current_$91 = current_$91.rest();
            if( NIL == current_$91 )
            {
              SubLObject cdolist_list_var_$90 = subj_options;
              SubLObject this_subj_option = NIL;
              this_subj_option = cdolist_list_var_$90.first();
              while ( NIL != cdolist_list_var_$90)
              {
                SubLObject current_$92;
                final SubLObject datum_$91 = current_$92 = this_subj_option;
                SubLObject subj_node = NIL;
                SubLObject subj_meaning = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$92, datum_$91, $list294 );
                subj_node = current_$92.first();
                current_$92 = current_$92.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$92, datum_$91, $list294 );
                subj_meaning = current_$92.first();
                current_$92 = current_$92.rest();
                if( NIL == current_$92 )
                {
                  SubLObject joined_meaning = list_utilities.tree_substitute( vp_meaning, $const295$TheSentenceSubject, subj_meaning );
                  joined_meaning = list_utilities.tree_substitute( joined_meaning, $kw296$SUBJECT, subj_meaning );
                  these_instructions = ConsesLow.cons( ConsesLow.list( $const288$dependentMeaning, my_kb_node, joined_meaning, vp_node, vp_meaning ), these_instructions );
                  these_instructions = ConsesLow.cons( ConsesLow.list( $const288$dependentMeaning, my_kb_node, joined_meaning, subj_node, subj_meaning ), these_instructions );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$91, $list294 );
                }
                cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                this_subj_option = cdolist_list_var_$90.first();
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$90, $list293 );
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            this_vp_option = cdolist_list_var3.first();
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list291 );
      }
    }
    if( NIL == list_utilities.tree_find_if( $sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED ) )
    {
      these_instructions = ConsesLow.cons( ConsesLow.list( $const234$proposedMeaning, my_kb_node, my_meaning ), these_instructions );
    }
    cdolist_list_var2 = itp_node_get_dominance_gafs( self );
    SubLObject this_gaf3 = NIL;
    this_gaf3 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      these_instructions = ConsesLow.cons( this_gaf3, these_instructions );
      cdolist_list_var2 = cdolist_list_var2.rest();
      this_gaf3 = cdolist_list_var2.first();
    }
    return Sequences.reverse( these_instructions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 74624L)
  public static SubLObject cat_itp(SubLObject state)
  {
    if( state == UNPROVIDED )
    {
      state = $last_itp_state_created$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != itp_state_p( state ) : state;
    final SubLObject answers = itp_state_solution_set( state );
    final SubLObject todo = enqueue_solution_roots( queues.create_queue( UNPROVIDED ), answers );
    final SubLObject result_hash = Hashtables.make_hash_table( SIXTEEN_INTEGER, Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject global_sub_list = NIL;
    SubLObject span = NIL;
    SubLObject section = NIL;
    SubLObject results = NIL;
    SubLObject sub_list = NIL;
    while ( NIL == queues.queue_empty_p( todo ))
    {
      final SubLObject curr = queues.dequeue( todo );
      final SubLObject the_span = itp_node_span( curr );
      if( !span.equal( the_span ) )
      {
        if( NIL != section )
        {
          SubLObject cdolist_list_var = section;
          SubLObject cycl = NIL;
          cycl = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            hash_table_utilities.pushnew_hash( span, cycl, result_hash, Symbols.symbol_function( EQUAL ) );
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
          }
        }
        span = the_span;
        section = NIL;
      }
      thread.resetMultipleValues();
      final SubLObject section_$95 = perform_solution_node_analysis( state, curr, section, todo );
      final SubLObject sub_list_$96 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      section = section_$95;
      sub_list = sub_list_$96;
      global_sub_list = Sequences.cconcatenate( global_sub_list, sub_list );
    }
    if( NIL != section )
    {
      SubLObject cdolist_list_var2 = section;
      SubLObject cycl2 = NIL;
      cycl2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        hash_table_utilities.pushnew_hash( span, cycl2, result_hash, Symbols.symbol_function( EQUAL ) );
        cdolist_list_var2 = cdolist_list_var2.rest();
        cycl2 = cdolist_list_var2.first();
      }
    }
    SubLObject span_$97 = NIL;
    SubLObject cycl2 = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( result_hash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        span_$97 = Hashtables.getEntryKey( cdohash_entry );
        cycl2 = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject item_var = ConsesLow.list( span_$97, cycl2 );
        if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          results = ConsesLow.cons( item_var, results );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    SubLObject temp_results = NIL;
    SubLObject temp_result = NIL;
    SubLObject cdolist_list_var = results;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      temp_result = result;
      SubLObject cdolist_list_var_$98 = global_sub_list;
      SubLObject sub = NIL;
      sub = cdolist_list_var_$98.first();
      while ( NIL != cdolist_list_var_$98)
      {
        temp_result = conses_high.subst( conses_high.second( sub ), sub.first(), temp_result, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        if( temp_result.isList() && conses_high.second( temp_result ).isList() && NIL != assertion_handles.assertion_p( conses_high.second( temp_result ).first() ) )
        {
          temp_result = ConsesLow.list( temp_result.first(), Sequences.cconcatenate( conses_high.second( temp_result ), conses_high.third( sub ) ) );
        }
        cdolist_list_var_$98 = cdolist_list_var_$98.rest();
        sub = cdolist_list_var_$98.first();
      }
      final SubLObject item_var = temp_result;
      if( NIL == conses_high.member( item_var, temp_results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        temp_results = ConsesLow.cons( item_var, temp_results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    results = temp_results;
    return sort_itp_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 76602L)
  public static SubLObject transform_nl_quant_forms(SubLObject formula, final SubLObject span_incr)
  {
    if( NIL != nl_attr_w_locationP( formula ) )
    {
      final SubLObject incremented = formula = el_utilities.replace_formula_arg( THREE_INTEGER, Numbers.add( span_incr, cycl_utilities.formula_arg3( formula, UNPROVIDED ) ), formula );
    }
    if( formula.isAtom() )
    {
      return formula;
    }
    if( NIL != forts.fort_p( formula ) )
    {
      return formula;
    }
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      return NIL;
    }
    if( NIL != cycl_utilities.expression_find_if( $sym297$NL_ATTR_W_LOCATION_, formula, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.cons( transform_nl_quant_forms( cycl_utilities.formula_arg0( formula ), span_incr ), transform_nl_quant_forms( cycl_utilities.formula_args( formula, UNPROVIDED ), span_incr ) );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 77235L)
  public static SubLObject nl_attr_w_locationP(final SubLObject formula)
  {
    return makeBoolean( NIL != subl_promotions.memberP( cycl_utilities.formula_arg0( formula ), $list298, UNPROVIDED, UNPROVIDED ) && NIL != el_utilities.formula_arityE( formula, THREE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 77444L)
  public static SubLObject sort_itp_results(final SubLObject parses)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = parses;
    SubLObject constit = NIL;
    constit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject constit_span = constit.first();
      SubLObject constit_good_result = NIL;
      SubLObject constit_bad_result = NIL;
      SubLObject cdolist_list_var_$99 = constit.rest().first();
      SubLObject cycl = NIL;
      cycl = cdolist_list_var_$99.first();
      while ( NIL != cdolist_list_var_$99)
      {
        if( NIL != rtp_contains_invalid_surrogateP( cycl, parses ) )
        {
          constit_bad_result = ConsesLow.cons( cycl, constit_bad_result );
        }
        else
        {
          constit_good_result = ConsesLow.cons( cycl, constit_good_result );
        }
        cdolist_list_var_$99 = cdolist_list_var_$99.rest();
        cycl = cdolist_list_var_$99.first();
      }
      result = ConsesLow.cons( ConsesLow.list( constit_span, Sequences.cconcatenate( Sequences.reverse( constit_good_result ), Sequences.reverse( constit_bad_result ) ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      constit = cdolist_list_var.first();
    }
    return Sort.sort( result, Symbols.symbol_function( $sym229$_ ), Symbols.symbol_function( $sym299$ITP_OUTPUT_SORTING_FUNCTION ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78017L)
  public static SubLObject rtp_contains_invalid_surrogateP(final SubLObject parse, final SubLObject parses)
  {
    final SubLObject surrogates = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates( parse );
    SubLObject invalidP = NIL;
    if( NIL == surrogates )
    {
      return NIL;
    }
    if( NIL == invalidP )
    {
      SubLObject csome_list_var = surrogates;
      SubLObject surrogate = NIL;
      surrogate = csome_list_var.first();
      while ( NIL == invalidP && NIL != csome_list_var)
      {
        final SubLObject surrogate_index = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list( surrogate );
        if( NIL == Sequences.find( surrogate_index, parses, EQUAL, $sym300$FIRST, UNPROVIDED, UNPROVIDED ) )
        {
          invalidP = T;
        }
        csome_list_var = csome_list_var.rest();
        surrogate = csome_list_var.first();
      }
    }
    return invalidP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78438L)
  public static SubLObject unassembled_phraseP(final SubLObject formula)
  {
    return makeBoolean( formula.isList() && cycl_utilities.formula_arg0( formula ).eql( $const301$AssemblePhraseFn ) && NIL != list_utilities.find_if_not( Symbols.symbol_function( $sym302$STRINGP ), formula.rest(),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78730L)
  public static SubLObject transform_assemble_phrases(final SubLObject formula)
  {
    return Values.values( transform_list_utilities.transform( formula, Symbols.symbol_function( $sym303$UNASSEMBLED_PHRASE_ ), Symbols.symbol_function( $sym304$REWRITE_ASSEMBLE_PHRASE ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78895L)
  public static SubLObject perform_solution_node_analysis(final SubLObject state, final SubLObject node, SubLObject section, final SubLObject todo_list)
  {
    final SubLObject expression = transform_assemble_phrases( itp_node_new_parse( node ) );
    final SubLObject assertion = itp_node_assertion( node );
    final SubLObject join_templatesP = has_join_template_componentsP( expression );
    final SubLObject span_start = itp_node_span( node ).first();
    SubLObject solution_list = NIL;
    if( NIL != has_substitutable_childrenP( expression ) || NIL != tp_substitutable_formulaP( expression ) || NIL != join_templatesP )
    {
      SubLObject cdolist_list_var = itp_node_children( node );
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != tp_substitutable_formulaP( itp_node_component( child ) ) || NIL != substitutable_child_nodeP( child ) )
        {
          SubLObject cdolist_list_var_$100;
          final SubLObject modifieds = cdolist_list_var_$100 = tp_do_substitutions( expression, child, todo_list );
          SubLObject modified = NIL;
          modified = cdolist_list_var_$100.first();
          while ( NIL != cdolist_list_var_$100)
          {
            final SubLObject cycl = modified.first();
            final SubLObject asserts = conses_high.second( modified );
            SubLObject reformulated = ( NIL != has_join_template_componentsP( cycl ) ) ? recognition.reformulate_jointemplatecomponents( cycl ) : cycl;
            final SubLObject assertion_set = ConsesLow.cons( assertion, asserts );
            if( NIL != reformulated )
            {
              reformulated = transform_assemble_phrases( reformulated );
              if( NIL == partial_parsesP( reformulated ) )
              {
                SubLObject cdolist_list_var_$101 = find_differences( expression, reformulated, UNPROVIDED );
                SubLObject diff = NIL;
                diff = cdolist_list_var_$101.first();
                while ( NIL != cdolist_list_var_$101)
                {
                  final SubLObject item_var = ConsesLow.list( diff.first(), conses_high.second( diff ), assertion_set );
                  if( NIL == conses_high.member( item_var, solution_list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    solution_list = ConsesLow.cons( item_var, solution_list );
                  }
                  cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                  diff = cdolist_list_var_$101.first();
                }
                if( NIL != has_join_template_componentsP( reformulated ) )
                {
                  reformulated = recognition.reformulate_jointemplatecomponents( reformulated );
                }
                if( NIL == has_join_template_componentsP( reformulated ) )
                {
                  final SubLObject item_var2 = build_return_format( reformulated, assertion_set, span_start );
                  if( NIL == conses_high.member( item_var2, section, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    section = ConsesLow.cons( item_var2, section );
                  }
                }
              }
            }
            cdolist_list_var_$100 = cdolist_list_var_$100.rest();
            modified = cdolist_list_var_$100.first();
          }
        }
        else
        {
          SubLObject cdolist_list_var_$102 = itp_node_children( node );
          SubLObject child_$103 = NIL;
          child_$103 = cdolist_list_var_$102.first();
          while ( NIL != cdolist_list_var_$102)
          {
            if( NIL == queues.queue_find( child_$103, todo_list, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
            {
              queues.enqueue( child_$103, todo_list );
            }
            cdolist_list_var_$102 = cdolist_list_var_$102.rest();
            child_$103 = cdolist_list_var_$102.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
    }
    else
    {
      if( NIL != expression )
      {
        final SubLObject item_var3 = build_return_format( ( NIL != has_join_template_componentsP( expression ) ) ? recognition.reformulate_jointemplatecomponents( expression ) : expression, ConsesLow.list( assertion ),
            span_start );
        if( NIL == conses_high.member( item_var3, section, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          section = ConsesLow.cons( item_var3, section );
        }
      }
      SubLObject cdolist_list_var = itp_node_children( node );
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == queues.queue_find( child, todo_list, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
        {
          queues.enqueue( child, todo_list );
        }
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
    }
    return Values.values( rtp_sort_constit_parses( section ), solution_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 81830L)
  public static SubLObject rtp_sort_constit_parses(final SubLObject parses)
  {
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 81896L)
  public static SubLObject merge_parse_results(final SubLObject parse1, final SubLObject parse2)
  {
    final SubLObject parse_iterator1 = rtp_iterators.new_itp_result_iterator( parse1, UNPROVIDED, UNPROVIDED );
    final SubLObject parse_iterator2 = rtp_iterators.new_itp_result_iterator( parse2, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    while ( NIL == rtp_iterators.itp_result_iterator_doneP( parse_iterator1 ))
    {
      final SubLObject span_iterator1 = rtp_iterators.itp_result_iterator_curr( parse_iterator1 );
      final SubLObject span = rtp_iterators.itp_section_iterator_span( span_iterator1 );
      final SubLObject span_iterator2 = rtp_iterators.find_itp_section_iterator( parse_iterator2, span );
      SubLObject span_result = NIL;
      if( NIL != span_iterator2 )
      {
        span_result = rtp_iterators.itp_section_iterator_section( span_iterator2 );
      }
      span_result = Sequences.cconcatenate( span_result, rtp_iterators.itp_section_iterator_section( span_iterator1 ) );
      result = ConsesLow.cons( ConsesLow.list( span, span_result ), result );
      rtp_iterators.itp_result_iterator_next( parse_iterator1 );
    }
    while ( NIL == rtp_iterators.itp_result_iterator_doneP( parse_iterator2 ))
    {
      final SubLObject span_iterator3 = rtp_iterators.itp_result_iterator_curr( parse_iterator2 );
      final SubLObject span = rtp_iterators.itp_section_iterator_span( span_iterator3 );
      final SubLObject span_iterator4 = rtp_iterators.find_itp_section_iterator( parse_iterator1, span );
      SubLObject span_result = NIL;
      if( NIL == span_iterator4 )
      {
        span_result = rtp_iterators.itp_section_iterator_section( span_iterator3 );
        result = ConsesLow.cons( ConsesLow.list( span, span_result ), result );
      }
      rtp_iterators.itp_result_iterator_next( parse_iterator2 );
    }
    return Sort.sort( result, $sym229$_, $sym299$ITP_OUTPUT_SORTING_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 83302L)
  public static SubLObject find_differences(final SubLObject list1, final SubLObject list2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUALP;
    }
    if( NIL != Functions.funcall( test, list1, list2 ) )
    {
      return NIL;
    }
    if( NIL != constant_handles.constant_p( list1 ) || NIL != constant_handles.constant_p( list2 ) )
    {
      return ConsesLow.list( ConsesLow.list( list1, list2 ) );
    }
    if( ( list1.first().isAtom() || list2.first().isAtom() ) && NIL == Functions.funcall( test, list1.first(), list2.first() ) )
    {
      return ConsesLow.list( ConsesLow.list( list1, list2 ) );
    }
    return Sequences.cconcatenate( find_differences( list1.first(), list2.first(), UNPROVIDED ), find_differences( list1.rest(), list2.rest(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 84153L)
  public static SubLObject build_return_format(SubLObject sem, final SubLObject assertion, final SubLObject span_start)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sem = transform_nl_quant_forms( sem, span_start );
    final SubLObject pcase_var = rtp_vars.$rtp_return_style$.getDynamicValue( thread );
    if( pcase_var.eql( $kw305$SIMPLE ) )
    {
      return sem;
    }
    if( pcase_var.eql( $kw120$ASSERTION ) )
    {
      return ConsesLow.list( sem, assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 84567L)
  public static SubLObject cat_for_result(final SubLObject justification)
  {
    if( justification.isList() && NIL != assertion_handles.assertion_p( justification.first() ) )
    {
      return assertions_high.gaf_arg1( justification.first() );
    }
    return justification.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 85043L)
  public static SubLObject force_for_result(final SubLObject justification)
  {
    if( justification.isList() && ( justification.first().eql( $const240$NPTemplate ) || NIL != lexicon_accessors.npP( justification.first() ) ) )
    {
      return $const306$termTemplate;
    }
    if( justification.isList() && ( NIL != subl_promotions.memberP( justification.first(), $list307, UNPROVIDED, UNPROVIDED ) || NIL != lexicon_accessors.vbarP( justification.first() ) ) )
    {
      return $const308$assertTemplate;
    }
    if( justification.first().eql( $const272$Adjective ) )
    {
      return $const306$termTemplate;
    }
    if( !justification.isList() || NIL == assertion_handles.assertion_p( justification.first() ) )
    {
      Errors.warn( $str315$sent__S_to_force_for_result__, justification );
      return NIL;
    }
    final SubLObject pcase_var;
    final SubLObject pred = pcase_var = assertions_high.gaf_arg0( justification.first() );
    if( pcase_var.eql( $const306$termTemplate ) )
    {
      return $const306$termTemplate;
    }
    if( pcase_var.eql( $const309$termTemplate_Reln ) )
    {
      return $const306$termTemplate;
    }
    if( pcase_var.eql( $const310$termTemplate_Test ) )
    {
      return $const306$termTemplate;
    }
    if( pcase_var.eql( $const308$assertTemplate ) )
    {
      return $const308$assertTemplate;
    }
    if( pcase_var.eql( $const264$assertTemplate_Reln ) )
    {
      return $const308$assertTemplate;
    }
    if( pcase_var.eql( $const311$assertTemplate_Test ) )
    {
      return $const308$assertTemplate;
    }
    if( pcase_var.eql( $const312$queryTemplate ) )
    {
      return $const312$queryTemplate;
    }
    if( pcase_var.eql( $const313$queryTemplate_Reln ) )
    {
      return $const312$queryTemplate;
    }
    if( pcase_var.eql( $const314$queryTemplate_Test ) )
    {
      return $const312$queryTemplate;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 86572L)
  public static SubLObject tp_do_substitutions(final SubLObject expression, final SubLObject node, final SubLObject todo_list)
  {
    return tp_do_substitutions_int( ConsesLow.list( expression, NIL ), node, todo_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 86709L)
  public static SubLObject tp_do_substitutions_int(final SubLObject expression, final SubLObject node, final SubLObject todo_list)
  {
    SubLObject result = NIL;
    SubLObject this_result = NIL;
    if( NIL != substitutable_child_nodeP( node ) )
    {
      this_result = ConsesLow.list( conses_high.subst( itp_node_new_parse( node ), itp_node_component( node ), expression.first(), Symbols.symbol_function( EQUALP ), UNPROVIDED ), ConsesLow.cons( itp_node_assertion(
          node ), conses_high.second( expression ) ) );
      if( NIL != has_substitutable_childrenP( this_result.first() ) )
      {
        SubLObject cdolist_list_var = itp_node_children( node );
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$104 = tp_do_substitutions_int( this_result, child, todo_list );
          SubLObject child_result = NIL;
          child_result = cdolist_list_var_$104.first();
          while ( NIL != cdolist_list_var_$104)
          {
            result = ConsesLow.cons( child_result, result );
            cdolist_list_var_$104 = cdolist_list_var_$104.rest();
            child_result = cdolist_list_var_$104.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          child = cdolist_list_var.first();
        }
      }
      else
      {
        result = ConsesLow.cons( this_result, result );
        if( NIL == queues.queue_find( node, todo_list, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
        {
          queues.enqueue( node, todo_list );
        }
      }
    }
    else if( NIL != tp_substitutable_formulaP( expression.first() ) )
    {
      result = ConsesLow.cons( ConsesLow.list( itp_node_new_parse( node ), ConsesLow.list( itp_node_assertion( node ) ) ), result );
      if( NIL == queues.queue_find( node, todo_list, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        queues.enqueue( node, todo_list );
      }
    }
    else
    {
      result = ConsesLow.list( expression );
      if( NIL == queues.queue_find( node, todo_list, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        queues.enqueue( node, todo_list );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 88335L)
  public static SubLObject tp_substitutable_formulaP(final SubLObject formula)
  {
    if( NIL == collection_defns.el_expressionP( formula ) )
    {
      return NIL;
    }
    final SubLObject v_arity = el_utilities.expression_arity( formula, UNPROVIDED );
    return makeBoolean( v_arity.isInteger() && v_arity.numE( FOUR_INTEGER ) && NIL != parsing_utilities.result_of_parsing_formulaP( formula ) && NIL != conses_high.member( cycl_utilities.formula_arg3( formula,
        UNPROVIDED ), $list316, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 88668L)
  public static SubLObject substitutable_child_nodeP(final SubLObject node)
  {
    return substitutable_child_formulaP( itp_node_component( node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 88785L)
  public static SubLObject substitutable_child_formulaP(final SubLObject formula)
  {
    if( formula.isList() )
    {
      return makeBoolean( NIL != parsing_utilities.result_of_parsing_formulaP( formula ) && NIL != verbal_template_categoryP( parsing_utilities.result_of_parsing_category( formula ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89018L)
  public static SubLObject enqueue_solution_roots(final SubLObject queue, final SubLObject answers)
  {
    SubLObject cdolist_list_var = answers;
    SubLObject node = NIL;
    node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == itp_node_parent( node ) )
      {
        queues.enqueue( node, queue );
      }
      cdolist_list_var = cdolist_list_var.rest();
      node = cdolist_list_var.first();
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89232L)
  public static SubLObject join_template_components_p(final SubLObject formula)
  {
    return Equality.eql( cycl_utilities.formula_arg0( formula ), $const317$joinTemplateComponents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89349L)
  public static SubLObject join_template_components_node_p(final SubLObject node)
  {
    if( NIL != itp_node_p( node ) && NIL != join_template_components_p( itp_node_new_parse( node ) ) )
    {
      return itp_node_new_parse( node );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89540L)
  public static SubLObject join_template_components_word_list(final SubLObject formula)
  {
    if( NIL != join_template_components_p( formula ) )
    {
      SubLObject all_words = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg2( formula, UNPROVIDED ), $kw318$IGNORE );
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != parsing_utilities.result_of_parsing_formulaP( result ) )
        {
          SubLObject cdolist_list_var_$105 = rkf_concept_harvester.rkf_ch_string_tokenize( parsing_utilities.result_of_parsing_words( result ) );
          SubLObject this_word = NIL;
          this_word = cdolist_list_var_$105.first();
          while ( NIL != cdolist_list_var_$105)
          {
            all_words = ConsesLow.cons( this_word, all_words );
            cdolist_list_var_$105 = cdolist_list_var_$105.rest();
            this_word = cdolist_list_var_$105.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
      return string_utilities.bunge( Sequences.reverse( all_words ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89936L)
  public static SubLObject join_template_components_node_word_list(final SubLObject node)
  {
    final SubLObject formula = join_template_components_node_p( node );
    if( NIL != formula )
    {
      return join_template_components_word_list( formula );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90138L)
  public static SubLObject has_join_template_componentsP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != recognition.$perform_template_component_join$.getDynamicValue( thread ) && NIL != list_utilities.tree_find( $const317$joinTemplateComponents, formula, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90304L)
  public static SubLObject has_substitutable_childrenP(final SubLObject formula)
  {
    return list_utilities.tree_find_if( $sym319$SUBSTITUTABLE_CHILD_FORMULA_, formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90421L)
  public static SubLObject partial_parse_filter_function(final SubLObject item)
  {
    return makeBoolean( item.eql( $const295$TheSentenceSubject ) || item.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90549L)
  public static SubLObject partial_parsesP(final SubLObject formula)
  {
    return list_utilities.tree_find_if( Symbols.symbol_function( $sym320$PARTIAL_PARSE_FILTER_FUNCTION ), formula, UNPROVIDED );
  }

  public static SubLObject declare_iterative_template_parser_file()
  {
    SubLFiles.declareFunction( me, "kb_node_analyze_category", "KB-NODE-ANALYZE-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_kb_node_internal_counter", "RESET-KB-NODE-INTERNAL-COUNTER", 0, 0, false );
    SubLFiles.declareFunction( me, "next_available_kb_node", "NEXT-AVAILABLE-KB-NODE", 2, 1, false );
    SubLFiles.declareFunction( me, "new_syntactic_functional_node", "NEW-SYNTACTIC-FUNCTIONAL-NODE", 1, 2, false );
    SubLFiles.declareFunction( me, "new_syntactic_choice_node", "NEW-SYNTACTIC-CHOICE-NODE", 1, 3, false );
    SubLFiles.declareFunction( me, "kb_nodes_kill", "KB-NODES-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_syntactic_node_tree", "KILL-SYNTACTIC-NODE-TREE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_new_syntactic_kb_node", "WITH-NEW-SYNTACTIC-KB-NODE" );
    SubLFiles.declareMacro( me, "with_new_syntactic_kb_node_wXgafs", "WITH-NEW-SYNTACTIC-KB-NODE-W/GAFS" );
    SubLFiles.declareFunction( me, "syntactic_option_node_p", "SYNTACTIC-OPTION-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_syntactic_node_toolkit", "CB-LINK-SYNTACTIC-NODE-TOOLKIT", 1, 0, false );
    SubLFiles.declareFunction( me, "exclude_syntactic_option", "EXCLUDE-SYNTACTIC-OPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "restore_syntactic_option", "RESTORE-SYNTACTIC-OPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "asserting_treesP", "ASSERTING-TREES?", 0, 0, false );
    SubLFiles.declareMacro( me, "while_saving_rtp_parse_into_kb", "WHILE-SAVING-RTP-PARSE-INTO-KB" );
    SubLFiles.declareFunction( me, "save_rtp_kb_parse_if_desired", "SAVE-RTP-KB-PARSE-IF-DESIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_rtp_kb_parse_node", "GET-RTP-KB-PARSE-NODE", 0, 0, false );
    SubLFiles.declareFunction( me, "get_and_erase_rtp_kb_parse_node", "GET-AND-ERASE-RTP-KB-PARSE-NODE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_the_rtp_parse_tokenization", "WITH-THE-RTP-PARSE-TOKENIZATION" );
    SubLFiles.declareFunction( me, "rtp_component_tokenization", "RTP-COMPONENT-TOKENIZATION", 1, 1, false );
    SubLFiles.declareFunction( me, "rtp_parse_exp", "RTP-PARSE-EXP", 1, 3, false );
    SubLFiles.declareFunction( me, "rtp_parse_exp_wXvpp", "RTP-PARSE-EXP-W/VPP", 1, 3, false );
    SubLFiles.declareFunction( me, "rtp_parse_wXvpp", "RTP-PARSE-W/VPP", 1, 3, false );
    SubLFiles.declareFunction( me, "itp_sequel", "ITP-SEQUEL", 1, 3, false );
    SubLFiles.declareFunction( me, "categorized_rtp_parse_exp", "CATEGORIZED-RTP-PARSE-EXP", 1, 3, false );
    SubLFiles.declareFunction( me, "categorized_itp_sequel", "CATEGORIZED-ITP-SEQUEL", 1, 3, false );
    SubLFiles.declareFunction( me, "delete_duplicate_tp_results", "DELETE-DUPLICATE-TP-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_rewrite", "ITP-REWRITE", 1, 3, false );
    SubLFiles.declareFunction( me, "rewrites_only", "REWRITES-ONLY", 1, 0, false );
    SubLFiles.declareFunction( me, "rewrites_helper", "REWRITES-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_nuke_syntactic_nodes", "ITP-NUKE-SYNTACTIC-NODES", 0, 1, false );
    SubLFiles.declareFunction( me, "itp_node_print_function_trampoline", "ITP-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_node_p", "ITP-NODE-P", 1, 0, false );
    new $itp_node_p$UnaryFunction();
    SubLFiles.declareFunction( me, "itp_node_id", "ITP-NODE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_parent", "ITP-NODE-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_component", "ITP-NODE-COMPONENT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_span", "ITP-NODE-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_new_parse", "ITP-NODE-NEW-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_assertion", "ITP-NODE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_children", "ITP-NODE-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_permutations", "ITP-NODE-PERMUTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_syntactic_node", "ITP-NODE-SYNTACTIC-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_syntactic_choices", "ITP-NODE-SYNTACTIC-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_id", "_CSETF-ITP-NODE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_parent", "_CSETF-ITP-NODE-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_component", "_CSETF-ITP-NODE-COMPONENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_span", "_CSETF-ITP-NODE-SPAN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_new_parse", "_CSETF-ITP-NODE-NEW-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_assertion", "_CSETF-ITP-NODE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_children", "_CSETF-ITP-NODE-CHILDREN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_permutations", "_CSETF-ITP-NODE-PERMUTATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_syntactic_node", "_CSETF-ITP-NODE-SYNTACTIC-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_node_syntactic_choices", "_CSETF-ITP-NODE-SYNTACTIC-CHOICES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_itp_node", "MAKE-ITP-NODE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_itp_node", "VISIT-DEFSTRUCT-ITP-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_itp_node_method", "VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_itp_node", "PRINT-ITP-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "construct_itp_node", "CONSTRUCT-ITP-NODE", 5, 0, false );
    SubLFiles.declareFunction( me, "add_itp_node_child", "ADD-ITP-NODE-CHILD", 2, 1, false );
    SubLFiles.declareFunction( me, "itp_node_create_initial_head", "ITP-NODE-CREATE-INITIAL-HEAD", 3, 0, false );
    SubLFiles.declareFunction( me, "itp_node_get_legitimate_children", "ITP-NODE-GET-LEGITIMATE-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_get_dominance_gafs", "ITP-NODE-GET-DOMINANCE-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_clear_syntactic_choices", "ITP-NODE-CLEAR-SYNTACTIC-CHOICES", 1, 1, false );
    SubLFiles.declareFunction( me, "itp_node_initialize_syntactic_choices", "ITP-NODE-INITIALIZE-SYNTACTIC-CHOICES", 1, 1, false );
    SubLFiles.declareFunction( me, "itp_choice_node_for_component", "ITP-CHOICE-NODE-FOR-COMPONENT", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_node_find_or_initialize_syntactic_choices", "ITP-NODE-FIND-OR-INITIALIZE-SYNTACTIC-CHOICES", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_node_tokenization", "ITP-NODE-TOKENIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_node_equalP", "ITP-NODE-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_itp_node_syntactic_node", "FIND-OR-CREATE-ITP-NODE-SYNTACTIC-NODE", 2, 2, false );
    SubLFiles.declareFunction( me, "itp_state_print_function_trampoline", "ITP-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_state_p", "ITP-STATE-P", 1, 0, false );
    new $itp_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "itp_state_sequence", "ITP-STATE-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_complete_parses_only", "ITP-STATE-COMPLETE-PARSES-ONLY", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_work_set", "ITP-STATE-WORK-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_solution_set", "ITP-STATE-SOLUTION-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_sentence", "ITP-STATE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_category", "ITP-STATE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_cache", "ITP-STATE-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_psp_charts", "ITP-STATE-PSP-CHARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_state_working_mt", "ITP-STATE-WORKING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_sequence", "_CSETF-ITP-STATE-SEQUENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_complete_parses_only", "_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_work_set", "_CSETF-ITP-STATE-WORK-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_solution_set", "_CSETF-ITP-STATE-SOLUTION-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_sentence", "_CSETF-ITP-STATE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_category", "_CSETF-ITP-STATE-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_cache", "_CSETF-ITP-STATE-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_psp_charts", "_CSETF-ITP-STATE-PSP-CHARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_state_working_mt", "_CSETF-ITP-STATE-WORKING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_itp_state", "MAKE-ITP-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_itp_state", "VISIT-DEFSTRUCT-ITP-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_itp_state_method", "VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_itp_state", "PRINT-ITP-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_itp_state", "NEW-ITP-STATE", 1, 2, false );
    SubLFiles.declareFunction( me, "destroy_itp_state", "DESTROY-ITP-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_itp_state_psp_chart_dictionary_internal", "NEW-ITP-STATE-PSP-CHART-DICTIONARY-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "new_itp_state_psp_chart_dictionary", "NEW-ITP-STATE-PSP-CHART-DICTIONARY", 0, 0, false );
    SubLFiles.declareFunction( me, "add_to_itp_solution", "ADD-TO-ITP-SOLUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "memoize_itp_attempt", "MEMOIZE-ITP-ATTEMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "is_a_known_itp_attemptP", "IS-A-KNOWN-ITP-ATTEMPT?", 2, 0, false );
    SubLFiles.declareFunction( me, "prime_itp_pump", "PRIME-ITP-PUMP", 2, 0, false );
    SubLFiles.declareFunction( me, "extend_itp_state", "EXTEND-ITP-STATE", 5, 3, false );
    SubLFiles.declareFunction( me, "extend_itp_state_multiple", "EXTEND-ITP-STATE-MULTIPLE", 5, 0, false );
    SubLFiles.declareFunction( me, "extend_itp_state_by_ps_parse", "EXTEND-ITP-STATE-BY-PS-PARSE", 6, 0, false );
    SubLFiles.declareFunction( me, "expand_itp_state", "EXPAND-ITP-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "appropriate_span_for_np_parsingP", "APPROPRIATE-SPAN-FOR-NP-PARSING?", 2, 0, false );
    SubLFiles.declareFunction( me, "appropriate_span_for_vbar_parsingP", "APPROPRIATE-SPAN-FOR-VBAR-PARSING?", 2, 0, false );
    SubLFiles.declareFunction( me, "appropriate_span_for_nbar_parsingP", "APPROPRIATE-SPAN-FOR-NBAR-PARSING?", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_ps_get_cycls_for_phrase_internal", "ITP-PS-GET-CYCLS-FOR-PHRASE-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "itp_ps_get_cycls_for_phrase", "ITP-PS-GET-CYCLS-FOR-PHRASE", 6, 0, false );
    SubLFiles.declareFunction( me, "itp_ps_parse_vbar_internal", "ITP-PS-PARSE-VBAR-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "itp_ps_parse_vbar", "ITP-PS-PARSE-VBAR", 2, 2, false );
    SubLFiles.declareFunction( me, "itp_find_or_create_appropriate_chart", "ITP-FIND-OR-CREATE-APPROPRIATE-CHART", 4, 0, false );
    SubLFiles.declareFunction( me, "get_chart_from_extra_psp_charts", "GET-CHART-FROM-EXTRA-PSP-CHARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_subspanP", "ITP-SUBSPAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "gap_type_for_category", "GAP-TYPE-FOR-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_for_category", "PRED-FOR-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_cat_for_pred", "RTP-CAT-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_cat_for_pos", "RTP-CAT-FOR-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_for_rtp_cat", "POS-FOR-RTP-CAT", 1, 0, false );
    SubLFiles.declareFunction( me, "best_rtp_cat_for_preds", "BEST-RTP-CAT-FOR-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_verb_phrasal_template_categoryP", "CLEAR-VERB-PHRASAL-TEMPLATE-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_verb_phrasal_template_categoryP", "REMOVE-VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "verb_phrasal_template_categoryP_internal", "VERB-PHRASAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "verb_phrasal_template_categoryP", "VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_verbal_template_categoryP", "CLEAR-VERBAL-TEMPLATE-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_verbal_template_categoryP", "REMOVE-VERBAL-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_template_categoryP_internal", "VERBAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_template_categoryP", "VERBAL-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_vbar_template_categoryP", "CLEAR-VBAR-TEMPLATE-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_vbar_template_categoryP", "REMOVE-VBAR-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "vbar_template_categoryP_internal", "VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "vbar_template_categoryP", "VBAR-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_rtp_vbar_template_categoryP", "CLEAR-RTP-VBAR-TEMPLATE-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rtp_vbar_template_categoryP", "REMOVE-RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_vbar_template_categoryP_internal", "RTP-VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_vbar_template_categoryP", "RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_vbar_template_categoryP", "EXTENDED-VBAR-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_predicative_adjp_template_categoryP", "CLEAR-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_predicative_adjp_template_categoryP", "REMOVE-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "predicative_adjp_template_categoryP_internal", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "predicative_adjp_template_categoryP", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_nominal_categoryP", "CLEAR-NOMINAL-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_nominal_categoryP", "REMOVE-NOMINAL-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_categoryP_internal", "NOMINAL-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_categoryP", "NOMINAL-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_adjectival_categoryP", "CLEAR-ADJECTIVAL-CATEGORY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_adjectival_categoryP", "REMOVE-ADJECTIVAL-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_categoryP_internal", "ADJECTIVAL-CATEGORY?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_categoryP", "ADJECTIVAL-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "number_template_categoryP", "NUMBER-TEMPLATE-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_categoryP", "VERBAL-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_itp_state_completely", "EXPAND-ITP-STATE-COMPLETELY", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_node_max_child_span_length", "ITP-NODE-MAX-CHILD-SPAN-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_output_sorting_function", "ITP-OUTPUT-SORTING-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_correct_span", "COMPUTE-CORRECT-SPAN", 2, 0, false );
    SubLFiles.declareFunction( me, "adjust_the_spans", "ADJUST-THE-SPANS", 2, 1, false );
    SubLFiles.declareFunction( me, "is_this_a_thelist_spanP", "IS-THIS-A-THELIST-SPAN?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_this_a_numeric_spanP", "IS-THIS-A-NUMERIC-SPAN?", 1, 0, false );
    SubLFiles.declareFunction( me, "dependent_span_coverage", "DEPENDENT-SPAN-COVERAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "initial_span_gap", "INITIAL-SPAN-GAP", 2, 0, false );
    SubLFiles.declareFunction( me, "full_span_coverageP", "FULL-SPAN-COVERAGE?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ternary_quant_fns", "GET-TERNARY-QUANT-FNS", 0, 0, false );
    SubLFiles.declareFunction( me, "is_this_a_quant_fnP", "IS-THIS-A-QUANT-FN?", 1, 0, false );
    SubLFiles.declareFunction( me, "surrogate_multi_word_componentP", "SURROGATE-MULTI-WORD-COMPONENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "reify_itp", "REIFY-ITP", 0, 1, false );
    SubLFiles.declareFunction( me, "reify_itp_int", "REIFY-ITP-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cat_itp", "CAT-ITP", 0, 1, false );
    SubLFiles.declareFunction( me, "transform_nl_quant_forms", "TRANSFORM-NL-QUANT-FORMS", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_attr_w_locationP", "NL-ATTR-W-LOCATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_itp_results", "SORT-ITP-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_contains_invalid_surrogateP", "RTP-CONTAINS-INVALID-SURROGATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "unassembled_phraseP", "UNASSEMBLED-PHRASE?", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_assemble_phrases", "TRANSFORM-ASSEMBLE-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_solution_node_analysis", "PERFORM-SOLUTION-NODE-ANALYSIS", 4, 0, false );
    SubLFiles.declareFunction( me, "rtp_sort_constit_parses", "RTP-SORT-CONSTIT-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "merge_parse_results", "MERGE-PARSE-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_differences", "FIND-DIFFERENCES", 2, 1, false );
    SubLFiles.declareFunction( me, "build_return_format", "BUILD-RETURN-FORMAT", 3, 0, false );
    SubLFiles.declareFunction( me, "cat_for_result", "CAT-FOR-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "force_for_result", "FORCE-FOR-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_do_substitutions", "TP-DO-SUBSTITUTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "tp_do_substitutions_int", "TP-DO-SUBSTITUTIONS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "tp_substitutable_formulaP", "TP-SUBSTITUTABLE-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "substitutable_child_nodeP", "SUBSTITUTABLE-CHILD-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "substitutable_child_formulaP", "SUBSTITUTABLE-CHILD-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "enqueue_solution_roots", "ENQUEUE-SOLUTION-ROOTS", 2, 0, false );
    SubLFiles.declareFunction( me, "join_template_components_p", "JOIN-TEMPLATE-COMPONENTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "join_template_components_node_p", "JOIN-TEMPLATE-COMPONENTS-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "join_template_components_word_list", "JOIN-TEMPLATE-COMPONENTS-WORD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "join_template_components_node_word_list", "JOIN-TEMPLATE-COMPONENTS-NODE-WORD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "has_join_template_componentsP", "HAS-JOIN-TEMPLATE-COMPONENTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "has_substitutable_childrenP", "HAS-SUBSTITUTABLE-CHILDREN?", 1, 0, false );
    SubLFiles.declareFunction( me, "partial_parse_filter_function", "PARTIAL-PARSE-FILTER-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "partial_parsesP", "PARTIAL-PARSES?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_iterative_template_parser_file()
  {
    $kb_node_gathering_modeP$ = SubLFiles.defparameter( "*KB-NODE-GATHERING-MODE?*", NIL );
    $kb_node_reify_as_functionsP$ = SubLFiles.defparameter( "*KB-NODE-REIFY-AS-FUNCTIONS?*", NIL );
    $kb_node_internal_counter$ = SubLFiles.defparameter( "*KB-NODE-INTERNAL-COUNTER*", ZERO_INTEGER );
    $last_itp_state_created$ = SubLFiles.defparameter( "*LAST-ITP-STATE-CREATED*", NIL );
    $rtp_graphing_filter$ = SubLFiles.defparameter( "*RTP-GRAPHING-FILTER*", $kw99$RTP );
    $rtp_trace_aggressivelyP$ = SubLFiles.defparameter( "*RTP-TRACE-AGGRESSIVELY?*", NIL );
    $rtp_kb_parse_mt$ = SubLFiles.defparameter( "*RTP-KB-PARSE-MT*", NIL );
    $rtp_exhaustive_kb_parseP$ = SubLFiles.defparameter( "*RTP-EXHAUSTIVE-KB-PARSE?*", NIL );
    $rtp_reify_doomed_parsesP$ = SubLFiles.defparameter( "*RTP-REIFY-DOOMED-PARSES?*", NIL );
    $rtp_latest_kb_parse_tree$ = SubLFiles.defparameter( "*RTP-LATEST-KB-PARSE-TREE*", NIL );
    $rtp_component_tokenizations$ = SubLFiles.deflexical( "*RTP-COMPONENT-TOKENIZATIONS*", maybeDefault( $sym102$_RTP_COMPONENT_TOKENIZATIONS_, $rtp_component_tokenizations$, () -> ( dictionary.new_dictionary( EQUAL,
        UNPROVIDED ) ) ) );
    $rtp_relevant_tokenization$ = SubLFiles.defparameter( "*RTP-RELEVANT-TOKENIZATION*", NIL );
    $dtp_itp_node$ = SubLFiles.defconstant( "*DTP-ITP-NODE*", $sym123$ITP_NODE );
    $dtp_itp_state$ = SubLFiles.defconstant( "*DTP-ITP-STATE*", $sym190$ITP_STATE );
    $extend_itp_state_analyze_assertionP$ = SubLFiles.defparameter( "*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*", NIL );
    $npparse_graph_type$ = SubLFiles.defparameter( "*NPPARSE-GRAPH-TYPE*", $str233$R );
    $trace_itp_state_expansion$ = SubLFiles.defparameter( "*TRACE-ITP-STATE-EXPANSION*", NIL );
    $possible_nps$ = SubLFiles.defparameter( "*POSSIBLE-NPS*", NIL );
    $verb_phrasal_template_categoryP_caching_state$ = SubLFiles.deflexical( "*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL );
    $verbal_template_categoryP_caching_state$ = SubLFiles.deflexical( "*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL );
    $vbar_template_categoryP_caching_state$ = SubLFiles.deflexical( "*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL );
    $rtp_vbar_template_categoryP_caching_state$ = SubLFiles.deflexical( "*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL );
    $predicative_adjp_template_categoryP_caching_state$ = SubLFiles.deflexical( "*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL );
    $nominal_categoryP_caching_state$ = SubLFiles.deflexical( "*NOMINAL-CATEGORY?-CACHING-STATE*", NIL );
    $adjectival_categoryP_caching_state$ = SubLFiles.deflexical( "*ADJECTIVAL-CATEGORY?-CACHING-STATE*", NIL );
    $compute_top_level_form_only$ = SubLFiles.defparameter( "*COMPUTE-TOP-LEVEL-FORM-ONLY*", NIL );
    $compute_all_resolvable_expansions$ = SubLFiles.defparameter( "*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*", NIL );
    $inform_about_pruned_templates$ = SubLFiles.deflexical( "*INFORM-ABOUT-PRUNED-TEMPLATES*", NIL );
    $set_of_attempted_subparses$ = SubLFiles.defparameter( "*SET-OF-ATTEMPTED-SUBPARSES*", NIL );
    $ternary_quant_fns$ = SubLFiles.deflexical( "*TERNARY-QUANT-FNS*", NIL );
    return NIL;
  }

  public static SubLObject setup_iterative_template_parser_file()
  {
    cb_utilities.setup_cb_link_method( $kw94$SYNTACTIC_NODE_TOOLKIT, $sym95$CB_LINK_SYNTACTIC_NODE_TOOLKIT, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym96$EXCLUDE_SYNTACTIC_OPTION, $kw97$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym98$RESTORE_SYNTACTIC_OPTION, $kw97$HTML_HANDLER );
    subl_macro_promotions.declare_defglobal( $sym102$_RTP_COMPONENT_TOKENIZATIONS_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_itp_node$.getGlobalValue(), Symbols.symbol_function( $sym130$ITP_NODE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list131 );
    Structures.def_csetf( $sym132$ITP_NODE_ID, $sym133$_CSETF_ITP_NODE_ID );
    Structures.def_csetf( $sym134$ITP_NODE_PARENT, $sym135$_CSETF_ITP_NODE_PARENT );
    Structures.def_csetf( $sym136$ITP_NODE_COMPONENT, $sym137$_CSETF_ITP_NODE_COMPONENT );
    Structures.def_csetf( $sym138$ITP_NODE_SPAN, $sym139$_CSETF_ITP_NODE_SPAN );
    Structures.def_csetf( $sym140$ITP_NODE_NEW_PARSE, $sym141$_CSETF_ITP_NODE_NEW_PARSE );
    Structures.def_csetf( $sym142$ITP_NODE_ASSERTION, $sym143$_CSETF_ITP_NODE_ASSERTION );
    Structures.def_csetf( $sym144$ITP_NODE_CHILDREN, $sym145$_CSETF_ITP_NODE_CHILDREN );
    Structures.def_csetf( $sym146$ITP_NODE_PERMUTATIONS, $sym147$_CSETF_ITP_NODE_PERMUTATIONS );
    Structures.def_csetf( $sym148$ITP_NODE_SYNTACTIC_NODE, $sym149$_CSETF_ITP_NODE_SYNTACTIC_NODE );
    Structures.def_csetf( $sym150$ITP_NODE_SYNTACTIC_CHOICES, $sym151$_CSETF_ITP_NODE_SYNTACTIC_CHOICES );
    Equality.identity( $sym123$ITP_NODE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_node$.getGlobalValue(), Symbols.symbol_function( $sym166$VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_itp_state$.getGlobalValue(), Symbols.symbol_function( $sym197$ITP_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list198 );
    Structures.def_csetf( $sym199$ITP_STATE_SEQUENCE, $sym200$_CSETF_ITP_STATE_SEQUENCE );
    Structures.def_csetf( $sym201$ITP_STATE_COMPLETE_PARSES_ONLY, $sym202$_CSETF_ITP_STATE_COMPLETE_PARSES_ONLY );
    Structures.def_csetf( $sym203$ITP_STATE_WORK_SET, $sym204$_CSETF_ITP_STATE_WORK_SET );
    Structures.def_csetf( $sym205$ITP_STATE_SOLUTION_SET, $sym206$_CSETF_ITP_STATE_SOLUTION_SET );
    Structures.def_csetf( $sym207$ITP_STATE_SENTENCE, $sym208$_CSETF_ITP_STATE_SENTENCE );
    Structures.def_csetf( $sym209$ITP_STATE_CATEGORY, $sym210$_CSETF_ITP_STATE_CATEGORY );
    Structures.def_csetf( $sym211$ITP_STATE_CACHE, $sym212$_CSETF_ITP_STATE_CACHE );
    Structures.def_csetf( $sym213$ITP_STATE_PSP_CHARTS, $sym214$_CSETF_ITP_STATE_PSP_CHARTS );
    Structures.def_csetf( $sym215$ITP_STATE_WORKING_MT, $sym216$_CSETF_ITP_STATE_WORKING_MT );
    Equality.identity( $sym190$ITP_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_state$.getGlobalValue(), Symbols.symbol_function( $sym226$VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD ) );
    memoization_state.note_memoized_function( $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY );
    memoization_state.note_memoized_function( $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE );
    memoization_state.note_memoized_function( $sym243$ITP_PS_PARSE_VBAR );
    memoization_state.note_globally_cached_function( $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym257$VERBAL_TEMPLATE_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym259$VBAR_TEMPLATE_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym262$RTP_VBAR_TEMPLATE_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym269$NOMINAL_CATEGORY_ );
    memoization_state.note_globally_cached_function( $sym271$ADJECTIVAL_CATEGORY_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_iterative_template_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_iterative_template_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_iterative_template_parser_file();
  }
  static
  {
    me = new iterative_template_parser();
    $kb_node_gathering_modeP$ = null;
    $kb_node_reify_as_functionsP$ = null;
    $kb_node_internal_counter$ = null;
    $last_itp_state_created$ = null;
    $rtp_graphing_filter$ = null;
    $rtp_trace_aggressivelyP$ = null;
    $rtp_kb_parse_mt$ = null;
    $rtp_exhaustive_kb_parseP$ = null;
    $rtp_reify_doomed_parsesP$ = null;
    $rtp_latest_kb_parse_tree$ = null;
    $rtp_component_tokenizations$ = null;
    $rtp_relevant_tokenization$ = null;
    $dtp_itp_node$ = null;
    $dtp_itp_state$ = null;
    $extend_itp_state_analyze_assertionP$ = null;
    $npparse_graph_type$ = null;
    $trace_itp_state_expansion$ = null;
    $possible_nps$ = null;
    $verb_phrasal_template_categoryP_caching_state$ = null;
    $verbal_template_categoryP_caching_state$ = null;
    $vbar_template_categoryP_caching_state$ = null;
    $rtp_vbar_template_categoryP_caching_state$ = null;
    $predicative_adjp_template_categoryP_caching_state$ = null;
    $nominal_categoryP_caching_state$ = null;
    $adjectival_categoryP_caching_state$ = null;
    $compute_top_level_form_only$ = null;
    $compute_all_resolvable_expansions$ = null;
    $inform_about_pruned_templates$ = null;
    $set_of_attempted_subparses$ = null;
    $ternary_quant_fns$ = null;
    $const0$SyntacticNode = constant_handles.reader_make_constant_shell( makeString( "SyntacticNode" ) );
    $sym1$_CAT = makeSymbol( "?CAT" );
    $const2$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const3$syntacticNodeCategory = constant_handles.reader_make_constant_shell( makeString( "syntacticNodeCategory" ) );
    $list4 = ConsesLow.list( makeSymbol( "?CAT" ) );
    $const5$ParsingTemplateCategory = constant_handles.reader_make_constant_shell( makeString( "ParsingTemplateCategory" ) );
    $const6$TemplateParsingMt = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) );
    $sym7$_TYPE = makeSymbol( "?TYPE" );
    $const8$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const9$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list10 = ConsesLow.list( makeSymbol( "?TEMPLATE-TYPE" ) );
    $list11 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nlPhraseTypeForTemplateCategory" ) ), makeSymbol( "?TYPE" ), makeSymbol( "?TEMPLATE-TYPE" ) ) );
    $const12$RKFParsingMt = constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) );
    $sym13$_NODE = makeSymbol( "?NODE" );
    $const14$NLPhraseType = constant_handles.reader_make_constant_shell( makeString( "NLPhraseType" ) );
    $const15$NLWordForm = constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) );
    $str16$Node__A__D = makeString( "Node-~A-~D" );
    $const17$NLPhrase = constant_handles.reader_make_constant_shell( makeString( "NLPhrase" ) );
    $sym18$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $list19 = ConsesLow.list( makeSymbol( "NODE-TYPE" ), makeSymbol( "LINGUISTIC-CATEGORY" ) );
    $const20$SyntacticNode_MatrixClause = constant_handles.reader_make_constant_shell( makeString( "SyntacticNode-MatrixClause" ) );
    $str21$Root = makeString( "Root" );
    $str22$Unrecognized = makeString( "Unrecognized" );
    $list23 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "CAT" ) );
    $str24$_A_A = makeString( "~A~A" );
    $const25$PhraseFn = constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) );
    $str26$P = makeString( "P" );
    $str27$Bar = makeString( "Bar" );
    $str28$____creating_a__A_node__of_type__ = makeString( "*** creating a ~A node, of type ~A and cat ~A" );
    $const29$SententialConstituentType = constant_handles.reader_make_constant_shell( makeString( "SententialConstituentType" ) );
    $const30$SyntacticChoiceNode = constant_handles.reader_make_constant_shell( makeString( "SyntacticChoiceNode" ) );
    $str31$Choice = makeString( "Choice" );
    $const32$optionNodes = constant_handles.reader_make_constant_shell( makeString( "optionNodes" ) );
    $const33$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw34$BREADTH = makeKeyword( "BREADTH" );
    $kw35$QUEUE = makeKeyword( "QUEUE" );
    $kw36$STACK = makeKeyword( "STACK" );
    $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw38$ERROR = makeKeyword( "ERROR" );
    $str39$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym40$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw41$CERROR = makeKeyword( "CERROR" );
    $str42$continue_anyway = makeString( "continue anyway" );
    $kw43$WARN = makeKeyword( "WARN" );
    $str44$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str45$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str46$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list47 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str48$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const49$CycParseTree = constant_handles.reader_make_constant_shell( makeString( "CycParseTree" ) );
    $const50$CycTokenization = constant_handles.reader_make_constant_shell( makeString( "CycTokenization" ) );
    $const51$CycParsingToken = constant_handles.reader_make_constant_shell( makeString( "CycParsingToken" ) );
    $sym52$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const53$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const54$syntacticDescendants = constant_handles.reader_make_constant_shell( makeString( "syntacticDescendants" ) );
    $kw55$GAF = makeKeyword( "GAF" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "MT" ), makeSymbol( "&KEY" ), makeSymbol( "CATEGORY" ), makeSymbol( "OPTIONS" ), makeSymbol( "CHOICE" ), ConsesLow.list( makeSymbol(
        "SOURCE" ), constant_handles.reader_make_constant_shell( makeString( "CycRecursiveTemplateParser" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list57 = ConsesLow.list( makeKeyword( "CATEGORY" ), makeKeyword( "OPTIONS" ), makeKeyword( "CHOICE" ), makeKeyword( "SOURCE" ) );
    $kw58$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw59$CATEGORY = makeKeyword( "CATEGORY" );
    $kw60$OPTIONS = makeKeyword( "OPTIONS" );
    $kw61$CHOICE = makeKeyword( "CHOICE" );
    $kw62$SOURCE = makeKeyword( "SOURCE" );
    $const63$CycRecursiveTemplateParser = constant_handles.reader_make_constant_shell( makeString( "CycRecursiveTemplateParser" ) );
    $sym64$CHOICE_CAT = makeUninternedSymbol( "CHOICE-CAT" );
    $sym65$CLET = makeSymbol( "CLET" );
    $sym66$PWHEN = makeSymbol( "PWHEN" );
    $sym67$CAND = makeSymbol( "CAND" );
    $sym68$NULL = makeSymbol( "NULL" );
    $sym69$CSETQ = makeSymbol( "CSETQ" );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SyntacticChoiceNode" ) ) );
    $sym71$FIF = makeSymbol( "FIF" );
    $sym72$NEW_SYNTACTIC_CHOICE_NODE = makeSymbol( "NEW-SYNTACTIC-CHOICE-NODE" );
    $sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE = makeSymbol( "NEW-SYNTACTIC-FUNCTIONAL-NODE" );
    $sym74$FORT_P = makeSymbol( "FORT-P" );
    $sym75$FI_ASSERT_INT = makeSymbol( "FI-ASSERT-INT" );
    $sym76$LIST = makeSymbol( "LIST" );
    $const77$syntacticNodeCreator = constant_handles.reader_make_constant_shell( makeString( "syntacticNodeCreator" ) );
    $const78$InstanceWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "InstanceWithRelationFromFn" ) );
    $const79$ProgramCopyFn = constant_handles.reader_make_constant_shell( makeString( "ProgramCopyFn" ) );
    $list80 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "partOfIBT" ) ), constant_handles.reader_make_constant_shell( makeString( "Cyc" ) ) );
    $list81 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "NODE" ), makeSymbol( "MT" ), makeSymbol( "NEW-GAFS" ), makeSymbol( "OLD-GAFS" ), makeSymbol( "&KEY" ), makeSymbol( "CATEGORY" ), makeSymbol(
        "OPTIONS" ), makeSymbol( "CHOICE" ), ConsesLow.list( makeSymbol( "SOURCE" ), constant_handles.reader_make_constant_shell( makeString( "CycRecursiveTemplateParser" ) ) )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym82$TEST_GAF = makeUninternedSymbol( "TEST-GAF" );
    $sym83$CHOICE_CAT = makeUninternedSymbol( "CHOICE-CAT" );
    $list84 = ConsesLow.list( makeSymbol( "*KB-NODE-GATHERING-MODE?*" ), T );
    $sym85$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym86$CDOLIST = makeSymbol( "CDOLIST" );
    $sym87$CPUSH = makeSymbol( "CPUSH" );
    $const88$excludedOptionNodes = constant_handles.reader_make_constant_shell( makeString( "excludedOptionNodes" ) );
    $kw89$MAIN = makeKeyword( "MAIN" );
    $str90$restore_syntactic_option__A = makeString( "restore-syntactic-option&~A" );
    $str91$_Restore_Syntactic_Option_ = makeString( "[Restore Syntactic Option]" );
    $str92$exclude_syntactic_option__A = makeString( "exclude-syntactic-option&~A" );
    $str93$_Exclude_Syntactic_Option_ = makeString( "[Exclude Syntactic Option]" );
    $kw94$SYNTACTIC_NODE_TOOLKIT = makeKeyword( "SYNTACTIC-NODE-TOOLKIT" );
    $sym95$CB_LINK_SYNTACTIC_NODE_TOOLKIT = makeSymbol( "CB-LINK-SYNTACTIC-NODE-TOOLKIT" );
    $sym96$EXCLUDE_SYNTACTIC_OPTION = makeSymbol( "EXCLUDE-SYNTACTIC-OPTION" );
    $kw97$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym98$RESTORE_SYNTACTIC_OPTION = makeSymbol( "RESTORE-SYNTACTIC-OPTION" );
    $kw99$RTP = makeKeyword( "RTP" );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "*RTP-LATEST-KB-PARSE-TREE*" ), makeKeyword( "SAVE" ) ) );
    $kw101$SAVE = makeKeyword( "SAVE" );
    $sym102$_RTP_COMPONENT_TOKENIZATIONS_ = makeSymbol( "*RTP-COMPONENT-TOKENIZATIONS*" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "SAVE-HERE" ), makeSymbol( "OFFSET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym104$WITH_PARSE_TOKENIZATION = makeSymbol( "WITH-PARSE-TOKENIZATION" );
    $sym105$_RTP_RELEVANT_TOKENIZATION_ = makeSymbol( "*RTP-RELEVANT-TOKENIZATION*" );
    $kw106$OFFSET = makeKeyword( "OFFSET" );
    $sym107$PIF = makeSymbol( "PIF" );
    $list108 = ConsesLow.list( makeSymbol( "ASSERTING-TREES?" ) );
    $sym109$PROGN = makeSymbol( "PROGN" );
    $sym110$SETTING_PARSE_ROOT_NODE = makeSymbol( "SETTING-PARSE-ROOT-NODE" );
    $const111$tokenizationInputString = constant_handles.reader_make_constant_shell( makeString( "tokenizationInputString" ) );
    $const112$tokenString = constant_handles.reader_make_constant_shell( makeString( "tokenString" ) );
    $const113$nthTokenInTokenization = constant_handles.reader_make_constant_shell( makeString( "nthTokenInTokenization" ) );
    $const114$numberOfTokensInTokenization = constant_handles.reader_make_constant_shell( makeString( "numberOfTokensInTokenization" ) );
    $const115$STemplate = constant_handles.reader_make_constant_shell( makeString( "STemplate" ) );
    $const116$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym117$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $str118$_S_is_not_a_template_category__ = makeString( "~S is not a template category~%" );
    $const119$parseTreeOfTokenization = constant_handles.reader_make_constant_shell( makeString( "parseTreeOfTokenization" ) );
    $kw120$ASSERTION = makeKeyword( "ASSERTION" );
    $const121$RewriteSequenceFn = constant_handles.reader_make_constant_shell( makeString( "RewriteSequenceFn" ) );
    $const122$ToyParseTreeMt_FullSentences = constant_handles.reader_make_constant_shell( makeString( "ToyParseTreeMt-FullSentences" ) );
    $sym123$ITP_NODE = makeSymbol( "ITP-NODE" );
    $sym124$ITP_NODE_P = makeSymbol( "ITP-NODE-P" );
    $list125 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "PARENT" ), makeSymbol( "COMPONENT" ), makeSymbol( "SPAN" ), makeSymbol( "NEW-PARSE" ), makeSymbol( "ASSERTION" ), makeSymbol(
        "CHILDREN" ), makeSymbol( "PERMUTATIONS" ), makeSymbol( "SYNTACTIC-NODE" ), makeSymbol( "SYNTACTIC-CHOICES" )
    } );
    $list126 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "PARENT" ), makeKeyword( "COMPONENT" ), makeKeyword( "SPAN" ), makeKeyword( "NEW-PARSE" ), makeKeyword( "ASSERTION" ), makeKeyword(
        "CHILDREN" ), makeKeyword( "PERMUTATIONS" ), makeKeyword( "SYNTACTIC-NODE" ), makeKeyword( "SYNTACTIC-CHOICES" )
    } );
    $list127 = ConsesLow.list( new SubLObject[] { makeSymbol( "ITP-NODE-ID" ), makeSymbol( "ITP-NODE-PARENT" ), makeSymbol( "ITP-NODE-COMPONENT" ), makeSymbol( "ITP-NODE-SPAN" ), makeSymbol( "ITP-NODE-NEW-PARSE" ),
      makeSymbol( "ITP-NODE-ASSERTION" ), makeSymbol( "ITP-NODE-CHILDREN" ), makeSymbol( "ITP-NODE-PERMUTATIONS" ), makeSymbol( "ITP-NODE-SYNTACTIC-NODE" ), makeSymbol( "ITP-NODE-SYNTACTIC-CHOICES" )
    } );
    $list128 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-ITP-NODE-ID" ), makeSymbol( "_CSETF-ITP-NODE-PARENT" ), makeSymbol( "_CSETF-ITP-NODE-COMPONENT" ), makeSymbol( "_CSETF-ITP-NODE-SPAN" ), makeSymbol(
        "_CSETF-ITP-NODE-NEW-PARSE" ), makeSymbol( "_CSETF-ITP-NODE-ASSERTION" ), makeSymbol( "_CSETF-ITP-NODE-CHILDREN" ), makeSymbol( "_CSETF-ITP-NODE-PERMUTATIONS" ), makeSymbol( "_CSETF-ITP-NODE-SYNTACTIC-NODE" ),
      makeSymbol( "_CSETF-ITP-NODE-SYNTACTIC-CHOICES" )
    } );
    $sym129$PRINT_ITP_NODE = makeSymbol( "PRINT-ITP-NODE" );
    $sym130$ITP_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITP-NODE-PRINT-FUNCTION-TRAMPOLINE" );
    $list131 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITP-NODE-P" ) );
    $sym132$ITP_NODE_ID = makeSymbol( "ITP-NODE-ID" );
    $sym133$_CSETF_ITP_NODE_ID = makeSymbol( "_CSETF-ITP-NODE-ID" );
    $sym134$ITP_NODE_PARENT = makeSymbol( "ITP-NODE-PARENT" );
    $sym135$_CSETF_ITP_NODE_PARENT = makeSymbol( "_CSETF-ITP-NODE-PARENT" );
    $sym136$ITP_NODE_COMPONENT = makeSymbol( "ITP-NODE-COMPONENT" );
    $sym137$_CSETF_ITP_NODE_COMPONENT = makeSymbol( "_CSETF-ITP-NODE-COMPONENT" );
    $sym138$ITP_NODE_SPAN = makeSymbol( "ITP-NODE-SPAN" );
    $sym139$_CSETF_ITP_NODE_SPAN = makeSymbol( "_CSETF-ITP-NODE-SPAN" );
    $sym140$ITP_NODE_NEW_PARSE = makeSymbol( "ITP-NODE-NEW-PARSE" );
    $sym141$_CSETF_ITP_NODE_NEW_PARSE = makeSymbol( "_CSETF-ITP-NODE-NEW-PARSE" );
    $sym142$ITP_NODE_ASSERTION = makeSymbol( "ITP-NODE-ASSERTION" );
    $sym143$_CSETF_ITP_NODE_ASSERTION = makeSymbol( "_CSETF-ITP-NODE-ASSERTION" );
    $sym144$ITP_NODE_CHILDREN = makeSymbol( "ITP-NODE-CHILDREN" );
    $sym145$_CSETF_ITP_NODE_CHILDREN = makeSymbol( "_CSETF-ITP-NODE-CHILDREN" );
    $sym146$ITP_NODE_PERMUTATIONS = makeSymbol( "ITP-NODE-PERMUTATIONS" );
    $sym147$_CSETF_ITP_NODE_PERMUTATIONS = makeSymbol( "_CSETF-ITP-NODE-PERMUTATIONS" );
    $sym148$ITP_NODE_SYNTACTIC_NODE = makeSymbol( "ITP-NODE-SYNTACTIC-NODE" );
    $sym149$_CSETF_ITP_NODE_SYNTACTIC_NODE = makeSymbol( "_CSETF-ITP-NODE-SYNTACTIC-NODE" );
    $sym150$ITP_NODE_SYNTACTIC_CHOICES = makeSymbol( "ITP-NODE-SYNTACTIC-CHOICES" );
    $sym151$_CSETF_ITP_NODE_SYNTACTIC_CHOICES = makeSymbol( "_CSETF-ITP-NODE-SYNTACTIC-CHOICES" );
    $kw152$ID = makeKeyword( "ID" );
    $kw153$PARENT = makeKeyword( "PARENT" );
    $kw154$COMPONENT = makeKeyword( "COMPONENT" );
    $kw155$SPAN = makeKeyword( "SPAN" );
    $kw156$NEW_PARSE = makeKeyword( "NEW-PARSE" );
    $kw157$CHILDREN = makeKeyword( "CHILDREN" );
    $kw158$PERMUTATIONS = makeKeyword( "PERMUTATIONS" );
    $kw159$SYNTACTIC_NODE = makeKeyword( "SYNTACTIC-NODE" );
    $kw160$SYNTACTIC_CHOICES = makeKeyword( "SYNTACTIC-CHOICES" );
    $str161$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw162$BEGIN = makeKeyword( "BEGIN" );
    $sym163$MAKE_ITP_NODE = makeSymbol( "MAKE-ITP-NODE" );
    $kw164$SLOT = makeKeyword( "SLOT" );
    $kw165$END = makeKeyword( "END" );
    $sym166$VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD" );
    $str167$_ = makeString( " " );
    $str168$__ = makeString( "~%" );
    $sym169$PROPER_LIST_P = makeSymbol( "PROPER-LIST-P" );
    $const170$partOfIBT = constant_handles.reader_make_constant_shell( makeString( "partOfIBT" ) );
    $const171$Cyc = constant_handles.reader_make_constant_shell( makeString( "Cyc" ) );
    $const172$NLFunction = constant_handles.reader_make_constant_shell( makeString( "NLFunction" ) );
    $const173$NLTaggedTermDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "NLTaggedTermDenotingFunction" ) );
    $const174$VPTemplate = constant_handles.reader_make_constant_shell( makeString( "VPTemplate" ) );
    $const175$TheRNPParse = constant_handles.reader_make_constant_shell( makeString( "TheRNPParse" ) );
    $sym176$_VBAR = makeSymbol( "?VBAR" );
    $const177$memberOfList = constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) );
    $sym178$_CHILD = makeSymbol( "?CHILD" );
    $const179$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $list180 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "syntacticDaughters" ) ), makeSymbol( "?VBAR" ), makeSymbol( "?CHILD" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "syntacticNodeCategory" ) ), makeSymbol( "?VBAR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles
            .reader_make_constant_shell( makeString( "Verb" ) ) ) ) );
    $sym181$_V = makeSymbol( "?V" );
    $const182$syntacticDaughters = constant_handles.reader_make_constant_shell( makeString( "syntacticDaughters" ) );
    $list183 = ConsesLow.list( makeSymbol( "?V" ) );
    $list184 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "syntacticNodeCategory" ) ), makeSymbol( "?V" ), constant_handles.reader_make_constant_shell( makeString(
        "Verb" ) ) ) );
    $const185$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const186$syntacticNodeNthDaughter = constant_handles.reader_make_constant_shell( makeString( "syntacticNodeNthDaughter" ) );
    $list187 = ConsesLow.list( ONE_INTEGER, makeSymbol( "?NODE" ) );
    $list188 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "syntacticNodeCategory" ) ), makeSymbol( "?NODE" ), constant_handles.reader_make_constant_shell( makeString(
        "Verb" ) ) ) );
    $str189$____RTP_____Couldn_t_create_KB_no = makeString( "*** RTP *** Couldn't create KB node for ~A in ~A" );
    $sym190$ITP_STATE = makeSymbol( "ITP-STATE" );
    $sym191$ITP_STATE_P = makeSymbol( "ITP-STATE-P" );
    $list192 = ConsesLow.list( new SubLObject[] { makeSymbol( "SEQUENCE" ), makeSymbol( "COMPLETE-PARSES-ONLY" ), makeSymbol( "WORK-SET" ), makeSymbol( "SOLUTION-SET" ), makeSymbol( "SENTENCE" ), makeSymbol(
        "CATEGORY" ), makeSymbol( "CACHE" ), makeSymbol( "PSP-CHARTS" ), makeSymbol( "WORKING-MT" )
    } );
    $list193 = ConsesLow.list( new SubLObject[] { makeKeyword( "SEQUENCE" ), makeKeyword( "COMPLETE-PARSES-ONLY" ), makeKeyword( "WORK-SET" ), makeKeyword( "SOLUTION-SET" ), makeKeyword( "SENTENCE" ), makeKeyword(
        "CATEGORY" ), makeKeyword( "CACHE" ), makeKeyword( "PSP-CHARTS" ), makeKeyword( "WORKING-MT" )
    } );
    $list194 = ConsesLow.list( new SubLObject[] { makeSymbol( "ITP-STATE-SEQUENCE" ), makeSymbol( "ITP-STATE-COMPLETE-PARSES-ONLY" ), makeSymbol( "ITP-STATE-WORK-SET" ), makeSymbol( "ITP-STATE-SOLUTION-SET" ),
      makeSymbol( "ITP-STATE-SENTENCE" ), makeSymbol( "ITP-STATE-CATEGORY" ), makeSymbol( "ITP-STATE-CACHE" ), makeSymbol( "ITP-STATE-PSP-CHARTS" ), makeSymbol( "ITP-STATE-WORKING-MT" )
    } );
    $list195 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-ITP-STATE-SEQUENCE" ), makeSymbol( "_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY" ), makeSymbol( "_CSETF-ITP-STATE-WORK-SET" ), makeSymbol(
        "_CSETF-ITP-STATE-SOLUTION-SET" ), makeSymbol( "_CSETF-ITP-STATE-SENTENCE" ), makeSymbol( "_CSETF-ITP-STATE-CATEGORY" ), makeSymbol( "_CSETF-ITP-STATE-CACHE" ), makeSymbol( "_CSETF-ITP-STATE-PSP-CHARTS" ),
      makeSymbol( "_CSETF-ITP-STATE-WORKING-MT" )
    } );
    $sym196$PRINT_ITP_STATE = makeSymbol( "PRINT-ITP-STATE" );
    $sym197$ITP_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITP-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list198 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITP-STATE-P" ) );
    $sym199$ITP_STATE_SEQUENCE = makeSymbol( "ITP-STATE-SEQUENCE" );
    $sym200$_CSETF_ITP_STATE_SEQUENCE = makeSymbol( "_CSETF-ITP-STATE-SEQUENCE" );
    $sym201$ITP_STATE_COMPLETE_PARSES_ONLY = makeSymbol( "ITP-STATE-COMPLETE-PARSES-ONLY" );
    $sym202$_CSETF_ITP_STATE_COMPLETE_PARSES_ONLY = makeSymbol( "_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY" );
    $sym203$ITP_STATE_WORK_SET = makeSymbol( "ITP-STATE-WORK-SET" );
    $sym204$_CSETF_ITP_STATE_WORK_SET = makeSymbol( "_CSETF-ITP-STATE-WORK-SET" );
    $sym205$ITP_STATE_SOLUTION_SET = makeSymbol( "ITP-STATE-SOLUTION-SET" );
    $sym206$_CSETF_ITP_STATE_SOLUTION_SET = makeSymbol( "_CSETF-ITP-STATE-SOLUTION-SET" );
    $sym207$ITP_STATE_SENTENCE = makeSymbol( "ITP-STATE-SENTENCE" );
    $sym208$_CSETF_ITP_STATE_SENTENCE = makeSymbol( "_CSETF-ITP-STATE-SENTENCE" );
    $sym209$ITP_STATE_CATEGORY = makeSymbol( "ITP-STATE-CATEGORY" );
    $sym210$_CSETF_ITP_STATE_CATEGORY = makeSymbol( "_CSETF-ITP-STATE-CATEGORY" );
    $sym211$ITP_STATE_CACHE = makeSymbol( "ITP-STATE-CACHE" );
    $sym212$_CSETF_ITP_STATE_CACHE = makeSymbol( "_CSETF-ITP-STATE-CACHE" );
    $sym213$ITP_STATE_PSP_CHARTS = makeSymbol( "ITP-STATE-PSP-CHARTS" );
    $sym214$_CSETF_ITP_STATE_PSP_CHARTS = makeSymbol( "_CSETF-ITP-STATE-PSP-CHARTS" );
    $sym215$ITP_STATE_WORKING_MT = makeSymbol( "ITP-STATE-WORKING-MT" );
    $sym216$_CSETF_ITP_STATE_WORKING_MT = makeSymbol( "_CSETF-ITP-STATE-WORKING-MT" );
    $kw217$SEQUENCE = makeKeyword( "SEQUENCE" );
    $kw218$COMPLETE_PARSES_ONLY = makeKeyword( "COMPLETE-PARSES-ONLY" );
    $kw219$WORK_SET = makeKeyword( "WORK-SET" );
    $kw220$SOLUTION_SET = makeKeyword( "SOLUTION-SET" );
    $kw221$SENTENCE = makeKeyword( "SENTENCE" );
    $kw222$CACHE = makeKeyword( "CACHE" );
    $kw223$PSP_CHARTS = makeKeyword( "PSP-CHARTS" );
    $kw224$WORKING_MT = makeKeyword( "WORKING-MT" );
    $sym225$MAKE_ITP_STATE = makeSymbol( "MAKE-ITP-STATE" );
    $sym226$VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD" );
    $str227$Work___D_Solution___D_KB_Mt___A = makeString( "Work: ~D Solution: ~D KB Mt: ~A" );
    $sym228$ITP_NODE_MAX_CHILD_SPAN_LENGTH = makeSymbol( "ITP-NODE-MAX-CHILD-SPAN-LENGTH" );
    $sym229$_ = makeSymbol( ">" );
    $kw230$DESTROYED = makeKeyword( "DESTROYED" );
    $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY = makeSymbol( "NEW-ITP-STATE-PSP-CHART-DICTIONARY" );
    $const232$syntacticNodeString = constant_handles.reader_make_constant_shell( makeString( "syntacticNodeString" ) );
    $str233$R = makeString( "R" );
    $const234$proposedMeaning = constant_handles.reader_make_constant_shell( makeString( "proposedMeaning" ) );
    $const235$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $str236$Expanding_itp_node__A________S__ = makeString( "Expanding itp-node ~A:~%    ~S~%" );
    $const237$NBarTemplate = constant_handles.reader_make_constant_shell( makeString( "NBarTemplate" ) );
    $list238 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $kw239$ANY = makeKeyword( "ANY" );
    $const240$NPTemplate = constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) );
    $const241$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE = makeSymbol( "ITP-PS-GET-CYCLS-FOR-PHRASE" );
    $sym243$ITP_PS_PARSE_VBAR = makeSymbol( "ITP-PS-PARSE-VBAR" );
    $kw244$NONE = makeKeyword( "NONE" );
    $str245$length_of_chart_for__S____S__ = makeString( "length of chart for ~S = ~S~%" );
    $const246$gapTypeForTemplateCategory = constant_handles.reader_make_constant_shell( makeString( "gapTypeForTemplateCategory" ) );
    $const247$posPredForTemplateCategory = constant_handles.reader_make_constant_shell( makeString( "posPredForTemplateCategory" ) );
    $str248$sent_a_weird_category___S__to_pre = makeString( "sent a weird category (~S) to pred-for-category (the vp-parser)~%" );
    $const249$verbStrings = constant_handles.reader_make_constant_shell( makeString( "verbStrings" ) );
    $str250$sent_a_non_categorized_pred___S__ = makeString( "sent a non-categorized pred (~S) to RTP-CAT-FOR-PRED~%" );
    $const251$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const252$posForTemplateCategory = constant_handles.reader_make_constant_shell( makeString( "posForTemplateCategory" ) );
    $str253$sent_un_categorized_category__s_t = makeString( "sent un-categorized category ~s to RTP-CAT-FOR-POS~%" );
    $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_ = makeSymbol( "VERB-PHRASAL-TEMPLATE-CATEGORY?" );
    $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol( "*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*" );
    $int256$64 = makeInteger( 64 );
    $sym257$VERBAL_TEMPLATE_CATEGORY_ = makeSymbol( "VERBAL-TEMPLATE-CATEGORY?" );
    $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol( "*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*" );
    $sym259$VBAR_TEMPLATE_CATEGORY_ = makeSymbol( "VBAR-TEMPLATE-CATEGORY?" );
    $const260$VBarTemplate = constant_handles.reader_make_constant_shell( makeString( "VBarTemplate" ) );
    $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol( "*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*" );
    $sym262$RTP_VBAR_TEMPLATE_CATEGORY_ = makeSymbol( "RTP-VBAR-TEMPLATE-CATEGORY?" );
    $const263$RTPVBarTemplateMt = constant_handles.reader_make_constant_shell( makeString( "RTPVBarTemplateMt" ) );
    $const264$assertTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "assertTemplate-Reln" ) );
    $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol( "*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*" );
    $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_ = makeSymbol( "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?" );
    $const267$AdjPTemplate_Predicative = constant_handles.reader_make_constant_shell( makeString( "AdjPTemplate-Predicative" ) );
    $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol( "*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*" );
    $sym269$NOMINAL_CATEGORY_ = makeSymbol( "NOMINAL-CATEGORY?" );
    $sym270$_NOMINAL_CATEGORY__CACHING_STATE_ = makeSymbol( "*NOMINAL-CATEGORY?-CACHING-STATE*" );
    $sym271$ADJECTIVAL_CATEGORY_ = makeSymbol( "ADJECTIVAL-CATEGORY?" );
    $const272$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_ = makeSymbol( "*ADJECTIVAL-CATEGORY?-CACHING-STATE*" );
    $list274 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NumberTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "OrdinalTemplate" ) ) );
    $sym275$RESULT_OF_PARSING_SPAN_LENGTH = makeSymbol( "RESULT-OF-PARSING-SPAN-LENGTH" );
    $int276$100 = makeInteger( 100 );
    $sym277$IS_THIS_A_THELIST_SPAN_ = makeSymbol( "IS-THIS-A-THELIST-SPAN?" );
    $sym278$_ = makeSymbol( "<" );
    $sym279$_FUNC = makeSymbol( "?FUNC" );
    $list280 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?FUNC" ),
        constant_handles.reader_make_constant_shell( makeString( "NLTaggedTermDenotingFunction" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?FUNC" ),
            constant_handles.reader_make_constant_shell( makeString( "TernaryFunction" ) ) ) );
    $sym281$MT_IN_ANY_MT_ = makeSymbol( "MT-IN-ANY-MT?" );
    $const282$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const283$ParseTreeSandboxMt = constant_handles.reader_make_constant_shell( makeString( "ParseTreeSandboxMt" ) );
    $const284$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $str285$Couldn_t_find_a_parse_tree_mt_to_ = makeString( "Couldn't find a parse-tree mt to be a genls of ~A -- some assertions may bomb out accordingly" );
    $const286$SyntacticNode_Sentential = constant_handles.reader_make_constant_shell( makeString( "SyntacticNode-Sentential" ) );
    $sym287$_N = makeSymbol( "?N" );
    $const288$dependentMeaning = constant_handles.reader_make_constant_shell( makeString( "dependentMeaning" ) );
    $sym289$RESULT_OF_PARSING_FORMULA_ = makeSymbol( "RESULT-OF-PARSING-FORMULA?" );
    $list290 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) ), constant_handles
        .reader_make_constant_shell( makeString( "VPTemplate" ) ) );
    $list291 = ConsesLow.list( makeSymbol( "SUBJ-COMPONENT" ), makeSymbol( "VP-COMPONENT" ) );
    $str292$____can_t_build_any_meaning_combi = makeString( "*** can't build any meaning combinations for ~A" );
    $list293 = ConsesLow.list( makeSymbol( "VP-NODE" ), makeSymbol( "VP-MEANING" ) );
    $list294 = ConsesLow.list( makeSymbol( "SUBJ-NODE" ), makeSymbol( "SUBJ-MEANING" ) );
    $const295$TheSentenceSubject = constant_handles.reader_make_constant_shell( makeString( "TheSentenceSubject" ) );
    $kw296$SUBJECT = makeKeyword( "SUBJECT" );
    $sym297$NL_ATTR_W_LOCATION_ = makeSymbol( "NL-ATTR-W-LOCATION?" );
    $list298 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLQuantFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ) );
    $sym299$ITP_OUTPUT_SORTING_FUNCTION = makeSymbol( "ITP-OUTPUT-SORTING-FUNCTION" );
    $sym300$FIRST = makeSymbol( "FIRST" );
    $const301$AssemblePhraseFn = constant_handles.reader_make_constant_shell( makeString( "AssemblePhraseFn" ) );
    $sym302$STRINGP = makeSymbol( "STRINGP" );
    $sym303$UNASSEMBLED_PHRASE_ = makeSymbol( "UNASSEMBLED-PHRASE?" );
    $sym304$REWRITE_ASSEMBLE_PHRASE = makeSymbol( "REWRITE-ASSEMBLE-PHRASE" );
    $kw305$SIMPLE = makeKeyword( "SIMPLE" );
    $const306$termTemplate = constant_handles.reader_make_constant_shell( makeString( "termTemplate" ) );
    $list307 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "STemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "VPTemplate" ) ) );
    $const308$assertTemplate = constant_handles.reader_make_constant_shell( makeString( "assertTemplate" ) );
    $const309$termTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "termTemplate-Reln" ) );
    $const310$termTemplate_Test = constant_handles.reader_make_constant_shell( makeString( "termTemplate-Test" ) );
    $const311$assertTemplate_Test = constant_handles.reader_make_constant_shell( makeString( "assertTemplate-Test" ) );
    $const312$queryTemplate = constant_handles.reader_make_constant_shell( makeString( "queryTemplate" ) );
    $const313$queryTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "queryTemplate-Reln" ) );
    $const314$queryTemplate_Test = constant_handles.reader_make_constant_shell( makeString( "queryTemplate-Test" ) );
    $str315$sent__S_to_force_for_result__ = makeString( "sent ~S to force-for-result~%" );
    $list316 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "STemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "QuestionTemplate" ) ) );
    $const317$joinTemplateComponents = constant_handles.reader_make_constant_shell( makeString( "joinTemplateComponents" ) );
    $kw318$IGNORE = makeKeyword( "IGNORE" );
    $sym319$SUBSTITUTABLE_CHILD_FORMULA_ = makeSymbol( "SUBSTITUTABLE-CHILD-FORMULA?" );
    $sym320$PARTIAL_PARSE_FILTER_FUNCTION = makeSymbol( "PARTIAL-PARSE-FILTER-FUNCTION" );
  }

  public static final class $itp_node_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $parent;
    public SubLObject $component;
    public SubLObject $span;
    public SubLObject $new_parse;
    public SubLObject $assertion;
    public SubLObject $children;
    public SubLObject $permutations;
    public SubLObject $syntactic_node;
    public SubLObject $syntactic_choices;
    private static final SubLStructDeclNative structDecl;

    public $itp_node_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$parent = CommonSymbols.NIL;
      this.$component = CommonSymbols.NIL;
      this.$span = CommonSymbols.NIL;
      this.$new_parse = CommonSymbols.NIL;
      this.$assertion = CommonSymbols.NIL;
      this.$children = CommonSymbols.NIL;
      this.$permutations = CommonSymbols.NIL;
      this.$syntactic_node = CommonSymbols.NIL;
      this.$syntactic_choices = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $itp_node_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parent;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$component;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$span;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$new_parse;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$assertion;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$children;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$permutations;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$syntactic_node;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$syntactic_choices;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parent = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$component = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$span = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$new_parse = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$assertion = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$children = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$permutations = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$syntactic_node = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$syntactic_choices = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $itp_node_native.class, $sym123$ITP_NODE, $sym124$ITP_NODE_P, $list125, $list126, new String[] { "$id", "$parent", "$component", "$span", "$new_parse", "$assertion",
        "$children", "$permutations", "$syntactic_node", "$syntactic_choices"
      }, $list127, $list128, $sym129$PRINT_ITP_NODE );
    }
  }

  public static final class $itp_node_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $itp_node_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITP-NODE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return itp_node_p( arg1 );
    }
  }

  public static final class $itp_state_native
      extends
        SubLStructNative
  {
    public SubLObject $sequence;
    public SubLObject $complete_parses_only;
    public SubLObject $work_set;
    public SubLObject $solution_set;
    public SubLObject $sentence;
    public SubLObject $category;
    public SubLObject $cache;
    public SubLObject $psp_charts;
    public SubLObject $working_mt;
    private static final SubLStructDeclNative structDecl;

    public $itp_state_native()
    {
      this.$sequence = CommonSymbols.NIL;
      this.$complete_parses_only = CommonSymbols.NIL;
      this.$work_set = CommonSymbols.NIL;
      this.$solution_set = CommonSymbols.NIL;
      this.$sentence = CommonSymbols.NIL;
      this.$category = CommonSymbols.NIL;
      this.$cache = CommonSymbols.NIL;
      this.$psp_charts = CommonSymbols.NIL;
      this.$working_mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $itp_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sequence;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$complete_parses_only;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$work_set;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$solution_set;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$sentence;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$category;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$cache;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$psp_charts;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$working_mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sequence = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$complete_parses_only = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$work_set = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$solution_set = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$sentence = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$category = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$cache = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$psp_charts = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$working_mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $itp_state_native.class, $sym190$ITP_STATE, $sym191$ITP_STATE_P, $list192, $list193, new String[] { "$sequence", "$complete_parses_only", "$work_set", "$solution_set",
        "$sentence", "$category", "$cache", "$psp_charts", "$working_mt"
      }, $list194, $list195, $sym196$PRINT_ITP_STATE );
    }
  }

  public static final class $itp_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $itp_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITP-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return itp_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2927 ms synthetic
 */