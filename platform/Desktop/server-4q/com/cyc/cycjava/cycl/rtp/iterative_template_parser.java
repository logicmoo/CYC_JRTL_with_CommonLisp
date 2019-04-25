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

public final class iterative_template_parser extends SubLTranslatedFile
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
    public static SubLObject kb_node_analyze_category(final SubLObject category, final SubLObject into_mt) {
        if (iterative_template_parser.NIL == category) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL == fort_types_interface.mt_in_any_mtP(into_mt)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject node_type = (SubLObject)iterative_template_parser.NIL;
        SubLObject ling_cat = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL != genls.genlP(category, iterative_template_parser.$const0$SyntacticNode, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            node_type = category;
            ling_cat = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym1$_CAT, (SubLObject)ConsesLow.listS(iterative_template_parser.$const2$relationAllInstance, iterative_template_parser.$const3$syntacticNodeCategory, category, (SubLObject)iterative_template_parser.$list4), into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED).first();
        }
        else if (iterative_template_parser.NIL != genls.genlP(category, iterative_template_parser.$const5$ParsingTemplateCategory, iterative_template_parser.$const6$TemplateParsingMt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            final SubLObject types = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym7$_TYPE, (SubLObject)ConsesLow.listS(iterative_template_parser.$const8$and, (SubLObject)ConsesLow.listS(iterative_template_parser.$const9$genls, category, (SubLObject)iterative_template_parser.$list10), (SubLObject)iterative_template_parser.$list11), iterative_template_parser.$const12$RKFParsingMt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            ling_cat = types.first();
            final SubLObject node_types = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym13$_NODE, (SubLObject)ConsesLow.list(iterative_template_parser.$const2$relationAllInstance, iterative_template_parser.$const3$syntacticNodeCategory, (SubLObject)iterative_template_parser.$sym13$_NODE, ling_cat), into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            node_type = ((iterative_template_parser.NIL != list_utilities.singletonP(node_types)) ? node_types.first() : iterative_template_parser.$const0$SyntacticNode);
        }
        else if (iterative_template_parser.NIL != isa.isaP(category, iterative_template_parser.$const14$NLPhraseType, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            ling_cat = category;
            final SubLObject node_types2 = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym13$_NODE, (SubLObject)ConsesLow.list(iterative_template_parser.$const2$relationAllInstance, iterative_template_parser.$const3$syntacticNodeCategory, (SubLObject)iterative_template_parser.$sym13$_NODE, ling_cat), into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            node_type = ((iterative_template_parser.NIL != list_utilities.singletonP(node_types2)) ? node_types2.first() : iterative_template_parser.$const0$SyntacticNode);
        }
        else {
            if (iterative_template_parser.NIL == genls.genlsP(category, iterative_template_parser.$const15$NLWordForm, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                return (SubLObject)iterative_template_parser.NIL;
            }
            ling_cat = category;
            node_type = iterative_template_parser.$const0$SyntacticNode;
        }
        return (SubLObject)ConsesLow.list(node_type, ling_cat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 5021L)
    public static SubLObject reset_kb_node_internal_counter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        iterative_template_parser.$kb_node_internal_counter$.setDynamicValue((SubLObject)iterative_template_parser.ZERO_INTEGER, thread);
        return iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 5148L)
    public static SubLObject next_available_kb_node(final SubLObject type, final SubLObject mt, SubLObject label) {
        if (label == iterative_template_parser.UNPROVIDED) {
            label = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_node = (SubLObject)iterative_template_parser.NIL;
        while (iterative_template_parser.NIL == kb_node) {
            kb_node = parsing_utilities.hypothesize_parse_tree_element(type, mt, (SubLObject)iterative_template_parser.UNPROVIDED);
            if (iterative_template_parser.NIL != kb_node && iterative_template_parser.NIL != label) {
                fi.fi_rename_int(kb_node, PrintLow.format((SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.$str16$Node__A__D, label, iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread)));
                iterative_template_parser.$kb_node_internal_counter$.setDynamicValue(Numbers.add(iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread), (SubLObject)iterative_template_parser.ONE_INTEGER), thread);
            }
        }
        return kb_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 5689L)
    public static SubLObject new_syntactic_functional_node(final SubLObject into_mt, SubLObject category, SubLObject label) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const17$NLPhrase;
        }
        if (label == iterative_template_parser.UNPROVIDED) {
            label = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL != iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread) && !iterative_template_parser.assertionsDisabledInClass && iterative_template_parser.NIL == subl_promotions.non_negative_integer_p(iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread))) {
            throw new AssertionError(iterative_template_parser.$kb_node_internal_counter$.getDynamicValue(thread));
        }
        SubLObject current;
        final SubLObject datum = current = kb_node_analyze_category(category, into_mt);
        SubLObject node_type = (SubLObject)iterative_template_parser.NIL;
        SubLObject linguistic_category = (SubLObject)iterative_template_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list19);
        node_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list19);
        linguistic_category = current.first();
        current = current.rest();
        if (iterative_template_parser.NIL == current) {
            SubLObject node_string = (SubLObject)iterative_template_parser.NIL;
            SubLObject kb_node = (SubLObject)iterative_template_parser.NIL;
            SubLObject instructions = (SubLObject)iterative_template_parser.NIL;
            if (label.isString()) {
                node_string = label;
            }
            else if (node_type.eql(iterative_template_parser.$const20$SyntacticNode_MatrixClause)) {
                node_string = (SubLObject)iterative_template_parser.$str21$Root;
            }
            else if (iterative_template_parser.NIL == linguistic_category) {
                node_string = (SubLObject)iterative_template_parser.$str22$Unrecognized;
            }
            else if (iterative_template_parser.NIL != list_utilities.proper_list_p(linguistic_category)) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = linguistic_category;
                SubLObject func = (SubLObject)iterative_template_parser.NIL;
                SubLObject cat = (SubLObject)iterative_template_parser.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)iterative_template_parser.$list23);
                func = current_$2.first();
                current_$2 = current_$2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)iterative_template_parser.$list23);
                cat = current_$2.first();
                current_$2 = current_$2.rest();
                if (iterative_template_parser.NIL == current_$2) {
                    node_string = PrintLow.format((SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.$str24$_A_A, string_utilities.substring(string_utilities.fort_to_string(cat), (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.THREE_INTEGER), (SubLObject)(func.eql(iterative_template_parser.$const25$PhraseFn) ? iterative_template_parser.$str26$P : iterative_template_parser.$str27$Bar));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)iterative_template_parser.$list23);
                }
            }
            else {
                node_string = string_utilities.substring(string_utilities.fort_to_string(linguistic_category), (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
            }
            if (iterative_template_parser.NIL != iterative_template_parser.$rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)iterative_template_parser.$str28$____creating_a__A_node__of_type__, node_string, node_type, linguistic_category);
            }
            kb_node = next_available_kb_node(node_type, into_mt, node_string);
            if (iterative_template_parser.NIL != kb_node) {
                if (iterative_template_parser.NIL != isa.isaP(linguistic_category, iterative_template_parser.$const29$SententialConstituentType, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    final SubLObject cat_gaf = (SubLObject)ConsesLow.list(iterative_template_parser.$const3$syntacticNodeCategory, kb_node, linguistic_category);
                    if (iterative_template_parser.NIL != iterative_template_parser.$kb_node_gathering_modeP$.getDynamicValue(thread)) {
                        instructions = (SubLObject)ConsesLow.cons(cat_gaf, instructions);
                    }
                    else {
                        fi.fi_assert_int(cat_gaf, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    }
                }
                return Values.values(kb_node, Sequences.reverse(instructions));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iterative_template_parser.$list19);
        }
        return Values.values((SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 7550L)
    public static SubLObject new_syntactic_choice_node(final SubLObject into_mt, SubLObject options, SubLObject category, SubLObject label) {
        if (options == iterative_template_parser.UNPROVIDED) {
            options = (SubLObject)iterative_template_parser.NIL;
        }
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const30$SyntacticChoiceNode;
        }
        if (label == iterative_template_parser.UNPROVIDED) {
            label = (SubLObject)iterative_template_parser.$str31$Choice;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject kb_node = new_syntactic_functional_node(into_mt, category, label);
        SubLObject gafs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = options;
        SubLObject this_opt = (SubLObject)iterative_template_parser.NIL;
        this_opt = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (iterative_template_parser.NIL != isa.isaP(this_opt, iterative_template_parser.$const0$SyntacticNode, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                final SubLObject daughter_gaf = (SubLObject)ConsesLow.list(iterative_template_parser.$const32$optionNodes, kb_node, this_opt);
                if (iterative_template_parser.NIL != iterative_template_parser.$kb_node_gathering_modeP$.getDynamicValue(thread)) {
                    gafs = (SubLObject)ConsesLow.cons(daughter_gaf, gafs);
                }
                else {
                    fi.fi_assert_int(daughter_gaf, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_opt = cdolist_list_var.first();
        }
        return Values.values(kb_node, Sequences.reverse(gafs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 8073L)
    public static SubLObject kb_nodes_kill(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kills = (SubLObject)iterative_template_parser.ZERO_INTEGER;
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(iterative_template_parser.$const0$SyntacticNode, iterative_template_parser.$const30$SyntacticChoiceNode, iterative_template_parser.$const49$CycParseTree, iterative_template_parser.$const50$CycTokenization, iterative_template_parser.$const51$CycParsingToken);
        SubLObject col = (SubLObject)iterative_template_parser.NIL;
        col = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject node_var = col;
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$3 = node_var;
                    final SubLObject deck_type = (SubLObject)iterative_template_parser.$kw36$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                                final SubLObject tv_var = (SubLObject)iterative_template_parser.NIL;
                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((iterative_template_parser.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((iterative_template_parser.NIL != tv_var) ? iterative_template_parser.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (iterative_template_parser.NIL != tv_var && iterative_template_parser.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && iterative_template_parser.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)iterative_template_parser.$kw38$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.$str39$_A_is_not_a__A, tv_var, (SubLObject)iterative_template_parser.$sym40$SBHL_TRUE_TV_P, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw41$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.$str42$continue_anyway, (SubLObject)iterative_template_parser.$str39$_A_is_not_a__A, tv_var, (SubLObject)iterative_template_parser.$sym40$SBHL_TRUE_TV_P, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw43$WARN)) {
                                            Errors.warn((SubLObject)iterative_template_parser.$str39$_A_is_not_a__A, tv_var, (SubLObject)iterative_template_parser.$sym40$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)iterative_template_parser.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)iterative_template_parser.$str42$continue_anyway, (SubLObject)iterative_template_parser.$str39$_A_is_not_a__A, tv_var, (SubLObject)iterative_template_parser.$sym40$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)iterative_template_parser.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa)), thread);
                                        if (iterative_template_parser.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || iterative_template_parser.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)iterative_template_parser.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$3, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                while (iterative_template_parser.NIL != node_var_$3) {
                                                    final SubLObject tt_node_var = node_var_$3;
                                                    SubLObject cdolist_list_var_$15;
                                                    final SubLObject accessible_modules = cdolist_list_var_$15 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa));
                                                    SubLObject module_var = (SubLObject)iterative_template_parser.NIL;
                                                    module_var = cdolist_list_var_$15.first();
                                                    while (iterative_template_parser.NIL != cdolist_list_var_$15) {
                                                        final SubLObject _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((iterative_template_parser.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (iterative_template_parser.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED));
                                                                if (iterative_template_parser.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED));
                                                                    if (iterative_template_parser.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (iterative_template_parser.NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                    SubLObject iteration_state_$20;
                                                                                    for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (iterative_template_parser.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (iterative_template_parser.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_$22;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)iterative_template_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); iterative_template_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_$22 = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (iterative_template_parser.NIL != set_contents.do_set_contents_element_validP(state, node_$22) && iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$22, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_$22, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (iterative_template_parser.NIL != forts.fort_p(node_$22) && iterative_template_parser.NIL != fi.fi_kill_int(node_$22)) {
                                                                                                                kills = Numbers.add(kills, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_$23 = (SubLObject)iterative_template_parser.NIL;
                                                                                                    node_$23 = csome_list_var.first();
                                                                                                    while (iterative_template_parser.NIL != csome_list_var) {
                                                                                                        if (iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_$23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (iterative_template_parser.NIL != forts.fort_p(node_$23) && iterative_template_parser.NIL != fi.fi_kill_int(node_$23)) {
                                                                                                                kills = Numbers.add(kills, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_$23 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)iterative_template_parser.FIVE_INTEGER, (SubLObject)iterative_template_parser.$str46$attempting_to_bind_direction_link, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                                }
                                                                if (iterative_template_parser.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = (SubLObject)iterative_template_parser.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (iterative_template_parser.NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = (SubLObject)iterative_template_parser.NIL;
                                                                        SubLObject mt_$19 = (SubLObject)iterative_template_parser.NIL;
                                                                        SubLObject tv2 = (SubLObject)iterative_template_parser.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list47);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list47);
                                                                        mt_$19 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list47);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (iterative_template_parser.NIL == current) {
                                                                            if (iterative_template_parser.NIL != mt_relevance_macros.relevant_mtP(mt_$19)) {
                                                                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$19, thread);
                                                                                    if (iterative_template_parser.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                            if (iterative_template_parser.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_$24;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)iterative_template_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); iterative_template_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_$24 = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (iterative_template_parser.NIL != set_contents.do_set_contents_element_validP(state, node_$24) && iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$24, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_$24, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (iterative_template_parser.NIL != forts.fort_p(node_$24) && iterative_template_parser.NIL != fi.fi_kill_int(node_$24)) {
                                                                                                            kills = Numbers.add(kills, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$28 = sol;
                                                                                                SubLObject node_$25 = (SubLObject)iterative_template_parser.NIL;
                                                                                                node_$25 = csome_list_var_$28.first();
                                                                                                while (iterative_template_parser.NIL != csome_list_var_$28) {
                                                                                                    if (iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$25, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_$25, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (iterative_template_parser.NIL != forts.fort_p(node_$25) && iterative_template_parser.NIL != fi.fi_kill_int(node_$25)) {
                                                                                                            kills = Numbers.add(kills, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$28 = csome_list_var_$28.rest();
                                                                                                    node_$25 = csome_list_var_$28.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iterative_template_parser.$list47);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (iterative_template_parser.NIL != obsolete.cnat_p(node, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$16;
                                                                final SubLObject new_list = cdolist_list_var_$16 = ((iterative_template_parser.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)iterative_template_parser.NIL;
                                                                generating_fn = cdolist_list_var_$16.first();
                                                                while (iterative_template_parser.NIL != cdolist_list_var_$16) {
                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (iterative_template_parser.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_$26;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)iterative_template_parser.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); iterative_template_parser.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_$26 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (iterative_template_parser.NIL != set_contents.do_set_contents_element_validP(state2, node_$26) && iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$26, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_$26, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (iterative_template_parser.NIL != forts.fort_p(node_$26) && iterative_template_parser.NIL != fi.fi_kill_int(node_$26)) {
                                                                                        kills = Numbers.add(kills, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject node_$27 = (SubLObject)iterative_template_parser.NIL;
                                                                            node_$27 = csome_list_var3.first();
                                                                            while (iterative_template_parser.NIL != csome_list_var3) {
                                                                                if (iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$27, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_$27, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (iterative_template_parser.NIL != forts.fort_p(node_$27) && iterative_template_parser.NIL != fi.fi_kill_int(node_$27)) {
                                                                                        kills = Numbers.add(kills, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                node_$27 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                                    }
                                                                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                                    generating_fn = cdolist_list_var_$16.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                                        module_var = cdolist_list_var_$15.first();
                                                    }
                                                    SubLObject cdolist_list_var_$17;
                                                    final SubLObject accessible_modules2 = cdolist_list_var_$17 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(iterative_template_parser.$const33$isa)));
                                                    SubLObject module_var2 = (SubLObject)iterative_template_parser.NIL;
                                                    module_var2 = cdolist_list_var_$17.first();
                                                    while (iterative_template_parser.NIL != cdolist_list_var_$17) {
                                                        final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((iterative_template_parser.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$3);
                                                            if (iterative_template_parser.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED));
                                                                if (iterative_template_parser.NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED));
                                                                    if (iterative_template_parser.NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$20 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (iterative_template_parser.NIL != mt_relevance_macros.relevant_mtP(mt_$20)) {
                                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$20, thread);
                                                                                    SubLObject iteration_state_$21;
                                                                                    for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (iterative_template_parser.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (iterative_template_parser.NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)iterative_template_parser.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); iterative_template_parser.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if (iterative_template_parser.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)iterative_template_parser.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (iterative_template_parser.NIL != csome_list_var4) {
                                                                                                        if (iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)iterative_template_parser.FIVE_INTEGER, (SubLObject)iterative_template_parser.$str46$attempting_to_bind_direction_link, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (iterative_template_parser.NIL != obsolete.cnat_p(node2, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$18;
                                                                final SubLObject new_list2 = cdolist_list_var_$18 = ((iterative_template_parser.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED)));
                                                                SubLObject generating_fn2 = (SubLObject)iterative_template_parser.NIL;
                                                                generating_fn2 = cdolist_list_var_$18.first();
                                                                while (iterative_template_parser.NIL != cdolist_list_var_$18) {
                                                                    final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                        if (iterative_template_parser.NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)iterative_template_parser.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); iterative_template_parser.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if (iterative_template_parser.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)iterative_template_parser.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (iterative_template_parser.NIL != csome_list_var5) {
                                                                                if (iterative_template_parser.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)iterative_template_parser.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)iterative_template_parser.$str45$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                                                    }
                                                                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                                                    generating_fn2 = cdolist_list_var_$18.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$11, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                                        module_var2 = cdolist_list_var_$17.first();
                                                    }
                                                    node_var_$3 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$12, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.$str48$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)iterative_template_parser.UNPROVIDED)), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$11, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$6, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return kills;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 8480L)
    public static SubLObject kill_syntactic_node_tree(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym52$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(iterative_template_parser.$const53$EverythingPSC, thread);
            SubLObject pred_var = iterative_template_parser.$const54$syntacticDescendants;
            if (iterative_template_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(self, (SubLObject)iterative_template_parser.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(self, (SubLObject)iterative_template_parser.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)iterative_template_parser.NIL;
                final SubLObject token_var = (SubLObject)iterative_template_parser.NIL;
                while (iterative_template_parser.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (iterative_template_parser.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)iterative_template_parser.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)iterative_template_parser.$kw55$GAF, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
                            SubLObject done_var_$45 = (SubLObject)iterative_template_parser.NIL;
                            final SubLObject token_var_$46 = (SubLObject)iterative_template_parser.NIL;
                            while (iterative_template_parser.NIL == done_var_$45) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(ass));
                                if (iterative_template_parser.NIL != valid_$47) {
                                    kill_syntactic_node_tree(cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), (SubLObject)iterative_template_parser.UNPROVIDED));
                                }
                                done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == valid_$47);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (iterative_template_parser.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == valid);
                }
            }
            pred_var = iterative_template_parser.$const32$optionNodes;
            if (iterative_template_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(self, (SubLObject)iterative_template_parser.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(self, (SubLObject)iterative_template_parser.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)iterative_template_parser.NIL;
                final SubLObject token_var = (SubLObject)iterative_template_parser.NIL;
                while (iterative_template_parser.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (iterative_template_parser.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)iterative_template_parser.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)iterative_template_parser.$kw55$GAF, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
                            SubLObject done_var_$46 = (SubLObject)iterative_template_parser.NIL;
                            final SubLObject token_var_$47 = (SubLObject)iterative_template_parser.NIL;
                            while (iterative_template_parser.NIL == done_var_$46) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                final SubLObject valid_$48 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$47.eql(ass));
                                if (iterative_template_parser.NIL != valid_$48) {
                                    kill_syntactic_node_tree(cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), (SubLObject)iterative_template_parser.UNPROVIDED));
                                }
                                done_var_$46 = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == valid_$48);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (iterative_template_parser.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return fi.fi_kill_int(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 8962L)
    public static SubLObject with_new_syntactic_kb_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = (SubLObject)iterative_template_parser.NIL;
        SubLObject mt = (SubLObject)iterative_template_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list56);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list56);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iterative_template_parser.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iterative_template_parser.NIL;
        SubLObject current_$53 = (SubLObject)iterative_template_parser.NIL;
        while (iterative_template_parser.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iterative_template_parser.$list56);
            current_$53 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iterative_template_parser.$list56);
            if (iterative_template_parser.NIL == conses_high.member(current_$53, (SubLObject)iterative_template_parser.$list57, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                bad = (SubLObject)iterative_template_parser.T;
            }
            if (current_$53 == iterative_template_parser.$kw58$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iterative_template_parser.NIL != bad && iterative_template_parser.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iterative_template_parser.$list56);
        }
        final SubLObject category_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw59$CATEGORY, current);
        final SubLObject category = (SubLObject)((iterative_template_parser.NIL != category_tail) ? conses_high.cadr(category_tail) : iterative_template_parser.NIL);
        final SubLObject options_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw60$OPTIONS, current);
        final SubLObject options = (SubLObject)((iterative_template_parser.NIL != options_tail) ? conses_high.cadr(options_tail) : iterative_template_parser.NIL);
        final SubLObject choice_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw61$CHOICE, current);
        final SubLObject choice = (SubLObject)((iterative_template_parser.NIL != choice_tail) ? conses_high.cadr(choice_tail) : iterative_template_parser.NIL);
        final SubLObject source_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw62$SOURCE, current);
        final SubLObject source = (iterative_template_parser.NIL != source_tail) ? conses_high.cadr(source_tail) : iterative_template_parser.$const63$CycRecursiveTemplateParser;
        final SubLObject body;
        current = (body = temp);
        final SubLObject choice_cat = (SubLObject)iterative_template_parser.$sym64$CHOICE_CAT;
        return (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym65$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(choice_cat, category)), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym66$PWHEN, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym67$CAND, choice, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym68$NULL, choice_cat)), (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym69$CSETQ, choice_cat, (SubLObject)iterative_template_parser.$list70)), (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym65$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym71$FIF, choice, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym72$NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)))), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym66$PWHEN, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym74$FORT_P, source), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym75$FI_ASSERT_INT, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym76$LIST, iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym76$LIST, iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym76$LIST, iterative_template_parser.$const79$ProgramCopyFn, source), (SubLObject)iterative_template_parser.$list80), node), mt)), ConsesLow.append(body, (SubLObject)iterative_template_parser.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 9651L)
    public static SubLObject with_new_syntactic_kb_node_wXgafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list81);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = (SubLObject)iterative_template_parser.NIL;
        SubLObject mt = (SubLObject)iterative_template_parser.NIL;
        SubLObject new_gafs = (SubLObject)iterative_template_parser.NIL;
        SubLObject old_gafs = (SubLObject)iterative_template_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list81);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list81);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list81);
        new_gafs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list81);
        old_gafs = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iterative_template_parser.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iterative_template_parser.NIL;
        SubLObject current_$54 = (SubLObject)iterative_template_parser.NIL;
        while (iterative_template_parser.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iterative_template_parser.$list81);
            current_$54 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iterative_template_parser.$list81);
            if (iterative_template_parser.NIL == conses_high.member(current_$54, (SubLObject)iterative_template_parser.$list57, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                bad = (SubLObject)iterative_template_parser.T;
            }
            if (current_$54 == iterative_template_parser.$kw58$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iterative_template_parser.NIL != bad && iterative_template_parser.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iterative_template_parser.$list81);
        }
        final SubLObject category_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw59$CATEGORY, current);
        final SubLObject category = (SubLObject)((iterative_template_parser.NIL != category_tail) ? conses_high.cadr(category_tail) : iterative_template_parser.NIL);
        final SubLObject options_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw60$OPTIONS, current);
        final SubLObject options = (SubLObject)((iterative_template_parser.NIL != options_tail) ? conses_high.cadr(options_tail) : iterative_template_parser.NIL);
        final SubLObject choice_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw61$CHOICE, current);
        final SubLObject choice = (SubLObject)((iterative_template_parser.NIL != choice_tail) ? conses_high.cadr(choice_tail) : iterative_template_parser.NIL);
        final SubLObject source_tail = cdestructuring_bind.property_list_member((SubLObject)iterative_template_parser.$kw62$SOURCE, current);
        final SubLObject source = (iterative_template_parser.NIL != source_tail) ? conses_high.cadr(source_tail) : iterative_template_parser.$const63$CycRecursiveTemplateParser;
        final SubLObject body;
        current = (body = temp);
        final SubLObject test_gaf = (SubLObject)iterative_template_parser.$sym82$TEST_GAF;
        final SubLObject choice_cat = (SubLObject)iterative_template_parser.$sym83$CHOICE_CAT;
        return (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym65$CLET, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$list84, (SubLObject)ConsesLow.list(choice_cat, category)), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym66$PWHEN, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym67$CAND, choice, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym68$NULL, choice_cat)), (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym69$CSETQ, choice_cat, (SubLObject)iterative_template_parser.$list70)), (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym85$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(node, new_gafs), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym71$FIF, choice, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym72$NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym66$PWHEN, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym74$FORT_P, source), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym75$FI_ASSERT_INT, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym76$LIST, iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym76$LIST, iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym76$LIST, iterative_template_parser.$const79$ProgramCopyFn, source), (SubLObject)iterative_template_parser.$list80), node), mt)), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym86$CDOLIST, (SubLObject)ConsesLow.list(test_gaf, new_gafs), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym87$CPUSH, test_gaf, old_gafs)), ConsesLow.append(body, (SubLObject)iterative_template_parser.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 10496L)
    public static SubLObject syntactic_option_node_p(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trueP = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym52$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(iterative_template_parser.$const53$EverythingPSC, thread);
            trueP = list_utilities.sublisp_boolean(kb_mapping.gather_gaf_arg_index(v_term, (SubLObject)iterative_template_parser.TWO_INTEGER, iterative_template_parser.$const32$optionNodes, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return trueP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 10679L)
    public static SubLObject cb_link_syntactic_node_toolkit(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym52$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(iterative_template_parser.$const53$EverythingPSC, thread);
            if (iterative_template_parser.NIL != kb_mapping.gather_gaf_arg_index(v_term, (SubLObject)iterative_template_parser.TWO_INTEGER, iterative_template_parser.$const88$excludedOptionNodes, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)iterative_template_parser.$kw89$MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)iterative_template_parser.$str90$restore_syntactic_option__A, cb_utilities.cb_fort_identifier(v_term));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                if (iterative_template_parser.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)iterative_template_parser.UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)iterative_template_parser.T, thread);
                    html_utilities.html_princ((SubLObject)iterative_template_parser.$str91$_Restore_Syntactic_Option_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            else {
                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)iterative_template_parser.$kw89$MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)iterative_template_parser.$str92$exclude_syntactic_option__A, cb_utilities.cb_fort_identifier(v_term));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                if (iterative_template_parser.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)iterative_template_parser.UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)iterative_template_parser.T, thread);
                    html_utilities.html_princ((SubLObject)iterative_template_parser.$str93$_Exclude_Syntactic_Option_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 11177L)
    public static SubLObject exclude_syntactic_option(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_node = cb_utilities.cb_guess_fort(id, (SubLObject)iterative_template_parser.UNPROVIDED);
        SubLObject assertion = (SubLObject)iterative_template_parser.NIL;
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym52$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(iterative_template_parser.$const53$EverythingPSC, thread);
            assertion = kb_mapping.gather_gaf_arg_index(this_node, (SubLObject)iterative_template_parser.TWO_INTEGER, iterative_template_parser.$const32$optionNodes, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED).first();
            if (iterative_template_parser.NIL != assertion) {
                result = fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const88$excludedOptionNodes, cycl_utilities.formula_arg1(assertions_high.assertion_formula(assertion), (SubLObject)iterative_template_parser.UNPROVIDED), this_node), assertions_high.assertion_mt(assertion), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 11587L)
    public static SubLObject restore_syntactic_option(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_node = cb_utilities.cb_guess_fort(id, (SubLObject)iterative_template_parser.UNPROVIDED);
        SubLObject assertion = (SubLObject)iterative_template_parser.NIL;
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym52$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(iterative_template_parser.$const53$EverythingPSC, thread);
            assertion = kb_mapping.gather_gaf_arg_index(this_node, (SubLObject)iterative_template_parser.TWO_INTEGER, iterative_template_parser.$const88$excludedOptionNodes, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED).first();
            if (iterative_template_parser.NIL != assertion) {
                result = fi.fi_unassert_int(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 12502L)
    public static SubLObject asserting_treesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13212L)
    public static SubLObject while_saving_rtp_parse_into_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym65$CLET, (SubLObject)iterative_template_parser.$list100, ConsesLow.append(body, (SubLObject)iterative_template_parser.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13340L)
    public static SubLObject save_rtp_kb_parse_if_desired(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.$rtp_latest_kb_parse_tree$.getDynamicValue(thread).eql((SubLObject)iterative_template_parser.$kw101$SAVE)) {
            iterative_template_parser.$rtp_latest_kb_parse_tree$.setDynamicValue(node, thread);
            return node;
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13503L)
    public static SubLObject get_rtp_kb_parse_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iterative_template_parser.$rtp_latest_kb_parse_tree$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 13582L)
    public static SubLObject get_and_erase_rtp_kb_parse_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = iterative_template_parser.$rtp_latest_kb_parse_tree$.getDynamicValue(thread);
        iterative_template_parser.$rtp_latest_kb_parse_tree$.setDynamicValue((SubLObject)iterative_template_parser.NIL, thread);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 14042L)
    public static SubLObject with_the_rtp_parse_tokenization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject save_here = (SubLObject)iterative_template_parser.NIL;
        SubLObject offset = (SubLObject)iterative_template_parser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list103);
        save_here = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list103);
        offset = current.first();
        current = current.rest();
        if (iterative_template_parser.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym104$WITH_PARSE_TOKENIZATION, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym105$_RTP_RELEVANT_TOKENIZATION_, (SubLObject)iterative_template_parser.$kw106$OFFSET, offset), (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym107$PIF, (SubLObject)iterative_template_parser.$list108, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$sym109$PROGN, (SubLObject)ConsesLow.listS((SubLObject)iterative_template_parser.$sym110$SETTING_PARSE_ROOT_NODE, (SubLObject)ConsesLow.list(save_here), ConsesLow.append(body, (SubLObject)iterative_template_parser.NIL))), reader.bq_cons((SubLObject)iterative_template_parser.$sym109$PROGN, ConsesLow.append(body, (SubLObject)iterative_template_parser.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iterative_template_parser.$list103);
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 14460L)
    public static SubLObject rtp_component_tokenization(final SubLObject component, SubLObject mt) {
        if (mt == iterative_template_parser.UNPROVIDED) {
            mt = iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!component.isString() && iterative_template_parser.NIL == join_template_components_p(component) && iterative_template_parser.NIL == parsing_utilities.result_of_parsing_formulaP(component)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject tokenization = dictionary.dictionary_lookup(iterative_template_parser.$rtp_component_tokenizations$.getGlobalValue(), component, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (iterative_template_parser.NIL == constant_handles.valid_constantP(tokenization, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
            final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
            try {
                fi.$fi_error$.bind((SubLObject)iterative_template_parser.NIL, thread);
                fi.$fi_warning$.bind((SubLObject)iterative_template_parser.NIL, thread);
                SubLObject input_string = (SubLObject)iterative_template_parser.NIL;
                if (component.isString()) {
                    input_string = component;
                }
                else if (iterative_template_parser.NIL != join_template_components_p(component)) {
                    input_string = join_template_components_word_list(component);
                }
                else if (iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(component)) {
                    input_string = parsing_utilities.result_of_parsing_words(component);
                }
                if (iterative_template_parser.NIL != asserting_treesP()) {
                    tokenization = parsing_utilities.hypothesize_parse_tree_element(iterative_template_parser.$const50$CycTokenization, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED);
                    dictionary.dictionary_enter(iterative_template_parser.$rtp_component_tokenizations$.getGlobalValue(), component, tokenization);
                    if (iterative_template_parser.NIL != tokenization && iterative_template_parser.NIL != input_string) {
                        fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const111$tokenizationInputString, tokenization, input_string), mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    }
                    SubLObject num = (SubLObject)iterative_template_parser.NIL;
                    SubLObject list_var = (SubLObject)iterative_template_parser.NIL;
                    SubLObject word = (SubLObject)iterative_template_parser.NIL;
                    SubLObject n = (SubLObject)iterative_template_parser.NIL;
                    list_var = rkf_concept_harvester.rkf_ch_string_tokenize(input_string);
                    word = list_var.first();
                    for (n = (SubLObject)iterative_template_parser.ZERO_INTEGER; iterative_template_parser.NIL != list_var; list_var = list_var.rest(), word = list_var.first(), n = Numbers.add((SubLObject)iterative_template_parser.ONE_INTEGER, n)) {
                        num = number_utilities.f_1X(n);
                        final SubLObject kb_token = parsing_utilities.hypothesize_parse_tree_element(iterative_template_parser.$const51$CycParsingToken, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED);
                        fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const112$tokenString, kb_token, word), mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                        fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const113$nthTokenInTokenization, tokenization, num, kb_token), mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    }
                    fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const114$numberOfTokensInTokenization, tokenization, num), mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
            }
            finally {
                fi.$fi_warning$.rebind(_prev_bind_2, thread);
                fi.$fi_error$.rebind(_prev_bind_0, thread);
            }
        }
        return tokenization;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 16248L)
    public static SubLObject rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 16631L)
    public static SubLObject rtp_parse_exp_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)iterative_template_parser.NIL;
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
        try {
            parsing_vars.$perform_vp_parser_expansion$.bind((SubLObject)iterative_template_parser.T, thread);
            answers = itp_sequel(sentence, category, syntax_mt, semantics_mt);
        }
        finally {
            parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 17142L)
    public static SubLObject rtp_parse_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
        try {
            parsing_vars.$perform_vp_parser_expansion$.bind((SubLObject)iterative_template_parser.T, thread);
            answers = itp_sequel(sentence, category, syntax_mt, semantics_mt);
        }
        finally {
            parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 17605L)
    public static SubLObject itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)iterative_template_parser.NIL;
        SubLObject the_cyc_parse_tree = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_semantic_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = iterative_template_parser.$rtp_relevant_tokenization$.currentBinding(thread);
        try {
            rtp_vars.$rtp_semantic_mt$.bind((iterative_template_parser.NIL != semantics_mt) ? semantics_mt : iterative_template_parser.$const116$InferencePSC, thread);
            rtp_vars.$rtp_syntactic_mt$.bind(syntax_mt, thread);
            iterative_template_parser.$rtp_relevant_tokenization$.bind(rtp_component_tokenization(sentence, (SubLObject)iterative_template_parser.UNPROVIDED), thread);
            rtp_initialize.possibly_initialize_and_populate_rtp((SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                if (iterative_template_parser.NIL == genls.genlP(category, iterative_template_parser.$const5$ParsingTemplateCategory, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    Errors.warn((SubLObject)iterative_template_parser.$str118$_S_is_not_a_template_category__, category);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$58, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$57, thread);
            }
            final SubLObject state = new_itp_state(sentence, category, (SubLObject)iterative_template_parser.UNPROVIDED);
            iterative_template_parser.$last_itp_state_created$.setDynamicValue(state, thread);
            prime_itp_pump(state, syntax_mt);
            expand_itp_state_completely(state, syntax_mt);
            answers = cat_itp(state);
            if (iterative_template_parser.NIL != asserting_treesP() && iterative_template_parser.NIL == iterative_template_parser.$rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) {
                the_cyc_parse_tree = reify_itp(state);
                if (iterative_template_parser.NIL != the_cyc_parse_tree && iterative_template_parser.NIL != iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread)) {
                    fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const119$parseTreeOfTokenization, the_cyc_parse_tree, iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread)), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
                save_rtp_kb_parse_if_desired(the_cyc_parse_tree);
            }
            destroy_itp_state(state);
        }
        finally {
            iterative_template_parser.$rtp_relevant_tokenization$.rebind(_prev_bind_3, thread);
            rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_2, thread);
            rtp_vars.$rtp_semantic_mt$.rebind(_prev_bind_0, thread);
        }
        answers = rkf_concept_harvester.rkf_ch_simplify_assemble_phrases(answers);
        if (rtp_vars.$rtp_return_style$.getDynamicValue(thread) != iterative_template_parser.$kw120$ASSERTION) {
            answers = delete_duplicate_tp_results(answers);
        }
        return Values.values(answers, the_cyc_parse_tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 19218L)
    public static SubLObject categorized_rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return categorized_itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 19657L)
    public static SubLObject categorized_itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding(thread);
        try {
            rtp_vars.$rtp_return_style$.bind((SubLObject)iterative_template_parser.$kw120$ASSERTION, thread);
            result = itp_sequel(sentence, category, syntax_mt, semantics_mt);
        }
        finally {
            rtp_vars.$rtp_return_style$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 20075L)
    public static SubLObject delete_duplicate_tp_results(final SubLObject answers) {
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)iterative_template_parser.NIL;
        v_answer = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_answer.first(), Sequences.delete_duplicates(conses_high.second(v_answer), Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 20303L)
    public static SubLObject itp_rewrite(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (syntax_mt == iterative_template_parser.UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == iterative_template_parser.UNPROVIDED) {
            semantics_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rewrites_only(itp_sequel(sentence, category, syntax_mt, semantics_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 20596L)
    public static SubLObject rewrites_only(final SubLObject answers) {
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        SubLObject rewrites = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)iterative_template_parser.NIL;
        v_answer = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            rewrites = rewrites_helper(conses_high.second(v_answer));
            if (iterative_template_parser.NIL != rewrites) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_answer.first(), rewrites), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21097L)
    public static SubLObject rewrites_helper(final SubLObject answers) {
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)iterative_template_parser.NIL;
        v_answer = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(v_answer).eql(iterative_template_parser.$const121$RewriteSequenceFn)) {
                result = (SubLObject)ConsesLow.cons(v_answer, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21480L)
    public static SubLObject itp_nuke_syntactic_nodes(SubLObject mt) {
        if (mt == iterative_template_parser.UNPROVIDED) {
            mt = iterative_template_parser.$const122$ToyParseTreeMt_FullSentences;
        }
        return kb_nodes_kill(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_itp_node(v_object, stream, (SubLObject)iterative_template_parser.ZERO_INTEGER);
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $itp_node_native.class) ? iterative_template_parser.T : iterative_template_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_id(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_parent(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_component(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_span(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_new_parse(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_assertion(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_children(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_permutations(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_syntactic_node(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject itp_node_syntactic_choices(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_id(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_parent(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_component(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_span(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_new_parse(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_assertion(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_children(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_permutations(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_syntactic_node(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject _csetf_itp_node_syntactic_choices(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_node_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject make_itp_node(SubLObject arglist) {
        if (arglist == iterative_template_parser.UNPROVIDED) {
            arglist = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $itp_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)iterative_template_parser.NIL, next = arglist; iterative_template_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)iterative_template_parser.$kw152$ID)) {
                _csetf_itp_node_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw153$PARENT)) {
                _csetf_itp_node_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw154$COMPONENT)) {
                _csetf_itp_node_component(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw155$SPAN)) {
                _csetf_itp_node_span(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw156$NEW_PARSE)) {
                _csetf_itp_node_new_parse(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw120$ASSERTION)) {
                _csetf_itp_node_assertion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw157$CHILDREN)) {
                _csetf_itp_node_children(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw158$PERMUTATIONS)) {
                _csetf_itp_node_permutations(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw159$SYNTACTIC_NODE)) {
                _csetf_itp_node_syntactic_node(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw160$SYNTACTIC_CHOICES)) {
                _csetf_itp_node_syntactic_choices(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)iterative_template_parser.$str161$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject visit_defstruct_itp_node(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw162$BEGIN, (SubLObject)iterative_template_parser.$sym163$MAKE_ITP_NODE, (SubLObject)iterative_template_parser.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw152$ID, itp_node_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw153$PARENT, itp_node_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw154$COMPONENT, itp_node_component(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw155$SPAN, itp_node_span(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw156$NEW_PARSE, itp_node_new_parse(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw120$ASSERTION, itp_node_assertion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw157$CHILDREN, itp_node_children(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw158$PERMUTATIONS, itp_node_permutations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw159$SYNTACTIC_NODE, itp_node_syntactic_node(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw160$SYNTACTIC_CHOICES, itp_node_syntactic_choices(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw165$END, (SubLObject)iterative_template_parser.$sym163$MAKE_ITP_NODE, (SubLObject)iterative_template_parser.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 21664L)
    public static SubLObject visit_defstruct_object_itp_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_node(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 22387L)
    public static SubLObject print_itp_node(final SubLObject itp_node, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(itp_node, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, itp_node, (SubLObject)iterative_template_parser.T, (SubLObject)iterative_template_parser.T);
            print_high.princ(itp_node_id(itp_node), stream);
            print_high.princ((SubLObject)iterative_template_parser.$str167$_, stream);
            print_high.princ(itp_node_component(itp_node), stream);
            if (iterative_template_parser.NIL != iterative_template_parser.$rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                PrintLow.format(stream, (SubLObject)iterative_template_parser.$str168$__);
            }
            else {
                print_high.princ((SubLObject)iterative_template_parser.$str167$_, stream);
            }
            print_high.prin1(itp_node_new_parse(itp_node), stream);
            print_high.princ((SubLObject)iterative_template_parser.$str167$_, stream);
            print_high.prin1(itp_node_syntactic_node(itp_node), stream);
            print_macros.print_unreadable_object_postamble(stream, itp_node, (SubLObject)iterative_template_parser.T, (SubLObject)iterative_template_parser.T);
        }
        return itp_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 22866L)
    public static SubLObject construct_itp_node(final SubLObject parent, final SubLObject span, final SubLObject component, final SubLObject assertion, final SubLObject id) {
        final SubLObject self = make_itp_node((SubLObject)iterative_template_parser.UNPROVIDED);
        _csetf_itp_node_id(self, id);
        _csetf_itp_node_parent(self, parent);
        _csetf_itp_node_span(self, span);
        _csetf_itp_node_component(self, component);
        _csetf_itp_node_assertion(self, assertion);
        _csetf_itp_node_new_parse(self, (SubLObject)iterative_template_parser.NIL);
        _csetf_itp_node_children(self, (SubLObject)iterative_template_parser.NIL);
        _csetf_itp_node_permutations(self, (SubLObject)iterative_template_parser.NIL);
        _csetf_itp_node_syntactic_node(self, (SubLObject)iterative_template_parser.NIL);
        _csetf_itp_node_syntactic_choices(self, (SubLObject)iterative_template_parser.NIL);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 23427L)
    public static SubLObject add_itp_node_child(final SubLObject self, final SubLObject child, SubLObject kb_node) {
        if (kb_node == iterative_template_parser.UNPROVIDED) {
            kb_node = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject children = itp_node_children(self);
        children = (SubLObject)ConsesLow.cons(child, children);
        _csetf_itp_node_children(self, children);
        if (iterative_template_parser.NIL != kb_node) {
            _csetf_itp_node_syntactic_node(child, kb_node);
            if (iterative_template_parser.NIL != asserting_treesP()) {
                final SubLObject parental_node = itp_node_syntactic_node(self);
                if (iterative_template_parser.NIL != parental_node) {
                    parsing_utilities.syntactic_node_add_dtr(parental_node, kb_node, (SubLObject)iterative_template_parser.NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                }
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 23889L)
    public static SubLObject itp_node_create_initial_head(final SubLObject self, final SubLObject gene_pool, final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iterative_template_parser.NIL != itp_node_p(self) : self;
        assert iterative_template_parser.NIL != list_utilities.proper_list_p(gene_pool) : gene_pool;
        final SubLObject my_node = itp_node_syntactic_node(self);
        SubLObject new_itp_node = (SubLObject)iterative_template_parser.NIL;
        final SubLObject the_span = initial_span_gap(self, gene_pool);
        if (iterative_template_parser.NIL == my_node) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject head_node = new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), cat, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (iterative_template_parser.NIL != forts.fort_p(iterative_template_parser.$const63$CycRecursiveTemplateParser)) {
            fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.list(iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list(iterative_template_parser.$const79$ProgramCopyFn, iterative_template_parser.$const63$CycRecursiveTemplateParser), iterative_template_parser.$const170$partOfIBT, iterative_template_parser.$const171$Cyc), head_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        parsing_utilities.syntactic_node_add_head_dtr(my_node, head_node, (SubLObject)iterative_template_parser.NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
        new_itp_node = construct_itp_node(self, itp_node_span(self), cat, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
        return new_itp_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 24882L)
    public static SubLObject itp_node_get_legitimate_children(final SubLObject self) {
        SubLObject valid_children = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = itp_node_children(self);
        SubLObject this_child = (SubLObject)iterative_template_parser.NIL;
        this_child = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject the_parse = itp_node_new_parse(this_child);
            if (iterative_template_parser.NIL != parsing_utilities.vp_parse_from_pspP(the_parse)) {
                valid_children = (SubLObject)ConsesLow.cons(this_child, valid_children);
            }
            else if (iterative_template_parser.NIL != itp_node_get_legitimate_children(this_child)) {
                valid_children = (SubLObject)ConsesLow.cons(this_child, valid_children);
            }
            else if (iterative_template_parser.NIL == parsing_utilities.result_of_parsing_formulaP(the_parse) && (iterative_template_parser.NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(the_parse), iterative_template_parser.$const172$NLFunction) || iterative_template_parser.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(the_parse), iterative_template_parser.$const173$NLTaggedTermDenotingFunction)) && !parsing_utilities.result_of_parsing_category(itp_node_component(this_child)).eql(iterative_template_parser.$const174$VPTemplate)) {
                valid_children = (SubLObject)ConsesLow.cons(this_child, valid_children);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_child = cdolist_list_var.first();
        }
        if (iterative_template_parser.NIL != list_utilities.proper_list_p(valid_children) && iterative_template_parser.NIL == full_span_coverageP(self, valid_children)) {
            final SubLObject my_parse = itp_node_new_parse(self);
            final SubLObject my_component = itp_node_component(self);
            if (iterative_template_parser.NIL != join_template_components_p(my_parse) || cycl_utilities.formula_arg0(my_parse).eql(iterative_template_parser.$const175$TheRNPParse)) {
                return (SubLObject)iterative_template_parser.NIL;
            }
            if (iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(my_component) && iterative_template_parser.NIL != verb_phrasal_template_categoryP(parsing_utilities.result_of_parsing_category(my_component))) {
                final SubLObject vbars = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym176$_VBAR, (SubLObject)ConsesLow.listS(iterative_template_parser.$const8$and, (SubLObject)ConsesLow.list(iterative_template_parser.$const177$memberOfList, (SubLObject)iterative_template_parser.$sym178$_CHILD, reader.bq_cons(iterative_template_parser.$const179$TheList, Mapping.mapcar((SubLObject)iterative_template_parser.$sym148$ITP_NODE_SYNTACTIC_NODE, valid_children))), (SubLObject)iterative_template_parser.$list180), iterative_template_parser.$const53$EverythingPSC, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                SubLObject head_itp_node = (SubLObject)iterative_template_parser.NIL;
                SubLObject my_kb_node = (SubLObject)iterative_template_parser.NIL;
                if (iterative_template_parser.NIL != list_utilities.singletonP(vbars)) {
                    my_kb_node = vbars.first();
                    _csetf_itp_node_syntactic_node(self, my_kb_node);
                    final SubLObject head_verb = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym181$_V, (SubLObject)ConsesLow.listS(iterative_template_parser.$const8$and, (SubLObject)ConsesLow.listS(iterative_template_parser.$const182$syntacticDaughters, my_kb_node, (SubLObject)iterative_template_parser.$list183), (SubLObject)iterative_template_parser.$list184), iterative_template_parser.$const53$EverythingPSC, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    if (iterative_template_parser.NIL != list_utilities.singletonP(head_verb)) {
                        head_itp_node = construct_itp_node(self, itp_node_span(self), iterative_template_parser.$const185$Verb, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
                        _csetf_itp_node_syntactic_node(head_itp_node, head_verb.first());
                    }
                }
                if (iterative_template_parser.NIL == head_itp_node && iterative_template_parser.NIL != extended_vbar_template_categoryP(parsing_utilities.result_of_parsing_category(my_component)) && iterative_template_parser.NIL == ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym13$_NODE, (SubLObject)ConsesLow.listS(iterative_template_parser.$const8$and, (SubLObject)ConsesLow.listS(iterative_template_parser.$const186$syntacticNodeNthDaughter, itp_node_syntactic_node(self), (SubLObject)iterative_template_parser.$list187), (SubLObject)iterative_template_parser.$list188), iterative_template_parser.$const53$EverythingPSC, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    head_itp_node = itp_node_create_initial_head(self, valid_children, iterative_template_parser.$const185$Verb);
                }
                if (iterative_template_parser.NIL != itp_node_p(head_itp_node)) {
                    _csetf_itp_node_new_parse(head_itp_node, cycl_utilities.formula_arg0(my_parse));
                    valid_children = (SubLObject)ConsesLow.cons(head_itp_node, valid_children);
                }
            }
        }
        return valid_children;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 27672L)
    public static SubLObject itp_node_get_dominance_gafs(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == itp_node_syntactic_choices(self)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject gafs = (SubLObject)iterative_template_parser.NIL;
        final SubLObject my_node = itp_node_syntactic_node(self);
        if (iterative_template_parser.NIL == my_node) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(itp_node_syntactic_choices(self))); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject component = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject node_and_children = thread.secondMultipleValue();
            thread.resetMultipleValues();
            gafs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const32$optionNodes, my_node, node_and_children.first()), gafs);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 28192L)
    public static SubLObject itp_node_clear_syntactic_choices(final SubLObject self, SubLObject cat) {
        if (cat == iterative_template_parser.UNPROVIDED) {
            cat = (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL != itp_node_syntactic_choices(self)) {
            if (iterative_template_parser.NIL != cat) {
                SubLObject cdolist_list_var = dictionary.dictionary_keys(itp_node_syntactic_choices(self));
                SubLObject key = (SubLObject)iterative_template_parser.NIL;
                key = cdolist_list_var.first();
                while (iterative_template_parser.NIL != cdolist_list_var) {
                    if (iterative_template_parser.NIL != genls.genlP(key, cat, iterative_template_parser.$const6$TemplateParsingMt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                        dictionary.dictionary_enter(itp_node_syntactic_choices(self), key, (SubLObject)iterative_template_parser.NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    key = cdolist_list_var.first();
                }
            }
            else {
                _csetf_itp_node_syntactic_choices(self, dictionary.new_dictionary((SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.UNPROVIDED));
            }
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 28940L)
    public static SubLObject itp_node_initialize_syntactic_choices(final SubLObject self, SubLObject cat) {
        if (cat == iterative_template_parser.UNPROVIDED) {
            cat = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject offspring = dictionary.new_dictionary((SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.UNPROVIDED);
        final SubLObject valid_children = itp_node_get_legitimate_children(self);
        SubLObject return_gafs = (SubLObject)iterative_template_parser.NIL;
        itp_node_clear_syntactic_choices(self, cat);
        SubLObject cdolist_list_var = valid_children;
        SubLObject this_child = (SubLObject)iterative_template_parser.NIL;
        this_child = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject this_comp = itp_node_component(this_child);
            if (iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(this_comp)) {
                final SubLObject raw_cat = parsing_utilities.result_of_parsing_category(this_comp);
                final SubLObject high_cat = parsing_utilities.result_of_parsing_highest_category(this_comp, cat);
                if (iterative_template_parser.NIL == cat || iterative_template_parser.NIL != genls.genl_in_any_mtP(raw_cat, cat)) {
                    dictionary.dictionary_enter(offspring, high_cat, (SubLObject)ConsesLow.cons(this_child, dictionary.dictionary_lookup(offspring, high_cat, (SubLObject)iterative_template_parser.UNPROVIDED)));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_child = cdolist_list_var.first();
        }
        if (iterative_template_parser.NIL != list_utilities.lengthG(dictionary.dictionary_keys(offspring), (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            SubLObject new_nodes = (SubLObject)iterative_template_parser.NIL;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(offspring)); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject category = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject kids = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0 = iterative_template_parser.$kb_node_gathering_modeP$.currentBinding(thread);
                try {
                    iterative_template_parser.$kb_node_gathering_modeP$.bind((SubLObject)iterative_template_parser.T, thread);
                    final SubLObject choice_cat = category;
                    thread.resetMultipleValues();
                    final SubLObject node = new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), category, (SubLObject)iterative_template_parser.UNPROVIDED);
                    final SubLObject ignore_this = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (iterative_template_parser.NIL != forts.fort_p(iterative_template_parser.$const63$CycRecursiveTemplateParser)) {
                        fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.list(iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list(iterative_template_parser.$const79$ProgramCopyFn, iterative_template_parser.$const63$CycRecursiveTemplateParser), iterative_template_parser.$const170$partOfIBT, iterative_template_parser.$const171$Cyc), node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    }
                    SubLObject cdolist_list_var2 = ignore_this;
                    SubLObject test_gaf = (SubLObject)iterative_template_parser.NIL;
                    test_gaf = cdolist_list_var2.first();
                    while (iterative_template_parser.NIL != cdolist_list_var2) {
                        return_gafs = (SubLObject)ConsesLow.cons(test_gaf, return_gafs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        test_gaf = cdolist_list_var2.first();
                    }
                    dictionary.dictionary_enter(itp_node_syntactic_choices(self), category, (SubLObject)ConsesLow.cons(node, kids));
                    new_nodes = (SubLObject)ConsesLow.cons(node, new_nodes);
                }
                finally {
                    iterative_template_parser.$kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            final SubLObject _prev_bind_2 = iterative_template_parser.$kb_node_gathering_modeP$.currentBinding(thread);
            try {
                iterative_template_parser.$kb_node_gathering_modeP$.bind((SubLObject)iterative_template_parser.T, thread);
                SubLObject choice_cat2 = (SubLObject)iterative_template_parser.NIL;
                if (iterative_template_parser.NIL == choice_cat2) {
                    choice_cat2 = iterative_template_parser.$const30$SyntacticChoiceNode;
                }
                thread.resetMultipleValues();
                final SubLObject choice_node = new_syntactic_choice_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), new_nodes, choice_cat2, (SubLObject)iterative_template_parser.UNPROVIDED);
                final SubLObject ignore_this2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (iterative_template_parser.NIL != forts.fort_p(iterative_template_parser.$const63$CycRecursiveTemplateParser)) {
                    fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.list(iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list(iterative_template_parser.$const79$ProgramCopyFn, iterative_template_parser.$const63$CycRecursiveTemplateParser), iterative_template_parser.$const170$partOfIBT, iterative_template_parser.$const171$Cyc), choice_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
                SubLObject cdolist_list_var3 = ignore_this2;
                SubLObject test_gaf2 = (SubLObject)iterative_template_parser.NIL;
                test_gaf2 = cdolist_list_var3.first();
                while (iterative_template_parser.NIL != cdolist_list_var3) {
                    return_gafs = (SubLObject)ConsesLow.cons(test_gaf2, return_gafs);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    test_gaf2 = cdolist_list_var3.first();
                }
                parsing_utilities.syntactic_node_add_dtr(itp_node_syntactic_node(self), choice_node, (SubLObject)iterative_template_parser.NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
            }
            finally {
                iterative_template_parser.$kb_node_gathering_modeP$.rebind(_prev_bind_2, thread);
            }
        }
        return Values.values((SubLObject)iterative_template_parser.T, return_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 31188L)
    public static SubLObject itp_choice_node_for_component(final SubLObject self, final SubLObject key_component) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL != itp_node_syntactic_choices(self)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(itp_node_syntactic_choices(self))); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject this_component = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject node_and_references = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (this_component.equal(key_component)) {
                    return Values.values(node_and_references.first(), node_and_references.rest());
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return Values.values((SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 31679L)
    public static SubLObject itp_node_find_or_initialize_syntactic_choices(final SubLObject self, final SubLObject component) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_node = itp_choice_node_for_component(self, component);
        SubLObject the_gafs = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == the_node) {
            thread.resetMultipleValues();
            final SubLObject initP = itp_node_initialize_syntactic_choices(self, (SubLObject)((iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(component)) ? parsing_utilities.result_of_parsing_highest_category(component, (SubLObject)iterative_template_parser.UNPROVIDED) : iterative_template_parser.NIL));
            final SubLObject gafs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iterative_template_parser.NIL != initP) {
                the_node = itp_choice_node_for_component(self, component);
            }
            if (iterative_template_parser.NIL != gafs) {
                the_gafs = gafs;
            }
        }
        return Values.values(the_node, the_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 32405L)
    public static SubLObject itp_node_tokenization(final SubLObject self) {
        return rtp_component_tokenization(itp_node_new_parse(self), (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 32621L)
    public static SubLObject itp_node_equalP(final SubLObject one, final SubLObject other) {
        return (SubLObject)SubLObjectFactory.makeBoolean(itp_node_span(other).equal(itp_node_span(one)) && itp_node_component(one).equal(itp_node_component(other)) && itp_node_new_parse(one).equal(itp_node_new_parse(other)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 32940L)
    public static SubLObject find_or_create_itp_node_syntactic_node(final SubLObject itp_node, final SubLObject into_mt, SubLObject category, SubLObject parent) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = (SubLObject)iterative_template_parser.NIL;
        }
        if (parent == iterative_template_parser.UNPROVIDED) {
            parent = (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL == itp_node) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject old_node = itp_node_syntactic_node(itp_node);
        if (iterative_template_parser.NIL != old_node) {
            return old_node;
        }
        if (iterative_template_parser.NIL == fort_types_interface.mt_in_any_mtP(into_mt)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject kb_node = new_syntactic_functional_node(into_mt, category, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (iterative_template_parser.NIL != kb_node) {
            _csetf_itp_node_syntactic_node(itp_node, kb_node);
            if (iterative_template_parser.NIL != itp_node_p(parent)) {
                final SubLObject parent_kb_node = itp_node_syntactic_node(parent);
                if (iterative_template_parser.NIL != isa.isaP(parent_kb_node, iterative_template_parser.$const0$SyntacticNode, into_mt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    parsing_utilities.syntactic_node_add_dtr(parent_kb_node, kb_node, (SubLObject)iterative_template_parser.NIL, into_mt);
                }
            }
        }
        else {
            Errors.warn((SubLObject)iterative_template_parser.$str189$____RTP_____Couldn_t_create_KB_no, itp_node, into_mt);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_itp_state(v_object, stream, (SubLObject)iterative_template_parser.ZERO_INTEGER);
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $itp_state_native.class) ? iterative_template_parser.T : iterative_template_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_sequence(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_complete_parses_only(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_work_set(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_solution_set(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_sentence(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_category(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_cache(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_psp_charts(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject itp_state_working_mt(final SubLObject v_object) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_sequence(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_complete_parses_only(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_work_set(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_solution_set(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_sentence(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_category(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_cache(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_psp_charts(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject _csetf_itp_state_working_mt(final SubLObject v_object, final SubLObject value) {
        assert iterative_template_parser.NIL != itp_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject make_itp_state(SubLObject arglist) {
        if (arglist == iterative_template_parser.UNPROVIDED) {
            arglist = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $itp_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)iterative_template_parser.NIL, next = arglist; iterative_template_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)iterative_template_parser.$kw217$SEQUENCE)) {
                _csetf_itp_state_sequence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw218$COMPLETE_PARSES_ONLY)) {
                _csetf_itp_state_complete_parses_only(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw219$WORK_SET)) {
                _csetf_itp_state_work_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw220$SOLUTION_SET)) {
                _csetf_itp_state_solution_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw221$SENTENCE)) {
                _csetf_itp_state_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw59$CATEGORY)) {
                _csetf_itp_state_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw222$CACHE)) {
                _csetf_itp_state_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw223$PSP_CHARTS)) {
                _csetf_itp_state_psp_charts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iterative_template_parser.$kw224$WORKING_MT)) {
                _csetf_itp_state_working_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)iterative_template_parser.$str161$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject visit_defstruct_itp_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw162$BEGIN, (SubLObject)iterative_template_parser.$sym225$MAKE_ITP_STATE, (SubLObject)iterative_template_parser.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw217$SEQUENCE, itp_state_sequence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw218$COMPLETE_PARSES_ONLY, itp_state_complete_parses_only(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw219$WORK_SET, itp_state_work_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw220$SOLUTION_SET, itp_state_solution_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw221$SENTENCE, itp_state_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw59$CATEGORY, itp_state_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw222$CACHE, itp_state_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw223$PSP_CHARTS, itp_state_psp_charts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw164$SLOT, (SubLObject)iterative_template_parser.$kw224$WORKING_MT, itp_state_working_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iterative_template_parser.$kw165$END, (SubLObject)iterative_template_parser.$sym225$MAKE_ITP_STATE, (SubLObject)iterative_template_parser.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34179L)
    public static SubLObject visit_defstruct_object_itp_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 34819L)
    public static SubLObject print_itp_state(final SubLObject itp_state, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(itp_state, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, itp_state, (SubLObject)iterative_template_parser.T, (SubLObject)iterative_template_parser.T);
            PrintLow.format(stream, (SubLObject)iterative_template_parser.$str227$Work___D_Solution___D_KB_Mt___A, new SubLObject[] { queues.p_queue_size(itp_state_work_set(itp_state)), Sequences.length(itp_state_solution_set(itp_state)), itp_state_working_mt(itp_state) });
            print_macros.print_unreadable_object_postamble(stream, itp_state, (SubLObject)iterative_template_parser.T, (SubLObject)iterative_template_parser.T);
        }
        return itp_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 35189L)
    public static SubLObject new_itp_state(final SubLObject sentence, SubLObject category, SubLObject complete_parses_only) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = iterative_template_parser.$const115$STemplate;
        }
        if (complete_parses_only == iterative_template_parser.UNPROVIDED) {
            complete_parses_only = (SubLObject)iterative_template_parser.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = make_itp_state((SubLObject)iterative_template_parser.UNPROVIDED);
        _csetf_itp_state_sequence(state, (SubLObject)iterative_template_parser.ZERO_INTEGER);
        _csetf_itp_state_complete_parses_only(state, complete_parses_only);
        _csetf_itp_state_sentence(state, sentence);
        _csetf_itp_state_category(state, category);
        _csetf_itp_state_cache(state, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED));
        _csetf_itp_state_work_set(state, queues.create_p_queue((SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.$sym228$ITP_NODE_MAX_CHILD_SPAN_LENGTH, (SubLObject)iterative_template_parser.$sym229$_));
        _csetf_itp_state_solution_set(state, (SubLObject)iterative_template_parser.NIL);
        _csetf_itp_state_psp_charts(state, new_itp_state_psp_chart_dictionary());
        _csetf_itp_state_working_mt(state, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 35986L)
    public static SubLObject destroy_itp_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(itp_state_cache(state));
        final SubLObject chart_dictionary = itp_state_psp_charts(state);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(chart_dictionary)); iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject chart = thread.secondMultipleValue();
            thread.resetMultipleValues();
            psp_chart.destroy_psp_chart(chart);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(chart_dictionary);
        return (SubLObject)iterative_template_parser.$kw230$DESTROYED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36309L)
    public static SubLObject new_itp_state_psp_chart_dictionary_internal() {
        return dictionary.new_dictionary((SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36309L)
    public static SubLObject new_itp_state_psp_chart_dictionary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == v_memoization_state) {
            return new_itp_state_psp_chart_dictionary_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)iterative_template_parser.$sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)iterative_template_parser.$sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY, (SubLObject)iterative_template_parser.ZERO_INTEGER, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQ, (SubLObject)iterative_template_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)iterative_template_parser.$sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(new_itp_state_psp_chart_dictionary_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36455L)
    public static SubLObject add_to_itp_solution(final SubLObject state, final SubLObject solution) {
        SubLObject current = solution;
        SubLObject solutions = itp_state_solution_set(state);
        while (iterative_template_parser.NIL != itp_node_p(current)) {
            final SubLObject item_var = current;
            if (iterative_template_parser.NIL == conses_high.member(item_var, solutions, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                solutions = (SubLObject)ConsesLow.cons(item_var, solutions);
            }
            current = itp_node_parent(current);
        }
        _csetf_itp_state_solution_set(state, solutions);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 36833L)
    public static SubLObject memoize_itp_attempt(final SubLObject state, final SubLObject node) {
        final SubLObject v_cache = itp_state_cache(state);
        final SubLObject key = itp_node_component(node);
        if (iterative_template_parser.NIL != key) {
            dictionary_utilities.dictionary_pushnew(v_cache, key, node, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 37163L)
    public static SubLObject is_a_known_itp_attemptP(final SubLObject state, final SubLObject problem) {
        final SubLObject v_cache = itp_state_cache(state);
        final SubLObject hit = dictionary.dictionary_lookup(v_cache, problem, (SubLObject)iterative_template_parser.UNPROVIDED);
        return hit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 37400L)
    public static SubLObject prime_itp_pump(final SubLObject itp_state, final SubLObject mt) {
        final SubLObject parses = recognition.categorizing_template_parse(itp_state_sentence(itp_state), mt, itp_state_category(itp_state), itp_state_complete_parses_only(itp_state));
        final SubLObject undo_extension_traceP = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = (SubLObject)iterative_template_parser.NIL;
        parse = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject span = parse.first();
            SubLObject cdolist_list_var_$59;
            final SubLObject possibles = cdolist_list_var_$59 = conses_high.second(parse);
            SubLObject possible = (SubLObject)iterative_template_parser.NIL;
            possible = cdolist_list_var_$59.first();
            while (iterative_template_parser.NIL != cdolist_list_var_$59) {
                final SubLObject formula = possible.first();
                final SubLObject assertion = conses_high.second(possible);
                extend_itp_state(itp_state, span, (SubLObject)iterative_template_parser.NIL, formula, assertion, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                possible = cdolist_list_var_$59.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return itp_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 38411L)
    public static SubLObject extend_itp_state(final SubLObject state, final SubLObject span, final SubLObject old_formula, final SubLObject new_parse, final SubLObject assertion, SubLObject parent, SubLObject psp_node_if_any, SubLObject graph_type) {
        if (parent == iterative_template_parser.UNPROVIDED) {
            parent = (SubLObject)iterative_template_parser.NIL;
        }
        if (psp_node_if_any == iterative_template_parser.UNPROVIDED) {
            psp_node_if_any = (SubLObject)iterative_template_parser.NIL;
        }
        if (graph_type == iterative_template_parser.UNPROVIDED) {
            graph_type = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iterative_template_parser.NIL != itp_state_p(state) : state;
        if (iterative_template_parser.NIL != parent && !iterative_template_parser.assertionsDisabledInClass && iterative_template_parser.NIL == itp_node_p(parent)) {
            throw new AssertionError(parent);
        }
        SubLObject id = itp_state_sequence(state);
        final SubLObject node = construct_itp_node(parent, span, old_formula, assertion, id);
        _csetf_itp_node_new_parse(node, new_parse);
        _csetf_itp_node_syntactic_node(node, psp_node_if_any);
        final SubLObject into_mt = (SubLObject)((iterative_template_parser.NIL != iterative_template_parser.$rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) ? itp_state_working_mt(state) : iterative_template_parser.NIL);
        if (iterative_template_parser.NIL == parent) {
            if (iterative_template_parser.NIL != into_mt) {
                final SubLObject kb_node = find_or_create_itp_node_syntactic_node(node, into_mt, iterative_template_parser.$const20$SyntacticNode_MatrixClause, (SubLObject)iterative_template_parser.UNPROVIDED);
                if (iterative_template_parser.NIL != kb_node && iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(old_formula)) {
                    fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const232$syntacticNodeString, kb_node, parsing_utilities.result_of_parsing_words(old_formula)), into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
            }
        }
        else {
            SubLObject child_kb_node = (SubLObject)iterative_template_parser.NIL;
            if (iterative_template_parser.NIL != into_mt && iterative_template_parser.NIL == child_kb_node) {
                final SubLObject category = (iterative_template_parser.NIL != iterative_template_parser.$extend_itp_state_analyze_assertionP$.getDynamicValue(thread) && iterative_template_parser.NIL != assertion_handles.assertion_p(assertion)) ? cycl_utilities.formula_arg1(assertions_high.assertion_formula(assertion), (SubLObject)iterative_template_parser.UNPROVIDED) : assertion;
                if (iterative_template_parser.NIL == assertion_handles.assertion_p(category) && iterative_template_parser.NIL != genls.genlP(category, iterative_template_parser.$const5$ParsingTemplateCategory, iterative_template_parser.$const6$TemplateParsingMt, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    child_kb_node = new_syntactic_functional_node(into_mt, category, (SubLObject)iterative_template_parser.UNPROVIDED);
                    if (iterative_template_parser.NIL != child_kb_node && iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(old_formula)) {
                        fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const232$syntacticNodeString, child_kb_node, parsing_utilities.result_of_parsing_words(old_formula)), into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    }
                }
            }
            add_itp_node_child(parent, node, child_kb_node);
        }
        queues.p_enqueue(node, itp_state_work_set(state));
        id = Numbers.add(id, (SubLObject)iterative_template_parser.ONE_INTEGER);
        _csetf_itp_state_sequence(state, id);
        memoize_itp_attempt(state, node);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 40795L)
    public static SubLObject extend_itp_state_multiple(final SubLObject state, final SubLObject span, final SubLObject formula, final SubLObject answers, final SubLObject parent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iterative_template_parser.NIL != itp_state_p(state) : state;
        assert iterative_template_parser.NIL != itp_node_p(parent) : parent;
        final SubLObject solution = answers.first();
        final SubLObject subspan = solution.first();
        final SubLObject subparses = conses_high.second(solution);
        SubLObject absolute_span = (SubLObject)iterative_template_parser.NIL;
        SubLObject listy_span = (SubLObject)iterative_template_parser.NIL;
        if (span.first().eql(iterative_template_parser.$const179$TheList)) {
            listy_span = span;
        }
        else {
            listy_span = (SubLObject)ConsesLow.cons(iterative_template_parser.$const179$TheList, span);
        }
        absolute_span = compute_correct_span(listy_span, subspan);
        adjust_the_spans(subparses, absolute_span, (SubLObject)iterative_template_parser.UNPROVIDED);
        final SubLObject kb_node = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = subparses;
        SubLObject parse = (SubLObject)iterative_template_parser.NIL;
        parse = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject form = parse.first();
            final SubLObject assertion = conses_high.second(parse);
            final SubLObject undo_extension_traceP = (SubLObject)iterative_template_parser.NIL;
            if (!form.isList() || iterative_template_parser.NIL == conses_high.member(formula, form, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = iterative_template_parser.$extend_itp_state_analyze_assertionP$.currentBinding(thread);
                try {
                    iterative_template_parser.$extend_itp_state_analyze_assertionP$.bind((SubLObject)iterative_template_parser.T, thread);
                    extend_itp_state(state, absolute_span, formula, form, assertion, parent, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
                finally {
                    iterative_template_parser.$extend_itp_state_analyze_assertionP$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 42092L)
    public static SubLObject extend_itp_state_by_ps_parse(final SubLObject state, final SubLObject span, final SubLObject component, SubLObject psp_parse, final SubLObject parent, final SubLObject pos_of_parse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject real_span = span.first().eql(iterative_template_parser.$const179$TheList) ? span.rest() : span;
        SubLObject interpretations = (SubLObject)iterative_template_parser.NIL;
        SubLObject psp_node_if_any = psp_parse.first();
        SubLObject node = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == psp_node_if_any || iterative_template_parser.NIL != forts.fort_p(psp_node_if_any)) {
            psp_parse = psp_parse.rest();
        }
        else {
            psp_node_if_any = (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject cdolist_list_var = psp_parse;
        SubLObject meaning = (SubLObject)iterative_template_parser.NIL;
        meaning = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject formula = narts_high.nart_expand(meaning);
            final SubLObject item_var;
            final SubLObject adjusted_formula = item_var = adjust_the_spans(formula, real_span, (SubLObject)iterative_template_parser.UNPROVIDED);
            if (iterative_template_parser.NIL == conses_high.member(item_var, interpretations, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                interpretations = (SubLObject)ConsesLow.cons(item_var, interpretations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning = cdolist_list_var.first();
        }
        cdolist_list_var = interpretations;
        SubLObject interpretation = (SubLObject)iterative_template_parser.NIL;
        interpretation = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            node = extend_itp_state(state, real_span, component, interpretation, pos_of_parse, parent, psp_node_if_any, iterative_template_parser.$npparse_graph_type$.getDynamicValue(thread));
            if (iterative_template_parser.NIL != iterative_template_parser.$rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) {
                final SubLObject kb_node = itp_node_syntactic_node(node);
                final SubLObject into_mt = itp_state_working_mt(state);
                if (iterative_template_parser.NIL != kb_node && iterative_template_parser.NIL != into_mt) {
                    fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const234$proposedMeaning, kb_node, (SubLObject)ConsesLow.list(iterative_template_parser.$const235$SubLQuoteFn, interpretation)), into_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interpretation = cdolist_list_var.first();
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 43828L)
    public static SubLObject expand_itp_state(final SubLObject state, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current = queues.p_dequeue(itp_state_work_set(state), (SubLObject)iterative_template_parser.UNPROVIDED);
        final SubLObject span = itp_node_span(current);
        final SubLObject formula = itp_node_new_parse(current);
        final SubLObject components = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(formula);
        SubLObject parts = (SubLObject)iterative_template_parser.ZERO_INTEGER;
        SubLObject good = (SubLObject)iterative_template_parser.ZERO_INTEGER;
        SubLObject listy_span = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL != iterative_template_parser.$trace_itp_state_expansion$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)iterative_template_parser.T, (SubLObject)iterative_template_parser.$str236$Expanding_itp_node__A________S__, current, itp_node_new_parse(current));
        }
        if (iterative_template_parser.NIL != components) {
            if (span.first().eql(iterative_template_parser.$const179$TheList)) {
                listy_span = span;
            }
            else {
                listy_span = (SubLObject)ConsesLow.cons(iterative_template_parser.$const179$TheList, span);
            }
        }
        SubLObject cdolist_list_var = components;
        SubLObject component = (SubLObject)iterative_template_parser.NIL;
        component = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject words = parsing_utilities.result_of_parsing_words(component);
            final SubLObject subspan = parsing_utilities.result_of_parsing_span(component);
            final SubLObject category = parsing_utilities.result_of_parsing_category(component);
            parts = Numbers.add(parts, (SubLObject)iterative_template_parser.ONE_INTEGER);
            if (iterative_template_parser.NIL == parsing_utilities.result_of_parsing_formulaP(component) && ((iterative_template_parser.NIL == verbal_template_categoryP(category) && iterative_template_parser.NIL == number_template_categoryP(category) && (iterative_template_parser.NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread) || (iterative_template_parser.NIL == adjectival_categoryP(category) && iterative_template_parser.NIL == nominal_categoryP(category)))) || (iterative_template_parser.NIL != nominal_categoryP(category) && iterative_template_parser.NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread)))) {
                good = Numbers.add(good, (SubLObject)iterative_template_parser.ONE_INTEGER);
            }
            else {
                final SubLObject v_cache = is_a_known_itp_attemptP(state, component);
                if (iterative_template_parser.NIL != v_cache && !v_cache.eql(current)) {
                    SubLObject cdolist_list_var_$60 = v_cache;
                    SubLObject known_node = (SubLObject)iterative_template_parser.NIL;
                    known_node = cdolist_list_var_$60.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$60) {
                        add_itp_node_child(current, known_node, (SubLObject)iterative_template_parser.UNPROVIDED);
                        cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                        known_node = cdolist_list_var_$60.first();
                    }
                    good = Numbers.add(good, (SubLObject)iterative_template_parser.ONE_INTEGER);
                }
                else if (iterative_template_parser.NIL == v_cache || v_cache.eql(current)) {
                    final SubLObject answers = recognition.categorizing_template_parse(words, mt, category, (SubLObject)iterative_template_parser.UNPROVIDED);
                    final SubLObject absolute_span = compute_correct_span(listy_span, subspan);
                    if (iterative_template_parser.NIL != answers) {
                        extend_itp_state_multiple(state, absolute_span, component, answers, current);
                    }
                    if (iterative_template_parser.NIL != nominal_categoryP(category)) {
                        if (iterative_template_parser.NIL != parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread)) {
                            final SubLObject pcase_var = category;
                            if (pcase_var.eql(iterative_template_parser.$const237$NBarTemplate)) {
                                if (iterative_template_parser.NIL != appropriate_span_for_nbar_parsingP(words, subspan)) {
                                    final SubLObject chart = itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                    final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
                                    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                        try {
                                            final SubLObject _prev_bind_0_$61 = parsing_vars.$psp_chart$.currentBinding(thread);
                                            final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                                            try {
                                                parsing_vars.$psp_chart$.bind(chart, thread);
                                                parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)iterative_template_parser.NIL, thread);
                                                final SubLObject parses = itp_ps_get_cycls_for_phrase(words, span, (SubLObject)iterative_template_parser.$list238, (SubLObject)iterative_template_parser.$kw239$ANY, (SubLObject)iterative_template_parser.NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                extend_itp_state_by_ps_parse(state, absolute_span, component, parses, current, iterative_template_parser.$const237$NBarTemplate);
                                            }
                                            finally {
                                                parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                                                parsing_vars.$psp_chart$.rebind(_prev_bind_0_$61, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            else if (pcase_var.eql(iterative_template_parser.$const240$NPTemplate) && iterative_template_parser.NIL != appropriate_span_for_np_parsingP(words, subspan)) {
                                final SubLObject chart = itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                                final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
                                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject _prev_bind_0_$63 = parsing_vars.$psp_chart$.currentBinding(thread);
                                        try {
                                            parsing_vars.$psp_chart$.bind(chart, thread);
                                            final SubLObject np_parses = itp_ps_get_cycls_for_phrase(words, span, iterative_template_parser.$const241$NounPhrase, (SubLObject)iterative_template_parser.$kw239$ANY, (SubLObject)iterative_template_parser.NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                            extend_itp_state_by_ps_parse(state, absolute_span, component, np_parses, current, iterative_template_parser.$const240$NPTemplate);
                                        }
                                        finally {
                                            parsing_vars.$psp_chart$.rebind(_prev_bind_0_$63, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        good = Numbers.add(good, (SubLObject)iterative_template_parser.ONE_INTEGER);
                    }
                    else if (iterative_template_parser.NIL != predicative_adjp_template_categoryP(category)) {
                        if (iterative_template_parser.NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue(thread)) {
                            SubLObject psp_node_if_any = (SubLObject)iterative_template_parser.NIL;
                            SubLObject adjp_parses = (SubLObject)iterative_template_parser.NIL;
                            final SubLObject chart2 = itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                            final SubLObject local_state2 = psp_chart.psp_chart_memoization_state(chart2);
                            final SubLObject _prev_bind_3 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state2, thread);
                                final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                try {
                                    final SubLObject _prev_bind_0_$65 = parsing_vars.$psp_chart$.currentBinding(thread);
                                    try {
                                        parsing_vars.$psp_chart$.bind(chart2, thread);
                                        final SubLObject _prev_bind_0_$66 = parsing_vars.$parse_tokenization$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
                                        try {
                                            parsing_vars.$parse_tokenization$.bind(iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                                            parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                                            if (iterative_template_parser.NIL != asserting_treesP()) {
                                                final SubLObject _prev_bind_0_$67 = parsing_vars.$parse_root_node$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$68 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                                                try {
                                                    parsing_vars.$parse_root_node$.bind((SubLObject)iterative_template_parser.NIL, thread);
                                                    parsing_vars.$reify_parse_nodesP$.bind(Symbols.boundp(psp_node_if_any), thread);
                                                    adjp_parses = psp_main.ps_parse_predicative_adjp(words, pred_for_category(category), psp_lexicon.get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)iterative_template_parser.UNPROVIDED);
                                                    psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                                                }
                                                finally {
                                                    parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_$68, thread);
                                                    parsing_vars.$parse_root_node$.rebind(_prev_bind_0_$67, thread);
                                                }
                                            }
                                            else {
                                                adjp_parses = psp_main.ps_parse_predicative_adjp(words, pred_for_category(category), psp_lexicon.get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)iterative_template_parser.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_4, thread);
                                            parsing_vars.$parse_tokenization$.rebind(_prev_bind_0_$66, thread);
                                        }
                                        adjp_parses = (SubLObject)ConsesLow.cons(psp_node_if_any, adjp_parses);
                                        extend_itp_state_by_ps_parse(state, absolute_span, component, adjp_parses, current, category);
                                    }
                                    finally {
                                        parsing_vars.$psp_chart$.rebind(_prev_bind_0_$65, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_3, thread);
                            }
                        }
                        good = Numbers.add(good, (SubLObject)iterative_template_parser.ONE_INTEGER);
                    }
                    else if (iterative_template_parser.NIL != vbar_template_categoryP(category)) {
                        if (iterative_template_parser.NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue(thread) && iterative_template_parser.NIL != appropriate_span_for_vbar_parsingP(words, subspan)) {
                            final SubLObject chart3 = itp_find_or_create_appropriate_chart(state, subspan, words, mt);
                            final SubLObject local_state3 = psp_chart.psp_chart_memoization_state(chart3);
                            final SubLObject _prev_bind_5 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state3, thread);
                                final SubLObject original_memoization_process3 = memoization_state.memoization_state_original_process(local_state3);
                                try {
                                    final SubLObject _prev_bind_0_$69 = parsing_vars.$psp_chart$.currentBinding(thread);
                                    try {
                                        parsing_vars.$psp_chart$.bind(chart3, thread);
                                        final SubLObject vp_parses = itp_ps_parse_vbar(words, span, category, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                        extend_itp_state_by_ps_parse(state, absolute_span, component, vp_parses, current, category);
                                    }
                                    finally {
                                        parsing_vars.$psp_chart$.rebind(_prev_bind_0_$69, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state3, original_memoization_process3);
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_5, thread);
                            }
                        }
                        good = Numbers.add(good, (SubLObject)iterative_template_parser.ONE_INTEGER);
                    }
                    else if (iterative_template_parser.NIL != number_template_categoryP(category)) {
                        final SubLObject number_parses = (SubLObject)ConsesLow.list(numeral_parser.string_to_interval((iterative_template_parser.NIL != string_utilities.english_ordinal_number_string_p(words)) ? string_utilities.english_ordinal_string_to_cardinal_string(words) : words));
                        extend_itp_state_by_ps_parse(state, absolute_span, component, number_parses, current, category);
                        good = Numbers.add(good, (SubLObject)iterative_template_parser.ONE_INTEGER);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            component = cdolist_list_var.first();
        }
        if (good.numE(parts)) {
            add_to_itp_solution(state, current);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 49646L)
    public static SubLObject appropriate_span_for_np_parsingP(final SubLObject words, final SubLObject subspan) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL != iterative_template_parser.$possible_nps$.getDynamicValue(thread)) {
            return subl_promotions.memberP(words, iterative_template_parser.$possible_nps$.getDynamicValue(thread), (SubLObject)iterative_template_parser.EQUALP, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return (SubLObject)iterative_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 49978L)
    public static SubLObject appropriate_span_for_vbar_parsingP(final SubLObject words, final SubLObject subspan) {
        return (SubLObject)iterative_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50092L)
    public static SubLObject appropriate_span_for_nbar_parsingP(final SubLObject words, final SubLObject subspan) {
        return (SubLObject)iterative_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50206L)
    public static SubLObject itp_ps_get_cycls_for_phrase_internal(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)iterative_template_parser.NIL;
        SubLObject psp_node_if_any = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(parsing_vars.$psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = parsing_vars.$parse_tokenization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
            try {
                parsing_vars.$parse_tokenization$.bind(iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                if (iterative_template_parser.NIL != asserting_treesP()) {
                    final SubLObject _prev_bind_0_$73 = parsing_vars.$parse_root_node$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$74 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                    try {
                        parsing_vars.$parse_root_node$.bind((SubLObject)iterative_template_parser.NIL, thread);
                        parsing_vars.$reify_parse_nodesP$.bind(Symbols.boundp(psp_node_if_any), thread);
                        ans = psp_main.ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                        psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                    }
                    finally {
                        parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_$74, thread);
                        parsing_vars.$parse_root_node$.rebind(_prev_bind_0_$73, thread);
                    }
                }
                else {
                    ans = psp_main.ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
            }
            finally {
                parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_2, thread);
                parsing_vars.$parse_tokenization$.rebind(_prev_bind_0_$72, thread);
            }
        }
        finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.cons(psp_node_if_any, ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50206L)
    public static SubLObject itp_ps_get_cycls_for_phrase(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == v_memoization_state) {
            return itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)iterative_template_parser.$sym242$ITP_PS_GET_CYCLS_FOR_PHRASE, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)iterative_template_parser.$sym242$ITP_PS_GET_CYCLS_FOR_PHRASE, (SubLObject)iterative_template_parser.SIX_INTEGER, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQUALP, (SubLObject)iterative_template_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)iterative_template_parser.$sym242$ITP_PS_GET_CYCLS_FOR_PHRASE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(words, span, category, pos_pred, non_trivialP, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)iterative_template_parser.NIL;
            collision = cdolist_list_var.first();
            while (iterative_template_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (words.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (span.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (category.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pos_pred.equalp(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (non_trivialP.equalp(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (iterative_template_parser.NIL != cached_args && iterative_template_parser.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(words, span, category, pos_pred, non_trivialP, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50644L)
    public static SubLObject itp_ps_parse_vbar_internal(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = (SubLObject)iterative_template_parser.NIL;
        }
        if (mt == iterative_template_parser.UNPROVIDED) {
            mt = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_pred = pred_for_category(category);
        final SubLObject gap_type = gap_type_for_category(category);
        SubLObject psp_node_if_any = (SubLObject)iterative_template_parser.NIL;
        SubLObject ans = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(parsing_vars.$psp_return_mode$.getDynamicValue(thread), thread);
            parsing_vars.$parse_tokenization$.bind(iterative_template_parser.$rtp_relevant_tokenization$.getDynamicValue(thread), thread);
            parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
            if (iterative_template_parser.NIL != asserting_treesP()) {
                final SubLObject _prev_bind_0_$75 = parsing_vars.$parse_root_node$.currentBinding(thread);
                final SubLObject _prev_bind_1_$76 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                try {
                    parsing_vars.$parse_root_node$.bind((SubLObject)iterative_template_parser.NIL, thread);
                    parsing_vars.$reify_parse_nodesP$.bind(Symbols.boundp(psp_node_if_any), thread);
                    ans = psp_main.ps_parse_vbar(words, pos_pred, psp_lexicon.get_default_psp_lexicon(mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED), gap_type);
                    psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                }
                finally {
                    parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_$76, thread);
                    parsing_vars.$parse_root_node$.rebind(_prev_bind_0_$75, thread);
                }
            }
            else {
                ans = psp_main.ps_parse_vbar(words, pos_pred, psp_lexicon.get_default_psp_lexicon(mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED), gap_type);
            }
        }
        finally {
            parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tokenization$.rebind(_prev_bind_2, thread);
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.cons(psp_node_if_any, ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 50644L)
    public static SubLObject itp_ps_parse_vbar(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt) {
        if (category == iterative_template_parser.UNPROVIDED) {
            category = (SubLObject)iterative_template_parser.NIL;
        }
        if (mt == iterative_template_parser.UNPROVIDED) {
            mt = (SubLObject)iterative_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == v_memoization_state) {
            return itp_ps_parse_vbar_internal(words, span, category, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)iterative_template_parser.$sym243$ITP_PS_PARSE_VBAR, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)iterative_template_parser.$sym243$ITP_PS_PARSE_VBAR, (SubLObject)iterative_template_parser.FOUR_INTEGER, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQUALP, (SubLObject)iterative_template_parser.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)iterative_template_parser.$sym243$ITP_PS_PARSE_VBAR, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(words, span, category, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)iterative_template_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)iterative_template_parser.NIL;
            collision = cdolist_list_var.first();
            while (iterative_template_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (words.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (span.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (category.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (iterative_template_parser.NIL != cached_args && iterative_template_parser.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(itp_ps_parse_vbar_internal(words, span, category, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(words, span, category, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 51104L)
    public static SubLObject itp_find_or_create_appropriate_chart(final SubLObject state, final SubLObject span_with_the_list, final SubLObject words, final SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart_dictionary = itp_state_psp_charts(state);
        final SubLObject span = span_with_the_list.rest();
        SubLObject result;
        SubLObject iteration_state;
        for (result = (SubLObject)iterative_template_parser.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(chart_dictionary)); iterative_template_parser.NIL == result && iterative_template_parser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject chart = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iterative_template_parser.NIL != itp_subspanP(span, chart_span)) {
                result = chart;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (iterative_template_parser.NIL == result) {
            result = get_chart_from_extra_psp_charts(words);
        }
        if (iterative_template_parser.NIL == result) {
            final SubLObject new_chart = psp_syntax.psp_chart_for_string(words, psp_lexicon.get_default_psp_lexicon(lex_mt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)iterative_template_parser.$kw244$NONE, (SubLObject)iterative_template_parser.NIL);
            dictionary.dictionary_enter(itp_state_psp_charts(state), conses_high.copy_list(span), new_chart);
            result = new_chart;
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)iterative_template_parser.ONE_INTEGER)) {
            recognition.rtp_tracer_output((SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)iterative_template_parser.$str245$length_of_chart_for__S____S__, words, psp_chart.psp_edge_count(result)));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52173L)
    public static SubLObject get_chart_from_extra_psp_charts(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject good_chart = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == good_chart) {
            SubLObject csome_list_var = parsing_vars.$psp_extra_charts$.getDynamicValue(thread);
            SubLObject chart = (SubLObject)iterative_template_parser.NIL;
            chart = csome_list_var.first();
            while (iterative_template_parser.NIL == good_chart && iterative_template_parser.NIL != csome_list_var) {
                if (iterative_template_parser.NIL != psp_main.psp_find_string_in_chart(string, chart)) {
                    good_chart = chart;
                }
                csome_list_var = csome_list_var.rest();
                chart = csome_list_var.first();
            }
        }
        return good_chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52407L)
    public static SubLObject itp_subspanP(final SubLObject subspan, final SubLObject superspan) {
        return Sequences.search(subspan, superspan, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52493L)
    public static SubLObject gap_type_for_category(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(cat)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(cat, iterative_template_parser.$const246$gapTypeForTemplateCategory, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (iterative_template_parser.NIL == result) {
            return (SubLObject)iterative_template_parser.$kw244$NONE;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 52920L)
    public static SubLObject pred_for_category(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(cat)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(cat, iterative_template_parser.$const247$posPredForTemplateCategory, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (iterative_template_parser.NIL == result) {
            Errors.warn((SubLObject)iterative_template_parser.$str248$sent_a_weird_category___S__to_pre, cat);
            return iterative_template_parser.$const249$verbStrings;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 53469L)
    public static SubLObject rtp_cat_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == forts.fort_p(pred)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(pred, iterative_template_parser.$const247$posPredForTemplateCategory, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (iterative_template_parser.NIL == result) {
            Errors.warn((SubLObject)iterative_template_parser.$str250$sent_a_non_categorized_pred___S__, pred);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 53998L)
    public static SubLObject rtp_cat_for_pos(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == forts.fort_p(pos)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (pos.eql(iterative_template_parser.$const251$Noun)) {
            return iterative_template_parser.$const240$NPTemplate;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(pos, iterative_template_parser.$const252$posForTemplateCategory, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (iterative_template_parser.NIL == result) {
            Errors.warn((SubLObject)iterative_template_parser.$str253$sent_un_categorized_category__s_t, pos);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 54558L)
    public static SubLObject pos_for_rtp_cat(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == forts.fort_p(cat)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (cat.eql(iterative_template_parser.$const240$NPTemplate)) {
            return iterative_template_parser.$const251$Noun;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(cat, iterative_template_parser.$const252$posForTemplateCategory, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (iterative_template_parser.NIL == result) {
            Errors.warn((SubLObject)iterative_template_parser.$str253$sent_un_categorized_category__s_t, cat);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55128L)
    public static SubLObject best_rtp_cat_for_preds(final SubLObject preds) {
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == result) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = preds, pred = (SubLObject)iterative_template_parser.NIL, pred = csome_list_var.first(); iterative_template_parser.NIL == result && iterative_template_parser.NIL != csome_list_var; result = rtp_cat_for_pred(pred), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
    public static SubLObject clear_verb_phrasal_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
    public static SubLObject remove_verb_phrasal_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
    public static SubLObject verb_phrasal_template_categoryP_internal(final SubLObject category) {
        return (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL != verbal_template_categoryP(category) && iterative_template_parser.NIL == genls.genl_in_any_mtP(category, iterative_template_parser.$const115$STemplate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55340L)
    public static SubLObject verb_phrasal_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_, (SubLObject)iterative_template_parser.$sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.$int256$64, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(verb_phrasal_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
    public static SubLObject clear_verbal_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$verbal_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
    public static SubLObject remove_verbal_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$verbal_template_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
    public static SubLObject verbal_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(category)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.pred_values(category, iterative_template_parser.$const252$posForTemplateCategory, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP(iterative_template_parser.$const185$Verb, result, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55595L)
    public static SubLObject verbal_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$verbal_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym257$VERBAL_TEMPLATE_CATEGORY_, (SubLObject)iterative_template_parser.$sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.$int256$64, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(verbal_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
    public static SubLObject clear_vbar_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$vbar_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
    public static SubLObject remove_vbar_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$vbar_template_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
    public static SubLObject vbar_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(category)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = genls.genlP(category, iterative_template_parser.$const260$VBarTemplate, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 55949L)
    public static SubLObject vbar_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$vbar_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym259$VBAR_TEMPLATE_CATEGORY_, (SubLObject)iterative_template_parser.$sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(vbar_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
    public static SubLObject clear_rtp_vbar_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
    public static SubLObject remove_rtp_vbar_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
    public static SubLObject rtp_vbar_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(category)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(iterative_template_parser.$const263$RTPVBarTemplateMt, thread);
            SubLObject template = (SubLObject)iterative_template_parser.NIL;
            final SubLObject pred_var = iterative_template_parser.$const264$assertTemplate_Reln;
            if (iterative_template_parser.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(category, (SubLObject)iterative_template_parser.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(category, (SubLObject)iterative_template_parser.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)iterative_template_parser.NIL;
                final SubLObject token_var = (SubLObject)iterative_template_parser.NIL;
                while (iterative_template_parser.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (iterative_template_parser.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)iterative_template_parser.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)iterative_template_parser.$kw55$GAF, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.NIL);
                            SubLObject done_var_$77 = (SubLObject)iterative_template_parser.NIL;
                            final SubLObject token_var_$78 = (SubLObject)iterative_template_parser.NIL;
                            while (iterative_template_parser.NIL == done_var_$77) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$78);
                                final SubLObject valid_$79 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$78.eql(assertion));
                                if (iterative_template_parser.NIL != valid_$79) {
                                    template = assertions_high.gaf_arg(assertion, (SubLObject)iterative_template_parser.ONE_INTEGER);
                                    if (iterative_template_parser.NIL != genls.genlP(template, iterative_template_parser.$const174$VPTemplate, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                                        result = (SubLObject)iterative_template_parser.T;
                                    }
                                }
                                done_var_$77 = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == valid_$79);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)iterative_template_parser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (iterative_template_parser.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56243L)
    public static SubLObject rtp_vbar_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym262$RTP_VBAR_TEMPLATE_CATEGORY_, (SubLObject)iterative_template_parser.$sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rtp_vbar_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56638L)
    public static SubLObject extended_vbar_template_categoryP(final SubLObject category) {
        return (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL != vbar_template_categoryP(category) || iterative_template_parser.NIL != rtp_vbar_template_categoryP(category));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
    public static SubLObject clear_predicative_adjp_template_categoryP() {
        final SubLObject cs = iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
    public static SubLObject remove_predicative_adjp_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
    public static SubLObject predicative_adjp_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(category)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = genls.genlP(category, iterative_template_parser.$const267$AdjPTemplate_Predicative, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 56793L)
    public static SubLObject predicative_adjp_template_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_, (SubLObject)iterative_template_parser.$sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predicative_adjp_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
    public static SubLObject clear_nominal_categoryP() {
        final SubLObject cs = iterative_template_parser.$nominal_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
    public static SubLObject remove_nominal_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$nominal_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
    public static SubLObject nominal_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(category)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.pred_values(category, iterative_template_parser.$const252$posForTemplateCategory, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP(iterative_template_parser.$const251$Noun, result, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57111L)
    public static SubLObject nominal_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$nominal_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym269$NOMINAL_CATEGORY_, (SubLObject)iterative_template_parser.$sym270$_NOMINAL_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nominal_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
    public static SubLObject clear_adjectival_categoryP() {
        final SubLObject cs = iterative_template_parser.$adjectival_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
    public static SubLObject remove_adjectival_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(iterative_template_parser.$adjectival_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
    public static SubLObject adjectival_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iterative_template_parser.NIL == kb_indexing_datastructures.indexed_term_p(category)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)iterative_template_parser.$sym117$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.pred_values(category, iterative_template_parser.$const252$posForTemplateCategory, (SubLObject)iterative_template_parser.TWO_INTEGER, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP(iterative_template_parser.$const272$Adjective, result, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57434L)
    public static SubLObject adjectival_categoryP(final SubLObject category) {
        SubLObject caching_state = iterative_template_parser.$adjectival_categoryP_caching_state$.getGlobalValue();
        if (iterative_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)iterative_template_parser.$sym271$ADJECTIVAL_CATEGORY_, (SubLObject)iterative_template_parser.$sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_, (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.EQL, (SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)iterative_template_parser.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(adjectival_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57765L)
    public static SubLObject number_template_categoryP(final SubLObject category) {
        return subl_promotions.memberP(category, (SubLObject)iterative_template_parser.$list274, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 57885L)
    public static SubLObject verbal_categoryP(final SubLObject word_cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.genl_posP(word_cat, iterative_template_parser.$const185$Verb, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58032L)
    public static SubLObject expand_itp_state_completely(final SubLObject state, final SubLObject mt) {
        while (queues.p_queue_size(itp_state_work_set(state)).isPositive()) {
            expand_itp_state(state, mt);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58200L)
    public static SubLObject itp_node_max_child_span_length(final SubLObject node) {
        final SubLObject biggest_kid = list_utilities.extremal(rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(itp_node_new_parse(node)), (SubLObject)iterative_template_parser.$sym229$_, (SubLObject)iterative_template_parser.$sym275$RESULT_OF_PARSING_SPAN_LENGTH);
        if (iterative_template_parser.NIL != biggest_kid) {
            return parsing_utilities.result_of_parsing_span_length(biggest_kid);
        }
        return (SubLObject)iterative_template_parser.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 58471L)
    public static SubLObject itp_output_sorting_function(final SubLObject item) {
        final SubLObject span = item.first();
        return Numbers.add(Numbers.multiply(Sequences.length(span), (SubLObject)iterative_template_parser.$int276$100), span.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 59094L)
    public static SubLObject compute_correct_span(final SubLObject absolute, final SubLObject relative) {
        final SubLObject offset = conses_high.second(absolute);
        SubLObject new_span = (SubLObject)iterative_template_parser.NIL;
        final SubLObject numeric_part = relative.first().eql(iterative_template_parser.$const179$TheList) ? relative.rest() : relative;
        final SubLObject numeric_base = absolute.rest();
        if (iterative_template_parser.NIL != Sequences.search(numeric_part, numeric_base, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            return relative;
        }
        SubLObject cdolist_list_var = relative;
        SubLObject position = (SubLObject)iterative_template_parser.NIL;
        position = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (position.isNumber()) {
                new_span = (SubLObject)ConsesLow.cons(Numbers.add(offset, position), new_span);
            }
            else {
                new_span = (SubLObject)ConsesLow.cons(position, new_span);
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 59854L)
    public static SubLObject adjust_the_spans(final SubLObject formula, final SubLObject span, SubLObject span_test) {
        if (span_test == iterative_template_parser.UNPROVIDED) {
            span_test = (SubLObject)iterative_template_parser.$sym277$IS_THIS_A_THELIST_SPAN_;
        }
        final SubLObject lists = list_utilities.tree_gather(formula, span_test, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        final SubLObject base_span = (iterative_template_parser.NIL != is_this_a_thelist_spanP(span)) ? span.rest() : span;
        SubLObject cdolist_list_var = lists;
        SubLObject a_span = (SubLObject)iterative_template_parser.NIL;
        a_span = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            SubLObject spot = a_span;
            SubLObject cdolist_list_var_$81 = a_span;
            SubLObject number = (SubLObject)iterative_template_parser.NIL;
            number = cdolist_list_var_$81.first();
            while (iterative_template_parser.NIL != cdolist_list_var_$81) {
                if (number.isNumber()) {
                    final SubLObject index = ConsesLow.nth(number, base_span);
                    if (iterative_template_parser.NIL != index) {
                        conses_high.nsubst(index, number, spot, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
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
    public static SubLObject is_this_a_thelist_spanP(final SubLObject obj) {
        if (!obj.isCons() || !obj.first().eql(iterative_template_parser.$const179$TheList)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject cdolist_list_var = obj.rest();
        SubLObject part = (SubLObject)iterative_template_parser.NIL;
        part = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (!part.isFixnum()) {
                return (SubLObject)iterative_template_parser.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return (SubLObject)iterative_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 60709L)
    public static SubLObject is_this_a_numeric_spanP(final SubLObject obj) {
        if (!obj.isCons()) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        SubLObject cdolist_list_var = obj;
        SubLObject part = (SubLObject)iterative_template_parser.NIL;
        part = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (!part.isFixnum()) {
                return (SubLObject)iterative_template_parser.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return (SubLObject)iterative_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 60873L)
    public static SubLObject dependent_span_coverage(final SubLObject dependents) {
        final SubLObject dep_coverage = set.new_set((SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        SubLObject dep_span = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = dependents;
        SubLObject this_dep = (SubLObject)iterative_template_parser.NIL;
        this_dep = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (iterative_template_parser.NIL != itp_node_p(this_dep)) {
                dep_span = itp_node_span(this_dep);
            }
            else if (iterative_template_parser.NIL != is_this_a_thelist_spanP(this_dep)) {
                dep_span = this_dep.rest();
            }
            else if (iterative_template_parser.NIL != is_this_a_numeric_spanP(this_dep)) {
                dep_span = this_dep;
            }
            SubLObject cdolist_list_var_$82 = dep_span;
            SubLObject n = (SubLObject)iterative_template_parser.NIL;
            n = cdolist_list_var_$82.first();
            while (iterative_template_parser.NIL != cdolist_list_var_$82) {
                set.set_add(n, dep_coverage);
                cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                n = cdolist_list_var_$82.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_dep = cdolist_list_var.first();
        }
        return Sort.sort(set.set_element_list(dep_coverage), (SubLObject)iterative_template_parser.$sym278$_, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 61652L)
    public static SubLObject initial_span_gap(final SubLObject self, final SubLObject dependents) {
        assert iterative_template_parser.NIL != itp_node_p(self) : self;
        final SubLObject dep_coverage = dependent_span_coverage(dependents);
        SubLObject initial_span = (SubLObject)iterative_template_parser.NIL;
        SubLObject span_knownP = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == span_knownP) {
            SubLObject csome_list_var = itp_node_span(self);
            SubLObject n = (SubLObject)iterative_template_parser.NIL;
            n = csome_list_var.first();
            while (iterative_template_parser.NIL == span_knownP && iterative_template_parser.NIL != csome_list_var) {
                if (iterative_template_parser.NIL != subl_promotions.memberP(n, dep_coverage, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    span_knownP = (SubLObject)iterative_template_parser.T;
                }
                else {
                    initial_span = (SubLObject)ConsesLow.cons(n, initial_span);
                }
                csome_list_var = csome_list_var.rest();
                n = csome_list_var.first();
            }
        }
        return Sequences.reverse(initial_span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 62262L)
    public static SubLObject full_span_coverageP(final SubLObject self, final SubLObject dependents) {
        assert iterative_template_parser.NIL != itp_node_p(self) : self;
        return list_utilities.fast_sets_equalP(itp_node_span(self), dependent_span_coverage(dependents), (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 62910L)
    public static SubLObject get_ternary_quant_fns() {
        if (iterative_template_parser.NIL == iterative_template_parser.$ternary_quant_fns$.getGlobalValue()) {
            final SubLObject the_fns = ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym279$_FUNC, (SubLObject)iterative_template_parser.$list280, iterative_template_parser.$const53$EverythingPSC, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
            if (iterative_template_parser.NIL != the_fns) {
                iterative_template_parser.$ternary_quant_fns$.setGlobalValue(the_fns);
            }
            else {
                iterative_template_parser.$ternary_quant_fns$.setGlobalValue((SubLObject)iterative_template_parser.$kw244$NONE);
            }
        }
        if (!iterative_template_parser.$ternary_quant_fns$.getGlobalValue().eql((SubLObject)iterative_template_parser.$kw244$NONE)) {
            return iterative_template_parser.$ternary_quant_fns$.getGlobalValue();
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 63309L)
    public static SubLObject is_this_a_quant_fnP(final SubLObject obj) {
        if (!obj.isCons()) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL != subl_promotions.memberP(obj.first(), get_ternary_quant_fns(), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            return (SubLObject)iterative_template_parser.T;
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 63471L)
    public static SubLObject surrogate_multi_word_componentP(final SubLObject surrogate) {
        return Numbers.numL((SubLObject)iterative_template_parser.TWO_INTEGER, Sequences.length(conses_high.third(surrogate)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 63709L)
    public static SubLObject reify_itp(SubLObject state) {
        if (state == iterative_template_parser.UNPROVIDED) {
            state = iterative_template_parser.$last_itp_state_created$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iterative_template_parser.NIL != fort_types_interface.mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) : iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread);
        if (iterative_template_parser.NIL == fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const282$genlMt, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (iterative_template_parser.NIL != parsing_vars.$parse_tree_mt$.getDynamicValue(thread)) ? parsing_vars.$parse_tree_mt$.getDynamicValue(thread) : iterative_template_parser.$const283$ParseTreeSandboxMt), iterative_template_parser.$const284$UniversalVocabularyMt, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            Errors.warn((SubLObject)iterative_template_parser.$str285$Couldn_t_find_a_parse_tree_mt_to_, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
        }
        SubLObject good_roots = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = itp_state_solution_set(state);
        SubLObject this_root = (SubLObject)iterative_template_parser.NIL;
        this_root = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (iterative_template_parser.NIL == itp_node_parent(this_root)) {
                final SubLObject undo_assert_traceP = (SubLObject)iterative_template_parser.NIL;
                final SubLObject instructions = reify_itp_int(this_root);
                final SubLObject more_instructions = (SubLObject)iterative_template_parser.NIL;
                if (iterative_template_parser.NIL != instructions) {
                    if (iterative_template_parser.NIL == good_roots) {
                        good_roots = this_root;
                    }
                    else if (iterative_template_parser.NIL != itp_node_p(good_roots)) {
                        SubLObject choice_cat = (SubLObject)iterative_template_parser.NIL;
                        if (iterative_template_parser.NIL == choice_cat) {
                            choice_cat = iterative_template_parser.$const30$SyntacticChoiceNode;
                        }
                        final SubLObject new_node = new_syntactic_choice_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), Mapping.mapcar((SubLObject)iterative_template_parser.$sym148$ITP_NODE_SYNTACTIC_NODE, (SubLObject)ConsesLow.list(this_root, good_roots)), choice_cat, (SubLObject)iterative_template_parser.UNPROVIDED);
                        if (iterative_template_parser.NIL != forts.fort_p(iterative_template_parser.$const63$CycRecursiveTemplateParser)) {
                            fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.list(iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list(iterative_template_parser.$const79$ProgramCopyFn, iterative_template_parser.$const63$CycRecursiveTemplateParser), iterative_template_parser.$const170$partOfIBT, iterative_template_parser.$const171$Cyc), new_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                        }
                        good_roots = new_node;
                    }
                    else {
                        final SubLObject choice_cat = (SubLObject)iterative_template_parser.NIL;
                        final SubLObject new_node = new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.NIL, (SubLObject)iterative_template_parser.UNPROVIDED);
                        if (iterative_template_parser.NIL != forts.fort_p(iterative_template_parser.$const63$CycRecursiveTemplateParser)) {
                            fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.list(iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list(iterative_template_parser.$const79$ProgramCopyFn, iterative_template_parser.$const63$CycRecursiveTemplateParser), iterative_template_parser.$const170$partOfIBT, iterative_template_parser.$const171$Cyc), new_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                        }
                        parsing_utilities.syntactic_node_add_dtr(new_node, itp_node_syntactic_node(this_root), (SubLObject)iterative_template_parser.NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                    }
                }
                SubLObject cdolist_list_var_$83 = instructions;
                SubLObject this_gaf = (SubLObject)iterative_template_parser.NIL;
                this_gaf = cdolist_list_var_$83.first();
                while (iterative_template_parser.NIL != cdolist_list_var_$83) {
                    fi.fi_assert_int(this_gaf, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                    this_gaf = cdolist_list_var_$83.first();
                }
                SubLObject cdolist_list_var_$84 = more_instructions;
                this_gaf = (SubLObject)iterative_template_parser.NIL;
                this_gaf = cdolist_list_var_$84.first();
                while (iterative_template_parser.NIL != cdolist_list_var_$84) {
                    fi.fi_assert_int(this_gaf, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                    cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                    this_gaf = cdolist_list_var_$84.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_root = cdolist_list_var.first();
        }
        if (iterative_template_parser.NIL == good_roots) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        return parsing_utilities.create_parse_tree_with_root_node((iterative_template_parser.NIL != itp_node_p(good_roots)) ? itp_node_syntactic_node(good_roots) : good_roots, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 65781L)
    public static SubLObject reify_itp_int(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject itp_leafP = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == itp_node_children(self) && iterative_template_parser.NIL == itp_node_syntactic_node(self));
        final SubLObject valid_children = (SubLObject)((iterative_template_parser.NIL != itp_leafP) ? iterative_template_parser.NIL : itp_node_get_legitimate_children(self));
        SubLObject these_instructions = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == valid_children && iterative_template_parser.NIL == itp_leafP) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject my_component = itp_node_component(self);
        SubLObject my_category = (SubLObject)((iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) ? parsing_utilities.result_of_parsing_category(my_component) : iterative_template_parser.NIL);
        final SubLObject my_real_parent = itp_node_parent(self);
        SubLObject my_kb_parent = (SubLObject)iterative_template_parser.NIL;
        SubLObject my_kb_node = itp_node_syntactic_node(self);
        final SubLObject my_meaning = itp_node_new_parse(self);
        if (iterative_template_parser.NIL == my_category) {
            my_category = ((iterative_template_parser.NIL != my_real_parent) ? iterative_template_parser.$const286$SyntacticNode_Sentential : iterative_template_parser.$const20$SyntacticNode_MatrixClause);
        }
        if (iterative_template_parser.NIL != my_real_parent) {
            my_kb_parent = itp_choice_node_for_component(my_real_parent, my_component);
            if (iterative_template_parser.NIL == my_kb_parent) {
                my_kb_parent = itp_node_syntactic_node(my_real_parent);
            }
        }
        if (iterative_template_parser.NIL != itp_node_p(my_real_parent) && iterative_template_parser.NIL == my_kb_node) {
            SubLObject csome_list_var = itp_node_get_legitimate_children(my_real_parent);
            SubLObject other_child = (SubLObject)iterative_template_parser.NIL;
            other_child = csome_list_var.first();
            while (iterative_template_parser.NIL == my_kb_node && iterative_template_parser.NIL != csome_list_var) {
                if (!other_child.equal(self) && itp_node_component(self).equal(itp_node_component(other_child))) {
                    my_kb_node = itp_node_syntactic_node(other_child);
                }
                csome_list_var = csome_list_var.rest();
                other_child = csome_list_var.first();
            }
        }
        if (iterative_template_parser.NIL == my_kb_node) {
            final SubLObject _prev_bind_0 = iterative_template_parser.$kb_node_gathering_modeP$.currentBinding(thread);
            try {
                iterative_template_parser.$kb_node_gathering_modeP$.bind((SubLObject)iterative_template_parser.T, thread);
                final SubLObject choice_cat = my_category;
                thread.resetMultipleValues();
                final SubLObject new_node = new_syntactic_functional_node(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), my_category, (SubLObject)iterative_template_parser.UNPROVIDED);
                final SubLObject new_gafs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (iterative_template_parser.NIL != forts.fort_p(iterative_template_parser.$const63$CycRecursiveTemplateParser)) {
                    fi.fi_assert_int((SubLObject)ConsesLow.list(iterative_template_parser.$const77$syntacticNodeCreator, (SubLObject)ConsesLow.list(iterative_template_parser.$const78$InstanceWithRelationFromFn, (SubLObject)ConsesLow.list(iterative_template_parser.$const79$ProgramCopyFn, iterative_template_parser.$const63$CycRecursiveTemplateParser), iterative_template_parser.$const170$partOfIBT, iterative_template_parser.$const171$Cyc), new_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
                }
                SubLObject cdolist_list_var = new_gafs;
                SubLObject test_gaf = (SubLObject)iterative_template_parser.NIL;
                test_gaf = cdolist_list_var.first();
                while (iterative_template_parser.NIL != cdolist_list_var) {
                    these_instructions = (SubLObject)ConsesLow.cons(test_gaf, these_instructions);
                    cdolist_list_var = cdolist_list_var.rest();
                    test_gaf = cdolist_list_var.first();
                }
                my_kb_node = new_node;
                if (iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) {
                    these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const232$syntacticNodeString, my_kb_node, parsing_utilities.result_of_parsing_words(my_component)), these_instructions);
                }
                else if (iterative_template_parser.NIL != join_template_components_node_p(self)) {
                    these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const232$syntacticNodeString, my_kb_node, join_template_components_node_word_list(self)), these_instructions);
                }
                cdolist_list_var = valid_children;
                SubLObject child = (SubLObject)iterative_template_parser.NIL;
                child = cdolist_list_var.first();
                while (iterative_template_parser.NIL != cdolist_list_var) {
                    final SubLObject this_child_node = itp_node_syntactic_node(child);
                    if (iterative_template_parser.NIL != this_child_node && iterative_template_parser.NIL == ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym287$_N, (SubLObject)ConsesLow.list(iterative_template_parser.$const186$syntacticNodeNthDaughter, my_kb_node, (SubLObject)iterative_template_parser.$sym287$_N, this_child_node), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                        parsing_utilities.syntactic_node_add_dtr(my_kb_node, this_child_node, (SubLObject)iterative_template_parser.NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
                        if (iterative_template_parser.NIL != full_span_coverageP(self, (SubLObject)ConsesLow.list(child))) {
                            SubLObject cdolist_list_var_$85 = parsing_utilities.syntactic_node_proposed_meanings(this_child_node, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED);
                            SubLObject meaning = (SubLObject)iterative_template_parser.NIL;
                            meaning = cdolist_list_var_$85.first();
                            while (iterative_template_parser.NIL != cdolist_list_var_$85) {
                                these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const288$dependentMeaning, my_kb_node, meaning, this_child_node, meaning), these_instructions);
                                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                meaning = cdolist_list_var_$85.first();
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                }
            }
            finally {
                iterative_template_parser.$kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
            }
        }
        _csetf_itp_node_syntactic_node(self, my_kb_node);
        if (my_category.eql(iterative_template_parser.$const174$VPTemplate) && iterative_template_parser.NIL == valid_children && iterative_template_parser.NIL != isa.isa_in_any_mtP(my_kb_parent, iterative_template_parser.$const30$SyntacticChoiceNode)) {
            these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const88$excludedOptionNodes, my_kb_parent, my_kb_node), these_instructions);
        }
        if (iterative_template_parser.NIL != my_real_parent && iterative_template_parser.NIL == my_kb_parent) {
            my_kb_parent = itp_node_syntactic_node(my_real_parent);
        }
        if (iterative_template_parser.NIL != my_kb_parent) {
            if (iterative_template_parser.NIL != isa.isa_in_any_mtP(my_kb_parent, iterative_template_parser.$const30$SyntacticChoiceNode)) {
                these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const32$optionNodes, my_kb_parent, my_kb_node), these_instructions);
            }
            else if (iterative_template_parser.NIL == ask_utilities.ask_variable((SubLObject)iterative_template_parser.$sym287$_N, (SubLObject)ConsesLow.list(iterative_template_parser.$const186$syntacticNodeNthDaughter, my_kb_parent, (SubLObject)iterative_template_parser.$sym287$_N, my_kb_node), iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                parsing_utilities.syntactic_node_add_dtr(my_kb_parent, my_kb_node, (SubLObject)iterative_template_parser.NIL, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread));
            }
        }
        SubLObject cdolist_list_var2 = valid_children;
        SubLObject this_child = (SubLObject)iterative_template_parser.NIL;
        this_child = cdolist_list_var2.first();
        while (iterative_template_parser.NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject v_answer = itp_node_find_or_initialize_syntactic_choices(self, itp_node_component(this_child));
            final SubLObject the_gafs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iterative_template_parser.NIL != v_answer) {
                SubLObject cdolist_list_var_$86 = the_gafs;
                SubLObject gaf = (SubLObject)iterative_template_parser.NIL;
                gaf = cdolist_list_var_$86.first();
                while (iterative_template_parser.NIL != cdolist_list_var_$86) {
                    these_instructions = (SubLObject)ConsesLow.cons(gaf, these_instructions);
                    cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                    gaf = cdolist_list_var_$86.first();
                }
            }
            final SubLObject gafs = reify_itp_int(this_child);
            final SubLObject join_componentP = join_template_components_node_p(self);
            final SubLObject need_componentP = (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL == join_componentP && iterative_template_parser.NIL != list_utilities.sublisp_boolean(list_utilities.tree_find_if((SubLObject)iterative_template_parser.$sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, (SubLObject)iterative_template_parser.UNPROVIDED)));
            final SubLObject kids_component = (SubLObject)((iterative_template_parser.NIL != need_componentP) ? itp_node_component(this_child) : iterative_template_parser.NIL);
            if (iterative_template_parser.NIL != list_utilities.proper_list_p(gafs)) {
                SubLObject cdolist_list_var_$87 = gafs;
                SubLObject this_gaf = (SubLObject)iterative_template_parser.NIL;
                this_gaf = cdolist_list_var_$87.first();
                while (iterative_template_parser.NIL != cdolist_list_var_$87) {
                    these_instructions = (SubLObject)ConsesLow.cons(this_gaf, these_instructions);
                    if (iterative_template_parser.NIL != need_componentP && cycl_utilities.formula_arg1(this_gaf, (SubLObject)iterative_template_parser.UNPROVIDED).eql(itp_node_syntactic_node(this_child)) && (cycl_utilities.formula_arg0(this_gaf).eql(iterative_template_parser.$const234$proposedMeaning) || cycl_utilities.formula_arg0(this_gaf).eql(iterative_template_parser.$const288$dependentMeaning))) {
                        final SubLObject kids_meaning = cycl_utilities.formula_arg2(this_gaf, (SubLObject)iterative_template_parser.UNPROVIDED);
                        SubLObject this_meaning = list_utilities.tree_substitute(my_meaning, kids_component, kids_meaning);
                        if (this_meaning.equalp(my_meaning)) {
                            this_meaning = conses_high.copy_tree(kids_meaning);
                        }
                        if (!cycl_utilities.formula_arg0(this_meaning).eql(iterative_template_parser.$const235$SubLQuoteFn)) {
                            this_meaning = (SubLObject)ConsesLow.list(iterative_template_parser.$const235$SubLQuoteFn, this_meaning);
                        }
                        these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const288$dependentMeaning, my_kb_node, this_meaning, itp_node_syntactic_node(this_child), kids_meaning), these_instructions);
                    }
                    cdolist_list_var_$87 = cdolist_list_var_$87.rest();
                    this_gaf = cdolist_list_var_$87.first();
                }
            }
            else if (iterative_template_parser.NIL != iterative_template_parser.$kb_node_gathering_modeP$.getDynamicValue(thread)) {
                kill_syntactic_node_tree(my_kb_node);
                return (SubLObject)iterative_template_parser.NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_child = cdolist_list_var2.first();
        }
        if (iterative_template_parser.NIL != join_template_components_node_p(self) && iterative_template_parser.NIL != isa.isaP(my_kb_node, iterative_template_parser.$const286$SyntacticNode_Sentential, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), (SubLObject)iterative_template_parser.UNPROVIDED) && cycl_utilities.formula_arg1(my_meaning, (SubLObject)iterative_template_parser.UNPROVIDED).equal((SubLObject)iterative_template_parser.$list290)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(cycl_utilities.formula_arg2(my_meaning, (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)iterative_template_parser.UNPROVIDED);
            SubLObject subj_component = (SubLObject)iterative_template_parser.NIL;
            SubLObject vp_component = (SubLObject)iterative_template_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list291);
            subj_component = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iterative_template_parser.$list291);
            vp_component = current.first();
            current = current.rest();
            if (iterative_template_parser.NIL == current) {
                SubLObject subj_options = (SubLObject)iterative_template_parser.NIL;
                SubLObject subj_nodes = (SubLObject)iterative_template_parser.NIL;
                SubLObject vp_options = (SubLObject)iterative_template_parser.NIL;
                SubLObject vp_nodes = (SubLObject)iterative_template_parser.NIL;
                SubLObject cdolist_list_var3 = valid_children;
                SubLObject this_child2 = (SubLObject)iterative_template_parser.NIL;
                this_child2 = cdolist_list_var3.first();
                while (iterative_template_parser.NIL != cdolist_list_var3) {
                    final SubLObject this_component = itp_node_component(this_child2);
                    final SubLObject this_node = itp_node_syntactic_node(this_child2);
                    if (this_component.equal(subj_component)) {
                        subj_nodes = (SubLObject)ConsesLow.cons(this_node, subj_nodes);
                    }
                    else if (this_component.equal(vp_component)) {
                        vp_nodes = (SubLObject)ConsesLow.cons(this_node, vp_nodes);
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    this_child2 = cdolist_list_var3.first();
                }
                cdolist_list_var3 = these_instructions;
                SubLObject this_gaf2 = (SubLObject)iterative_template_parser.NIL;
                this_gaf2 = cdolist_list_var3.first();
                while (iterative_template_parser.NIL != cdolist_list_var3) {
                    if (cycl_utilities.formula_arg0(this_gaf2).eql(iterative_template_parser.$const234$proposedMeaning) || cycl_utilities.formula_arg0(this_gaf2).eql(iterative_template_parser.$const288$dependentMeaning)) {
                        if (iterative_template_parser.NIL != subl_promotions.memberP(cycl_utilities.formula_arg1(this_gaf2, (SubLObject)iterative_template_parser.UNPROVIDED), subj_nodes, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                            final SubLObject item_var = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(this_gaf2, (SubLObject)iterative_template_parser.UNPROVIDED), cycl_utilities.formula_arg2(this_gaf2, (SubLObject)iterative_template_parser.UNPROVIDED));
                            if (iterative_template_parser.NIL == conses_high.member(item_var, subj_options, (SubLObject)iterative_template_parser.EQUAL, Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                                subj_options = (SubLObject)ConsesLow.cons(item_var, subj_options);
                            }
                        }
                        else if (iterative_template_parser.NIL != subl_promotions.memberP(cycl_utilities.formula_arg1(this_gaf2, (SubLObject)iterative_template_parser.UNPROVIDED), vp_nodes, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                            final SubLObject item_var = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(this_gaf2, (SubLObject)iterative_template_parser.UNPROVIDED), cycl_utilities.formula_arg2(this_gaf2, (SubLObject)iterative_template_parser.UNPROVIDED));
                            if (iterative_template_parser.NIL == conses_high.member(item_var, vp_options, (SubLObject)iterative_template_parser.EQUAL, Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                                vp_options = (SubLObject)ConsesLow.cons(item_var, vp_options);
                            }
                        }
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    this_gaf2 = cdolist_list_var3.first();
                }
                cdolist_list_var3 = subj_nodes;
                SubLObject node = (SubLObject)iterative_template_parser.NIL;
                node = cdolist_list_var3.first();
                while (iterative_template_parser.NIL != cdolist_list_var3) {
                    SubLObject cdolist_list_var_$88 = parsing_utilities.syntactic_node_proposed_meanings(node, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), iterative_template_parser.$const234$proposedMeaning);
                    SubLObject this_meaning2 = (SubLObject)iterative_template_parser.NIL;
                    this_meaning2 = cdolist_list_var_$88.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$88) {
                        final SubLObject item_var2 = (SubLObject)ConsesLow.list(node, this_meaning2);
                        if (iterative_template_parser.NIL == conses_high.member(item_var2, subj_options, (SubLObject)iterative_template_parser.EQUAL, Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                            subj_options = (SubLObject)ConsesLow.cons(item_var2, subj_options);
                        }
                        cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                        this_meaning2 = cdolist_list_var_$88.first();
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    node = cdolist_list_var3.first();
                }
                cdolist_list_var3 = vp_nodes;
                node = (SubLObject)iterative_template_parser.NIL;
                node = cdolist_list_var3.first();
                while (iterative_template_parser.NIL != cdolist_list_var3) {
                    SubLObject cdolist_list_var_$89 = parsing_utilities.syntactic_node_proposed_meanings(node, iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread), iterative_template_parser.$const234$proposedMeaning);
                    SubLObject this_meaning2 = (SubLObject)iterative_template_parser.NIL;
                    this_meaning2 = cdolist_list_var_$89.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$89) {
                        final SubLObject item_var2 = (SubLObject)ConsesLow.list(node, this_meaning2);
                        if (iterative_template_parser.NIL == conses_high.member(item_var2, vp_options, (SubLObject)iterative_template_parser.EQUAL, Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                            vp_options = (SubLObject)ConsesLow.cons(item_var2, vp_options);
                        }
                        cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                        this_meaning2 = cdolist_list_var_$89.first();
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    node = cdolist_list_var3.first();
                }
                if (iterative_template_parser.NIL == subj_options || iterative_template_parser.NIL == vp_options) {
                    Errors.warn((SubLObject)iterative_template_parser.$str292$____can_t_build_any_meaning_combi, my_kb_node);
                }
                else {
                    cdolist_list_var3 = vp_options;
                    SubLObject this_vp_option = (SubLObject)iterative_template_parser.NIL;
                    this_vp_option = cdolist_list_var3.first();
                    while (iterative_template_parser.NIL != cdolist_list_var3) {
                        SubLObject current_$91;
                        final SubLObject datum_$90 = current_$91 = this_vp_option;
                        SubLObject vp_node = (SubLObject)iterative_template_parser.NIL;
                        SubLObject vp_meaning = (SubLObject)iterative_template_parser.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$91, datum_$90, (SubLObject)iterative_template_parser.$list293);
                        vp_node = current_$91.first();
                        current_$91 = current_$91.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$91, datum_$90, (SubLObject)iterative_template_parser.$list293);
                        vp_meaning = current_$91.first();
                        current_$91 = current_$91.rest();
                        if (iterative_template_parser.NIL == current_$91) {
                            SubLObject cdolist_list_var_$90 = subj_options;
                            SubLObject this_subj_option = (SubLObject)iterative_template_parser.NIL;
                            this_subj_option = cdolist_list_var_$90.first();
                            while (iterative_template_parser.NIL != cdolist_list_var_$90) {
                                SubLObject current_$92;
                                final SubLObject datum_$91 = current_$92 = this_subj_option;
                                SubLObject subj_node = (SubLObject)iterative_template_parser.NIL;
                                SubLObject subj_meaning = (SubLObject)iterative_template_parser.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$92, datum_$91, (SubLObject)iterative_template_parser.$list294);
                                subj_node = current_$92.first();
                                current_$92 = current_$92.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$92, datum_$91, (SubLObject)iterative_template_parser.$list294);
                                subj_meaning = current_$92.first();
                                current_$92 = current_$92.rest();
                                if (iterative_template_parser.NIL == current_$92) {
                                    SubLObject joined_meaning = list_utilities.tree_substitute(vp_meaning, iterative_template_parser.$const295$TheSentenceSubject, subj_meaning);
                                    joined_meaning = list_utilities.tree_substitute(joined_meaning, (SubLObject)iterative_template_parser.$kw296$SUBJECT, subj_meaning);
                                    these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const288$dependentMeaning, my_kb_node, joined_meaning, vp_node, vp_meaning), these_instructions);
                                    these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const288$dependentMeaning, my_kb_node, joined_meaning, subj_node, subj_meaning), these_instructions);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$91, (SubLObject)iterative_template_parser.$list294);
                                }
                                cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                                this_subj_option = cdolist_list_var_$90.first();
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$90, (SubLObject)iterative_template_parser.$list293);
                        }
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        this_vp_option = cdolist_list_var3.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iterative_template_parser.$list291);
            }
        }
        if (iterative_template_parser.NIL == list_utilities.tree_find_if((SubLObject)iterative_template_parser.$sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            these_instructions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iterative_template_parser.$const234$proposedMeaning, my_kb_node, my_meaning), these_instructions);
        }
        cdolist_list_var2 = itp_node_get_dominance_gafs(self);
        SubLObject this_gaf3 = (SubLObject)iterative_template_parser.NIL;
        this_gaf3 = cdolist_list_var2.first();
        while (iterative_template_parser.NIL != cdolist_list_var2) {
            these_instructions = (SubLObject)ConsesLow.cons(this_gaf3, these_instructions);
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_gaf3 = cdolist_list_var2.first();
        }
        return Sequences.reverse(these_instructions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 74624L)
    public static SubLObject cat_itp(SubLObject state) {
        if (state == iterative_template_parser.UNPROVIDED) {
            state = iterative_template_parser.$last_itp_state_created$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iterative_template_parser.NIL != itp_state_p(state) : state;
        final SubLObject answers = itp_state_solution_set(state);
        final SubLObject todo = enqueue_solution_roots(queues.create_queue((SubLObject)iterative_template_parser.UNPROVIDED), answers);
        final SubLObject result_hash = Hashtables.make_hash_table((SubLObject)iterative_template_parser.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED);
        SubLObject global_sub_list = (SubLObject)iterative_template_parser.NIL;
        SubLObject span = (SubLObject)iterative_template_parser.NIL;
        SubLObject section = (SubLObject)iterative_template_parser.NIL;
        SubLObject results = (SubLObject)iterative_template_parser.NIL;
        SubLObject sub_list = (SubLObject)iterative_template_parser.NIL;
        while (iterative_template_parser.NIL == queues.queue_empty_p(todo)) {
            final SubLObject curr = queues.dequeue(todo);
            final SubLObject the_span = itp_node_span(curr);
            if (!span.equal(the_span)) {
                if (iterative_template_parser.NIL != section) {
                    SubLObject cdolist_list_var = section;
                    SubLObject cycl = (SubLObject)iterative_template_parser.NIL;
                    cycl = cdolist_list_var.first();
                    while (iterative_template_parser.NIL != cdolist_list_var) {
                        hash_table_utilities.pushnew_hash(span, cycl, result_hash, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL));
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    }
                }
                span = the_span;
                section = (SubLObject)iterative_template_parser.NIL;
            }
            thread.resetMultipleValues();
            final SubLObject section_$95 = perform_solution_node_analysis(state, curr, section, todo);
            final SubLObject sub_list_$96 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            section = section_$95;
            sub_list = sub_list_$96;
            global_sub_list = Sequences.cconcatenate(global_sub_list, sub_list);
        }
        if (iterative_template_parser.NIL != section) {
            SubLObject cdolist_list_var2 = section;
            SubLObject cycl2 = (SubLObject)iterative_template_parser.NIL;
            cycl2 = cdolist_list_var2.first();
            while (iterative_template_parser.NIL != cdolist_list_var2) {
                hash_table_utilities.pushnew_hash(span, cycl2, result_hash, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL));
                cdolist_list_var2 = cdolist_list_var2.rest();
                cycl2 = cdolist_list_var2.first();
            }
        }
        SubLObject span_$97 = (SubLObject)iterative_template_parser.NIL;
        SubLObject cycl2 = (SubLObject)iterative_template_parser.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(result_hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                span_$97 = Hashtables.getEntryKey(cdohash_entry);
                cycl2 = Hashtables.getEntryValue(cdohash_entry);
                final SubLObject item_var = (SubLObject)ConsesLow.list(span_$97, cycl2);
                if (iterative_template_parser.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                    results = (SubLObject)ConsesLow.cons(item_var, results);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject temp_results = (SubLObject)iterative_template_parser.NIL;
        SubLObject temp_result = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        result = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            temp_result = result;
            SubLObject cdolist_list_var_$98 = global_sub_list;
            SubLObject sub = (SubLObject)iterative_template_parser.NIL;
            sub = cdolist_list_var_$98.first();
            while (iterative_template_parser.NIL != cdolist_list_var_$98) {
                temp_result = conses_high.subst(conses_high.second(sub), sub.first(), temp_result, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), (SubLObject)iterative_template_parser.UNPROVIDED);
                if (temp_result.isList() && conses_high.second(temp_result).isList() && iterative_template_parser.NIL != assertion_handles.assertion_p(conses_high.second(temp_result).first())) {
                    temp_result = (SubLObject)ConsesLow.list(temp_result.first(), Sequences.cconcatenate(conses_high.second(temp_result), conses_high.third(sub)));
                }
                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                sub = cdolist_list_var_$98.first();
            }
            final SubLObject item_var = temp_result;
            if (iterative_template_parser.NIL == conses_high.member(item_var, temp_results, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                temp_results = (SubLObject)ConsesLow.cons(item_var, temp_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        results = temp_results;
        return sort_itp_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 76602L)
    public static SubLObject transform_nl_quant_forms(SubLObject formula, final SubLObject span_incr) {
        if (iterative_template_parser.NIL != nl_attr_w_locationP(formula)) {
            final SubLObject incremented = formula = el_utilities.replace_formula_arg((SubLObject)iterative_template_parser.THREE_INTEGER, Numbers.add(span_incr, cycl_utilities.formula_arg3(formula, (SubLObject)iterative_template_parser.UNPROVIDED)), formula);
        }
        if (formula.isAtom()) {
            return formula;
        }
        if (iterative_template_parser.NIL != forts.fort_p(formula)) {
            return formula;
        }
        if (iterative_template_parser.NIL == el_utilities.el_formula_p(formula)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL != cycl_utilities.expression_find_if((SubLObject)iterative_template_parser.$sym297$NL_ATTR_W_LOCATION_, formula, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
            return (SubLObject)ConsesLow.cons(transform_nl_quant_forms(cycl_utilities.formula_arg0(formula), span_incr), transform_nl_quant_forms(cycl_utilities.formula_args(formula, (SubLObject)iterative_template_parser.UNPROVIDED), span_incr));
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 77235L)
    public static SubLObject nl_attr_w_locationP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(formula), (SubLObject)iterative_template_parser.$list298, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED) && iterative_template_parser.NIL != el_utilities.formula_arityE(formula, (SubLObject)iterative_template_parser.THREE_INTEGER, (SubLObject)iterative_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 77444L)
    public static SubLObject sort_itp_results(final SubLObject parses) {
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject constit = (SubLObject)iterative_template_parser.NIL;
        constit = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            final SubLObject constit_span = constit.first();
            SubLObject constit_good_result = (SubLObject)iterative_template_parser.NIL;
            SubLObject constit_bad_result = (SubLObject)iterative_template_parser.NIL;
            SubLObject cdolist_list_var_$99 = constit.rest().first();
            SubLObject cycl = (SubLObject)iterative_template_parser.NIL;
            cycl = cdolist_list_var_$99.first();
            while (iterative_template_parser.NIL != cdolist_list_var_$99) {
                if (iterative_template_parser.NIL != rtp_contains_invalid_surrogateP(cycl, parses)) {
                    constit_bad_result = (SubLObject)ConsesLow.cons(cycl, constit_bad_result);
                }
                else {
                    constit_good_result = (SubLObject)ConsesLow.cons(cycl, constit_good_result);
                }
                cdolist_list_var_$99 = cdolist_list_var_$99.rest();
                cycl = cdolist_list_var_$99.first();
            }
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(constit_span, Sequences.cconcatenate(Sequences.reverse(constit_good_result), Sequences.reverse(constit_bad_result))), result);
            cdolist_list_var = cdolist_list_var.rest();
            constit = cdolist_list_var.first();
        }
        return Sort.sort(result, Symbols.symbol_function((SubLObject)iterative_template_parser.$sym229$_), Symbols.symbol_function((SubLObject)iterative_template_parser.$sym299$ITP_OUTPUT_SORTING_FUNCTION));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78017L)
    public static SubLObject rtp_contains_invalid_surrogateP(final SubLObject parse, final SubLObject parses) {
        final SubLObject surrogates = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(parse);
        SubLObject invalidP = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL == surrogates) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL == invalidP) {
            SubLObject csome_list_var = surrogates;
            SubLObject surrogate = (SubLObject)iterative_template_parser.NIL;
            surrogate = csome_list_var.first();
            while (iterative_template_parser.NIL == invalidP && iterative_template_parser.NIL != csome_list_var) {
                final SubLObject surrogate_index = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list(surrogate);
                if (iterative_template_parser.NIL == Sequences.find(surrogate_index, parses, (SubLObject)iterative_template_parser.EQUAL, (SubLObject)iterative_template_parser.$sym300$FIRST, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    invalidP = (SubLObject)iterative_template_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                surrogate = csome_list_var.first();
            }
        }
        return invalidP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78438L)
    public static SubLObject unassembled_phraseP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula.isList() && cycl_utilities.formula_arg0(formula).eql(iterative_template_parser.$const301$AssemblePhraseFn) && iterative_template_parser.NIL != list_utilities.find_if_not(Symbols.symbol_function((SubLObject)iterative_template_parser.$sym302$STRINGP), formula.rest(), (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78730L)
    public static SubLObject transform_assemble_phrases(final SubLObject formula) {
        return Values.values(transform_list_utilities.transform(formula, Symbols.symbol_function((SubLObject)iterative_template_parser.$sym303$UNASSEMBLED_PHRASE_), Symbols.symbol_function((SubLObject)iterative_template_parser.$sym304$REWRITE_ASSEMBLE_PHRASE), (SubLObject)iterative_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 78895L)
    public static SubLObject perform_solution_node_analysis(final SubLObject state, final SubLObject node, SubLObject section, final SubLObject todo_list) {
        final SubLObject expression = transform_assemble_phrases(itp_node_new_parse(node));
        final SubLObject assertion = itp_node_assertion(node);
        final SubLObject join_templatesP = has_join_template_componentsP(expression);
        final SubLObject span_start = itp_node_span(node).first();
        SubLObject solution_list = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL != has_substitutable_childrenP(expression) || iterative_template_parser.NIL != tp_substitutable_formulaP(expression) || iterative_template_parser.NIL != join_templatesP) {
            SubLObject cdolist_list_var = itp_node_children(node);
            SubLObject child = (SubLObject)iterative_template_parser.NIL;
            child = cdolist_list_var.first();
            while (iterative_template_parser.NIL != cdolist_list_var) {
                if (iterative_template_parser.NIL != tp_substitutable_formulaP(itp_node_component(child)) || iterative_template_parser.NIL != substitutable_child_nodeP(child)) {
                    SubLObject cdolist_list_var_$100;
                    final SubLObject modifieds = cdolist_list_var_$100 = tp_do_substitutions(expression, child, todo_list);
                    SubLObject modified = (SubLObject)iterative_template_parser.NIL;
                    modified = cdolist_list_var_$100.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$100) {
                        final SubLObject cycl = modified.first();
                        final SubLObject asserts = conses_high.second(modified);
                        SubLObject reformulated = (iterative_template_parser.NIL != has_join_template_componentsP(cycl)) ? recognition.reformulate_jointemplatecomponents(cycl) : cycl;
                        final SubLObject assertion_set = (SubLObject)ConsesLow.cons(assertion, asserts);
                        if (iterative_template_parser.NIL != reformulated) {
                            reformulated = transform_assemble_phrases(reformulated);
                            if (iterative_template_parser.NIL == partial_parsesP(reformulated)) {
                                SubLObject cdolist_list_var_$101 = find_differences(expression, reformulated, (SubLObject)iterative_template_parser.UNPROVIDED);
                                SubLObject diff = (SubLObject)iterative_template_parser.NIL;
                                diff = cdolist_list_var_$101.first();
                                while (iterative_template_parser.NIL != cdolist_list_var_$101) {
                                    final SubLObject item_var = (SubLObject)ConsesLow.list(diff.first(), conses_high.second(diff), assertion_set);
                                    if (iterative_template_parser.NIL == conses_high.member(item_var, solution_list, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                                        solution_list = (SubLObject)ConsesLow.cons(item_var, solution_list);
                                    }
                                    cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                    diff = cdolist_list_var_$101.first();
                                }
                                if (iterative_template_parser.NIL != has_join_template_componentsP(reformulated)) {
                                    reformulated = recognition.reformulate_jointemplatecomponents(reformulated);
                                }
                                if (iterative_template_parser.NIL == has_join_template_componentsP(reformulated)) {
                                    final SubLObject item_var2 = build_return_format(reformulated, assertion_set, span_start);
                                    if (iterative_template_parser.NIL == conses_high.member(item_var2, section, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                                        section = (SubLObject)ConsesLow.cons(item_var2, section);
                                    }
                                }
                            }
                        }
                        cdolist_list_var_$100 = cdolist_list_var_$100.rest();
                        modified = cdolist_list_var_$100.first();
                    }
                }
                else {
                    SubLObject cdolist_list_var_$102 = itp_node_children(node);
                    SubLObject child_$103 = (SubLObject)iterative_template_parser.NIL;
                    child_$103 = cdolist_list_var_$102.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$102) {
                        if (iterative_template_parser.NIL == queues.queue_find(child_$103, todo_list, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED)) {
                            queues.enqueue(child_$103, todo_list);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        child_$103 = cdolist_list_var_$102.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
        }
        else {
            if (iterative_template_parser.NIL != expression) {
                final SubLObject item_var3 = build_return_format((iterative_template_parser.NIL != has_join_template_componentsP(expression)) ? recognition.reformulate_jointemplatecomponents(expression) : expression, (SubLObject)ConsesLow.list(assertion), span_start);
                if (iterative_template_parser.NIL == conses_high.member(item_var3, section, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUAL), Symbols.symbol_function((SubLObject)iterative_template_parser.IDENTITY))) {
                    section = (SubLObject)ConsesLow.cons(item_var3, section);
                }
            }
            SubLObject cdolist_list_var = itp_node_children(node);
            SubLObject child = (SubLObject)iterative_template_parser.NIL;
            child = cdolist_list_var.first();
            while (iterative_template_parser.NIL != cdolist_list_var) {
                if (iterative_template_parser.NIL == queues.queue_find(child, todo_list, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    queues.enqueue(child, todo_list);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
        }
        return Values.values(rtp_sort_constit_parses(section), solution_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 81830L)
    public static SubLObject rtp_sort_constit_parses(final SubLObject parses) {
        return parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 81896L)
    public static SubLObject merge_parse_results(final SubLObject parse1, final SubLObject parse2) {
        final SubLObject parse_iterator1 = rtp_iterators.new_itp_result_iterator(parse1, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        final SubLObject parse_iterator2 = rtp_iterators.new_itp_result_iterator(parse2, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED);
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        while (iterative_template_parser.NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator1)) {
            final SubLObject span_iterator1 = rtp_iterators.itp_result_iterator_curr(parse_iterator1);
            final SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator1);
            final SubLObject span_iterator2 = rtp_iterators.find_itp_section_iterator(parse_iterator2, span);
            SubLObject span_result = (SubLObject)iterative_template_parser.NIL;
            if (iterative_template_parser.NIL != span_iterator2) {
                span_result = rtp_iterators.itp_section_iterator_section(span_iterator2);
            }
            span_result = Sequences.cconcatenate(span_result, rtp_iterators.itp_section_iterator_section(span_iterator1));
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, span_result), result);
            rtp_iterators.itp_result_iterator_next(parse_iterator1);
        }
        while (iterative_template_parser.NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator2)) {
            final SubLObject span_iterator3 = rtp_iterators.itp_result_iterator_curr(parse_iterator2);
            final SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator3);
            final SubLObject span_iterator4 = rtp_iterators.find_itp_section_iterator(parse_iterator1, span);
            SubLObject span_result = (SubLObject)iterative_template_parser.NIL;
            if (iterative_template_parser.NIL == span_iterator4) {
                span_result = rtp_iterators.itp_section_iterator_section(span_iterator3);
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, span_result), result);
            }
            rtp_iterators.itp_result_iterator_next(parse_iterator2);
        }
        return Sort.sort(result, (SubLObject)iterative_template_parser.$sym229$_, (SubLObject)iterative_template_parser.$sym299$ITP_OUTPUT_SORTING_FUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 83302L)
    public static SubLObject find_differences(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == iterative_template_parser.UNPROVIDED) {
            test = (SubLObject)iterative_template_parser.EQUALP;
        }
        if (iterative_template_parser.NIL != Functions.funcall(test, list1, list2)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        if (iterative_template_parser.NIL != constant_handles.constant_p(list1) || iterative_template_parser.NIL != constant_handles.constant_p(list2)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list1, list2));
        }
        if ((list1.first().isAtom() || list2.first().isAtom()) && iterative_template_parser.NIL == Functions.funcall(test, list1.first(), list2.first())) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list1, list2));
        }
        return Sequences.cconcatenate(find_differences(list1.first(), list2.first(), (SubLObject)iterative_template_parser.UNPROVIDED), find_differences(list1.rest(), list2.rest(), (SubLObject)iterative_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 84153L)
    public static SubLObject build_return_format(SubLObject sem, final SubLObject assertion, final SubLObject span_start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sem = transform_nl_quant_forms(sem, span_start);
        final SubLObject pcase_var = rtp_vars.$rtp_return_style$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)iterative_template_parser.$kw305$SIMPLE)) {
            return sem;
        }
        if (pcase_var.eql((SubLObject)iterative_template_parser.$kw120$ASSERTION)) {
            return (SubLObject)ConsesLow.list(sem, assertion);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 84567L)
    public static SubLObject cat_for_result(final SubLObject justification) {
        if (justification.isList() && iterative_template_parser.NIL != assertion_handles.assertion_p(justification.first())) {
            return assertions_high.gaf_arg1(justification.first());
        }
        return justification.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 85043L)
    public static SubLObject force_for_result(final SubLObject justification) {
        if (justification.isList() && (justification.first().eql(iterative_template_parser.$const240$NPTemplate) || iterative_template_parser.NIL != lexicon_accessors.npP(justification.first()))) {
            return iterative_template_parser.$const306$termTemplate;
        }
        if (justification.isList() && (iterative_template_parser.NIL != subl_promotions.memberP(justification.first(), (SubLObject)iterative_template_parser.$list307, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED) || iterative_template_parser.NIL != lexicon_accessors.vbarP(justification.first()))) {
            return iterative_template_parser.$const308$assertTemplate;
        }
        if (justification.first().eql(iterative_template_parser.$const272$Adjective)) {
            return iterative_template_parser.$const306$termTemplate;
        }
        if (!justification.isList() || iterative_template_parser.NIL == assertion_handles.assertion_p(justification.first())) {
            Errors.warn((SubLObject)iterative_template_parser.$str315$sent__S_to_force_for_result__, justification);
            return (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = assertions_high.gaf_arg0(justification.first());
        if (pcase_var.eql(iterative_template_parser.$const306$termTemplate)) {
            return iterative_template_parser.$const306$termTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const309$termTemplate_Reln)) {
            return iterative_template_parser.$const306$termTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const310$termTemplate_Test)) {
            return iterative_template_parser.$const306$termTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const308$assertTemplate)) {
            return iterative_template_parser.$const308$assertTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const264$assertTemplate_Reln)) {
            return iterative_template_parser.$const308$assertTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const311$assertTemplate_Test)) {
            return iterative_template_parser.$const308$assertTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const312$queryTemplate)) {
            return iterative_template_parser.$const312$queryTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const313$queryTemplate_Reln)) {
            return iterative_template_parser.$const312$queryTemplate;
        }
        if (pcase_var.eql(iterative_template_parser.$const314$queryTemplate_Test)) {
            return iterative_template_parser.$const312$queryTemplate;
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 86572L)
    public static SubLObject tp_do_substitutions(final SubLObject expression, final SubLObject node, final SubLObject todo_list) {
        return tp_do_substitutions_int((SubLObject)ConsesLow.list(expression, (SubLObject)iterative_template_parser.NIL), node, todo_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 86709L)
    public static SubLObject tp_do_substitutions_int(final SubLObject expression, final SubLObject node, final SubLObject todo_list) {
        SubLObject result = (SubLObject)iterative_template_parser.NIL;
        SubLObject this_result = (SubLObject)iterative_template_parser.NIL;
        if (iterative_template_parser.NIL != substitutable_child_nodeP(node)) {
            this_result = (SubLObject)ConsesLow.list(conses_high.subst(itp_node_new_parse(node), itp_node_component(node), expression.first(), Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)ConsesLow.cons(itp_node_assertion(node), conses_high.second(expression)));
            if (iterative_template_parser.NIL != has_substitutable_childrenP(this_result.first())) {
                SubLObject cdolist_list_var = itp_node_children(node);
                SubLObject child = (SubLObject)iterative_template_parser.NIL;
                child = cdolist_list_var.first();
                while (iterative_template_parser.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$104 = tp_do_substitutions_int(this_result, child, todo_list);
                    SubLObject child_result = (SubLObject)iterative_template_parser.NIL;
                    child_result = cdolist_list_var_$104.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$104) {
                        result = (SubLObject)ConsesLow.cons(child_result, result);
                        cdolist_list_var_$104 = cdolist_list_var_$104.rest();
                        child_result = cdolist_list_var_$104.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                }
            }
            else {
                result = (SubLObject)ConsesLow.cons(this_result, result);
                if (iterative_template_parser.NIL == queues.queue_find(node, todo_list, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED)) {
                    queues.enqueue(node, todo_list);
                }
            }
        }
        else if (iterative_template_parser.NIL != tp_substitutable_formulaP(expression.first())) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(itp_node_new_parse(node), (SubLObject)ConsesLow.list(itp_node_assertion(node))), result);
            if (iterative_template_parser.NIL == queues.queue_find(node, todo_list, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED)) {
                queues.enqueue(node, todo_list);
            }
        }
        else {
            result = (SubLObject)ConsesLow.list(expression);
            if (iterative_template_parser.NIL == queues.queue_find(node, todo_list, Symbols.symbol_function((SubLObject)iterative_template_parser.EQUALP), (SubLObject)iterative_template_parser.UNPROVIDED)) {
                queues.enqueue(node, todo_list);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 88335L)
    public static SubLObject tp_substitutable_formulaP(final SubLObject formula) {
        if (iterative_template_parser.NIL == collection_defns.el_expressionP(formula)) {
            return (SubLObject)iterative_template_parser.NIL;
        }
        final SubLObject v_arity = el_utilities.expression_arity(formula, (SubLObject)iterative_template_parser.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(v_arity.isInteger() && v_arity.numE((SubLObject)iterative_template_parser.FOUR_INTEGER) && iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(formula) && iterative_template_parser.NIL != conses_high.member(cycl_utilities.formula_arg3(formula, (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)iterative_template_parser.$list316, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 88668L)
    public static SubLObject substitutable_child_nodeP(final SubLObject node) {
        return substitutable_child_formulaP(itp_node_component(node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 88785L)
    public static SubLObject substitutable_child_formulaP(final SubLObject formula) {
        if (formula.isList()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(formula) && iterative_template_parser.NIL != verbal_template_categoryP(parsing_utilities.result_of_parsing_category(formula)));
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89018L)
    public static SubLObject enqueue_solution_roots(final SubLObject queue, final SubLObject answers) {
        SubLObject cdolist_list_var = answers;
        SubLObject node = (SubLObject)iterative_template_parser.NIL;
        node = cdolist_list_var.first();
        while (iterative_template_parser.NIL != cdolist_list_var) {
            if (iterative_template_parser.NIL == itp_node_parent(node)) {
                queues.enqueue(node, queue);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89232L)
    public static SubLObject join_template_components_p(final SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), iterative_template_parser.$const317$joinTemplateComponents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89349L)
    public static SubLObject join_template_components_node_p(final SubLObject node) {
        if (iterative_template_parser.NIL != itp_node_p(node) && iterative_template_parser.NIL != join_template_components_p(itp_node_new_parse(node))) {
            return itp_node_new_parse(node);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89540L)
    public static SubLObject join_template_components_word_list(final SubLObject formula) {
        if (iterative_template_parser.NIL != join_template_components_p(formula)) {
            SubLObject all_words = (SubLObject)iterative_template_parser.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, (SubLObject)iterative_template_parser.UNPROVIDED), (SubLObject)iterative_template_parser.$kw318$IGNORE);
            SubLObject result = (SubLObject)iterative_template_parser.NIL;
            result = cdolist_list_var.first();
            while (iterative_template_parser.NIL != cdolist_list_var) {
                if (iterative_template_parser.NIL != parsing_utilities.result_of_parsing_formulaP(result)) {
                    SubLObject cdolist_list_var_$105 = rkf_concept_harvester.rkf_ch_string_tokenize(parsing_utilities.result_of_parsing_words(result));
                    SubLObject this_word = (SubLObject)iterative_template_parser.NIL;
                    this_word = cdolist_list_var_$105.first();
                    while (iterative_template_parser.NIL != cdolist_list_var_$105) {
                        all_words = (SubLObject)ConsesLow.cons(this_word, all_words);
                        cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                        this_word = cdolist_list_var_$105.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            }
            return string_utilities.bunge(Sequences.reverse(all_words), (SubLObject)iterative_template_parser.UNPROVIDED);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 89936L)
    public static SubLObject join_template_components_node_word_list(final SubLObject node) {
        final SubLObject formula = join_template_components_node_p(node);
        if (iterative_template_parser.NIL != formula) {
            return join_template_components_word_list(formula);
        }
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90138L)
    public static SubLObject has_join_template_componentsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(iterative_template_parser.NIL != recognition.$perform_template_component_join$.getDynamicValue(thread) && iterative_template_parser.NIL != list_utilities.tree_find(iterative_template_parser.$const317$joinTemplateComponents, formula, (SubLObject)iterative_template_parser.UNPROVIDED, (SubLObject)iterative_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90304L)
    public static SubLObject has_substitutable_childrenP(final SubLObject formula) {
        return list_utilities.tree_find_if((SubLObject)iterative_template_parser.$sym319$SUBSTITUTABLE_CHILD_FORMULA_, formula, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90421L)
    public static SubLObject partial_parse_filter_function(final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(item.eql(iterative_template_parser.$const295$TheSentenceSubject) || item.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/iterative-template-parser.lisp", position = 90549L)
    public static SubLObject partial_parsesP(final SubLObject formula) {
        return list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)iterative_template_parser.$sym320$PARTIAL_PARSE_FILTER_FUNCTION), formula, (SubLObject)iterative_template_parser.UNPROVIDED);
    }
    
    public static SubLObject declare_iterative_template_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "kb_node_analyze_category", "KB-NODE-ANALYZE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "reset_kb_node_internal_counter", "RESET-KB-NODE-INTERNAL-COUNTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "next_available_kb_node", "NEXT-AVAILABLE-KB-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "new_syntactic_functional_node", "NEW-SYNTACTIC-FUNCTIONAL-NODE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "new_syntactic_choice_node", "NEW-SYNTACTIC-CHOICE-NODE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "kb_nodes_kill", "KB-NODES-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "kill_syntactic_node_tree", "KILL-SYNTACTIC-NODE-TREE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "with_new_syntactic_kb_node", "WITH-NEW-SYNTACTIC-KB-NODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "with_new_syntactic_kb_node_wXgafs", "WITH-NEW-SYNTACTIC-KB-NODE-W/GAFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "syntactic_option_node_p", "SYNTACTIC-OPTION-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "cb_link_syntactic_node_toolkit", "CB-LINK-SYNTACTIC-NODE-TOOLKIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "exclude_syntactic_option", "EXCLUDE-SYNTACTIC-OPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "restore_syntactic_option", "RESTORE-SYNTACTIC-OPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "asserting_treesP", "ASSERTING-TREES?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "while_saving_rtp_parse_into_kb", "WHILE-SAVING-RTP-PARSE-INTO-KB");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "save_rtp_kb_parse_if_desired", "SAVE-RTP-KB-PARSE-IF-DESIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "get_rtp_kb_parse_node", "GET-RTP-KB-PARSE-NODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "get_and_erase_rtp_kb_parse_node", "GET-AND-ERASE-RTP-KB-PARSE-NODE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "with_the_rtp_parse_tokenization", "WITH-THE-RTP-PARSE-TOKENIZATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_component_tokenization", "RTP-COMPONENT-TOKENIZATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_parse_exp", "RTP-PARSE-EXP", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_parse_exp_wXvpp", "RTP-PARSE-EXP-W/VPP", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_parse_wXvpp", "RTP-PARSE-W/VPP", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_sequel", "ITP-SEQUEL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "categorized_rtp_parse_exp", "CATEGORIZED-RTP-PARSE-EXP", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "categorized_itp_sequel", "CATEGORIZED-ITP-SEQUEL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "delete_duplicate_tp_results", "DELETE-DUPLICATE-TP-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_rewrite", "ITP-REWRITE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rewrites_only", "REWRITES-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rewrites_helper", "REWRITES-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_nuke_syntactic_nodes", "ITP-NUKE-SYNTACTIC-NODES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_print_function_trampoline", "ITP-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_p", "ITP-NODE-P", 1, 0, false);
        new $itp_node_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_id", "ITP-NODE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_parent", "ITP-NODE-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_component", "ITP-NODE-COMPONENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_span", "ITP-NODE-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_new_parse", "ITP-NODE-NEW-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_assertion", "ITP-NODE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_children", "ITP-NODE-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_permutations", "ITP-NODE-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_syntactic_node", "ITP-NODE-SYNTACTIC-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_syntactic_choices", "ITP-NODE-SYNTACTIC-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_id", "_CSETF-ITP-NODE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_parent", "_CSETF-ITP-NODE-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_component", "_CSETF-ITP-NODE-COMPONENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_span", "_CSETF-ITP-NODE-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_new_parse", "_CSETF-ITP-NODE-NEW-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_assertion", "_CSETF-ITP-NODE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_children", "_CSETF-ITP-NODE-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_permutations", "_CSETF-ITP-NODE-PERMUTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_syntactic_node", "_CSETF-ITP-NODE-SYNTACTIC-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_node_syntactic_choices", "_CSETF-ITP-NODE-SYNTACTIC-CHOICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "make_itp_node", "MAKE-ITP-NODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "visit_defstruct_itp_node", "VISIT-DEFSTRUCT-ITP-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "visit_defstruct_object_itp_node_method", "VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "print_itp_node", "PRINT-ITP-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "construct_itp_node", "CONSTRUCT-ITP-NODE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "add_itp_node_child", "ADD-ITP-NODE-CHILD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_create_initial_head", "ITP-NODE-CREATE-INITIAL-HEAD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_get_legitimate_children", "ITP-NODE-GET-LEGITIMATE-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_get_dominance_gafs", "ITP-NODE-GET-DOMINANCE-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_clear_syntactic_choices", "ITP-NODE-CLEAR-SYNTACTIC-CHOICES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_initialize_syntactic_choices", "ITP-NODE-INITIALIZE-SYNTACTIC-CHOICES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_choice_node_for_component", "ITP-CHOICE-NODE-FOR-COMPONENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_find_or_initialize_syntactic_choices", "ITP-NODE-FIND-OR-INITIALIZE-SYNTACTIC-CHOICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_tokenization", "ITP-NODE-TOKENIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_equalP", "ITP-NODE-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "find_or_create_itp_node_syntactic_node", "FIND-OR-CREATE-ITP-NODE-SYNTACTIC-NODE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_print_function_trampoline", "ITP-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_p", "ITP-STATE-P", 1, 0, false);
        new $itp_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_sequence", "ITP-STATE-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_complete_parses_only", "ITP-STATE-COMPLETE-PARSES-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_work_set", "ITP-STATE-WORK-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_solution_set", "ITP-STATE-SOLUTION-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_sentence", "ITP-STATE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_category", "ITP-STATE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_cache", "ITP-STATE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_psp_charts", "ITP-STATE-PSP-CHARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_state_working_mt", "ITP-STATE-WORKING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_sequence", "_CSETF-ITP-STATE-SEQUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_complete_parses_only", "_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_work_set", "_CSETF-ITP-STATE-WORK-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_solution_set", "_CSETF-ITP-STATE-SOLUTION-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_sentence", "_CSETF-ITP-STATE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_category", "_CSETF-ITP-STATE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_cache", "_CSETF-ITP-STATE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_psp_charts", "_CSETF-ITP-STATE-PSP-CHARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "_csetf_itp_state_working_mt", "_CSETF-ITP-STATE-WORKING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "make_itp_state", "MAKE-ITP-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "visit_defstruct_itp_state", "VISIT-DEFSTRUCT-ITP-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "visit_defstruct_object_itp_state_method", "VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "print_itp_state", "PRINT-ITP-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "new_itp_state", "NEW-ITP-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "destroy_itp_state", "DESTROY-ITP-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "new_itp_state_psp_chart_dictionary_internal", "NEW-ITP-STATE-PSP-CHART-DICTIONARY-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "new_itp_state_psp_chart_dictionary", "NEW-ITP-STATE-PSP-CHART-DICTIONARY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "add_to_itp_solution", "ADD-TO-ITP-SOLUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "memoize_itp_attempt", "MEMOIZE-ITP-ATTEMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "is_a_known_itp_attemptP", "IS-A-KNOWN-ITP-ATTEMPT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "prime_itp_pump", "PRIME-ITP-PUMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "extend_itp_state", "EXTEND-ITP-STATE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "extend_itp_state_multiple", "EXTEND-ITP-STATE-MULTIPLE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "extend_itp_state_by_ps_parse", "EXTEND-ITP-STATE-BY-PS-PARSE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "expand_itp_state", "EXPAND-ITP-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "appropriate_span_for_np_parsingP", "APPROPRIATE-SPAN-FOR-NP-PARSING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "appropriate_span_for_vbar_parsingP", "APPROPRIATE-SPAN-FOR-VBAR-PARSING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "appropriate_span_for_nbar_parsingP", "APPROPRIATE-SPAN-FOR-NBAR-PARSING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_ps_get_cycls_for_phrase_internal", "ITP-PS-GET-CYCLS-FOR-PHRASE-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_ps_get_cycls_for_phrase", "ITP-PS-GET-CYCLS-FOR-PHRASE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_ps_parse_vbar_internal", "ITP-PS-PARSE-VBAR-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_ps_parse_vbar", "ITP-PS-PARSE-VBAR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_find_or_create_appropriate_chart", "ITP-FIND-OR-CREATE-APPROPRIATE-CHART", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "get_chart_from_extra_psp_charts", "GET-CHART-FROM-EXTRA-PSP-CHARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_subspanP", "ITP-SUBSPAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "gap_type_for_category", "GAP-TYPE-FOR-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "pred_for_category", "PRED-FOR-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_cat_for_pred", "RTP-CAT-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_cat_for_pos", "RTP-CAT-FOR-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "pos_for_rtp_cat", "POS-FOR-RTP-CAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "best_rtp_cat_for_preds", "BEST-RTP-CAT-FOR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_verb_phrasal_template_categoryP", "CLEAR-VERB-PHRASAL-TEMPLATE-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_verb_phrasal_template_categoryP", "REMOVE-VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "verb_phrasal_template_categoryP_internal", "VERB-PHRASAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "verb_phrasal_template_categoryP", "VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_verbal_template_categoryP", "CLEAR-VERBAL-TEMPLATE-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_verbal_template_categoryP", "REMOVE-VERBAL-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "verbal_template_categoryP_internal", "VERBAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "verbal_template_categoryP", "VERBAL-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_vbar_template_categoryP", "CLEAR-VBAR-TEMPLATE-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_vbar_template_categoryP", "REMOVE-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "vbar_template_categoryP_internal", "VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "vbar_template_categoryP", "VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_rtp_vbar_template_categoryP", "CLEAR-RTP-VBAR-TEMPLATE-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_rtp_vbar_template_categoryP", "REMOVE-RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_vbar_template_categoryP_internal", "RTP-VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_vbar_template_categoryP", "RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "extended_vbar_template_categoryP", "EXTENDED-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_predicative_adjp_template_categoryP", "CLEAR-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_predicative_adjp_template_categoryP", "REMOVE-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "predicative_adjp_template_categoryP_internal", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "predicative_adjp_template_categoryP", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_nominal_categoryP", "CLEAR-NOMINAL-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_nominal_categoryP", "REMOVE-NOMINAL-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "nominal_categoryP_internal", "NOMINAL-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "nominal_categoryP", "NOMINAL-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "clear_adjectival_categoryP", "CLEAR-ADJECTIVAL-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "remove_adjectival_categoryP", "REMOVE-ADJECTIVAL-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "adjectival_categoryP_internal", "ADJECTIVAL-CATEGORY?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "adjectival_categoryP", "ADJECTIVAL-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "number_template_categoryP", "NUMBER-TEMPLATE-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "verbal_categoryP", "VERBAL-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "expand_itp_state_completely", "EXPAND-ITP-STATE-COMPLETELY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_node_max_child_span_length", "ITP-NODE-MAX-CHILD-SPAN-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "itp_output_sorting_function", "ITP-OUTPUT-SORTING-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "compute_correct_span", "COMPUTE-CORRECT-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "adjust_the_spans", "ADJUST-THE-SPANS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "is_this_a_thelist_spanP", "IS-THIS-A-THELIST-SPAN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "is_this_a_numeric_spanP", "IS-THIS-A-NUMERIC-SPAN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "dependent_span_coverage", "DEPENDENT-SPAN-COVERAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "initial_span_gap", "INITIAL-SPAN-GAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "full_span_coverageP", "FULL-SPAN-COVERAGE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "get_ternary_quant_fns", "GET-TERNARY-QUANT-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "is_this_a_quant_fnP", "IS-THIS-A-QUANT-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "surrogate_multi_word_componentP", "SURROGATE-MULTI-WORD-COMPONENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "reify_itp", "REIFY-ITP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "reify_itp_int", "REIFY-ITP-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "cat_itp", "CAT-ITP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "transform_nl_quant_forms", "TRANSFORM-NL-QUANT-FORMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "nl_attr_w_locationP", "NL-ATTR-W-LOCATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "sort_itp_results", "SORT-ITP-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_contains_invalid_surrogateP", "RTP-CONTAINS-INVALID-SURROGATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "unassembled_phraseP", "UNASSEMBLED-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "transform_assemble_phrases", "TRANSFORM-ASSEMBLE-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "perform_solution_node_analysis", "PERFORM-SOLUTION-NODE-ANALYSIS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "rtp_sort_constit_parses", "RTP-SORT-CONSTIT-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "merge_parse_results", "MERGE-PARSE-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "find_differences", "FIND-DIFFERENCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "build_return_format", "BUILD-RETURN-FORMAT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "cat_for_result", "CAT-FOR-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "force_for_result", "FORCE-FOR-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "tp_do_substitutions", "TP-DO-SUBSTITUTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "tp_do_substitutions_int", "TP-DO-SUBSTITUTIONS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "tp_substitutable_formulaP", "TP-SUBSTITUTABLE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "substitutable_child_nodeP", "SUBSTITUTABLE-CHILD-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "substitutable_child_formulaP", "SUBSTITUTABLE-CHILD-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "enqueue_solution_roots", "ENQUEUE-SOLUTION-ROOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "join_template_components_p", "JOIN-TEMPLATE-COMPONENTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "join_template_components_node_p", "JOIN-TEMPLATE-COMPONENTS-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "join_template_components_word_list", "JOIN-TEMPLATE-COMPONENTS-WORD-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "join_template_components_node_word_list", "JOIN-TEMPLATE-COMPONENTS-NODE-WORD-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "has_join_template_componentsP", "HAS-JOIN-TEMPLATE-COMPONENTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "has_substitutable_childrenP", "HAS-SUBSTITUTABLE-CHILDREN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "partial_parse_filter_function", "PARTIAL-PARSE-FILTER-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.iterative_template_parser", "partial_parsesP", "PARTIAL-PARSES?", 1, 0, false);
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    public static SubLObject init_iterative_template_parser_file() {
        iterative_template_parser.$kb_node_gathering_modeP$ = SubLFiles.defparameter("*KB-NODE-GATHERING-MODE?*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$kb_node_reify_as_functionsP$ = SubLFiles.defparameter("*KB-NODE-REIFY-AS-FUNCTIONS?*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$kb_node_internal_counter$ = SubLFiles.defparameter("*KB-NODE-INTERNAL-COUNTER*", (SubLObject)iterative_template_parser.ZERO_INTEGER);
        iterative_template_parser.$last_itp_state_created$ = SubLFiles.defparameter("*LAST-ITP-STATE-CREATED*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_graphing_filter$ = SubLFiles.defparameter("*RTP-GRAPHING-FILTER*", (SubLObject)iterative_template_parser.$kw99$RTP);
        iterative_template_parser.$rtp_trace_aggressivelyP$ = SubLFiles.defparameter("*RTP-TRACE-AGGRESSIVELY?*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_kb_parse_mt$ = SubLFiles.defparameter("*RTP-KB-PARSE-MT*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_exhaustive_kb_parseP$ = SubLFiles.defparameter("*RTP-EXHAUSTIVE-KB-PARSE?*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_reify_doomed_parsesP$ = SubLFiles.defparameter("*RTP-REIFY-DOOMED-PARSES?*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_latest_kb_parse_tree$ = SubLFiles.defparameter("*RTP-LATEST-KB-PARSE-TREE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_component_tokenizations$ = SubLFiles.deflexical("*RTP-COMPONENT-TOKENIZATIONS*", maybeDefault((SubLObject)iterative_template_parser.$sym102$_RTP_COMPONENT_TOKENIZATIONS_, iterative_template_parser.$rtp_component_tokenizations$, ()->(dictionary.new_dictionary((SubLObject)iterative_template_parser.EQUAL, (SubLObject)iterative_template_parser.UNPROVIDED))));
        iterative_template_parser.$rtp_relevant_tokenization$ = SubLFiles.defparameter("*RTP-RELEVANT-TOKENIZATION*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$dtp_itp_node$ = SubLFiles.defconstant("*DTP-ITP-NODE*", (SubLObject)iterative_template_parser.$sym123$ITP_NODE);
        iterative_template_parser.$dtp_itp_state$ = SubLFiles.defconstant("*DTP-ITP-STATE*", (SubLObject)iterative_template_parser.$sym190$ITP_STATE);
        iterative_template_parser.$extend_itp_state_analyze_assertionP$ = SubLFiles.defparameter("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$npparse_graph_type$ = SubLFiles.defparameter("*NPPARSE-GRAPH-TYPE*", (SubLObject)iterative_template_parser.$str233$R);
        iterative_template_parser.$trace_itp_state_expansion$ = SubLFiles.defparameter("*TRACE-ITP-STATE-EXPANSION*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$possible_nps$ = SubLFiles.defparameter("*POSSIBLE-NPS*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$ = SubLFiles.deflexical("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$verbal_template_categoryP_caching_state$ = SubLFiles.deflexical("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$vbar_template_categoryP_caching_state$ = SubLFiles.deflexical("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$ = SubLFiles.deflexical("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$ = SubLFiles.deflexical("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$nominal_categoryP_caching_state$ = SubLFiles.deflexical("*NOMINAL-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$adjectival_categoryP_caching_state$ = SubLFiles.deflexical("*ADJECTIVAL-CATEGORY?-CACHING-STATE*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$compute_top_level_form_only$ = SubLFiles.defparameter("*COMPUTE-TOP-LEVEL-FORM-ONLY*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$compute_all_resolvable_expansions$ = SubLFiles.defparameter("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$inform_about_pruned_templates$ = SubLFiles.deflexical("*INFORM-ABOUT-PRUNED-TEMPLATES*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$set_of_attempted_subparses$ = SubLFiles.defparameter("*SET-OF-ATTEMPTED-SUBPARSES*", (SubLObject)iterative_template_parser.NIL);
        iterative_template_parser.$ternary_quant_fns$ = SubLFiles.deflexical("*TERNARY-QUANT-FNS*", (SubLObject)iterative_template_parser.NIL);
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    public static SubLObject setup_iterative_template_parser_file() {
        cb_utilities.setup_cb_link_method((SubLObject)iterative_template_parser.$kw94$SYNTACTIC_NODE_TOOLKIT, (SubLObject)iterative_template_parser.$sym95$CB_LINK_SYNTACTIC_NODE_TOOLKIT, (SubLObject)iterative_template_parser.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)iterative_template_parser.$sym96$EXCLUDE_SYNTACTIC_OPTION, (SubLObject)iterative_template_parser.$kw97$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)iterative_template_parser.$sym98$RESTORE_SYNTACTIC_OPTION, (SubLObject)iterative_template_parser.$kw97$HTML_HANDLER);
        subl_macro_promotions.declare_defglobal((SubLObject)iterative_template_parser.$sym102$_RTP_COMPONENT_TOKENIZATIONS_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_node$.getGlobalValue(), Symbols.symbol_function((SubLObject)iterative_template_parser.$sym130$ITP_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)iterative_template_parser.$list131);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym132$ITP_NODE_ID, (SubLObject)iterative_template_parser.$sym133$_CSETF_ITP_NODE_ID);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym134$ITP_NODE_PARENT, (SubLObject)iterative_template_parser.$sym135$_CSETF_ITP_NODE_PARENT);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym136$ITP_NODE_COMPONENT, (SubLObject)iterative_template_parser.$sym137$_CSETF_ITP_NODE_COMPONENT);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym138$ITP_NODE_SPAN, (SubLObject)iterative_template_parser.$sym139$_CSETF_ITP_NODE_SPAN);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym140$ITP_NODE_NEW_PARSE, (SubLObject)iterative_template_parser.$sym141$_CSETF_ITP_NODE_NEW_PARSE);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym142$ITP_NODE_ASSERTION, (SubLObject)iterative_template_parser.$sym143$_CSETF_ITP_NODE_ASSERTION);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym144$ITP_NODE_CHILDREN, (SubLObject)iterative_template_parser.$sym145$_CSETF_ITP_NODE_CHILDREN);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym146$ITP_NODE_PERMUTATIONS, (SubLObject)iterative_template_parser.$sym147$_CSETF_ITP_NODE_PERMUTATIONS);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym148$ITP_NODE_SYNTACTIC_NODE, (SubLObject)iterative_template_parser.$sym149$_CSETF_ITP_NODE_SYNTACTIC_NODE);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym150$ITP_NODE_SYNTACTIC_CHOICES, (SubLObject)iterative_template_parser.$sym151$_CSETF_ITP_NODE_SYNTACTIC_CHOICES);
        Equality.identity((SubLObject)iterative_template_parser.$sym123$ITP_NODE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_node$.getGlobalValue(), Symbols.symbol_function((SubLObject)iterative_template_parser.$sym166$VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)iterative_template_parser.$sym197$ITP_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)iterative_template_parser.$list198);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym199$ITP_STATE_SEQUENCE, (SubLObject)iterative_template_parser.$sym200$_CSETF_ITP_STATE_SEQUENCE);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym201$ITP_STATE_COMPLETE_PARSES_ONLY, (SubLObject)iterative_template_parser.$sym202$_CSETF_ITP_STATE_COMPLETE_PARSES_ONLY);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym203$ITP_STATE_WORK_SET, (SubLObject)iterative_template_parser.$sym204$_CSETF_ITP_STATE_WORK_SET);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym205$ITP_STATE_SOLUTION_SET, (SubLObject)iterative_template_parser.$sym206$_CSETF_ITP_STATE_SOLUTION_SET);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym207$ITP_STATE_SENTENCE, (SubLObject)iterative_template_parser.$sym208$_CSETF_ITP_STATE_SENTENCE);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym209$ITP_STATE_CATEGORY, (SubLObject)iterative_template_parser.$sym210$_CSETF_ITP_STATE_CATEGORY);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym211$ITP_STATE_CACHE, (SubLObject)iterative_template_parser.$sym212$_CSETF_ITP_STATE_CACHE);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym213$ITP_STATE_PSP_CHARTS, (SubLObject)iterative_template_parser.$sym214$_CSETF_ITP_STATE_PSP_CHARTS);
        Structures.def_csetf((SubLObject)iterative_template_parser.$sym215$ITP_STATE_WORKING_MT, (SubLObject)iterative_template_parser.$sym216$_CSETF_ITP_STATE_WORKING_MT);
        Equality.identity((SubLObject)iterative_template_parser.$sym190$ITP_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iterative_template_parser.$dtp_itp_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)iterative_template_parser.$sym226$VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD));
        memoization_state.note_memoized_function((SubLObject)iterative_template_parser.$sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY);
        memoization_state.note_memoized_function((SubLObject)iterative_template_parser.$sym242$ITP_PS_GET_CYCLS_FOR_PHRASE);
        memoization_state.note_memoized_function((SubLObject)iterative_template_parser.$sym243$ITP_PS_PARSE_VBAR);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym257$VERBAL_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym259$VBAR_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym262$RTP_VBAR_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym269$NOMINAL_CATEGORY_);
        memoization_state.note_globally_cached_function((SubLObject)iterative_template_parser.$sym271$ADJECTIVAL_CATEGORY_);
        return (SubLObject)iterative_template_parser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_iterative_template_parser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_iterative_template_parser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_iterative_template_parser_file();
    }
    
    static {
        me = (SubLFile)new iterative_template_parser();
        iterative_template_parser.$kb_node_gathering_modeP$ = null;
        iterative_template_parser.$kb_node_reify_as_functionsP$ = null;
        iterative_template_parser.$kb_node_internal_counter$ = null;
        iterative_template_parser.$last_itp_state_created$ = null;
        iterative_template_parser.$rtp_graphing_filter$ = null;
        iterative_template_parser.$rtp_trace_aggressivelyP$ = null;
        iterative_template_parser.$rtp_kb_parse_mt$ = null;
        iterative_template_parser.$rtp_exhaustive_kb_parseP$ = null;
        iterative_template_parser.$rtp_reify_doomed_parsesP$ = null;
        iterative_template_parser.$rtp_latest_kb_parse_tree$ = null;
        iterative_template_parser.$rtp_component_tokenizations$ = null;
        iterative_template_parser.$rtp_relevant_tokenization$ = null;
        iterative_template_parser.$dtp_itp_node$ = null;
        iterative_template_parser.$dtp_itp_state$ = null;
        iterative_template_parser.$extend_itp_state_analyze_assertionP$ = null;
        iterative_template_parser.$npparse_graph_type$ = null;
        iterative_template_parser.$trace_itp_state_expansion$ = null;
        iterative_template_parser.$possible_nps$ = null;
        iterative_template_parser.$verb_phrasal_template_categoryP_caching_state$ = null;
        iterative_template_parser.$verbal_template_categoryP_caching_state$ = null;
        iterative_template_parser.$vbar_template_categoryP_caching_state$ = null;
        iterative_template_parser.$rtp_vbar_template_categoryP_caching_state$ = null;
        iterative_template_parser.$predicative_adjp_template_categoryP_caching_state$ = null;
        iterative_template_parser.$nominal_categoryP_caching_state$ = null;
        iterative_template_parser.$adjectival_categoryP_caching_state$ = null;
        iterative_template_parser.$compute_top_level_form_only$ = null;
        iterative_template_parser.$compute_all_resolvable_expansions$ = null;
        iterative_template_parser.$inform_about_pruned_templates$ = null;
        iterative_template_parser.$set_of_attempted_subparses$ = null;
        iterative_template_parser.$ternary_quant_fns$ = null;
        $const0$SyntacticNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticNode"));
        $sym1$_CAT = SubLObjectFactory.makeSymbol("?CAT");
        $const2$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $const3$syntacticNodeCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCategory"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CAT"));
        $const5$ParsingTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParsingTemplateCategory"));
        $const6$TemplateParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateParsingMt"));
        $sym7$_TYPE = SubLObjectFactory.makeSymbol("?TYPE");
        $const8$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const9$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TEMPLATE-TYPE"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nlPhraseTypeForTemplateCategory")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?TEMPLATE-TYPE")));
        $const12$RKFParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt"));
        $sym13$_NODE = SubLObjectFactory.makeSymbol("?NODE");
        $const14$NLPhraseType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPhraseType"));
        $const15$NLWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $str16$Node__A__D = SubLObjectFactory.makeString("Node-~A-~D");
        $const17$NLPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPhrase"));
        $sym18$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LINGUISTIC-CATEGORY"));
        $const20$SyntacticNode_MatrixClause = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticNode-MatrixClause"));
        $str21$Root = SubLObjectFactory.makeString("Root");
        $str22$Unrecognized = SubLObjectFactory.makeString("Unrecognized");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("CAT"));
        $str24$_A_A = SubLObjectFactory.makeString("~A~A");
        $const25$PhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn"));
        $str26$P = SubLObjectFactory.makeString("P");
        $str27$Bar = SubLObjectFactory.makeString("Bar");
        $str28$____creating_a__A_node__of_type__ = SubLObjectFactory.makeString("*** creating a ~A node, of type ~A and cat ~A");
        $const29$SententialConstituentType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialConstituentType"));
        $const30$SyntacticChoiceNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticChoiceNode"));
        $str31$Choice = SubLObjectFactory.makeString("Choice");
        $const32$optionNodes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("optionNodes"));
        $const33$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw34$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw35$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw36$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw38$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str39$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym40$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw41$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str42$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw43$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str44$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str45$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str46$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str48$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const49$CycParseTree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycParseTree"));
        $const50$CycTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycTokenization"));
        $const51$CycParsingToken = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycParsingToken"));
        $sym52$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const53$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const54$syntacticDescendants = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticDescendants"));
        $kw55$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRecursiveTemplateParser")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("CHOICE"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"));
        $kw58$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw59$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw60$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $kw61$CHOICE = SubLObjectFactory.makeKeyword("CHOICE");
        $kw62$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
        $const63$CycRecursiveTemplateParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRecursiveTemplateParser"));
        $sym64$CHOICE_CAT = SubLObjectFactory.makeUninternedSymbol("CHOICE-CAT");
        $sym65$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym66$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym67$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym68$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym69$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticChoiceNode")));
        $sym71$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym72$NEW_SYNTACTIC_CHOICE_NODE = SubLObjectFactory.makeSymbol("NEW-SYNTACTIC-CHOICE-NODE");
        $sym73$NEW_SYNTACTIC_FUNCTIONAL_NODE = SubLObjectFactory.makeSymbol("NEW-SYNTACTIC-FUNCTIONAL-NODE");
        $sym74$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym75$FI_ASSERT_INT = SubLObjectFactory.makeSymbol("FI-ASSERT-INT");
        $sym76$LIST = SubLObjectFactory.makeSymbol("LIST");
        $const77$syntacticNodeCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCreator"));
        $const78$InstanceWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationFromFn"));
        $const79$ProgramCopyFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProgramCopyFn"));
        $list80 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfIBT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc")));
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NODE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("NEW-GAFS"), SubLObjectFactory.makeSymbol("OLD-GAFS"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("CATEGORY"), SubLObjectFactory.makeSymbol("OPTIONS"), SubLObjectFactory.makeSymbol("CHOICE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRecursiveTemplateParser"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym82$TEST_GAF = SubLObjectFactory.makeUninternedSymbol("TEST-GAF");
        $sym83$CHOICE_CAT = SubLObjectFactory.makeUninternedSymbol("CHOICE-CAT");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-NODE-GATHERING-MODE?*"), (SubLObject)iterative_template_parser.T);
        $sym85$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym86$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym87$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $const88$excludedOptionNodes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("excludedOptionNodes"));
        $kw89$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str90$restore_syntactic_option__A = SubLObjectFactory.makeString("restore-syntactic-option&~A");
        $str91$_Restore_Syntactic_Option_ = SubLObjectFactory.makeString("[Restore Syntactic Option]");
        $str92$exclude_syntactic_option__A = SubLObjectFactory.makeString("exclude-syntactic-option&~A");
        $str93$_Exclude_Syntactic_Option_ = SubLObjectFactory.makeString("[Exclude Syntactic Option]");
        $kw94$SYNTACTIC_NODE_TOOLKIT = SubLObjectFactory.makeKeyword("SYNTACTIC-NODE-TOOLKIT");
        $sym95$CB_LINK_SYNTACTIC_NODE_TOOLKIT = SubLObjectFactory.makeSymbol("CB-LINK-SYNTACTIC-NODE-TOOLKIT");
        $sym96$EXCLUDE_SYNTACTIC_OPTION = SubLObjectFactory.makeSymbol("EXCLUDE-SYNTACTIC-OPTION");
        $kw97$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym98$RESTORE_SYNTACTIC_OPTION = SubLObjectFactory.makeSymbol("RESTORE-SYNTACTIC-OPTION");
        $kw99$RTP = SubLObjectFactory.makeKeyword("RTP");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RTP-LATEST-KB-PARSE-TREE*"), (SubLObject)SubLObjectFactory.makeKeyword("SAVE")));
        $kw101$SAVE = SubLObjectFactory.makeKeyword("SAVE");
        $sym102$_RTP_COMPONENT_TOKENIZATIONS_ = SubLObjectFactory.makeSymbol("*RTP-COMPONENT-TOKENIZATIONS*");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAVE-HERE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym104$WITH_PARSE_TOKENIZATION = SubLObjectFactory.makeSymbol("WITH-PARSE-TOKENIZATION");
        $sym105$_RTP_RELEVANT_TOKENIZATION_ = SubLObjectFactory.makeSymbol("*RTP-RELEVANT-TOKENIZATION*");
        $kw106$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
        $sym107$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTING-TREES?"));
        $sym109$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym110$SETTING_PARSE_ROOT_NODE = SubLObjectFactory.makeSymbol("SETTING-PARSE-ROOT-NODE");
        $const111$tokenizationInputString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenizationInputString"));
        $const112$tokenString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenString"));
        $const113$nthTokenInTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthTokenInTokenization"));
        $const114$numberOfTokensInTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberOfTokensInTokenization"));
        $const115$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $const116$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym117$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str118$_S_is_not_a_template_category__ = SubLObjectFactory.makeString("~S is not a template category~%");
        $const119$parseTreeOfTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parseTreeOfTokenization"));
        $kw120$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $const121$RewriteSequenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RewriteSequenceFn"));
        $const122$ToyParseTreeMt_FullSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ToyParseTreeMt-FullSentences"));
        $sym123$ITP_NODE = SubLObjectFactory.makeSymbol("ITP-NODE");
        $sym124$ITP_NODE_P = SubLObjectFactory.makeSymbol("ITP-NODE-P");
        $list125 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("PARENT"), SubLObjectFactory.makeSymbol("COMPONENT"), SubLObjectFactory.makeSymbol("SPAN"), SubLObjectFactory.makeSymbol("NEW-PARSE"), SubLObjectFactory.makeSymbol("ASSERTION"), SubLObjectFactory.makeSymbol("CHILDREN"), SubLObjectFactory.makeSymbol("PERMUTATIONS"), SubLObjectFactory.makeSymbol("SYNTACTIC-NODE"), SubLObjectFactory.makeSymbol("SYNTACTIC-CHOICES") });
        $list126 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("PARENT"), SubLObjectFactory.makeKeyword("COMPONENT"), SubLObjectFactory.makeKeyword("SPAN"), SubLObjectFactory.makeKeyword("NEW-PARSE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("CHILDREN"), SubLObjectFactory.makeKeyword("PERMUTATIONS"), SubLObjectFactory.makeKeyword("SYNTACTIC-NODE"), SubLObjectFactory.makeKeyword("SYNTACTIC-CHOICES") });
        $list127 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ITP-NODE-ID"), SubLObjectFactory.makeSymbol("ITP-NODE-PARENT"), SubLObjectFactory.makeSymbol("ITP-NODE-COMPONENT"), SubLObjectFactory.makeSymbol("ITP-NODE-SPAN"), SubLObjectFactory.makeSymbol("ITP-NODE-NEW-PARSE"), SubLObjectFactory.makeSymbol("ITP-NODE-ASSERTION"), SubLObjectFactory.makeSymbol("ITP-NODE-CHILDREN"), SubLObjectFactory.makeSymbol("ITP-NODE-PERMUTATIONS"), SubLObjectFactory.makeSymbol("ITP-NODE-SYNTACTIC-NODE"), SubLObjectFactory.makeSymbol("ITP-NODE-SYNTACTIC-CHOICES") });
        $list128 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-ID"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-PARENT"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-COMPONENT"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-SPAN"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-NEW-PARSE"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-ASSERTION"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-CHILDREN"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE"), SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES") });
        $sym129$PRINT_ITP_NODE = SubLObjectFactory.makeSymbol("PRINT-ITP-NODE");
        $sym130$ITP_NODE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ITP-NODE-PRINT-FUNCTION-TRAMPOLINE");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-NODE-P"));
        $sym132$ITP_NODE_ID = SubLObjectFactory.makeSymbol("ITP-NODE-ID");
        $sym133$_CSETF_ITP_NODE_ID = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-ID");
        $sym134$ITP_NODE_PARENT = SubLObjectFactory.makeSymbol("ITP-NODE-PARENT");
        $sym135$_CSETF_ITP_NODE_PARENT = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-PARENT");
        $sym136$ITP_NODE_COMPONENT = SubLObjectFactory.makeSymbol("ITP-NODE-COMPONENT");
        $sym137$_CSETF_ITP_NODE_COMPONENT = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-COMPONENT");
        $sym138$ITP_NODE_SPAN = SubLObjectFactory.makeSymbol("ITP-NODE-SPAN");
        $sym139$_CSETF_ITP_NODE_SPAN = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-SPAN");
        $sym140$ITP_NODE_NEW_PARSE = SubLObjectFactory.makeSymbol("ITP-NODE-NEW-PARSE");
        $sym141$_CSETF_ITP_NODE_NEW_PARSE = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-NEW-PARSE");
        $sym142$ITP_NODE_ASSERTION = SubLObjectFactory.makeSymbol("ITP-NODE-ASSERTION");
        $sym143$_CSETF_ITP_NODE_ASSERTION = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-ASSERTION");
        $sym144$ITP_NODE_CHILDREN = SubLObjectFactory.makeSymbol("ITP-NODE-CHILDREN");
        $sym145$_CSETF_ITP_NODE_CHILDREN = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-CHILDREN");
        $sym146$ITP_NODE_PERMUTATIONS = SubLObjectFactory.makeSymbol("ITP-NODE-PERMUTATIONS");
        $sym147$_CSETF_ITP_NODE_PERMUTATIONS = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS");
        $sym148$ITP_NODE_SYNTACTIC_NODE = SubLObjectFactory.makeSymbol("ITP-NODE-SYNTACTIC-NODE");
        $sym149$_CSETF_ITP_NODE_SYNTACTIC_NODE = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE");
        $sym150$ITP_NODE_SYNTACTIC_CHOICES = SubLObjectFactory.makeSymbol("ITP-NODE-SYNTACTIC-CHOICES");
        $sym151$_CSETF_ITP_NODE_SYNTACTIC_CHOICES = SubLObjectFactory.makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES");
        $kw152$ID = SubLObjectFactory.makeKeyword("ID");
        $kw153$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw154$COMPONENT = SubLObjectFactory.makeKeyword("COMPONENT");
        $kw155$SPAN = SubLObjectFactory.makeKeyword("SPAN");
        $kw156$NEW_PARSE = SubLObjectFactory.makeKeyword("NEW-PARSE");
        $kw157$CHILDREN = SubLObjectFactory.makeKeyword("CHILDREN");
        $kw158$PERMUTATIONS = SubLObjectFactory.makeKeyword("PERMUTATIONS");
        $kw159$SYNTACTIC_NODE = SubLObjectFactory.makeKeyword("SYNTACTIC-NODE");
        $kw160$SYNTACTIC_CHOICES = SubLObjectFactory.makeKeyword("SYNTACTIC-CHOICES");
        $str161$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw162$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym163$MAKE_ITP_NODE = SubLObjectFactory.makeSymbol("MAKE-ITP-NODE");
        $kw164$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw165$END = SubLObjectFactory.makeKeyword("END");
        $sym166$VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD");
        $str167$_ = SubLObjectFactory.makeString(" ");
        $str168$__ = SubLObjectFactory.makeString("~%");
        $sym169$PROPER_LIST_P = SubLObjectFactory.makeSymbol("PROPER-LIST-P");
        $const170$partOfIBT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfIBT"));
        $const171$Cyc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc"));
        $const172$NLFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLFunction"));
        $const173$NLTaggedTermDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTaggedTermDenotingFunction"));
        $const174$VPTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPTemplate"));
        $const175$TheRNPParse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheRNPParse"));
        $sym176$_VBAR = SubLObjectFactory.makeSymbol("?VBAR");
        $const177$memberOfList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $sym178$_CHILD = SubLObjectFactory.makeSymbol("?CHILD");
        $const179$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $list180 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticDaughters")), (SubLObject)SubLObjectFactory.makeSymbol("?VBAR"), (SubLObject)SubLObjectFactory.makeSymbol("?CHILD")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCategory")), (SubLObject)SubLObjectFactory.makeSymbol("?VBAR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")))));
        $sym181$_V = SubLObjectFactory.makeSymbol("?V");
        $const182$syntacticDaughters = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticDaughters"));
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?V"));
        $list184 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCategory")), (SubLObject)SubLObjectFactory.makeSymbol("?V"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))));
        $const185$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const186$syntacticNodeNthDaughter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeNthDaughter"));
        $list187 = ConsesLow.list((SubLObject)iterative_template_parser.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NODE"));
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCategory")), (SubLObject)SubLObjectFactory.makeSymbol("?NODE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))));
        $str189$____RTP_____Couldn_t_create_KB_no = SubLObjectFactory.makeString("*** RTP *** Couldn't create KB node for ~A in ~A");
        $sym190$ITP_STATE = SubLObjectFactory.makeSymbol("ITP-STATE");
        $sym191$ITP_STATE_P = SubLObjectFactory.makeSymbol("ITP-STATE-P");
        $list192 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SEQUENCE"), SubLObjectFactory.makeSymbol("COMPLETE-PARSES-ONLY"), SubLObjectFactory.makeSymbol("WORK-SET"), SubLObjectFactory.makeSymbol("SOLUTION-SET"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("CATEGORY"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("PSP-CHARTS"), SubLObjectFactory.makeSymbol("WORKING-MT") });
        $list193 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SEQUENCE"), SubLObjectFactory.makeKeyword("COMPLETE-PARSES-ONLY"), SubLObjectFactory.makeKeyword("WORK-SET"), SubLObjectFactory.makeKeyword("SOLUTION-SET"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("CATEGORY"), SubLObjectFactory.makeKeyword("CACHE"), SubLObjectFactory.makeKeyword("PSP-CHARTS"), SubLObjectFactory.makeKeyword("WORKING-MT") });
        $list194 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ITP-STATE-SEQUENCE"), SubLObjectFactory.makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY"), SubLObjectFactory.makeSymbol("ITP-STATE-WORK-SET"), SubLObjectFactory.makeSymbol("ITP-STATE-SOLUTION-SET"), SubLObjectFactory.makeSymbol("ITP-STATE-SENTENCE"), SubLObjectFactory.makeSymbol("ITP-STATE-CATEGORY"), SubLObjectFactory.makeSymbol("ITP-STATE-CACHE"), SubLObjectFactory.makeSymbol("ITP-STATE-PSP-CHARTS"), SubLObjectFactory.makeSymbol("ITP-STATE-WORKING-MT") });
        $list195 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-SEQUENCE"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-WORK-SET"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-CATEGORY"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS"), SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-WORKING-MT") });
        $sym196$PRINT_ITP_STATE = SubLObjectFactory.makeSymbol("PRINT-ITP-STATE");
        $sym197$ITP_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ITP-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-STATE-P"));
        $sym199$ITP_STATE_SEQUENCE = SubLObjectFactory.makeSymbol("ITP-STATE-SEQUENCE");
        $sym200$_CSETF_ITP_STATE_SEQUENCE = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-SEQUENCE");
        $sym201$ITP_STATE_COMPLETE_PARSES_ONLY = SubLObjectFactory.makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY");
        $sym202$_CSETF_ITP_STATE_COMPLETE_PARSES_ONLY = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY");
        $sym203$ITP_STATE_WORK_SET = SubLObjectFactory.makeSymbol("ITP-STATE-WORK-SET");
        $sym204$_CSETF_ITP_STATE_WORK_SET = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-WORK-SET");
        $sym205$ITP_STATE_SOLUTION_SET = SubLObjectFactory.makeSymbol("ITP-STATE-SOLUTION-SET");
        $sym206$_CSETF_ITP_STATE_SOLUTION_SET = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET");
        $sym207$ITP_STATE_SENTENCE = SubLObjectFactory.makeSymbol("ITP-STATE-SENTENCE");
        $sym208$_CSETF_ITP_STATE_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-SENTENCE");
        $sym209$ITP_STATE_CATEGORY = SubLObjectFactory.makeSymbol("ITP-STATE-CATEGORY");
        $sym210$_CSETF_ITP_STATE_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-CATEGORY");
        $sym211$ITP_STATE_CACHE = SubLObjectFactory.makeSymbol("ITP-STATE-CACHE");
        $sym212$_CSETF_ITP_STATE_CACHE = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-CACHE");
        $sym213$ITP_STATE_PSP_CHARTS = SubLObjectFactory.makeSymbol("ITP-STATE-PSP-CHARTS");
        $sym214$_CSETF_ITP_STATE_PSP_CHARTS = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS");
        $sym215$ITP_STATE_WORKING_MT = SubLObjectFactory.makeSymbol("ITP-STATE-WORKING-MT");
        $sym216$_CSETF_ITP_STATE_WORKING_MT = SubLObjectFactory.makeSymbol("_CSETF-ITP-STATE-WORKING-MT");
        $kw217$SEQUENCE = SubLObjectFactory.makeKeyword("SEQUENCE");
        $kw218$COMPLETE_PARSES_ONLY = SubLObjectFactory.makeKeyword("COMPLETE-PARSES-ONLY");
        $kw219$WORK_SET = SubLObjectFactory.makeKeyword("WORK-SET");
        $kw220$SOLUTION_SET = SubLObjectFactory.makeKeyword("SOLUTION-SET");
        $kw221$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw222$CACHE = SubLObjectFactory.makeKeyword("CACHE");
        $kw223$PSP_CHARTS = SubLObjectFactory.makeKeyword("PSP-CHARTS");
        $kw224$WORKING_MT = SubLObjectFactory.makeKeyword("WORKING-MT");
        $sym225$MAKE_ITP_STATE = SubLObjectFactory.makeSymbol("MAKE-ITP-STATE");
        $sym226$VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD");
        $str227$Work___D_Solution___D_KB_Mt___A = SubLObjectFactory.makeString("Work: ~D Solution: ~D KB Mt: ~A");
        $sym228$ITP_NODE_MAX_CHILD_SPAN_LENGTH = SubLObjectFactory.makeSymbol("ITP-NODE-MAX-CHILD-SPAN-LENGTH");
        $sym229$_ = SubLObjectFactory.makeSymbol(">");
        $kw230$DESTROYED = SubLObjectFactory.makeKeyword("DESTROYED");
        $sym231$NEW_ITP_STATE_PSP_CHART_DICTIONARY = SubLObjectFactory.makeSymbol("NEW-ITP-STATE-PSP-CHART-DICTIONARY");
        $const232$syntacticNodeString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeString"));
        $str233$R = SubLObjectFactory.makeString("R");
        $const234$proposedMeaning = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("proposedMeaning"));
        $const235$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $str236$Expanding_itp_node__A________S__ = SubLObjectFactory.makeString("Expanding itp-node ~A:~%    ~S~%");
        $const237$NBarTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NBarTemplate"));
        $list238 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $kw239$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const240$NPTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"));
        $const241$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $sym242$ITP_PS_GET_CYCLS_FOR_PHRASE = SubLObjectFactory.makeSymbol("ITP-PS-GET-CYCLS-FOR-PHRASE");
        $sym243$ITP_PS_PARSE_VBAR = SubLObjectFactory.makeSymbol("ITP-PS-PARSE-VBAR");
        $kw244$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str245$length_of_chart_for__S____S__ = SubLObjectFactory.makeString("length of chart for ~S = ~S~%");
        $const246$gapTypeForTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gapTypeForTemplateCategory"));
        $const247$posPredForTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posPredForTemplateCategory"));
        $str248$sent_a_weird_category___S__to_pre = SubLObjectFactory.makeString("sent a weird category (~S) to pred-for-category (the vp-parser)~%");
        $const249$verbStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"));
        $str250$sent_a_non_categorized_pred___S__ = SubLObjectFactory.makeString("sent a non-categorized pred (~S) to RTP-CAT-FOR-PRED~%");
        $const251$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const252$posForTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posForTemplateCategory"));
        $str253$sent_un_categorized_category__s_t = SubLObjectFactory.makeString("sent un-categorized category ~s to RTP-CAT-FOR-POS~%");
        $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("VERB-PHRASAL-TEMPLATE-CATEGORY?");
        $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*");
        $int256$64 = SubLObjectFactory.makeInteger(64);
        $sym257$VERBAL_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("VERBAL-TEMPLATE-CATEGORY?");
        $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*");
        $sym259$VBAR_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("VBAR-TEMPLATE-CATEGORY?");
        $const260$VBarTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VBarTemplate"));
        $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");
        $sym262$RTP_VBAR_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("RTP-VBAR-TEMPLATE-CATEGORY?");
        $const263$RTPVBarTemplateMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RTPVBarTemplateMt"));
        $const264$assertTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate-Reln"));
        $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");
        $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("PREDICATIVE-ADJP-TEMPLATE-CATEGORY?");
        $const267$AdjPTemplate_Predicative = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate-Predicative"));
        $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*");
        $sym269$NOMINAL_CATEGORY_ = SubLObjectFactory.makeSymbol("NOMINAL-CATEGORY?");
        $sym270$_NOMINAL_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NOMINAL-CATEGORY?-CACHING-STATE*");
        $sym271$ADJECTIVAL_CATEGORY_ = SubLObjectFactory.makeSymbol("ADJECTIVAL-CATEGORY?");
        $const272$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ADJECTIVAL-CATEGORY?-CACHING-STATE*");
        $list274 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumberTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrdinalTemplate")));
        $sym275$RESULT_OF_PARSING_SPAN_LENGTH = SubLObjectFactory.makeSymbol("RESULT-OF-PARSING-SPAN-LENGTH");
        $int276$100 = SubLObjectFactory.makeInteger(100);
        $sym277$IS_THIS_A_THELIST_SPAN_ = SubLObjectFactory.makeSymbol("IS-THIS-A-THELIST-SPAN?");
        $sym278$_ = SubLObjectFactory.makeSymbol("<");
        $sym279$_FUNC = SubLObjectFactory.makeSymbol("?FUNC");
        $list280 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTaggedTermDenotingFunction"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TernaryFunction"))));
        $sym281$MT_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("MT-IN-ANY-MT?");
        $const282$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $const283$ParseTreeSandboxMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParseTreeSandboxMt"));
        $const284$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str285$Couldn_t_find_a_parse_tree_mt_to_ = SubLObjectFactory.makeString("Couldn't find a parse-tree mt to be a genls of ~A -- some assertions may bomb out accordingly");
        $const286$SyntacticNode_Sentential = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticNode-Sentential"));
        $sym287$_N = SubLObjectFactory.makeSymbol("?N");
        $const288$dependentMeaning = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dependentMeaning"));
        $sym289$RESULT_OF_PARSING_FORMULA_ = SubLObjectFactory.makeSymbol("RESULT-OF-PARSING-FORMULA?");
        $list290 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPTemplate")));
        $list291 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-COMPONENT"), (SubLObject)SubLObjectFactory.makeSymbol("VP-COMPONENT"));
        $str292$____can_t_build_any_meaning_combi = SubLObjectFactory.makeString("*** can't build any meaning combinations for ~A");
        $list293 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VP-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("VP-MEANING"));
        $list294 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-MEANING"));
        $const295$TheSentenceSubject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSentenceSubject"));
        $kw296$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $sym297$NL_ATTR_W_LOCATION_ = SubLObjectFactory.makeSymbol("NL-ATTR-W-LOCATION?");
        $list298 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")));
        $sym299$ITP_OUTPUT_SORTING_FUNCTION = SubLObjectFactory.makeSymbol("ITP-OUTPUT-SORTING-FUNCTION");
        $sym300$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $const301$AssemblePhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssemblePhraseFn"));
        $sym302$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym303$UNASSEMBLED_PHRASE_ = SubLObjectFactory.makeSymbol("UNASSEMBLED-PHRASE?");
        $sym304$REWRITE_ASSEMBLE_PHRASE = SubLObjectFactory.makeSymbol("REWRITE-ASSEMBLE-PHRASE");
        $kw305$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $const306$termTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTemplate"));
        $list307 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPTemplate")));
        $const308$assertTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate"));
        $const309$termTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTemplate-Reln"));
        $const310$termTemplate_Test = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTemplate-Test"));
        $const311$assertTemplate_Test = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate-Test"));
        $const312$queryTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryTemplate"));
        $const313$queryTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryTemplate-Reln"));
        $const314$queryTemplate_Test = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryTemplate-Test"));
        $str315$sent__S_to_force_for_result__ = SubLObjectFactory.makeString("sent ~S to force-for-result~%");
        $list316 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuestionTemplate")));
        $const317$joinTemplateComponents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("joinTemplateComponents"));
        $kw318$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym319$SUBSTITUTABLE_CHILD_FORMULA_ = SubLObjectFactory.makeSymbol("SUBSTITUTABLE-CHILD-FORMULA?");
        $sym320$PARTIAL_PARSE_FILTER_FUNCTION = SubLObjectFactory.makeSymbol("PARTIAL-PARSE-FILTER-FUNCTION");
    }
    
    public static final class $itp_node_native extends SubLStructNative
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
        
        public $itp_node_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$component = (SubLObject)CommonSymbols.NIL;
            this.$span = (SubLObject)CommonSymbols.NIL;
            this.$new_parse = (SubLObject)CommonSymbols.NIL;
            this.$assertion = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
            this.$permutations = (SubLObject)CommonSymbols.NIL;
            this.$syntactic_node = (SubLObject)CommonSymbols.NIL;
            this.$syntactic_choices = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$itp_node_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$parent;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$component;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$span;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$new_parse;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$assertion;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$children;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$permutations;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$syntactic_node;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$syntactic_choices;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$parent = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$component = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$span = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$new_parse = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$assertion = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$children = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$permutations = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$syntactic_node = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$syntactic_choices = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$itp_node_native.class, iterative_template_parser.$sym123$ITP_NODE, iterative_template_parser.$sym124$ITP_NODE_P, iterative_template_parser.$list125, iterative_template_parser.$list126, new String[] { "$id", "$parent", "$component", "$span", "$new_parse", "$assertion", "$children", "$permutations", "$syntactic_node", "$syntactic_choices" }, iterative_template_parser.$list127, iterative_template_parser.$list128, iterative_template_parser.$sym129$PRINT_ITP_NODE);
        }
    }
    
    public static final class $itp_node_p$UnaryFunction extends UnaryFunction
    {
        public $itp_node_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITP-NODE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iterative_template_parser.itp_node_p(arg1);
        }
    }
    
    public static final class $itp_state_native extends SubLStructNative
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
        
        public $itp_state_native() {
            this.$sequence = (SubLObject)CommonSymbols.NIL;
            this.$complete_parses_only = (SubLObject)CommonSymbols.NIL;
            this.$work_set = (SubLObject)CommonSymbols.NIL;
            this.$solution_set = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$cache = (SubLObject)CommonSymbols.NIL;
            this.$psp_charts = (SubLObject)CommonSymbols.NIL;
            this.$working_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$itp_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$sequence;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$complete_parses_only;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$work_set;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$solution_set;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$sentence;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$category;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$cache;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$psp_charts;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$working_mt;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$sequence = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$complete_parses_only = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$work_set = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$solution_set = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$sentence = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$category = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$cache = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$psp_charts = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$working_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$itp_state_native.class, iterative_template_parser.$sym190$ITP_STATE, iterative_template_parser.$sym191$ITP_STATE_P, iterative_template_parser.$list192, iterative_template_parser.$list193, new String[] { "$sequence", "$complete_parses_only", "$work_set", "$solution_set", "$sentence", "$category", "$cache", "$psp_charts", "$working_mt" }, iterative_template_parser.$list194, iterative_template_parser.$list195, iterative_template_parser.$sym196$PRINT_ITP_STATE);
        }
    }
    
    public static final class $itp_state_p$UnaryFunction extends UnaryFunction
    {
        public $itp_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITP-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iterative_template_parser.itp_state_p(arg1);
        }
    }
}

/*

	Total time: 2927 ms
	 synthetic 
*/