package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$pgia_activeP$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.collection_intersection;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
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
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class genls extends SubLTranslatedFile {
    public static final SubLFile me = new genls();

    public static final String myName = "com.cyc.cycjava.cycl.genls";

    public static final String myFingerPrint = "c611f55ccab3febb0e4d67705efe4a4074b1b669d0ab39f4a005c82293097fbf";

    // defvar
    // consider #$isa gafs when determining if two collections intersect?
    private static final SubLSymbol $sbhl_infer_intersection_from_instancesP$ = makeSymbol("*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLSymbol MIN_GENLS = makeSymbol("MIN-GENLS");

    public static final SubLList $list2 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLString $str3$Returns_the_most_specific_genls_o = makeString("Returns the most-specific genls of collection COL");

    public static final SubLList $list4 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));



    public static final SubLSymbol MAX_NOT_GENLS = makeSymbol("MAX-NOT-GENLS");

    public static final SubLString $str7$Returns_the_least_specific_negate = makeString("Returns the least-specific negated genls of collection COL");

    public static final SubLList $list8 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));



    public static final SubLSymbol MAX_SPECS = makeSymbol("MAX-SPECS");

    public static final SubLString $str11$Returns_the_least_specific_specs_ = makeString("Returns the least-specific specs of collection COL");

    public static final SubLSymbol MIN_NOT_SPECS = makeSymbol("MIN-NOT-SPECS");

    public static final SubLString $str13$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specs of collection COL");

    public static final SubLSymbol GENL_SIBLINGS = makeSymbol("GENL-SIBLINGS");

    public static final SubLString $str15$Returns_the_direct_genls_of_those = makeString("Returns the direct genls of those direct spec collections of COL");

    public static final SubLSymbol SPEC_SIBLINGS = makeSymbol("SPEC-SIBLINGS");

    public static final SubLString $str17$Returns_the_direct_specs_of_those = makeString("Returns the direct specs of those direct genls collections of COL");



    public static final SubLString $str19$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    public static final SubLSymbol ALL_SPECS = makeSymbol("ALL-SPECS");

    public static final SubLString $str25$Returns_all_specs_of_collection_C = makeString("Returns all specs of collection COL \n   (descending transitive closure; expensive)");













    public static final SubLString $str32$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str38$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str39$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str40$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ALL_SPECS_WITH_MAX = makeSymbol("ALL-SPECS-WITH-MAX");



    private static final SubLSymbol $INVALID_ITERATION_TERM = makeKeyword("INVALID-ITERATION-TERM");

    private static final SubLSymbol $sym44$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol COUNT_ALL_SPECS = makeSymbol("COUNT-ALL-SPECS");

    public static final SubLList $list46 = list(makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str47$Counts_the_number_of_specs_in_COL = makeString("Counts the number of specs in COLLECTION and then returns the count.");

    private static final SubLList $list48 = list(list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));

    public static final SubLList $list49 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol ALL_GENLS_WRT = makeSymbol("ALL-GENLS-WRT");

    public static final SubLList $list51 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str52$Returns_all_genls_of_collection_S = makeString("Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)");

    private static final SubLList $list53 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")));



    private static final SubLSymbol UNION_ALL_GENLS = makeSymbol("UNION-ALL-GENLS");

    public static final SubLList $list56 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str57$Returns_all_genls_of_each_collect = makeString("Returns all genls of each collection in COLs");

    private static final SubLList $list58 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));

    private static final SubLSymbol UNION_ALL_SPECS = makeSymbol("UNION-ALL-SPECS");

    private static final SubLString $str60$Returns_all_specs_of_each_collect = makeString("Returns all specs of each collection in COLs");

    private static final SubLSymbol ALL_DEPENDENT_SPECS = makeSymbol("ALL-DEPENDENT-SPECS");

    private static final SubLString $str62$Returns_all_specs_s_of_COL_s_t__e = makeString("Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL");

    private static final SubLSymbol ALL_GENLS_AMONG = makeSymbol("ALL-GENLS-AMONG");

    public static final SubLList $list64 = list(makeSymbol("COL"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str65$Returns_those_genls_of_COL_that_a = makeString("Returns those genls of COL that are included among CANDIDATES");

    private static final SubLList $list66 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));

    private static final SubLSymbol ALL_SPECS_AMONG = makeSymbol("ALL-SPECS-AMONG");

    private static final SubLString $str68$Returns_those_specs_of_COL_that_a = makeString("Returns those specs of COL that are included among CANDIDATEs");



    private static final SubLSymbol ALL_GENLS_IF = makeSymbol("ALL-GENLS-IF");

    public static final SubLList $list71 = list(makeSymbol("FUNCTION"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str72$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)");

    private static final SubLList $list73 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol ALL_SPECS_IF = makeSymbol("ALL-SPECS-IF");

    private static final SubLSymbol ALL_NOT_GENLS = makeSymbol("ALL-NOT-GENLS");

    private static final SubLString $str76$Returns_all_negated_genls_of_coll = makeString("Returns all negated genls of collection COL \n   (descending transitive closure; expensive)");

    private static final SubLSymbol ALL_NOT_SPECS = makeSymbol("ALL-NOT-SPECS");

    private static final SubLString $str78$Returns_all_negated_specs_of_coll = makeString("Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)");

    private static final SubLSymbol MAP_ALL_GENLS = makeSymbol("MAP-ALL-GENLS");

    public static final SubLList $list80 = list(makeSymbol("FN"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str81$Applies_FN_to_every__all__genls_o = makeString("Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLList $list82 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol MAP_ALL_SPECS = makeSymbol("MAP-ALL-SPECS");

    private static final SubLString $str84$Applies_FN_to_every__all__specs_o = makeString("Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLSymbol ANY_ALL_GENLS = makeSymbol("ANY-ALL-GENLS");

    public static final SubLString $str86$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLSymbol ANY_ALL_SPECS = makeSymbol("ANY-ALL-SPECS");

    private static final SubLString $str88$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLSymbol $sym89$GENL_ = makeSymbol("GENL?");

    private static final SubLString $str90$Returns_whether____genls_SPEC_GEN = makeString("Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)");

    public static final SubLList $list91 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $sym92$SPEC_ = makeSymbol("SPEC?");

    private static final SubLList $list93 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLList $list94 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")));

    private static final SubLObject $$preservesGenlsInArg = reader_make_constant_shell(makeString("preservesGenlsInArg"));

    private static final SubLSymbol $sym96$ANY_GENL_ = makeSymbol("ANY-GENL?");

    public static final SubLList $list97 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str98$_any_genl__spec_genls__is_t_iff__ = makeString("(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");

    public static final SubLList $list99 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym100$ANY_SPEC_ = makeSymbol("ANY-SPEC?");

    public static final SubLList $list101 = list(makeSymbol("GENL"), makeSymbol("SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str102$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for some spec in SPECS");

    private static final SubLList $list103 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPECS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym104$ALL_GENL_ = makeSymbol("ALL-GENL?");

    private static final SubLString $str105$Returns_T_iff__genl__spec_genl__f = makeString("Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)");

    private static final SubLSymbol $sym106$ALL_SPEC_ = makeSymbol("ALL-SPEC?");

    private static final SubLString $str107$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for every spec in SPECS");

    private static final SubLSymbol $sym108$ANY_GENL_ANY_ = makeSymbol("ANY-GENL-ANY?");

    public static final SubLList $list109 = list(makeSymbol("SPECS"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str110$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS");

    private static final SubLList $list111 = list(list(makeSymbol("SPECS"), makeSymbol("LISTP")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym112$ANY_GENL_ALL_ = makeSymbol("ANY-GENL-ALL?");

    private static final SubLString $str113$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS");

    private static final SubLSymbol $sym114$ALL_SPEC_ANY_ = makeSymbol("ALL-SPEC-ANY?");

    private static final SubLString $str115$Return_T_iff_for_each_spec_in_SPE = makeString("Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)");

    private static final SubLSymbol $sym116$NOT_GENL_ = makeSymbol("NOT-GENL?");

    public static final SubLList $list117 = list(makeSymbol("COL"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str118$Return_whether_collection_NOT_GEN = makeString("Return whether collection NOT-GENL is not a genl of COL.");

    public static final SubLList $list119 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol $sym120$ALL_NOT_SPEC_ = makeSymbol("ALL-NOT-SPEC?");

    public static final SubLList $list121 = list(makeSymbol("COL"), makeSymbol("NOT-SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str122$Return_whether_every_collection_i = makeString("Return whether every collection in NOT-SPECS is not a spec of COL.");

    public static final SubLList $list123 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-SPECS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym124$ANY_NOT_GENL_ = makeSymbol("ANY-NOT-GENL?");

    public static final SubLList $list125 = list(makeSymbol("COL"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str126$Returns_whether_any_collection_in = makeString("Returns whether any collection in NOT-GENLS is not a genl of COL.");

    private static final SubLList $list127 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));





    private static final SubLSymbol $sym130$COLLECTIONS_COEXTENSIONAL_ = makeSymbol("COLLECTIONS-COEXTENSIONAL?");

    public static final SubLList $list131 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str132$Are_COL_1_and_COL_2_coextensional = makeString("Are COL-1 and COL-2 coextensional?");

    private static final SubLList $list133 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol $sym134$COLLECTIONS_INTERSECT_ = makeSymbol("COLLECTIONS-INTERSECT?");

    private static final SubLString $str135$Do_collections_COL_1_and_COL_2_in = makeString("Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)");





    private static final SubLSymbol $sym138$WHY_GENL_ = makeSymbol("WHY-GENL?");

    public static final SubLList $list139 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    private static final SubLString $str140$Justification_of__genls_SPEC_GENL = makeString("Justification of (genls SPEC GENL)");

    public static final SubLList $list141 = list(makeSymbol("LISTP"));

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLList $list143 = list(makeKeyword("TRUE"));

    private static final SubLObject $$resultGenl = reader_make_constant_shell(makeString("resultGenl"));

    private static final SubLObject $$resultGenlArg = reader_make_constant_shell(makeString("resultGenlArg"));

    private static final SubLObject $$interArgResultGenl = reader_make_constant_shell(makeString("interArgResultGenl"));

    private static final SubLObject $$interArgResultGenlReln = reader_make_constant_shell(makeString("interArgResultGenlReln"));

    private static final SubLSymbol $sym148$WHY_NOT_GENL_ = makeSymbol("WHY-NOT-GENL?");

    private static final SubLString $str149$Justification_of__not__genls_SPEC = makeString("Justification of (not (genls SPEC GENL))");

    private static final SubLSymbol $sym150$WHY_NOT_ASSERT_GENLS_ = makeSymbol("WHY-NOT-ASSERT-GENLS?");

    private static final SubLList $list151 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str152$Justification_of_why_asserting__g = makeString("Justification of why asserting (genls SPEC GENL) is not consistent");

    private static final SubLSymbol COLLECTION_LEAVES = makeSymbol("COLLECTION-LEAVES");

    private static final SubLString $str154$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among all-specs of COL");



    private static final SubLString $str156$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS");

    public static final SubLSymbol MIN_COL = makeSymbol("MIN-COL");

    public static final SubLString $str158$Returns_the_single_minimally_gene = makeString("Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.");

    public static final SubLList $list159 = list(makeSymbol("FORT-P"));

    public static final SubLSymbol MAX_COLS = makeSymbol("MAX-COLS");

    public static final SubLString $str161$Returns_the_most_general_among_re = makeString("Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS");

    public static final SubLSymbol MIN_CEILING_COLS = makeSymbol("MIN-CEILING-COLS");

    public static final SubLList $list163 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLString $str164$Returns_the_most_specific_common_ = makeString("Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");

    public static final SubLSymbol MAX_FLOOR_COLS = makeSymbol("MAX-FLOOR-COLS");

    public static final SubLString $str166$Returns_the_most_general_common_s = makeString("Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");

    public static final SubLSymbol ANY_GENL_ISA = makeSymbol("ANY-GENL-ISA");

    public static final SubLList $list168 = list(makeSymbol("COL"), makeSymbol("ISA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLString $str169$Return_some_genl_of_COL_that_isa_ = makeString("Return some genl of COL that isa instance of ISA (if any such genl exists)");

    public static final SubLList $list170 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("ISA"), makeSymbol("EL-FORT-P")));

    public static final SubLSymbol LIGHTER_COL = makeSymbol("LIGHTER-COL");

    public static final SubLList $list172 = list(makeSymbol("COL-A"), makeSymbol("COL-B"));

    public static final SubLString $str173$Return_COL_B_iff_it_has_fewer_spe = makeString("Return COL-B iff it has fewer specs than COL-A, else return COL-A");

    public static final SubLList $list174 = list(list(makeSymbol("COL-A"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-B"), makeSymbol("EL-FORT-P")));

    public static final SubLSymbol LIGHTEST_OF_COLS = makeSymbol("LIGHTEST-OF-COLS");

    public static final SubLList $list176 = list(makeSymbol("COLS"));

    public static final SubLString $str177$Return_the_collection_having_the_ = makeString("Return the collection having the fewest specs given a list of collections.");

    public static final SubLSymbol SHALLOWER_COL = makeSymbol("SHALLOWER-COL");

    public static final SubLString $str179$Return_COL_B_iff_it_has_fewer_gen = makeString("Return COL-B iff it has fewer genls than COL-A, else return COL-A");

    public static final SubLSymbol MAX_FLOOR_MTS_OF_GENLS_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENLS-PATHS");

    public static final SubLList $list181 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    public static final SubLString $str182$_return_listp__Returns_in_what__m = makeString("@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC");

    private static final SubLObject $$coExtensional = reader_make_constant_shell(makeString("coExtensional"));

    public static final SubLSymbol GENLS_AFTER_ADDING = makeSymbol("GENLS-AFTER-ADDING");

    public static final SubLSymbol GENLS_AFTER_REMOVING = makeSymbol("GENLS-AFTER-REMOVING");













    private static final SubLList $list192 = list(list(list(NIL), NIL));



    private static final SubLList $list194 = list(list(list(list(reader_make_constant_shell(makeString("Nothing")))), list(reader_make_constant_shell(makeString("Nothing")))));

    private static final SubLSymbol MAX_COLS_BENEATH = makeSymbol("MAX-COLS-BENEATH");

    private static final SubLList $list196 = list(list(list(NIL, reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("CyclistsMt"))), NIL));

    public static final SubLList $list197 = list(list(list(reader_make_constant_shell(makeString("FemaleHuman")), list(reader_make_constant_shell(makeString("Female")))), list(reader_make_constant_shell(makeString("Female")))));

    public static final SubLList $list198 = list(list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("FemaleHuman")))), list(reader_make_constant_shell(makeString("FemaleHuman")))));

    public static final SubLList $list199 = list(list(list(reader_make_constant_shell(makeString("FemaleHuman")), list(reader_make_constant_shell(makeString("Female")))), T), list(list(reader_make_constant_shell(makeString("FemaleHuman")), NIL), NIL));

    public static final SubLList $list200 = list(list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("FemaleHuman")))), T), list(list(reader_make_constant_shell(makeString("Female")), NIL), NIL));

    public static final SubLList $list201 = list(list(list(reader_make_constant_shell(makeString("FemaleHuman")), list(reader_make_constant_shell(makeString("Female")))), T), list(list(reader_make_constant_shell(makeString("FemaleHuman")), NIL), T));

    public static final SubLList $list202 = list(list(list(NIL, NIL), NIL), list(list(list(reader_make_constant_shell(makeString("FemaleHuman"))), list(reader_make_constant_shell(makeString("Female")))), T));

    public static final SubLList $list203 = list(list(list(NIL, NIL), NIL));

    public static final SubLList $list204 = list(list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("Male")))), T), list(list(reader_make_constant_shell(makeString("Female")), NIL), T), list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("Female")))), NIL), list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("FemaleHuman")))), NIL));

    public static final SubLList $list205 = list(list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("FemaleHuman")), reader_make_constant_shell(makeString("FemaleAnimal")))), T));

    public static final SubLList $list206 = list(list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("FemaleHuman")))), T), list(list(reader_make_constant_shell(makeString("Female")), list(reader_make_constant_shell(makeString("Thing")))), NIL), list(list(reader_make_constant_shell(makeString("Female")), NIL), NIL));

    private static final SubLSymbol $sym207$ALL_GENL_OF_SOME_ = makeSymbol("ALL-GENL-OF-SOME?");

    private static final SubLList $list208 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("Predicate"))), list(reader_make_constant_shell(makeString("Individual"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("Predicate"))), list(reader_make_constant_shell(makeString("Microtheory"))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("Predicate"))), list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("BinaryPredicate"))), list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("BinaryPredicate"))), list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Predicate"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("BinaryPredicate"))), list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Predicate"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("BinaryPredicate")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Collection"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("BinaryPredicate")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Individual"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Individual"))), reader_make_constant_shell(makeString("BaseKB"))), NIL) });

    public static SubLObject genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject min_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject nat_genls(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return genls(nart, mt, tv);
        }
        return naut_genls(naut, mt);
    }

    public static SubLObject nat_min_genls(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return min_genls(nart, mt, tv);
        }
        return min_cols(naut_genls(naut, mt), mt, tv);
    }

    public static SubLObject min_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_genls = all_genls(col, mt, tv);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return min_cols(genls_of_type, mt, tv);
    }

    public static SubLObject min_proper_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_genls = all_genls(col, mt, tv);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return min_cols(remove(col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, tv);
    }

    public static SubLObject naut_genls(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_duplicate_forts(append(new SubLObject[]{ kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, UNPROVIDED), kb_accessors.result_genl_args(naut, mt), kb_accessors.result_inter_arg_genl(naut, mt), kb_accessors.result_inter_arg_genl_reln(naut, mt), kb_accessors.result_genl_via_arg_arg_genl(naut, mt) }));
    }

    public static SubLObject not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject max_not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject nat_not_genls(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return not_genls(nart, mt, tv);
        }
        return naut_not_genls(naut, mt);
    }

    public static SubLObject nat_max_not_genls(final SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nat = narts_high.find_nart(nat_formula);
        if (NIL != nart_handles.nart_p(nat)) {
            return max_not_genls(nat, mt, tv);
        }
        return max_cols(naut_not_genls(nat, mt), mt, tv);
    }

    public static SubLObject naut_not_genls(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, $FALSE);
    }

    public static SubLObject specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject leaf_colP(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv));
    }

    public static SubLObject max_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    public static SubLObject min_not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject genl_siblings(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject spec_siblings(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject all_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        if ((NIL == forts.fort_p(col)) || (NIL != fort_types_interface.collectionP(col))) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
        }
        return NIL;
    }

    public static SubLObject all_genls_in_any_mt(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_genls = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            all_genls = all_genls(col, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_genls;
    }

    public static SubLObject all_genls_in_mt(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_genls = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            all_genls = all_genls(col, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_genls;
    }

    public static SubLObject all_genls_in_mts(final SubLObject col, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_genls = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            all_genls = all_genls(col, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_genls;
    }

    public static SubLObject nat_all_genls(final SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nat = narts_high.find_nart(nat_formula);
        if (NIL != nart_handles.nart_p(nat)) {
            return all_genls(nat, mt, tv);
        }
        return union_all_genls(nat_genls(nat_formula, mt, tv), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(col, all_genls(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        if ((NIL == forts.fort_p(col)) || (NIL != fort_types_interface.collectionP(col))) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
        }
        return NIL;
    }

    public static SubLObject all_proper_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(col, all_specs(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_specs_in_any_mt(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = cardinality_estimates.sort_by_generality_estimate(all_proper_specs(col, UNPROVIDED, UNPROVIDED), $DESCENDING);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_leaf_specs_in_all_mts(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expected_size = integerDivide(cardinality_estimates.spec_cardinality(col), TWO_INTEGER);
        final SubLObject leaf_set = set.new_set(symbol_function(EQL), expected_size);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject node_var = col;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
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
                        final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        if (NIL != leaf_colP(spec, UNPROVIDED, UNPROVIDED)) {
                                            set.set_add(spec, leaf_set);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$12);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$14;
                                                        final SubLObject new_list = cdolist_list_var_$14 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$14.first();
                                                        while (NIL != cdolist_list_var_$14) {
                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                            generating_fn = cdolist_list_var_$14.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(leaf_set);
    }

    public static SubLObject all_specs_with_max(final SubLObject cycl_term, final SubLObject max) {
        assert NIL != integerp(max) : "Types.integerp(max) " + "CommonSymbols.NIL != Types.integerp(max) " + max;
        if (NIL == fort_types_interface.collection_p(cycl_term)) {
            return NIL;
        }
        final SubLObject iter = kb_iterators.new_specs_iterator(cycl_term);
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

    public static SubLObject all_specs_in_all_mts(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            return all_specs(col, mt, tv);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject count_all_specs(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(collection, EL_FORT_P);
        SubLObject count = ZERO_INTEGER;
        SubLObject node_var = collection;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        count = add(count, ONE_INTEGER);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$28 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$28)) {
                                                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$28, thread);
                                                                        SubLObject iteration_state_$30;
                                                                        for (iteration_state_$30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$30); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next(iteration_state_$30)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv_$31 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$30);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$31)) {
                                                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$31, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$30);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$33;
                                                        final SubLObject new_list = cdolist_list_var_$33 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$33.first();
                                                        while (NIL != cdolist_list_var_$33) {
                                                            final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$24, thread);
                                                            }
                                                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                            generating_fn = cdolist_list_var_$33.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$22, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$21, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$23, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$21, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$20, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$22, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$20, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$19, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject count_all_specs_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject node_var = collection;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$40 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        if (NIL != funcall(pred, spec)) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$47 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$47)) {
                                                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$47, thread);
                                                                        SubLObject iteration_state_$49;
                                                                        for (iteration_state_$49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next(iteration_state_$49)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv_$50 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$49);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$50)) {
                                                                                final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$50, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$49);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$52;
                                                        final SubLObject new_list = cdolist_list_var_$52 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$52.first();
                                                        while (NIL != cdolist_list_var_$52) {
                                                            final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                            }
                                                            cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                            generating_fn = cdolist_list_var_$52.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$41, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$40, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$39, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$41, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$39, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$38, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$38, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$37, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$36, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject count_all_specs_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GP = NIL;
        if (NIL == GP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = tv;
                        final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$60 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$59 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == GP)) {
                                            final SubLObject spec = node_var;
                                            count = add(count, ONE_INTEGER);
                                            if (count.numG(num)) {
                                                GP = T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$59;
                                            SubLObject _prev_bind_1_$60;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$66;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$60;
                                            SubLObject iteration_state_$68;
                                            SubLObject tv_$69;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$61;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$71;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$62;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == GP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$66 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$66)) {
                                                                        _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$66, thread);
                                                                            for (iteration_state_$68 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$68)); iteration_state_$68 = dictionary_contents.do_dictionary_contents_next(iteration_state_$68)) {
                                                                                thread.resetMultipleValues();
                                                                                tv_$69 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$68);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$69)) {
                                                                                    _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$69, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == GP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == GP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$61, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$68);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$71 = NIL, rest_$71 = new_list; (NIL == GP) && (NIL != rest_$71); rest_$71 = rest_$71.rest()) {
                                                                generating_fn = rest_$71.first();
                                                                _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == GP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == GP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$62, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$60, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$59, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$61, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$59, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$58, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$60, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$58, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$57, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$57, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$56, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$55, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return numE(count, num);
    }

    public static SubLObject count_all_specs_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GP = NIL;
        if (NIL == GP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$74 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = tv;
                        final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$79 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == GP)) {
                                            final SubLObject spec = node_var;
                                            count = add(count, ONE_INTEGER);
                                            if (count.numG(num)) {
                                                GP = T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$78;
                                            SubLObject _prev_bind_1_$79;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$85;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$79;
                                            SubLObject iteration_state_$87;
                                            SubLObject tv_$88;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$80;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$90;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$81;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == GP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$78 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$85 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$85)) {
                                                                        _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$85, thread);
                                                                            for (iteration_state_$87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$87)); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next(iteration_state_$87)) {
                                                                                thread.resetMultipleValues();
                                                                                tv_$88 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$87);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$88)) {
                                                                                    _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$88, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == GP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == GP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$80, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$87);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$79, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$90 = NIL, rest_$90 = new_list; (NIL == GP) && (NIL != rest_$90); rest_$90 = rest_$90.rest()) {
                                                                generating_fn = rest_$90.first();
                                                                _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == GP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == GP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$81, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$79, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$78, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$80, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$78, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$77, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$79, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$77, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$76, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$76, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$75, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$74, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return GP;
    }

    public static SubLObject count_all_specs_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject GEP = NIL;
        if (NIL == GEP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$93 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = tv;
                        final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$98 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$97 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == GEP)) {
                                            final SubLObject spec = node_var;
                                            count = add(count, ONE_INTEGER);
                                            if (count.numGE(num)) {
                                                GEP = T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$97;
                                            SubLObject _prev_bind_1_$98;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$104;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$98;
                                            SubLObject iteration_state_$106;
                                            SubLObject tv_$107;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$99;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$109;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$100;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == GEP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$97 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$104 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$104)) {
                                                                        _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$104, thread);
                                                                            for (iteration_state_$106 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == GEP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$106)); iteration_state_$106 = dictionary_contents.do_dictionary_contents_next(iteration_state_$106)) {
                                                                                thread.resetMultipleValues();
                                                                                tv_$107 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$106);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$107)) {
                                                                                    _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$107, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == GEP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == GEP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$99, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$106);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$98, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$109 = NIL, rest_$109 = new_list; (NIL == GEP) && (NIL != rest_$109); rest_$109 = rest_$109.rest()) {
                                                                generating_fn = rest_$109.first();
                                                                _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == GEP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == GEP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == GEP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$100, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$98, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$97, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$99, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$97, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$96, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$98, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$96, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$95, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$95, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$94, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$93, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return GEP;
    }

    public static SubLObject count_all_specs_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numL(count_all_specs(collection, mt, tv), num);
    }

    public static SubLObject count_all_specs_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numLE(count_all_specs(collection, mt, tv), num);
    }

    public static SubLObject all_genls_wrt(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_between(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv);
    }

    public static SubLObject union_all_genls(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(cols)) {
            return all_genls(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }

    public static SubLObject union_min_genls_of_type(final SubLObject cols, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_genls = union_all_genls(cols, mt, tv);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return min_cols(genls_of_type, mt, tv);
    }

    public static SubLObject union_all_genls_among(final SubLObject cols, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return keyhash_utilities.fast_intersection(union_all_genls(cols, mt, tv), candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_genl_of_someP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return subsetp(v_genls, union_all_genls_among(specs, v_genls, mt, tv), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject union_all_specs(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(cols)) {
            return all_specs(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }

    public static SubLObject union_all_specs_count(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(union_all_specs(cols, mt, tv));
    }

    public static SubLObject max_cols_beneath(final SubLObject cols, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_cols(all_specs_among(genl, cols, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    public static SubLObject all_dependent_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject min_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return min_cols(all_genls_among(col, candidates, mt, tv), mt, tv);
    }

    public static SubLObject all_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(candidates, LISTP);
        if (NIL == candidates) {
            return NIL;
        }
        if (NIL == list_utilities.singletonP(candidates)) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genls), col, candidates, mt, tv);
        }
        if (NIL != genlP(col, candidates.first(), mt, tv)) {
            return candidates;
        }
        return NIL;
    }

    public static SubLObject all_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(candidates, LISTP);
        if (NIL == candidates) {
            return NIL;
        }
        if (NIL == list_utilities.singletonP(candidates)) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genls), col, candidates, mt, tv);
        }
        if (NIL != specP(col, candidates.first(), mt, tv)) {
            return candidates;
        }
        return NIL;
    }

    public static SubLObject max_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return max_cols(all_specs_among(col, candidates, mt, tv), mt, tv);
    }

    public static SubLObject all_genls_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    public static SubLObject all_specs_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    public static SubLObject all_genls_if_with_pruning(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    public static SubLObject all_not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject all_not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject cols_awning(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_forward_true_goals_with_no_path_from_nodes(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    public static SubLObject map_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv);
        return NIL;
    }

    public static SubLObject map_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv);
        return NIL;
    }

    public static SubLObject map_union_all_genls(final SubLObject fn, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, fn, mt, tv);
        return NIL;
    }

    public static SubLObject map_all_genls_if(final SubLObject fn, final SubLObject test_fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, fn, test_fn, mt, tv);
        return NIL;
    }

    public static SubLObject gather_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (combine_fn == UNPROVIDED) {
            combine_fn = NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, combine_fn);
    }

    public static SubLObject gather_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (combine_fn == UNPROVIDED) {
            combine_fn = NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, combine_fn);
    }

    public static SubLObject any_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, UNPROVIDED);
    }

    public static SubLObject any_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, UNPROVIDED);
    }

    public static SubLObject sample_leaf_specs(final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
        if (samples == UNPROVIDED) {
            samples = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_sample_leaf_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, samples, mt, tv);
    }

    public static SubLObject sample_different_leaf_specs(final SubLObject dif_node, final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
        if (samples == UNPROVIDED) {
            samples = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_sample_different_leaf_nodes(sbhl_module_vars.get_sbhl_module($$genls), dif_node, col, samples, mt, tv);
    }

    public static SubLObject genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        if ((NIL == forts.fort_p(spec)) || (NIL != fort_types_interface.collectionP(spec))) {
            return makeBoolean((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv)) || (NIL != (NIL != cycl_grammar.cycl_nat_p(spec) ? result_genl_via_pgiaP(spec, genl, mt) : NIL)));
        }
        return NIL;
    }

    public static SubLObject genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genlP(spec, genl, mt, tv);
    }

    public static SubLObject genl_in_mtsP(final SubLObject spec, final SubLObject genl, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genlP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            genlP = genlP(spec, genl, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genlP;
    }

    public static SubLObject genl_in_any_mtP(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = genlP(spec, genl, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject specP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        return genlP(spec, genl, mt, tv);
    }

    public static SubLObject nat_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nat = cycl_utilities.find_ground_naut(nat_formula);
        if (NIL != nart_handles.nart_p(nat)) {
            return genlP(nat, genl, mt, UNPROVIDED);
        }
        return naut_genlP(nat_formula, genl, mt);
    }

    public static SubLObject naut_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != result_genl_colP(cycl_utilities.nat_functor(nat_formula), genl, mt)) || (NIL != result_genl_arg_colP(nat_formula, genl, mt))) || (NIL != result_genl_inter_arg_colP(nat_formula, genl, mt))) || (NIL != result_genl_via_pgiaP(nat_formula, genl, mt)));
    }

    public static SubLObject result_genl_colP(final SubLObject functor, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_specP(collection, kb_accessors.result_genl(functor, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    public static SubLObject result_genl_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_specP(collection, kb_accessors.result_genl_args(nat_formula, mt), mt, UNPROVIDED);
    }

    public static SubLObject result_genl_inter_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_specP(collection, kb_accessors.result_inter_arg_genl(nat_formula, mt), mt, UNPROVIDED);
    }

    public static SubLObject result_genl_via_pgiaP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $pgia_activeP$.getDynamicValue(thread)) && cycl_utilities.nat_functor(nat_formula).eql(cycl_utilities.nat_functor(collection))) {
            final SubLObject functor = cycl_utilities.nat_functor(collection);
            SubLObject genlP = T;
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != genlP) {
                    genlP = genlsP(cycl_utilities.nat_arg(nat_formula, arg, UNPROVIDED), cycl_utilities.nat_arg(collection, arg, UNPROVIDED), mt, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            return genlP;
        }
        return NIL;
    }

    public static SubLObject genl_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), genl, spec, mt, tv);
    }

    public static SubLObject any_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(v_genls, LISTP);
        if (NIL == v_genls) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(v_genls)) {
            return genlP(spec, v_genls.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), spec, v_genls, mt, tv);
    }

    public static SubLObject any_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(specs, LISTP);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
            if (NIL == specs) {
                result = NIL;
            } else
                if (NIL != list_utilities.singletonP(specs)) {
                    result = specP(genl, specs.first(), mt, tv);
                } else {
                    result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), specs, genl, mt, tv);
                }

        } finally {
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(v_genls, LISTP);
        if (NIL == v_genls) {
            return T;
        }
        if (NIL != list_utilities.singletonP(v_genls)) {
            return genlP(spec, v_genls.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genls), spec, v_genls, mt, tv);
    }

    public static SubLObject all_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(specs, LISTP);
        if (NIL == specs) {
            return T;
        }
        if (NIL != list_utilities.singletonP(specs)) {
            return specP(genl, specs.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), specs, genl, mt, tv);
    }

    public static SubLObject any_genl_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(specs, LISTP);
        SubLSystemTrampolineFile.enforceType(v_genls, LISTP);
        if (NIL == specs) {
            return NIL;
        }
        if (NIL == v_genls) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(specs)) {
            return any_genlP(specs.first(), v_genls, mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    public static SubLObject any_genl_allP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(specs, LISTP);
        SubLSystemTrampolineFile.enforceType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_any_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    public static SubLObject all_spec_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(specs, LISTP);
        SubLSystemTrampolineFile.enforceType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_all_with_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    public static SubLObject not_genlsP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return not_genlP(col, not_genl, mt, tv);
    }

    public static SubLObject not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(not_genl, EL_FORT_P);
        if (NIL != genlP(col, not_genl, mt, sbhl_search_vars.sbhl_opposite_or_nil_tv(tv))) {
            return NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), col, not_genl, mt, tv);
    }

    public static SubLObject argue_not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), col, not_genl, mt, tv);
    }

    public static SubLObject all_not_specP(final SubLObject col, final SubLObject not_specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(not_specs, LISTP);
        if (NIL == not_specs) {
            return T;
        }
        if (NIL != list_utilities.singletonP(not_specs)) {
            return not_genlP(not_specs.first(), col, mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_all_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), not_specs, col, mt, tv);
    }

    public static SubLObject any_not_genlP(final SubLObject col, final SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(not_genls, LISTP);
        if (NIL == not_genls) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(not_genls)) {
            return not_genlP(col, not_genls.first(), mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), not_genls, col, mt, tv);
    }

    public static SubLObject random_genl_of(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        if (((NIL != mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        return list_utilities.random_element(all_genls(collection, mt, UNPROVIDED));
    }

    public static SubLObject random_spec_of(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        if (((NIL != mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        return list_utilities.random_element(all_specs(collection, mt, UNPROVIDED));
    }

    public static SubLObject collections_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col_1, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(col_2, EL_FORT_P);
        return makeBoolean((col_1.eql(col_2) || (NIL != asserted_coextensionalP(col_1, col_2, mt))) || (NIL != tacit_coextensionalP(col_1, col_2, mt)));
    }

    public static SubLObject tacit_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != genlP(col_1, col_2, mt, UNPROVIDED)) && (NIL != genlP(col_2, col_1, mt, UNPROVIDED)));
    }

    public static SubLObject common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    public static SubLObject why_common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return NIL;
    }

    public static SubLObject collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(col_1, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(col_2, EL_FORT_P);
        return makeBoolean((((NIL != genlP(col_1, col_2, mt, UNPROVIDED)) || (NIL != genlP(col_2, col_1, mt, UNPROVIDED))) || (NIL != disjoint_with.not_disjoint_withP(col_1, col_2, mt, UNPROVIDED))) || ((NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread)) && (NIL != common_instanceP(col_1, col_2, mt))));
    }

    public static SubLObject hierarchical_collectionsP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != genlP(col_1, col_2, mt, UNPROVIDED)) || (NIL != genlP(col_2, col_1, mt, UNPROVIDED)));
    }

    public static SubLObject genl_of_any_argP(final SubLObject collection, final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject access_arg, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (access_arg == UNPROVIDED) {
            access_arg = TWO_INTEGER;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE;
        }
        if ((NIL == collection) || (NIL == v_term)) {
            return NIL;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return genl_of_any_argP(narts_high.find_nart(collection), v_term, pred, mt, index_arg, access_arg, tv);
        }
        if (NIL != term.ground_nautP(v_term, UNPROVIDED)) {
            return genl_of_any_argP(collection, narts_high.find_nart(v_term), pred, mt, index_arg, access_arg, tv);
        }
        if (NIL == fort_types_interface.collectionP(collection)) {
            return NIL;
        }
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        return genl_of_any_argP_int(collection, v_term, pred, mt, index_arg, access_arg, tv);
    }

    public static SubLObject genl_of_any_argP_int(final SubLObject collection, final SubLObject v_term, final SubLObject pred, final SubLObject mt, final SubLObject index_arg, final SubLObject access_arg, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genlP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (kb_indexing.num_gaf_arg_index(v_term, index_arg, pred, UNPROVIDED).numL(divide(cardinality_estimates.spec_cardinality(collection), THREE_INTEGER))) {
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
                    SubLObject done_var = genlP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, tv, NIL);
                                SubLObject done_var_$112 = genlP;
                                final SubLObject token_var_$113 = NIL;
                                while (NIL == done_var_$112) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$113);
                                    final SubLObject valid_$114 = makeBoolean(!token_var_$113.eql(assertion));
                                    if ((NIL != valid_$114) && (NIL != genlP(assertions_high.gaf_arg(assertion, access_arg), collection, UNPROVIDED, UNPROVIDED))) {
                                        genlP = T;
                                    }
                                    done_var_$112 = makeBoolean((NIL == valid_$114) || (NIL != genlP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != genlP));
                    } 
                }
            } else {
                final SubLObject specs = all_specs(collection, UNPROVIDED, UNPROVIDED);
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
                    SubLObject done_var2 = genlP;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            SubLObject final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, tv, NIL);
                                SubLObject done_var_$113 = genlP;
                                final SubLObject token_var_$114 = NIL;
                                while (NIL == done_var_$113) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$114);
                                    final SubLObject valid_$115 = makeBoolean(!token_var_$114.eql(assertion2));
                                    if ((NIL != valid_$115) && (NIL != list_utilities.member_eqP(assertions_high.gaf_arg(assertion2, access_arg), specs))) {
                                        genlP = T;
                                    }
                                    done_var_$113 = makeBoolean((NIL == valid_$115) || (NIL != genlP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean((NIL == valid2) || (NIL != genlP));
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return genlP;
    }

    public static SubLObject why_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        if (NIL != term.first_order_nautP(spec)) {
            return any_just_of_nat_genl(spec, genl, mt);
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv, behavior);
    }

    public static SubLObject any_just_of_nat_genl(final SubLObject nat, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        final SubLObject just = why_genlP(v_term, collection, mt, UNPROVIDED, UNPROVIDED);
        if (NIL != just) {
            return cons(bq_cons(list($$termOfUnit, v_term, nat), $list143), just);
        }
        SubLObject nat_just = NIL;
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_genl(cycl_utilities.nat_functor(nat), mt, UNPROVIDED);
            SubLObject genl = NIL;
            genl = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || genl.equal(collection)) {
                    return cons(bq_cons(list($$resultGenl, cycl_utilities.nat_functor(nat), genl), $list143), nat_just);
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            } 
        }
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_genl_args(nat, mt);
            SubLObject genl = NIL;
            genl = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || genl.equal(collection)) {
                    final SubLObject args = kb_accessors.result_genl_via_argnums(nat, collection, mt, UNPROVIDED);
                    if (NIL != args) {
                        return cons(bq_cons(list($$resultGenlArg, cycl_utilities.nat_functor(nat), args.first()), $list143), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            } 
        }
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_inter_arg_genl(nat, mt);
            SubLObject genl = NIL;
            genl = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || genl.equal(collection)) {
                    final SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args(nat, collection, mt).first();
                    if (args.isCons()) {
                        final SubLObject arg = args.first();
                        final SubLObject ind_col = second(args);
                        final SubLObject dep_col = third(args);
                        final SubLObject arg_col = cycl_utilities.nat_arg(nat, arg, UNPROVIDED);
                        if (!arg_col.equal(ind_col)) {
                            nat_just = nconc(nat_just, why_genlP(arg_col, ind_col, mt, UNPROVIDED, UNPROVIDED));
                        }
                        if (!dep_col.equal(collection)) {
                            nat_just = nconc(nat_just, why_genlP(dep_col, collection, mt, UNPROVIDED, UNPROVIDED));
                        }
                        return cons(bq_cons(list($$interArgResultGenl, cycl_utilities.nat_functor(nat), arg, ind_col, dep_col), $list143), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            } 
        }
        if (NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_inter_arg_genl_reln(nat, mt);
            SubLObject genl = NIL;
            genl = csome_list_var.first();
            while ((NIL == nat_just) && (NIL != csome_list_var)) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != nat_just) || genl.equal(collection)) {
                    final SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args(nat, collection, mt, UNPROVIDED).first();
                    if (args.isCons()) {
                        final SubLObject rel_sentence = args.first().first();
                        final SubLObject arg2 = second(args);
                        final SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
                        final SubLObject rel_nat_term_arg = third(args);
                        final SubLObject rel_col_arg = fourth(args);
                        final SubLObject col = cycl_utilities.formula_arg(rel_sentence, rel_col_arg, UNPROVIDED);
                        if (!col.equal(collection)) {
                            nat_just = nconc(nat_just, why_genlP(col, collection, mt, UNPROVIDED, UNPROVIDED));
                        }
                        return append(list(bq_cons(list($$interArgResultGenlReln, cycl_utilities.nat_functor(nat), arg2, rel, rel_nat_term_arg, rel_col_arg), $list143), bq_cons(rel_sentence, $list143)), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            } 
        }
        if ((((NIL == nat_just) && (NIL != $pgia_activeP$.getDynamicValue(thread))) && (NIL != term.first_order_nautP(collection))) && cycl_utilities.nat_functor(nat).eql(cycl_utilities.nat_functor(collection))) {
            final SubLObject functor = cycl_utilities.nat_functor(collection);
            if (NIL == nat_just) {
                SubLObject csome_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg3 = NIL;
                arg3 = csome_list_var2.first();
                while ((NIL == nat_just) && (NIL != csome_list_var2)) {
                    nat_just = why_genlP(cycl_utilities.nat_arg(nat, arg3, UNPROVIDED), cycl_utilities.nat_arg(collection, arg3, UNPROVIDED), mt, UNPROVIDED, UNPROVIDED);
                    if (NIL != nat_just) {
                        nat_just = cons(bq_cons(list($$preservesGenlsInArg, functor, arg3), $list143), nat_just);
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    arg3 = csome_list_var2.first();
                } 
            }
            return nat_just;
        }
        return NIL;
    }

    public static SubLObject why_not_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv, behavior);
    }

    public static SubLObject why_not_assert_genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        return why_not_genlP(spec, genl, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject why_collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject why = why_genlP(col_1, col_2, mt, tv, behavior);
        if (NIL != why) {
            return why;
        }
        why = why_genlP(col_2, col_1, mt, tv, behavior);
        if (NIL != why) {
            return why;
        }
        why = disjoint_with.why_not_disjoint_withP(col_1, col_2, mt, tv, behavior);
        if (NIL != why) {
            return why;
        }
        if (NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread)) {
            return why_common_instanceP(col_1, col_2, mt, tv, behavior);
        }
        return NIL;
    }

    public static SubLObject why_not_assert_mdwP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return why_collections_intersectP(col_1, col_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject collection_leaves(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    public static SubLObject min_cols(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }

    public static SubLObject min_col(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        final SubLObject min_cols = min_cols(cols, mt, tv);
        SubLObject min_col = min_cols.first();
        SubLObject depth_min_col = length(all_genls(min_col, mt, UNPROVIDED));
        SubLObject depth_col = NIL;
        SubLObject cdolist_list_var = min_cols.rest();
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            depth_col = length(all_genls(col, mt, UNPROVIDED));
            if (depth_col.numG(depth_min_col)) {
                depth_min_col = depth_col;
                min_col = col;
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return min_col;
    }

    public static SubLObject max_cols(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv, UNPROVIDED);
    }

    public static SubLObject nearest_common_genls(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return min_ceiling_cols(cols, candidates, mt, tv);
    }

    public static SubLObject min_ceiling_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genls), cols, candidates, mt, tv);
    }

    public static SubLObject nearest_common_specs(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return max_floor_cols(cols, candidates, mt, tv);
    }

    public static SubLObject max_floor_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genls), cols, candidates, mt, tv, UNPROVIDED);
    }

    public static SubLObject floor_of_col_pairP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(any_floor_of_col_pair(col_1, col_2, mt, UNPROVIDED));
    }

    public static SubLObject any_floor_of_col_pair(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_first_floor_of_node_pair(sbhl_module_vars.get_sbhl_module($$genls), col_1, col_2, mt, tv);
    }

    public static SubLObject all_common_specs(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return union_all_specs(nearest_common_specs(cols, NIL, mt, tv), mt, tv);
    }

    public static SubLObject any_genl_isa(final SubLObject col, final SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(col, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(v_isa, EL_FORT_P);
        return isa.any_all_forward_true_nodes_isa($$genls, col, v_isa, mt, tv);
    }

    public static SubLObject lighter_col(final SubLObject col_a, final SubLObject col_b) {
        SubLSystemTrampolineFile.enforceType(col_a, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(col_b, EL_FORT_P);
        if (NIL != term.ground_nautP(col_a, UNPROVIDED)) {
            return lighter_col(narts_high.find_nart(col_a), col_b);
        }
        if (NIL != term.ground_nautP(col_b, UNPROVIDED)) {
            return lighter_col(col_a, narts_high.find_nart(col_b));
        }
        if (NIL == forts.fort_p(col_a)) {
            return NIL;
        }
        if (NIL == forts.fort_p(col_b)) {
            return NIL;
        }
        return cardinality_estimates.lightest_node(col_a, col_b);
    }

    public static SubLObject lightest_col(final SubLObject col_a, final SubLObject col_b) {
        return cardinality_estimates.lightest_node(col_a, col_b);
    }

    public static SubLObject lightest_of_cols(final SubLObject cols) {
        SubLSystemTrampolineFile.enforceType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        }
        SubLObject lightest = cols.first();
        SubLObject cdolist_list_var = cols.rest();
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lightest = lightest_col(lightest, col);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return lightest;
    }

    public static SubLObject shallower_col(final SubLObject col_a, final SubLObject col_b) {
        SubLSystemTrampolineFile.enforceType(col_a, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(col_b, EL_FORT_P);
        if (NIL != term.ground_nautP(col_a, UNPROVIDED)) {
            return shallower_col(narts_high.find_nart(col_a), col_b);
        }
        if (NIL != term.ground_nautP(col_b, UNPROVIDED)) {
            return shallower_col(col_a, narts_high.find_nart(col_b));
        }
        if (NIL == forts.fort_p(col_a)) {
            return NIL;
        }
        if (NIL == forts.fort_p(col_b)) {
            return NIL;
        }
        return cardinality_estimates.shallowest_node(col_a, col_b);
    }

    public static SubLObject shallowest_col(final SubLObject col_a, final SubLObject col_b) {
        return cardinality_estimates.shallowest_node(col_a, col_b);
    }

    public static SubLObject max_floor_mts_of_genls_paths_wrt(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return genl_mts.selected_genl_mts(mt, max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_floor_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLSystemTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLSystemTrampolineFile.enforceType(genl, EL_FORT_P);
        if (NIL != term.first_order_nautP(spec)) {
            return max_floor_mts_of_nat_genls_paths(spec, genl, tv);
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, tv);
    }

    public static SubLObject max_floor_mts_of_nat_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_spec = narts_high.find_nart(spec);
        if (NIL != hl_spec) {
            return max_floor_mts_of_genls_paths(hl_spec, genl, tv);
        }
        final SubLObject functor = cycl_utilities.nat_functor(spec);
        SubLObject result = NIL;
        SubLObject mts = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = kb_accessors.result_genl(functor, UNPROVIDED, UNPROVIDED);
            SubLObject link_node = NIL;
            link_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$120;
                mts = cdolist_list_var_$120 = max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                SubLObject mt = NIL;
                mt = cdolist_list_var_$120.first();
                while (NIL != cdolist_list_var_$120) {
                    if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl(functor, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        result = cons(mt, result);
                    }
                    cdolist_list_var_$120 = cdolist_list_var_$120.rest();
                    mt = cdolist_list_var_$120.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            } 
            cdolist_list_var = kb_accessors.result_genl_args(spec, UNPROVIDED);
            link_node = NIL;
            link_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$121;
                mts = cdolist_list_var_$121 = max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                SubLObject mt = NIL;
                mt = cdolist_list_var_$121.first();
                while (NIL != cdolist_list_var_$121) {
                    if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl_args(spec, mt), UNPROVIDED, UNPROVIDED)) {
                        result = cons(mt, result);
                    }
                    cdolist_list_var_$121 = cdolist_list_var_$121.rest();
                    mt = cdolist_list_var_$121.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            } 
            cdolist_list_var = kb_accessors.result_inter_arg_genl(spec, UNPROVIDED);
            link_node = NIL;
            link_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$122;
                mts = cdolist_list_var_$122 = max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                SubLObject mt = NIL;
                mt = cdolist_list_var_$122.first();
                while (NIL != cdolist_list_var_$122) {
                    if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_inter_arg_genl(spec, mt), UNPROVIDED, UNPROVIDED)) {
                        result = cons(mt, result);
                    }
                    cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                    mt = cdolist_list_var_$122.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            } 
            cdolist_list_var = kb_accessors.result_genl_via_arg_arg_genl(spec, UNPROVIDED);
            link_node = NIL;
            link_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$123;
                mts = cdolist_list_var_$123 = max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                SubLObject mt = NIL;
                mt = cdolist_list_var_$123.first();
                while (NIL != cdolist_list_var_$123) {
                    if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl_via_arg_arg_genl(spec, mt), UNPROVIDED, UNPROVIDED)) {
                        result = cons(mt, result);
                    }
                    cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                    mt = cdolist_list_var_$123.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            } 
            if (((NIL != $pgia_activeP$.getDynamicValue(thread)) && (NIL != term.first_order_nautP(genl))) && cycl_utilities.nat_functor(spec).eql(cycl_utilities.nat_functor(genl))) {
                cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$124;
                    mts = cdolist_list_var_$124 = max_floor_mts_of_genls_paths(cycl_utilities.nat_arg(spec, arg, UNPROVIDED), cycl_utilities.nat_arg(genl, arg, UNPROVIDED), UNPROVIDED);
                    SubLObject mt = NIL;
                    mt = cdolist_list_var_$124.first();
                    while (NIL != cdolist_list_var_$124) {
                        if (NIL != subl_promotions.memberP(arg, kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                            result = cons(mt, result);
                        }
                        cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                        mt = cdolist_list_var_$124.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject min_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, tv);
    }

    public static SubLObject max_floor_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genls), not_genl, spec, tv);
    }

    public static SubLObject min_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genls), not_genl, spec, tv);
    }

    public static SubLObject genls_mts(final SubLObject col) {
        return kb_accessors.pred_mts(col, $$genls, UNPROVIDED);
    }

    public static SubLObject asserted_genlsP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject asserted_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject asserted_not_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject supported_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject supported_not_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject asserted_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject asserted_not_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject supported_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject supported_not_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    public static SubLObject asserted_coextensionalP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$coExtensional, col1, col2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$coExtensional, col2, col1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject genls_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genls));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        misc_kb_utilities.possibly_clear_genl_pos(assertion);
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
            at_defns.handle_added_genl_for_suf_defns(spec, genl);
            at_defns.handle_added_genl_for_suf_quoted_defns(spec, genl);
            at_defns.handle_added_genl_for_suf_functions(spec, genl);
            cardinality_estimates.update_cardinality_estimates_wrt_genls(spec, genl);
        }
        handle_more_specific_genl(spec, genl);
        collection_intersection.genls_collection_intersection_after_adding_int(assertion);
        after_adding_modules.clear_genls_dependent_caches(source, assertion);
        return NIL;
    }

    public static SubLObject handle_more_specific_genl(final SubLObject spec, final SubLObject genl) {
        return NIL;
    }

    public static SubLObject more_general_genls_assertions(final SubLObject spec, final SubLObject genl) {
        final SubLObject genls_set = set_utilities.make_set_from_list(all_proper_genls(genl, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject asserted_genls = kb_mapping.gather_gaf_arg_index(spec, ONE_INTEGER, $$genls, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = asserted_genls;
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != set.set_memberP(assertions_high.gaf_arg2(ass), genls_set)) {
                result = cons(ass, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject genls_after_removing(SubLObject source, final SubLObject assertion) {
        misc_kb_utilities.possibly_clear_genl_pos(assertion);
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genls));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
            at_defns.handle_removed_genl_for_suf_defns(spec, genl);
            at_defns.handle_removed_genl_for_suf_quoted_defns(spec, genl);
            at_defns.handle_removed_genl_for_suf_functions(spec, genl);
        }
        return NIL;
    }

    public static SubLObject clear_genls_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static SubLObject clear_node_genls_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genls), node);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.collectionP(node)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
                }
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

    public static SubLObject reset_genls_links(final SubLObject col) {
        final SubLObject mts = genls_mts(col);
        clear_node_genls_links(col);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.collectionP(col)) {
                reset_genls_links_in_mt(col, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_genls_links_in_mt(final SubLObject col, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static SubLObject reset_genls_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_genls_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static SubLObject declare_genls_file() {
        declareFunction(me, "genls", "GENLS", 1, 2, false);
        declareFunction(me, "min_genls", "MIN-GENLS", 1, 2, false);
        declareFunction(me, "nat_genls", "NAT-GENLS", 1, 2, false);
        declareFunction(me, "nat_min_genls", "NAT-MIN-GENLS", 1, 2, false);
        declareFunction(me, "min_genls_of_type", "MIN-GENLS-OF-TYPE", 2, 2, false);
        declareFunction(me, "min_proper_genls_of_type", "MIN-PROPER-GENLS-OF-TYPE", 2, 2, false);
        declareFunction(me, "naut_genls", "NAUT-GENLS", 1, 1, false);
        declareFunction(me, "not_genls", "NOT-GENLS", 1, 2, false);
        declareFunction(me, "max_not_genls", "MAX-NOT-GENLS", 1, 2, false);
        declareFunction(me, "nat_not_genls", "NAT-NOT-GENLS", 1, 2, false);
        declareFunction(me, "nat_max_not_genls", "NAT-MAX-NOT-GENLS", 1, 2, false);
        declareFunction(me, "naut_not_genls", "NAUT-NOT-GENLS", 1, 1, false);
        declareFunction(me, "specs", "SPECS", 1, 2, false);
        declareFunction(me, "leaf_colP", "LEAF-COL?", 1, 2, false);
        declareFunction(me, "max_specs", "MAX-SPECS", 1, 2, false);
        declareFunction(me, "not_specs", "NOT-SPECS", 1, 2, false);
        declareFunction(me, "min_not_specs", "MIN-NOT-SPECS", 1, 2, false);
        declareFunction(me, "genl_siblings", "GENL-SIBLINGS", 1, 2, false);
        declareFunction(me, "spec_siblings", "SPEC-SIBLINGS", 1, 2, false);
        declareFunction(me, "all_genls", "ALL-GENLS", 1, 2, false);
        declareFunction(me, "all_genls_in_any_mt", "ALL-GENLS-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "all_genls_in_mt", "ALL-GENLS-IN-MT", 1, 1, false);
        declareFunction(me, "all_genls_in_mts", "ALL-GENLS-IN-MTS", 1, 1, false);
        declareFunction(me, "nat_all_genls", "NAT-ALL-GENLS", 1, 2, false);
        declareFunction(me, "all_proper_genls", "ALL-PROPER-GENLS", 1, 2, false);
        declareFunction(me, "all_specs", "ALL-SPECS", 1, 2, false);
        declareFunction(me, "all_proper_specs", "ALL-PROPER-SPECS", 1, 2, false);
        declareFunction(me, "all_proper_specs_in_any_mt", "ALL-PROPER-SPECS-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "all_leaf_specs_in_all_mts", "ALL-LEAF-SPECS-IN-ALL-MTS", 1, 0, false);
        declareFunction(me, "all_specs_with_max", "ALL-SPECS-WITH-MAX", 2, 0, false);
        declareFunction(me, "all_specs_in_all_mts", "ALL-SPECS-IN-ALL-MTS", 1, 2, false);
        declareFunction(me, "count_all_specs", "COUNT-ALL-SPECS", 1, 2, false);
        declareFunction(me, "count_all_specs_if", "COUNT-ALL-SPECS-IF", 2, 2, false);
        declareFunction(me, "count_all_specs_E", "COUNT-ALL-SPECS-=", 2, 2, false);
        declareFunction(me, "count_all_specs_G", "COUNT-ALL-SPECS->", 2, 2, false);
        declareFunction(me, "count_all_specs_GE", "COUNT-ALL-SPECS->=", 2, 2, false);
        declareFunction(me, "count_all_specs_L", "COUNT-ALL-SPECS-<", 2, 2, false);
        declareFunction(me, "count_all_specs_LE", "COUNT-ALL-SPECS-<=", 2, 2, false);
        declareFunction(me, "all_genls_wrt", "ALL-GENLS-WRT", 2, 2, false);
        declareFunction(me, "union_all_genls", "UNION-ALL-GENLS", 1, 2, false);
        declareFunction(me, "union_min_genls_of_type", "UNION-MIN-GENLS-OF-TYPE", 2, 2, false);
        declareFunction(me, "union_all_genls_among", "UNION-ALL-GENLS-AMONG", 2, 2, false);
        declareFunction(me, "all_genl_of_someP", "ALL-GENL-OF-SOME?", 2, 2, false);
        declareFunction(me, "union_all_specs", "UNION-ALL-SPECS", 1, 2, false);
        declareFunction(me, "union_all_specs_count", "UNION-ALL-SPECS-COUNT", 1, 2, false);
        declareFunction(me, "max_cols_beneath", "MAX-COLS-BENEATH", 2, 1, false);
        declareFunction(me, "all_dependent_specs", "ALL-DEPENDENT-SPECS", 1, 2, false);
        declareFunction(me, "min_genls_among", "MIN-GENLS-AMONG", 2, 2, false);
        declareFunction(me, "all_genls_among", "ALL-GENLS-AMONG", 2, 2, false);
        declareFunction(me, "all_specs_among", "ALL-SPECS-AMONG", 2, 2, false);
        declareFunction(me, "max_specs_among", "MAX-SPECS-AMONG", 2, 2, false);
        declareFunction(me, "all_genls_if", "ALL-GENLS-IF", 2, 2, false);
        declareFunction(me, "all_specs_if", "ALL-SPECS-IF", 2, 2, false);
        declareFunction(me, "all_genls_if_with_pruning", "ALL-GENLS-IF-WITH-PRUNING", 2, 2, false);
        declareFunction(me, "all_not_genls", "ALL-NOT-GENLS", 1, 2, false);
        declareFunction(me, "all_not_specs", "ALL-NOT-SPECS", 1, 2, false);
        declareFunction(me, "cols_awning", "COLS-AWNING", 2, 2, false);
        declareFunction(me, "map_all_genls", "MAP-ALL-GENLS", 2, 2, false);
        declareFunction(me, "map_all_specs", "MAP-ALL-SPECS", 2, 2, false);
        declareFunction(me, "map_union_all_genls", "MAP-UNION-ALL-GENLS", 2, 2, false);
        declareFunction(me, "map_all_genls_if", "MAP-ALL-GENLS-IF", 3, 2, false);
        declareFunction(me, "gather_all_genls", "GATHER-ALL-GENLS", 2, 3, false);
        declareFunction(me, "gather_all_specs", "GATHER-ALL-SPECS", 2, 3, false);
        declareFunction(me, "any_all_genls", "ANY-ALL-GENLS", 2, 2, false);
        declareFunction(me, "any_all_specs", "ANY-ALL-SPECS", 2, 2, false);
        declareFunction(me, "sample_leaf_specs", "SAMPLE-LEAF-SPECS", 1, 3, false);
        declareFunction(me, "sample_different_leaf_specs", "SAMPLE-DIFFERENT-LEAF-SPECS", 2, 3, false);
        declareFunction(me, "genlP", "GENL?", 2, 2, false);
        declareFunction(me, "genlsP", "GENLS?", 2, 2, false);
        declareFunction(me, "genl_in_mtsP", "GENL-IN-MTS?", 2, 1, false);
        declareFunction(me, "genl_in_any_mtP", "GENL-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "specP", "SPEC?", 2, 2, false);
        declareFunction(me, "nat_genlP", "NAT-GENL?", 2, 1, false);
        declareFunction(me, "naut_genlP", "NAUT-GENL?", 2, 1, false);
        declareFunction(me, "result_genl_colP", "RESULT-GENL-COL?", 2, 1, false);
        declareFunction(me, "result_genl_arg_colP", "RESULT-GENL-ARG-COL?", 2, 1, false);
        declareFunction(me, "result_genl_inter_arg_colP", "RESULT-GENL-INTER-ARG-COL?", 2, 1, false);
        declareFunction(me, "result_genl_via_pgiaP", "RESULT-GENL-VIA-PGIA?", 2, 1, false);
        declareFunction(me, "genl_ofP", "GENL-OF?", 2, 2, false);
        declareFunction(me, "any_genlP", "ANY-GENL?", 2, 2, false);
        declareFunction(me, "any_specP", "ANY-SPEC?", 2, 2, false);
        declareFunction(me, "all_genlP", "ALL-GENL?", 2, 2, false);
        declareFunction(me, "all_specP", "ALL-SPEC?", 2, 2, false);
        declareFunction(me, "any_genl_anyP", "ANY-GENL-ANY?", 2, 2, false);
        declareFunction(me, "any_genl_allP", "ANY-GENL-ALL?", 2, 2, false);
        declareFunction(me, "all_spec_anyP", "ALL-SPEC-ANY?", 2, 2, false);
        declareFunction(me, "not_genlsP", "NOT-GENLS?", 2, 2, false);
        declareFunction(me, "not_genlP", "NOT-GENL?", 2, 2, false);
        declareFunction(me, "argue_not_genlP", "ARGUE-NOT-GENL?", 2, 2, false);
        declareFunction(me, "all_not_specP", "ALL-NOT-SPEC?", 2, 2, false);
        declareFunction(me, "any_not_genlP", "ANY-NOT-GENL?", 2, 2, false);
        declareFunction(me, "random_genl_of", "RANDOM-GENL-OF", 1, 1, false);
        declareFunction(me, "random_spec_of", "RANDOM-SPEC-OF", 1, 1, false);
        declareFunction(me, "collections_coextensionalP", "COLLECTIONS-COEXTENSIONAL?", 2, 1, false);
        declareFunction(me, "tacit_coextensionalP", "TACIT-COEXTENSIONAL?", 2, 1, false);
        declareFunction(me, "common_instanceP", "COMMON-INSTANCE?", 2, 1, false);
        declareFunction(me, "why_common_instanceP", "WHY-COMMON-INSTANCE?", 2, 3, false);
        declareFunction(me, "collections_intersectP", "COLLECTIONS-INTERSECT?", 2, 1, false);
        declareFunction(me, "hierarchical_collectionsP", "HIERARCHICAL-COLLECTIONS?", 2, 1, false);
        declareFunction(me, "genl_of_any_argP", "GENL-OF-ANY-ARG?", 3, 4, false);
        declareFunction(me, "genl_of_any_argP_int", "GENL-OF-ANY-ARG?-INT", 7, 0, false);
        declareFunction(me, "why_genlP", "WHY-GENL?", 2, 3, false);
        declareFunction(me, "any_just_of_nat_genl", "ANY-JUST-OF-NAT-GENL", 2, 1, false);
        declareFunction(me, "why_not_genlP", "WHY-NOT-GENL?", 2, 3, false);
        declareFunction(me, "why_not_assert_genlsP", "WHY-NOT-ASSERT-GENLS?", 2, 1, false);
        declareFunction(me, "why_collections_intersectP", "WHY-COLLECTIONS-INTERSECT?", 2, 3, false);
        declareFunction(me, "why_not_assert_mdwP", "WHY-NOT-ASSERT-MDW?", 2, 1, false);
        declareFunction(me, "collection_leaves", "COLLECTION-LEAVES", 1, 2, false);
        declareFunction(me, "min_cols", "MIN-COLS", 1, 2, false);
        declareFunction(me, "min_col", "MIN-COL", 1, 2, false);
        declareFunction(me, "max_cols", "MAX-COLS", 1, 2, false);
        declareFunction(me, "nearest_common_genls", "NEAREST-COMMON-GENLS", 1, 3, false);
        declareFunction(me, "min_ceiling_cols", "MIN-CEILING-COLS", 1, 3, false);
        declareFunction(me, "nearest_common_specs", "NEAREST-COMMON-SPECS", 1, 3, false);
        declareFunction(me, "max_floor_cols", "MAX-FLOOR-COLS", 1, 3, false);
        declareFunction(me, "floor_of_col_pairP", "FLOOR-OF-COL-PAIR?", 2, 1, false);
        declareFunction(me, "any_floor_of_col_pair", "ANY-FLOOR-OF-COL-PAIR", 2, 2, false);
        declareFunction(me, "all_common_specs", "ALL-COMMON-SPECS", 1, 2, false);
        declareFunction(me, "any_genl_isa", "ANY-GENL-ISA", 2, 2, false);
        declareFunction(me, "lighter_col", "LIGHTER-COL", 2, 0, false);
        declareFunction(me, "lightest_col", "LIGHTEST-COL", 2, 0, false);
        declareFunction(me, "lightest_of_cols", "LIGHTEST-OF-COLS", 1, 0, false);
        declareFunction(me, "shallower_col", "SHALLOWER-COL", 2, 0, false);
        declareFunction(me, "shallowest_col", "SHALLOWEST-COL", 2, 0, false);
        declareFunction(me, "max_floor_mts_of_genls_paths_wrt", "MAX-FLOOR-MTS-OF-GENLS-PATHS-WRT", 3, 0, false);
        declareFunction(me, "max_floor_mts_of_genls_paths", "MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_nat_genls_paths", "MAX-FLOOR-MTS-OF-NAT-GENLS-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_genls_paths", "MIN-MTS-OF-GENLS-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_not_genls_paths", "MAX-FLOOR-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_not_genls_paths", "MIN-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
        declareFunction(me, "genls_mts", "GENLS-MTS", 1, 0, false);
        declareFunction(me, "asserted_genlsP", "ASSERTED-GENLS?", 1, 1, false);
        declareFunction(me, "asserted_genls", "ASSERTED-GENLS", 1, 1, false);
        declareFunction(me, "asserted_not_genls", "ASSERTED-NOT-GENLS", 1, 1, false);
        declareFunction(me, "supported_genls", "SUPPORTED-GENLS", 1, 1, false);
        declareFunction(me, "supported_not_genls", "SUPPORTED-NOT-GENLS", 1, 1, false);
        declareFunction(me, "asserted_specs", "ASSERTED-SPECS", 1, 1, false);
        declareFunction(me, "asserted_not_specs", "ASSERTED-NOT-SPECS", 1, 1, false);
        declareFunction(me, "supported_specs", "SUPPORTED-SPECS", 1, 1, false);
        declareFunction(me, "supported_not_specs", "SUPPORTED-NOT-SPECS", 1, 1, false);
        declareFunction(me, "asserted_coextensionalP", "ASSERTED-COEXTENSIONAL?", 2, 1, false);
        declareFunction(me, "genls_after_adding", "GENLS-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "handle_more_specific_genl", "HANDLE-MORE-SPECIFIC-GENL", 2, 0, false);
        declareFunction(me, "more_general_genls_assertions", "MORE-GENERAL-GENLS-ASSERTIONS", 2, 0, false);
        declareFunction(me, "genls_after_removing", "GENLS-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "clear_genls_graph", "CLEAR-GENLS-GRAPH", 0, 0, false);
        declareFunction(me, "clear_node_genls_links", "CLEAR-NODE-GENLS-LINKS", 1, 0, false);
        declareFunction(me, "reset_genls_links", "RESET-GENLS-LINKS", 1, 0, false);
        declareFunction(me, "reset_genls_links_in_mt", "RESET-GENLS-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_genls_graph", "RESET-GENLS-GRAPH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_genls_file() {
        defvar("*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*", NIL);
        return NIL;
    }

    public static SubLObject setup_genls_file() {
        register_cyc_api_function(MIN_GENLS, $list2, $str3$Returns_the_most_specific_genls_o, NIL, $list4);
        register_cyc_api_function(MAX_NOT_GENLS, $list2, $str7$Returns_the_least_specific_negate, $list8, $list4);
        register_cyc_api_function(MAX_SPECS, $list2, $str11$Returns_the_least_specific_specs_, $list8, $list4);
        register_cyc_api_function(MIN_NOT_SPECS, $list2, $str13$Returns_the_most_specific_negated, $list8, $list4);
        register_cyc_api_function(GENL_SIBLINGS, $list2, $str15$Returns_the_direct_genls_of_those, $list8, $list4);
        register_cyc_api_function(SPEC_SIBLINGS, $list2, $str17$Returns_the_direct_specs_of_those, $list8, $list4);
        register_cyc_api_function(ALL_GENLS, $list2, $str19$Returns_all_genls_of_collection_C, $list8, $list4);
        register_cyc_api_function(ALL_SPECS, $list2, $str25$Returns_all_specs_of_collection_C, $list8, $list4);
        register_external_symbol(ALL_SPECS_WITH_MAX);
        register_cyc_api_function(COUNT_ALL_SPECS, $list46, $str47$Counts_the_number_of_specs_in_COL, $list48, $list49);
        register_cyc_api_function(ALL_GENLS_WRT, $list51, $str52$Returns_all_genls_of_collection_S, $list53, $list4);
        register_cyc_api_function(UNION_ALL_GENLS, $list56, $str57$Returns_all_genls_of_each_collect, $list58, $list4);
        register_cyc_api_function(UNION_ALL_SPECS, $list56, $str60$Returns_all_specs_of_each_collect, $list58, $list4);
        register_cyc_api_function(ALL_DEPENDENT_SPECS, $list2, $str62$Returns_all_specs_s_of_COL_s_t__e, $list8, $list4);
        register_cyc_api_function(ALL_GENLS_AMONG, $list64, $str65$Returns_those_genls_of_COL_that_a, $list66, $list4);
        register_cyc_api_function(ALL_SPECS_AMONG, $list64, $str68$Returns_those_specs_of_COL_that_a, $list66, $list4);
        register_cyc_api_function(ALL_GENLS_IF, $list71, $str72$Returns_all_genls_of_collection_C, $list73, $list4);
        register_cyc_api_function(ALL_SPECS_IF, $list71, $str72$Returns_all_genls_of_collection_C, $list73, $list4);
        register_cyc_api_function(ALL_NOT_GENLS, $list2, $str76$Returns_all_negated_genls_of_coll, $list8, $list4);
        register_cyc_api_function(ALL_NOT_SPECS, $list2, $str78$Returns_all_negated_specs_of_coll, $list8, $list4);
        register_cyc_api_function(MAP_ALL_GENLS, $list80, $str81$Applies_FN_to_every__all__genls_o, $list82, NIL);
        register_cyc_api_function(MAP_ALL_SPECS, $list80, $str84$Applies_FN_to_every__all__specs_o, $list82, NIL);
        register_cyc_api_function(ANY_ALL_GENLS, $list80, $str86$Return_a_non_nil_result_of_applyi, $list82, NIL);
        register_cyc_api_function(ANY_ALL_SPECS, $list80, $str88$Return_a_non_nil_result_of_applyi, $list82, NIL);
        register_cyc_api_function($sym89$GENL_, $list51, $str90$Returns_whether____genls_SPEC_GEN, $list53, $list91);
        register_cyc_api_function($sym92$SPEC_, $list93, $str90$Returns_whether____genls_SPEC_GEN, $list94, $list91);
        register_cyc_api_function($sym96$ANY_GENL_, $list97, $str98$_any_genl__spec_genls__is_t_iff__, $list99, $list91);
        register_cyc_api_function($sym100$ANY_SPEC_, $list101, $str102$Returns_T_iff__spec__genl_spec__f, $list103, $list91);
        register_cyc_api_function($sym104$ALL_GENL_, $list97, $str105$Returns_T_iff__genl__spec_genl__f, $list99, $list91);
        register_cyc_api_function($sym106$ALL_SPEC_, $list101, $str107$Returns_T_iff__spec__genl_spec__f, $list103, $list91);
        register_cyc_api_function($sym108$ANY_GENL_ANY_, $list109, $str110$Return_T_iff__genl__spec_genl_mt_, $list111, $list91);
        register_cyc_api_function($sym112$ANY_GENL_ALL_, $list109, $str113$Return_T_iff__genl__spec_genl_mt_, $list111, $list91);
        register_cyc_api_function($sym114$ALL_SPEC_ANY_, $list109, $str115$Return_T_iff_for_each_spec_in_SPE, $list111, $list91);
        register_cyc_api_function($sym116$NOT_GENL_, $list117, $str118$Return_whether_collection_NOT_GEN, $list119, $list91);
        register_cyc_api_function($sym120$ALL_NOT_SPEC_, $list121, $str122$Return_whether_every_collection_i, $list123, $list91);
        register_cyc_api_function($sym124$ANY_NOT_GENL_, $list125, $str126$Returns_whether_any_collection_in, $list127, $list91);
        register_cyc_api_function($sym130$COLLECTIONS_COEXTENSIONAL_, $list131, $str132$Are_COL_1_and_COL_2_coextensional, $list133, $list91);
        register_cyc_api_function($sym134$COLLECTIONS_INTERSECT_, $list131, $str135$Do_collections_COL_1_and_COL_2_in, $list133, $list91);
        register_cyc_api_function($sym138$WHY_GENL_, $list139, $str140$Justification_of__genls_SPEC_GENL, $list53, $list141);
        register_cyc_api_function($sym148$WHY_NOT_GENL_, $list139, $str149$Justification_of__not__genls_SPEC, $list53, $list141);
        register_cyc_api_function($sym150$WHY_NOT_ASSERT_GENLS_, $list151, $str152$Justification_of_why_asserting__g, $list53, $list141);
        register_cyc_api_function(COLLECTION_LEAVES, $list2, $str154$Returns_the_minimally_general__th, $list8, $list4);
        register_cyc_api_function(MIN_COLS, $list56, $str156$Returns_the_minimally_general__th, $list58, $list4);
        register_cyc_api_function(MIN_COL, $list56, $str158$Returns_the_single_minimally_gene, $list58, $list159);
        register_cyc_api_function(MAX_COLS, $list56, $str161$Returns_the_most_general_among_re, $list58, $list4);
        register_cyc_api_function(MIN_CEILING_COLS, $list163, $str164$Returns_the_most_specific_common_, $list58, $list4);
        register_cyc_api_function(MAX_FLOOR_COLS, $list163, $str166$Returns_the_most_general_common_s, $list58, $list4);
        register_cyc_api_function(ANY_GENL_ISA, $list168, $str169$Return_some_genl_of_COL_that_isa_, $list170, $list159);
        register_cyc_api_function(LIGHTER_COL, $list172, $str173$Return_COL_B_iff_it_has_fewer_spe, $list174, $list159);
        register_cyc_api_function(LIGHTEST_OF_COLS, $list176, $str177$Return_the_collection_having_the_, $list58, $list159);
        register_cyc_api_function(SHALLOWER_COL, $list172, $str179$Return_COL_B_iff_it_has_fewer_gen, $list174, $list159);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_GENLS_PATHS, $list181, $str182$_return_listp__Returns_in_what__m, $list53, NIL);
        register_kb_function(GENLS_AFTER_ADDING);
        register_kb_function(GENLS_AFTER_REMOVING);
        define_test_case_table_int(UNION_ALL_GENLS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list192);
        define_test_case_table_int(UNION_ALL_SPECS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list194);
        define_test_case_table_int(MAX_COLS_BENEATH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list196);
        define_test_case_table_int(ALL_GENLS_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list197);
        define_test_case_table_int(ALL_SPECS_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list198);
        define_test_case_table_int($sym96$ANY_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list199);
        define_test_case_table_int($sym100$ANY_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list200);
        define_test_case_table_int($sym104$ALL_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list201);
        define_test_case_table_int($sym108$ANY_GENL_ANY_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list202);
        define_test_case_table_int($sym112$ANY_GENL_ALL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list203);
        define_test_case_table_int($sym120$ALL_NOT_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list204);
        define_test_case_table_int($sym106$ALL_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list205);
        define_test_case_table_int($sym124$ANY_NOT_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list206);
        define_test_case_table_int($sym207$ALL_GENL_OF_SOME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list208);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_genls_file();
    }

    @Override
    public void initializeVariables() {
        init_genls_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_genls_file();
    }

    
}

/**
 * Total time: 2516 ms synthetic
 */
