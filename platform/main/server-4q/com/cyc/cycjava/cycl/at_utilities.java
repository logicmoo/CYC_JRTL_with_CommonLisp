package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.at_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class at_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new at_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.at_utilities";

    public static final String myFingerPrint = "d5b0a893604debad6bce6048aca9885771d56db3ce95c6fc120f4b9049a0a785";







    // defparameter
    /**
     * max number of mts that will be considered while trying to suggest mts in
     * which non-wf formula might be wf
     */
    private static final SubLSymbol $mts_cutoff_for_mts_accommodating_formula_wrt_types$ = makeSymbol("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*");

    // defparameter
    private static final SubLSymbol $max_floor_mts_of_nat_exceptions$ = makeSymbol("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*");



    // defparameter
    private static final SubLSymbol $max_floor_mts_of_nat_recursionP$ = makeSymbol("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*");

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLObject $$arg3Isa = reader_make_constant_shell(makeString("arg3Isa"));

    private static final SubLObject $$arg4Isa = reader_make_constant_shell(makeString("arg4Isa"));

    private static final SubLObject $$arg5Isa = reader_make_constant_shell(makeString("arg5Isa"));

    public static final SubLSymbol $generic_arg_store$ = makeSymbol("*GENERIC-ARG-STORE*");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLString $$$ARG = makeString("ARG");

    private static final SubLString $str8$_S = makeString("~S");

    private static final SubLObject $$interArgIsa1_2 = reader_make_constant_shell(makeString("interArgIsa1-2"));

    private static final SubLObject $$interArgIsa1_3 = reader_make_constant_shell(makeString("interArgIsa1-3"));

    private static final SubLObject $$interArgIsa1_4 = reader_make_constant_shell(makeString("interArgIsa1-4"));

    private static final SubLObject $$interArgIsa1_5 = reader_make_constant_shell(makeString("interArgIsa1-5"));

    private static final SubLString $str13$invalid_arg_isa_pred_index___s__s = makeString("invalid arg-isa-pred index: ~s-~s");

    private static final SubLObject $$interArgIsa2_1 = reader_make_constant_shell(makeString("interArgIsa2-1"));

    private static final SubLObject $$interArgIsa2_3 = reader_make_constant_shell(makeString("interArgIsa2-3"));

    private static final SubLObject $$interArgIsa2_4 = reader_make_constant_shell(makeString("interArgIsa2-4"));

    private static final SubLObject $$interArgIsa2_5 = reader_make_constant_shell(makeString("interArgIsa2-5"));

    private static final SubLObject $$interArgIsa3_1 = reader_make_constant_shell(makeString("interArgIsa3-1"));

    private static final SubLObject $$interArgIsa3_2 = reader_make_constant_shell(makeString("interArgIsa3-2"));

    private static final SubLObject $$interArgIsa3_4 = reader_make_constant_shell(makeString("interArgIsa3-4"));

    private static final SubLObject $$interArgIsa3_5 = reader_make_constant_shell(makeString("interArgIsa3-5"));

    private static final SubLObject $$interArgIsa4_1 = reader_make_constant_shell(makeString("interArgIsa4-1"));

    private static final SubLObject $$interArgIsa4_2 = reader_make_constant_shell(makeString("interArgIsa4-2"));

    private static final SubLObject $$interArgIsa4_3 = reader_make_constant_shell(makeString("interArgIsa4-3"));

    private static final SubLObject $$interArgIsa4_5 = reader_make_constant_shell(makeString("interArgIsa4-5"));

    private static final SubLObject $$interArgIsa5_1 = reader_make_constant_shell(makeString("interArgIsa5-1"));

    private static final SubLObject $$interArgIsa5_2 = reader_make_constant_shell(makeString("interArgIsa5-2"));

    private static final SubLObject $$interArgIsa5_3 = reader_make_constant_shell(makeString("interArgIsa5-3"));

    private static final SubLObject $$interArgIsa5_4 = reader_make_constant_shell(makeString("interArgIsa5-4"));

    private static final SubLList $list30 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLObject $$interArgNotIsa1_2 = reader_make_constant_shell(makeString("interArgNotIsa1-2"));

    private static final SubLObject $$interArgNotIsa1_3 = reader_make_constant_shell(makeString("interArgNotIsa1-3"));

    private static final SubLObject $$interArgNotIsa1_4 = reader_make_constant_shell(makeString("interArgNotIsa1-4"));

    private static final SubLObject $$interArgNotIsa1_5 = reader_make_constant_shell(makeString("interArgNotIsa1-5"));

    private static final SubLString $str35$invalid_arg_not_isa_pred_index___ = makeString("invalid arg-not-isa-pred index: ~s-~s");

    private static final SubLObject $$interArgNotIsa2_3 = reader_make_constant_shell(makeString("interArgNotIsa2-3"));

    private static final SubLObject $$interArgNotIsa2_4 = reader_make_constant_shell(makeString("interArgNotIsa2-4"));

    private static final SubLObject $$interArgNotIsa2_5 = reader_make_constant_shell(makeString("interArgNotIsa2-5"));

    private static final SubLObject $$interArgNotIsa3_4 = reader_make_constant_shell(makeString("interArgNotIsa3-4"));

    private static final SubLObject $$interArgNotIsa3_5 = reader_make_constant_shell(makeString("interArgNotIsa3-5"));

    private static final SubLObject $$interArgNotIsa4_5 = reader_make_constant_shell(makeString("interArgNotIsa4-5"));

    private static final SubLObject $$interArgGenl1_2 = reader_make_constant_shell(makeString("interArgGenl1-2"));

    private static final SubLString $str43$invalid_arg_genl_pred_index___s__ = makeString("invalid arg-genl-pred index: ~s-~s");

    private static final SubLObject $$interArgGenl2_1 = reader_make_constant_shell(makeString("interArgGenl2-1"));

    private static final SubLObject $$interArgGenl2_4 = reader_make_constant_shell(makeString("interArgGenl2-4"));

    private static final SubLObject $$interArgNotGenl1_2 = reader_make_constant_shell(makeString("interArgNotGenl1-2"));

    private static final SubLString $str47$invalid_arg_not_genl_pred_index__ = makeString("invalid arg-not-genl-pred index: ~s-~s");

    private static final SubLObject $$interArgIsaGenl1_2 = reader_make_constant_shell(makeString("interArgIsaGenl1-2"));

    private static final SubLString $str49$invalid_arg_isa_genl_pred_index__ = makeString("invalid arg-isa-genl-pred index: ~s-~s");

    private static final SubLObject $$interArgIsaGenl2_1 = reader_make_constant_shell(makeString("interArgIsaGenl2-1"));

    private static final SubLObject $$interArgIsaGenl2_3 = reader_make_constant_shell(makeString("interArgIsaGenl2-3"));

    private static final SubLObject $$interArgIsaGenl3_2 = reader_make_constant_shell(makeString("interArgIsaGenl3-2"));

    private static final SubLString $str53$invalid_arg_genl_isa_pred_index__ = makeString("invalid arg-genl-isa-pred index: ~s-~s");

    private static final SubLObject $$interArgGenlIsa2_1 = reader_make_constant_shell(makeString("interArgGenlIsa2-1"));

    private static final SubLObject $$TruthFunction = reader_make_constant_shell(makeString("TruthFunction"));

    private static final SubLObject $$ArgIsaBinaryPredicate = reader_make_constant_shell(makeString("ArgIsaBinaryPredicate"));

    private static final SubLObject $$ArgIsaTernaryPredicate = reader_make_constant_shell(makeString("ArgIsaTernaryPredicate"));

    private static final SubLObject $$ArgIsaPredicate = reader_make_constant_shell(makeString("ArgIsaPredicate"));

    private static final SubLObject $$ArgGenlBinaryPredicate = reader_make_constant_shell(makeString("ArgGenlBinaryPredicate"));

    private static final SubLObject $$ArgGenlTernaryPredicate = reader_make_constant_shell(makeString("ArgGenlTernaryPredicate"));

    private static final SubLObject $$ArgGenlPredicate = reader_make_constant_shell(makeString("ArgGenlPredicate"));



    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));





    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));



    private static final SubLSymbol TREE_POSITION_P = makeSymbol("TREE-POSITION-P");

    private static final SubLSymbol $sym70$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");



    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    private static final SubLSymbol GATHER_VIA_MAP_PRED_INDEX = makeSymbol("GATHER-VIA-MAP-PRED-INDEX");

    private static final SubLSymbol GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");



    private static final SubLSymbol $some_inter_arg_isa_assertion_somewhere_cache$ = makeSymbol("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str79$Initializing___interArgIsa_cache = makeString("Initializing #$interArgIsa cache");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));











    private static final SubLString $str88$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str93$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str94$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str95$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str96$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $some_inter_arg_format_assertion_somewhere_cache$ = makeSymbol("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*");

    private static final SubLString $str98$Initializing___interArgFormat_cac = makeString("Initializing #$interArgFormat cache");

    private static final SubLObject $$GenericArgTemplate = reader_make_constant_shell(makeString("GenericArgTemplate"));

    private static final SubLObject $$KeywordVariableTemplate = reader_make_constant_shell(makeString("KeywordVariableTemplate"));

    private static final SubLString $str101$got_an_arg_type_predicate___s__th = makeString("got an arg-type predicate (~s) that's neither binary nor ternary in ~s");





    private static final SubLSymbol $AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");

    private static final SubLSymbol AT_ERROR = makeSymbol("AT-ERROR");

    private static final SubLSymbol AT_NOTE = makeSymbol("AT-NOTE");

    private static final SubLString $str107$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s");

    private static final SubLString $str108$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s for arg ~s of reln ~s");





    private static final SubLSymbol $ANTI_SYMMETRIC_PREDICATE = makeKeyword("ANTI-SYMMETRIC-PREDICATE");

    private static final SubLSymbol $ANTI_TRANSITIVE_PREDICATE = makeKeyword("ANTI-TRANSITIVE-PREDICATE");





    private static final SubLString $str115$illegal_value_of__at_mode____s = makeString("illegal value of *at-mode*: ~s");

    private static final SubLSymbol $PREDICATE_ISA_VIOLATION = makeKeyword("PREDICATE-ISA-VIOLATION");

    private static final SubLSymbol $META_PREDICATE_VIOLATION = makeKeyword("META-PREDICATE-VIOLATION");

    private static final SubLSymbol $MAL_ARG_WRT_COL_DEFN = makeKeyword("MAL-ARG-WRT-COL-DEFN");

    private static final SubLObject $$CycLSentence_Assertible = reader_make_constant_shell(makeString("CycLSentence-Assertible"));

    private static final SubLSymbol $MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");



    private static final SubLSymbol $sym122$ASSERTION_ARG_VIOLATION_ = makeSymbol("ASSERTION-ARG-VIOLATION?");

    private static final SubLSymbol $sym123$SEF_VIOLATION_ = makeSymbol("SEF-VIOLATION?");

    private static final SubLSymbol $sym124$PREDICATE_VIOLATION_ = makeSymbol("PREDICATE-VIOLATION?");

    private static final SubLSymbol $MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");

    private static final SubLList $list126 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("ARGNUM"), makeSymbol("COL"), makeSymbol("DEFN"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLSymbol CYC_ASSERTION = makeSymbol("CYC-ASSERTION");

    private static final SubLObject $$CycLAssertion = reader_make_constant_shell(makeString("CycLAssertion"));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");



    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLList $list133 = list(makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));



    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLList $list136 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLList $list137 = list(makeSymbol("PREDICATE"), makeSymbol("ISA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));



    private static final SubLInteger $int$40 = makeInteger(40);



    private static final SubLSymbol $sym141$_ = makeSymbol(">");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    private static final SubLSymbol CACHED_MAX_FLOOR_MTS_OF_NAT = makeSymbol("CACHED-MAX-FLOOR-MTS-OF-NAT");

    private static final SubLSymbol $cached_max_floor_mts_of_nat_caching_state$ = makeSymbol("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*");



    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));



    private static final SubLObject $$Kappa = reader_make_constant_shell(makeString("Kappa"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    private static final SubLString $str151$___S_____S_____s__ = makeString("~&~S~%  ~S~%  ~s~%");

    private static final SubLString $$$mapping_Cyc_arguments = makeString("mapping Cyc arguments");





    private static final SubLObject $$admittedArgument = reader_make_constant_shell(makeString("admittedArgument"));

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));



    private static final SubLObject $const159$AtemporalNecessarilyEssentialColl = reader_make_constant_shell(makeString("AtemporalNecessarilyEssentialCollectionType"));

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLObject $$argGenl = reader_make_constant_shell(makeString("argGenl"));

    private static final SubLSymbol VARIABLE_ARITY_RELATION_P = makeSymbol("VARIABLE-ARITY-RELATION-P");

    private static final SubLObject $$argsIsa = reader_make_constant_shell(makeString("argsIsa"));

    private static final SubLObject $$argsGenl = reader_make_constant_shell(makeString("argsGenl"));

    private static final SubLSymbol RELATION_P = makeSymbol("RELATION-P");





    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list169 = list(reader_make_constant_shell(makeString("Relation")));

    private static final SubLSymbol $sym170$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol VARIABLE_BINDING_SET_ITEM_COMPARATOR = makeSymbol("VARIABLE-BINDING-SET-ITEM-COMPARATOR");



    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLObject $$Number_General = reader_make_constant_shell(makeString("Number-General"));

    private static final SubLSymbol ALL_RELATION_CONSTRAINT_SENTENCES = makeSymbol("ALL-RELATION-CONSTRAINT-SENTENCES");













    private static final SubLList $list182 = list(list(list(reader_make_constant_shell(makeString("isa"))), list(list(reader_make_constant_shell(makeString("arity")), reader_make_constant_shell(makeString("isa")), TWO_INTEGER), list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("isa")), ONE_INTEGER, reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("isa")), TWO_INTEGER, reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("argGenl")), reader_make_constant_shell(makeString("isa")), TWO_INTEGER, reader_make_constant_shell(makeString("Thing"))))), list(list(reader_make_constant_shell(makeString("PlusFn"))), list(list(reader_make_constant_shell(makeString("arityMin")), reader_make_constant_shell(makeString("PlusFn")), ONE_INTEGER), list(reader_make_constant_shell(makeString("argsIsa")), reader_make_constant_shell(makeString("PlusFn")), reader_make_constant_shell(makeString("ScalarInterval"))))), list(list(reader_make_constant_shell(makeString("GramsPerLiter"))), list(list(reader_make_constant_shell(makeString("arityMin")), reader_make_constant_shell(makeString("GramsPerLiter")), ONE_INTEGER), list(reader_make_constant_shell(makeString("arityMax")), reader_make_constant_shell(makeString("GramsPerLiter")), TWO_INTEGER), list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("GramsPerLiter")), ONE_INTEGER, reader_make_constant_shell(makeString("NumericInterval"))), list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("GramsPerLiter")), TWO_INTEGER, reader_make_constant_shell(makeString("NumericInterval"))))));

    private static final SubLSymbol ALL_RELATION_ARG_CONSTRAINT_SENTENCES = makeSymbol("ALL-RELATION-ARG-CONSTRAINT-SENTENCES");



    private static final SubLList $list185 = list(list(list(reader_make_constant_shell(makeString("isa"))), list(list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("isa")), ONE_INTEGER, reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("isa")), TWO_INTEGER, reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("argGenl")), reader_make_constant_shell(makeString("isa")), TWO_INTEGER, reader_make_constant_shell(makeString("Thing"))))));

    private static final SubLSymbol FORMULA_ARG_CONSTRAINTS_CYCL = makeSymbol("FORMULA-ARG-CONSTRAINTS-CYCL");

    private static final SubLList $list187 = list(list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), makeSymbol("?X"))), list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing"))))));

    private static final SubLString $str188$Arg_Type_Utilities_Test_Suite = makeString("Arg-Type Utilities Test Suite");

    private static final SubLList $list189 = list(makeSymbol("GENERIC-ARG-TEST-CASE"));

    public static SubLObject arg_n_predicate(final SubLObject n) {
        if (n.eql(ONE_INTEGER)) {
            return $$arg1Isa;
        }
        if (n.eql(TWO_INTEGER)) {
            return $$arg2Isa;
        }
        if (n.eql(THREE_INTEGER)) {
            return $$arg3Isa;
        }
        if (n.eql(FOUR_INTEGER)) {
            return $$arg4Isa;
        }
        if (n.eql(FIVE_INTEGER)) {
            return $$arg5Isa;
        }
        return NIL;
    }

    public static SubLObject arg_type_mt(final SubLObject relation, final SubLObject args, final SubLObject argnum, final SubLObject mt) {
        if ((argnum.numE(TWO_INTEGER) && (NIL != fort_types_interface.mtP(args.first()))) && (NIL != term.mt_designating_relationP(relation))) {
            return args.first();
        }
        return mt;
    }

    public static SubLObject find_generic_arg_by_id(final SubLObject number) {
        return list_utilities.alist_lookup_without_values($generic_arg_store$.getGlobalValue(), number, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_generic_arg_id(final SubLObject generic_arg) {
        return rassoc(generic_arg, $generic_arg_store$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED).first();
    }

    public static SubLObject store_generic_arg(final SubLObject v_new, final SubLObject number) {
        $generic_arg_store$.setGlobalValue(list_utilities.alist_enter($generic_arg_store$.getGlobalValue(), number, v_new, UNPROVIDED));
        return v_new;
    }

    public static SubLObject stored_generic_arg_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(rassoc(v_object, $generic_arg_store$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED));
    }

    public static SubLObject get_generic_arg(final SubLObject number) {
        final SubLObject generic_arg_from_lookup = find_generic_arg_by_id(number);
        if (generic_arg_from_lookup.isKeyword()) {
            return generic_arg_from_lookup;
        }
        final SubLObject v_new = make_keyword(cconcatenate($$$ARG, format(NIL, $str8$_S, number)));
        store_generic_arg(v_new, number);
        return v_new;
    }

    public static SubLObject generic_arg_num(final SubLObject v_object) {
        if (NIL == generic_argP(v_object)) {
            return NIL;
        }
        if (NIL != stored_generic_arg_p(v_object)) {
            return find_generic_arg_id(v_object);
        }
        final SubLObject argnum = string_utilities.substring(symbol_name(v_object), THREE_INTEGER, UNPROVIDED);
        final SubLObject num = read_from_string(argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject generic_argP = integerp(num);
        if (NIL != generic_argP) {
            store_generic_arg(v_object, num);
        }
        return generic_argP;
    }

    public static SubLObject generic_argP(final SubLObject v_object) {
        if (!v_object.isKeyword()) {
            return NIL;
        }
        if (NIL != stored_generic_arg_p(v_object)) {
            return T;
        }
        if (NIL != list_utilities.lengthLE(symbol_name(v_object), THREE_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject name = symbol_name(v_object);
        final SubLObject arg = string_utilities.substring(name, ZERO_INTEGER, THREE_INTEGER);
        final SubLObject argnum_string = string_utilities.substring(name, THREE_INTEGER, UNPROVIDED);
        final SubLObject generic_argP = makeBoolean($$$ARG.equalp(arg) && (NIL != string_utilities.digit_stringP(argnum_string)));
        if (NIL != generic_argP) {
            store_generic_arg(v_object, read_from_string(argnum_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return generic_argP;
    }

    public static SubLObject inter_arg_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgIsa1_2;
            }
            if (dep_arg.eql(THREE_INTEGER)) {
                return $$interArgIsa1_3;
            }
            if (dep_arg.eql(FOUR_INTEGER)) {
                return $$interArgIsa1_4;
            }
            if (dep_arg.eql(FIVE_INTEGER)) {
                return $$interArgIsa1_5;
            }
            el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgIsa2_1;
                }
                if (dep_arg.eql(THREE_INTEGER)) {
                    return $$interArgIsa2_3;
                }
                if (dep_arg.eql(FOUR_INTEGER)) {
                    return $$interArgIsa2_4;
                }
                if (dep_arg.eql(FIVE_INTEGER)) {
                    return $$interArgIsa2_5;
                }
                el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    if (dep_arg.eql(ONE_INTEGER)) {
                        return $$interArgIsa3_1;
                    }
                    if (dep_arg.eql(TWO_INTEGER)) {
                        return $$interArgIsa3_2;
                    }
                    if (dep_arg.eql(FOUR_INTEGER)) {
                        return $$interArgIsa3_4;
                    }
                    if (dep_arg.eql(FIVE_INTEGER)) {
                        return $$interArgIsa3_5;
                    }
                    el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        if (dep_arg.eql(ONE_INTEGER)) {
                            return $$interArgIsa4_1;
                        }
                        if (dep_arg.eql(TWO_INTEGER)) {
                            return $$interArgIsa4_2;
                        }
                        if (dep_arg.eql(THREE_INTEGER)) {
                            return $$interArgIsa4_3;
                        }
                        if (dep_arg.eql(FIVE_INTEGER)) {
                            return $$interArgIsa4_5;
                        }
                        el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            if (dep_arg.eql(ONE_INTEGER)) {
                                return $$interArgIsa5_1;
                            }
                            if (dep_arg.eql(TWO_INTEGER)) {
                                return $$interArgIsa5_2;
                            }
                            if (dep_arg.eql(THREE_INTEGER)) {
                                return $$interArgIsa5_3;
                            }
                            if (dep_arg.eql(FOUR_INTEGER)) {
                                return $$interArgIsa5_4;
                            }
                            el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_isa_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list30, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list30, UNPROVIDED, UNPROVIDED))) {
            return inter_arg_isa_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    public static SubLObject inter_arg_not_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgNotIsa1_2;
            }
            if (dep_arg.eql(THREE_INTEGER)) {
                return $$interArgNotIsa1_3;
            }
            if (dep_arg.eql(FOUR_INTEGER)) {
                return $$interArgNotIsa1_4;
            }
            if (dep_arg.eql(FIVE_INTEGER)) {
                return $$interArgNotIsa1_5;
            }
            el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(THREE_INTEGER)) {
                    return $$interArgNotIsa2_3;
                }
                if (dep_arg.eql(FOUR_INTEGER)) {
                    return $$interArgNotIsa2_4;
                }
                if (dep_arg.eql(FIVE_INTEGER)) {
                    return $$interArgNotIsa2_5;
                }
                el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    if (dep_arg.eql(FOUR_INTEGER)) {
                        return $$interArgNotIsa3_4;
                    }
                    if (dep_arg.eql(FIVE_INTEGER)) {
                        return $$interArgNotIsa3_5;
                    }
                    el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        if (dep_arg.eql(FIVE_INTEGER)) {
                            return $$interArgNotIsa4_5;
                        }
                        el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_not_isa_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list30, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list30, UNPROVIDED, UNPROVIDED))) {
            return inter_arg_not_isa_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    public static SubLObject inter_arg_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgGenl1_2;
            }
            el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgGenl2_1;
                }
                if (dep_arg.eql(FOUR_INTEGER)) {
                    return $$interArgGenl2_4;
                }
                el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_not_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgNotGenl1_2;
            }
            el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_isa_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgIsaGenl1_2;
            }
            el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgIsaGenl2_1;
                }
                if (dep_arg.eql(THREE_INTEGER)) {
                    return $$interArgIsaGenl2_3;
                }
                el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    if (dep_arg.eql(TWO_INTEGER)) {
                        return $$interArgIsaGenl3_2;
                    }
                    el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_genl_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgGenlIsa2_1;
                }
                el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_genl_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list30, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list30, UNPROVIDED, UNPROVIDED))) {
            return inter_arg_genl_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    public static SubLObject implication_opP(final SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$implication_operators$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED);
    }

    public static SubLObject logical_opP(final SubLObject symbol) {
        return makeBoolean((NIL != fort_types_interface.isa_logical_connectiveP(symbol, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_quantifierP(symbol, mt_vars.$anect_mt$.getGlobalValue())));
    }

    public static SubLObject truth_functionP(final SubLObject v_object) {
        return isa.isaP(v_object, $$TruthFunction, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject initialize_all_arg_type_predicate_caches() {
        SubLObject count = ZERO_INTEGER;
        count = add(count, initialize_some_inter_arg_isa_assertion_somewhere_cache());
        count = add(count, initialize_some_inter_arg_format_assertion_somewhere_cache());
        return count;
    }

    public static SubLObject clear_all_arg_type_predicate_caches() {
        clear_some_inter_arg_isa_assertion_somewhere_cache();
        clear_some_inter_arg_format_assertion_somewhere_cache();
        return NIL;
    }

    public static SubLObject arg_isa_binary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgIsaBinaryPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject arg_isa_ternary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgIsaTernaryPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject arg_isa_predicateP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED))) || (NIL != isa.isaP(v_object, $$ArgIsaPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject arg_genl_binary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgGenlBinaryPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject arg_genl_ternary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgGenlTernaryPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject arg_genl_predicateP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED))) || (NIL != isa.isaP(v_object, $$ArgGenlPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject formula_denoting_functionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != relation_expressionP(v_object)) {
            return formula_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return NIL;
    }

    public static SubLObject formula_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.nautP(functor, UNPROVIDED)) {
            return formula_functorP(narts_high.find_nart(functor), mt);
        }
        if (NIL != forts.fort_p(functor)) {
            SubLObject formula_functorP = NIL;
            if (NIL == formula_functorP) {
                SubLObject csome_list_var;
                SubLObject result_isa;
                for (csome_list_var = kb_accessors.result_isa(functor, mt), result_isa = NIL, result_isa = csome_list_var.first(); (NIL == formula_functorP) && (NIL != csome_list_var); formula_functorP = formula_denoting_collectionP(result_isa) , csome_list_var = csome_list_var.rest() , result_isa = csome_list_var.first()) {
                }
            }
            return formula_functorP;
        }
        return NIL;
    }

    public static SubLObject sentence_denoting_functionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != relation_expressionP(v_object)) {
            return sentence_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return NIL;
    }

    public static SubLObject sentence_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.nautP(functor, UNPROVIDED)) {
            return sentence_functorP(narts_high.find_nart(functor), mt);
        }
        if (NIL != forts.fort_p(functor)) {
            SubLObject sentence_functorP = NIL;
            if (NIL == sentence_functorP) {
                SubLObject csome_list_var;
                SubLObject result_isa;
                for (csome_list_var = kb_accessors.result_isa(functor, mt), result_isa = NIL, result_isa = csome_list_var.first(); (NIL == sentence_functorP) && (NIL != csome_list_var); sentence_functorP = sentence_denoting_collectionP(result_isa) , csome_list_var = csome_list_var.rest() , result_isa = csome_list_var.first()) {
                }
            }
            return sentence_functorP;
        }
        return NIL;
    }

    public static SubLObject argn_type_levelP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
        final SubLObject types = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = types, type = NIL, type = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = genls.genlP(type, $$Collection, mt, UNPROVIDED) , csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
            }
        }
        return foundP;
    }

    public static SubLObject min_genl_preds_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return at_admitted.relations_admitting_fort_as_arg(fort, argnum, genl_predicates.all_genl_preds(predicate, mt, UNPROVIDED), mt);
    }

    public static SubLObject forts_admitted_as_arg(final SubLObject v_forts, final SubLObject reln, final SubLObject argnum, SubLObject mt, SubLObject ind_arg_fort, SubLObject ind_argnum) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (ind_arg_fort == UNPROVIDED) {
            ind_arg_fort = NIL;
        }
        if (ind_argnum == UNPROVIDED) {
            ind_argnum = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != v_forts) {
            final SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
            final SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
            SubLObject result = NIL;
            SubLObject isa_candidates = NIL;
            if ((NIL != isa_okP) && (NIL != genls_okP)) {
                result = v_forts;
            } else {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject genl_somethingP = (NIL != forts.fort_p(reln)) ? makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED))) : NIL;
                    final SubLObject _prev_bind_0_$31 = at_vars.$at_reln$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$32 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                    try {
                        at_vars.$at_reln$.bind(reln, thread);
                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                        assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
                        final SubLObject _prev_bind_0_$32 = at_vars.$at_argnum$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = at_vars.$at_arg_type$.currentBinding(thread);
                        try {
                            at_vars.$at_argnum$.bind(argnum, thread);
                            at_vars.$at_arg_type$.bind($STRONG_FORT, thread);
                            if (NIL != isa_okP) {
                                isa_candidates = v_forts;
                            } else {
                                SubLObject cdolist_list_var = v_forts;
                                SubLObject fort = NIL;
                                fort = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != forts.fort_p(fort)) {
                                        final SubLObject _prev_bind_0_$33 = at_vars.$at_arg$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$34 = at_vars.$defn_fn_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$37 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = at_vars.$defn_col_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                                        try {
                                            at_vars.$at_arg$.bind(fort, thread);
                                            at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
                                            at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
                                            at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
                                            at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
                                            try {
                                                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$35 = at_vars.$at_isa_space$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                            isa.sbhl_record_all_isa(fort, UNPROVIDED, UNPROVIDED);
                                                            if ((NIL != arg_type.arg_test_okP(reln, fort, argnum, $ISA)) && ((((NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL == ind_arg_fort)) || (NIL == ind_argnum)) || (NIL == arg_type.mal_inter_argP(reln, ind_arg_fort, ind_argnum, fort, argnum, $ISA)))) {
                                                                isa_candidates = cons(fort, isa_candidates);
                                                            }
                                                        } finally {
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$36, thread);
                                                            at_vars.$at_isa_space$.rebind(_prev_bind_0_$35, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$35, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$34, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    at_defns.clear_defn_space();
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                                }
                                            }
                                        } finally {
                                            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_5, thread);
                                            at_vars.$defn_col_history$.rebind(_prev_bind_4, thread);
                                            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2_$37, thread);
                                            at_vars.$defn_fn_history$.rebind(_prev_bind_1_$34, thread);
                                            at_vars.$at_arg$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fort = cdolist_list_var.first();
                                } 
                            }
                            if (NIL != genls_okP) {
                                result = isa_candidates;
                            } else {
                                SubLObject cdolist_list_var = isa_candidates;
                                SubLObject fort = NIL;
                                fort = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$38 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(fort, thread);
                                        final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                        final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject _prev_bind_0_$40 = at_vars.$at_genls_space$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$38 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                try {
                                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                                    final SubLObject collectionP = fort_types_interface.collectionP(fort);
                                                    if (NIL != collectionP) {
                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, UNPROVIDED, UNPROVIDED);
                                                        sbhl_marking_methods.sbhl_record_node($$Thing, UNPROVIDED);
                                                    }
                                                    final SubLObject genl_somethingP_$49 = (NIL != forts.fort_p(reln)) ? makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED))) : NIL;
                                                    final SubLObject _prev_bind_0_$41 = at_vars.$at_reln$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$39 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$38 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                    try {
                                                        at_vars.$at_reln$.bind(reln, thread);
                                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP_$49)), thread);
                                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP_$49)), thread);
                                                        if (NIL != arg_type.arg_test_okP(reln, fort, argnum, $GENLS)) {
                                                            result = cons(fort, result);
                                                        }
                                                    } finally {
                                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$38, thread);
                                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$39, thread);
                                                        at_vars.$at_reln$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$38, thread);
                                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$40, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$37, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    } finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$38, thread);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fort = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            at_vars.$at_arg_type$.rebind(_prev_bind_1_$33, thread);
                            at_vars.$at_argnum$.rebind(_prev_bind_0_$32, thread);
                        }
                    } finally {
                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$32, thread);
                        at_vars.$at_reln$.rebind(_prev_bind_0_$31, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject min_implicit_types(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject gafs = kb_accessors.constant_pos_gafs(fort, mt);
        return term_requires_isa_in_relations(fort, gafs, mt, T);
    }

    public static SubLObject term_requires_isa_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
        final SubLObject result_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result_isas;
    }

    public static SubLObject term_requires_genl_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
        final SubLObject result_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result_genls;
    }

    public static SubLObject term_requires_types_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_isas = NIL;
        SubLObject result_genls = NIL;
        SubLObject cdolist_list_var = relation_expressions;
        SubLObject relation_expression = NIL;
        relation_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject isas = term_requires_types_in_relation(v_term, relation_expression, mt);
            final SubLObject v_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != minimizeP) {
                result_isas = genls.min_cols(nconc(result_isas, isas), mt, UNPROVIDED);
                result_genls = genls.min_cols(nconc(result_genls, v_genls), mt, UNPROVIDED);
            } else {
                result_isas = nunion(result_isas, isas, UNPROVIDED, UNPROVIDED);
                result_genls = nunion(result_genls, v_genls, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            relation_expression = cdolist_list_var.first();
        } 
        return values(result_isas, result_genls);
    }

    public static SubLObject term_requires_isa_in_clause(final SubLObject v_term, final SubLObject clause, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
        try {
            at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunct_cnfP(clause), thread);
            SubLObject cdolist_list_var = clauses.neg_lits(clause);
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nunion(term_requires_isa_in_relation(v_term, literal, mt), result, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(clause);
            literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nunion(term_requires_isa_in_relation(v_term, literal, mt), result, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_requires_isa_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$56 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$55 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$56 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$57 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$57, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$56, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$55, thread);
                }
                result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$56, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$55, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$54, thread);
            }
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_requires_isa_in_formula(final SubLObject v_term, final SubLObject formula, SubLObject mt, SubLObject subformulasP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (subformulasP == UNPROVIDED) {
            subformulasP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(subformulasP, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$61 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$63 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$62 = at_vars.$at_profile_term$.currentBinding(thread);
                final SubLObject _prev_bind_1_$63 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_2_$64 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_4 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_profile_term$.bind(v_term, thread);
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(formula), thread);
                    at_vars.$at_formula$.bind(formula, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != (NIL != subformulasP ? cycl_utilities.expression_find(v_term, at_vars.$at_arg$.getDynamicValue(thread), NIL, symbol_function(EQUAL), UNPROVIDED) : equal(v_term, at_vars.$at_arg$.getDynamicValue(thread)))) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$63, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_4, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_2_$64, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_1_$63, thread);
                    at_vars.$at_profile_term$.rebind(_prev_bind_0_$62, thread);
                }
                result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$63, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$62, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$61, thread);
            }
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_requires_genl_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            at_vars.$at_check_arg_isaP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$68 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$69 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$70 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$69 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$70 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$71 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                        final SubLObject _prev_bind_0_$70 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$70, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$71, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$70, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$69, thread);
                }
                result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$70, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$69, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$68, thread);
            }
        } finally {
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_sub_expression_for_term_position(final SubLObject term_position, final SubLObject expression) {
        assert NIL != list_utilities.tree_position_p(term_position) : "list_utilities.tree_position_p(term_position) " + "CommonSymbols.NIL != list_utilities.tree_position_p(term_position) " + term_position;
        assert NIL != collection_defns.cycl_formulaP(expression) : "collection_defns.cycl_formulaP(expression) " + "CommonSymbols.NIL != collection_defns.cycl_formulaP(expression) " + expression;
        if (ONE_INTEGER.equal(length(term_position))) {
            return expression;
        }
        return list_utilities.get_nested_nth(expression, list_utilities.remove_last(copy_list(term_position)), UNPROVIDED);
    }

    public static SubLObject term_position_requires_types_in_relation(final SubLObject term_position, final SubLObject expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.tree_position_p(term_position) : "list_utilities.tree_position_p(term_position) " + "CommonSymbols.NIL != list_utilities.tree_position_p(term_position) " + term_position;
        assert NIL != collection_defns.cycl_formulaP(expression) : "collection_defns.cycl_formulaP(expression) " + "CommonSymbols.NIL != collection_defns.cycl_formulaP(expression) " + expression;
        SubLObject v_term = NIL;
        SubLObject isa_result = NIL;
        SubLObject genls_result = NIL;
        final SubLObject relation_expression = get_sub_expression_for_term_position(term_position, expression);
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$75 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$76 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$76 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$77 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$79 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(last(term_position, UNPROVIDED).first(), thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    v_term = nth(at_vars.$at_argnum$.getDynamicValue(thread), relation_expression);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$79, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$77, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$76, thread);
                }
                isa_result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                genls_result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$76, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$75, thread);
            }
        } finally {
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return values(genls.min_cols(isa_result, mt, UNPROVIDED), genls.min_cols(genls_result, mt, UNPROVIDED));
    }

    public static SubLObject term_requires_types_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_result = NIL;
        SubLObject genls_result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$81 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$81 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$82 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$82, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$84, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$82, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$81, thread);
                }
                isa_result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                genls_result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$81, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$80, thread);
            }
        } finally {
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return values(isa_result, genls_result);
    }

    public static SubLObject arg_requires_isa_in_relation(final SubLObject arg, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_term = cycl_utilities.formula_arg(relation_expression, arg, UNPROVIDED);
        return term_requires_isa_in_relation(v_term, relation_expression, mt);
    }

    public static SubLObject pred_arg_isa_requires_other_arg_isa(final SubLObject pred, final SubLObject arg_isa, final SubLObject arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject literal = make_el_query_literal(pred);
        final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            at_vars.$at_formula$.bind(list_utilities.replace_nth(arg, arg_isa, literal), thread);
            at_vars.$at_arg$.bind(arg_isa, thread);
            at_vars.$at_argnum$.bind(arg, thread);
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$87 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$88 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$87 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$88 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(at_vars.$at_formula$.getDynamicValue(thread)), thread);
                    at_vars.$at_formula$.bind(at_vars.$at_formula$.getDynamicValue(thread), thread);
                    SubLObject n = ZERO_INTEGER;
                    SubLObject cdolist_list_var = literal_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        n = add(n, ONE_INTEGER);
                        if (n.numE(arg)) {
                            arg_type.arg_isa_arg_types_okP(pred, v_term, arg, mt);
                        } else {
                            arg_type.relation_arg_okP(pred, v_term, n, UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                    n = ZERO_INTEGER;
                    cdolist_list_var = literal_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
                    v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        n = add(n, ONE_INTEGER);
                        if (!arg_isa.eql(v_term)) {
                            result = cons(list(n, genls.min_cols(list_utilities.remove_duplicate_forts(gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED)), mt, UNPROVIDED)), result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_1_$88, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$87, thread);
                }
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$88, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$87, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$86, thread);
            }
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_6, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_5, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_4, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_3, thread);
            at_vars.$at_arg$.rebind(_prev_bind_2, thread);
            at_vars.$at_formula$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject make_el_query_literal(final SubLObject pred) {
        final SubLObject v_arity = arity.arity(pred);
        SubLObject literal = list(pred);
        if (NIL != valid_arity_p(v_arity)) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                literal = cons(czer_utilities.get_nth_canonical_variable(i, $EL_VAR), literal);
            }
        }
        return nreverse(literal);
    }

    public static SubLObject arg_isa_applicable_gafs(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject relation = assertions_high.gaf_arg1(assertion);
        SubLObject result = NIL;
        if (NIL != forts.fort_p(relation)) {
            final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_answer$.bind(NIL, thread);
                if (NIL != fort_types_interface.predicateP(relation)) {
                    final SubLObject _prev_bind_0_$91 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        genl_predicates.map_spec_preds(relation, GATHER_VIA_MAP_PRED_INDEX, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$91, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0_$92 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_predicate_extent_index(GATHER_ASSERTIONS, relation, $TRUE, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$92, thread);
                    }
                }
                result = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject gather_via_map_pred_index(final SubLObject predicate) {
        if (NIL != forts.fort_p(predicate)) {
            kb_mapping.map_predicate_extent_index(GATHER_ASSERTIONS, predicate, $TRUE, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inter_arg_isa_cache_initializedP() {
        return set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_add_int(final SubLObject reln) {
        return set.set_add(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_remove_int(final SubLObject reln) {
        return set.set_remove(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(final SubLObject reln) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject ind_argnum = NIL;
        ind_argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$93 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject dep_argnum = NIL;
            dep_argnum = cdolist_list_var_$93.first();
            while (NIL != cdolist_list_var_$93) {
                final SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                if (NIL != inter_arg_isa_pred) {
                    count = add(count, kb_indexing.num_gaf_arg_index(reln, ONE_INTEGER, inter_arg_isa_pred, UNPROVIDED));
                }
                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                dep_argnum = cdolist_list_var_$93.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ind_argnum = cdolist_list_var.first();
        } 
        if (count.numLE(ONE_INTEGER)) {
            return some_inter_arg_isa_assertion_somewhere_cache_remove_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_add(final SubLObject reln) {
        if (NIL != inter_arg_isa_cache_initializedP()) {
            return some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove(final SubLObject reln) {
        if (NIL != inter_arg_isa_cache_initializedP()) {
            return some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return NIL;
    }

    public static SubLObject clear_some_inter_arg_isa_assertion_somewhere_cache() {
        if (NIL != set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
        } else {
            $some_inter_arg_isa_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQL, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject initialize_some_inter_arg_isa_assertion_somewhere_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_some_inter_arg_isa_assertion_somewhere_cache();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            final SubLObject _prev_bind_0_$94 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$95 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str79$Initializing___interArgIsa_cache, thread);
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
                    SubLObject ind_argnum = NIL;
                    ind_argnum = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject dep_argnum = NIL;
                        dep_argnum = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (!ind_argnum.eql(dep_argnum)) {
                                final SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                                if (NIL != inter_arg_isa_pred) {
                                    final SubLObject pred_var = inter_arg_isa_pred;
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        final SubLObject str = NIL;
                                        final SubLObject _prev_bind_0_$95 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$96 = $progress_last_pacification_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$98 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$99 = $progress_notification_count$.currentBinding(thread);
                                        final SubLObject _prev_bind_4_$100 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                        final SubLObject _prev_bind_5_$101 = $progress_count$.currentBinding(thread);
                                        final SubLObject _prev_bind_6_$102 = $is_noting_progressP$.currentBinding(thread);
                                        final SubLObject _prev_bind_7_$103 = $silent_progressP$.currentBinding(thread);
                                        try {
                                            $progress_start_time$.bind(get_universal_time(), thread);
                                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                            $progress_count$.bind(ZERO_INTEGER, thread);
                                            $is_noting_progressP$.bind(T, thread);
                                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                            noting_progress_preamble(str);
                                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    note_progress();
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        SubLObject done_var_$104 = NIL;
                                                        final SubLObject token_var_$105 = NIL;
                                                        while (NIL == done_var_$104) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$105);
                                                            final SubLObject valid_$106 = makeBoolean(!token_var_$105.eql(ass));
                                                            if (NIL != valid_$106) {
                                                                final SubLObject reln = assertions_high.gaf_arg1(ass);
                                                                some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
                                                            }
                                                            done_var_$104 = makeBoolean(NIL == valid_$106);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            } 
                                            noting_progress_postamble();
                                        } finally {
                                            $silent_progressP$.rebind(_prev_bind_7_$103, thread);
                                            $is_noting_progressP$.rebind(_prev_bind_6_$102, thread);
                                            $progress_count$.rebind(_prev_bind_5_$101, thread);
                                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$100, thread);
                                            $progress_notification_count$.rebind(_prev_bind_3_$99, thread);
                                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$98, thread);
                                            $progress_last_pacification_time$.rebind(_prev_bind_1_$96, thread);
                                            $progress_start_time$.rebind(_prev_bind_0_$95, thread);
                                        }
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dep_argnum = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ind_argnum = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$95, thread);
                $progress_note$.rebind(_prev_bind_0_$94, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_size($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhereP(final SubLObject reln) {
        return set.set_memberP(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        if (NIL != fort_types_interface.predicateP(reln)) {
            if (NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str93$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$111 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$112 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$114 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, UNPROVIDED);
                                        for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == found_oneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$115 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$115;
                                            final SubLObject _prev_bind_0_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (NIL != some_inter_arg_isa_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$113;
                                                SubLObject _prev_bind_1_$113;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$114;
                                                SubLObject iteration_state_$120;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$115;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$122;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$116;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == found_oneP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$113 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$115);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$120 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$120)); iteration_state_$120 = dictionary_contents.do_dictionary_contents_next(iteration_state_$120)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$120);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == found_oneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$115, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$120);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$114, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str95$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$122 = NIL, rest_$122 = new_list; (NIL == found_oneP) && (NIL != rest_$122); rest_$122 = rest_$122.rest()) {
                                                                    generating_fn = rest_$122.first();
                                                                    _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == found_oneP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == found_oneP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$116, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$113, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$113, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$112, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$114, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$112, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$111, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str96$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$111, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$110, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$109, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            found_oneP = some_inter_arg_isa_assertion_somewhereP(reln);
        }
        return found_oneP;
    }

    public static SubLObject inter_arg_format_cache_initializedP() {
        return set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_add_int(final SubLObject reln) {
        return set.set_add(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_remove_int(final SubLObject reln) {
        return set.set_remove(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(final SubLObject reln) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject ind_argnum = NIL;
        ind_argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$125 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject dep_argnum = NIL;
            dep_argnum = cdolist_list_var_$125.first();
            while (NIL != cdolist_list_var_$125) {
                final SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                if (NIL != inter_arg_format_pred) {
                    count = add(count, kb_indexing.num_gaf_arg_index(reln, ONE_INTEGER, inter_arg_format_pred, UNPROVIDED));
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                dep_argnum = cdolist_list_var_$125.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ind_argnum = cdolist_list_var.first();
        } 
        if (count.numLE(ONE_INTEGER)) {
            return some_inter_arg_format_assertion_somewhere_cache_remove_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_add(final SubLObject reln) {
        if (NIL != inter_arg_format_cache_initializedP()) {
            return some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove(final SubLObject reln) {
        if (NIL != inter_arg_format_cache_initializedP()) {
            return some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return NIL;
    }

    public static SubLObject clear_some_inter_arg_format_assertion_somewhere_cache() {
        if (NIL != set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
        } else {
            $some_inter_arg_format_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQL, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject initialize_some_inter_arg_format_assertion_somewhere_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_some_inter_arg_format_assertion_somewhere_cache();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            final SubLObject _prev_bind_0_$126 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$127 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str98$Initializing___interArgFormat_cac, thread);
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
                    SubLObject ind_argnum = NIL;
                    ind_argnum = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject dep_argnum = NIL;
                        dep_argnum = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                            if (NIL != inter_arg_format_pred) {
                                final SubLObject pred_var = inter_arg_format_pred;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    final SubLObject str = NIL;
                                    final SubLObject _prev_bind_0_$127 = $progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$128 = $progress_last_pacification_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$130 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$131 = $progress_notification_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$132 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                    final SubLObject _prev_bind_5_$133 = $progress_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_6_$134 = $is_noting_progressP$.currentBinding(thread);
                                    final SubLObject _prev_bind_7_$135 = $silent_progressP$.currentBinding(thread);
                                    try {
                                        $progress_start_time$.bind(get_universal_time(), thread);
                                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                        $progress_count$.bind(ZERO_INTEGER, thread);
                                        $is_noting_progressP$.bind(T, thread);
                                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                        noting_progress_preamble(str);
                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                note_progress();
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    SubLObject done_var_$136 = NIL;
                                                    final SubLObject token_var_$137 = NIL;
                                                    while (NIL == done_var_$136) {
                                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$137);
                                                        final SubLObject valid_$138 = makeBoolean(!token_var_$137.eql(ass));
                                                        if (NIL != valid_$138) {
                                                            final SubLObject reln = assertions_high.gaf_arg1(ass);
                                                            some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
                                                        }
                                                        done_var_$136 = makeBoolean(NIL == valid_$138);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        } 
                                        noting_progress_postamble();
                                    } finally {
                                        $silent_progressP$.rebind(_prev_bind_7_$135, thread);
                                        $is_noting_progressP$.rebind(_prev_bind_6_$134, thread);
                                        $progress_count$.rebind(_prev_bind_5_$133, thread);
                                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$132, thread);
                                        $progress_notification_count$.rebind(_prev_bind_3_$131, thread);
                                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$130, thread);
                                        $progress_last_pacification_time$.rebind(_prev_bind_1_$128, thread);
                                        $progress_start_time$.rebind(_prev_bind_0_$127, thread);
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dep_argnum = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ind_argnum = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$127, thread);
                $progress_note$.rebind(_prev_bind_0_$126, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_size($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhereP(final SubLObject reln) {
        return set.set_memberP(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        if (NIL != fort_types_interface.predicateP(reln)) {
            if (NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$141 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str93$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$142 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$143 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$143 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$144 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$146 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, UNPROVIDED);
                                        for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == found_oneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$147 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$147;
                                            final SubLObject _prev_bind_0_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (NIL != some_inter_arg_format_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$145;
                                                SubLObject _prev_bind_1_$145;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$146;
                                                SubLObject iteration_state_$152;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$147;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$154;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$148;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == found_oneP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$145 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$147);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$152 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$152)); iteration_state_$152 = dictionary_contents.do_dictionary_contents_next(iteration_state_$152)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$152);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == found_oneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$147, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$152);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$146, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str95$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$154 = NIL, rest_$154 = new_list; (NIL == found_oneP) && (NIL != rest_$154); rest_$154 = rest_$154.rest()) {
                                                                    generating_fn = rest_$154.first();
                                                                    _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == found_oneP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == found_oneP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$148, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$145, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$145, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$144, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$146, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$144, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$143, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str96$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$143, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$142, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$141, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            found_oneP = some_inter_arg_format_assertion_somewhereP(reln);
        }
        return found_oneP;
    }

    public static SubLObject reln_permits_generic_arg_variablesP(final SubLObject relation, final SubLObject arg_isa_pred) {
        return reln_constrained_to_be_collectionP(relation, arg_isa_pred, $$GenericArgTemplate);
    }

    public static SubLObject reln_permits_keyword_variablesP(final SubLObject relation, final SubLObject arg_isa_pred) {
        return reln_constrained_to_be_collectionP(relation, arg_isa_pred, $$KeywordVariableTemplate);
    }

    public static SubLObject reln_constrained_to_be_collectionP(final SubLObject relation, final SubLObject arg_isa_pred, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(arg_isa_pred)) {
            SubLObject constrained_argnum = constraint_pred_constraint_argnum(arg_isa_pred);
            if (NIL == constrained_argnum) {
                constrained_argnum = TWO_INTEGER;
            }
            return genls.genl_of_any_argP(collection, relation, arg_isa_pred, mt_relevance_macros.$mt$.getDynamicValue(thread), ONE_INTEGER, constrained_argnum, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject constraint_pred_constraint_argnum(final SubLObject pred) {
        if (((((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_not_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return TWO_INTEGER;
        }
        if (((((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_not_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return THREE_INTEGER;
        }
        if (((NIL != fort_types_interface.isa_arg_type_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_arg_quoted_isa_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) || (NIL != fort_types_interface.isa_arg_format_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) {
            return TWO_INTEGER;
        }
        if (((NIL != fort_types_interface.isa_arg_type_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_arg_quoted_isa_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) || (NIL != fort_types_interface.isa_arg_format_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) {
            return THREE_INTEGER;
        }
        at_error(THREE_INTEGER, $str101$got_an_arg_type_predicate___s__th, pred, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject gaf_arg_type_constraint(final SubLObject assertion) {
        final SubLObject argnum = constraint_pred_constraint_argnum(assertions_high.gaf_arg(assertion, ZERO_INTEGER));
        if (argnum.isInteger()) {
            return assertions_high.gaf_arg(assertion, argnum);
        }
        return NIL;
    }

    public static SubLObject gather_at_data(final SubLObject assertion, final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            gather_at_constraint(constraint, type, v_term);
            gather_at_assertion(assertion, type, v_term);
        }
        return NIL;
    }

    public static SubLObject gather_at_data_assertion(final SubLObject assertion, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = at_vars.$at_constraint_type$.getDynamicValue();
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            gather_at_assertion(assertion, type, v_term);
            if ($mapping_gather_arg$.getDynamicValue(thread).isInteger()) {
                final SubLObject constraint = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
                if (NIL != forts.fort_p(constraint)) {
                    gather_at_constraint(constraint, type, v_term);
                }
            }
        }
        return NIL;
    }

    public static SubLObject gather_at_constraint(final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$gather_at_constraintsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread)) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql($ISA)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_constraints$.getDynamicValue(thread));
            } else
                if (pcase_var.eql($GENLS)) {
                    hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_constraints$.getDynamicValue(thread));
                } else
                    if (pcase_var.eql($FORMAT)) {
                        hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_constraints$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($DIFFERENT)) {
                            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
                        }



        }
        return NIL;
    }

    public static SubLObject gather_at_assertion(final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$gather_at_assertionsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread)) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql($ISA)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_assertions$.getDynamicValue(thread));
            } else
                if (pcase_var.eql($GENLS)) {
                    hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_assertions$.getDynamicValue(thread));
                } else
                    if (pcase_var.eql($FORMAT)) {
                        hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_assertions$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($DIFFERENT)) {
                            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
                        }



        }
        return NIL;
    }

    public static SubLObject at_finishedP(SubLObject at_violationsP) {
        if (at_violationsP == UNPROVIDED) {
            at_violationsP = at_vars.$at_result$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != at_violationsP) && (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) && (NIL == at_vars.$gather_at_constraintsP$.getDynamicValue(thread)));
    }

    public static SubLObject at_finished(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (NIL != result) {
            at_vars.$at_result$.setDynamicValue(result);
        }
        at_mapping_finished();
        return NIL;
    }

    public static SubLObject at_mapping_finished() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$within_at_mappingP$.getDynamicValue(thread)) {
            sublisp_throw($AT_MAPPING_DONE, NIL);
        }
        return NIL;
    }

    public static SubLObject at_handle_mal_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        at_vars.$at_result$.setDynamicValue(T, thread);
        if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            final SubLObject at_trace_fn = (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? symbol_function(AT_ERROR) : symbol_function(AT_NOTE);
            final SubLObject at_trace_level = (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? ONE_INTEGER : THREE_INTEGER;
            if (ZERO_INTEGER.numE(at_vars.$at_argnum$.getDynamicValue(thread))) {
                funcall(at_trace_fn, at_trace_level, $str107$__at_test_fails___s_fails__s_cons, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint);
            } else {
                funcall(at_trace_fn, new SubLObject[]{ at_trace_level, $str108$__at_test_fails___s_fails__s_cons, at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint, at_vars.$at_argnum$.getDynamicValue(thread), at_vars.$at_reln$.getDynamicValue(thread) });
            }
            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                note_at_violation(at_mal_arg_msg(constraint));
            }
        }
        if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
            at_finished(UNPROVIDED);
        }
        return at_vars.$at_result$.getDynamicValue(thread);
    }

    public static SubLObject at_mal_arg_msg(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue(thread);
        if (pcase_var.eql($IRREFLEXIVE_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ASYMMETRIC_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ANTI_SYMMETRIC_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ANTI_TRANSITIVE_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($NEGATION_PREDS)) {
            return meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($NEGATION_INVERSES)) {
            return meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        at_error(FIVE_INTEGER, $str115$illegal_value_of__at_mode____s, at_vars.$at_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject predicate_isa_violation_data(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($PREDICATE_ISA_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), col, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
    }

    public static SubLObject meta_predicate_violation_data(final SubLObject meta_pred_value, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($META_PREDICATE_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), meta_pred_value, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
    }

    public static SubLObject semantic_violations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nreverse(cconcatenate(wff_vars.$arity_violations$.getDynamicValue(thread), new SubLObject[]{ at_vars.$at_violations$.getDynamicValue(thread), czer_vars.$semantic_violations$.getDynamicValue(thread) }));
    }

    public static SubLObject note_at_violationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_violations$.getDynamicValue(thread)) || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))));
    }

    public static SubLObject note_at_violation(final SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != wff_vars.wff_debugP()) {
            print(note, UNPROVIDED);
        }
        if (NIL != note_at_violationP()) {
            at_vars.$current_at_violation$.setDynamicValue(note, thread);
            if ((NIL == recursive_violationP(note)) && (NIL == member(note, at_vars.$at_violations$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY)))) {
                at_vars.$at_violations$.setDynamicValue(cons(note, at_vars.$at_violations$.getDynamicValue(thread)), thread);
            }
        }
        return at_vars.$at_violations$.getDynamicValue(thread);
    }

    public static SubLObject recursive_violationP(final SubLObject note) {
        final SubLObject pcase_var = note.first();
        if (pcase_var.eql($MAL_ARG_WRT_COL_DEFN)) {
            return eql(fifth(note), $$CycLSentence_Assertible);
        }
        if (pcase_var.eql($MAL_ARG_WRT_NEC_DEFN)) {
            return eql(third(note), $$CycLSentence_Assertible);
        }
        return NIL;
    }

    public static SubLObject reset_at_violations(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != do_itP) {
            at_vars.$at_violations$.setDynamicValue(NIL, thread);
        } else
            if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                    at_vars.$at_violations$.setDynamicValue(NIL, thread);
                }
            }

        return at_vars.$at_violations$.getDynamicValue(thread);
    }

    public static SubLObject reset_arity_violations(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != do_itP) {
            wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
        } else
            if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                    wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
                }
            }

        return NIL;
    }

    public static SubLObject reset_semantic_violations(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        czer_vars.$semantic_violations$.setDynamicValue(NIL);
        reset_at_violations(do_itP);
        reset_arity_violations(do_itP);
        return NIL;
    }

    public static SubLObject reset_at_state() {
        reset_arity_violations(T);
        reset_at_violations(T);
        return NIL;
    }

    public static SubLObject suggest_formula_fix_for_at_violation(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$within_at_suggestionP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$within_at_suggestionP$.bind(T, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            final SubLObject violations = at_vars.$at_violations$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$157 = wff_vars.$wff_violations$.currentBinding(thread);
            try {
                wff_vars.$wff_violations$.bind(NIL, thread);
                final SubLObject accommodating_mts = mts_accommodating_formula_wrt_types(formula);
                if (NIL != accommodating_mts) {
                    wff.note_wff_suggestion(list($CHANGE_MT, formula, mt, accommodating_mts));
                }
                SubLObject cdolist_list_var = assertion_arg_violations_among(violations);
                SubLObject assertion_arg_violation = NIL;
                assertion_arg_violation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assertion_arg_violation_fix(assertion_arg_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_arg_violation = cdolist_list_var.first();
                } 
                cdolist_list_var = sef_violations_among(violations);
                SubLObject sef_violation = NIL;
                sef_violation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sef_violation_fix(sef_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    sef_violation = cdolist_list_var.first();
                } 
                cdolist_list_var = predicate_violations_among(violations);
                SubLObject pred_violation = NIL;
                pred_violation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    predicate_violation_fix(pred_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred_violation = cdolist_list_var.first();
                } 
            } finally {
                wff_vars.$wff_violations$.rebind(_prev_bind_0_$157, thread);
            }
        } finally {
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_4, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_2, thread);
            at_vars.$within_at_suggestionP$.rebind(_prev_bind_0, thread);
        }
        return wff.wff_suggestions();
    }

    public static SubLObject assertion_arg_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym122$ASSERTION_ARG_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sef_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym123$SEF_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym124$PREDICATE_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_arg_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($MAL_ARG_WRT_IFF_DEFN)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject argnum = NIL;
            SubLObject col = NIL;
            SubLObject defn = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list126);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            defn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            mt = current.first();
            current = data = current.rest();
            return makeBoolean((NIL != kb_utilities.kbeq(defn, CYC_ASSERTION)) || (NIL != assertion_collectionP(col, mt)));
        }
        return NIL;
    }

    public static SubLObject assertion_collectionP(final SubLObject thing, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (thing.eql($$CycLAssertion)) {
            return T;
        }
        SubLObject v_boolean = NIL;
        v_boolean = genls.genlP(thing, $$CycLAssertion, mt, UNPROVIDED);
        return v_boolean;
    }

    public static SubLObject sef_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT)) {
            return T;
        }
        if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject predicate_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($PREDICATE_ISA_VIOLATION)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject assertion_arg_violation_fix(final SubLObject violation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = violation.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject argnum = NIL;
        SubLObject col = NIL;
        SubLObject defn = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list126);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        defn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        mt = current.first();
        current = data = current.rest();
        final SubLObject formula = strip_mt_literals(arg, UNPROVIDED);
        SubLObject assertions = NIL;
        SubLObject candidate_mts = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assertions = czer_meta.find_assertions_cycl(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            candidate_mts = cons(assertions_high.assertion_mt(assertion), candidate_mts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = candidate_mts;
        SubLObject candidate_mt = NIL;
        candidate_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            wff.note_wff_suggestion(list($REPLACE_TERM, arg, make_binary_formula($$ist, candidate_mt, formula)));
            cdolist_list_var = cdolist_list_var.rest();
            candidate_mt = cdolist_list_var.first();
        } 
        return wff.wff_suggestions();
    }

    public static SubLObject strip_mt_literals(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if ((NIL != mt_designating_literalP(formula)) && (NIL != fort_types_interface.mtP(designated_mt(formula)))) {
                result = strip_mt_literals(designated_sentence(formula), designated_mt(formula));
            } else {
                result = formula;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sef_violation_fix(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject format = NIL;
            SubLObject mt = NIL;
            SubLObject violations = NIL;
            destructuring_bind_must_consp(current, datum, $list133);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            format = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            violations = current.first();
            current = current.rest();
            final SubLObject via = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list133);
            current = current.rest();
            if (NIL == current) {
                if (NIL != forts.fort_p(arg)) {
                    SubLObject cdolist_list_var = violations;
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject rival = assertions_high.gaf_arg(assertion, pos);
                        wff.note_wff_suggestion(list($ASSERT, list($$equals, arg, rival), mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list133);
            }
        } else
            if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
                SubLObject current;
                final SubLObject datum = current = violation.rest();
                SubLObject arg = NIL;
                SubLObject rel = NIL;
                SubLObject pos = NIL;
                SubLObject format = NIL;
                SubLObject ind_arg_isa = NIL;
                SubLObject ind_pos = NIL;
                SubLObject ind_arg = NIL;
                SubLObject mt2 = NIL;
                SubLObject violations2 = NIL;
                destructuring_bind_must_consp(current, datum, $list136);
                arg = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                rel = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                pos = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                format = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                ind_arg_isa = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                ind_pos = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                ind_arg = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                mt2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                violations2 = current.first();
                current = current.rest();
                final SubLObject via2 = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list136);
                current = current.rest();
                if (NIL == current) {
                    if (NIL != forts.fort_p(arg)) {
                        SubLObject cdolist_list_var2 = violations2;
                        SubLObject assertion2 = NIL;
                        assertion2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject rival2 = assertions_high.gaf_arg(assertion2, pos);
                            wff.note_wff_suggestion(list($ASSERT, list($$equals, arg, rival2), mt2));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list136);
                }
            }

        return wff.wff_suggestions();
    }

    public static SubLObject predicate_violation_fix(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($PREDICATE_ISA_VIOLATION)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject predicate = NIL;
            SubLObject v_isa = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list137);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list137);
            v_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list137);
            mt = current.first();
            current = current.rest();
            final SubLObject violations = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list137);
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var = violations;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    wff.note_wff_suggestion(list($UNASSERT, fi.assertion_fi_ist_formula(assertion, UNPROVIDED)));
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list137);
            }
        }
        return wff.wff_suggestions();
    }

    public static SubLObject violation_type(final SubLObject violation) {
        if (violation.isCons()) {
            return violation.first();
        }
        return NIL;
    }

    public static SubLObject mts_accommodating_formula_wrt_types(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid_mts = NIL;
        SubLObject candidate_mts = NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(formula, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            candidate_mts = nconc(candidate_mts, isa.isa_mts(arg), genls.genls_mts(arg));
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        candidate_mts = Sort.sort(list_utilities.remove_duplicate_forts(candidate_mts), $sym141$_, SPEC_CARDINALITY);
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            if ($mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread).isInteger() && (NIL != list_utilities.lengthG(candidate_mts, $mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), UNPROVIDED))) {
                candidate_mts = list_utilities.first_n($mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), candidate_mts);
            }
            SubLObject cdolist_list_var2 = candidate_mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (((NIL == genl_mts.any_genl_mtP(mt, valid_mts, UNPROVIDED, UNPROVIDED)) && (NIL != el_formulaP(formula))) && (NIL != wff.el_wffP(formula, mt, UNPROVIDED))) {
                    valid_mts = cons(mt, valid_mts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt = cdolist_list_var2.first();
            } 
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(valid_mts, UNPROVIDED);
    }

    public static SubLObject nat_wf_in_some_mtP(final SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        return list_utilities.sublisp_boolean(nat_wf_in_some_mt(cnat, mts, validate_expansionP));
    }

    public static SubLObject nat_wf_in_some_mt(final SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(cnat)) {
            return nat_wf_in_some_mt(narts_high.nart_hl_formula(cnat), UNPROVIDED, UNPROVIDED);
        }
        if (NIL == el_formula_p(cnat)) {
            return NIL;
        }
        if (NIL != validate_expansionP) {
            final SubLObject nat_expansion = wff.wff_el_expansion(cnat, $$EverythingPSC);
            SubLObject wft_mt = NIL;
            final SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$unexpanded_formula$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$validate_expansionsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
            try {
                at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                wff_vars.$unexpanded_formula$.bind(cnat, thread);
                wff_vars.$validate_expansionsP$.bind(NIL, thread);
                wff_vars.$validating_expansionP$.bind(T, thread);
                wft_mt = nat_wf_in_some_mt(nat_expansion, mts, NIL);
            } finally {
                wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                wff_vars.$validate_expansionsP$.rebind(_prev_bind_3, thread);
                wff_vars.$unexpanded_formula$.rebind(_prev_bind_2, thread);
                at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
            }
            return wft_mt;
        }
        if (NIL != mts) {
            SubLObject wft_mt2 = NIL;
            if (NIL == wft_mt2) {
                SubLObject csome_list_var = mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == wft_mt2) && (NIL != csome_list_var)) {
                    if ((NIL != wff.el_wft_fastP(cnat, mt)) && (((NIL == wff_vars.validating_expansionP()) || cnat.equal(wff_vars.unexpanded_formula())) || (NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt)))) {
                        wft_mt2 = mt;
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
            return wft_mt2;
        }
        final SubLObject mts_$158 = nat_wf_default_mts(cnat, UNPROVIDED, UNPROVIDED);
        SubLObject wft_mt = NIL;
        if (NIL == wft_mt) {
            SubLObject csome_list_var2 = mts_$158;
            SubLObject mt2 = NIL;
            mt2 = csome_list_var2.first();
            while ((NIL == wft_mt) && (NIL != csome_list_var2)) {
                if ((NIL != wff.el_wft_fastP(cnat, mt2)) && (((NIL == wff_vars.validating_expansionP()) || cnat.equal(wff_vars.unexpanded_formula())) || (NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt2)))) {
                    wft_mt = mt2;
                }
                csome_list_var2 = csome_list_var2.rest();
                mt2 = csome_list_var2.first();
            } 
        }
        if (NIL == wft_mt) {
            final SubLObject _prev_bind_0 = $max_floor_mts_of_nat_exceptions$.currentBinding(thread);
            try {
                $max_floor_mts_of_nat_exceptions$.bind(mts_$158, thread);
                wft_mt = nat_wf_in_mts(cnat, NIL, NIL, ONE_INTEGER);
            } finally {
                $max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
            }
        }
        return wft_mt;
    }

    public static SubLObject nat_wf_default_mts(final SubLObject cnat, SubLObject independentP, SubLObject unindexedP) {
        if (independentP == UNPROVIDED) {
            independentP = NIL;
        }
        if (unindexedP == UNPROVIDED) {
            unindexedP = NIL;
        }
        if (NIL != independentP) {
            return genl_mts.min_mts(formula_forts_isa_mts(cnat, UNPROVIDED), UNPROVIDED);
        }
        SubLObject mt_sets = NIL;
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(cnat, T, UNPROVIDED, UNPROVIDED));
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == unindexed_syntax_constant_p(fort)) || (NIL != unindexedP)) {
                final SubLObject isa_mts = czer_main.fort_sort_by_type_and_id(isa.isa_mts(fort));
                if (NIL != isa_mts) {
                    final SubLObject item_var = isa_mts;
                    if (NIL == member(item_var, mt_sets, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        mt_sets = cons(item_var, mt_sets);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.cross_products(mt_sets);
        SubLObject mt_set = NIL;
        mt_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mts = nconc(mts, genl_mts.max_floor_mts(list_utilities.remove_duplicate_forts(mt_set), UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            mt_set = cdolist_list_var.first();
        } 
        return genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), UNPROVIDED);
    }

    public static SubLObject formula_forts_isa_mts(final SubLObject formula, SubLObject unindexedP) {
        if (unindexedP == UNPROVIDED) {
            unindexedP = NIL;
        }
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED));
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == unindexed_syntax_constant_p(fort)) || (NIL != unindexedP)) {
                mts = nconc(mts, isa.isa_mts(fort));
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        return list_utilities.remove_duplicate_forts(mts);
    }

    public static SubLObject at_mt_mt_relevantP(final SubLObject mt) {
        return mt_vars.mt_mt_relevantP(mt);
    }

    public static SubLObject mts_accommodating_nat(final SubLObject cnat, SubLObject validate_expansionP, SubLObject number) {
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return nat_wf_in_mts(cnat, NIL, validate_expansionP, number);
    }

    public static SubLObject nat_wf_in_mts(final SubLObject cnat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return max_floor_mts_of_nat(cnat, mt, validate_expansionP, number);
    }

    public static SubLObject clear_cached_max_floor_mts_of_nat() {
        final SubLObject cs = $cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_max_floor_mts_of_nat(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_max_floor_mts_of_nat_caching_state$.getGlobalValue(), list(nat, mt, validate_expansionP, number), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_max_floor_mts_of_nat_internal(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        return max_floor_mts_of_nat(nat, mt, validate_expansionP, number);
    }

    public static SubLObject cached_max_floor_mts_of_nat(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        SubLObject caching_state = $cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_MAX_FLOOR_MTS_OF_NAT, $cached_max_floor_mts_of_nat_caching_state$, NIL, EQL, FOUR_INTEGER, $int$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(nat, mt, validate_expansionP, number);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (nat.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (validate_expansionP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && number.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_max_floor_mts_of_nat_internal(nat, mt, validate_expansionP, number)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(nat, mt, validate_expansionP, number));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject fast_max_floor_mts_of_nat(final SubLObject cnat, SubLObject validate_expansionP) {
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(cnat)) {
            return fast_max_floor_mts_of_nat(narts_high.nart_hl_formula(cnat), validate_expansionP);
        }
        final SubLObject candidate_mts = nat_wf_default_mts(cnat, UNPROVIDED, UNPROVIDED);
        SubLObject mts = result_of_max_floor_mts_of_nat(cnat, candidate_mts, UNPROVIDED);
        final SubLObject _prev_bind_0 = $max_floor_mts_of_nat_exceptions$.currentBinding(thread);
        try {
            $max_floor_mts_of_nat_exceptions$.bind(candidate_mts, thread);
            if (NIL == mts) {
                mts = max_floor_mts_of_nat(cnat, NIL, validate_expansionP, UNPROVIDED);
            }
        } finally {
            $max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }

    public static SubLObject max_floor_mts_of_nat(final SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return max_floor_mts_of_naut(NIL != nart_handles.nart_p(nat) ? narts_high.nart_hl_formula(nat) : nat, mt, validate_expansionP, number);
    }

    public static SubLObject max_floor_mts_of_naut(final SubLObject naut, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_formula_p(naut)) {
            if (NIL != validate_expansionP) {
                final SubLObject expansion_mt = (NIL != mt) ? mt : $$EverythingPSC;
                final SubLObject naut_expansion = wff.wff_el_expansion(naut, expansion_mt);
                if ((NIL == naut_expansion) || naut.equal(naut_expansion)) {
                    return max_floor_mts_of_naut(naut, mt, NIL, number);
                }
                SubLObject candidate_mts = NIL;
                final SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                final SubLObject _prev_bind_3 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
                try {
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                    wff_vars.$unexpanded_formula$.bind(naut, thread);
                    wff_vars.$validate_expansionsP$.bind(NIL, thread);
                    wff_vars.$validating_expansionP$.bind(T, thread);
                    candidate_mts = max_floor_mts_of_nat(naut_expansion, mt, NIL, UNPROVIDED);
                } finally {
                    wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_3, thread);
                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_2, thread);
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
                }
                return result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
            } else {
                if (NIL == term.closed_fn_termP(naut)) {
                    if (NIL == wff_vars.validating_expansionP()) {
                        return NIL;
                    }
                    if (NIL == term.closed_fn_termP(wff_vars.unexpanded_formula())) {
                        return NIL;
                    }
                }
                if ((NIL != isa.result_isa_colP(cycl_utilities.nat_arg0(naut), $$Microtheory, mt)) && (NIL == at_mt_mt_relevantP(mt))) {
                    return max_floor_mts_of_naut(naut, mt_vars.$mt_mt$.getGlobalValue(), validate_expansionP, number);
                }
                return max_floor_mts_of_naut_int(naut, mt, number);
            }
        }
        return NIL;
    }

    public static SubLObject max_floor_mts_of_naut_int(final SubLObject naut, final SubLObject mt, final SubLObject number) {
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        final SubLObject fn_mts = nat_function_wff_mts(fn);
        SubLObject args_mts = list(fn_mts);
        SubLObject candidate_mts = (NIL != mt) ? candidate_mts_wrt(fn_mts, mt) : fn_mts;
        if (NIL == fn_mts) {
            return NIL;
        }
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(naut, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (fn.eql($$Kappa) && argnum.eql(ONE_INTEGER)) {
                if (NIL == collection_defns.cycl_var_listP(arg)) {
                    return NIL;
                }
            } else {
                final SubLObject arg_mts = admitted_arg_candidate_mt_sets(arg, argnum, fn, mt);
                if (NIL == arg_mts) {
                    return NIL;
                }
                args_mts = append(args_mts, arg_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = list_utilities.cross_products(list_utilities.fast_delete_duplicates(args_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject mt_set = NIL;
        mt_set = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            candidate_mts = append(candidate_mts, genl_mts.max_floor_mts(mt_set, UNPROVIDED, UNPROVIDED));
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt_set = cdolist_list_var2.first();
        } 
        candidate_mts = filter_excepted_nat_wff_mts(list_utilities.remove_duplicate_forts(candidate_mts));
        return result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
    }

    public static SubLObject admitted_arg_candidate_mt_sets(SubLObject arg, final SubLObject argnum, final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_mts = NIL;
        if ((NIL != nart_handles.nart_p(arg)) || (NIL != term.nautP(arg, UNPROVIDED))) {
            SubLObject nat_wf_mts = NIL;
            final SubLObject _prev_bind_0 = $max_floor_mts_of_nat_recursionP$.currentBinding(thread);
            try {
                $max_floor_mts_of_nat_recursionP$.bind(T, thread);
                nat_wf_mts = max_floor_mts_of_nat(arg, mt, UNPROVIDED, UNPROVIDED);
            } finally {
                $max_floor_mts_of_nat_recursionP$.rebind(_prev_bind_0, thread);
            }
            if (NIL == nat_wf_mts) {
                return NIL;
            }
            arg_mts = cons(nat_wf_mts, arg_mts);
        } else
            if (NIL != term.sentenceP(arg, UNPROVIDED)) {
                final SubLObject elf_mts = nat_formula_arg_wff_mts(arg);
                if (NIL == elf_mts) {
                    return NIL;
                }
                arg_mts = cons(elf_mts, arg_mts);
            }

        if (NIL != function_terms.nat_formula_p(arg)) {
            final SubLObject nart = narts_high.find_nart(arg);
            if (NIL != nart) {
                arg = nart;
            }
        }
        SubLObject cols = NIL;
        if (NIL != mt) {
            cols = kb_accessors.argn_isa_implied(reln, argnum, mt);
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                cols = kb_accessors.argn_isa_implied(reln, argnum, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (col.eql($$Thing)) {
                arg_mts = cons(list(mt_vars.$thing_defining_mt$.getGlobalValue()), arg_mts);
            } else {
                final SubLObject mts = nat_arg_wff_wrt_arg_isa_mts(arg, col);
                if (NIL != mts) {
                    arg_mts = cons(mts, arg_mts);
                } else
                    if ((NIL == $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) && (NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread))) {
                        return NIL;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        if ((NIL != forts.fort_p(arg)) || (NIL != term.first_order_nautP(arg))) {
            cols = NIL;
            if (NIL != mt) {
                cols = kb_accessors.argn_genl(reln, argnum, mt);
            } else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    cols = kb_accessors.argn_genl(reln, argnum, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cols;
            col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mts = nat_arg_wff_wrt_arg_genls_mts(arg, col);
                if (NIL != mts) {
                    arg_mts = cons(mts, arg_mts);
                } else
                    if ((NIL == $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) && (NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread))) {
                        return NIL;
                    }

                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
        }
        if (((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) && (NIL != kb_control_vars.within_forward_inferenceP())) && (NIL != wff.assertive_wff_ruleP(forward.current_forward_inference_rule()))) {
            return list(list($$UniversalVocabularyMt));
        }
        return arg_mts;
    }

    public static SubLObject result_of_max_floor_mts_of_nat(final SubLObject nat, final SubLObject candidate_mts, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        if (NIL != $max_floor_mts_of_nat_recursionP$.getDynamicValue(thread)) {
            return mt_vars.maximize_mts_wrt_core(candidate_mts);
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            if ((NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) && (NIL == doneP)) {
                SubLObject csome_list_var = candidate_mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL == genl_mts.any_genl_mtP(mt, mts, UNPROVIDED, UNPROVIDED)) && (NIL != wff.el_strictly_wft_fastP(nat, mt))) {
                        mts = cons(mt, mts);
                        if (NIL != subl_promotions.positive_integer_p(number)) {
                            count = add(count, ONE_INTEGER);
                            doneP = numGE(count, number);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
            if (((NIL == mts) && (NIL == wff_vars.wff_strictP())) && (NIL == doneP)) {
                SubLObject csome_list_var = candidate_mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL == genl_mts.any_genl_mtP(mt, mts, UNPROVIDED, UNPROVIDED)) && (NIL != wff.el_wft_fastP(nat, mt))) {
                        mts = cons(mt, mts);
                        if (NIL != subl_promotions.positive_integer_p(number)) {
                            count = add(count, ONE_INTEGER);
                            doneP = numGE(count, number);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(mts, UNPROVIDED);
    }

    public static SubLObject max_floor_mts_of_admitted_arg(final SubLObject arg, final SubLObject argnum, final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject reln_mts = relation_wff_mts(reln);
        if (NIL != reln_mts) {
            final SubLObject arg_mt_sets = admitted_arg_candidate_mt_sets(arg, argnum, reln, mt);
            if (NIL != arg_mt_sets) {
                final SubLObject mt_sets = cons(reln_mts, arg_mt_sets);
                SubLObject candidate_mts = NIL;
                SubLObject cdolist_list_var = list_utilities.cross_products(delete_duplicates(mt_sets, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject mt_set = NIL;
                mt_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    candidate_mts = append(candidate_mts, genl_mts.max_floor_mts(mt_set, UNPROVIDED, UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_set = cdolist_list_var.first();
                } 
                candidate_mts = list_utilities.remove_duplicate_forts(candidate_mts);
                if ((NIL != nart_handles.nart_p(arg)) || (NIL != possibly_naut_p(arg))) {
                    return result_of_max_floor_mts_of_nat(arg, candidate_mts, UNPROVIDED);
                }
                return genl_mts.max_mts(candidate_mts, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject max_floor_mts_of_nat_benchmark(final SubLObject n) {
        final SubLObject narts = get_random_nart_set(n);
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject set_contents_var = set.do_set_internal(narts);
        SubLObject basis_object;
        SubLObject state;
        SubLObject nart;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            nart = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                max_floor_mts_of_nat(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return number_utilities.float_n(divide(time, n), TWO_INTEGER);
    }

    public static SubLObject get_random_nart_set(final SubLObject n) {
        final SubLObject narts = set.new_set(EQL, n);
        while (n.numG(set.set_size(narts))) {
            final SubLObject nart = narts_high.random_nart(UNPROVIDED);
            if (NIL == set.set_memberP(nart, narts)) {
                set.set_add(nart, narts);
            }
        } 
        return narts;
    }

    public static SubLObject max_floor_mts_of_admitted_arg_benchmark(SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        final SubLObject support_data = get_admitted_by_supports();
        final SubLObject count = length(support_data);
        SubLObject time = NIL;
        SubLObject result = NIL;
        final SubLObject time_var = get_internal_real_time();
        SubLObject cdolist_list_var = (n.isInteger()) ? list_utilities.first_n(n, support_data) : support_data;
        SubLObject support_datum = NIL;
        support_datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion = support_datum.first();
            final SubLObject admitted_argument_gaf = third(support_datum);
            final SubLObject arg = cycl_utilities.sentence_arg1(admitted_argument_gaf, UNPROVIDED);
            final SubLObject argnum = cycl_utilities.sentence_arg2(admitted_argument_gaf, UNPROVIDED);
            final SubLObject reln = cycl_utilities.sentence_arg3(admitted_argument_gaf, UNPROVIDED);
            final SubLObject mts = max_floor_mts_of_admitted_arg(arg, argnum, reln, UNPROVIDED);
            if ((NIL == list_utilities.singletonP(mts)) || (NIL == genl_mts.genl_mtP(assertions_high.assertion_mt(assertion), mts.first(), UNPROVIDED, UNPROVIDED))) {
                result = cons(list(assertion, admitted_argument_gaf, mts), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support_datum = cdolist_list_var.first();
        } 
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        cdolist_list_var = result;
        SubLObject data = NIL;
        data = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str151$___S_____S_____s__, new SubLObject[]{ data.first(), second(data), third(data) });
            cdolist_list_var = cdolist_list_var.rest();
            data = cdolist_list_var.first();
        } 
        print(length(support_data), UNPROVIDED);
        return number_utilities.float_n(divide(time, count), TWO_INTEGER);
    }

    public static SubLObject get_admitted_by_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitted_by_supports = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$mapping_Cyc_arguments;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$159 = idx;
                if (NIL == id_index_objects_empty_p(idx_$159, $SKIP)) {
                    final SubLObject idx_$160 = idx_$159;
                    if (NIL == id_index_dense_objects_empty_p(idx_$160, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$160);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        SubLObject cdolist_list_var;
                        SubLObject argument;
                        SubLObject cdolist_list_var_$161;
                        SubLObject support;
                        SubLObject sentence;
                        SubLObject mt;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                argument = NIL;
                                argument = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != deduction_handles.deduction_p(argument)) {
                                        cdolist_list_var_$161 = deductions_high.deduction_supports(argument);
                                        support = NIL;
                                        support = cdolist_list_var_$161.first();
                                        while (NIL != cdolist_list_var_$161) {
                                            if ((NIL == assertion_handles.assertion_p(support)) && (NIL != arguments.hl_support_p(support))) {
                                                sentence = arguments.support_sentence(support);
                                                mt = arguments.support_mt(support);
                                                if ($$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence))) {
                                                    admitted_by_supports = cons(list(assertion, mt, sentence), admitted_by_supports);
                                                }
                                            }
                                            cdolist_list_var_$161 = cdolist_list_var_$161.rest();
                                            support = cdolist_list_var_$161.first();
                                        } 
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    argument = cdolist_list_var.first();
                                } 
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$161 = idx_$159;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$161)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$161);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$161);
                        final SubLObject end_id = id_index_next_id(idx_$161);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(assertion2);
                                SubLObject argument2 = NIL;
                                argument2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != deduction_handles.deduction_p(argument2)) {
                                        SubLObject cdolist_list_var_$162 = deductions_high.deduction_supports(argument2);
                                        SubLObject support2 = NIL;
                                        support2 = cdolist_list_var_$162.first();
                                        while (NIL != cdolist_list_var_$162) {
                                            if ((NIL == assertion_handles.assertion_p(support2)) && (NIL != arguments.hl_support_p(support2))) {
                                                final SubLObject sentence2 = arguments.support_sentence(support2);
                                                final SubLObject mt2 = arguments.support_mt(support2);
                                                if ($$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence2))) {
                                                    admitted_by_supports = cons(list(assertion2, mt2, sentence2), admitted_by_supports);
                                                }
                                            }
                                            cdolist_list_var_$162 = cdolist_list_var_$162.rest();
                                            support2 = cdolist_list_var_$162.first();
                                        } 
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    argument2 = cdolist_list_var2.first();
                                } 
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$164 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(admitted_by_supports, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nat_formula_arg_wff_mts(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            mts = filter_excepted_nat_wff_mts(mts_accommodating_formula_wrt_types(formula));
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }

    public static SubLObject nat_function_wff_mts(final SubLObject fn) {
        return isa.max_floor_mts_of_isa_paths(fn, $$Function_Denotational, UNPROVIDED);
    }

    public static SubLObject relation_wff_mts(final SubLObject reln) {
        return isa.max_floor_mts_of_isa_paths(reln, $$Relation, UNPROVIDED);
    }

    public static SubLObject candidate_mts_wrt(final SubLObject candidates, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(result, genl_mts.max_floor_mts(list(mt, candidate), UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        result = list_utilities.remove_duplicate_forts(result);
        return result;
    }

    public static SubLObject nat_arg_wff_wrt_arg_isa_mts(final SubLObject arg, final SubLObject col) {
        return isa.max_floor_mts_of_isa_paths(arg, col, UNPROVIDED);
    }

    public static SubLObject nat_arg_wff_wrt_arg_genls_mts(final SubLObject arg, final SubLObject col) {
        return genls.max_floor_mts_of_genls_paths(arg, col, UNPROVIDED);
    }

    public static SubLObject filter_excepted_nat_wff_mts(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.memberP(mt, $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    result = cons(mt, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
            return result;
        }
        return mts;
    }

    public static SubLObject at_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject at_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject at_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject at_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject min_anects(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.min_genls_of_type(col, $const159$AtemporalNecessarilyEssentialColl, mt, UNPROVIDED);
    }

    public static SubLObject union_min_anects(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.union_min_genls_of_type(cols, $const159$AtemporalNecessarilyEssentialColl, mt, UNPROVIDED);
    }

    public static SubLObject relation_arg_constraint_sentences(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        SubLObject cols = cdolist_list_var = kb_accessors.argn_isa_implied(relation, argnum, mt);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_ternary_formula($$argIsa, relation, argnum, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cols = cdolist_list_var = kb_accessors.argn_genl(relation, argnum, mt);
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_ternary_formula($$argGenl, relation, argnum, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    public static SubLObject variable_arity_relation_arg_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != fort_types_interface.variable_arity_relation_p(relation) : "fort_types_interface.variable_arity_relation_p(relation) " + "CommonSymbols.NIL != fort_types_interface.variable_arity_relation_p(relation) " + relation;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args_isa = cdolist_list_var = kb_accessors.args_isa(relation, mt);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(list($$argsIsa, relation, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        final SubLObject args_genl = cdolist_list_var = kb_accessors.args_genl(relation, mt);
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(list($$argsGenl, relation, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    public static SubLObject all_relation_arg_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != fort_types_interface.relation_p(relation) : "fort_types_interface.relation_p(relation) " + "CommonSymbols.NIL != fort_types_interface.relation_p(relation) " + relation;
        SubLObject constraints = NIL;
        final SubLObject max_arity = arity.max_arity(relation);
        if (NIL != max_arity) {
            SubLObject end_var;
            SubLObject argnum;
            SubLObject arg_constraints;
            for (end_var = number_utilities.f_1X(max_arity), argnum = NIL, argnum = ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                arg_constraints = relation_arg_constraint_sentences(relation, argnum, mt);
                constraints = nconc(nreverse(arg_constraints), constraints);
            }
        } else {
            constraints = variable_arity_relation_arg_constraint_sentences(relation, mt);
        }
        return nreverse(constraints);
    }

    public static SubLObject all_relation_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == fort_types_interface.relation_p(relation)) {
            return NIL;
        }
        return nconc(arity.relation_arity_constraint_sentences(relation), all_relation_arg_constraint_sentences(relation, mt));
    }

    public static SubLObject relation_term_arg_constraints(final SubLObject relation, final SubLObject v_term, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(relation) : "forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) " + relation;
        assert NIL != subl_promotions.positive_integer_p(argnum) : "subl_promotions.positive_integer_p(argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(argnum) " + argnum;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        SubLObject cols = cdolist_list_var = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_binary_formula($$isa, v_term, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cols = cdolist_list_var = kb_accessors.argn_genl(relation, argnum, mt);
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_binary_formula($$genls, v_term, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    public static SubLObject formula_arg_constraints_cycl(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject constraints = NIL;
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        if (NIL == forts.fort_p(relation)) {
            return list(listS($$isa, relation, $list169));
        }
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            final SubLObject arg_constraints = relation_term_arg_constraints(relation, arg, argnum, mt);
            constraints = nconc(nreverse(arg_constraints), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    public static SubLObject formula_variable_isa_constraint_alist(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_sentence = at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
        final SubLObject isa_constraint_alist = constraint_sentence_isa_constraints(constraint_sentence, mt);
        return isa_constraint_alist;
    }

    public static SubLObject constraint_sentence_isa_constraints(final SubLObject constraint_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject conjunction = (NIL != el_conjunction_p(constraint_sentence)) ? constraint_sentence : simplifier.conjoin(list(constraint_sentence), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(conjunction, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_with_operator_p(conjunct, $$isa)) {
                final SubLObject var = cycl_utilities.atomic_sentence_arg1(conjunct, UNPROVIDED);
                final SubLObject col = cycl_utilities.atomic_sentence_arg2(conjunct, UNPROVIDED);
                assert NIL != cycl_variables.cyc_varP(var) : "cycl_variables.cyc_varP(var) " + "CommonSymbols.NIL != cycl_variables.cyc_varP(var) " + var;
                dictionary_utilities.dictionary_push(dict, var, col);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        SubLObject alist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cols = thread.secondMultipleValue();
            thread.resetMultipleValues();
            alist = list_utilities.alist_enter(alist, var2, genls.min_cols(cols, mt, UNPROVIDED), UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return alist;
    }

    public static SubLObject possible_followup_variable_binding_sets(final SubLObject formula, final SubLObject followup_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        final SubLObject formula_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(formula, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject followup_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(followup_formula, mt, UNPROVIDED, UNPROVIDED);
        SubLObject cur_isa_constraints = NIL;
        SubLObject cur_genls_constraints = NIL;
        SubLObject var_score = NIL;
        SubLObject bindings_list = NIL;
        SubLObject cur_followup_isa_constraints = NIL;
        SubLObject cur_followup_genls_constraints = NIL;
        SubLObject cur_followup_quoted_isa_constraints = NIL;
        final SubLObject sentence_variables = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject followup_variables = sentence_free_variables(followup_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject possible_bindings = dictionary.new_dictionary(EQL, length(sentence_variables));
        SubLObject cdolist_list_var = sentence_variables;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject datum_evaluated_var = dictionary.dictionary_lookup(formula_constraints_dictionary, var, UNPROVIDED);
            cur_isa_constraints = datum_evaluated_var.first();
            cur_genls_constraints = cadr(datum_evaluated_var);
            SubLObject cdolist_list_var_$165 = followup_variables;
            SubLObject followup_var = NIL;
            followup_var = cdolist_list_var_$165.first();
            while (NIL != cdolist_list_var_$165) {
                final SubLObject datum_evaluated_var2 = dictionary.dictionary_lookup(followup_constraints_dictionary, followup_var, UNPROVIDED);
                cur_followup_isa_constraints = datum_evaluated_var2.first();
                cur_followup_genls_constraints = cadr(datum_evaluated_var2);
                cur_followup_quoted_isa_constraints = cddr(datum_evaluated_var2).first();
                if ((NIL == disjoint_with.any_disjoint_with_anyP(cur_isa_constraints, cur_followup_isa_constraints, mt, UNPROVIDED, UNPROVIDED)) && (NIL == disjoint_with.any_disjoint_with_anyP(cur_genls_constraints, cur_followup_genls_constraints, mt, UNPROVIDED, UNPROVIDED))) {
                    var_score = isas_and_genls_similarity(cur_isa_constraints, cur_followup_isa_constraints, cur_genls_constraints, cur_followup_genls_constraints, mt);
                    dictionary_utilities.dictionary_push(possible_bindings, var, list(followup_var, var_score));
                }
                cdolist_list_var_$165 = cdolist_list_var_$165.rest();
                followup_var = cdolist_list_var_$165.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        bindings_list = cdolist_list_var = calc_possible_followup_binding_sets(possible_bindings, NIL, NIL);
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(similarity_for_variable_binding_set(binding_set, formula, followup_formula, mt), binding_set), result);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return Sort.sort(result, symbol_function(VARIABLE_BINDING_SET_ITEM_COMPARATOR), UNPROVIDED);
    }

    public static SubLObject variable_binding_set_item_comparator(final SubLObject item_a, final SubLObject item_b) {
        return funcall(symbol_function($sym141$_), item_a.first(), item_b.first());
    }

    public static SubLObject calc_possible_followup_binding_sets(SubLObject bindings_dict, SubLObject bindings_list, SubLObject working_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        bindings_dict = dictionary_utilities.copy_dictionary(bindings_dict);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(bindings_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cur_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_remove(bindings_dict, var);
            SubLObject cdolist_list_var = cur_bindings;
            SubLObject cur_binding = NIL;
            cur_binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cur_binding = cons(var, cur_binding);
                working_bindings = cons(cur_binding, working_bindings);
                bindings_list = calc_possible_followup_binding_sets(dictionary_utilities.copy_dictionary(bindings_dict), bindings_list, working_bindings);
                bindings_list = cons(working_bindings, bindings_list);
                working_bindings = working_bindings.rest();
                cdolist_list_var = cdolist_list_var.rest();
                cur_binding = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return bindings_list;
    }

    public static SubLObject count_followup_bindings(final SubLObject variable_binding_set) {
        SubLObject bindings_list = NIL;
        SubLObject cdolist_list_var = variable_binding_set;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            bindings_list = cons(second(binding), bindings_list);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return length(remove_duplicates(bindings_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject similarity_for_variable_binding_set(final SubLObject variable_binding_set, final SubLObject formula, final SubLObject followup_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == variable_binding_set) {
            return ZERO_INTEGER;
        }
        final SubLObject formula_var_count = length(literal_variables(formula, UNPROVIDED, UNPROVIDED));
        final SubLObject followup_var_count = length(literal_variables(followup_formula, UNPROVIDED, UNPROVIDED));
        final SubLObject bindings_count_for_formula = length(variable_binding_set);
        final SubLObject bindings_count_for_followup = count_followup_bindings(variable_binding_set);
        SubLObject variable_bindings_score = ZERO_INTEGER;
        SubLObject formula_variable_usage_score = ZERO_INTEGER;
        SubLObject followup_variable_usage_score = ZERO_INTEGER;
        if (formula_var_count.eql(ZERO_INTEGER)) {
            formula_variable_usage_score = $int$100;
        } else {
            formula_variable_usage_score = multiply($int$100, divide(bindings_count_for_formula, formula_var_count));
        }
        if (followup_var_count.eql(ZERO_INTEGER)) {
            followup_variable_usage_score = $int$100;
        } else {
            followup_variable_usage_score = multiply($int$100, divide(bindings_count_for_followup, formula_var_count));
        }
        SubLObject cdolist_list_var = variable_binding_set;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            variable_bindings_score = add(variable_bindings_score, third(binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        variable_bindings_score = divide(variable_bindings_score, bindings_count_for_formula);
        return divide(add(variable_bindings_score, divide(add(formula_variable_usage_score, followup_variable_usage_score), TWO_INTEGER)), TWO_INTEGER);
    }

    public static SubLObject constraint_similarity(final SubLObject constraints1, final SubLObject constraints2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL == constraints1) || (NIL == constraints2)) {
            return ONE_INTEGER;
        }
        final SubLObject max_generality = log(cardinality_estimates.generality_estimate($$Thing), UNPROVIDED);
        final SubLObject min_gen_constraints1 = max(ONE_INTEGER, cardinality_estimates.generality_estimate(constraints1.first()));
        final SubLObject min_gen_constraints2 = max(ONE_INTEGER, cardinality_estimates.generality_estimate(constraints2.first()));
        if (min_gen_constraints1.numL(min_gen_constraints2)) {
            return ONE_INTEGER;
        }
        final SubLObject constraint_diff = abs(subtract(log(min_gen_constraints1, UNPROVIDED), log(min_gen_constraints2, UNPROVIDED)));
        SubLObject score = subtract($int$100, multiply(divide(constraint_diff, max_generality), $int$100));
        if (constraint_diff.numL($float$0_01)) {
            score = $int$100;
        }
        return score;
    }

    public static SubLObject isa_constraint_similarity(final SubLObject isas1, final SubLObject isas2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return constraint_similarity(isas1, isas2, mt);
    }

    public static SubLObject genls_constraint_similarity(final SubLObject genls1, final SubLObject genls2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return constraint_similarity(genls1, genls2, mt);
    }

    public static SubLObject isas_and_genls_similarity(final SubLObject isas1, final SubLObject isas2, final SubLObject genls1, final SubLObject genls2, final SubLObject mt) {
        if ((((NIL == isas1) && (NIL == isas2)) && (NIL == genls1)) && (NIL == genls2)) {
            return ONE_INTEGER;
        }
        if ((NIL == isas1) && (NIL == isas2)) {
            return genls_constraint_similarity(genls1, genls2, mt);
        }
        if ((NIL == genls1) && (NIL == genls2)) {
            return isa_constraint_similarity(isas1, isas2, mt);
        }
        final SubLObject isa_score = isa_constraint_similarity(isas1, isas2, mt);
        final SubLObject genls_score = genls_constraint_similarity(genls1, genls2, mt);
        return divide(add(isa_score, genls_score), TWO_INTEGER);
    }

    public static SubLObject more_specific_p(final SubLObject specific, final SubLObject general, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != mt) && (NIL != isa.isaP(specific, general, mt, UNPROVIDED))) {
            return T;
        }
        if ((NIL != mt) && (NIL != genls.genlsP(specific, general, mt, UNPROVIDED))) {
            return T;
        }
        if (((NIL != mt) && (NIL != forts.fort_p(specific))) && (NIL != genl_predicates.genl_predicateP(specific, general, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (NIL != isa.isa_in_any_mtP(specific, general)) {
            return T;
        }
        if (NIL != genls.genl_in_any_mtP(specific, general)) {
            return T;
        }
        if ((NIL != forts.fort_p(specific)) && (NIL != genl_predicates.genl_predicate_in_any_mtP(specific, general))) {
            return T;
        }
        if ((NIL != genls.genl_in_any_mtP(general, $$Number_General)) && specific.isNumber()) {
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_at_utilities_file() {
        declareFunction(me, "arg_n_predicate", "ARG-N-PREDICATE", 1, 0, false);
        declareFunction(me, "arg_type_mt", "ARG-TYPE-MT", 4, 0, false);
        declareFunction(me, "find_generic_arg_by_id", "FIND-GENERIC-ARG-BY-ID", 1, 0, false);
        declareFunction(me, "find_generic_arg_id", "FIND-GENERIC-ARG-ID", 1, 0, false);
        declareFunction(me, "store_generic_arg", "STORE-GENERIC-ARG", 2, 0, false);
        declareFunction(me, "stored_generic_arg_p", "STORED-GENERIC-ARG-P", 1, 0, false);
        declareFunction(me, "get_generic_arg", "GET-GENERIC-ARG", 1, 0, false);
        declareFunction(me, "generic_arg_num", "GENERIC-ARG-NUM", 1, 0, false);
        declareFunction(me, "generic_argP", "GENERIC-ARG?", 1, 0, false);
        declareFunction(me, "inter_arg_isa_pred", "INTER-ARG-ISA-PRED", 2, 0, false);
        declareFunction(me, "inter_arg_isa_inverse", "INTER-ARG-ISA-INVERSE", 2, 0, false);
        declareFunction(me, "inter_arg_not_isa_pred", "INTER-ARG-NOT-ISA-PRED", 2, 0, false);
        declareFunction(me, "inter_arg_not_isa_inverse", "INTER-ARG-NOT-ISA-INVERSE", 2, 0, false);
        declareFunction(me, "inter_arg_genl_pred", "INTER-ARG-GENL-PRED", 2, 0, false);
        declareFunction(me, "inter_arg_not_genl_pred", "INTER-ARG-NOT-GENL-PRED", 2, 0, false);
        declareFunction(me, "inter_arg_isa_genl_pred", "INTER-ARG-ISA-GENL-PRED", 2, 0, false);
        declareFunction(me, "inter_arg_genl_isa_pred", "INTER-ARG-GENL-ISA-PRED", 2, 0, false);
        declareFunction(me, "inter_arg_genl_inverse", "INTER-ARG-GENL-INVERSE", 2, 0, false);
        declareFunction(me, "implication_opP", "IMPLICATION-OP?", 1, 0, false);
        declareFunction(me, "logical_opP", "LOGICAL-OP?", 1, 0, false);
        declareFunction(me, "truth_functionP", "TRUTH-FUNCTION?", 1, 0, false);
        declareFunction(me, "initialize_all_arg_type_predicate_caches", "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        declareFunction(me, "clear_all_arg_type_predicate_caches", "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        declareFunction(me, "arg_isa_binary_predP", "ARG-ISA-BINARY-PRED?", 1, 1, false);
        declareFunction(me, "arg_isa_ternary_predP", "ARG-ISA-TERNARY-PRED?", 1, 1, false);
        declareFunction(me, "arg_isa_predicateP", "ARG-ISA-PREDICATE?", 1, 1, false);
        declareFunction(me, "arg_genl_binary_predP", "ARG-GENL-BINARY-PRED?", 1, 1, false);
        declareFunction(me, "arg_genl_ternary_predP", "ARG-GENL-TERNARY-PRED?", 1, 1, false);
        declareFunction(me, "arg_genl_predicateP", "ARG-GENL-PREDICATE?", 1, 1, false);
        declareFunction(me, "formula_denoting_functionP", "FORMULA-DENOTING-FUNCTION?", 1, 1, false);
        declareFunction(me, "formula_functorP", "FORMULA-FUNCTOR?", 1, 1, false);
        declareFunction(me, "sentence_denoting_functionP", "SENTENCE-DENOTING-FUNCTION?", 1, 1, false);
        declareFunction(me, "sentence_functorP", "SENTENCE-FUNCTOR?", 1, 1, false);
        declareFunction(me, "argn_type_levelP", "ARGN-TYPE-LEVEL?", 2, 1, false);
        declareFunction(me, "min_genl_preds_admitting_fort_as_arg", "MIN-GENL-PREDS-ADMITTING-FORT-AS-ARG", 3, 1, false);
        declareFunction(me, "forts_admitted_as_arg", "FORTS-ADMITTED-AS-ARG", 3, 3, false);
        declareFunction(me, "min_implicit_types", "MIN-IMPLICIT-TYPES", 1, 1, false);
        declareFunction(me, "term_requires_isa_in_relations", "TERM-REQUIRES-ISA-IN-RELATIONS", 2, 2, false);
        declareFunction(me, "term_requires_genl_in_relations", "TERM-REQUIRES-GENL-IN-RELATIONS", 2, 2, false);
        declareFunction(me, "term_requires_types_in_relations", "TERM-REQUIRES-TYPES-IN-RELATIONS", 2, 2, false);
        declareFunction(me, "term_requires_isa_in_clause", "TERM-REQUIRES-ISA-IN-CLAUSE", 2, 1, false);
        declareFunction(me, "term_requires_isa_in_relation", "TERM-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        declareFunction(me, "term_requires_isa_in_formula", "TERM-REQUIRES-ISA-IN-FORMULA", 2, 2, false);
        declareFunction(me, "term_requires_genl_in_relation", "TERM-REQUIRES-GENL-IN-RELATION", 2, 1, false);
        declareFunction(me, "get_sub_expression_for_term_position", "GET-SUB-EXPRESSION-FOR-TERM-POSITION", 2, 0, false);
        declareFunction(me, "term_position_requires_types_in_relation", "TERM-POSITION-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        declareFunction(me, "term_requires_types_in_relation", "TERM-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        declareFunction(me, "arg_requires_isa_in_relation", "ARG-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        declareFunction(me, "pred_arg_isa_requires_other_arg_isa", "PRED-ARG-ISA-REQUIRES-OTHER-ARG-ISA", 3, 1, false);
        declareFunction(me, "make_el_query_literal", "MAKE-EL-QUERY-LITERAL", 1, 0, false);
        declareFunction(me, "arg_isa_applicable_gafs", "ARG-ISA-APPLICABLE-GAFS", 1, 0, false);
        declareFunction(me, "gather_via_map_pred_index", "GATHER-VIA-MAP-PRED-INDEX", 1, 0, false);
        declareFunction(me, "inter_arg_isa_cache_initializedP", "INTER-ARG-ISA-CACHE-INITIALIZED?", 0, 0, false);
        declareFunction(me, "some_inter_arg_isa_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        declareFunction(me, "some_inter_arg_isa_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        declareFunction(me, "some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        declareFunction(me, "some_inter_arg_isa_assertion_somewhere_cache_add", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        declareFunction(me, "some_inter_arg_isa_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        declareFunction(me, "clear_some_inter_arg_isa_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction(me, "initialize_some_inter_arg_isa_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction(me, "some_inter_arg_isa_assertion_somewhereP", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "some_inter_arg_isa_constraint_somewhereP", "SOME-INTER-ARG-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "inter_arg_format_cache_initializedP", "INTER-ARG-FORMAT-CACHE-INITIALIZED?", 0, 0, false);
        declareFunction(me, "some_inter_arg_format_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        declareFunction(me, "some_inter_arg_format_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        declareFunction(me, "some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        declareFunction(me, "some_inter_arg_format_assertion_somewhere_cache_add", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        declareFunction(me, "some_inter_arg_format_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        declareFunction(me, "clear_some_inter_arg_format_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction(me, "initialize_some_inter_arg_format_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction(me, "some_inter_arg_format_assertion_somewhereP", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "some_inter_arg_format_constraint_somewhereP", "SOME-INTER-ARG-FORMAT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "reln_permits_generic_arg_variablesP", "RELN-PERMITS-GENERIC-ARG-VARIABLES?", 2, 0, false);
        declareFunction(me, "reln_permits_keyword_variablesP", "RELN-PERMITS-KEYWORD-VARIABLES?", 2, 0, false);
        declareFunction(me, "reln_constrained_to_be_collectionP", "RELN-CONSTRAINED-TO-BE-COLLECTION?", 3, 0, false);
        declareFunction(me, "constraint_pred_constraint_argnum", "CONSTRAINT-PRED-CONSTRAINT-ARGNUM", 1, 0, false);
        declareFunction(me, "gaf_arg_type_constraint", "GAF-ARG-TYPE-CONSTRAINT", 1, 0, false);
        declareFunction(me, "gather_at_data", "GATHER-AT-DATA", 2, 2, false);
        declareFunction(me, "gather_at_data_assertion", "GATHER-AT-DATA-ASSERTION", 1, 2, false);
        declareFunction(me, "gather_at_constraint", "GATHER-AT-CONSTRAINT", 1, 2, false);
        declareFunction(me, "gather_at_assertion", "GATHER-AT-ASSERTION", 1, 2, false);
        declareFunction(me, "at_finishedP", "AT-FINISHED?", 0, 1, false);
        declareFunction(me, "at_finished", "AT-FINISHED", 0, 1, false);
        declareFunction(me, "at_mapping_finished", "AT-MAPPING-FINISHED", 0, 0, false);
        declareFunction(me, "at_handle_mal_constraint", "AT-HANDLE-MAL-CONSTRAINT", 1, 0, false);
        declareFunction(me, "at_mal_arg_msg", "AT-MAL-ARG-MSG", 1, 0, false);
        declareFunction(me, "predicate_isa_violation_data", "PREDICATE-ISA-VIOLATION-DATA", 1, 1, false);
        declareFunction(me, "meta_predicate_violation_data", "META-PREDICATE-VIOLATION-DATA", 1, 1, false);
        declareFunction(me, "semantic_violations", "SEMANTIC-VIOLATIONS", 0, 0, false);
        declareFunction(me, "note_at_violationP", "NOTE-AT-VIOLATION?", 0, 0, false);
        declareFunction(me, "note_at_violation", "NOTE-AT-VIOLATION", 1, 0, false);
        declareFunction(me, "recursive_violationP", "RECURSIVE-VIOLATION?", 1, 0, false);
        declareFunction(me, "reset_at_violations", "RESET-AT-VIOLATIONS", 0, 1, false);
        declareFunction(me, "reset_arity_violations", "RESET-ARITY-VIOLATIONS", 0, 1, false);
        declareFunction(me, "reset_semantic_violations", "RESET-SEMANTIC-VIOLATIONS", 0, 1, false);
        declareFunction(me, "reset_at_state", "RESET-AT-STATE", 0, 0, false);
        declareFunction(me, "suggest_formula_fix_for_at_violation", "SUGGEST-FORMULA-FIX-FOR-AT-VIOLATION", 2, 0, false);
        declareFunction(me, "assertion_arg_violations_among", "ASSERTION-ARG-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction(me, "sef_violations_among", "SEF-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction(me, "predicate_violations_among", "PREDICATE-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction(me, "assertion_arg_violationP", "ASSERTION-ARG-VIOLATION?", 1, 0, false);
        declareFunction(me, "assertion_collectionP", "ASSERTION-COLLECTION?", 1, 1, false);
        declareFunction(me, "sef_violationP", "SEF-VIOLATION?", 1, 0, false);
        declareFunction(me, "predicate_violationP", "PREDICATE-VIOLATION?", 1, 0, false);
        declareFunction(me, "assertion_arg_violation_fix", "ASSERTION-ARG-VIOLATION-FIX", 1, 0, false);
        declareFunction(me, "strip_mt_literals", "STRIP-MT-LITERALS", 1, 1, false);
        declareFunction(me, "sef_violation_fix", "SEF-VIOLATION-FIX", 1, 0, false);
        declareFunction(me, "predicate_violation_fix", "PREDICATE-VIOLATION-FIX", 1, 0, false);
        declareFunction(me, "violation_type", "VIOLATION-TYPE", 1, 0, false);
        declareFunction(me, "mts_accommodating_formula_wrt_types", "MTS-ACCOMMODATING-FORMULA-WRT-TYPES", 1, 0, false);
        declareFunction(me, "nat_wf_in_some_mtP", "NAT-WF-IN-SOME-MT?", 1, 2, false);
        declareFunction(me, "nat_wf_in_some_mt", "NAT-WF-IN-SOME-MT", 1, 2, false);
        declareFunction(me, "nat_wf_default_mts", "NAT-WF-DEFAULT-MTS", 1, 2, false);
        declareFunction(me, "formula_forts_isa_mts", "FORMULA-FORTS-ISA-MTS", 1, 1, false);
        declareFunction(me, "at_mt_mt_relevantP", "AT-MT-MT-RELEVANT?", 1, 0, false);
        declareFunction(me, "mts_accommodating_nat", "MTS-ACCOMMODATING-NAT", 1, 2, false);
        declareFunction(me, "nat_wf_in_mts", "NAT-WF-IN-MTS", 1, 3, false);
        declareFunction(me, "clear_cached_max_floor_mts_of_nat", "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT", 0, 0, false);
        declareFunction(me, "remove_cached_max_floor_mts_of_nat", "REMOVE-CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        declareFunction(me, "cached_max_floor_mts_of_nat_internal", "CACHED-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 4, 0, false);
        declareFunction(me, "cached_max_floor_mts_of_nat", "CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        declareFunction(me, "fast_max_floor_mts_of_nat", "FAST-MAX-FLOOR-MTS-OF-NAT", 1, 1, false);
        declareFunction(me, "max_floor_mts_of_nat", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
        declareFunction(me, "max_floor_mts_of_naut", "MAX-FLOOR-MTS-OF-NAUT", 4, 0, false);
        declareFunction(me, "max_floor_mts_of_naut_int", "MAX-FLOOR-MTS-OF-NAUT-INT", 3, 0, false);
        declareFunction(me, "admitted_arg_candidate_mt_sets", "ADMITTED-ARG-CANDIDATE-MT-SETS", 3, 1, false);
        declareFunction(me, "result_of_max_floor_mts_of_nat", "RESULT-OF-MAX-FLOOR-MTS-OF-NAT", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_admitted_arg", "MAX-FLOOR-MTS-OF-ADMITTED-ARG", 3, 1, false);
        declareFunction(me, "max_floor_mts_of_nat_benchmark", "MAX-FLOOR-MTS-OF-NAT-BENCHMARK", 1, 0, false);
        declareFunction(me, "get_random_nart_set", "GET-RANDOM-NART-SET", 1, 0, false);
        declareFunction(me, "max_floor_mts_of_admitted_arg_benchmark", "MAX-FLOOR-MTS-OF-ADMITTED-ARG-BENCHMARK", 0, 1, false);
        declareFunction(me, "get_admitted_by_supports", "GET-ADMITTED-BY-SUPPORTS", 0, 0, false);
        declareFunction(me, "nat_formula_arg_wff_mts", "NAT-FORMULA-ARG-WFF-MTS", 1, 0, false);
        declareFunction(me, "nat_function_wff_mts", "NAT-FUNCTION-WFF-MTS", 1, 0, false);
        declareFunction(me, "relation_wff_mts", "RELATION-WFF-MTS", 1, 0, false);
        declareFunction(me, "candidate_mts_wrt", "CANDIDATE-MTS-WRT", 2, 0, false);
        declareFunction(me, "nat_arg_wff_wrt_arg_isa_mts", "NAT-ARG-WFF-WRT-ARG-ISA-MTS", 2, 0, false);
        declareFunction(me, "nat_arg_wff_wrt_arg_genls_mts", "NAT-ARG-WFF-WRT-ARG-GENLS-MTS", 2, 0, false);
        declareFunction(me, "filter_excepted_nat_wff_mts", "FILTER-EXCEPTED-NAT-WFF-MTS", 1, 0, false);
        declareFunction(me, "at_note", "AT-NOTE", 2, 5, false);
        declareFunction(me, "at_error", "AT-ERROR", 2, 5, false);
        declareFunction(me, "at_cerror", "AT-CERROR", 3, 5, false);
        declareFunction(me, "at_warn", "AT-WARN", 2, 5, false);
        declareFunction(me, "min_anects", "MIN-ANECTS", 1, 1, false);
        declareFunction(me, "union_min_anects", "UNION-MIN-ANECTS", 1, 1, false);
        declareFunction(me, "relation_arg_constraint_sentences", "RELATION-ARG-CONSTRAINT-SENTENCES", 2, 1, false);
        declareFunction(me, "variable_arity_relation_arg_constraint_sentences", "VARIABLE-ARITY-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction(me, "all_relation_arg_constraint_sentences", "ALL-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction(me, "all_relation_constraint_sentences", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction(me, "relation_term_arg_constraints", "RELATION-TERM-ARG-CONSTRAINTS", 3, 1, false);
        declareFunction(me, "formula_arg_constraints_cycl", "FORMULA-ARG-CONSTRAINTS-CYCL", 1, 1, false);
        declareFunction(me, "formula_variable_isa_constraint_alist", "FORMULA-VARIABLE-ISA-CONSTRAINT-ALIST", 2, 0, false);
        declareFunction(me, "constraint_sentence_isa_constraints", "CONSTRAINT-SENTENCE-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "possible_followup_variable_binding_sets", "POSSIBLE-FOLLOWUP-VARIABLE-BINDING-SETS", 2, 1, false);
        declareFunction(me, "variable_binding_set_item_comparator", "VARIABLE-BINDING-SET-ITEM-COMPARATOR", 2, 0, false);
        declareFunction(me, "calc_possible_followup_binding_sets", "CALC-POSSIBLE-FOLLOWUP-BINDING-SETS", 3, 0, false);
        declareFunction(me, "count_followup_bindings", "COUNT-FOLLOWUP-BINDINGS", 1, 0, false);
        declareFunction(me, "similarity_for_variable_binding_set", "SIMILARITY-FOR-VARIABLE-BINDING-SET", 3, 1, false);
        declareFunction(me, "constraint_similarity", "CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction(me, "isa_constraint_similarity", "ISA-CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction(me, "genls_constraint_similarity", "GENLS-CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction(me, "isas_and_genls_similarity", "ISAS-AND-GENLS-SIMILARITY", 5, 0, false);
        declareFunction(me, "more_specific_p", "MORE-SPECIFIC-P", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_at_utilities_file() {
        deflexical("*GENERIC-ARG-STORE*", SubLTrampolineFile.maybeDefault($generic_arg_store$, $generic_arg_store$, NIL));
        deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_inter_arg_isa_assertion_somewhere_cache$, $some_inter_arg_isa_assertion_somewhere_cache$, NIL));
        deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_inter_arg_format_assertion_somewhere_cache$, $some_inter_arg_format_assertion_somewhere_cache$, NIL));
        defparameter("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*", $int$40);
        defparameter("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*", NIL);
        deflexical("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*", NIL);
        defparameter("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*", NIL);
        return NIL;
    }

    public static SubLObject setup_at_utilities_file() {
        declare_defglobal($generic_arg_store$);
        declare_defglobal($some_inter_arg_isa_assertion_somewhere_cache$);
        declare_defglobal($some_inter_arg_format_assertion_somewhere_cache$);
        memoization_state.note_globally_cached_function(CACHED_MAX_FLOOR_MTS_OF_NAT);
        define_test_case_table_int(ALL_RELATION_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list182);
        define_test_case_table_int(ALL_RELATION_ARG_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list185);
        define_test_case_table_int(FORMULA_ARG_CONSTRAINTS_CYCL, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list187);
        sunit_external.define_test_suite($str188$Arg_Type_Utilities_Test_Suite, NIL, NIL, $list189);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_at_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_utilities_file();
    }

    static {






































































































































































































    }
}

/**
 * Total time: 2381 ms
 */
