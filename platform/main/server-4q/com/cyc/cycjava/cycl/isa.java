package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class isa extends SubLTranslatedFile {
    public static final SubLFile me = new isa();

    public static final String myName = "com.cyc.cycjava.cycl.isa";

    public static final String myFingerPrint = "c3c24719c025f301b9d847ba712f57de9dc816183179cbbb2da60b76ad52b03f";

    // defparameter
    private static final SubLSymbol $sbhl_may_return_naut_collections_as_fortsP$ = makeSymbol("*SBHL-MAY-RETURN-NAUT-COLLECTIONS-AS-FORTS?*");

    // defparameter
    // Result accumulator for all-isas-wrt
    private static final SubLSymbol $all_isas_wrt$ = makeSymbol("*ALL-ISAS-WRT*");

    // defparameter
    /**
     * Term which other terms must be instances to be included in the all-isas-wrt.
     */
    private static final SubLSymbol $all_isas_wrt_isa$ = makeSymbol("*ALL-ISAS-WRT-ISA*");

    // deflexical
    /**
     * If COLLECTION has more than (FORT-COUNT / THIS) many instances, sample
     * instead of generating all the instances.
     */
    private static final SubLSymbol $random_instance_of_sampling_ratio$ = makeSymbol("*RANDOM-INSTANCE-OF-SAMPLING-RATIO*");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));





    private static final SubLSymbol MIN_ISA = makeSymbol("MIN-ISA");

    private static final SubLList $list4 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str5$Returns_most_specific_collections = makeString("Returns most-specific collections that include TERM (inexpensive)");

    public static final SubLList $list6 = list(list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));

    private static final SubLList $list7 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));



    private static final SubLSymbol MAX_NOT_ISA = makeSymbol("MAX-NOT-ISA");

    private static final SubLString $str10$Returns_most_general_collections_ = makeString("Returns most-general collections that do not include TERM (expensive)");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLList $list14 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TV"), reader_make_constant_shell(makeString("True-JustificationTruth"))));

    private static final SubLString $str15$Returns_the_asserted_instances_of = makeString("Returns the asserted instances of COL");

    private static final SubLList $list16 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol MAX_INSTANCES = makeSymbol("MAX-INSTANCES");

    private static final SubLList $list18 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str19$Returns_the_maximal_among_the_ass = makeString("Returns the maximal among the asserted instances of COL");

    private static final SubLSymbol ALL_INSTANCES_WITH_MAX = makeSymbol("ALL-INSTANCES-WITH-MAX");



    private static final SubLSymbol $INVALID_ITERATION_TERM = makeKeyword("INVALID-ITERATION-TERM");

    private static final SubLSymbol MIN_NOT_INSTANCES = makeSymbol("MIN-NOT-INSTANCES");

    private static final SubLString $str24$Returns_the_most_specific_negated = makeString("Returns the most-specific negated instances of collection COL");

    private static final SubLSymbol ISA_SIBLINGS = makeSymbol("ISA-SIBLINGS");

    private static final SubLString $str26$Returns_the_direct_isas_of_those_ = makeString("Returns the direct isas of those collections of which TERM is a direct instance");

    private static final SubLSymbol INSTANCE_SIBLINGS = makeSymbol("INSTANCE-SIBLINGS");

    private static final SubLString $str28$Returns_the_direct_instances_of_t = makeString("Returns the direct instances of those collections having direct isa TERM");

    private static final SubLList $list29 = list(list(makeSymbol("TERM"), makeSymbol("EL-FORT-P")));





    private static final SubLString $str32$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str39$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str40$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");



    private static final SubLSymbol SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");

    public static final SubLList $list43 = list(makeSymbol("ISA"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list45 = list(makeUninternedSymbol("NAUT"), makeUninternedSymbol("ISA-MT"), makeUninternedSymbol("ISA-TV"));



    private static final SubLSymbol MAP_INSTANCES = makeSymbol("MAP-INSTANCES");

    public static final SubLList $list48 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str49$apply_FUNCTION_to_every__least_ge = makeString("apply FUNCTION to every (least general) #$isa of TERM");

    private static final SubLList $list50 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TERM"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol ALL_ISA = makeSymbol("ALL-ISA");

    private static final SubLString $str52$Returns_all_collections_that_incl = makeString("Returns all collections that include TERM (inexpensive)");

    private static final SubLList $list53 = list(list(makeSymbol("LIST"), makeSymbol("COLLECTION-P")));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLSymbol ALL_INSTANCES = makeSymbol("ALL-INSTANCES");

    private static final SubLString $str58$Returns_all_instances_of_COLLECTI = makeString("Returns all instances of COLLECTION (expensive)");

    private static final SubLList $list59 = list(list(makeSymbol("LIST"), makeSymbol("HL-TERM-P")));

    private static final SubLSymbol ALL_INSTANCES_IN_ALL_MTS = makeSymbol("ALL-INSTANCES-IN-ALL-MTS");

    private static final SubLList $list61 = list(makeSymbol("COLLECTION"));

    private static final SubLString $str62$_return_listp__all_instances_of_C = makeString("@return listp; all instances of COLLECTION in all mts.");

    private static final SubLList $list63 = list(list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol ALL_FORT_INSTANCES = makeSymbol("ALL-FORT-INSTANCES");

    public static final SubLList $list65 = list(makeSymbol("ALL-INSTANCES"));

    private static final SubLSymbol $sym66$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    private static final SubLSymbol ALL_FORT_INSTANCES_IN_ALL_MTS = makeSymbol("ALL-FORT-INSTANCES-IN-ALL-MTS");

    public static final SubLList $list68 = list(makeSymbol("ALL-INSTANCES-IN-ALL-MTS"));

    private static final SubLSymbol GATHER_ISA_WRT_ISA = makeSymbol("GATHER-ISA-WRT-ISA");

    private static final SubLSymbol ALL_ISAS_WRT = makeSymbol("ALL-ISAS-WRT");

    private static final SubLList $list71 = list(makeSymbol("TERM"), makeSymbol("ISA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str72$Returns_all_isa_of_term_TERM_that = makeString("Returns all isa of term TERM that are also instances of collection ISA (ascending transitive closure; inexpensive)");

    public static final SubLList $list73 = list(list(makeSymbol("TERM"), makeSymbol("EL-FORT-P")), list(makeSymbol("ISA"), makeSymbol("EL-FORT-P")));



    private static final SubLSymbol ISA_STORED_NAUT_ARG2_P = makeSymbol("ISA-STORED-NAUT-ARG2-P");

    private static final SubLSymbol UNION_ALL_ISA = makeSymbol("UNION-ALL-ISA");

    public static final SubLList $list77 = list(makeSymbol("TERMS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str78$Returns_all_collections_that_incl = makeString("Returns all collections that include any term in TERMS (inexpensive)");

    public static final SubLList $list79 = list(list(makeSymbol("TERMS"), makeSymbol("LISTP")));

    private static final SubLSymbol UNION_ALL_INSTANCES = makeSymbol("UNION-ALL-INSTANCES");

    public static final SubLList $list81 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str82$Returns_set_of_all_instances_of_e = makeString("Returns set of all instances of each collection in COLS (expensive)");

    public static final SubLList $list83 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));

    private static final SubLSymbol ALL_ISA_AMONG = makeSymbol("ALL-ISA-AMONG");

    public static final SubLList $list85 = list(makeSymbol("TERM"), makeSymbol("COLLECTIONS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str86$Returns_those_elements_of_COLLECT = makeString("Returns those elements of COLLECTIONS that include TERM as an all-instance");

    public static final SubLList $list87 = list(list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")), list(makeSymbol("COLLECTIONS"), makeSymbol("LISTP")));

    private static final SubLSymbol ALL_INSTANCES_AMONG = makeSymbol("ALL-INSTANCES-AMONG");

    private static final SubLList $list89 = list(makeSymbol("COL"), makeSymbol("TERMS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str90$Returns_those_elements_of_TERMS_t = makeString("Returns those elements of TERMS that include COL as an all-isa");

    private static final SubLList $list91 = list(list(makeSymbol("COL"), makeSymbol("HL-TERM-P")), list(makeSymbol("TERMS"), makeSymbol("LISTP")));

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol ALL_NOT_ISA = makeSymbol("ALL-NOT-ISA");

    private static final SubLString $str96$Returns_all_collections_that_do_n = makeString("Returns all collections that do not include TERM (expensive)");

    private static final SubLSymbol ALL_NOT_INSTANCES = makeSymbol("ALL-NOT-INSTANCES");

    private static final SubLString $str98$Returns_all_terms_that_are_not_me = makeString("Returns all terms that are not members of col (by assertion)");

    private static final SubLSymbol NOT_ISA_AMONG = makeSymbol("NOT-ISA-AMONG");

    private static final SubLString $str100$Returns_those_elements_of_COLLECT = makeString("Returns those elements of COLLECTIONS that do NOT include TERM");

    private static final SubLSymbol MAP_ALL_ISA = makeSymbol("MAP-ALL-ISA");

    private static final SubLList $list102 = list(makeSymbol("FN"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str103$Apply_FUNCTION_to_every_all_isa_o = makeString("Apply FUNCTION to every all-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)");

    private static final SubLList $list104 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));

    private static final SubLSymbol MAP_ALL_INSTANCES = makeSymbol("MAP-ALL-INSTANCES");

    public static final SubLList $list106 = list(makeSymbol("FN"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str107$Apply_FUNCTION_to_each_unique_ins = makeString("Apply FUNCTION to each unique instance of all specs of COLLECTION.");

    private static final SubLList $list108 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol ANY_WRT_ALL_ISA = makeSymbol("ANY-WRT-ALL-ISA");

    private static final SubLString $str110$Return_the_first_encountered_non_ = makeString("Return the first encountered non-nil result of applying FUNCTION to the all-isa of TERM\n   (FUNCTION may not affect the current sbhl search state)");

    public static final SubLList $list111 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));

    private static final SubLSymbol $sym112$ISA__GOAL = makeSymbol("ISA?-GOAL");







    public static final SubLList $list116 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str117$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol COUNT_ALL_INSTANCES = makeSymbol("COUNT-ALL-INSTANCES");

    private static final SubLList $list119 = list(makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str120$Counts_the_number_of_instances_in = makeString("Counts the number of instances in COLLECTION and then returns the count.");

    private static final SubLList $list121 = list(makeSymbol("INTEGERP"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLSymbol COUNT_ALL_QUOTED_INSTANCES = makeSymbol("COUNT-ALL-QUOTED-INSTANCES");

    private static final SubLString $str124$Counts_the_number_of_quoted_insta = makeString("Counts the number of quoted instances in COLLECTION and then returns the count.");

    private static final SubLObject $$CollectionIntersectionFn = reader_make_constant_shell(makeString("CollectionIntersectionFn"));

    private static final SubLSymbol $sym126$ISA_ = makeSymbol("ISA?");

    private static final SubLList $list127 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str128$Returns_whether_TERM_is_an_instan = makeString("Returns whether TERM is an instance of COLLECTION via the SBHL, i.e. isa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?");

    public static final SubLList $list129 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $sym130$ISA_IN_MTS_ = makeSymbol("ISA-IN-MTS?");

    private static final SubLList $list131 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("MTS"));

    private static final SubLString $str132$is__term__an_element_of__collecti = makeString("is <term> an element of <collection> via assertions in any mt in <mts>");

    private static final SubLSymbol $sym133$ISA_IN_ANY_MT_ = makeSymbol("ISA-IN-ANY-MT?");

    private static final SubLList $list134 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"));

    private static final SubLString $str135$is__term__an_element_of__collecti = makeString("is <term> an element of <collection> in any mt");

    private static final SubLSymbol $sym136$ANY_ISA_ = makeSymbol("ANY-ISA?");

    private static final SubLString $str137$Returns_whether_TERM_is_an_instan = makeString("Returns whether TERM is an instance of any collection in COLLECTIONS");

    private static final SubLSymbol $sym138$ISA_ANY_ = makeSymbol("ISA-ANY?");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLString $str140$_A_is_not_a_collection = makeString("~A is not a collection");

    private static final SubLSymbol $sym141$ANY_ISA_ANY_ = makeSymbol("ANY-ISA-ANY?");

    private static final SubLList $list142 = list(makeSymbol("TERMS"), makeSymbol("COLLECTIONS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str143$_return_booleanp__whether_any_ter = makeString("@return booleanp; whether any term in TERMS is an instance of any collection in COLLECTIONS");

    private static final SubLList $list144 = list(list(makeSymbol("TERMS"), makeSymbol("LISTP")), list(makeSymbol("COLLECTIONS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym145$NOT_ISA_ = makeSymbol("NOT-ISA?");

    private static final SubLString $str146$_return_booleanp__whether_TERM_is = makeString("@return booleanp; whether TERM is known to not be an instance of COLLECTION");

    public static final SubLList $list147 = list(list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")), list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol $sym148$WHY_ISA_ = makeSymbol("WHY-ISA?");

    public static final SubLList $list149 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    private static final SubLString $str150$Returns_justification_of__isa_TER = makeString("Returns justification of (isa TERM COLLECTION)");

    private static final SubLList $list151 = list(makeSymbol("LISTP"));

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLList $list153 = list(makeKeyword("TRUE"));

    private static final SubLObject $$resultIsa = reader_make_constant_shell(makeString("resultIsa"));

    private static final SubLObject $$resultIsaArg = reader_make_constant_shell(makeString("resultIsaArg"));

    private static final SubLObject $$interArgResultIsa = reader_make_constant_shell(makeString("interArgResultIsa"));

    private static final SubLObject $$interArgResultIsaReln = reader_make_constant_shell(makeString("interArgResultIsaReln"));

    private static final SubLSymbol $sym158$WHY_NOT_ISA_ = makeSymbol("WHY-NOT-ISA?");

    private static final SubLString $str159$Returns_justification_of__not__is = makeString("Returns justification of (not (isa TERM COLLECTION))");

    private static final SubLSymbol $sym160$INSTANCES_ = makeSymbol("INSTANCES?");

    private static final SubLString $str161$Returns_whether_COLLECTION_has_an = makeString("Returns whether COLLECTION has any direct instances");

    private static final SubLSymbol GATHER_GENLS_MTS = makeSymbol("GATHER-GENLS-MTS");



    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol MAX_FLOOR_MTS_OF_ISA_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-ISA-PATHS");

    private static final SubLList $list166 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    private static final SubLString $str167$Returns_in_what__most_genl__mts_T = makeString("Returns in what (most-genl) mts TERM is an instance of COLLECTION");

    private static final SubLSymbol MAX_FLOOR_MTS_OF_QUOTED_ISA_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS");

    private static final SubLString $str169$Returns_in_what__most_genl__mts_T = makeString("Returns in what (most-genl) mts TERM is a quoted instance of COLLECTION");



    private static final SubLSymbol $sym171$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLSymbol GATHER_MIN_MTS_OF_PATHS_BETWEEN = makeSymbol("GATHER-MIN-MTS-OF-PATHS-BETWEEN");



    private static final SubLSymbol CACHE_MTS_OF_ARG = makeSymbol("CACHE-MTS-OF-ARG");

    private static final SubLObject $$resultQuotedIsa = reader_make_constant_shell(makeString("resultQuotedIsa"));

    private static final SubLObject $$evaluationResultQuotedIsa = reader_make_constant_shell(makeString("evaluationResultQuotedIsa"));



    private static final SubLSymbol KB_SET_OR_COLLECTION_P = makeSymbol("KB-SET-OR-COLLECTION-P");

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    public static final SubLList $list180 = list(ONE_INTEGER);

    private static final SubLSymbol INSTANCEOF_AFTER_ADDING = makeSymbol("INSTANCEOF-AFTER-ADDING");

    private static final SubLSymbol ISA_AFTER_ADDING = makeSymbol("ISA-AFTER-ADDING");

    private static final SubLList $list183 = list(makeSymbol("ISA"), makeSymbol("TERM"), makeSymbol("SUBSET-EXPR"));

    private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));

    private static final SubLList $list185 = list(makeSymbol("CSFN"), makeSymbol("COL"), makeSymbol("COLEXPR"));

    private static final SubLList $list186 = list(makeSymbol("ISA"), makeSymbol("TERM"), makeSymbol("COLEXPR"));

    private static final SubLObject $$TheCollectionOf = reader_make_constant_shell(makeString("TheCollectionOf"));

    private static final SubLList $list188 = list(makeSymbol("TSO"), makeSymbol("VAR"), makeSymbol("PROP"));



    private static final SubLSymbol INSTANCEOF_AFTER_REMOVING = makeSymbol("INSTANCEOF-AFTER-REMOVING");

    private static final SubLSymbol ISA_AFTER_REMOVING = makeSymbol("ISA-AFTER-REMOVING");

    private static final SubLSymbol $sym192$QUOTED_ISA_ = makeSymbol("QUOTED-ISA?");

    private static final SubLString $str193$Returns_whether_TERM_is_a_quoted_ = makeString("Returns whether TERM is a quoted instance of COLLECTION via the SBHL, i.e. quotedIsa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?");

    private static final SubLSymbol $sym194$QUOTED_ISA_IN_ANY_MT_ = makeSymbol("QUOTED-ISA-IN-ANY-MT?");

    private static final SubLSymbol $sym195$ANY_QUOTED_ISA_ = makeSymbol("ANY-QUOTED-ISA?");

    private static final SubLSymbol $sym196$QUOTED_ISA_ANY_ = makeSymbol("QUOTED-ISA-ANY?");

    private static final SubLSymbol $sym197$ALL_QUOTED_ISA_ = makeSymbol("ALL-QUOTED-ISA?");

    private static final SubLString $str198$Returns_whether_TERM_is_a_quoted_ = makeString("Returns whether TERM is a quoted instance of all collections in COLLECTIONS");

    private static final SubLSymbol $sym199$NOT_QUOTED_ISA_ = makeSymbol("NOT-QUOTED-ISA?");

    private static final SubLSymbol QUOTED_INSTANCES = makeSymbol("QUOTED-INSTANCES");

    private static final SubLSymbol UNION_ALL_QUOTED_INSTANCES = makeSymbol("UNION-ALL-QUOTED-INSTANCES");

    private static final SubLString $str202$Returns_set_of_all_quoted_instanc = makeString("Returns set of all quoted instances of each collection in COLS (expensive)");

    private static final SubLSymbol MAP_ALL_QUOTED_ISA = makeSymbol("MAP-ALL-QUOTED-ISA");

    private static final SubLString $str204$Apply_FUNCTION_to_every_all_quote = makeString("Apply FUNCTION to every all-quoted-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)");

    private static final SubLList $list205 = list(makeUninternedSymbol("NAUT"), makeUninternedSymbol("QUOTED-ISA-MT"), makeUninternedSymbol("QUOTED-ISA-TV"));

    private static final SubLSymbol ALL_QUOTED_ISA = makeSymbol("ALL-QUOTED-ISA");

    private static final SubLSymbol ALL_QUOTED_ISAS_WRT = makeSymbol("ALL-QUOTED-ISAS-WRT");

    private static final SubLSymbol ALL_QUOTED_INSTANCES = makeSymbol("ALL-QUOTED-INSTANCES");

    private static final SubLSymbol ALL_QUOTED_ISA_AMONG = makeSymbol("ALL-QUOTED-ISA-AMONG");

    private static final SubLString $str210$Returns_those_elements_of_COLLECT = makeString("Returns those elements of COLLECTIONS that include TERM as an all-quoted-instance");

    private static final SubLSymbol QUOTED_INSTANCEOF_AFTER_ADDING = makeSymbol("QUOTED-INSTANCEOF-AFTER-ADDING");

    private static final SubLSymbol QUOTED_INSTANCEOF_AFTER_REMOVING = makeSymbol("QUOTED-INSTANCEOF-AFTER-REMOVING");

















    public static final SubLList $list221 = list(list(list(NIL), NIL), list(list(list(reader_make_constant_shell(makeString("Thing")))), list(reader_make_constant_shell(makeString("Thing")))));

    private static final SubLSymbol MAX_COLS = makeSymbol("MAX-COLS");

    private static final SubLList $list223 = list(list(list(NIL), NIL));



    public static final SubLList $list225 = list(list(list(reader_make_constant_shell(makeString("Thing")), list(reader_make_constant_shell(makeString("Collection")))), list(reader_make_constant_shell(makeString("Collection")))), list(list(reader_make_constant_shell(makeString("Muffet")), NIL), NIL));

    private static final SubLList $list226 = list(list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("Muffet"))), reader_make_constant_shell(makeString("CyclistsMt"))), list(reader_make_constant_shell(makeString("Muffet")))), list(list(reader_make_constant_shell(makeString("Female")), NIL, reader_make_constant_shell(makeString("CyclistsMt"))), NIL), list(list(reader_make_constant_shell(makeString("Female")), NIL), NIL));

    private static final SubLList $list227 = list(list(list(reader_make_constant_shell(makeString("Muffet")), list(reader_make_constant_shell(makeString("Male"))), reader_make_constant_shell(makeString("CyclistsMt"))), list(reader_make_constant_shell(makeString("Male")))));

    private static final SubLSymbol $sym228$ALL_INSTANCES_ = makeSymbol("ALL-INSTANCES?");

    private static final SubLList $list229 = list(list(list(NIL, reader_make_constant_shell(makeString("Female"))), T), list(list(list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Muffet")))), reader_make_constant_shell(makeString("Female"))), T));

    private static final SubLList $list230 = list(list(list(list(reader_make_constant_shell(makeString("Muffet"))), list(reader_make_constant_shell(makeString("Poodle"))), reader_make_constant_shell(makeString("CyclistsMt"))), T));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject result = sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv, UNPROVIDED);
        if (NIL != forts.non_fort_p(v_term)) {
            result = list_utilities.fast_delete_duplicates(nconc(sbhl_link_methods.non_fort_isas(v_term, mt, tv), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) {
            result = list_utilities.fast_delete_duplicates(nconc(sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject min_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLObject result = sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv);
        if (NIL != forts.non_fort_p(v_term)) {
            result = genls.min_cols(nconc(sbhl_link_methods.non_fort_isas(v_term, mt, tv), result), mt, tv);
        }
        if (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) {
            result = genls.min_cols(nconc(sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), result), mt, tv);
        }
        if (NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue(thread)) {
            result = list_utilities.remove_if_not(FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject min_isa_in_mt(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = min_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject nat_isa(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return isa(nart, mt, tv);
        }
        return naut_isa(naut, mt);
    }

    public static SubLObject naut_isa(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_duplicate_forts(append(new SubLObject[]{ kb_accessors.result_isa(cycl_utilities.nat_functor(naut), mt), kb_accessors.result_isa_args(naut, mt), kb_accessors.result_inter_arg_isa(naut, mt), kb_accessors.result_inter_arg_isa_reln(naut, mt), kb_accessors.result_isa_via_arg_arg_isa(naut, mt), kb_accessors.result_isa_arg_isas(naut, mt), kb_accessors.result_isa_when_arg_isa(naut, mt), sbhl_link_methods.non_fort_isas(naut, mt, UNPROVIDED) }));
    }

    public static SubLObject not_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv, UNPROVIDED);
    }

    public static SubLObject max_not_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        return genls.max_cols(sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv), mt, tv);
    }

    public static SubLObject nat_max_not_isa(final SubLObject nat, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nart = narts_high.find_nart(nat);
        if (NIL != nart_handles.nart_p(nart)) {
            return max_not_isa(nart, mt, tv);
        }
        SubLObject not_isa = NIL;
        SubLObject cdolist_list_var = genls.union_all_genls(kb_accessors.result_types(cycl_utilities.nat_functor(nat), mt), mt, tv);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            not_isa = nunion(disjoint_with.max_all_disjoint_with(v_isa, mt, tv), not_isa, UNPROVIDED, UNPROVIDED);
            not_isa = nunion(sdc.max_sdc(v_isa, mt), not_isa, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return genls.max_cols(not_isa, mt, tv);
    }

    public static SubLObject instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $$True_JustificationTruth;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject max_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, mt, tv);
    }

    public static SubLObject all_instances_with_max(final SubLObject cycl_term, final SubLObject max) {
        assert NIL != integerp(max) : "Types.integerp(max) " + "CommonSymbols.NIL != Types.integerp(max) " + max;
        if (NIL == fort_types_interface.collection_p(cycl_term)) {
            return NIL;
        }
        final SubLObject iter = kb_iterators.new_instances_iterator(cycl_term);
        SubLObject cur_term = NIL;
        SubLObject result = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(max); i = add(i, ONE_INTEGER)) {
            if (NIL != iteration.iteration_done(iter)) {
                return result;
            }
            cur_term = iteration.iteration_next_without_values(iter, $INVALID_ITERATION_TERM);
            if (cur_term != $INVALID_ITERATION_TERM) {
                result = cons(cur_term, result);
            }
        }
        return result;
    }

    public static SubLObject not_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject min_not_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, mt, tv);
    }

    public static SubLObject isa_siblings(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv);
    }

    public static SubLObject instance_siblings(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv);
    }

    public static SubLObject map_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module = sbhl_module_vars.get_sbhl_module($$isa);
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$14 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject rest;
                                        SubLObject module_var;
                                        SubLObject _prev_bind_0_$7;
                                        SubLObject _prev_bind_1_$6;
                                        SubLObject node;
                                        SubLObject d_link;
                                        SubLObject mt_links;
                                        SubLObject iteration_state;
                                        SubLObject mt_$18;
                                        SubLObject tv_links;
                                        SubLObject _prev_bind_0_$8;
                                        SubLObject iteration_state_$20;
                                        SubLObject tv_$21;
                                        SubLObject link_nodes;
                                        SubLObject _prev_bind_0_$9;
                                        SubLObject sol;
                                        SubLObject set_contents_var;
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject v_isa;
                                        SubLObject csome_list_var;
                                        SubLObject v_isa2;
                                        SubLObject new_list;
                                        SubLObject rest_$23;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$10;
                                        SubLObject sol2;
                                        SubLObject link_nodes2;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject v_isa3;
                                        SubLObject csome_list_var2;
                                        SubLObject v_isa4;
                                        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                            module_var = rest.first();
                                            _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                node = function_terms.naut_to_nart(v_term);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                    _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                        for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20)); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                            thread.resetMultipleValues();
                                                                            tv_$21 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                            link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$21)) {
                                                                                _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$21, thread);
                                                                                    sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            v_isa = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, v_isa)) {
                                                                                                funcall(function, v_isa);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                                                csome_list_var = sol;
                                                                                                v_isa2 = NIL;
                                                                                                v_isa2 = csome_list_var.first();
                                                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                                                    funcall(function, v_isa2);
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    v_isa2 = csome_list_var.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        for (rest_$23 = NIL, rest_$23 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$23); rest_$23 = rest_$23.rest()) {
                                                            generating_fn = rest_$23.first();
                                                            _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        v_isa3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state2, v_isa3)) {
                                                                            funcall(function, v_isa3);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                            csome_list_var2 = sol2;
                                                                            v_isa4 = NIL;
                                                                            v_isa4 = csome_list_var2.first();
                                                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                                                funcall(function, v_isa4);
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                v_isa4 = csome_list_var2.first();
                                                                            } 
                                                                        }
                                                                    } else {
                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$10, thread);
                                                            }
                                                        }
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$15, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$14, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$5, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$6, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$5, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$4, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$4, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        if (NIL != forts.non_fort_p(v_term)) {
            final SubLObject mt_var2 = mt;
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                final SubLObject tv_var2 = tv;
                final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var2) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var2))) {
                        final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var2.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var2, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var2.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var2, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var2.eql($WARN)) {
                                    Errors.warn($str32$_A_is_not_a__A, tv_var2, SBHL_SEARCH_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var2, SBHL_SEARCH_TRUTH_VALUE_P);
                                }


                    }
                    SubLObject csome_list_var3 = gethash_without_values(v_term, sbhl_link_methods.non_fort_isa_table(), UNPROVIDED);
                    SubLObject isa_tuple = NIL;
                    isa_tuple = csome_list_var3.first();
                    while (NIL != csome_list_var3) {
                        SubLObject current;
                        final SubLObject datum = current = isa_tuple;
                        SubLObject v_isa5 = NIL;
                        SubLObject table_mt = NIL;
                        SubLObject table_tv = NIL;
                        destructuring_bind_must_consp(current, datum, $list43);
                        v_isa5 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list43);
                        table_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list43);
                        table_tv = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != mt_relevance_macros.relevant_mtP(table_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(table_tv))) {
                                funcall(function, v_isa5);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list43);
                        }
                        csome_list_var3 = csome_list_var3.rest();
                        isa_tuple = csome_list_var3.first();
                    } 
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$11, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) {
            module = sbhl_module_vars.get_sbhl_module($$genls);
            final SubLObject mt_var3 = mt;
            final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var3), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var3), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var3), thread);
                final SubLObject tv_var3 = tv;
                final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var3 ? tv_var3 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var3 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var3) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var3))) {
                        final SubLObject pcase_var3 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var3.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var3.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var3.eql($WARN)) {
                                    Errors.warn($str32$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var3, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        SubLObject cdolist_list_var = gethash(v_term, sbhl_link_methods.$isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED);
                        SubLObject isa_tuple2 = NIL;
                        isa_tuple2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = isa_tuple2;
                            SubLObject naut = NIL;
                            SubLObject isa_mt = NIL;
                            SubLObject isa_tv = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list45);
                            naut = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list45);
                            isa_mt = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list45);
                            isa_tv = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if ((NIL != mt_relevance_macros.relevant_mtP(isa_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(isa_tv))) {
                                    final SubLObject v_isa6 = naut;
                                    funcall(function, v_isa6);
                                    SubLObject cdolist_list_var_$30;
                                    final SubLObject new_list2 = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                    SubLObject generating_fn2 = NIL;
                                    generating_fn2 = cdolist_list_var_$30.first();
                                    while (NIL != cdolist_list_var_$30) {
                                        final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                            final SubLObject v_isa7 = funcall(generating_fn2, naut);
                                            funcall(function, v_isa7);
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                        }
                                        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                        generating_fn2 = cdolist_list_var_$30.first();
                                    } 
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list45);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            isa_tuple2 = cdolist_list_var.first();
                        } 
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$8, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$12, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_8, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_7, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_6, thread);
            }
        }
        return NIL;
    }

    public static SubLObject map_min_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        map_isa(function, v_term, mt, tv);
        return NIL;
    }

    public static SubLObject map_instances(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(v_term, EL_FORT_P);
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$isa);
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$32 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$34 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$35 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$36 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$45 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject rest;
                                        SubLObject module_var;
                                        SubLObject _prev_bind_0_$38;
                                        SubLObject _prev_bind_1_$37;
                                        SubLObject node;
                                        SubLObject d_link;
                                        SubLObject mt_links;
                                        SubLObject iteration_state;
                                        SubLObject mt_$49;
                                        SubLObject tv_links;
                                        SubLObject _prev_bind_0_$39;
                                        SubLObject iteration_state_$51;
                                        SubLObject tv_$52;
                                        SubLObject link_nodes;
                                        SubLObject _prev_bind_0_$40;
                                        SubLObject sol;
                                        SubLObject set_contents_var;
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject instance;
                                        SubLObject csome_list_var;
                                        SubLObject instance2;
                                        SubLObject new_list;
                                        SubLObject rest_$54;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$41;
                                        SubLObject sol2;
                                        SubLObject link_nodes2;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject instance3;
                                        SubLObject csome_list_var2;
                                        SubLObject instance4;
                                        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                            module_var = rest.first();
                                            _prev_bind_0_$38 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                node = function_terms.naut_to_nart(v_term);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                mt_$49 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$49)) {
                                                                    _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$49, thread);
                                                                        for (iteration_state_$51 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$51)); iteration_state_$51 = dictionary_contents.do_dictionary_contents_next(iteration_state_$51)) {
                                                                            thread.resetMultipleValues();
                                                                            tv_$52 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$51);
                                                                            link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$52)) {
                                                                                _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$52, thread);
                                                                                    sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, instance)) {
                                                                                                funcall(function, instance);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                                                csome_list_var = sol;
                                                                                                instance2 = NIL;
                                                                                                instance2 = csome_list_var.first();
                                                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                                                    funcall(function, instance2);
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    instance2 = csome_list_var.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$40, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$51);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$39, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        for (rest_$54 = NIL, rest_$54 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$54); rest_$54 = rest_$54.rest()) {
                                                            generating_fn = rest_$54.first();
                                                            _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state2, instance3)) {
                                                                            funcall(function, instance3);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                            csome_list_var2 = sol2;
                                                                            instance4 = NIL;
                                                                            instance4 = csome_list_var2.first();
                                                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                                                funcall(function, instance4);
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                instance4 = csome_list_var2.first();
                                                                            } 
                                                                        }
                                                                    } else {
                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$41, thread);
                                                            }
                                                        }
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$37, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$38, thread);
                                            }
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$46, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$45, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$36, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$36, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$37, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$36, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$35, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$35, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$35, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$34, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$34, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$33, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$34, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$33, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$32, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject min_isas_of_type(final SubLObject v_term, final SubLObject type, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_isas = all_isa(v_term, mt, tv);
        final SubLObject isas_of_type = all_instances_among(type, all_isas, mt, tv);
        return genls.min_cols(isas_of_type, mt, tv);
    }

    public static SubLObject all_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLObject result = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv);
        if (NIL != forts.non_fort_p(v_term)) {
            result = list_utilities.fast_delete_duplicates(nconc(sbhl_link_methods.non_fort_all_isa(v_term, mt, tv), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) {
            result = list_utilities.fast_delete_duplicates(nconc(genls.union_all_genls(sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), mt, tv), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue(thread)) {
            result = list_utilities.remove_if_not(FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject all_isa_in_any_mt(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            all_isa = all_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_isa;
    }

    public static SubLObject all_isa_in_mt(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            all_isa = all_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_isa;
    }

    public static SubLObject all_isa_in_mts(final SubLObject v_term, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            all_isa = all_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_isa;
    }

    public static SubLObject nat_all_isa(final SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_isa(nat_formula, mt, tv);
    }

    public static SubLObject all_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, mt, tv);
    }

    public static SubLObject all_instances_in_all_mts(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = all_instances(collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_fort_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.delete_if_not(FORT_P, all_instances(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_non_prototypical_fort_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete_if($sym66$HL_PROTOTYPICAL_INSTANCE_, all_fort_instances(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_fort_instances_in_all_mts(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = all_fort_instances(collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_isas_wrt(final SubLObject v_term, final SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, EL_FORT_P);
        SubLTrampolineFile.enforceType(v_isa, EL_FORT_P);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $all_isas_wrt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $all_isas_wrt_isa$.currentBinding(thread);
        try {
            $all_isas_wrt$.bind(NIL, thread);
            $all_isas_wrt_isa$.bind(v_isa, thread);
            map_all_isa(GATHER_ISA_WRT_ISA, v_term, mt, tv);
            result = $all_isas_wrt$.getDynamicValue(thread);
        } finally {
            $all_isas_wrt_isa$.rebind(_prev_bind_2, thread);
            $all_isas_wrt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gather_isa_wrt_isa(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isaP(v_term, $all_isas_wrt_isa$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            $all_isas_wrt$.setDynamicValue(cons(v_term, $all_isas_wrt$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject union_all_isa(final SubLObject terms, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(terms, LISTP);
        if (NIL == terms) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(terms)) {
            return all_isa(terms.first(), mt, tv);
        }
        SubLObject result = sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), terms, mt, tv);
        if (NIL != list_utilities.any_in_list(ISA_STORED_NAUT_ARG2_P, terms, UNPROVIDED)) {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) {
                    result = nconc(genls.all_genls(sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), mt, tv), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            result = list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue(thread)) {
                result = list_utilities.remove_if_not(FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return result;
    }

    public static SubLObject union_all_instances(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(cols)) {
            return all_instances(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), cols, mt, tv);
    }

    public static SubLObject all_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        if (NIL == collections) {
            return NIL;
        }
        if (NIL == list_utilities.singletonP(collections)) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$isa), v_term, collections, mt, tv);
        }
        if (NIL != isaP(v_term, collections.first(), mt, tv)) {
            return collections;
        }
        return NIL;
    }

    public static SubLObject isa_allP(final SubLObject v_term, final SubLObject collections, final SubLObject mt) {
        return list_utilities.same_length_p(all_isa_among(v_term, collections, mt, UNPROVIDED), collections);
    }

    public static SubLObject min_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genls.min_cols(all_isa_among(v_term, collections, mt, tv), mt, UNPROVIDED);
    }

    public static SubLObject all_instances_among(final SubLObject col, final SubLObject terms, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, HL_TERM_P);
        SubLTrampolineFile.enforceType(terms, LISTP);
        if (NIL == terms) {
            return NIL;
        }
        if (NIL == list_utilities.singletonP(terms)) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$isa), col, terms, mt, tv);
        }
        if (NIL != isaP(terms.first(), col, mt, tv)) {
            return terms;
        }
        return NIL;
    }

    public static SubLObject all_instances_among_fast(final SubLObject col, final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_cache.valid_cached_fort_type_p(col)) {
            SubLObject filtered_terms = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.fort_has_typeP(v_term, col, mt)) {
                    filtered_terms = cons(v_term, filtered_terms);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            return nreverse(filtered_terms);
        }
        final SubLObject instance_count = (NIL != forts.fort_p(col)) ? cardinality_estimates.instance_cardinality(col) : $int$100000;
        if (instance_count.numLE($int$50)) {
            return all_instances_among(col, terms, mt, UNPROVIDED);
        }
        final SubLObject term_count = length(terms);
        final SubLObject threshold = $int$25;
        if (number_utilities.percent(term_count, instance_count, TWO_INTEGER).numL(threshold)) {
            SubLObject filtered_terms2 = NIL;
            SubLObject cdolist_list_var2 = terms;
            SubLObject v_term2 = NIL;
            v_term2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != isaP(v_term2, col, mt, UNPROVIDED)) {
                    filtered_terms2 = cons(v_term2, filtered_terms2);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term2 = cdolist_list_var2.first();
            } 
            return nreverse(filtered_terms2);
        }
        return all_instances_among(col, terms, mt, UNPROVIDED);
    }

    public static SubLObject all_isa_if(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$isa), v_term, function, mt, tv);
    }

    public static SubLObject all_instances_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$isa), col, function, mt, tv);
    }

    public static SubLObject all_isa_if_with_pruning(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning(sbhl_module_vars.get_sbhl_module($$isa), v_term, function, mt, tv);
    }

    public static SubLObject all_not_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv);
    }

    public static SubLObject all_not_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, mt, tv);
    }

    public static SubLObject not_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = collections;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != not_isaP(v_term, col, mt, tv)) {
                result = cons(col, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject not_instances_among() {
        return NIL;
    }

    public static SubLObject map_all_isa(final SubLObject fn, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, fn, mt, tv);
        return NIL;
    }

    public static SubLObject map_all_instances(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, fn, mt, tv);
        return NIL;
    }

    public static SubLObject any_all_isa(final SubLObject fn, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, fn, mt, tv, UNPROVIDED);
    }

    public static SubLObject any_wrt_all_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        return any_all_isa(function, v_term, mt, tv);
    }

    public static SubLObject any_all_forward_true_nodes_isa(final SubLObject pred, final SubLObject start_node, final SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$57 = sbhl_marking_vars.$sbhl_mapping_marking_space$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_isaP_goal$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_mapping_marking_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.bind(T, thread);
                            sbhl_search_vars.$sbhl_isaP_goal$.bind(v_isa, thread);
                            result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(pred), start_node, $sym112$ISA__GOAL, mt, tv, UNPROVIDED);
                        } finally {
                            sbhl_search_vars.$sbhl_isaP_goal$.rebind(_prev_bind_4, thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_mapping_marking_space$.rebind(_prev_bind_0_$57, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$56, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sample_leaf_instances(final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
        if (samples == UNPROVIDED) {
            samples = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_sample_leaf_nodes(sbhl_module_vars.get_sbhl_module($$isa), col, samples, mt, tv);
    }

    public static SubLObject sample_different_leaf_instances(final SubLObject dif_node, final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
        if (samples == UNPROVIDED) {
            samples = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_sample_different_leaf_nodes(sbhl_module_vars.get_sbhl_module($$isa), dif_node, col, samples, mt, tv);
    }

    public static SubLObject sbhl_record_all_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt, tv);
        if (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) {
            SubLObject cdolist_list_var = sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), v_isa, mt, tv);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject count_all_instances(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$60 = collection;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$61 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = tv;
                            final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$68 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$69 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$60, UNPROVIDED);
                                            while (NIL != node_var_$60) {
                                                final SubLObject tt_node_var = node_var_$60;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$66 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                        final SubLObject mt_$74 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$74)) {
                                                                            final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$74, thread);
                                                                                SubLObject iteration_state_$76;
                                                                                for (iteration_state_$76 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$76); iteration_state_$76 = dictionary_contents.do_dictionary_contents_next(iteration_state_$76)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$77 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$76);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$77)) {
                                                                                        final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$77, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject ins;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject ins2 = NIL;
                                                                                                    ins2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        ins2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$68, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$76);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$67, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt_$75 = NIL;
                                                                    SubLObject tv_$78 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt_$75 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv_$78 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$75)) {
                                                                            final SubLObject _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$75, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$78)) {
                                                                                    final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$78, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject ins;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$83 = sol;
                                                                                                SubLObject ins2 = NIL;
                                                                                                ins2 = csome_list_var_$83.first();
                                                                                                while (NIL != csome_list_var_$83) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                    }
                                                                                                    csome_list_var_$83 = csome_list_var_$83.rest();
                                                                                                    ins2 = csome_list_var_$83.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$84;
                                                                final SubLObject new_list = cdolist_list_var_$84 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$84.first();
                                                                while (NIL != cdolist_list_var_$84) {
                                                                    final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject ins3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    count = add(count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject ins4 = NIL;
                                                                                ins4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    ins4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                                    }
                                                                    cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                                                                    generating_fn = cdolist_list_var_$84.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$66, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$60);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$76 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$76)) {
                                                                            final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$76, thread);
                                                                                SubLObject iteration_state_$77;
                                                                                for (iteration_state_$77 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$77); iteration_state_$77 = dictionary_contents.do_dictionary_contents_next(iteration_state_$77)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$79 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$77);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$79)) {
                                                                                        final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$79, thread);
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
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$74, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$77);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$73, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$85;
                                                                final SubLObject new_list2 = cdolist_list_var_$85 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$85.first();
                                                                while (NIL != cdolist_list_var_$85) {
                                                                    final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$75, thread);
                                                                    }
                                                                    cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                                                    generating_fn2 = cdolist_list_var_$85.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$68, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$72, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$60 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$69, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$66, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$65, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$68, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$65, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$64, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$64, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$63, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$63, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$62, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$61, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject count_all_instances_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$97 = collection;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$98 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$99 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$100 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = tv;
                            final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$103 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$97, UNPROVIDED);
                                            while (NIL != node_var_$97) {
                                                final SubLObject tt_node_var = node_var_$97;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$103 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                        final SubLObject mt_$111 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$111)) {
                                                                            final SubLObject _prev_bind_0_$104 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$111, thread);
                                                                                SubLObject iteration_state_$113;
                                                                                for (iteration_state_$113 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$113); iteration_state_$113 = dictionary_contents.do_dictionary_contents_next(iteration_state_$113)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$114 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$113);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$114)) {
                                                                                        final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$114, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject ins;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != funcall(pred, ins)) {
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject ins2 = NIL;
                                                                                                    ins2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != funcall(pred, ins2)) {
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        ins2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$105, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$113);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$104, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt_$112 = NIL;
                                                                    SubLObject tv_$115 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt_$112 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv_$115 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$112)) {
                                                                            final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$112, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$115)) {
                                                                                    final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$115, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject ins;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != funcall(pred, ins)) {
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$120 = sol;
                                                                                                SubLObject ins2 = NIL;
                                                                                                ins2 = csome_list_var_$120.first();
                                                                                                while (NIL != csome_list_var_$120) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != funcall(pred, ins2)) {
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$120 = csome_list_var_$120.rest();
                                                                                                    ins2 = csome_list_var_$120.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$107, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$106, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$121;
                                                                final SubLObject new_list = cdolist_list_var_$121 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$121.first();
                                                                while (NIL != cdolist_list_var_$121) {
                                                                    final SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject ins3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != funcall(pred, ins3)) {
                                                                                        count = add(count, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject ins4 = NIL;
                                                                                ins4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != funcall(pred, ins4)) {
                                                                                            count = add(count, ONE_INTEGER);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    ins4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$108, thread);
                                                                    }
                                                                    cdolist_list_var_$121 = cdolist_list_var_$121.rest();
                                                                    generating_fn = cdolist_list_var_$121.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$104, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$103, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$109 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$97);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$113 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$113)) {
                                                                            final SubLObject _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$113, thread);
                                                                                SubLObject iteration_state_$114;
                                                                                for (iteration_state_$114 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$114); iteration_state_$114 = dictionary_contents.do_dictionary_contents_next(iteration_state_$114)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$116 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$114);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$116)) {
                                                                                        final SubLObject _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$116, thread);
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
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$111, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$114);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$110, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$122;
                                                                final SubLObject new_list2 = cdolist_list_var_$122 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$122.first();
                                                                while (NIL != cdolist_list_var_$122) {
                                                                    final SubLObject _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$112, thread);
                                                                    }
                                                                    cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                                                                    generating_fn2 = cdolist_list_var_$122.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$105, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$109, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$97 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$103, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$102, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$105, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$102, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$101, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$101, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$100, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$100, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$99, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$98, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject count_all_instances_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GP = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == GP) {
                    SubLObject node_var_$134 = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$135 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$136 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$137 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = tv;
                                final SubLObject _prev_bind_0_$137 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$138 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$139 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$142 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$139 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$140 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$143 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$134, UNPROVIDED);
                                                while ((NIL != node_var_$134) && (NIL == GP)) {
                                                    final SubLObject tt_node_var = node_var_$134;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$140;
                                                    SubLObject _prev_bind_1_$141;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$148;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$141;
                                                    SubLObject iteration_state_$150;
                                                    SubLObject tv_$151;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$142;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject ins;
                                                    SubLObject csome_list_var;
                                                    SubLObject ins2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt_$149;
                                                    SubLObject tv_$152;
                                                    SubLObject _prev_bind_0_$143;
                                                    SubLObject _prev_bind_0_$144;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$157;
                                                    SubLObject new_list;
                                                    SubLObject rest_$158;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$145;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject ins3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject ins4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == GP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$140 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$141 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$148 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$148)) {
                                                                                _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$148, thread);
                                                                                    for (iteration_state_$150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$150)); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next(iteration_state_$150)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$151 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$150);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$151)) {
                                                                                            _prev_bind_0_$142 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$151, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                            if (count.numG(num)) {
                                                                                                                GP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var = sol;
                                                                                                            ins2 = NIL;
                                                                                                            ins2 = csome_list_var.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numG(num)) {
                                                                                                                        GP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                ins2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$142, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$150);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$141, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == GP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == GP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt_$149 = NIL;
                                                                        tv_$152 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        mt_$149 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        tv_$152 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$149)) {
                                                                                _prev_bind_0_$143 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$149, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$152)) {
                                                                                        _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$152, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                        if (count.numG(num)) {
                                                                                                            GP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == GP) {
                                                                                                        csome_list_var_$157 = sol;
                                                                                                        ins2 = NIL;
                                                                                                        ins2 = csome_list_var_$157.first();
                                                                                                        while ((NIL == GP) && (NIL != csome_list_var_$157)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                                if (count.numG(num)) {
                                                                                                                    GP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$157 = csome_list_var_$157.rest();
                                                                                                            ins2 = csome_list_var_$157.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$144, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$143, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list116);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$158 = NIL, rest_$158 = new_list; (NIL == GP) && (NIL != rest_$158); rest_$158 = rest_$158.rest()) {
                                                                        generating_fn = rest_$158.first();
                                                                        _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        if (count.numG(num)) {
                                                                                            GP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        ins4 = NIL;
                                                                                        ins4 = csome_list_var3.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                count = add(count, ONE_INTEGER);
                                                                                                if (count.numG(num)) {
                                                                                                    GP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            ins4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$145, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$141, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$140, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$146;
                                                    SubLObject _prev_bind_1_$142;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt_$150;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$147;
                                                    SubLObject iteration_state_$151;
                                                    SubLObject tv_$153;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$148;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$159;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$149;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == GP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$146 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$134);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$150 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$150)) {
                                                                                _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$150, thread);
                                                                                    for (iteration_state_$151 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$151)); iteration_state_$151 = dictionary_contents.do_dictionary_contents_next(iteration_state_$151)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$153 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$151);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$153)) {
                                                                                            _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$153, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$148, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$151);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$147, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$159 = NIL, rest_$159 = new_list2; (NIL == GP) && (NIL != rest_$159); rest_$159 = rest_$159.rest()) {
                                                                        generating_fn2 = rest_$159.first();
                                                                        _prev_bind_0_$149 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$149, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$142, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$146, thread);
                                                        }
                                                    }
                                                    node_var_$134 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$143, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$140, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$139, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$142, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$139, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$138, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$138, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$137, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$137, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$136, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$135, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$151 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$151, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return numE(count, num);
    }

    public static SubLObject count_all_instances_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GP = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == GP) {
                    SubLObject node_var_$171 = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$172 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$173 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$174 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = tv;
                                final SubLObject _prev_bind_0_$174 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$175 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$176 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$179 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$176 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$177 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$180 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$171, UNPROVIDED);
                                                while ((NIL != node_var_$171) && (NIL == GP)) {
                                                    final SubLObject tt_node_var = node_var_$171;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$177;
                                                    SubLObject _prev_bind_1_$178;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$185;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$178;
                                                    SubLObject iteration_state_$187;
                                                    SubLObject tv_$188;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$179;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject ins;
                                                    SubLObject csome_list_var;
                                                    SubLObject ins2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt_$186;
                                                    SubLObject tv_$189;
                                                    SubLObject _prev_bind_0_$180;
                                                    SubLObject _prev_bind_0_$181;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$194;
                                                    SubLObject new_list;
                                                    SubLObject rest_$195;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$182;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject ins3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject ins4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == GP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$177 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$178 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$185 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$185)) {
                                                                                _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$185, thread);
                                                                                    for (iteration_state_$187 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$187)); iteration_state_$187 = dictionary_contents.do_dictionary_contents_next(iteration_state_$187)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$188 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$187);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$188)) {
                                                                                            _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$188, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                            if (count.numG(num)) {
                                                                                                                GP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var = sol;
                                                                                                            ins2 = NIL;
                                                                                                            ins2 = csome_list_var.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numG(num)) {
                                                                                                                        GP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                ins2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$179, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$187);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$178, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == GP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == GP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt_$186 = NIL;
                                                                        tv_$189 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        mt_$186 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        tv_$189 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$186)) {
                                                                                _prev_bind_0_$180 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$186, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$189)) {
                                                                                        _prev_bind_0_$181 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$189, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                        if (count.numG(num)) {
                                                                                                            GP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == GP) {
                                                                                                        csome_list_var_$194 = sol;
                                                                                                        ins2 = NIL;
                                                                                                        ins2 = csome_list_var_$194.first();
                                                                                                        while ((NIL == GP) && (NIL != csome_list_var_$194)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                                if (count.numG(num)) {
                                                                                                                    GP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$194 = csome_list_var_$194.rest();
                                                                                                            ins2 = csome_list_var_$194.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$181, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$180, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list116);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$195 = NIL, rest_$195 = new_list; (NIL == GP) && (NIL != rest_$195); rest_$195 = rest_$195.rest()) {
                                                                        generating_fn = rest_$195.first();
                                                                        _prev_bind_0_$182 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        if (count.numG(num)) {
                                                                                            GP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        ins4 = NIL;
                                                                                        ins4 = csome_list_var3.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                count = add(count, ONE_INTEGER);
                                                                                                if (count.numG(num)) {
                                                                                                    GP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            ins4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$182, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$178, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$177, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$183;
                                                    SubLObject _prev_bind_1_$179;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt_$187;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$184;
                                                    SubLObject iteration_state_$188;
                                                    SubLObject tv_$190;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$185;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$196;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$186;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == GP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$183 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$179 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$171);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$187 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$187)) {
                                                                                _prev_bind_0_$184 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$187, thread);
                                                                                    for (iteration_state_$188 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$188)); iteration_state_$188 = dictionary_contents.do_dictionary_contents_next(iteration_state_$188)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$190 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$188);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$190)) {
                                                                                            _prev_bind_0_$185 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$190, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$185, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$188);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$184, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$196 = NIL, rest_$196 = new_list2; (NIL == GP) && (NIL != rest_$196); rest_$196 = rest_$196.rest()) {
                                                                        generating_fn2 = rest_$196.first();
                                                                        _prev_bind_0_$186 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$186, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$179, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$183, thread);
                                                        }
                                                    }
                                                    node_var_$171 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$180, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$177, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$176, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$179, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$176, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$175, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$175, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$174, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$174, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$173, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$187 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$187, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$172, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$188 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return GP;
    }

    public static SubLObject count_all_instances_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GEP = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == GEP) {
                    SubLObject node_var_$208 = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$209 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$210 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$211 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = tv;
                                final SubLObject _prev_bind_0_$211 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$212 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$212 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$213 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$216 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$213 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$214 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$217 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$208, UNPROVIDED);
                                                while ((NIL != node_var_$208) && (NIL == GEP)) {
                                                    final SubLObject tt_node_var = node_var_$208;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$214;
                                                    SubLObject _prev_bind_1_$215;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$222;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$215;
                                                    SubLObject iteration_state_$224;
                                                    SubLObject tv_$225;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$216;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject ins;
                                                    SubLObject csome_list_var;
                                                    SubLObject ins2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt_$223;
                                                    SubLObject tv_$226;
                                                    SubLObject _prev_bind_0_$217;
                                                    SubLObject _prev_bind_0_$218;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$231;
                                                    SubLObject new_list;
                                                    SubLObject rest_$232;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$219;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject ins3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject ins4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == GEP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$214 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$215 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$222 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$222)) {
                                                                                _prev_bind_0_$215 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$222, thread);
                                                                                    for (iteration_state_$224 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$224)); iteration_state_$224 = dictionary_contents.do_dictionary_contents_next(iteration_state_$224)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$225 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$224);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$225)) {
                                                                                            _prev_bind_0_$216 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$225, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                            if (count.numGE(num)) {
                                                                                                                GEP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == GEP) {
                                                                                                            csome_list_var = sol;
                                                                                                            ins2 = NIL;
                                                                                                            ins2 = csome_list_var.first();
                                                                                                            while ((NIL == GEP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numGE(num)) {
                                                                                                                        GEP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                ins2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$216, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$224);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$215, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == GEP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == GEP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt_$223 = NIL;
                                                                        tv_$226 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        mt_$223 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        tv_$226 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$223)) {
                                                                                _prev_bind_0_$217 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$223, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$226)) {
                                                                                        _prev_bind_0_$218 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$226, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                        if (count.numGE(num)) {
                                                                                                            GEP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == GEP) {
                                                                                                        csome_list_var_$231 = sol;
                                                                                                        ins2 = NIL;
                                                                                                        ins2 = csome_list_var_$231.first();
                                                                                                        while ((NIL == GEP) && (NIL != csome_list_var_$231)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                                if (count.numGE(num)) {
                                                                                                                    GEP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$231 = csome_list_var_$231.rest();
                                                                                                            ins2 = csome_list_var_$231.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$218, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$217, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list116);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$232 = NIL, rest_$232 = new_list; (NIL == GEP) && (NIL != rest_$232); rest_$232 = rest_$232.rest()) {
                                                                        generating_fn = rest_$232.first();
                                                                        _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        if (count.numGE(num)) {
                                                                                            GEP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == GEP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        ins4 = NIL;
                                                                                        ins4 = csome_list_var3.first();
                                                                                        while ((NIL == GEP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                count = add(count, ONE_INTEGER);
                                                                                                if (count.numGE(num)) {
                                                                                                    GEP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            ins4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$219, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$215, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$214, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$220;
                                                    SubLObject _prev_bind_1_$216;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt_$224;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$221;
                                                    SubLObject iteration_state_$225;
                                                    SubLObject tv_$227;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$222;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$233;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$223;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == GEP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$220 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$216 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$208);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$224 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$224)) {
                                                                                _prev_bind_0_$221 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$224, thread);
                                                                                    for (iteration_state_$225 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$225)); iteration_state_$225 = dictionary_contents.do_dictionary_contents_next(iteration_state_$225)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$227 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$225);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$227)) {
                                                                                            _prev_bind_0_$222 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$227, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == GEP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == GEP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$222, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$225);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$221, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$233 = NIL, rest_$233 = new_list2; (NIL == GEP) && (NIL != rest_$233); rest_$233 = rest_$233.rest()) {
                                                                        generating_fn2 = rest_$233.first();
                                                                        _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == GEP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == GEP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$223, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$216, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$220, thread);
                                                        }
                                                    }
                                                    node_var_$208 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$217, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$214, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$213, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$216, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$213, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$212, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$212, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$211, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$211, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$210, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$224 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$224, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$209, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$225 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return GEP;
    }

    public static SubLObject count_all_instances_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numL(count_all_instances(collection, mt, tv), num);
    }

    public static SubLObject count_all_instances_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numLE(count_all_instances(collection, mt, tv), num);
    }

    public static SubLObject count_all_quoted_instances(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$245 = collection;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$246 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$247 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$248 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = tv;
                            final SubLObject _prev_bind_0_$248 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$249 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$249 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$250 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$253 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$250 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$251 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$254 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$245, UNPROVIDED);
                                            while (NIL != node_var_$245) {
                                                final SubLObject tt_node_var = node_var_$245;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$251 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$252 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$259 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$259)) {
                                                                            final SubLObject _prev_bind_0_$252 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$259, thread);
                                                                                SubLObject iteration_state_$261;
                                                                                for (iteration_state_$261 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$261); iteration_state_$261 = dictionary_contents.do_dictionary_contents_next(iteration_state_$261)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$262 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$261);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$262)) {
                                                                                        final SubLObject _prev_bind_0_$253 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$262, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject ins;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject ins2 = NIL;
                                                                                                    ins2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        ins2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$253, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$261);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$252, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt_$260 = NIL;
                                                                    SubLObject tv_$263 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt_$260 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv_$263 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$260)) {
                                                                            final SubLObject _prev_bind_0_$254 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$260, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$263)) {
                                                                                    final SubLObject _prev_bind_0_$255 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$263, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject ins;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$268 = sol;
                                                                                                SubLObject ins2 = NIL;
                                                                                                ins2 = csome_list_var_$268.first();
                                                                                                while (NIL != csome_list_var_$268) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                    }
                                                                                                    csome_list_var_$268 = csome_list_var_$268.rest();
                                                                                                    ins2 = csome_list_var_$268.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$255, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$254, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$269;
                                                                final SubLObject new_list = cdolist_list_var_$269 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$269.first();
                                                                while (NIL != cdolist_list_var_$269) {
                                                                    final SubLObject _prev_bind_0_$256 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject ins3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    count = add(count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject ins4 = NIL;
                                                                                ins4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    ins4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$256, thread);
                                                                    }
                                                                    cdolist_list_var_$269 = cdolist_list_var_$269.rest();
                                                                    generating_fn = cdolist_list_var_$269.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$252, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$251, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$257 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$253 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$245);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$261 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$261)) {
                                                                            final SubLObject _prev_bind_0_$258 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$261, thread);
                                                                                SubLObject iteration_state_$262;
                                                                                for (iteration_state_$262 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$262); iteration_state_$262 = dictionary_contents.do_dictionary_contents_next(iteration_state_$262)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$264 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$262);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$264)) {
                                                                                        final SubLObject _prev_bind_0_$259 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$264, thread);
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
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$259, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$262);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$258, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$270;
                                                                final SubLObject new_list2 = cdolist_list_var_$270 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$270.first();
                                                                while (NIL != cdolist_list_var_$270) {
                                                                    final SubLObject _prev_bind_0_$260 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$260, thread);
                                                                    }
                                                                    cdolist_list_var_$270 = cdolist_list_var_$270.rest();
                                                                    generating_fn2 = cdolist_list_var_$270.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$253, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$257, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$245 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$254, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$251, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$250, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$253, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$250, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$249, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$249, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$248, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$248, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$247, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$261 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$261, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$246, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$262 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$262, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject count_all_quoted_instances_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$282 = collection;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$283 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$284 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$285 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = tv;
                            final SubLObject _prev_bind_0_$285 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$286 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$286 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$287 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$290 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$287 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$288 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$291 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$282, UNPROVIDED);
                                            while (NIL != node_var_$282) {
                                                final SubLObject tt_node_var = node_var_$282;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$288 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$289 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$296 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$296)) {
                                                                            final SubLObject _prev_bind_0_$289 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$296, thread);
                                                                                SubLObject iteration_state_$298;
                                                                                for (iteration_state_$298 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$298); iteration_state_$298 = dictionary_contents.do_dictionary_contents_next(iteration_state_$298)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$299 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$298);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$299)) {
                                                                                        final SubLObject _prev_bind_0_$290 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$299, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject ins;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != funcall(pred, ins)) {
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject ins2 = NIL;
                                                                                                    ins2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != funcall(pred, ins2)) {
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        ins2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$290, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$298);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$289, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt_$297 = NIL;
                                                                    SubLObject tv_$300 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt_$297 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv_$300 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$297)) {
                                                                            final SubLObject _prev_bind_0_$291 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$297, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$300)) {
                                                                                    final SubLObject _prev_bind_0_$292 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$300, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject ins;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != funcall(pred, ins)) {
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$305 = sol;
                                                                                                SubLObject ins2 = NIL;
                                                                                                ins2 = csome_list_var_$305.first();
                                                                                                while (NIL != csome_list_var_$305) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != funcall(pred, ins2)) {
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$305 = csome_list_var_$305.rest();
                                                                                                    ins2 = csome_list_var_$305.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$292, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$291, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$306;
                                                                final SubLObject new_list = cdolist_list_var_$306 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$306.first();
                                                                while (NIL != cdolist_list_var_$306) {
                                                                    final SubLObject _prev_bind_0_$293 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject ins3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != funcall(pred, ins3)) {
                                                                                        count = add(count, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject ins4 = NIL;
                                                                                ins4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != funcall(pred, ins4)) {
                                                                                            count = add(count, ONE_INTEGER);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    ins4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$293, thread);
                                                                    }
                                                                    cdolist_list_var_$306 = cdolist_list_var_$306.rest();
                                                                    generating_fn = cdolist_list_var_$306.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$289, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$288, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$294 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$290 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$282);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$298 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$298)) {
                                                                            final SubLObject _prev_bind_0_$295 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$298, thread);
                                                                                SubLObject iteration_state_$299;
                                                                                for (iteration_state_$299 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$299); iteration_state_$299 = dictionary_contents.do_dictionary_contents_next(iteration_state_$299)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv_$301 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$299);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$301)) {
                                                                                        final SubLObject _prev_bind_0_$296 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$301, thread);
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
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$296, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$299);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$295, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$307;
                                                                final SubLObject new_list2 = cdolist_list_var_$307 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$307.first();
                                                                while (NIL != cdolist_list_var_$307) {
                                                                    final SubLObject _prev_bind_0_$297 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$297, thread);
                                                                    }
                                                                    cdolist_list_var_$307 = cdolist_list_var_$307.rest();
                                                                    generating_fn2 = cdolist_list_var_$307.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$290, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$294, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$282 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$291, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$288, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$287, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$290, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$287, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$286, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$286, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$285, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$285, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$284, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$298 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$298, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$283, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$299 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$299, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject count_all_quoted_instances_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GP = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == GP) {
                    SubLObject node_var_$319 = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$320 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$321 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$322 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = tv;
                                final SubLObject _prev_bind_0_$322 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$323 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$323 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$324 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$327 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$324 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$325 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$328 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$319, UNPROVIDED);
                                                while ((NIL != node_var_$319) && (NIL == GP)) {
                                                    final SubLObject tt_node_var = node_var_$319;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$325;
                                                    SubLObject _prev_bind_1_$326;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$333;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$326;
                                                    SubLObject iteration_state_$335;
                                                    SubLObject tv_$336;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$327;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject ins;
                                                    SubLObject csome_list_var;
                                                    SubLObject ins2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt_$334;
                                                    SubLObject tv_$337;
                                                    SubLObject _prev_bind_0_$328;
                                                    SubLObject _prev_bind_0_$329;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$342;
                                                    SubLObject new_list;
                                                    SubLObject rest_$343;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$330;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject ins3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject ins4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == GP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$325 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$326 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$333 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$333)) {
                                                                                _prev_bind_0_$326 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$333, thread);
                                                                                    for (iteration_state_$335 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$335)); iteration_state_$335 = dictionary_contents.do_dictionary_contents_next(iteration_state_$335)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$336 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$335);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$336)) {
                                                                                            _prev_bind_0_$327 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$336, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                            if (count.numG(num)) {
                                                                                                                GP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var = sol;
                                                                                                            ins2 = NIL;
                                                                                                            ins2 = csome_list_var.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numG(num)) {
                                                                                                                        GP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                ins2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$327, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$335);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$326, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == GP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == GP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt_$334 = NIL;
                                                                        tv_$337 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        mt_$334 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        tv_$337 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$334)) {
                                                                                _prev_bind_0_$328 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$334, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$337)) {
                                                                                        _prev_bind_0_$329 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$337, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                        if (count.numG(num)) {
                                                                                                            GP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == GP) {
                                                                                                        csome_list_var_$342 = sol;
                                                                                                        ins2 = NIL;
                                                                                                        ins2 = csome_list_var_$342.first();
                                                                                                        while ((NIL == GP) && (NIL != csome_list_var_$342)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                                if (count.numG(num)) {
                                                                                                                    GP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$342 = csome_list_var_$342.rest();
                                                                                                            ins2 = csome_list_var_$342.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$329, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$328, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list116);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$343 = NIL, rest_$343 = new_list; (NIL == GP) && (NIL != rest_$343); rest_$343 = rest_$343.rest()) {
                                                                        generating_fn = rest_$343.first();
                                                                        _prev_bind_0_$330 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        if (count.numG(num)) {
                                                                                            GP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        ins4 = NIL;
                                                                                        ins4 = csome_list_var3.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                count = add(count, ONE_INTEGER);
                                                                                                if (count.numG(num)) {
                                                                                                    GP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            ins4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$330, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$326, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$325, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$331;
                                                    SubLObject _prev_bind_1_$327;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt_$335;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$332;
                                                    SubLObject iteration_state_$336;
                                                    SubLObject tv_$338;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$333;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$344;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$334;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == GP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$331 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$327 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$319);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$335 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$335)) {
                                                                                _prev_bind_0_$332 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$335, thread);
                                                                                    for (iteration_state_$336 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$336)); iteration_state_$336 = dictionary_contents.do_dictionary_contents_next(iteration_state_$336)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$338 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$336);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$338)) {
                                                                                            _prev_bind_0_$333 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$338, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$333, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$336);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$332, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$344 = NIL, rest_$344 = new_list2; (NIL == GP) && (NIL != rest_$344); rest_$344 = rest_$344.rest()) {
                                                                        generating_fn2 = rest_$344.first();
                                                                        _prev_bind_0_$334 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$334, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$327, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$331, thread);
                                                        }
                                                    }
                                                    node_var_$319 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$328, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$325, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$324, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$327, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$324, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$323, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$323, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$322, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$322, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$321, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$335 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$335, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$320, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$336 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$336, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return numE(count, num);
    }

    public static SubLObject count_all_quoted_instances_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GP = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == GP) {
                    SubLObject node_var_$356 = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$357 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$358 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$359 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = tv;
                                final SubLObject _prev_bind_0_$359 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$360 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$360 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$361 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$364 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$361 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$362 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$365 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$356, UNPROVIDED);
                                                while ((NIL != node_var_$356) && (NIL == GP)) {
                                                    final SubLObject tt_node_var = node_var_$356;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$362;
                                                    SubLObject _prev_bind_1_$363;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$370;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$363;
                                                    SubLObject iteration_state_$372;
                                                    SubLObject tv_$373;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$364;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject ins;
                                                    SubLObject csome_list_var;
                                                    SubLObject ins2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt_$371;
                                                    SubLObject tv_$374;
                                                    SubLObject _prev_bind_0_$365;
                                                    SubLObject _prev_bind_0_$366;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$379;
                                                    SubLObject new_list;
                                                    SubLObject rest_$380;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$367;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject ins3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject ins4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == GP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$362 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$363 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$370 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$370)) {
                                                                                _prev_bind_0_$363 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$370, thread);
                                                                                    for (iteration_state_$372 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$372)); iteration_state_$372 = dictionary_contents.do_dictionary_contents_next(iteration_state_$372)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$373 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$372);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$373)) {
                                                                                            _prev_bind_0_$364 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$373, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                            if (count.numG(num)) {
                                                                                                                GP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var = sol;
                                                                                                            ins2 = NIL;
                                                                                                            ins2 = csome_list_var.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numG(num)) {
                                                                                                                        GP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                ins2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$364, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$372);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$363, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == GP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == GP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt_$371 = NIL;
                                                                        tv_$374 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        mt_$371 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        tv_$374 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$371)) {
                                                                                _prev_bind_0_$365 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$371, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$374)) {
                                                                                        _prev_bind_0_$366 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$374, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                        if (count.numG(num)) {
                                                                                                            GP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == GP) {
                                                                                                        csome_list_var_$379 = sol;
                                                                                                        ins2 = NIL;
                                                                                                        ins2 = csome_list_var_$379.first();
                                                                                                        while ((NIL == GP) && (NIL != csome_list_var_$379)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                                if (count.numG(num)) {
                                                                                                                    GP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$379 = csome_list_var_$379.rest();
                                                                                                            ins2 = csome_list_var_$379.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$366, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$365, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list116);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$380 = NIL, rest_$380 = new_list; (NIL == GP) && (NIL != rest_$380); rest_$380 = rest_$380.rest()) {
                                                                        generating_fn = rest_$380.first();
                                                                        _prev_bind_0_$367 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        if (count.numG(num)) {
                                                                                            GP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        ins4 = NIL;
                                                                                        ins4 = csome_list_var3.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                count = add(count, ONE_INTEGER);
                                                                                                if (count.numG(num)) {
                                                                                                    GP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            ins4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$367, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$363, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$362, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$368;
                                                    SubLObject _prev_bind_1_$364;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt_$372;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$369;
                                                    SubLObject iteration_state_$373;
                                                    SubLObject tv_$375;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$370;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$381;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$371;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == GP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$368 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$364 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$356);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$372 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$372)) {
                                                                                _prev_bind_0_$369 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$372, thread);
                                                                                    for (iteration_state_$373 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$373)); iteration_state_$373 = dictionary_contents.do_dictionary_contents_next(iteration_state_$373)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$375 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$373);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$375)) {
                                                                                            _prev_bind_0_$370 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$375, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == GP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == GP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$370, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$373);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$369, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$381 = NIL, rest_$381 = new_list2; (NIL == GP) && (NIL != rest_$381); rest_$381 = rest_$381.rest()) {
                                                                        generating_fn2 = rest_$381.first();
                                                                        _prev_bind_0_$371 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == GP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == GP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$371, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$364, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$368, thread);
                                                        }
                                                    }
                                                    node_var_$356 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$365, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$362, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$361, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$364, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$361, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$360, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$360, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$359, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$359, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$358, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$372 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$372, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$357, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$373 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$373, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return GP;
    }

    public static SubLObject count_all_quoted_instances_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GEP = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == GEP) {
                    SubLObject node_var_$393 = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$394 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$395 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$396 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = tv;
                                final SubLObject _prev_bind_0_$396 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$397 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$397 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$398 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$401 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$398 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$399 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$402 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$393, UNPROVIDED);
                                                while ((NIL != node_var_$393) && (NIL == GEP)) {
                                                    final SubLObject tt_node_var = node_var_$393;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$399;
                                                    SubLObject _prev_bind_1_$400;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$407;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$400;
                                                    SubLObject iteration_state_$409;
                                                    SubLObject tv_$410;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$401;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject ins;
                                                    SubLObject csome_list_var;
                                                    SubLObject ins2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt_$408;
                                                    SubLObject tv_$411;
                                                    SubLObject _prev_bind_0_$402;
                                                    SubLObject _prev_bind_0_$403;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$416;
                                                    SubLObject new_list;
                                                    SubLObject rest_$417;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$404;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject ins3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject ins4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == GEP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$399 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$400 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$407 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$407)) {
                                                                                _prev_bind_0_$400 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$407, thread);
                                                                                    for (iteration_state_$409 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$409)); iteration_state_$409 = dictionary_contents.do_dictionary_contents_next(iteration_state_$409)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$410 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$409);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$410)) {
                                                                                            _prev_bind_0_$401 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$410, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            count = add(count, ONE_INTEGER);
                                                                                                            if (count.numGE(num)) {
                                                                                                                GEP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == GEP) {
                                                                                                            csome_list_var = sol;
                                                                                                            ins2 = NIL;
                                                                                                            ins2 = csome_list_var.first();
                                                                                                            while ((NIL == GEP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numGE(num)) {
                                                                                                                        GEP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                ins2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$401, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$409);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$400, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == GEP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == GEP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt_$408 = NIL;
                                                                        tv_$411 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        mt_$408 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list116);
                                                                        tv_$411 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$408)) {
                                                                                _prev_bind_0_$402 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$408, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$411)) {
                                                                                        _prev_bind_0_$403 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$411, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    ins = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, ins)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                        if (count.numGE(num)) {
                                                                                                            GEP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == GEP) {
                                                                                                        csome_list_var_$416 = sol;
                                                                                                        ins2 = NIL;
                                                                                                        ins2 = csome_list_var_$416.first();
                                                                                                        while ((NIL == GEP) && (NIL != csome_list_var_$416)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                                if (count.numGE(num)) {
                                                                                                                    GEP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$416 = csome_list_var_$416.rest();
                                                                                                            ins2 = csome_list_var_$416.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$403, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$402, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list116);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$417 = NIL, rest_$417 = new_list; (NIL == GEP) && (NIL != rest_$417); rest_$417 = rest_$417.rest()) {
                                                                        generating_fn = rest_$417.first();
                                                                        _prev_bind_0_$404 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    ins3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, ins3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(ins3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        if (count.numGE(num)) {
                                                                                            GEP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == GEP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        ins4 = NIL;
                                                                                        ins4 = csome_list_var3.first();
                                                                                        while ((NIL == GEP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(ins4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                count = add(count, ONE_INTEGER);
                                                                                                if (count.numGE(num)) {
                                                                                                    GEP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            ins4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$404, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$400, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$399, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$405;
                                                    SubLObject _prev_bind_1_$401;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt_$409;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$406;
                                                    SubLObject iteration_state_$410;
                                                    SubLObject tv_$412;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$407;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$418;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$408;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == GEP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$405 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$401 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$393);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$409 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$409)) {
                                                                                _prev_bind_0_$406 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$409, thread);
                                                                                    for (iteration_state_$410 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$410)); iteration_state_$410 = dictionary_contents.do_dictionary_contents_next(iteration_state_$410)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv_$412 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$410);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$412)) {
                                                                                            _prev_bind_0_$407 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$412, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == GEP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == GEP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$407, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$410);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$406, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$418 = NIL, rest_$418 = new_list2; (NIL == GEP) && (NIL != rest_$418); rest_$418 = rest_$418.rest()) {
                                                                        generating_fn2 = rest_$418.first();
                                                                        _prev_bind_0_$408 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == GEP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == GEP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$408, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$401, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$405, thread);
                                                        }
                                                    }
                                                    node_var_$393 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$402, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$399, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$398, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$401, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$398, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$397, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$397, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$396, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$396, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$395, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$409 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$409, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$394, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$410 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$410, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return GEP;
    }

    public static SubLObject count_all_quoted_instances_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numL(count_all_quoted_instances(collection, mt, tv), num);
    }

    public static SubLObject count_all_quoted_instances_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numLE(count_all_quoted_instances(collection, mt, tv), num);
    }

    public static SubLObject isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        if (NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, collection, mt, tv)) {
            return T;
        }
        if ((NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term)) && (NIL != genls.any_specP(collection, sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), mt, tv))) {
            return T;
        }
        if (((NIL != cycl_grammar.cycl_nat_p(collection)) && cycl_utilities.formula_operator(collection).eql($$CollectionIntersectionFn)) && (NIL != el_extensional_set_p(cycl_utilities.formula_arg1(collection, UNPROVIDED)))) {
            SubLObject cdolist_list_var;
            final SubLObject colls = cdolist_list_var = extensional_set_elements(cycl_utilities.formula_arg1(collection, UNPROVIDED));
            SubLObject sub_coll = NIL;
            sub_coll = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == term.el_fort_p(sub_coll)) || (NIL == isaP(v_term, sub_coll, mt, tv))) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_coll = cdolist_list_var.first();
            } 
            return T;
        }
        if ((NIL != forts.non_fort_p(v_term)) && (NIL != sbhl_link_methods.non_fort_isaP(v_term, collection, mt, tv))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject isa_in_mtsP(final SubLObject v_term, final SubLObject collection, final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject isaP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            isaP = isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return isaP;
    }

    public static SubLObject isa_in_any_mtP(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isaP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            isaP = isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return isaP;
    }

    public static SubLObject nat_isaP(final SubLObject nat, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        if (NIL != v_term) {
            return isaP(v_term, collection, mt, tv);
        }
        return nat_isa_intP(nat, collection, mt);
    }

    public static SubLObject nat_isa_intP(final SubLObject nat, final SubLObject collection, final SubLObject mt) {
        return makeBoolean((NIL != sbhl_link_methods.non_fort_isaP(nat, collection, mt, UNPROVIDED)) || (((NIL == weak_not_result_isa_colP(cycl_utilities.nat_functor(nat), collection, mt)) && (NIL == weak_not_result_isa_arg_colP(nat, collection, mt))) && ((((NIL != result_isa_colP(cycl_utilities.nat_functor(nat), collection, mt)) || (NIL != result_isa_arg_colP(nat, collection, mt))) || (NIL != result_isa_inter_arg_colP(nat, collection, mt))) || (NIL != result_isa_inter_arg_reln_colP(nat, collection, mt)))));
    }

    public static SubLObject result_isa_colP(final SubLObject functor, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.any_specP(collection, kb_accessors.result_isa(functor, mt), mt, UNPROVIDED);
    }

    public static SubLObject weak_not_result_isa_colP(final SubLObject functor, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return disjoint_with.any_disjoint_with_anyP_memoized(kb_accessors.result_isa(functor, mt), list(collection), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject result_isa_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.any_specP(collection, kb_accessors.result_isa_args(nat_formula, mt), mt, UNPROVIDED);
    }

    public static SubLObject weak_not_result_isa_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return disjoint_with.any_disjoint_with_anyP_memoized(kb_accessors.result_isa_args(nat_formula, mt), list(collection), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject result_isa_inter_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.any_specP(collection, kb_accessors.result_inter_arg_isa(nat_formula, mt), mt, UNPROVIDED);
    }

    public static SubLObject result_isa_inter_arg_reln_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.any_specP(collection, kb_accessors.result_inter_arg_isa_reln(nat_formula, mt), mt, UNPROVIDED);
    }

    public static SubLObject isaP_goal(final SubLObject node) {
        if (NIL != sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), node, sbhl_search_vars.get_sbhl_isaP_goal(), UNPROVIDED, UNPROVIDED)) {
            return node;
        }
        return NIL;
    }

    public static SubLObject any_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        if (NIL == collections) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(collections)) {
            return isaP(v_term, collections.first(), mt, tv);
        }
        return makeBoolean(((NIL != sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, collections, mt, tv)) || (NIL != (NIL != forts.non_fort_p(v_term) ? sbhl_link_methods.non_fort_isa_anyP(v_term, collections, mt, tv) : NIL))) || (NIL != (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term) ? genls.any_genl_anyP(sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), collections, mt, tv) : NIL)));
    }

    public static SubLObject isa_anyP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        return any_isaP(v_term, collections, mt, tv);
    }

    public static SubLObject nat_any_isaP(final SubLObject nat, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        if (NIL != v_term) {
            return isa_anyP(v_term, collections, mt, tv);
        }
        return makeBoolean((NIL != sbhl_link_methods.non_fort_isa_anyP(nat, collections, UNPROVIDED, UNPROVIDED)) || (NIL != genls.any_genl_anyP(kb_accessors.result_types(cycl_utilities.nat_functor(nat), mt), collections, mt, tv)));
    }

    public static SubLObject find_if_isaP(final SubLObject collection, final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isaP(collection, $$Collection, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str140$_A_is_not_a_collection, collection);
        }
        SubLObject cdolist_list_var = list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa_in_any_mtP(item, collection)) {
                return item;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject all_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != listp(collections) : "Types.listp(collections) " + "CommonSymbols.NIL != Types.listp(collections) " + collections;
        if (NIL == collections) {
            return T;
        }
        if (NIL != list_utilities.singletonP(collections)) {
            return isaP(v_term, collections.first(), mt, tv);
        }
        return makeBoolean(((NIL != sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, collections, mt, tv)) || (NIL != (NIL != forts.non_fort_p(v_term) ? sbhl_link_methods.non_fort_isa_allP(v_term, collections, mt, tv) : NIL))) || (NIL != (NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term) ? genls.any_genl_allP(sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), collections, mt, tv) : NIL)));
    }

    public static SubLObject all_instancesP(final SubLObject terms, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL == terms) {
            return T;
        }
        if (NIL != list_utilities.singletonP(terms)) {
            return isaP(terms.first(), collection, mt, tv);
        }
        return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), terms, collection, mt, tv);
    }

    public static SubLObject any_isa_anyP(final SubLObject terms, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(terms, LISTP);
        SubLTrampolineFile.enforceType(collections, LISTP);
        if (NIL == terms) {
            return NIL;
        }
        if (NIL == collections) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(terms)) {
            return isa_anyP(terms.first(), collections, mt, tv);
        }
        return makeBoolean((NIL != sbhl_search_methods.sbhl_predicate_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$isa), terms, collections, mt, tv)) || (NIL != (NIL != list_utilities.any_in_list(ISA_STORED_NAUT_ARG2_P, terms, UNPROVIDED) ? genls.any_genl_anyP(sbhl_link_methods.union_isas_from_naut_arg2(terms, mt, tv), collections, mt, tv) : NIL)));
    }

    public static SubLObject not_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        return makeBoolean((((NIL == within_assertP()) || (NIL == czer_utilities.equals_elP(make_binary_formula($$isa, v_term, collection), wff_vars.wff_original_formula(), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != not_isa_by_extent_knownP(v_term, collection, mt, tv))) || (NIL != not_isa_by_sbhlP(v_term, collection, mt, tv)));
    }

    public static SubLObject not_isa_someP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject resultP = NIL;
        if (NIL == resultP) {
            SubLObject csome_list_var = collections;
            SubLObject col = NIL;
            col = csome_list_var.first();
            while ((NIL == resultP) && (NIL != csome_list_var)) {
                if (NIL != not_isaP(v_term, col, mt, tv)) {
                    resultP = T;
                }
                csome_list_var = csome_list_var.rest();
                col = csome_list_var.first();
            } 
        }
        return resultP;
    }

    public static SubLObject not_isa_by_sbhlP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, collection, mt, tv);
    }

    public static SubLObject not_isa_by_extent_knownP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt)) {
            return makeBoolean(NIL == isaP(v_term, collection, mt, tv));
        }
        return NIL;
    }

    public static SubLObject argue_not_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, col, mt, tv);
    }

    public static SubLObject not_isa_in_any_mtP(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_isaP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            not_isaP = not_isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return not_isaP;
    }

    public static SubLObject nat_not_isaP(final SubLObject nat, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        if (NIL != v_term) {
            return not_isaP(v_term, collection, mt, tv);
        }
        return disjoint_with.any_disjoint_with_anyP_memoized(kb_accessors.result_types(cycl_utilities.nat_functor(nat), mt), list(collection), mt, tv, UNPROVIDED);
    }

    public static SubLObject why_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        if (NIL != term.first_order_nautP(v_term)) {
            return any_just_of_nat_isa(v_term, collection, mt);
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, collection, mt, tv, behavior);
    }

    public static SubLObject any_just_of_isa(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return why_isaP(v_term, collection, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_just_of_nat_isa(final SubLObject nat, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        final SubLObject just = any_just_of_isa(v_term, collection, mt);
        if (NIL != just) {
            return cons(bq_cons(list($$termOfUnit, v_term, nat), $list153), just);
        }
        SubLObject nat_just = NIL;
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_types(cycl_utilities.nat_functor(nat), mt);
            SubLObject v_isa = NIL;
            v_isa = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!v_isa.equal(collection)) {
                    nat_just = genls.why_genlP(v_isa, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || v_isa.equal(collection)) {
                    return cons(bq_cons(list($$resultIsa, cycl_utilities.nat_functor(nat), v_isa), $list153), nat_just);
                }
                csome_list_var = csome_list_var.rest();
                v_isa = csome_list_var.first();
            } 
        }
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_isa_args(nat, mt);
            SubLObject v_isa = NIL;
            v_isa = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!v_isa.equal(collection)) {
                    nat_just = genls.why_genlP(v_isa, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || v_isa.equal(collection)) {
                    final SubLObject args = kb_accessors.result_isa_via_argnums(nat, collection, mt, UNPROVIDED);
                    if (NIL != args) {
                        return cons(bq_cons(list($$resultIsaArg, cycl_utilities.nat_functor(nat), args.first()), $list153), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_isa = csome_list_var.first();
            } 
        }
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_inter_arg_isa(nat, mt);
            SubLObject v_isa = NIL;
            v_isa = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!v_isa.equal(collection)) {
                    nat_just = genls.why_genlP(v_isa, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || v_isa.equal(collection)) {
                    final SubLObject args = kb_accessors.result_inter_arg_isa_via_which_args(nat, collection, mt, UNPROVIDED).first();
                    if (args.isCons()) {
                        final SubLObject arg = args.first();
                        final SubLObject ind_col = second(args);
                        final SubLObject dep_col = third(args);
                        final SubLObject arg_col = cycl_utilities.nat_arg(nat, arg, UNPROVIDED);
                        if (!arg_col.equal(ind_col)) {
                            nat_just = nconc(nat_just, why_isaP(arg_col, ind_col, mt, UNPROVIDED, UNPROVIDED));
                        }
                        if (!dep_col.equal(collection)) {
                            nat_just = nconc(nat_just, genls.why_genlP(dep_col, collection, mt, UNPROVIDED, UNPROVIDED));
                        }
                        return cons(bq_cons(list($$interArgResultIsa, cycl_utilities.nat_functor(nat), arg, ind_col, dep_col), $list153), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_isa = csome_list_var.first();
            } 
        }
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_inter_arg_isa_reln(nat, mt);
            SubLObject v_isa = NIL;
            v_isa = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!v_isa.equal(collection)) {
                    nat_just = genls.why_genlP(v_isa, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || v_isa.equal(collection)) {
                    final SubLObject args = kb_accessors.result_inter_arg_isa_reln_via_which_args(nat, collection, mt, UNPROVIDED).first();
                    if (args.isCons()) {
                        final SubLObject rel_sentence = args.first().first();
                        final SubLObject arg2 = second(args);
                        final SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
                        final SubLObject rel_nat_term_arg = third(args);
                        final SubLObject rel_col_arg = fourth(args);
                        final SubLObject col = cycl_utilities.formula_arg(rel_sentence, rel_col_arg, UNPROVIDED);
                        if (!col.equal(collection)) {
                            nat_just = nconc(nat_just, genls.why_genlP(col, collection, mt, UNPROVIDED, UNPROVIDED));
                        }
                        return append(list(bq_cons(list($$interArgResultIsaReln, cycl_utilities.nat_functor(nat), arg2, rel, rel_nat_term_arg, rel_col_arg), $list153), bq_cons(rel_sentence, $list153)), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_isa = csome_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject why_not_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        if (NIL != term.first_order_nautP(v_term)) {
            return any_just_of_nat_not_isa(v_term, collection, mt);
        }
        SubLObject just = NIL;
        just = sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), v_term, collection, mt, tv, behavior);
        if (NIL == just) {
            just = at_defns.why_not_isa_via_defnsP(v_term, collection, mt);
        }
        return just;
    }

    public static SubLObject any_just_of_not_isa(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return why_not_isaP(v_term, collection, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_just_of_nat_not_isa(final SubLObject nat, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        final SubLObject just = any_just_of_not_isa(v_term, collection, mt);
        if (NIL != just) {
            return cons(bq_cons(list($$termOfUnit, v_term, nat), $list153), just);
        }
        SubLObject nat_just = NIL;
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_types(cycl_utilities.nat_functor(nat), mt);
            SubLObject v_isa = NIL;
            v_isa = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                nat_just = genls.why_not_genlP(v_isa, collection, mt, UNPROVIDED, UNPROVIDED);
                if (NIL != nat_just) {
                    return cons(bq_cons(list($$resultIsa, cycl_utilities.nat_functor(nat), v_isa), $list153), just);
                }
                csome_list_var = csome_list_var.rest();
                v_isa = csome_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject instancesP(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        return instancesP_int(collection, mt, tv);
    }

    public static SubLObject instancesP_int(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return instances(narts_high.find_nart(collection), mt, UNPROVIDED);
        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$isa);
        SubLObject instanceP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$430 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$431 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$431 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$432 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$434 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$432 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$433 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$434 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$433 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$435 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    final SubLObject _prev_bind_0_$435 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$434 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$436 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$443 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$444 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject rest;
                                        SubLObject module_var;
                                        SubLObject _prev_bind_0_$436;
                                        SubLObject _prev_bind_1_$435;
                                        SubLObject node;
                                        SubLObject d_link;
                                        SubLObject mt_links;
                                        SubLObject iteration_state;
                                        SubLObject mt_$447;
                                        SubLObject tv_links;
                                        SubLObject _prev_bind_0_$437;
                                        SubLObject iteration_state_$449;
                                        SubLObject tv_$450;
                                        SubLObject link_nodes;
                                        SubLObject _prev_bind_0_$438;
                                        SubLObject sol;
                                        SubLObject set_contents_var;
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject instance;
                                        SubLObject csome_list_var;
                                        SubLObject instance2;
                                        SubLObject csome_list_var2;
                                        SubLObject instance_tuple;
                                        SubLObject current;
                                        SubLObject datum;
                                        SubLObject link_node;
                                        SubLObject mt_$448;
                                        SubLObject tv_$451;
                                        SubLObject _prev_bind_0_$439;
                                        SubLObject _prev_bind_0_$440;
                                        SubLObject link_nodes2;
                                        SubLObject csome_list_var_$456;
                                        SubLObject new_list;
                                        SubLObject rest_$457;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$441;
                                        SubLObject sol2;
                                        SubLObject link_nodes3;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject instance3;
                                        SubLObject csome_list_var3;
                                        SubLObject instance4;
                                        for (rest = NIL, rest = accessible_modules; (NIL == instanceP) && (NIL != rest); rest = rest.rest()) {
                                            module_var = rest.first();
                                            _prev_bind_0_$436 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            _prev_bind_1_$435 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                node = function_terms.naut_to_nart(collection);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == instanceP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                mt_$447 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$447)) {
                                                                    _prev_bind_0_$437 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$447, thread);
                                                                        for (iteration_state_$449 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == instanceP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$449)); iteration_state_$449 = dictionary_contents.do_dictionary_contents_next(iteration_state_$449)) {
                                                                            thread.resetMultipleValues();
                                                                            tv_$450 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$449);
                                                                            link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$450)) {
                                                                                _prev_bind_0_$438 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$450, thread);
                                                                                    sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == instanceP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL != instance)) {
                                                                                                instanceP = T;
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            if (NIL == instanceP) {
                                                                                                csome_list_var = sol;
                                                                                                instance2 = NIL;
                                                                                                instance2 = csome_list_var.first();
                                                                                                while ((NIL == instanceP) && (NIL != csome_list_var)) {
                                                                                                    if (NIL != instance2) {
                                                                                                        instanceP = T;
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    instance2 = csome_list_var.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$438, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$449);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$437, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == instanceP)) {
                                                        csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                        instance_tuple = NIL;
                                                        instance_tuple = csome_list_var2.first();
                                                        while ((NIL == instanceP) && (NIL != csome_list_var2)) {
                                                            datum = current = instance_tuple;
                                                            link_node = NIL;
                                                            mt_$448 = NIL;
                                                            tv_$451 = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list116);
                                                            link_node = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list116);
                                                            mt_$448 = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list116);
                                                            tv_$451 = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$448)) {
                                                                    _prev_bind_0_$439 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$448, thread);
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$451)) {
                                                                            _prev_bind_0_$440 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_$451, thread);
                                                                                link_nodes2 = sol = list(link_node);
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == instanceP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL != instance)) {
                                                                                            instanceP = T;
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        if (NIL == instanceP) {
                                                                                            csome_list_var_$456 = sol;
                                                                                            instance2 = NIL;
                                                                                            instance2 = csome_list_var_$456.first();
                                                                                            while ((NIL == instanceP) && (NIL != csome_list_var_$456)) {
                                                                                                if (NIL != instance2) {
                                                                                                    instanceP = T;
                                                                                                }
                                                                                                csome_list_var_$456 = csome_list_var_$456.rest();
                                                                                                instance2 = csome_list_var_$456.first();
                                                                                            } 
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$440, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$439, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list116);
                                                            }
                                                            csome_list_var2 = csome_list_var2.rest();
                                                            instance_tuple = csome_list_var2.first();
                                                        } 
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        for (rest_$457 = NIL, rest_$457 = new_list; (NIL == instanceP) && (NIL != rest_$457); rest_$457 = rest_$457.rest()) {
                                                            generating_fn = rest_$457.first();
                                                            _prev_bind_0_$441 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == instanceP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL != instance3)) {
                                                                            instanceP = T;
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        if (NIL == instanceP) {
                                                                            csome_list_var3 = sol2;
                                                                            instance4 = NIL;
                                                                            instance4 = csome_list_var3.first();
                                                                            while ((NIL == instanceP) && (NIL != csome_list_var3)) {
                                                                                if (NIL != instance4) {
                                                                                    instanceP = T;
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                instance4 = csome_list_var3.first();
                                                                            } 
                                                                        }
                                                                    } else {
                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$441, thread);
                                                            }
                                                        }
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$435, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$436, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$444, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$443, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$436, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$434, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$435, thread);
                                    }
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$435, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$433, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$434, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$433, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$432, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$434, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$432, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$431, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$431, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$430, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return instanceP;
    }

    public static SubLObject forts_of_type(final SubLObject v_forts, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != sbhl_link_vars.sbhl_node_object_p(fort)) && (NIL != isaP(fort, collection, mt, tv))) {
                result = cons(fort, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject all_isa_mts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind(isa_mts(v_term), thread);
            map_all_isa(GATHER_GENLS_MTS, v_term, UNPROVIDED, UNPROVIDED);
            result = list_utilities.remove_duplicate_forts(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread));
        } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gather_genls_mts(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(nconc(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), genls.genls_mts(collection)), thread);
        return NIL;
    }

    public static SubLObject partial_isa_extensionP(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != at_defns.any_sufficient_defn_anywhereP(collection)) || (NIL != at_defns.any_sufficient_functionP(collection, mt)));
    }

    public static SubLObject random_instance_of(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        if (((NIL != mt) && (!assertionsDisabledSynth)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (NIL != sbhl_cache.valid_fort_typeP(collection)) {
            return list_utilities.random_element(fort_types_interface.all_forts_of_type(collection));
        }
        if ($$Thing.eql(collection)) {
            return forts.random_fort(UNPROVIDED);
        }
        if (cardinality_estimates.instance_cardinality(collection).numG(integerDivide(forts.fort_count(), $random_instance_of_sampling_ratio$.getGlobalValue()))) {
            SubLObject result;
            SubLObject candidate;
            for (result = NIL; NIL == result; result = candidate) {
                candidate = forts.random_fort(UNPROVIDED);
                if (NIL != isaP(candidate, collection, mt, UNPROVIDED)) {
                }
            }
            return result;
        }
        final SubLObject v_instances = all_instances(collection, mt, UNPROVIDED);
        return list_utilities.random_element(v_instances);
    }

    public static SubLObject min_ceiling_isa(final SubLObject terms, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$isa), terms, candidates, mt, tv);
    }

    public static SubLObject nearest_common_isa(final SubLObject terms, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return min_ceiling_isa(terms, candidates, mt, tv);
    }

    public static SubLObject max_floor_instances(final SubLObject terms, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject max_floor_instances = NIL;
        return max_floor_instances;
    }

    public static SubLObject max_floor_mts_of_isa_paths_wrt(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        return genl_mts.selected_genl_mts(mt, max_floor_mts_of_isa_paths(v_term, collection, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_floor_mts_of_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject max_floor_mts = NIL;
        max_floor_mts = genl_mts.max_floor_mts_from_mt_sets(min_mts_of_isa_paths(v_term, collection, tv));
        return max_floor_mts;
    }

    public static SubLObject max_floor_mts_of_quoted_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject max_floor_mts = NIL;
        max_floor_mts = genl_mts.max_floor_mts_from_mt_sets(min_mts_of_quoted_isa_paths(v_term, collection, tv));
        return max_floor_mts;
    }

    public static SubLObject min_mts_of_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != cycl_grammar.cycl_quoted_term_p(v_term)) {
            final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
            if (NIL != denoted_term) {
                return min_mts_of_quoted_isa_paths(denoted_term, collection, tv);
            }
        } else {
            if (NIL == term.first_order_nautP(v_term)) {
                final SubLObject isa_mts = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$isa), v_term, collection, tv);
                SubLObject defn_mts = NIL;
                if (NIL != at_defns.any_sufficient_defn_anywhereP(collection)) {
                    defn_mts = Mapping.mapcar(symbol_function(LIST), at_defns.max_mts_of_admitting_defns(v_term, collection));
                }
                return nconc(isa_mts, defn_mts);
            }
            final SubLObject isa_mts = nat_min_mts_of_isa_paths(v_term, collection);
            if (NIL != isa_mts) {
                return isa_mts;
            }
            if (NIL != at_defns.any_sufficient_defn_anywhereP(collection)) {
                return Mapping.mapcar(symbol_function(LIST), at_defns.max_mts_of_admitting_defns(v_term, collection));
            }
        }
        return NIL;
    }

    public static SubLObject nat_min_mts_of_isa_paths(final SubLObject nat, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        if (NIL != v_term) {
            return min_mts_of_isa_paths(v_term, collection, UNPROVIDED);
        }
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = czer_meta.find_assertions_cycl(make_binary_formula($$isa, nat, collection), UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = list(assertions_high.assertion_mt(assertion));
                if (NIL == member(item_var, result, symbol_function($sym171$SETS_EQUAL_), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $mapping_target$.currentBinding(thread);
        _prev_bind_2 = $mapping_gather_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_target$.bind(collection, thread);
            $mapping_gather_arg$.bind(TWO_INTEGER, thread);
            $mapping_answer$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$459 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$460 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_MIN_MTS_OF_PATHS_BETWEEN), cycl_utilities.nat_functor(nat), ONE_INTEGER, $$resultIsa, $TRUE, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$460, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$459, thread);
            }
            if (NIL != $mapping_answer$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = $mapping_answer$.getDynamicValue(thread);
                SubLObject mts = NIL;
                mts = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = mts;
                    if (NIL == member(item_var, result, symbol_function($sym171$SETS_EQUAL_), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mts = cdolist_list_var.first();
                } 
            }
        } finally {
            $mapping_answer$.rebind(_prev_bind_3, thread);
            $mapping_gather_arg$.rebind(_prev_bind_2, thread);
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $mapping_gather_arg$.currentBinding(thread);
        _prev_bind_2 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_gather_arg$.bind(TWO_INTEGER, thread);
            $mapping_answer$.bind(make_hash_table(formula_arity(nat, UNPROVIDED), UNPROVIDED, UNPROVIDED), thread);
            final SubLObject _prev_bind_0_$460 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$461 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(CACHE_MTS_OF_ARG), cycl_utilities.nat_functor(nat), ONE_INTEGER, $$resultIsaArg, $TRUE, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$461, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$460, thread);
            }
            final SubLObject cdohash_table = $mapping_answer$.getDynamicValue(thread);
            SubLObject argnum = NIL;
            SubLObject argnum_mts = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    argnum = getEntryKey(cdohash_entry);
                    argnum_mts = getEntryValue(cdohash_entry);
                    final SubLObject v_isa = cycl_utilities.formula_arg(nat, argnum, UNPROVIDED);
                    SubLObject cdolist_list_var2 = genls.min_mts_of_genls_paths(v_isa, collection, UNPROVIDED);
                    SubLObject mt_set = NIL;
                    mt_set = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL != mt_set) {
                            SubLObject cdolist_list_var_$463 = argnum_mts;
                            SubLObject mt = NIL;
                            mt = cdolist_list_var_$463.first();
                            while (NIL != cdolist_list_var_$463) {
                                final SubLObject min_mt_set = genl_mts.min_mts(adjoin(mt, mt_set, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                if (NIL != min_mt_set) {
                                    final SubLObject item_var2 = min_mt_set;
                                    if (NIL == member(item_var2, result, symbol_function($sym171$SETS_EQUAL_), symbol_function(IDENTITY))) {
                                        result = cons(item_var2, result);
                                    }
                                }
                                cdolist_list_var_$463 = cdolist_list_var_$463.rest();
                                mt = cdolist_list_var_$463.first();
                            } 
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        mt_set = cdolist_list_var2.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } finally {
            $mapping_answer$.rebind(_prev_bind_2, thread);
            $mapping_gather_arg$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject min_mts_of_quoted_isa_paths(final SubLObject v_term, final SubLObject collection, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL == term.first_order_nautP(v_term)) {
            final SubLObject isa_mts = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, collection, tv);
            SubLObject defn_mts = NIL;
            if (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)) {
                defn_mts = Mapping.mapcar(symbol_function(LIST), at_defns.max_mts_of_admitting_quoted_defns(v_term, collection));
            }
            return nconc(isa_mts, defn_mts);
        }
        final SubLObject quoted_isa_mts = nat_min_mts_of_quoted_isa_paths(v_term, collection);
        if (NIL != quoted_isa_mts) {
            return quoted_isa_mts;
        }
        if (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)) {
            return Mapping.mapcar(symbol_function(LIST), at_defns.max_mts_of_admitting_quoted_defns(v_term, collection));
        }
        return NIL;
    }

    public static SubLObject nat_min_mts_of_quoted_isa_paths(final SubLObject nat, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        if (NIL != v_term) {
            return min_mts_of_quoted_isa_paths(v_term, collection, UNPROVIDED);
        }
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
        SubLObject _prev_bind_2 = $mapping_gather_arg$.currentBinding(thread);
        SubLObject _prev_bind_3 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_target$.bind(collection, thread);
            $mapping_gather_arg$.bind(TWO_INTEGER, thread);
            $mapping_answer$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$464 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$465 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_MIN_MTS_OF_PATHS_BETWEEN), cycl_utilities.nat_functor(nat), ONE_INTEGER, $$resultQuotedIsa, $TRUE, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$465, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$464, thread);
            }
            result = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $mapping_answer$.rebind(_prev_bind_3, thread);
            $mapping_gather_arg$.rebind(_prev_bind_2, thread);
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $mapping_target$.currentBinding(thread);
        _prev_bind_2 = $mapping_gather_arg$.currentBinding(thread);
        _prev_bind_3 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_target$.bind(collection, thread);
            $mapping_gather_arg$.bind(TWO_INTEGER, thread);
            $mapping_answer$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$465 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$466 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_MIN_MTS_OF_PATHS_BETWEEN), cycl_utilities.nat_functor(nat), ONE_INTEGER, $$evaluationResultQuotedIsa, $TRUE, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$466, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$465, thread);
            }
            final SubLObject item_var = result;
            if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function($sym171$SETS_EQUAL_), symbol_function(IDENTITY))) {
                $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
            }
        } finally {
            $mapping_answer$.rebind(_prev_bind_3, thread);
            $mapping_gather_arg$.rebind(_prev_bind_2, thread);
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gather_min_mts_of_paths_between(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if (NIL != forts.fort_p(source)) {
            SubLObject cdolist_list_var = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), source, $mapping_target$.getDynamicValue(thread), UNPROVIDED);
            SubLObject mt_set = NIL;
            mt_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != mt_set) {
                    final SubLObject min_mt_set = genl_mts.min_mts(adjoin(mt, mt_set, symbol_function(HLMT_EQUAL), UNPROVIDED), UNPROVIDED);
                    if (NIL != min_mt_set) {
                        final SubLObject item_var = min_mt_set;
                        if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function($sym171$SETS_EQUAL_), symbol_function(IDENTITY))) {
                            $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt_set = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cache_mts_of_arg(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            hash_table_utilities.push_hash(assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread)), assertions_high.assertion_mt(assertion), $mapping_answer$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject max_floor_mts_of_not_isa_paths(final SubLObject v_term, final SubLObject not_col, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$isa), not_col, v_term, tv);
    }

    public static SubLObject min_mts_of_not_isa_paths(final SubLObject v_term, final SubLObject not_col, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$isa), not_col, v_term, tv);
    }

    public static SubLObject instantiationP(final SubLObject v_term, final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_set)) {
            return isaP(v_term, v_set, mt, UNPROVIDED);
        }
        if (NIL != set_naut_p(v_set)) {
            return member_of_cycl_setP(v_term, v_set);
        }
        if (NIL != specs_fn_naut_p(v_set)) {
            return genls.genlP(v_term, specs_fn_arg(v_set), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject instantiations(final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_set)) {
            return instances(v_set, mt, UNPROVIDED);
        }
        if (NIL != set_naut_p(v_set)) {
            return members_of_cycl_set(v_set);
        }
        if (NIL != specs_fn_naut_p(v_set)) {
            return genls.specs(specs_fn_arg(v_set), mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject all_instantiations(final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_set)) {
            return all_instances(v_set, mt, UNPROVIDED);
        }
        if (NIL != set_naut_p(v_set)) {
            return members_of_cycl_set(v_set);
        }
        if (NIL != specs_fn_naut_p(v_set)) {
            return genls.all_specs(specs_fn_arg(v_set), mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject random_instantiation(final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != kb_accessors.kb_set_or_collection_p(v_set) : "kb_accessors.kb_set_or_collection_p(v_set) " + "CommonSymbols.NIL != kb_accessors.kb_set_or_collection_p(v_set) " + v_set;
        if (NIL != forts.fort_p(v_set)) {
            return random_instance_of(v_set, mt);
        }
        if (NIL != set_naut_p(v_set)) {
            return random_member_of_cycl_set(v_set);
        }
        if (NIL != specs_fn_naut_p(v_set)) {
            return genls.random_spec_of(specs_fn_arg(v_set), mt);
        }
        return NIL;
    }

    public static SubLObject set_naut_p(final SubLObject obj) {
        return cycl_utilities.naut_with_functor_p(obj, $$TheSet);
    }

    public static SubLObject member_of_cycl_setP(final SubLObject v_term, final SubLObject v_set) {
        return subl_promotions.memberP(v_term, cycl_utilities.nat_args(v_set, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject members_of_cycl_set(final SubLObject v_set) {
        return cycl_utilities.nat_args(v_set, UNPROVIDED);
    }

    public static SubLObject random_member_of_cycl_set(final SubLObject v_set) {
        return list_utilities.random_element(members_of_cycl_set(v_set));
    }

    public static SubLObject isas_mts(final SubLObject fort) {
        return kb_accessors.pred_mts(fort, $$isa, UNPROVIDED);
    }

    public static SubLObject isa_mts(final SubLObject fort) {
        return kb_accessors.pred_mts(fort, $$isa, $list180);
    }

    public static SubLObject type_mts(final SubLObject fort) {
        return isa_mts(fort);
    }

    public static SubLObject asserted_isaP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject asserted_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject asserted_not_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject supported_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject supported_not_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject asserted_instance(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject asserted_not_instance(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject supported_instance(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject supported_not_instance(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$isa), v_term, mt);
    }

    public static SubLObject instanceof_after_adding(SubLObject source, final SubLObject assertion) {
        return isa_after_adding(source, assertion);
    }

    public static SubLObject isa_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$isa));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_isa_dependent_caches(source, assertion);
        possibly_propagate_isa_collection_subset_fn_the_set_of(assertion);
        possibly_propagate_isa_the_collection_of(assertion);
        sbhl_link_methods.possibly_add_non_fort_isa(assertion);
        return NIL;
    }

    public static SubLObject possibly_propagate_isa_collection_subset_fn_the_set_of(final SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject isa_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = isa_formula;
            SubLObject v_isa = NIL;
            SubLObject v_term = NIL;
            SubLObject subset_expr = NIL;
            destructuring_bind_must_consp(current, datum, $list183);
            v_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list183);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list183);
            subset_expr = current.first();
            current = current.rest();
            if (NIL == current) {
                if (v_isa.eql($$isa) && (NIL != el_formula_with_operator_p(subset_expr, $$CollectionSubsetFn))) {
                    SubLObject current_$469;
                    final SubLObject datum_$468 = current_$469 = subset_expr;
                    SubLObject csfn = NIL;
                    SubLObject col = NIL;
                    SubLObject colexpr = NIL;
                    destructuring_bind_must_consp(current_$469, datum_$468, $list185);
                    csfn = current_$469.first();
                    current_$469 = current_$469.rest();
                    destructuring_bind_must_consp(current_$469, datum_$468, $list185);
                    col = current_$469.first();
                    current_$469 = current_$469.rest();
                    destructuring_bind_must_consp(current_$469, datum_$468, $list185);
                    colexpr = current_$469.first();
                    current_$469 = current_$469.rest();
                    if (NIL == current_$469) {
                        possibly_propagate_isa_the_set_of(colexpr, v_term, assertion);
                    } else {
                        cdestructuring_bind_error(datum_$468, $list185);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list183);
            }
        }
        return NIL;
    }

    public static SubLObject possibly_propagate_isa_the_collection_of(final SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject isa_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = isa_formula;
            SubLObject v_isa = NIL;
            SubLObject v_term = NIL;
            SubLObject colexpr = NIL;
            destructuring_bind_must_consp(current, datum, $list186);
            v_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list186);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list186);
            colexpr = current.first();
            current = current.rest();
            if (NIL == current) {
                if (v_isa.eql($$isa) && (NIL != el_formula_with_operator_p(colexpr, $$TheCollectionOf))) {
                    possibly_propagate_isa_the_set_of(colexpr, v_term, assertion);
                }
            } else {
                cdestructuring_bind_error(datum, $list186);
            }
        }
        return NIL;
    }

    public static SubLObject possibly_propagate_isa_the_set_of(final SubLObject colexpr, final SubLObject v_term, final SubLObject assertion) {
        SubLObject tso = NIL;
        SubLObject var = NIL;
        SubLObject prop = NIL;
        destructuring_bind_must_consp(colexpr, colexpr, $list188);
        tso = colexpr.first();
        SubLObject current = colexpr.rest();
        destructuring_bind_must_consp(current, colexpr, $list188);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, colexpr, $list188);
        prop = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject transformed_conclusion = cycl_utilities.expression_subst(v_term, var, prop, UNPROVIDED, UNPROVIDED);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            fi.fi_add_argument_int(transformed_conclusion, mt, list(assertion), $FORWARD, T);
        } else {
            cdestructuring_bind_error(colexpr, $list188);
        }
        return NIL;
    }

    public static SubLObject instanceof_after_removing(SubLObject source, final SubLObject assertion) {
        return isa_after_removing(source, assertion);
    }

    public static SubLObject isa_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$isa));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        sbhl_link_methods.possibly_remove_non_fort_isa(assertion);
        return NIL;
    }

    public static SubLObject clear_isa_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$isa));
        return NIL;
    }

    public static SubLObject clear_node_isa_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$isa), node);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject reset_isa_links(final SubLObject node) {
        final SubLObject mts = isas_mts(node);
        clear_node_isa_links(node);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reset_isa_links_in_mt(node, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_isa_links_in_mt(final SubLObject node, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(node, mt, sbhl_module_vars.get_sbhl_module($$isa));
        return NIL;
    }

    public static SubLObject reset_isa_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_isa_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$isa));
        return NIL;
    }

    public static SubLObject quoted_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject result = sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, mt, tv, UNPROVIDED);
        if (NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term)) {
            result = list_utilities.fast_delete_duplicates(nconc(sbhl_link_methods.quoted_isas_from_naut_arg2(v_term, mt, tv), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject nat_quoted_isa(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return quoted_isa(nart, mt, tv);
        }
        final SubLObject nat_functor = cycl_utilities.nat_functor(naut);
        return nconc(kb_accessors.evaluation_result_quoted_isa(nat_functor, mt), kb_accessors.result_quoted_isa(nat_functor, mt));
    }

    public static SubLObject not_quoted_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, mt, tv, UNPROVIDED);
    }

    public static SubLObject quoted_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        return makeBoolean((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, collection, mt, tv)) || (NIL != (NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term) ? genls.any_specP(collection, sbhl_link_methods.quoted_isas_from_naut_arg2(v_term, mt, tv), mt, tv) : NIL)));
    }

    public static SubLObject quoted_isa_in_any_mtP(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject qisaP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            qisaP = quoted_isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return qisaP;
    }

    public static SubLObject any_quoted_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        if (NIL == collections) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(collections)) {
            return quoted_isaP(v_term, collections.first(), mt, tv);
        }
        return makeBoolean((NIL != sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, collections, mt, tv)) || (NIL != (NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term) ? genls.any_genl_anyP(sbhl_link_methods.quoted_isas_from_naut_arg2(v_term, mt, tv), collections, mt, tv) : NIL)));
    }

    public static SubLObject quoted_isa_anyP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        return any_quoted_isaP(v_term, collections, mt, tv);
    }

    public static SubLObject all_quoted_isaP(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        if (NIL == collections) {
            return T;
        }
        if (NIL != list_utilities.singletonP(collections)) {
            return quoted_isaP(v_term, collections.first(), mt, tv);
        }
        return makeBoolean((NIL != sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, collections, mt, tv)) || (NIL != (NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term) ? genls.any_genl_allP(sbhl_link_methods.quoted_isas_from_naut_arg2(v_term, mt, tv), collections, mt, tv) : NIL)));
    }

    public static SubLObject not_quoted_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
        return makeBoolean((NIL != not_quoted_isa_by_extent_knownP(v_term, collection, mt, tv)) || (NIL != not_quoted_isa_by_sbhlP(v_term, collection, mt, tv)));
    }

    public static SubLObject not_quoted_isa_by_sbhlP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, collection, mt, tv);
    }

    public static SubLObject not_quoted_isa_by_extent_knownP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt)) {
            return makeBoolean(NIL == quoted_isaP(v_term, collection, mt, tv));
        }
        return NIL;
    }

    public static SubLObject quoted_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $$True_JustificationTruth;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject union_all_quoted_instances(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(cols)) {
            return all_quoted_instances(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), cols, mt, tv);
    }

    public static SubLObject map_all_quoted_isa(final SubLObject fn, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, fn, mt, tv);
        return NIL;
    }

    public static SubLObject map_all_quoted_instances(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), col, fn, mt, tv);
        return NIL;
    }

    public static SubLObject map_quoted_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module = sbhl_module_vars.get_sbhl_module($$quotedIsa);
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$470 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$471 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$472 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$471 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$472 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$472 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$473 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$473 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$473 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$474 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$475 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$474 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$474 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$483 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$484 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject rest;
                                        SubLObject module_var;
                                        SubLObject _prev_bind_0_$476;
                                        SubLObject _prev_bind_1_$475;
                                        SubLObject node;
                                        SubLObject d_link;
                                        SubLObject mt_links;
                                        SubLObject iteration_state;
                                        SubLObject mt_$487;
                                        SubLObject tv_links;
                                        SubLObject _prev_bind_0_$477;
                                        SubLObject iteration_state_$489;
                                        SubLObject tv_$490;
                                        SubLObject link_nodes;
                                        SubLObject _prev_bind_0_$478;
                                        SubLObject sol;
                                        SubLObject set_contents_var;
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject quoted_isa;
                                        SubLObject csome_list_var;
                                        SubLObject quoted_isa2;
                                        SubLObject new_list;
                                        SubLObject rest_$492;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$479;
                                        SubLObject sol2;
                                        SubLObject link_nodes2;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject quoted_isa3;
                                        SubLObject csome_list_var2;
                                        SubLObject quoted_isa4;
                                        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                            module_var = rest.first();
                                            _prev_bind_0_$476 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            _prev_bind_1_$475 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                node = function_terms.naut_to_nart(v_term);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                mt_$487 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$487)) {
                                                                    _prev_bind_0_$477 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$487, thread);
                                                                        for (iteration_state_$489 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$489)); iteration_state_$489 = dictionary_contents.do_dictionary_contents_next(iteration_state_$489)) {
                                                                            thread.resetMultipleValues();
                                                                            tv_$490 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$489);
                                                                            link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$490)) {
                                                                                _prev_bind_0_$478 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$490, thread);
                                                                                    sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            quoted_isa = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, quoted_isa)) {
                                                                                                funcall(function, quoted_isa);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                                                csome_list_var = sol;
                                                                                                quoted_isa2 = NIL;
                                                                                                quoted_isa2 = csome_list_var.first();
                                                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                                                    funcall(function, quoted_isa2);
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    quoted_isa2 = csome_list_var.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$478, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$489);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$477, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str40$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        for (rest_$492 = NIL, rest_$492 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$492); rest_$492 = rest_$492.rest()) {
                                                            generating_fn = rest_$492.first();
                                                            _prev_bind_0_$479 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        quoted_isa3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state2, quoted_isa3)) {
                                                                            funcall(function, quoted_isa3);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                            csome_list_var2 = sol2;
                                                                            quoted_isa4 = NIL;
                                                                            quoted_isa4 = csome_list_var2.first();
                                                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                                                funcall(function, quoted_isa4);
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                quoted_isa4 = csome_list_var2.first();
                                                                            } 
                                                                        }
                                                                    } else {
                                                                        Errors.error($str39$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$479, thread);
                                                            }
                                                        }
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$475, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$476, thread);
                                            }
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$484, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$483, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$474, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$474, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$475, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$474, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$473, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$473, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$473, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$472, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$472, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$471, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$472, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$471, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$470, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term)) {
            module = sbhl_module_vars.get_sbhl_module($$genls);
            final SubLObject mt_var2 = mt;
            final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                final SubLObject tv_var2 = tv;
                final SubLObject _prev_bind_0_$480 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$476 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var2) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2))) {
                        final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var2.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var2.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str32$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var2.eql($WARN)) {
                                    Errors.warn($str32$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str32$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$481 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        SubLObject cdolist_list_var = gethash(v_term, sbhl_link_methods.$quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED);
                        SubLObject quoted_isa_tuple = NIL;
                        quoted_isa_tuple = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = quoted_isa_tuple;
                            SubLObject naut = NIL;
                            SubLObject quoted_isa_mt = NIL;
                            SubLObject quoted_isa_tv = NIL;
                            destructuring_bind_must_consp(current, datum, $list205);
                            naut = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list205);
                            quoted_isa_mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list205);
                            quoted_isa_tv = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ((NIL != mt_relevance_macros.relevant_mtP(quoted_isa_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(quoted_isa_tv))) {
                                    final SubLObject quoted_isa5 = naut;
                                    funcall(function, quoted_isa5);
                                    SubLObject cdolist_list_var_$497;
                                    final SubLObject new_list2 = cdolist_list_var_$497 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                    SubLObject generating_fn2 = NIL;
                                    generating_fn2 = cdolist_list_var_$497.first();
                                    while (NIL != cdolist_list_var_$497) {
                                        final SubLObject _prev_bind_0_$482 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                            final SubLObject quoted_isa6 = funcall(generating_fn2, naut);
                                            funcall(function, quoted_isa6);
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$482, thread);
                                        }
                                        cdolist_list_var_$497 = cdolist_list_var_$497.rest();
                                        generating_fn2 = cdolist_list_var_$497.first();
                                    } 
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list205);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            quoted_isa_tuple = cdolist_list_var.first();
                        } 
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$481, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$476, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$480, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_8, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_7, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_6, thread);
            }
        }
        return NIL;
    }

    public static SubLObject map_min_quoted_isa(final SubLObject function, final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        map_quoted_isa(function, v_term, mt, tv);
        return NIL;
    }

    public static SubLObject all_quoted_isa(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLObject result = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, mt, tv);
        if (NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term)) {
            result = list_utilities.fast_delete_duplicates(nconc(genls.union_all_genls(sbhl_link_methods.quoted_isas_from_naut_arg2(v_term, mt, tv), mt, tv), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == $sbhl_may_return_naut_collections_as_fortsP$.getDynamicValue(thread)) {
            result = list_utilities.remove_if_not(FORT_P, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject all_quoted_isa_in_any_mt(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            all_isa = all_quoted_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_isa;
    }

    public static SubLObject all_quoted_isa_in_mt(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            all_isa = all_quoted_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_isa;
    }

    public static SubLObject all_quoted_isa_in_mts(final SubLObject v_term, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            all_isa = all_quoted_isa(v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_isa;
    }

    public static SubLObject all_quoted_isas_wrt(final SubLObject v_term, final SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, EL_FORT_P);
        SubLTrampolineFile.enforceType(v_isa, EL_FORT_P);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $all_isas_wrt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $all_isas_wrt_isa$.currentBinding(thread);
        try {
            $all_isas_wrt$.bind(NIL, thread);
            $all_isas_wrt_isa$.bind(v_isa, thread);
            map_all_quoted_isa(GATHER_ISA_WRT_ISA, v_term, mt, tv);
            result = $all_isas_wrt$.getDynamicValue(thread);
        } finally {
            $all_isas_wrt_isa$.rebind(_prev_bind_2, thread);
            $all_isas_wrt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_quoted_instances(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$quotedIsa), col, mt, tv);
    }

    public static SubLObject all_quoted_instances_in_all_mts(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = all_quoted_instances(collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_quoted_isa_among(final SubLObject v_term, final SubLObject collections, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        SubLTrampolineFile.enforceType(collections, LISTP);
        if (NIL == collections) {
            return NIL;
        }
        if (NIL == list_utilities.singletonP(collections)) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, collections, mt, tv);
        }
        if (NIL != quoted_isaP(v_term, collections.first(), mt, tv)) {
            return collections;
        }
        return NIL;
    }

    public static SubLObject asserted_quoted_isaP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, mt);
    }

    public static SubLObject asserted_quoted_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$quotedIsa), v_term, mt);
    }

    public static SubLObject quoted_instanceof_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$quotedIsa));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_quoted_isa_dependent_caches(source, assertion);
        return NIL;
    }

    public static SubLObject quoted_instanceof_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$quotedIsa));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        return NIL;
    }

    public static SubLObject all_instances_via_indexing(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return instances_via_indexing(col, mt);
    }

    public static SubLObject instances_via_indexing(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$499 = NIL;
                            final SubLObject token_var_$500 = NIL;
                            while (NIL == done_var_$499) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$500);
                                final SubLObject valid_$501 = makeBoolean(!token_var_$500.eql(gaf));
                                if (NIL != valid_$501) {
                                    final SubLObject ins = assertions_high.gaf_arg1(gaf);
                                    result = cons(ins, result);
                                }
                                done_var_$499 = makeBoolean(NIL == valid_$501);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$502 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$502, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject declare_isa_file() {
        declareFunction(me, "isa", "ISA", 1, 2, false);
        declareFunction(me, "min_isa", "MIN-ISA", 1, 2, false);
        declareFunction(me, "min_isa_in_mt", "MIN-ISA-IN-MT", 2, 0, false);
        declareFunction(me, "nat_isa", "NAT-ISA", 1, 2, false);
        declareFunction(me, "naut_isa", "NAUT-ISA", 1, 1, false);
        declareFunction(me, "not_isa", "NOT-ISA", 1, 2, false);
        declareFunction(me, "max_not_isa", "MAX-NOT-ISA", 1, 2, false);
        declareFunction(me, "nat_max_not_isa", "NAT-MAX-NOT-ISA", 1, 2, false);
        declareFunction(me, "instances", "INSTANCES", 1, 2, false);
        declareFunction(me, "max_instances", "MAX-INSTANCES", 1, 2, false);
        declareFunction(me, "all_instances_with_max", "ALL-INSTANCES-WITH-MAX", 2, 0, false);
        declareFunction(me, "not_instances", "NOT-INSTANCES", 1, 2, false);
        declareFunction(me, "min_not_instances", "MIN-NOT-INSTANCES", 1, 2, false);
        declareFunction(me, "isa_siblings", "ISA-SIBLINGS", 1, 2, false);
        declareFunction(me, "instance_siblings", "INSTANCE-SIBLINGS", 1, 2, false);
        declareFunction(me, "map_isa", "MAP-ISA", 2, 2, false);
        declareFunction(me, "map_min_isa", "MAP-MIN-ISA", 2, 2, false);
        declareFunction(me, "map_instances", "MAP-INSTANCES", 2, 2, false);
        declareFunction(me, "min_isas_of_type", "MIN-ISAS-OF-TYPE", 2, 2, false);
        declareFunction(me, "all_isa", "ALL-ISA", 1, 2, false);
        declareFunction(me, "all_isa_in_any_mt", "ALL-ISA-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "all_isa_in_mt", "ALL-ISA-IN-MT", 1, 1, false);
        declareFunction(me, "all_isa_in_mts", "ALL-ISA-IN-MTS", 1, 1, false);
        declareFunction(me, "nat_all_isa", "NAT-ALL-ISA", 1, 2, false);
        declareFunction(me, "all_instances", "ALL-INSTANCES", 1, 2, false);
        declareFunction(me, "all_instances_in_all_mts", "ALL-INSTANCES-IN-ALL-MTS", 1, 0, false);
        declareFunction(me, "all_fort_instances", "ALL-FORT-INSTANCES", 1, 2, false);
        declareFunction(me, "all_non_prototypical_fort_instances", "ALL-NON-PROTOTYPICAL-FORT-INSTANCES", 1, 2, false);
        declareFunction(me, "all_fort_instances_in_all_mts", "ALL-FORT-INSTANCES-IN-ALL-MTS", 1, 0, false);
        declareFunction(me, "all_isas_wrt", "ALL-ISAS-WRT", 2, 2, false);
        declareFunction(me, "gather_isa_wrt_isa", "GATHER-ISA-WRT-ISA", 1, 0, false);
        declareFunction(me, "union_all_isa", "UNION-ALL-ISA", 1, 2, false);
        declareFunction(me, "union_all_instances", "UNION-ALL-INSTANCES", 1, 2, false);
        declareFunction(me, "all_isa_among", "ALL-ISA-AMONG", 2, 2, false);
        declareFunction(me, "isa_allP", "ISA-ALL?", 3, 0, false);
        declareFunction(me, "min_isa_among", "MIN-ISA-AMONG", 2, 2, false);
        declareFunction(me, "all_instances_among", "ALL-INSTANCES-AMONG", 2, 2, false);
        declareFunction(me, "all_instances_among_fast", "ALL-INSTANCES-AMONG-FAST", 2, 1, false);
        declareFunction(me, "all_isa_if", "ALL-ISA-IF", 2, 2, false);
        declareFunction(me, "all_instances_if", "ALL-INSTANCES-IF", 2, 2, false);
        declareFunction(me, "all_isa_if_with_pruning", "ALL-ISA-IF-WITH-PRUNING", 2, 2, false);
        declareFunction(me, "all_not_isa", "ALL-NOT-ISA", 1, 2, false);
        declareFunction(me, "all_not_instances", "ALL-NOT-INSTANCES", 1, 2, false);
        declareFunction(me, "not_isa_among", "NOT-ISA-AMONG", 2, 2, false);
        declareFunction(me, "not_instances_among", "NOT-INSTANCES-AMONG", 0, 0, false);
        declareFunction(me, "map_all_isa", "MAP-ALL-ISA", 2, 2, false);
        declareFunction(me, "map_all_instances", "MAP-ALL-INSTANCES", 2, 2, false);
        declareFunction(me, "any_all_isa", "ANY-ALL-ISA", 2, 2, false);
        declareFunction(me, "any_wrt_all_isa", "ANY-WRT-ALL-ISA", 2, 2, false);
        declareFunction(me, "any_all_forward_true_nodes_isa", "ANY-ALL-FORWARD-TRUE-NODES-ISA", 3, 2, false);
        declareFunction(me, "sample_leaf_instances", "SAMPLE-LEAF-INSTANCES", 1, 3, false);
        declareFunction(me, "sample_different_leaf_instances", "SAMPLE-DIFFERENT-LEAF-INSTANCES", 2, 3, false);
        declareFunction(me, "sbhl_record_all_isa", "SBHL-RECORD-ALL-ISA", 1, 2, false);
        declareFunction(me, "count_all_instances", "COUNT-ALL-INSTANCES", 1, 2, false);
        declareFunction(me, "count_all_instances_if", "COUNT-ALL-INSTANCES-IF", 2, 2, false);
        declareFunction(me, "count_all_instances_E", "COUNT-ALL-INSTANCES-=", 2, 2, false);
        declareFunction(me, "count_all_instances_G", "COUNT-ALL-INSTANCES->", 2, 2, false);
        declareFunction(me, "count_all_instances_GE", "COUNT-ALL-INSTANCES->=", 2, 2, false);
        declareFunction(me, "count_all_instances_L", "COUNT-ALL-INSTANCES-<", 2, 2, false);
        declareFunction(me, "count_all_instances_LE", "COUNT-ALL-INSTANCES-<=", 2, 2, false);
        declareFunction(me, "count_all_quoted_instances", "COUNT-ALL-QUOTED-INSTANCES", 1, 2, false);
        declareFunction(me, "count_all_quoted_instances_if", "COUNT-ALL-QUOTED-INSTANCES-IF", 2, 2, false);
        declareFunction(me, "count_all_quoted_instances_E", "COUNT-ALL-QUOTED-INSTANCES-=", 2, 2, false);
        declareFunction(me, "count_all_quoted_instances_G", "COUNT-ALL-QUOTED-INSTANCES->", 2, 2, false);
        declareFunction(me, "count_all_quoted_instances_GE", "COUNT-ALL-QUOTED-INSTANCES->=", 2, 2, false);
        declareFunction(me, "count_all_quoted_instances_L", "COUNT-ALL-QUOTED-INSTANCES-<", 2, 2, false);
        declareFunction(me, "count_all_quoted_instances_LE", "COUNT-ALL-QUOTED-INSTANCES-<=", 2, 2, false);
        declareFunction(me, "isaP", "ISA?", 2, 2, false);
        declareFunction(me, "isa_in_mtsP", "ISA-IN-MTS?", 3, 0, false);
        declareFunction(me, "isa_in_any_mtP", "ISA-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "nat_isaP", "NAT-ISA?", 2, 2, false);
        declareFunction(me, "nat_isa_intP", "NAT-ISA-INT?", 3, 0, false);
        declareFunction(me, "result_isa_colP", "RESULT-ISA-COL?", 2, 1, false);
        declareFunction(me, "weak_not_result_isa_colP", "WEAK-NOT-RESULT-ISA-COL?", 2, 1, false);
        declareFunction(me, "result_isa_arg_colP", "RESULT-ISA-ARG-COL?", 2, 1, false);
        declareFunction(me, "weak_not_result_isa_arg_colP", "WEAK-NOT-RESULT-ISA-ARG-COL?", 2, 1, false);
        declareFunction(me, "result_isa_inter_arg_colP", "RESULT-ISA-INTER-ARG-COL?", 2, 1, false);
        declareFunction(me, "result_isa_inter_arg_reln_colP", "RESULT-ISA-INTER-ARG-RELN-COL?", 2, 1, false);
        declareFunction(me, "isaP_goal", "ISA?-GOAL", 1, 0, false);
        declareFunction(me, "any_isaP", "ANY-ISA?", 2, 2, false);
        declareFunction(me, "isa_anyP", "ISA-ANY?", 2, 2, false);
        declareFunction(me, "nat_any_isaP", "NAT-ANY-ISA?", 2, 2, false);
        declareFunction(me, "find_if_isaP", "FIND-IF-ISA?", 2, 0, false);
        declareFunction(me, "all_isaP", "ALL-ISA?", 2, 2, false);
        declareFunction(me, "all_instancesP", "ALL-INSTANCES?", 2, 2, false);
        declareFunction(me, "any_isa_anyP", "ANY-ISA-ANY?", 2, 2, false);
        declareFunction(me, "not_isaP", "NOT-ISA?", 2, 2, false);
        declareFunction(me, "not_isa_someP", "NOT-ISA-SOME?", 2, 2, false);
        declareFunction(me, "not_isa_by_sbhlP", "NOT-ISA-BY-SBHL?", 2, 2, false);
        declareFunction(me, "not_isa_by_extent_knownP", "NOT-ISA-BY-EXTENT-KNOWN?", 2, 2, false);
        declareFunction(me, "argue_not_isaP", "ARGUE-NOT-ISA?", 2, 2, false);
        declareFunction(me, "not_isa_in_any_mtP", "NOT-ISA-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "nat_not_isaP", "NAT-NOT-ISA?", 2, 2, false);
        declareFunction(me, "why_isaP", "WHY-ISA?", 2, 3, false);
        declareFunction(me, "any_just_of_isa", "ANY-JUST-OF-ISA", 2, 1, false);
        declareFunction(me, "any_just_of_nat_isa", "ANY-JUST-OF-NAT-ISA", 2, 1, false);
        declareFunction(me, "why_not_isaP", "WHY-NOT-ISA?", 2, 3, false);
        declareFunction(me, "any_just_of_not_isa", "ANY-JUST-OF-NOT-ISA", 2, 1, false);
        declareFunction(me, "any_just_of_nat_not_isa", "ANY-JUST-OF-NAT-NOT-ISA", 2, 1, false);
        declareFunction(me, "instancesP", "INSTANCES?", 1, 2, false);
        declareFunction(me, "instancesP_int", "INSTANCES?-INT", 1, 2, false);
        declareFunction(me, "forts_of_type", "FORTS-OF-TYPE", 2, 2, false);
        declareFunction(me, "all_isa_mts", "ALL-ISA-MTS", 1, 0, false);
        declareFunction(me, "gather_genls_mts", "GATHER-GENLS-MTS", 1, 0, false);
        declareFunction(me, "partial_isa_extensionP", "PARTIAL-ISA-EXTENSION?", 1, 1, false);
        declareFunction(me, "random_instance_of", "RANDOM-INSTANCE-OF", 1, 1, false);
        declareFunction(me, "min_ceiling_isa", "MIN-CEILING-ISA", 1, 3, false);
        declareFunction(me, "nearest_common_isa", "NEAREST-COMMON-ISA", 1, 3, false);
        declareFunction(me, "max_floor_instances", "MAX-FLOOR-INSTANCES", 1, 2, false);
        declareFunction(me, "max_floor_mts_of_isa_paths_wrt", "MAX-FLOOR-MTS-OF-ISA-PATHS-WRT", 3, 0, false);
        declareFunction(me, "max_floor_mts_of_isa_paths", "MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_quoted_isa_paths", "MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_isa_paths", "MIN-MTS-OF-ISA-PATHS", 2, 1, false);
        declareFunction(me, "nat_min_mts_of_isa_paths", "NAT-MIN-MTS-OF-ISA-PATHS", 2, 0, false);
        declareFunction(me, "min_mts_of_quoted_isa_paths", "MIN-MTS-OF-QUOTED-ISA-PATHS", 2, 1, false);
        declareFunction(me, "nat_min_mts_of_quoted_isa_paths", "NAT-MIN-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
        declareFunction(me, "gather_min_mts_of_paths_between", "GATHER-MIN-MTS-OF-PATHS-BETWEEN", 1, 0, false);
        declareFunction(me, "cache_mts_of_arg", "CACHE-MTS-OF-ARG", 1, 0, false);
        declareFunction(me, "max_floor_mts_of_not_isa_paths", "MAX-FLOOR-MTS-OF-NOT-ISA-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_not_isa_paths", "MIN-MTS-OF-NOT-ISA-PATHS", 2, 1, false);
        declareFunction(me, "instantiationP", "INSTANTIATION?", 2, 1, false);
        declareFunction(me, "instantiations", "INSTANTIATIONS", 1, 1, false);
        declareFunction(me, "all_instantiations", "ALL-INSTANTIATIONS", 1, 1, false);
        declareFunction(me, "random_instantiation", "RANDOM-INSTANTIATION", 1, 1, false);
        declareFunction(me, "set_naut_p", "SET-NAUT-P", 1, 0, false);
        declareFunction(me, "member_of_cycl_setP", "MEMBER-OF-CYCL-SET?", 2, 0, false);
        declareFunction(me, "members_of_cycl_set", "MEMBERS-OF-CYCL-SET", 1, 0, false);
        declareFunction(me, "random_member_of_cycl_set", "RANDOM-MEMBER-OF-CYCL-SET", 1, 0, false);
        declareFunction(me, "isas_mts", "ISAS-MTS", 1, 0, false);
        declareFunction(me, "isa_mts", "ISA-MTS", 1, 0, false);
        declareFunction(me, "type_mts", "TYPE-MTS", 1, 0, false);
        declareFunction(me, "asserted_isaP", "ASSERTED-ISA?", 1, 1, false);
        declareFunction(me, "asserted_isa", "ASSERTED-ISA", 1, 1, false);
        declareFunction(me, "asserted_not_isa", "ASSERTED-NOT-ISA", 1, 1, false);
        declareFunction(me, "supported_isa", "SUPPORTED-ISA", 1, 1, false);
        declareFunction(me, "supported_not_isa", "SUPPORTED-NOT-ISA", 1, 1, false);
        declareFunction(me, "asserted_instance", "ASSERTED-INSTANCE", 1, 1, false);
        declareFunction(me, "asserted_not_instance", "ASSERTED-NOT-INSTANCE", 1, 1, false);
        declareFunction(me, "supported_instance", "SUPPORTED-INSTANCE", 1, 1, false);
        declareFunction(me, "supported_not_instance", "SUPPORTED-NOT-INSTANCE", 1, 1, false);
        declareFunction(me, "instanceof_after_adding", "INSTANCEOF-AFTER-ADDING", 2, 0, false);
        new isa.$instanceof_after_adding$BinaryFunction();
        declareFunction(me, "isa_after_adding", "ISA-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "possibly_propagate_isa_collection_subset_fn_the_set_of", "POSSIBLY-PROPAGATE-ISA-COLLECTION-SUBSET-FN-THE-SET-OF", 1, 0, false);
        declareFunction(me, "possibly_propagate_isa_the_collection_of", "POSSIBLY-PROPAGATE-ISA-THE-COLLECTION-OF", 1, 0, false);
        declareFunction(me, "possibly_propagate_isa_the_set_of", "POSSIBLY-PROPAGATE-ISA-THE-SET-OF", 3, 0, false);
        declareFunction(me, "instanceof_after_removing", "INSTANCEOF-AFTER-REMOVING", 2, 0, false);
        new isa.$instanceof_after_removing$BinaryFunction();
        declareFunction(me, "isa_after_removing", "ISA-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "clear_isa_graph", "CLEAR-ISA-GRAPH", 0, 0, false);
        declareFunction(me, "clear_node_isa_links", "CLEAR-NODE-ISA-LINKS", 1, 0, false);
        declareFunction(me, "reset_isa_links", "RESET-ISA-LINKS", 1, 0, false);
        declareFunction(me, "reset_isa_links_in_mt", "RESET-ISA-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_isa_graph", "RESET-ISA-GRAPH", 0, 1, false);
        declareFunction(me, "quoted_isa", "QUOTED-ISA", 1, 2, false);
        declareFunction(me, "nat_quoted_isa", "NAT-QUOTED-ISA", 1, 2, false);
        declareFunction(me, "not_quoted_isa", "NOT-QUOTED-ISA", 1, 2, false);
        declareFunction(me, "quoted_isaP", "QUOTED-ISA?", 2, 2, false);
        declareFunction(me, "quoted_isa_in_any_mtP", "QUOTED-ISA-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "any_quoted_isaP", "ANY-QUOTED-ISA?", 2, 2, false);
        declareFunction(me, "quoted_isa_anyP", "QUOTED-ISA-ANY?", 2, 2, false);
        declareFunction(me, "all_quoted_isaP", "ALL-QUOTED-ISA?", 2, 2, false);
        declareFunction(me, "not_quoted_isaP", "NOT-QUOTED-ISA?", 2, 2, false);
        declareFunction(me, "not_quoted_isa_by_sbhlP", "NOT-QUOTED-ISA-BY-SBHL?", 2, 2, false);
        declareFunction(me, "not_quoted_isa_by_extent_knownP", "NOT-QUOTED-ISA-BY-EXTENT-KNOWN?", 2, 2, false);
        declareFunction(me, "quoted_instances", "QUOTED-INSTANCES", 1, 2, false);
        declareFunction(me, "union_all_quoted_instances", "UNION-ALL-QUOTED-INSTANCES", 1, 2, false);
        declareFunction(me, "map_all_quoted_isa", "MAP-ALL-QUOTED-ISA", 2, 2, false);
        declareFunction(me, "map_all_quoted_instances", "MAP-ALL-QUOTED-INSTANCES", 2, 2, false);
        declareFunction(me, "map_quoted_isa", "MAP-QUOTED-ISA", 2, 2, false);
        declareFunction(me, "map_min_quoted_isa", "MAP-MIN-QUOTED-ISA", 2, 2, false);
        declareFunction(me, "all_quoted_isa", "ALL-QUOTED-ISA", 1, 2, false);
        declareFunction(me, "all_quoted_isa_in_any_mt", "ALL-QUOTED-ISA-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "all_quoted_isa_in_mt", "ALL-QUOTED-ISA-IN-MT", 1, 1, false);
        declareFunction(me, "all_quoted_isa_in_mts", "ALL-QUOTED-ISA-IN-MTS", 1, 1, false);
        declareFunction(me, "all_quoted_isas_wrt", "ALL-QUOTED-ISAS-WRT", 2, 2, false);
        declareFunction(me, "all_quoted_instances", "ALL-QUOTED-INSTANCES", 1, 2, false);
        declareFunction(me, "all_quoted_instances_in_all_mts", "ALL-QUOTED-INSTANCES-IN-ALL-MTS", 1, 0, false);
        declareFunction(me, "all_quoted_isa_among", "ALL-QUOTED-ISA-AMONG", 2, 2, false);
        declareFunction(me, "asserted_quoted_isaP", "ASSERTED-QUOTED-ISA?", 1, 1, false);
        declareFunction(me, "asserted_quoted_isa", "ASSERTED-QUOTED-ISA", 1, 1, false);
        declareFunction(me, "quoted_instanceof_after_adding", "QUOTED-INSTANCEOF-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "quoted_instanceof_after_removing", "QUOTED-INSTANCEOF-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "all_instances_via_indexing", "ALL-INSTANCES-VIA-INDEXING", 1, 1, false);
        declareFunction(me, "instances_via_indexing", "INSTANCES-VIA-INDEXING", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_isa_file() {
        defparameter("*SBHL-MAY-RETURN-NAUT-COLLECTIONS-AS-FORTS?*", T);
        defparameter("*ALL-ISAS-WRT*", NIL);
        defparameter("*ALL-ISAS-WRT-ISA*", NIL);
        deflexical("*RANDOM-INSTANCE-OF-SAMPLING-RATIO*", TWENTY_INTEGER);
        return NIL;
    }

    public static SubLObject setup_isa_file() {
        register_cyc_api_function(MIN_ISA, $list4, $str5$Returns_most_specific_collections, $list6, $list7);
        register_cyc_api_function(MAX_NOT_ISA, $list4, $str10$Returns_most_general_collections_, $list6, $list7);
        register_cyc_api_function(INSTANCES, $list14, $str15$Returns_the_asserted_instances_of, $list16, $list7);
        register_cyc_api_function(MAX_INSTANCES, $list18, $str19$Returns_the_maximal_among_the_ass, $list16, $list7);
        register_external_symbol(ALL_INSTANCES_WITH_MAX);
        register_cyc_api_function(MIN_NOT_INSTANCES, $list18, $str24$Returns_the_most_specific_negated, $list16, $list7);
        register_cyc_api_function(ISA_SIBLINGS, $list4, $str26$Returns_the_direct_isas_of_those_, $list6, $list7);
        register_cyc_api_function(INSTANCE_SIBLINGS, $list4, $str28$Returns_the_direct_instances_of_t, $list29, $list7);
        register_cyc_api_function(MAP_INSTANCES, $list48, $str49$apply_FUNCTION_to_every__least_ge, $list50, NIL);
        register_cyc_api_function(ALL_ISA, $list4, $str52$Returns_all_collections_that_incl, $list6, $list53);
        register_cyc_api_function(ALL_INSTANCES, $list18, $str58$Returns_all_instances_of_COLLECTI, $list16, $list59);
        register_cyc_api_function(ALL_INSTANCES_IN_ALL_MTS, $list61, $str62$_return_listp__all_instances_of_C, $list63, $list59);
        define_obsolete_register(ALL_FORT_INSTANCES, $list65);
        register_external_symbol(ALL_FORT_INSTANCES);
        define_obsolete_register(ALL_FORT_INSTANCES_IN_ALL_MTS, $list68);
        register_cyc_api_function(ALL_ISAS_WRT, $list71, $str72$Returns_all_isa_of_term_TERM_that, $list73, $list7);
        register_cyc_api_function(UNION_ALL_ISA, $list77, $str78$Returns_all_collections_that_incl, $list79, $list7);
        register_cyc_api_function(UNION_ALL_INSTANCES, $list81, $str82$Returns_set_of_all_instances_of_e, $list83, $list7);
        register_cyc_api_function(ALL_ISA_AMONG, $list85, $str86$Returns_those_elements_of_COLLECT, $list87, $list7);
        register_cyc_api_function(ALL_INSTANCES_AMONG, $list89, $str90$Returns_those_elements_of_TERMS_t, $list91, $list59);
        register_cyc_api_function(ALL_NOT_ISA, $list4, $str96$Returns_all_collections_that_do_n, $list6, $list7);
        register_cyc_api_function(ALL_NOT_INSTANCES, $list18, $str98$Returns_all_terms_that_are_not_me, $list16, $list7);
        register_cyc_api_function(NOT_ISA_AMONG, $list85, $str100$Returns_those_elements_of_COLLECT, $list87, $list7);
        register_cyc_api_function(MAP_ALL_ISA, $list102, $str103$Apply_FUNCTION_to_every_all_isa_o, $list104, NIL);
        register_cyc_api_function(MAP_ALL_INSTANCES, $list106, $str107$Apply_FUNCTION_to_each_unique_ins, $list108, NIL);
        register_cyc_api_function(ANY_WRT_ALL_ISA, $list48, $str110$Return_the_first_encountered_non_, $list111, NIL);
        register_cyc_api_function(COUNT_ALL_INSTANCES, $list119, $str120$Counts_the_number_of_instances_in, $list63, $list121);
        register_cyc_api_function(COUNT_ALL_QUOTED_INSTANCES, $list119, $str124$Counts_the_number_of_quoted_insta, $list63, $list121);
        register_cyc_api_function($sym126$ISA_, $list127, $str128$Returns_whether_TERM_is_an_instan, $list63, $list129);
        register_cyc_api_function($sym130$ISA_IN_MTS_, $list131, $str132$is__term__an_element_of__collecti, $list63, $list129);
        register_cyc_api_function($sym133$ISA_IN_ANY_MT_, $list134, $str135$is__term__an_element_of__collecti, NIL, $list129);
        register_cyc_api_function($sym136$ANY_ISA_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129);
        register_cyc_api_function($sym138$ISA_ANY_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129);
        register_cyc_api_function($sym141$ANY_ISA_ANY_, $list142, $str143$_return_booleanp__whether_any_ter, $list144, $list129);
        register_cyc_api_function($sym145$NOT_ISA_, $list127, $str146$_return_booleanp__whether_TERM_is, $list147, $list129);
        register_cyc_api_function($sym148$WHY_ISA_, $list149, $str150$Returns_justification_of__isa_TER, $list147, $list151);
        register_cyc_api_function($sym158$WHY_NOT_ISA_, $list149, $str159$Returns_justification_of__not__is, $list147, $list151);
        register_cyc_api_function($sym160$INSTANCES_, $list119, $str161$Returns_whether_COLLECTION_has_an, $list63, $list129);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_ISA_PATHS, $list166, $str167$Returns_in_what__most_genl__mts_T, $list147, NIL);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_QUOTED_ISA_PATHS, $list166, $str169$Returns_in_what__most_genl__mts_T, $list147, NIL);
        register_kb_function(INSTANCEOF_AFTER_ADDING);
        register_kb_function(ISA_AFTER_ADDING);
        register_kb_function(INSTANCEOF_AFTER_REMOVING);
        register_kb_function(ISA_AFTER_REMOVING);
        register_cyc_api_function($sym192$QUOTED_ISA_, $list127, $str193$Returns_whether_TERM_is_a_quoted_, $list63, $list129);
        register_cyc_api_function($sym194$QUOTED_ISA_IN_ANY_MT_, $list134, $str135$is__term__an_element_of__collecti, NIL, $list129);
        register_cyc_api_function($sym195$ANY_QUOTED_ISA_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129);
        register_cyc_api_function($sym196$QUOTED_ISA_ANY_, $list85, $str137$Returns_whether_TERM_is_an_instan, $list87, $list129);
        register_cyc_api_function($sym197$ALL_QUOTED_ISA_, $list85, $str198$Returns_whether_TERM_is_a_quoted_, $list87, $list129);
        register_cyc_api_function($sym199$NOT_QUOTED_ISA_, $list127, $str146$_return_booleanp__whether_TERM_is, $list147, $list129);
        register_cyc_api_function(QUOTED_INSTANCES, $list14, $str15$Returns_the_asserted_instances_of, $list16, $list7);
        register_cyc_api_function(UNION_ALL_QUOTED_INSTANCES, $list81, $str202$Returns_set_of_all_quoted_instanc, $list83, $list7);
        register_cyc_api_function(MAP_ALL_QUOTED_ISA, $list102, $str204$Apply_FUNCTION_to_every_all_quote, $list104, NIL);
        register_cyc_api_function(ALL_QUOTED_ISA, $list4, $str52$Returns_all_collections_that_incl, $list6, $list7);
        register_cyc_api_function(ALL_QUOTED_ISAS_WRT, $list71, $str72$Returns_all_isa_of_term_TERM_that, $list73, $list7);
        register_cyc_api_function(ALL_QUOTED_INSTANCES, $list18, $str58$Returns_all_instances_of_COLLECTI, $list16, $list7);
        register_cyc_api_function(ALL_QUOTED_ISA_AMONG, $list85, $str210$Returns_those_elements_of_COLLECT, $list87, $list7);
        register_kb_function(QUOTED_INSTANCEOF_AFTER_ADDING);
        register_kb_function(QUOTED_INSTANCEOF_AFTER_REMOVING);
        define_test_case_table_int(MIN_COLS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list221);
        define_test_case_table_int(MAX_COLS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list221);
        define_test_case_table_int(UNION_ALL_ISA, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list223);
        define_test_case_table_int(ALL_ISA_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list225);
        define_test_case_table_int(ALL_INSTANCES_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list226);
        define_test_case_table_int(NOT_ISA_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list227);
        define_test_case_table_int($sym228$ALL_INSTANCES_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list229);
        define_test_case_table_int($sym141$ANY_ISA_ANY_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list230);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_isa_file();
    }

    @Override
    public void initializeVariables() {
        init_isa_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_isa_file();
    }

    

    public static final class $instanceof_after_adding$BinaryFunction extends BinaryFunction {
        public $instanceof_after_adding$BinaryFunction() {
            super(extractFunctionNamed("INSTANCEOF-AFTER-ADDING"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return instanceof_after_adding(arg1, arg2);
        }
    }

    public static final class $instanceof_after_removing$BinaryFunction extends BinaryFunction {
        public $instanceof_after_removing$BinaryFunction() {
            super(extractFunctionNamed("INSTANCEOF-AFTER-REMOVING"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return instanceof_after_removing(arg1, arg2);
        }
    }
}

/**
 * Total time: 13047 ms synthetic
 */
