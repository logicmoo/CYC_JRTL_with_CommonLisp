package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.kb_mapping_macros.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_mapping_macros extends SubLTranslatedFile {
    public static final SubLFile me = new kb_mapping_macros();

    public static final String myName = "com.cyc.cycjava.cycl.kb_mapping_macros";

    public static final String myFingerPrint = "184cbd32d9e5be2e0882e3e80514d0e73f00d11a2e04771a54d163f6f77f0ce6";



    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("PREDICATE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym2$RELEVANT_PRED_ = makeSymbol("RELEVANT-PRED?");

    public static final SubLList $list3 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym4$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    public static final SubLList $list5 = list(makeSymbol("TRUTH"), makeSymbol("TRUTH-SPEC"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol TRUTH_RELEVANT_P = makeSymbol("TRUTH-RELEVANT-P");

    public static final SubLSymbol PWHEN_TRUTH_RELEVANT = makeSymbol("PWHEN-TRUTH-RELEVANT");

    public static final SubLList $list9 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol ASSERTION_HAS_TRUTH = makeSymbol("ASSERTION-HAS-TRUTH");





    public static final SubLList $list13 = list(makeSymbol("ASSERTION"), makeSymbol("DIRECTION-SPEC"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol ASSERTION_HAS_DIRECTION_SPEC = makeSymbol("ASSERTION-HAS-DIRECTION-SPEC");

    public static final SubLList $list15 = list(list(makeSymbol("VAR"), makeSymbol("ASSERTIONS"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list16 = list(makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    public static final SubLSymbol PWHEN_ASSERTION_HAS_TRUTH = makeSymbol("PWHEN-ASSERTION-HAS-TRUTH");

    public static final SubLSymbol PWHEN_ASSERTION_HAS_DIRECTION_SPEC = makeSymbol("PWHEN-ASSERTION-HAS-DIRECTION-SPEC");

    public static final SubLList $list24 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ASSERTION_LIST = makeSymbol("DO-ASSERTION-LIST");

    public static final SubLSymbol DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = makeSymbol("DO-SIMPLE-INDEX-TERM-ASSERTION-LIST");

    public static final SubLList $list27 = list(makeSymbol("ASSERTION"), makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym29$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");



    public static final SubLSymbol $sym31$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    public static final SubLSymbol ASSERTION_HAS_TYPE = makeSymbol("ASSERTION-HAS-TYPE");

    public static final SubLList $list33 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list34 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));



    public static final SubLSymbol UNTIL_MAPPING_FINISHED = makeSymbol("UNTIL-MAPPING-FINISHED");

    public static final SubLSymbol SOME_ASSERTIONS_INTERNAL = makeSymbol("SOME-ASSERTIONS-INTERNAL");

    public static final SubLList $list38 = list(list(makeSymbol("MAPPING-FINISHED")));

    public static final SubLSymbol SOME_ASSERTIONS = makeSymbol("SOME-ASSERTIONS");

    public static final SubLList $list40 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list41 = list(makeKeyword("PROGRESS-MESSAGE"));

    public static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

    public static final SubLSymbol DO_FINAL_INDEX_FROM_SPEC = makeSymbol("DO-FINAL-INDEX-FROM-SPEC");

    public static final SubLList $list44 = list(new SubLObject[]{ makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-NART-ARG-INDEX"), makeSymbol("DO-FUNCTION-EXTENT-INDEX"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("DO-ISA-RULE-INDEX"), makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), makeSymbol("DO-GENLS-RULE-INDEX"), makeSymbol("DO-GENL-MT-RULE-INDEX"), makeSymbol("DO-FUNCTION-RULE-INDEX"), makeSymbol("DO-EXCEPTION-RULE-INDEX"), makeSymbol("DO-PRAGMA-RULE-INDEX"), makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), makeSymbol("DO-MT-INDEX"), makeSymbol("DO-OTHER-INDEX"), makeSymbol("DO-TERM-INDEX") });

    public static final SubLList $list45 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("FINAL-INDEX-SPEC"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym46$FINAL_INDEX_ITERATOR = makeUninternedSymbol("FINAL-INDEX-ITERATOR");







    public static final SubLSymbol NEW_FINAL_INDEX_ITERATOR = makeSymbol("NEW-FINAL-INDEX-ITERATOR");

    public static final SubLSymbol DO_ITERATOR_WITHOUT_VALUES_INTERNAL = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-INTERNAL");

    public static final SubLSymbol DESTROY_FINAL_INDEX_ITERATOR = makeSymbol("DESTROY-FINAL-INDEX-ITERATOR");

    public static final SubLList $list53 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list54 = list(makeKeyword("INDEX"), makeKeyword("PREDICATE"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));





    public static final SubLSymbol $sym57$PRED_VAR = makeUninternedSymbol("PRED-VAR");

    public static final SubLSymbol $sym58$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    public static final SubLSymbol DO_GAF_ARG_INDEX_KEY_VALIDATOR = makeSymbol("DO-GAF-ARG-INDEX-KEY-VALIDATOR");

    public static final SubLSymbol NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR");



    public static final SubLString $str62$Iterate_over_an_index_of_gaf_asse = makeString("Iterate over an index of gaf assertions executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR.");

    public static final SubLList $list63 = list(list(makeSymbol("FORMULA-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym64$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");



    private static final SubLSymbol DO_GAF_ARG_INDEX_FORMULAS = makeSymbol("DO-GAF-ARG-INDEX-FORMULAS");

    private static final SubLString $str67$Iterate_over_an_index_of_gaf_asse = makeString("Iterate over an index of gaf assertion formulas executing BODY within the scope of VAR.\nThis version can be significantly faster than do-gaf-arg-index if you don\'t need the assertions \n -- at least under Alexandria and no slower in non-Alexandria.\nDoes not put a #$not around negated gaf formulas.\nVAR is bound to each GAF formula in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR.");

    private static final SubLList $list68 = list(list(new SubLObject[]{ makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("GATHER-INDEX"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym69$ASSERTION = makeUninternedSymbol("ASSERTION");

    private static final SubLSymbol GAF_ARG = makeSymbol("GAF-ARG");



    private static final SubLSymbol $sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT");

    private static final SubLSymbol $ARGNUM_KEYS_ARE_FRESH = makeKeyword("ARGNUM-KEYS-ARE-FRESH");



    private static final SubLSymbol $PREDICATE_KEYS_ARE_FRESH = makeKeyword("PREDICATE-KEYS-ARE-FRESH");

    private static final SubLList $list77 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list78 = list(makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"), makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $sym79$PRED_VAR = makeUninternedSymbol("PRED-VAR");

    private static final SubLSymbol $sym80$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR = makeSymbol("DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR");





    private static final SubLSymbol DO_ITERATOR_WITHOUT_VALUES_PROGRESS = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR");

    private static final SubLSymbol NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol $sym87$PRED_VAR = makeUninternedSymbol("PRED-VAR");

    private static final SubLSymbol $sym88$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR");



    private static final SubLList $list91 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("GATHER-ARG"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym92$PRED_VAR = makeUninternedSymbol("PRED-VAR");

    private static final SubLSymbol $sym93$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR");

    private static final SubLSymbol $sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT");



    public static final SubLList $list98 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("FUNCTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list99 = list(makeKeyword("INDEX"), makeKeyword("FUNCTION"), makeKeyword("DONE"));



    private static final SubLSymbol $sym101$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_NART_ARG_INDEX_KEY_VALIDATOR = makeSymbol("DO-NART-ARG-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_NART_ARG_INDEX = makeSymbol("DO-NART-ARG-INDEX");

    private static final SubLSymbol $sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT");



    private static final SubLString $str108$nart_arg_keys_should_never_be_irr = makeString("nart arg keys should never be irrelevant: ~s ~s");

    private static final SubLSymbol $FUNCTION_KEYS_ARE_FRESH = makeKeyword("FUNCTION-KEYS-ARE-FRESH");

    private static final SubLList $list110 = list(list(makeSymbol("VAR"), makeSymbol("FUNCTION"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym111$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR = makeSymbol("DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol FUNCTION_EXTENT_FINAL_INDEX_SPEC = makeSymbol("FUNCTION-EXTENT-FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_FUNCTION_EXTENT_INDEX = makeSymbol("DO-FUNCTION-EXTENT-INDEX");

    private static final SubLList $list115 = list(list(makeSymbol("VAR"), makeSymbol("FUNCTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list116 = list(makeKeyword("DONE"));

    private static final SubLSymbol $sym117$TOU = makeUninternedSymbol("TOU");



    private static final SubLList $list119 = list(TWO_INTEGER, ZERO_INTEGER);

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLList $list121 = list(makeKeyword("FUNCTION-EXTENT"));

    private static final SubLList $list122 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list123 = list(makeKeyword("DIRECTION"), makeKeyword("DONE"));

    private static final SubLSymbol DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");







    private static final SubLList $list128 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list129 = list(makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("DONE"));

    private static final SubLSymbol $sym130$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol("PREDICATE-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLSymbol $sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");

    private static final SubLSymbol $SENSE_KEYS_ARE_FRESH = makeKeyword("SENSE-KEYS-ARE-FRESH");



    private static final SubLString $str138$predicate_rule_iterator_quiescens = makeString("predicate-rule iterator quiescense failed with ~s");

    private static final SubLSymbol $MT_KEYS_ARE_FRESH = makeKeyword("MT-KEYS-ARE-FRESH");

    private static final SubLSymbol $sym140$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");

    private static final SubLSymbol DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLSymbol $sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON = makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol $sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX = makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");

    private static final SubLSymbol $DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");

    private static final SubLString $str148$ist_predicate_rule_iterator_quies = makeString("ist-predicate-rule iterator quiescense failed with ~s");

    private static final SubLList $list149 = list(list(makeSymbol("VAR"), makeSymbol("COLLECTION"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym150$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_ISA_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-ISA-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_ISA_RULE_INDEX = makeSymbol("DO-ISA-RULE-INDEX");

    private static final SubLSymbol ISA_RULE_INDEX_ASENT_MATCH_P = makeSymbol("ISA-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLSymbol $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");

    private static final SubLSymbol $sym159$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_QUOTED_ISA_RULE_INDEX = makeSymbol("DO-QUOTED-ISA-RULE-INDEX");

    private static final SubLSymbol QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P = makeSymbol("QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLSymbol $QUOTED_ISA_RULE = makeKeyword("QUOTED-ISA-RULE");

    private static final SubLSymbol $sym166$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_GENLS_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-GENLS-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_GENLS_RULE_INDEX = makeSymbol("DO-GENLS-RULE-INDEX");

    private static final SubLSymbol GENLS_RULE_INDEX_ASENT_MATCH_P = makeSymbol("GENLS-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));



    private static final SubLList $list173 = list(list(makeSymbol("VAR"), makeSymbol("GENL-MT"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym174$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_GENL_MT_RULE_INDEX = makeSymbol("DO-GENL-MT-RULE-INDEX");

    private static final SubLSymbol GENL_MT_RULE_INDEX_ASENT_MATCH_P = makeSymbol("GENL-MT-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLSymbol $GENL_MT_RULE = makeKeyword("GENL-MT-RULE");

    private static final SubLString $str181$pred_arg2_rule_iterator_quiescens = makeString("pred-arg2-rule iterator quiescense failed with ~s");

    private static final SubLString $str182$unexpected_pred_in_pred_arg2_inde = makeString("unexpected pred in pred-arg2 indexing: ~s");

    private static final SubLList $list183 = list(list(makeSymbol("VAR"), makeSymbol("FUNCTION"), makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym184$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_FUNCTION_RULE_INDEX = makeSymbol("DO-FUNCTION-RULE-INDEX");

    private static final SubLSymbol FUNCTION_RULE_INDEX_ASENT_MATCH_P = makeSymbol("FUNCTION-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLSymbol $sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");



    private static final SubLString $str192$function_rule_iterator_quiescense = makeString("function-rule iterator quiescense failed with ~s");

    private static final SubLList $list193 = list(list(makeSymbol("VAR"), makeSymbol("RULE"), makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym194$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_EXCEPTION_RULE_INDEX = makeSymbol("DO-EXCEPTION-RULE-INDEX");

    private static final SubLSymbol EXCEPTION_RULE_INDEX_ASENT_MATCH_P = makeSymbol("EXCEPTION-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLSymbol $sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");



    private static final SubLString $str202$exception_rule_iterator_quiescens = makeString("exception-rule iterator quiescense failed with ~s");

    private static final SubLSymbol $sym203$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_PRAGMA_RULE_INDEX = makeSymbol("DO-PRAGMA-RULE-INDEX");

    private static final SubLSymbol PRAGMA_RULE_INDEX_ASENT_MATCH_P = makeSymbol("PRAGMA-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLSymbol $sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");



    private static final SubLString $str211$pragma_rule_iterator_quiescense_f = makeString("pragma-rule iterator quiescense failed with ~s");

    public static final SubLList $list212 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym213$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_UNBOUND_PREDICATE_RULE_INDEX = makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX");

    private static final SubLSymbol UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol("UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P");

    private static final SubLSymbol $sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");

    private static final SubLSymbol UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");

    private static final SubLString $str220$unbound_predicate_rule_iterator_q = makeString("unbound-predicate-rule iterator quiescense failed with ~s");

    private static final SubLList $list221 = list(list(makeSymbol("VAR"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list222 = list(makeKeyword("TYPE"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));



    private static final SubLSymbol $sym224$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_MT_INDEX_KEY_VALIDATOR = makeSymbol("DO-MT-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol MT_FINAL_INDEX_SPEC = makeSymbol("MT-FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_MT_INDEX = makeSymbol("DO-MT-INDEX");

    private static final SubLSymbol MT_INDEX_ASSERTION_MATCH_P = makeSymbol("MT-INDEX-ASSERTION-MATCH-P");

    private static final SubLList $list229 = list(makeKeyword("IST"));

    public static final SubLList $list230 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym231$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_OTHER_INDEX_KEY_VALIDATOR = makeSymbol("DO-OTHER-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol OTHER_FINAL_INDEX_SPEC = makeSymbol("OTHER-FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_OTHER_INDEX_ASSERTION_MATCH_P = makeSymbol("DO-OTHER-INDEX-ASSERTION-MATCH-P");

    private static final SubLSymbol DO_OTHER_INDEX = makeSymbol("DO-OTHER-INDEX");

    private static final SubLSymbol OTHER_INDEX_ASSERTION_MATCH_P = makeSymbol("OTHER-INDEX-ASSERTION-MATCH-P");

    private static final SubLList $list237 = list(makeKeyword("OTHER"));

    private static final SubLSymbol OTHER_FINAL_INDEX_SPEC_P = makeSymbol("OTHER-FINAL-INDEX-SPEC-P");

    private static final SubLSymbol DO_TERM_INDEX = makeSymbol("DO-TERM-INDEX");





    private static final SubLSymbol $sym242$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");

    private static final SubLSymbol DO_TERM_INDEX_KEY_VALIDATOR = makeSymbol("DO-TERM-INDEX-KEY-VALIDATOR");

    private static final SubLSymbol NEW_TERM_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-TERM-FINAL-INDEX-SPEC-ITERATOR");

    private static final SubLSymbol DO_TERM_INDEX_ASSERTION_MATCH_P = makeSymbol("DO-TERM-INDEX-ASSERTION-MATCH-P");

    private static final SubLString $str246$Iterate_over_all_assertions_index = makeString("Iterate over all assertions indexed from TERM executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is indexed from TERM.\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf the assertion is a gaf, then its predicate is relevant (relevance is established outside).\nIf TYPE is non-nil, then assertion has TYPE as its type.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets.\nSee other indexing macros for examples of how this could happen.");

    public static final SubLList $list247 = list(list(makeSymbol("VAR"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list248 = list(makeKeyword("TYPE"), makeKeyword("TRUTH"), makeKeyword("DONE"));

    private static final SubLSymbol DO_BROAD_MT_INDEX_KEY_VALIDATOR = makeSymbol("DO-BROAD-MT-INDEX-KEY-VALIDATOR");

    private static final SubLString $str250$do_broad_mt_index = makeString("do-broad-mt-index");

    private static final SubLSymbol DO_BROAD_MT_INDEX_MATCH_P = makeSymbol("DO-BROAD-MT-INDEX-MATCH-P");

    private static final SubLSymbol DO_BROAD_MT_INDEX = makeSymbol("DO-BROAD-MT-INDEX");

    private static final SubLList $list253 = list(list(makeSymbol("VAR"), makeSymbol("HLMT"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_JUST_MT = makeSymbol("WITH-JUST-MT");

    private static final SubLSymbol DO_OVERLAP_INDEX = makeSymbol("DO-OVERLAP-INDEX");

    private static final SubLSymbol FLATTEN = makeSymbol("FLATTEN");

    private static final SubLSymbol ASSERTION_TYPE = makeSymbol("ASSERTION-TYPE");

    private static final SubLSymbol $sym258$HLMT_EQUAL_ = makeSymbol("HLMT-EQUAL?");

    private static final SubLSymbol ASSERTION_HLMT = makeSymbol("ASSERTION-HLMT");



    private static final SubLSymbol DO_MT_CONTENTS_METHOD = makeSymbol("DO-MT-CONTENTS-METHOD");





    private static final SubLList $list264 = list(list(makeSymbol("OTHERWISE")));

    private static final SubLSymbol DO_MT_CONTENTS = makeSymbol("DO-MT-CONTENTS");



    private static final SubLList $list267 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERMS"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list268 = list(makeKeyword("TRUTH"), makeKeyword("DONE"));

    private static final SubLSymbol GATHER_OVERLAP_INDEX = makeSymbol("GATHER-OVERLAP-INDEX");

    private static final SubLList $list270 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list271 = list(makeKeyword("METHODS"), makeKeyword("TRUTH"), makeKeyword("DONE"));



    private static final SubLSymbol DO_BEST_GAF_LOOKUP_INDEX = makeSymbol("DO-BEST-GAF-LOOKUP-INDEX");

    private static final SubLSymbol DO_GAF_LOOKUP_INDEX = makeSymbol("DO-GAF-LOOKUP-INDEX");

    private static final SubLSymbol BEST_GAF_LOOKUP_INDEX = makeSymbol("BEST-GAF-LOOKUP-INDEX");

    public static final SubLList $list276 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("LOOKUP-INDEX"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym277$L_INDEX = makeUninternedSymbol("L-INDEX");

    private static final SubLSymbol $sym278$METHOD = makeUninternedSymbol("METHOD");

    private static final SubLSymbol DO_GLI_EXTRACT_METHOD = makeSymbol("DO-GLI-EXTRACT-METHOD");

    private static final SubLSymbol DO_GLI_VIA_GAF_ARG = makeSymbol("DO-GLI-VIA-GAF-ARG");

    private static final SubLSymbol DO_GLI_VIA_PREDICATE_EXTENT = makeSymbol("DO-GLI-VIA-PREDICATE-EXTENT");



    private static final SubLSymbol DO_GLI_VIA_OVERLAP = makeSymbol("DO-GLI-VIA-OVERLAP");



    private static final SubLSymbol DO_GLI_METHOD_ERROR = makeSymbol("DO-GLI-METHOD-ERROR");



    private static final SubLString $$$Skip_iteration = makeString("Skip iteration");

    private static final SubLString $str288$Unsupported_method__S_in__S_in_DO = makeString("Unsupported method ~S in ~S in DO-GAF-LOOKUP-INDEX");

    private static final SubLSymbol $sym289$TERM = makeUninternedSymbol("TERM");

    private static final SubLSymbol $sym290$ARGNUM = makeUninternedSymbol("ARGNUM");

    private static final SubLSymbol $sym291$PREDICATE = makeUninternedSymbol("PREDICATE");



    private static final SubLSymbol DO_GLI_VGA_EXTRACT_KEYS = makeSymbol("DO-GLI-VGA-EXTRACT-KEYS");







    private static final SubLSymbol DO_GLI_VPE_EXTRACT_KEY = makeSymbol("DO-GLI-VPE-EXTRACT-KEY");

    private static final SubLSymbol DO_GLI_VO_EXTRACT_KEY = makeSymbol("DO-GLI-VO-EXTRACT-KEY");



    public static final SubLList $list300 = list(list(makeSymbol("NART-VAR"), makeSymbol("NART-HL-FORMULA"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list301 = list(makeKeyword("METHODS"), makeKeyword("DONE"));

    private static final SubLSymbol $sym302$TOU_VAR = makeUninternedSymbol("TOU-VAR");

    private static final SubLSymbol DO_BEST_NAT_LOOKUP_INDEX = makeSymbol("DO-BEST-NAT-LOOKUP-INDEX");

    public static final SubLList $list304 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("NART-HL-FORMULA"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_NAT_LOOKUP_INDEX = makeSymbol("DO-NAT-LOOKUP-INDEX");

    private static final SubLSymbol BEST_NAT_LOOKUP_INDEX = makeSymbol("BEST-NAT-LOOKUP-INDEX");

    private static final SubLList $list307 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("LOOKUP-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym308$L_INDEX = makeUninternedSymbol("L-INDEX");

    private static final SubLSymbol $sym309$METHOD = makeUninternedSymbol("METHOD");

    private static final SubLSymbol DO_NLI_EXTRACT_METHOD = makeSymbol("DO-NLI-EXTRACT-METHOD");

    private static final SubLSymbol DO_NLI_VIA_NART_ARG = makeSymbol("DO-NLI-VIA-NART-ARG");



    private static final SubLSymbol DO_NLI_VIA_FUNCTION_EXTENT = makeSymbol("DO-NLI-VIA-FUNCTION-EXTENT");

    private static final SubLSymbol DO_NLI_VIA_OVERLAP = makeSymbol("DO-NLI-VIA-OVERLAP");

    private static final SubLSymbol DO_NLI_METHOD_ERROR = makeSymbol("DO-NLI-METHOD-ERROR");

    private static final SubLString $str316$Unsupported_method__S_in__S_in_DO = makeString("Unsupported method ~S in ~S in DO-NAT-LOOKUP-INDEX");

    private static final SubLSymbol $sym317$TERM = makeUninternedSymbol("TERM");

    private static final SubLSymbol $sym318$ARGNUM = makeUninternedSymbol("ARGNUM");

    private static final SubLSymbol $sym319$FUNCTOR = makeUninternedSymbol("FUNCTOR");

    private static final SubLSymbol DO_NLI_VNA_EXTRACT_KEYS = makeSymbol("DO-NLI-VNA-EXTRACT-KEYS");



    private static final SubLSymbol DO_NLI_VFE_EXTRACT_KEY = makeSymbol("DO-NLI-VFE-EXTRACT-KEY");

    private static final SubLSymbol DO_NLI_VO_EXTRACT_KEY = makeSymbol("DO-NLI-VO-EXTRACT-KEY");

    private static final SubLSymbol $sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_ = makeSymbol("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?");

    private static final SubLSymbol FINAL_INDEX_ITERATOR_FILTERED = makeSymbol("FINAL-INDEX-ITERATOR-FILTERED");



    private static final SubLList $list327 = listS(makeSymbol("SIMPLE"), makeSymbol("TERM"), makeSymbol("TYPE"), makeSymbol("REST"));

    private static final SubLString $str328$Unexpected_non_simple_index__s = makeString("Unexpected non-simple index ~s");

    private static final SubLList $list329 = list(makeSymbol("ARGNUM-SPEC"), makeSymbol("PRED-SPEC"), makeSymbol("MT-SPEC"));



    private static final SubLList $list331 = list(makeSymbol("ASSERTION-FUNC"));

    private static final SubLString $str332$unexpected_type__s_in_simple_fina = makeString("unexpected type ~s in simple final index spec ~s");

    private static final SubLList $list333 = list(list(makeSymbol("VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym334$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    private static final SubLSymbol $sym335$CLAUSE_STRUC = makeUninternedSymbol("CLAUSE-STRUC");

    private static final SubLSymbol ASSERTION_GAF_P = makeSymbol("ASSERTION-GAF-P");

    private static final SubLSymbol DO_ITERATOR_WITHOUT_VALUES = makeSymbol("DO-ITERATOR-WITHOUT-VALUES");

    private static final SubLSymbol NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR");





    private static final SubLSymbol ASSERTION_CNF = makeSymbol("ASSERTION-CNF");

    private static final SubLList $list342 = list(NIL, NIL, NIL);



    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLSymbol NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR = makeSymbol("NEW-ALEXANDRIA-RULES-WITH-CNF-ITERATOR");

    private static final SubLSymbol ASSERTION_CLAUSE_STRUC = makeSymbol("ASSERTION-CLAUSE-STRUC");



    private static final SubLSymbol CLAUSE_STRUC_ASSERTIONS = makeSymbol("CLAUSE-STRUC-ASSERTIONS");

    private static final SubLList $list349 = list(list(makeSymbol("VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), list(makeSymbol("EXCLUSIVE?"), T), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list350 = list(makeKeyword("EXCLUSIVE?"), makeKeyword("DONE"));



    private static final SubLSymbol $sym352$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    private static final SubLSymbol NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA = makeSymbol("NEW-DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA");

    private static final SubLSymbol $sym354$EXCLUSIVE_VAR = makeUninternedSymbol("EXCLUSIVE-VAR");

    private static final SubLSymbol NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR = makeSymbol("NEW-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-ITERATOR");





    private static final SubLList $list358 = cons(makeSymbol("TERM"), makeSymbol("KEYS"));

    private static final SubLSymbol FINAL_INDEX_P = makeSymbol("FINAL-INDEX-P");

    private static final SubLSymbol $sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_ = makeSymbol("ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?");

    private static final SubLSymbol SIMPLE_TERM_ASSERTION_LIST_FILTERED = makeSymbol("SIMPLE-TERM-ASSERTION-LIST-FILTERED");

    private static final SubLSymbol $simple_term_assertion_list_filtered_caching_state$ = makeSymbol("*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*");



    private static final SubLSymbol CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED = makeSymbol("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED");

    private static final SubLList $list365 = list(makeSymbol("ARGNUM-SPEC"), makeSymbol("PREDICATE-SPEC"), makeSymbol("MT-SPEC"));

    private static final SubLList $list366 = list(makeSymbol("N"), makeSymbol("M"));



    private static final SubLList $list368 = list(makeSymbol("ARGNUM-SPEC"), makeSymbol("FUNCTOR-SPEC"));

    private static final SubLList $list369 = list(makeSymbol("SENSE"), makeSymbol("ASENT-FUNC"));

    private static final SubLObject $$abnormal = reader_make_constant_shell(makeString("abnormal"));

    private static final SubLObject $$meetsPragmaticRequirement = reader_make_constant_shell(makeString("meetsPragmaticRequirement"));

    private static final SubLList $list372 = list(list(makeSymbol("HLMT-VAR"), makeSymbol("MONAD"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym373$HLMTS_SEEN_SO_FAR = makeUninternedSymbol("HLMTS-SEEN-SO-FAR");

    private static final SubLSymbol $sym374$ASSERTION = makeUninternedSymbol("ASSERTION");

    private static final SubLSymbol $sym375$MONAD_VAR = makeUninternedSymbol("MONAD-VAR");

    private static final SubLList $list376 = list(list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL), makeInteger(32)));





    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLList $list380 = list(reader_make_constant_shell(makeString("AnytimePSC")));





    private static final SubLSymbol HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");

    private static final SubLSymbol $sym384$SET_MEMBER_ = makeSymbol("SET-MEMBER?");



    public static SubLObject pwhen_predicate_is_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        predicate = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym2$RELEVANT_PRED_, predicate), append(body, NIL));
    }

    public static SubLObject pwhen_mt_is_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym4$RELEVANT_MT_, mt), append(body, NIL));
    }

    public static SubLObject pwhen_truth_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject truth = NIL;
        SubLObject truth_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        truth = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        truth_spec = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == truth_spec) {
            return bq_cons(PROGN, append(body, NIL));
        }
        return listS(PWHEN, list(TRUTH_RELEVANT_P, truth, truth_spec), append(body, NIL));
    }

    public static SubLObject truth_relevant_p(final SubLObject truth, final SubLObject truth_spec) {
        return makeBoolean((NIL == truth_spec) || truth.eql(truth_spec));
    }

    public static SubLObject pwhen_assertion_has_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = NIL;
        SubLObject truth = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        truth = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == truth) {
            return bq_cons(PROGN, append(body, NIL));
        }
        if (NIL != enumeration_types.truth_p(truth)) {
            return listS(PWHEN, list(ASSERTION_HAS_TRUTH, assertion, truth), append(body, NIL));
        }
        return listS(PWHEN, list(COR, list(NULL, truth), list(ASSERTION_HAS_TRUTH, assertion, truth)), append(body, NIL));
    }

    public static SubLObject pwhen_assertion_has_direction_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = NIL;
        SubLObject direction_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        direction_spec = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == direction_spec) {
            return bq_cons(PROGN, append(body, NIL));
        }
        if (NIL != direction_spec_p(direction_spec)) {
            return listS(PWHEN, list(ASSERTION_HAS_DIRECTION_SPEC, assertion, direction_spec), append(body, NIL));
        }
        return listS(PWHEN, list(COR, list(NULL, direction_spec), list(ASSERTION_HAS_DIRECTION_SPEC, assertion, direction_spec)), append(body, NIL));
    }

    public static SubLObject direction_spec_p(final SubLObject v_object) {
        return enumeration_types.direction_p(v_object);
    }

    public static SubLObject assertion_has_direction_spec(final SubLObject assertion, final SubLObject direction_spec) {
        return assertions_high.assertion_has_direction(assertion, direction_spec);
    }

    public static SubLObject do_assertion_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject assertions = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        assertions = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$1, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_LIST, list(var, assertions, $DONE, done), listS(PWHEN_ASSERTION_HAS_TRUTH, var, truth, list(PWHEN_ASSERTION_HAS_DIRECTION_SPEC, var, direction), append(body, NIL)));
    }

    public static SubLObject do_simple_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$2, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ASSERTION_LIST, list(var, list(DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, v_term), $TRUTH, truth, $DIRECTION, direction, $DONE, done), append(body, NIL));
    }

    public static SubLObject pwhen_assertion_has_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        type = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == type) {
            return bq_cons(PROGN, append(body, NIL));
        }
        if ($GAF == type) {
            return listS(PWHEN, list($sym29$GAF_ASSERTION_, assertion), append(body, NIL));
        }
        if ($RULE == type) {
            return listS(PWHEN, list($sym31$RULE_ASSERTION_, assertion), append(body, NIL));
        }
        return listS(PWHEN, list(COR, list(NULL, type), list(ASSERTION_HAS_TYPE, assertion, type)), append(body, NIL));
    }

    public static SubLObject some_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list33);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list33);
            if (NIL == member(current_$3, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list33);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != done) {
            return list(UNTIL_MAPPING_FINISHED, listS(SOME_ASSERTIONS_INTERNAL, list(var, $PROGRESS_MESSAGE, progress_message), listS(PWHEN, done, $list38), append(body, NIL)));
        }
        return listS(SOME_ASSERTIONS_INTERNAL, list(var, $PROGRESS_MESSAGE, progress_message), append(body, NIL));
    }

    public static SubLObject some_assertions_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list40);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list40);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list40);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list40);
            if (NIL == member(current_$4, $list41, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list40);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ASSERTIONS, bq_cons(var, append(NIL != progress_message ? list(progress_message) : NIL, NIL)), append(body, NIL));
    }

    public static SubLObject do_final_index_from_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject final_index_spec = NIL;
        SubLObject type = NIL;
        SubLObject truth = NIL;
        SubLObject direction = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final_index_spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        truth = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        done = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject final_index_iterator = $sym46$FINAL_INDEX_ITERATOR;
            return list(CLET, list(final_index_iterator), list(CUNWIND_PROTECT, list(PROGN, list(CSETQ, final_index_iterator, list(NEW_FINAL_INDEX_ITERATOR, final_index_spec, type, truth, direction)), listS(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(assertion_var, final_index_iterator, $DONE, done), append(body, NIL))), list(PWHEN, final_index_iterator, list(DESTROY_FINAL_INDEX_ITERATOR, final_index_iterator))));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static SubLObject do_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list53);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list53);
            if (NIL == member(current_$5, $list54, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list53);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred_var = $sym57$PRED_VAR;
        final SubLObject final_index_spec = $sym58$FINAL_INDEX_SPEC;
        return list(CLET, list(list(pred_var, predicate)), list(PWHEN, list(DO_GAF_ARG_INDEX_KEY_VALIDATOR, v_term, index, pred_var), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, v_term, index, pred_var), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(assertion_var, final_index_spec, $GAF, truth, direction, done), append(body, NIL)))));
    }

    public static SubLObject do_gaf_arg_index_formulas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list63);
        formula_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list63);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list63);
            if (NIL == member(current_$6, $list54, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list63);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject assertion_var = $sym64$ASSERTION_VAR;
        return list(DO_GAF_ARG_INDEX, list(new SubLObject[]{ assertion_var, v_term, $INDEX, index, $PREDICATE, predicate, $TRUTH, truth, $DIRECTION, direction, $DONE, done }), listS(CLET, list(list(formula_var, list(GAF_FORMULA, assertion_var))), append(body, NIL)));
    }

    public static SubLObject do_gaf_arg_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject gather_index = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        gather_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list68);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list68);
            if (NIL == member(current_$7, $list54, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list68);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject assertion = $sym69$ASSERTION;
        return list(CLET, list(var), listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ assertion, v_term, $INDEX, index, $PREDICATE, predicate, $TRUTH, truth, $DIRECTION, direction, $DONE, done }), list(CSETQ, var, list(GAF_ARG, assertion, gather_index)), append(body, NIL)));
    }

    public static SubLObject do_gaf_arg_index_key_validator(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate) {
        return kb_indexing.gaf_arg_index_key_validator(v_term, argnum, predicate, UNPROVIDED);
    }

    public static SubLObject new_gaf_arg_final_index_spec_iterator(final SubLObject v_term, SubLObject argnum, SubLObject predicate) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (NIL != simple_indexed_term_p(v_term)) {
            return iteration.new_singleton_iterator(new_gaf_simple_final_index_spec(v_term, NIL != argnum ? argnum : $ANY, predicate, NIL));
        }
        final SubLObject state = initialize_gaf_arg_final_index_spec_iterator_state(v_term, argnum, predicate);
        return iteration.new_iterator(state, $sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_gaf_arg_final_index_spec_iterator_state(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate) {
        final SubLObject state = make_vector(SIX_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, v_term);
        set_aref(state, ONE_INTEGER, predicate);
        set_aref(state, TWO_INTEGER, $ARGNUM_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != argnum ? list(argnum) : kb_indexing.key_gaf_arg_index_cached(v_term, UNPROVIDED, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        set_aref(state, FIVE_INTEGER, NIL);
        return state;
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_term(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_predicate_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, FIVE_INTEGER);
    }

    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_predicate_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FIVE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_current_argnum_key(final SubLObject state) {
        return gaf_arg_final_index_spec_iterator_state_argnum_keys(state).first();
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_current_predicate_key(final SubLObject state) {
        return gaf_arg_final_index_spec_iterator_state_predicate_keys(state).first();
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return gaf_arg_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject gaf_arg_current_keylist(final SubLObject state) {
        return list(gaf_arg_final_index_spec_iterator_state_current_argnum_key(state), gaf_arg_final_index_spec_iterator_state_current_predicate_key(state), gaf_arg_final_index_spec_iterator_state_current_mt_key(state));
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = gaf_arg_final_index_spec_iterator_state_note(state);
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        return makeBoolean((NIL == argnum_keys) || ((((NIL == note) && (NIL != list_utilities.lengthE(argnum_keys, ONE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthLE(predicate_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == mt_keys)));
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = gaf_arg_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        gaf_arg_final_index_spec_iterator_next_mt_key(state);
        return subl_promotions.values3(final_index_spec, state, doneP);
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = gaf_arg_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
                result = gaf_arg_keylist_to_final_index_spec(v_term, keylist);
            } else {
                doneP = gaf_arg_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return subl_promotions.values2(result, doneP);
    }

    public static SubLObject gaf_arg_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist) {
        return listS(v_term, $GAF_ARG, append(keylist, NIL));
    }

    public static SubLObject gaf_arg_current_relevant_keylist(final SubLObject state) {
        final SubLObject input_predicate = gaf_arg_final_index_spec_iterator_state_predicate(state);
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject argnum = argnum_keys.first();
        final SubLObject predicate = predicate_keys.first();
        final SubLObject mt = mt_keys.first();
        if (((NIL != argnum) && (NIL != predicate)) && (NIL != mt)) {
            if ((NIL == input_predicate) && (NIL == pred_relevance_macros.relevant_predP(predicate))) {
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, NIL);
                set_gaf_arg_final_index_spec_iterator_state_note(state, NIL);
            } else
                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                    return list(argnum, predicate, mt);
                }

        }
        return NIL;
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        if (NIL == argnum_keys) {
            return T;
        }
        if (NIL == predicate_keys) {
            gaf_arg_final_index_spec_iterator_refill_predicate_keys(state);
        } else
            if (NIL == mt_keys) {
                gaf_arg_final_index_spec_iterator_refill_mt_keys(state);
            } else {
                gaf_arg_final_index_spec_iterator_next_mt_key(state);
            }

        return NIL;
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_refill_predicate_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
        final SubLObject predicate = gaf_arg_final_index_spec_iterator_state_predicate(state);
        SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        if ($ARGNUM_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note(state)) {
            set_gaf_arg_final_index_spec_iterator_state_note(state, NIL);
        } else {
            argnum_keys = argnum_keys.rest();
            set_gaf_arg_final_index_spec_iterator_state_argnum_keys(state, argnum_keys);
        }
        final SubLObject argnum_key = argnum_keys.first();
        if (NIL != argnum_key) {
            if (NIL != predicate) {
                set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, list(predicate));
            } else
                if (NIL != pred_relevance_macros.only_specified_predicate_list_is_relevantP()) {
                    set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, copy_list(pred_relevance_macros.$relevant_preds$.getDynamicValue(thread)));
                } else {
                    set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, kb_indexing.key_gaf_arg_index_cached(v_term, argnum_key, UNPROVIDED));
                }

            set_gaf_arg_final_index_spec_iterator_state_note(state, $PREDICATE_KEYS_ARE_FRESH);
        }
        return state;
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        if ($PREDICATE_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note(state)) {
            set_gaf_arg_final_index_spec_iterator_state_note(state, NIL);
        } else {
            predicate_keys = predicate_keys.rest();
            set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, predicate_keys);
        }
        final SubLObject predicate_key = predicate_keys.first();
        if (NIL != predicate_key) {
            if (NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
                final SubLObject argnum_key = argnum_keys.first();
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, kb_indexing.key_gaf_arg_index_cached(v_term, argnum_key, predicate_key));
            }
        }
        return state;
    }

    public static SubLObject gaf_arg_final_index_spec_iterator_next_mt_key(final SubLObject state) {
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, mt_keys.rest());
        return state;
    }

    public static SubLObject do_predicate_extent_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$8, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred_var = $sym79$PRED_VAR;
        final SubLObject final_index_spec = $sym80$FINAL_INDEX_SPEC;
        return list(CLET, list(list(pred_var, predicate)), list(PWHEN, list(DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var), list(PIF_FEATURE, $CYC_ALEXANDRIA, list(PROGN, listS(DO_ITERATOR_WITHOUT_VALUES_PROGRESS, list(var, list(NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR, pred_var, ZERO_INTEGER, NIL, truth, direction), $DONE, done, $PROGRESS_MESSAGE, progress_message), append(body, NIL))), list(DO_ITERATOR_WITHOUT_VALUES_PROGRESS, list(final_index_spec, list(NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, pred_var), $DONE, done, $PROGRESS_MESSAGE, progress_message), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $GAF, truth, direction, done), append(body, NIL))))));
    }

    public static SubLObject do_predicate_extent_index_formulas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$9, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred_var = $sym87$PRED_VAR;
        final SubLObject assertion_var = $sym88$ASSERTION_VAR;
        return list(CLET, list(list(pred_var, predicate)), list(PWHEN, list(DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var), list(PIF_FEATURE, $CYC_ALEXANDRIA, list(PROGN, listS(DO_ITERATOR_WITHOUT_VALUES_PROGRESS, list(var, list(NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR, pred_var, ZERO_INTEGER, NIL, truth, direction), $DONE, done, $PROGRESS_MESSAGE, progress_message), append(body, NIL))), list(PROGN, list(DO_PREDICATE_EXTENT_INDEX, list(new SubLObject[]{ assertion_var, predicate, $TRUTH, truth, $DIRECTION, direction, $DONE, done, $PROGRESS_MESSAGE, progress_message }), listS(CLET, list(list(var, list(GAF_FORMULA, assertion_var))), append(body, NIL)))))));
    }

    public static SubLObject do_predicate_extent_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list91);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        SubLObject gather_arg = NIL;
        destructuring_bind_must_consp(current, datum, $list91);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list91);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list91);
        gather_arg = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list91);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list91);
            if (NIL == member(current_$10, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list91);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred_var = $sym92$PRED_VAR;
        final SubLObject assertion_var = $sym93$ASSERTION_VAR;
        return list(CLET, list(list(pred_var, predicate)), list(PWHEN, list(DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var), list(PIF_FEATURE, $CYC_ALEXANDRIA, list(PROGN, listS(DO_ITERATOR_WITHOUT_VALUES_PROGRESS, list(var, list(NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR, pred_var, gather_arg, ZERO_INTEGER, NIL, truth, direction), $DONE, done, $PROGRESS_MESSAGE, progress_message), append(body, NIL))), list(PROGN, list(DO_PREDICATE_EXTENT_INDEX, list(new SubLObject[]{ assertion_var, predicate, $TRUTH, truth, $DIRECTION, direction, $DONE, done, $PROGRESS_MESSAGE, progress_message }), listS(CLET, list(list(var, list(GAF_ARG, assertion_var, gather_arg))), append(body, NIL)))))));
    }

    public static SubLObject do_predicate_extent_index_key_validator(final SubLObject predicate) {
        return forts.fort_p(predicate);
    }

    public static SubLObject new_predicate_extent_final_index_spec_iterator(final SubLObject predicate) {
        if (NIL != simple_indexed_term_p(predicate)) {
            return iteration.new_singleton_iterator(new_gaf_simple_final_index_spec(predicate, NIL, predicate, NIL));
        }
        final SubLObject state = initialize_predicate_extent_final_index_spec_iterator_state(predicate);
        return iteration.new_iterator(state, $sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_, PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_predicate_extent_final_index_spec_iterator_state(final SubLObject predicate) {
        final SubLObject state = make_vector(TWO_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, predicate);
        set_aref(state, ONE_INTEGER, kb_indexing.key_predicate_extent_index(predicate));
        return state;
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject set_predicate_extent_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, ONE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return predicate_extent_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject predicate_extent_current_keylist(final SubLObject state) {
        return list(predicate_extent_final_index_spec_iterator_state_current_mt_key(state));
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        return sublisp_null(mt_keys);
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = predicate_extent_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        predicate_extent_final_index_spec_iterator_next_mt_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = predicate_extent_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject pred = predicate_extent_final_index_spec_iterator_state_predicate(state);
                result = predicate_extent_keylist_to_final_index_spec(pred, keylist);
            } else {
                doneP = predicate_extent_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject predicate_extent_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist) {
        return listS(v_term, $PREDICATE_EXTENT, append(keylist, NIL));
    }

    public static SubLObject predicate_extent_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject mt = mt_keys.first();
        if ((NIL != mt) && (NIL != mt_relevance_macros.relevant_mtP(mt))) {
            return list(mt);
        }
        return NIL;
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        if (NIL == mt_keys) {
            return T;
        }
        predicate_extent_final_index_spec_iterator_next_mt_key(state);
        return NIL;
    }

    public static SubLObject predicate_extent_final_index_spec_iterator_next_mt_key(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        set_predicate_extent_final_index_spec_iterator_state_mt_keys(state, mt_keys.rest());
        return state;
    }

    public static SubLObject do_nart_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list98);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list98);
            if (NIL == member(current_$11, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list98);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject function_tail = property_list_member($FUNCTION, current);
        final SubLObject function = (NIL != function_tail) ? cadr(function_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym101$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_NART_ARG_INDEX_KEY_VALIDATOR, v_term, index, function), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, v_term, index, function), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $GAF, NIL, NIL, done), append(body, NIL))));
    }

    public static SubLObject do_nart_arg_index_key_validator(final SubLObject v_term, final SubLObject index, final SubLObject function) {
        return makeBoolean(((NIL != indexed_term_p(v_term)) && ((NIL == index) || (NIL != subl_promotions.positive_integer_p(index)))) && ((NIL == function) || (NIL != forts.fort_p(function))));
    }

    public static SubLObject new_nart_arg_final_index_spec_iterator(final SubLObject v_term, SubLObject argnum, SubLObject function) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (NIL != simple_indexed_term_p(v_term)) {
            return iteration.new_singleton_iterator(new_nart_simple_final_index_spec(v_term, NIL != argnum ? argnum : $ANY, function));
        }
        final SubLObject state = initialize_nart_arg_final_index_spec_iterator_state(v_term, argnum, function);
        return iteration.new_iterator(state, $sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_nart_arg_final_index_spec_iterator_state(final SubLObject v_term, final SubLObject argnum, final SubLObject function) {
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, v_term);
        set_aref(state, ONE_INTEGER, function);
        set_aref(state, TWO_INTEGER, $ARGNUM_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != argnum ? list(argnum) : kb_indexing.key_nart_arg_index(v_term, UNPROVIDED, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        return state;
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_term(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_function(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_function_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject set_nart_arg_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_nart_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_nart_arg_final_index_spec_iterator_state_function_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_current_argnum_key(final SubLObject state) {
        return nart_arg_final_index_spec_iterator_state_argnum_keys(state).first();
    }

    public static SubLObject nart_arg_final_index_spec_iterator_state_current_function_key(final SubLObject state) {
        return nart_arg_final_index_spec_iterator_state_function_keys(state).first();
    }

    public static SubLObject nart_arg_current_keylist(final SubLObject state) {
        return list(nart_arg_final_index_spec_iterator_state_current_argnum_key(state), nart_arg_final_index_spec_iterator_state_current_function_key(state));
    }

    public static SubLObject nart_arg_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = nart_arg_final_index_spec_iterator_state_note(state);
        final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        return makeBoolean((NIL == argnum_keys) || (((NIL == note) && (NIL != list_utilities.lengthE(argnum_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == function_keys)));
    }

    public static SubLObject nart_arg_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = nart_arg_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        nart_arg_final_index_spec_iterator_next_function_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject nart_arg_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = nart_arg_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject v_term = nart_arg_final_index_spec_iterator_state_term(state);
                result = nart_arg_keylist_to_final_index_spec(v_term, keylist);
            } else {
                doneP = nart_arg_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject nart_arg_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist) {
        return listS(v_term, $NART_ARG, append(keylist, NIL));
    }

    public static SubLObject nart_arg_current_relevant_keylist(final SubLObject state) {
        final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        final SubLObject argnum = argnum_keys.first();
        final SubLObject function = function_keys.first();
        if ((NIL != argnum) && (NIL != function)) {
            return list(argnum, function);
        }
        return NIL;
    }

    public static SubLObject nart_arg_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        if (NIL == argnum_keys) {
            return T;
        }
        if (NIL == function_keys) {
            nart_arg_final_index_spec_iterator_refill_function_keys(state);
        } else {
            Errors.error($str108$nart_arg_keys_should_never_be_irr, argnum_keys, function_keys);
        }
        return NIL;
    }

    public static SubLObject nart_arg_final_index_spec_iterator_refill_function_keys(final SubLObject state) {
        final SubLObject v_term = nart_arg_final_index_spec_iterator_state_term(state);
        final SubLObject function = nart_arg_final_index_spec_iterator_state_function(state);
        SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        if ($ARGNUM_KEYS_ARE_FRESH == nart_arg_final_index_spec_iterator_state_note(state)) {
            set_nart_arg_final_index_spec_iterator_state_note(state, NIL);
        } else {
            argnum_keys = argnum_keys.rest();
            set_nart_arg_final_index_spec_iterator_state_argnum_keys(state, argnum_keys);
        }
        final SubLObject argnum_key = argnum_keys.first();
        if (NIL != argnum_key) {
            if (NIL != function) {
                set_nart_arg_final_index_spec_iterator_state_function_keys(state, list(function));
            } else {
                set_nart_arg_final_index_spec_iterator_state_function_keys(state, kb_indexing.key_nart_arg_index(v_term, argnum_key, UNPROVIDED));
            }
            set_nart_arg_final_index_spec_iterator_state_note(state, $FUNCTION_KEYS_ARE_FRESH);
        }
        return state;
    }

    public static SubLObject nart_arg_final_index_spec_iterator_next_function_key(final SubLObject state) {
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        set_nart_arg_final_index_spec_iterator_state_function_keys(state, function_keys.rest());
        return state;
    }

    public static SubLObject do_function_extent_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list110);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list110);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list110);
        function = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list110);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list110);
            if (NIL == member(current_$12, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list110);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym111$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, function), list(CLET, list(list(final_index_spec, list(FUNCTION_EXTENT_FINAL_INDEX_SPEC, function))), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $GAF, truth, direction, done), append(body, NIL))));
    }

    public static SubLObject do_function_extent_index_key_validator(final SubLObject function) {
        return forts.fort_p(function);
    }

    public static SubLObject do_function_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        function = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list115);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list115);
            if (NIL == member(current_$13, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list115);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject tou = $sym117$TOU;
        return list(DO_FUNCTION_EXTENT_INDEX, list(tou, function, $DONE, done), listS(CLET, list(list(var, list(GAF_ARG1, tou))), append(body, NIL)));
    }

    public static SubLObject function_extent_final_index_spec(final SubLObject function) {
        if (NIL != simple_indexed_term_p(function)) {
            return new_gaf_simple_final_index_spec(function, $list119, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
        }
        return bq_cons(function, $list121);
    }

    public static SubLObject do_consequent_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list122);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list122);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list122);
            if (NIL == member(current_$14, $list123, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list122);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_PREDICATE_RULE_INDEX, list(var, predicate, $SENSE, $POS, $DIRECTION, direction, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_antecedent_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list122);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$15 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list122);
            current_$15 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list122);
            if (NIL == member(current_$15, $list123, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$15 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list122);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_PREDICATE_RULE_INDEX, list(var, predicate, $SENSE, $NEG, $DIRECTION, direction, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list128);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$16 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list128);
            current_$16 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list128);
            if (NIL == member(current_$16, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$16 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list128);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym130$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, predicate, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, predicate, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_predicate_rule_index_key_validator(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        return makeBoolean(((NIL != forts.fort_p(predicate)) && ((NIL == sense) || (NIL != enumeration_types.sense_p(sense)))) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject new_predicate_rule_final_index_spec_iterator(final SubLObject predicate, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(predicate)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(predicate, sense, PREDICATE_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_predicate_rule_final_index_spec_iterator_state(predicate, sense, direction);
        return iteration.new_iterator(state, $sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_predicate_rule_final_index_spec_iterator_state(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        final SubLObject state = make_vector(SIX_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, predicate);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, TWO_INTEGER, $SENSE_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != sense ? list(sense) : kb_indexing.key_predicate_rule_index(predicate, UNPROVIDED, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        set_aref(state, FIVE_INTEGER, NIL);
        return state;
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FIVE_INTEGER);
    }

    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FIVE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return predicate_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return predicate_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return predicate_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject predicate_rule_current_keylist(final SubLObject state) {
        return list(predicate_rule_final_index_spec_iterator_state_current_sense_key(state), predicate_rule_final_index_spec_iterator_state_current_mt_key(state), predicate_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = predicate_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == sense_keys) || ((((NIL == note) && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthLE(mt_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = predicate_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = predicate_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
                result = predicate_rule_keylist_to_final_index_spec(predicate, keylist);
            } else {
                doneP = predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject predicate_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return listS(pred, $PREDICATE_RULE, append(keylist, NIL));
    }

    public static SubLObject predicate_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (((NIL != sense) && (NIL != mt)) && (NIL != direction)) {
            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return list(sense, mt, direction);
            }
            set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
        return NIL;
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == sense_keys) {
            return T;
        }
        if (NIL == mt_keys) {
            predicate_rule_final_index_spec_iterator_refill_mt_keys(state);
        } else
            if (NIL == direction_keys) {
                predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
            } else {
                Errors.error($str138$predicate_rule_iterator_quiescens, state);
            }

        return NIL;
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
        SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if ($SENSE_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            sense_keys = sense_keys.rest();
            set_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (NIL != sense_key) {
            if (NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
                set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, kb_indexing.key_predicate_rule_index(predicate, sense_key, UNPROVIDED));
            }
            set_predicate_rule_final_index_spec_iterator_state_note(state, $MT_KEYS_ARE_FRESH);
        }
        return state;
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
        final SubLObject direction = predicate_rule_final_index_spec_iterator_state_direction(state);
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        if ($MT_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            mt_keys = mt_keys.rest();
            set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (NIL != mt_key) {
            if (NIL != direction) {
                set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                final SubLObject sense_key = sense_keys.first();
                set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_predicate_rule_index(predicate, sense_key, mt_key));
            }
        }
        return state;
    }

    public static SubLObject predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject do_decontextualized_ist_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list128);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$17 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list128);
            current_$17 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list128);
            if (NIL == member(current_$17, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$17 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list128);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym140$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, predicate, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, predicate, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_decontextualized_ist_predicate_rule_index_key_validator(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        return makeBoolean(((NIL != forts.fort_p(predicate)) && ((NIL == sense) || (NIL != enumeration_types.sense_p(sense)))) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject new_decontextualized_ist_predicate_rule_final_index_spec_iterator(final SubLObject predicate, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(predicate)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(predicate, sense, DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(predicate, sense, direction);
        return iteration.new_iterator(state, $sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON, $sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX, UNPROVIDED);
    }

    public static SubLObject initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        final SubLObject state = make_vector(SIX_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, predicate);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, TWO_INTEGER, $SENSE_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != sense ? list(sense) : kb_indexing.key_decontextualized_ist_predicate_rule_index(predicate, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        return state;
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject decontextualized_ist_predicate_rule_current_keylist(final SubLObject state) {
        return list(decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key(state), decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == sense_keys) || (((NIL == note) && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = decontextualized_ist_predicate_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(state);
                result = decontextualized_ist_predicate_rule_keylist_to_final_index_spec(predicate, keylist);
            } else {
                doneP = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject decontextualized_ist_predicate_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return listS(pred, $DECONTEXTUALIZED_IST_PREDICATE_RULE, append(keylist, NIL));
    }

    public static SubLObject decontextualized_ist_predicate_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject direction = direction_keys.first();
        if ((NIL != sense) && (NIL != direction)) {
            return list(sense, direction);
        }
        return NIL;
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == sense_keys) {
            return T;
        }
        if (NIL == direction_keys) {
            decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
        } else {
            Errors.error($str148$ist_predicate_rule_iterator_quies, state);
        }
        return NIL;
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(state);
        final SubLObject direction = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(state);
        SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if ($SENSE_KEYS_ARE_FRESH == decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            sense_keys = sense_keys.rest();
            set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (NIL != sense_key) {
            if (NIL != direction) {
                set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_decontextualized_ist_predicate_rule_index(predicate, sense_key));
            }
        }
        return state;
    }

    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject do_isa_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        collection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$18 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list149);
            current_$18 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list149);
            if (NIL == member(current_$18, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$18 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list149);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym150$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_ISA_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_isa_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
    }

    public static SubLObject new_isa_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(collection)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, ISA_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($$isa, $ISA_RULE, collection, sense, direction);
        return iteration.new_iterator(state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject do_quoted_isa_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        collection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list149);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list149);
            if (NIL == member(current_$19, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list149);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym159$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_quoted_isa_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
    }

    public static SubLObject new_quoted_isa_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(collection)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($$quotedIsa, $QUOTED_ISA_RULE, collection, sense, direction);
        return iteration.new_iterator(state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject do_genls_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        collection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$20 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list149);
            current_$20 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list149);
            if (NIL == member(current_$20, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$20 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list149);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym166$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_GENLS_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_genls_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
    }

    public static SubLObject new_genls_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(collection)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, GENLS_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($$genls, $GENLS_RULE, collection, sense, direction);
        return iteration.new_iterator(state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject do_genl_mt_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list173);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject genl_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list173);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list173);
        genl_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$21 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list173);
            current_$21 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list173);
            if (NIL == member(current_$21, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$21 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list173);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym174$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, genl_mt, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, genl_mt, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_genl_mt_rule_index_key_validator(final SubLObject genl_mt, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(genl_mt, sense, direction);
    }

    public static SubLObject new_genl_mt_rule_final_index_spec_iterator(final SubLObject genl_mt, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(genl_mt)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(genl_mt, sense, GENL_MT_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($$genlMt, $GENL_MT_RULE, genl_mt, sense, direction);
        return iteration.new_iterator(state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject do_pred_arg2_rule_index_key_validator(final SubLObject arg2, final SubLObject sense, final SubLObject direction) {
        return makeBoolean(((NIL != forts.fort_p(arg2)) && ((NIL == sense) || (NIL != enumeration_types.sense_p(sense)))) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject initialize_pred_arg2_rule_final_index_spec_iterator_state(final SubLObject pred, final SubLObject top_level_key, final SubLObject arg2, final SubLObject sense, final SubLObject direction) {
        final SubLObject state = make_vector(EIGHT_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, arg2);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, TWO_INTEGER, $SENSE_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != sense ? list(sense) : key_pred_arg2_rule_index(pred, arg2, UNPROVIDED, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        set_aref(state, FIVE_INTEGER, NIL);
        set_aref(state, SIX_INTEGER, pred);
        set_aref(state, SEVEN_INTEGER, top_level_key);
        return state;
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_arg2(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FIVE_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_pred(final SubLObject state) {
        return aref(state, SIX_INTEGER);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_top_level_key(final SubLObject state) {
        return aref(state, SEVEN_INTEGER);
    }

    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FIVE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject pred_arg2_rule_current_keylist(final SubLObject state) {
        return list(pred_arg2_rule_final_index_spec_iterator_state_current_sense_key(state), pred_arg2_rule_final_index_spec_iterator_state_current_mt_key(state), pred_arg2_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = pred_arg2_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == sense_keys) || ((((NIL == note) && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthLE(mt_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = pred_arg2_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        pred_arg2_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = pred_arg2_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
                final SubLObject top_level_key = pred_arg2_rule_final_index_spec_iterator_state_top_level_key(state);
                result = pred_arg2_rule_keylist_to_final_index_spec(arg2, top_level_key, keylist);
            } else {
                doneP = pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject pred_arg2_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject top_level_key, final SubLObject keylist) {
        return listS(pred, top_level_key, append(keylist, NIL));
    }

    public static SubLObject pred_arg2_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (((NIL != sense) && (NIL != mt)) && (NIL != direction)) {
            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return list(sense, mt, direction);
            }
            set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
        return NIL;
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == sense_keys) {
            return T;
        }
        if (NIL == mt_keys) {
            pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(state);
        } else
            if (NIL == direction_keys) {
                pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(state);
            } else {
                Errors.error($str181$pred_arg2_rule_iterator_quiescens, state);
            }

        return NIL;
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred(state);
        final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
        SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        if ($SENSE_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note(state)) {
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            sense_keys = sense_keys.rest();
            set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (NIL != sense_key) {
            if (NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
                set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, key_pred_arg2_rule_index(pred, arg2, sense_key, UNPROVIDED));
            }
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, $MT_KEYS_ARE_FRESH);
        }
        return state;
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred(state);
        final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
        final SubLObject direction = pred_arg2_rule_final_index_spec_iterator_state_direction(state);
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        if ($MT_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note(state)) {
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            mt_keys = mt_keys.rest();
            set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (NIL != mt_key) {
            if (NIL != direction) {
                set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                final SubLObject sense_key = sense_keys.first();
                set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, key_pred_arg2_rule_index(pred, arg2, sense_key, mt_key));
            }
        }
        return state;
    }

    public static SubLObject pred_arg2_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject key_pred_arg2_rule_index(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (pred.eql($$isa)) {
            return kb_indexing.key_isa_rule_index(arg2, sense, mt);
        }
        if (pred.eql($$quotedIsa)) {
            return kb_indexing.key_quoted_isa_rule_index(arg2, sense, mt);
        }
        if (pred.eql($$genls)) {
            return kb_indexing.key_genls_rule_index(arg2, sense, mt);
        }
        if (pred.eql($$genlMt)) {
            return kb_indexing.key_genl_mt_rule_index(arg2, sense, mt);
        }
        Errors.error($str182$unexpected_pred_in_pred_arg2_inde, pred);
        return NIL;
    }

    public static SubLObject do_function_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list183);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list183);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list183);
        function = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$22 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list183);
            current_$22 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list183);
            if (NIL == member(current_$22, $list123, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$22 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list183);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym184$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, function, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, function, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_function_rule_index_key_validator(final SubLObject function, final SubLObject direction) {
        return makeBoolean((NIL != forts.fort_p(function)) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject new_function_rule_final_index_spec_iterator(final SubLObject function, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(function)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(function, $NEG, FUNCTION_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_function_rule_final_index_spec_iterator_state(function, direction);
        return iteration.new_iterator(state, $sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_function_rule_final_index_spec_iterator_state(final SubLObject func, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, func);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, TWO_INTEGER, $MT_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != mt_relevance_macros.only_specified_mt_is_relevantP() ? list(mt_relevance_macros.$mt$.getDynamicValue(thread)) : kb_indexing.key_function_rule_index(func, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        return state;
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_func(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject set_function_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_function_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_function_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return function_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject function_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return function_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject function_rule_current_keylist(final SubLObject state) {
        return list(function_rule_final_index_spec_iterator_state_current_mt_key(state), function_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject function_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = function_rule_final_index_spec_iterator_state_note(state);
        final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == mt_keys) || (((NIL == note) && (NIL != list_utilities.lengthE(mt_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject function_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = function_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        function_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject function_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = function_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject func = function_rule_final_index_spec_iterator_state_func(state);
                result = function_rule_keylist_to_final_index_spec(func, keylist);
            } else {
                doneP = function_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject function_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return listS(pred, $FUNCTION_RULE, append(keylist, NIL));
    }

    public static SubLObject function_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if ((NIL != mt) && (NIL != direction)) {
            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return list(mt, direction);
            }
            set_function_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
        return NIL;
    }

    public static SubLObject function_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == mt_keys) {
            return T;
        }
        if (NIL == direction_keys) {
            function_rule_final_index_spec_iterator_refill_direction_keys(state);
        } else {
            Errors.error($str192$function_rule_iterator_quiescense, state);
        }
        return NIL;
    }

    public static SubLObject function_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject func = function_rule_final_index_spec_iterator_state_func(state);
        final SubLObject direction = function_rule_final_index_spec_iterator_state_direction(state);
        SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        if ($MT_KEYS_ARE_FRESH == function_rule_final_index_spec_iterator_state_note(state)) {
            set_function_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            mt_keys = mt_keys.rest();
            set_function_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (NIL != mt_key) {
            if (NIL != direction) {
                set_function_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                set_function_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_function_rule_index(func, mt_key));
            }
        }
        return state;
    }

    public static SubLObject function_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        set_function_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject do_exception_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list193);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject rule = NIL;
        destructuring_bind_must_consp(current, datum, $list193);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list193);
        rule = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$23 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list193);
            current_$23 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list193);
            if (NIL == member(current_$23, $list123, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$23 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list193);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym194$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, rule, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, rule, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_exception_rule_index_key_validator(final SubLObject rule, final SubLObject direction) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(rule)) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject new_exception_rule_final_index_spec_iterator(final SubLObject rule, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(rule)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(rule, $POS, EXCEPTION_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_exception_rule_final_index_spec_iterator_state(rule, direction);
        return iteration.new_iterator(state, $sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_exception_rule_final_index_spec_iterator_state(final SubLObject rule, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, rule);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, TWO_INTEGER, $MT_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != mt_relevance_macros.only_specified_mt_is_relevantP() ? list(mt_relevance_macros.$mt$.getDynamicValue(thread)) : kb_indexing.key_exception_rule_index(rule, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        return state;
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_rule(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject set_exception_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_exception_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_exception_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return exception_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject exception_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return exception_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject exception_rule_current_keylist(final SubLObject state) {
        return list(exception_rule_final_index_spec_iterator_state_current_mt_key(state), exception_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject exception_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = exception_rule_final_index_spec_iterator_state_note(state);
        final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == mt_keys) || (((NIL == note) && (NIL != list_utilities.lengthE(mt_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject exception_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = exception_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        exception_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject exception_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = exception_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject rule = exception_rule_final_index_spec_iterator_state_rule(state);
                result = exception_rule_keylist_to_final_index_spec(rule, keylist);
            } else {
                doneP = exception_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject exception_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return listS(pred, $EXCEPTION_RULE, append(keylist, NIL));
    }

    public static SubLObject exception_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if ((NIL != mt) && (NIL != direction)) {
            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return list(mt, direction);
            }
            set_exception_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
        return NIL;
    }

    public static SubLObject exception_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == mt_keys) {
            return T;
        }
        if (NIL == direction_keys) {
            exception_rule_final_index_spec_iterator_refill_direction_keys(state);
        } else {
            Errors.error($str202$exception_rule_iterator_quiescens, state);
        }
        return NIL;
    }

    public static SubLObject exception_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject rule = exception_rule_final_index_spec_iterator_state_rule(state);
        final SubLObject direction = exception_rule_final_index_spec_iterator_state_direction(state);
        SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        if ($MT_KEYS_ARE_FRESH == exception_rule_final_index_spec_iterator_state_note(state)) {
            set_exception_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            mt_keys = mt_keys.rest();
            set_exception_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (NIL != mt_key) {
            if (NIL != direction) {
                set_exception_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                set_exception_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_exception_rule_index(rule, mt_key));
            }
        }
        return state;
    }

    public static SubLObject exception_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        set_exception_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject do_pragma_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list193);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject rule = NIL;
        destructuring_bind_must_consp(current, datum, $list193);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list193);
        rule = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$24 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list193);
            current_$24 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list193);
            if (NIL == member(current_$24, $list123, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$24 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list193);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym203$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, rule, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, rule, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_pragma_rule_index_key_validator(final SubLObject rule, final SubLObject direction) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(rule)) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject new_pragma_rule_final_index_spec_iterator(final SubLObject rule, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(rule)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(rule, $POS, PRAGMA_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pragma_rule_final_index_spec_iterator_state(rule, direction);
        return iteration.new_iterator(state, $sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_pragma_rule_final_index_spec_iterator_state(final SubLObject rule, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, rule);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, TWO_INTEGER, $MT_KEYS_ARE_FRESH);
        set_aref(state, THREE_INTEGER, NIL != mt_relevance_macros.only_specified_mt_is_relevantP() ? list(mt_relevance_macros.$mt$.getDynamicValue(thread)) : kb_indexing.key_pragma_rule_index(rule, UNPROVIDED));
        set_aref(state, FOUR_INTEGER, NIL);
        return state;
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_rule(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject set_pragma_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, TWO_INTEGER, note);
        return state;
    }

    public static SubLObject set_pragma_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_pragma_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return pragma_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return pragma_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject pragma_rule_current_keylist(final SubLObject state) {
        return list(pragma_rule_final_index_spec_iterator_state_current_mt_key(state), pragma_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = pragma_rule_final_index_spec_iterator_state_note(state);
        final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == mt_keys) || (((NIL == note) && (NIL != list_utilities.lengthE(mt_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = pragma_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        pragma_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = pragma_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                final SubLObject rule = pragma_rule_final_index_spec_iterator_state_rule(state);
                result = pragma_rule_keylist_to_final_index_spec(rule, keylist);
            } else {
                doneP = pragma_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject pragma_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return listS(pred, $PRAGMA_RULE, append(keylist, NIL));
    }

    public static SubLObject pragma_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if ((NIL != mt) && (NIL != direction)) {
            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return list(mt, direction);
            }
            set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
        return NIL;
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == mt_keys) {
            return T;
        }
        if (NIL == direction_keys) {
            pragma_rule_final_index_spec_iterator_refill_direction_keys(state);
        } else {
            Errors.error($str211$pragma_rule_iterator_quiescense_f, state);
        }
        return NIL;
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject rule = pragma_rule_final_index_spec_iterator_state_rule(state);
        final SubLObject direction = pragma_rule_final_index_spec_iterator_state_direction(state);
        SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        if ($MT_KEYS_ARE_FRESH == pragma_rule_final_index_spec_iterator_state_note(state)) {
            set_pragma_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            mt_keys = mt_keys.rest();
            set_pragma_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (NIL != mt_key) {
            if (NIL != direction) {
                set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_pragma_rule_index(rule, mt_key));
            }
        }
        return state;
    }

    public static SubLObject pragma_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject do_unbound_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list212);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$25 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list212);
            current_$25 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list212);
            if (NIL == member(current_$25, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$25 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list212);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym213$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, sense, direction), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, sense, direction), $DONE, done), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, $RULE, NIL, direction, done), append(body, NIL))));
    }

    public static SubLObject do_unbound_predicate_rule_index_key_validator(final SubLObject sense, final SubLObject direction) {
        return makeBoolean(((NIL == sense) || (NIL != enumeration_types.sense_p(sense))) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction))));
    }

    public static SubLObject new_unbound_predicate_rule_final_index_spec_iterator(SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLObject index_hook = auxiliary_indexing.unbound_rule_index();
        if (NIL != simple_indexed_term_p(index_hook)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(index_hook, sense, UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_unbound_predicate_rule_final_index_spec_iterator_state(sense, direction);
        return iteration.new_iterator(state, $sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject initialize_unbound_predicate_rule_final_index_spec_iterator_state(final SubLObject sense, final SubLObject direction) {
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, direction);
        set_aref(state, ONE_INTEGER, $SENSE_KEYS_ARE_FRESH);
        set_aref(state, TWO_INTEGER, NIL != sense ? list(sense) : auxiliary_indexing.key_unbound_rule_index(UNPROVIDED, UNPROVIDED));
        set_aref(state, THREE_INTEGER, NIL);
        set_aref(state, FOUR_INTEGER, NIL);
        return state;
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return aref(state, FOUR_INTEGER);
    }

    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        set_aref(state, ONE_INTEGER, note);
        return state;
    }

    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, TWO_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, THREE_INTEGER, new_keys);
        return state;
    }

    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        set_aref(state, FOUR_INTEGER, new_keys);
        return state;
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }

    public static SubLObject unbound_predicate_rule_current_keylist(final SubLObject state) {
        return list(unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key(state), unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key(state), unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key(state));
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = unbound_predicate_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        return makeBoolean((NIL == sense_keys) || ((((NIL == note) && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthLE(mt_keys, ONE_INTEGER, UNPROVIDED))) && (NIL == direction_keys)));
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = unbound_predicate_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        unbound_predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return values(final_index_spec, state, doneP);
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            final SubLObject keylist = unbound_predicate_rule_current_relevant_keylist(state);
            if (NIL != keylist) {
                result = unbound_predicate_rule_keylist_to_final_index_spec(keylist);
            } else {
                doneP = unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        } 
        return values(result, doneP);
    }

    public static SubLObject unbound_predicate_rule_keylist_to_final_index_spec(final SubLObject keylist) {
        return bq_cons(auxiliary_indexing.unbound_rule_index(), append(keylist, NIL));
    }

    public static SubLObject unbound_predicate_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (((NIL != sense) && (NIL != mt)) && (NIL != direction)) {
            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return list(sense, mt, direction);
            }
            set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
        return NIL;
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        if (NIL == sense_keys) {
            return T;
        }
        if (NIL == mt_keys) {
            unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys(state);
        } else
            if (NIL == direction_keys) {
                unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
            } else {
                Errors.error($str220$unbound_predicate_rule_iterator_q, state);
            }

        return NIL;
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if ($SENSE_KEYS_ARE_FRESH == unbound_predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_unbound_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            sense_keys = sense_keys.rest();
            set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (NIL != sense_key) {
            if (NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
                set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state, auxiliary_indexing.key_unbound_rule_index(sense_key, UNPROVIDED));
            }
            set_unbound_predicate_rule_final_index_spec_iterator_state_note(state, $MT_KEYS_ARE_FRESH);
        }
        return state;
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject direction = unbound_predicate_rule_final_index_spec_iterator_state_direction(state);
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        if ($MT_KEYS_ARE_FRESH == unbound_predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_unbound_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
            mt_keys = mt_keys.rest();
            set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (NIL != mt_key) {
            if (NIL != direction) {
                set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
            } else {
                final SubLObject sense_key = sense_keys.first();
                set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, auxiliary_indexing.key_unbound_rule_index(sense_key, mt_key));
            }
        }
        return state;
    }

    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }

    public static SubLObject do_mt_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list221);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list221);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list221);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$26 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list221);
            current_$26 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list221);
            if (NIL == member(current_$26, $list222, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$26 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list221);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym224$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_MT_INDEX_KEY_VALIDATOR, mt, type), list(CLET, list(list(final_index_spec, list(MT_FINAL_INDEX_SPEC, mt))), listS(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, type, truth, direction, done), append(body, NIL))));
    }

    public static SubLObject do_mt_index_key_validator(final SubLObject mt, final SubLObject type) {
        return makeBoolean(((NIL != forts.fort_p(mt)) && (NIL == kb_indexing.broad_mtP(mt))) && ((NIL == type) || (NIL != enumeration_types.assertion_type_p(type))));
    }

    public static SubLObject mt_final_index_spec(final SubLObject mt) {
        if (NIL != simple_indexed_term_p(mt)) {
            return new_assertion_simple_final_index_spec(mt, MT_INDEX_ASSERTION_MATCH_P);
        }
        return bq_cons(mt, $list229);
    }

    public static SubLObject do_other_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list230);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$27 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list230);
            current_$27 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list230);
            if (NIL == member(current_$27, $list222, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$27 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list230);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym231$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_OTHER_INDEX_KEY_VALIDATOR, v_term, type), list(CLET, list(list(final_index_spec, list(OTHER_FINAL_INDEX_SPEC, v_term))), list(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, type, truth, direction, done), listS(PWHEN, list(DO_OTHER_INDEX_ASSERTION_MATCH_P, var), append(body, NIL)))));
    }

    public static SubLObject do_other_index_key_validator(final SubLObject v_term, final SubLObject type) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && ((NIL == type) || (NIL != enumeration_types.assertion_type_p(type))));
    }

    public static SubLObject other_final_index_spec(final SubLObject v_term) {
        if (NIL != simple_indexed_term_p(v_term)) {
            return new_assertion_simple_final_index_spec(v_term, OTHER_INDEX_ASSERTION_MATCH_P);
        }
        return bq_cons(v_term, $list237);
    }

    public static SubLObject other_final_index_spec_p(final SubLObject final_index_spec) {
        return makeBoolean((NIL != other_simple_final_index_spec_p(final_index_spec)) || (NIL != other_complex_final_index_spec_p(final_index_spec)));
    }

    public static SubLObject other_simple_final_index_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.first() == $SIMPLE) && (fourth(v_object) == OTHER_INDEX_ASSERTION_MATCH_P));
    }

    public static SubLObject other_complex_final_index_spec_p(final SubLObject v_object) {
        return eq($OTHER, second(v_object));
    }

    public static SubLObject other_index_assertion_match_p(final SubLObject assertion, final SubLObject v_term) {
        return simple_indexing.matches_other_index(assertion, v_term);
    }

    public static SubLObject do_other_index_assertion_match_p(final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return makeBoolean((NIL != pred_relevance_macros.relevant_predP(assertions_high.gaf_arg0(assertion))) && (NIL != mt_relevance_macros.relevant_assertionP(assertion)));
        }
        return mt_relevance_macros.relevant_assertionP(assertion);
    }

    public static SubLObject do_term_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list230);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$28 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list230);
            current_$28 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list230);
            if (NIL == member(current_$28, $list222, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$28 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list230);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject final_index_spec = $sym242$FINAL_INDEX_SPEC;
        return list(PWHEN, list(DO_TERM_INDEX_KEY_VALIDATOR, v_term, type), list(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(final_index_spec, list(NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, v_term, type), $DONE, done), list(DO_FINAL_INDEX_FROM_SPEC, list(var, final_index_spec, type, truth, direction, done), listS(PWHEN, list(DO_TERM_INDEX_ASSERTION_MATCH_P, var, final_index_spec), append(body, NIL)))));
    }

    public static SubLObject do_term_index_key_validator(final SubLObject v_term, final SubLObject type) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && ((NIL == type) || (NIL != enumeration_types.assertion_type_p(type))));
    }

    public static SubLObject new_term_final_index_spec_iterator(final SubLObject v_term, final SubLObject type) {
        SubLObject iterators = NIL;
        if ((NIL == type) || ($GAF == type)) {
            if (NIL != do_gaf_arg_index_key_validator(v_term, NIL, NIL)) {
                iterators = cons(new_gaf_arg_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
            }
            if (NIL != do_predicate_extent_index_key_validator(v_term)) {
                iterators = cons(new_predicate_extent_final_index_spec_iterator(v_term), iterators);
            }
            if (NIL != do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                iterators = cons(new_nart_arg_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
            }
            if (NIL != do_function_extent_index_key_validator(v_term)) {
                iterators = cons(iteration.new_singleton_iterator(function_extent_final_index_spec(v_term)), iterators);
            }
        }
        if ((NIL == type) || ($RULE == type)) {
            if (NIL != do_predicate_rule_index_key_validator(v_term, NIL, NIL)) {
                iterators = cons(new_predicate_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
            }
            if (NIL != do_isa_rule_index_key_validator(v_term, NIL, NIL)) {
                iterators = cons(new_isa_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
            }
            if (NIL != do_genls_rule_index_key_validator(v_term, NIL, NIL)) {
                iterators = cons(new_genls_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
            }
            if (NIL != do_genl_mt_rule_index_key_validator(v_term, NIL, NIL)) {
                iterators = cons(new_genl_mt_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
            }
            if (NIL != do_function_rule_index_key_validator(v_term, NIL)) {
                iterators = cons(new_function_rule_final_index_spec_iterator(v_term, UNPROVIDED), iterators);
            }
            if (NIL != do_exception_rule_index_key_validator(v_term, NIL)) {
                iterators = cons(new_exception_rule_final_index_spec_iterator(v_term, UNPROVIDED), iterators);
            }
            if (NIL != do_pragma_rule_index_key_validator(v_term, NIL)) {
                iterators = cons(new_pragma_rule_final_index_spec_iterator(v_term, UNPROVIDED), iterators);
            }
        }
        if (NIL != do_mt_index_key_validator(v_term, NIL)) {
            iterators = cons(iteration.new_singleton_iterator(mt_final_index_spec(v_term)), iterators);
        }
        if (NIL != do_other_index_key_validator(v_term, NIL)) {
            iterators = cons(iteration.new_singleton_iterator(other_final_index_spec(v_term)), iterators);
        }
        return iteration.new_iterator_iterator(nreverse(iterators));
    }

    public static SubLObject do_term_index_assertion_match_p(final SubLObject assertion, final SubLObject final_index_spec) {
        if (NIL != other_final_index_spec_p(final_index_spec)) {
            return mt_relevance_macros.relevant_assertionP(assertion);
        }
        return T;
    }

    public static SubLObject do_broad_mt_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list247);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list247);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list247);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$29 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list247);
            current_$29 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list247);
            if (NIL == member(current_$29, $list248, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$29 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list247);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PWHEN, list(DO_BROAD_MT_INDEX_KEY_VALIDATOR, mt, type), list(SOME_ASSERTIONS, list(var, $PROGRESS_MESSAGE, $str250$do_broad_mt_index, $DONE, done), listS(PWHEN, list(DO_BROAD_MT_INDEX_MATCH_P, var, mt, type, truth), append(body, NIL))));
    }

    public static SubLObject do_broad_mt_index_key_validator(final SubLObject mt, final SubLObject type) {
        return makeBoolean((NIL != hlmt.hlmt_p(mt)) && ((NIL == type) || (NIL != enumeration_types.assertion_type_p(type))));
    }

    public static SubLObject do_broad_mt_index_match_p(final SubLObject assertion, final SubLObject mt, final SubLObject type, final SubLObject truth) {
        return makeBoolean((mt.equal(assertions_high.assertion_mt(assertion)) && ((NIL == type) || (NIL != assertions_high.assertion_has_type(assertion, type)))) && ((NIL == truth) || (NIL != assertions_high.assertion_has_truth(assertion, truth))));
    }

    public static SubLObject do_hlmt_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list253);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_hlmt = NIL;
        destructuring_bind_must_consp(current, datum, $list253);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list253);
        v_hlmt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$30 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list253);
            current_$30 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list253);
            if (NIL == member(current_$30, $list248, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$30 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list253);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(WITH_JUST_MT, v_hlmt, list(DO_OVERLAP_INDEX, list(var, list(FLATTEN, v_hlmt), $TRUTH, truth, $DONE, done), list(PWHEN, list(COR, list(NULL, type), list(EQ, type, list(ASSERTION_TYPE, var))), listS(PWHEN, list($sym258$HLMT_EQUAL_, v_hlmt, list(ASSERTION_HLMT, var)), append(body, NIL)))));
    }

    public static SubLObject do_mt_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list247);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list247);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list247);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$31 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list247);
            current_$31 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list247);
            if (NIL == member(current_$31, $list248, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$31 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list247);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(PCASE, list(DO_MT_CONTENTS_METHOD, mt), list($MT, listS(DO_MT_INDEX, list(var, mt, $TYPE, type, $TRUTH, truth, $DONE, done), append(body, NIL))), list($BROAD_MT, listS(DO_BROAD_MT_INDEX, list(var, mt, $TYPE, type, $TRUTH, truth, $DONE, done), append(body, NIL))), $list264);
    }

    public static SubLObject do_mt_contents_method(final SubLObject mt) {
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return NIL != kb_indexing.broad_mtP(mt) ? $BROAD_MT : $MT;
    }

    public static SubLObject do_overlap_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list267);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject terms = NIL;
        destructuring_bind_must_consp(current, datum, $list267);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list267);
        terms = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$32 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list267);
            current_$32 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list267);
            if (NIL == member(current_$32, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$32 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list267);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ASSERTION_LIST, list(assertion_var, list(GATHER_OVERLAP_INDEX, terms), $TRUTH, truth, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_gafs_potentially_matching_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list270);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        asent = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$33 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list270);
            current_$33 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list270);
            if (NIL == member(current_$33, $list271, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$33 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list270);
        }
        final SubLObject methods_tail = property_list_member($METHODS, current);
        final SubLObject v_methods = (NIL != methods_tail) ? cadr(methods_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_BEST_GAF_LOOKUP_INDEX, list(assertion_var, asent, $METHODS, v_methods, $TRUTH, truth, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_best_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list270);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        asent = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$34 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list270);
            current_$34 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list270);
            if (NIL == member(current_$34, $list271, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$34 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list270);
        }
        final SubLObject methods_tail = property_list_member($METHODS, current);
        final SubLObject v_methods = (NIL != methods_tail) ? cadr(methods_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_GAF_LOOKUP_INDEX, list(assertion_var, list(BEST_GAF_LOOKUP_INDEX, asent, truth, v_methods), $TRUTH, truth, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$35 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list276);
            current_$35 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list276);
            if (NIL == member(current_$35, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$35 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list276);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject l_index = $sym277$L_INDEX;
        final SubLObject method = $sym278$METHOD;
        return list(CLET, list(list(l_index, lookup_index), list(method, list(DO_GLI_EXTRACT_METHOD, l_index))), list(PCASE, method, list($GAF_ARG, listS(DO_GLI_VIA_GAF_ARG, list(assertion_var, l_index, $TRUTH, truth, $DONE, done), append(body, NIL))), list($PREDICATE_EXTENT, listS(DO_GLI_VIA_PREDICATE_EXTENT, list(assertion_var, l_index, $TRUTH, truth, $DONE, done), append(body, NIL))), list($OVERLAP, listS(DO_GLI_VIA_OVERLAP, list(assertion_var, l_index, $TRUTH, truth, $DONE, done), append(body, NIL))), list(OTHERWISE, list(DO_GLI_METHOD_ERROR, l_index, method))));
    }

    public static SubLObject do_gli_extract_method(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, $INDEX_TYPE, UNPROVIDED);
    }

    public static SubLObject do_gli_method_error(final SubLObject lookup_index, final SubLObject method) {
        if (NIL == lookup_index) {
            return NIL;
        }
        return Errors.cerror($$$Skip_iteration, $str288$Unsupported_method__S_in__S_in_DO, method, lookup_index);
    }

    public static SubLObject do_gli_via_gaf_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$36 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list276);
            current_$36 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list276);
            if (NIL == member(current_$36, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$36 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list276);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject v_term = $sym289$TERM;
        final SubLObject argnum = $sym290$ARGNUM;
        final SubLObject predicate = $sym291$PREDICATE;
        return list(CMULTIPLE_VALUE_BIND, list(v_term, argnum, predicate), list(DO_GLI_VGA_EXTRACT_KEYS, lookup_index), list(PIF, argnum, list(PIF, predicate, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ assertion_var, v_term, $INDEX, argnum, $PREDICATE, predicate, $TRUTH, truth, $DONE, done }), append(body, NIL)), listS(DO_GAF_ARG_INDEX, list(assertion_var, v_term, $INDEX, argnum, $TRUTH, truth, $DONE, done), append(body, NIL))), list(PIF, predicate, listS(DO_GAF_ARG_INDEX, list(assertion_var, v_term, $PREDICATE, predicate, $TRUTH, truth, $DONE, done), append(body, NIL)), listS(DO_GAF_ARG_INDEX, list(assertion_var, v_term, $TRUTH, truth, $DONE, done), append(body, NIL)))));
    }

    public static SubLObject do_gli_vga_extract_keys(final SubLObject lookup_index) {
        return subl_promotions.values3(kb_indexing.lookup_index_get_property(lookup_index, $TERM, UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, $ARGNUM, UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, $PREDICATE, UNPROVIDED));
    }

    public static SubLObject do_gli_via_predicate_extent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$37 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list276);
            current_$37 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list276);
            if (NIL == member(current_$37, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$37 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list276);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_PREDICATE_EXTENT_INDEX, list(assertion_var, list(DO_GLI_VPE_EXTRACT_KEY, lookup_index), $TRUTH, truth, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_gli_vpe_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, $PREDICATE, UNPROVIDED);
    }

    public static SubLObject do_gli_via_overlap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$38 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list276);
            current_$38 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list276);
            if (NIL == member(current_$38, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$38 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list276);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_OVERLAP_INDEX, list(assertion_var, list(DO_GLI_VO_EXTRACT_KEY, lookup_index), $TRUTH, truth, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_gli_vo_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, $TERMS, UNPROVIDED);
    }

    public static SubLObject do_narts_potentially_matching_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart_var = NIL;
        SubLObject nart_hl_formula = NIL;
        destructuring_bind_must_consp(current, datum, $list300);
        nart_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        nart_hl_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$39 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list300);
            current_$39 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list300);
            if (NIL == member(current_$39, $list301, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$39 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list300);
        }
        final SubLObject methods_tail = property_list_member($METHODS, current);
        final SubLObject v_methods = (NIL != methods_tail) ? cadr(methods_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject tou_var = $sym302$TOU_VAR;
        return list(DO_BEST_NAT_LOOKUP_INDEX, list(tou_var, nart_hl_formula, $METHODS, v_methods, $DONE, done), listS(CLET, list(list(nart_var, list(GAF_ARG1, tou_var))), append(body, NIL)));
    }

    public static SubLObject do_term_of_unit_assertions_potentially_matching_nat_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject nart_hl_formula = NIL;
        destructuring_bind_must_consp(current, datum, $list304);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        nart_hl_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$40 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list304);
            current_$40 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list304);
            if (NIL == member(current_$40, $list301, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$40 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list304);
        }
        final SubLObject methods_tail = property_list_member($METHODS, current);
        final SubLObject v_methods = (NIL != methods_tail) ? cadr(methods_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_BEST_NAT_LOOKUP_INDEX, list(assertion_var, nart_hl_formula, $METHODS, v_methods, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_best_nat_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject nart_hl_formula = NIL;
        destructuring_bind_must_consp(current, datum, $list304);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        nart_hl_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$41 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list304);
            current_$41 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list304);
            if (NIL == member(current_$41, $list301, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$41 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list304);
        }
        final SubLObject methods_tail = property_list_member($METHODS, current);
        final SubLObject v_methods = (NIL != methods_tail) ? cadr(methods_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_NAT_LOOKUP_INDEX, list(assertion_var, list(BEST_NAT_LOOKUP_INDEX, nart_hl_formula, v_methods), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_nat_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list307);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list307);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list307);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$42 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list307);
            current_$42 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list307);
            if (NIL == member(current_$42, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$42 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list307);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject l_index = $sym308$L_INDEX;
        final SubLObject method = $sym309$METHOD;
        return list(CLET, list(list(l_index, lookup_index), list(method, list(DO_NLI_EXTRACT_METHOD, l_index))), list(PCASE, method, list($NART_ARG, listS(DO_NLI_VIA_NART_ARG, list(assertion_var, l_index, $DONE, done), append(body, NIL))), list($FUNCTION_EXTENT, listS(DO_NLI_VIA_FUNCTION_EXTENT, list(assertion_var, l_index, $DONE, done), append(body, NIL))), list($OVERLAP, listS(DO_NLI_VIA_OVERLAP, list(assertion_var, l_index, $DONE, done), append(body, NIL))), list(OTHERWISE, list(DO_NLI_METHOD_ERROR, l_index, method))));
    }

    public static SubLObject do_nli_extract_method(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, $INDEX_TYPE, UNPROVIDED);
    }

    public static SubLObject do_nli_method_error(final SubLObject lookup_index, final SubLObject method) {
        if (NIL == lookup_index) {
            return NIL;
        }
        return Errors.cerror($$$Skip_iteration, $str316$Unsupported_method__S_in__S_in_DO, method, lookup_index);
    }

    public static SubLObject do_nli_via_nart_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list307);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list307);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list307);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$43 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list307);
            current_$43 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list307);
            if (NIL == member(current_$43, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$43 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list307);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject v_term = $sym317$TERM;
        final SubLObject argnum = $sym318$ARGNUM;
        final SubLObject functor = $sym319$FUNCTOR;
        return list(CMULTIPLE_VALUE_BIND, list(v_term, argnum, functor), list(DO_NLI_VNA_EXTRACT_KEYS, lookup_index), list(PIF, argnum, list(PIF, functor, listS(DO_NART_ARG_INDEX, list(assertion_var, v_term, $INDEX, argnum, $FUNCTION, functor, $DONE, done), append(body, NIL)), listS(DO_NART_ARG_INDEX, list(assertion_var, v_term, $INDEX, argnum, $DONE, done), append(body, NIL))), list(PIF, functor, listS(DO_NART_ARG_INDEX, list(assertion_var, v_term, $FUNCTION, functor, $DONE, done), append(body, NIL)), listS(DO_NART_ARG_INDEX, list(assertion_var, v_term, $DONE, done), append(body, NIL)))));
    }

    public static SubLObject do_nli_vna_extract_keys(final SubLObject lookup_index) {
        return values(kb_indexing.lookup_index_get_property(lookup_index, $TERM, UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, $ARGNUM, UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, $FUNCTOR, UNPROVIDED));
    }

    public static SubLObject do_nli_via_function_extent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list307);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list307);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list307);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$44 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list307);
            current_$44 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list307);
            if (NIL == member(current_$44, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$44 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list307);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_FUNCTION_EXTENT_INDEX, list(assertion_var, list(DO_NLI_VFE_EXTRACT_KEY, lookup_index), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_nli_vfe_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, $FUNCTOR, UNPROVIDED);
    }

    public static SubLObject do_nli_via_overlap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject lookup_index = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$45 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list276);
            current_$45 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list276);
            if (NIL == member(current_$45, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$45 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list276);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_OVERLAP_INDEX, list(assertion_var, list(DO_NLI_VO_EXTRACT_KEY, lookup_index), $TRUTH, truth, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_nli_vo_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, $TERMS, UNPROVIDED);
    }

    public static SubLObject simple_final_index_spec_p(final SubLObject final_index_spec) {
        return eq($SIMPLE, final_index_spec.first());
    }

    public static SubLObject simple_final_index_spec_term(final SubLObject final_index_spec) {
        return second(final_index_spec);
    }

    public static SubLObject new_final_index_iterator(final SubLObject final_index_spec, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_final_index_spec_p(final_index_spec)) {
            final SubLObject assertions = simple_term_assertion_list_filtered(final_index_spec, type, truth, direction);
            final SubLObject syntactic_iterator = iteration.new_list_iterator(assertions);
            final SubLObject semantic_iterator = iteration.new_filter_iterator_without_values(syntactic_iterator, $sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_, list(final_index_spec), UNPROVIDED);
            return semantic_iterator;
        }
        final SubLObject iterator = hl_interface_infrastructure.new_hl_store_iterator(list(FINAL_INDEX_ITERATOR_FILTERED, list(QUOTE, final_index_spec), type, truth, direction), ONE_INTEGER);
        return iterator;
    }

    public static SubLObject assertion_semantically_matches_simple_final_index_specP(final SubLObject assertion, final SubLObject simple_final_index_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simple = NIL;
        SubLObject v_term = NIL;
        SubLObject type = NIL;
        SubLObject rest = NIL;
        destructuring_bind_must_consp(simple_final_index_spec, simple_final_index_spec, $list327);
        simple = simple_final_index_spec.first();
        SubLObject current = simple_final_index_spec.rest();
        destructuring_bind_must_consp(current, simple_final_index_spec, $list327);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, simple_final_index_spec, $list327);
        type = current.first();
        current = rest = current.rest();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SIMPLE != simple)) {
            Errors.error($str328$Unexpected_non_simple_index__s, simple_final_index_spec);
        }
        if ($GAF == type) {
            SubLObject current_$47;
            final SubLObject datum_$46 = current_$47 = rest;
            SubLObject argnum_spec = NIL;
            SubLObject pred_spec = NIL;
            SubLObject mt_spec = NIL;
            destructuring_bind_must_consp(current_$47, datum_$46, $list329);
            argnum_spec = current_$47.first();
            current_$47 = current_$47.rest();
            destructuring_bind_must_consp(current_$47, datum_$46, $list329);
            pred_spec = current_$47.first();
            current_$47 = current_$47.rest();
            destructuring_bind_must_consp(current_$47, datum_$46, $list329);
            mt_spec = current_$47.first();
            current_$47 = current_$47.rest();
            if (NIL == current_$47) {
                if ((NIL == mt_spec) && (NIL == assertion_utilities.assertion_matches_mtP(assertion))) {
                    return NIL;
                }
                if ((NIL == pred_spec) && (NIL == pred_relevance_macros.all_preds_are_relevantP())) {
                    final SubLObject pred = assertions_high.gaf_predicate(assertion);
                    if (NIL == pred_relevance_macros.relevant_predP(pred)) {
                        return NIL;
                    }
                }
            } else {
                cdestructuring_bind_error(datum_$46, $list329);
            }
        } else {
            if ($NART == type) {
                return T;
            }
            if ($RULE == type) {
                if (NIL == assertion_utilities.assertion_matches_mtP(assertion)) {
                    return NIL;
                }
            } else
                if (NIL == type) {
                    SubLObject current_$48;
                    final SubLObject datum_$47 = current_$48 = rest;
                    SubLObject assertion_func = NIL;
                    destructuring_bind_must_consp(current_$48, datum_$47, $list331);
                    assertion_func = current_$48.first();
                    current_$48 = current_$48.rest();
                    if (NIL == current_$48) {
                        if (MT_INDEX_ASSERTION_MATCH_P == assertion_func) {
                            return T;
                        }
                    } else {
                        cdestructuring_bind_error(datum_$47, $list331);
                    }
                    if (NIL == assertion_utilities.assertion_matches_mtP(assertion)) {
                        return NIL;
                    }
                } else {
                    Errors.error($str332$unexpected_type__s_in_simple_fina, type, simple_final_index_spec);
                }

        }
        return T;
    }

    public static SubLObject destroy_final_index_iterator(final SubLObject final_index_iterator) {
        return iteration.iteration_finalize(final_index_iterator);
    }

    public static SubLObject do_assertions_with_same_assertion_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list333);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list333);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list333);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$50 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list333);
            current_$50 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list333);
            if (NIL == member(current_$50, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$50 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list333);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject assertion_var = $sym334$ASSERTION_VAR;
        final SubLObject clause_struc = $sym335$CLAUSE_STRUC;
        return list(CLET, list(list(assertion_var, assertion)), list(PIF_FEATURE, $CYC_ALEXANDRIA, list(PIF, list(ASSERTION_GAF_P, assertion_var), list(DO_ITERATOR_WITHOUT_VALUES, list(var, listS(NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR, list(FIRST, list(SECOND, list(ASSERTION_CNF, assertion_var))), $list342), $DONE, done), list(PUNLESS, list(KBEQ, var, assertion_var), bq_cons(PROGN, append(body, NIL)))), list(DO_ITERATOR_WITHOUT_VALUES, list(var, list(NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR, list(ASSERTION_CNF, assertion_var)), $DONE, done), list(PUNLESS, list(KBEQ, var, assertion_var), bq_cons(PROGN, append(body, NIL))))), list(CLET, list(list(clause_struc, list(ASSERTION_CLAUSE_STRUC, assertion_var))), list(PWHEN, clause_struc, list(CDOLIST, list(var, list(CLAUSE_STRUC_ASSERTIONS, clause_struc)), list(PUNLESS, list(KBEQ, var, assertion_var), list(PUNLESS, done, bq_cons(PROGN, append(body, NIL)))))))));
    }

    public static SubLObject new_do_assertions_with_same_assertion_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list349);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list349);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list349);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$51 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list349);
            current_$51 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list349);
            if (NIL == member(current_$51, $list350, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$51 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list349);
        }
        final SubLObject exclusiveP_tail = property_list_member($EXCLUSIVE_, current);
        final SubLObject exclusiveP = (NIL != exclusiveP_tail) ? cadr(exclusiveP_tail) : T;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!assertion.isAtom()) {
            final SubLObject assertion_var = $sym352$ASSERTION_VAR;
            return list(CLET, list(list(assertion_var, assertion)), listS(NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA, list(var, assertion_var, $EXCLUSIVE_, exclusiveP, $DONE, done), append(body, NIL)));
        }
        if (!exclusiveP.isAtom()) {
            final SubLObject exclusive_var = $sym354$EXCLUSIVE_VAR;
            return list(CLET, list(list(exclusive_var, exclusiveP)), listS(NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA, list(var, assertion, $EXCLUSIVE_, exclusive_var, $DONE, done), append(body, NIL)));
        }
        return list(DO_ITERATOR_WITHOUT_VALUES, list(var, list(NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR, assertion), $DONE, done), listS(PUNLESS, list(CAND, exclusiveP, list(KBEQ, var, assertion)), append(body, NIL)));
    }

    public static SubLObject new_assertions_with_same_assertion_formula_iterator(final SubLObject assertion) {
        final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
        if (NIL != clause_struc) {
            return iteration.new_list_iterator(clause_strucs.clause_struc_assertions(clause_struc));
        }
        return iteration.new_singleton_iterator(assertion);
    }

    public static SubLObject assertions_with_same_assertion_formula_p(final SubLObject assertion1, final SubLObject assertion2) {
        assert NIL != assertion_handles.assertion_p(assertion1) : "assertion_handles.assertion_p(assertion1) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion1) " + assertion1;
        assert NIL != assertion_handles.assertion_p(assertion2) : "assertion_handles.assertion_p(assertion2) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion2) " + assertion2;
        if (NIL != kb_utilities.kbeq(assertion1, assertion2)) {
            return T;
        }
        final SubLObject clause_struc1 = assertions_low.assertion_clause_struc(assertion1);
        final SubLObject clause_struc2 = assertions_low.assertion_clause_struc(assertion2);
        return makeBoolean((NIL != clause_strucs.clause_struc_p(clause_struc1)) && (NIL != kb_utilities.kbeq(clause_struc1, clause_struc2)));
    }

    public static SubLObject final_index_iterator_filtered(final SubLObject final_index_spec, final SubLObject type_spec, final SubLObject truth_spec, final SubLObject direction_spec) {
        SubLObject v_term = NIL;
        SubLObject keys = NIL;
        destructuring_bind_must_consp(final_index_spec, final_index_spec, $list358);
        v_term = final_index_spec.first();
        final SubLObject current = keys = final_index_spec.rest();
        final SubLObject final_index = kb_indexing.get_subindex(v_term, keys);
        if (NIL == final_index) {
            return NIL;
        }
        assert NIL != final_index_p(final_index) : "kb_indexing_datastructures.final_index_p(final_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.final_index_p(final_index) " + final_index;
        final SubLObject raw_iterator = new_final_index_base_iterator(final_index);
        final SubLObject filtered_iterator = iteration.new_filter_iterator_without_values(raw_iterator, $sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_, list(type_spec, truth_spec, direction_spec), UNPROVIDED);
        return filtered_iterator;
    }

    public static SubLObject new_gaf_simple_final_index_spec(final SubLObject v_term, final SubLObject argnum_spec, final SubLObject predicate_spec, final SubLObject mt_spec) {
        return list($SIMPLE, v_term, $GAF, argnum_spec, predicate_spec, mt_spec);
    }

    public static SubLObject new_nart_simple_final_index_spec(final SubLObject v_term, final SubLObject argnum_spec, final SubLObject functor_spec) {
        return list($SIMPLE, v_term, $NART, argnum_spec, functor_spec);
    }

    public static SubLObject new_rule_simple_final_index_spec(final SubLObject v_term, final SubLObject sense_spec, final SubLObject asent_func) {
        return list($SIMPLE, v_term, $RULE, sense_spec, asent_func);
    }

    public static SubLObject new_assertion_simple_final_index_spec(final SubLObject v_term, final SubLObject assertion_func) {
        return list($SIMPLE, v_term, NIL, assertion_func);
    }

    public static SubLObject clear_simple_term_assertion_list_filtered() {
        final SubLObject cs = $simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_simple_term_assertion_list_filtered(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($simple_term_assertion_list_filtered_caching_state$.getGlobalValue(), list(simple_final_index_spec, type, truth, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject simple_term_assertion_list_filtered_internal(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction) {
        SubLObject result = NIL;
        final SubLObject v_term = simple_final_index_spec_term(simple_final_index_spec);
        SubLObject cdolist_list_var = simple_term_assertion_list(v_term);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_syntactically_matches_simple_final_index_specP(assertion, simple_final_index_spec)) && (NIL != assertion_utilities.assertion_matches_type_truth_and_directionP(assertion, type, truth, direction))) {
                result = cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject simple_term_assertion_list_filtered(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction) {
        SubLObject caching_state = $simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SIMPLE_TERM_ASSERTION_LIST_FILTERED, $simple_term_assertion_list_filtered_caching_state$, $int$512, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(simple_final_index_spec, type, truth, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (simple_final_index_spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (truth.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(simple_term_assertion_list_filtered_internal(simple_final_index_spec, type, truth, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(simple_final_index_spec, type, truth, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject assertion_syntactically_matches_simple_final_index_specP(final SubLObject assertion, final SubLObject simple_final_index_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simple = NIL;
        SubLObject v_term = NIL;
        SubLObject type = NIL;
        SubLObject rest = NIL;
        destructuring_bind_must_consp(simple_final_index_spec, simple_final_index_spec, $list327);
        simple = simple_final_index_spec.first();
        SubLObject current = simple_final_index_spec.rest();
        destructuring_bind_must_consp(current, simple_final_index_spec, $list327);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, simple_final_index_spec, $list327);
        type = current.first();
        current = rest = current.rest();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SIMPLE != simple)) {
            Errors.error($str328$Unexpected_non_simple_index__s, simple_final_index_spec);
        }
        if (NIL != assertion_matches_syntactic_indexing_typeP(assertion, type)) {
            if ($GAF == type) {
                return gaf_syntactically_matches_simple_gaf_final_index_specP(assertion, v_term, rest);
            }
            if ($NART == type) {
                return tou_syntactically_matches_simple_nart_final_index_specP(assertion, v_term, rest);
            }
            if ($RULE == type) {
                return rule_syntactically_matches_simple_rule_final_index_specP(assertion, v_term, rest);
            }
            if (NIL == type) {
                return assertion_syntactically_matches_simple_assertion_final_index_specP(assertion, v_term, rest);
            }
            Errors.error($str332$unexpected_type__s_in_simple_fina, type, simple_final_index_spec);
        }
        return NIL;
    }

    public static SubLObject assertion_matches_syntactic_indexing_typeP(final SubLObject assertion, final SubLObject type) {
        if ($NART == type) {
            return function_terms.term_of_unit_assertion_p(assertion);
        }
        return assertion_utilities.assertion_matches_typeP(assertion, type);
    }

    public static SubLObject gaf_syntactically_matches_simple_gaf_final_index_specP(final SubLObject gaf, final SubLObject v_term, final SubLObject gaf_final_index_spec) {
        SubLObject argnum_spec = NIL;
        SubLObject predicate_spec = NIL;
        SubLObject mt_spec = NIL;
        destructuring_bind_must_consp(gaf_final_index_spec, gaf_final_index_spec, $list365);
        argnum_spec = gaf_final_index_spec.first();
        SubLObject current = gaf_final_index_spec.rest();
        destructuring_bind_must_consp(current, gaf_final_index_spec, $list365);
        predicate_spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, gaf_final_index_spec, $list365);
        mt_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((((NIL == predicate_spec) || (NIL != assertion_utilities.gaf_assertion_has_pred_p(gaf, predicate_spec))) && (NIL != gaf_matches_simple_argnum_specP(gaf, v_term, argnum_spec))) && ((NIL == mt_spec) || (NIL != assertions_high.assertion_has_mtP(gaf, mt_spec)))) {
                return T;
            }
        } else {
            cdestructuring_bind_error(gaf_final_index_spec, $list365);
        }
        return NIL;
    }

    public static SubLObject gaf_matches_simple_argnum_specP(final SubLObject gaf, final SubLObject v_term, final SubLObject argnum_spec) {
        if (NIL == argnum_spec) {
            return T;
        }
        if ($ANY == argnum_spec) {
            return assertion_utilities.gaf_has_term_in_some_argnumP(gaf, v_term);
        }
        if (argnum_spec.isInteger()) {
            return assertion_utilities.gaf_has_term_in_argnumP(gaf, v_term, argnum_spec);
        }
        if (((!argnum_spec.isCons()) || (NIL == list_utilities.lengthE(argnum_spec, TWO_INTEGER, UNPROVIDED))) || (!argnum_spec.first().isInteger())) {
            return NIL;
        }
        SubLObject n = NIL;
        SubLObject m = NIL;
        destructuring_bind_must_consp(argnum_spec, argnum_spec, $list366);
        n = argnum_spec.first();
        SubLObject current = argnum_spec.rest();
        destructuring_bind_must_consp(current, argnum_spec, $list366);
        m = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(argnum_spec, $list366);
            return NIL;
        }
        final SubLObject subformula = assertions_high.gaf_arg(gaf, n);
        assert NIL != el_formula_p(subformula) : "el_utilities.el_formula_p(subformula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(subformula) " + subformula;
        if (m == $ANY) {
            return term_is_one_of_argsP(v_term, subformula);
        }
        return formula_has_term_in_argnumP(subformula, v_term, m);
    }

    public static SubLObject tou_syntactically_matches_simple_nart_final_index_specP(final SubLObject tou_gaf, final SubLObject v_term, final SubLObject nart_final_index_spec) {
        SubLObject argnum_spec = NIL;
        SubLObject functor_spec = NIL;
        destructuring_bind_must_consp(nart_final_index_spec, nart_final_index_spec, $list368);
        argnum_spec = nart_final_index_spec.first();
        SubLObject current = nart_final_index_spec.rest();
        destructuring_bind_must_consp(current, nart_final_index_spec, $list368);
        functor_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            return simple_indexing.matches_nart_arg_index(tou_gaf, v_term, $ANY == argnum_spec ? NIL : argnum_spec, functor_spec);
        }
        cdestructuring_bind_error(nart_final_index_spec, $list368);
        return NIL;
    }

    public static SubLObject rule_syntactically_matches_simple_rule_final_index_specP(final SubLObject rule, final SubLObject v_term, final SubLObject rule_final_index_spec) {
        SubLObject sense = NIL;
        SubLObject asent_func = NIL;
        destructuring_bind_must_consp(rule_final_index_spec, rule_final_index_spec, $list369);
        sense = rule_final_index_spec.first();
        SubLObject current = rule_final_index_spec.rest();
        destructuring_bind_must_consp(current, rule_final_index_spec, $list369);
        asent_func = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, sense, v_term, asent_func)) {
                return T;
            }
        } else {
            cdestructuring_bind_error(rule_final_index_spec, $list369);
        }
        return NIL;
    }

    public static SubLObject rule_syntactically_matches_simple_rule_final_index_spec_intP(final SubLObject rule, final SubLObject sense, final SubLObject v_term, final SubLObject asent_func) {
        if (NIL == sense) {
            return makeBoolean((NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, $NEG, v_term, asent_func)) || (NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, $POS, v_term, asent_func)));
        }
        if (NIL != assertion_handles.valid_assertion_handleP(rule)) {
            final SubLObject asents = clauses.clause_sense_lits(assertions_high.assertion_cnf(rule), sense);
            SubLObject match = NIL;
            if (NIL == match) {
                SubLObject csome_list_var;
                SubLObject asent;
                for (csome_list_var = asents, asent = NIL, asent = csome_list_var.first(); (NIL == match) && (NIL != csome_list_var); match = asent_syntactically_matches_simple_rule_final_index_specP(asent, v_term, asent_func) , csome_list_var = csome_list_var.rest() , asent = csome_list_var.first()) {
                }
            }
            return match;
        }
        return NIL;
    }

    public static SubLObject asent_syntactically_matches_simple_rule_final_index_specP(final SubLObject asent, final SubLObject v_term, final SubLObject asent_func) {
        SubLObject result = NIL;
        if (asent_func.eql(PREDICATE_RULE_INDEX_ASENT_MATCH_P)) {
            result = predicate_rule_index_asent_match_p(asent, v_term);
        } else
            if (asent_func.eql(ISA_RULE_INDEX_ASENT_MATCH_P)) {
                result = isa_rule_index_asent_match_p(asent, v_term);
            } else
                if (asent_func.eql(GENLS_RULE_INDEX_ASENT_MATCH_P)) {
                    result = genls_rule_index_asent_match_p(asent, v_term);
                } else
                    if (asent_func.eql(GENL_MT_RULE_INDEX_ASENT_MATCH_P)) {
                        result = genl_mt_rule_index_asent_match_p(asent, v_term);
                    } else
                        if (asent_func.eql(FUNCTION_RULE_INDEX_ASENT_MATCH_P)) {
                            result = function_rule_index_asent_match_p(asent, v_term);
                        } else
                            if (asent_func.eql(EXCEPTION_RULE_INDEX_ASENT_MATCH_P)) {
                                result = exception_rule_index_asent_match_p(asent, v_term);
                            } else
                                if (asent_func.eql(PRAGMA_RULE_INDEX_ASENT_MATCH_P)) {
                                    result = pragma_rule_index_asent_match_p(asent, v_term);
                                } else {
                                    result = funcall(asent_func, asent, v_term);
                                }






        return result;
    }

    public static SubLObject assertion_syntactically_matches_simple_assertion_final_index_specP(final SubLObject assertion, final SubLObject v_term, final SubLObject assertion_final_index_spec) {
        SubLObject assertion_func = NIL;
        destructuring_bind_must_consp(assertion_final_index_spec, assertion_final_index_spec, $list331);
        assertion_func = assertion_final_index_spec.first();
        final SubLObject current = assertion_final_index_spec.rest();
        if (NIL == current) {
            SubLObject result = NIL;
            final SubLObject pcase_var = assertion_func;
            if (pcase_var.eql(MT_INDEX_ASSERTION_MATCH_P)) {
                result = mt_index_assertion_match_p(assertion, v_term);
            } else {
                result = funcall(assertion_func, assertion, v_term);
            }
            return result;
        }
        cdestructuring_bind_error(assertion_final_index_spec, $list331);
        return NIL;
    }

    public static SubLObject predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject predicate) {
        return makeBoolean(predicate.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != predicate_rule_index_asent_p(asent)));
    }

    public static SubLObject predicate_rule_index_asent_p(final SubLObject asent) {
        if (NIL == forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent))) {
            return NIL;
        }
        final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (pcase_var.eql($$isa)) {
            return makeBoolean(NIL == isa_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$genls)) {
            return makeBoolean(NIL == genls_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$genlMt)) {
            return makeBoolean(NIL == genl_mt_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$termOfUnit)) {
            return makeBoolean(NIL == function_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$abnormal)) {
            return makeBoolean(NIL == exception_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$meetsPragmaticRequirement)) {
            return makeBoolean(NIL == pragma_rule_index_asent_p(asent));
        }
        return T;
    }

    public static SubLObject decontextualized_ist_predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject predicate) {
        return makeBoolean(((NIL != ist_predicateP(cycl_utilities.atomic_sentence_predicate(asent), kb_indexing.spec_preds_of_ist_indexing_enabledP())) && predicate.eql(literal_predicate(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED))) && (NIL != decontextualized_ist_predicate_rule_index_asent_p(asent)));
    }

    public static SubLObject decontextualized_ist_predicate_rule_index_asent_p(final SubLObject asent) {
        if (NIL == ist_predicateP(cycl_utilities.atomic_sentence_predicate(asent), kb_indexing.spec_preds_of_ist_indexing_enabledP())) {
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = literal_predicate(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        if (pcase_var.eql($$isa)) {
            return makeBoolean(NIL == isa_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$genls)) {
            return makeBoolean(NIL == genls_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$genlMt)) {
            return makeBoolean(NIL == genl_mt_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$termOfUnit)) {
            return makeBoolean(NIL == function_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$abnormal)) {
            return makeBoolean(NIL == exception_rule_index_asent_p(asent));
        }
        if (pcase_var.eql($$meetsPragmaticRequirement)) {
            return makeBoolean(NIL == pragma_rule_index_asent_p(asent));
        }
        return T;
    }

    public static SubLObject isa_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection) {
        return makeBoolean((NIL != isa_rule_index_asent_p(asent)) && collection.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject quoted_isa_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection) {
        return makeBoolean((NIL != quoted_isa_rule_index_asent_p(asent)) && collection.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject isa_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(($$isa.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) && (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject quoted_isa_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(($$quotedIsa.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) && (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject genls_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection) {
        return makeBoolean((NIL != genls_rule_index_asent_p(asent)) && collection.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject genls_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(($$genls.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) && (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject genl_mt_rule_index_asent_match_p(final SubLObject asent, final SubLObject genl_mt) {
        return makeBoolean((NIL != genl_mt_rule_index_asent_p(asent)) && genl_mt.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject genl_mt_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) && (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject function_rule_index_asent_match_p(final SubLObject asent, final SubLObject function) {
        return makeBoolean((NIL != function_rule_index_asent_p(asent)) && function.eql(cycl_utilities.formula_operator(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject function_rule_index_asent_p(final SubLObject asent) {
        if ($$termOfUnit.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) {
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return makeBoolean((NIL != possibly_naut_p(arg2)) && (NIL != forts.fort_p(cycl_utilities.formula_operator(arg2))));
        }
        return NIL;
    }

    public static SubLObject exception_rule_index_asent_match_p(final SubLObject asent, final SubLObject rule) {
        return makeBoolean((NIL != exception_rule_index_asent_p(asent)) && rule.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject exception_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(($$abnormal.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) && (NIL != assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject pragma_rule_index_asent_match_p(final SubLObject asent, final SubLObject rule) {
        return makeBoolean((NIL != pragma_rule_index_asent_p(asent)) && rule.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject pragma_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(($$meetsPragmaticRequirement.eql(cycl_utilities.atomic_sentence_predicate(asent)) && (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED))) && (NIL != assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static SubLObject unbound_predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject dummy) {
        return unbound_predicate_rule_index_asent_p(asent);
    }

    public static SubLObject unbound_predicate_rule_index_asent_p(final SubLObject asent) {
        return makeBoolean(NIL == variables.fully_bound_p(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    public static SubLObject mt_index_assertion_match_p(final SubLObject assertion, final SubLObject mt) {
        return hlmt.hlmt_equalP(mt, assertions_high.assertion_mt(assertion));
    }

    public static SubLObject do_hlmts_with_monadic_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list372);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hlmt_var = NIL;
        SubLObject monad = NIL;
        destructuring_bind_must_consp(current, datum, $list372);
        hlmt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list372);
        monad = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$52 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list372);
            current_$52 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list372);
            if (NIL == member(current_$52, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$52 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list372);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject hlmts_seen_so_far = $sym373$HLMTS_SEEN_SO_FAR;
        final SubLObject assertion = $sym374$ASSERTION;
        final SubLObject monad_var = $sym375$MONAD_VAR;
        return list(PROGN, list(CLET, list(list(monad_var, monad), bq_cons(hlmts_seen_so_far, $list376)), listS(CLET, list(list(hlmt_var, monad)), append(body, NIL)), list(WITH_INFERENCE_MT_RELEVANCE, listS(LIST, $$MtSpace, monad_var, $list380), list(DO_OVERLAP_INDEX, list(assertion, list(LIST, monad_var), $DONE, done), list(CLET, list(list(hlmt_var, list(ASSERTION_MT, assertion))), list(PWHEN, list(HLMT_EQUAL, monad_var, list(HLMT_MONAD_MT, hlmt_var)), list(PUNLESS, list($sym384$SET_MEMBER_, hlmt_var, hlmts_seen_so_far), listS(PROGN, list(SET_ADD, hlmt_var, hlmts_seen_so_far), append(body, NIL)))))))));
    }

    public static SubLObject declare_kb_mapping_macros_file() {
        declareMacro(me, "pwhen_predicate_is_relevant", "PWHEN-PREDICATE-IS-RELEVANT");
        declareMacro(me, "pwhen_mt_is_relevant", "PWHEN-MT-IS-RELEVANT");
        declareMacro(me, "pwhen_truth_relevant", "PWHEN-TRUTH-RELEVANT");
        declareFunction(me, "truth_relevant_p", "TRUTH-RELEVANT-P", 2, 0, false);
        declareMacro(me, "pwhen_assertion_has_truth", "PWHEN-ASSERTION-HAS-TRUTH");
        declareMacro(me, "pwhen_assertion_has_direction_spec", "PWHEN-ASSERTION-HAS-DIRECTION-SPEC");
        declareFunction(me, "direction_spec_p", "DIRECTION-SPEC-P", 1, 0, false);
        declareFunction(me, "assertion_has_direction_spec", "ASSERTION-HAS-DIRECTION-SPEC", 2, 0, false);
        declareMacro(me, "do_assertion_list", "DO-ASSERTION-LIST");
        declareMacro(me, "do_simple_index", "DO-SIMPLE-INDEX");
        declareMacro(me, "pwhen_assertion_has_type", "PWHEN-ASSERTION-HAS-TYPE");
        declareMacro(me, "some_assertions", "SOME-ASSERTIONS");
        declareMacro(me, "some_assertions_internal", "SOME-ASSERTIONS-INTERNAL");
        declareMacro(me, "do_final_index_from_spec", "DO-FINAL-INDEX-FROM-SPEC");
        declareMacro(me, "do_gaf_arg_index", "DO-GAF-ARG-INDEX");
        declareMacro(me, "do_gaf_arg_index_formulas", "DO-GAF-ARG-INDEX-FORMULAS");
        declareMacro(me, "do_gaf_arg_index_values", "DO-GAF-ARG-INDEX-VALUES");
        declareFunction(me, "do_gaf_arg_index_key_validator", "DO-GAF-ARG-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_gaf_arg_final_index_spec_iterator", "NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareFunction(me, "initialize_gaf_arg_final_index_spec_iterator_state", "INITIALIZE-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_term", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_predicate", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_note", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_argnum_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "set_gaf_arg_final_index_spec_iterator_state_note", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_gaf_arg_final_index_spec_iterator_state_argnum_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false);
        declareFunction(me, "set_gaf_arg_final_index_spec_iterator_state_predicate_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 2, 0, false);
        declareFunction(me, "set_gaf_arg_final_index_spec_iterator_state_mt_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_current_argnum_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_current_predicate_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-PREDICATE-KEY", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_state_current_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "gaf_arg_current_keylist", "GAF-ARG-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_doneP", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new kb_mapping_macros.$gaf_arg_final_index_spec_iterator_doneP$UnaryFunction();
        declareFunction(me, "gaf_arg_final_index_spec_iterator_next", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new kb_mapping_macros.$gaf_arg_final_index_spec_iterator_next$UnaryFunction();
        declareFunction(me, "gaf_arg_final_index_spec_iterator_quiesce", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "gaf_arg_keylist_to_final_index_spec", "GAF-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "gaf_arg_current_relevant_keylist", "GAF-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_quiesce_one_step", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_refill_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-PREDICATE-KEYS", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_refill_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        declareFunction(me, "gaf_arg_final_index_spec_iterator_next_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false);
        declareMacro(me, "do_predicate_extent_index", "DO-PREDICATE-EXTENT-INDEX");
        declareMacro(me, "do_predicate_extent_index_formulas", "DO-PREDICATE-EXTENT-INDEX-FORMULAS");
        declareMacro(me, "do_predicate_extent_index_values", "DO-PREDICATE-EXTENT-INDEX-VALUES");
        declareFunction(me, "do_predicate_extent_index_key_validator", "DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false);
        declareFunction(me, "new_predicate_extent_final_index_spec_iterator", "NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR", 1, 0, false);
        declareFunction(me, "initialize_predicate_extent_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "predicate_extent_final_index_spec_iterator_state_predicate", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        declareFunction(me, "predicate_extent_final_index_spec_iterator_state_mt_keys", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "set_predicate_extent_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "predicate_extent_final_index_spec_iterator_state_current_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "predicate_extent_current_keylist", "PREDICATE-EXTENT-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "predicate_extent_final_index_spec_iterator_doneP", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new kb_mapping_macros.$predicate_extent_final_index_spec_iterator_doneP$UnaryFunction();
        declareFunction(me, "predicate_extent_final_index_spec_iterator_next", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new kb_mapping_macros.$predicate_extent_final_index_spec_iterator_next$UnaryFunction();
        declareFunction(me, "predicate_extent_final_index_spec_iterator_quiesce", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "predicate_extent_keylist_to_final_index_spec", "PREDICATE-EXTENT-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "predicate_extent_current_relevant_keylist", "PREDICATE-EXTENT-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "predicate_extent_final_index_spec_iterator_quiesce_one_step", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "predicate_extent_final_index_spec_iterator_next_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false);
        declareMacro(me, "do_nart_arg_index", "DO-NART-ARG-INDEX");
        declareFunction(me, "do_nart_arg_index_key_validator", "DO-NART-ARG-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_nart_arg_final_index_spec_iterator", "NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareFunction(me, "initialize_nart_arg_final_index_spec_iterator_state", "INITIALIZE-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_term", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_function", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_note", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_argnum_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 1, 0, false);
        declareFunction(me, "set_nart_arg_final_index_spec_iterator_state_note", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_nart_arg_final_index_spec_iterator_state_argnum_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false);
        declareFunction(me, "set_nart_arg_final_index_spec_iterator_state_function_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 2, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_current_argnum_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_state_current_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-FUNCTION-KEY", 1, 0, false);
        declareFunction(me, "nart_arg_current_keylist", "NART-ARG-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_doneP", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new kb_mapping_macros.$nart_arg_final_index_spec_iterator_doneP$UnaryFunction();
        declareFunction(me, "nart_arg_final_index_spec_iterator_next", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new kb_mapping_macros.$nart_arg_final_index_spec_iterator_next$UnaryFunction();
        declareFunction(me, "nart_arg_final_index_spec_iterator_quiesce", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "nart_arg_keylist_to_final_index_spec", "NART-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "nart_arg_current_relevant_keylist", "NART-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_quiesce_one_step", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_refill_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-FUNCTION-KEYS", 1, 0, false);
        declareFunction(me, "nart_arg_final_index_spec_iterator_next_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-FUNCTION-KEY", 1, 0, false);
        declareMacro(me, "do_function_extent_index", "DO-FUNCTION-EXTENT-INDEX");
        declareFunction(me, "do_function_extent_index_key_validator", "DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false);
        declareMacro(me, "do_function_narts", "DO-FUNCTION-NARTS");
        declareFunction(me, "function_extent_final_index_spec", "FUNCTION-EXTENT-FINAL-INDEX-SPEC", 1, 0, false);
        declareMacro(me, "do_consequent_rules", "DO-CONSEQUENT-RULES");
        declareMacro(me, "do_antecedent_rules", "DO-ANTECEDENT-RULES");
        declareMacro(me, "do_predicate_rule_index", "DO-PREDICATE-RULE-INDEX");
        declareFunction(me, "do_predicate_rule_index_key_validator", "DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_predicate_rule_final_index_spec_iterator", "NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareFunction(me, "initialize_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_predicate", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_direction", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_note", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_sense_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "set_predicate_rule_final_index_spec_iterator_state_note", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        declareFunction(me, "set_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "set_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_current_sense_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_current_mt_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_state_current_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "predicate_rule_current_keylist", "PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_doneP", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new kb_mapping_macros.$predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
        declareFunction(me, "predicate_rule_final_index_spec_iterator_next", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new kb_mapping_macros.$predicate_rule_final_index_spec_iterator_next$UnaryFunction();
        declareFunction(me, "predicate_rule_final_index_spec_iterator_quiesce", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "predicate_rule_keylist_to_final_index_spec", "PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "predicate_rule_current_relevant_keylist", "PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_quiesce_one_step", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_refill_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_refill_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "predicate_rule_final_index_spec_iterator_next_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareMacro(me, "do_decontextualized_ist_predicate_rule_index", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        declareFunction(me, "do_decontextualized_ist_predicate_rule_index_key_validator", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_decontextualized_ist_predicate_rule_final_index_spec_iterator", "NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareFunction(me, "initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        declareFunction(me, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_current_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new kb_mapping_macros.$decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_next", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new kb_mapping_macros.$decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction();
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_keylist_to_final_index_spec", "DECONTEXTUALIZED-IST-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_current_relevant_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareMacro(me, "do_isa_rule_index", "DO-ISA-RULE-INDEX");
        declareFunction(me, "do_isa_rule_index_key_validator", "DO-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_isa_rule_final_index_spec_iterator", "NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareMacro(me, "do_quoted_isa_rule_index", "DO-QUOTED-ISA-RULE-INDEX");
        declareFunction(me, "do_quoted_isa_rule_index_key_validator", "DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_quoted_isa_rule_final_index_spec_iterator", "NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareMacro(me, "do_genls_rule_index", "DO-GENLS-RULE-INDEX");
        declareFunction(me, "do_genls_rule_index_key_validator", "DO-GENLS-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_genls_rule_final_index_spec_iterator", "NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareMacro(me, "do_genl_mt_rule_index", "DO-GENL-MT-RULE-INDEX");
        declareFunction(me, "do_genl_mt_rule_index_key_validator", "DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "new_genl_mt_rule_final_index_spec_iterator", "NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        declareFunction(me, "do_pred_arg2_rule_index_key_validator", "DO-PRED-ARG2-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        declareFunction(me, "initialize_pred_arg2_rule_final_index_spec_iterator_state", "INITIALIZE-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 5, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_arg2", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-ARG2", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_direction", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_note", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_pred", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PRED", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_top_level_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-TOP-LEVEL-KEY", 1, 0, false);
        declareFunction(me, "set_pred_arg2_rule_final_index_spec_iterator_state_note", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        declareFunction(me, "set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_current_sense_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_current_mt_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_state_current_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_current_keylist", "PRED-ARG2-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_doneP", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new kb_mapping_macros.$pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction();
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_next", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new kb_mapping_macros.$pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction();
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_quiesce", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_keylist_to_final_index_spec", "PRED-ARG2-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 3, 0, false);
        declareFunction(me, "pred_arg2_rule_current_relevant_keylist", "PRED-ARG2-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_quiesce_one_step", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_refill_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_refill_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "pred_arg2_rule_final_index_spec_iterator_next_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "key_pred_arg2_rule_index", "KEY-PRED-ARG2-RULE-INDEX", 2, 2, false);
        declareMacro(me, "do_function_rule_index", "DO-FUNCTION-RULE-INDEX");
        declareFunction(me, "do_function_rule_index_key_validator", "DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "new_function_rule_final_index_spec_iterator", "NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
        declareFunction(me, "initialize_function_rule_final_index_spec_iterator_state", "INITIALIZE-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_func", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNC", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_direction", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_note", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_mt_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "set_function_rule_final_index_spec_iterator_state_note", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_function_rule_final_index_spec_iterator_state_mt_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "set_function_rule_final_index_spec_iterator_state_direction_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_current_mt_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_state_current_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "function_rule_current_keylist", "FUNCTION-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_doneP", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_next", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_quiesce", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "function_rule_keylist_to_final_index_spec", "FUNCTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "function_rule_current_relevant_keylist", "FUNCTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_quiesce_one_step", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_refill_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "function_rule_final_index_spec_iterator_next_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareMacro(me, "do_exception_rule_index", "DO-EXCEPTION-RULE-INDEX");
        declareFunction(me, "do_exception_rule_index_key_validator", "DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "new_exception_rule_final_index_spec_iterator", "NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
        declareFunction(me, "initialize_exception_rule_final_index_spec_iterator_state", "INITIALIZE-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_rule", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_direction", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_note", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_mt_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "set_exception_rule_final_index_spec_iterator_state_note", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_exception_rule_final_index_spec_iterator_state_mt_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "set_exception_rule_final_index_spec_iterator_state_direction_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_current_mt_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_state_current_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "exception_rule_current_keylist", "EXCEPTION-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_doneP", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_next", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_quiesce", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "exception_rule_keylist_to_final_index_spec", "EXCEPTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "exception_rule_current_relevant_keylist", "EXCEPTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_quiesce_one_step", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_refill_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "exception_rule_final_index_spec_iterator_next_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareMacro(me, "do_pragma_rule_index", "DO-PRAGMA-RULE-INDEX");
        declareFunction(me, "do_pragma_rule_index_key_validator", "DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "new_pragma_rule_final_index_spec_iterator", "NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
        declareFunction(me, "initialize_pragma_rule_final_index_spec_iterator_state", "INITIALIZE-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_rule", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_direction", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_note", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_mt_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "set_pragma_rule_final_index_spec_iterator_state_note", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_pragma_rule_final_index_spec_iterator_state_mt_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "set_pragma_rule_final_index_spec_iterator_state_direction_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_current_mt_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_state_current_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "pragma_rule_current_keylist", "PRAGMA-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_doneP", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_next", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_quiesce", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "pragma_rule_keylist_to_final_index_spec", "PRAGMA-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "pragma_rule_current_relevant_keylist", "PRAGMA-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_quiesce_one_step", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_refill_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "pragma_rule_final_index_spec_iterator_next_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareMacro(me, "do_unbound_predicate_rule_index", "DO-UNBOUND-PREDICATE-RULE-INDEX");
        declareFunction(me, "do_unbound_predicate_rule_index_key_validator", "DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "new_unbound_predicate_rule_final_index_spec_iterator", "NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 0, 2, false);
        declareFunction(me, "initialize_unbound_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_direction", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_note", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "set_unbound_predicate_rule_final_index_spec_iterator_state_note", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        declareFunction(me, "set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        declareFunction(me, "set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        declareFunction(me, "set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_current_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_doneP", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_next", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_quiesce", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_keylist_to_final_index_spec", "UNBOUND-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_current_relevant_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_final_index_spec_iterator_next_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        declareMacro(me, "do_mt_index", "DO-MT-INDEX");
        declareFunction(me, "do_mt_index_key_validator", "DO-MT-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "mt_final_index_spec", "MT-FINAL-INDEX-SPEC", 1, 0, false);
        declareMacro(me, "do_other_index", "DO-OTHER-INDEX");
        declareFunction(me, "do_other_index_key_validator", "DO-OTHER-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "other_final_index_spec", "OTHER-FINAL-INDEX-SPEC", 1, 0, false);
        declareFunction(me, "other_final_index_spec_p", "OTHER-FINAL-INDEX-SPEC-P", 1, 0, false);
        declareFunction(me, "other_simple_final_index_spec_p", "OTHER-SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false);
        declareFunction(me, "other_complex_final_index_spec_p", "OTHER-COMPLEX-FINAL-INDEX-SPEC-P", 1, 0, false);
        declareFunction(me, "other_index_assertion_match_p", "OTHER-INDEX-ASSERTION-MATCH-P", 2, 0, false);
        new kb_mapping_macros.$other_index_assertion_match_p$BinaryFunction();
        declareFunction(me, "do_other_index_assertion_match_p", "DO-OTHER-INDEX-ASSERTION-MATCH-P", 1, 0, false);
        declareMacro(me, "do_term_index", "DO-TERM-INDEX");
        declareFunction(me, "do_term_index_key_validator", "DO-TERM-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "new_term_final_index_spec_iterator", "NEW-TERM-FINAL-INDEX-SPEC-ITERATOR", 2, 0, false);
        declareFunction(me, "do_term_index_assertion_match_p", "DO-TERM-INDEX-ASSERTION-MATCH-P", 2, 0, false);
        declareMacro(me, "do_broad_mt_index", "DO-BROAD-MT-INDEX");
        declareFunction(me, "do_broad_mt_index_key_validator", "DO-BROAD-MT-INDEX-KEY-VALIDATOR", 2, 0, false);
        declareFunction(me, "do_broad_mt_index_match_p", "DO-BROAD-MT-INDEX-MATCH-P", 4, 0, false);
        declareMacro(me, "do_hlmt_contents", "DO-HLMT-CONTENTS");
        declareMacro(me, "do_mt_contents", "DO-MT-CONTENTS");
        declareFunction(me, "do_mt_contents_method", "DO-MT-CONTENTS-METHOD", 1, 0, false);
        declareMacro(me, "do_overlap_index", "DO-OVERLAP-INDEX");
        declareMacro(me, "do_gafs_potentially_matching_formula", "DO-GAFS-POTENTIALLY-MATCHING-FORMULA");
        declareMacro(me, "do_best_gaf_lookup_index", "DO-BEST-GAF-LOOKUP-INDEX");
        declareMacro(me, "do_gaf_lookup_index", "DO-GAF-LOOKUP-INDEX");
        declareFunction(me, "do_gli_extract_method", "DO-GLI-EXTRACT-METHOD", 1, 0, false);
        declareFunction(me, "do_gli_method_error", "DO-GLI-METHOD-ERROR", 2, 0, false);
        declareMacro(me, "do_gli_via_gaf_arg", "DO-GLI-VIA-GAF-ARG");
        declareFunction(me, "do_gli_vga_extract_keys", "DO-GLI-VGA-EXTRACT-KEYS", 1, 0, false);
        declareMacro(me, "do_gli_via_predicate_extent", "DO-GLI-VIA-PREDICATE-EXTENT");
        declareFunction(me, "do_gli_vpe_extract_key", "DO-GLI-VPE-EXTRACT-KEY", 1, 0, false);
        declareMacro(me, "do_gli_via_overlap", "DO-GLI-VIA-OVERLAP");
        declareFunction(me, "do_gli_vo_extract_key", "DO-GLI-VO-EXTRACT-KEY", 1, 0, false);
        declareMacro(me, "do_narts_potentially_matching_formula", "DO-NARTS-POTENTIALLY-MATCHING-FORMULA");
        declareMacro(me, "do_term_of_unit_assertions_potentially_matching_nat_formula", "DO-TERM-OF-UNIT-ASSERTIONS-POTENTIALLY-MATCHING-NAT-FORMULA");
        declareMacro(me, "do_best_nat_lookup_index", "DO-BEST-NAT-LOOKUP-INDEX");
        declareMacro(me, "do_nat_lookup_index", "DO-NAT-LOOKUP-INDEX");
        declareFunction(me, "do_nli_extract_method", "DO-NLI-EXTRACT-METHOD", 1, 0, false);
        declareFunction(me, "do_nli_method_error", "DO-NLI-METHOD-ERROR", 2, 0, false);
        declareMacro(me, "do_nli_via_nart_arg", "DO-NLI-VIA-NART-ARG");
        declareFunction(me, "do_nli_vna_extract_keys", "DO-NLI-VNA-EXTRACT-KEYS", 1, 0, false);
        declareMacro(me, "do_nli_via_function_extent", "DO-NLI-VIA-FUNCTION-EXTENT");
        declareFunction(me, "do_nli_vfe_extract_key", "DO-NLI-VFE-EXTRACT-KEY", 1, 0, false);
        declareMacro(me, "do_nli_via_overlap", "DO-NLI-VIA-OVERLAP");
        declareFunction(me, "do_nli_vo_extract_key", "DO-NLI-VO-EXTRACT-KEY", 1, 0, false);
        declareFunction(me, "simple_final_index_spec_p", "SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false);
        declareFunction(me, "simple_final_index_spec_term", "SIMPLE-FINAL-INDEX-SPEC-TERM", 1, 0, false);
        declareFunction(me, "new_final_index_iterator", "NEW-FINAL-INDEX-ITERATOR", 1, 3, false);
        declareFunction(me, "assertion_semantically_matches_simple_final_index_specP", "ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false);
        new kb_mapping_macros.$assertion_semantically_matches_simple_final_index_specP$BinaryFunction();
        declareFunction(me, "destroy_final_index_iterator", "DESTROY-FINAL-INDEX-ITERATOR", 1, 0, false);
        declareMacro(me, "do_assertions_with_same_assertion_formula", "DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA");
        declareMacro(me, "new_do_assertions_with_same_assertion_formula", "NEW-DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA");
        declareFunction(me, "new_assertions_with_same_assertion_formula_iterator", "NEW-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-ITERATOR", 1, 0, false);
        declareFunction(me, "assertions_with_same_assertion_formula_p", "ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-P", 2, 0, false);
        declareFunction(me, "final_index_iterator_filtered", "FINAL-INDEX-ITERATOR-FILTERED", 4, 0, false);
        declareFunction(me, "new_gaf_simple_final_index_spec", "NEW-GAF-SIMPLE-FINAL-INDEX-SPEC", 4, 0, false);
        declareFunction(me, "new_nart_simple_final_index_spec", "NEW-NART-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false);
        declareFunction(me, "new_rule_simple_final_index_spec", "NEW-RULE-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false);
        declareFunction(me, "new_assertion_simple_final_index_spec", "NEW-ASSERTION-SIMPLE-FINAL-INDEX-SPEC", 2, 0, false);
        declareFunction(me, "clear_simple_term_assertion_list_filtered", "CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 0, 0, false);
        new kb_mapping_macros.$clear_simple_term_assertion_list_filtered$ZeroArityFunction();
        declareFunction(me, "remove_simple_term_assertion_list_filtered", "REMOVE-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false);
        declareFunction(me, "simple_term_assertion_list_filtered_internal", "SIMPLE-TERM-ASSERTION-LIST-FILTERED-INTERNAL", 4, 0, false);
        declareFunction(me, "simple_term_assertion_list_filtered", "SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false);
        declareFunction(me, "assertion_syntactically_matches_simple_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false);
        declareFunction(me, "assertion_matches_syntactic_indexing_typeP", "ASSERTION-MATCHES-SYNTACTIC-INDEXING-TYPE?", 2, 0, false);
        declareFunction(me, "gaf_syntactically_matches_simple_gaf_final_index_specP", "GAF-SYNTACTICALLY-MATCHES-SIMPLE-GAF-FINAL-INDEX-SPEC?", 3, 0, false);
        declareFunction(me, "gaf_matches_simple_argnum_specP", "GAF-MATCHES-SIMPLE-ARGNUM-SPEC?", 3, 0, false);
        declareFunction(me, "tou_syntactically_matches_simple_nart_final_index_specP", "TOU-SYNTACTICALLY-MATCHES-SIMPLE-NART-FINAL-INDEX-SPEC?", 3, 0, false);
        declareFunction(me, "rule_syntactically_matches_simple_rule_final_index_specP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false);
        declareFunction(me, "rule_syntactically_matches_simple_rule_final_index_spec_intP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC-INT?", 4, 0, false);
        declareFunction(me, "asent_syntactically_matches_simple_rule_final_index_specP", "ASENT-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false);
        declareFunction(me, "assertion_syntactically_matches_simple_assertion_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-ASSERTION-FINAL-INDEX-SPEC?", 3, 0, false);
        declareFunction(me, "predicate_rule_index_asent_match_p", "PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "predicate_rule_index_asent_p", "PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "decontextualized_ist_predicate_rule_index_asent_match_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        new kb_mapping_macros.$decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction();
        declareFunction(me, "decontextualized_ist_predicate_rule_index_asent_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "isa_rule_index_asent_match_p", "ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "quoted_isa_rule_index_asent_match_p", "QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "isa_rule_index_asent_p", "ISA-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "quoted_isa_rule_index_asent_p", "QUOTED-ISA-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "genls_rule_index_asent_match_p", "GENLS-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "genls_rule_index_asent_p", "GENLS-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "genl_mt_rule_index_asent_match_p", "GENL-MT-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "genl_mt_rule_index_asent_p", "GENL-MT-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "function_rule_index_asent_match_p", "FUNCTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "function_rule_index_asent_p", "FUNCTION-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "exception_rule_index_asent_match_p", "EXCEPTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "exception_rule_index_asent_p", "EXCEPTION-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "pragma_rule_index_asent_match_p", "PRAGMA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "pragma_rule_index_asent_p", "PRAGMA-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "unbound_predicate_rule_index_asent_match_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        declareFunction(me, "unbound_predicate_rule_index_asent_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
        declareFunction(me, "mt_index_assertion_match_p", "MT-INDEX-ASSERTION-MATCH-P", 2, 0, false);
        declareMacro(me, "do_hlmts_with_monadic_mt", "DO-HLMTS-WITH-MONADIC-MT");
        return NIL;
    }

    public static SubLObject init_kb_mapping_macros_file() {
        deflexical("*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_mapping_macros_file() {
        register_macro_helper(TRUTH_RELEVANT_P, PWHEN_TRUTH_RELEVANT);
        register_macro_helper(SOME_ASSERTIONS_INTERNAL, SOME_ASSERTIONS);
        register_macro_helper(DO_FINAL_INDEX_FROM_SPEC, $list44);
        register_cyc_api_macro(DO_GAF_ARG_INDEX, $list53, $str62$Iterate_over_an_index_of_gaf_asse);
        register_cyc_api_macro(DO_GAF_ARG_INDEX_FORMULAS, $list63, $str67$Iterate_over_an_index_of_gaf_asse);
        register_macro_helper(DO_GAF_ARG_INDEX_KEY_VALIDATOR, DO_GAF_ARG_INDEX);
        register_macro_helper(NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, DO_GAF_ARG_INDEX);
        register_macro_helper(DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, DO_PREDICATE_EXTENT_INDEX);
        register_macro_helper(NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, DO_PREDICATE_EXTENT_INDEX);
        register_macro_helper(DO_NART_ARG_INDEX_KEY_VALIDATOR, DO_NART_ARG_INDEX);
        register_macro_helper(NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, DO_NART_ARG_INDEX);
        register_macro_helper(DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, DO_FUNCTION_EXTENT_INDEX);
        register_macro_helper(FUNCTION_EXTENT_FINAL_INDEX_SPEC, DO_FUNCTION_EXTENT_INDEX);
        register_macro_helper(DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, DO_PREDICATE_RULE_INDEX);
        register_macro_helper(NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_PREDICATE_RULE_INDEX);
        register_macro_helper(DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX);
        register_macro_helper(NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX);
        register_macro_helper(DO_ISA_RULE_INDEX_KEY_VALIDATOR, DO_ISA_RULE_INDEX);
        register_macro_helper(NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_ISA_RULE_INDEX);
        register_macro_helper(DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, DO_QUOTED_ISA_RULE_INDEX);
        register_macro_helper(NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_QUOTED_ISA_RULE_INDEX);
        register_macro_helper(DO_GENLS_RULE_INDEX_KEY_VALIDATOR, DO_GENLS_RULE_INDEX);
        register_macro_helper(NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_GENLS_RULE_INDEX);
        register_macro_helper(DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, DO_GENL_MT_RULE_INDEX);
        register_macro_helper(NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_GENL_MT_RULE_INDEX);
        register_macro_helper(DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, DO_FUNCTION_RULE_INDEX);
        register_macro_helper(NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_FUNCTION_RULE_INDEX);
        register_macro_helper(DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, DO_EXCEPTION_RULE_INDEX);
        register_macro_helper(NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_EXCEPTION_RULE_INDEX);
        register_macro_helper(DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, DO_PRAGMA_RULE_INDEX);
        register_macro_helper(NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_PRAGMA_RULE_INDEX);
        register_macro_helper(DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, DO_UNBOUND_PREDICATE_RULE_INDEX);
        register_macro_helper(NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, DO_UNBOUND_PREDICATE_RULE_INDEX);
        register_macro_helper(DO_MT_INDEX_KEY_VALIDATOR, DO_MT_INDEX);
        register_macro_helper(MT_FINAL_INDEX_SPEC, DO_MT_INDEX);
        register_macro_helper(DO_OTHER_INDEX_KEY_VALIDATOR, DO_OTHER_INDEX);
        register_macro_helper(OTHER_FINAL_INDEX_SPEC, DO_OTHER_INDEX);
        register_macro_helper(OTHER_FINAL_INDEX_SPEC_P, DO_TERM_INDEX);
        register_macro_helper(DO_OTHER_INDEX_ASSERTION_MATCH_P, DO_OTHER_INDEX);
        register_cyc_api_macro(DO_TERM_INDEX, $list230, $str246$Iterate_over_all_assertions_index);
        register_macro_helper(DO_TERM_INDEX_KEY_VALIDATOR, DO_TERM_INDEX);
        register_macro_helper(NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, DO_TERM_INDEX);
        register_macro_helper(DO_TERM_INDEX_ASSERTION_MATCH_P, DO_TERM_INDEX);
        register_macro_helper(DO_BROAD_MT_INDEX_KEY_VALIDATOR, DO_BROAD_MT_INDEX);
        register_macro_helper(DO_BROAD_MT_INDEX_MATCH_P, DO_BROAD_MT_INDEX);
        register_macro_helper(DO_MT_CONTENTS_METHOD, DO_MT_CONTENTS);
        register_macro_helper(DO_GLI_EXTRACT_METHOD, DO_GAF_LOOKUP_INDEX);
        register_macro_helper(DO_GLI_METHOD_ERROR, DO_GAF_LOOKUP_INDEX);
        register_macro_helper(DO_GLI_VIA_GAF_ARG, DO_GAF_LOOKUP_INDEX);
        register_macro_helper(DO_GLI_VGA_EXTRACT_KEYS, DO_GLI_VIA_GAF_ARG);
        register_macro_helper(DO_GLI_VIA_PREDICATE_EXTENT, DO_GAF_LOOKUP_INDEX);
        register_macro_helper(DO_GLI_VPE_EXTRACT_KEY, DO_GLI_VIA_PREDICATE_EXTENT);
        register_macro_helper(DO_GLI_VIA_OVERLAP, DO_GAF_LOOKUP_INDEX);
        register_macro_helper(DO_GLI_VO_EXTRACT_KEY, DO_GLI_VIA_OVERLAP);
        register_macro_helper(DO_NLI_EXTRACT_METHOD, DO_NAT_LOOKUP_INDEX);
        register_macro_helper(DO_NLI_METHOD_ERROR, DO_NAT_LOOKUP_INDEX);
        register_macro_helper(DO_NLI_VIA_NART_ARG, DO_NAT_LOOKUP_INDEX);
        register_macro_helper(DO_NLI_VNA_EXTRACT_KEYS, DO_NLI_VIA_NART_ARG);
        register_macro_helper(DO_NLI_VIA_FUNCTION_EXTENT, DO_NAT_LOOKUP_INDEX);
        register_macro_helper(DO_NLI_VFE_EXTRACT_KEY, DO_NLI_VIA_FUNCTION_EXTENT);
        register_macro_helper(DO_NLI_VIA_OVERLAP, DO_NAT_LOOKUP_INDEX);
        register_macro_helper(DO_NLI_VO_EXTRACT_KEY, DO_NLI_VIA_OVERLAP);
        register_macro_helper(NEW_FINAL_INDEX_ITERATOR, DO_FINAL_INDEX_FROM_SPEC);
        register_macro_helper(DESTROY_FINAL_INDEX_ITERATOR, DO_FINAL_INDEX_FROM_SPEC);
        register_macro_helper(NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR, NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA);
        memoization_state.note_globally_cached_function(SIMPLE_TERM_ASSERTION_LIST_FILTERED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_mapping_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_mapping_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_mapping_macros_file();
    }

    static {




































































































































































































































































































































































































    }

    public static final class $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gaf_arg_final_index_spec_iterator_doneP(arg1);
        }
    }

    public static final class $gaf_arg_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
        public $gaf_arg_final_index_spec_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gaf_arg_final_index_spec_iterator_next(arg1);
        }
    }

    public static final class $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return predicate_extent_final_index_spec_iterator_doneP(arg1);
        }
    }

    public static final class $predicate_extent_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
        public $predicate_extent_final_index_spec_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return predicate_extent_final_index_spec_iterator_next(arg1);
        }
    }

    public static final class $nart_arg_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $nart_arg_final_index_spec_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nart_arg_final_index_spec_iterator_doneP(arg1);
        }
    }

    public static final class $nart_arg_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
        public $nart_arg_final_index_spec_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nart_arg_final_index_spec_iterator_next(arg1);
        }
    }

    public static final class $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return predicate_rule_final_index_spec_iterator_doneP(arg1);
        }
    }

    public static final class $predicate_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
        public $predicate_rule_final_index_spec_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return predicate_rule_final_index_spec_iterator_next(arg1);
        }
    }

    public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(arg1);
        }
    }

    public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
        public $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return decontextualized_ist_predicate_rule_final_index_spec_iterator_next(arg1);
        }
    }

    public static final class $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pred_arg2_rule_final_index_spec_iterator_doneP(arg1);
        }
    }

    public static final class $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
        public $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pred_arg2_rule_final_index_spec_iterator_next(arg1);
        }
    }

    public static final class $other_index_assertion_match_p$BinaryFunction extends BinaryFunction {
        public $other_index_assertion_match_p$BinaryFunction() {
            super(extractFunctionNamed("OTHER-INDEX-ASSERTION-MATCH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return other_index_assertion_match_p(arg1, arg2);
        }
    }

    public static final class $assertion_semantically_matches_simple_final_index_specP$BinaryFunction extends BinaryFunction {
        public $assertion_semantically_matches_simple_final_index_specP$BinaryFunction() {
            super(extractFunctionNamed("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return assertion_semantically_matches_simple_final_index_specP(arg1, arg2);
        }
    }

    public static final class $clear_simple_term_assertion_list_filtered$ZeroArityFunction extends ZeroArityFunction {
        public $clear_simple_term_assertion_list_filtered$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED"));
        }

        @Override
        public SubLObject processItem() {
            return clear_simple_term_assertion_list_filtered();
        }
    }

    public static final class $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction extends BinaryFunction {
        public $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction() {
            super(extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return decontextualized_ist_predicate_rule_index_asent_match_p(arg1, arg2);
        }
    }
}

/**
 * Total time: 1982 ms
 */
