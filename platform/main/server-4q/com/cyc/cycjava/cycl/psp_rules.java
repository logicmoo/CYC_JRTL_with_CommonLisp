package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.psp_rules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.psp_rules.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class psp_rules extends SubLTranslatedFile {
    public static final SubLFile me = new psp_rules();

    public static final String myName = "com.cyc.cycjava.cycl.psp_rules";

    public static final String myFingerPrint = "51ac9eadd0ee15bd9a92503f9ab276f9adc213a54045420746ce0e6e34b2e1f8";

    // defconstant
    public static final SubLSymbol $dtp_phrase_structure_parser_rule$ = makeSymbol("*DTP-PHRASE-STRUCTURE-PARSER-RULE*");

    // defparameter
    // Hashtable for storing phrase-structure rules used for parsing.
    private static final SubLSymbol $psp_rules$ = makeSymbol("*PSP-RULES*");

    // deflexical
    private static final SubLSymbol $psp_rule_fort_weights$ = makeSymbol("*PSP-RULE-FORT-WEIGHTS*");

    // defconstant
    public static final SubLSymbol $psp_rule_arity_weight$ = makeSymbol("*PSP-RULE-ARITY-WEIGHT*");







    // deflexical
    private static final SubLSymbol $psp_cycl_fails_constraintP_caching_state$ = makeSymbol("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*");











    // Internal Constants
    public static final SubLSymbol PHRASE_STRUCTURE_PARSER_RULE = makeSymbol("PHRASE-STRUCTURE-PARSER-RULE");

    public static final SubLSymbol PHRASE_STRUCTURE_PARSER_RULE_P = makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-P");

    public static final SubLList $list2 = list(makeSymbol("FORT"), makeSymbol("ARITY"), makeSymbol("CATEGORY"), makeSymbol("HEAD"), makeSymbol("CONSTRAINTS"), makeSymbol("SEMX"), makeSymbol("WEIGHT"));

    public static final SubLList $list3 = list(makeKeyword("FORT"), makeKeyword("ARITY"), makeKeyword("CATEGORY"), makeKeyword("HEAD"), makeKeyword("CONSTRAINTS"), makeKeyword("SEMX"), makeKeyword("WEIGHT"));

    public static final SubLList $list4 = list(makeSymbol("PSP-RULE-FORT"), makeSymbol("PSP-RULE-ARITY"), makeSymbol("PSP-RULE-CATEGORY"), makeSymbol("PSP-RULE-HEAD"), makeSymbol("PSP-RULE-CONSTRAINTS"), makeSymbol("PSP-RULE-SEMX"), makeSymbol("PSP-RULE-WEIGHT"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-PSP-RULE-FORT"), makeSymbol("_CSETF-PSP-RULE-ARITY"), makeSymbol("_CSETF-PSP-RULE-CATEGORY"), makeSymbol("_CSETF-PSP-RULE-HEAD"), makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS"), makeSymbol("_CSETF-PSP-RULE-SEMX"), makeSymbol("_CSETF-PSP-RULE-WEIGHT"));

    public static final SubLSymbol PPRINT_PSP_RULE = makeSymbol("PPRINT-PSP-RULE");

    public static final SubLSymbol PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-P"));

    private static final SubLSymbol PSP_RULE_FORT = makeSymbol("PSP-RULE-FORT");

    private static final SubLSymbol _CSETF_PSP_RULE_FORT = makeSymbol("_CSETF-PSP-RULE-FORT");

    private static final SubLSymbol PSP_RULE_ARITY = makeSymbol("PSP-RULE-ARITY");

    private static final SubLSymbol _CSETF_PSP_RULE_ARITY = makeSymbol("_CSETF-PSP-RULE-ARITY");

    private static final SubLSymbol PSP_RULE_CATEGORY = makeSymbol("PSP-RULE-CATEGORY");

    private static final SubLSymbol _CSETF_PSP_RULE_CATEGORY = makeSymbol("_CSETF-PSP-RULE-CATEGORY");

    private static final SubLSymbol PSP_RULE_HEAD = makeSymbol("PSP-RULE-HEAD");

    private static final SubLSymbol _CSETF_PSP_RULE_HEAD = makeSymbol("_CSETF-PSP-RULE-HEAD");

    private static final SubLSymbol PSP_RULE_CONSTRAINTS = makeSymbol("PSP-RULE-CONSTRAINTS");

    private static final SubLSymbol _CSETF_PSP_RULE_CONSTRAINTS = makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS");

    private static final SubLSymbol PSP_RULE_SEMX = makeSymbol("PSP-RULE-SEMX");

    private static final SubLSymbol _CSETF_PSP_RULE_SEMX = makeSymbol("_CSETF-PSP-RULE-SEMX");

    private static final SubLSymbol PSP_RULE_WEIGHT = makeSymbol("PSP-RULE-WEIGHT");

    private static final SubLSymbol _CSETF_PSP_RULE_WEIGHT = makeSymbol("_CSETF-PSP-RULE-WEIGHT");















    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PHRASE_STRUCTURE_PARSER_RULE = makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-RULE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD");

    private static final SubLString $str36$__PSP_RULE___S_ = makeString("#<PSP-RULE: ~S>");

    private static final SubLList $list37 = list(list(makeSymbol("TYPE"), makeSymbol("TARGET")), makeSymbol("CONSTRAINT"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol ADD_PHRASE_STRUCTURE_RULE = makeSymbol("ADD-PHRASE-STRUCTURE-RULE");

    private static final SubLSymbol REMOVE_PHRASE_STRUCTURE_RULE = makeSymbol("REMOVE-PHRASE-STRUCTURE-RULE");

    private static final SubLObject $$PhraseStructureRule = reader_make_constant_shell(makeString("PhraseStructureRule"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));











    private static final SubLString $str49$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str55$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str56$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list57 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    private static final SubLObject $$psRuleArity = reader_make_constant_shell(makeString("psRuleArity"));

    private static final SubLObject $$psRuleCategory = reader_make_constant_shell(makeString("psRuleCategory"));

    private static final SubLObject $$psRuleSyntacticHeadDtr = reader_make_constant_shell(makeString("psRuleSyntacticHeadDtr"));

    private static final SubLObject $$psRuleConstraint = reader_make_constant_shell(makeString("psRuleConstraint"));

    private static final SubLList $list64 = list(makeSymbol("C-TYPE"), makeSymbol("DTR"), makeSymbol("TARGET"));





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$psRuleSemanticsFromDtr = reader_make_constant_shell(makeString("psRuleSemanticsFromDtr"));





    private static final SubLObject $$psRuleTemplateDtr = reader_make_constant_shell(makeString("psRuleTemplateDtr"));



    private static final SubLObject $$PSBindingFn = reader_make_constant_shell(makeString("PSBindingFn"));



    private static final SubLObject $$PSBindingFn_TypeLevel = reader_make_constant_shell(makeString("PSBindingFn-TypeLevel"));

    private static final SubLObject $$psRuleTemplateBindings = reader_make_constant_shell(makeString("psRuleTemplateBindings"));



    private static final SubLObject $$PSRule_NounNounCompound = reader_make_constant_shell(makeString("PSRule-NounNounCompound"));

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLObject $$PSRule_NameNounCompound = reader_make_constant_shell(makeString("PSRule-NameNounCompound"));

    private static final SubLObject $$PSRule_AdjectiveNameCompound = reader_make_constant_shell(makeString("PSRule-AdjectiveNameCompound"));

    private static final SubLObject $$PSRule_NameNameNounCompound = reader_make_constant_shell(makeString("PSRule-NameNameNounCompound"));

    private static final SubLSymbol PSP_RULE_FORT_WEIGHTS = makeSymbol("PSP-RULE-FORT-WEIGHTS");

    private static final SubLString $$$psRuleWeight = makeString("psRuleWeight");

    private static final SubLList $list85 = cons(makeSymbol("?RULE"), makeSymbol("?WEIGHT"));

    private static final SubLList $list86 = list(makeSymbol("?RULE"), makeSymbol("?WEIGHT"));

    private static final SubLList $list87 = cons(makeSymbol("RULE"), makeSymbol("RAW-WEIGHT"));

    private static final SubLFloat $float$0_95 = makeDouble(0.95);

    private static final SubLSymbol $INFINITE_RECURSION_RULE = makeKeyword("INFINITE-RECURSION-RULE");

    private static final SubLList $list90 = list(makeSymbol("TYPE"), makeSymbol("TARGET"));

    private static final SubLObject $$ConstituentTypeConstraintFn = reader_make_constant_shell(makeString("ConstituentTypeConstraintFn"));

    private static final SubLObject $$POSPredConstraintFn = reader_make_constant_shell(makeString("POSPredConstraintFn"));





    private static final SubLSymbol $psp_traced_rules$ = makeSymbol("*PSP-TRACED-RULES*");



    private static final SubLList $list97 = list(makeSymbol("RULE-FORT"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLSymbol $sym99$PSP_TRACED_RULE_ = makeSymbol("PSP-TRACED-RULE?");

    private static final SubLSymbol DO_PSP_TRACE_REPORT = makeSymbol("DO-PSP-TRACE-REPORT");

    private static final SubLList $list101 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLString $str103$___S___meets_the_first_dtr_constr = makeString("~&~S~% meets the first-dtr constraints of ~S. Frame = ~S");

    private static final SubLSymbol $sym104$PSP_SEMANTIC_CONSTRAINT_ = makeSymbol("PSP-SEMANTIC-CONSTRAINT?");

    private static final SubLString $str105$___S____A_constraint__S___ = makeString("~&~S~% ~A constraint ~S.~%");

    private static final SubLString $$$failed = makeString("failed");

    private static final SubLString $$$met = makeString("met");





    private static final SubLString $str110$___S___failed_constraint__S___S = makeString("~&~S~% failed constraint ~S: ~S");

    private static final SubLSymbol $psp_syntactic_constraint_types$ = makeSymbol("*PSP-SYNTACTIC-CONSTRAINT-TYPES*");

    private static final SubLObject $const112$PhraseStructureConstraint_Syntact = reader_make_constant_shell(makeString("PhraseStructureConstraint-Syntactic"));

    private static final SubLObject $$resultIsa = reader_make_constant_shell(makeString("resultIsa"));

    private static final SubLSymbol $psp_semantic_constraint_types$ = makeSymbol("*PSP-SEMANTIC-CONSTRAINT-TYPES*");

    private static final SubLObject $const115$PhraseStructureConstraint_Semanti = reader_make_constant_shell(makeString("PhraseStructureConstraint-Semantic"));

    private static final SubLSymbol $sym116$PSP_CYCL_FAILS_CONSTRAINT_ = makeSymbol("PSP-CYCL-FAILS-CONSTRAINT?");

    private static final SubLList $list117 = list(makeSymbol("C-TYPE"), makeSymbol("TARGET"));

    private static final SubLObject $$PSRuleIsaConstraintFn = reader_make_constant_shell(makeString("PSRuleIsaConstraintFn"));

    private static final SubLObject $$PSRuleGenlsConstraintFn = reader_make_constant_shell(makeString("PSRuleGenlsConstraintFn"));

    private static final SubLSymbol $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_ = makeSymbol("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*");





    private static final SubLObject $$PrepositionalPhrase = reader_make_constant_shell(makeString("PrepositionalPhrase"));

    private static final SubLObject $$DetNbarAgrConstraintFn = reader_make_constant_shell(makeString("DetNbarAgrConstraintFn"));

    private static final SubLSymbol PSP_PHRASE_TYPES = makeSymbol("PSP-PHRASE-TYPES");

    private static final SubLObject $$NLPhrase = reader_make_constant_shell(makeString("NLPhrase"));

    private static final SubLSymbol $psp_phrase_types_caching_state$ = makeSymbol("*PSP-PHRASE-TYPES-CACHING-STATE*");

    private static final SubLSymbol $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_ = makeSymbol("PSP-CONSTRAINTS-REQUIRE-PHRASE?");

    private static final SubLObject $$Preposition = reader_make_constant_shell(makeString("Preposition"));

    public static final SubLList $list130 = list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("NLWordForm")), reader_make_constant_shell(makeString("lexemeOfWordForm")));

    private static final SubLList $list131 = list(reader_make_constant_shell(makeString("NLPhraseWithFrameFn")), reader_make_constant_shell(makeString("NLWordFormWithFrameFn")));

    private static final SubLObject $$Number_SP = reader_make_constant_shell(makeString("Number-SP"));

    private static final SubLList $list133 = list(reader_make_constant_shell(makeString("nounStrings")));

    private static final SubLSymbol $sym134$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLSymbol PSP_SUB_CATEGORIES = makeSymbol("PSP-SUB-CATEGORIES");



    private static final SubLSymbol $psp_sub_categories_caching_state$ = makeSymbol("*PSP-SUB-CATEGORIES-CACHING-STATE*");

    private static final SubLSymbol PSP_SUB_POS_PREDS = makeSymbol("PSP-SUB-POS-PREDS");



    private static final SubLSymbol $psp_sub_pos_preds_caching_state$ = makeSymbol("*PSP-SUB-POS-PREDS-CACHING-STATE*");

    private static final SubLSymbol PSP_FRAME_TYPE_INSTANCES = makeSymbol("PSP-FRAME-TYPE-INSTANCES");

    private static final SubLSymbol $psp_frame_type_instances_caching_state$ = makeSymbol("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*");

    private static final SubLSymbol PSP_REWRITE = makeSymbol("PSP-REWRITE");

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));

    private static final SubLSymbol $psp_rewrite_caching_state$ = makeSymbol("*PSP-REWRITE-CACHING-STATE*");

    private static final SubLSymbol $sym146$PSP_ISA_ = makeSymbol("PSP-ISA?");

    private static final SubLSymbol $sym147$PSP_GENL_ = makeSymbol("PSP-GENL?");

    private static final SubLList $list148 = list(makeSymbol("N"), makeSymbol("TARGET"));

    private static final SubLSymbol $sym149$PSP_SPEC_CONST_CONSTRAINT_ = makeSymbol("PSP-SPEC-CONST-CONSTRAINT?");

    private static final SubLSymbol $PASSIVE_WITH_BY = makeKeyword("PASSIVE-WITH-BY");

    private static final SubLList $list151 = list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("NLWordForm")), reader_make_constant_shell(makeString("lexemeOfWordForm")), reader_make_constant_shell(makeString("By-TheWord")));

    private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));

    private static final SubLObject $$subcatFrameDependentConstraint = reader_make_constant_shell(makeString("subcatFrameDependentConstraint"));

    private static final SubLList $list154 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLObject $$PPCompFrameFn = reader_make_constant_shell(makeString("PPCompFrameFn"));

    private static final SubLObject $$TransitivePPFrameType = reader_make_constant_shell(makeString("TransitivePPFrameType"));

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLObject $$NLWordForm = reader_make_constant_shell(makeString("NLWordForm"));

    private static final SubLObject $$lexemeOfWordForm = reader_make_constant_shell(makeString("lexemeOfWordForm"));

    private static final SubLObject $$DitransitivePPFrameType = reader_make_constant_shell(makeString("DitransitivePPFrameType"));

    private static final SubLList $list161 = list(makeSymbol("C1-TYPE"), makeSymbol("C1-TARGET"));

    private static final SubLList $list162 = list(makeSymbol("C2-TYPE"), makeSymbol("C2-TARGET"));

    private static final SubLSymbol PSP_PARSE_TREE_FOR_EDGE = makeSymbol("PSP-PARSE-TREE-FOR-EDGE");

    public static SubLObject phrase_structure_parser_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject phrase_structure_parser_rule_p(final SubLObject v_object) {
        return v_object.getClass() == psp_rules.$phrase_structure_parser_rule_native.class ? T : NIL;
    }

    public static SubLObject psp_rule_fort(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject psp_rule_arity(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject psp_rule_category(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject psp_rule_head(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject psp_rule_constraints(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject psp_rule_semx(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject psp_rule_weight(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_psp_rule_fort(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_psp_rule_arity(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_psp_rule_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_psp_rule_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_psp_rule_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_psp_rule_semx(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_psp_rule_weight(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "psp_rules.phrase_structure_parser_rule_p(v_object) " + "CommonSymbols.NIL != psp_rules.phrase_structure_parser_rule_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_phrase_structure_parser_rule(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new psp_rules.$phrase_structure_parser_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FORT)) {
                _csetf_psp_rule_fort(v_new, current_value);
            } else
                if (pcase_var.eql($ARITY)) {
                    _csetf_psp_rule_arity(v_new, current_value);
                } else
                    if (pcase_var.eql($CATEGORY)) {
                        _csetf_psp_rule_category(v_new, current_value);
                    } else
                        if (pcase_var.eql($HEAD)) {
                            _csetf_psp_rule_head(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONSTRAINTS)) {
                                _csetf_psp_rule_constraints(v_new, current_value);
                            } else
                                if (pcase_var.eql($SEMX)) {
                                    _csetf_psp_rule_semx(v_new, current_value);
                                } else
                                    if (pcase_var.eql($WEIGHT)) {
                                        _csetf_psp_rule_weight(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_phrase_structure_parser_rule(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PHRASE_STRUCTURE_PARSER_RULE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FORT, psp_rule_fort(obj));
        funcall(visitor_fn, obj, $SLOT, $ARITY, psp_rule_arity(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, psp_rule_category(obj));
        funcall(visitor_fn, obj, $SLOT, $HEAD, psp_rule_head(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, psp_rule_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMX, psp_rule_semx(obj));
        funcall(visitor_fn, obj, $SLOT, $WEIGHT, psp_rule_weight(obj));
        funcall(visitor_fn, obj, $END, MAKE_PHRASE_STRUCTURE_PARSER_RULE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_phrase_structure_parser_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_rule(obj, visitor_fn);
    }

    public static SubLObject pprint_psp_rule(final SubLObject psp_rule, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str36$__PSP_RULE___S_, psp_rule_fort(psp_rule));
        return psp_rule;
    }

    public static SubLObject new_psp_rule(SubLObject fort, SubLObject v_arity, SubLObject category, SubLObject head, SubLObject constraints, SubLObject semx, SubLObject weight) {
        if (fort == UNPROVIDED) {
            fort = NIL;
        }
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (head == UNPROVIDED) {
            head = NIL;
        }
        if (constraints == UNPROVIDED) {
            constraints = psp_new_constraints();
        }
        if (semx == UNPROVIDED) {
            semx = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        final SubLObject rule = make_phrase_structure_parser_rule(UNPROVIDED);
        _csetf_psp_rule_arity(rule, v_arity);
        _csetf_psp_rule_fort(rule, fort);
        _csetf_psp_rule_category(rule, category);
        _csetf_psp_rule_head(rule, head);
        _csetf_psp_rule_constraints(rule, constraints);
        _csetf_psp_rule_semx(rule, semx);
        _csetf_psp_rule_weight(rule, weight);
        return rule;
    }

    public static SubLObject psp_new_constraints() {
        return dictionary.new_dictionary(symbol_function(EQL), EIGHT_INTEGER);
    }

    public static SubLObject psp_constraints_on_dtr(final SubLObject dtr_num, final SubLObject constraints) {
        return dictionary.dictionary_lookup_without_values(constraints, dtr_num, UNPROVIDED);
    }

    public static SubLObject psp_new_constraint(final SubLObject type, final SubLObject target) {
        return list(type, target);
    }

    public static SubLObject psp_constraint_type(final SubLObject constraint) {
        return constraint.first();
    }

    public static SubLObject psp_constraint_target(final SubLObject constraint) {
        return second(constraint);
    }

    public static SubLObject psp_destructure_constraint(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject constraint = NIL;
            destructuring_bind_must_consp(current, datum, $list37);
            constraint = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(type, target), constraint, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject psp_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $psp_rules$.getDynamicValue(thread);
    }

    public static SubLObject clear_psp_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        psp_semantics.psp_semx_clear_handlers();
        psp_main.clear_psp_caches();
        clear_psp_rules_caches();
        return set.clear_set($psp_rules$.getDynamicValue(thread));
    }

    public static SubLObject add_phrase_structure_rule(final SubLObject argument, final SubLObject assertion) {
        clear_psp_rules();
        return NIL;
    }

    public static SubLObject remove_phrase_structure_rule(final SubLObject argument, final SubLObject assertion) {
        clear_psp_rules();
        return NIL;
    }

    public static SubLObject initialize_psp_rules(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_psp_rules();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject node_var = $$PhraseStructureRule;
                    final SubLObject _prev_bind_0_$2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject node_var_$4 = node_var;
                            final SubLObject deck_type = $STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($WARN)) {
                                                        Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$4, UNPROVIDED);
                                                    while (NIL != node_var_$4) {
                                                        final SubLObject tt_node_var = node_var_$4;
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                        SubLObject module_var = NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                final SubLObject mt_$16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$16)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$16, thread);
                                                                                        SubLObject iteration_state_$18;
                                                                                        for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state_$20;
                                                                                                        SubLObject rule_fort;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$20 = NIL, state_$20 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$20); state_$20 = set_contents.do_set_contents_update_state(state_$20)) {
                                                                                                            rule_fort = set_contents.do_set_contents_next(basis_object, state_$20);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state_$20, rule_fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                    store_one_psp_rule_fort(rule_fort);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject rule_fort2 = NIL;
                                                                                                            rule_fort2 = csome_list_var.first();
                                                                                                            while (NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if (NIL != forts.fort_p(rule_fort2)) {
                                                                                                                        store_one_psp_rule_fort(rule_fort2);
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                rule_fort2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                        SubLObject instance_tuple = NIL;
                                                                        instance_tuple = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            SubLObject current;
                                                                            final SubLObject datum = current = instance_tuple;
                                                                            SubLObject link_node = NIL;
                                                                            SubLObject mt_$17 = NIL;
                                                                            SubLObject tv2 = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list57);
                                                                            link_node = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list57);
                                                                            mt_$17 = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list57);
                                                                            tv2 = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$17)) {
                                                                                    final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$17, thread);
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol;
                                                                                                final SubLObject link_nodes2 = sol = list(link_node);
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject rule_fort;
                                                                                                    SubLObject state_$21;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$21 = NIL, state_$21 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$21); state_$21 = set_contents.do_set_contents_update_state(state_$21)) {
                                                                                                        rule_fort = set_contents.do_set_contents_next(basis_object, state_$21);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$21, rule_fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                store_one_psp_rule_fort(rule_fort);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var_$25 = sol;
                                                                                                        SubLObject rule_fort2 = NIL;
                                                                                                        rule_fort2 = csome_list_var_$25.first();
                                                                                                        while (NIL != csome_list_var_$25) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(rule_fort2)) {
                                                                                                                    store_one_psp_rule_fort(rule_fort2);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$25 = csome_list_var_$25.rest();
                                                                                                            rule_fort2 = csome_list_var_$25.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list57);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            instance_tuple = csome_list_var2.first();
                                                                        } 
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$26;
                                                                        final SubLObject new_list = cdolist_list_var_$26 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn = NIL;
                                                                        generating_fn = cdolist_list_var_$26.first();
                                                                        while (NIL != cdolist_list_var_$26) {
                                                                            final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state_$22;
                                                                                    SubLObject rule_fort3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$22 = NIL, state_$22 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state_$22); state_$22 = set_contents.do_set_contents_update_state(state_$22)) {
                                                                                        rule_fort3 = set_contents.do_set_contents_next(basis_object2, state_$22);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$22, rule_fort3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(rule_fort3)) {
                                                                                                store_one_psp_rule_fort(rule_fort3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        SubLObject csome_list_var3 = sol2;
                                                                                        SubLObject rule_fort4 = NIL;
                                                                                        rule_fort4 = csome_list_var3.first();
                                                                                        while (NIL != csome_list_var3) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(rule_fort4)) {
                                                                                                    store_one_psp_rule_fort(rule_fort4);
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            rule_fort4 = csome_list_var3.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                            }
                                                                            cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                                            generating_fn = cdolist_list_var_$26.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        } 
                                                        SubLObject cdolist_list_var2;
                                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                        SubLObject module_var2 = NIL;
                                                        module_var2 = cdolist_list_var2.first();
                                                        while (NIL != cdolist_list_var2) {
                                                            final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$4);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link2) {
                                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links2) {
                                                                            SubLObject iteration_state2;
                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                        SubLObject iteration_state_$19;
                                                                                        for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    final SubLObject sol3 = link_nodes4;
                                                                                                    if (NIL != set.set_p(sol3)) {
                                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                        SubLObject basis_object3;
                                                                                                        SubLObject state_$23;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state_$23 = NIL, state_$23 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state_$23); state_$23 = set_contents.do_set_contents_update_state(state_$23)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state_$23);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state_$23, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
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
                                                                                                            Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$27;
                                                                        final SubLObject new_list2 = cdolist_list_var_$27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn2 = NIL;
                                                                        generating_fn2 = cdolist_list_var_$27.first();
                                                                        while (NIL != cdolist_list_var_$27) {
                                                                            final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                                final SubLObject sol4;
                                                                                final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                                if (NIL != set.set_p(sol4)) {
                                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                    SubLObject basis_object4;
                                                                                    SubLObject state_$24;
                                                                                    SubLObject node_vars_link_node3;
                                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state_$24 = NIL, state_$24 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state_$24); state_$24 = set_contents.do_set_contents_update_state(state_$24)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state_$24);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$24, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
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
                                                                                        Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                            }
                                                                            cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                                            generating_fn2 = cdolist_list_var_$27.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$8, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                            }
                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                            module_var2 = cdolist_list_var2.first();
                                                        } 
                                                        node_var_$4 = deck.deck_pop(recur_deck);
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str58$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$3, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $psp_rules$.getDynamicValue(thread);
    }

    public static SubLObject psp_check_initializations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.non_empty_set_p($psp_rules$.getDynamicValue(thread))) {
            initialize_psp_rules(UNPROVIDED);
        }
        return $INITIALIZED;
    }

    public static SubLObject store_one_psp_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject v_arity = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleArity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject category = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleCategory, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject head = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleSyntacticHeadDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject weight = psp_rule_fort_weight_factor(rule_fort, v_arity);
            final SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, $$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject constraints = psp_new_constraints();
            final SubLObject semx = psp_get_semx_for_rule_fort(rule_fort);
            if (NIL == category) {
            }
            if (NIL == head) {
            }
            if (NIL != raw_constraints) {
                SubLObject cdolist_list_var = raw_constraints;
                SubLObject constraint = NIL;
                constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != psp_valid_raw_constraintP(constraint)) {
                        SubLObject current;
                        final SubLObject datum = current = psp_parse_constraint(constraint);
                        SubLObject c_type = NIL;
                        SubLObject dtr = NIL;
                        SubLObject target = NIL;
                        destructuring_bind_must_consp(current, datum, $list64);
                        c_type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list64);
                        dtr = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list64);
                        target = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            dictionary_utilities.dictionary_push(constraints, dtr, psp_new_constraint(c_type, target));
                            if (NIL != psp_frame_specific_raw_constraintP(constraint)) {
                                dictionary_utilities.dictionary_push(constraints, dtr, psp_frame_constraint_from_raw_constraint(constraint));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list64);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint = cdolist_list_var.first();
                } 
            }
            if (((NIL != category) && (NIL != head)) && (NIL != raw_constraints)) {
                final SubLObject new_rule = add_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
                psp_add_derivable_rules(new_rule);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $STORED;
    }

    public static SubLObject psp_valid_raw_constraintP(final SubLObject constraint) {
        return makeBoolean((NIL != nart_handles.valid_nartP(constraint, UNPROVIDED)) && (NIL != formula_arityE(narts_high.nart_hl_formula(constraint), TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject psp_get_semx_for_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = NIL;
        SubLObject head_dtr_num = NIL;
        SubLObject binding_expressions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject identity_arg = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleSemanticsFromDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != identity_arg) {
                type = $IDENTITY;
                head_dtr_num = identity_arg;
            } else {
                binding_expressions = psp_binding_expressions_for_rule_fort(rule_fort);
                type = $TEMPLATE;
                head_dtr_num = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleTemplateDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return listS(type, head_dtr_num, binding_expressions);
    }

    public static SubLObject psp_binding_expressions_for_rule_fort(final SubLObject rule_fort) {
        SubLObject binding_expressions = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_fort, $$psRuleTemplateBindings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject nat = NIL;
        nat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            binding_expressions = cons(subst($INSTANCE, $$PSBindingFn, subst($TYPE, $$PSBindingFn_TypeLevel, nat, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), binding_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            nat = cdolist_list_var.first();
        } 
        return binding_expressions;
    }

    public static SubLObject psp_rule_fort_weight_factor(final SubLObject rule_fort, SubLObject v_arity) {
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        final SubLObject explicit_weight_factor = psp_explicit_weight_factor_for_rule_fort(rule_fort);
        return NIL != psp_chart.psp_weight_p(explicit_weight_factor) ? explicit_weight_factor : psp_rule_weight_factor_from_arity(v_arity);
    }

    public static SubLObject psp_explicit_weight_factor_for_rule_fort(final SubLObject rule_fort) {
        return list_utilities.alist_lookup(psp_rule_fort_weights(), rule_fort, symbol_function(EQL), $NONE);
    }

    public static SubLObject psp_rule_fort_weights_internal() {
        final SubLObject weight_pred = constants_high.find_constant($$$psRuleWeight);
        if (NIL != valid_constantP(weight_pred, UNPROVIDED)) {
            final SubLObject raw_alist = ask_utilities.ask_template($list85, bq_cons(weight_pred, $list86), parsing_vars.$psp_rule_lookup_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject adjusted_alist = NIL;
            SubLObject cdolist_list_var = raw_alist;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject rule = NIL;
                SubLObject raw_weight = NIL;
                destructuring_bind_must_consp(current, datum, $list87);
                rule = current.first();
                current = raw_weight = current.rest();
                adjusted_alist = list_utilities.alist_enter(adjusted_alist, rule, parsing_utilities.psp_weight_from_float(raw_weight), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            return adjusted_alist;
        }
        return $psp_rule_fort_weights$.getGlobalValue();
    }

    public static SubLObject psp_rule_fort_weights() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_rule_fort_weights_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_RULE_FORT_WEIGHTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_RULE_FORT_WEIGHTS, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_RULE_FORT_WEIGHTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_rule_fort_weights_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject psp_rule_weight_factor_from_arity(final SubLObject rule_arity) {
        if ((NIL != subl_promotions.positive_integer_p(rule_arity)) && rule_arity.numG(ONE_INTEGER)) {
            final SubLObject extra_dtr_count = number_utilities.f_1_(rule_arity);
            return psp_chart.psp_weight_compose(make_list(extra_dtr_count, $psp_rule_arity_weight$.getGlobalValue()));
        }
        return parsing_vars.$psp_max_weight$.getGlobalValue();
    }

    public static SubLObject add_psp_rule(final SubLObject rule_fort, final SubLObject v_arity, final SubLObject category, final SubLObject head, final SubLObject constraints, final SubLObject semx, final SubLObject weight) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == v_arity) || v_arity.eql(ONE_INTEGER)) && (NIL != psp_category_meets_constraintsP(category, constraints))) {
            return $INFINITE_RECURSION_RULE;
        }
        final SubLObject new_rule = new_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
        set.set_add(new_rule, $psp_rules$.getDynamicValue(thread));
        return new_rule;
    }

    public static SubLObject psp_rule_struct_for_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject set_contents_var = set.do_set_internal($psp_rules$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject rule_struct;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            rule_struct = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, rule_struct)) && rule_fort.eql(psp_rule_fort(rule_struct))) {
                ans = rule_struct;
            }
        }
        return ans;
    }

    public static SubLObject psp_category_meets_constraintsP(final SubLObject category, final SubLObject constraints) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = psp_constraints_on_dtr(ONE_INTEGER, constraints);
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list90);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list90);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (type.eql($$ConstituentTypeConstraintFn) && (NIL == psp_constraint_target_includesP(target, category, UNPROVIDED))) {
                        failP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list90);
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject psp_parse_constraint(final SubLObject constraint) {
        SubLObject current;
        final SubLObject datum = current = function_terms.nart_to_naut(constraint);
        SubLObject c_type = NIL;
        SubLObject dtr = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        c_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = c_type;
            if (pcase_var.eql($$ConstituentTypeConstraintFn)) {
                target = psp_sub_categories(target);
            } else
                if (pcase_var.eql($$POSPredConstraintFn)) {
                    target = psp_sub_pos_preds(target, UNPROVIDED);
                }

            return list(c_type, dtr, target);
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject psp_frame_specific_raw_constraintP(final SubLObject constraint) {
        SubLObject current;
        final SubLObject datum = current = function_terms.nart_to_naut(constraint);
        SubLObject c_type = NIL;
        SubLObject dtr = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        c_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(c_type.eql($$ConstituentTypeConstraintFn) && (NIL != psp_frame_specific_constituent_typeP(target)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject psp_frame_constraint_from_raw_constraint(final SubLObject constraint) {
        final SubLObject target = cycl_utilities.nat_arg2(constraint, UNPROVIDED);
        final SubLObject target_frame_type = psp_frame_type_from_constituent_type(target);
        final SubLObject target_set = psp_frame_type_instances(target_frame_type, UNPROVIDED);
        return psp_new_constraint($FRAME, target_set);
    }

    public static SubLObject psp_add_derivable_rules(final SubLObject new_rule) {
        return $STUB;
    }

    public static SubLObject psp_trace(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(rule_fort) : "forts.fort_p(rule_fort) " + "CommonSymbols.NIL != forts.fort_p(rule_fort) " + rule_fort;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != isa.isaP(rule_fort, $$PhraseStructureRule, UNPROVIDED, UNPROVIDED)) && (NIL == member(rule_fort, $psp_traced_rules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY)))) {
                $psp_traced_rules$.setGlobalValue(cons(rule_fort, $psp_traced_rules$.getGlobalValue()));
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $psp_traced_rules$.getGlobalValue();
    }

    public static SubLObject psp_untrace(SubLObject rule_fort) {
        if (rule_fort == UNPROVIDED) {
            rule_fort = NIL;
        }
        $psp_traced_rules$.setGlobalValue(NIL != rule_fort ? remove(rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL);
        return $psp_traced_rules$.getGlobalValue();
    }

    public static SubLObject psp_traced_ruleP(final SubLObject rule_fort) {
        return subl_promotions.memberP(rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_trace_report(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rule_fort = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        rule_fort = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, list($sym99$PSP_TRACED_RULE_, rule_fort), listS(DO_PSP_TRACE_REPORT, format_str, append(args, NIL)));
    }

    public static SubLObject do_psp_trace_report(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list101);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FORMAT, T, format_str, append(args, NIL));
    }

    public static SubLObject psp_rules_starting_with_edge(final SubLObject edge, SubLObject root_category) {
        if (root_category == UNPROVIDED) {
            root_category = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = NIL;
        final SubLObject edge_left_index = interval_span.interval_span_start(psp_chart.get_psp_edge_span(edge));
        final SubLObject set_contents_var = set.do_set_internal($psp_rules$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject rule;
        SubLObject dtr1_constraints;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rule = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                dtr1_constraints = psp_constraints_on_dtr(ONE_INTEGER, psp_rule_constraints(rule));
                if (((NIL != psp_rule_could_start_at_indexP(rule, edge_left_index)) && ((NIL == root_category) || (NIL != psp_valid_constituent_typeP(psp_rule_category(rule), root_category)))) && (NIL != psp_edge_meets_syntax_constraintsP(edge, dtr1_constraints, UNPROVIDED, UNPROVIDED))) {
                    rules = cons(rule, rules);
                    if (NIL != psp_traced_ruleP(psp_rule_fort(rule))) {
                        format(T, $str103$___S___meets_the_first_dtr_constr, new SubLObject[]{ edge, psp_rule_fort(rule), psp_chart.get_psp_edge_frame(edge) });
                    }
                }
            }
        }
        return rules;
    }

    public static SubLObject psp_rule_could_start_at_indexP(final SubLObject rule, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart_end_index = (NIL != parsing_vars.$psp_chart_end_index$.getDynamicValue(thread)) ? parsing_vars.$psp_chart_end_index$.getDynamicValue(thread) : psp_chart.psp_chart_length(parsing_vars.$psp_chart$.getDynamicValue(thread));
        final SubLObject known_arity = psp_rule_arity(rule);
        final SubLObject rule_min_arity = (NIL != known_arity) ? known_arity : ONE_INTEGER;
        SubLObject minimal_end_index = add(index, rule_min_arity);
        if (NIL != psp_chart.psp_gap_allowedP()) {
            minimal_end_index = subtract(minimal_end_index, ONE_INTEGER);
        }
        return numGE(chart_end_index, minimal_end_index);
    }

    public static SubLObject psp_filter_cycls(final SubLObject dtr_cycls, final SubLObject dtr_num, final SubLObject rule, final SubLObject edge) {
        SubLObject filtered_cycls = NIL;
        final SubLObject constraint_table = psp_rule_constraints(rule);
        final SubLObject constraints = list_utilities.remove_if_not($sym104$PSP_SEMANTIC_CONSTRAINT_, psp_constraints_on_dtr(dtr_num, constraint_table), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = dtr_cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject failP = NIL;
            if (NIL == failP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    constraint = psp_cyclify_targets(constraint, edge);
                    failP = psp_cycl_fails_constraintP(cycl, constraint);
                    if (NIL != psp_traced_ruleP(psp_chart.psp_edge_rule_fort(edge))) {
                        format(T, $str105$___S____A_constraint__S___, new SubLObject[]{ cycl, NIL != failP ? $$$failed : $$$met, constraint });
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
            if (NIL == failP) {
                filtered_cycls = cons(cycl, filtered_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return filtered_cycls;
    }

    public static SubLObject psp_cyclify_targets(SubLObject constraint, final SubLObject edge) {
        SubLObject current;
        final SubLObject datum = current = constraint;
        SubLObject type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            if (target.isInteger()) {
                final SubLObject target_dtr = psp_chart.psp_edge_nth_dtr(target, edge);
                final SubLObject target_cycls = psp_semantics.psp_cycls_to_cycls(psp_semantics.psp_semantics_for_edge(target_dtr, UNPROVIDED, UNPROVIDED));
                constraint = list(type, bq_cons($LIST, target_cycls));
            }
        } else {
            cdestructuring_bind_error(datum, $list90);
        }
        return constraint;
    }

    public static SubLObject psp_edge_passes_semantic_constraintsP(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_struct = psp_chart.psp_edge_rule_struct(edge);
        final SubLObject constraint_table = psp_rule_constraints(rule_struct);
        final SubLObject dtrs = psp_chart.psp_edge_dtrs(edge);
        SubLObject failP = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraint_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject dtr_num = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == failP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if ((NIL != psp_semantic_constraintP(constraint)) && (NIL != psp_edge_fails_constraintP(nth(number_utilities.f_1_(dtr_num), dtrs), constraint, dtrs))) {
                        failP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == failP);
    }

    public static SubLObject psp_edge_meets_syntax_constraintsP(final SubLObject edge, final SubLObject constraints, SubLObject mother, SubLObject traced_rule_fort) {
        if (mother == UNPROVIDED) {
            mother = NIL;
        }
        if (traced_rule_fort == UNPROVIDED) {
            traced_rule_fort = NIL;
        }
        if (constraints.eql($UNKNOWN)) {
            return T;
        }
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if ((NIL != psp_syntactic_constraintP(constraint)) && (NIL != psp_edge_fails_constraintP(edge, constraint, mother))) {
                    failP = T;
                    if (NIL != traced_rule_fort) {
                        final SubLObject target = psp_constraint_target(constraint);
                        format(T, $str110$___S___failed_constraint__S___S, new SubLObject[]{ edge, psp_constraint_type(constraint), NIL != set.set_p(target) ? set.set_element_list(target) : target });
                    }
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            } 
        }
        return sublisp_null(failP);
    }

    public static SubLObject psp_syntactic_constraintP(final SubLObject constraint) {
        return psp_syntactic_constraint_typeP(psp_constraint_type(constraint));
    }

    public static SubLObject clear_psp_syntactic_constraint_types() {
        $psp_syntactic_constraint_types$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject psp_syntactic_constraint_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $psp_syntactic_constraint_types$.getGlobalValue()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                $psp_syntactic_constraint_types$.setGlobalValue(cons($FRAME, kb_mapping_utilities.pred_values($const112$PhraseStructureConstraint_Syntact, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(type, $psp_syntactic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_semantic_constraintP(final SubLObject constraint) {
        return psp_semantic_constraint_typeP(psp_constraint_type(constraint));
    }

    public static SubLObject clear_psp_semantic_constraint_types() {
        $psp_semantic_constraint_types$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject psp_semantic_constraint_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $psp_semantic_constraint_types$.getGlobalValue()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                $psp_semantic_constraint_types$.setGlobalValue(kb_mapping_utilities.pred_values($const115$PhraseStructureConstraint_Semanti, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(type, $psp_semantic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_psp_cycl_fails_constraintP() {
        final SubLObject cs = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_cycl_fails_constraintP_caching_state$.getGlobalValue(), list(psp_cycl, constraint), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_cycl_fails_constraintP_internal(final SubLObject psp_cycl, final SubLObject constraint) {
        SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
        SubLObject failP = T;
        SubLObject c_type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list117);
        c_type = constraint.first();
        SubLObject current = constraint.rest();
        destructuring_bind_must_consp(current, constraint, $list117);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            if (target.isList() && (target.first() == $LIST)) {
                SubLObject succeedP = NIL;
                if (NIL == succeedP) {
                    SubLObject csome_list_var = target.rest();
                    SubLObject item = NIL;
                    item = csome_list_var.first();
                    while ((NIL == succeedP) && (NIL != csome_list_var)) {
                        if (NIL == psp_cycl_fails_constraintP(cycl, list(c_type, item))) {
                            succeedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        item = csome_list_var.first();
                    } 
                }
                failP = makeBoolean(NIL == succeedP);
            } else {
                cycl = parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
                target = parsing_utilities.strip_nl_tags(target, UNPROVIDED);
                final SubLObject pcase_var = c_type;
                if (pcase_var.eql($$PSRuleIsaConstraintFn)) {
                    failP = makeBoolean(NIL == psp_isaP(cycl, target));
                } else
                    if (pcase_var.eql($$PSRuleGenlsConstraintFn)) {
                        failP = makeBoolean(NIL == psp_genlP(cycl, target));
                    }

            }
        } else {
            cdestructuring_bind_error(constraint, $list117);
        }
        return failP;
    }

    public static SubLObject psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint) {
        SubLObject caching_state = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym116$PSP_CYCL_FAILS_CONSTRAINT_, $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(psp_cycl, constraint);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (psp_cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && constraint.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_cycl_fails_constraintP_internal(psp_cycl, constraint)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(psp_cycl, constraint));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject psp_edge_fails_constraintP(final SubLObject edge, final SubLObject constraint, final SubLObject mother) {
        final SubLObject edge_is_gapP = eq(edge, $GAP);
        if ((NIL != edge_is_gapP) && (NIL == psp_chart.psp_gap_allowedP())) {
            return T;
        }
        SubLObject c_type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list117);
        c_type = constraint.first();
        SubLObject current = constraint.rest();
        destructuring_bind_must_consp(current, constraint, $list117);
        target = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(constraint, $list117);
            return NIL;
        }
        final SubLObject pcase_var = c_type;
        if (pcase_var.eql($$ConstituentTypeConstraintFn)) {
            if (NIL != psp_lexeme_constraintP(target)) {
                return psp_edge_fails_lexeme_constraintP(edge, target);
            }
            final SubLObject edge_cat = (NIL != edge_is_gapP) ? psp_chart.psp_allowed_gap_category() : psp_chart.get_psp_edge_category(edge);
            if ((NIL != psp_chart.psp_pp_gap_allowedP()) && (NIL != psp_constraint_target_includesP(target, $$PrepositionalPhrase, UNPROVIDED))) {
                return NIL;
            }
            if (NIL != psp_constraint_target_includesP(target, edge_cat, UNPROVIDED)) {
                return NIL;
            }
            return T;
        } else {
            if (pcase_var.eql($$DetNbarAgrConstraintFn)) {
                return makeBoolean((NIL != edge_is_gapP) || (NIL == psp_det_nbar_agreeP(edge, target, mother)));
            }
            if (pcase_var.eql($$POSPredConstraintFn)) {
                final SubLObject failsP = makeBoolean((NIL == edge_is_gapP) && (NIL == psp_constraint_target_includesP(target, psp_chart.get_psp_edge_pos_pred(edge), UNPROVIDED)));
                return failsP;
            }
            if (!pcase_var.eql($FRAME)) {
                return T;
            }
            if (NIL != edge_is_gapP) {
                return NIL;
            }
            final SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr(edge);
            final SubLObject edge_frame = (NIL != lexical_head_dtr) ? psp_chart.get_psp_edge_frame(lexical_head_dtr) : NIL;
            return makeBoolean(NIL == psp_constraint_target_includesP(target, edge_frame, UNPROVIDED));
        }
    }

    public static SubLObject clear_psp_phrase_types() {
        final SubLObject cs = $psp_phrase_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_psp_phrase_types(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_phrase_types_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_phrase_types_internal(final SubLObject mt) {
        return genls.all_specs($$NLPhrase, mt, UNPROVIDED);
    }

    public static SubLObject psp_phrase_types(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_phrase_types_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_PHRASE_TYPES, $psp_phrase_types_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(psp_phrase_types_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject psp_constraints_require_phraseP_internal(final SubLObject constraints) {
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject c_type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list117);
                c_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list117);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (c_type.eql($$ConstituentTypeConstraintFn) && (NIL == ans)) {
                        SubLObject csome_list_var_$42;
                        SubLObject phrase_type;
                        for (csome_list_var_$42 = psp_phrase_types(UNPROVIDED), phrase_type = NIL, phrase_type = csome_list_var_$42.first(); (NIL == ans) && (NIL != csome_list_var_$42); ans = set.set_memberP(phrase_type, target) , csome_list_var_$42 = csome_list_var_$42.rest() , phrase_type = csome_list_var_$42.first()) {
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list117);
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject psp_constraints_require_phraseP(final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_constraints_require_phraseP_internal(constraints);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constraints, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_constraints_require_phraseP_internal(constraints)));
            memoization_state.caching_state_put(caching_state, constraints, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject psp_edge_fails_lexeme_constraintP(final SubLObject edge, final SubLObject target) {
        final SubLObject target_wu = cycl_utilities.nat_arg3(set.set_element_list(target).first(), UNPROVIDED);
        if (NIL != psp_chart.psp_pp_gap_allowedP()) {
            final SubLObject gap_string = psp_chart.psp_pp_gap_string();
            SubLObject csome_list_var = lexicon_accessors.words_of_stringXspeech_part(gap_string, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject wu = NIL;
            wu = csome_list_var.first();
            while (NIL != csome_list_var) {
                if (wu.equal(target_wu)) {
                    return NIL;
                }
                csome_list_var = csome_list_var.rest();
                wu = csome_list_var.first();
            } 
            return T;
        }
        if (edge == $GAP) {
            return NIL;
        }
        return makeBoolean(NIL == psp_edge_has_wuP(edge, target_wu));
    }

    public static SubLObject psp_lexeme_constraintP(final SubLObject target) {
        SubLObject successP = NIL;
        final SubLObject set_contents_var = set.do_set_internal(target);
        SubLObject basis_object;
        SubLObject state;
        SubLObject target_cycl;
        SubLObject failP;
        SubLObject arg;
        SubLObject arg_$43;
        SubLObject target_arg;
        SubLObject target_arg_$44;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == successP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            target_cycl = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, target_cycl)) && (NIL != possibly_naut_p(target_cycl))) {
                failP = NIL;
                if (NIL == failP) {
                    arg = NIL;
                    arg_$43 = NIL;
                    target_arg = NIL;
                    target_arg_$44 = NIL;
                    arg = target_cycl;
                    arg_$43 = arg.first();
                    target_arg = $list130;
                    target_arg_$44 = target_arg.first();
                    while ((NIL == failP) && ((NIL != target_arg) || (NIL != arg))) {
                        if (NIL != target_arg_$44) {
                            if (!arg_$43.eql(target_arg_$44)) {
                                failP = T;
                            }
                        }
                        arg = arg.rest();
                        arg_$43 = arg.first();
                        target_arg = target_arg.rest();
                        target_arg_$44 = target_arg.first();
                    } 
                }
                successP = makeBoolean(NIL == failP);
            }
        }
        return successP;
    }

    public static SubLObject psp_frame_specific_constituent_typeP(final SubLObject target_element) {
        return makeBoolean((NIL != possibly_nat_p(target_element)) && (NIL != member(cycl_utilities.nat_functor(target_element), $list131, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject psp_frame_type_from_constituent_type(final SubLObject constituent_type) {
        return cycl_utilities.nat_arg2(constituent_type, UNPROVIDED);
    }

    public static SubLObject psp_constraint_target_includesP(final SubLObject target_set, final SubLObject item, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (key.eql(symbol_function(IDENTITY))) {
            return set.set_memberP(item, target_set);
        }
        final SubLObject test_fn = set.set_test(target_set);
        final SubLObject set_contents_var = set.do_set_internal(target_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject target_element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            target_element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, target_element)) && (NIL != funcall(test_fn, item, funcall(key, target_element)))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject psp_edge_has_wuP(final SubLObject edge, final SubLObject wu) {
        return eq(psp_chart.get_psp_edge_wu(edge), wu);
    }

    public static SubLObject psp_det_nbar_agreeP(final SubLObject nbar_edge, final SubLObject target, final SubLObject mother) {
        final SubLObject nbar_pos_pred = psp_chart.get_psp_edge_pos_pred(nbar_edge);
        final SubLObject old_dtrs = (NIL != mother) ? psp_chart.psp_edge_dtrs(mother) : NIL;
        final SubLObject detp_edge = nth(number_utilities.f_1_(target), old_dtrs);
        final SubLObject det_edge = psp_chart.psp_edge_lexical_head_dtr(detp_edge);
        final SubLObject det_string = psp_chart.get_psp_edge_string(det_edge);
        SubLObject ok_preds = lexicon_accessors.agr_of_det_string(det_string);
        if (NIL != lexicon_vars.name_string_predP(nbar_pos_pred)) {
            SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge(nbar_edge, UNPROVIDED, UNPROVIDED);
            SubLObject denot = NIL;
            denot = csome_list_var.first();
            while (NIL != csome_list_var) {
                if (NIL != rbp_wff.npp_collectionP(parsing_utilities.strip_nl_tags(denot, UNPROVIDED))) {
                    return T;
                }
                csome_list_var = csome_list_var.rest();
                denot = csome_list_var.first();
            } 
            return NIL;
        }
        if (NIL == ok_preds) {
            if (NIL != psp_semantics.psp_genl_posP(psp_chart.get_psp_edge_category(det_edge), $$Number_SP, UNPROVIDED)) {
                final SubLObject denots = psp_semantics.psp_semantics_for_edge(det_edge, UNPROVIDED, UNPROVIDED);
                if (NIL == ok_preds) {
                    SubLObject csome_list_var2 = denots;
                    SubLObject denot2 = NIL;
                    denot2 = csome_list_var2.first();
                    while ((NIL == ok_preds) && (NIL != csome_list_var2)) {
                        final SubLObject denot_cycl = psp_semantics.psp_cycl_cycl(denot2);
                        if (NIL != parsing_utilities.determiner_number_denotP(denot_cycl)) {
                            ok_preds = parsing_utilities.agr_preds_for_number(denot_cycl);
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        denot2 = csome_list_var2.first();
                    } 
                }
            } else {
                ok_preds = $list133;
            }
        }
        return makeBoolean((NIL != forts.fort_p(nbar_pos_pred)) && (NIL != member(nbar_pos_pred, ok_preds, $sym134$GENL_POS_PRED_, UNPROVIDED)));
    }

    public static SubLObject psp_valid_constituent_typeP(final SubLObject type, final SubLObject target) {
        return set.set_memberP(psp_rewrite(type), psp_sub_categories(target));
    }

    public static SubLObject clear_psp_sub_categories() {
        final SubLObject cs = $psp_sub_categories_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_psp_sub_categories(final SubLObject target) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_sub_categories_caching_state$.getGlobalValue(), list(target), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_sub_categories_internal(final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject core_type = psp_simplify_if_frame_specific_type(target);
        final SubLObject category = psp_rewrite(core_type);
        final SubLObject ans = set.new_set(symbol_function(EQUAL), $int$32);
        if (NIL != forts.fort_p(category)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = genls.all_specs(category, UNPROVIDED, UNPROVIDED);
                SubLObject spec = NIL;
                spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    spec = psp_simplify_if_frame_specific_type(spec);
                    set.set_add(spec, ans);
                    if (NIL != nart_handles.nart_p(spec)) {
                        set.set_add(function_terms.nart_to_naut(spec), ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    spec = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        set.set_add(target, ans);
        if (NIL != possibly_naut_p(core_type)) {
            final SubLObject nart = function_terms.naut_to_nart(core_type);
            if (NIL != nart_handles.nart_p(nart)) {
                set.set_add(nart, ans);
            }
        }
        if (NIL != possibly_naut_p(target)) {
            final SubLObject nart = function_terms.naut_to_nart(target);
            if (NIL != nart_handles.nart_p(nart)) {
                set.set_add(nart, ans);
            }
        }
        if (NIL != nart_handles.nart_p(target)) {
            set.set_add(function_terms.nart_to_naut(target), ans);
        }
        set.set_add(core_type, ans);
        return ans;
    }

    public static SubLObject psp_sub_categories(final SubLObject target) {
        SubLObject caching_state = $psp_sub_categories_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_SUB_CATEGORIES, $psp_sub_categories_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, target, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(psp_sub_categories_internal(target)));
            memoization_state.caching_state_put(caching_state, target, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject psp_simplify_if_frame_specific_type(final SubLObject type) {
        return NIL != psp_frame_specific_constituent_typeP(type) ? cycl_utilities.nat_arg1(type, UNPROVIDED) : type;
    }

    public static SubLObject clear_psp_sub_pos_preds() {
        final SubLObject cs = $psp_sub_pos_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_psp_sub_pos_preds(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_sub_pos_preds_caching_state$.getGlobalValue(), list(target, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_sub_pos_preds_internal(final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(symbol_function(EQ), $int$64);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_predicates(target, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(spec_pred, ans);
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject psp_sub_pos_preds(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_sub_pos_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_SUB_POS_PREDS, $psp_sub_pos_preds_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (target.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_sub_pos_preds_internal(target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_psp_frame_type_instances() {
        final SubLObject cs = $psp_frame_type_instances_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_psp_frame_type_instances(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_frame_type_instances_caching_state$.getGlobalValue(), list(target, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_frame_type_instances_internal(final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(symbol_function(EQUAL), $int$64);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = isa.all_fort_instances(target, UNPROVIDED, UNPROVIDED);
            SubLObject frame = NIL;
            frame = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(frame, ans);
                cdolist_list_var = cdolist_list_var.rest();
                frame = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject psp_frame_type_instances(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_frame_type_instances_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_FRAME_TYPE_INSTANCES, $psp_frame_type_instances_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (target.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_frame_type_instances_internal(target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_psp_rewrite() {
        final SubLObject cs = $psp_rewrite_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_psp_rewrite(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_rewrite_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_rewrite_internal(SubLObject obj) {
        if (NIL != term.nautP(obj, UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(obj);
            obj = (NIL != nart) ? nart : obj;
        }
        if (NIL == nart_handles.nart_p(obj)) {
            return obj;
        }
        final SubLObject rewrite = kb_mapping_utilities.fpred_value_in_any_mt(obj, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        return NIL != rewrite ? rewrite : obj;
    }

    public static SubLObject psp_rewrite(final SubLObject obj) {
        SubLObject caching_state = $psp_rewrite_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_REWRITE, $psp_rewrite_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(psp_rewrite_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject psp_isaP_internal(final SubLObject obj, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quick_quiet_has_typeP(parsing_utilities.strip_nl_tags(obj, UNPROVIDED), col, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject psp_isaP(final SubLObject obj, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_isaP_internal(obj, col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym146$PSP_ISA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym146$PSP_ISA_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym146$PSP_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, col);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (obj.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && col.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_isaP_internal(obj, col)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj, col));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject psp_genlP_internal(final SubLObject type1, final SubLObject type2) {
        return rbp_wff.npp_genlP(type1, type2, UNPROVIDED);
    }

    public static SubLObject psp_genlP(final SubLObject type1, final SubLObject type2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_genlP_internal(type1, type2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym147$PSP_GENL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym147$PSP_GENL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym147$PSP_GENL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type1, type2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (type1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && type2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_genlP_internal(type1, type2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(type1, type2));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject psp_rule_new_dtr_constraints(final SubLObject rule, final SubLObject frame) {
        if (NIL != psp_rule_arity(rule)) {
            SubLObject new_dtr_constraint_stack = NIL;
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = psp_rule_arity(rule), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                if (!n.isZero()) {
                    new_dtr_constraint_stack = cons(psp_constraints_on_dtr(number_utilities.f_1X(n), psp_rule_constraints(rule)), new_dtr_constraint_stack);
                }
            }
            return reverse(new_dtr_constraint_stack);
        }
        return NIL != frame ? psp_new_dtr_constraints_from_frame(frame) : NIL;
    }

    public static SubLObject psp_new_dtr_constraints_from_frame(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (frame == $UNKNOWN) {
            return $UNKNOWN;
        }
        final SubLObject active_frame = (NIL != psp_chart.psp_passive_frameP(frame)) ? psp_chart.psp_active_frame(frame) : frame;
        SubLObject ndc_stack = NIL;
        final SubLObject v_arity = lexicon_accessors.subcat_frame_arity(active_frame);
        SubLObject ndc_alist = NIL;
        if (v_arity.isInteger()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject constraints = cdolist_list_var = psp_constraints_for_frame(active_frame);
                SubLObject active_constraint = NIL;
                active_constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = active_constraint;
                    SubLObject n = NIL;
                    SubLObject target = NIL;
                    destructuring_bind_must_consp(current, datum, $list148);
                    n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list148);
                    target = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject constraint = NIL;
                        SubLObject existing = assoc(n, ndc_alist, UNPROVIDED, UNPROVIDED);
                        if (NIL != lexicon_accessors.speech_part_predP(target, UNPROVIDED)) {
                            constraint = psp_new_constraint($$POSPredConstraintFn, psp_sub_pos_preds(target, UNPROVIDED));
                        } else {
                            constraint = psp_new_constraint($$ConstituentTypeConstraintFn, psp_sub_categories(target));
                        }
                        ndc_alist = delete(existing, ndc_alist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != existing) {
                            if (NIL == subl_promotions.memberP(constraint, existing.rest(), $sym149$PSP_SPEC_CONST_CONSTRAINT_, UNPROVIDED)) {
                                rplacd(existing, cons(constraint, existing.rest()));
                            }
                        } else {
                            existing = cons(n, list(constraint));
                        }
                        ndc_alist = cons(existing, ndc_alist);
                    } else {
                        cdestructuring_bind_error(datum, $list148);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    active_constraint = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject n2;
            for (n2 = NIL, n2 = ZERO_INTEGER; n2.numL(v_arity); n2 = add(n2, ONE_INTEGER)) {
                if (NIL == psp_passivized_dtrP(n2, frame)) {
                    ndc_stack = cons(assoc(number_utilities.f_1X(n2), ndc_alist, UNPROVIDED, UNPROVIDED).rest(), ndc_stack);
                }
            }
        }
        if ((NIL != psp_chart.psp_passive_frameP(frame)) && (frame.first() == $PASSIVE_WITH_BY)) {
            ndc_stack = psp_add_by_phrase_constraints(ndc_stack);
        }
        return reverse(ndc_stack);
    }

    public static SubLObject psp_add_by_phrase_constraints(SubLObject stack) {
        stack = cons(list(list($$ConstituentTypeConstraintFn, psp_sub_categories($list151))), stack);
        stack = cons(list(list($$ConstituentTypeConstraintFn, psp_sub_categories($$NounPhrase))), stack);
        return stack;
    }

    public static SubLObject psp_passivized_dtrP(final SubLObject n, final SubLObject frame) {
        if (((!n.isInteger()) || (!n.numL(TWO_INTEGER))) || (NIL == psp_chart.psp_passive_frameP(frame))) {
            return NIL;
        }
        final SubLObject active_frame = psp_chart.psp_active_frame(frame);
        final SubLObject dtr_num = psp_chart.psp_passivized_dtr_num(active_frame, UNPROVIDED);
        return dtr_num.isInteger() ? numE(n, subtract(dtr_num, TWO_INTEGER)) : NIL;
    }

    public static SubLObject psp_constraints_for_frame(final SubLObject frame) {
        SubLObject pairs = kb_mapping_utilities.pred_value_tuples(frame, $$subcatFrameDependentConstraint, ONE_INTEGER, $list154, UNPROVIDED);
        if ((NIL != nart_handles.nart_p(frame)) && cycl_utilities.nat_function(frame).eql($$PPCompFrameFn)) {
            final SubLObject wu = cycl_utilities.nat_arg2(frame, UNPROVIDED);
            final SubLObject pcase_var = cycl_utilities.nat_arg1(frame, UNPROVIDED);
            if (pcase_var.eql($$TransitivePPFrameType)) {
                pairs = cons(list(ONE_INTEGER, list($$SubcollectionOfWithRelationToFn, $$NLWordForm, $$lexemeOfWordForm, wu)), pairs);
            } else
                if (pcase_var.eql($$DitransitivePPFrameType)) {
                    pairs = cons(list(TWO_INTEGER, list($$SubcollectionOfWithRelationToFn, $$NLWordForm, $$lexemeOfWordForm, wu)), pairs);
                }

        }
        return pairs;
    }

    public static SubLObject psp_spec_const_constraintP(final SubLObject c1, final SubLObject c2) {
        SubLObject c1_type = NIL;
        SubLObject c1_target = NIL;
        destructuring_bind_must_consp(c1, c1, $list161);
        c1_type = c1.first();
        SubLObject current = c1.rest();
        destructuring_bind_must_consp(current, c1, $list161);
        c1_target = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject c2_type = NIL;
            SubLObject c2_target = NIL;
            destructuring_bind_must_consp(c2, c2, $list162);
            c2_type = c2.first();
            SubLObject current_$46 = c2.rest();
            destructuring_bind_must_consp(current_$46, c2, $list162);
            c2_target = current_$46.first();
            current_$46 = current_$46.rest();
            if (NIL == current_$46) {
                return makeBoolean(c1_type.eql(c2_type) && (NIL != set_utilities.set_subsetP(c1_target, c2_target)));
            }
            cdestructuring_bind_error(c2, $list162);
        } else {
            cdestructuring_bind_error(c1, $list161);
        }
        return NIL;
    }

    public static SubLObject psp_find_dtr_frame_type(final SubLObject rule, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_type = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject rule_fort = psp_rule_fort(rule);
            final SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, $$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == frame_type) {
                SubLObject csome_list_var = raw_constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == frame_type) && (NIL != csome_list_var)) {
                    if (cycl_utilities.nat_arg1(constraint, UNPROVIDED).eql(n) && (NIL != psp_frame_specific_raw_constraintP(constraint))) {
                        frame_type = psp_frame_type_from_constituent_type(cycl_utilities.nat_arg2(constraint, UNPROVIDED));
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return frame_type;
    }

    public static SubLObject psp_parse_tree_for_edge(final SubLObject edge) {
        if (NIL != psp_chart.psp_phrasal_edgeP(edge)) {
            return cons(psp_chart.psp_edge_rule_fort(edge), Mapping.mapcar(PSP_PARSE_TREE_FOR_EDGE, psp_chart.psp_edge_dtrs(edge)));
        }
        return list(psp_chart.get_psp_edge_category(edge), psp_chart.get_psp_edge_string(edge));
    }

    public static SubLObject clear_psp_rules_caches() {
        clear_psp_cycl_fails_constraintP();
        clear_psp_sub_categories();
        clear_psp_sub_pos_preds();
        clear_psp_phrase_types();
        clear_psp_rewrite();
        clear_psp_syntactic_constraint_types();
        clear_psp_semantic_constraint_types();
        return NIL;
    }

    public static SubLObject declare_psp_rules_file() {
        declareFunction(me, "phrase_structure_parser_rule_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "phrase_structure_parser_rule_p", "PHRASE-STRUCTURE-PARSER-RULE-P", 1, 0, false);
        new psp_rules.$phrase_structure_parser_rule_p$UnaryFunction();
        declareFunction(me, "psp_rule_fort", "PSP-RULE-FORT", 1, 0, false);
        declareFunction(me, "psp_rule_arity", "PSP-RULE-ARITY", 1, 0, false);
        declareFunction(me, "psp_rule_category", "PSP-RULE-CATEGORY", 1, 0, false);
        declareFunction(me, "psp_rule_head", "PSP-RULE-HEAD", 1, 0, false);
        declareFunction(me, "psp_rule_constraints", "PSP-RULE-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "psp_rule_semx", "PSP-RULE-SEMX", 1, 0, false);
        declareFunction(me, "psp_rule_weight", "PSP-RULE-WEIGHT", 1, 0, false);
        declareFunction(me, "_csetf_psp_rule_fort", "_CSETF-PSP-RULE-FORT", 2, 0, false);
        declareFunction(me, "_csetf_psp_rule_arity", "_CSETF-PSP-RULE-ARITY", 2, 0, false);
        declareFunction(me, "_csetf_psp_rule_category", "_CSETF-PSP-RULE-CATEGORY", 2, 0, false);
        declareFunction(me, "_csetf_psp_rule_head", "_CSETF-PSP-RULE-HEAD", 2, 0, false);
        declareFunction(me, "_csetf_psp_rule_constraints", "_CSETF-PSP-RULE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_psp_rule_semx", "_CSETF-PSP-RULE-SEMX", 2, 0, false);
        declareFunction(me, "_csetf_psp_rule_weight", "_CSETF-PSP-RULE-WEIGHT", 2, 0, false);
        declareFunction(me, "make_phrase_structure_parser_rule", "MAKE-PHRASE-STRUCTURE-PARSER-RULE", 0, 1, false);
        declareFunction(me, "visit_defstruct_phrase_structure_parser_rule", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-RULE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_phrase_structure_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD", 2, 0, false);
        declareFunction(me, "pprint_psp_rule", "PPRINT-PSP-RULE", 1, 2, false);
        declareFunction(me, "new_psp_rule", "NEW-PSP-RULE", 0, 7, false);
        declareFunction(me, "psp_new_constraints", "PSP-NEW-CONSTRAINTS", 0, 0, false);
        declareFunction(me, "psp_constraints_on_dtr", "PSP-CONSTRAINTS-ON-DTR", 2, 0, false);
        declareFunction(me, "psp_new_constraint", "PSP-NEW-CONSTRAINT", 2, 0, false);
        declareFunction(me, "psp_constraint_type", "PSP-CONSTRAINT-TYPE", 1, 0, false);
        declareFunction(me, "psp_constraint_target", "PSP-CONSTRAINT-TARGET", 1, 0, false);
        declareMacro(me, "psp_destructure_constraint", "PSP-DESTRUCTURE-CONSTRAINT");
        declareFunction(me, "psp_rules", "PSP-RULES", 0, 0, false);
        declareFunction(me, "clear_psp_rules", "CLEAR-PSP-RULES", 0, 0, false);
        declareFunction(me, "add_phrase_structure_rule", "ADD-PHRASE-STRUCTURE-RULE", 2, 0, false);
        declareFunction(me, "remove_phrase_structure_rule", "REMOVE-PHRASE-STRUCTURE-RULE", 2, 0, false);
        declareFunction(me, "initialize_psp_rules", "INITIALIZE-PSP-RULES", 0, 1, false);
        declareFunction(me, "psp_check_initializations", "PSP-CHECK-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "store_one_psp_rule_fort", "STORE-ONE-PSP-RULE-FORT", 1, 0, false);
        declareFunction(me, "psp_valid_raw_constraintP", "PSP-VALID-RAW-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "psp_get_semx_for_rule_fort", "PSP-GET-SEMX-FOR-RULE-FORT", 1, 0, false);
        declareFunction(me, "psp_binding_expressions_for_rule_fort", "PSP-BINDING-EXPRESSIONS-FOR-RULE-FORT", 1, 0, false);
        declareFunction(me, "psp_rule_fort_weight_factor", "PSP-RULE-FORT-WEIGHT-FACTOR", 1, 1, false);
        declareFunction(me, "psp_explicit_weight_factor_for_rule_fort", "PSP-EXPLICIT-WEIGHT-FACTOR-FOR-RULE-FORT", 1, 0, false);
        declareFunction(me, "psp_rule_fort_weights_internal", "PSP-RULE-FORT-WEIGHTS-INTERNAL", 0, 0, false);
        declareFunction(me, "psp_rule_fort_weights", "PSP-RULE-FORT-WEIGHTS", 0, 0, false);
        declareFunction(me, "psp_rule_weight_factor_from_arity", "PSP-RULE-WEIGHT-FACTOR-FROM-ARITY", 1, 0, false);
        declareFunction(me, "add_psp_rule", "ADD-PSP-RULE", 7, 0, false);
        declareFunction(me, "psp_rule_struct_for_rule_fort", "PSP-RULE-STRUCT-FOR-RULE-FORT", 1, 0, false);
        declareFunction(me, "psp_category_meets_constraintsP", "PSP-CATEGORY-MEETS-CONSTRAINTS?", 2, 0, false);
        declareFunction(me, "psp_parse_constraint", "PSP-PARSE-CONSTRAINT", 1, 0, false);
        declareFunction(me, "psp_frame_specific_raw_constraintP", "PSP-FRAME-SPECIFIC-RAW-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "psp_frame_constraint_from_raw_constraint", "PSP-FRAME-CONSTRAINT-FROM-RAW-CONSTRAINT", 1, 0, false);
        declareFunction(me, "psp_add_derivable_rules", "PSP-ADD-DERIVABLE-RULES", 1, 0, false);
        declareFunction(me, "psp_trace", "PSP-TRACE", 1, 0, false);
        declareFunction(me, "psp_untrace", "PSP-UNTRACE", 0, 1, false);
        declareFunction(me, "psp_traced_ruleP", "PSP-TRACED-RULE?", 1, 0, false);
        declareMacro(me, "psp_trace_report", "PSP-TRACE-REPORT");
        declareMacro(me, "do_psp_trace_report", "DO-PSP-TRACE-REPORT");
        declareFunction(me, "psp_rules_starting_with_edge", "PSP-RULES-STARTING-WITH-EDGE", 1, 1, false);
        declareFunction(me, "psp_rule_could_start_at_indexP", "PSP-RULE-COULD-START-AT-INDEX?", 2, 0, false);
        declareFunction(me, "psp_filter_cycls", "PSP-FILTER-CYCLS", 4, 0, false);
        declareFunction(me, "psp_cyclify_targets", "PSP-CYCLIFY-TARGETS", 2, 0, false);
        declareFunction(me, "psp_edge_passes_semantic_constraintsP", "PSP-EDGE-PASSES-SEMANTIC-CONSTRAINTS?", 1, 0, false);
        declareFunction(me, "psp_edge_meets_syntax_constraintsP", "PSP-EDGE-MEETS-SYNTAX-CONSTRAINTS?", 2, 2, false);
        declareFunction(me, "psp_syntactic_constraintP", "PSP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "clear_psp_syntactic_constraint_types", "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES", 0, 0, false);
        declareFunction(me, "psp_syntactic_constraint_typeP", "PSP-SYNTACTIC-CONSTRAINT-TYPE?", 1, 0, false);
        declareFunction(me, "psp_semantic_constraintP", "PSP-SEMANTIC-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "clear_psp_semantic_constraint_types", "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES", 0, 0, false);
        declareFunction(me, "psp_semantic_constraint_typeP", "PSP-SEMANTIC-CONSTRAINT-TYPE?", 1, 0, false);
        declareFunction(me, "clear_psp_cycl_fails_constraintP", "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?", 0, 0, false);
        declareFunction(me, "remove_psp_cycl_fails_constraintP", "REMOVE-PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        declareFunction(me, "psp_cycl_fails_constraintP_internal", "PSP-CYCL-FAILS-CONSTRAINT?-INTERNAL", 2, 0, false);
        declareFunction(me, "psp_cycl_fails_constraintP", "PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        declareFunction(me, "psp_edge_fails_constraintP", "PSP-EDGE-FAILS-CONSTRAINT?", 3, 0, false);
        declareFunction(me, "clear_psp_phrase_types", "CLEAR-PSP-PHRASE-TYPES", 0, 0, false);
        declareFunction(me, "remove_psp_phrase_types", "REMOVE-PSP-PHRASE-TYPES", 0, 1, false);
        declareFunction(me, "psp_phrase_types_internal", "PSP-PHRASE-TYPES-INTERNAL", 1, 0, false);
        declareFunction(me, "psp_phrase_types", "PSP-PHRASE-TYPES", 0, 1, false);
        declareFunction(me, "psp_constraints_require_phraseP_internal", "PSP-CONSTRAINTS-REQUIRE-PHRASE?-INTERNAL", 1, 0, false);
        declareFunction(me, "psp_constraints_require_phraseP", "PSP-CONSTRAINTS-REQUIRE-PHRASE?", 1, 0, false);
        declareFunction(me, "psp_edge_fails_lexeme_constraintP", "PSP-EDGE-FAILS-LEXEME-CONSTRAINT?", 2, 0, false);
        declareFunction(me, "psp_lexeme_constraintP", "PSP-LEXEME-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "psp_frame_specific_constituent_typeP", "PSP-FRAME-SPECIFIC-CONSTITUENT-TYPE?", 1, 0, false);
        declareFunction(me, "psp_frame_type_from_constituent_type", "PSP-FRAME-TYPE-FROM-CONSTITUENT-TYPE", 1, 0, false);
        declareFunction(me, "psp_constraint_target_includesP", "PSP-CONSTRAINT-TARGET-INCLUDES?", 2, 1, false);
        declareFunction(me, "psp_edge_has_wuP", "PSP-EDGE-HAS-WU?", 2, 0, false);
        declareFunction(me, "psp_det_nbar_agreeP", "PSP-DET-NBAR-AGREE?", 3, 0, false);
        declareFunction(me, "psp_valid_constituent_typeP", "PSP-VALID-CONSTITUENT-TYPE?", 2, 0, false);
        declareFunction(me, "clear_psp_sub_categories", "CLEAR-PSP-SUB-CATEGORIES", 0, 0, false);
        declareFunction(me, "remove_psp_sub_categories", "REMOVE-PSP-SUB-CATEGORIES", 1, 0, false);
        declareFunction(me, "psp_sub_categories_internal", "PSP-SUB-CATEGORIES-INTERNAL", 1, 0, false);
        declareFunction(me, "psp_sub_categories", "PSP-SUB-CATEGORIES", 1, 0, false);
        declareFunction(me, "psp_simplify_if_frame_specific_type", "PSP-SIMPLIFY-IF-FRAME-SPECIFIC-TYPE", 1, 0, false);
        declareFunction(me, "clear_psp_sub_pos_preds", "CLEAR-PSP-SUB-POS-PREDS", 0, 0, false);
        declareFunction(me, "remove_psp_sub_pos_preds", "REMOVE-PSP-SUB-POS-PREDS", 1, 1, false);
        declareFunction(me, "psp_sub_pos_preds_internal", "PSP-SUB-POS-PREDS-INTERNAL", 2, 0, false);
        declareFunction(me, "psp_sub_pos_preds", "PSP-SUB-POS-PREDS", 1, 1, false);
        declareFunction(me, "clear_psp_frame_type_instances", "CLEAR-PSP-FRAME-TYPE-INSTANCES", 0, 0, false);
        declareFunction(me, "remove_psp_frame_type_instances", "REMOVE-PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        declareFunction(me, "psp_frame_type_instances_internal", "PSP-FRAME-TYPE-INSTANCES-INTERNAL", 2, 0, false);
        declareFunction(me, "psp_frame_type_instances", "PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        declareFunction(me, "clear_psp_rewrite", "CLEAR-PSP-REWRITE", 0, 0, false);
        declareFunction(me, "remove_psp_rewrite", "REMOVE-PSP-REWRITE", 1, 0, false);
        declareFunction(me, "psp_rewrite_internal", "PSP-REWRITE-INTERNAL", 1, 0, false);
        declareFunction(me, "psp_rewrite", "PSP-REWRITE", 1, 0, false);
        declareFunction(me, "psp_isaP_internal", "PSP-ISA?-INTERNAL", 2, 0, false);
        declareFunction(me, "psp_isaP", "PSP-ISA?", 2, 0, false);
        declareFunction(me, "psp_genlP_internal", "PSP-GENL?-INTERNAL", 2, 0, false);
        declareFunction(me, "psp_genlP", "PSP-GENL?", 2, 0, false);
        declareFunction(me, "psp_rule_new_dtr_constraints", "PSP-RULE-NEW-DTR-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "psp_new_dtr_constraints_from_frame", "PSP-NEW-DTR-CONSTRAINTS-FROM-FRAME", 1, 0, false);
        declareFunction(me, "psp_add_by_phrase_constraints", "PSP-ADD-BY-PHRASE-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "psp_passivized_dtrP", "PSP-PASSIVIZED-DTR?", 2, 0, false);
        declareFunction(me, "psp_constraints_for_frame", "PSP-CONSTRAINTS-FOR-FRAME", 1, 0, false);
        declareFunction(me, "psp_spec_const_constraintP", "PSP-SPEC-CONST-CONSTRAINT?", 2, 0, false);
        declareFunction(me, "psp_find_dtr_frame_type", "PSP-FIND-DTR-FRAME-TYPE", 2, 0, false);
        declareFunction(me, "psp_parse_tree_for_edge", "PSP-PARSE-TREE-FOR-EDGE", 1, 0, false);
        declareFunction(me, "clear_psp_rules_caches", "CLEAR-PSP-RULES-CACHES", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_psp_rules_file() {
        defconstant("*DTP-PHRASE-STRUCTURE-PARSER-RULE*", PHRASE_STRUCTURE_PARSER_RULE);
        defparameter("*PSP-RULES*", set.new_set(symbol_function(EQUALP), $int$128));
        deflexical("*PSP-RULE-FORT-WEIGHTS*", list(bq_cons($$PSRule_NounNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_AdjectiveNameCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5))));
        defconstant("*PSP-RULE-ARITY-WEIGHT*", parsing_utilities.psp_weight_from_float($float$0_95));
        deflexical("*PSP-TRACED-RULES*", SubLTrampolineFile.maybeDefault($psp_traced_rules$, $psp_traced_rules$, NIL));
        deflexical("*PSP-SYNTACTIC-CONSTRAINT-TYPES*", SubLTrampolineFile.maybeDefault($psp_syntactic_constraint_types$, $psp_syntactic_constraint_types$, NIL));
        deflexical("*PSP-SEMANTIC-CONSTRAINT-TYPES*", SubLTrampolineFile.maybeDefault($psp_semantic_constraint_types$, $psp_semantic_constraint_types$, NIL));
        deflexical("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*", NIL);
        deflexical("*PSP-PHRASE-TYPES-CACHING-STATE*", NIL);
        deflexical("*PSP-SUB-CATEGORIES-CACHING-STATE*", NIL);
        deflexical("*PSP-SUB-POS-PREDS-CACHING-STATE*", NIL);
        deflexical("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*", NIL);
        deflexical("*PSP-REWRITE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_psp_rules_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PSP_RULE_FORT, _CSETF_PSP_RULE_FORT);
        def_csetf(PSP_RULE_ARITY, _CSETF_PSP_RULE_ARITY);
        def_csetf(PSP_RULE_CATEGORY, _CSETF_PSP_RULE_CATEGORY);
        def_csetf(PSP_RULE_HEAD, _CSETF_PSP_RULE_HEAD);
        def_csetf(PSP_RULE_CONSTRAINTS, _CSETF_PSP_RULE_CONSTRAINTS);
        def_csetf(PSP_RULE_SEMX, _CSETF_PSP_RULE_SEMX);
        def_csetf(PSP_RULE_WEIGHT, _CSETF_PSP_RULE_WEIGHT);
        identity(PHRASE_STRUCTURE_PARSER_RULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD));
        register_kb_function(ADD_PHRASE_STRUCTURE_RULE);
        register_kb_function(REMOVE_PHRASE_STRUCTURE_RULE);
        memoization_state.note_memoized_function(PSP_RULE_FORT_WEIGHTS);
        declare_defglobal($psp_traced_rules$);
        declare_defglobal($psp_syntactic_constraint_types$);
        declare_defglobal($psp_semantic_constraint_types$);
        memoization_state.note_globally_cached_function($sym116$PSP_CYCL_FAILS_CONSTRAINT_);
        memoization_state.note_globally_cached_function(PSP_PHRASE_TYPES);
        memoization_state.note_memoized_function($sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_);
        memoization_state.note_globally_cached_function(PSP_SUB_CATEGORIES);
        memoization_state.note_globally_cached_function(PSP_SUB_POS_PREDS);
        memoization_state.note_globally_cached_function(PSP_FRAME_TYPE_INSTANCES);
        memoization_state.note_globally_cached_function(PSP_REWRITE);
        memoization_state.note_memoized_function($sym146$PSP_ISA_);
        memoization_state.note_memoized_function($sym147$PSP_GENL_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_psp_rules_file();
    }

    @Override
    public void initializeVariables() {
        init_psp_rules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_psp_rules_file();
    }

    static {


















































































































































































    }

    public static final class $phrase_structure_parser_rule_native extends SubLStructNative {
        public SubLObject $fort;

        public SubLObject $arity;

        public SubLObject $category;

        public SubLObject $head;

        public SubLObject $constraints;

        public SubLObject $semx;

        public SubLObject $weight;

        private static final SubLStructDeclNative structDecl;

        public $phrase_structure_parser_rule_native() {
            this.$fort = Lisp.NIL;
            this.$arity = Lisp.NIL;
            this.$category = Lisp.NIL;
            this.$head = Lisp.NIL;
            this.$constraints = Lisp.NIL;
            this.$semx = Lisp.NIL;
            this.$weight = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$fort;
        }

        @Override
        public SubLObject getField3() {
            return this.$arity;
        }

        @Override
        public SubLObject getField4() {
            return this.$category;
        }

        @Override
        public SubLObject getField5() {
            return this.$head;
        }

        @Override
        public SubLObject getField6() {
            return this.$constraints;
        }

        @Override
        public SubLObject getField7() {
            return this.$semx;
        }

        @Override
        public SubLObject getField8() {
            return this.$weight;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$fort = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$arity = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$category = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$head = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$constraints = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$semx = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$weight = value;
        }

        static {
            structDecl = makeStructDeclNative(psp_rules.$phrase_structure_parser_rule_native.class, PHRASE_STRUCTURE_PARSER_RULE, PHRASE_STRUCTURE_PARSER_RULE_P, $list2, $list3, new String[]{ "$fort", "$arity", "$category", "$head", "$constraints", "$semx", "$weight" }, $list4, $list5, PPRINT_PSP_RULE);
        }
    }

    public static final class $phrase_structure_parser_rule_p$UnaryFunction extends UnaryFunction {
        public $phrase_structure_parser_rule_p$UnaryFunction() {
            super(extractFunctionNamed("PHRASE-STRUCTURE-PARSER-RULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return phrase_structure_parser_rule_p(arg1);
        }
    }
}

/**
 * Total time: 1561 ms
 */
