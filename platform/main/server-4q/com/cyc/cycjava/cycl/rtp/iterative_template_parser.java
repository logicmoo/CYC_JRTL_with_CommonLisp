package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_node_native;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser.$itp_state_native;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class iterative_template_parser extends SubLTranslatedFile {
    public static final SubLFile me = new iterative_template_parser();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.iterative_template_parser";

    public static final String myFingerPrint = "a89e63379d6045ab04a38278dc15526839cd0fe47494f71a7d4957c80f2fc991";

    // defparameter
    // Definitions
    /**
     * If non-nil, only create nodes, with a basic (#$isa NODE WHATEVER), and return
     * lists of the things you would assert so they can be saved up for later
     */
    public static final SubLSymbol $kb_node_gathering_modeP$ = makeSymbol("*KB-NODE-GATHERING-MODE?*");

    // defparameter
    /**
     * If non-nil, new nodes will be #$CycSyntacticNodeFns, not simply
     * #$SyntacticNodes. @note this is just a stub at the moment
     */
    public static final SubLSymbol $kb_node_reify_as_functionsP$ = makeSymbol("*KB-NODE-REIFY-AS-FUNCTIONS?*");

    // defparameter
    private static final SubLSymbol $kb_node_internal_counter$ = makeSymbol("*KB-NODE-INTERNAL-COUNTER*");

    // defparameter
    private static final SubLSymbol $last_itp_state_created$ = makeSymbol("*LAST-ITP-STATE-CREATED*");

    // defparameter
    private static final SubLSymbol $rtp_graphing_filter$ = makeSymbol("*RTP-GRAPHING-FILTER*");

    // defparameter
    // force hordes of rtp-related debugging info to be printed to the console?
    public static final SubLSymbol $rtp_trace_aggressivelyP$ = makeSymbol("*RTP-TRACE-AGGRESSIVELY?*");

    // defparameter
    /**
     * If this is a microtheory, then build a tree of #$SyntacticNodes in this mt
     * while doing the parse
     */
    public static final SubLSymbol $rtp_kb_parse_mt$ = makeSymbol("*RTP-KB-PARSE-MT*");

    // defparameter
    /**
     * If t, create KB nodes at every step along the way, even for doomed
     * parses/spans. If nil, wait until the end on produce only useful stuff.
     */
    private static final SubLSymbol $rtp_exhaustive_kb_parseP$ = makeSymbol("*RTP-EXHAUSTIVE-KB-PARSE?*");

    // defparameter
    /**
     * If a parse is (heuristically) identified as doomed, assert
     * #$excludedOptionNodes if this is t, otherwise block it from the KB
     */
    public static final SubLSymbol $rtp_reify_doomed_parsesP$ = makeSymbol("*RTP-REIFY-DOOMED-PARSES?*");

    // defparameter
    /**
     * A global for storing the #$CycParseTree, if any, produced during the last
     * call to @see itp-sequel
     */
    public static final SubLSymbol $rtp_latest_kb_parse_tree$ = makeSymbol("*RTP-LATEST-KB-PARSE-TREE*");





    // defconstant
    public static final SubLSymbol $dtp_itp_node$ = makeSymbol("*DTP-ITP-NODE*");

    // defconstant
    public static final SubLSymbol $dtp_itp_state$ = makeSymbol("*DTP-ITP-STATE*");

    // defparameter
    private static final SubLSymbol $extend_itp_state_analyze_assertionP$ = makeSymbol("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*");

    // defparameter
    private static final SubLSymbol $npparse_graph_type$ = makeSymbol("*NPPARSE-GRAPH-TYPE*");

    // defparameter
    private static final SubLSymbol $trace_itp_state_expansion$ = makeSymbol("*TRACE-ITP-STATE-EXPANSION*");

    // defparameter
    // a list of strings that might be NPs, to be sent in externally
    public static final SubLSymbol $possible_nps$ = makeSymbol("*POSSIBLE-NPS*");

    // deflexical
    private static final SubLSymbol $verb_phrasal_template_categoryP_caching_state$ = makeSymbol("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $verbal_template_categoryP_caching_state$ = makeSymbol("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $vbar_template_categoryP_caching_state$ = makeSymbol("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $rtp_vbar_template_categoryP_caching_state$ = makeSymbol("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $predicative_adjp_template_categoryP_caching_state$ = makeSymbol("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $nominal_categoryP_caching_state$ = makeSymbol("*NOMINAL-CATEGORY?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $adjectival_categoryP_caching_state$ = makeSymbol("*ADJECTIVAL-CATEGORY?-CACHING-STATE*");

    // defparameter
    /**
     * Do not even attempt to compute beyond the first level parse. Makes it
     * equivalent to template-parse only.
     */
    private static final SubLSymbol $compute_top_level_form_only$ = makeSymbol("*COMPUTE-TOP-LEVEL-FORM-ONLY*");

    // defparameter
    /**
     * When T, expand even those items that could be left as resolvable by other
     * harvesting methods, i.e. NPTemplate, NumberTemplates, etc.
     */
    private static final SubLSymbol $compute_all_resolvable_expansions$ = makeSymbol("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*");

    // deflexical
    private static final SubLSymbol $inform_about_pruned_templates$ = makeSymbol("*INFORM-ABOUT-PRUNED-TEMPLATES*");

    // defparameter
    private static final SubLSymbol $set_of_attempted_subparses$ = makeSymbol("*SET-OF-ATTEMPTED-SUBPARSES*");

    // deflexical
    /**
     * The ternary NL quantification functions. Derived from the KB; presently just
     * '(#$NLQuantFn-3 #$NLDefinitenessFn-3)
     */
    private static final SubLSymbol $ternary_quant_fns$ = makeSymbol("*TERNARY-QUANT-FNS*");

    private static final SubLObject $$SyntacticNode = reader_make_constant_shell(makeString("SyntacticNode"));

    public static final SubLSymbol $sym1$_CAT = makeSymbol("?CAT");

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLObject $$syntacticNodeCategory = reader_make_constant_shell(makeString("syntacticNodeCategory"));

    public static final SubLList $list4 = list(makeSymbol("?CAT"));

    private static final SubLObject $$ParsingTemplateCategory = reader_make_constant_shell(makeString("ParsingTemplateCategory"));

    private static final SubLObject $$TemplateParsingMt = reader_make_constant_shell(makeString("TemplateParsingMt"));

    public static final SubLSymbol $sym7$_TYPE = makeSymbol("?TYPE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLList $list10 = list(makeSymbol("?TEMPLATE-TYPE"));

    public static final SubLList $list11 = list(list(reader_make_constant_shell(makeString("nlPhraseTypeForTemplateCategory")), makeSymbol("?TYPE"), makeSymbol("?TEMPLATE-TYPE")));

    private static final SubLObject $$RKFParsingMt = reader_make_constant_shell(makeString("RKFParsingMt"));

    public static final SubLSymbol $sym13$_NODE = makeSymbol("?NODE");

    private static final SubLObject $$NLPhraseType = reader_make_constant_shell(makeString("NLPhraseType"));

    private static final SubLObject $$NLWordForm = reader_make_constant_shell(makeString("NLWordForm"));

    public static final SubLString $str16$Node__A__D = makeString("Node-~A-~D");

    private static final SubLObject $$NLPhrase = reader_make_constant_shell(makeString("NLPhrase"));



    public static final SubLList $list19 = list(makeSymbol("NODE-TYPE"), makeSymbol("LINGUISTIC-CATEGORY"));

    private static final SubLObject $$SyntacticNode_MatrixClause = reader_make_constant_shell(makeString("SyntacticNode-MatrixClause"));

    public static final SubLString $$$Root = makeString("Root");

    public static final SubLString $$$Unrecognized = makeString("Unrecognized");

    public static final SubLList $list23 = list(makeSymbol("FUNC"), makeSymbol("CAT"));

    public static final SubLString $str24$_A_A = makeString("~A~A");

    private static final SubLObject $$PhraseFn = reader_make_constant_shell(makeString("PhraseFn"));

    public static final SubLString $$$P = makeString("P");

    public static final SubLString $$$Bar = makeString("Bar");

    public static final SubLString $str28$____creating_a__A_node__of_type__ = makeString("*** creating a ~A node, of type ~A and cat ~A");

    private static final SubLObject $$SententialConstituentType = reader_make_constant_shell(makeString("SententialConstituentType"));

    private static final SubLObject $$SyntacticChoiceNode = reader_make_constant_shell(makeString("SyntacticChoiceNode"));

    public static final SubLString $$$Choice = makeString("Choice");

    private static final SubLObject $$optionNodes = reader_make_constant_shell(makeString("optionNodes"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));











    public static final SubLString $str39$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str45$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str46$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list47 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str48$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$CycParseTree = reader_make_constant_shell(makeString("CycParseTree"));

    private static final SubLObject $$CycTokenization = reader_make_constant_shell(makeString("CycTokenization"));

    private static final SubLObject $$CycParsingToken = reader_make_constant_shell(makeString("CycParsingToken"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$syntacticDescendants = reader_make_constant_shell(makeString("syntacticDescendants"));



    public static final SubLList $list56 = list(list(makeSymbol("NODE"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("CATEGORY"), makeSymbol("OPTIONS"), makeSymbol("CHOICE"), list(makeSymbol("SOURCE"), reader_make_constant_shell(makeString("CycRecursiveTemplateParser")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list57 = list(makeKeyword("CATEGORY"), makeKeyword("OPTIONS"), makeKeyword("CHOICE"), makeKeyword("SOURCE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLObject $$CycRecursiveTemplateParser = reader_make_constant_shell(makeString("CycRecursiveTemplateParser"));

    private static final SubLSymbol $sym64$CHOICE_CAT = makeUninternedSymbol("CHOICE-CAT");











    private static final SubLList $list70 = list(reader_make_constant_shell(makeString("SyntacticChoiceNode")));



    private static final SubLSymbol NEW_SYNTACTIC_CHOICE_NODE = makeSymbol("NEW-SYNTACTIC-CHOICE-NODE");

    private static final SubLSymbol NEW_SYNTACTIC_FUNCTIONAL_NODE = makeSymbol("NEW-SYNTACTIC-FUNCTIONAL-NODE");



    private static final SubLSymbol FI_ASSERT_INT = makeSymbol("FI-ASSERT-INT");



    private static final SubLObject $$syntacticNodeCreator = reader_make_constant_shell(makeString("syntacticNodeCreator"));

    private static final SubLObject $$InstanceWithRelationFromFn = reader_make_constant_shell(makeString("InstanceWithRelationFromFn"));

    private static final SubLObject $$ProgramCopyFn = reader_make_constant_shell(makeString("ProgramCopyFn"));

    public static final SubLList $list80 = list(reader_make_constant_shell(makeString("partOfIBT")), reader_make_constant_shell(makeString("Cyc")));

    private static final SubLList $list81 = list(list(new SubLObject[]{ makeSymbol("NODE"), makeSymbol("MT"), makeSymbol("NEW-GAFS"), makeSymbol("OLD-GAFS"), makeSymbol("&KEY"), makeSymbol("CATEGORY"), makeSymbol("OPTIONS"), makeSymbol("CHOICE"), list(makeSymbol("SOURCE"), reader_make_constant_shell(makeString("CycRecursiveTemplateParser"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym82$TEST_GAF = makeUninternedSymbol("TEST-GAF");

    private static final SubLSymbol $sym83$CHOICE_CAT = makeUninternedSymbol("CHOICE-CAT");

    private static final SubLList $list84 = list(makeSymbol("*KB-NODE-GATHERING-MODE?*"), T);







    private static final SubLObject $$excludedOptionNodes = reader_make_constant_shell(makeString("excludedOptionNodes"));



    private static final SubLString $str90$restore_syntactic_option__A = makeString("restore-syntactic-option&~A");

    private static final SubLString $str91$_Restore_Syntactic_Option_ = makeString("[Restore Syntactic Option]");

    private static final SubLString $str92$exclude_syntactic_option__A = makeString("exclude-syntactic-option&~A");

    private static final SubLString $str93$_Exclude_Syntactic_Option_ = makeString("[Exclude Syntactic Option]");

    private static final SubLSymbol $SYNTACTIC_NODE_TOOLKIT = makeKeyword("SYNTACTIC-NODE-TOOLKIT");

    private static final SubLSymbol CB_LINK_SYNTACTIC_NODE_TOOLKIT = makeSymbol("CB-LINK-SYNTACTIC-NODE-TOOLKIT");

    private static final SubLSymbol EXCLUDE_SYNTACTIC_OPTION = makeSymbol("EXCLUDE-SYNTACTIC-OPTION");



    private static final SubLSymbol RESTORE_SYNTACTIC_OPTION = makeSymbol("RESTORE-SYNTACTIC-OPTION");



    private static final SubLList $list100 = list(list(makeSymbol("*RTP-LATEST-KB-PARSE-TREE*"), makeKeyword("SAVE")));



    private static final SubLSymbol $rtp_component_tokenizations$ = makeSymbol("*RTP-COMPONENT-TOKENIZATIONS*");

    private static final SubLList $list103 = list(list(makeSymbol("SAVE-HERE"), makeSymbol("OFFSET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_PARSE_TOKENIZATION = makeSymbol("WITH-PARSE-TOKENIZATION");

    private static final SubLSymbol $rtp_relevant_tokenization$ = makeSymbol("*RTP-RELEVANT-TOKENIZATION*");





    private static final SubLList $list108 = list(makeSymbol("ASSERTING-TREES?"));



    private static final SubLSymbol SETTING_PARSE_ROOT_NODE = makeSymbol("SETTING-PARSE-ROOT-NODE");

    private static final SubLObject $$tokenizationInputString = reader_make_constant_shell(makeString("tokenizationInputString"));

    private static final SubLObject $$tokenString = reader_make_constant_shell(makeString("tokenString"));

    private static final SubLObject $$nthTokenInTokenization = reader_make_constant_shell(makeString("nthTokenInTokenization"));

    private static final SubLObject $$numberOfTokensInTokenization = reader_make_constant_shell(makeString("numberOfTokensInTokenization"));

    private static final SubLObject $$STemplate = reader_make_constant_shell(makeString("STemplate"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLString $str118$_S_is_not_a_template_category__ = makeString("~S is not a template category~%");

    private static final SubLObject $$parseTreeOfTokenization = reader_make_constant_shell(makeString("parseTreeOfTokenization"));



    private static final SubLObject $$RewriteSequenceFn = reader_make_constant_shell(makeString("RewriteSequenceFn"));

    private static final SubLObject $$ToyParseTreeMt_FullSentences = reader_make_constant_shell(makeString("ToyParseTreeMt-FullSentences"));

    private static final SubLSymbol ITP_NODE = makeSymbol("ITP-NODE");

    private static final SubLSymbol ITP_NODE_P = makeSymbol("ITP-NODE-P");

    public static final SubLList $list125 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("PARENT"), makeSymbol("COMPONENT"), makeSymbol("SPAN"), makeSymbol("NEW-PARSE"), makeSymbol("ASSERTION"), makeSymbol("CHILDREN"), makeSymbol("PERMUTATIONS"), makeSymbol("SYNTACTIC-NODE"), makeSymbol("SYNTACTIC-CHOICES") });

    public static final SubLList $list126 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("PARENT"), makeKeyword("COMPONENT"), makeKeyword("SPAN"), makeKeyword("NEW-PARSE"), makeKeyword("ASSERTION"), makeKeyword("CHILDREN"), makeKeyword("PERMUTATIONS"), makeKeyword("SYNTACTIC-NODE"), makeKeyword("SYNTACTIC-CHOICES") });

    private static final SubLList $list127 = list(new SubLObject[]{ makeSymbol("ITP-NODE-ID"), makeSymbol("ITP-NODE-PARENT"), makeSymbol("ITP-NODE-COMPONENT"), makeSymbol("ITP-NODE-SPAN"), makeSymbol("ITP-NODE-NEW-PARSE"), makeSymbol("ITP-NODE-ASSERTION"), makeSymbol("ITP-NODE-CHILDREN"), makeSymbol("ITP-NODE-PERMUTATIONS"), makeSymbol("ITP-NODE-SYNTACTIC-NODE"), makeSymbol("ITP-NODE-SYNTACTIC-CHOICES") });

    private static final SubLList $list128 = list(new SubLObject[]{ makeSymbol("_CSETF-ITP-NODE-ID"), makeSymbol("_CSETF-ITP-NODE-PARENT"), makeSymbol("_CSETF-ITP-NODE-COMPONENT"), makeSymbol("_CSETF-ITP-NODE-SPAN"), makeSymbol("_CSETF-ITP-NODE-NEW-PARSE"), makeSymbol("_CSETF-ITP-NODE-ASSERTION"), makeSymbol("_CSETF-ITP-NODE-CHILDREN"), makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS"), makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE"), makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES") });

    private static final SubLSymbol PRINT_ITP_NODE = makeSymbol("PRINT-ITP-NODE");

    private static final SubLSymbol ITP_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list131 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-NODE-P"));

    private static final SubLSymbol ITP_NODE_ID = makeSymbol("ITP-NODE-ID");

    private static final SubLSymbol _CSETF_ITP_NODE_ID = makeSymbol("_CSETF-ITP-NODE-ID");

    private static final SubLSymbol ITP_NODE_PARENT = makeSymbol("ITP-NODE-PARENT");

    private static final SubLSymbol _CSETF_ITP_NODE_PARENT = makeSymbol("_CSETF-ITP-NODE-PARENT");

    private static final SubLSymbol ITP_NODE_COMPONENT = makeSymbol("ITP-NODE-COMPONENT");

    private static final SubLSymbol _CSETF_ITP_NODE_COMPONENT = makeSymbol("_CSETF-ITP-NODE-COMPONENT");

    private static final SubLSymbol ITP_NODE_SPAN = makeSymbol("ITP-NODE-SPAN");

    private static final SubLSymbol _CSETF_ITP_NODE_SPAN = makeSymbol("_CSETF-ITP-NODE-SPAN");

    private static final SubLSymbol ITP_NODE_NEW_PARSE = makeSymbol("ITP-NODE-NEW-PARSE");

    private static final SubLSymbol _CSETF_ITP_NODE_NEW_PARSE = makeSymbol("_CSETF-ITP-NODE-NEW-PARSE");

    private static final SubLSymbol ITP_NODE_ASSERTION = makeSymbol("ITP-NODE-ASSERTION");

    private static final SubLSymbol _CSETF_ITP_NODE_ASSERTION = makeSymbol("_CSETF-ITP-NODE-ASSERTION");

    private static final SubLSymbol ITP_NODE_CHILDREN = makeSymbol("ITP-NODE-CHILDREN");

    private static final SubLSymbol _CSETF_ITP_NODE_CHILDREN = makeSymbol("_CSETF-ITP-NODE-CHILDREN");

    private static final SubLSymbol ITP_NODE_PERMUTATIONS = makeSymbol("ITP-NODE-PERMUTATIONS");

    private static final SubLSymbol _CSETF_ITP_NODE_PERMUTATIONS = makeSymbol("_CSETF-ITP-NODE-PERMUTATIONS");

    private static final SubLSymbol ITP_NODE_SYNTACTIC_NODE = makeSymbol("ITP-NODE-SYNTACTIC-NODE");

    private static final SubLSymbol _CSETF_ITP_NODE_SYNTACTIC_NODE = makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-NODE");

    private static final SubLSymbol ITP_NODE_SYNTACTIC_CHOICES = makeSymbol("ITP-NODE-SYNTACTIC-CHOICES");

    private static final SubLSymbol _CSETF_ITP_NODE_SYNTACTIC_CHOICES = makeSymbol("_CSETF-ITP-NODE-SYNTACTIC-CHOICES");



















    private static final SubLString $str161$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ITP_NODE = makeSymbol("MAKE-ITP-NODE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str168$__ = makeString("~%");



    private static final SubLObject $$partOfIBT = reader_make_constant_shell(makeString("partOfIBT"));

    private static final SubLObject $$Cyc = reader_make_constant_shell(makeString("Cyc"));

    private static final SubLObject $$NLFunction = reader_make_constant_shell(makeString("NLFunction"));

    private static final SubLObject $$NLTaggedTermDenotingFunction = reader_make_constant_shell(makeString("NLTaggedTermDenotingFunction"));

    private static final SubLObject $$VPTemplate = reader_make_constant_shell(makeString("VPTemplate"));

    private static final SubLObject $$TheRNPParse = reader_make_constant_shell(makeString("TheRNPParse"));

    private static final SubLSymbol $sym176$_VBAR = makeSymbol("?VBAR");

    private static final SubLObject $$memberOfList = reader_make_constant_shell(makeString("memberOfList"));

    private static final SubLSymbol $sym178$_CHILD = makeSymbol("?CHILD");

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLList $list180 = list(list(reader_make_constant_shell(makeString("syntacticDaughters")), makeSymbol("?VBAR"), makeSymbol("?CHILD")), list(reader_make_constant_shell(makeString("syntacticNodeCategory")), makeSymbol("?VBAR"), list(reader_make_constant_shell(makeString("PhraseFn-Bar1")), reader_make_constant_shell(makeString("Verb")))));

    private static final SubLSymbol $sym181$_V = makeSymbol("?V");

    private static final SubLObject $$syntacticDaughters = reader_make_constant_shell(makeString("syntacticDaughters"));

    private static final SubLList $list183 = list(makeSymbol("?V"));

    private static final SubLList $list184 = list(list(reader_make_constant_shell(makeString("syntacticNodeCategory")), makeSymbol("?V"), reader_make_constant_shell(makeString("Verb"))));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$syntacticNodeNthDaughter = reader_make_constant_shell(makeString("syntacticNodeNthDaughter"));

    public static final SubLList $list187 = list(ONE_INTEGER, makeSymbol("?NODE"));

    public static final SubLList $list188 = list(list(reader_make_constant_shell(makeString("syntacticNodeCategory")), makeSymbol("?NODE"), reader_make_constant_shell(makeString("Verb"))));

    private static final SubLString $str189$____RTP_____Couldn_t_create_KB_no = makeString("*** RTP *** Couldn't create KB node for ~A in ~A");

    private static final SubLSymbol ITP_STATE = makeSymbol("ITP-STATE");

    private static final SubLSymbol ITP_STATE_P = makeSymbol("ITP-STATE-P");

    private static final SubLList $list192 = list(new SubLObject[]{ makeSymbol("SEQUENCE"), makeSymbol("COMPLETE-PARSES-ONLY"), makeSymbol("WORK-SET"), makeSymbol("SOLUTION-SET"), makeSymbol("SENTENCE"), makeSymbol("CATEGORY"), makeSymbol("CACHE"), makeSymbol("PSP-CHARTS"), makeSymbol("WORKING-MT") });

    private static final SubLList $list193 = list(new SubLObject[]{ makeKeyword("SEQUENCE"), makeKeyword("COMPLETE-PARSES-ONLY"), makeKeyword("WORK-SET"), makeKeyword("SOLUTION-SET"), makeKeyword("SENTENCE"), makeKeyword("CATEGORY"), makeKeyword("CACHE"), makeKeyword("PSP-CHARTS"), makeKeyword("WORKING-MT") });

    private static final SubLList $list194 = list(new SubLObject[]{ makeSymbol("ITP-STATE-SEQUENCE"), makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY"), makeSymbol("ITP-STATE-WORK-SET"), makeSymbol("ITP-STATE-SOLUTION-SET"), makeSymbol("ITP-STATE-SENTENCE"), makeSymbol("ITP-STATE-CATEGORY"), makeSymbol("ITP-STATE-CACHE"), makeSymbol("ITP-STATE-PSP-CHARTS"), makeSymbol("ITP-STATE-WORKING-MT") });

    private static final SubLList $list195 = list(new SubLObject[]{ makeSymbol("_CSETF-ITP-STATE-SEQUENCE"), makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY"), makeSymbol("_CSETF-ITP-STATE-WORK-SET"), makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET"), makeSymbol("_CSETF-ITP-STATE-SENTENCE"), makeSymbol("_CSETF-ITP-STATE-CATEGORY"), makeSymbol("_CSETF-ITP-STATE-CACHE"), makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS"), makeSymbol("_CSETF-ITP-STATE-WORKING-MT") });

    private static final SubLSymbol PRINT_ITP_STATE = makeSymbol("PRINT-ITP-STATE");

    private static final SubLSymbol ITP_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list198 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-STATE-P"));

    private static final SubLSymbol ITP_STATE_SEQUENCE = makeSymbol("ITP-STATE-SEQUENCE");

    private static final SubLSymbol _CSETF_ITP_STATE_SEQUENCE = makeSymbol("_CSETF-ITP-STATE-SEQUENCE");

    private static final SubLSymbol ITP_STATE_COMPLETE_PARSES_ONLY = makeSymbol("ITP-STATE-COMPLETE-PARSES-ONLY");

    private static final SubLSymbol _CSETF_ITP_STATE_COMPLETE_PARSES_ONLY = makeSymbol("_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY");

    private static final SubLSymbol ITP_STATE_WORK_SET = makeSymbol("ITP-STATE-WORK-SET");

    private static final SubLSymbol _CSETF_ITP_STATE_WORK_SET = makeSymbol("_CSETF-ITP-STATE-WORK-SET");

    private static final SubLSymbol ITP_STATE_SOLUTION_SET = makeSymbol("ITP-STATE-SOLUTION-SET");

    private static final SubLSymbol _CSETF_ITP_STATE_SOLUTION_SET = makeSymbol("_CSETF-ITP-STATE-SOLUTION-SET");

    private static final SubLSymbol ITP_STATE_SENTENCE = makeSymbol("ITP-STATE-SENTENCE");

    private static final SubLSymbol _CSETF_ITP_STATE_SENTENCE = makeSymbol("_CSETF-ITP-STATE-SENTENCE");

    private static final SubLSymbol ITP_STATE_CATEGORY = makeSymbol("ITP-STATE-CATEGORY");

    private static final SubLSymbol _CSETF_ITP_STATE_CATEGORY = makeSymbol("_CSETF-ITP-STATE-CATEGORY");

    private static final SubLSymbol ITP_STATE_CACHE = makeSymbol("ITP-STATE-CACHE");

    private static final SubLSymbol _CSETF_ITP_STATE_CACHE = makeSymbol("_CSETF-ITP-STATE-CACHE");

    private static final SubLSymbol ITP_STATE_PSP_CHARTS = makeSymbol("ITP-STATE-PSP-CHARTS");

    private static final SubLSymbol _CSETF_ITP_STATE_PSP_CHARTS = makeSymbol("_CSETF-ITP-STATE-PSP-CHARTS");

    private static final SubLSymbol ITP_STATE_WORKING_MT = makeSymbol("ITP-STATE-WORKING-MT");

    private static final SubLSymbol _CSETF_ITP_STATE_WORKING_MT = makeSymbol("_CSETF-ITP-STATE-WORKING-MT");



    private static final SubLSymbol $COMPLETE_PARSES_ONLY = makeKeyword("COMPLETE-PARSES-ONLY");













    private static final SubLSymbol MAKE_ITP_STATE = makeSymbol("MAKE-ITP-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD");

    private static final SubLString $str227$Work___D_Solution___D_KB_Mt___A = makeString("Work: ~D Solution: ~D KB Mt: ~A");

    private static final SubLSymbol ITP_NODE_MAX_CHILD_SPAN_LENGTH = makeSymbol("ITP-NODE-MAX-CHILD-SPAN-LENGTH");

    private static final SubLSymbol $sym229$_ = makeSymbol(">");



    private static final SubLSymbol NEW_ITP_STATE_PSP_CHART_DICTIONARY = makeSymbol("NEW-ITP-STATE-PSP-CHART-DICTIONARY");

    private static final SubLObject $$syntacticNodeString = reader_make_constant_shell(makeString("syntacticNodeString"));

    private static final SubLString $$$R = makeString("R");

    private static final SubLObject $$proposedMeaning = reader_make_constant_shell(makeString("proposedMeaning"));

    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

    private static final SubLString $str236$Expanding_itp_node__A________S__ = makeString("Expanding itp-node ~A:~%    ~S~%");

    private static final SubLObject $$NBarTemplate = reader_make_constant_shell(makeString("NBarTemplate"));

    private static final SubLList $list238 = list(reader_make_constant_shell(makeString("PhraseFn-Bar1")), reader_make_constant_shell(makeString("Noun")));



    private static final SubLObject $$NPTemplate = reader_make_constant_shell(makeString("NPTemplate"));

    private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));

    private static final SubLSymbol ITP_PS_GET_CYCLS_FOR_PHRASE = makeSymbol("ITP-PS-GET-CYCLS-FOR-PHRASE");

    private static final SubLSymbol ITP_PS_PARSE_VBAR = makeSymbol("ITP-PS-PARSE-VBAR");



    private static final SubLString $str245$length_of_chart_for__S____S__ = makeString("length of chart for ~S = ~S~%");

    private static final SubLObject $$gapTypeForTemplateCategory = reader_make_constant_shell(makeString("gapTypeForTemplateCategory"));

    private static final SubLObject $$posPredForTemplateCategory = reader_make_constant_shell(makeString("posPredForTemplateCategory"));

    private static final SubLString $str248$sent_a_weird_category___S__to_pre = makeString("sent a weird category (~S) to pred-for-category (the vp-parser)~%");

    private static final SubLObject $$verbStrings = reader_make_constant_shell(makeString("verbStrings"));

    private static final SubLString $str250$sent_a_non_categorized_pred___S__ = makeString("sent a non-categorized pred (~S) to RTP-CAT-FOR-PRED~%");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$posForTemplateCategory = reader_make_constant_shell(makeString("posForTemplateCategory"));

    private static final SubLString $str253$sent_un_categorized_category__s_t = makeString("sent un-categorized category ~s to RTP-CAT-FOR-POS~%");

    private static final SubLSymbol $sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_ = makeSymbol("VERB-PHRASAL-TEMPLATE-CATEGORY?");

    private static final SubLSymbol $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*");



    private static final SubLSymbol $sym257$VERBAL_TEMPLATE_CATEGORY_ = makeSymbol("VERBAL-TEMPLATE-CATEGORY?");

    private static final SubLSymbol $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym259$VBAR_TEMPLATE_CATEGORY_ = makeSymbol("VBAR-TEMPLATE-CATEGORY?");

    private static final SubLObject $$VBarTemplate = reader_make_constant_shell(makeString("VBarTemplate"));

    private static final SubLSymbol $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym262$RTP_VBAR_TEMPLATE_CATEGORY_ = makeSymbol("RTP-VBAR-TEMPLATE-CATEGORY?");

    private static final SubLObject $$RTPVBarTemplateMt = reader_make_constant_shell(makeString("RTPVBarTemplateMt"));

    private static final SubLObject $$assertTemplate_Reln = reader_make_constant_shell(makeString("assertTemplate-Reln"));

    private static final SubLSymbol $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_ = makeSymbol("PREDICATIVE-ADJP-TEMPLATE-CATEGORY?");

    private static final SubLObject $$AdjPTemplate_Predicative = reader_make_constant_shell(makeString("AdjPTemplate-Predicative"));

    private static final SubLSymbol $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym269$NOMINAL_CATEGORY_ = makeSymbol("NOMINAL-CATEGORY?");

    private static final SubLSymbol $sym270$_NOMINAL_CATEGORY__CACHING_STATE_ = makeSymbol("*NOMINAL-CATEGORY?-CACHING-STATE*");

    private static final SubLSymbol $sym271$ADJECTIVAL_CATEGORY_ = makeSymbol("ADJECTIVAL-CATEGORY?");

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLSymbol $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_ = makeSymbol("*ADJECTIVAL-CATEGORY?-CACHING-STATE*");

    private static final SubLList $list274 = list(reader_make_constant_shell(makeString("NumberTemplate")), reader_make_constant_shell(makeString("OrdinalTemplate")));

    private static final SubLSymbol RESULT_OF_PARSING_SPAN_LENGTH = makeSymbol("RESULT-OF-PARSING-SPAN-LENGTH");



    private static final SubLSymbol $sym277$IS_THIS_A_THELIST_SPAN_ = makeSymbol("IS-THIS-A-THELIST-SPAN?");

    private static final SubLSymbol $sym278$_ = makeSymbol("<");

    private static final SubLSymbol $sym279$_FUNC = makeSymbol("?FUNC");

    private static final SubLList $list280 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?FUNC"), reader_make_constant_shell(makeString("NLTaggedTermDenotingFunction"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?FUNC"), reader_make_constant_shell(makeString("TernaryFunction"))));

    private static final SubLSymbol $sym281$MT_IN_ANY_MT_ = makeSymbol("MT-IN-ANY-MT?");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$ParseTreeSandboxMt = reader_make_constant_shell(makeString("ParseTreeSandboxMt"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLString $str285$Couldn_t_find_a_parse_tree_mt_to_ = makeString("Couldn't find a parse-tree mt to be a genls of ~A -- some assertions may bomb out accordingly");

    private static final SubLObject $$SyntacticNode_Sentential = reader_make_constant_shell(makeString("SyntacticNode-Sentential"));

    private static final SubLSymbol $sym287$_N = makeSymbol("?N");

    private static final SubLObject $$dependentMeaning = reader_make_constant_shell(makeString("dependentMeaning"));

    private static final SubLSymbol $sym289$RESULT_OF_PARSING_FORMULA_ = makeSymbol("RESULT-OF-PARSING-FORMULA?");

    private static final SubLList $list290 = list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("NPTemplate")), reader_make_constant_shell(makeString("VPTemplate")));

    public static final SubLList $list291 = list(makeSymbol("SUBJ-COMPONENT"), makeSymbol("VP-COMPONENT"));

    private static final SubLString $str292$____can_t_build_any_meaning_combi = makeString("*** can't build any meaning combinations for ~A");

    private static final SubLList $list293 = list(makeSymbol("VP-NODE"), makeSymbol("VP-MEANING"));

    private static final SubLList $list294 = list(makeSymbol("SUBJ-NODE"), makeSymbol("SUBJ-MEANING"));

    private static final SubLObject $$TheSentenceSubject = reader_make_constant_shell(makeString("TheSentenceSubject"));



    private static final SubLSymbol $sym297$NL_ATTR_W_LOCATION_ = makeSymbol("NL-ATTR-W-LOCATION?");

    private static final SubLList $list298 = list(reader_make_constant_shell(makeString("NLDefinitenessFn")), reader_make_constant_shell(makeString("NLQuantFn")), reader_make_constant_shell(makeString("NLDefinitenessFn-3")), reader_make_constant_shell(makeString("NLQuantFn-3")));

    private static final SubLSymbol ITP_OUTPUT_SORTING_FUNCTION = makeSymbol("ITP-OUTPUT-SORTING-FUNCTION");



    private static final SubLObject $$AssemblePhraseFn = reader_make_constant_shell(makeString("AssemblePhraseFn"));



    private static final SubLSymbol $sym303$UNASSEMBLED_PHRASE_ = makeSymbol("UNASSEMBLED-PHRASE?");

    private static final SubLSymbol REWRITE_ASSEMBLE_PHRASE = makeSymbol("REWRITE-ASSEMBLE-PHRASE");



    private static final SubLObject $$termTemplate = reader_make_constant_shell(makeString("termTemplate"));

    private static final SubLList $list307 = list(reader_make_constant_shell(makeString("STemplate")), reader_make_constant_shell(makeString("VPTemplate")));

    private static final SubLObject $$assertTemplate = reader_make_constant_shell(makeString("assertTemplate"));

    private static final SubLObject $$termTemplate_Reln = reader_make_constant_shell(makeString("termTemplate-Reln"));

    private static final SubLObject $$termTemplate_Test = reader_make_constant_shell(makeString("termTemplate-Test"));

    private static final SubLObject $$assertTemplate_Test = reader_make_constant_shell(makeString("assertTemplate-Test"));

    private static final SubLObject $$queryTemplate = reader_make_constant_shell(makeString("queryTemplate"));

    private static final SubLObject $$queryTemplate_Reln = reader_make_constant_shell(makeString("queryTemplate-Reln"));

    private static final SubLObject $$queryTemplate_Test = reader_make_constant_shell(makeString("queryTemplate-Test"));

    private static final SubLString $str315$sent__S_to_force_for_result__ = makeString("sent ~S to force-for-result~%");

    private static final SubLList $list316 = list(reader_make_constant_shell(makeString("STemplate")), reader_make_constant_shell(makeString("QuestionTemplate")));

    private static final SubLObject $$joinTemplateComponents = reader_make_constant_shell(makeString("joinTemplateComponents"));



    private static final SubLSymbol $sym319$SUBSTITUTABLE_CHILD_FORMULA_ = makeSymbol("SUBSTITUTABLE-CHILD-FORMULA?");

    private static final SubLSymbol PARTIAL_PARSE_FILTER_FUNCTION = makeSymbol("PARTIAL-PARSE-FILTER-FUNCTION");

    public static SubLObject kb_node_analyze_category(final SubLObject category, final SubLObject into_mt) {
        if (NIL == category) {
            return NIL;
        }
        if (NIL == fort_types_interface.mt_in_any_mtP(into_mt)) {
            return NIL;
        }
        SubLObject node_type = NIL;
        SubLObject ling_cat = NIL;
        if (NIL != genls.genlP(category, $$SyntacticNode, into_mt, UNPROVIDED)) {
            node_type = category;
            ling_cat = ask_utilities.ask_variable($sym1$_CAT, listS($$relationAllInstance, $$syntacticNodeCategory, category, $list4), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        } else
            if (NIL != genls.genlP(category, $$ParsingTemplateCategory, $$TemplateParsingMt, UNPROVIDED)) {
                final SubLObject types = ask_utilities.ask_variable($sym7$_TYPE, listS($$and, listS($$genls, category, $list10), $list11), $$RKFParsingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                ling_cat = types.first();
                final SubLObject node_types = ask_utilities.ask_variable($sym13$_NODE, list($$relationAllInstance, $$syntacticNodeCategory, $sym13$_NODE, ling_cat), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                node_type = (NIL != list_utilities.singletonP(node_types)) ? node_types.first() : $$SyntacticNode;
            } else
                if (NIL != isa.isaP(category, $$NLPhraseType, into_mt, UNPROVIDED)) {
                    ling_cat = category;
                    final SubLObject node_types2 = ask_utilities.ask_variable($sym13$_NODE, list($$relationAllInstance, $$syntacticNodeCategory, $sym13$_NODE, ling_cat), into_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    node_type = (NIL != list_utilities.singletonP(node_types2)) ? node_types2.first() : $$SyntacticNode;
                } else {
                    if (NIL == genls.genlsP(category, $$NLWordForm, into_mt, UNPROVIDED)) {
                        return NIL;
                    }
                    ling_cat = category;
                    node_type = $$SyntacticNode;
                }


        return list(node_type, ling_cat);
    }

    public static SubLObject reset_kb_node_internal_counter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kb_node_internal_counter$.setDynamicValue(ZERO_INTEGER, thread);
        return $kb_node_internal_counter$.getDynamicValue(thread);
    }

    public static SubLObject next_available_kb_node(final SubLObject type, final SubLObject mt, SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_node = NIL;
        while (NIL == kb_node) {
            kb_node = parsing_utilities.hypothesize_parse_tree_element(type, mt, UNPROVIDED);
            if ((NIL != kb_node) && (NIL != label)) {
                fi.fi_rename_int(kb_node, format(NIL, $str16$Node__A__D, label, $kb_node_internal_counter$.getDynamicValue(thread)));
                $kb_node_internal_counter$.setDynamicValue(add($kb_node_internal_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
        } 
        return kb_node;
    }

    public static SubLObject new_syntactic_functional_node(final SubLObject into_mt, SubLObject category, SubLObject label) {
        if (category == UNPROVIDED) {
            category = $$NLPhrase;
        }
        if (label == UNPROVIDED) {
            label = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != $kb_node_internal_counter$.getDynamicValue(thread)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p($kb_node_internal_counter$.getDynamicValue(thread)))) {
            throw new AssertionError($kb_node_internal_counter$.getDynamicValue(thread));
        }
        SubLObject current;
        final SubLObject datum = current = kb_node_analyze_category(category, into_mt);
        SubLObject node_type = NIL;
        SubLObject linguistic_category = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        node_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        linguistic_category = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject node_string = NIL;
            SubLObject kb_node = NIL;
            SubLObject instructions = NIL;
            if (label.isString()) {
                node_string = label;
            } else
                if (node_type.eql($$SyntacticNode_MatrixClause)) {
                    node_string = $$$Root;
                } else
                    if (NIL == linguistic_category) {
                        node_string = $$$Unrecognized;
                    } else
                        if (NIL != list_utilities.proper_list_p(linguistic_category)) {
                            SubLObject current_$2;
                            final SubLObject datum_$1 = current_$2 = linguistic_category;
                            SubLObject func = NIL;
                            SubLObject cat = NIL;
                            destructuring_bind_must_consp(current_$2, datum_$1, $list23);
                            func = current_$2.first();
                            current_$2 = current_$2.rest();
                            destructuring_bind_must_consp(current_$2, datum_$1, $list23);
                            cat = current_$2.first();
                            current_$2 = current_$2.rest();
                            if (NIL == current_$2) {
                                node_string = format(NIL, $str24$_A_A, string_utilities.substring(string_utilities.fort_to_string(cat), TWO_INTEGER, THREE_INTEGER), func.eql($$PhraseFn) ? $$$P : $$$Bar);
                            } else {
                                cdestructuring_bind_error(datum_$1, $list23);
                            }
                        } else {
                            node_string = string_utilities.substring(string_utilities.fort_to_string(linguistic_category), TWO_INTEGER, UNPROVIDED);
                        }



            if (NIL != $rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                Errors.warn($str28$____creating_a__A_node__of_type__, node_string, node_type, linguistic_category);
            }
            kb_node = next_available_kb_node(node_type, into_mt, node_string);
            if (NIL != kb_node) {
                if (NIL != isa.isaP(linguistic_category, $$SententialConstituentType, into_mt, UNPROVIDED)) {
                    final SubLObject cat_gaf = list($$syntacticNodeCategory, kb_node, linguistic_category);
                    if (NIL != $kb_node_gathering_modeP$.getDynamicValue(thread)) {
                        instructions = cons(cat_gaf, instructions);
                    } else {
                        fi.fi_assert_int(cat_gaf, into_mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                return values(kb_node, reverse(instructions));
            }
        } else {
            cdestructuring_bind_error(datum, $list19);
        }
        return values(NIL, NIL);
    }

    public static SubLObject new_syntactic_choice_node(final SubLObject into_mt, SubLObject options, SubLObject category, SubLObject label) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (category == UNPROVIDED) {
            category = $$SyntacticChoiceNode;
        }
        if (label == UNPROVIDED) {
            label = $$$Choice;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject kb_node = new_syntactic_functional_node(into_mt, category, label);
        SubLObject gafs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = options;
        SubLObject this_opt = NIL;
        this_opt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isaP(this_opt, $$SyntacticNode, into_mt, UNPROVIDED)) {
                final SubLObject daughter_gaf = list($$optionNodes, kb_node, this_opt);
                if (NIL != $kb_node_gathering_modeP$.getDynamicValue(thread)) {
                    gafs = cons(daughter_gaf, gafs);
                } else {
                    fi.fi_assert_int(daughter_gaf, into_mt, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_opt = cdolist_list_var.first();
        } 
        return values(kb_node, reverse(gafs));
    }

    public static SubLObject kb_nodes_kill(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kills = ZERO_INTEGER;
        SubLObject cdolist_list_var = list($$SyntacticNode, $$SyntacticChoiceNode, $$CycParseTree, $$CycTokenization, $$CycParsingToken);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node_var = col;
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$3 = node_var;
                    final SubLObject deck_type = $STACK;
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
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$3, UNPROVIDED);
                                                while (NIL != node_var_$3) {
                                                    final SubLObject tt_node_var = node_var_$3;
                                                    SubLObject cdolist_list_var_$15;
                                                    final SubLObject accessible_modules = cdolist_list_var_$15 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var_$15.first();
                                                    while (NIL != cdolist_list_var_$15) {
                                                        final SubLObject _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                    SubLObject iteration_state_$20;
                                                                                    for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_$22;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_$22 = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_$22)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$22, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_$22, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != forts.fort_p(node_$22)) && (NIL != fi.fi_kill_int(node_$22))) {
                                                                                                                kills = add(kills, ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_$23 = NIL;
                                                                                                        node_$23 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_$23, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((NIL != forts.fort_p(node_$23)) && (NIL != fi.fi_kill_int(node_$23))) {
                                                                                                                    kills = add(kills, ONE_INTEGER);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_$23 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt_$19 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list47);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list47);
                                                                        mt_$19 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list47);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$19)) {
                                                                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$19, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_$24;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_$24 = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_$24)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$24, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_$24, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != forts.fort_p(node_$24)) && (NIL != fi.fi_kill_int(node_$24))) {
                                                                                                            kills = add(kills, ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$28 = sol;
                                                                                                    SubLObject node_$25 = NIL;
                                                                                                    node_$25 = csome_list_var_$28.first();
                                                                                                    while (NIL != csome_list_var_$28) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$25, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_$25, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != forts.fort_p(node_$25)) && (NIL != fi.fi_kill_int(node_$25))) {
                                                                                                                kills = add(kills, ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$28 = csome_list_var_$28.rest();
                                                                                                        node_$25 = csome_list_var_$28.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list47);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$16;
                                                                    final SubLObject new_list = cdolist_list_var_$16 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$16.first();
                                                                    while (NIL != cdolist_list_var_$16) {
                                                                        final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_$26;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_$26 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_$26)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$26, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_$26, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if ((NIL != forts.fort_p(node_$26)) && (NIL != fi.fi_kill_int(node_$26))) {
                                                                                            kills = add(kills, ONE_INTEGER);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject node_$27 = NIL;
                                                                                    node_$27 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_$27, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_$27, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if ((NIL != forts.fort_p(node_$27)) && (NIL != fi.fi_kill_int(node_$27))) {
                                                                                                kills = add(kills, ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_$27 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                                        }
                                                                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                                        generating_fn = cdolist_list_var_$16.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                                        module_var = cdolist_list_var_$15.first();
                                                    } 
                                                    SubLObject cdolist_list_var_$17;
                                                    final SubLObject accessible_modules2 = cdolist_list_var_$17 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var_$17.first();
                                                    while (NIL != cdolist_list_var_$17) {
                                                        final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$3);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$20 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$20)) {
                                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$20, thread);
                                                                                    SubLObject iteration_state_$21;
                                                                                    for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$18;
                                                                    final SubLObject new_list2 = cdolist_list_var_$18 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$18.first();
                                                                    while (NIL != cdolist_list_var_$18) {
                                                                        final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                                                        }
                                                                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                                                        generating_fn2 = cdolist_list_var_$18.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$11, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                                        module_var2 = cdolist_list_var_$17.first();
                                                    } 
                                                    node_var_$3 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$12, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$11, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$6, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return kills;
    }

    public static SubLObject kill_syntactic_node_tree(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $$syntacticDescendants;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(self, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(self, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$45 = NIL;
                            final SubLObject token_var_$46 = NIL;
                            while (NIL == done_var_$45) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(ass));
                                if (NIL != valid_$47) {
                                    kill_syntactic_node_tree(cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED));
                                }
                                done_var_$45 = makeBoolean(NIL == valid_$47);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            pred_var = $$optionNodes;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(self, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(self, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$46 = NIL;
                            final SubLObject token_var_$47 = NIL;
                            while (NIL == done_var_$46) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(ass));
                                if (NIL != valid_$48) {
                                    kill_syntactic_node_tree(cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED));
                                }
                                done_var_$46 = makeBoolean(NIL == valid_$48);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return fi.fi_kill_int(self);
    }

    public static SubLObject with_new_syntactic_kb_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$53 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list56);
            current_$53 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list56);
            if (NIL == member(current_$53, $list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$53 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list56);
        }
        final SubLObject category_tail = property_list_member($CATEGORY, current);
        final SubLObject category = (NIL != category_tail) ? cadr(category_tail) : NIL;
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : NIL;
        final SubLObject choice_tail = property_list_member($CHOICE, current);
        final SubLObject choice = (NIL != choice_tail) ? cadr(choice_tail) : NIL;
        final SubLObject source_tail = property_list_member($SOURCE, current);
        final SubLObject source = (NIL != source_tail) ? cadr(source_tail) : $$CycRecursiveTemplateParser;
        final SubLObject body;
        current = body = temp;
        final SubLObject choice_cat = $sym64$CHOICE_CAT;
        return list(CLET, list(list(choice_cat, category)), list(PWHEN, list(CAND, choice, list(NULL, choice_cat)), listS(CSETQ, choice_cat, $list70)), listS(CLET, list(list(node, list(FIF, choice, list(NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), list(NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)))), list(PWHEN, list(FORT_P, source), list(FI_ASSERT_INT, list(LIST, $$syntacticNodeCreator, listS(LIST, $$InstanceWithRelationFromFn, list(LIST, $$ProgramCopyFn, source), $list80), node), mt)), append(body, NIL)));
    }

    public static SubLObject with_new_syntactic_kb_node_wXgafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject mt = NIL;
        SubLObject new_gafs = NIL;
        SubLObject old_gafs = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        new_gafs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        old_gafs = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$54 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list81);
            current_$54 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list81);
            if (NIL == member(current_$54, $list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$54 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list81);
        }
        final SubLObject category_tail = property_list_member($CATEGORY, current);
        final SubLObject category = (NIL != category_tail) ? cadr(category_tail) : NIL;
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : NIL;
        final SubLObject choice_tail = property_list_member($CHOICE, current);
        final SubLObject choice = (NIL != choice_tail) ? cadr(choice_tail) : NIL;
        final SubLObject source_tail = property_list_member($SOURCE, current);
        final SubLObject source = (NIL != source_tail) ? cadr(source_tail) : $$CycRecursiveTemplateParser;
        final SubLObject body;
        current = body = temp;
        final SubLObject test_gaf = $sym82$TEST_GAF;
        final SubLObject choice_cat = $sym83$CHOICE_CAT;
        return list(CLET, list($list84, list(choice_cat, category)), list(PWHEN, list(CAND, choice, list(NULL, choice_cat)), listS(CSETQ, choice_cat, $list70)), listS(CMULTIPLE_VALUE_BIND, list(node, new_gafs), list(FIF, choice, list(NEW_SYNTACTIC_CHOICE_NODE, mt, options, choice_cat), list(NEW_SYNTACTIC_FUNCTIONAL_NODE, mt, category)), list(PWHEN, list(FORT_P, source), list(FI_ASSERT_INT, list(LIST, $$syntacticNodeCreator, listS(LIST, $$InstanceWithRelationFromFn, list(LIST, $$ProgramCopyFn, source), $list80), node), mt)), list(CDOLIST, list(test_gaf, new_gafs), list(CPUSH, test_gaf, old_gafs)), append(body, NIL)));
    }

    public static SubLObject syntactic_option_node_p(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trueP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            trueP = list_utilities.sublisp_boolean(kb_mapping.gather_gaf_arg_index(v_term, TWO_INTEGER, $$optionNodes, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return trueP;
    }

    public static SubLObject cb_link_syntactic_node_toolkit(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping.gather_gaf_arg_index(v_term, TWO_INTEGER, $$excludedOptionNodes, UNPROVIDED, UNPROVIDED)) {
                final SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str90$restore_syntactic_option__A, cb_fort_identifier(v_term));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str91$_Restore_Syntactic_Option_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            } else {
                final SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str92$exclude_syntactic_option__A, cb_fort_identifier(v_term));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str93$_Exclude_Syntactic_Option_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject exclude_syntactic_option(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_node = cb_guess_fort(id, UNPROVIDED);
        SubLObject assertion = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assertion = kb_mapping.gather_gaf_arg_index(this_node, TWO_INTEGER, $$optionNodes, UNPROVIDED, UNPROVIDED).first();
            if (NIL != assertion) {
                result = fi.fi_assert_int(list($$excludedOptionNodes, cycl_utilities.formula_arg1(assertions_high.assertion_formula(assertion), UNPROVIDED), this_node), assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject restore_syntactic_option(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_node = cb_guess_fort(id, UNPROVIDED);
        SubLObject assertion = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assertion = kb_mapping.gather_gaf_arg_index(this_node, TWO_INTEGER, $$excludedOptionNodes, UNPROVIDED, UNPROVIDED).first();
            if (NIL != assertion) {
                result = fi.fi_unassert_int(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject asserting_treesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($rtp_kb_parse_mt$.getDynamicValue(thread));
    }

    public static SubLObject while_saving_rtp_parse_into_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list100, append(body, NIL));
    }

    public static SubLObject save_rtp_kb_parse_if_desired(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($rtp_latest_kb_parse_tree$.getDynamicValue(thread).eql($SAVE)) {
            $rtp_latest_kb_parse_tree$.setDynamicValue(node, thread);
            return node;
        }
        return NIL;
    }

    public static SubLObject get_rtp_kb_parse_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rtp_latest_kb_parse_tree$.getDynamicValue(thread);
    }

    public static SubLObject get_and_erase_rtp_kb_parse_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = $rtp_latest_kb_parse_tree$.getDynamicValue(thread);
        $rtp_latest_kb_parse_tree$.setDynamicValue(NIL, thread);
        return node;
    }

    public static SubLObject with_the_rtp_parse_tokenization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject save_here = NIL;
        SubLObject offset = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        save_here = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        offset = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_PARSE_TOKENIZATION, list($rtp_relevant_tokenization$, $OFFSET, offset), list(PIF, $list108, list(PROGN, listS(SETTING_PARSE_ROOT_NODE, list(save_here), append(body, NIL))), bq_cons(PROGN, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list103);
        return NIL;
    }

    public static SubLObject rtp_component_tokenization(final SubLObject component, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rtp_kb_parse_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((!component.isString()) && (NIL == join_template_components_p(component))) && (NIL == parsing_utilities.result_of_parsing_formulaP(component))) {
            return NIL;
        }
        SubLObject tokenization = dictionary.dictionary_lookup($rtp_component_tokenizations$.getGlobalValue(), component, UNPROVIDED);
        if (NIL == valid_constantP(tokenization, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
            final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
            try {
                fi.$fi_error$.bind(NIL, thread);
                fi.$fi_warning$.bind(NIL, thread);
                SubLObject input_string = NIL;
                if (component.isString()) {
                    input_string = component;
                } else
                    if (NIL != join_template_components_p(component)) {
                        input_string = join_template_components_word_list(component);
                    } else
                        if (NIL != parsing_utilities.result_of_parsing_formulaP(component)) {
                            input_string = parsing_utilities.result_of_parsing_words(component);
                        }


                if (NIL != asserting_treesP()) {
                    tokenization = parsing_utilities.hypothesize_parse_tree_element($$CycTokenization, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                    dictionary.dictionary_enter($rtp_component_tokenizations$.getGlobalValue(), component, tokenization);
                    if ((NIL != tokenization) && (NIL != input_string)) {
                        fi.fi_assert_int(list($$tokenizationInputString, tokenization, input_string), mt, UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject num = NIL;
                    SubLObject list_var = NIL;
                    SubLObject word = NIL;
                    SubLObject n = NIL;
                    list_var = rkf_concept_harvester.rkf_ch_string_tokenize(input_string);
                    word = list_var.first();
                    for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , n = add(ONE_INTEGER, n)) {
                        num = number_utilities.f_1X(n);
                        final SubLObject kb_token = parsing_utilities.hypothesize_parse_tree_element($$CycParsingToken, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                        fi.fi_assert_int(list($$tokenString, kb_token, word), mt, UNPROVIDED, UNPROVIDED);
                        fi.fi_assert_int(list($$nthTokenInTokenization, tokenization, num, kb_token), mt, UNPROVIDED, UNPROVIDED);
                    }
                    fi.fi_assert_int(list($$numberOfTokensInTokenization, tokenization, num), mt, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                fi.$fi_warning$.rebind(_prev_bind_2, thread);
                fi.$fi_error$.rebind(_prev_bind_0, thread);
            }
        }
        return tokenization;
    }

    public static SubLObject rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }

    public static SubLObject rtp_parse_exp_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
        try {
            parsing_vars.$perform_vp_parser_expansion$.bind(T, thread);
            answers = itp_sequel(sentence, category, syntax_mt, semantics_mt);
        } finally {
            parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return answers;
    }

    public static SubLObject rtp_parse_wXvpp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
        try {
            parsing_vars.$perform_vp_parser_expansion$.bind(T, thread);
            answers = itp_sequel(sentence, category, syntax_mt, semantics_mt);
        } finally {
            parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return answers;
    }

    public static SubLObject itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject the_cyc_parse_tree = NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_semantic_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rtp_relevant_tokenization$.currentBinding(thread);
        try {
            rtp_vars.$rtp_semantic_mt$.bind(NIL != semantics_mt ? semantics_mt : $$InferencePSC, thread);
            rtp_vars.$rtp_syntactic_mt$.bind(syntax_mt, thread);
            $rtp_relevant_tokenization$.bind(rtp_component_tokenization(sentence, UNPROVIDED), thread);
            rtp_initialize.possibly_initialize_and_populate_rtp(UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
                if (NIL == genls.genlP(category, $$ParsingTemplateCategory, UNPROVIDED, UNPROVIDED)) {
                    Errors.warn($str118$_S_is_not_a_template_category__, category);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$58, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$57, thread);
            }
            final SubLObject state = new_itp_state(sentence, category, UNPROVIDED);
            $last_itp_state_created$.setDynamicValue(state, thread);
            prime_itp_pump(state, syntax_mt);
            expand_itp_state_completely(state, syntax_mt);
            answers = cat_itp(state);
            if ((NIL != asserting_treesP()) && (NIL == $rtp_exhaustive_kb_parseP$.getDynamicValue(thread))) {
                the_cyc_parse_tree = reify_itp(state);
                if ((NIL != the_cyc_parse_tree) && (NIL != $rtp_relevant_tokenization$.getDynamicValue(thread))) {
                    fi.fi_assert_int(list($$parseTreeOfTokenization, the_cyc_parse_tree, $rtp_relevant_tokenization$.getDynamicValue(thread)), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                save_rtp_kb_parse_if_desired(the_cyc_parse_tree);
            }
            destroy_itp_state(state);
        } finally {
            $rtp_relevant_tokenization$.rebind(_prev_bind_3, thread);
            rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_2, thread);
            rtp_vars.$rtp_semantic_mt$.rebind(_prev_bind_0, thread);
        }
        answers = rkf_concept_harvester.rkf_ch_simplify_assemble_phrases(answers);
        if (rtp_vars.$rtp_return_style$.getDynamicValue(thread) != $ASSERTION) {
            answers = delete_duplicate_tp_results(answers);
        }
        return values(answers, the_cyc_parse_tree);
    }

    public static SubLObject categorized_rtp_parse_exp(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return categorized_itp_sequel(sentence, category, syntax_mt, semantics_mt);
    }

    public static SubLObject categorized_itp_sequel(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding(thread);
        try {
            rtp_vars.$rtp_return_style$.bind($ASSERTION, thread);
            result = itp_sequel(sentence, category, syntax_mt, semantics_mt);
        } finally {
            rtp_vars.$rtp_return_style$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject delete_duplicate_tp_results(final SubLObject answers) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(v_answer.first(), delete_duplicates(second(v_answer), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject itp_rewrite(final SubLObject sentence, SubLObject category, SubLObject syntax_mt, SubLObject semantics_mt) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (syntax_mt == UNPROVIDED) {
            syntax_mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (semantics_mt == UNPROVIDED) {
            semantics_mt = $rkf_mt$.getDynamicValue();
        }
        return rewrites_only(itp_sequel(sentence, category, syntax_mt, semantics_mt));
    }

    public static SubLObject rewrites_only(final SubLObject answers) {
        SubLObject result = NIL;
        SubLObject rewrites = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rewrites = rewrites_helper(second(v_answer));
            if (NIL != rewrites) {
                result = cons(list(v_answer.first(), rewrites), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject rewrites_helper(final SubLObject answers) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(v_answer).eql($$RewriteSequenceFn)) {
                result = cons(v_answer, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject itp_nuke_syntactic_nodes(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$ToyParseTreeMt_FullSentences;
        }
        return kb_nodes_kill(mt);
    }

    public static SubLObject itp_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_itp_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_node_p(final SubLObject v_object) {
        return v_object.getClass() == $itp_node_native.class ? T : NIL;
    }

    public static SubLObject itp_node_id(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject itp_node_parent(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject itp_node_component(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject itp_node_span(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject itp_node_new_parse(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject itp_node_assertion(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject itp_node_children(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject itp_node_permutations(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject itp_node_syntactic_node(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject itp_node_syntactic_choices(final SubLObject v_object) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_itp_node_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_node_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_node_component(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_node_span(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_node_new_parse(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_itp_node_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_itp_node_children(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_itp_node_permutations(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_itp_node_syntactic_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_itp_node_syntactic_choices(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_node_p(v_object) : "iterative_template_parser.itp_node_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_itp_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $itp_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_itp_node_id(v_new, current_value);
            } else
                if (pcase_var.eql($PARENT)) {
                    _csetf_itp_node_parent(v_new, current_value);
                } else
                    if (pcase_var.eql($COMPONENT)) {
                        _csetf_itp_node_component(v_new, current_value);
                    } else
                        if (pcase_var.eql($SPAN)) {
                            _csetf_itp_node_span(v_new, current_value);
                        } else
                            if (pcase_var.eql($NEW_PARSE)) {
                                _csetf_itp_node_new_parse(v_new, current_value);
                            } else
                                if (pcase_var.eql($ASSERTION)) {
                                    _csetf_itp_node_assertion(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CHILDREN)) {
                                        _csetf_itp_node_children(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PERMUTATIONS)) {
                                            _csetf_itp_node_permutations(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($SYNTACTIC_NODE)) {
                                                _csetf_itp_node_syntactic_node(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SYNTACTIC_CHOICES)) {
                                                    _csetf_itp_node_syntactic_choices(v_new, current_value);
                                                } else {
                                                    Errors.error($str161$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITP_NODE, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, itp_node_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, itp_node_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPONENT, itp_node_component(obj));
        funcall(visitor_fn, obj, $SLOT, $SPAN, itp_node_span(obj));
        funcall(visitor_fn, obj, $SLOT, $NEW_PARSE, itp_node_new_parse(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION, itp_node_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILDREN, itp_node_children(obj));
        funcall(visitor_fn, obj, $SLOT, $PERMUTATIONS, itp_node_permutations(obj));
        funcall(visitor_fn, obj, $SLOT, $SYNTACTIC_NODE, itp_node_syntactic_node(obj));
        funcall(visitor_fn, obj, $SLOT, $SYNTACTIC_CHOICES, itp_node_syntactic_choices(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITP_NODE, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_node(obj, visitor_fn);
    }

    public static SubLObject print_itp_node(final SubLObject itp_node, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(itp_node, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, itp_node, T, T);
            princ(itp_node_id(itp_node), stream);
            princ($$$_, stream);
            princ(itp_node_component(itp_node), stream);
            if (NIL != $rtp_trace_aggressivelyP$.getDynamicValue(thread)) {
                format(stream, $str168$__);
            } else {
                princ($$$_, stream);
            }
            prin1(itp_node_new_parse(itp_node), stream);
            princ($$$_, stream);
            prin1(itp_node_syntactic_node(itp_node), stream);
            print_macros.print_unreadable_object_postamble(stream, itp_node, T, T);
        }
        return itp_node;
    }

    public static SubLObject construct_itp_node(final SubLObject parent, final SubLObject span, final SubLObject component, final SubLObject assertion, final SubLObject id) {
        final SubLObject self = make_itp_node(UNPROVIDED);
        _csetf_itp_node_id(self, id);
        _csetf_itp_node_parent(self, parent);
        _csetf_itp_node_span(self, span);
        _csetf_itp_node_component(self, component);
        _csetf_itp_node_assertion(self, assertion);
        _csetf_itp_node_new_parse(self, NIL);
        _csetf_itp_node_children(self, NIL);
        _csetf_itp_node_permutations(self, NIL);
        _csetf_itp_node_syntactic_node(self, NIL);
        _csetf_itp_node_syntactic_choices(self, NIL);
        return self;
    }

    public static SubLObject add_itp_node_child(final SubLObject self, final SubLObject child, SubLObject kb_node) {
        if (kb_node == UNPROVIDED) {
            kb_node = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject children = itp_node_children(self);
        children = cons(child, children);
        _csetf_itp_node_children(self, children);
        if (NIL != kb_node) {
            _csetf_itp_node_syntactic_node(child, kb_node);
            if (NIL != asserting_treesP()) {
                final SubLObject parental_node = itp_node_syntactic_node(self);
                if (NIL != parental_node) {
                    parsing_utilities.syntactic_node_add_dtr(parental_node, kb_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                }
            }
        }
        return self;
    }

    public static SubLObject itp_node_create_initial_head(final SubLObject self, final SubLObject gene_pool, final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != itp_node_p(self) : "iterative_template_parser.itp_node_p(self) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(self) " + self;
        assert NIL != list_utilities.proper_list_p(gene_pool) : "list_utilities.proper_list_p(gene_pool) " + "CommonSymbols.NIL != list_utilities.proper_list_p(gene_pool) " + gene_pool;
        final SubLObject my_node = itp_node_syntactic_node(self);
        SubLObject new_itp_node = NIL;
        final SubLObject the_span = initial_span_gap(self, gene_pool);
        if (NIL == my_node) {
            return NIL;
        }
        final SubLObject head_node = new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), cat, UNPROVIDED);
        if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
            fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), head_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        parsing_utilities.syntactic_node_add_head_dtr(my_node, head_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
        new_itp_node = construct_itp_node(self, itp_node_span(self), cat, NIL, NIL);
        return new_itp_node;
    }

    public static SubLObject itp_node_get_legitimate_children(final SubLObject self) {
        SubLObject valid_children = NIL;
        SubLObject cdolist_list_var = itp_node_children(self);
        SubLObject this_child = NIL;
        this_child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject the_parse = itp_node_new_parse(this_child);
            if (NIL != parsing_utilities.vp_parse_from_pspP(the_parse)) {
                valid_children = cons(this_child, valid_children);
            } else
                if (NIL != itp_node_get_legitimate_children(this_child)) {
                    valid_children = cons(this_child, valid_children);
                } else
                    if (((NIL == parsing_utilities.result_of_parsing_formulaP(the_parse)) && ((NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(the_parse), $$NLFunction)) || (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(the_parse), $$NLTaggedTermDenotingFunction)))) && (!parsing_utilities.result_of_parsing_category(itp_node_component(this_child)).eql($$VPTemplate))) {
                        valid_children = cons(this_child, valid_children);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            this_child = cdolist_list_var.first();
        } 
        if ((NIL != list_utilities.proper_list_p(valid_children)) && (NIL == full_span_coverageP(self, valid_children))) {
            final SubLObject my_parse = itp_node_new_parse(self);
            final SubLObject my_component = itp_node_component(self);
            if ((NIL != join_template_components_p(my_parse)) || cycl_utilities.formula_arg0(my_parse).eql($$TheRNPParse)) {
                return NIL;
            }
            if ((NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) && (NIL != verb_phrasal_template_categoryP(parsing_utilities.result_of_parsing_category(my_component)))) {
                final SubLObject vbars = ask_utilities.ask_variable($sym176$_VBAR, listS($$and, list($$memberOfList, $sym178$_CHILD, bq_cons($$TheList, Mapping.mapcar(ITP_NODE_SYNTACTIC_NODE, valid_children))), $list180), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject head_itp_node = NIL;
                SubLObject my_kb_node = NIL;
                if (NIL != list_utilities.singletonP(vbars)) {
                    my_kb_node = vbars.first();
                    _csetf_itp_node_syntactic_node(self, my_kb_node);
                    final SubLObject head_verb = ask_utilities.ask_variable($sym181$_V, listS($$and, listS($$syntacticDaughters, my_kb_node, $list183), $list184), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.singletonP(head_verb)) {
                        head_itp_node = construct_itp_node(self, itp_node_span(self), $$Verb, NIL, NIL);
                        _csetf_itp_node_syntactic_node(head_itp_node, head_verb.first());
                    }
                }
                if (((NIL == head_itp_node) && (NIL != extended_vbar_template_categoryP(parsing_utilities.result_of_parsing_category(my_component)))) && (NIL == ask_utilities.ask_variable($sym13$_NODE, listS($$and, listS($$syntacticNodeNthDaughter, itp_node_syntactic_node(self), $list187), $list188), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    head_itp_node = itp_node_create_initial_head(self, valid_children, $$Verb);
                }
                if (NIL != itp_node_p(head_itp_node)) {
                    _csetf_itp_node_new_parse(head_itp_node, cycl_utilities.formula_arg0(my_parse));
                    valid_children = cons(head_itp_node, valid_children);
                }
            }
        }
        return valid_children;
    }

    public static SubLObject itp_node_get_dominance_gafs(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == itp_node_syntactic_choices(self)) {
            return NIL;
        }
        SubLObject gafs = NIL;
        final SubLObject my_node = itp_node_syntactic_node(self);
        if (NIL == my_node) {
            return NIL;
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(itp_node_syntactic_choices(self))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject component = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject node_and_children = thread.secondMultipleValue();
            thread.resetMultipleValues();
            gafs = cons(list($$optionNodes, my_node, node_and_children.first()), gafs);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return gafs;
    }

    public static SubLObject itp_node_clear_syntactic_choices(final SubLObject self, SubLObject cat) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        if (NIL != itp_node_syntactic_choices(self)) {
            if (NIL != cat) {
                SubLObject cdolist_list_var = dictionary.dictionary_keys(itp_node_syntactic_choices(self));
                SubLObject key = NIL;
                key = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != genls.genlP(key, cat, $$TemplateParsingMt, UNPROVIDED)) {
                        dictionary.dictionary_enter(itp_node_syntactic_choices(self), key, NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    key = cdolist_list_var.first();
                } 
            } else {
                _csetf_itp_node_syntactic_choices(self, dictionary.new_dictionary(EQL, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject itp_node_initialize_syntactic_choices(final SubLObject self, SubLObject cat) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject offspring = dictionary.new_dictionary(EQL, UNPROVIDED);
        final SubLObject valid_children = itp_node_get_legitimate_children(self);
        SubLObject return_gafs = NIL;
        itp_node_clear_syntactic_choices(self, cat);
        SubLObject cdolist_list_var = valid_children;
        SubLObject this_child = NIL;
        this_child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_comp = itp_node_component(this_child);
            if (NIL != parsing_utilities.result_of_parsing_formulaP(this_comp)) {
                final SubLObject raw_cat = parsing_utilities.result_of_parsing_category(this_comp);
                final SubLObject high_cat = parsing_utilities.result_of_parsing_highest_category(this_comp, cat);
                if ((NIL == cat) || (NIL != genls.genl_in_any_mtP(raw_cat, cat))) {
                    dictionary.dictionary_enter(offspring, high_cat, cons(this_child, dictionary.dictionary_lookup(offspring, high_cat, UNPROVIDED)));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_child = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthG(dictionary.dictionary_keys(offspring), ONE_INTEGER, UNPROVIDED)) {
            SubLObject new_nodes = NIL;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(offspring)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject category = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject kids = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding(thread);
                try {
                    $kb_node_gathering_modeP$.bind(T, thread);
                    final SubLObject choice_cat = category;
                    thread.resetMultipleValues();
                    final SubLObject node = new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), category, UNPROVIDED);
                    final SubLObject ignore_this = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                        fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject cdolist_list_var2 = ignore_this;
                    SubLObject test_gaf = NIL;
                    test_gaf = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        return_gafs = cons(test_gaf, return_gafs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        test_gaf = cdolist_list_var2.first();
                    } 
                    dictionary.dictionary_enter(itp_node_syntactic_choices(self), category, cons(node, kids));
                    new_nodes = cons(node, new_nodes);
                } finally {
                    $kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            final SubLObject _prev_bind_2 = $kb_node_gathering_modeP$.currentBinding(thread);
            try {
                $kb_node_gathering_modeP$.bind(T, thread);
                SubLObject choice_cat2 = NIL;
                if (NIL == choice_cat2) {
                    choice_cat2 = $$SyntacticChoiceNode;
                }
                thread.resetMultipleValues();
                final SubLObject choice_node = new_syntactic_choice_node($rtp_kb_parse_mt$.getDynamicValue(thread), new_nodes, choice_cat2, UNPROVIDED);
                final SubLObject ignore_this2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                    fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), choice_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                SubLObject cdolist_list_var3 = ignore_this2;
                SubLObject test_gaf2 = NIL;
                test_gaf2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    return_gafs = cons(test_gaf2, return_gafs);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    test_gaf2 = cdolist_list_var3.first();
                } 
                parsing_utilities.syntactic_node_add_dtr(itp_node_syntactic_node(self), choice_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
            } finally {
                $kb_node_gathering_modeP$.rebind(_prev_bind_2, thread);
            }
        }
        return values(T, return_gafs);
    }

    public static SubLObject itp_choice_node_for_component(final SubLObject self, final SubLObject key_component) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != itp_node_syntactic_choices(self)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(itp_node_syntactic_choices(self))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject this_component = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject node_and_references = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (this_component.equal(key_component)) {
                    return values(node_and_references.first(), node_and_references.rest());
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return values(NIL, NIL);
    }

    public static SubLObject itp_node_find_or_initialize_syntactic_choices(final SubLObject self, final SubLObject component) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_node = itp_choice_node_for_component(self, component);
        SubLObject the_gafs = NIL;
        if (NIL == the_node) {
            thread.resetMultipleValues();
            final SubLObject initP = itp_node_initialize_syntactic_choices(self, NIL != parsing_utilities.result_of_parsing_formulaP(component) ? parsing_utilities.result_of_parsing_highest_category(component, UNPROVIDED) : NIL);
            final SubLObject gafs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != initP) {
                the_node = itp_choice_node_for_component(self, component);
            }
            if (NIL != gafs) {
                the_gafs = gafs;
            }
        }
        return values(the_node, the_gafs);
    }

    public static SubLObject itp_node_tokenization(final SubLObject self) {
        return rtp_component_tokenization(itp_node_new_parse(self), UNPROVIDED);
    }

    public static SubLObject itp_node_equalP(final SubLObject one, final SubLObject other) {
        return makeBoolean((itp_node_span(other).equal(itp_node_span(one)) && itp_node_component(one).equal(itp_node_component(other))) && itp_node_new_parse(one).equal(itp_node_new_parse(other)));
    }

    public static SubLObject find_or_create_itp_node_syntactic_node(final SubLObject itp_node, final SubLObject into_mt, SubLObject category, SubLObject parent) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        if (NIL == itp_node) {
            return NIL;
        }
        final SubLObject old_node = itp_node_syntactic_node(itp_node);
        if (NIL != old_node) {
            return old_node;
        }
        if (NIL == fort_types_interface.mt_in_any_mtP(into_mt)) {
            return NIL;
        }
        final SubLObject kb_node = new_syntactic_functional_node(into_mt, category, UNPROVIDED);
        if (NIL != kb_node) {
            _csetf_itp_node_syntactic_node(itp_node, kb_node);
            if (NIL != itp_node_p(parent)) {
                final SubLObject parent_kb_node = itp_node_syntactic_node(parent);
                if (NIL != isa.isaP(parent_kb_node, $$SyntacticNode, into_mt, UNPROVIDED)) {
                    parsing_utilities.syntactic_node_add_dtr(parent_kb_node, kb_node, NIL, into_mt);
                }
            }
        } else {
            Errors.warn($str189$____RTP_____Couldn_t_create_KB_no, itp_node, into_mt);
        }
        return NIL;
    }

    public static SubLObject itp_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_itp_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_state_p(final SubLObject v_object) {
        return v_object.getClass() == $itp_state_native.class ? T : NIL;
    }

    public static SubLObject itp_state_sequence(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject itp_state_complete_parses_only(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject itp_state_work_set(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject itp_state_solution_set(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject itp_state_sentence(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject itp_state_category(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject itp_state_cache(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject itp_state_psp_charts(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject itp_state_working_mt(final SubLObject v_object) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_itp_state_sequence(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_state_complete_parses_only(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_state_work_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_state_solution_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_state_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_itp_state_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_itp_state_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_itp_state_psp_charts(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_itp_state_working_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_state_p(v_object) : "iterative_template_parser.itp_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_itp_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $itp_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SEQUENCE)) {
                _csetf_itp_state_sequence(v_new, current_value);
            } else
                if (pcase_var.eql($COMPLETE_PARSES_ONLY)) {
                    _csetf_itp_state_complete_parses_only(v_new, current_value);
                } else
                    if (pcase_var.eql($WORK_SET)) {
                        _csetf_itp_state_work_set(v_new, current_value);
                    } else
                        if (pcase_var.eql($SOLUTION_SET)) {
                            _csetf_itp_state_solution_set(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENTENCE)) {
                                _csetf_itp_state_sentence(v_new, current_value);
                            } else
                                if (pcase_var.eql($CATEGORY)) {
                                    _csetf_itp_state_category(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CACHE)) {
                                        _csetf_itp_state_cache(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PSP_CHARTS)) {
                                            _csetf_itp_state_psp_charts(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($WORKING_MT)) {
                                                _csetf_itp_state_working_mt(v_new, current_value);
                                            } else {
                                                Errors.error($str161$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITP_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SEQUENCE, itp_state_sequence(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETE_PARSES_ONLY, itp_state_complete_parses_only(obj));
        funcall(visitor_fn, obj, $SLOT, $WORK_SET, itp_state_work_set(obj));
        funcall(visitor_fn, obj, $SLOT, $SOLUTION_SET, itp_state_solution_set(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, itp_state_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, itp_state_category(obj));
        funcall(visitor_fn, obj, $SLOT, $CACHE, itp_state_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $PSP_CHARTS, itp_state_psp_charts(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_MT, itp_state_working_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITP_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_state(obj, visitor_fn);
    }

    public static SubLObject print_itp_state(final SubLObject itp_state, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(itp_state, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, itp_state, T, T);
            format(stream, $str227$Work___D_Solution___D_KB_Mt___A, new SubLObject[]{ queues.p_queue_size(itp_state_work_set(itp_state)), length(itp_state_solution_set(itp_state)), itp_state_working_mt(itp_state) });
            print_macros.print_unreadable_object_postamble(stream, itp_state, T, T);
        }
        return itp_state;
    }

    public static SubLObject new_itp_state(final SubLObject sentence, SubLObject category, SubLObject complete_parses_only) {
        if (category == UNPROVIDED) {
            category = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = make_itp_state(UNPROVIDED);
        _csetf_itp_state_sequence(state, ZERO_INTEGER);
        _csetf_itp_state_complete_parses_only(state, complete_parses_only);
        _csetf_itp_state_sentence(state, sentence);
        _csetf_itp_state_category(state, category);
        _csetf_itp_state_cache(state, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        _csetf_itp_state_work_set(state, queues.create_p_queue(NIL, ITP_NODE_MAX_CHILD_SPAN_LENGTH, $sym229$_));
        _csetf_itp_state_solution_set(state, NIL);
        _csetf_itp_state_psp_charts(state, new_itp_state_psp_chart_dictionary());
        _csetf_itp_state_working_mt(state, $rtp_kb_parse_mt$.getDynamicValue(thread));
        return state;
    }

    public static SubLObject destroy_itp_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(itp_state_cache(state));
        final SubLObject chart_dictionary = itp_state_psp_charts(state);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(chart_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject chart = thread.secondMultipleValue();
            thread.resetMultipleValues();
            psp_chart.destroy_psp_chart(chart);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(chart_dictionary);
        return $DESTROYED;
    }

    public static SubLObject new_itp_state_psp_chart_dictionary_internal() {
        return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_itp_state_psp_chart_dictionary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return new_itp_state_psp_chart_dictionary_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NEW_ITP_STATE_PSP_CHART_DICTIONARY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NEW_ITP_STATE_PSP_CHART_DICTIONARY, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NEW_ITP_STATE_PSP_CHART_DICTIONARY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(new_itp_state_psp_chart_dictionary_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject add_to_itp_solution(final SubLObject state, final SubLObject solution) {
        SubLObject current = solution;
        SubLObject solutions = itp_state_solution_set(state);
        while (NIL != itp_node_p(current)) {
            final SubLObject item_var = current;
            if (NIL == member(item_var, solutions, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                solutions = cons(item_var, solutions);
            }
            current = itp_node_parent(current);
        } 
        _csetf_itp_state_solution_set(state, solutions);
        return state;
    }

    public static SubLObject memoize_itp_attempt(final SubLObject state, final SubLObject node) {
        final SubLObject v_cache = itp_state_cache(state);
        final SubLObject key = itp_node_component(node);
        if (NIL != key) {
            dictionary_utilities.dictionary_pushnew(v_cache, key, node, UNPROVIDED, UNPROVIDED);
        }
        return state;
    }

    public static SubLObject is_a_known_itp_attemptP(final SubLObject state, final SubLObject problem) {
        final SubLObject v_cache = itp_state_cache(state);
        final SubLObject hit = dictionary.dictionary_lookup(v_cache, problem, UNPROVIDED);
        return hit;
    }

    public static SubLObject prime_itp_pump(final SubLObject itp_state, final SubLObject mt) {
        final SubLObject parses = recognition.categorizing_template_parse(itp_state_sentence(itp_state), mt, itp_state_category(itp_state), itp_state_complete_parses_only(itp_state));
        final SubLObject undo_extension_traceP = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject span = parse.first();
            SubLObject cdolist_list_var_$59;
            final SubLObject possibles = cdolist_list_var_$59 = second(parse);
            SubLObject possible = NIL;
            possible = cdolist_list_var_$59.first();
            while (NIL != cdolist_list_var_$59) {
                final SubLObject formula = possible.first();
                final SubLObject assertion = second(possible);
                extend_itp_state(itp_state, span, NIL, formula, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                possible = cdolist_list_var_$59.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return itp_state;
    }

    public static SubLObject extend_itp_state(final SubLObject state, final SubLObject span, final SubLObject old_formula, final SubLObject new_parse, final SubLObject assertion, SubLObject parent, SubLObject psp_node_if_any, SubLObject graph_type) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        if (psp_node_if_any == UNPROVIDED) {
            psp_node_if_any = NIL;
        }
        if (graph_type == UNPROVIDED) {
            graph_type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != itp_state_p(state) : "iterative_template_parser.itp_state_p(state) " + "CommonSymbols.NIL != iterative_template_parser.itp_state_p(state) " + state;
        if (((NIL != parent) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == itp_node_p(parent))) {
            throw new AssertionError(parent);
        }
        SubLObject id = itp_state_sequence(state);
        final SubLObject node = construct_itp_node(parent, span, old_formula, assertion, id);
        _csetf_itp_node_new_parse(node, new_parse);
        _csetf_itp_node_syntactic_node(node, psp_node_if_any);
        final SubLObject into_mt = (NIL != $rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) ? itp_state_working_mt(state) : NIL;
        if (NIL == parent) {
            if (NIL != into_mt) {
                final SubLObject kb_node = find_or_create_itp_node_syntactic_node(node, into_mt, $$SyntacticNode_MatrixClause, UNPROVIDED);
                if ((NIL != kb_node) && (NIL != parsing_utilities.result_of_parsing_formulaP(old_formula))) {
                    fi.fi_assert_int(list($$syntacticNodeString, kb_node, parsing_utilities.result_of_parsing_words(old_formula)), into_mt, UNPROVIDED, UNPROVIDED);
                }
            }
        } else {
            SubLObject child_kb_node = NIL;
            if ((NIL != into_mt) && (NIL == child_kb_node)) {
                final SubLObject category = ((NIL != $extend_itp_state_analyze_assertionP$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(assertion))) ? cycl_utilities.formula_arg1(assertions_high.assertion_formula(assertion), UNPROVIDED) : assertion;
                if ((NIL == assertion_handles.assertion_p(category)) && (NIL != genls.genlP(category, $$ParsingTemplateCategory, $$TemplateParsingMt, UNPROVIDED))) {
                    child_kb_node = new_syntactic_functional_node(into_mt, category, UNPROVIDED);
                    if ((NIL != child_kb_node) && (NIL != parsing_utilities.result_of_parsing_formulaP(old_formula))) {
                        fi.fi_assert_int(list($$syntacticNodeString, child_kb_node, parsing_utilities.result_of_parsing_words(old_formula)), into_mt, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            add_itp_node_child(parent, node, child_kb_node);
        }
        queues.p_enqueue(node, itp_state_work_set(state));
        id = add(id, ONE_INTEGER);
        _csetf_itp_state_sequence(state, id);
        memoize_itp_attempt(state, node);
        return node;
    }

    public static SubLObject extend_itp_state_multiple(final SubLObject state, final SubLObject span, final SubLObject formula, final SubLObject answers, final SubLObject parent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != itp_state_p(state) : "iterative_template_parser.itp_state_p(state) " + "CommonSymbols.NIL != iterative_template_parser.itp_state_p(state) " + state;
        assert NIL != itp_node_p(parent) : "iterative_template_parser.itp_node_p(parent) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(parent) " + parent;
        final SubLObject solution = answers.first();
        final SubLObject subspan = solution.first();
        final SubLObject subparses = second(solution);
        SubLObject absolute_span = NIL;
        SubLObject listy_span = NIL;
        if (span.first().eql($$TheList)) {
            listy_span = span;
        } else {
            listy_span = cons($$TheList, span);
        }
        absolute_span = compute_correct_span(listy_span, subspan);
        adjust_the_spans(subparses, absolute_span, UNPROVIDED);
        final SubLObject kb_node = NIL;
        SubLObject cdolist_list_var = subparses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject form = parse.first();
            final SubLObject assertion = second(parse);
            final SubLObject undo_extension_traceP = NIL;
            if ((!form.isList()) || (NIL == member(formula, form, symbol_function(EQUALP), UNPROVIDED))) {
                final SubLObject _prev_bind_0 = $extend_itp_state_analyze_assertionP$.currentBinding(thread);
                try {
                    $extend_itp_state_analyze_assertionP$.bind(T, thread);
                    extend_itp_state(state, absolute_span, formula, form, assertion, parent, UNPROVIDED, UNPROVIDED);
                } finally {
                    $extend_itp_state_analyze_assertionP$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return state;
    }

    public static SubLObject extend_itp_state_by_ps_parse(final SubLObject state, final SubLObject span, final SubLObject component, SubLObject psp_parse, final SubLObject parent, final SubLObject pos_of_parse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject real_span = (span.first().eql($$TheList)) ? span.rest() : span;
        SubLObject interpretations = NIL;
        SubLObject psp_node_if_any = psp_parse.first();
        SubLObject node = NIL;
        if ((NIL == psp_node_if_any) || (NIL != forts.fort_p(psp_node_if_any))) {
            psp_parse = psp_parse.rest();
        } else {
            psp_node_if_any = NIL;
        }
        SubLObject cdolist_list_var = psp_parse;
        SubLObject meaning = NIL;
        meaning = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = narts_high.nart_expand(meaning);
            final SubLObject item_var;
            final SubLObject adjusted_formula = item_var = adjust_the_spans(formula, real_span, UNPROVIDED);
            if (NIL == member(item_var, interpretations, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                interpretations = cons(item_var, interpretations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning = cdolist_list_var.first();
        } 
        cdolist_list_var = interpretations;
        SubLObject interpretation = NIL;
        interpretation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            node = extend_itp_state(state, real_span, component, interpretation, pos_of_parse, parent, psp_node_if_any, $npparse_graph_type$.getDynamicValue(thread));
            if (NIL != $rtp_exhaustive_kb_parseP$.getDynamicValue(thread)) {
                final SubLObject kb_node = itp_node_syntactic_node(node);
                final SubLObject into_mt = itp_state_working_mt(state);
                if ((NIL != kb_node) && (NIL != into_mt)) {
                    fi.fi_assert_int(list($$proposedMeaning, kb_node, list($$SubLQuoteFn, interpretation)), into_mt, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interpretation = cdolist_list_var.first();
        } 
        return node;
    }

    public static SubLObject expand_itp_state(final SubLObject state, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current = queues.p_dequeue(itp_state_work_set(state), UNPROVIDED);
        final SubLObject span = itp_node_span(current);
        final SubLObject formula = itp_node_new_parse(current);
        final SubLObject components = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(formula);
        SubLObject parts = ZERO_INTEGER;
        SubLObject good = ZERO_INTEGER;
        SubLObject listy_span = NIL;
        if (NIL != $trace_itp_state_expansion$.getDynamicValue(thread)) {
            format(T, $str236$Expanding_itp_node__A________S__, current, itp_node_new_parse(current));
        }
        if (NIL != components) {
            if (span.first().eql($$TheList)) {
                listy_span = span;
            } else {
                listy_span = cons($$TheList, span);
            }
        }
        SubLObject cdolist_list_var = components;
        SubLObject component = NIL;
        component = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject words = parsing_utilities.result_of_parsing_words(component);
            final SubLObject subspan = parsing_utilities.result_of_parsing_span(component);
            final SubLObject category = parsing_utilities.result_of_parsing_category(component);
            parts = add(parts, ONE_INTEGER);
            if ((NIL == parsing_utilities.result_of_parsing_formulaP(component)) && ((((NIL == verbal_template_categoryP(category)) && (NIL == number_template_categoryP(category))) && ((NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread)) || ((NIL == adjectival_categoryP(category)) && (NIL == nominal_categoryP(category))))) || ((NIL != nominal_categoryP(category)) && (NIL == parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread))))) {
                good = add(good, ONE_INTEGER);
            } else {
                final SubLObject v_cache = is_a_known_itp_attemptP(state, component);
                if ((NIL != v_cache) && (!v_cache.eql(current))) {
                    SubLObject cdolist_list_var_$60 = v_cache;
                    SubLObject known_node = NIL;
                    known_node = cdolist_list_var_$60.first();
                    while (NIL != cdolist_list_var_$60) {
                        add_itp_node_child(current, known_node, UNPROVIDED);
                        cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                        known_node = cdolist_list_var_$60.first();
                    } 
                    good = add(good, ONE_INTEGER);
                } else
                    if ((NIL == v_cache) || v_cache.eql(current)) {
                        final SubLObject answers = recognition.categorizing_template_parse(words, mt, category, UNPROVIDED);
                        final SubLObject absolute_span = compute_correct_span(listy_span, subspan);
                        if (NIL != answers) {
                            extend_itp_state_multiple(state, absolute_span, component, answers, current);
                        }
                        if (NIL != nominal_categoryP(category)) {
                            if (NIL != parsing_vars.$perform_np_parser_expansion$.getDynamicValue(thread)) {
                                final SubLObject pcase_var = category;
                                if (pcase_var.eql($$NBarTemplate)) {
                                    if (NIL != appropriate_span_for_nbar_parsingP(words, subspan)) {
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
                                                    parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                                                    final SubLObject parses = itp_ps_get_cycls_for_phrase(words, span, $list238, $ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                    extend_itp_state_by_ps_parse(state, absolute_span, component, parses, current, $$NBarTemplate);
                                                } finally {
                                                    parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                                                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$61, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($$NPTemplate) && (NIL != appropriate_span_for_np_parsingP(words, subspan))) {
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
                                                    final SubLObject np_parses = itp_ps_get_cycls_for_phrase(words, span, $$NounPhrase, $ANY, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
                                                    extend_itp_state_by_ps_parse(state, absolute_span, component, np_parses, current, $$NPTemplate);
                                                } finally {
                                                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$63, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                        }
                                    }

                            }
                            good = add(good, ONE_INTEGER);
                        } else
                            if (NIL != predicative_adjp_template_categoryP(category)) {
                                if (NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue(thread)) {
                                    SubLObject psp_node_if_any = NIL;
                                    SubLObject adjp_parses = NIL;
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
                                                    parsing_vars.$parse_tokenization$.bind($rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                                                    parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                                                    if (NIL != asserting_treesP()) {
                                                        final SubLObject _prev_bind_0_$67 = parsing_vars.$parse_root_node$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$68 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                                                        try {
                                                            parsing_vars.$parse_root_node$.bind(NIL, thread);
                                                            parsing_vars.$reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                                                            adjp_parses = psp_main.ps_parse_predicative_adjp(words, pred_for_category(category), psp_lexicon.get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                            psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                                                        } finally {
                                                            parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_$68, thread);
                                                            parsing_vars.$parse_root_node$.rebind(_prev_bind_0_$67, thread);
                                                        }
                                                    } else {
                                                        adjp_parses = psp_main.ps_parse_predicative_adjp(words, pred_for_category(category), psp_lexicon.get_default_psp_lexicon(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                    }
                                                } finally {
                                                    parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_4, thread);
                                                    parsing_vars.$parse_tokenization$.rebind(_prev_bind_0_$66, thread);
                                                }
                                                adjp_parses = cons(psp_node_if_any, adjp_parses);
                                                extend_itp_state_by_ps_parse(state, absolute_span, component, adjp_parses, current, category);
                                            } finally {
                                                parsing_vars.$psp_chart$.rebind(_prev_bind_0_$65, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_3, thread);
                                    }
                                }
                                good = add(good, ONE_INTEGER);
                            } else
                                if (NIL != vbar_template_categoryP(category)) {
                                    if ((NIL != parsing_vars.$perform_vp_parser_expansion$.getDynamicValue(thread)) && (NIL != appropriate_span_for_vbar_parsingP(words, subspan))) {
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
                                                } finally {
                                                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$69, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state3, original_memoization_process3);
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_5, thread);
                                        }
                                    }
                                    good = add(good, ONE_INTEGER);
                                } else
                                    if (NIL != number_template_categoryP(category)) {
                                        final SubLObject number_parses = list(numeral_parser.string_to_interval(NIL != string_utilities.english_ordinal_number_string_p(words) ? string_utilities.english_ordinal_string_to_cardinal_string(words) : words));
                                        extend_itp_state_by_ps_parse(state, absolute_span, component, number_parses, current, category);
                                        good = add(good, ONE_INTEGER);
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

    public static SubLObject appropriate_span_for_np_parsingP(final SubLObject words, final SubLObject subspan) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $possible_nps$.getDynamicValue(thread)) {
            return subl_promotions.memberP(words, $possible_nps$.getDynamicValue(thread), EQUALP, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject appropriate_span_for_vbar_parsingP(final SubLObject words, final SubLObject subspan) {
        return T;
    }

    public static SubLObject appropriate_span_for_nbar_parsingP(final SubLObject words, final SubLObject subspan) {
        return T;
    }

    public static SubLObject itp_ps_get_cycls_for_phrase_internal(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject psp_node_if_any = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(parsing_vars.$psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = parsing_vars.$parse_tokenization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
            try {
                parsing_vars.$parse_tokenization$.bind($rtp_relevant_tokenization$.getDynamicValue(thread), thread);
                parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
                if (NIL != asserting_treesP()) {
                    final SubLObject _prev_bind_0_$73 = parsing_vars.$parse_root_node$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$74 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                    try {
                        parsing_vars.$parse_root_node$.bind(NIL, thread);
                        parsing_vars.$reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                        ans = psp_main.ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED);
                        psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                    } finally {
                        parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_$74, thread);
                        parsing_vars.$parse_root_node$.rebind(_prev_bind_0_$73, thread);
                    }
                } else {
                    ans = psp_main.ps_get_cycls_for_phrase(words, category, pos_pred, non_trivialP, lexicon, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_2, thread);
                parsing_vars.$parse_tokenization$.rebind(_prev_bind_0_$72, thread);
            }
        } finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return cons(psp_node_if_any, ans);
    }

    public static SubLObject itp_ps_get_cycls_for_phrase(final SubLObject words, final SubLObject span, final SubLObject category, final SubLObject pos_pred, final SubLObject non_trivialP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ITP_PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ITP_PS_GET_CYCLS_FOR_PHRASE, SIX_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ITP_PS_GET_CYCLS_FOR_PHRASE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(words, span, category, pos_pred, non_trivialP, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
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
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(itp_ps_get_cycls_for_phrase_internal(words, span, category, pos_pred, non_trivialP, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(words, span, category, pos_pred, non_trivialP, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject itp_ps_parse_vbar_internal(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_pred = pred_for_category(category);
        final SubLObject gap_type = gap_type_for_category(category);
        SubLObject psp_node_if_any = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tokenization$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tokenization_offset$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(parsing_vars.$psp_return_mode$.getDynamicValue(thread), thread);
            parsing_vars.$parse_tokenization$.bind($rtp_relevant_tokenization$.getDynamicValue(thread), thread);
            parsing_vars.$parse_tokenization_offset$.bind(span.first(), thread);
            if (NIL != asserting_treesP()) {
                final SubLObject _prev_bind_0_$75 = parsing_vars.$parse_root_node$.currentBinding(thread);
                final SubLObject _prev_bind_1_$76 = parsing_vars.$reify_parse_nodesP$.currentBinding(thread);
                try {
                    parsing_vars.$parse_root_node$.bind(NIL, thread);
                    parsing_vars.$reify_parse_nodesP$.bind(boundp(psp_node_if_any), thread);
                    ans = psp_main.ps_parse_vbar(words, pos_pred, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), gap_type);
                    psp_node_if_any = parsing_vars.$parse_root_node$.getDynamicValue(thread);
                } finally {
                    parsing_vars.$reify_parse_nodesP$.rebind(_prev_bind_1_$76, thread);
                    parsing_vars.$parse_root_node$.rebind(_prev_bind_0_$75, thread);
                }
            } else {
                ans = psp_main.ps_parse_vbar(words, pos_pred, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), gap_type);
            }
        } finally {
            parsing_vars.$parse_tokenization_offset$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tokenization$.rebind(_prev_bind_2, thread);
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return cons(psp_node_if_any, ans);
    }

    public static SubLObject itp_ps_parse_vbar(final SubLObject words, final SubLObject span, SubLObject category, SubLObject mt) {
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return itp_ps_parse_vbar_internal(words, span, category, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ITP_PS_PARSE_VBAR, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ITP_PS_PARSE_VBAR, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ITP_PS_PARSE_VBAR, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(words, span, category, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (words.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (span.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (category.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(itp_ps_parse_vbar_internal(words, span, category, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(words, span, category, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject itp_find_or_create_appropriate_chart(final SubLObject state, final SubLObject span_with_the_list, final SubLObject words, final SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart_dictionary = itp_state_psp_charts(state);
        final SubLObject span = span_with_the_list.rest();
        SubLObject result;
        SubLObject iteration_state;
        for (result = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(chart_dictionary)); (NIL == result) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject chart_span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject chart = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != itp_subspanP(span, chart_span)) {
                result = chart;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL == result) {
            result = get_chart_from_extra_psp_charts(words);
        }
        if (NIL == result) {
            final SubLObject new_chart = psp_syntax.psp_chart_for_string(words, psp_lexicon.get_default_psp_lexicon(lex_mt, UNPROVIDED, UNPROVIDED), $NONE, NIL);
            dictionary.dictionary_enter(itp_state_psp_charts(state), copy_list(span), new_chart);
            result = new_chart;
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            recognition.rtp_tracer_output(ONE_INTEGER, list($str245$length_of_chart_for__S____S__, words, psp_chart.psp_edge_count(result)));
        }
        return result;
    }

    public static SubLObject get_chart_from_extra_psp_charts(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject good_chart = NIL;
        if (NIL == good_chart) {
            SubLObject csome_list_var = parsing_vars.$psp_extra_charts$.getDynamicValue(thread);
            SubLObject chart = NIL;
            chart = csome_list_var.first();
            while ((NIL == good_chart) && (NIL != csome_list_var)) {
                if (NIL != psp_main.psp_find_string_in_chart(string, chart)) {
                    good_chart = chart;
                }
                csome_list_var = csome_list_var.rest();
                chart = csome_list_var.first();
            } 
        }
        return good_chart;
    }

    public static SubLObject itp_subspanP(final SubLObject subspan, final SubLObject superspan) {
        return search(subspan, superspan, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gap_type_for_category(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(cat)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(cat, $$gapTypeForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            return $NONE;
        }
        return result;
    }

    public static SubLObject pred_for_category(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(cat)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(cat, $$posPredForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn($str248$sent_a_weird_category___S__to_pre, cat);
            return $$verbStrings;
        }
        return result;
    }

    public static SubLObject rtp_cat_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(pred)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(pred, $$posPredForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn($str250$sent_a_non_categorized_pred___S__, pred);
        }
        return result;
    }

    public static SubLObject rtp_cat_for_pos(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(pos)) {
            return NIL;
        }
        if (pos.eql($$Noun)) {
            return $$NPTemplate;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(pos, $$posForTemplateCategory, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn($str253$sent_un_categorized_category__s_t, pos);
        }
        return result;
    }

    public static SubLObject pos_for_rtp_cat(final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(cat)) {
            return NIL;
        }
        if (cat.eql($$NPTemplate)) {
            return $$Noun;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.fpred_value(cat, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.warn($str253$sent_un_categorized_category__s_t, cat);
        }
        return result;
    }

    public static SubLObject best_rtp_cat_for_preds(final SubLObject preds) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = preds, pred = NIL, pred = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = rtp_cat_for_pred(pred) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return result;
    }

    public static SubLObject clear_verb_phrasal_template_categoryP() {
        final SubLObject cs = $verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_verb_phrasal_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($verb_phrasal_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject verb_phrasal_template_categoryP_internal(final SubLObject category) {
        return makeBoolean((NIL != verbal_template_categoryP(category)) && (NIL == genls.genl_in_any_mtP(category, $$STemplate)));
    }

    public static SubLObject verb_phrasal_template_categoryP(final SubLObject category) {
        SubLObject caching_state = $verb_phrasal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_, $sym255$_VERB_PHRASAL_TEMPLATE_CATEGORY__CACHING_STATE_, $int$64, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(verb_phrasal_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_verbal_template_categoryP() {
        final SubLObject cs = $verbal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_verbal_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($verbal_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject verbal_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.pred_values(category, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP($$Verb, result, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject verbal_template_categoryP(final SubLObject category) {
        SubLObject caching_state = $verbal_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym257$VERBAL_TEMPLATE_CATEGORY_, $sym258$_VERBAL_TEMPLATE_CATEGORY__CACHING_STATE_, $int$64, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(verbal_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_vbar_template_categoryP() {
        final SubLObject cs = $vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_vbar_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($vbar_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject vbar_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = genls.genlP(category, $$VBarTemplate, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject vbar_template_categoryP(final SubLObject category) {
        SubLObject caching_state = $vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym259$VBAR_TEMPLATE_CATEGORY_, $sym261$_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(vbar_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_rtp_vbar_template_categoryP() {
        final SubLObject cs = $rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rtp_vbar_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($rtp_vbar_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rtp_vbar_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($$RTPVBarTemplateMt, thread);
            SubLObject template = NIL;
            final SubLObject pred_var = $$assertTemplate_Reln;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(category, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(category, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$77 = NIL;
                            final SubLObject token_var_$78 = NIL;
                            while (NIL == done_var_$77) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$78);
                                final SubLObject valid_$79 = makeBoolean(!token_var_$78.eql(assertion));
                                if (NIL != valid_$79) {
                                    template = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                    if (NIL != genls.genlP(template, $$VPTemplate, UNPROVIDED, UNPROVIDED)) {
                                        result = T;
                                    }
                                }
                                done_var_$77 = makeBoolean(NIL == valid_$79);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rtp_vbar_template_categoryP(final SubLObject category) {
        SubLObject caching_state = $rtp_vbar_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym262$RTP_VBAR_TEMPLATE_CATEGORY_, $sym265$_RTP_VBAR_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtp_vbar_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject extended_vbar_template_categoryP(final SubLObject category) {
        return makeBoolean((NIL != vbar_template_categoryP(category)) || (NIL != rtp_vbar_template_categoryP(category)));
    }

    public static SubLObject clear_predicative_adjp_template_categoryP() {
        final SubLObject cs = $predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_predicative_adjp_template_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($predicative_adjp_template_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicative_adjp_template_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = genls.genlP(category, $$AdjPTemplate_Predicative, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject predicative_adjp_template_categoryP(final SubLObject category) {
        SubLObject caching_state = $predicative_adjp_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_, $sym268$_PREDICATIVE_ADJP_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(predicative_adjp_template_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_nominal_categoryP() {
        final SubLObject cs = $nominal_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nominal_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($nominal_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nominal_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.pred_values(category, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP($$Noun, result, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nominal_categoryP(final SubLObject category) {
        SubLObject caching_state = $nominal_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym269$NOMINAL_CATEGORY_, $sym270$_NOMINAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(nominal_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_adjectival_categoryP() {
        final SubLObject cs = $adjectival_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_adjectival_categoryP(final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($adjectival_categoryP_caching_state$.getGlobalValue(), list(category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject adjectival_categoryP_internal(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(category)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), thread);
            result = kb_mapping_utilities.pred_values(category, $$posForTemplateCategory, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.memberP($$Adjective, result, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject adjectival_categoryP(final SubLObject category) {
        SubLObject caching_state = $adjectival_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym271$ADJECTIVAL_CATEGORY_, $sym273$_ADJECTIVAL_CATEGORY__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, category, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(adjectival_categoryP_internal(category)));
            memoization_state.caching_state_put(caching_state, category, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject number_template_categoryP(final SubLObject category) {
        return subl_promotions.memberP(category, $list274, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject verbal_categoryP(final SubLObject word_cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.genl_posP(word_cat, $$Verb, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
    }

    public static SubLObject expand_itp_state_completely(final SubLObject state, final SubLObject mt) {
        while (queues.p_queue_size(itp_state_work_set(state)).isPositive()) {
            expand_itp_state(state, mt);
        } 
        return state;
    }

    public static SubLObject itp_node_max_child_span_length(final SubLObject node) {
        final SubLObject biggest_kid = list_utilities.extremal(rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(itp_node_new_parse(node)), $sym229$_, RESULT_OF_PARSING_SPAN_LENGTH);
        if (NIL != biggest_kid) {
            return parsing_utilities.result_of_parsing_span_length(biggest_kid);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject itp_output_sorting_function(final SubLObject item) {
        final SubLObject span = item.first();
        return add(multiply(length(span), $int$100), span.first());
    }

    public static SubLObject compute_correct_span(final SubLObject absolute, final SubLObject relative) {
        final SubLObject offset = second(absolute);
        SubLObject new_span = NIL;
        final SubLObject numeric_part = (relative.first().eql($$TheList)) ? relative.rest() : relative;
        final SubLObject numeric_base = absolute.rest();
        if (NIL != search(numeric_part, numeric_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return relative;
        }
        SubLObject cdolist_list_var = relative;
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (position.isNumber()) {
                new_span = cons(add(offset, position), new_span);
            } else {
                new_span = cons(position, new_span);
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        } 
        return nreverse(new_span);
    }

    public static SubLObject adjust_the_spans(final SubLObject formula, final SubLObject span, SubLObject span_test) {
        if (span_test == UNPROVIDED) {
            span_test = $sym277$IS_THIS_A_THELIST_SPAN_;
        }
        final SubLObject lists = list_utilities.tree_gather(formula, span_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject base_span = (NIL != is_this_a_thelist_spanP(span)) ? span.rest() : span;
        SubLObject cdolist_list_var = lists;
        SubLObject a_span = NIL;
        a_span = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject spot = a_span;
            SubLObject cdolist_list_var_$81 = a_span;
            SubLObject number = NIL;
            number = cdolist_list_var_$81.first();
            while (NIL != cdolist_list_var_$81) {
                if (number.isNumber()) {
                    final SubLObject index = nth(number, base_span);
                    if (NIL != index) {
                        nsubst(index, number, spot, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject is_this_a_thelist_spanP(final SubLObject obj) {
        if ((!obj.isCons()) || (!obj.first().eql($$TheList))) {
            return NIL;
        }
        SubLObject cdolist_list_var = obj.rest();
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!part.isFixnum()) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject is_this_a_numeric_spanP(final SubLObject obj) {
        if (!obj.isCons()) {
            return NIL;
        }
        SubLObject cdolist_list_var = obj;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!part.isFixnum()) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject dependent_span_coverage(final SubLObject dependents) {
        final SubLObject dep_coverage = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject dep_span = NIL;
        SubLObject cdolist_list_var = dependents;
        SubLObject this_dep = NIL;
        this_dep = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != itp_node_p(this_dep)) {
                dep_span = itp_node_span(this_dep);
            } else
                if (NIL != is_this_a_thelist_spanP(this_dep)) {
                    dep_span = this_dep.rest();
                } else
                    if (NIL != is_this_a_numeric_spanP(this_dep)) {
                        dep_span = this_dep;
                    }


            SubLObject cdolist_list_var_$82 = dep_span;
            SubLObject n = NIL;
            n = cdolist_list_var_$82.first();
            while (NIL != cdolist_list_var_$82) {
                set.set_add(n, dep_coverage);
                cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                n = cdolist_list_var_$82.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            this_dep = cdolist_list_var.first();
        } 
        return Sort.sort(set.set_element_list(dep_coverage), $sym278$_, UNPROVIDED);
    }

    public static SubLObject initial_span_gap(final SubLObject self, final SubLObject dependents) {
        assert NIL != itp_node_p(self) : "iterative_template_parser.itp_node_p(self) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(self) " + self;
        final SubLObject dep_coverage = dependent_span_coverage(dependents);
        SubLObject initial_span = NIL;
        SubLObject span_knownP = NIL;
        if (NIL == span_knownP) {
            SubLObject csome_list_var = itp_node_span(self);
            SubLObject n = NIL;
            n = csome_list_var.first();
            while ((NIL == span_knownP) && (NIL != csome_list_var)) {
                if (NIL != subl_promotions.memberP(n, dep_coverage, UNPROVIDED, UNPROVIDED)) {
                    span_knownP = T;
                } else {
                    initial_span = cons(n, initial_span);
                }
                csome_list_var = csome_list_var.rest();
                n = csome_list_var.first();
            } 
        }
        return reverse(initial_span);
    }

    public static SubLObject full_span_coverageP(final SubLObject self, final SubLObject dependents) {
        assert NIL != itp_node_p(self) : "iterative_template_parser.itp_node_p(self) " + "CommonSymbols.NIL != iterative_template_parser.itp_node_p(self) " + self;
        return list_utilities.fast_sets_equalP(itp_node_span(self), dependent_span_coverage(dependents), UNPROVIDED);
    }

    public static SubLObject get_ternary_quant_fns() {
        if (NIL == $ternary_quant_fns$.getGlobalValue()) {
            final SubLObject the_fns = ask_utilities.ask_variable($sym279$_FUNC, $list280, $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != the_fns) {
                $ternary_quant_fns$.setGlobalValue(the_fns);
            } else {
                $ternary_quant_fns$.setGlobalValue($NONE);
            }
        }
        if (!$ternary_quant_fns$.getGlobalValue().eql($NONE)) {
            return $ternary_quant_fns$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject is_this_a_quant_fnP(final SubLObject obj) {
        if (!obj.isCons()) {
            return NIL;
        }
        if (NIL != subl_promotions.memberP(obj.first(), get_ternary_quant_fns(), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject surrogate_multi_word_componentP(final SubLObject surrogate) {
        return numL(TWO_INTEGER, length(third(surrogate)));
    }

    public static SubLObject reify_itp(SubLObject state) {
        if (state == UNPROVIDED) {
            state = $last_itp_state_created$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.mt_in_any_mtP($rtp_kb_parse_mt$.getDynamicValue(thread)) : "fort_types_interface.mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) " + "CommonSymbols.NIL != fort_types_interface.mt_in_any_mtP(iterative_template_parser.$rtp_kb_parse_mt$.getDynamicValue(thread)) " + $rtp_kb_parse_mt$.getDynamicValue(thread);
        if (NIL == fi.fi_assert_int(list($$genlMt, $rtp_kb_parse_mt$.getDynamicValue(thread), NIL != parsing_vars.$parse_tree_mt$.getDynamicValue(thread) ? parsing_vars.$parse_tree_mt$.getDynamicValue(thread) : $$ParseTreeSandboxMt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str285$Couldn_t_find_a_parse_tree_mt_to_, $rtp_kb_parse_mt$.getDynamicValue(thread));
        }
        SubLObject good_roots = NIL;
        SubLObject cdolist_list_var = itp_state_solution_set(state);
        SubLObject this_root = NIL;
        this_root = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == itp_node_parent(this_root)) {
                final SubLObject undo_assert_traceP = NIL;
                final SubLObject instructions = reify_itp_int(this_root);
                final SubLObject more_instructions = NIL;
                if (NIL != instructions) {
                    if (NIL == good_roots) {
                        good_roots = this_root;
                    } else
                        if (NIL != itp_node_p(good_roots)) {
                            SubLObject choice_cat = NIL;
                            if (NIL == choice_cat) {
                                choice_cat = $$SyntacticChoiceNode;
                            }
                            final SubLObject new_node = new_syntactic_choice_node($rtp_kb_parse_mt$.getDynamicValue(thread), Mapping.mapcar(ITP_NODE_SYNTACTIC_NODE, list(this_root, good_roots)), choice_cat, UNPROVIDED);
                            if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), new_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            }
                            good_roots = new_node;
                        } else {
                            final SubLObject choice_cat = NIL;
                            final SubLObject new_node = new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), NIL, UNPROVIDED);
                            if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                                fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), new_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            }
                            parsing_utilities.syntactic_node_add_dtr(new_node, itp_node_syntactic_node(this_root), NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                        }

                }
                SubLObject cdolist_list_var_$83 = instructions;
                SubLObject this_gaf = NIL;
                this_gaf = cdolist_list_var_$83.first();
                while (NIL != cdolist_list_var_$83) {
                    fi.fi_assert_int(this_gaf, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                    this_gaf = cdolist_list_var_$83.first();
                } 
                SubLObject cdolist_list_var_$84 = more_instructions;
                this_gaf = NIL;
                this_gaf = cdolist_list_var_$84.first();
                while (NIL != cdolist_list_var_$84) {
                    fi.fi_assert_int(this_gaf, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                    this_gaf = cdolist_list_var_$84.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_root = cdolist_list_var.first();
        } 
        if (NIL == good_roots) {
            return NIL;
        }
        return parsing_utilities.create_parse_tree_with_root_node(NIL != itp_node_p(good_roots) ? itp_node_syntactic_node(good_roots) : good_roots, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject reify_itp_int(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject itp_leafP = makeBoolean((NIL == itp_node_children(self)) && (NIL == itp_node_syntactic_node(self)));
        final SubLObject valid_children = (NIL != itp_leafP) ? NIL : itp_node_get_legitimate_children(self);
        SubLObject these_instructions = NIL;
        if ((NIL == valid_children) && (NIL == itp_leafP)) {
            return NIL;
        }
        final SubLObject my_component = itp_node_component(self);
        SubLObject my_category = (NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) ? parsing_utilities.result_of_parsing_category(my_component) : NIL;
        final SubLObject my_real_parent = itp_node_parent(self);
        SubLObject my_kb_parent = NIL;
        SubLObject my_kb_node = itp_node_syntactic_node(self);
        final SubLObject my_meaning = itp_node_new_parse(self);
        if (NIL == my_category) {
            my_category = (NIL != my_real_parent) ? $$SyntacticNode_Sentential : $$SyntacticNode_MatrixClause;
        }
        if (NIL != my_real_parent) {
            my_kb_parent = itp_choice_node_for_component(my_real_parent, my_component);
            if (NIL == my_kb_parent) {
                my_kb_parent = itp_node_syntactic_node(my_real_parent);
            }
        }
        if ((NIL != itp_node_p(my_real_parent)) && (NIL == my_kb_node)) {
            SubLObject csome_list_var = itp_node_get_legitimate_children(my_real_parent);
            SubLObject other_child = NIL;
            other_child = csome_list_var.first();
            while ((NIL == my_kb_node) && (NIL != csome_list_var)) {
                if ((!other_child.equal(self)) && itp_node_component(self).equal(itp_node_component(other_child))) {
                    my_kb_node = itp_node_syntactic_node(other_child);
                }
                csome_list_var = csome_list_var.rest();
                other_child = csome_list_var.first();
            } 
        }
        if (NIL == my_kb_node) {
            final SubLObject _prev_bind_0 = $kb_node_gathering_modeP$.currentBinding(thread);
            try {
                $kb_node_gathering_modeP$.bind(T, thread);
                final SubLObject choice_cat = my_category;
                thread.resetMultipleValues();
                final SubLObject new_node = new_syntactic_functional_node($rtp_kb_parse_mt$.getDynamicValue(thread), my_category, UNPROVIDED);
                final SubLObject new_gafs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != forts.fort_p($$CycRecursiveTemplateParser)) {
                    fi.fi_assert_int(list($$syntacticNodeCreator, list($$InstanceWithRelationFromFn, list($$ProgramCopyFn, $$CycRecursiveTemplateParser), $$partOfIBT, $$Cyc), new_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                SubLObject cdolist_list_var = new_gafs;
                SubLObject test_gaf = NIL;
                test_gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    these_instructions = cons(test_gaf, these_instructions);
                    cdolist_list_var = cdolist_list_var.rest();
                    test_gaf = cdolist_list_var.first();
                } 
                my_kb_node = new_node;
                if (NIL != parsing_utilities.result_of_parsing_formulaP(my_component)) {
                    these_instructions = cons(list($$syntacticNodeString, my_kb_node, parsing_utilities.result_of_parsing_words(my_component)), these_instructions);
                } else
                    if (NIL != join_template_components_node_p(self)) {
                        these_instructions = cons(list($$syntacticNodeString, my_kb_node, join_template_components_node_word_list(self)), these_instructions);
                    }

                cdolist_list_var = valid_children;
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject this_child_node = itp_node_syntactic_node(child);
                    if ((NIL != this_child_node) && (NIL == ask_utilities.ask_variable($sym287$_N, list($$syntacticNodeNthDaughter, my_kb_node, $sym287$_N, this_child_node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        parsing_utilities.syntactic_node_add_dtr(my_kb_node, this_child_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                        if (NIL != full_span_coverageP(self, list(child))) {
                            SubLObject cdolist_list_var_$85 = parsing_utilities.syntactic_node_proposed_meanings(this_child_node, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED);
                            SubLObject meaning = NIL;
                            meaning = cdolist_list_var_$85.first();
                            while (NIL != cdolist_list_var_$85) {
                                these_instructions = cons(list($$dependentMeaning, my_kb_node, meaning, this_child_node, meaning), these_instructions);
                                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                meaning = cdolist_list_var_$85.first();
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
            } finally {
                $kb_node_gathering_modeP$.rebind(_prev_bind_0, thread);
            }
        }
        _csetf_itp_node_syntactic_node(self, my_kb_node);
        if ((my_category.eql($$VPTemplate) && (NIL == valid_children)) && (NIL != isa.isa_in_any_mtP(my_kb_parent, $$SyntacticChoiceNode))) {
            these_instructions = cons(list($$excludedOptionNodes, my_kb_parent, my_kb_node), these_instructions);
        }
        if ((NIL != my_real_parent) && (NIL == my_kb_parent)) {
            my_kb_parent = itp_node_syntactic_node(my_real_parent);
        }
        if (NIL != my_kb_parent) {
            if (NIL != isa.isa_in_any_mtP(my_kb_parent, $$SyntacticChoiceNode)) {
                these_instructions = cons(list($$optionNodes, my_kb_parent, my_kb_node), these_instructions);
            } else
                if (NIL == ask_utilities.ask_variable($sym287$_N, list($$syntacticNodeNthDaughter, my_kb_parent, $sym287$_N, my_kb_node), $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    parsing_utilities.syntactic_node_add_dtr(my_kb_parent, my_kb_node, NIL, $rtp_kb_parse_mt$.getDynamicValue(thread));
                }

        }
        SubLObject cdolist_list_var2 = valid_children;
        SubLObject this_child = NIL;
        this_child = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject v_answer = itp_node_find_or_initialize_syntactic_choices(self, itp_node_component(this_child));
            final SubLObject the_gafs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_answer) {
                SubLObject cdolist_list_var_$86 = the_gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var_$86.first();
                while (NIL != cdolist_list_var_$86) {
                    these_instructions = cons(gaf, these_instructions);
                    cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                    gaf = cdolist_list_var_$86.first();
                } 
            }
            final SubLObject gafs = reify_itp_int(this_child);
            final SubLObject join_componentP = join_template_components_node_p(self);
            final SubLObject need_componentP = makeBoolean((NIL == join_componentP) && (NIL != list_utilities.sublisp_boolean(list_utilities.tree_find_if($sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED))));
            final SubLObject kids_component = (NIL != need_componentP) ? itp_node_component(this_child) : NIL;
            if (NIL != list_utilities.proper_list_p(gafs)) {
                SubLObject cdolist_list_var_$87 = gafs;
                SubLObject this_gaf = NIL;
                this_gaf = cdolist_list_var_$87.first();
                while (NIL != cdolist_list_var_$87) {
                    these_instructions = cons(this_gaf, these_instructions);
                    if (((NIL != need_componentP) && cycl_utilities.formula_arg1(this_gaf, UNPROVIDED).eql(itp_node_syntactic_node(this_child))) && (cycl_utilities.formula_arg0(this_gaf).eql($$proposedMeaning) || cycl_utilities.formula_arg0(this_gaf).eql($$dependentMeaning))) {
                        final SubLObject kids_meaning = cycl_utilities.formula_arg2(this_gaf, UNPROVIDED);
                        SubLObject this_meaning = list_utilities.tree_substitute(my_meaning, kids_component, kids_meaning);
                        if (this_meaning.equalp(my_meaning)) {
                            this_meaning = copy_tree(kids_meaning);
                        }
                        if (!cycl_utilities.formula_arg0(this_meaning).eql($$SubLQuoteFn)) {
                            this_meaning = list($$SubLQuoteFn, this_meaning);
                        }
                        these_instructions = cons(list($$dependentMeaning, my_kb_node, this_meaning, itp_node_syntactic_node(this_child), kids_meaning), these_instructions);
                    }
                    cdolist_list_var_$87 = cdolist_list_var_$87.rest();
                    this_gaf = cdolist_list_var_$87.first();
                } 
            } else
                if (NIL != $kb_node_gathering_modeP$.getDynamicValue(thread)) {
                    kill_syntactic_node_tree(my_kb_node);
                    return NIL;
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            this_child = cdolist_list_var2.first();
        } 
        if (((NIL != join_template_components_node_p(self)) && (NIL != isa.isaP(my_kb_node, $$SyntacticNode_Sentential, $rtp_kb_parse_mt$.getDynamicValue(thread), UNPROVIDED))) && cycl_utilities.formula_arg1(my_meaning, UNPROVIDED).equal($list290)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(cycl_utilities.formula_arg2(my_meaning, UNPROVIDED), UNPROVIDED);
            SubLObject subj_component = NIL;
            SubLObject vp_component = NIL;
            destructuring_bind_must_consp(current, datum, $list291);
            subj_component = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list291);
            vp_component = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject subj_options = NIL;
                SubLObject subj_nodes = NIL;
                SubLObject vp_options = NIL;
                SubLObject vp_nodes = NIL;
                SubLObject cdolist_list_var3 = valid_children;
                SubLObject this_child2 = NIL;
                this_child2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    final SubLObject this_component = itp_node_component(this_child2);
                    final SubLObject this_node = itp_node_syntactic_node(this_child2);
                    if (this_component.equal(subj_component)) {
                        subj_nodes = cons(this_node, subj_nodes);
                    } else
                        if (this_component.equal(vp_component)) {
                            vp_nodes = cons(this_node, vp_nodes);
                        }

                    cdolist_list_var3 = cdolist_list_var3.rest();
                    this_child2 = cdolist_list_var3.first();
                } 
                cdolist_list_var3 = these_instructions;
                SubLObject this_gaf2 = NIL;
                this_gaf2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    if (cycl_utilities.formula_arg0(this_gaf2).eql($$proposedMeaning) || cycl_utilities.formula_arg0(this_gaf2).eql($$dependentMeaning)) {
                        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg1(this_gaf2, UNPROVIDED), subj_nodes, UNPROVIDED, UNPROVIDED)) {
                            final SubLObject item_var = list(cycl_utilities.formula_arg1(this_gaf2, UNPROVIDED), cycl_utilities.formula_arg2(this_gaf2, UNPROVIDED));
                            if (NIL == member(item_var, subj_options, EQUAL, symbol_function(IDENTITY))) {
                                subj_options = cons(item_var, subj_options);
                            }
                        } else
                            if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg1(this_gaf2, UNPROVIDED), vp_nodes, UNPROVIDED, UNPROVIDED)) {
                                final SubLObject item_var = list(cycl_utilities.formula_arg1(this_gaf2, UNPROVIDED), cycl_utilities.formula_arg2(this_gaf2, UNPROVIDED));
                                if (NIL == member(item_var, vp_options, EQUAL, symbol_function(IDENTITY))) {
                                    vp_options = cons(item_var, vp_options);
                                }
                            }

                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    this_gaf2 = cdolist_list_var3.first();
                } 
                cdolist_list_var3 = subj_nodes;
                SubLObject node = NIL;
                node = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    SubLObject cdolist_list_var_$88 = parsing_utilities.syntactic_node_proposed_meanings(node, $rtp_kb_parse_mt$.getDynamicValue(thread), $$proposedMeaning);
                    SubLObject this_meaning2 = NIL;
                    this_meaning2 = cdolist_list_var_$88.first();
                    while (NIL != cdolist_list_var_$88) {
                        final SubLObject item_var2 = list(node, this_meaning2);
                        if (NIL == member(item_var2, subj_options, EQUAL, symbol_function(IDENTITY))) {
                            subj_options = cons(item_var2, subj_options);
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
                while (NIL != cdolist_list_var3) {
                    SubLObject cdolist_list_var_$89 = parsing_utilities.syntactic_node_proposed_meanings(node, $rtp_kb_parse_mt$.getDynamicValue(thread), $$proposedMeaning);
                    SubLObject this_meaning2 = NIL;
                    this_meaning2 = cdolist_list_var_$89.first();
                    while (NIL != cdolist_list_var_$89) {
                        final SubLObject item_var2 = list(node, this_meaning2);
                        if (NIL == member(item_var2, vp_options, EQUAL, symbol_function(IDENTITY))) {
                            vp_options = cons(item_var2, vp_options);
                        }
                        cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                        this_meaning2 = cdolist_list_var_$89.first();
                    } 
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    node = cdolist_list_var3.first();
                } 
                if ((NIL == subj_options) || (NIL == vp_options)) {
                    Errors.warn($str292$____can_t_build_any_meaning_combi, my_kb_node);
                } else {
                    cdolist_list_var3 = vp_options;
                    SubLObject this_vp_option = NIL;
                    this_vp_option = cdolist_list_var3.first();
                    while (NIL != cdolist_list_var3) {
                        SubLObject current_$91;
                        final SubLObject datum_$90 = current_$91 = this_vp_option;
                        SubLObject vp_node = NIL;
                        SubLObject vp_meaning = NIL;
                        destructuring_bind_must_consp(current_$91, datum_$90, $list293);
                        vp_node = current_$91.first();
                        current_$91 = current_$91.rest();
                        destructuring_bind_must_consp(current_$91, datum_$90, $list293);
                        vp_meaning = current_$91.first();
                        current_$91 = current_$91.rest();
                        if (NIL == current_$91) {
                            SubLObject cdolist_list_var_$90 = subj_options;
                            SubLObject this_subj_option = NIL;
                            this_subj_option = cdolist_list_var_$90.first();
                            while (NIL != cdolist_list_var_$90) {
                                SubLObject current_$92;
                                final SubLObject datum_$91 = current_$92 = this_subj_option;
                                SubLObject subj_node = NIL;
                                SubLObject subj_meaning = NIL;
                                destructuring_bind_must_consp(current_$92, datum_$91, $list294);
                                subj_node = current_$92.first();
                                current_$92 = current_$92.rest();
                                destructuring_bind_must_consp(current_$92, datum_$91, $list294);
                                subj_meaning = current_$92.first();
                                current_$92 = current_$92.rest();
                                if (NIL == current_$92) {
                                    SubLObject joined_meaning = list_utilities.tree_substitute(vp_meaning, $$TheSentenceSubject, subj_meaning);
                                    joined_meaning = list_utilities.tree_substitute(joined_meaning, $SUBJECT, subj_meaning);
                                    these_instructions = cons(list($$dependentMeaning, my_kb_node, joined_meaning, vp_node, vp_meaning), these_instructions);
                                    these_instructions = cons(list($$dependentMeaning, my_kb_node, joined_meaning, subj_node, subj_meaning), these_instructions);
                                } else {
                                    cdestructuring_bind_error(datum_$91, $list294);
                                }
                                cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                                this_subj_option = cdolist_list_var_$90.first();
                            } 
                        } else {
                            cdestructuring_bind_error(datum_$90, $list293);
                        }
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        this_vp_option = cdolist_list_var3.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list291);
            }
        }
        if (NIL == list_utilities.tree_find_if($sym289$RESULT_OF_PARSING_FORMULA_, my_meaning, UNPROVIDED)) {
            these_instructions = cons(list($$proposedMeaning, my_kb_node, my_meaning), these_instructions);
        }
        cdolist_list_var2 = itp_node_get_dominance_gafs(self);
        SubLObject this_gaf3 = NIL;
        this_gaf3 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            these_instructions = cons(this_gaf3, these_instructions);
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_gaf3 = cdolist_list_var2.first();
        } 
        return reverse(these_instructions);
    }

    public static SubLObject cat_itp(SubLObject state) {
        if (state == UNPROVIDED) {
            state = $last_itp_state_created$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != itp_state_p(state) : "iterative_template_parser.itp_state_p(state) " + "CommonSymbols.NIL != iterative_template_parser.itp_state_p(state) " + state;
        final SubLObject answers = itp_state_solution_set(state);
        final SubLObject todo = enqueue_solution_roots(queues.create_queue(UNPROVIDED), answers);
        final SubLObject result_hash = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED);
        SubLObject global_sub_list = NIL;
        SubLObject span = NIL;
        SubLObject section = NIL;
        SubLObject results = NIL;
        SubLObject sub_list = NIL;
        while (NIL == queues.queue_empty_p(todo)) {
            final SubLObject curr = queues.dequeue(todo);
            final SubLObject the_span = itp_node_span(curr);
            if (!span.equal(the_span)) {
                if (NIL != section) {
                    SubLObject cdolist_list_var = section;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        hash_table_utilities.pushnew_hash(span, cycl, result_hash, symbol_function(EQUAL));
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    } 
                }
                span = the_span;
                section = NIL;
            }
            thread.resetMultipleValues();
            final SubLObject section_$95 = perform_solution_node_analysis(state, curr, section, todo);
            final SubLObject sub_list_$96 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            section = section_$95;
            sub_list = sub_list_$96;
            global_sub_list = cconcatenate(global_sub_list, sub_list);
        } 
        if (NIL != section) {
            SubLObject cdolist_list_var2 = section;
            SubLObject cycl2 = NIL;
            cycl2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                hash_table_utilities.pushnew_hash(span, cycl2, result_hash, symbol_function(EQUAL));
                cdolist_list_var2 = cdolist_list_var2.rest();
                cycl2 = cdolist_list_var2.first();
            } 
        }
        SubLObject span_$97 = NIL;
        SubLObject cycl2 = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(result_hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                span_$97 = getEntryKey(cdohash_entry);
                cycl2 = getEntryValue(cdohash_entry);
                final SubLObject item_var = list(span_$97, cycl2);
                if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject temp_results = NIL;
        SubLObject temp_result = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            temp_result = result;
            SubLObject cdolist_list_var_$98 = global_sub_list;
            SubLObject sub = NIL;
            sub = cdolist_list_var_$98.first();
            while (NIL != cdolist_list_var_$98) {
                temp_result = subst(second(sub), sub.first(), temp_result, symbol_function(EQUAL), UNPROVIDED);
                if ((temp_result.isList() && second(temp_result).isList()) && (NIL != assertion_handles.assertion_p(second(temp_result).first()))) {
                    temp_result = list(temp_result.first(), cconcatenate(second(temp_result), third(sub)));
                }
                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                sub = cdolist_list_var_$98.first();
            } 
            final SubLObject item_var = temp_result;
            if (NIL == member(item_var, temp_results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                temp_results = cons(item_var, temp_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        results = temp_results;
        return sort_itp_results(results);
    }

    public static SubLObject transform_nl_quant_forms(SubLObject formula, final SubLObject span_incr) {
        if (NIL != nl_attr_w_locationP(formula)) {
            final SubLObject incremented = formula = replace_formula_arg(THREE_INTEGER, add(span_incr, cycl_utilities.formula_arg3(formula, UNPROVIDED)), formula);
        }
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL != forts.fort_p(formula)) {
            return formula;
        }
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        if (NIL != cycl_utilities.expression_find_if($sym297$NL_ATTR_W_LOCATION_, formula, UNPROVIDED, UNPROVIDED)) {
            return cons(transform_nl_quant_forms(cycl_utilities.formula_arg0(formula), span_incr), transform_nl_quant_forms(cycl_utilities.formula_args(formula, UNPROVIDED), span_incr));
        }
        return formula;
    }

    public static SubLObject nl_attr_w_locationP(final SubLObject formula) {
        return makeBoolean((NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(formula), $list298, UNPROVIDED, UNPROVIDED)) && (NIL != formula_arityE(formula, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject sort_itp_results(final SubLObject parses) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject constit = NIL;
        constit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constit_span = constit.first();
            SubLObject constit_good_result = NIL;
            SubLObject constit_bad_result = NIL;
            SubLObject cdolist_list_var_$99 = constit.rest().first();
            SubLObject cycl = NIL;
            cycl = cdolist_list_var_$99.first();
            while (NIL != cdolist_list_var_$99) {
                if (NIL != rtp_contains_invalid_surrogateP(cycl, parses)) {
                    constit_bad_result = cons(cycl, constit_bad_result);
                } else {
                    constit_good_result = cons(cycl, constit_good_result);
                }
                cdolist_list_var_$99 = cdolist_list_var_$99.rest();
                cycl = cdolist_list_var_$99.first();
            } 
            result = cons(list(constit_span, cconcatenate(reverse(constit_good_result), reverse(constit_bad_result))), result);
            cdolist_list_var = cdolist_list_var.rest();
            constit = cdolist_list_var.first();
        } 
        return Sort.sort(result, symbol_function($sym229$_), symbol_function(ITP_OUTPUT_SORTING_FUNCTION));
    }

    public static SubLObject rtp_contains_invalid_surrogateP(final SubLObject parse, final SubLObject parses) {
        final SubLObject surrogates = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(parse);
        SubLObject invalidP = NIL;
        if (NIL == surrogates) {
            return NIL;
        }
        if (NIL == invalidP) {
            SubLObject csome_list_var = surrogates;
            SubLObject surrogate = NIL;
            surrogate = csome_list_var.first();
            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                final SubLObject surrogate_index = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list(surrogate);
                if (NIL == find(surrogate_index, parses, EQUAL, FIRST, UNPROVIDED, UNPROVIDED)) {
                    invalidP = T;
                }
                csome_list_var = csome_list_var.rest();
                surrogate = csome_list_var.first();
            } 
        }
        return invalidP;
    }

    public static SubLObject unassembled_phraseP(final SubLObject formula) {
        return makeBoolean((formula.isList() && cycl_utilities.formula_arg0(formula).eql($$AssemblePhraseFn)) && (NIL != list_utilities.find_if_not(symbol_function(STRINGP), formula.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject transform_assemble_phrases(final SubLObject formula) {
        return values(transform_list_utilities.transform(formula, symbol_function($sym303$UNASSEMBLED_PHRASE_), symbol_function(REWRITE_ASSEMBLE_PHRASE), UNPROVIDED));
    }

    public static SubLObject perform_solution_node_analysis(final SubLObject state, final SubLObject node, SubLObject section, final SubLObject todo_list) {
        final SubLObject expression = transform_assemble_phrases(itp_node_new_parse(node));
        final SubLObject assertion = itp_node_assertion(node);
        final SubLObject join_templatesP = has_join_template_componentsP(expression);
        final SubLObject span_start = itp_node_span(node).first();
        SubLObject solution_list = NIL;
        if (((NIL != has_substitutable_childrenP(expression)) || (NIL != tp_substitutable_formulaP(expression))) || (NIL != join_templatesP)) {
            SubLObject cdolist_list_var = itp_node_children(node);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != tp_substitutable_formulaP(itp_node_component(child))) || (NIL != substitutable_child_nodeP(child))) {
                    SubLObject cdolist_list_var_$100;
                    final SubLObject modifieds = cdolist_list_var_$100 = tp_do_substitutions(expression, child, todo_list);
                    SubLObject modified = NIL;
                    modified = cdolist_list_var_$100.first();
                    while (NIL != cdolist_list_var_$100) {
                        final SubLObject cycl = modified.first();
                        final SubLObject asserts = second(modified);
                        SubLObject reformulated = (NIL != has_join_template_componentsP(cycl)) ? recognition.reformulate_jointemplatecomponents(cycl) : cycl;
                        final SubLObject assertion_set = cons(assertion, asserts);
                        if (NIL != reformulated) {
                            reformulated = transform_assemble_phrases(reformulated);
                            if (NIL == partial_parsesP(reformulated)) {
                                SubLObject cdolist_list_var_$101 = find_differences(expression, reformulated, UNPROVIDED);
                                SubLObject diff = NIL;
                                diff = cdolist_list_var_$101.first();
                                while (NIL != cdolist_list_var_$101) {
                                    final SubLObject item_var = list(diff.first(), second(diff), assertion_set);
                                    if (NIL == member(item_var, solution_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        solution_list = cons(item_var, solution_list);
                                    }
                                    cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                    diff = cdolist_list_var_$101.first();
                                } 
                                if (NIL != has_join_template_componentsP(reformulated)) {
                                    reformulated = recognition.reformulate_jointemplatecomponents(reformulated);
                                }
                                if (NIL == has_join_template_componentsP(reformulated)) {
                                    final SubLObject item_var2 = build_return_format(reformulated, assertion_set, span_start);
                                    if (NIL == member(item_var2, section, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        section = cons(item_var2, section);
                                    }
                                }
                            }
                        }
                        cdolist_list_var_$100 = cdolist_list_var_$100.rest();
                        modified = cdolist_list_var_$100.first();
                    } 
                } else {
                    SubLObject cdolist_list_var_$102 = itp_node_children(node);
                    SubLObject child_$103 = NIL;
                    child_$103 = cdolist_list_var_$102.first();
                    while (NIL != cdolist_list_var_$102) {
                        if (NIL == queues.queue_find(child_$103, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                            queues.enqueue(child_$103, todo_list);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        child_$103 = cdolist_list_var_$102.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        } else {
            if (NIL != expression) {
                final SubLObject item_var3 = build_return_format(NIL != has_join_template_componentsP(expression) ? recognition.reformulate_jointemplatecomponents(expression) : expression, list(assertion), span_start);
                if (NIL == member(item_var3, section, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    section = cons(item_var3, section);
                }
            }
            SubLObject cdolist_list_var = itp_node_children(node);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == queues.queue_find(child, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    queues.enqueue(child, todo_list);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        }
        return values(rtp_sort_constit_parses(section), solution_list);
    }

    public static SubLObject rtp_sort_constit_parses(final SubLObject parses) {
        return parses;
    }

    public static SubLObject merge_parse_results(final SubLObject parse1, final SubLObject parse2) {
        final SubLObject parse_iterator1 = rtp_iterators.new_itp_result_iterator(parse1, UNPROVIDED, UNPROVIDED);
        final SubLObject parse_iterator2 = rtp_iterators.new_itp_result_iterator(parse2, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        while (NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator1)) {
            final SubLObject span_iterator1 = rtp_iterators.itp_result_iterator_curr(parse_iterator1);
            final SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator1);
            final SubLObject span_iterator2 = rtp_iterators.find_itp_section_iterator(parse_iterator2, span);
            SubLObject span_result = NIL;
            if (NIL != span_iterator2) {
                span_result = rtp_iterators.itp_section_iterator_section(span_iterator2);
            }
            span_result = cconcatenate(span_result, rtp_iterators.itp_section_iterator_section(span_iterator1));
            result = cons(list(span, span_result), result);
            rtp_iterators.itp_result_iterator_next(parse_iterator1);
        } 
        while (NIL == rtp_iterators.itp_result_iterator_doneP(parse_iterator2)) {
            final SubLObject span_iterator3 = rtp_iterators.itp_result_iterator_curr(parse_iterator2);
            final SubLObject span = rtp_iterators.itp_section_iterator_span(span_iterator3);
            final SubLObject span_iterator4 = rtp_iterators.find_itp_section_iterator(parse_iterator1, span);
            SubLObject span_result = NIL;
            if (NIL == span_iterator4) {
                span_result = rtp_iterators.itp_section_iterator_section(span_iterator3);
                result = cons(list(span, span_result), result);
            }
            rtp_iterators.itp_result_iterator_next(parse_iterator2);
        } 
        return Sort.sort(result, $sym229$_, ITP_OUTPUT_SORTING_FUNCTION);
    }

    public static SubLObject find_differences(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUALP;
        }
        if (NIL != funcall(test, list1, list2)) {
            return NIL;
        }
        if ((NIL != constant_p(list1)) || (NIL != constant_p(list2))) {
            return list(list(list1, list2));
        }
        if ((list1.first().isAtom() || list2.first().isAtom()) && (NIL == funcall(test, list1.first(), list2.first()))) {
            return list(list(list1, list2));
        }
        return cconcatenate(find_differences(list1.first(), list2.first(), UNPROVIDED), find_differences(list1.rest(), list2.rest(), UNPROVIDED));
    }

    public static SubLObject build_return_format(SubLObject sem, final SubLObject assertion, final SubLObject span_start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sem = transform_nl_quant_forms(sem, span_start);
        final SubLObject pcase_var = rtp_vars.$rtp_return_style$.getDynamicValue(thread);
        if (pcase_var.eql($SIMPLE)) {
            return sem;
        }
        if (pcase_var.eql($ASSERTION)) {
            return list(sem, assertion);
        }
        return NIL;
    }

    public static SubLObject cat_for_result(final SubLObject justification) {
        if (justification.isList() && (NIL != assertion_handles.assertion_p(justification.first()))) {
            return assertions_high.gaf_arg1(justification.first());
        }
        return justification.first();
    }

    public static SubLObject force_for_result(final SubLObject justification) {
        if (justification.isList() && (justification.first().eql($$NPTemplate) || (NIL != lexicon_accessors.npP(justification.first())))) {
            return $$termTemplate;
        }
        if (justification.isList() && ((NIL != subl_promotions.memberP(justification.first(), $list307, UNPROVIDED, UNPROVIDED)) || (NIL != lexicon_accessors.vbarP(justification.first())))) {
            return $$assertTemplate;
        }
        if (justification.first().eql($$Adjective)) {
            return $$termTemplate;
        }
        if ((!justification.isList()) || (NIL == assertion_handles.assertion_p(justification.first()))) {
            Errors.warn($str315$sent__S_to_force_for_result__, justification);
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = assertions_high.gaf_arg0(justification.first());
        if (pcase_var.eql($$termTemplate)) {
            return $$termTemplate;
        }
        if (pcase_var.eql($$termTemplate_Reln)) {
            return $$termTemplate;
        }
        if (pcase_var.eql($$termTemplate_Test)) {
            return $$termTemplate;
        }
        if (pcase_var.eql($$assertTemplate)) {
            return $$assertTemplate;
        }
        if (pcase_var.eql($$assertTemplate_Reln)) {
            return $$assertTemplate;
        }
        if (pcase_var.eql($$assertTemplate_Test)) {
            return $$assertTemplate;
        }
        if (pcase_var.eql($$queryTemplate)) {
            return $$queryTemplate;
        }
        if (pcase_var.eql($$queryTemplate_Reln)) {
            return $$queryTemplate;
        }
        if (pcase_var.eql($$queryTemplate_Test)) {
            return $$queryTemplate;
        }
        return NIL;
    }

    public static SubLObject tp_do_substitutions(final SubLObject expression, final SubLObject node, final SubLObject todo_list) {
        return tp_do_substitutions_int(list(expression, NIL), node, todo_list);
    }

    public static SubLObject tp_do_substitutions_int(final SubLObject expression, final SubLObject node, final SubLObject todo_list) {
        SubLObject result = NIL;
        SubLObject this_result = NIL;
        if (NIL != substitutable_child_nodeP(node)) {
            this_result = list(subst(itp_node_new_parse(node), itp_node_component(node), expression.first(), symbol_function(EQUALP), UNPROVIDED), cons(itp_node_assertion(node), second(expression)));
            if (NIL != has_substitutable_childrenP(this_result.first())) {
                SubLObject cdolist_list_var = itp_node_children(node);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$104 = tp_do_substitutions_int(this_result, child, todo_list);
                    SubLObject child_result = NIL;
                    child_result = cdolist_list_var_$104.first();
                    while (NIL != cdolist_list_var_$104) {
                        result = cons(child_result, result);
                        cdolist_list_var_$104 = cdolist_list_var_$104.rest();
                        child_result = cdolist_list_var_$104.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
            } else {
                result = cons(this_result, result);
                if (NIL == queues.queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    queues.enqueue(node, todo_list);
                }
            }
        } else
            if (NIL != tp_substitutable_formulaP(expression.first())) {
                result = cons(list(itp_node_new_parse(node), list(itp_node_assertion(node))), result);
                if (NIL == queues.queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    queues.enqueue(node, todo_list);
                }
            } else {
                result = list(expression);
                if (NIL == queues.queue_find(node, todo_list, symbol_function(EQUALP), UNPROVIDED)) {
                    queues.enqueue(node, todo_list);
                }
            }

        return result;
    }

    public static SubLObject tp_substitutable_formulaP(final SubLObject formula) {
        if (NIL == collection_defns.el_expressionP(formula)) {
            return NIL;
        }
        final SubLObject v_arity = expression_arity(formula, UNPROVIDED);
        return makeBoolean(((v_arity.isInteger() && v_arity.numE(FOUR_INTEGER)) && (NIL != parsing_utilities.result_of_parsing_formulaP(formula))) && (NIL != member(cycl_utilities.formula_arg3(formula, UNPROVIDED), $list316, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject substitutable_child_nodeP(final SubLObject node) {
        return substitutable_child_formulaP(itp_node_component(node));
    }

    public static SubLObject substitutable_child_formulaP(final SubLObject formula) {
        if (formula.isList()) {
            return makeBoolean((NIL != parsing_utilities.result_of_parsing_formulaP(formula)) && (NIL != verbal_template_categoryP(parsing_utilities.result_of_parsing_category(formula))));
        }
        return NIL;
    }

    public static SubLObject enqueue_solution_roots(final SubLObject queue, final SubLObject answers) {
        SubLObject cdolist_list_var = answers;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == itp_node_parent(node)) {
                queues.enqueue(node, queue);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return queue;
    }

    public static SubLObject join_template_components_p(final SubLObject formula) {
        return eql(cycl_utilities.formula_arg0(formula), $$joinTemplateComponents);
    }

    public static SubLObject join_template_components_node_p(final SubLObject node) {
        if ((NIL != itp_node_p(node)) && (NIL != join_template_components_p(itp_node_new_parse(node)))) {
            return itp_node_new_parse(node);
        }
        return NIL;
    }

    public static SubLObject join_template_components_word_list(final SubLObject formula) {
        if (NIL != join_template_components_p(formula)) {
            SubLObject all_words = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), $IGNORE);
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != parsing_utilities.result_of_parsing_formulaP(result)) {
                    SubLObject cdolist_list_var_$105 = rkf_concept_harvester.rkf_ch_string_tokenize(parsing_utilities.result_of_parsing_words(result));
                    SubLObject this_word = NIL;
                    this_word = cdolist_list_var_$105.first();
                    while (NIL != cdolist_list_var_$105) {
                        all_words = cons(this_word, all_words);
                        cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                        this_word = cdolist_list_var_$105.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
            return string_utilities.bunge(reverse(all_words), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject join_template_components_node_word_list(final SubLObject node) {
        final SubLObject formula = join_template_components_node_p(node);
        if (NIL != formula) {
            return join_template_components_word_list(formula);
        }
        return NIL;
    }

    public static SubLObject has_join_template_componentsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != recognition.$perform_template_component_join$.getDynamicValue(thread)) && (NIL != list_utilities.tree_find($$joinTemplateComponents, formula, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject has_substitutable_childrenP(final SubLObject formula) {
        return list_utilities.tree_find_if($sym319$SUBSTITUTABLE_CHILD_FORMULA_, formula, UNPROVIDED);
    }

    public static SubLObject partial_parse_filter_function(final SubLObject item) {
        return makeBoolean(item.eql($$TheSentenceSubject) || item.isKeyword());
    }

    public static SubLObject partial_parsesP(final SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(PARTIAL_PARSE_FILTER_FUNCTION), formula, UNPROVIDED);
    }

    public static SubLObject declare_iterative_template_parser_file() {
        declareFunction(me, "kb_node_analyze_category", "KB-NODE-ANALYZE-CATEGORY", 2, 0, false);
        declareFunction(me, "reset_kb_node_internal_counter", "RESET-KB-NODE-INTERNAL-COUNTER", 0, 0, false);
        declareFunction(me, "next_available_kb_node", "NEXT-AVAILABLE-KB-NODE", 2, 1, false);
        declareFunction(me, "new_syntactic_functional_node", "NEW-SYNTACTIC-FUNCTIONAL-NODE", 1, 2, false);
        declareFunction(me, "new_syntactic_choice_node", "NEW-SYNTACTIC-CHOICE-NODE", 1, 3, false);
        declareFunction(me, "kb_nodes_kill", "KB-NODES-KILL", 1, 0, false);
        declareFunction(me, "kill_syntactic_node_tree", "KILL-SYNTACTIC-NODE-TREE", 1, 0, false);
        declareMacro(me, "with_new_syntactic_kb_node", "WITH-NEW-SYNTACTIC-KB-NODE");
        declareMacro(me, "with_new_syntactic_kb_node_wXgafs", "WITH-NEW-SYNTACTIC-KB-NODE-W/GAFS");
        declareFunction(me, "syntactic_option_node_p", "SYNTACTIC-OPTION-NODE-P", 1, 0, false);
        declareFunction(me, "cb_link_syntactic_node_toolkit", "CB-LINK-SYNTACTIC-NODE-TOOLKIT", 1, 0, false);
        declareFunction(me, "exclude_syntactic_option", "EXCLUDE-SYNTACTIC-OPTION", 1, 0, false);
        declareFunction(me, "restore_syntactic_option", "RESTORE-SYNTACTIC-OPTION", 1, 0, false);
        declareFunction(me, "asserting_treesP", "ASSERTING-TREES?", 0, 0, false);
        declareMacro(me, "while_saving_rtp_parse_into_kb", "WHILE-SAVING-RTP-PARSE-INTO-KB");
        declareFunction(me, "save_rtp_kb_parse_if_desired", "SAVE-RTP-KB-PARSE-IF-DESIRED", 1, 0, false);
        declareFunction(me, "get_rtp_kb_parse_node", "GET-RTP-KB-PARSE-NODE", 0, 0, false);
        declareFunction(me, "get_and_erase_rtp_kb_parse_node", "GET-AND-ERASE-RTP-KB-PARSE-NODE", 0, 0, false);
        declareMacro(me, "with_the_rtp_parse_tokenization", "WITH-THE-RTP-PARSE-TOKENIZATION");
        declareFunction(me, "rtp_component_tokenization", "RTP-COMPONENT-TOKENIZATION", 1, 1, false);
        declareFunction(me, "rtp_parse_exp", "RTP-PARSE-EXP", 1, 3, false);
        declareFunction(me, "rtp_parse_exp_wXvpp", "RTP-PARSE-EXP-W/VPP", 1, 3, false);
        declareFunction(me, "rtp_parse_wXvpp", "RTP-PARSE-W/VPP", 1, 3, false);
        declareFunction(me, "itp_sequel", "ITP-SEQUEL", 1, 3, false);
        declareFunction(me, "categorized_rtp_parse_exp", "CATEGORIZED-RTP-PARSE-EXP", 1, 3, false);
        declareFunction(me, "categorized_itp_sequel", "CATEGORIZED-ITP-SEQUEL", 1, 3, false);
        declareFunction(me, "delete_duplicate_tp_results", "DELETE-DUPLICATE-TP-RESULTS", 1, 0, false);
        declareFunction(me, "itp_rewrite", "ITP-REWRITE", 1, 3, false);
        declareFunction(me, "rewrites_only", "REWRITES-ONLY", 1, 0, false);
        declareFunction(me, "rewrites_helper", "REWRITES-HELPER", 1, 0, false);
        declareFunction(me, "itp_nuke_syntactic_nodes", "ITP-NUKE-SYNTACTIC-NODES", 0, 1, false);
        declareFunction(me, "itp_node_print_function_trampoline", "ITP-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "itp_node_p", "ITP-NODE-P", 1, 0, false);
        new iterative_template_parser.$itp_node_p$UnaryFunction();
        declareFunction(me, "itp_node_id", "ITP-NODE-ID", 1, 0, false);
        declareFunction(me, "itp_node_parent", "ITP-NODE-PARENT", 1, 0, false);
        declareFunction(me, "itp_node_component", "ITP-NODE-COMPONENT", 1, 0, false);
        declareFunction(me, "itp_node_span", "ITP-NODE-SPAN", 1, 0, false);
        declareFunction(me, "itp_node_new_parse", "ITP-NODE-NEW-PARSE", 1, 0, false);
        declareFunction(me, "itp_node_assertion", "ITP-NODE-ASSERTION", 1, 0, false);
        declareFunction(me, "itp_node_children", "ITP-NODE-CHILDREN", 1, 0, false);
        declareFunction(me, "itp_node_permutations", "ITP-NODE-PERMUTATIONS", 1, 0, false);
        declareFunction(me, "itp_node_syntactic_node", "ITP-NODE-SYNTACTIC-NODE", 1, 0, false);
        declareFunction(me, "itp_node_syntactic_choices", "ITP-NODE-SYNTACTIC-CHOICES", 1, 0, false);
        declareFunction(me, "_csetf_itp_node_id", "_CSETF-ITP-NODE-ID", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_parent", "_CSETF-ITP-NODE-PARENT", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_component", "_CSETF-ITP-NODE-COMPONENT", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_span", "_CSETF-ITP-NODE-SPAN", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_new_parse", "_CSETF-ITP-NODE-NEW-PARSE", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_assertion", "_CSETF-ITP-NODE-ASSERTION", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_children", "_CSETF-ITP-NODE-CHILDREN", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_permutations", "_CSETF-ITP-NODE-PERMUTATIONS", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_syntactic_node", "_CSETF-ITP-NODE-SYNTACTIC-NODE", 2, 0, false);
        declareFunction(me, "_csetf_itp_node_syntactic_choices", "_CSETF-ITP-NODE-SYNTACTIC-CHOICES", 2, 0, false);
        declareFunction(me, "make_itp_node", "MAKE-ITP-NODE", 0, 1, false);
        declareFunction(me, "visit_defstruct_itp_node", "VISIT-DEFSTRUCT-ITP-NODE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_itp_node_method", "VISIT-DEFSTRUCT-OBJECT-ITP-NODE-METHOD", 2, 0, false);
        declareFunction(me, "print_itp_node", "PRINT-ITP-NODE", 3, 0, false);
        declareFunction(me, "construct_itp_node", "CONSTRUCT-ITP-NODE", 5, 0, false);
        declareFunction(me, "add_itp_node_child", "ADD-ITP-NODE-CHILD", 2, 1, false);
        declareFunction(me, "itp_node_create_initial_head", "ITP-NODE-CREATE-INITIAL-HEAD", 3, 0, false);
        declareFunction(me, "itp_node_get_legitimate_children", "ITP-NODE-GET-LEGITIMATE-CHILDREN", 1, 0, false);
        declareFunction(me, "itp_node_get_dominance_gafs", "ITP-NODE-GET-DOMINANCE-GAFS", 1, 0, false);
        declareFunction(me, "itp_node_clear_syntactic_choices", "ITP-NODE-CLEAR-SYNTACTIC-CHOICES", 1, 1, false);
        declareFunction(me, "itp_node_initialize_syntactic_choices", "ITP-NODE-INITIALIZE-SYNTACTIC-CHOICES", 1, 1, false);
        declareFunction(me, "itp_choice_node_for_component", "ITP-CHOICE-NODE-FOR-COMPONENT", 2, 0, false);
        declareFunction(me, "itp_node_find_or_initialize_syntactic_choices", "ITP-NODE-FIND-OR-INITIALIZE-SYNTACTIC-CHOICES", 2, 0, false);
        declareFunction(me, "itp_node_tokenization", "ITP-NODE-TOKENIZATION", 1, 0, false);
        declareFunction(me, "itp_node_equalP", "ITP-NODE-EQUAL?", 2, 0, false);
        declareFunction(me, "find_or_create_itp_node_syntactic_node", "FIND-OR-CREATE-ITP-NODE-SYNTACTIC-NODE", 2, 2, false);
        declareFunction(me, "itp_state_print_function_trampoline", "ITP-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "itp_state_p", "ITP-STATE-P", 1, 0, false);
        new iterative_template_parser.$itp_state_p$UnaryFunction();
        declareFunction(me, "itp_state_sequence", "ITP-STATE-SEQUENCE", 1, 0, false);
        declareFunction(me, "itp_state_complete_parses_only", "ITP-STATE-COMPLETE-PARSES-ONLY", 1, 0, false);
        declareFunction(me, "itp_state_work_set", "ITP-STATE-WORK-SET", 1, 0, false);
        declareFunction(me, "itp_state_solution_set", "ITP-STATE-SOLUTION-SET", 1, 0, false);
        declareFunction(me, "itp_state_sentence", "ITP-STATE-SENTENCE", 1, 0, false);
        declareFunction(me, "itp_state_category", "ITP-STATE-CATEGORY", 1, 0, false);
        declareFunction(me, "itp_state_cache", "ITP-STATE-CACHE", 1, 0, false);
        declareFunction(me, "itp_state_psp_charts", "ITP-STATE-PSP-CHARTS", 1, 0, false);
        declareFunction(me, "itp_state_working_mt", "ITP-STATE-WORKING-MT", 1, 0, false);
        declareFunction(me, "_csetf_itp_state_sequence", "_CSETF-ITP-STATE-SEQUENCE", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_complete_parses_only", "_CSETF-ITP-STATE-COMPLETE-PARSES-ONLY", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_work_set", "_CSETF-ITP-STATE-WORK-SET", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_solution_set", "_CSETF-ITP-STATE-SOLUTION-SET", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_sentence", "_CSETF-ITP-STATE-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_category", "_CSETF-ITP-STATE-CATEGORY", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_cache", "_CSETF-ITP-STATE-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_psp_charts", "_CSETF-ITP-STATE-PSP-CHARTS", 2, 0, false);
        declareFunction(me, "_csetf_itp_state_working_mt", "_CSETF-ITP-STATE-WORKING-MT", 2, 0, false);
        declareFunction(me, "make_itp_state", "MAKE-ITP-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_itp_state", "VISIT-DEFSTRUCT-ITP-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_itp_state_method", "VISIT-DEFSTRUCT-OBJECT-ITP-STATE-METHOD", 2, 0, false);
        declareFunction(me, "print_itp_state", "PRINT-ITP-STATE", 3, 0, false);
        declareFunction(me, "new_itp_state", "NEW-ITP-STATE", 1, 2, false);
        declareFunction(me, "destroy_itp_state", "DESTROY-ITP-STATE", 1, 0, false);
        declareFunction(me, "new_itp_state_psp_chart_dictionary_internal", "NEW-ITP-STATE-PSP-CHART-DICTIONARY-INTERNAL", 0, 0, false);
        declareFunction(me, "new_itp_state_psp_chart_dictionary", "NEW-ITP-STATE-PSP-CHART-DICTIONARY", 0, 0, false);
        declareFunction(me, "add_to_itp_solution", "ADD-TO-ITP-SOLUTION", 2, 0, false);
        declareFunction(me, "memoize_itp_attempt", "MEMOIZE-ITP-ATTEMPT", 2, 0, false);
        declareFunction(me, "is_a_known_itp_attemptP", "IS-A-KNOWN-ITP-ATTEMPT?", 2, 0, false);
        declareFunction(me, "prime_itp_pump", "PRIME-ITP-PUMP", 2, 0, false);
        declareFunction(me, "extend_itp_state", "EXTEND-ITP-STATE", 5, 3, false);
        declareFunction(me, "extend_itp_state_multiple", "EXTEND-ITP-STATE-MULTIPLE", 5, 0, false);
        declareFunction(me, "extend_itp_state_by_ps_parse", "EXTEND-ITP-STATE-BY-PS-PARSE", 6, 0, false);
        declareFunction(me, "expand_itp_state", "EXPAND-ITP-STATE", 2, 0, false);
        declareFunction(me, "appropriate_span_for_np_parsingP", "APPROPRIATE-SPAN-FOR-NP-PARSING?", 2, 0, false);
        declareFunction(me, "appropriate_span_for_vbar_parsingP", "APPROPRIATE-SPAN-FOR-VBAR-PARSING?", 2, 0, false);
        declareFunction(me, "appropriate_span_for_nbar_parsingP", "APPROPRIATE-SPAN-FOR-NBAR-PARSING?", 2, 0, false);
        declareFunction(me, "itp_ps_get_cycls_for_phrase_internal", "ITP-PS-GET-CYCLS-FOR-PHRASE-INTERNAL", 6, 0, false);
        declareFunction(me, "itp_ps_get_cycls_for_phrase", "ITP-PS-GET-CYCLS-FOR-PHRASE", 6, 0, false);
        declareFunction(me, "itp_ps_parse_vbar_internal", "ITP-PS-PARSE-VBAR-INTERNAL", 2, 2, false);
        declareFunction(me, "itp_ps_parse_vbar", "ITP-PS-PARSE-VBAR", 2, 2, false);
        declareFunction(me, "itp_find_or_create_appropriate_chart", "ITP-FIND-OR-CREATE-APPROPRIATE-CHART", 4, 0, false);
        declareFunction(me, "get_chart_from_extra_psp_charts", "GET-CHART-FROM-EXTRA-PSP-CHARTS", 1, 0, false);
        declareFunction(me, "itp_subspanP", "ITP-SUBSPAN?", 2, 0, false);
        declareFunction(me, "gap_type_for_category", "GAP-TYPE-FOR-CATEGORY", 1, 0, false);
        declareFunction(me, "pred_for_category", "PRED-FOR-CATEGORY", 1, 0, false);
        declareFunction(me, "rtp_cat_for_pred", "RTP-CAT-FOR-PRED", 1, 0, false);
        declareFunction(me, "rtp_cat_for_pos", "RTP-CAT-FOR-POS", 1, 0, false);
        declareFunction(me, "pos_for_rtp_cat", "POS-FOR-RTP-CAT", 1, 0, false);
        declareFunction(me, "best_rtp_cat_for_preds", "BEST-RTP-CAT-FOR-PREDS", 1, 0, false);
        declareFunction(me, "clear_verb_phrasal_template_categoryP", "CLEAR-VERB-PHRASAL-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_verb_phrasal_template_categoryP", "REMOVE-VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "verb_phrasal_template_categoryP_internal", "VERB-PHRASAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "verb_phrasal_template_categoryP", "VERB-PHRASAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "clear_verbal_template_categoryP", "CLEAR-VERBAL-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_verbal_template_categoryP", "REMOVE-VERBAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "verbal_template_categoryP_internal", "VERBAL-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "verbal_template_categoryP", "VERBAL-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "clear_vbar_template_categoryP", "CLEAR-VBAR-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_vbar_template_categoryP", "REMOVE-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "vbar_template_categoryP_internal", "VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "vbar_template_categoryP", "VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "clear_rtp_vbar_template_categoryP", "CLEAR-RTP-VBAR-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_rtp_vbar_template_categoryP", "REMOVE-RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "rtp_vbar_template_categoryP_internal", "RTP-VBAR-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "rtp_vbar_template_categoryP", "RTP-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "extended_vbar_template_categoryP", "EXTENDED-VBAR-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "clear_predicative_adjp_template_categoryP", "CLEAR-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_predicative_adjp_template_categoryP", "REMOVE-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "predicative_adjp_template_categoryP_internal", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "predicative_adjp_template_categoryP", "PREDICATIVE-ADJP-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "clear_nominal_categoryP", "CLEAR-NOMINAL-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_nominal_categoryP", "REMOVE-NOMINAL-CATEGORY?", 1, 0, false);
        declareFunction(me, "nominal_categoryP_internal", "NOMINAL-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "nominal_categoryP", "NOMINAL-CATEGORY?", 1, 0, false);
        declareFunction(me, "clear_adjectival_categoryP", "CLEAR-ADJECTIVAL-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_adjectival_categoryP", "REMOVE-ADJECTIVAL-CATEGORY?", 1, 0, false);
        declareFunction(me, "adjectival_categoryP_internal", "ADJECTIVAL-CATEGORY?-INTERNAL", 1, 0, false);
        declareFunction(me, "adjectival_categoryP", "ADJECTIVAL-CATEGORY?", 1, 0, false);
        declareFunction(me, "number_template_categoryP", "NUMBER-TEMPLATE-CATEGORY?", 1, 0, false);
        declareFunction(me, "verbal_categoryP", "VERBAL-CATEGORY?", 1, 0, false);
        declareFunction(me, "expand_itp_state_completely", "EXPAND-ITP-STATE-COMPLETELY", 2, 0, false);
        declareFunction(me, "itp_node_max_child_span_length", "ITP-NODE-MAX-CHILD-SPAN-LENGTH", 1, 0, false);
        declareFunction(me, "itp_output_sorting_function", "ITP-OUTPUT-SORTING-FUNCTION", 1, 0, false);
        declareFunction(me, "compute_correct_span", "COMPUTE-CORRECT-SPAN", 2, 0, false);
        declareFunction(me, "adjust_the_spans", "ADJUST-THE-SPANS", 2, 1, false);
        declareFunction(me, "is_this_a_thelist_spanP", "IS-THIS-A-THELIST-SPAN?", 1, 0, false);
        declareFunction(me, "is_this_a_numeric_spanP", "IS-THIS-A-NUMERIC-SPAN?", 1, 0, false);
        declareFunction(me, "dependent_span_coverage", "DEPENDENT-SPAN-COVERAGE", 1, 0, false);
        declareFunction(me, "initial_span_gap", "INITIAL-SPAN-GAP", 2, 0, false);
        declareFunction(me, "full_span_coverageP", "FULL-SPAN-COVERAGE?", 2, 0, false);
        declareFunction(me, "get_ternary_quant_fns", "GET-TERNARY-QUANT-FNS", 0, 0, false);
        declareFunction(me, "is_this_a_quant_fnP", "IS-THIS-A-QUANT-FN?", 1, 0, false);
        declareFunction(me, "surrogate_multi_word_componentP", "SURROGATE-MULTI-WORD-COMPONENT?", 1, 0, false);
        declareFunction(me, "reify_itp", "REIFY-ITP", 0, 1, false);
        declareFunction(me, "reify_itp_int", "REIFY-ITP-INT", 1, 0, false);
        declareFunction(me, "cat_itp", "CAT-ITP", 0, 1, false);
        declareFunction(me, "transform_nl_quant_forms", "TRANSFORM-NL-QUANT-FORMS", 2, 0, false);
        declareFunction(me, "nl_attr_w_locationP", "NL-ATTR-W-LOCATION?", 1, 0, false);
        declareFunction(me, "sort_itp_results", "SORT-ITP-RESULTS", 1, 0, false);
        declareFunction(me, "rtp_contains_invalid_surrogateP", "RTP-CONTAINS-INVALID-SURROGATE?", 2, 0, false);
        declareFunction(me, "unassembled_phraseP", "UNASSEMBLED-PHRASE?", 1, 0, false);
        declareFunction(me, "transform_assemble_phrases", "TRANSFORM-ASSEMBLE-PHRASES", 1, 0, false);
        declareFunction(me, "perform_solution_node_analysis", "PERFORM-SOLUTION-NODE-ANALYSIS", 4, 0, false);
        declareFunction(me, "rtp_sort_constit_parses", "RTP-SORT-CONSTIT-PARSES", 1, 0, false);
        declareFunction(me, "merge_parse_results", "MERGE-PARSE-RESULTS", 2, 0, false);
        declareFunction(me, "find_differences", "FIND-DIFFERENCES", 2, 1, false);
        declareFunction(me, "build_return_format", "BUILD-RETURN-FORMAT", 3, 0, false);
        declareFunction(me, "cat_for_result", "CAT-FOR-RESULT", 1, 0, false);
        declareFunction(me, "force_for_result", "FORCE-FOR-RESULT", 1, 0, false);
        declareFunction(me, "tp_do_substitutions", "TP-DO-SUBSTITUTIONS", 3, 0, false);
        declareFunction(me, "tp_do_substitutions_int", "TP-DO-SUBSTITUTIONS-INT", 3, 0, false);
        declareFunction(me, "tp_substitutable_formulaP", "TP-SUBSTITUTABLE-FORMULA?", 1, 0, false);
        declareFunction(me, "substitutable_child_nodeP", "SUBSTITUTABLE-CHILD-NODE?", 1, 0, false);
        declareFunction(me, "substitutable_child_formulaP", "SUBSTITUTABLE-CHILD-FORMULA?", 1, 0, false);
        declareFunction(me, "enqueue_solution_roots", "ENQUEUE-SOLUTION-ROOTS", 2, 0, false);
        declareFunction(me, "join_template_components_p", "JOIN-TEMPLATE-COMPONENTS-P", 1, 0, false);
        declareFunction(me, "join_template_components_node_p", "JOIN-TEMPLATE-COMPONENTS-NODE-P", 1, 0, false);
        declareFunction(me, "join_template_components_word_list", "JOIN-TEMPLATE-COMPONENTS-WORD-LIST", 1, 0, false);
        declareFunction(me, "join_template_components_node_word_list", "JOIN-TEMPLATE-COMPONENTS-NODE-WORD-LIST", 1, 0, false);
        declareFunction(me, "has_join_template_componentsP", "HAS-JOIN-TEMPLATE-COMPONENTS?", 1, 0, false);
        declareFunction(me, "has_substitutable_childrenP", "HAS-SUBSTITUTABLE-CHILDREN?", 1, 0, false);
        declareFunction(me, "partial_parse_filter_function", "PARTIAL-PARSE-FILTER-FUNCTION", 1, 0, false);
        declareFunction(me, "partial_parsesP", "PARTIAL-PARSES?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_iterative_template_parser_file() {
        defparameter("*KB-NODE-GATHERING-MODE?*", NIL);
        defparameter("*KB-NODE-REIFY-AS-FUNCTIONS?*", NIL);
        defparameter("*KB-NODE-INTERNAL-COUNTER*", ZERO_INTEGER);
        defparameter("*LAST-ITP-STATE-CREATED*", NIL);
        defparameter("*RTP-GRAPHING-FILTER*", $RTP);
        defparameter("*RTP-TRACE-AGGRESSIVELY?*", NIL);
        defparameter("*RTP-KB-PARSE-MT*", NIL);
        defparameter("*RTP-EXHAUSTIVE-KB-PARSE?*", NIL);
        defparameter("*RTP-REIFY-DOOMED-PARSES?*", NIL);
        defparameter("*RTP-LATEST-KB-PARSE-TREE*", NIL);
        deflexical("*RTP-COMPONENT-TOKENIZATIONS*", SubLTrampolineFile.maybeDefault($rtp_component_tokenizations$, $rtp_component_tokenizations$, () -> dictionary.new_dictionary(EQUAL, UNPROVIDED)));
        defparameter("*RTP-RELEVANT-TOKENIZATION*", NIL);
        defconstant("*DTP-ITP-NODE*", ITP_NODE);
        defconstant("*DTP-ITP-STATE*", ITP_STATE);
        defparameter("*EXTEND-ITP-STATE-ANALYZE-ASSERTION?*", NIL);
        defparameter("*NPPARSE-GRAPH-TYPE*", $$$R);
        defparameter("*TRACE-ITP-STATE-EXPANSION*", NIL);
        defparameter("*POSSIBLE-NPS*", NIL);
        deflexical("*VERB-PHRASAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*VERBAL-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*RTP-VBAR-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*PREDICATIVE-ADJP-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*NOMINAL-CATEGORY?-CACHING-STATE*", NIL);
        deflexical("*ADJECTIVAL-CATEGORY?-CACHING-STATE*", NIL);
        defparameter("*COMPUTE-TOP-LEVEL-FORM-ONLY*", NIL);
        defparameter("*COMPUTE-ALL-RESOLVABLE-EXPANSIONS*", NIL);
        deflexical("*INFORM-ABOUT-PRUNED-TEMPLATES*", NIL);
        defparameter("*SET-OF-ATTEMPTED-SUBPARSES*", NIL);
        deflexical("*TERNARY-QUANT-FNS*", NIL);
        return NIL;
    }

    public static SubLObject setup_iterative_template_parser_file() {
        setup_cb_link_method($SYNTACTIC_NODE_TOOLKIT, CB_LINK_SYNTACTIC_NODE_TOOLKIT, ONE_INTEGER);
        html_macros.note_cgi_handler_function(EXCLUDE_SYNTACTIC_OPTION, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(RESTORE_SYNTACTIC_OPTION, $HTML_HANDLER);
        declare_defglobal($rtp_component_tokenizations$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_node$.getGlobalValue(), symbol_function(ITP_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list131);
        def_csetf(ITP_NODE_ID, _CSETF_ITP_NODE_ID);
        def_csetf(ITP_NODE_PARENT, _CSETF_ITP_NODE_PARENT);
        def_csetf(ITP_NODE_COMPONENT, _CSETF_ITP_NODE_COMPONENT);
        def_csetf(ITP_NODE_SPAN, _CSETF_ITP_NODE_SPAN);
        def_csetf(ITP_NODE_NEW_PARSE, _CSETF_ITP_NODE_NEW_PARSE);
        def_csetf(ITP_NODE_ASSERTION, _CSETF_ITP_NODE_ASSERTION);
        def_csetf(ITP_NODE_CHILDREN, _CSETF_ITP_NODE_CHILDREN);
        def_csetf(ITP_NODE_PERMUTATIONS, _CSETF_ITP_NODE_PERMUTATIONS);
        def_csetf(ITP_NODE_SYNTACTIC_NODE, _CSETF_ITP_NODE_SYNTACTIC_NODE);
        def_csetf(ITP_NODE_SYNTACTIC_CHOICES, _CSETF_ITP_NODE_SYNTACTIC_CHOICES);
        identity(ITP_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITP_NODE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_state$.getGlobalValue(), symbol_function(ITP_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list198);
        def_csetf(ITP_STATE_SEQUENCE, _CSETF_ITP_STATE_SEQUENCE);
        def_csetf(ITP_STATE_COMPLETE_PARSES_ONLY, _CSETF_ITP_STATE_COMPLETE_PARSES_ONLY);
        def_csetf(ITP_STATE_WORK_SET, _CSETF_ITP_STATE_WORK_SET);
        def_csetf(ITP_STATE_SOLUTION_SET, _CSETF_ITP_STATE_SOLUTION_SET);
        def_csetf(ITP_STATE_SENTENCE, _CSETF_ITP_STATE_SENTENCE);
        def_csetf(ITP_STATE_CATEGORY, _CSETF_ITP_STATE_CATEGORY);
        def_csetf(ITP_STATE_CACHE, _CSETF_ITP_STATE_CACHE);
        def_csetf(ITP_STATE_PSP_CHARTS, _CSETF_ITP_STATE_PSP_CHARTS);
        def_csetf(ITP_STATE_WORKING_MT, _CSETF_ITP_STATE_WORKING_MT);
        identity(ITP_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITP_STATE_METHOD));
        memoization_state.note_memoized_function(NEW_ITP_STATE_PSP_CHART_DICTIONARY);
        memoization_state.note_memoized_function(ITP_PS_GET_CYCLS_FOR_PHRASE);
        memoization_state.note_memoized_function(ITP_PS_PARSE_VBAR);
        memoization_state.note_globally_cached_function($sym254$VERB_PHRASAL_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym257$VERBAL_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym259$VBAR_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym262$RTP_VBAR_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym266$PREDICATIVE_ADJP_TEMPLATE_CATEGORY_);
        memoization_state.note_globally_cached_function($sym269$NOMINAL_CATEGORY_);
        memoization_state.note_globally_cached_function($sym271$ADJECTIVAL_CATEGORY_);
        return NIL;
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
































































































































































































































































































































































    }

    public static final class $itp_node_native extends SubLStructNative {
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

        private $itp_node_native() {
            this.$id = Lisp.NIL;
            this.$parent = Lisp.NIL;
            this.$component = Lisp.NIL;
            this.$span = Lisp.NIL;
            this.$new_parse = Lisp.NIL;
            this.$assertion = Lisp.NIL;
            this.$children = Lisp.NIL;
            this.$permutations = Lisp.NIL;
            this.$syntactic_node = Lisp.NIL;
            this.$syntactic_choices = Lisp.NIL;
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
            structDecl = makeStructDeclNative($itp_node_native.class, ITP_NODE, ITP_NODE_P, $list125, $list126, new String[]{ "$id", "$parent", "$component", "$span", "$new_parse", "$assertion", "$children", "$permutations", "$syntactic_node", "$syntactic_choices" }, $list127, $list128, PRINT_ITP_NODE);
        }
    }

    public static final class $itp_node_p$UnaryFunction extends UnaryFunction {
        public $itp_node_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return itp_node_p(arg1);
        }
    }

    public static final class $itp_state_native extends SubLStructNative {
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

        private $itp_state_native() {
            this.$sequence = Lisp.NIL;
            this.$complete_parses_only = Lisp.NIL;
            this.$work_set = Lisp.NIL;
            this.$solution_set = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$category = Lisp.NIL;
            this.$cache = Lisp.NIL;
            this.$psp_charts = Lisp.NIL;
            this.$working_mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($itp_state_native.class, ITP_STATE, ITP_STATE_P, $list192, $list193, new String[]{ "$sequence", "$complete_parses_only", "$work_set", "$solution_set", "$sentence", "$category", "$cache", "$psp_charts", "$working_mt" }, $list194, $list195, PRINT_ITP_STATE);
        }
    }

    public static final class $itp_state_p$UnaryFunction extends UnaryFunction {
        public $itp_state_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return itp_state_p(arg1);
        }
    }
}

/**
 * Total time: 2927 ms synthetic
 */
